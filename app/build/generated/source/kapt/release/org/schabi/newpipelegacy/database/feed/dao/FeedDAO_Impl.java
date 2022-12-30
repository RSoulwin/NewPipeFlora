package org.schabi.newpipelegacy.database.feed.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.rxjava3.RxRoom;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import org.schabi.newpipe.extractor.stream.StreamType;
import org.schabi.newpipelegacy.database.Converters;
import org.schabi.newpipelegacy.database.feed.model.FeedEntity;
import org.schabi.newpipelegacy.database.feed.model.FeedLastUpdatedEntity;
import org.schabi.newpipelegacy.database.stream.StreamWithState;
import org.schabi.newpipelegacy.database.stream.model.StreamEntity;
import org.schabi.newpipelegacy.database.subscription.SubscriptionEntity;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class FeedDAO_Impl extends FeedDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<FeedEntity> __insertionAdapterOfFeedEntity;

  private final EntityInsertionAdapter<FeedLastUpdatedEntity> __insertionAdapterOfFeedLastUpdatedEntity;

  private final EntityDeletionOrUpdateAdapter<FeedLastUpdatedEntity> __updateAdapterOfFeedLastUpdatedEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  private final SharedSQLiteStatement __preparedStmtOfUnlinkStreamsOlderThan;

  private final SharedSQLiteStatement __preparedStmtOfUnlinkOldLivestreams;

  public FeedDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFeedEntity = new EntityInsertionAdapter<FeedEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `feed` (`stream_id`,`subscription_id`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FeedEntity value) {
        stmt.bindLong(1, value.getStreamId());
        stmt.bindLong(2, value.getSubscriptionId());
      }
    };
    this.__insertionAdapterOfFeedLastUpdatedEntity = new EntityInsertionAdapter<FeedLastUpdatedEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `feed_last_updated` (`subscription_id`,`last_updated`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FeedLastUpdatedEntity value) {
        stmt.bindLong(1, value.getSubscriptionId());
        final Long _tmp = Converters.INSTANCE.offsetDateTimeToTimestamp(value.getLastUpdated());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, _tmp);
        }
      }
    };
    this.__updateAdapterOfFeedLastUpdatedEntity = new EntityDeletionOrUpdateAdapter<FeedLastUpdatedEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR IGNORE `feed_last_updated` SET `subscription_id` = ?,`last_updated` = ? WHERE `subscription_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FeedLastUpdatedEntity value) {
        stmt.bindLong(1, value.getSubscriptionId());
        final Long _tmp = Converters.INSTANCE.offsetDateTimeToTimestamp(value.getLastUpdated());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, _tmp);
        }
        stmt.bindLong(3, value.getSubscriptionId());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM feed";
        return _query;
      }
    };
    this.__preparedStmtOfUnlinkStreamsOlderThan = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "\n"
                + "        DELETE FROM feed WHERE\n"
                + "\n"
                + "        feed.stream_id IN (\n"
                + "            SELECT s.uid FROM streams s\n"
                + "\n"
                + "            INNER JOIN feed f\n"
                + "            ON s.uid = f.stream_id\n"
                + "\n"
                + "            WHERE s.upload_date < ?\n"
                + "        )\n"
                + "        ";
        return _query;
      }
    };
    this.__preparedStmtOfUnlinkOldLivestreams = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "\n"
                + "        DELETE FROM feed\n"
                + "        \n"
                + "        WHERE feed.subscription_id = ?\n"
                + "\n"
                + "        AND feed.stream_id IN (\n"
                + "            SELECT s.uid FROM streams s\n"
                + "\n"
                + "            INNER JOIN feed f\n"
                + "            ON s.uid = f.stream_id\n"
                + "\n"
                + "            WHERE s.stream_type = \"LIVE_STREAM\" OR s.stream_type = \"AUDIO_LIVE_STREAM\"\n"
                + "        )\n"
                + "        ";
        return _query;
      }
    };
  }

  @Override
  public void insert(final FeedEntity feedEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfFeedEntity.insert(feedEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Long> insertAll(final List<FeedEntity> entities) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      List<Long> _result = __insertionAdapterOfFeedEntity.insertAndReturnIdsList(entities);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public long insertLastUpdated$app_release(final FeedLastUpdatedEntity lastUpdatedEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfFeedLastUpdatedEntity.insertAndReturnId(lastUpdatedEntity);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateLastUpdated$app_release(final FeedLastUpdatedEntity lastUpdatedEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfFeedLastUpdatedEntity.handle(lastUpdatedEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void setLastUpdatedForSubscription(final FeedLastUpdatedEntity lastUpdatedEntity) {
    __db.beginTransaction();
    try {
      FeedDAO_Impl.super.setLastUpdatedForSubscription(lastUpdatedEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public void unlinkStreamsOlderThan(final OffsetDateTime offsetDateTime) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUnlinkStreamsOlderThan.acquire();
    int _argIndex = 1;
    final Long _tmp = Converters.INSTANCE.offsetDateTimeToTimestamp(offsetDateTime);
    if (_tmp == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindLong(_argIndex, _tmp);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUnlinkStreamsOlderThan.release(_stmt);
    }
  }

  @Override
  public void unlinkOldLivestreams(final long subscriptionId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUnlinkOldLivestreams.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, subscriptionId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUnlinkOldLivestreams.release(_stmt);
    }
  }

  @Override
  public Maybe<List<StreamWithState>> getStreams(final long groupId, final boolean includePlayed,
      final OffsetDateTime uploadDateBefore) {
    final String _sql = "\n"
            + "        SELECT s.*, sst.progress_time\n"
            + "        FROM streams s\n"
            + "\n"
            + "        LEFT JOIN stream_state sst\n"
            + "        ON s.uid = sst.stream_id\n"
            + "        \n"
            + "        LEFT JOIN stream_history sh\n"
            + "        ON s.uid = sh.stream_id\n"
            + "        \n"
            + "        INNER JOIN feed f\n"
            + "        ON s.uid = f.stream_id\n"
            + "\n"
            + "        LEFT JOIN feed_group_subscription_join fgs\n"
            + "        ON fgs.subscription_id = f.subscription_id\n"
            + "\n"
            + "        WHERE (\n"
            + "            ? = -1\n"
            + "            OR fgs.group_id = ?\n"
            + "        )\n"
            + "        AND (\n"
            + "            ?\n"
            + "            OR sh.stream_id IS NULL\n"
            + "            OR sst.stream_id IS NULL\n"
            + "            OR sst.progress_time < s.duration * 1000 - 60000\n"
            + "            OR sst.progress_time < s.duration * 1000 * 3 / 4\n"
            + "            OR s.stream_type = 'LIVE_STREAM'\n"
            + "            OR s.stream_type = 'AUDIO_LIVE_STREAM'\n"
            + "        )\n"
            + "        AND (\n"
            + "            ? IS NULL\n"
            + "            OR s.upload_date IS NULL\n"
            + "            OR s.upload_date < ?\n"
            + "        )\n"
            + "\n"
            + "        ORDER BY s.upload_date IS NULL DESC, s.upload_date DESC, s.uploader ASC\n"
            + "        LIMIT 500\n"
            + "        ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 5);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, groupId);
    _argIndex = 2;
    _statement.bindLong(_argIndex, groupId);
    _argIndex = 3;
    final int _tmp = includePlayed ? 1 : 0;
    _statement.bindLong(_argIndex, _tmp);
    _argIndex = 4;
    final Long _tmp_1 = Converters.INSTANCE.offsetDateTimeToTimestamp(uploadDateBefore);
    if (_tmp_1 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, _tmp_1);
    }
    _argIndex = 5;
    final Long _tmp_2 = Converters.INSTANCE.offsetDateTimeToTimestamp(uploadDateBefore);
    if (_tmp_2 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, _tmp_2);
    }
    return Maybe.fromCallable(new Callable<List<StreamWithState>>() {
      @Override
      public List<StreamWithState> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
          final int _cursorIndexOfServiceId = CursorUtil.getColumnIndexOrThrow(_cursor, "service_id");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfStreamType = CursorUtil.getColumnIndexOrThrow(_cursor, "stream_type");
          final int _cursorIndexOfDuration = CursorUtil.getColumnIndexOrThrow(_cursor, "duration");
          final int _cursorIndexOfUploader = CursorUtil.getColumnIndexOrThrow(_cursor, "uploader");
          final int _cursorIndexOfUploaderUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "uploader_url");
          final int _cursorIndexOfThumbnailUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnail_url");
          final int _cursorIndexOfViewCount = CursorUtil.getColumnIndexOrThrow(_cursor, "view_count");
          final int _cursorIndexOfTextualUploadDate = CursorUtil.getColumnIndexOrThrow(_cursor, "textual_upload_date");
          final int _cursorIndexOfUploadDate = CursorUtil.getColumnIndexOrThrow(_cursor, "upload_date");
          final int _cursorIndexOfIsUploadDateApproximation = CursorUtil.getColumnIndexOrThrow(_cursor, "is_upload_date_approximation");
          final int _cursorIndexOfStateProgressMillis = CursorUtil.getColumnIndexOrThrow(_cursor, "progress_time");
          final List<StreamWithState> _result = new ArrayList<StreamWithState>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final StreamWithState _item;
            final Long _tmpStateProgressMillis;
            if (_cursor.isNull(_cursorIndexOfStateProgressMillis)) {
              _tmpStateProgressMillis = null;
            } else {
              _tmpStateProgressMillis = _cursor.getLong(_cursorIndexOfStateProgressMillis);
            }
            final StreamEntity _tmpStream;
            if (! (_cursor.isNull(_cursorIndexOfUid) && _cursor.isNull(_cursorIndexOfServiceId) && _cursor.isNull(_cursorIndexOfUrl) && _cursor.isNull(_cursorIndexOfTitle) && _cursor.isNull(_cursorIndexOfStreamType) && _cursor.isNull(_cursorIndexOfDuration) && _cursor.isNull(_cursorIndexOfUploader) && _cursor.isNull(_cursorIndexOfUploaderUrl) && _cursor.isNull(_cursorIndexOfThumbnailUrl) && _cursor.isNull(_cursorIndexOfViewCount) && _cursor.isNull(_cursorIndexOfTextualUploadDate) && _cursor.isNull(_cursorIndexOfUploadDate) && _cursor.isNull(_cursorIndexOfIsUploadDateApproximation))) {
              final long _tmpUid;
              _tmpUid = _cursor.getLong(_cursorIndexOfUid);
              final int _tmpServiceId;
              _tmpServiceId = _cursor.getInt(_cursorIndexOfServiceId);
              final String _tmpUrl;
              if (_cursor.isNull(_cursorIndexOfUrl)) {
                _tmpUrl = null;
              } else {
                _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
              }
              final String _tmpTitle;
              if (_cursor.isNull(_cursorIndexOfTitle)) {
                _tmpTitle = null;
              } else {
                _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
              }
              final StreamType _tmpStreamType;
              final String _tmp_3;
              if (_cursor.isNull(_cursorIndexOfStreamType)) {
                _tmp_3 = null;
              } else {
                _tmp_3 = _cursor.getString(_cursorIndexOfStreamType);
              }
              _tmpStreamType = Converters.INSTANCE.streamTypeOf(_tmp_3);
              final long _tmpDuration;
              _tmpDuration = _cursor.getLong(_cursorIndexOfDuration);
              final String _tmpUploader;
              if (_cursor.isNull(_cursorIndexOfUploader)) {
                _tmpUploader = null;
              } else {
                _tmpUploader = _cursor.getString(_cursorIndexOfUploader);
              }
              final String _tmpUploaderUrl;
              if (_cursor.isNull(_cursorIndexOfUploaderUrl)) {
                _tmpUploaderUrl = null;
              } else {
                _tmpUploaderUrl = _cursor.getString(_cursorIndexOfUploaderUrl);
              }
              final String _tmpThumbnailUrl;
              if (_cursor.isNull(_cursorIndexOfThumbnailUrl)) {
                _tmpThumbnailUrl = null;
              } else {
                _tmpThumbnailUrl = _cursor.getString(_cursorIndexOfThumbnailUrl);
              }
              final Long _tmpViewCount;
              if (_cursor.isNull(_cursorIndexOfViewCount)) {
                _tmpViewCount = null;
              } else {
                _tmpViewCount = _cursor.getLong(_cursorIndexOfViewCount);
              }
              final String _tmpTextualUploadDate;
              if (_cursor.isNull(_cursorIndexOfTextualUploadDate)) {
                _tmpTextualUploadDate = null;
              } else {
                _tmpTextualUploadDate = _cursor.getString(_cursorIndexOfTextualUploadDate);
              }
              final OffsetDateTime _tmpUploadDate;
              final Long _tmp_4;
              if (_cursor.isNull(_cursorIndexOfUploadDate)) {
                _tmp_4 = null;
              } else {
                _tmp_4 = _cursor.getLong(_cursorIndexOfUploadDate);
              }
              _tmpUploadDate = Converters.INSTANCE.offsetDateTimeFromTimestamp(_tmp_4);
              final Boolean _tmpIsUploadDateApproximation;
              final Integer _tmp_5;
              if (_cursor.isNull(_cursorIndexOfIsUploadDateApproximation)) {
                _tmp_5 = null;
              } else {
                _tmp_5 = _cursor.getInt(_cursorIndexOfIsUploadDateApproximation);
              }
              _tmpIsUploadDateApproximation = _tmp_5 == null ? null : _tmp_5 != 0;
              _tmpStream = new StreamEntity(_tmpUid,_tmpServiceId,_tmpUrl,_tmpTitle,_tmpStreamType,_tmpDuration,_tmpUploader,_tmpUploaderUrl,_tmpThumbnailUrl,_tmpViewCount,_tmpTextualUploadDate,_tmpUploadDate,_tmpIsUploadDateApproximation);
            }  else  {
              _tmpStream = null;
            }
            _item = new StreamWithState(_tmpStream,_tmpStateProgressMillis);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flowable<List<OffsetDateTime>> oldestSubscriptionUpdate(final long groupId) {
    final String _sql = "\n"
            + "        SELECT MIN(lu.last_updated) FROM feed_last_updated lu\n"
            + "\n"
            + "        INNER JOIN feed_group_subscription_join fgs\n"
            + "        ON fgs.subscription_id = lu.subscription_id AND fgs.group_id = ?\n"
            + "        ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, groupId);
    return RxRoom.createFlowable(__db, false, new String[]{"feed_last_updated","feed_group_subscription_join"}, new Callable<List<OffsetDateTime>>() {
      @Override
      public List<OffsetDateTime> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final List<OffsetDateTime> _result = new ArrayList<OffsetDateTime>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final OffsetDateTime _item;
            final Long _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(0);
            }
            _item = Converters.INSTANCE.offsetDateTimeFromTimestamp(_tmp);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flowable<List<OffsetDateTime>> oldestSubscriptionUpdateFromAll() {
    final String _sql = "SELECT MIN(last_updated) FROM feed_last_updated";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, false, new String[]{"feed_last_updated"}, new Callable<List<OffsetDateTime>>() {
      @Override
      public List<OffsetDateTime> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final List<OffsetDateTime> _result = new ArrayList<OffsetDateTime>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final OffsetDateTime _item;
            final Long _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(0);
            }
            _item = Converters.INSTANCE.offsetDateTimeFromTimestamp(_tmp);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flowable<Long> notLoadedCount() {
    final String _sql = "SELECT COUNT(*) FROM feed_last_updated WHERE last_updated IS NULL";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, false, new String[]{"feed_last_updated"}, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Long _result;
          if(_cursor.moveToFirst()) {
            final Long _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flowable<Long> notLoadedCountForGroup(final long groupId) {
    final String _sql = "\n"
            + "        SELECT COUNT(*) FROM subscriptions s\n"
            + "        \n"
            + "        INNER JOIN feed_group_subscription_join fgs\n"
            + "        ON s.uid = fgs.subscription_id AND fgs.group_id = ?\n"
            + "\n"
            + "        LEFT JOIN feed_last_updated lu\n"
            + "        ON s.uid = lu.subscription_id \n"
            + "\n"
            + "        WHERE lu.last_updated IS NULL\n"
            + "        ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, groupId);
    return RxRoom.createFlowable(__db, false, new String[]{"subscriptions","feed_group_subscription_join","feed_last_updated"}, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Long _result;
          if(_cursor.moveToFirst()) {
            final Long _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flowable<List<SubscriptionEntity>> getAllOutdated(final OffsetDateTime outdatedThreshold) {
    final String _sql = "\n"
            + "        SELECT s.* FROM subscriptions s\n"
            + "\n"
            + "        LEFT JOIN feed_last_updated lu\n"
            + "        ON s.uid = lu.subscription_id \n"
            + "\n"
            + "        WHERE lu.last_updated IS NULL OR lu.last_updated < ?\n"
            + "        ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final Long _tmp = Converters.INSTANCE.offsetDateTimeToTimestamp(outdatedThreshold);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, _tmp);
    }
    return RxRoom.createFlowable(__db, false, new String[]{"subscriptions","feed_last_updated"}, new Callable<List<SubscriptionEntity>>() {
      @Override
      public List<SubscriptionEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
          final int _cursorIndexOfServiceId = CursorUtil.getColumnIndexOrThrow(_cursor, "service_id");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfAvatarUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "avatar_url");
          final int _cursorIndexOfSubscriberCount = CursorUtil.getColumnIndexOrThrow(_cursor, "subscriber_count");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfNotificationMode = CursorUtil.getColumnIndexOrThrow(_cursor, "notification_mode");
          final List<SubscriptionEntity> _result = new ArrayList<SubscriptionEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SubscriptionEntity _item;
            _item = new SubscriptionEntity();
            final long _tmpUid;
            _tmpUid = _cursor.getLong(_cursorIndexOfUid);
            _item.setUid(_tmpUid);
            final int _tmpServiceId;
            _tmpServiceId = _cursor.getInt(_cursorIndexOfServiceId);
            _item.setServiceId(_tmpServiceId);
            final String _tmpUrl;
            if (_cursor.isNull(_cursorIndexOfUrl)) {
              _tmpUrl = null;
            } else {
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            }
            _item.setUrl(_tmpUrl);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            _item.setName(_tmpName);
            final String _tmpAvatarUrl;
            if (_cursor.isNull(_cursorIndexOfAvatarUrl)) {
              _tmpAvatarUrl = null;
            } else {
              _tmpAvatarUrl = _cursor.getString(_cursorIndexOfAvatarUrl);
            }
            _item.setAvatarUrl(_tmpAvatarUrl);
            final Long _tmpSubscriberCount;
            if (_cursor.isNull(_cursorIndexOfSubscriberCount)) {
              _tmpSubscriberCount = null;
            } else {
              _tmpSubscriberCount = _cursor.getLong(_cursorIndexOfSubscriberCount);
            }
            _item.setSubscriberCount(_tmpSubscriberCount);
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            _item.setDescription(_tmpDescription);
            final int _tmpNotificationMode;
            _tmpNotificationMode = _cursor.getInt(_cursorIndexOfNotificationMode);
            _item.setNotificationMode(_tmpNotificationMode);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flowable<List<SubscriptionEntity>> getAllOutdatedForGroup(final long groupId,
      final OffsetDateTime outdatedThreshold) {
    final String _sql = "\n"
            + "        SELECT s.* FROM subscriptions s\n"
            + "\n"
            + "        INNER JOIN feed_group_subscription_join fgs\n"
            + "        ON s.uid = fgs.subscription_id AND fgs.group_id = ?\n"
            + "\n"
            + "        LEFT JOIN feed_last_updated lu\n"
            + "        ON s.uid = lu.subscription_id\n"
            + "\n"
            + "        WHERE lu.last_updated IS NULL OR lu.last_updated < ?\n"
            + "        ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, groupId);
    _argIndex = 2;
    final Long _tmp = Converters.INSTANCE.offsetDateTimeToTimestamp(outdatedThreshold);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, _tmp);
    }
    return RxRoom.createFlowable(__db, false, new String[]{"subscriptions","feed_group_subscription_join","feed_last_updated"}, new Callable<List<SubscriptionEntity>>() {
      @Override
      public List<SubscriptionEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
          final int _cursorIndexOfServiceId = CursorUtil.getColumnIndexOrThrow(_cursor, "service_id");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfAvatarUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "avatar_url");
          final int _cursorIndexOfSubscriberCount = CursorUtil.getColumnIndexOrThrow(_cursor, "subscriber_count");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfNotificationMode = CursorUtil.getColumnIndexOrThrow(_cursor, "notification_mode");
          final List<SubscriptionEntity> _result = new ArrayList<SubscriptionEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SubscriptionEntity _item;
            _item = new SubscriptionEntity();
            final long _tmpUid;
            _tmpUid = _cursor.getLong(_cursorIndexOfUid);
            _item.setUid(_tmpUid);
            final int _tmpServiceId;
            _tmpServiceId = _cursor.getInt(_cursorIndexOfServiceId);
            _item.setServiceId(_tmpServiceId);
            final String _tmpUrl;
            if (_cursor.isNull(_cursorIndexOfUrl)) {
              _tmpUrl = null;
            } else {
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            }
            _item.setUrl(_tmpUrl);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            _item.setName(_tmpName);
            final String _tmpAvatarUrl;
            if (_cursor.isNull(_cursorIndexOfAvatarUrl)) {
              _tmpAvatarUrl = null;
            } else {
              _tmpAvatarUrl = _cursor.getString(_cursorIndexOfAvatarUrl);
            }
            _item.setAvatarUrl(_tmpAvatarUrl);
            final Long _tmpSubscriberCount;
            if (_cursor.isNull(_cursorIndexOfSubscriberCount)) {
              _tmpSubscriberCount = null;
            } else {
              _tmpSubscriberCount = _cursor.getLong(_cursorIndexOfSubscriberCount);
            }
            _item.setSubscriberCount(_tmpSubscriberCount);
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            _item.setDescription(_tmpDescription);
            final int _tmpNotificationMode;
            _tmpNotificationMode = _cursor.getInt(_cursorIndexOfNotificationMode);
            _item.setNotificationMode(_tmpNotificationMode);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flowable<List<SubscriptionEntity>> getOutdatedWithNotificationMode(
      final OffsetDateTime outdatedThreshold, final int notificationMode) {
    final String _sql = "\n"
            + "        SELECT s.* FROM subscriptions s\n"
            + "\n"
            + "        LEFT JOIN feed_last_updated lu\n"
            + "        ON s.uid = lu.subscription_id\n"
            + "\n"
            + "        WHERE \n"
            + "            (lu.last_updated IS NULL OR lu.last_updated < ?)\n"
            + "            AND s.notification_mode = ?\n"
            + "        ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    final Long _tmp = Converters.INSTANCE.offsetDateTimeToTimestamp(outdatedThreshold);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, _tmp);
    }
    _argIndex = 2;
    _statement.bindLong(_argIndex, notificationMode);
    return RxRoom.createFlowable(__db, false, new String[]{"subscriptions","feed_last_updated"}, new Callable<List<SubscriptionEntity>>() {
      @Override
      public List<SubscriptionEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
          final int _cursorIndexOfServiceId = CursorUtil.getColumnIndexOrThrow(_cursor, "service_id");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfAvatarUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "avatar_url");
          final int _cursorIndexOfSubscriberCount = CursorUtil.getColumnIndexOrThrow(_cursor, "subscriber_count");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfNotificationMode = CursorUtil.getColumnIndexOrThrow(_cursor, "notification_mode");
          final List<SubscriptionEntity> _result = new ArrayList<SubscriptionEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SubscriptionEntity _item;
            _item = new SubscriptionEntity();
            final long _tmpUid;
            _tmpUid = _cursor.getLong(_cursorIndexOfUid);
            _item.setUid(_tmpUid);
            final int _tmpServiceId;
            _tmpServiceId = _cursor.getInt(_cursorIndexOfServiceId);
            _item.setServiceId(_tmpServiceId);
            final String _tmpUrl;
            if (_cursor.isNull(_cursorIndexOfUrl)) {
              _tmpUrl = null;
            } else {
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            }
            _item.setUrl(_tmpUrl);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            _item.setName(_tmpName);
            final String _tmpAvatarUrl;
            if (_cursor.isNull(_cursorIndexOfAvatarUrl)) {
              _tmpAvatarUrl = null;
            } else {
              _tmpAvatarUrl = _cursor.getString(_cursorIndexOfAvatarUrl);
            }
            _item.setAvatarUrl(_tmpAvatarUrl);
            final Long _tmpSubscriberCount;
            if (_cursor.isNull(_cursorIndexOfSubscriberCount)) {
              _tmpSubscriberCount = null;
            } else {
              _tmpSubscriberCount = _cursor.getLong(_cursorIndexOfSubscriberCount);
            }
            _item.setSubscriberCount(_tmpSubscriberCount);
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            _item.setDescription(_tmpDescription);
            final int _tmpNotificationMode;
            _tmpNotificationMode = _cursor.getInt(_cursorIndexOfNotificationMode);
            _item.setNotificationMode(_tmpNotificationMode);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}

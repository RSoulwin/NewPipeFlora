package org.schabi.newpipelegacy.database.stream.dao;

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
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.Void;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import org.schabi.newpipe.extractor.stream.StreamType;
import org.schabi.newpipelegacy.database.Converters;
import org.schabi.newpipelegacy.database.stream.model.StreamEntity;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class StreamDAO_Impl extends StreamDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<StreamEntity> __insertionAdapterOfStreamEntity;

  private final EntityInsertionAdapter<StreamEntity> __insertionAdapterOfStreamEntity_1;

  private final EntityDeletionOrUpdateAdapter<StreamEntity> __deletionAdapterOfStreamEntity;

  private final EntityDeletionOrUpdateAdapter<StreamEntity> __updateAdapterOfStreamEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  private final SharedSQLiteStatement __preparedStmtOfSetUploaderUrl;

  private final SharedSQLiteStatement __preparedStmtOfDeleteOrphans;

  public StreamDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfStreamEntity = new EntityInsertionAdapter<StreamEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `streams` (`uid`,`service_id`,`url`,`title`,`stream_type`,`duration`,`uploader`,`uploader_url`,`thumbnail_url`,`view_count`,`textual_upload_date`,`upload_date`,`is_upload_date_approximation`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, StreamEntity value) {
        stmt.bindLong(1, value.getUid());
        stmt.bindLong(2, value.getServiceId());
        if (value.getUrl() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getUrl());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTitle());
        }
        final String _tmp = Converters.INSTANCE.stringOf(value.getStreamType());
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp);
        }
        stmt.bindLong(6, value.getDuration());
        if (value.getUploader() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getUploader());
        }
        if (value.getUploaderUrl() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getUploaderUrl());
        }
        if (value.getThumbnailUrl() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getThumbnailUrl());
        }
        if (value.getViewCount() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindLong(10, value.getViewCount());
        }
        if (value.getTextualUploadDate() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getTextualUploadDate());
        }
        final Long _tmp_1 = Converters.INSTANCE.offsetDateTimeToTimestamp(value.getUploadDate());
        if (_tmp_1 == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindLong(12, _tmp_1);
        }
        final Integer _tmp_2 = value.isUploadDateApproximation() == null ? null : (value.isUploadDateApproximation() ? 1 : 0);
        if (_tmp_2 == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindLong(13, _tmp_2);
        }
      }
    };
    this.__insertionAdapterOfStreamEntity_1 = new EntityInsertionAdapter<StreamEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `streams` (`uid`,`service_id`,`url`,`title`,`stream_type`,`duration`,`uploader`,`uploader_url`,`thumbnail_url`,`view_count`,`textual_upload_date`,`upload_date`,`is_upload_date_approximation`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, StreamEntity value) {
        stmt.bindLong(1, value.getUid());
        stmt.bindLong(2, value.getServiceId());
        if (value.getUrl() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getUrl());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTitle());
        }
        final String _tmp = Converters.INSTANCE.stringOf(value.getStreamType());
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp);
        }
        stmt.bindLong(6, value.getDuration());
        if (value.getUploader() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getUploader());
        }
        if (value.getUploaderUrl() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getUploaderUrl());
        }
        if (value.getThumbnailUrl() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getThumbnailUrl());
        }
        if (value.getViewCount() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindLong(10, value.getViewCount());
        }
        if (value.getTextualUploadDate() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getTextualUploadDate());
        }
        final Long _tmp_1 = Converters.INSTANCE.offsetDateTimeToTimestamp(value.getUploadDate());
        if (_tmp_1 == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindLong(12, _tmp_1);
        }
        final Integer _tmp_2 = value.isUploadDateApproximation() == null ? null : (value.isUploadDateApproximation() ? 1 : 0);
        if (_tmp_2 == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindLong(13, _tmp_2);
        }
      }
    };
    this.__deletionAdapterOfStreamEntity = new EntityDeletionOrUpdateAdapter<StreamEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `streams` WHERE `uid` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, StreamEntity value) {
        stmt.bindLong(1, value.getUid());
      }
    };
    this.__updateAdapterOfStreamEntity = new EntityDeletionOrUpdateAdapter<StreamEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `streams` SET `uid` = ?,`service_id` = ?,`url` = ?,`title` = ?,`stream_type` = ?,`duration` = ?,`uploader` = ?,`uploader_url` = ?,`thumbnail_url` = ?,`view_count` = ?,`textual_upload_date` = ?,`upload_date` = ?,`is_upload_date_approximation` = ? WHERE `uid` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, StreamEntity value) {
        stmt.bindLong(1, value.getUid());
        stmt.bindLong(2, value.getServiceId());
        if (value.getUrl() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getUrl());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTitle());
        }
        final String _tmp = Converters.INSTANCE.stringOf(value.getStreamType());
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp);
        }
        stmt.bindLong(6, value.getDuration());
        if (value.getUploader() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getUploader());
        }
        if (value.getUploaderUrl() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getUploaderUrl());
        }
        if (value.getThumbnailUrl() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getThumbnailUrl());
        }
        if (value.getViewCount() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindLong(10, value.getViewCount());
        }
        if (value.getTextualUploadDate() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getTextualUploadDate());
        }
        final Long _tmp_1 = Converters.INSTANCE.offsetDateTimeToTimestamp(value.getUploadDate());
        if (_tmp_1 == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindLong(12, _tmp_1);
        }
        final Integer _tmp_2 = value.isUploadDateApproximation() == null ? null : (value.isUploadDateApproximation() ? 1 : 0);
        if (_tmp_2 == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindLong(13, _tmp_2);
        }
        stmt.bindLong(14, value.getUid());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM streams";
        return _query;
      }
    };
    this.__preparedStmtOfSetUploaderUrl = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE streams SET uploader_url = ? WHERE url = ? AND service_id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteOrphans = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "\n"
                + "        DELETE FROM streams WHERE\n"
                + "\n"
                + "        NOT EXISTS (SELECT 1 FROM stream_history sh\n"
                + "        WHERE sh.stream_id = streams.uid)\n"
                + "\n"
                + "        AND NOT EXISTS (SELECT 1 FROM playlist_stream_join ps\n"
                + "        WHERE ps.stream_id = streams.uid)\n"
                + "\n"
                + "        AND NOT EXISTS (SELECT 1 FROM feed f\n"
                + "        WHERE f.stream_id = streams.uid)\n"
                + "        ";
        return _query;
      }
    };
  }

  @Override
  public long insert(final StreamEntity entity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfStreamEntity.insertAndReturnId(entity);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Long> insertAll(final StreamEntity... entities) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      List<Long> _result = __insertionAdapterOfStreamEntity.insertAndReturnIdsList(entities);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Long> insertAll(final Collection<StreamEntity> entities) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      List<Long> _result = __insertionAdapterOfStreamEntity.insertAndReturnIdsList(entities);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public long silentInsertInternal$app_release(final StreamEntity stream) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfStreamEntity_1.insertAndReturnId(stream);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Long> silentInsertAllInternal$app_release(final List<StreamEntity> streams) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      List<Long> _result = __insertionAdapterOfStreamEntity_1.insertAndReturnIdsList(streams);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final StreamEntity entity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfStreamEntity.handle(entity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int delete(final Collection<StreamEntity> entities) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__deletionAdapterOfStreamEntity.handleMultiple(entities);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int update(final StreamEntity entity) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__updateAdapterOfStreamEntity.handle(entity);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final Collection<StreamEntity> entities) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfStreamEntity.handleMultiple(entities);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public long upsert(final StreamEntity newerStream) {
    __db.beginTransaction();
    try {
      long _result = StreamDAO_Impl.super.upsert(newerStream);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Long> upsertAll(final List<StreamEntity> streams) {
    __db.beginTransaction();
    try {
      List<Long> _result = StreamDAO_Impl.super.upsertAll(streams);
      __db.setTransactionSuccessful();
      return _result;
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
  public Completable setUploaderUrl(final long serviceId, final String url,
      final String uploaderUrl) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfSetUploaderUrl.acquire();
        int _argIndex = 1;
        if (uploaderUrl == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, uploaderUrl);
        }
        _argIndex = 2;
        if (url == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, url);
        }
        _argIndex = 3;
        _stmt.bindLong(_argIndex, serviceId);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
          __preparedStmtOfSetUploaderUrl.release(_stmt);
        }
      }
    });
  }

  @Override
  public int deleteOrphans() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteOrphans.acquire();
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteOrphans.release(_stmt);
    }
  }

  @Override
  public Flowable<List<StreamEntity>> getAll() {
    final String _sql = "SELECT * FROM streams";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, false, new String[]{"streams"}, new Callable<List<StreamEntity>>() {
      @Override
      public List<StreamEntity> call() throws Exception {
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
          final List<StreamEntity> _result = new ArrayList<StreamEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final StreamEntity _item;
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
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfStreamType)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfStreamType);
            }
            _tmpStreamType = Converters.INSTANCE.streamTypeOf(_tmp);
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
            final Long _tmp_1;
            if (_cursor.isNull(_cursorIndexOfUploadDate)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getLong(_cursorIndexOfUploadDate);
            }
            _tmpUploadDate = Converters.INSTANCE.offsetDateTimeFromTimestamp(_tmp_1);
            final Boolean _tmpIsUploadDateApproximation;
            final Integer _tmp_2;
            if (_cursor.isNull(_cursorIndexOfIsUploadDateApproximation)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getInt(_cursorIndexOfIsUploadDateApproximation);
            }
            _tmpIsUploadDateApproximation = _tmp_2 == null ? null : _tmp_2 != 0;
            _item = new StreamEntity(_tmpUid,_tmpServiceId,_tmpUrl,_tmpTitle,_tmpStreamType,_tmpDuration,_tmpUploader,_tmpUploaderUrl,_tmpThumbnailUrl,_tmpViewCount,_tmpTextualUploadDate,_tmpUploadDate,_tmpIsUploadDateApproximation);
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
  public Flowable<List<StreamEntity>> listByService(final int serviceId) {
    final String _sql = "SELECT * FROM streams WHERE service_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, serviceId);
    return RxRoom.createFlowable(__db, false, new String[]{"streams"}, new Callable<List<StreamEntity>>() {
      @Override
      public List<StreamEntity> call() throws Exception {
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
          final List<StreamEntity> _result = new ArrayList<StreamEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final StreamEntity _item;
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
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfStreamType)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfStreamType);
            }
            _tmpStreamType = Converters.INSTANCE.streamTypeOf(_tmp);
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
            final Long _tmp_1;
            if (_cursor.isNull(_cursorIndexOfUploadDate)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getLong(_cursorIndexOfUploadDate);
            }
            _tmpUploadDate = Converters.INSTANCE.offsetDateTimeFromTimestamp(_tmp_1);
            final Boolean _tmpIsUploadDateApproximation;
            final Integer _tmp_2;
            if (_cursor.isNull(_cursorIndexOfIsUploadDateApproximation)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getInt(_cursorIndexOfIsUploadDateApproximation);
            }
            _tmpIsUploadDateApproximation = _tmp_2 == null ? null : _tmp_2 != 0;
            _item = new StreamEntity(_tmpUid,_tmpServiceId,_tmpUrl,_tmpTitle,_tmpStreamType,_tmpDuration,_tmpUploader,_tmpUploaderUrl,_tmpThumbnailUrl,_tmpViewCount,_tmpTextualUploadDate,_tmpUploadDate,_tmpIsUploadDateApproximation);
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
  public Flowable<List<StreamEntity>> getStream(final long serviceId, final String url) {
    final String _sql = "SELECT * FROM streams WHERE url = ? AND service_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (url == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, url);
    }
    _argIndex = 2;
    _statement.bindLong(_argIndex, serviceId);
    return RxRoom.createFlowable(__db, false, new String[]{"streams"}, new Callable<List<StreamEntity>>() {
      @Override
      public List<StreamEntity> call() throws Exception {
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
          final List<StreamEntity> _result = new ArrayList<StreamEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final StreamEntity _item;
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
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfStreamType)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfStreamType);
            }
            _tmpStreamType = Converters.INSTANCE.streamTypeOf(_tmp);
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
            final Long _tmp_1;
            if (_cursor.isNull(_cursorIndexOfUploadDate)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getLong(_cursorIndexOfUploadDate);
            }
            _tmpUploadDate = Converters.INSTANCE.offsetDateTimeFromTimestamp(_tmp_1);
            final Boolean _tmpIsUploadDateApproximation;
            final Integer _tmp_2;
            if (_cursor.isNull(_cursorIndexOfIsUploadDateApproximation)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getInt(_cursorIndexOfIsUploadDateApproximation);
            }
            _tmpIsUploadDateApproximation = _tmp_2 == null ? null : _tmp_2 != 0;
            _item = new StreamEntity(_tmpUid,_tmpServiceId,_tmpUrl,_tmpTitle,_tmpStreamType,_tmpDuration,_tmpUploader,_tmpUploaderUrl,_tmpThumbnailUrl,_tmpViewCount,_tmpTextualUploadDate,_tmpUploadDate,_tmpIsUploadDateApproximation);
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
  public boolean exists$app_release(final int serviceId, final String url) {
    final String _sql = "SELECT COUNT(*) != 0 FROM streams WHERE url = ? AND service_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (url == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, url);
    }
    _argIndex = 2;
    _statement.bindLong(_argIndex, serviceId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final boolean _result;
      if(_cursor.moveToFirst()) {
        final int _tmp;
        _tmp = _cursor.getInt(0);
        _result = _tmp != 0;
      } else {
        _result = false;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public StreamDAO.StreamCompareFeed getMinimalStreamForCompare$app_release(final int serviceId,
      final String url) {
    final String _sql = "\n"
            + "        SELECT uid, stream_type, textual_upload_date, upload_date, is_upload_date_approximation, duration \n"
            + "        FROM streams WHERE url = ? AND service_id = ?\n"
            + "        ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (url == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, url);
    }
    _argIndex = 2;
    _statement.bindLong(_argIndex, serviceId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfUid = 0;
      final int _cursorIndexOfStreamType = 1;
      final int _cursorIndexOfTextualUploadDate = 2;
      final int _cursorIndexOfUploadDate = 3;
      final int _cursorIndexOfIsUploadDateApproximation = 4;
      final int _cursorIndexOfDuration = 5;
      final StreamDAO.StreamCompareFeed _result;
      if(_cursor.moveToFirst()) {
        final long _tmpUid;
        _tmpUid = _cursor.getLong(_cursorIndexOfUid);
        final StreamType _tmpStreamType;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfStreamType)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfStreamType);
        }
        _tmpStreamType = Converters.INSTANCE.streamTypeOf(_tmp);
        final String _tmpTextualUploadDate;
        if (_cursor.isNull(_cursorIndexOfTextualUploadDate)) {
          _tmpTextualUploadDate = null;
        } else {
          _tmpTextualUploadDate = _cursor.getString(_cursorIndexOfTextualUploadDate);
        }
        final OffsetDateTime _tmpUploadDate;
        final Long _tmp_1;
        if (_cursor.isNull(_cursorIndexOfUploadDate)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getLong(_cursorIndexOfUploadDate);
        }
        _tmpUploadDate = Converters.INSTANCE.offsetDateTimeFromTimestamp(_tmp_1);
        final Boolean _tmpIsUploadDateApproximation;
        final Integer _tmp_2;
        if (_cursor.isNull(_cursorIndexOfIsUploadDateApproximation)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getInt(_cursorIndexOfIsUploadDateApproximation);
        }
        _tmpIsUploadDateApproximation = _tmp_2 == null ? null : _tmp_2 != 0;
        final long _tmpDuration;
        _tmpDuration = _cursor.getLong(_cursorIndexOfDuration);
        _result = new StreamDAO.StreamCompareFeed(_tmpUid,_tmpStreamType,_tmpTextualUploadDate,_tmpUploadDate,_tmpIsUploadDateApproximation,_tmpDuration);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}

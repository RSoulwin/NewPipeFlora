package org.schabi.newpipelegacy.database.history.dao;

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
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import org.schabi.newpipe.extractor.stream.StreamType;
import org.schabi.newpipelegacy.database.Converters;
import org.schabi.newpipelegacy.database.history.model.StreamHistoryEntity;
import org.schabi.newpipelegacy.database.history.model.StreamHistoryEntry;
import org.schabi.newpipelegacy.database.stream.StreamStatisticsEntry;
import org.schabi.newpipelegacy.database.stream.model.StreamEntity;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class StreamHistoryDAO_Impl extends StreamHistoryDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<StreamHistoryEntity> __insertionAdapterOfStreamHistoryEntity;

  private final EntityDeletionOrUpdateAdapter<StreamHistoryEntity> __deletionAdapterOfStreamHistoryEntity;

  private final EntityDeletionOrUpdateAdapter<StreamHistoryEntity> __updateAdapterOfStreamHistoryEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  private final SharedSQLiteStatement __preparedStmtOfDeleteStreamHistory;

  public StreamHistoryDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfStreamHistoryEntity = new EntityInsertionAdapter<StreamHistoryEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `stream_history` (`stream_id`,`access_date`,`repeat_count`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, StreamHistoryEntity value) {
        stmt.bindLong(1, value.getStreamUid());
        final Long _tmp = Converters.INSTANCE.offsetDateTimeToTimestamp(value.getAccessDate());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, _tmp);
        }
        stmt.bindLong(3, value.getRepeatCount());
      }
    };
    this.__deletionAdapterOfStreamHistoryEntity = new EntityDeletionOrUpdateAdapter<StreamHistoryEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `stream_history` WHERE `stream_id` = ? AND `access_date` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, StreamHistoryEntity value) {
        stmt.bindLong(1, value.getStreamUid());
        final Long _tmp = Converters.INSTANCE.offsetDateTimeToTimestamp(value.getAccessDate());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, _tmp);
        }
      }
    };
    this.__updateAdapterOfStreamHistoryEntity = new EntityDeletionOrUpdateAdapter<StreamHistoryEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `stream_history` SET `stream_id` = ?,`access_date` = ?,`repeat_count` = ? WHERE `stream_id` = ? AND `access_date` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, StreamHistoryEntity value) {
        stmt.bindLong(1, value.getStreamUid());
        final Long _tmp = Converters.INSTANCE.offsetDateTimeToTimestamp(value.getAccessDate());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, _tmp);
        }
        stmt.bindLong(3, value.getRepeatCount());
        stmt.bindLong(4, value.getStreamUid());
        final Long _tmp_1 = Converters.INSTANCE.offsetDateTimeToTimestamp(value.getAccessDate());
        if (_tmp_1 == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, _tmp_1);
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM stream_history";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteStreamHistory = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM stream_history WHERE stream_id = ?";
        return _query;
      }
    };
  }

  @Override
  public long insert(final StreamHistoryEntity entity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfStreamHistoryEntity.insertAndReturnId(entity);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Long> insertAll(final StreamHistoryEntity... entities) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      List<Long> _result = __insertionAdapterOfStreamHistoryEntity.insertAndReturnIdsList(entities);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Long> insertAll(final Collection<StreamHistoryEntity> entities) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      List<Long> _result = __insertionAdapterOfStreamHistoryEntity.insertAndReturnIdsList(entities);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final StreamHistoryEntity entity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfStreamHistoryEntity.handle(entity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int delete(final Collection<StreamHistoryEntity> entities) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__deletionAdapterOfStreamHistoryEntity.handleMultiple(entities);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int update(final StreamHistoryEntity entity) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__updateAdapterOfStreamHistoryEntity.handle(entity);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final Collection<StreamHistoryEntity> entities) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfStreamHistoryEntity.handleMultiple(entities);
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
  public int deleteStreamHistory(final long streamId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteStreamHistory.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, streamId);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteStreamHistory.release(_stmt);
    }
  }

  @Override
  public Flowable<List<StreamHistoryEntity>> getAll() {
    final String _sql = "SELECT * FROM stream_history";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, false, new String[]{"stream_history"}, new Callable<List<StreamHistoryEntity>>() {
      @Override
      public List<StreamHistoryEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfStreamUid = CursorUtil.getColumnIndexOrThrow(_cursor, "stream_id");
          final int _cursorIndexOfAccessDate = CursorUtil.getColumnIndexOrThrow(_cursor, "access_date");
          final int _cursorIndexOfRepeatCount = CursorUtil.getColumnIndexOrThrow(_cursor, "repeat_count");
          final List<StreamHistoryEntity> _result = new ArrayList<StreamHistoryEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final StreamHistoryEntity _item;
            final long _tmpStreamUid;
            _tmpStreamUid = _cursor.getLong(_cursorIndexOfStreamUid);
            final OffsetDateTime _tmpAccessDate;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfAccessDate)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfAccessDate);
            }
            _tmpAccessDate = Converters.INSTANCE.offsetDateTimeFromTimestamp(_tmp);
            final long _tmpRepeatCount;
            _tmpRepeatCount = _cursor.getLong(_cursorIndexOfRepeatCount);
            _item = new StreamHistoryEntity(_tmpStreamUid,_tmpAccessDate,_tmpRepeatCount);
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
  public StreamHistoryEntity getLatestEntry() {
    final String _sql = "SELECT * FROM stream_history WHERE access_date = (SELECT MAX(access_date) FROM stream_history)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfStreamUid = CursorUtil.getColumnIndexOrThrow(_cursor, "stream_id");
      final int _cursorIndexOfAccessDate = CursorUtil.getColumnIndexOrThrow(_cursor, "access_date");
      final int _cursorIndexOfRepeatCount = CursorUtil.getColumnIndexOrThrow(_cursor, "repeat_count");
      final StreamHistoryEntity _result;
      if(_cursor.moveToFirst()) {
        final long _tmpStreamUid;
        _tmpStreamUid = _cursor.getLong(_cursorIndexOfStreamUid);
        final OffsetDateTime _tmpAccessDate;
        final Long _tmp;
        if (_cursor.isNull(_cursorIndexOfAccessDate)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getLong(_cursorIndexOfAccessDate);
        }
        _tmpAccessDate = Converters.INSTANCE.offsetDateTimeFromTimestamp(_tmp);
        final long _tmpRepeatCount;
        _tmpRepeatCount = _cursor.getLong(_cursorIndexOfRepeatCount);
        _result = new StreamHistoryEntity(_tmpStreamUid,_tmpAccessDate,_tmpRepeatCount);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public StreamHistoryEntity getLatestEntry(final long streamId) {
    final String _sql = "SELECT * FROM stream_history WHERE stream_id = ? ORDER BY access_date DESC LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, streamId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfStreamUid = CursorUtil.getColumnIndexOrThrow(_cursor, "stream_id");
      final int _cursorIndexOfAccessDate = CursorUtil.getColumnIndexOrThrow(_cursor, "access_date");
      final int _cursorIndexOfRepeatCount = CursorUtil.getColumnIndexOrThrow(_cursor, "repeat_count");
      final StreamHistoryEntity _result;
      if(_cursor.moveToFirst()) {
        final long _tmpStreamUid;
        _tmpStreamUid = _cursor.getLong(_cursorIndexOfStreamUid);
        final OffsetDateTime _tmpAccessDate;
        final Long _tmp;
        if (_cursor.isNull(_cursorIndexOfAccessDate)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getLong(_cursorIndexOfAccessDate);
        }
        _tmpAccessDate = Converters.INSTANCE.offsetDateTimeFromTimestamp(_tmp);
        final long _tmpRepeatCount;
        _tmpRepeatCount = _cursor.getLong(_cursorIndexOfRepeatCount);
        _result = new StreamHistoryEntity(_tmpStreamUid,_tmpAccessDate,_tmpRepeatCount);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Flowable<List<StreamHistoryEntry>> getHistory() {
    final String _sql = "SELECT * FROM streams INNER JOIN stream_history ON uid = stream_id ORDER BY access_date DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, false, new String[]{"streams","stream_history"}, new Callable<List<StreamHistoryEntry>>() {
      @Override
      public List<StreamHistoryEntry> call() throws Exception {
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
          final int _cursorIndexOfStreamId = CursorUtil.getColumnIndexOrThrow(_cursor, "stream_id");
          final int _cursorIndexOfAccessDate = CursorUtil.getColumnIndexOrThrow(_cursor, "access_date");
          final int _cursorIndexOfRepeatCount = CursorUtil.getColumnIndexOrThrow(_cursor, "repeat_count");
          final List<StreamHistoryEntry> _result = new ArrayList<StreamHistoryEntry>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final StreamHistoryEntry _item;
            final long _tmpStreamId;
            _tmpStreamId = _cursor.getLong(_cursorIndexOfStreamId);
            final OffsetDateTime _tmpAccessDate;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfAccessDate)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfAccessDate);
            }
            _tmpAccessDate = Converters.INSTANCE.offsetDateTimeFromTimestamp(_tmp);
            final long _tmpRepeatCount;
            _tmpRepeatCount = _cursor.getLong(_cursorIndexOfRepeatCount);
            final StreamEntity _tmpStreamEntity;
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
              final String _tmp_1;
              if (_cursor.isNull(_cursorIndexOfStreamType)) {
                _tmp_1 = null;
              } else {
                _tmp_1 = _cursor.getString(_cursorIndexOfStreamType);
              }
              _tmpStreamType = Converters.INSTANCE.streamTypeOf(_tmp_1);
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
              final Long _tmp_2;
              if (_cursor.isNull(_cursorIndexOfUploadDate)) {
                _tmp_2 = null;
              } else {
                _tmp_2 = _cursor.getLong(_cursorIndexOfUploadDate);
              }
              _tmpUploadDate = Converters.INSTANCE.offsetDateTimeFromTimestamp(_tmp_2);
              final Boolean _tmpIsUploadDateApproximation;
              final Integer _tmp_3;
              if (_cursor.isNull(_cursorIndexOfIsUploadDateApproximation)) {
                _tmp_3 = null;
              } else {
                _tmp_3 = _cursor.getInt(_cursorIndexOfIsUploadDateApproximation);
              }
              _tmpIsUploadDateApproximation = _tmp_3 == null ? null : _tmp_3 != 0;
              _tmpStreamEntity = new StreamEntity(_tmpUid,_tmpServiceId,_tmpUrl,_tmpTitle,_tmpStreamType,_tmpDuration,_tmpUploader,_tmpUploaderUrl,_tmpThumbnailUrl,_tmpViewCount,_tmpTextualUploadDate,_tmpUploadDate,_tmpIsUploadDateApproximation);
            }  else  {
              _tmpStreamEntity = null;
            }
            _item = new StreamHistoryEntry(_tmpStreamEntity,_tmpStreamId,_tmpAccessDate,_tmpRepeatCount);
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
  public Flowable<List<StreamHistoryEntry>> getHistorySortedById() {
    final String _sql = "SELECT * FROM streams INNER JOIN stream_history ON uid = stream_id ORDER BY uid ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, false, new String[]{"streams","stream_history"}, new Callable<List<StreamHistoryEntry>>() {
      @Override
      public List<StreamHistoryEntry> call() throws Exception {
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
          final int _cursorIndexOfStreamId = CursorUtil.getColumnIndexOrThrow(_cursor, "stream_id");
          final int _cursorIndexOfAccessDate = CursorUtil.getColumnIndexOrThrow(_cursor, "access_date");
          final int _cursorIndexOfRepeatCount = CursorUtil.getColumnIndexOrThrow(_cursor, "repeat_count");
          final List<StreamHistoryEntry> _result = new ArrayList<StreamHistoryEntry>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final StreamHistoryEntry _item;
            final long _tmpStreamId;
            _tmpStreamId = _cursor.getLong(_cursorIndexOfStreamId);
            final OffsetDateTime _tmpAccessDate;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfAccessDate)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfAccessDate);
            }
            _tmpAccessDate = Converters.INSTANCE.offsetDateTimeFromTimestamp(_tmp);
            final long _tmpRepeatCount;
            _tmpRepeatCount = _cursor.getLong(_cursorIndexOfRepeatCount);
            final StreamEntity _tmpStreamEntity;
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
              final String _tmp_1;
              if (_cursor.isNull(_cursorIndexOfStreamType)) {
                _tmp_1 = null;
              } else {
                _tmp_1 = _cursor.getString(_cursorIndexOfStreamType);
              }
              _tmpStreamType = Converters.INSTANCE.streamTypeOf(_tmp_1);
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
              final Long _tmp_2;
              if (_cursor.isNull(_cursorIndexOfUploadDate)) {
                _tmp_2 = null;
              } else {
                _tmp_2 = _cursor.getLong(_cursorIndexOfUploadDate);
              }
              _tmpUploadDate = Converters.INSTANCE.offsetDateTimeFromTimestamp(_tmp_2);
              final Boolean _tmpIsUploadDateApproximation;
              final Integer _tmp_3;
              if (_cursor.isNull(_cursorIndexOfIsUploadDateApproximation)) {
                _tmp_3 = null;
              } else {
                _tmp_3 = _cursor.getInt(_cursorIndexOfIsUploadDateApproximation);
              }
              _tmpIsUploadDateApproximation = _tmp_3 == null ? null : _tmp_3 != 0;
              _tmpStreamEntity = new StreamEntity(_tmpUid,_tmpServiceId,_tmpUrl,_tmpTitle,_tmpStreamType,_tmpDuration,_tmpUploader,_tmpUploaderUrl,_tmpThumbnailUrl,_tmpViewCount,_tmpTextualUploadDate,_tmpUploadDate,_tmpIsUploadDateApproximation);
            }  else  {
              _tmpStreamEntity = null;
            }
            _item = new StreamHistoryEntry(_tmpStreamEntity,_tmpStreamId,_tmpAccessDate,_tmpRepeatCount);
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
  public Flowable<List<StreamStatisticsEntry>> getStatistics() {
    final String _sql = "SELECT `uid`, `service_id`, `url`, `title`, `stream_type`, `duration`, `uploader`, `uploader_url`, `thumbnail_url`, `view_count`, `textual_upload_date`, `upload_date`, `is_upload_date_approximation`, `stream_id`, `latestAccess`, `watchCount`, `progress_time` FROM (SELECT * FROM streams INNER JOIN (SELECT stream_id,   MAX(access_date) AS latestAccess,   SUM(repeat_count) AS watchCount FROM stream_history GROUP BY stream_id) ON uid = stream_id LEFT JOIN (SELECT stream_id AS stream_id_alias, progress_time FROM stream_state ) ON uid = stream_id_alias)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, false, new String[]{"streams","stream_history","stream_state"}, new Callable<List<StreamStatisticsEntry>>() {
      @Override
      public List<StreamStatisticsEntry> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUid = 0;
          final int _cursorIndexOfServiceId = 1;
          final int _cursorIndexOfUrl = 2;
          final int _cursorIndexOfTitle = 3;
          final int _cursorIndexOfStreamType = 4;
          final int _cursorIndexOfDuration = 5;
          final int _cursorIndexOfUploader = 6;
          final int _cursorIndexOfUploaderUrl = 7;
          final int _cursorIndexOfThumbnailUrl = 8;
          final int _cursorIndexOfViewCount = 9;
          final int _cursorIndexOfTextualUploadDate = 10;
          final int _cursorIndexOfUploadDate = 11;
          final int _cursorIndexOfIsUploadDateApproximation = 12;
          final int _cursorIndexOfStreamId = 13;
          final int _cursorIndexOfLatestAccessDate = 14;
          final int _cursorIndexOfWatchCount = 15;
          final int _cursorIndexOfProgressMillis = 16;
          final List<StreamStatisticsEntry> _result = new ArrayList<StreamStatisticsEntry>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final StreamStatisticsEntry _item;
            final long _tmpStreamId;
            _tmpStreamId = _cursor.getLong(_cursorIndexOfStreamId);
            final OffsetDateTime _tmpLatestAccessDate;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfLatestAccessDate)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfLatestAccessDate);
            }
            _tmpLatestAccessDate = Converters.INSTANCE.offsetDateTimeFromTimestamp(_tmp);
            final long _tmpWatchCount;
            _tmpWatchCount = _cursor.getLong(_cursorIndexOfWatchCount);
            final long _tmpProgressMillis;
            _tmpProgressMillis = _cursor.getLong(_cursorIndexOfProgressMillis);
            final StreamEntity _tmpStreamEntity;
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
              final String _tmp_1;
              if (_cursor.isNull(_cursorIndexOfStreamType)) {
                _tmp_1 = null;
              } else {
                _tmp_1 = _cursor.getString(_cursorIndexOfStreamType);
              }
              _tmpStreamType = Converters.INSTANCE.streamTypeOf(_tmp_1);
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
              final Long _tmp_2;
              if (_cursor.isNull(_cursorIndexOfUploadDate)) {
                _tmp_2 = null;
              } else {
                _tmp_2 = _cursor.getLong(_cursorIndexOfUploadDate);
              }
              _tmpUploadDate = Converters.INSTANCE.offsetDateTimeFromTimestamp(_tmp_2);
              final Boolean _tmpIsUploadDateApproximation;
              final Integer _tmp_3;
              if (_cursor.isNull(_cursorIndexOfIsUploadDateApproximation)) {
                _tmp_3 = null;
              } else {
                _tmp_3 = _cursor.getInt(_cursorIndexOfIsUploadDateApproximation);
              }
              _tmpIsUploadDateApproximation = _tmp_3 == null ? null : _tmp_3 != 0;
              _tmpStreamEntity = new StreamEntity(_tmpUid,_tmpServiceId,_tmpUrl,_tmpTitle,_tmpStreamType,_tmpDuration,_tmpUploader,_tmpUploaderUrl,_tmpThumbnailUrl,_tmpViewCount,_tmpTextualUploadDate,_tmpUploadDate,_tmpIsUploadDateApproximation);
            }  else  {
              _tmpStreamEntity = null;
            }
            _item = new StreamStatisticsEntry(_tmpStreamEntity,_tmpProgressMillis,_tmpStreamId,_tmpLatestAccessDate,_tmpWatchCount);
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

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
import io.reactivex.rxjava3.core.Flowable;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import org.schabi.newpipelegacy.database.stream.model.StreamStateEntity;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class StreamStateDAO_Impl implements StreamStateDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<StreamStateEntity> __insertionAdapterOfStreamStateEntity;

  private final EntityInsertionAdapter<StreamStateEntity> __insertionAdapterOfStreamStateEntity_1;

  private final EntityDeletionOrUpdateAdapter<StreamStateEntity> __deletionAdapterOfStreamStateEntity;

  private final EntityDeletionOrUpdateAdapter<StreamStateEntity> __updateAdapterOfStreamStateEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  private final SharedSQLiteStatement __preparedStmtOfDeleteState;

  public StreamStateDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfStreamStateEntity = new EntityInsertionAdapter<StreamStateEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `stream_state` (`stream_id`,`progress_time`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, StreamStateEntity value) {
        stmt.bindLong(1, value.getStreamUid());
        stmt.bindLong(2, value.getProgressMillis());
      }
    };
    this.__insertionAdapterOfStreamStateEntity_1 = new EntityInsertionAdapter<StreamStateEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `stream_state` (`stream_id`,`progress_time`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, StreamStateEntity value) {
        stmt.bindLong(1, value.getStreamUid());
        stmt.bindLong(2, value.getProgressMillis());
      }
    };
    this.__deletionAdapterOfStreamStateEntity = new EntityDeletionOrUpdateAdapter<StreamStateEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `stream_state` WHERE `stream_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, StreamStateEntity value) {
        stmt.bindLong(1, value.getStreamUid());
      }
    };
    this.__updateAdapterOfStreamStateEntity = new EntityDeletionOrUpdateAdapter<StreamStateEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `stream_state` SET `stream_id` = ?,`progress_time` = ? WHERE `stream_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, StreamStateEntity value) {
        stmt.bindLong(1, value.getStreamUid());
        stmt.bindLong(2, value.getProgressMillis());
        stmt.bindLong(3, value.getStreamUid());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM stream_state";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteState = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM stream_state WHERE stream_id = ?";
        return _query;
      }
    };
  }

  @Override
  public long insert(final StreamStateEntity entity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfStreamStateEntity.insertAndReturnId(entity);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Long> insertAll(final StreamStateEntity... entities) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      List<Long> _result = __insertionAdapterOfStreamStateEntity.insertAndReturnIdsList(entities);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Long> insertAll(final Collection<StreamStateEntity> entities) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      List<Long> _result = __insertionAdapterOfStreamStateEntity.insertAndReturnIdsList(entities);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void silentInsertInternal(final StreamStateEntity streamState) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfStreamStateEntity_1.insert(streamState);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final StreamStateEntity entity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfStreamStateEntity.handle(entity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int delete(final Collection<StreamStateEntity> entities) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__deletionAdapterOfStreamStateEntity.handleMultiple(entities);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int update(final StreamStateEntity entity) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__updateAdapterOfStreamStateEntity.handle(entity);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final Collection<StreamStateEntity> entities) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfStreamStateEntity.handleMultiple(entities);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public long upsert(final StreamStateEntity stream) {
    __db.beginTransaction();
    try {
      long _result = StreamStateDAO.super.upsert(stream);
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
  public int deleteState(final long streamId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteState.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, streamId);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteState.release(_stmt);
    }
  }

  @Override
  public Flowable<List<StreamStateEntity>> getAll() {
    final String _sql = "SELECT * FROM stream_state";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, false, new String[]{"stream_state"}, new Callable<List<StreamStateEntity>>() {
      @Override
      public List<StreamStateEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfStreamUid = CursorUtil.getColumnIndexOrThrow(_cursor, "stream_id");
          final int _cursorIndexOfProgressMillis = CursorUtil.getColumnIndexOrThrow(_cursor, "progress_time");
          final List<StreamStateEntity> _result = new ArrayList<StreamStateEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final StreamStateEntity _item;
            final long _tmpStreamUid;
            _tmpStreamUid = _cursor.getLong(_cursorIndexOfStreamUid);
            final long _tmpProgressMillis;
            _tmpProgressMillis = _cursor.getLong(_cursorIndexOfProgressMillis);
            _item = new StreamStateEntity(_tmpStreamUid,_tmpProgressMillis);
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
  public Flowable<List<StreamStateEntity>> getState(final long streamId) {
    final String _sql = "SELECT * FROM stream_state WHERE stream_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, streamId);
    return RxRoom.createFlowable(__db, false, new String[]{"stream_state"}, new Callable<List<StreamStateEntity>>() {
      @Override
      public List<StreamStateEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfStreamUid = CursorUtil.getColumnIndexOrThrow(_cursor, "stream_id");
          final int _cursorIndexOfProgressMillis = CursorUtil.getColumnIndexOrThrow(_cursor, "progress_time");
          final List<StreamStateEntity> _result = new ArrayList<StreamStateEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final StreamStateEntity _item;
            final long _tmpStreamUid;
            _tmpStreamUid = _cursor.getLong(_cursorIndexOfStreamUid);
            final long _tmpProgressMillis;
            _tmpProgressMillis = _cursor.getLong(_cursorIndexOfProgressMillis);
            _item = new StreamStateEntity(_tmpStreamUid,_tmpProgressMillis);
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

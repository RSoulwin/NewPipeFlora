package org.schabi.newpipelegacy.database.playlist.dao;

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
import org.schabi.newpipelegacy.database.playlist.model.PlaylistRemoteEntity;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class PlaylistRemoteDAO_Impl implements PlaylistRemoteDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<PlaylistRemoteEntity> __insertionAdapterOfPlaylistRemoteEntity;

  private final EntityDeletionOrUpdateAdapter<PlaylistRemoteEntity> __deletionAdapterOfPlaylistRemoteEntity;

  private final EntityDeletionOrUpdateAdapter<PlaylistRemoteEntity> __updateAdapterOfPlaylistRemoteEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  private final SharedSQLiteStatement __preparedStmtOfDeletePlaylist;

  public PlaylistRemoteDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPlaylistRemoteEntity = new EntityInsertionAdapter<PlaylistRemoteEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `remote_playlists` (`uid`,`service_id`,`name`,`url`,`thumbnail_url`,`uploader`,`stream_count`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PlaylistRemoteEntity value) {
        stmt.bindLong(1, value.getUid());
        stmt.bindLong(2, value.getServiceId());
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getUrl());
        }
        if (value.getThumbnailUrl() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getThumbnailUrl());
        }
        if (value.getUploader() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getUploader());
        }
        if (value.getStreamCount() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, value.getStreamCount());
        }
      }
    };
    this.__deletionAdapterOfPlaylistRemoteEntity = new EntityDeletionOrUpdateAdapter<PlaylistRemoteEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `remote_playlists` WHERE `uid` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PlaylistRemoteEntity value) {
        stmt.bindLong(1, value.getUid());
      }
    };
    this.__updateAdapterOfPlaylistRemoteEntity = new EntityDeletionOrUpdateAdapter<PlaylistRemoteEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `remote_playlists` SET `uid` = ?,`service_id` = ?,`name` = ?,`url` = ?,`thumbnail_url` = ?,`uploader` = ?,`stream_count` = ? WHERE `uid` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PlaylistRemoteEntity value) {
        stmt.bindLong(1, value.getUid());
        stmt.bindLong(2, value.getServiceId());
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getUrl());
        }
        if (value.getThumbnailUrl() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getThumbnailUrl());
        }
        if (value.getUploader() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getUploader());
        }
        if (value.getStreamCount() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, value.getStreamCount());
        }
        stmt.bindLong(8, value.getUid());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM remote_playlists";
        return _query;
      }
    };
    this.__preparedStmtOfDeletePlaylist = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM remote_playlists WHERE uid = ?";
        return _query;
      }
    };
  }

  @Override
  public long insert(final PlaylistRemoteEntity entity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfPlaylistRemoteEntity.insertAndReturnId(entity);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Long> insertAll(final PlaylistRemoteEntity... entities) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      List<Long> _result = __insertionAdapterOfPlaylistRemoteEntity.insertAndReturnIdsList(entities);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Long> insertAll(final Collection<PlaylistRemoteEntity> entities) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      List<Long> _result = __insertionAdapterOfPlaylistRemoteEntity.insertAndReturnIdsList(entities);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final PlaylistRemoteEntity entity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfPlaylistRemoteEntity.handle(entity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int delete(final Collection<PlaylistRemoteEntity> entities) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__deletionAdapterOfPlaylistRemoteEntity.handleMultiple(entities);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int update(final PlaylistRemoteEntity entity) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__updateAdapterOfPlaylistRemoteEntity.handle(entity);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final Collection<PlaylistRemoteEntity> entities) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfPlaylistRemoteEntity.handleMultiple(entities);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public long upsert(final PlaylistRemoteEntity playlist) {
    __db.beginTransaction();
    try {
      long _result = PlaylistRemoteDAO.super.upsert(playlist);
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
  public int deletePlaylist(final long playlistId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeletePlaylist.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, playlistId);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeletePlaylist.release(_stmt);
    }
  }

  @Override
  public Flowable<List<PlaylistRemoteEntity>> getAll() {
    final String _sql = "SELECT * FROM remote_playlists";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, false, new String[]{"remote_playlists"}, new Callable<List<PlaylistRemoteEntity>>() {
      @Override
      public List<PlaylistRemoteEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
          final int _cursorIndexOfServiceId = CursorUtil.getColumnIndexOrThrow(_cursor, "service_id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfThumbnailUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnail_url");
          final int _cursorIndexOfUploader = CursorUtil.getColumnIndexOrThrow(_cursor, "uploader");
          final int _cursorIndexOfStreamCount = CursorUtil.getColumnIndexOrThrow(_cursor, "stream_count");
          final List<PlaylistRemoteEntity> _result = new ArrayList<PlaylistRemoteEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final PlaylistRemoteEntity _item;
            final int _tmpServiceId;
            _tmpServiceId = _cursor.getInt(_cursorIndexOfServiceId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpUrl;
            if (_cursor.isNull(_cursorIndexOfUrl)) {
              _tmpUrl = null;
            } else {
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            }
            final String _tmpThumbnailUrl;
            if (_cursor.isNull(_cursorIndexOfThumbnailUrl)) {
              _tmpThumbnailUrl = null;
            } else {
              _tmpThumbnailUrl = _cursor.getString(_cursorIndexOfThumbnailUrl);
            }
            final String _tmpUploader;
            if (_cursor.isNull(_cursorIndexOfUploader)) {
              _tmpUploader = null;
            } else {
              _tmpUploader = _cursor.getString(_cursorIndexOfUploader);
            }
            final Long _tmpStreamCount;
            if (_cursor.isNull(_cursorIndexOfStreamCount)) {
              _tmpStreamCount = null;
            } else {
              _tmpStreamCount = _cursor.getLong(_cursorIndexOfStreamCount);
            }
            _item = new PlaylistRemoteEntity(_tmpServiceId,_tmpName,_tmpUrl,_tmpThumbnailUrl,_tmpUploader,_tmpStreamCount);
            final long _tmpUid;
            _tmpUid = _cursor.getLong(_cursorIndexOfUid);
            _item.setUid(_tmpUid);
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
  public Flowable<List<PlaylistRemoteEntity>> listByService(final int serviceId) {
    final String _sql = "SELECT * FROM remote_playlists WHERE service_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, serviceId);
    return RxRoom.createFlowable(__db, false, new String[]{"remote_playlists"}, new Callable<List<PlaylistRemoteEntity>>() {
      @Override
      public List<PlaylistRemoteEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
          final int _cursorIndexOfServiceId = CursorUtil.getColumnIndexOrThrow(_cursor, "service_id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfThumbnailUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnail_url");
          final int _cursorIndexOfUploader = CursorUtil.getColumnIndexOrThrow(_cursor, "uploader");
          final int _cursorIndexOfStreamCount = CursorUtil.getColumnIndexOrThrow(_cursor, "stream_count");
          final List<PlaylistRemoteEntity> _result = new ArrayList<PlaylistRemoteEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final PlaylistRemoteEntity _item;
            final int _tmpServiceId;
            _tmpServiceId = _cursor.getInt(_cursorIndexOfServiceId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpUrl;
            if (_cursor.isNull(_cursorIndexOfUrl)) {
              _tmpUrl = null;
            } else {
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            }
            final String _tmpThumbnailUrl;
            if (_cursor.isNull(_cursorIndexOfThumbnailUrl)) {
              _tmpThumbnailUrl = null;
            } else {
              _tmpThumbnailUrl = _cursor.getString(_cursorIndexOfThumbnailUrl);
            }
            final String _tmpUploader;
            if (_cursor.isNull(_cursorIndexOfUploader)) {
              _tmpUploader = null;
            } else {
              _tmpUploader = _cursor.getString(_cursorIndexOfUploader);
            }
            final Long _tmpStreamCount;
            if (_cursor.isNull(_cursorIndexOfStreamCount)) {
              _tmpStreamCount = null;
            } else {
              _tmpStreamCount = _cursor.getLong(_cursorIndexOfStreamCount);
            }
            _item = new PlaylistRemoteEntity(_tmpServiceId,_tmpName,_tmpUrl,_tmpThumbnailUrl,_tmpUploader,_tmpStreamCount);
            final long _tmpUid;
            _tmpUid = _cursor.getLong(_cursorIndexOfUid);
            _item.setUid(_tmpUid);
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
  public Flowable<List<PlaylistRemoteEntity>> getPlaylist(final long serviceId, final String url) {
    final String _sql = "SELECT * FROM remote_playlists WHERE url = ? AND service_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (url == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, url);
    }
    _argIndex = 2;
    _statement.bindLong(_argIndex, serviceId);
    return RxRoom.createFlowable(__db, false, new String[]{"remote_playlists"}, new Callable<List<PlaylistRemoteEntity>>() {
      @Override
      public List<PlaylistRemoteEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
          final int _cursorIndexOfServiceId = CursorUtil.getColumnIndexOrThrow(_cursor, "service_id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfThumbnailUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnail_url");
          final int _cursorIndexOfUploader = CursorUtil.getColumnIndexOrThrow(_cursor, "uploader");
          final int _cursorIndexOfStreamCount = CursorUtil.getColumnIndexOrThrow(_cursor, "stream_count");
          final List<PlaylistRemoteEntity> _result = new ArrayList<PlaylistRemoteEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final PlaylistRemoteEntity _item;
            final int _tmpServiceId;
            _tmpServiceId = _cursor.getInt(_cursorIndexOfServiceId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpUrl;
            if (_cursor.isNull(_cursorIndexOfUrl)) {
              _tmpUrl = null;
            } else {
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            }
            final String _tmpThumbnailUrl;
            if (_cursor.isNull(_cursorIndexOfThumbnailUrl)) {
              _tmpThumbnailUrl = null;
            } else {
              _tmpThumbnailUrl = _cursor.getString(_cursorIndexOfThumbnailUrl);
            }
            final String _tmpUploader;
            if (_cursor.isNull(_cursorIndexOfUploader)) {
              _tmpUploader = null;
            } else {
              _tmpUploader = _cursor.getString(_cursorIndexOfUploader);
            }
            final Long _tmpStreamCount;
            if (_cursor.isNull(_cursorIndexOfStreamCount)) {
              _tmpStreamCount = null;
            } else {
              _tmpStreamCount = _cursor.getLong(_cursorIndexOfStreamCount);
            }
            _item = new PlaylistRemoteEntity(_tmpServiceId,_tmpName,_tmpUrl,_tmpThumbnailUrl,_tmpUploader,_tmpStreamCount);
            final long _tmpUid;
            _tmpUid = _cursor.getLong(_cursorIndexOfUid);
            _item.setUid(_tmpUid);
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
  public Long getPlaylistIdInternal(final long serviceId, final String url) {
    final String _sql = "SELECT uid FROM remote_playlists WHERE url = ? AND service_id = ?";
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
      final Long _result;
      if(_cursor.moveToFirst()) {
        if (_cursor.isNull(0)) {
          _result = null;
        } else {
          _result = _cursor.getLong(0);
        }
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

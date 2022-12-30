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
import java.lang.Class;
import java.lang.Exception;
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
import org.schabi.newpipelegacy.database.Converters;
import org.schabi.newpipelegacy.database.history.model.SearchHistoryEntry;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class SearchHistoryDAO_Impl implements SearchHistoryDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<SearchHistoryEntry> __insertionAdapterOfSearchHistoryEntry;

  private final EntityDeletionOrUpdateAdapter<SearchHistoryEntry> __deletionAdapterOfSearchHistoryEntry;

  private final EntityDeletionOrUpdateAdapter<SearchHistoryEntry> __updateAdapterOfSearchHistoryEntry;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllWhereQuery;

  public SearchHistoryDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSearchHistoryEntry = new EntityInsertionAdapter<SearchHistoryEntry>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `search_history` (`creation_date`,`service_id`,`search`,`id`) VALUES (?,?,?,nullif(?, 0))";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SearchHistoryEntry value) {
        final Long _tmp = Converters.INSTANCE.offsetDateTimeToTimestamp(value.getCreationDate());
        if (_tmp == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, _tmp);
        }
        stmt.bindLong(2, value.getServiceId());
        if (value.getSearch() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getSearch());
        }
        stmt.bindLong(4, value.getId());
      }
    };
    this.__deletionAdapterOfSearchHistoryEntry = new EntityDeletionOrUpdateAdapter<SearchHistoryEntry>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `search_history` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SearchHistoryEntry value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfSearchHistoryEntry = new EntityDeletionOrUpdateAdapter<SearchHistoryEntry>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `search_history` SET `creation_date` = ?,`service_id` = ?,`search` = ?,`id` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SearchHistoryEntry value) {
        final Long _tmp = Converters.INSTANCE.offsetDateTimeToTimestamp(value.getCreationDate());
        if (_tmp == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, _tmp);
        }
        stmt.bindLong(2, value.getServiceId());
        if (value.getSearch() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getSearch());
        }
        stmt.bindLong(4, value.getId());
        stmt.bindLong(5, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM search_history";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAllWhereQuery = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM search_history WHERE search = ?";
        return _query;
      }
    };
  }

  @Override
  public long insert(final SearchHistoryEntry entity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfSearchHistoryEntry.insertAndReturnId(entity);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Long> insertAll(final SearchHistoryEntry... entities) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      List<Long> _result = __insertionAdapterOfSearchHistoryEntry.insertAndReturnIdsList(entities);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Long> insertAll(final Collection<SearchHistoryEntry> entities) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      List<Long> _result = __insertionAdapterOfSearchHistoryEntry.insertAndReturnIdsList(entities);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final SearchHistoryEntry entity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfSearchHistoryEntry.handle(entity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int delete(final Collection<SearchHistoryEntry> entities) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__deletionAdapterOfSearchHistoryEntry.handleMultiple(entities);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int update(final SearchHistoryEntry entity) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__updateAdapterOfSearchHistoryEntry.handle(entity);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final Collection<SearchHistoryEntry> entities) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfSearchHistoryEntry.handleMultiple(entities);
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
  public int deleteAllWhereQuery(final String query) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllWhereQuery.acquire();
    int _argIndex = 1;
    if (query == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, query);
    }
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllWhereQuery.release(_stmt);
    }
  }

  @Override
  public Flowable<List<SearchHistoryEntry>> getAll() {
    final String _sql = "SELECT * FROM search_history ORDER BY creation_date DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, false, new String[]{"search_history"}, new Callable<List<SearchHistoryEntry>>() {
      @Override
      public List<SearchHistoryEntry> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCreationDate = CursorUtil.getColumnIndexOrThrow(_cursor, "creation_date");
          final int _cursorIndexOfServiceId = CursorUtil.getColumnIndexOrThrow(_cursor, "service_id");
          final int _cursorIndexOfSearch = CursorUtil.getColumnIndexOrThrow(_cursor, "search");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<SearchHistoryEntry> _result = new ArrayList<SearchHistoryEntry>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SearchHistoryEntry _item;
            final OffsetDateTime _tmpCreationDate;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfCreationDate)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfCreationDate);
            }
            _tmpCreationDate = Converters.INSTANCE.offsetDateTimeFromTimestamp(_tmp);
            final int _tmpServiceId;
            _tmpServiceId = _cursor.getInt(_cursorIndexOfServiceId);
            final String _tmpSearch;
            if (_cursor.isNull(_cursorIndexOfSearch)) {
              _tmpSearch = null;
            } else {
              _tmpSearch = _cursor.getString(_cursorIndexOfSearch);
            }
            _item = new SearchHistoryEntry(_tmpCreationDate,_tmpServiceId,_tmpSearch);
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            _item.setId(_tmpId);
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
  public Flowable<List<SearchHistoryEntry>> listByService(final int serviceId) {
    final String _sql = "SELECT * FROM search_history WHERE service_id = ? ORDER BY creation_date DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, serviceId);
    return RxRoom.createFlowable(__db, false, new String[]{"search_history"}, new Callable<List<SearchHistoryEntry>>() {
      @Override
      public List<SearchHistoryEntry> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCreationDate = CursorUtil.getColumnIndexOrThrow(_cursor, "creation_date");
          final int _cursorIndexOfServiceId = CursorUtil.getColumnIndexOrThrow(_cursor, "service_id");
          final int _cursorIndexOfSearch = CursorUtil.getColumnIndexOrThrow(_cursor, "search");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<SearchHistoryEntry> _result = new ArrayList<SearchHistoryEntry>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SearchHistoryEntry _item;
            final OffsetDateTime _tmpCreationDate;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfCreationDate)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfCreationDate);
            }
            _tmpCreationDate = Converters.INSTANCE.offsetDateTimeFromTimestamp(_tmp);
            final int _tmpServiceId;
            _tmpServiceId = _cursor.getInt(_cursorIndexOfServiceId);
            final String _tmpSearch;
            if (_cursor.isNull(_cursorIndexOfSearch)) {
              _tmpSearch = null;
            } else {
              _tmpSearch = _cursor.getString(_cursorIndexOfSearch);
            }
            _item = new SearchHistoryEntry(_tmpCreationDate,_tmpServiceId,_tmpSearch);
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            _item.setId(_tmpId);
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
  public SearchHistoryEntry getLatestEntry() {
    final String _sql = "SELECT * FROM search_history WHERE id = (SELECT MAX(id) FROM search_history)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfCreationDate = CursorUtil.getColumnIndexOrThrow(_cursor, "creation_date");
      final int _cursorIndexOfServiceId = CursorUtil.getColumnIndexOrThrow(_cursor, "service_id");
      final int _cursorIndexOfSearch = CursorUtil.getColumnIndexOrThrow(_cursor, "search");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final SearchHistoryEntry _result;
      if(_cursor.moveToFirst()) {
        final OffsetDateTime _tmpCreationDate;
        final Long _tmp;
        if (_cursor.isNull(_cursorIndexOfCreationDate)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getLong(_cursorIndexOfCreationDate);
        }
        _tmpCreationDate = Converters.INSTANCE.offsetDateTimeFromTimestamp(_tmp);
        final int _tmpServiceId;
        _tmpServiceId = _cursor.getInt(_cursorIndexOfServiceId);
        final String _tmpSearch;
        if (_cursor.isNull(_cursorIndexOfSearch)) {
          _tmpSearch = null;
        } else {
          _tmpSearch = _cursor.getString(_cursorIndexOfSearch);
        }
        _result = new SearchHistoryEntry(_tmpCreationDate,_tmpServiceId,_tmpSearch);
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        _result.setId(_tmpId);
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
  public Flowable<List<String>> getUniqueEntries(final int limit) {
    final String _sql = "SELECT search FROM search_history GROUP BY search ORDER BY MAX(creation_date) DESC LIMIT ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, limit);
    return RxRoom.createFlowable(__db, false, new String[]{"search_history"}, new Callable<List<String>>() {
      @Override
      public List<String> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final List<String> _result = new ArrayList<String>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final String _item;
            if (_cursor.isNull(0)) {
              _item = null;
            } else {
              _item = _cursor.getString(0);
            }
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
  public Flowable<List<String>> getSimilarEntries(final String query, final int limit) {
    final String _sql = "SELECT search FROM search_history WHERE search LIKE ? || '%' GROUP BY search ORDER BY MAX(creation_date) DESC LIMIT ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    _argIndex = 2;
    _statement.bindLong(_argIndex, limit);
    return RxRoom.createFlowable(__db, false, new String[]{"search_history"}, new Callable<List<String>>() {
      @Override
      public List<String> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final List<String> _result = new ArrayList<String>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final String _item;
            if (_cursor.isNull(0)) {
              _item = null;
            } else {
              _item = _cursor.getString(0);
            }
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

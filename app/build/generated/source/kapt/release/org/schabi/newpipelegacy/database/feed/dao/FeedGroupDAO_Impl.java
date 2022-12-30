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
import java.lang.Class;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import org.schabi.newpipelegacy.database.Converters;
import org.schabi.newpipelegacy.database.feed.model.FeedGroupEntity;
import org.schabi.newpipelegacy.database.feed.model.FeedGroupSubscriptionEntity;
import org.schabi.newpipelegacy.local.subscription.FeedGroupIcon;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class FeedGroupDAO_Impl extends FeedGroupDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<FeedGroupSubscriptionEntity> __insertionAdapterOfFeedGroupSubscriptionEntity;

  private final EntityInsertionAdapter<FeedGroupEntity> __insertionAdapterOfFeedGroupEntity;

  private final EntityDeletionOrUpdateAdapter<FeedGroupEntity> __updateAdapterOfFeedGroupEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  private final SharedSQLiteStatement __preparedStmtOfDeleteSubscriptionsFromGroup;

  private final SharedSQLiteStatement __preparedStmtOfUpdateOrder;

  public FeedGroupDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFeedGroupSubscriptionEntity = new EntityInsertionAdapter<FeedGroupSubscriptionEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `feed_group_subscription_join` (`group_id`,`subscription_id`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FeedGroupSubscriptionEntity value) {
        stmt.bindLong(1, value.getFeedGroupId());
        stmt.bindLong(2, value.getSubscriptionId());
      }
    };
    this.__insertionAdapterOfFeedGroupEntity = new EntityInsertionAdapter<FeedGroupEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `feed_group` (`uid`,`name`,`icon_id`,`sort_order`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FeedGroupEntity value) {
        stmt.bindLong(1, value.getUid());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        final int _tmp = Converters.INSTANCE.integerOf(value.getIcon());
        stmt.bindLong(3, _tmp);
        stmt.bindLong(4, value.getSortOrder());
      }
    };
    this.__updateAdapterOfFeedGroupEntity = new EntityDeletionOrUpdateAdapter<FeedGroupEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR IGNORE `feed_group` SET `uid` = ?,`name` = ?,`icon_id` = ?,`sort_order` = ? WHERE `uid` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FeedGroupEntity value) {
        stmt.bindLong(1, value.getUid());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        final int _tmp = Converters.INSTANCE.integerOf(value.getIcon());
        stmt.bindLong(3, _tmp);
        stmt.bindLong(4, value.getSortOrder());
        stmt.bindLong(5, value.getUid());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM feed_group";
        return _query;
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM feed_group WHERE uid = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteSubscriptionsFromGroup = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM feed_group_subscription_join WHERE group_id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateOrder = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE feed_group SET sort_order = ? WHERE uid = ?";
        return _query;
      }
    };
  }

  @Override
  public List<Long> insertSubscriptionsToGroup(final List<FeedGroupSubscriptionEntity> entities) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      List<Long> _result = __insertionAdapterOfFeedGroupSubscriptionEntity.insertAndReturnIdsList(entities);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  protected long insertInternal(final FeedGroupEntity feedGroupEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfFeedGroupEntity.insertAndReturnId(feedGroupEntity);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int update(final FeedGroupEntity feedGroupEntity) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__updateAdapterOfFeedGroupEntity.handle(feedGroupEntity);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public long insert(final FeedGroupEntity feedGroupEntity) {
    __db.beginTransaction();
    try {
      long _result = FeedGroupDAO_Impl.super.insert(feedGroupEntity);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateSubscriptionsForGroup(final long groupId, final List<Long> subscriptionIds) {
    __db.beginTransaction();
    try {
      FeedGroupDAO_Impl.super.updateSubscriptionsForGroup(groupId, subscriptionIds);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateOrder(final Map<Long, Long> orderMap) {
    __db.beginTransaction();
    try {
      FeedGroupDAO_Impl.super.updateOrder(orderMap);
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
  public int delete(final long groupId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDelete.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, groupId);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfDelete.release(_stmt);
    }
  }

  @Override
  public int deleteSubscriptionsFromGroup(final long groupId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteSubscriptionsFromGroup.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, groupId);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteSubscriptionsFromGroup.release(_stmt);
    }
  }

  @Override
  public int updateOrder(final long groupId, final long sortOrder) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateOrder.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, sortOrder);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, groupId);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateOrder.release(_stmt);
    }
  }

  @Override
  public Flowable<List<FeedGroupEntity>> getAll() {
    final String _sql = "SELECT * FROM feed_group ORDER BY sort_order ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, false, new String[]{"feed_group"}, new Callable<List<FeedGroupEntity>>() {
      @Override
      public List<FeedGroupEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "icon_id");
          final int _cursorIndexOfSortOrder = CursorUtil.getColumnIndexOrThrow(_cursor, "sort_order");
          final List<FeedGroupEntity> _result = new ArrayList<FeedGroupEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final FeedGroupEntity _item;
            final long _tmpUid;
            _tmpUid = _cursor.getLong(_cursorIndexOfUid);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final FeedGroupIcon _tmpIcon;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIcon);
            _tmpIcon = Converters.INSTANCE.feedGroupIconOf(_tmp);
            final long _tmpSortOrder;
            _tmpSortOrder = _cursor.getLong(_cursorIndexOfSortOrder);
            _item = new FeedGroupEntity(_tmpUid,_tmpName,_tmpIcon,_tmpSortOrder);
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
  public Maybe<FeedGroupEntity> getGroup(final long groupId) {
    final String _sql = "SELECT * FROM feed_group WHERE uid = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, groupId);
    return Maybe.fromCallable(new Callable<FeedGroupEntity>() {
      @Override
      public FeedGroupEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "icon_id");
          final int _cursorIndexOfSortOrder = CursorUtil.getColumnIndexOrThrow(_cursor, "sort_order");
          final FeedGroupEntity _result;
          if(_cursor.moveToFirst()) {
            final long _tmpUid;
            _tmpUid = _cursor.getLong(_cursorIndexOfUid);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final FeedGroupIcon _tmpIcon;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIcon);
            _tmpIcon = Converters.INSTANCE.feedGroupIconOf(_tmp);
            final long _tmpSortOrder;
            _tmpSortOrder = _cursor.getLong(_cursorIndexOfSortOrder);
            _result = new FeedGroupEntity(_tmpUid,_tmpName,_tmpIcon,_tmpSortOrder);
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
  public Flowable<List<Long>> getSubscriptionIdsFor(final long groupId) {
    final String _sql = "SELECT subscription_id FROM feed_group_subscription_join WHERE group_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, groupId);
    return RxRoom.createFlowable(__db, false, new String[]{"feed_group_subscription_join"}, new Callable<List<Long>>() {
      @Override
      public List<Long> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final List<Long> _result = new ArrayList<Long>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Long _item;
            if (_cursor.isNull(0)) {
              _item = null;
            } else {
              _item = _cursor.getLong(0);
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
  protected long nextSortOrder() {
    final String _sql = "SELECT IFNULL(MAX(sort_order) + 1, 0) FROM feed_group";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final long _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getLong(0);
      } else {
        _result = 0L;
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

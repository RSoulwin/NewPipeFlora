package org.schabi.newpipelegacy.database.subscription;

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
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class SubscriptionDAO_Impl extends SubscriptionDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<SubscriptionEntity> __insertionAdapterOfSubscriptionEntity;

  private final EntityInsertionAdapter<SubscriptionEntity> __insertionAdapterOfSubscriptionEntity_1;

  private final EntityDeletionOrUpdateAdapter<SubscriptionEntity> __deletionAdapterOfSubscriptionEntity;

  private final EntityDeletionOrUpdateAdapter<SubscriptionEntity> __updateAdapterOfSubscriptionEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  private final SharedSQLiteStatement __preparedStmtOfDeleteSubscription;

  public SubscriptionDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSubscriptionEntity = new EntityInsertionAdapter<SubscriptionEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `subscriptions` (`uid`,`service_id`,`url`,`name`,`avatar_url`,`subscriber_count`,`description`,`notification_mode`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SubscriptionEntity value) {
        stmt.bindLong(1, value.getUid());
        stmt.bindLong(2, value.getServiceId());
        if (value.getUrl() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getUrl());
        }
        if (value.getName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getName());
        }
        if (value.getAvatarUrl() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getAvatarUrl());
        }
        if (value.getSubscriberCount() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getSubscriberCount());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getDescription());
        }
        stmt.bindLong(8, value.getNotificationMode());
      }
    };
    this.__insertionAdapterOfSubscriptionEntity_1 = new EntityInsertionAdapter<SubscriptionEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `subscriptions` (`uid`,`service_id`,`url`,`name`,`avatar_url`,`subscriber_count`,`description`,`notification_mode`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SubscriptionEntity value) {
        stmt.bindLong(1, value.getUid());
        stmt.bindLong(2, value.getServiceId());
        if (value.getUrl() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getUrl());
        }
        if (value.getName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getName());
        }
        if (value.getAvatarUrl() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getAvatarUrl());
        }
        if (value.getSubscriberCount() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getSubscriberCount());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getDescription());
        }
        stmt.bindLong(8, value.getNotificationMode());
      }
    };
    this.__deletionAdapterOfSubscriptionEntity = new EntityDeletionOrUpdateAdapter<SubscriptionEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `subscriptions` WHERE `uid` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SubscriptionEntity value) {
        stmt.bindLong(1, value.getUid());
      }
    };
    this.__updateAdapterOfSubscriptionEntity = new EntityDeletionOrUpdateAdapter<SubscriptionEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `subscriptions` SET `uid` = ?,`service_id` = ?,`url` = ?,`name` = ?,`avatar_url` = ?,`subscriber_count` = ?,`description` = ?,`notification_mode` = ? WHERE `uid` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SubscriptionEntity value) {
        stmt.bindLong(1, value.getUid());
        stmt.bindLong(2, value.getServiceId());
        if (value.getUrl() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getUrl());
        }
        if (value.getName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getName());
        }
        if (value.getAvatarUrl() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getAvatarUrl());
        }
        if (value.getSubscriberCount() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getSubscriberCount());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getDescription());
        }
        stmt.bindLong(8, value.getNotificationMode());
        stmt.bindLong(9, value.getUid());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM subscriptions";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteSubscription = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM subscriptions WHERE url LIKE ? AND service_id = ?";
        return _query;
      }
    };
  }

  @Override
  public long insert(final SubscriptionEntity entity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfSubscriptionEntity.insertAndReturnId(entity);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Long> insertAll(final SubscriptionEntity... entities) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      List<Long> _result = __insertionAdapterOfSubscriptionEntity.insertAndReturnIdsList(entities);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Long> insertAll(final Collection<SubscriptionEntity> entities) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      List<Long> _result = __insertionAdapterOfSubscriptionEntity.insertAndReturnIdsList(entities);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Long> silentInsertAllInternal$app_release(
      final List<? extends SubscriptionEntity> entities) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      List<Long> _result = __insertionAdapterOfSubscriptionEntity_1.insertAndReturnIdsList(entities);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final SubscriptionEntity entity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfSubscriptionEntity.handle(entity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int delete(final Collection<SubscriptionEntity> entities) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__deletionAdapterOfSubscriptionEntity.handleMultiple(entities);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int update(final SubscriptionEntity entity) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__updateAdapterOfSubscriptionEntity.handle(entity);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final Collection<SubscriptionEntity> entities) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfSubscriptionEntity.handleMultiple(entities);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<SubscriptionEntity> upsertAll(final List<? extends SubscriptionEntity> entities) {
    __db.beginTransaction();
    try {
      List<SubscriptionEntity> _result = SubscriptionDAO_Impl.super.upsertAll(entities);
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
  public int deleteSubscription(final int serviceId, final String url) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteSubscription.acquire();
    int _argIndex = 1;
    if (url == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, url);
    }
    _argIndex = 2;
    _stmt.bindLong(_argIndex, serviceId);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteSubscription.release(_stmt);
    }
  }

  @Override
  public Flowable<List<SubscriptionEntity>> getAll() {
    final String _sql = "SELECT * FROM subscriptions ORDER BY name COLLATE NOCASE ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, false, new String[]{"subscriptions"}, new Callable<List<SubscriptionEntity>>() {
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
  public Flowable<List<SubscriptionEntity>> listByService(final int serviceId) {
    final String _sql = "SELECT * FROM subscriptions WHERE service_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, serviceId);
    return RxRoom.createFlowable(__db, false, new String[]{"subscriptions"}, new Callable<List<SubscriptionEntity>>() {
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
  public Flowable<Long> rowCount() {
    final String _sql = "SELECT COUNT(*) FROM subscriptions";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, false, new String[]{"subscriptions"}, new Callable<Long>() {
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
  public Flowable<List<SubscriptionEntity>> getSubscriptionsFiltered(final String filter) {
    final String _sql = "\n"
            + "        SELECT * FROM subscriptions\n"
            + "\n"
            + "        WHERE name LIKE '%' || ? || '%'\n"
            + "\n"
            + "        ORDER BY name COLLATE NOCASE ASC\n"
            + "        ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (filter == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, filter);
    }
    return RxRoom.createFlowable(__db, false, new String[]{"subscriptions"}, new Callable<List<SubscriptionEntity>>() {
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
  public Flowable<List<SubscriptionEntity>> getSubscriptionsOnlyUngrouped(
      final long currentGroupId) {
    final String _sql = "SELECT `uid`, `service_id`, `url`, `name`, `avatar_url`, `subscriber_count`, `description`, `notification_mode` FROM (\n"
            + "        SELECT * FROM subscriptions s\n"
            + "\n"
            + "        LEFT JOIN feed_group_subscription_join fgs\n"
            + "        ON s.uid = fgs.subscription_id\n"
            + "\n"
            + "        WHERE (fgs.subscription_id IS NULL OR fgs.group_id = ?)\n"
            + "\n"
            + "        ORDER BY name COLLATE NOCASE ASC\n"
            + "        )";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, currentGroupId);
    return RxRoom.createFlowable(__db, false, new String[]{"subscriptions","feed_group_subscription_join"}, new Callable<List<SubscriptionEntity>>() {
      @Override
      public List<SubscriptionEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUid = 0;
          final int _cursorIndexOfServiceId = 1;
          final int _cursorIndexOfUrl = 2;
          final int _cursorIndexOfName = 3;
          final int _cursorIndexOfAvatarUrl = 4;
          final int _cursorIndexOfSubscriberCount = 5;
          final int _cursorIndexOfDescription = 6;
          final int _cursorIndexOfNotificationMode = 7;
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
  public Flowable<List<SubscriptionEntity>> getSubscriptionsOnlyUngroupedFiltered(
      final long currentGroupId, final String filter) {
    final String _sql = "SELECT `uid`, `service_id`, `url`, `name`, `avatar_url`, `subscriber_count`, `description`, `notification_mode` FROM (\n"
            + "        SELECT * FROM subscriptions s\n"
            + "\n"
            + "        LEFT JOIN feed_group_subscription_join fgs\n"
            + "        ON s.uid = fgs.subscription_id\n"
            + "\n"
            + "        WHERE (fgs.subscription_id IS NULL OR fgs.group_id = ?)\n"
            + "        AND s.name LIKE '%' || ? || '%'\n"
            + "\n"
            + "        ORDER BY name COLLATE NOCASE ASC\n"
            + "        )";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, currentGroupId);
    _argIndex = 2;
    if (filter == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, filter);
    }
    return RxRoom.createFlowable(__db, false, new String[]{"subscriptions","feed_group_subscription_join"}, new Callable<List<SubscriptionEntity>>() {
      @Override
      public List<SubscriptionEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUid = 0;
          final int _cursorIndexOfServiceId = 1;
          final int _cursorIndexOfUrl = 2;
          final int _cursorIndexOfName = 3;
          final int _cursorIndexOfAvatarUrl = 4;
          final int _cursorIndexOfSubscriberCount = 5;
          final int _cursorIndexOfDescription = 6;
          final int _cursorIndexOfNotificationMode = 7;
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
  public Flowable<List<SubscriptionEntity>> getSubscriptionFlowable(final int serviceId,
      final String url) {
    final String _sql = "SELECT * FROM subscriptions WHERE url LIKE ? AND service_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (url == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, url);
    }
    _argIndex = 2;
    _statement.bindLong(_argIndex, serviceId);
    return RxRoom.createFlowable(__db, false, new String[]{"subscriptions"}, new Callable<List<SubscriptionEntity>>() {
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
  public Maybe<SubscriptionEntity> getSubscription(final int serviceId, final String url) {
    final String _sql = "SELECT * FROM subscriptions WHERE url LIKE ? AND service_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (url == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, url);
    }
    _argIndex = 2;
    _statement.bindLong(_argIndex, serviceId);
    return Maybe.fromCallable(new Callable<SubscriptionEntity>() {
      @Override
      public SubscriptionEntity call() throws Exception {
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
          final SubscriptionEntity _result;
          if(_cursor.moveToFirst()) {
            _result = new SubscriptionEntity();
            final long _tmpUid;
            _tmpUid = _cursor.getLong(_cursorIndexOfUid);
            _result.setUid(_tmpUid);
            final int _tmpServiceId;
            _tmpServiceId = _cursor.getInt(_cursorIndexOfServiceId);
            _result.setServiceId(_tmpServiceId);
            final String _tmpUrl;
            if (_cursor.isNull(_cursorIndexOfUrl)) {
              _tmpUrl = null;
            } else {
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            }
            _result.setUrl(_tmpUrl);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            _result.setName(_tmpName);
            final String _tmpAvatarUrl;
            if (_cursor.isNull(_cursorIndexOfAvatarUrl)) {
              _tmpAvatarUrl = null;
            } else {
              _tmpAvatarUrl = _cursor.getString(_cursorIndexOfAvatarUrl);
            }
            _result.setAvatarUrl(_tmpAvatarUrl);
            final Long _tmpSubscriberCount;
            if (_cursor.isNull(_cursorIndexOfSubscriberCount)) {
              _tmpSubscriberCount = null;
            } else {
              _tmpSubscriberCount = _cursor.getLong(_cursorIndexOfSubscriberCount);
            }
            _result.setSubscriberCount(_tmpSubscriberCount);
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            _result.setDescription(_tmpDescription);
            final int _tmpNotificationMode;
            _tmpNotificationMode = _cursor.getInt(_cursorIndexOfNotificationMode);
            _result.setNotificationMode(_tmpNotificationMode);
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
  public SubscriptionEntity getSubscription(final long subscriptionId) {
    final String _sql = "SELECT * FROM subscriptions WHERE uid = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, subscriptionId);
    __db.assertNotSuspendingTransaction();
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
      final SubscriptionEntity _result;
      if(_cursor.moveToFirst()) {
        _result = new SubscriptionEntity();
        final long _tmpUid;
        _tmpUid = _cursor.getLong(_cursorIndexOfUid);
        _result.setUid(_tmpUid);
        final int _tmpServiceId;
        _tmpServiceId = _cursor.getInt(_cursorIndexOfServiceId);
        _result.setServiceId(_tmpServiceId);
        final String _tmpUrl;
        if (_cursor.isNull(_cursorIndexOfUrl)) {
          _tmpUrl = null;
        } else {
          _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
        }
        _result.setUrl(_tmpUrl);
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        _result.setName(_tmpName);
        final String _tmpAvatarUrl;
        if (_cursor.isNull(_cursorIndexOfAvatarUrl)) {
          _tmpAvatarUrl = null;
        } else {
          _tmpAvatarUrl = _cursor.getString(_cursorIndexOfAvatarUrl);
        }
        _result.setAvatarUrl(_tmpAvatarUrl);
        final Long _tmpSubscriberCount;
        if (_cursor.isNull(_cursorIndexOfSubscriberCount)) {
          _tmpSubscriberCount = null;
        } else {
          _tmpSubscriberCount = _cursor.getLong(_cursorIndexOfSubscriberCount);
        }
        _result.setSubscriberCount(_tmpSubscriberCount);
        final String _tmpDescription;
        if (_cursor.isNull(_cursorIndexOfDescription)) {
          _tmpDescription = null;
        } else {
          _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        }
        _result.setDescription(_tmpDescription);
        final int _tmpNotificationMode;
        _tmpNotificationMode = _cursor.getInt(_cursorIndexOfNotificationMode);
        _result.setNotificationMode(_tmpNotificationMode);
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
  public Long getSubscriptionIdInternal$app_release(final int serviceId, final String url) {
    final String _sql = "SELECT uid FROM subscriptions WHERE url LIKE ? AND service_id = ?";
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

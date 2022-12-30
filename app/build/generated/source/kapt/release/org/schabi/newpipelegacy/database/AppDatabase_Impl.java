package org.schabi.newpipelegacy.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.schabi.newpipelegacy.database.feed.dao.FeedDAO;
import org.schabi.newpipelegacy.database.feed.dao.FeedDAO_Impl;
import org.schabi.newpipelegacy.database.feed.dao.FeedGroupDAO;
import org.schabi.newpipelegacy.database.feed.dao.FeedGroupDAO_Impl;
import org.schabi.newpipelegacy.database.history.dao.SearchHistoryDAO;
import org.schabi.newpipelegacy.database.history.dao.SearchHistoryDAO_Impl;
import org.schabi.newpipelegacy.database.history.dao.StreamHistoryDAO;
import org.schabi.newpipelegacy.database.history.dao.StreamHistoryDAO_Impl;
import org.schabi.newpipelegacy.database.playlist.dao.PlaylistDAO;
import org.schabi.newpipelegacy.database.playlist.dao.PlaylistDAO_Impl;
import org.schabi.newpipelegacy.database.playlist.dao.PlaylistRemoteDAO;
import org.schabi.newpipelegacy.database.playlist.dao.PlaylistRemoteDAO_Impl;
import org.schabi.newpipelegacy.database.playlist.dao.PlaylistStreamDAO;
import org.schabi.newpipelegacy.database.playlist.dao.PlaylistStreamDAO_Impl;
import org.schabi.newpipelegacy.database.stream.dao.StreamDAO;
import org.schabi.newpipelegacy.database.stream.dao.StreamDAO_Impl;
import org.schabi.newpipelegacy.database.stream.dao.StreamStateDAO;
import org.schabi.newpipelegacy.database.stream.dao.StreamStateDAO_Impl;
import org.schabi.newpipelegacy.database.subscription.SubscriptionDAO;
import org.schabi.newpipelegacy.database.subscription.SubscriptionDAO_Impl;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile SearchHistoryDAO _searchHistoryDAO;

  private volatile StreamDAO _streamDAO;

  private volatile StreamHistoryDAO _streamHistoryDAO;

  private volatile StreamStateDAO _streamStateDAO;

  private volatile PlaylistDAO _playlistDAO;

  private volatile PlaylistStreamDAO _playlistStreamDAO;

  private volatile PlaylistRemoteDAO _playlistRemoteDAO;

  private volatile FeedDAO _feedDAO;

  private volatile FeedGroupDAO _feedGroupDAO;

  private volatile SubscriptionDAO _subscriptionDAO;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(5) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `subscriptions` (`uid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `service_id` INTEGER NOT NULL, `url` TEXT, `name` TEXT, `avatar_url` TEXT, `subscriber_count` INTEGER, `description` TEXT, `notification_mode` INTEGER NOT NULL)");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_subscriptions_service_id_url` ON `subscriptions` (`service_id`, `url`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `search_history` (`creation_date` INTEGER, `service_id` INTEGER NOT NULL, `search` TEXT, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_search_history_search` ON `search_history` (`search`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `streams` (`uid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `service_id` INTEGER NOT NULL, `url` TEXT NOT NULL, `title` TEXT NOT NULL, `stream_type` TEXT NOT NULL, `duration` INTEGER NOT NULL, `uploader` TEXT NOT NULL, `uploader_url` TEXT, `thumbnail_url` TEXT, `view_count` INTEGER, `textual_upload_date` TEXT, `upload_date` INTEGER, `is_upload_date_approximation` INTEGER)");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_streams_service_id_url` ON `streams` (`service_id`, `url`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `stream_history` (`stream_id` INTEGER NOT NULL, `access_date` INTEGER NOT NULL, `repeat_count` INTEGER NOT NULL, PRIMARY KEY(`stream_id`, `access_date`), FOREIGN KEY(`stream_id`) REFERENCES `streams`(`uid`) ON UPDATE CASCADE ON DELETE CASCADE )");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_stream_history_stream_id` ON `stream_history` (`stream_id`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `stream_state` (`stream_id` INTEGER NOT NULL, `progress_time` INTEGER NOT NULL, PRIMARY KEY(`stream_id`), FOREIGN KEY(`stream_id`) REFERENCES `streams`(`uid`) ON UPDATE CASCADE ON DELETE CASCADE )");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `playlists` (`uid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT, `thumbnail_url` TEXT)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_playlists_name` ON `playlists` (`name`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `playlist_stream_join` (`playlist_id` INTEGER NOT NULL, `stream_id` INTEGER NOT NULL, `join_index` INTEGER NOT NULL, PRIMARY KEY(`playlist_id`, `join_index`), FOREIGN KEY(`playlist_id`) REFERENCES `playlists`(`uid`) ON UPDATE CASCADE ON DELETE CASCADE DEFERRABLE INITIALLY DEFERRED, FOREIGN KEY(`stream_id`) REFERENCES `streams`(`uid`) ON UPDATE CASCADE ON DELETE CASCADE DEFERRABLE INITIALLY DEFERRED)");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_playlist_stream_join_playlist_id_join_index` ON `playlist_stream_join` (`playlist_id`, `join_index`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_playlist_stream_join_stream_id` ON `playlist_stream_join` (`stream_id`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `remote_playlists` (`uid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `service_id` INTEGER NOT NULL, `name` TEXT, `url` TEXT, `thumbnail_url` TEXT, `uploader` TEXT, `stream_count` INTEGER)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_remote_playlists_name` ON `remote_playlists` (`name`)");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_remote_playlists_service_id_url` ON `remote_playlists` (`service_id`, `url`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `feed` (`stream_id` INTEGER NOT NULL, `subscription_id` INTEGER NOT NULL, PRIMARY KEY(`stream_id`, `subscription_id`), FOREIGN KEY(`stream_id`) REFERENCES `streams`(`uid`) ON UPDATE CASCADE ON DELETE CASCADE DEFERRABLE INITIALLY DEFERRED, FOREIGN KEY(`subscription_id`) REFERENCES `subscriptions`(`uid`) ON UPDATE CASCADE ON DELETE CASCADE DEFERRABLE INITIALLY DEFERRED)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_feed_subscription_id` ON `feed` (`subscription_id`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `feed_group` (`uid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `icon_id` INTEGER NOT NULL, `sort_order` INTEGER NOT NULL)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_feed_group_sort_order` ON `feed_group` (`sort_order`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `feed_group_subscription_join` (`group_id` INTEGER NOT NULL, `subscription_id` INTEGER NOT NULL, PRIMARY KEY(`group_id`, `subscription_id`), FOREIGN KEY(`group_id`) REFERENCES `feed_group`(`uid`) ON UPDATE CASCADE ON DELETE CASCADE DEFERRABLE INITIALLY DEFERRED, FOREIGN KEY(`subscription_id`) REFERENCES `subscriptions`(`uid`) ON UPDATE CASCADE ON DELETE CASCADE DEFERRABLE INITIALLY DEFERRED)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_feed_group_subscription_join_subscription_id` ON `feed_group_subscription_join` (`subscription_id`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `feed_last_updated` (`subscription_id` INTEGER NOT NULL, `last_updated` INTEGER, PRIMARY KEY(`subscription_id`), FOREIGN KEY(`subscription_id`) REFERENCES `subscriptions`(`uid`) ON UPDATE CASCADE ON DELETE CASCADE DEFERRABLE INITIALLY DEFERRED)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '096731b513bb71dd44517639f4a2c1e3')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `subscriptions`");
        _db.execSQL("DROP TABLE IF EXISTS `search_history`");
        _db.execSQL("DROP TABLE IF EXISTS `streams`");
        _db.execSQL("DROP TABLE IF EXISTS `stream_history`");
        _db.execSQL("DROP TABLE IF EXISTS `stream_state`");
        _db.execSQL("DROP TABLE IF EXISTS `playlists`");
        _db.execSQL("DROP TABLE IF EXISTS `playlist_stream_join`");
        _db.execSQL("DROP TABLE IF EXISTS `remote_playlists`");
        _db.execSQL("DROP TABLE IF EXISTS `feed`");
        _db.execSQL("DROP TABLE IF EXISTS `feed_group`");
        _db.execSQL("DROP TABLE IF EXISTS `feed_group_subscription_join`");
        _db.execSQL("DROP TABLE IF EXISTS `feed_last_updated`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        _db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsSubscriptions = new HashMap<String, TableInfo.Column>(8);
        _columnsSubscriptions.put("uid", new TableInfo.Column("uid", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubscriptions.put("service_id", new TableInfo.Column("service_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubscriptions.put("url", new TableInfo.Column("url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubscriptions.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubscriptions.put("avatar_url", new TableInfo.Column("avatar_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubscriptions.put("subscriber_count", new TableInfo.Column("subscriber_count", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubscriptions.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubscriptions.put("notification_mode", new TableInfo.Column("notification_mode", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSubscriptions = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSubscriptions = new HashSet<TableInfo.Index>(1);
        _indicesSubscriptions.add(new TableInfo.Index("index_subscriptions_service_id_url", true, Arrays.asList("service_id","url"), Arrays.asList("ASC","ASC")));
        final TableInfo _infoSubscriptions = new TableInfo("subscriptions", _columnsSubscriptions, _foreignKeysSubscriptions, _indicesSubscriptions);
        final TableInfo _existingSubscriptions = TableInfo.read(_db, "subscriptions");
        if (! _infoSubscriptions.equals(_existingSubscriptions)) {
          return new RoomOpenHelper.ValidationResult(false, "subscriptions(org.schabi.newpipelegacy.database.subscription.SubscriptionEntity).\n"
                  + " Expected:\n" + _infoSubscriptions + "\n"
                  + " Found:\n" + _existingSubscriptions);
        }
        final HashMap<String, TableInfo.Column> _columnsSearchHistory = new HashMap<String, TableInfo.Column>(4);
        _columnsSearchHistory.put("creation_date", new TableInfo.Column("creation_date", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSearchHistory.put("service_id", new TableInfo.Column("service_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSearchHistory.put("search", new TableInfo.Column("search", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSearchHistory.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSearchHistory = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSearchHistory = new HashSet<TableInfo.Index>(1);
        _indicesSearchHistory.add(new TableInfo.Index("index_search_history_search", false, Arrays.asList("search"), Arrays.asList("ASC")));
        final TableInfo _infoSearchHistory = new TableInfo("search_history", _columnsSearchHistory, _foreignKeysSearchHistory, _indicesSearchHistory);
        final TableInfo _existingSearchHistory = TableInfo.read(_db, "search_history");
        if (! _infoSearchHistory.equals(_existingSearchHistory)) {
          return new RoomOpenHelper.ValidationResult(false, "search_history(org.schabi.newpipelegacy.database.history.model.SearchHistoryEntry).\n"
                  + " Expected:\n" + _infoSearchHistory + "\n"
                  + " Found:\n" + _existingSearchHistory);
        }
        final HashMap<String, TableInfo.Column> _columnsStreams = new HashMap<String, TableInfo.Column>(13);
        _columnsStreams.put("uid", new TableInfo.Column("uid", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStreams.put("service_id", new TableInfo.Column("service_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStreams.put("url", new TableInfo.Column("url", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStreams.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStreams.put("stream_type", new TableInfo.Column("stream_type", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStreams.put("duration", new TableInfo.Column("duration", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStreams.put("uploader", new TableInfo.Column("uploader", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStreams.put("uploader_url", new TableInfo.Column("uploader_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStreams.put("thumbnail_url", new TableInfo.Column("thumbnail_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStreams.put("view_count", new TableInfo.Column("view_count", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStreams.put("textual_upload_date", new TableInfo.Column("textual_upload_date", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStreams.put("upload_date", new TableInfo.Column("upload_date", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStreams.put("is_upload_date_approximation", new TableInfo.Column("is_upload_date_approximation", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysStreams = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesStreams = new HashSet<TableInfo.Index>(1);
        _indicesStreams.add(new TableInfo.Index("index_streams_service_id_url", true, Arrays.asList("service_id","url"), Arrays.asList("ASC","ASC")));
        final TableInfo _infoStreams = new TableInfo("streams", _columnsStreams, _foreignKeysStreams, _indicesStreams);
        final TableInfo _existingStreams = TableInfo.read(_db, "streams");
        if (! _infoStreams.equals(_existingStreams)) {
          return new RoomOpenHelper.ValidationResult(false, "streams(org.schabi.newpipelegacy.database.stream.model.StreamEntity).\n"
                  + " Expected:\n" + _infoStreams + "\n"
                  + " Found:\n" + _existingStreams);
        }
        final HashMap<String, TableInfo.Column> _columnsStreamHistory = new HashMap<String, TableInfo.Column>(3);
        _columnsStreamHistory.put("stream_id", new TableInfo.Column("stream_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStreamHistory.put("access_date", new TableInfo.Column("access_date", "INTEGER", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStreamHistory.put("repeat_count", new TableInfo.Column("repeat_count", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysStreamHistory = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysStreamHistory.add(new TableInfo.ForeignKey("streams", "CASCADE", "CASCADE",Arrays.asList("stream_id"), Arrays.asList("uid")));
        final HashSet<TableInfo.Index> _indicesStreamHistory = new HashSet<TableInfo.Index>(1);
        _indicesStreamHistory.add(new TableInfo.Index("index_stream_history_stream_id", false, Arrays.asList("stream_id"), Arrays.asList("ASC")));
        final TableInfo _infoStreamHistory = new TableInfo("stream_history", _columnsStreamHistory, _foreignKeysStreamHistory, _indicesStreamHistory);
        final TableInfo _existingStreamHistory = TableInfo.read(_db, "stream_history");
        if (! _infoStreamHistory.equals(_existingStreamHistory)) {
          return new RoomOpenHelper.ValidationResult(false, "stream_history(org.schabi.newpipelegacy.database.history.model.StreamHistoryEntity).\n"
                  + " Expected:\n" + _infoStreamHistory + "\n"
                  + " Found:\n" + _existingStreamHistory);
        }
        final HashMap<String, TableInfo.Column> _columnsStreamState = new HashMap<String, TableInfo.Column>(2);
        _columnsStreamState.put("stream_id", new TableInfo.Column("stream_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStreamState.put("progress_time", new TableInfo.Column("progress_time", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysStreamState = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysStreamState.add(new TableInfo.ForeignKey("streams", "CASCADE", "CASCADE",Arrays.asList("stream_id"), Arrays.asList("uid")));
        final HashSet<TableInfo.Index> _indicesStreamState = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoStreamState = new TableInfo("stream_state", _columnsStreamState, _foreignKeysStreamState, _indicesStreamState);
        final TableInfo _existingStreamState = TableInfo.read(_db, "stream_state");
        if (! _infoStreamState.equals(_existingStreamState)) {
          return new RoomOpenHelper.ValidationResult(false, "stream_state(org.schabi.newpipelegacy.database.stream.model.StreamStateEntity).\n"
                  + " Expected:\n" + _infoStreamState + "\n"
                  + " Found:\n" + _existingStreamState);
        }
        final HashMap<String, TableInfo.Column> _columnsPlaylists = new HashMap<String, TableInfo.Column>(3);
        _columnsPlaylists.put("uid", new TableInfo.Column("uid", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlaylists.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlaylists.put("thumbnail_url", new TableInfo.Column("thumbnail_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPlaylists = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPlaylists = new HashSet<TableInfo.Index>(1);
        _indicesPlaylists.add(new TableInfo.Index("index_playlists_name", false, Arrays.asList("name"), Arrays.asList("ASC")));
        final TableInfo _infoPlaylists = new TableInfo("playlists", _columnsPlaylists, _foreignKeysPlaylists, _indicesPlaylists);
        final TableInfo _existingPlaylists = TableInfo.read(_db, "playlists");
        if (! _infoPlaylists.equals(_existingPlaylists)) {
          return new RoomOpenHelper.ValidationResult(false, "playlists(org.schabi.newpipelegacy.database.playlist.model.PlaylistEntity).\n"
                  + " Expected:\n" + _infoPlaylists + "\n"
                  + " Found:\n" + _existingPlaylists);
        }
        final HashMap<String, TableInfo.Column> _columnsPlaylistStreamJoin = new HashMap<String, TableInfo.Column>(3);
        _columnsPlaylistStreamJoin.put("playlist_id", new TableInfo.Column("playlist_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlaylistStreamJoin.put("stream_id", new TableInfo.Column("stream_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlaylistStreamJoin.put("join_index", new TableInfo.Column("join_index", "INTEGER", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPlaylistStreamJoin = new HashSet<TableInfo.ForeignKey>(2);
        _foreignKeysPlaylistStreamJoin.add(new TableInfo.ForeignKey("playlists", "CASCADE", "CASCADE",Arrays.asList("playlist_id"), Arrays.asList("uid")));
        _foreignKeysPlaylistStreamJoin.add(new TableInfo.ForeignKey("streams", "CASCADE", "CASCADE",Arrays.asList("stream_id"), Arrays.asList("uid")));
        final HashSet<TableInfo.Index> _indicesPlaylistStreamJoin = new HashSet<TableInfo.Index>(2);
        _indicesPlaylistStreamJoin.add(new TableInfo.Index("index_playlist_stream_join_playlist_id_join_index", true, Arrays.asList("playlist_id","join_index"), Arrays.asList("ASC","ASC")));
        _indicesPlaylistStreamJoin.add(new TableInfo.Index("index_playlist_stream_join_stream_id", false, Arrays.asList("stream_id"), Arrays.asList("ASC")));
        final TableInfo _infoPlaylistStreamJoin = new TableInfo("playlist_stream_join", _columnsPlaylistStreamJoin, _foreignKeysPlaylistStreamJoin, _indicesPlaylistStreamJoin);
        final TableInfo _existingPlaylistStreamJoin = TableInfo.read(_db, "playlist_stream_join");
        if (! _infoPlaylistStreamJoin.equals(_existingPlaylistStreamJoin)) {
          return new RoomOpenHelper.ValidationResult(false, "playlist_stream_join(org.schabi.newpipelegacy.database.playlist.model.PlaylistStreamEntity).\n"
                  + " Expected:\n" + _infoPlaylistStreamJoin + "\n"
                  + " Found:\n" + _existingPlaylistStreamJoin);
        }
        final HashMap<String, TableInfo.Column> _columnsRemotePlaylists = new HashMap<String, TableInfo.Column>(7);
        _columnsRemotePlaylists.put("uid", new TableInfo.Column("uid", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRemotePlaylists.put("service_id", new TableInfo.Column("service_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRemotePlaylists.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRemotePlaylists.put("url", new TableInfo.Column("url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRemotePlaylists.put("thumbnail_url", new TableInfo.Column("thumbnail_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRemotePlaylists.put("uploader", new TableInfo.Column("uploader", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRemotePlaylists.put("stream_count", new TableInfo.Column("stream_count", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRemotePlaylists = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRemotePlaylists = new HashSet<TableInfo.Index>(2);
        _indicesRemotePlaylists.add(new TableInfo.Index("index_remote_playlists_name", false, Arrays.asList("name"), Arrays.asList("ASC")));
        _indicesRemotePlaylists.add(new TableInfo.Index("index_remote_playlists_service_id_url", true, Arrays.asList("service_id","url"), Arrays.asList("ASC","ASC")));
        final TableInfo _infoRemotePlaylists = new TableInfo("remote_playlists", _columnsRemotePlaylists, _foreignKeysRemotePlaylists, _indicesRemotePlaylists);
        final TableInfo _existingRemotePlaylists = TableInfo.read(_db, "remote_playlists");
        if (! _infoRemotePlaylists.equals(_existingRemotePlaylists)) {
          return new RoomOpenHelper.ValidationResult(false, "remote_playlists(org.schabi.newpipelegacy.database.playlist.model.PlaylistRemoteEntity).\n"
                  + " Expected:\n" + _infoRemotePlaylists + "\n"
                  + " Found:\n" + _existingRemotePlaylists);
        }
        final HashMap<String, TableInfo.Column> _columnsFeed = new HashMap<String, TableInfo.Column>(2);
        _columnsFeed.put("stream_id", new TableInfo.Column("stream_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFeed.put("subscription_id", new TableInfo.Column("subscription_id", "INTEGER", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFeed = new HashSet<TableInfo.ForeignKey>(2);
        _foreignKeysFeed.add(new TableInfo.ForeignKey("streams", "CASCADE", "CASCADE",Arrays.asList("stream_id"), Arrays.asList("uid")));
        _foreignKeysFeed.add(new TableInfo.ForeignKey("subscriptions", "CASCADE", "CASCADE",Arrays.asList("subscription_id"), Arrays.asList("uid")));
        final HashSet<TableInfo.Index> _indicesFeed = new HashSet<TableInfo.Index>(1);
        _indicesFeed.add(new TableInfo.Index("index_feed_subscription_id", false, Arrays.asList("subscription_id"), Arrays.asList("ASC")));
        final TableInfo _infoFeed = new TableInfo("feed", _columnsFeed, _foreignKeysFeed, _indicesFeed);
        final TableInfo _existingFeed = TableInfo.read(_db, "feed");
        if (! _infoFeed.equals(_existingFeed)) {
          return new RoomOpenHelper.ValidationResult(false, "feed(org.schabi.newpipelegacy.database.feed.model.FeedEntity).\n"
                  + " Expected:\n" + _infoFeed + "\n"
                  + " Found:\n" + _existingFeed);
        }
        final HashMap<String, TableInfo.Column> _columnsFeedGroup = new HashMap<String, TableInfo.Column>(4);
        _columnsFeedGroup.put("uid", new TableInfo.Column("uid", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFeedGroup.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFeedGroup.put("icon_id", new TableInfo.Column("icon_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFeedGroup.put("sort_order", new TableInfo.Column("sort_order", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFeedGroup = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFeedGroup = new HashSet<TableInfo.Index>(1);
        _indicesFeedGroup.add(new TableInfo.Index("index_feed_group_sort_order", false, Arrays.asList("sort_order"), Arrays.asList("ASC")));
        final TableInfo _infoFeedGroup = new TableInfo("feed_group", _columnsFeedGroup, _foreignKeysFeedGroup, _indicesFeedGroup);
        final TableInfo _existingFeedGroup = TableInfo.read(_db, "feed_group");
        if (! _infoFeedGroup.equals(_existingFeedGroup)) {
          return new RoomOpenHelper.ValidationResult(false, "feed_group(org.schabi.newpipelegacy.database.feed.model.FeedGroupEntity).\n"
                  + " Expected:\n" + _infoFeedGroup + "\n"
                  + " Found:\n" + _existingFeedGroup);
        }
        final HashMap<String, TableInfo.Column> _columnsFeedGroupSubscriptionJoin = new HashMap<String, TableInfo.Column>(2);
        _columnsFeedGroupSubscriptionJoin.put("group_id", new TableInfo.Column("group_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFeedGroupSubscriptionJoin.put("subscription_id", new TableInfo.Column("subscription_id", "INTEGER", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFeedGroupSubscriptionJoin = new HashSet<TableInfo.ForeignKey>(2);
        _foreignKeysFeedGroupSubscriptionJoin.add(new TableInfo.ForeignKey("feed_group", "CASCADE", "CASCADE",Arrays.asList("group_id"), Arrays.asList("uid")));
        _foreignKeysFeedGroupSubscriptionJoin.add(new TableInfo.ForeignKey("subscriptions", "CASCADE", "CASCADE",Arrays.asList("subscription_id"), Arrays.asList("uid")));
        final HashSet<TableInfo.Index> _indicesFeedGroupSubscriptionJoin = new HashSet<TableInfo.Index>(1);
        _indicesFeedGroupSubscriptionJoin.add(new TableInfo.Index("index_feed_group_subscription_join_subscription_id", false, Arrays.asList("subscription_id"), Arrays.asList("ASC")));
        final TableInfo _infoFeedGroupSubscriptionJoin = new TableInfo("feed_group_subscription_join", _columnsFeedGroupSubscriptionJoin, _foreignKeysFeedGroupSubscriptionJoin, _indicesFeedGroupSubscriptionJoin);
        final TableInfo _existingFeedGroupSubscriptionJoin = TableInfo.read(_db, "feed_group_subscription_join");
        if (! _infoFeedGroupSubscriptionJoin.equals(_existingFeedGroupSubscriptionJoin)) {
          return new RoomOpenHelper.ValidationResult(false, "feed_group_subscription_join(org.schabi.newpipelegacy.database.feed.model.FeedGroupSubscriptionEntity).\n"
                  + " Expected:\n" + _infoFeedGroupSubscriptionJoin + "\n"
                  + " Found:\n" + _existingFeedGroupSubscriptionJoin);
        }
        final HashMap<String, TableInfo.Column> _columnsFeedLastUpdated = new HashMap<String, TableInfo.Column>(2);
        _columnsFeedLastUpdated.put("subscription_id", new TableInfo.Column("subscription_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFeedLastUpdated.put("last_updated", new TableInfo.Column("last_updated", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFeedLastUpdated = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysFeedLastUpdated.add(new TableInfo.ForeignKey("subscriptions", "CASCADE", "CASCADE",Arrays.asList("subscription_id"), Arrays.asList("uid")));
        final HashSet<TableInfo.Index> _indicesFeedLastUpdated = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFeedLastUpdated = new TableInfo("feed_last_updated", _columnsFeedLastUpdated, _foreignKeysFeedLastUpdated, _indicesFeedLastUpdated);
        final TableInfo _existingFeedLastUpdated = TableInfo.read(_db, "feed_last_updated");
        if (! _infoFeedLastUpdated.equals(_existingFeedLastUpdated)) {
          return new RoomOpenHelper.ValidationResult(false, "feed_last_updated(org.schabi.newpipelegacy.database.feed.model.FeedLastUpdatedEntity).\n"
                  + " Expected:\n" + _infoFeedLastUpdated + "\n"
                  + " Found:\n" + _existingFeedLastUpdated);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "096731b513bb71dd44517639f4a2c1e3", "6272a0dcab91fdbb572f6eaac95ced8a");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "subscriptions","search_history","streams","stream_history","stream_state","playlists","playlist_stream_join","remote_playlists","feed","feed_group","feed_group_subscription_join","feed_last_updated");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `subscriptions`");
      _db.execSQL("DELETE FROM `search_history`");
      _db.execSQL("DELETE FROM `streams`");
      _db.execSQL("DELETE FROM `stream_history`");
      _db.execSQL("DELETE FROM `stream_state`");
      _db.execSQL("DELETE FROM `playlists`");
      _db.execSQL("DELETE FROM `playlist_stream_join`");
      _db.execSQL("DELETE FROM `remote_playlists`");
      _db.execSQL("DELETE FROM `feed`");
      _db.execSQL("DELETE FROM `feed_group`");
      _db.execSQL("DELETE FROM `feed_group_subscription_join`");
      _db.execSQL("DELETE FROM `feed_last_updated`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(SearchHistoryDAO.class, SearchHistoryDAO_Impl.getRequiredConverters());
    _typeConvertersMap.put(StreamDAO.class, StreamDAO_Impl.getRequiredConverters());
    _typeConvertersMap.put(StreamHistoryDAO.class, StreamHistoryDAO_Impl.getRequiredConverters());
    _typeConvertersMap.put(StreamStateDAO.class, StreamStateDAO_Impl.getRequiredConverters());
    _typeConvertersMap.put(PlaylistDAO.class, PlaylistDAO_Impl.getRequiredConverters());
    _typeConvertersMap.put(PlaylistStreamDAO.class, PlaylistStreamDAO_Impl.getRequiredConverters());
    _typeConvertersMap.put(PlaylistRemoteDAO.class, PlaylistRemoteDAO_Impl.getRequiredConverters());
    _typeConvertersMap.put(FeedDAO.class, FeedDAO_Impl.getRequiredConverters());
    _typeConvertersMap.put(FeedGroupDAO.class, FeedGroupDAO_Impl.getRequiredConverters());
    _typeConvertersMap.put(SubscriptionDAO.class, SubscriptionDAO_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public SearchHistoryDAO searchHistoryDAO() {
    if (_searchHistoryDAO != null) {
      return _searchHistoryDAO;
    } else {
      synchronized(this) {
        if(_searchHistoryDAO == null) {
          _searchHistoryDAO = new SearchHistoryDAO_Impl(this);
        }
        return _searchHistoryDAO;
      }
    }
  }

  @Override
  public StreamDAO streamDAO() {
    if (_streamDAO != null) {
      return _streamDAO;
    } else {
      synchronized(this) {
        if(_streamDAO == null) {
          _streamDAO = new StreamDAO_Impl(this);
        }
        return _streamDAO;
      }
    }
  }

  @Override
  public StreamHistoryDAO streamHistoryDAO() {
    if (_streamHistoryDAO != null) {
      return _streamHistoryDAO;
    } else {
      synchronized(this) {
        if(_streamHistoryDAO == null) {
          _streamHistoryDAO = new StreamHistoryDAO_Impl(this);
        }
        return _streamHistoryDAO;
      }
    }
  }

  @Override
  public StreamStateDAO streamStateDAO() {
    if (_streamStateDAO != null) {
      return _streamStateDAO;
    } else {
      synchronized(this) {
        if(_streamStateDAO == null) {
          _streamStateDAO = new StreamStateDAO_Impl(this);
        }
        return _streamStateDAO;
      }
    }
  }

  @Override
  public PlaylistDAO playlistDAO() {
    if (_playlistDAO != null) {
      return _playlistDAO;
    } else {
      synchronized(this) {
        if(_playlistDAO == null) {
          _playlistDAO = new PlaylistDAO_Impl(this);
        }
        return _playlistDAO;
      }
    }
  }

  @Override
  public PlaylistStreamDAO playlistStreamDAO() {
    if (_playlistStreamDAO != null) {
      return _playlistStreamDAO;
    } else {
      synchronized(this) {
        if(_playlistStreamDAO == null) {
          _playlistStreamDAO = new PlaylistStreamDAO_Impl(this);
        }
        return _playlistStreamDAO;
      }
    }
  }

  @Override
  public PlaylistRemoteDAO playlistRemoteDAO() {
    if (_playlistRemoteDAO != null) {
      return _playlistRemoteDAO;
    } else {
      synchronized(this) {
        if(_playlistRemoteDAO == null) {
          _playlistRemoteDAO = new PlaylistRemoteDAO_Impl(this);
        }
        return _playlistRemoteDAO;
      }
    }
  }

  @Override
  public FeedDAO feedDAO() {
    if (_feedDAO != null) {
      return _feedDAO;
    } else {
      synchronized(this) {
        if(_feedDAO == null) {
          _feedDAO = new FeedDAO_Impl(this);
        }
        return _feedDAO;
      }
    }
  }

  @Override
  public FeedGroupDAO feedGroupDAO() {
    if (_feedGroupDAO != null) {
      return _feedGroupDAO;
    } else {
      synchronized(this) {
        if(_feedGroupDAO == null) {
          _feedGroupDAO = new FeedGroupDAO_Impl(this);
        }
        return _feedGroupDAO;
      }
    }
  }

  @Override
  public SubscriptionDAO subscriptionDAO() {
    if (_subscriptionDAO != null) {
      return _subscriptionDAO;
    } else {
      synchronized(this) {
        if(_subscriptionDAO == null) {
          _subscriptionDAO = new SubscriptionDAO_Impl(this);
        }
        return _subscriptionDAO;
      }
    }
  }
}

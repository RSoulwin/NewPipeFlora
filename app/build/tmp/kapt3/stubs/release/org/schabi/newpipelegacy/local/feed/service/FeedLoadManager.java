package org.schabi.newpipelegacy.local.feed.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 (2\u00020\u0001:\u0003()*B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0006\u0010\u001c\u001a\u00020\u001bJ\u001a\u0010\u001d\u001a\u0014 \u0016*\t\u0018\u00010\u001e\u00a2\u0006\u0002\b\u00170\u001e\u00a2\u0006\u0002\b\u0017H\u0002J,\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0!0 2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020\'R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R<\u0010\u0013\u001a0\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u0015 \u0016*\u0017\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u0015\u0018\u00010\u0014\u00a2\u0006\u0002\b\u00170\u0014\u00a2\u0006\u0002\b\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lorg/schabi/newpipelegacy/local/feed/service/FeedLoadManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cancelSignal", "Ljava/util/concurrent/atomic/AtomicBoolean;", "currentProgress", "Ljava/util/concurrent/atomic/AtomicInteger;", "feedDatabaseManager", "Lorg/schabi/newpipelegacy/local/feed/FeedDatabaseManager;", "feedResultsHolder", "Lorg/schabi/newpipelegacy/local/feed/service/FeedResultsHolder;", "maxProgress", "notification", "Lio/reactivex/rxjava3/core/Flowable;", "Lorg/schabi/newpipelegacy/local/feed/service/FeedLoadState;", "getNotification", "()Lio/reactivex/rxjava3/core/Flowable;", "notificationUpdater", "Lio/reactivex/rxjava3/processors/PublishProcessor;", "", "kotlin.jvm.PlatformType", "Lio/reactivex/rxjava3/annotations/NonNull;", "subscriptionManager", "Lorg/schabi/newpipelegacy/local/subscription/SubscriptionManager;", "broadcastProgress", "", "cancel", "postProcessFeed", "Lio/reactivex/rxjava3/core/Completable;", "startLoading", "Lio/reactivex/rxjava3/core/Single;", "", "Lio/reactivex/rxjava3/core/Notification;", "Lorg/schabi/newpipelegacy/local/feed/service/FeedUpdateInfo;", "groupId", "", "ignoreOutdatedThreshold", "", "Companion", "DatabaseConsumer", "NotificationConsumer", "app_release"})
public final class FeedLoadManager {
    private final android.content.Context context = null;
    private final org.schabi.newpipelegacy.local.subscription.SubscriptionManager subscriptionManager = null;
    private final org.schabi.newpipelegacy.local.feed.FeedDatabaseManager feedDatabaseManager = null;
    private final io.reactivex.rxjava3.processors.PublishProcessor<java.lang.String> notificationUpdater = null;
    private final java.util.concurrent.atomic.AtomicInteger currentProgress = null;
    private final java.util.concurrent.atomic.AtomicInteger maxProgress = null;
    private final java.util.concurrent.atomic.AtomicBoolean cancelSignal = null;
    private final org.schabi.newpipelegacy.local.feed.service.FeedResultsHolder feedResultsHolder = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.rxjava3.core.Flowable<org.schabi.newpipelegacy.local.feed.service.FeedLoadState> notification = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.schabi.newpipelegacy.local.feed.service.FeedLoadManager.Companion Companion = null;
    
    /**
     * Constant used to check for updates of subscriptions with [NotificationMode.ENABLED].
     */
    public static final long GROUP_NOTIFICATION_ENABLED = -2L;
    
    /**
     * How many extractions will be running in parallel.
     */
    private static final int PARALLEL_EXTRACTIONS = 6;
    
    /**
     * Number of items to buffer to mass-insert in the database.
     */
    private static final int BUFFER_COUNT_BEFORE_INSERT = 20;
    
    public FeedLoadManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Flowable<org.schabi.newpipelegacy.local.feed.service.FeedLoadState> getNotification() {
        return null;
    }
    
    /**
     * Start checking for new streams of a subscription group.
     * @param groupId The ID of the subscription group to load. When using
     * [FeedGroupEntity.GROUP_ALL_ID], all subscriptions are loaded. When using
     * [GROUP_NOTIFICATION_ENABLED], only subscriptions with enabled notifications for new streams
     * are loaded. Using an id of a group created by the user results in that specific group to be
     * loaded.
     * @param ignoreOutdatedThreshold When `false`, only subscriptions which have not been updated
     * within the `feed_update_threshold` are checked for updates. This threshold can be set by
     * the user in the app settings. When `true`, all subscriptions are checked for new streams.
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Single<java.util.List<io.reactivex.rxjava3.core.Notification<org.schabi.newpipelegacy.local.feed.service.FeedUpdateInfo>>> startLoading(long groupId, boolean ignoreOutdatedThreshold) {
        return null;
    }
    
    public final void cancel() {
    }
    
    private final void broadcastProgress() {
    }
    
    /**
     * Keep the feed and the stream tables small
     * to reduce loading times when trying to display the feed.
     * <br>
     * Remove streams from the feed which are older than [FeedDatabaseManager.FEED_OLDEST_ALLOWED_DATE].
     * Remove streams from the database which are not linked / used by any table.
     */
    private final io.reactivex.rxjava3.core.Completable postProcessFeed() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016\u00a8\u0006\b"}, d2 = {"Lorg/schabi/newpipelegacy/local/feed/service/FeedLoadManager$NotificationConsumer;", "Lio/reactivex/rxjava3/functions/Consumer;", "Lio/reactivex/rxjava3/core/Notification;", "Lorg/schabi/newpipelegacy/local/feed/service/FeedUpdateInfo;", "(Lorg/schabi/newpipelegacy/local/feed/service/FeedLoadManager;)V", "accept", "", "item", "app_release"})
    final class NotificationConsumer implements io.reactivex.rxjava3.functions.Consumer<io.reactivex.rxjava3.core.Notification<org.schabi.newpipelegacy.local.feed.service.FeedUpdateInfo>> {
        
        public NotificationConsumer() {
            super();
        }
        
        @java.lang.Override()
        public void accept(@org.jetbrains.annotations.NotNull()
        io.reactivex.rxjava3.core.Notification<org.schabi.newpipelegacy.local.feed.service.FeedUpdateInfo> item) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0016J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002H\u0002\u00a8\u0006\u000b"}, d2 = {"Lorg/schabi/newpipelegacy/local/feed/service/FeedLoadManager$DatabaseConsumer;", "Lio/reactivex/rxjava3/functions/Consumer;", "", "Lio/reactivex/rxjava3/core/Notification;", "Lorg/schabi/newpipelegacy/local/feed/service/FeedUpdateInfo;", "(Lorg/schabi/newpipelegacy/local/feed/service/FeedLoadManager;)V", "accept", "", "list", "filterNewStreams", "Lorg/schabi/newpipe/extractor/stream/StreamInfoItem;", "app_release"})
    final class DatabaseConsumer implements io.reactivex.rxjava3.functions.Consumer<java.util.List<? extends io.reactivex.rxjava3.core.Notification<org.schabi.newpipelegacy.local.feed.service.FeedUpdateInfo>>> {
        
        public DatabaseConsumer() {
            super();
        }
        
        @java.lang.Override()
        public void accept(@org.jetbrains.annotations.NotNull()
        java.util.List<io.reactivex.rxjava3.core.Notification<org.schabi.newpipelegacy.local.feed.service.FeedUpdateInfo>> list) {
        }
        
        private final java.util.List<org.schabi.newpipe.extractor.stream.StreamInfoItem> filterNewStreams(java.util.List<? extends org.schabi.newpipe.extractor.stream.StreamInfoItem> list) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lorg/schabi/newpipelegacy/local/feed/service/FeedLoadManager$Companion;", "", "()V", "BUFFER_COUNT_BEFORE_INSERT", "", "GROUP_NOTIFICATION_ENABLED", "", "PARALLEL_EXTRACTIONS", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
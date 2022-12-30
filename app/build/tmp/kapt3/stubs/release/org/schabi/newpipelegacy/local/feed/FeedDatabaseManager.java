package org.schabi.newpipelegacy.local.feed;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\u0018\u0000 >2\u00020\u0001:\u0001>B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fJ\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00112\u0006\u0010\u0019\u001a\u00020\u0012J*\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0\u00112\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u001bJ\u0012\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0!0&J\u000e\u0010\'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u0012J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00120&2\b\b\u0002\u0010\u0019\u001a\u00020\u0012J\u001a\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0!0&2\u0006\u0010\u0019\u001a\u00020\u0012J\u001a\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0!0&2\u0006\u0010.\u001a\u00020+J$\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0!0&2\b\b\u0002\u0010\u0019\u001a\u00020\u00122\u0006\u0010.\u001a\u00020+J\"\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0!0&2\u0006\u0010.\u001a\u00020+2\u0006\u00101\u001a\u000202J\u0010\u00103\u001a\u00020\u000f2\b\b\u0002\u00104\u001a\u00020+J\u001a\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120!0&2\u0006\u0010\u0019\u001a\u00020\u0012J\u000e\u00106\u001a\u00020\u00182\u0006\u00107\u001a\u00020\u001fJ\u0014\u00108\u001a\u00020\u00182\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00120!J\u001c\u0010:\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00122\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00120!J&\u0010<\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u00122\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001d0!2\b\b\u0002\u00104\u001a\u00020+R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \t*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \t*\u0004\u0018\u00010\r0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006?"}, d2 = {"Lorg/schabi/newpipelegacy/local/feed/FeedDatabaseManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "database", "Lorg/schabi/newpipelegacy/database/AppDatabase;", "feedGroupTable", "Lorg/schabi/newpipelegacy/database/feed/dao/FeedGroupDAO;", "kotlin.jvm.PlatformType", "feedTable", "Lorg/schabi/newpipelegacy/database/feed/dao/FeedDAO;", "streamTable", "Lorg/schabi/newpipelegacy/database/stream/dao/StreamDAO;", "clear", "", "createGroup", "Lio/reactivex/rxjava3/core/Maybe;", "", "name", "", "icon", "Lorg/schabi/newpipelegacy/local/subscription/FeedGroupIcon;", "deleteGroup", "Lio/reactivex/rxjava3/core/Completable;", "groupId", "doesStreamExist", "", "stream", "Lorg/schabi/newpipe/extractor/stream/StreamInfoItem;", "getGroup", "Lorg/schabi/newpipelegacy/database/feed/model/FeedGroupEntity;", "getStreams", "", "Lorg/schabi/newpipelegacy/database/stream/StreamWithState;", "includePlayedStreams", "includeFutureStreams", "groups", "Lio/reactivex/rxjava3/core/Flowable;", "markAsOutdated", "subscriptionId", "notLoadedCount", "oldestSubscriptionUpdate", "Ljava/time/OffsetDateTime;", "outdatedSubscriptions", "Lorg/schabi/newpipelegacy/database/subscription/SubscriptionEntity;", "outdatedThreshold", "outdatedSubscriptionsForGroup", "outdatedSubscriptionsWithNotificationMode", "notificationMode", "", "removeOrphansOrOlderStreams", "oldestAllowedDate", "subscriptionIdsForGroup", "updateGroup", "feedGroupEntity", "updateGroupsOrder", "groupIdList", "updateSubscriptionsForGroup", "subscriptionIds", "upsertAll", "items", "Companion", "app_release"})
public final class FeedDatabaseManager {
    private final org.schabi.newpipelegacy.database.AppDatabase database = null;
    private final org.schabi.newpipelegacy.database.feed.dao.FeedDAO feedTable = null;
    private final org.schabi.newpipelegacy.database.feed.dao.FeedGroupDAO feedGroupTable = null;
    private final org.schabi.newpipelegacy.database.stream.dao.StreamDAO streamTable = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.schabi.newpipelegacy.local.feed.FeedDatabaseManager.Companion Companion = null;
    
    /**
     * Only items that are newer than this will be saved.
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.time.OffsetDateTime FEED_OLDEST_ALLOWED_DATE = null;
    
    public FeedDatabaseManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Flowable<java.util.List<org.schabi.newpipelegacy.database.feed.model.FeedGroupEntity>> groups() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipelegacy.database.AppDatabase database() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Maybe<java.util.List<org.schabi.newpipelegacy.database.stream.StreamWithState>> getStreams(long groupId, boolean includePlayedStreams, boolean includeFutureStreams) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Flowable<java.util.List<org.schabi.newpipelegacy.database.subscription.SubscriptionEntity>> outdatedSubscriptions(@org.jetbrains.annotations.NotNull()
    java.time.OffsetDateTime outdatedThreshold) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Flowable<java.util.List<org.schabi.newpipelegacy.database.subscription.SubscriptionEntity>> outdatedSubscriptionsWithNotificationMode(@org.jetbrains.annotations.NotNull()
    java.time.OffsetDateTime outdatedThreshold, @org.schabi.newpipelegacy.database.subscription.NotificationMode()
    int notificationMode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Flowable<java.lang.Long> notLoadedCount(long groupId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Flowable<java.util.List<org.schabi.newpipelegacy.database.subscription.SubscriptionEntity>> outdatedSubscriptionsForGroup(long groupId, @org.jetbrains.annotations.NotNull()
    java.time.OffsetDateTime outdatedThreshold) {
        return null;
    }
    
    public final void markAsOutdated(long subscriptionId) {
    }
    
    public final boolean doesStreamExist(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipe.extractor.stream.StreamInfoItem stream) {
        return false;
    }
    
    public final void upsertAll(long subscriptionId, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.schabi.newpipe.extractor.stream.StreamInfoItem> items, @org.jetbrains.annotations.NotNull()
    java.time.OffsetDateTime oldestAllowedDate) {
    }
    
    public final void removeOrphansOrOlderStreams(@org.jetbrains.annotations.NotNull()
    java.time.OffsetDateTime oldestAllowedDate) {
    }
    
    public final void clear() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Flowable<java.util.List<java.lang.Long>> subscriptionIdsForGroup(long groupId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Completable updateSubscriptionsForGroup(long groupId, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> subscriptionIds) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Maybe<java.lang.Long> createGroup(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.local.subscription.FeedGroupIcon icon) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Maybe<org.schabi.newpipelegacy.database.feed.model.FeedGroupEntity> getGroup(long groupId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Completable updateGroup(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.database.feed.model.FeedGroupEntity feedGroupEntity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Completable deleteGroup(long groupId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Completable updateGroupsOrder(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> groupIdList) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Flowable<java.util.List<java.time.OffsetDateTime>> oldestSubscriptionUpdate(long groupId) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/schabi/newpipelegacy/local/feed/FeedDatabaseManager$Companion;", "", "()V", "FEED_OLDEST_ALLOWED_DATE", "Ljava/time/OffsetDateTime;", "getFEED_OLDEST_ALLOWED_DATE", "()Ljava/time/OffsetDateTime;", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.time.OffsetDateTime getFEED_OLDEST_ALLOWED_DATE() {
            return null;
        }
    }
}
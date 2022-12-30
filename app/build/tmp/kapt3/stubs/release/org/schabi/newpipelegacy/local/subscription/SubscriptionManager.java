package org.schabi.newpipelegacy.local.subscription;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\f\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J0\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00170\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u001cJ\u0016\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001fJ\u0010\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\u0014H\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00170\u0016J\u000e\u0010#\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001fJ\u001c\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00192\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\'0&J\u001e\u0010(\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u000fJ\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00140\u00172\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0017R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lorg/schabi/newpipelegacy/local/subscription/SubscriptionManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "database", "Lorg/schabi/newpipelegacy/database/AppDatabase;", "feedDatabaseManager", "Lorg/schabi/newpipelegacy/local/feed/FeedDatabaseManager;", "subscriptionTable", "Lorg/schabi/newpipelegacy/database/subscription/SubscriptionDAO;", "kotlin.jvm.PlatformType", "deleteSubscription", "Lio/reactivex/rxjava3/core/Completable;", "serviceId", "", "url", "", "", "subscriptionEntity", "Lorg/schabi/newpipelegacy/database/subscription/SubscriptionEntity;", "getSubscriptions", "Lio/reactivex/rxjava3/core/Flowable;", "", "currentGroupId", "", "filterQuery", "showOnlyUngrouped", "", "insertSubscription", "info", "Lorg/schabi/newpipe/extractor/channel/ChannelInfo;", "rememberAllStreams", "subscription", "subscriptions", "updateChannelInfo", "updateFromInfo", "subscriptionId", "Lorg/schabi/newpipe/extractor/ListInfo;", "Lorg/schabi/newpipe/extractor/stream/StreamInfoItem;", "updateNotificationMode", "mode", "upsertAll", "infoList", "app_release"})
public final class SubscriptionManager {
    private final org.schabi.newpipelegacy.database.AppDatabase database = null;
    private final org.schabi.newpipelegacy.database.subscription.SubscriptionDAO subscriptionTable = null;
    private final org.schabi.newpipelegacy.local.feed.FeedDatabaseManager feedDatabaseManager = null;
    
    public SubscriptionManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipelegacy.database.subscription.SubscriptionDAO subscriptionTable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Flowable<java.util.List<org.schabi.newpipelegacy.database.subscription.SubscriptionEntity>> subscriptions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Flowable<java.util.List<org.schabi.newpipelegacy.database.subscription.SubscriptionEntity>> getSubscriptions(long currentGroupId, @org.jetbrains.annotations.NotNull()
    java.lang.String filterQuery, boolean showOnlyUngrouped) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.schabi.newpipelegacy.database.subscription.SubscriptionEntity> upsertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.schabi.newpipe.extractor.channel.ChannelInfo> infoList) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Completable updateChannelInfo(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipe.extractor.channel.ChannelInfo info) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Completable updateNotificationMode(int serviceId, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.schabi.newpipelegacy.database.subscription.NotificationMode()
    int mode) {
        return null;
    }
    
    public final void updateFromInfo(long subscriptionId, @org.jetbrains.annotations.NotNull()
    org.schabi.newpipe.extractor.ListInfo<org.schabi.newpipe.extractor.stream.StreamInfoItem> info) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Completable deleteSubscription(int serviceId, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    public final void insertSubscription(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.database.subscription.SubscriptionEntity subscriptionEntity, @org.jetbrains.annotations.NotNull()
    org.schabi.newpipe.extractor.channel.ChannelInfo info) {
    }
    
    public final void deleteSubscription(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.database.subscription.SubscriptionEntity subscriptionEntity) {
    }
    
    /**
     * Fetches the list of videos for the provided channel and saves them in the database, so that
     * they will be considered as "old"/"already seen" streams and the user will never be notified
     * about any one of them.
     */
    private final io.reactivex.rxjava3.core.Completable rememberAllStreams(org.schabi.newpipelegacy.database.subscription.SubscriptionEntity subscription) {
        return null;
    }
}
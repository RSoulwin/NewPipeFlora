package org.schabi.newpipelegacy.database.subscription;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\b\'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\'J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\f0\u000bH\'J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\'J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\'J$\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\f0\u000b2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\'J!\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH!\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\f0\u000b2\u0006\u0010\u0016\u001a\u00020\tH\'J\u001c\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\f0\u000b2\u0006\u0010\u0018\u001a\u00020\u0010H\'J$\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\f0\u000b2\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\tH\'J\u001c\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\f0\u000b2\u0006\u0010\u0007\u001a\u00020\u0005H\'J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bH\'J!\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\fH!\u00a2\u0006\u0002\b\u001eJ\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0017\u00a8\u0006 "}, d2 = {"Lorg/schabi/newpipelegacy/database/subscription/SubscriptionDAO;", "Lorg/schabi/newpipelegacy/database/BasicDAO;", "Lorg/schabi/newpipelegacy/database/subscription/SubscriptionEntity;", "()V", "deleteAll", "", "deleteSubscription", "serviceId", "url", "", "getAll", "Lio/reactivex/rxjava3/core/Flowable;", "", "getSubscription", "Lio/reactivex/rxjava3/core/Maybe;", "subscriptionId", "", "getSubscriptionFlowable", "getSubscriptionIdInternal", "getSubscriptionIdInternal$app_release", "(ILjava/lang/String;)Ljava/lang/Long;", "getSubscriptionsFiltered", "filter", "getSubscriptionsOnlyUngrouped", "currentGroupId", "getSubscriptionsOnlyUngroupedFiltered", "listByService", "rowCount", "silentInsertAllInternal", "entities", "silentInsertAllInternal$app_release", "upsertAll", "app_release"})
public abstract class SubscriptionDAO implements org.schabi.newpipelegacy.database.BasicDAO<org.schabi.newpipelegacy.database.subscription.SubscriptionEntity> {
    
    public SubscriptionDAO() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT COUNT(*) FROM subscriptions")
    public abstract io.reactivex.rxjava3.core.Flowable<java.lang.Long> rowCount();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM subscriptions WHERE service_id = :serviceId")
    @java.lang.Override()
    public abstract io.reactivex.rxjava3.core.Flowable<java.util.List<org.schabi.newpipelegacy.database.subscription.SubscriptionEntity>> listByService(int serviceId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM subscriptions ORDER BY name COLLATE NOCASE ASC")
    @java.lang.Override()
    public abstract io.reactivex.rxjava3.core.Flowable<java.util.List<org.schabi.newpipelegacy.database.subscription.SubscriptionEntity>> getAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "\n        SELECT * FROM subscriptions\n\n        WHERE name LIKE \'%\' || :filter || \'%\'\n\n        ORDER BY name COLLATE NOCASE ASC\n        ")
    public abstract io.reactivex.rxjava3.core.Flowable<java.util.List<org.schabi.newpipelegacy.database.subscription.SubscriptionEntity>> getSubscriptionsFiltered(@org.jetbrains.annotations.NotNull()
    java.lang.String filter);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "\n        SELECT * FROM subscriptions s\n\n        LEFT JOIN feed_group_subscription_join fgs\n        ON s.uid = fgs.subscription_id\n\n        WHERE (fgs.subscription_id IS NULL OR fgs.group_id = :currentGroupId)\n\n        ORDER BY name COLLATE NOCASE ASC\n        ")
    @androidx.room.RewriteQueriesToDropUnusedColumns()
    public abstract io.reactivex.rxjava3.core.Flowable<java.util.List<org.schabi.newpipelegacy.database.subscription.SubscriptionEntity>> getSubscriptionsOnlyUngrouped(long currentGroupId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "\n        SELECT * FROM subscriptions s\n\n        LEFT JOIN feed_group_subscription_join fgs\n        ON s.uid = fgs.subscription_id\n\n        WHERE (fgs.subscription_id IS NULL OR fgs.group_id = :currentGroupId)\n        AND s.name LIKE \'%\' || :filter || \'%\'\n\n        ORDER BY name COLLATE NOCASE ASC\n        ")
    @androidx.room.RewriteQueriesToDropUnusedColumns()
    public abstract io.reactivex.rxjava3.core.Flowable<java.util.List<org.schabi.newpipelegacy.database.subscription.SubscriptionEntity>> getSubscriptionsOnlyUngroupedFiltered(long currentGroupId, @org.jetbrains.annotations.NotNull()
    java.lang.String filter);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM subscriptions WHERE url LIKE :url AND service_id = :serviceId")
    public abstract io.reactivex.rxjava3.core.Flowable<java.util.List<org.schabi.newpipelegacy.database.subscription.SubscriptionEntity>> getSubscriptionFlowable(int serviceId, @org.jetbrains.annotations.NotNull()
    java.lang.String url);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM subscriptions WHERE url LIKE :url AND service_id = :serviceId")
    public abstract io.reactivex.rxjava3.core.Maybe<org.schabi.newpipelegacy.database.subscription.SubscriptionEntity> getSubscription(int serviceId, @org.jetbrains.annotations.NotNull()
    java.lang.String url);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM subscriptions WHERE uid = :subscriptionId")
    public abstract org.schabi.newpipelegacy.database.subscription.SubscriptionEntity getSubscription(long subscriptionId);
    
    @androidx.room.Query(value = "DELETE FROM subscriptions")
    @java.lang.Override()
    public abstract int deleteAll();
    
    @androidx.room.Query(value = "DELETE FROM subscriptions WHERE url LIKE :url AND service_id = :serviceId")
    public abstract int deleteSubscription(int serviceId, @org.jetbrains.annotations.NotNull()
    java.lang.String url);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT uid FROM subscriptions WHERE url LIKE :url AND service_id = :serviceId")
    public abstract java.lang.Long getSubscriptionIdInternal$app_release(int serviceId, @org.jetbrains.annotations.NotNull()
    java.lang.String url);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract java.util.List<java.lang.Long> silentInsertAllInternal$app_release(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.schabi.newpipelegacy.database.subscription.SubscriptionEntity> entities);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Transaction()
    public java.util.List<org.schabi.newpipelegacy.database.subscription.SubscriptionEntity> upsertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.schabi.newpipelegacy.database.subscription.SubscriptionEntity> entities) {
        return null;
    }
}
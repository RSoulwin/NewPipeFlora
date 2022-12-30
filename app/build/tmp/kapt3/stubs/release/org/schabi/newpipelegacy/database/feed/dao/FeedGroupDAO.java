package org.schabi.newpipelegacy.database.feed.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\u0004H\'J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nH\'J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\fH\u0017J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\fH%J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000bH\'J\b\u0010\u0016\u001a\u00020\u0006H%J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\fH\'J\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\'J\u001c\u0010\u0018\u001a\u00020\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001cH\u0017J\u001e\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0017\u00a8\u0006\u001f"}, d2 = {"Lorg/schabi/newpipelegacy/database/feed/dao/FeedGroupDAO;", "", "()V", "delete", "", "groupId", "", "deleteAll", "deleteSubscriptionsFromGroup", "getAll", "Lio/reactivex/rxjava3/core/Flowable;", "", "Lorg/schabi/newpipelegacy/database/feed/model/FeedGroupEntity;", "getGroup", "Lio/reactivex/rxjava3/core/Maybe;", "getSubscriptionIdsFor", "insert", "feedGroupEntity", "insertInternal", "insertSubscriptionsToGroup", "entities", "Lorg/schabi/newpipelegacy/database/feed/model/FeedGroupSubscriptionEntity;", "nextSortOrder", "update", "updateOrder", "sortOrder", "", "orderMap", "", "updateSubscriptionsForGroup", "subscriptionIds", "app_release"})
public abstract class FeedGroupDAO {
    
    public FeedGroupDAO() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM feed_group ORDER BY sort_order ASC")
    public abstract io.reactivex.rxjava3.core.Flowable<java.util.List<org.schabi.newpipelegacy.database.feed.model.FeedGroupEntity>> getAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM feed_group WHERE uid = :groupId")
    public abstract io.reactivex.rxjava3.core.Maybe<org.schabi.newpipelegacy.database.feed.model.FeedGroupEntity> getGroup(long groupId);
    
    @androidx.room.Transaction()
    public long insert(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.database.feed.model.FeedGroupEntity feedGroupEntity) {
        return 0L;
    }
    
    @androidx.room.Update(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract int update(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.database.feed.model.FeedGroupEntity feedGroupEntity);
    
    @androidx.room.Query(value = "DELETE FROM feed_group")
    public abstract int deleteAll();
    
    @androidx.room.Query(value = "DELETE FROM feed_group WHERE uid = :groupId")
    public abstract int delete(long groupId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT subscription_id FROM feed_group_subscription_join WHERE group_id = :groupId")
    public abstract io.reactivex.rxjava3.core.Flowable<java.util.List<java.lang.Long>> getSubscriptionIdsFor(long groupId);
    
    @androidx.room.Query(value = "DELETE FROM feed_group_subscription_join WHERE group_id = :groupId")
    public abstract int deleteSubscriptionsFromGroup(long groupId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract java.util.List<java.lang.Long> insertSubscriptionsToGroup(@org.jetbrains.annotations.NotNull()
    java.util.List<org.schabi.newpipelegacy.database.feed.model.FeedGroupSubscriptionEntity> entities);
    
    @androidx.room.Transaction()
    public void updateSubscriptionsForGroup(long groupId, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> subscriptionIds) {
    }
    
    @androidx.room.Transaction()
    public void updateOrder(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Long, java.lang.Long> orderMap) {
    }
    
    @androidx.room.Query(value = "UPDATE feed_group SET sort_order = :sortOrder WHERE uid = :groupId")
    public abstract int updateOrder(long groupId, long sortOrder);
    
    @androidx.room.Query(value = "SELECT IFNULL(MAX(sort_order) + 1, 0) FROM feed_group")
    protected abstract long nextSortOrder();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.ABORT)
    protected abstract long insertInternal(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.database.feed.model.FeedGroupEntity feedGroupEntity);
}
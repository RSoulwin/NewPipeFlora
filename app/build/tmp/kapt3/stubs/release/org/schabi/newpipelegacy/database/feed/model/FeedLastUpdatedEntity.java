package org.schabi.newpipelegacy.database.feed.model;

import java.lang.System;

@androidx.room.Entity(tableName = "feed_last_updated", foreignKeys = {@androidx.room.ForeignKey(entity = org.schabi.newpipelegacy.database.subscription.SubscriptionEntity.class, childColumns = {"subscription_id"}, deferred = true, onUpdate = 5, onDelete = 5, parentColumns = {"uid"})})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lorg/schabi/newpipelegacy/database/feed/model/FeedLastUpdatedEntity;", "", "subscriptionId", "", "lastUpdated", "Ljava/time/OffsetDateTime;", "(JLjava/time/OffsetDateTime;)V", "getLastUpdated", "()Ljava/time/OffsetDateTime;", "setLastUpdated", "(Ljava/time/OffsetDateTime;)V", "getSubscriptionId", "()J", "setSubscriptionId", "(J)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "app_release"})
public final class FeedLastUpdatedEntity {
    @androidx.room.ColumnInfo(name = "subscription_id")
    @androidx.room.PrimaryKey()
    private long subscriptionId;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "last_updated")
    private java.time.OffsetDateTime lastUpdated;
    @org.jetbrains.annotations.NotNull()
    public static final org.schabi.newpipelegacy.database.feed.model.FeedLastUpdatedEntity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FEED_LAST_UPDATED_TABLE = "feed_last_updated";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SUBSCRIPTION_ID = "subscription_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LAST_UPDATED = "last_updated";
    
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipelegacy.database.feed.model.FeedLastUpdatedEntity copy(long subscriptionId, @org.jetbrains.annotations.Nullable()
    java.time.OffsetDateTime lastUpdated) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public FeedLastUpdatedEntity(long subscriptionId, @org.jetbrains.annotations.Nullable()
    java.time.OffsetDateTime lastUpdated) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getSubscriptionId() {
        return 0L;
    }
    
    public final void setSubscriptionId(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.time.OffsetDateTime component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.time.OffsetDateTime getLastUpdated() {
        return null;
    }
    
    public final void setLastUpdated(@org.jetbrains.annotations.Nullable()
    java.time.OffsetDateTime p0) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lorg/schabi/newpipelegacy/database/feed/model/FeedLastUpdatedEntity$Companion;", "", "()V", "FEED_LAST_UPDATED_TABLE", "", "LAST_UPDATED", "SUBSCRIPTION_ID", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
package org.schabi.newpipelegacy.database.feed.model;

import java.lang.System;

@androidx.room.Entity(tableName = "feed", primaryKeys = {"stream_id", "subscription_id"}, indices = {@androidx.room.Index(value = {"subscription_id"})}, foreignKeys = {@androidx.room.ForeignKey(entity = org.schabi.newpipelegacy.database.stream.model.StreamEntity.class, childColumns = {"stream_id"}, deferred = true, onUpdate = 5, onDelete = 5, parentColumns = {"uid"}), @androidx.room.ForeignKey(entity = org.schabi.newpipelegacy.database.subscription.SubscriptionEntity.class, childColumns = {"subscription_id"}, deferred = true, onUpdate = 5, onDelete = 5, parentColumns = {"uid"})})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t\u00a8\u0006\u0017"}, d2 = {"Lorg/schabi/newpipelegacy/database/feed/model/FeedEntity;", "", "streamId", "", "subscriptionId", "(JJ)V", "getStreamId", "()J", "setStreamId", "(J)V", "getSubscriptionId", "setSubscriptionId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "app_release"})
public final class FeedEntity {
    @androidx.room.ColumnInfo(name = "stream_id")
    private long streamId;
    @androidx.room.ColumnInfo(name = "subscription_id")
    private long subscriptionId;
    @org.jetbrains.annotations.NotNull()
    public static final org.schabi.newpipelegacy.database.feed.model.FeedEntity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FEED_TABLE = "feed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STREAM_ID = "stream_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SUBSCRIPTION_ID = "subscription_id";
    
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipelegacy.database.feed.model.FeedEntity copy(long streamId, long subscriptionId) {
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
    
    public FeedEntity(long streamId, long subscriptionId) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getStreamId() {
        return 0L;
    }
    
    public final void setStreamId(long p0) {
    }
    
    public final long component2() {
        return 0L;
    }
    
    public final long getSubscriptionId() {
        return 0L;
    }
    
    public final void setSubscriptionId(long p0) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lorg/schabi/newpipelegacy/database/feed/model/FeedEntity$Companion;", "", "()V", "FEED_TABLE", "", "STREAM_ID", "SUBSCRIPTION_ID", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
package org.schabi.newpipelegacy.database.feed.model;

import java.lang.System;

@androidx.room.Entity(tableName = "feed_group", indices = {@androidx.room.Index(value = {"sort_order"})})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013\u00a8\u0006#"}, d2 = {"Lorg/schabi/newpipelegacy/database/feed/model/FeedGroupEntity;", "", "uid", "", "name", "", "icon", "Lorg/schabi/newpipelegacy/local/subscription/FeedGroupIcon;", "sortOrder", "(JLjava/lang/String;Lorg/schabi/newpipelegacy/local/subscription/FeedGroupIcon;J)V", "getIcon", "()Lorg/schabi/newpipelegacy/local/subscription/FeedGroupIcon;", "setIcon", "(Lorg/schabi/newpipelegacy/local/subscription/FeedGroupIcon;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getSortOrder", "()J", "setSortOrder", "(J)V", "getUid", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "app_release"})
public final class FeedGroupEntity {
    @androidx.room.ColumnInfo(name = "uid")
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final long uid = 0L;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "name")
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "icon_id")
    private org.schabi.newpipelegacy.local.subscription.FeedGroupIcon icon;
    @androidx.room.ColumnInfo(name = "sort_order")
    private long sortOrder;
    @org.jetbrains.annotations.NotNull()
    public static final org.schabi.newpipelegacy.database.feed.model.FeedGroupEntity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FEED_GROUP_TABLE = "feed_group";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ID = "uid";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NAME = "name";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ICON = "icon_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SORT_ORDER = "sort_order";
    public static final long GROUP_ALL_ID = -1L;
    
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipelegacy.database.feed.model.FeedGroupEntity copy(long uid, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.local.subscription.FeedGroupIcon icon, long sortOrder) {
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
    
    public FeedGroupEntity(long uid, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.local.subscription.FeedGroupIcon icon, long sortOrder) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getUid() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipelegacy.local.subscription.FeedGroupIcon component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipelegacy.local.subscription.FeedGroupIcon getIcon() {
        return null;
    }
    
    public final void setIcon(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.local.subscription.FeedGroupIcon p0) {
    }
    
    public final long component4() {
        return 0L;
    }
    
    public final long getSortOrder() {
        return 0L;
    }
    
    public final void setSortOrder(long p0) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/schabi/newpipelegacy/database/feed/model/FeedGroupEntity$Companion;", "", "()V", "FEED_GROUP_TABLE", "", "GROUP_ALL_ID", "", "ICON", "ID", "NAME", "SORT_ORDER", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
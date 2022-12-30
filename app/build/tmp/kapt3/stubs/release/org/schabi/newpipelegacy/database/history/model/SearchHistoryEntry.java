package org.schabi.newpipelegacy.database.history.model;

import java.lang.System;

@androidx.room.Entity(tableName = "search_history", indices = {@androidx.room.Index(value = {"search"})})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0001&B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J+\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0010\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020\u0000H\u0007J\t\u0010$\u001a\u00020\u0005H\u00d6\u0001J\t\u0010%\u001a\u00020\u0007H\u00d6\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006\'"}, d2 = {"Lorg/schabi/newpipelegacy/database/history/model/SearchHistoryEntry;", "", "creationDate", "Ljava/time/OffsetDateTime;", "serviceId", "", "search", "", "(Ljava/time/OffsetDateTime;ILjava/lang/String;)V", "getCreationDate", "()Ljava/time/OffsetDateTime;", "setCreationDate", "(Ljava/time/OffsetDateTime;)V", "id", "", "getId", "()J", "setId", "(J)V", "getSearch", "()Ljava/lang/String;", "setSearch", "(Ljava/lang/String;)V", "getServiceId", "()I", "setServiceId", "(I)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hasEqualValues", "otherEntry", "hashCode", "toString", "Companion", "app_release"})
public final class SearchHistoryEntry {
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "creation_date")
    private java.time.OffsetDateTime creationDate;
    @androidx.room.ColumnInfo(name = "service_id")
    private int serviceId;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "search")
    private java.lang.String search;
    @androidx.room.PrimaryKey(autoGenerate = true)
    @androidx.room.ColumnInfo(name = "id")
    private long id = 0L;
    @org.jetbrains.annotations.NotNull()
    public static final org.schabi.newpipelegacy.database.history.model.SearchHistoryEntry.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ID = "id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TABLE_NAME = "search_history";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SERVICE_ID = "service_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CREATION_DATE = "creation_date";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SEARCH = "search";
    
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipelegacy.database.history.model.SearchHistoryEntry copy(@org.jetbrains.annotations.Nullable()
    java.time.OffsetDateTime creationDate, int serviceId, @org.jetbrains.annotations.Nullable()
    java.lang.String search) {
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
    
    public SearchHistoryEntry(@org.jetbrains.annotations.Nullable()
    java.time.OffsetDateTime creationDate, int serviceId, @org.jetbrains.annotations.Nullable()
    java.lang.String search) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.time.OffsetDateTime component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.time.OffsetDateTime getCreationDate() {
        return null;
    }
    
    public final void setCreationDate(@org.jetbrains.annotations.Nullable()
    java.time.OffsetDateTime p0) {
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getServiceId() {
        return 0;
    }
    
    public final void setServiceId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSearch() {
        return null;
    }
    
    public final void setSearch(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    @androidx.room.Ignore()
    public final boolean hasEqualValues(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.database.history.model.SearchHistoryEntry otherEntry) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/schabi/newpipelegacy/database/history/model/SearchHistoryEntry$Companion;", "", "()V", "CREATION_DATE", "", "ID", "SEARCH", "SERVICE_ID", "TABLE_NAME", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
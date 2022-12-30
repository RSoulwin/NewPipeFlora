package org.schabi.newpipelegacy.database.history.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u000e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0000J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r\u00a8\u0006 "}, d2 = {"Lorg/schabi/newpipelegacy/database/history/model/StreamHistoryEntry;", "", "streamEntity", "Lorg/schabi/newpipelegacy/database/stream/model/StreamEntity;", "streamId", "", "accessDate", "Ljava/time/OffsetDateTime;", "repeatCount", "(Lorg/schabi/newpipelegacy/database/stream/model/StreamEntity;JLjava/time/OffsetDateTime;J)V", "getAccessDate", "()Ljava/time/OffsetDateTime;", "getRepeatCount", "()J", "getStreamEntity", "()Lorg/schabi/newpipelegacy/database/stream/model/StreamEntity;", "getStreamId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hasEqualValues", "hashCode", "", "toStreamHistoryEntity", "Lorg/schabi/newpipelegacy/database/history/model/StreamHistoryEntity;", "toString", "", "app_release"})
public final class StreamHistoryEntry {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded()
    private final org.schabi.newpipelegacy.database.stream.model.StreamEntity streamEntity = null;
    @androidx.room.ColumnInfo(name = "stream_id")
    private final long streamId = 0L;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "access_date")
    private final java.time.OffsetDateTime accessDate = null;
    @androidx.room.ColumnInfo(name = "repeat_count")
    private final long repeatCount = 0L;
    
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipelegacy.database.history.model.StreamHistoryEntry copy(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.database.stream.model.StreamEntity streamEntity, long streamId, @org.jetbrains.annotations.NotNull()
    java.time.OffsetDateTime accessDate, long repeatCount) {
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
    
    public StreamHistoryEntry(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.database.stream.model.StreamEntity streamEntity, long streamId, @org.jetbrains.annotations.NotNull()
    java.time.OffsetDateTime accessDate, long repeatCount) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipelegacy.database.stream.model.StreamEntity component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipelegacy.database.stream.model.StreamEntity getStreamEntity() {
        return null;
    }
    
    public final long component2() {
        return 0L;
    }
    
    public final long getStreamId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.OffsetDateTime component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.OffsetDateTime getAccessDate() {
        return null;
    }
    
    public final long component4() {
        return 0L;
    }
    
    public final long getRepeatCount() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipelegacy.database.history.model.StreamHistoryEntity toStreamHistoryEntity() {
        return null;
    }
    
    public final boolean hasEqualValues(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.database.history.model.StreamHistoryEntry other) {
        return false;
    }
}
package org.schabi.newpipelegacy.database.playlist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\bH\u00c6\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\t\u0010\u001c\u001a\u00020\bH\u00d6\u0001J\u0006\u0010\u001d\u001a\u00020\u001eJ\t\u0010\u001f\u001a\u00020 H\u00d6\u0001R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r\u00a8\u0006!"}, d2 = {"Lorg/schabi/newpipelegacy/database/playlist/PlaylistStreamEntry;", "Lorg/schabi/newpipelegacy/database/LocalItem;", "streamEntity", "Lorg/schabi/newpipelegacy/database/stream/model/StreamEntity;", "progressMillis", "", "streamId", "joinIndex", "", "(Lorg/schabi/newpipelegacy/database/stream/model/StreamEntity;JJI)V", "getJoinIndex", "()I", "getProgressMillis", "()J", "getStreamEntity", "()Lorg/schabi/newpipelegacy/database/stream/model/StreamEntity;", "getStreamId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "getLocalItemType", "Lorg/schabi/newpipelegacy/database/LocalItem$LocalItemType;", "hashCode", "toStreamInfoItem", "Lorg/schabi/newpipe/extractor/stream/StreamInfoItem;", "toString", "", "app_release"})
public final class PlaylistStreamEntry implements org.schabi.newpipelegacy.database.LocalItem {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded()
    private final org.schabi.newpipelegacy.database.stream.model.StreamEntity streamEntity = null;
    @androidx.room.ColumnInfo(name = "progress_time", defaultValue = "0")
    private final long progressMillis = 0L;
    @androidx.room.ColumnInfo(name = "stream_id")
    private final long streamId = 0L;
    @androidx.room.ColumnInfo(name = "join_index")
    private final int joinIndex = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipelegacy.database.playlist.PlaylistStreamEntry copy(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.database.stream.model.StreamEntity streamEntity, long progressMillis, long streamId, int joinIndex) {
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
    
    public PlaylistStreamEntry(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.database.stream.model.StreamEntity streamEntity, long progressMillis, long streamId, int joinIndex) {
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
    
    public final long getProgressMillis() {
        return 0L;
    }
    
    public final long component3() {
        return 0L;
    }
    
    public final long getStreamId() {
        return 0L;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getJoinIndex() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.IllegalArgumentException.class})
    public final org.schabi.newpipe.extractor.stream.StreamInfoItem toStreamInfoItem() throws java.lang.IllegalArgumentException {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.schabi.newpipelegacy.database.LocalItem.LocalItemType getLocalItemType() {
        return null;
    }
}
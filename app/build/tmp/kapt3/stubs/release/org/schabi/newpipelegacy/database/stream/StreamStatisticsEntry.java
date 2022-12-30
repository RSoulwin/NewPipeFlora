package org.schabi.newpipelegacy.database.stream;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0006\u0010\u0015\u001a\u00020\u0016R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lorg/schabi/newpipelegacy/database/stream/StreamStatisticsEntry;", "Lorg/schabi/newpipelegacy/database/LocalItem;", "streamEntity", "Lorg/schabi/newpipelegacy/database/stream/model/StreamEntity;", "progressMillis", "", "streamId", "latestAccessDate", "Ljava/time/OffsetDateTime;", "watchCount", "(Lorg/schabi/newpipelegacy/database/stream/model/StreamEntity;JJLjava/time/OffsetDateTime;J)V", "getLatestAccessDate", "()Ljava/time/OffsetDateTime;", "getProgressMillis", "()J", "getStreamEntity", "()Lorg/schabi/newpipelegacy/database/stream/model/StreamEntity;", "getStreamId", "getWatchCount", "getLocalItemType", "Lorg/schabi/newpipelegacy/database/LocalItem$LocalItemType;", "toStreamInfoItem", "Lorg/schabi/newpipe/extractor/stream/StreamInfoItem;", "Companion", "app_release"})
public final class StreamStatisticsEntry implements org.schabi.newpipelegacy.database.LocalItem {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded()
    private final org.schabi.newpipelegacy.database.stream.model.StreamEntity streamEntity = null;
    @androidx.room.ColumnInfo(name = "progress_time", defaultValue = "0")
    private final long progressMillis = 0L;
    @androidx.room.ColumnInfo(name = "stream_id")
    private final long streamId = 0L;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "latestAccess")
    private final java.time.OffsetDateTime latestAccessDate = null;
    @androidx.room.ColumnInfo(name = "watchCount")
    private final long watchCount = 0L;
    @org.jetbrains.annotations.NotNull()
    public static final org.schabi.newpipelegacy.database.stream.StreamStatisticsEntry.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STREAM_LATEST_DATE = "latestAccess";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STREAM_WATCH_COUNT = "watchCount";
    
    public StreamStatisticsEntry(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.database.stream.model.StreamEntity streamEntity, long progressMillis, long streamId, @org.jetbrains.annotations.NotNull()
    java.time.OffsetDateTime latestAccessDate, long watchCount) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipelegacy.database.stream.model.StreamEntity getStreamEntity() {
        return null;
    }
    
    public final long getProgressMillis() {
        return 0L;
    }
    
    public final long getStreamId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.OffsetDateTime getLatestAccessDate() {
        return null;
    }
    
    public final long getWatchCount() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipe.extractor.stream.StreamInfoItem toStreamInfoItem() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.schabi.newpipelegacy.database.LocalItem.LocalItemType getLocalItemType() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lorg/schabi/newpipelegacy/database/stream/StreamStatisticsEntry$Companion;", "", "()V", "STREAM_LATEST_DATE", "", "STREAM_WATCH_COUNT", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
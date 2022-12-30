package org.schabi.newpipelegacy.database.stream;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lorg/schabi/newpipelegacy/database/stream/StreamWithState;", "", "stream", "Lorg/schabi/newpipelegacy/database/stream/model/StreamEntity;", "stateProgressMillis", "", "(Lorg/schabi/newpipelegacy/database/stream/model/StreamEntity;Ljava/lang/Long;)V", "getStateProgressMillis", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getStream", "()Lorg/schabi/newpipelegacy/database/stream/model/StreamEntity;", "component1", "component2", "copy", "(Lorg/schabi/newpipelegacy/database/stream/model/StreamEntity;Ljava/lang/Long;)Lorg/schabi/newpipelegacy/database/stream/StreamWithState;", "equals", "", "other", "hashCode", "", "toString", "", "app_release"})
public final class StreamWithState {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded()
    private final org.schabi.newpipelegacy.database.stream.model.StreamEntity stream = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "progress_time")
    private final java.lang.Long stateProgressMillis = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipelegacy.database.stream.StreamWithState copy(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.database.stream.model.StreamEntity stream, @org.jetbrains.annotations.Nullable()
    java.lang.Long stateProgressMillis) {
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
    
    public StreamWithState(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.database.stream.model.StreamEntity stream, @org.jetbrains.annotations.Nullable()
    java.lang.Long stateProgressMillis) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipelegacy.database.stream.model.StreamEntity component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipelegacy.database.stream.model.StreamEntity getStream() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getStateProgressMillis() {
        return null;
    }
}
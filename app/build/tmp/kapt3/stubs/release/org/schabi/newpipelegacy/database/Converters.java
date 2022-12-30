package org.schabi.newpipelegacy.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0007J\u0019\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0007\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u0013H\u0007J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0012H\u0007\u00a8\u0006\u0016"}, d2 = {"Lorg/schabi/newpipelegacy/database/Converters;", "", "()V", "feedGroupIconOf", "Lorg/schabi/newpipelegacy/local/subscription/FeedGroupIcon;", "id", "", "integerOf", "feedGroupIcon", "offsetDateTimeFromTimestamp", "Ljava/time/OffsetDateTime;", "value", "", "(Ljava/lang/Long;)Ljava/time/OffsetDateTime;", "offsetDateTimeToTimestamp", "offsetDateTime", "(Ljava/time/OffsetDateTime;)Ljava/lang/Long;", "streamTypeOf", "Lorg/schabi/newpipe/extractor/stream/StreamType;", "", "stringOf", "streamType", "app_release"})
public final class Converters {
    @org.jetbrains.annotations.NotNull()
    public static final org.schabi.newpipelegacy.database.Converters INSTANCE = null;
    
    private Converters() {
        super();
    }
    
    /**
     * Convert a long value to a [OffsetDateTime].
     *
     * @param value the long value
     * @return the `OffsetDateTime`
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.time.OffsetDateTime offsetDateTimeFromTimestamp(@org.jetbrains.annotations.Nullable()
    java.lang.Long value) {
        return null;
    }
    
    /**
     * Convert a [OffsetDateTime] to a long value.
     *
     * @param offsetDateTime the `OffsetDateTime`
     * @return the long value
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.Long offsetDateTimeToTimestamp(@org.jetbrains.annotations.Nullable()
    java.time.OffsetDateTime offsetDateTime) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final org.schabi.newpipe.extractor.stream.StreamType streamTypeOf(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String stringOf(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipe.extractor.stream.StreamType streamType) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    public final int integerOf(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.local.subscription.FeedGroupIcon feedGroupIcon) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final org.schabi.newpipelegacy.local.subscription.FeedGroupIcon feedGroupIconOf(int id) {
        return null;
    }
}
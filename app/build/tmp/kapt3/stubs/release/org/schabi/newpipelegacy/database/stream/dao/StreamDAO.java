package org.schabi.newpipelegacy.database.stream.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\bH\'J\u001d\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH!\u00a2\u0006\u0002\b\u000fJ\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00120\u0011H\'J\u001f\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH!\u00a2\u0006\u0002\b\u0015J$\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00120\u00112\u0006\u0010\f\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u000eH\'J\u001c\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00120\u00112\u0006\u0010\f\u001a\u00020\bH\'J \u0010\u0019\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000eH\'J!\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u00122\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H!\u00a2\u0006\u0002\b\u001eJ\u0015\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0002H!\u00a2\u0006\u0002\b!J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u0002H\u0017J\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00170\u00122\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0017\u00a8\u0006%"}, d2 = {"Lorg/schabi/newpipelegacy/database/stream/dao/StreamDAO;", "Lorg/schabi/newpipelegacy/database/BasicDAO;", "Lorg/schabi/newpipelegacy/database/stream/model/StreamEntity;", "()V", "compareAndUpdateStream", "", "newerStream", "deleteAll", "", "deleteOrphans", "exists", "", "serviceId", "url", "", "exists$app_release", "getAll", "Lio/reactivex/rxjava3/core/Flowable;", "", "getMinimalStreamForCompare", "Lorg/schabi/newpipelegacy/database/stream/dao/StreamDAO$StreamCompareFeed;", "getMinimalStreamForCompare$app_release", "getStream", "", "listByService", "setUploaderUrl", "Lio/reactivex/rxjava3/core/Completable;", "uploaderUrl", "silentInsertAllInternal", "streams", "silentInsertAllInternal$app_release", "silentInsertInternal", "stream", "silentInsertInternal$app_release", "upsert", "upsertAll", "StreamCompareFeed", "app_release"})
public abstract class StreamDAO implements org.schabi.newpipelegacy.database.BasicDAO<org.schabi.newpipelegacy.database.stream.model.StreamEntity> {
    
    public StreamDAO() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM streams")
    @java.lang.Override()
    public abstract io.reactivex.rxjava3.core.Flowable<java.util.List<org.schabi.newpipelegacy.database.stream.model.StreamEntity>> getAll();
    
    @androidx.room.Query(value = "DELETE FROM streams")
    @java.lang.Override()
    public abstract int deleteAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM streams WHERE service_id = :serviceId")
    @java.lang.Override()
    public abstract io.reactivex.rxjava3.core.Flowable<java.util.List<org.schabi.newpipelegacy.database.stream.model.StreamEntity>> listByService(int serviceId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM streams WHERE url = :url AND service_id = :serviceId")
    public abstract io.reactivex.rxjava3.core.Flowable<java.util.List<org.schabi.newpipelegacy.database.stream.model.StreamEntity>> getStream(long serviceId, @org.jetbrains.annotations.NotNull()
    java.lang.String url);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "UPDATE streams SET uploader_url = :uploaderUrl WHERE url = :url AND service_id = :serviceId")
    public abstract io.reactivex.rxjava3.core.Completable setUploaderUrl(long serviceId, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.lang.String uploaderUrl);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract long silentInsertInternal$app_release(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.database.stream.model.StreamEntity stream);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract java.util.List<java.lang.Long> silentInsertAllInternal$app_release(@org.jetbrains.annotations.NotNull()
    java.util.List<org.schabi.newpipelegacy.database.stream.model.StreamEntity> streams);
    
    @androidx.room.Query(value = "SELECT COUNT(*) != 0 FROM streams WHERE url = :url AND service_id = :serviceId")
    public abstract boolean exists$app_release(int serviceId, @org.jetbrains.annotations.NotNull()
    java.lang.String url);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "\n        SELECT uid, stream_type, textual_upload_date, upload_date, is_upload_date_approximation, duration \n        FROM streams WHERE url = :url AND service_id = :serviceId\n        ")
    public abstract org.schabi.newpipelegacy.database.stream.dao.StreamDAO.StreamCompareFeed getMinimalStreamForCompare$app_release(int serviceId, @org.jetbrains.annotations.NotNull()
    java.lang.String url);
    
    @androidx.room.Transaction()
    public long upsert(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.database.stream.model.StreamEntity newerStream) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Transaction()
    public java.util.List<java.lang.Long> upsertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<org.schabi.newpipelegacy.database.stream.model.StreamEntity> streams) {
        return null;
    }
    
    private final void compareAndUpdateStream(org.schabi.newpipelegacy.database.stream.model.StreamEntity newerStream) {
    }
    
    @androidx.room.Query(value = "\n        DELETE FROM streams WHERE\n\n        NOT EXISTS (SELECT 1 FROM stream_history sh\n        WHERE sh.stream_id = streams.uid)\n\n        AND NOT EXISTS (SELECT 1 FROM playlist_stream_join ps\n        WHERE ps.stream_id = streams.uid)\n\n        AND NOT EXISTS (SELECT 1 FROM feed f\n        WHERE f.stream_id = streams.uid)\n        ")
    public abstract int deleteOrphans();
    
    /**
     * Minimal entry class used when comparing/updating an existent stream.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\rJ\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003JP\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\u000b2\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010.\u001a\u00020/H\u00d6\u0001J\t\u00100\u001a\u00020\u0007H\u00d6\u0001R\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\n\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011R \u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\u00a8\u00061"}, d2 = {"Lorg/schabi/newpipelegacy/database/stream/dao/StreamDAO$StreamCompareFeed;", "", "uid", "", "streamType", "Lorg/schabi/newpipe/extractor/stream/StreamType;", "textualUploadDate", "", "uploadDate", "Ljava/time/OffsetDateTime;", "isUploadDateApproximation", "", "duration", "(JLorg/schabi/newpipe/extractor/stream/StreamType;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/lang/Boolean;J)V", "getDuration", "()J", "setDuration", "(J)V", "()Ljava/lang/Boolean;", "setUploadDateApproximation", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getStreamType", "()Lorg/schabi/newpipe/extractor/stream/StreamType;", "setStreamType", "(Lorg/schabi/newpipe/extractor/stream/StreamType;)V", "getTextualUploadDate", "()Ljava/lang/String;", "setTextualUploadDate", "(Ljava/lang/String;)V", "getUid", "setUid", "getUploadDate", "()Ljava/time/OffsetDateTime;", "setUploadDate", "(Ljava/time/OffsetDateTime;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(JLorg/schabi/newpipe/extractor/stream/StreamType;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/lang/Boolean;J)Lorg/schabi/newpipelegacy/database/stream/dao/StreamDAO$StreamCompareFeed;", "equals", "other", "hashCode", "", "toString", "app_release"})
    public static final class StreamCompareFeed {
        @androidx.room.ColumnInfo(name = "uid")
        private long uid;
        @org.jetbrains.annotations.NotNull()
        @androidx.room.ColumnInfo(name = "stream_type")
        private org.schabi.newpipe.extractor.stream.StreamType streamType;
        @org.jetbrains.annotations.Nullable()
        @androidx.room.ColumnInfo(name = "textual_upload_date")
        private java.lang.String textualUploadDate;
        @org.jetbrains.annotations.Nullable()
        @androidx.room.ColumnInfo(name = "upload_date")
        private java.time.OffsetDateTime uploadDate;
        @org.jetbrains.annotations.Nullable()
        @androidx.room.ColumnInfo(name = "is_upload_date_approximation")
        private java.lang.Boolean isUploadDateApproximation;
        @androidx.room.ColumnInfo(name = "duration")
        private long duration;
        
        /**
         * Minimal entry class used when comparing/updating an existent stream.
         */
        @org.jetbrains.annotations.NotNull()
        public final org.schabi.newpipelegacy.database.stream.dao.StreamDAO.StreamCompareFeed copy(long uid, @org.jetbrains.annotations.NotNull()
        org.schabi.newpipe.extractor.stream.StreamType streamType, @org.jetbrains.annotations.Nullable()
        java.lang.String textualUploadDate, @org.jetbrains.annotations.Nullable()
        java.time.OffsetDateTime uploadDate, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isUploadDateApproximation, long duration) {
            return null;
        }
        
        /**
         * Minimal entry class used when comparing/updating an existent stream.
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Minimal entry class used when comparing/updating an existent stream.
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Minimal entry class used when comparing/updating an existent stream.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public StreamCompareFeed(long uid, @org.jetbrains.annotations.NotNull()
        org.schabi.newpipe.extractor.stream.StreamType streamType, @org.jetbrains.annotations.Nullable()
        java.lang.String textualUploadDate, @org.jetbrains.annotations.Nullable()
        java.time.OffsetDateTime uploadDate, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isUploadDateApproximation, long duration) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getUid() {
            return 0L;
        }
        
        public final void setUid(long p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.schabi.newpipe.extractor.stream.StreamType component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.schabi.newpipe.extractor.stream.StreamType getStreamType() {
            return null;
        }
        
        public final void setStreamType(@org.jetbrains.annotations.NotNull()
        org.schabi.newpipe.extractor.stream.StreamType p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTextualUploadDate() {
            return null;
        }
        
        public final void setTextualUploadDate(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.time.OffsetDateTime component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.time.OffsetDateTime getUploadDate() {
            return null;
        }
        
        public final void setUploadDate(@org.jetbrains.annotations.Nullable()
        java.time.OffsetDateTime p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isUploadDateApproximation() {
            return null;
        }
        
        public final void setUploadDateApproximation(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean p0) {
        }
        
        public final long component6() {
            return 0L;
        }
        
        public final long getDuration() {
            return 0L;
        }
        
        public final void setDuration(long p0) {
        }
    }
}
package org.schabi.newpipelegacy.local.feed.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007B3\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u000fJ\t\u0010!\u001a\u00020\tH\u00c6\u0003J\t\u0010\"\u001a\u00020\u000bH\u00c6\u0003J\t\u0010#\u001a\u00020\rH\u00c6\u0003J\t\u0010$\u001a\u00020\rH\u00c6\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003JA\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010*\u001a\u00020\u000bH\u00d6\u0001J\t\u0010+\u001a\u00020\rH\u00d6\u0001R\u0011\u0010\u000e\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 \u00a8\u0006,"}, d2 = {"Lorg/schabi/newpipelegacy/local/feed/service/FeedUpdateInfo;", "", "subscription", "Lorg/schabi/newpipelegacy/database/subscription/SubscriptionEntity;", "listInfo", "Lorg/schabi/newpipe/extractor/ListInfo;", "Lorg/schabi/newpipe/extractor/stream/StreamInfoItem;", "(Lorg/schabi/newpipelegacy/database/subscription/SubscriptionEntity;Lorg/schabi/newpipe/extractor/ListInfo;)V", "uid", "", "notificationMode", "", "name", "", "avatarUrl", "(JILjava/lang/String;Ljava/lang/String;Lorg/schabi/newpipe/extractor/ListInfo;)V", "getAvatarUrl", "()Ljava/lang/String;", "getListInfo", "()Lorg/schabi/newpipe/extractor/ListInfo;", "getName", "newStreams", "", "getNewStreams", "()Ljava/util/List;", "setNewStreams", "(Ljava/util/List;)V", "getNotificationMode", "()I", "pseudoId", "getPseudoId", "getUid", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_release"})
public final class FeedUpdateInfo {
    private final long uid = 0L;
    private final int notificationMode = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String avatarUrl = null;
    @org.jetbrains.annotations.NotNull()
    private final org.schabi.newpipe.extractor.ListInfo<org.schabi.newpipe.extractor.stream.StreamInfoItem> listInfo = null;
    public java.util.List<? extends org.schabi.newpipe.extractor.stream.StreamInfoItem> newStreams;
    
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipelegacy.local.feed.service.FeedUpdateInfo copy(long uid, @org.schabi.newpipelegacy.database.subscription.NotificationMode()
    int notificationMode, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String avatarUrl, @org.jetbrains.annotations.NotNull()
    org.schabi.newpipe.extractor.ListInfo<org.schabi.newpipe.extractor.stream.StreamInfoItem> listInfo) {
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
    
    public FeedUpdateInfo(long uid, @org.schabi.newpipelegacy.database.subscription.NotificationMode()
    int notificationMode, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String avatarUrl, @org.jetbrains.annotations.NotNull()
    org.schabi.newpipe.extractor.ListInfo<org.schabi.newpipe.extractor.stream.StreamInfoItem> listInfo) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getUid() {
        return 0L;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getNotificationMode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAvatarUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipe.extractor.ListInfo<org.schabi.newpipe.extractor.stream.StreamInfoItem> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipe.extractor.ListInfo<org.schabi.newpipe.extractor.stream.StreamInfoItem> getListInfo() {
        return null;
    }
    
    public FeedUpdateInfo(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.database.subscription.SubscriptionEntity subscription, @org.jetbrains.annotations.NotNull()
    org.schabi.newpipe.extractor.ListInfo<org.schabi.newpipe.extractor.stream.StreamInfoItem> listInfo) {
        super();
    }
    
    public final int getPseudoId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.schabi.newpipe.extractor.stream.StreamInfoItem> getNewStreams() {
        return null;
    }
    
    public final void setNewStreams(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.schabi.newpipe.extractor.stream.StreamInfoItem> p0) {
    }
}
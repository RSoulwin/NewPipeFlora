package org.schabi.newpipelegacy.local.feed.notifications;

import java.lang.System;

/**
 * Information for the Scheduler which checks for new streams.
 * See [NotificationWorker]
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t\u00a8\u0006\u0014"}, d2 = {"Lorg/schabi/newpipelegacy/local/feed/notifications/ScheduleOptions;", "", "interval", "", "isRequireNonMeteredNetwork", "", "(JZ)V", "getInterval", "()J", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "app_release"})
public final class ScheduleOptions {
    private final long interval = 0L;
    private final boolean isRequireNonMeteredNetwork = false;
    @org.jetbrains.annotations.NotNull()
    public static final org.schabi.newpipelegacy.local.feed.notifications.ScheduleOptions.Companion Companion = null;
    
    /**
     * Information for the Scheduler which checks for new streams.
     * See [NotificationWorker]
     */
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipelegacy.local.feed.notifications.ScheduleOptions copy(long interval, boolean isRequireNonMeteredNetwork) {
        return null;
    }
    
    /**
     * Information for the Scheduler which checks for new streams.
     * See [NotificationWorker]
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Information for the Scheduler which checks for new streams.
     * See [NotificationWorker]
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Information for the Scheduler which checks for new streams.
     * See [NotificationWorker]
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ScheduleOptions(long interval, boolean isRequireNonMeteredNetwork) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getInterval() {
        return 0L;
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final boolean isRequireNonMeteredNetwork() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/schabi/newpipelegacy/local/feed/notifications/ScheduleOptions$Companion;", "", "()V", "from", "Lorg/schabi/newpipelegacy/local/feed/notifications/ScheduleOptions;", "context", "Landroid/content/Context;", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.schabi.newpipelegacy.local.feed.notifications.ScheduleOptions from(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}
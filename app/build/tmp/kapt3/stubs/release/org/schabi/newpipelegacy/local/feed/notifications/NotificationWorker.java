package org.schabi.newpipelegacy.local.feed.notifications;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0015"}, d2 = {"Lorg/schabi/newpipelegacy/local/feed/notifications/NotificationWorker;", "Landroidx/work/rxjava3/RxWorker;", "appContext", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "feedLoadManager", "Lorg/schabi/newpipelegacy/local/feed/service/FeedLoadManager;", "notificationHelper", "Lorg/schabi/newpipelegacy/local/feed/notifications/NotificationHelper;", "getNotificationHelper", "()Lorg/schabi/newpipelegacy/local/feed/notifications/NotificationHelper;", "notificationHelper$delegate", "Lkotlin/Lazy;", "createWork", "Lio/reactivex/rxjava3/core/Single;", "Landroidx/work/ListenableWorker$Result;", "showLoadingFeedForegroundNotification", "", "Companion", "app_release"})
public final class NotificationWorker extends androidx.work.rxjava3.RxWorker {
    private final kotlin.Lazy notificationHelper$delegate = null;
    private final org.schabi.newpipelegacy.local.feed.service.FeedLoadManager feedLoadManager = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.schabi.newpipelegacy.local.feed.notifications.NotificationWorker.Companion Companion = null;
    private static final java.lang.String TAG = null;
    private static final java.lang.String WORK_TAG = "org.schabi.newpipe.One_streams_notifications";
    
    public NotificationWorker(@org.jetbrains.annotations.NotNull()
    android.content.Context appContext, @org.jetbrains.annotations.NotNull()
    androidx.work.WorkerParameters workerParams) {
        super(null, null);
    }
    
    private final org.schabi.newpipelegacy.local.feed.notifications.NotificationHelper getNotificationHelper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.rxjava3.core.Single<androidx.work.ListenableWorker.Result> createWork() {
        return null;
    }
    
    private final void showLoadingFeedForegroundNotification() {
    }
    
    /**
     * Schedules a task for the [NotificationWorker]
     * if the (device and in-app) notifications are enabled,
     * otherwise [cancel]s all scheduled tasks.
     */
    @kotlin.jvm.JvmStatic()
    public static final void initialize(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void schedule(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * Check for new streams immediately
     */
    @kotlin.jvm.JvmStatic()
    public static final void runNow(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * Cancels all current work related to the [NotificationWorker].
     */
    @kotlin.jvm.JvmStatic()
    public static final void cancel(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0007J \u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\bR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lorg/schabi/newpipelegacy/local/feed/notifications/NotificationWorker$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "WORK_TAG", "areNotificationsEnabled", "", "context", "Landroid/content/Context;", "cancel", "", "initialize", "runNow", "schedule", "options", "Lorg/schabi/newpipelegacy/local/feed/notifications/ScheduleOptions;", "force", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final boolean areNotificationsEnabled(android.content.Context context) {
            return false;
        }
        
        /**
         * Schedules a task for the [NotificationWorker]
         * if the (device and in-app) notifications are enabled,
         * otherwise [cancel]s all scheduled tasks.
         */
        @kotlin.jvm.JvmStatic()
        public final void initialize(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        /**
         * @param context the context to use
         * @param options configuration options for the scheduler
         * @param force Force the scheduler to use the new options
         * by replacing the previously used worker.
         */
        public final void schedule(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        org.schabi.newpipelegacy.local.feed.notifications.ScheduleOptions options, boolean force) {
        }
        
        @kotlin.jvm.JvmStatic()
        public final void schedule(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        /**
         * Check for new streams immediately
         */
        @kotlin.jvm.JvmStatic()
        public final void runNow(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        /**
         * Cancels all current work related to the [NotificationWorker].
         */
        @kotlin.jvm.JvmStatic()
        public final void cancel(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
    }
}
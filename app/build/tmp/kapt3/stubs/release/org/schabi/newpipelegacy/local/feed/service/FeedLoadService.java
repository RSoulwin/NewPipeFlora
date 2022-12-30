package org.schabi.newpipelegacy.local.feed.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 #2\u00020\u0001:\u0002#$B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\nH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0010H\u0016J\"\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u0010H\u0002J\b\u0010\u001e\u001a\u00020\u0010H\u0002J\b\u0010\u001f\u001a\u00020\u0010H\u0002J\u0010\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\"H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lorg/schabi/newpipelegacy/local/feed/service/FeedLoadService;", "Landroid/app/Service;", "()V", "broadcastReceiver", "Landroid/content/BroadcastReceiver;", "feedLoadManager", "Lorg/schabi/newpipelegacy/local/feed/service/FeedLoadManager;", "loadingDisposable", "Lio/reactivex/rxjava3/disposables/Disposable;", "notificationBuilder", "Landroidx/core/app/NotificationCompat$Builder;", "notificationDisposable", "notificationManager", "Landroidx/core/app/NotificationManagerCompat;", "createNotification", "disposeAll", "", "handleError", "error", "", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "onStartCommand", "", "flags", "startId", "setupBroadcastReceiver", "setupNotification", "stopService", "updateNotificationProgress", "state", "Lorg/schabi/newpipelegacy/local/feed/service/FeedLoadState;", "Companion", "RequestException", "app_release"})
public final class FeedLoadService extends android.app.Service {
    @org.jetbrains.annotations.NotNull()
    public static final org.schabi.newpipelegacy.local.feed.service.FeedLoadService.Companion Companion = null;
    private static final java.lang.String TAG = null;
    public static final int NOTIFICATION_ID = 7293450;
    private static final java.lang.String ACTION_CANCEL = "org.schabi.newpipe.One.local.feed.service.FeedLoadService.CANCEL";
    
    /**
     * How often the notification will be updated.
     */
    private static final int NOTIFICATION_SAMPLING_PERIOD = 1500;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_GROUP_ID = "FeedLoadService.EXTRA_GROUP_ID";
    private io.reactivex.rxjava3.disposables.Disposable loadingDisposable;
    private io.reactivex.rxjava3.disposables.Disposable notificationDisposable;
    private org.schabi.newpipelegacy.local.feed.service.FeedLoadManager feedLoadManager;
    private androidx.core.app.NotificationManagerCompat notificationManager;
    private androidx.core.app.NotificationCompat.Builder notificationBuilder;
    private android.content.BroadcastReceiver broadcastReceiver;
    
    public FeedLoadService() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    private final void disposeAll() {
    }
    
    private final void stopService() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.os.IBinder onBind(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
        return null;
    }
    
    private final androidx.core.app.NotificationCompat.Builder createNotification() {
        return null;
    }
    
    private final void setupNotification() {
    }
    
    private final void updateNotificationProgress(org.schabi.newpipelegacy.local.feed.service.FeedLoadState state) {
    }
    
    private final void setupBroadcastReceiver() {
    }
    
    private final void handleError(java.lang.Throwable error) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u0000 \f2\u00060\u0001j\u0002`\u0002:\u0001\fB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\r"}, d2 = {"Lorg/schabi/newpipelegacy/local/feed/service/FeedLoadService$RequestException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "subscriptionId", "", "message", "", "cause", "", "(JLjava/lang/String;Ljava/lang/Throwable;)V", "getSubscriptionId", "()J", "Companion", "app_release"})
    public static final class RequestException extends java.lang.Exception {
        private final long subscriptionId = 0L;
        @org.jetbrains.annotations.NotNull()
        public static final org.schabi.newpipelegacy.local.feed.service.FeedLoadService.RequestException.Companion Companion = null;
        
        public RequestException(long subscriptionId, @org.jetbrains.annotations.NotNull()
        java.lang.String message, @org.jetbrains.annotations.NotNull()
        java.lang.Throwable cause) {
            super();
        }
        
        public final long getSubscriptionId() {
            return 0L;
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a8\u0006\u000b"}, d2 = {"Lorg/schabi/newpipelegacy/local/feed/service/FeedLoadService$RequestException$Companion;", "", "()V", "wrapList", "", "", "subscriptionId", "", "info", "Lorg/schabi/newpipe/extractor/ListInfo;", "Lorg/schabi/newpipe/extractor/stream/StreamInfoItem;", "app_release"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<java.lang.Throwable> wrapList(long subscriptionId, @org.jetbrains.annotations.NotNull()
            org.schabi.newpipe.extractor.ListInfo<org.schabi.newpipe.extractor.stream.StreamInfoItem> info) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \n*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/schabi/newpipelegacy/local/feed/service/FeedLoadService$Companion;", "", "()V", "ACTION_CANCEL", "", "EXTRA_GROUP_ID", "NOTIFICATION_ID", "", "NOTIFICATION_SAMPLING_PERIOD", "TAG", "kotlin.jvm.PlatformType", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
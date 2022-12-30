package org.schabi.newpipelegacy.local.feed.notifications;

import java.lang.System;

/**
 * Helper for everything related to show notifications about new streams to the user.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lorg/schabi/newpipelegacy/local/feed/notifications/NotificationHelper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "manager", "Landroid/app/NotificationManager;", "displayNewStreamsNotification", "", "data", "Lorg/schabi/newpipelegacy/local/feed/service/FeedUpdateInfo;", "Companion", "app_release"})
public final class NotificationHelper {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final android.app.NotificationManager manager = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.schabi.newpipelegacy.local.feed.notifications.NotificationHelper.Companion Companion = null;
    
    public NotificationHelper(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    /**
     * Show a notification about new streams from a single channel.
     * Opening the notification will open the corresponding channel page.
     */
    public final void displayNewStreamsNotification(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.local.feed.service.FeedUpdateInfo data) {
    }
    
    /**
     * Whether the user enabled the notifications for new streams in the app settings.
     */
    @kotlin.jvm.JvmStatic()
    public static final boolean areNewStreamsNotificationsEnabled(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\n"}, d2 = {"Lorg/schabi/newpipelegacy/local/feed/notifications/NotificationHelper$Companion;", "", "()V", "areNewStreamsNotificationsEnabled", "", "context", "Landroid/content/Context;", "areNotificationsEnabledOnDevice", "openNewPipeSystemNotificationSettings", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Check whether notifications are enabled on the device.
         * Users can disable them via the system settings for a single app.
         * If this is the case, the app cannot create any notifications
         * and display them to the user.
         * <br>
         * On Android 26 and above, notification channels are used by NewPipe.
         * These can be configured by the user, too.
         * The notification channel for new streams is also checked by this method.
         *
         * @param context Context
         * @return <code>true</code> if notifications are allowed and can be displayed;
         * <code>false</code> otherwise
         */
        public final boolean areNotificationsEnabledOnDevice(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return false;
        }
        
        /**
         * Whether the user enabled the notifications for new streams in the app settings.
         */
        @kotlin.jvm.JvmStatic()
        public final boolean areNewStreamsNotificationsEnabled(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return false;
        }
        
        /**
         * Open the system's notification settings for NewPipe on Android Oreo (API 26) and later.
         * Open the system's app settings for NewPipe on previous Android versions.
         */
        public final void openNewPipeSystemNotificationSettings(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
    }
}
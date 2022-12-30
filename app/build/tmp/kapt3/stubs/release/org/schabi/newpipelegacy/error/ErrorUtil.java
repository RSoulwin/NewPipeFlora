package org.schabi.newpipelegacy.error;

import java.lang.System;

/**
 * This class contains all of the methods that should be used to let the user know that an error has
 * occurred in the least intrusive way possible for each case. This class is for unexpected errors,
 * for handled errors (e.g. network errors) use e.g. [ErrorPanelHelper] instead.
 * - Use a snackbar if the exception is not critical and it happens in a place where a root view
 *     is available.
 * - Use a notification if the exception happens inside a background service (player, subscription
 *     import, ...) or there is no activity/fragment from which to extract a root view.
 * - Finally use the error activity only as a last resort in case the exception is critical and
 *     happens in an open activity (since the workflow would be interrupted anyway in that case).
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lorg/schabi/newpipelegacy/error/ErrorUtil;", "", "()V", "Companion", "app_release"})
public final class ErrorUtil {
    @org.jetbrains.annotations.NotNull()
    public static final org.schabi.newpipelegacy.error.ErrorUtil.Companion Companion = null;
    private static final int ERROR_REPORT_NOTIFICATION_ID = 5340681;
    
    public ErrorUtil() {
        super();
    }
    
    /**
     * Starts a new error activity allowing the user to report the provided error. Only use this
     * method directly as a last resort in case the exception is critical and happens in an open
     * activity (since the workflow would be interrupted anyway in that case). So never use this
     * for background services.
     *
     * @param context the context to use to start the new activity
     * @param errorInfo the error info to be reported
     */
    @kotlin.jvm.JvmStatic()
    public static final void openActivity(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.error.ErrorInfo errorInfo) {
    }
    
    /**
     * Show a bottom snackbar to the user, with a report button that opens the error activity.
     * Use this method if the exception is not critical and it happens in a place where a root
     * view is available.
     *
     * @param context will be used to obtain the root view if it is an [Activity]; if no root
     *               view can be found an error notification is shown instead
     * @param errorInfo the error info to be reported
     */
    @kotlin.jvm.JvmStatic()
    public static final void showSnackbar(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.error.ErrorInfo errorInfo) {
    }
    
    /**
     * Show a bottom snackbar to the user, with a report button that opens the error activity.
     * Use this method if the exception is not critical and it happens in a place where a root
     * view is available.
     *
     * @param fragment will be used to obtain the root view if it has a connected [Activity]; if
     *                no root view can be found an error notification is shown instead
     * @param errorInfo the error info to be reported
     */
    @kotlin.jvm.JvmStatic()
    public static final void showSnackbar(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.error.ErrorInfo errorInfo) {
    }
    
    /**
     * Shortcut to calling [showSnackbar] with an [ErrorInfo] of type [UserAction.UI_ERROR]
     */
    @kotlin.jvm.JvmStatic()
    public static final void showUiErrorSnackbar(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String request, @org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
    }
    
    /**
     * Shortcut to calling [showSnackbar] with an [ErrorInfo] of type [UserAction.UI_ERROR]
     */
    @kotlin.jvm.JvmStatic()
    public static final void showUiErrorSnackbar(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    java.lang.String request, @org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
    }
    
    /**
     * Create an error notification. Tapping on the notification opens the error activity. Use
     * this method if the exception happens inside a background service (player, subscription
     * import, ...) or there is no activity/fragment from which to extract a root view.
     *
     * @param context the context to use to show the notification
     * @param errorInfo the error info to be reported; the error message
     *                 [ErrorInfo.messageStringId] will be shown in the notification
     *                 description
     */
    @kotlin.jvm.JvmStatic()
    public static final void createNotification(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.error.ErrorInfo errorInfo) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\"\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nH\u0007J \u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J \u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lorg/schabi/newpipelegacy/error/ErrorUtil$Companion;", "", "()V", "ERROR_REPORT_NOTIFICATION_ID", "", "createNotification", "", "context", "Landroid/content/Context;", "errorInfo", "Lorg/schabi/newpipelegacy/error/ErrorInfo;", "getErrorActivityIntent", "Landroid/content/Intent;", "openActivity", "showSnackbar", "rootView", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "showUiErrorSnackbar", "request", "", "throwable", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Starts a new error activity allowing the user to report the provided error. Only use this
         * method directly as a last resort in case the exception is critical and happens in an open
         * activity (since the workflow would be interrupted anyway in that case). So never use this
         * for background services.
         *
         * @param context the context to use to start the new activity
         * @param errorInfo the error info to be reported
         */
        @kotlin.jvm.JvmStatic()
        public final void openActivity(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        org.schabi.newpipelegacy.error.ErrorInfo errorInfo) {
        }
        
        /**
         * Show a bottom snackbar to the user, with a report button that opens the error activity.
         * Use this method if the exception is not critical and it happens in a place where a root
         * view is available.
         *
         * @param context will be used to obtain the root view if it is an [Activity]; if no root
         *               view can be found an error notification is shown instead
         * @param errorInfo the error info to be reported
         */
        @kotlin.jvm.JvmStatic()
        public final void showSnackbar(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        org.schabi.newpipelegacy.error.ErrorInfo errorInfo) {
        }
        
        /**
         * Show a bottom snackbar to the user, with a report button that opens the error activity.
         * Use this method if the exception is not critical and it happens in a place where a root
         * view is available.
         *
         * @param fragment will be used to obtain the root view if it has a connected [Activity]; if
         *                no root view can be found an error notification is shown instead
         * @param errorInfo the error info to be reported
         */
        @kotlin.jvm.JvmStatic()
        public final void showSnackbar(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
        org.schabi.newpipelegacy.error.ErrorInfo errorInfo) {
        }
        
        /**
         * Shortcut to calling [showSnackbar] with an [ErrorInfo] of type [UserAction.UI_ERROR]
         */
        @kotlin.jvm.JvmStatic()
        public final void showUiErrorSnackbar(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String request, @org.jetbrains.annotations.NotNull()
        java.lang.Throwable throwable) {
        }
        
        /**
         * Shortcut to calling [showSnackbar] with an [ErrorInfo] of type [UserAction.UI_ERROR]
         */
        @kotlin.jvm.JvmStatic()
        public final void showUiErrorSnackbar(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
        java.lang.String request, @org.jetbrains.annotations.NotNull()
        java.lang.Throwable throwable) {
        }
        
        /**
         * Create an error notification. Tapping on the notification opens the error activity. Use
         * this method if the exception happens inside a background service (player, subscription
         * import, ...) or there is no activity/fragment from which to extract a root view.
         *
         * @param context the context to use to show the notification
         * @param errorInfo the error info to be reported; the error message
         *                 [ErrorInfo.messageStringId] will be shown in the notification
         *                 description
         */
        @kotlin.jvm.JvmStatic()
        public final void createNotification(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        org.schabi.newpipelegacy.error.ErrorInfo errorInfo) {
        }
        
        private final android.content.Intent getErrorActivityIntent(android.content.Context context, org.schabi.newpipelegacy.error.ErrorInfo errorInfo) {
            return null;
        }
        
        private final void showSnackbar(android.content.Context context, android.view.View rootView, org.schabi.newpipelegacy.error.ErrorInfo errorInfo) {
        }
    }
}
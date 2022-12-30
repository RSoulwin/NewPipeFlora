package org.schabi.newpipelegacy;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0002J\"\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002\u00a8\u0006\u0015"}, d2 = {"Lorg/schabi/newpipelegacy/NewVersionWorker;", "Landroidx/work/Worker;", "context", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "checkNewVersion", "", "compareAppVersionAndShowNotification", "versionName", "", "apkLocationUrl", "versionCode", "", "doWork", "Landroidx/work/ListenableWorker$Result;", "handleResponse", "response", "Lorg/schabi/newpipe/extractor/downloader/Response;", "Companion", "app_release"})
public final class NewVersionWorker extends androidx.work.Worker {
    @org.jetbrains.annotations.NotNull()
    public static final org.schabi.newpipelegacy.NewVersionWorker.Companion Companion = null;
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = null;
    private static final java.lang.String NEWPIPE_API_URL = "https://newpipe.net/api/data.json";
    
    public NewVersionWorker(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.work.WorkerParameters workerParams) {
        super(null, null);
    }
    
    /**
     * Method to compare the current and latest available app version.
     * If a newer version is available, we show the update notification.
     *
     * @param versionName    Name of new version
     * @param apkLocationUrl Url with the new apk
     * @param versionCode    Code of new version
     */
    private final void compareAppVersionAndShowNotification(java.lang.String versionName, java.lang.String apkLocationUrl, int versionCode) {
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class, org.schabi.newpipe.extractor.exceptions.ReCaptchaException.class})
    private final void checkNewVersion() throws java.io.IOException, org.schabi.newpipe.extractor.exceptions.ReCaptchaException {
    }
    
    private final void handleResponse(org.schabi.newpipe.extractor.downloader.Response response) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.work.ListenableWorker.Result doWork() {
        return null;
    }
    
    /**
     * Start a new worker which
     * checks if all conditions for performing a version check are met,
     * fetches the API endpoint [.NEWPIPE_API_URL] containing info
     * about the latest NewPipe version
     * and displays a notification about ana available update.
     * <br></br>
     * Following conditions need to be met, before data is request from the server:
     *
     * *  The app is signed with the correct signing key (by TeamNewPipe / schabi).
     * If the signing key differs from the one used upstream, the update cannot be installed.
     * * The user enabled searching for and notifying about updates in the settings.
     * * The app did not recently check for updates.
     * We do not want to make unnecessary connections and DOS our servers.
     */
    @kotlin.jvm.JvmStatic()
    public static final void enqueueNewVersionCheckingWork(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \b*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lorg/schabi/newpipelegacy/NewVersionWorker$Companion;", "", "()V", "DEBUG", "", "NEWPIPE_API_URL", "", "TAG", "kotlin.jvm.PlatformType", "enqueueNewVersionCheckingWork", "", "context", "Landroid/content/Context;", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Start a new worker which
         * checks if all conditions for performing a version check are met,
         * fetches the API endpoint [.NEWPIPE_API_URL] containing info
         * about the latest NewPipe version
         * and displays a notification about ana available update.
         * <br></br>
         * Following conditions need to be met, before data is request from the server:
         *
         * *  The app is signed with the correct signing key (by TeamNewPipe / schabi).
         * If the signing key differs from the one used upstream, the update cannot be installed.
         * * The user enabled searching for and notifying about updates in the settings.
         * * The app did not recently check for updates.
         * We do not want to make unnecessary connections and DOS our servers.
         */
        @kotlin.jvm.JvmStatic()
        public final void enqueueNewVersionCheckingWork(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
    }
}
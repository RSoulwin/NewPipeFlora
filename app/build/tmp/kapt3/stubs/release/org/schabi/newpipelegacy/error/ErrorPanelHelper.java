package org.schabi.newpipelegacy.error;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \'2\u00020\u0001:\u0001\'B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\u0006\u0010\u0018\u001a\u00020\u0016J\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u0016H\u0002J\u001c\u0010\u001c\u001a\u00020\u00162\b\b\u0001\u0010\u001d\u001a\u00020\u001e2\b\b\u0001\u0010\u001f\u001a\u00020 H\u0002J\u000e\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020&R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lorg/schabi/newpipelegacy/error/ErrorPanelHelper;", "", "fragment", "Landroidx/fragment/app/Fragment;", "rootView", "Landroid/view/View;", "onRetry", "Ljava/lang/Runnable;", "(Landroidx/fragment/app/Fragment;Landroid/view/View;Ljava/lang/Runnable;)V", "context", "Landroid/content/Context;", "errorActionButton", "Landroid/widget/Button;", "errorDisposable", "Lio/reactivex/rxjava3/disposables/Disposable;", "errorPanelRoot", "errorRetryButton", "errorServiceExplanationTextView", "Landroid/widget/TextView;", "errorServiceInfoTextView", "errorTextView", "dispose", "", "ensureDefaultVisibility", "hide", "isVisible", "", "setRootVisible", "showAndSetErrorButtonAction", "resid", "", "listener", "Landroid/view/View$OnClickListener;", "showError", "errorInfo", "Lorg/schabi/newpipelegacy/error/ErrorInfo;", "showTextError", "errorString", "", "Companion", "app_release"})
public final class ErrorPanelHelper {
    private final androidx.fragment.app.Fragment fragment = null;
    private final android.content.Context context = null;
    private final android.view.View errorPanelRoot = null;
    private final android.widget.TextView errorTextView = null;
    private final android.widget.TextView errorServiceInfoTextView = null;
    private final android.widget.TextView errorServiceExplanationTextView = null;
    private final android.widget.Button errorActionButton = null;
    private final android.widget.Button errorRetryButton = null;
    private io.reactivex.rxjava3.disposables.Disposable errorDisposable;
    @org.jetbrains.annotations.NotNull()
    public static final org.schabi.newpipelegacy.error.ErrorPanelHelper.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = null;
    private static final boolean DEBUG = false;
    
    public ErrorPanelHelper(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    android.view.View rootView, @org.jetbrains.annotations.NotNull()
    java.lang.Runnable onRetry) {
        super();
    }
    
    private final void ensureDefaultVisibility() {
    }
    
    public final void showError(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.error.ErrorInfo errorInfo) {
    }
    
    /**
     * Shows the errorButtonAction, sets a text into it and sets the click listener.
     */
    private final void showAndSetErrorButtonAction(@androidx.annotation.StringRes()
    int resid, @androidx.annotation.Nullable()
    android.view.View.OnClickListener listener) {
    }
    
    public final void showTextError(@org.jetbrains.annotations.NotNull()
    java.lang.String errorString) {
    }
    
    private final void setRootVisible() {
    }
    
    public final void hide() {
    }
    
    public final boolean isVisible() {
        return false;
    }
    
    public final void dispose() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lorg/schabi/newpipelegacy/error/ErrorPanelHelper$Companion;", "", "()V", "DEBUG", "", "getDEBUG", "()Z", "TAG", "", "getTAG", "()Ljava/lang/String;", "getExceptionDescription", "", "throwable", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTAG() {
            return null;
        }
        
        public final boolean getDEBUG() {
            return false;
        }
        
        @androidx.annotation.StringRes()
        public final int getExceptionDescription(@org.jetbrains.annotations.Nullable()
        java.lang.Throwable throwable) {
            return 0;
        }
    }
}
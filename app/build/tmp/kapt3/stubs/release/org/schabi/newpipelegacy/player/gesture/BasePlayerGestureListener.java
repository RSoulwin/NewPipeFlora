package org.schabi.newpipelegacy.player.gesture;

import java.lang.System;

/**
 * Base gesture handling for [Player]
 *
 * This class contains the logic for the player gestures like View preparations
 * and provides some abstract methods to make it easier separating the logic from the UI.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0001/B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u000bJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H&J\u0010\u0010\"\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H&J\u0006\u0010#\u001a\u00020\u001dJ\u0010\u0010$\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!H\u0016J\u0018\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020\u001fH\u0002J\u0010\u0010\'\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010(\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010)\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020!H\u0016J\b\u0010*\u001a\u00020\u001dH\u0004J\u0018\u0010+\u001a\u00020\u00132\u0006\u0010,\u001a\u00020-2\u0006\u0010%\u001a\u00020!H\u0016J\u0010\u0010.\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!H\u0002R\u0014\u0010\u0006\u001a\u00020\u0007X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00138BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0014R\u001e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u0018X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lorg/schabi/newpipelegacy/player/gesture/BasePlayerGestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "Landroid/view/View$OnTouchListener;", "playerUi", "Lorg/schabi/newpipelegacy/player/ui/VideoPlayerUi;", "(Lorg/schabi/newpipelegacy/player/ui/VideoPlayerUi;)V", "binding", "Lorg/schabi/newpipelegacy/databinding/PlayerBinding;", "getBinding", "()Lorg/schabi/newpipelegacy/databinding/PlayerBinding;", "doubleTapControls", "Lorg/schabi/newpipelegacy/player/gesture/DoubleTapListener;", "doubleTapDelay", "", "doubleTapHandler", "Landroid/os/Handler;", "doubleTapRunnable", "Ljava/lang/Runnable;", "isDoubleTapEnabled", "", "()Z", "<set-?>", "isDoubleTapping", "player", "Lorg/schabi/newpipelegacy/player/Player;", "getPlayer", "()Lorg/schabi/newpipelegacy/player/Player;", "listener", "endMultiDoubleTap", "", "getDisplayHalfPortion", "Lorg/schabi/newpipelegacy/player/gesture/DisplayPortion;", "e", "Landroid/view/MotionEvent;", "getDisplayPortion", "keepInDoubleTapMode", "onDoubleTap", "event", "portion", "onDown", "onDownNotDoubleTapping", "onScrollEnd", "onSingleTap", "onTouch", "v", "Landroid/view/View;", "startMultiDoubleTap", "Companion", "app_release"})
public abstract class BasePlayerGestureListener extends android.view.GestureDetector.SimpleOnGestureListener implements android.view.View.OnTouchListener {
    private final org.schabi.newpipelegacy.player.ui.VideoPlayerUi playerUi = null;
    @org.jetbrains.annotations.NotNull()
    private final org.schabi.newpipelegacy.player.Player player = null;
    @org.jetbrains.annotations.NotNull()
    private final org.schabi.newpipelegacy.databinding.PlayerBinding binding = null;
    private org.schabi.newpipelegacy.player.gesture.DoubleTapListener doubleTapControls;
    private boolean isDoubleTapping = false;
    private long doubleTapDelay = 550L;
    private final android.os.Handler doubleTapHandler = null;
    private final java.lang.Runnable doubleTapRunnable = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.schabi.newpipelegacy.player.gesture.BasePlayerGestureListener.Companion Companion = null;
    private static final java.lang.String TAG = "BasePlayerGestListener";
    private static final boolean DEBUG = false;
    private static final long DOUBLE_TAP_DELAY = 550L;
    
    public BasePlayerGestureListener(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.player.ui.VideoPlayerUi playerUi) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final org.schabi.newpipelegacy.player.Player getPlayer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final org.schabi.newpipelegacy.databinding.PlayerBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public boolean onTouch(@org.jetbrains.annotations.NotNull()
    android.view.View v, @org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
    
    private final void onDoubleTap(android.view.MotionEvent event, org.schabi.newpipelegacy.player.gesture.DisplayPortion portion) {
    }
    
    protected final void onSingleTap() {
    }
    
    public void onScrollEnd(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
    }
    
    @java.lang.Override()
    public boolean onDown(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent e) {
        return false;
    }
    
    /**
     * @return true if `super.onDown(e)` should be called, false otherwise
     */
    public boolean onDownNotDoubleTapping(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent e) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onDoubleTap(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent e) {
        return false;
    }
    
    private final boolean isDoubleTapEnabled() {
        return false;
    }
    
    public final boolean isDoubleTapping() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipelegacy.player.gesture.BasePlayerGestureListener doubleTapControls(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.player.gesture.DoubleTapListener listener) {
        return null;
    }
    
    private final void startMultiDoubleTap(android.view.MotionEvent e) {
    }
    
    public final void keepInDoubleTapMode() {
    }
    
    public final void endMultiDoubleTap() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.schabi.newpipelegacy.player.gesture.DisplayPortion getDisplayPortion(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent e);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.schabi.newpipelegacy.player.gesture.DisplayPortion getDisplayHalfPortion(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent e);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/schabi/newpipelegacy/player/gesture/BasePlayerGestureListener$Companion;", "", "()V", "DEBUG", "", "DOUBLE_TAP_DELAY", "", "TAG", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
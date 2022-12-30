package org.schabi.newpipelegacy.player.gesture;

import java.lang.System;

/**
 * GestureListener for the player
 *
 * While [BasePlayerGestureListener] contains the logic behind the single gestures
 * this class focuses on the visual aspect like hiding and showing the controls or changing
 * volume/brightness during scrolling for specific events.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J(\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bH\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0018\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u000bH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lorg/schabi/newpipelegacy/player/gesture/MainPlayerGestureListener;", "Lorg/schabi/newpipelegacy/player/gesture/BasePlayerGestureListener;", "Landroid/view/View$OnTouchListener;", "playerUi", "Lorg/schabi/newpipelegacy/player/ui/MainPlayerUi;", "(Lorg/schabi/newpipelegacy/player/ui/MainPlayerUi;)V", "isMoving", "", "getDisplayHalfPortion", "Lorg/schabi/newpipelegacy/player/gesture/DisplayPortion;", "e", "Landroid/view/MotionEvent;", "getDisplayPortion", "onScroll", "initialEvent", "movingEvent", "distanceX", "", "distanceY", "onScrollBrightness", "", "onScrollEnd", "event", "onScrollVolume", "onSingleTapConfirmed", "onTouch", "v", "Landroid/view/View;", "Companion", "app_release"})
public final class MainPlayerGestureListener extends org.schabi.newpipelegacy.player.gesture.BasePlayerGestureListener implements android.view.View.OnTouchListener {
    private final org.schabi.newpipelegacy.player.ui.MainPlayerUi playerUi = null;
    private boolean isMoving = false;
    @org.jetbrains.annotations.NotNull()
    public static final org.schabi.newpipelegacy.player.gesture.MainPlayerGestureListener.Companion Companion = null;
    private static final java.lang.String TAG = null;
    private static final boolean DEBUG = false;
    private static final int MOVEMENT_THRESHOLD = 40;
    
    public MainPlayerGestureListener(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.player.ui.MainPlayerUi playerUi) {
        super(null);
    }
    
    @java.lang.Override()
    public boolean onTouch(@org.jetbrains.annotations.NotNull()
    android.view.View v, @org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onSingleTapConfirmed(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent e) {
        return false;
    }
    
    private final void onScrollVolume(float distanceY) {
    }
    
    private final void onScrollBrightness(float distanceY) {
    }
    
    @java.lang.Override()
    public void onScrollEnd(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
    }
    
    @java.lang.Override()
    public boolean onScroll(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent initialEvent, @org.jetbrains.annotations.NotNull()
    android.view.MotionEvent movingEvent, float distanceX, float distanceY) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.schabi.newpipelegacy.player.gesture.DisplayPortion getDisplayPortion(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent e) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.schabi.newpipelegacy.player.gesture.DisplayPortion getDisplayHalfPortion(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent e) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lorg/schabi/newpipelegacy/player/gesture/MainPlayerGestureListener$Companion;", "", "()V", "DEBUG", "", "MOVEMENT_THRESHOLD", "", "TAG", "", "kotlin.jvm.PlatformType", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
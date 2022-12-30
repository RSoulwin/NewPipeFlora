package org.schabi.newpipelegacy.player.gesture;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 -2\u00020\u0001:\u0001-B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0015H\u0002J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J,\u0010\u001a\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006H\u0016J\u0012\u0010\u001f\u001a\u00020 2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010!\u001a\u00020 H\u0002J\b\u0010\"\u001a\u00020 H\u0002J(\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u00062\u0006\u0010\'\u001a\u00020\u0006H\u0016J\u0010\u0010(\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\u0010\u0010)\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010*\u001a\u00020\u00102\u0006\u0010+\u001a\u00020,2\u0006\u0010\u0018\u001a\u00020\u0015H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lorg/schabi/newpipelegacy/player/gesture/PopupPlayerGestureListener;", "Lorg/schabi/newpipelegacy/player/gesture/BasePlayerGestureListener;", "playerUi", "Lorg/schabi/newpipelegacy/player/ui/PopupPlayerUi;", "(Lorg/schabi/newpipelegacy/player/ui/PopupPlayerUi;)V", "initFirstPointerX", "", "initFirstPointerY", "initPointerDistance", "", "initSecPointerX", "initSecPointerY", "initialPopupX", "", "initialPopupY", "isMoving", "", "isResizing", "getDisplayHalfPortion", "Lorg/schabi/newpipelegacy/player/gesture/DisplayPortion;", "e", "Landroid/view/MotionEvent;", "getDisplayPortion", "handleMultiDrag", "event", "onDownNotDoubleTapping", "onFling", "e1", "e2", "velocityX", "velocityY", "onLongPress", "", "onPopupResizingEnd", "onPopupResizingStart", "onScroll", "initialEvent", "movingEvent", "distanceX", "distanceY", "onScrollEnd", "onSingleTapConfirmed", "onTouch", "v", "Landroid/view/View;", "Companion", "app_release"})
public final class PopupPlayerGestureListener extends org.schabi.newpipelegacy.player.gesture.BasePlayerGestureListener {
    private final org.schabi.newpipelegacy.player.ui.PopupPlayerUi playerUi = null;
    private boolean isMoving = false;
    private int initialPopupX = -1;
    private int initialPopupY = -1;
    private boolean isResizing = false;
    private double initPointerDistance = -1.0;
    private float initFirstPointerX = -1.0F;
    private float initFirstPointerY = -1.0F;
    private float initSecPointerX = -1.0F;
    private float initSecPointerY = -1.0F;
    @org.jetbrains.annotations.NotNull()
    public static final org.schabi.newpipelegacy.player.gesture.PopupPlayerGestureListener.Companion Companion = null;
    private static final java.lang.String TAG = null;
    private static final boolean DEBUG = false;
    private static final int TOSS_FLING_VELOCITY = 2500;
    
    public PopupPlayerGestureListener(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.player.ui.PopupPlayerUi playerUi) {
        super(null);
    }
    
    @java.lang.Override()
    public boolean onTouch(@org.jetbrains.annotations.NotNull()
    android.view.View v, @org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
    
    @java.lang.Override()
    public void onScrollEnd(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
    }
    
    private final boolean handleMultiDrag(android.view.MotionEvent event) {
        return false;
    }
    
    private final void onPopupResizingStart() {
    }
    
    private final void onPopupResizingEnd() {
    }
    
    @java.lang.Override()
    public void onLongPress(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent e) {
    }
    
    @java.lang.Override()
    public boolean onFling(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent e1, @org.jetbrains.annotations.Nullable()
    android.view.MotionEvent e2, float velocityX, float velocityY) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onDownNotDoubleTapping(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent e) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onSingleTapConfirmed(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent e) {
        return false;
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lorg/schabi/newpipelegacy/player/gesture/PopupPlayerGestureListener$Companion;", "", "()V", "DEBUG", "", "TAG", "", "kotlin.jvm.PlatformType", "TOSS_FLING_VELOCITY", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
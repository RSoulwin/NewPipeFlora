package org.schabi.newpipelegacy.views.player;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0002\u001f B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bH\u0002J\b\u0010\u0018\u001a\u00020\u0016H\u0016J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\rJ\u0016\u0010\u0011\u001a\u00020\u00002\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lorg/schabi/newpipelegacy/views/player/PlayerFastSeekOverlay;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lorg/schabi/newpipelegacy/player/gesture/DoubleTapListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "circleClipTapView", "Lorg/schabi/newpipelegacy/views/player/CircleClipTapView;", "initTap", "", "performListener", "Lorg/schabi/newpipelegacy/views/player/PlayerFastSeekOverlay$PerformListener;", "rootConstraintLayout", "secondsView", "Lorg/schabi/newpipelegacy/views/player/SecondsView;", "seekSecondsSupplier", "Lkotlin/Function0;", "", "wasForwarding", "changeConstraints", "", "forward", "onDoubleTapFinished", "onDoubleTapProgressDown", "portion", "Lorg/schabi/newpipelegacy/player/gesture/DisplayPortion;", "onDoubleTapStarted", "listener", "supplier", "Companion", "PerformListener", "app_release"})
public final class PlayerFastSeekOverlay extends androidx.constraintlayout.widget.ConstraintLayout implements org.schabi.newpipelegacy.player.gesture.DoubleTapListener {
    private org.schabi.newpipelegacy.views.player.SecondsView secondsView;
    private org.schabi.newpipelegacy.views.player.CircleClipTapView circleClipTapView;
    private androidx.constraintlayout.widget.ConstraintLayout rootConstraintLayout;
    private boolean wasForwarding = false;
    private org.schabi.newpipelegacy.views.player.PlayerFastSeekOverlay.PerformListener performListener;
    private kotlin.jvm.functions.Function0<java.lang.Integer> seekSecondsSupplier;
    private boolean initTap = false;
    @org.jetbrains.annotations.NotNull()
    public static final org.schabi.newpipelegacy.views.player.PlayerFastSeekOverlay.Companion Companion = null;
    private static final java.lang.String TAG = "PlayerFastSeekOverlay";
    private static final boolean DEBUG = false;
    
    public PlayerFastSeekOverlay(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipelegacy.views.player.PlayerFastSeekOverlay performListener(@org.jetbrains.annotations.Nullable()
    org.schabi.newpipelegacy.views.player.PlayerFastSeekOverlay.PerformListener listener) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipelegacy.views.player.PlayerFastSeekOverlay seekSecondsSupplier(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<java.lang.Integer> supplier) {
        return null;
    }
    
    @java.lang.Override()
    public void onDoubleTapStarted(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.player.gesture.DisplayPortion portion) {
    }
    
    @java.lang.Override()
    public void onDoubleTapProgressDown(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.player.gesture.DisplayPortion portion) {
    }
    
    @java.lang.Override()
    public void onDoubleTapFinished() {
    }
    
    private final void changeConstraints(boolean forward) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\fJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\r"}, d2 = {"Lorg/schabi/newpipelegacy/views/player/PlayerFastSeekOverlay$PerformListener;", "", "getFastSeekDirection", "Lorg/schabi/newpipelegacy/views/player/PlayerFastSeekOverlay$PerformListener$FastSeekDirection;", "portion", "Lorg/schabi/newpipelegacy/player/gesture/DisplayPortion;", "onDoubleTap", "", "onDoubleTapEnd", "seek", "forward", "", "FastSeekDirection", "app_release"})
    public static abstract interface PerformListener {
        
        public abstract void onDoubleTap();
        
        public abstract void onDoubleTapEnd();
        
        /**
         * Determines if the playback should forward/rewind or do nothing.
         */
        @org.jetbrains.annotations.NotNull()
        @androidx.annotation.NonNull()
        public abstract org.schabi.newpipelegacy.views.player.PlayerFastSeekOverlay.PerformListener.FastSeekDirection getFastSeekDirection(@org.jetbrains.annotations.NotNull()
        org.schabi.newpipelegacy.player.gesture.DisplayPortion portion);
        
        public abstract void seek(boolean forward);
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2 = {"Lorg/schabi/newpipelegacy/views/player/PlayerFastSeekOverlay$PerformListener$FastSeekDirection;", "", "directionAsBoolean", "", "(Ljava/lang/String;ILjava/lang/Boolean;)V", "getDirectionAsBoolean", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "NONE", "FORWARD", "BACKWARD", "app_release"})
        public static enum FastSeekDirection {
            /*public static final*/ NONE /* = new NONE(null) */,
            /*public static final*/ FORWARD /* = new FORWARD(null) */,
            /*public static final*/ BACKWARD /* = new BACKWARD(null) */;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Boolean directionAsBoolean = null;
            
            FastSeekDirection(java.lang.Boolean directionAsBoolean) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Boolean getDirectionAsBoolean() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lorg/schabi/newpipelegacy/views/player/PlayerFastSeekOverlay$Companion;", "", "()V", "DEBUG", "", "TAG", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
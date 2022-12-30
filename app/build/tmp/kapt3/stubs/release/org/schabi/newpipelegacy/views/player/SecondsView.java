package org.schabi.newpipelegacy.views.player;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \'2\u00020\u0001:\u0002\'(B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010 \u001a\u00020!H\u0002J\u000e\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\bJ\b\u0010$\u001a\u00020!H\u0002J\u0006\u0010%\u001a\u00020!J\u0006\u0010&\u001a\u00020!R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u0019@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lorg/schabi/newpipelegacy/views/player/SecondsView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "animationsEnabled", "", "binding", "Lorg/schabi/newpipelegacy/databinding/PlayerFastSeekSecondsViewBinding;", "getBinding", "()Lorg/schabi/newpipelegacy/databinding/PlayerFastSeekSecondsViewBinding;", "value", "", "cycleDuration", "getCycleDuration", "()J", "setCycleDuration", "(J)V", "fifthAnimator", "Landroid/animation/ValueAnimator;", "firstAnimator", "fourthAnimator", "secondAnimator", "", "seconds", "getSeconds", "()I", "setSeconds", "(I)V", "thirdAnimator", "reset", "", "setForwarding", "isForward", "showWithoutAnimation", "startAnimation", "stopAnimation", "Companion", "CustomValueAnimator", "app_release"})
public final class SecondsView extends android.widget.LinearLayout {
    @org.jetbrains.annotations.NotNull()
    public static final org.schabi.newpipelegacy.views.player.SecondsView.Companion Companion = null;
    public static final long ICON_ANIMATION_DURATION = 750L;
    private long cycleDuration = 750L;
    private int seconds = 0;
    private final boolean animationsEnabled = false;
    @org.jetbrains.annotations.NotNull()
    private final org.schabi.newpipelegacy.databinding.PlayerFastSeekSecondsViewBinding binding = null;
    private final android.animation.ValueAnimator firstAnimator = null;
    private final android.animation.ValueAnimator secondAnimator = null;
    private final android.animation.ValueAnimator thirdAnimator = null;
    private final android.animation.ValueAnimator fourthAnimator = null;
    private final android.animation.ValueAnimator fifthAnimator = null;
    
    public SecondsView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public final long getCycleDuration() {
        return 0L;
    }
    
    public final void setCycleDuration(long value) {
    }
    
    public final int getSeconds() {
        return 0;
    }
    
    public final void setSeconds(int value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipelegacy.databinding.PlayerFastSeekSecondsViewBinding getBinding() {
        return null;
    }
    
    public final void setForwarding(boolean isForward) {
    }
    
    public final void startAnimation() {
    }
    
    public final void stopAnimation() {
    }
    
    private final void reset() {
    }
    
    private final void showWithoutAnimation() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001BD\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012!\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00040\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\f\u00a8\u0006\r"}, d2 = {"Lorg/schabi/newpipelegacy/views/player/SecondsView$CustomValueAnimator;", "Landroid/animation/ValueAnimator;", "start", "Lkotlin/Function0;", "", "update", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "value", "end", "(Lorg/schabi/newpipelegacy/views/player/SecondsView;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "app_release"})
    final class CustomValueAnimator extends android.animation.ValueAnimator {
        
        public CustomValueAnimator(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> start, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> update, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> end) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/schabi/newpipelegacy/views/player/SecondsView$Companion;", "", "()V", "ICON_ANIMATION_DURATION", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
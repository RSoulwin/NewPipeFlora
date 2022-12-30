package org.schabi.newpipelegacy.ktx;

import java.lang.System;

@kotlin.jvm.JvmName(name = "ViewUtils")
@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000D\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0000\u001a<\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0007\u001a.\u0010\u000e\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002\u001a&\u0010\u000f\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u0011\u001a\u001a\u0010\u0013\u001a\u00020\u0014*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0011\u001a\n\u0010\u0016\u001a\u00020\u0003*\u00020\u0004\u001a.\u0010\u0017\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002\u001a.\u0010\u0018\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002\u001a\u001a\u0010\u0019\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0011\u001a.\u0010\u001b\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002\u001a.\u0010\u001c\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002\u001a4\u0010\u001d\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0003\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"TAG", "", "animate", "", "Landroid/view/View;", "enterOrExit", "", "duration", "", "animationType", "Lorg/schabi/newpipelegacy/ktx/AnimationType;", "delay", "execOnEnd", "Ljava/lang/Runnable;", "animateAlpha", "animateBackgroundColor", "colorStart", "", "colorEnd", "animateHeight", "Landroid/animation/ValueAnimator;", "targetHeight", "animateHideRecyclerViewAllowingScrolling", "animateLightScaleAndAlpha", "animateLightSlideAndAlpha", "animateRotation", "targetRotation", "animateScaleAndAlpha", "animateSlideAndAlpha", "slideUp", "translationPercent", "", "app_release"})
public final class ViewUtils {
    private static final java.lang.String TAG = "ViewUtils";
    
    /**
     * Animate the view.
     *
     * @param enterOrExit   true to enter, false to exit
     * @param duration      how long the animation will take, in milliseconds
     * @param animationType Type of the animation
     * @param delay         how long the animation will wait to start, in milliseconds
     * @param execOnEnd     runnable that will be executed when the animation ends
     */
    @kotlin.jvm.JvmOverloads()
    public static final void animate(@org.jetbrains.annotations.NotNull()
    android.view.View $this$animate, boolean enterOrExit, long duration) {
    }
    
    /**
     * Animate the view.
     *
     * @param enterOrExit   true to enter, false to exit
     * @param duration      how long the animation will take, in milliseconds
     * @param animationType Type of the animation
     * @param delay         how long the animation will wait to start, in milliseconds
     * @param execOnEnd     runnable that will be executed when the animation ends
     */
    @kotlin.jvm.JvmOverloads()
    public static final void animate(@org.jetbrains.annotations.NotNull()
    android.view.View $this$animate, boolean enterOrExit, long duration, @org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.ktx.AnimationType animationType) {
    }
    
    /**
     * Animate the view.
     *
     * @param enterOrExit   true to enter, false to exit
     * @param duration      how long the animation will take, in milliseconds
     * @param animationType Type of the animation
     * @param delay         how long the animation will wait to start, in milliseconds
     * @param execOnEnd     runnable that will be executed when the animation ends
     */
    @kotlin.jvm.JvmOverloads()
    public static final void animate(@org.jetbrains.annotations.NotNull()
    android.view.View $this$animate, boolean enterOrExit, long duration, @org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.ktx.AnimationType animationType, long delay) {
    }
    
    /**
     * Animate the view.
     *
     * @param enterOrExit   true to enter, false to exit
     * @param duration      how long the animation will take, in milliseconds
     * @param animationType Type of the animation
     * @param delay         how long the animation will wait to start, in milliseconds
     * @param execOnEnd     runnable that will be executed when the animation ends
     */
    @kotlin.jvm.JvmOverloads()
    public static final void animate(@org.jetbrains.annotations.NotNull()
    android.view.View $this$animate, boolean enterOrExit, long duration, @org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.ktx.AnimationType animationType, long delay, @org.jetbrains.annotations.Nullable()
    java.lang.Runnable execOnEnd) {
    }
    
    /**
     * Animate the background color of a view.
     *
     * @param duration   the duration of the animation
     * @param colorStart the background color to start with
     * @param colorEnd   the background color to end with
     */
    public static final void animateBackgroundColor(@org.jetbrains.annotations.NotNull()
    android.view.View $this$animateBackgroundColor, long duration, @androidx.annotation.ColorInt()
    int colorStart, @androidx.annotation.ColorInt()
    int colorEnd) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.animation.ValueAnimator animateHeight(@org.jetbrains.annotations.NotNull()
    android.view.View $this$animateHeight, long duration, int targetHeight) {
        return null;
    }
    
    public static final void animateRotation(@org.jetbrains.annotations.NotNull()
    android.view.View $this$animateRotation, long duration, int targetRotation) {
    }
    
    private static final void animateAlpha(android.view.View $this$animateAlpha, boolean enterOrExit, long duration, long delay, java.lang.Runnable execOnEnd) {
    }
    
    private static final void animateScaleAndAlpha(android.view.View $this$animateScaleAndAlpha, boolean enterOrExit, long duration, long delay, java.lang.Runnable execOnEnd) {
    }
    
    private static final void animateLightScaleAndAlpha(android.view.View $this$animateLightScaleAndAlpha, boolean enterOrExit, long duration, long delay, java.lang.Runnable execOnEnd) {
    }
    
    private static final void animateSlideAndAlpha(android.view.View $this$animateSlideAndAlpha, boolean enterOrExit, long duration, long delay, java.lang.Runnable execOnEnd) {
    }
    
    private static final void animateLightSlideAndAlpha(android.view.View $this$animateLightSlideAndAlpha, boolean enterOrExit, long duration, long delay, java.lang.Runnable execOnEnd) {
    }
    
    @kotlin.jvm.JvmOverloads()
    public static final void slideUp(@org.jetbrains.annotations.NotNull()
    android.view.View $this$slideUp, long duration) {
    }
    
    @kotlin.jvm.JvmOverloads()
    public static final void slideUp(@org.jetbrains.annotations.NotNull()
    android.view.View $this$slideUp, long duration, long delay) {
    }
    
    @kotlin.jvm.JvmOverloads()
    public static final void slideUp(@org.jetbrains.annotations.NotNull()
    android.view.View $this$slideUp, long duration, long delay, @androidx.annotation.FloatRange(from = 0.0, to = 1.0)
    float translationPercent) {
    }
    
    @kotlin.jvm.JvmOverloads()
    public static final void slideUp(@org.jetbrains.annotations.NotNull()
    android.view.View $this$slideUp, long duration, long delay, @androidx.annotation.FloatRange(from = 0.0, to = 1.0)
    float translationPercent, @org.jetbrains.annotations.Nullable()
    java.lang.Runnable execOnEnd) {
    }
    
    /**
     * Instead of hiding normally using [animate], which would make
     * the recycler view unable to capture touches after being hidden, this just animates the alpha
     * value setting it to `0.0` after `200` milliseconds.
     */
    public static final void animateHideRecyclerViewAllowingScrolling(@org.jetbrains.annotations.NotNull()
    android.view.View $this$animateHideRecyclerViewAllowingScrolling) {
    }
}
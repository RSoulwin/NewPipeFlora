package org.schabi.newpipelegacy.player.gesture;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lorg/schabi/newpipelegacy/player/gesture/DoubleTapListener;", "", "onDoubleTapFinished", "", "onDoubleTapProgressDown", "portion", "Lorg/schabi/newpipelegacy/player/gesture/DisplayPortion;", "onDoubleTapStarted", "app_release"})
public abstract interface DoubleTapListener {
    
    public abstract void onDoubleTapStarted(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.player.gesture.DisplayPortion portion);
    
    public abstract void onDoubleTapProgressDown(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.player.gesture.DisplayPortion portion);
    
    public abstract void onDoubleTapFinished();
}
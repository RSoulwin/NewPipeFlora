package org.schabi.newpipelegacy.ktx;

import java.lang.System;

@kotlin.jvm.JvmName(name = "ExceptionUtils")
@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001b\u0010\u0005\u001a\u00020\u0001\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u0002*\u0004\u0018\u00010\u0002H\u0086\b\u001a-\u0010\u0005\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\u001a\u0010\u0007\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\t0\b\"\u0006\u0012\u0002\b\u00030\t\u00a2\u0006\u0002\u0010\n\u001a8\u0010\u000b\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u00012\u001a\u0010\u0007\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\t0\b\"\u0006\u0012\u0002\b\u00030\tH\u0086\u0010\u00a2\u0006\u0002\u0010\r\u001a\u0019\u0010\u000e\u001a\u00020\u0001\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u0002*\u00020\u0002H\u0086\b\u001a+\u0010\u000e\u001a\u00020\u0001*\u00020\u00022\u001a\u0010\u0007\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\t0\b\"\u0006\u0012\u0002\b\u00030\t\u00a2\u0006\u0002\u0010\n\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0003\u00a8\u0006\u000f"}, d2 = {"isInterruptedCaused", "", "", "(Ljava/lang/Throwable;)Z", "isNetworkRelated", "hasAssignableCause", "T", "causesToCheck", "", "Ljava/lang/Class;", "(Ljava/lang/Throwable;[Ljava/lang/Class;)Z", "hasCause", "checkSubtypes", "(Ljava/lang/Throwable;Z[Ljava/lang/Class;)Z", "hasExactCause", "app_release"})
public final class ExceptionUtils {
    
    public static final boolean isInterruptedCaused(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable $this$isInterruptedCaused) {
        return false;
    }
    
    public static final boolean isNetworkRelated(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable $this$isNetworkRelated) {
        return false;
    }
    
    /**
     * Calls [hasCause] with the `checkSubtypes` parameter set to false.
     */
    public static final boolean hasExactCause(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable $this$hasExactCause, @org.jetbrains.annotations.NotNull()
    java.lang.Class<?>... causesToCheck) {
        return false;
    }
    
    /**
     * Calls [hasCause] with the `checkSubtypes` parameter set to true.
     */
    public static final boolean hasAssignableCause(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable $this$hasAssignableCause, @org.jetbrains.annotations.NotNull()
    java.lang.Class<?>... causesToCheck) {
        return false;
    }
    
    /**
     * Check if the throwable has some cause from the causes to check, or is itself in it.
     *
     * If `checkIfAssignable` is true, not only the exact type will be considered equals, but also its subtypes.
     *
     * @param checkSubtypes if subtypes are also checked.
     * @param causesToCheck an array of causes to check.
     *
     * @see Class.isAssignableFrom
     */
    public static final boolean hasCause(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable $this$hasCause, boolean checkSubtypes, @org.jetbrains.annotations.NotNull()
    java.lang.Class<?>... causesToCheck) {
        return false;
    }
}
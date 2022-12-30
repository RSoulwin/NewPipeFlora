package org.schabi.newpipelegacy.local.feed;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lorg/schabi/newpipelegacy/local/feed/FeedState;", "", "()V", "ErrorState", "LoadedState", "ProgressState", "Lorg/schabi/newpipelegacy/local/feed/FeedState$ProgressState;", "Lorg/schabi/newpipelegacy/local/feed/FeedState$LoadedState;", "Lorg/schabi/newpipelegacy/local/feed/FeedState$ErrorState;", "app_release"})
public abstract class FeedState {
    
    private FeedState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0016"}, d2 = {"Lorg/schabi/newpipelegacy/local/feed/FeedState$ProgressState;", "Lorg/schabi/newpipelegacy/local/feed/FeedState;", "currentProgress", "", "maxProgress", "progressMessage", "(III)V", "getCurrentProgress", "()I", "getMaxProgress", "getProgressMessage", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_release"})
    public static final class ProgressState extends org.schabi.newpipelegacy.local.feed.FeedState {
        private final int currentProgress = 0;
        private final int maxProgress = 0;
        private final int progressMessage = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final org.schabi.newpipelegacy.local.feed.FeedState.ProgressState copy(int currentProgress, int maxProgress, @androidx.annotation.StringRes()
        int progressMessage) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ProgressState() {
            super();
        }
        
        public ProgressState(int currentProgress, int maxProgress, @androidx.annotation.StringRes()
        int progressMessage) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getCurrentProgress() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getMaxProgress() {
            return 0;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int getProgressMessage() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u00a2\u0006\u0002\u0010\u000bJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\bH\u00c6\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H\u00c6\u0003J?\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006 "}, d2 = {"Lorg/schabi/newpipelegacy/local/feed/FeedState$LoadedState;", "Lorg/schabi/newpipelegacy/local/feed/FeedState;", "items", "", "Lorg/schabi/newpipelegacy/local/feed/item/StreamItem;", "oldestUpdate", "Ljava/time/OffsetDateTime;", "notLoadedCount", "", "itemsErrors", "", "(Ljava/util/List;Ljava/time/OffsetDateTime;JLjava/util/List;)V", "getItems", "()Ljava/util/List;", "getItemsErrors", "getNotLoadedCount", "()J", "getOldestUpdate", "()Ljava/time/OffsetDateTime;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"})
    public static final class LoadedState extends org.schabi.newpipelegacy.local.feed.FeedState {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<org.schabi.newpipelegacy.local.feed.item.StreamItem> items = null;
        @org.jetbrains.annotations.Nullable()
        private final java.time.OffsetDateTime oldestUpdate = null;
        private final long notLoadedCount = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.Throwable> itemsErrors = null;
        
        @org.jetbrains.annotations.NotNull()
        public final org.schabi.newpipelegacy.local.feed.FeedState.LoadedState copy(@org.jetbrains.annotations.NotNull()
        java.util.List<org.schabi.newpipelegacy.local.feed.item.StreamItem> items, @org.jetbrains.annotations.Nullable()
        java.time.OffsetDateTime oldestUpdate, long notLoadedCount, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends java.lang.Throwable> itemsErrors) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public LoadedState(@org.jetbrains.annotations.NotNull()
        java.util.List<org.schabi.newpipelegacy.local.feed.item.StreamItem> items, @org.jetbrains.annotations.Nullable()
        java.time.OffsetDateTime oldestUpdate, long notLoadedCount, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends java.lang.Throwable> itemsErrors) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.schabi.newpipelegacy.local.feed.item.StreamItem> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.schabi.newpipelegacy.local.feed.item.StreamItem> getItems() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.time.OffsetDateTime component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.time.OffsetDateTime getOldestUpdate() {
            return null;
        }
        
        public final long component3() {
            return 0L;
        }
        
        public final long getNotLoadedCount() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Throwable> component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Throwable> getItemsErrors() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lorg/schabi/newpipelegacy/local/feed/FeedState$ErrorState;", "Lorg/schabi/newpipelegacy/local/feed/FeedState;", "error", "", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"})
    public static final class ErrorState extends org.schabi.newpipelegacy.local.feed.FeedState {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Throwable error = null;
        
        @org.jetbrains.annotations.NotNull()
        public final org.schabi.newpipelegacy.local.feed.FeedState.ErrorState copy(@org.jetbrains.annotations.Nullable()
        java.lang.Throwable error) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ErrorState() {
            super();
        }
        
        public ErrorState(@org.jetbrains.annotations.Nullable()
        java.lang.Throwable error) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Throwable component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Throwable getError() {
            return null;
        }
    }
}
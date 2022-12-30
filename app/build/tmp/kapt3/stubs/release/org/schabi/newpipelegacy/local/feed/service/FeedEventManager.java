package org.schabi.newpipelegacy.local.feed.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005J\u0006\u0010\u0010\u001a\u00020\u000eR<\u0010\u0003\u001a0\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0017\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u0004\u00a2\u0006\u0002\b\u00070\u0004\u00a2\u0006\u0002\b\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lorg/schabi/newpipelegacy/local/feed/service/FeedEventManager;", "", "()V", "eventsFlowable", "Lio/reactivex/rxjava3/core/Flowable;", "Lorg/schabi/newpipelegacy/local/feed/service/FeedEventManager$Event;", "kotlin.jvm.PlatformType", "Lio/reactivex/rxjava3/annotations/NonNull;", "ignoreUpstream", "Ljava/util/concurrent/atomic/AtomicBoolean;", "processor", "Lio/reactivex/rxjava3/processors/BehaviorProcessor;", "events", "postEvent", "", "event", "reset", "Event", "app_release"})
public final class FeedEventManager {
    @org.jetbrains.annotations.NotNull()
    public static final org.schabi.newpipelegacy.local.feed.service.FeedEventManager INSTANCE = null;
    private static io.reactivex.rxjava3.processors.BehaviorProcessor<org.schabi.newpipelegacy.local.feed.service.FeedEventManager.Event> processor;
    private static java.util.concurrent.atomic.AtomicBoolean ignoreUpstream;
    private static io.reactivex.rxjava3.core.Flowable<org.schabi.newpipelegacy.local.feed.service.FeedEventManager.Event> eventsFlowable;
    
    private FeedEventManager() {
        super();
    }
    
    public final void postEvent(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.local.feed.service.FeedEventManager.Event event) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Flowable<org.schabi.newpipelegacy.local.feed.service.FeedEventManager.Event> events() {
        return null;
    }
    
    public final void reset() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lorg/schabi/newpipelegacy/local/feed/service/FeedEventManager$Event;", "", "()V", "ErrorResultEvent", "IdleEvent", "ProgressEvent", "SuccessResultEvent", "Lorg/schabi/newpipelegacy/local/feed/service/FeedEventManager$Event$IdleEvent;", "Lorg/schabi/newpipelegacy/local/feed/service/FeedEventManager$Event$ProgressEvent;", "Lorg/schabi/newpipelegacy/local/feed/service/FeedEventManager$Event$SuccessResultEvent;", "Lorg/schabi/newpipelegacy/local/feed/service/FeedEventManager$Event$ErrorResultEvent;", "app_release"})
    public static abstract class Event {
        
        private Event() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lorg/schabi/newpipelegacy/local/feed/service/FeedEventManager$Event$IdleEvent;", "Lorg/schabi/newpipelegacy/local/feed/service/FeedEventManager$Event;", "()V", "app_release"})
        public static final class IdleEvent extends org.schabi.newpipelegacy.local.feed.service.FeedEventManager.Event {
            @org.jetbrains.annotations.NotNull()
            public static final org.schabi.newpipelegacy.local.feed.service.FeedEventManager.Event.IdleEvent INSTANCE = null;
            
            private IdleEvent() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B#\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t\u00a8\u0006\u0017"}, d2 = {"Lorg/schabi/newpipelegacy/local/feed/service/FeedEventManager$Event$ProgressEvent;", "Lorg/schabi/newpipelegacy/local/feed/service/FeedEventManager$Event;", "progressMessage", "", "(I)V", "currentProgress", "maxProgress", "(III)V", "getCurrentProgress", "()I", "getMaxProgress", "getProgressMessage", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_release"})
        public static final class ProgressEvent extends org.schabi.newpipelegacy.local.feed.service.FeedEventManager.Event {
            private final int currentProgress = 0;
            private final int maxProgress = 0;
            private final int progressMessage = 0;
            
            @org.jetbrains.annotations.NotNull()
            public final org.schabi.newpipelegacy.local.feed.service.FeedEventManager.Event.ProgressEvent copy(int currentProgress, int maxProgress, @androidx.annotation.StringRes()
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
            
            public ProgressEvent() {
                super();
            }
            
            public ProgressEvent(int currentProgress, int maxProgress, @androidx.annotation.StringRes()
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
            
            public ProgressEvent(@androidx.annotation.StringRes()
            int progressMessage) {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lorg/schabi/newpipelegacy/local/feed/service/FeedEventManager$Event$SuccessResultEvent;", "Lorg/schabi/newpipelegacy/local/feed/service/FeedEventManager$Event;", "itemsErrors", "", "", "(Ljava/util/List;)V", "getItemsErrors", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"})
        public static final class SuccessResultEvent extends org.schabi.newpipelegacy.local.feed.service.FeedEventManager.Event {
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<java.lang.Throwable> itemsErrors = null;
            
            @org.jetbrains.annotations.NotNull()
            public final org.schabi.newpipelegacy.local.feed.service.FeedEventManager.Event.SuccessResultEvent copy(@org.jetbrains.annotations.NotNull()
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
            
            public SuccessResultEvent() {
                super();
            }
            
            public SuccessResultEvent(@org.jetbrains.annotations.NotNull()
            java.util.List<? extends java.lang.Throwable> itemsErrors) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<java.lang.Throwable> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<java.lang.Throwable> getItemsErrors() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lorg/schabi/newpipelegacy/local/feed/service/FeedEventManager$Event$ErrorResultEvent;", "Lorg/schabi/newpipelegacy/local/feed/service/FeedEventManager$Event;", "error", "", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"})
        public static final class ErrorResultEvent extends org.schabi.newpipelegacy.local.feed.service.FeedEventManager.Event {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.Throwable error = null;
            
            @org.jetbrains.annotations.NotNull()
            public final org.schabi.newpipelegacy.local.feed.service.FeedEventManager.Event.ErrorResultEvent copy(@org.jetbrains.annotations.NotNull()
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
            
            public ErrorResultEvent(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable error) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable getError() {
                return null;
            }
        }
    }
}
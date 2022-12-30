package org.schabi.newpipelegacy.local.feed;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 )2\u00020\u0001:\u0004\'()*B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\u001d\u001a\u00020\u0007J\u0006\u0010\u001e\u001a\u00020\u0007J\b\u0010\u001f\u001a\u00020 H\u0014J\u000e\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0007J\u000e\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\u0007J\u000e\u0010%\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0007J\u000e\u0010&\u001a\u00020 2\u0006\u0010$\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\n\u001a\u0014 \r*\t\u0018\u00010\u000b\u00a2\u0006\u0002\b\f0\u000b\u00a2\u0006\u0002\b\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R<\u0010\u0017\u001a0\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00070\u0007 \r*\u0017\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u0018\u00a2\u0006\u0002\b\f0\u0018\u00a2\u0006\u0002\b\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R<\u0010\u0019\u001a0\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00070\u0007 \r*\u0017\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u001a\u00a2\u0006\u0002\b\f0\u001a\u00a2\u0006\u0002\b\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R<\u0010\u001b\u001a0\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00070\u0007 \r*\u0017\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u0018\u00a2\u0006\u0002\b\f0\u0018\u00a2\u0006\u0002\b\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R<\u0010\u001c\u001a0\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00070\u0007 \r*\u0017\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u001a\u00a2\u0006\u0002\b\f0\u001a\u00a2\u0006\u0002\b\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lorg/schabi/newpipelegacy/local/feed/FeedViewModel;", "Landroidx/lifecycle/ViewModel;", "applicationContext", "Landroid/content/Context;", "groupId", "", "initialShowPlayedItems", "", "initialShowFutureItems", "(Landroid/content/Context;JZZ)V", "combineDisposable", "Lio/reactivex/rxjava3/disposables/Disposable;", "Lio/reactivex/rxjava3/annotations/NonNull;", "kotlin.jvm.PlatformType", "feedDatabaseManager", "Lorg/schabi/newpipelegacy/local/feed/FeedDatabaseManager;", "mutableStateLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lorg/schabi/newpipelegacy/local/feed/FeedState;", "stateLiveData", "Landroidx/lifecycle/LiveData;", "getStateLiveData", "()Landroidx/lifecycle/LiveData;", "toggleShowFutureItems", "Lio/reactivex/rxjava3/processors/BehaviorProcessor;", "toggleShowFutureItemsFlowable", "Lio/reactivex/rxjava3/core/Flowable;", "toggleShowPlayedItems", "toggleShowPlayedItemsFlowable", "getShowFutureItemsFromPreferences", "getShowPlayedItemsFromPreferences", "onCleared", "", "saveShowFutureItemsToPreferences", "showFutureItems", "saveShowPlayedItemsToPreferences", "showPlayedItems", "toggleFutureItems", "togglePlayedItems", "CombineResultDataHolder", "CombineResultEventHolder", "Companion", "Factory", "app_release"})
public final class FeedViewModel extends androidx.lifecycle.ViewModel {
    private final android.content.Context applicationContext = null;
    private org.schabi.newpipelegacy.local.feed.FeedDatabaseManager feedDatabaseManager;
    private final io.reactivex.rxjava3.processors.BehaviorProcessor<java.lang.Boolean> toggleShowPlayedItems = null;
    private final io.reactivex.rxjava3.core.Flowable<java.lang.Boolean> toggleShowPlayedItemsFlowable = null;
    private final io.reactivex.rxjava3.processors.BehaviorProcessor<java.lang.Boolean> toggleShowFutureItems = null;
    private final io.reactivex.rxjava3.core.Flowable<java.lang.Boolean> toggleShowFutureItemsFlowable = null;
    private final androidx.lifecycle.MutableLiveData<org.schabi.newpipelegacy.local.feed.FeedState> mutableStateLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<org.schabi.newpipelegacy.local.feed.FeedState> stateLiveData = null;
    private io.reactivex.rxjava3.disposables.Disposable combineDisposable;
    @org.jetbrains.annotations.NotNull()
    public static final org.schabi.newpipelegacy.local.feed.FeedViewModel.Companion Companion = null;
    
    public FeedViewModel(@org.jetbrains.annotations.NotNull()
    android.content.Context applicationContext, long groupId, boolean initialShowPlayedItems, boolean initialShowFutureItems) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.schabi.newpipelegacy.local.feed.FeedState> getStateLiveData() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void togglePlayedItems(boolean showPlayedItems) {
    }
    
    public final void saveShowPlayedItemsToPreferences(boolean showPlayedItems) {
    }
    
    public final boolean getShowPlayedItemsFromPreferences() {
        return false;
    }
    
    public final void toggleFutureItems(boolean showFutureItems) {
    }
    
    public final void saveShowFutureItemsToPreferences(boolean showFutureItems) {
    }
    
    public final boolean getShowFutureItemsFromPreferences() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\bH\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nH\u00c6\u0003J=\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006!"}, d2 = {"Lorg/schabi/newpipelegacy/local/feed/FeedViewModel$CombineResultEventHolder;", "", "t1", "Lorg/schabi/newpipelegacy/local/feed/service/FeedEventManager$Event;", "t2", "", "t3", "t4", "", "t5", "Ljava/time/OffsetDateTime;", "(Lorg/schabi/newpipelegacy/local/feed/service/FeedEventManager$Event;ZZJLjava/time/OffsetDateTime;)V", "getT1", "()Lorg/schabi/newpipelegacy/local/feed/service/FeedEventManager$Event;", "getT2", "()Z", "getT3", "getT4", "()J", "getT5", "()Ljava/time/OffsetDateTime;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "app_release"})
    static final class CombineResultEventHolder {
        @org.jetbrains.annotations.NotNull()
        private final org.schabi.newpipelegacy.local.feed.service.FeedEventManager.Event t1 = null;
        private final boolean t2 = false;
        private final boolean t3 = false;
        private final long t4 = 0L;
        @org.jetbrains.annotations.Nullable()
        private final java.time.OffsetDateTime t5 = null;
        
        @org.jetbrains.annotations.NotNull()
        public final org.schabi.newpipelegacy.local.feed.FeedViewModel.CombineResultEventHolder copy(@org.jetbrains.annotations.NotNull()
        org.schabi.newpipelegacy.local.feed.service.FeedEventManager.Event t1, boolean t2, boolean t3, long t4, @org.jetbrains.annotations.Nullable()
        java.time.OffsetDateTime t5) {
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
        
        public CombineResultEventHolder(@org.jetbrains.annotations.NotNull()
        org.schabi.newpipelegacy.local.feed.service.FeedEventManager.Event t1, boolean t2, boolean t3, long t4, @org.jetbrains.annotations.Nullable()
        java.time.OffsetDateTime t5) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.schabi.newpipelegacy.local.feed.service.FeedEventManager.Event component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.schabi.newpipelegacy.local.feed.service.FeedEventManager.Event getT1() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean getT2() {
            return false;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean getT3() {
            return false;
        }
        
        public final long component4() {
            return 0L;
        }
        
        public final long getT4() {
            return 0L;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.time.OffsetDateTime component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.time.OffsetDateTime getT5() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\bH\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\nH\u00c6\u0003J9\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006 "}, d2 = {"Lorg/schabi/newpipelegacy/local/feed/FeedViewModel$CombineResultDataHolder;", "", "t1", "Lorg/schabi/newpipelegacy/local/feed/service/FeedEventManager$Event;", "t2", "", "Lorg/schabi/newpipelegacy/database/stream/StreamWithState;", "t3", "", "t4", "Ljava/time/OffsetDateTime;", "(Lorg/schabi/newpipelegacy/local/feed/service/FeedEventManager$Event;Ljava/util/List;JLjava/time/OffsetDateTime;)V", "getT1", "()Lorg/schabi/newpipelegacy/local/feed/service/FeedEventManager$Event;", "getT2", "()Ljava/util/List;", "getT3", "()J", "getT4", "()Ljava/time/OffsetDateTime;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"})
    static final class CombineResultDataHolder {
        @org.jetbrains.annotations.NotNull()
        private final org.schabi.newpipelegacy.local.feed.service.FeedEventManager.Event t1 = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<org.schabi.newpipelegacy.database.stream.StreamWithState> t2 = null;
        private final long t3 = 0L;
        @org.jetbrains.annotations.Nullable()
        private final java.time.OffsetDateTime t4 = null;
        
        @org.jetbrains.annotations.NotNull()
        public final org.schabi.newpipelegacy.local.feed.FeedViewModel.CombineResultDataHolder copy(@org.jetbrains.annotations.NotNull()
        org.schabi.newpipelegacy.local.feed.service.FeedEventManager.Event t1, @org.jetbrains.annotations.NotNull()
        java.util.List<org.schabi.newpipelegacy.database.stream.StreamWithState> t2, long t3, @org.jetbrains.annotations.Nullable()
        java.time.OffsetDateTime t4) {
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
        
        public CombineResultDataHolder(@org.jetbrains.annotations.NotNull()
        org.schabi.newpipelegacy.local.feed.service.FeedEventManager.Event t1, @org.jetbrains.annotations.NotNull()
        java.util.List<org.schabi.newpipelegacy.database.stream.StreamWithState> t2, long t3, @org.jetbrains.annotations.Nullable()
        java.time.OffsetDateTime t4) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.schabi.newpipelegacy.local.feed.service.FeedEventManager.Event component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.schabi.newpipelegacy.local.feed.service.FeedEventManager.Event getT1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.schabi.newpipelegacy.database.stream.StreamWithState> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.schabi.newpipelegacy.database.stream.StreamWithState> getT2() {
            return null;
        }
        
        public final long component3() {
            return 0L;
        }
        
        public final long getT3() {
            return 0L;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.time.OffsetDateTime component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.time.OffsetDateTime getT4() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\'\u0010\u0007\u001a\u0002H\b\"\n\b\u0000\u0010\b*\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lorg/schabi/newpipelegacy/local/feed/FeedViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "context", "Landroid/content/Context;", "groupId", "", "(Landroid/content/Context;J)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_release"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final android.content.Context context = null;
        private final long groupId = 0L;
        
        public Factory(@org.jetbrains.annotations.NotNull()
        android.content.Context context, long groupId) {
            super();
        }
        
        @kotlin.Suppress(names = {"UNCHECKED_CAST"})
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u00a8\u0006\b"}, d2 = {"Lorg/schabi/newpipelegacy/local/feed/FeedViewModel$Companion;", "", "()V", "getShowFutureItemsFromPreferences", "", "context", "Landroid/content/Context;", "getShowPlayedItemsFromPreferences", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final boolean getShowPlayedItemsFromPreferences(android.content.Context context) {
            return false;
        }
        
        private final boolean getShowFutureItemsFromPreferences(android.content.Context context) {
            return false;
        }
    }
}
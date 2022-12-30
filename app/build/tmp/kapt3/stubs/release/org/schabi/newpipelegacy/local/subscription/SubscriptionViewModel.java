package org.schabi.newpipelegacy.local.subscription;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001cB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001a\u001a\u00020\u001bH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014 \n*\t\u0018\u00010\b\u00a2\u0006\u0002\b\t0\b\u00a2\u0006\u0002\b\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0015\u001a\u0014 \n*\t\u0018\u00010\b\u00a2\u0006\u0002\b\t0\b\u00a2\u0006\u0002\b\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lorg/schabi/newpipelegacy/local/subscription/SubscriptionViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "feedDatabaseManager", "Lorg/schabi/newpipelegacy/local/feed/FeedDatabaseManager;", "feedGroupItemsDisposable", "Lio/reactivex/rxjava3/disposables/Disposable;", "Lio/reactivex/rxjava3/annotations/NonNull;", "kotlin.jvm.PlatformType", "feedGroupsLiveData", "Landroidx/lifecycle/LiveData;", "", "Lcom/xwray/groupie/Group;", "getFeedGroupsLiveData", "()Landroidx/lifecycle/LiveData;", "mutableFeedGroupsLiveData", "Landroidx/lifecycle/MutableLiveData;", "mutableStateLiveData", "Lorg/schabi/newpipelegacy/local/subscription/SubscriptionViewModel$SubscriptionState;", "stateItemsDisposable", "stateLiveData", "getStateLiveData", "subscriptionManager", "Lorg/schabi/newpipelegacy/local/subscription/SubscriptionManager;", "onCleared", "", "SubscriptionState", "app_release"})
public final class SubscriptionViewModel extends androidx.lifecycle.AndroidViewModel {
    private org.schabi.newpipelegacy.local.feed.FeedDatabaseManager feedDatabaseManager;
    private org.schabi.newpipelegacy.local.subscription.SubscriptionManager subscriptionManager;
    private final androidx.lifecycle.MutableLiveData<org.schabi.newpipelegacy.local.subscription.SubscriptionViewModel.SubscriptionState> mutableStateLiveData = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.xwray.groupie.Group>> mutableFeedGroupsLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<org.schabi.newpipelegacy.local.subscription.SubscriptionViewModel.SubscriptionState> stateLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.xwray.groupie.Group>> feedGroupsLiveData = null;
    private io.reactivex.rxjava3.disposables.Disposable feedGroupItemsDisposable;
    private io.reactivex.rxjava3.disposables.Disposable stateItemsDisposable;
    
    public SubscriptionViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.schabi.newpipelegacy.local.subscription.SubscriptionViewModel.SubscriptionState> getStateLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.xwray.groupie.Group>> getFeedGroupsLiveData() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/schabi/newpipelegacy/local/subscription/SubscriptionViewModel$SubscriptionState;", "", "()V", "ErrorState", "LoadedState", "Lorg/schabi/newpipelegacy/local/subscription/SubscriptionViewModel$SubscriptionState$LoadedState;", "Lorg/schabi/newpipelegacy/local/subscription/SubscriptionViewModel$SubscriptionState$ErrorState;", "app_release"})
    public static abstract class SubscriptionState {
        
        private SubscriptionState() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lorg/schabi/newpipelegacy/local/subscription/SubscriptionViewModel$SubscriptionState$LoadedState;", "Lorg/schabi/newpipelegacy/local/subscription/SubscriptionViewModel$SubscriptionState;", "subscriptions", "", "Lcom/xwray/groupie/Group;", "(Ljava/util/List;)V", "getSubscriptions", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"})
        public static final class LoadedState extends org.schabi.newpipelegacy.local.subscription.SubscriptionViewModel.SubscriptionState {
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<com.xwray.groupie.Group> subscriptions = null;
            
            @org.jetbrains.annotations.NotNull()
            public final org.schabi.newpipelegacy.local.subscription.SubscriptionViewModel.SubscriptionState.LoadedState copy(@org.jetbrains.annotations.NotNull()
            java.util.List<? extends com.xwray.groupie.Group> subscriptions) {
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
            java.util.List<? extends com.xwray.groupie.Group> subscriptions) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.xwray.groupie.Group> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.xwray.groupie.Group> getSubscriptions() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lorg/schabi/newpipelegacy/local/subscription/SubscriptionViewModel$SubscriptionState$ErrorState;", "Lorg/schabi/newpipelegacy/local/subscription/SubscriptionViewModel$SubscriptionState;", "error", "", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"})
        public static final class ErrorState extends org.schabi.newpipelegacy.local.subscription.SubscriptionViewModel.SubscriptionState {
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Throwable error = null;
            
            @org.jetbrains.annotations.NotNull()
            public final org.schabi.newpipelegacy.local.subscription.SubscriptionViewModel.SubscriptionState.ErrorState copy(@org.jetbrains.annotations.Nullable()
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
}
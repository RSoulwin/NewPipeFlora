package org.schabi.newpipelegacy.local.subscription.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0003=>?B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010,\u001a\u00020-J$\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u00072\u0006\u00100\u001a\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00050#J\u0006\u00103\u001a\u00020-J\u0010\u00104\u001a\u00020-2\u0006\u00105\u001a\u000206H\u0002J\u000e\u00107\u001a\u00020-2\u0006\u00108\u001a\u00020\u0007J\b\u00109\u001a\u00020-H\u0014J\u000e\u0010+\u001a\u00020-2\u0006\u0010:\u001a\u00020\tJ,\u0010;\u001a\u00020-2\u0006\u0010/\u001a\u00020\u00072\u0006\u00100\u001a\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00050#2\u0006\u0010<\u001a\u00020\u0005R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0014\u001a\u0014 \u0016*\t\u0018\u00010\f\u00a2\u0006\u0002\b\u00150\f\u00a2\u0006\u0002\b\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R<\u0010\u0017\u001a0\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00070\u0007 \u0016*\u0017\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u0018\u00a2\u0006\u0002\b\u00150\u0018\u00a2\u0006\u0002\b\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R,\u0010\u001f\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050#0 0\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010&\u001a\u0014 \u0016*\t\u0018\u00010\f\u00a2\u0006\u0002\b\u00150\f\u00a2\u0006\u0002\b\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000RT\u0010\'\u001aH\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\" \u0016*\n\u0012\u0004\u0012\u00020\"\u0018\u00010!0! \u0016*#\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\" \u0016*\n\u0012\u0004\u0012\u00020\"\u0018\u00010!0!\u0018\u00010(\u00a2\u0006\u0002\b\u00150(\u00a2\u0006\u0002\b\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R/\u0010)\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050#0 0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0011R<\u0010+\u001a0\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\t0\t \u0016*\u0017\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\t0\t\u0018\u00010\u0018\u00a2\u0006\u0002\b\u00150\u0018\u00a2\u0006\u0002\b\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006@"}, d2 = {"Lorg/schabi/newpipelegacy/local/subscription/dialog/FeedGroupDialogViewModel;", "Landroidx/lifecycle/ViewModel;", "applicationContext", "Landroid/content/Context;", "groupId", "", "initialQuery", "", "initialShowOnlyUngrouped", "", "(Landroid/content/Context;JLjava/lang/String;Z)V", "actionProcessingDisposable", "Lio/reactivex/rxjava3/disposables/Disposable;", "dialogEventLiveData", "Landroidx/lifecycle/LiveData;", "Lorg/schabi/newpipelegacy/local/subscription/dialog/FeedGroupDialogViewModel$DialogEvent;", "getDialogEventLiveData", "()Landroidx/lifecycle/LiveData;", "feedDatabaseManager", "Lorg/schabi/newpipelegacy/local/feed/FeedDatabaseManager;", "feedGroupDisposable", "Lio/reactivex/rxjava3/annotations/NonNull;", "kotlin.jvm.PlatformType", "filterSubscriptions", "Lio/reactivex/rxjava3/processors/BehaviorProcessor;", "groupLiveData", "Lorg/schabi/newpipelegacy/database/feed/model/FeedGroupEntity;", "getGroupLiveData", "mutableDialogEventLiveData", "Landroidx/lifecycle/MutableLiveData;", "mutableGroupLiveData", "mutableSubscriptionsLiveData", "Lkotlin/Pair;", "", "Lorg/schabi/newpipelegacy/local/subscription/item/PickerSubscriptionItem;", "", "subscriptionManager", "Lorg/schabi/newpipelegacy/local/subscription/SubscriptionManager;", "subscriptionsDisposable", "subscriptionsFlowable", "Lio/reactivex/rxjava3/core/Flowable;", "subscriptionsLiveData", "getSubscriptionsLiveData", "toggleShowOnlyUngrouped", "clearSubscriptionsFilter", "", "createGroup", "name", "selectedIcon", "Lorg/schabi/newpipelegacy/local/subscription/FeedGroupIcon;", "selectedSubscriptions", "deleteGroup", "doAction", "completable", "Lio/reactivex/rxjava3/core/Completable;", "filterSubscriptionsBy", "query", "onCleared", "showOnlyUngrouped", "updateGroup", "sortOrder", "DialogEvent", "Factory", "Filter", "app_release"})
public final class FeedGroupDialogViewModel extends androidx.lifecycle.ViewModel {
    private final long groupId = 0L;
    private org.schabi.newpipelegacy.local.feed.FeedDatabaseManager feedDatabaseManager;
    private org.schabi.newpipelegacy.local.subscription.SubscriptionManager subscriptionManager;
    private io.reactivex.rxjava3.processors.BehaviorProcessor<java.lang.String> filterSubscriptions;
    private io.reactivex.rxjava3.processors.BehaviorProcessor<java.lang.Boolean> toggleShowOnlyUngrouped;
    private io.reactivex.rxjava3.core.Flowable<java.util.List<org.schabi.newpipelegacy.local.subscription.item.PickerSubscriptionItem>> subscriptionsFlowable;
    private final androidx.lifecycle.MutableLiveData<org.schabi.newpipelegacy.database.feed.model.FeedGroupEntity> mutableGroupLiveData = null;
    private final androidx.lifecycle.MutableLiveData<kotlin.Pair<java.util.List<org.schabi.newpipelegacy.local.subscription.item.PickerSubscriptionItem>, java.util.Set<java.lang.Long>>> mutableSubscriptionsLiveData = null;
    private final androidx.lifecycle.MutableLiveData<org.schabi.newpipelegacy.local.subscription.dialog.FeedGroupDialogViewModel.DialogEvent> mutableDialogEventLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<org.schabi.newpipelegacy.database.feed.model.FeedGroupEntity> groupLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<kotlin.Pair<java.util.List<org.schabi.newpipelegacy.local.subscription.item.PickerSubscriptionItem>, java.util.Set<java.lang.Long>>> subscriptionsLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<org.schabi.newpipelegacy.local.subscription.dialog.FeedGroupDialogViewModel.DialogEvent> dialogEventLiveData = null;
    private io.reactivex.rxjava3.disposables.Disposable actionProcessingDisposable;
    private io.reactivex.rxjava3.disposables.Disposable feedGroupDisposable;
    private io.reactivex.rxjava3.disposables.Disposable subscriptionsDisposable;
    
    public FeedGroupDialogViewModel(@org.jetbrains.annotations.NotNull()
    android.content.Context applicationContext, long groupId, @org.jetbrains.annotations.NotNull()
    java.lang.String initialQuery, boolean initialShowOnlyUngrouped) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.schabi.newpipelegacy.database.feed.model.FeedGroupEntity> getGroupLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<kotlin.Pair<java.util.List<org.schabi.newpipelegacy.local.subscription.item.PickerSubscriptionItem>, java.util.Set<java.lang.Long>>> getSubscriptionsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.schabi.newpipelegacy.local.subscription.dialog.FeedGroupDialogViewModel.DialogEvent> getDialogEventLiveData() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void createGroup(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.local.subscription.FeedGroupIcon selectedIcon, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.Long> selectedSubscriptions) {
    }
    
    public final void updateGroup(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.local.subscription.FeedGroupIcon selectedIcon, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.Long> selectedSubscriptions, long sortOrder) {
    }
    
    public final void deleteGroup() {
    }
    
    private final void doAction(io.reactivex.rxjava3.core.Completable completable) {
    }
    
    public final void filterSubscriptionsBy(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    public final void clearSubscriptionsFilter() {
    }
    
    public final void toggleShowOnlyUngrouped(boolean showOnlyUngrouped) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/schabi/newpipelegacy/local/subscription/dialog/FeedGroupDialogViewModel$DialogEvent;", "", "()V", "ProcessingEvent", "SuccessEvent", "Lorg/schabi/newpipelegacy/local/subscription/dialog/FeedGroupDialogViewModel$DialogEvent$ProcessingEvent;", "Lorg/schabi/newpipelegacy/local/subscription/dialog/FeedGroupDialogViewModel$DialogEvent$SuccessEvent;", "app_release"})
    public static abstract class DialogEvent {
        
        private DialogEvent() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lorg/schabi/newpipelegacy/local/subscription/dialog/FeedGroupDialogViewModel$DialogEvent$ProcessingEvent;", "Lorg/schabi/newpipelegacy/local/subscription/dialog/FeedGroupDialogViewModel$DialogEvent;", "()V", "app_release"})
        public static final class ProcessingEvent extends org.schabi.newpipelegacy.local.subscription.dialog.FeedGroupDialogViewModel.DialogEvent {
            @org.jetbrains.annotations.NotNull()
            public static final org.schabi.newpipelegacy.local.subscription.dialog.FeedGroupDialogViewModel.DialogEvent.ProcessingEvent INSTANCE = null;
            
            private ProcessingEvent() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lorg/schabi/newpipelegacy/local/subscription/dialog/FeedGroupDialogViewModel$DialogEvent$SuccessEvent;", "Lorg/schabi/newpipelegacy/local/subscription/dialog/FeedGroupDialogViewModel$DialogEvent;", "()V", "app_release"})
        public static final class SuccessEvent extends org.schabi.newpipelegacy.local.subscription.dialog.FeedGroupDialogViewModel.DialogEvent {
            @org.jetbrains.annotations.NotNull()
            public static final org.schabi.newpipelegacy.local.subscription.dialog.FeedGroupDialogViewModel.DialogEvent.SuccessEvent INSTANCE = null;
            
            private SuccessEvent() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0013"}, d2 = {"Lorg/schabi/newpipelegacy/local/subscription/dialog/FeedGroupDialogViewModel$Filter;", "", "query", "", "showOnlyUngrouped", "", "(Ljava/lang/String;Z)V", "getQuery", "()Ljava/lang/String;", "getShowOnlyUngrouped", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "app_release"})
    public static final class Filter {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String query = null;
        private final boolean showOnlyUngrouped = false;
        
        @org.jetbrains.annotations.NotNull()
        public final org.schabi.newpipelegacy.local.subscription.dialog.FeedGroupDialogViewModel.Filter copy(@org.jetbrains.annotations.NotNull()
        java.lang.String query, boolean showOnlyUngrouped) {
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
        
        public Filter(@org.jetbrains.annotations.NotNull()
        java.lang.String query, boolean showOnlyUngrouped) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getQuery() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean getShowOnlyUngrouped() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\'\u0010\u000b\u001a\u0002H\f\"\n\b\u0000\u0010\f*\u0004\u0018\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\f0\u000fH\u0016\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lorg/schabi/newpipelegacy/local/subscription/dialog/FeedGroupDialogViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "context", "Landroid/content/Context;", "groupId", "", "initialQuery", "", "initialShowOnlyUngrouped", "", "(Landroid/content/Context;JLjava/lang/String;Z)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_release"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final android.content.Context context = null;
        private final long groupId = 0L;
        private final java.lang.String initialQuery = null;
        private final boolean initialShowOnlyUngrouped = false;
        
        public Factory(@org.jetbrains.annotations.NotNull()
        android.content.Context context, long groupId, @org.jetbrains.annotations.NotNull()
        java.lang.String initialQuery, boolean initialShowOnlyUngrouped) {
            super();
        }
        
        @kotlin.Suppress(names = {"UNCHECKED_CAST"})
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
    }
}
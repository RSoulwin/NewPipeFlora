package org.schabi.newpipelegacy.local.feed;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00ce\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001eB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\"\u001a\u00020#H\u0014J\b\u0010$\u001a\u00020#H\u0016J\u0010\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\'H\u0002J*\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020*2\n\b\u0001\u0010+\u001a\u0004\u0018\u00010,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0.H\u0002J\u0016\u0010/\u001a\u00020#2\f\u00100\u001a\b\u0012\u0004\u0012\u00020,0.H\u0002J\u0010\u00101\u001a\u00020#2\u0006\u00102\u001a\u000203H\u0003J\u0010\u00104\u001a\u00020#2\u0006\u00105\u001a\u000206H\u0002J\u0010\u00107\u001a\u00020#2\u0006\u00108\u001a\u00020\u0002H\u0016J\b\u00109\u001a\u00020#H\u0016J\u001a\u0010:\u001a\u00020#2\u0006\u0010;\u001a\u00020\u00122\b\b\u0002\u0010<\u001a\u00020\u000eH\u0002J\u0010\u0010=\u001a\u00020#2\u0006\u0010>\u001a\u00020\u001aH\u0002J\b\u0010?\u001a\u00020#H\u0014J\u0012\u0010@\u001a\u00020#2\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J\u0018\u0010C\u001a\u00020#2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020GH\u0016J&\u0010H\u001a\u0004\u0018\u00010I2\u0006\u0010F\u001a\u00020J2\b\u0010K\u001a\u0004\u0018\u00010L2\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J\b\u0010M\u001a\u00020#H\u0016J\b\u0010N\u001a\u00020#H\u0016J\b\u0010O\u001a\u00020#H\u0016J\u0010\u0010P\u001a\u00020\u00122\u0006\u0010Q\u001a\u00020RH\u0016J\b\u0010S\u001a\u00020#H\u0016J\b\u0010T\u001a\u00020#H\u0016J\u001a\u0010U\u001a\u00020#2\u0006\u0010V\u001a\u00020I2\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J\b\u0010W\u001a\u00020#H\u0016J\b\u0010X\u001a\u00020#H\u0002J\b\u0010Y\u001a\u00020#H\u0016J\u0010\u0010Z\u001a\u00020#2\u0006\u0010Q\u001a\u00020[H\u0002J\b\u0010\\\u001a\u00020#H\u0016J\b\u0010]\u001a\u00020#H\u0002J\n\u0010^\u001a\u0004\u0018\u00010_H\u0002J\b\u0010`\u001a\u00020#H\u0002J\b\u0010a\u001a\u00020#H\u0002J\u0010\u0010b\u001a\u00020#2\u0006\u0010c\u001a\u00020RH\u0002J\u0010\u0010d\u001a\u00020#2\u0006\u0010c\u001a\u00020RH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001e\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006f"}, d2 = {"Lorg/schabi/newpipelegacy/local/feed/FeedFragment;", "Lorg/schabi/newpipelegacy/fragments/BaseStateFragment;", "Lorg/schabi/newpipelegacy/local/feed/FeedState;", "()V", "_feedBinding", "Lorg/schabi/newpipelegacy/databinding/FragmentFeedBinding;", "disposables", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "feedBinding", "getFeedBinding", "()Lorg/schabi/newpipelegacy/databinding/FragmentFeedBinding;", "groupAdapter", "Lcom/xwray/groupie/GroupieAdapter;", "groupId", "", "groupName", "", "isRefreshing", "", "lastNewItemsCount", "", "listState", "Landroid/os/Parcelable;", "listenerStreamItem", "", "oldestSubscriptionUpdate", "Ljava/time/OffsetDateTime;", "onSettingsChangeListener", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "showFutureItems", "showPlayedItems", "updateListViewModeOnResume", "viewModel", "Lorg/schabi/newpipelegacy/local/feed/FeedViewModel;", "doInitialLoadLogic", "", "handleError", "handleErrorState", "errorState", "Lorg/schabi/newpipelegacy/local/feed/FeedState$ErrorState;", "handleFeedNotAvailable", "subscriptionEntity", "Lorg/schabi/newpipelegacy/database/subscription/SubscriptionEntity;", "cause", "", "nextItemsErrors", "", "handleItemsErrors", "errors", "handleLoadedState", "loadedState", "Lorg/schabi/newpipelegacy/local/feed/FeedState$LoadedState;", "handleProgressState", "progressState", "Lorg/schabi/newpipelegacy/local/feed/FeedState$ProgressState;", "handleResult", "result", "hideLoading", "hideNewItemsLoaded", "animate", "delay", "highlightNewItemsAfter", "updateTime", "initListeners", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDestroyOptionsMenu", "onDestroyView", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPause", "onResume", "onViewCreated", "rootView", "reloadContent", "setupListViewMode", "showEmptyState", "showInfoItemDialog", "Lorg/schabi/newpipe/extractor/stream/StreamInfoItem;", "showLoading", "showNewItemsLoaded", "tryGetNewItemsLoadedButton", "Landroid/widget/Button;", "updateRefreshViewState", "updateRelativeTimeViews", "updateToggleFutureItemsButton", "menuItem", "updateTogglePlayedItemsButton", "Companion", "app_release"})
public final class FeedFragment extends org.schabi.newpipelegacy.fragments.BaseStateFragment<org.schabi.newpipelegacy.local.feed.FeedState> {
    private org.schabi.newpipelegacy.databinding.FragmentFeedBinding _feedBinding;
    private final io.reactivex.rxjava3.disposables.CompositeDisposable disposables = null;
    private org.schabi.newpipelegacy.local.feed.FeedViewModel viewModel;
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmField()
    @icepick.State()
    public android.os.Parcelable listState;
    private long groupId = -1L;
    private java.lang.String groupName = "";
    private java.time.OffsetDateTime oldestSubscriptionUpdate;
    private com.xwray.groupie.GroupieAdapter groupAdapter;
    @kotlin.jvm.JvmField()
    @icepick.State()
    public boolean showPlayedItems = true;
    @kotlin.jvm.JvmField()
    @icepick.State()
    public boolean showFutureItems = true;
    private android.content.SharedPreferences.OnSharedPreferenceChangeListener onSettingsChangeListener;
    private boolean updateListViewModeOnResume = false;
    private boolean isRefreshing = false;
    private int lastNewItemsCount = 0;
    private final java.lang.Object listenerStreamItem = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.schabi.newpipelegacy.local.feed.FeedFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_GROUP_ID = "ARG_GROUP_ID";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_GROUP_NAME = "ARG_GROUP_NAME";
    
    public FeedFragment() {
        super();
    }
    
    private final org.schabi.newpipelegacy.databinding.FragmentFeedBinding getFeedBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View rootView, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void setupListViewMode() {
    }
    
    @java.lang.Override()
    protected void initListeners() {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onDestroyOptionsMenu() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void updateTogglePlayedItemsButton(android.view.MenuItem menuItem) {
    }
    
    private final void updateToggleFutureItemsButton(android.view.MenuItem menuItem) {
    }
    
    @java.lang.Override()
    public void showLoading() {
    }
    
    @java.lang.Override()
    public void hideLoading() {
    }
    
    @java.lang.Override()
    public void showEmptyState() {
    }
    
    @java.lang.Override()
    public void handleResult(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.local.feed.FeedState result) {
    }
    
    @java.lang.Override()
    public void handleError() {
    }
    
    private final void handleProgressState(org.schabi.newpipelegacy.local.feed.FeedState.ProgressState progressState) {
    }
    
    private final void showInfoItemDialog(org.schabi.newpipe.extractor.stream.StreamInfoItem item) {
    }
    
    @android.annotation.SuppressLint(value = {"StringFormatMatches"})
    private final void handleLoadedState(org.schabi.newpipelegacy.local.feed.FeedState.LoadedState loadedState) {
    }
    
    private final boolean handleErrorState(org.schabi.newpipelegacy.local.feed.FeedState.ErrorState errorState) {
        return false;
    }
    
    private final void handleItemsErrors(java.util.List<? extends java.lang.Throwable> errors) {
    }
    
    private final void handleFeedNotAvailable(org.schabi.newpipelegacy.database.subscription.SubscriptionEntity subscriptionEntity, @androidx.annotation.Nullable()
    java.lang.Throwable cause, java.util.List<? extends java.lang.Throwable> nextItemsErrors) {
    }
    
    private final void updateRelativeTimeViews() {
    }
    
    private final void updateRefreshViewState() {
    }
    
    /**
     * Highlights all items that are after the specified time
     */
    private final void highlightNewItemsAfter(java.time.OffsetDateTime updateTime) {
    }
    
    private final void showNewItemsLoaded() {
    }
    
    private final void hideNewItemsLoaded(boolean animate, long delay) {
    }
    
    /**
     * The view/button can be disposed/set to null under certain circumstances.
     * E.g. when the animation is still in progress but the view got destroyed.
     * This method is a helper for such states and can be used in affected code blocks.
     */
    private final android.widget.Button tryGetNewItemsLoadedButton() {
        return null;
    }
    
    @java.lang.Override()
    protected void doInitialLoadLogic() {
    }
    
    @java.lang.Override()
    public void reloadContent() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final org.schabi.newpipelegacy.local.feed.FeedFragment newInstance(long groupId, @org.jetbrains.annotations.Nullable()
    java.lang.String groupName) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/schabi/newpipelegacy/local/feed/FeedFragment$Companion;", "", "()V", "KEY_GROUP_ID", "", "KEY_GROUP_NAME", "newInstance", "Lorg/schabi/newpipelegacy/local/feed/FeedFragment;", "groupId", "", "groupName", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final org.schabi.newpipelegacy.local.feed.FeedFragment newInstance(long groupId, @org.jetbrains.annotations.Nullable()
        java.lang.String groupName) {
            return null;
        }
    }
}
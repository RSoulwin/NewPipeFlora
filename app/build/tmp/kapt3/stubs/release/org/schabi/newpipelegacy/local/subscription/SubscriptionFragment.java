package org.schabi.newpipelegacy.local.subscription;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00e0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 `2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001`B\u0005\u00a2\u0006\u0002\u0010\u0003J\"\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\b\b\u0001\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0002J \u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020/2\u0006\u0010-\u001a\u00020.H\u0002J\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0002J\u0010\u00104\u001a\u0002012\u0006\u00105\u001a\u00020\u001aH\u0002J\b\u00106\u001a\u000201H\u0014J\u0016\u00107\u001a\u0002012\f\u00108\u001a\b\u0012\u0004\u0012\u00020:09H\u0002J\u0010\u0010;\u001a\u0002012\u0006\u0010<\u001a\u00020\u0002H\u0016J\b\u0010=\u001a\u000201H\u0016J\u001a\u0010>\u001a\u0002012\u0006\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010BH\u0014J\u0010\u0010C\u001a\u0002012\u0006\u0010D\u001a\u00020EH\u0016J\u0012\u0010F\u001a\u0002012\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J\u0018\u0010G\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u0010H\u001a\u00020IH\u0016J&\u0010J\u001a\u0004\u0018\u00010@2\u0006\u0010H\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010M2\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J\b\u0010N\u001a\u000201H\u0016J\b\u0010O\u001a\u000201H\u0002J\u0010\u0010P\u001a\u0002012\u0006\u0010Q\u001a\u00020,H\u0002J\b\u0010R\u001a\u000201H\u0002J\b\u0010S\u001a\u000201H\u0016J\b\u0010T\u001a\u000201H\u0002J\u0010\u0010U\u001a\u0002012\u0006\u0010<\u001a\u00020VH\u0002J\u0010\u0010W\u001a\u0002012\u0006\u0010<\u001a\u00020VH\u0002J\u0018\u0010X\u001a\u00020(2\u0006\u0010Y\u001a\u00020(2\u0006\u0010-\u001a\u00020.H\u0002J\b\u0010Z\u001a\u000201H\u0002J\b\u0010[\u001a\u000201H\u0016J\u0010\u0010\\\u001a\u0002012\u0006\u00105\u001a\u00020\u001aH\u0002J\u0010\u0010]\u001a\u0002012\u0006\u0010^\u001a\u00020_H\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u001b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001c0\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001d\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\u001f0\u001f0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010!\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\u001f0\u001f0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006a"}, d2 = {"Lorg/schabi/newpipelegacy/local/subscription/SubscriptionFragment;", "Lorg/schabi/newpipelegacy/fragments/BaseStateFragment;", "Lorg/schabi/newpipelegacy/local/subscription/SubscriptionViewModel$SubscriptionState;", "()V", "_binding", "Lorg/schabi/newpipelegacy/databinding/FragmentSubscriptionBinding;", "binding", "getBinding", "()Lorg/schabi/newpipelegacy/databinding/FragmentSubscriptionBinding;", "disposables", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "feedGroupsCarousel", "Lorg/schabi/newpipelegacy/local/subscription/item/FeedGroupCarouselItem;", "feedGroupsListState", "Landroid/os/Parcelable;", "feedGroupsSection", "Lcom/xwray/groupie/Section;", "feedGroupsSortMenuItem", "Lorg/schabi/newpipelegacy/local/subscription/item/HeaderWithMenuItem;", "groupAdapter", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/viewbinding/GroupieViewHolder;", "Lorg/schabi/newpipelegacy/databinding/FeedItemCarouselBinding;", "itemsListState", "listenerChannelItem", "Lorg/schabi/newpipelegacy/util/OnClickGesture;", "Lorg/schabi/newpipe/extractor/channel/ChannelInfoItem;", "listenerFeedGroups", "Lcom/xwray/groupie/Item;", "requestExportLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "requestImportLauncher", "subscriptionManager", "Lorg/schabi/newpipelegacy/local/subscription/SubscriptionManager;", "subscriptionsSection", "viewModel", "Lorg/schabi/newpipelegacy/local/subscription/SubscriptionViewModel;", "addMenuItemToSubmenu", "Landroid/view/MenuItem;", "subMenu", "Landroid/view/SubMenu;", "title", "", "onClick", "Ljava/lang/Runnable;", "", "buildImportExportMenu", "", "menu", "Landroid/view/Menu;", "deleteChannel", "selectedItem", "doInitialLoadLogic", "handleFeedGroups", "groups", "", "Lcom/xwray/groupie/Group;", "handleResult", "result", "hideLoading", "initViews", "rootView", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "onCreateOptionsMenu", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onExportSelected", "onImportFromServiceSelected", "serviceId", "onImportPreviousSelected", "onPause", "openReorderDialog", "requestExportResult", "Landroidx/activity/result/ActivityResult;", "requestImportResult", "setClickListenerToMenuItem", "menuItem", "setupInitialLayout", "showLoading", "showLongTapDialog", "startLoading", "forceLoad", "", "Companion", "app_release"})
public final class SubscriptionFragment extends org.schabi.newpipelegacy.fragments.BaseStateFragment<org.schabi.newpipelegacy.local.subscription.SubscriptionViewModel.SubscriptionState> {
    private org.schabi.newpipelegacy.databinding.FragmentSubscriptionBinding _binding;
    private org.schabi.newpipelegacy.local.subscription.SubscriptionViewModel viewModel;
    private org.schabi.newpipelegacy.local.subscription.SubscriptionManager subscriptionManager;
    private final io.reactivex.rxjava3.disposables.CompositeDisposable disposables = null;
    private final com.xwray.groupie.GroupAdapter<com.xwray.groupie.viewbinding.GroupieViewHolder<org.schabi.newpipelegacy.databinding.FeedItemCarouselBinding>> groupAdapter = null;
    private final com.xwray.groupie.Section feedGroupsSection = null;
    private org.schabi.newpipelegacy.local.subscription.item.FeedGroupCarouselItem feedGroupsCarousel;
    private org.schabi.newpipelegacy.local.subscription.item.HeaderWithMenuItem feedGroupsSortMenuItem;
    private final com.xwray.groupie.Section subscriptionsSection = null;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> requestExportLauncher = null;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> requestImportLauncher = null;
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmField()
    @icepick.State()
    public android.os.Parcelable itemsListState;
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmField()
    @icepick.State()
    public android.os.Parcelable feedGroupsListState;
    private final org.schabi.newpipelegacy.util.OnClickGesture<com.xwray.groupie.Item<?>> listenerFeedGroups = null;
    private final org.schabi.newpipelegacy.util.OnClickGesture<org.schabi.newpipe.extractor.channel.ChannelInfoItem> listenerChannelItem = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.schabi.newpipelegacy.local.subscription.SubscriptionFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String JSON_MIME_TYPE = "application/json";
    
    public SubscriptionFragment() {
        super();
    }
    
    private final org.schabi.newpipelegacy.databinding.FragmentSubscriptionBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
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
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    private final void buildImportExportMenu(android.view.Menu menu) {
    }
    
    private final android.view.MenuItem addMenuItemToSubmenu(android.view.SubMenu subMenu, @androidx.annotation.StringRes()
    int title, java.lang.Runnable onClick) {
        return null;
    }
    
    private final android.view.MenuItem addMenuItemToSubmenu(android.view.SubMenu subMenu, java.lang.String title, java.lang.Runnable onClick) {
        return null;
    }
    
    private final android.view.MenuItem setClickListenerToMenuItem(android.view.MenuItem menuItem, java.lang.Runnable onClick) {
        return null;
    }
    
    private final void onImportFromServiceSelected(int serviceId) {
    }
    
    private final void onImportPreviousSelected() {
    }
    
    private final void onExportSelected() {
    }
    
    private final void openReorderDialog() {
    }
    
    private final void requestExportResult(androidx.activity.result.ActivityResult result) {
    }
    
    private final void requestImportResult(androidx.activity.result.ActivityResult result) {
    }
    
    private final void setupInitialLayout() {
    }
    
    @java.lang.Override()
    protected void initViews(@org.jetbrains.annotations.NotNull()
    android.view.View rootView, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showLongTapDialog(org.schabi.newpipe.extractor.channel.ChannelInfoItem selectedItem) {
    }
    
    private final void deleteChannel(org.schabi.newpipe.extractor.channel.ChannelInfoItem selectedItem) {
    }
    
    @java.lang.Override()
    protected void doInitialLoadLogic() {
    }
    
    @java.lang.Override()
    protected void startLoading(boolean forceLoad) {
    }
    
    @java.lang.Override()
    public void handleResult(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.local.subscription.SubscriptionViewModel.SubscriptionState result) {
    }
    
    private final void handleFeedGroups(java.util.List<? extends com.xwray.groupie.Group> groups) {
    }
    
    @java.lang.Override()
    public void showLoading() {
    }
    
    @java.lang.Override()
    public void hideLoading() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/schabi/newpipelegacy/local/subscription/SubscriptionFragment$Companion;", "", "()V", "JSON_MIME_TYPE", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
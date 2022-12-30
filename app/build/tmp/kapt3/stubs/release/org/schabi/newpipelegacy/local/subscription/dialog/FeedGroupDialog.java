package org.schabi.newpipelegacy.local.subscription.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00bc\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u0000 `2\u00020\u00012\u00020\u0002:\u0002`aB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u00101\u001a\u000202H\u0002J\u0014\u00103\u001a\u0002022\n\b\u0002\u00104\u001a\u0004\u0018\u000105H\u0002J\b\u00106\u001a\u000202H\u0002J\b\u00107\u001a\u000202H\u0002J\b\u00108\u001a\u000202H\u0002J\b\u00109\u001a\u000202H\u0002J\b\u0010:\u001a\u000202H\u0002J\b\u0010;\u001a\u00020,H\u0002J\b\u0010<\u001a\u00020,H\u0016J\u0012\u0010=\u001a\u0002022\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\u0012\u0010@\u001a\u00020A2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J&\u0010B\u001a\u0004\u0018\u00010C2\u0006\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010G2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\b\u0010H\u001a\u000202H\u0016J\b\u0010I\u001a\u000202H\u0016J\u0010\u0010J\u001a\u0002022\u0006\u0010K\u001a\u00020?H\u0016J\u001a\u0010L\u001a\u0002022\u0006\u0010M\u001a\u00020C2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\b\u0010N\u001a\u000202H\u0002J\b\u0010O\u001a\u000202H\u0002J\b\u0010P\u001a\u000202H\u0002J$\u0010Q\u001a\u0002022\f\u0010R\u001a\b\u0012\u0004\u0012\u00020T0S2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100UH\u0002J\b\u0010V\u001a\u000202H\u0002J\b\u0010W\u001a\u000202H\u0002J\u0010\u0010X\u001a\u0002022\u0006\u0010Y\u001a\u00020\tH\u0002J\b\u0010Z\u001a\u000202H\u0002J\b\u0010[\u001a\u000202H\u0002J%\u0010\\\u001a\u000202*\u00020C2\u0012\u0010]\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0^\"\u00020\tH\u0002\u00a2\u0006\u0002\u0010_R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u001fj\b\u0012\u0004\u0012\u00020\u0010` 8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\'X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010(\u001a\u00020)8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010*\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010+\u001a\u00020,8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010/\u001a\u00020,8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u00100\u001a\u00020,8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006b"}, d2 = {"Lorg/schabi/newpipelegacy/local/subscription/dialog/FeedGroupDialog;", "Landroidx/fragment/app/DialogFragment;", "Lorg/schabi/newpipelegacy/fragments/BackPressable;", "()V", "_feedGroupCreateBinding", "Lorg/schabi/newpipelegacy/databinding/DialogFeedGroupCreateBinding;", "_searchLayoutBinding", "Lorg/schabi/newpipelegacy/databinding/ToolbarSearchLayoutBinding;", "currentScreen", "Lorg/schabi/newpipelegacy/local/subscription/dialog/FeedGroupDialog$ScreenState;", "feedGroupCreateBinding", "getFeedGroupCreateBinding", "()Lorg/schabi/newpipelegacy/databinding/DialogFeedGroupCreateBinding;", "groupIcon", "Lorg/schabi/newpipelegacy/local/subscription/FeedGroupIcon;", "groupId", "", "groupSortOrder", "iconsListState", "Landroid/os/Parcelable;", "inputMethodManager", "Landroid/view/inputmethod/InputMethodManager;", "getInputMethodManager", "()Landroid/view/inputmethod/InputMethodManager;", "inputMethodManager$delegate", "Lkotlin/Lazy;", "searchLayoutBinding", "getSearchLayoutBinding", "()Lorg/schabi/newpipelegacy/databinding/ToolbarSearchLayoutBinding;", "selectedIcon", "selectedSubscriptions", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "subscriptionEmptyFooter", "Lcom/xwray/groupie/Section;", "subscriptionGroupAdapter", "Lcom/xwray/groupie/GroupieAdapter;", "subscriptionMainSection", "subscriptionPickerItemListener", "Lcom/xwray/groupie/OnItemClickListener;", "subscriptionsCurrentSearchQuery", "", "subscriptionsListState", "subscriptionsShowOnlyUngrouped", "", "viewModel", "Lorg/schabi/newpipelegacy/local/subscription/dialog/FeedGroupDialogViewModel;", "wasSearchSubscriptionsVisible", "wasSubscriptionSelectionChanged", "disableInput", "", "handleGroup", "feedGroupEntity", "Lorg/schabi/newpipelegacy/database/feed/model/FeedGroupEntity;", "handlePositiveButton", "handlePositiveButtonInitialScreen", "hideKeyboard", "hideKeyboardSearch", "hideSearch", "isSearchVisible", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onPause", "onSaveInstanceState", "outState", "onViewCreated", "view", "resetSearch", "setupIconPicker", "setupListeners", "setupSubscriptionPicker", "subscriptions", "", "Lorg/schabi/newpipelegacy/local/subscription/item/PickerSubscriptionItem;", "", "showKeyboard", "showKeyboardSearch", "showScreen", "screen", "showSearch", "updateSubscriptionSelectedCount", "onlyVisibleIn", "screens", "", "(Landroid/view/View;[Lorg/schabi/newpipelegacy/local/subscription/dialog/FeedGroupDialog$ScreenState;)V", "Companion", "ScreenState", "app_release"})
public final class FeedGroupDialog extends androidx.fragment.app.DialogFragment implements org.schabi.newpipelegacy.fragments.BackPressable {
    private org.schabi.newpipelegacy.databinding.DialogFeedGroupCreateBinding _feedGroupCreateBinding;
    private org.schabi.newpipelegacy.databinding.ToolbarSearchLayoutBinding _searchLayoutBinding;
    private org.schabi.newpipelegacy.local.subscription.dialog.FeedGroupDialogViewModel viewModel;
    private long groupId = -1L;
    private org.schabi.newpipelegacy.local.subscription.FeedGroupIcon groupIcon;
    private long groupSortOrder = -1L;
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmField()
    @icepick.State()
    public org.schabi.newpipelegacy.local.subscription.FeedGroupIcon selectedIcon;
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmField()
    @icepick.State()
    public java.util.HashSet<java.lang.Long> selectedSubscriptions;
    @kotlin.jvm.JvmField()
    @icepick.State()
    public boolean wasSubscriptionSelectionChanged = false;
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmField()
    @icepick.State()
    public org.schabi.newpipelegacy.local.subscription.dialog.FeedGroupDialog.ScreenState currentScreen;
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmField()
    @icepick.State()
    public android.os.Parcelable subscriptionsListState;
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmField()
    @icepick.State()
    public android.os.Parcelable iconsListState;
    @kotlin.jvm.JvmField()
    @icepick.State()
    public boolean wasSearchSubscriptionsVisible = false;
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmField()
    @icepick.State()
    public java.lang.String subscriptionsCurrentSearchQuery = "";
    @kotlin.jvm.JvmField()
    @icepick.State()
    public boolean subscriptionsShowOnlyUngrouped = false;
    private final com.xwray.groupie.Section subscriptionMainSection = null;
    private final com.xwray.groupie.Section subscriptionEmptyFooter = null;
    private com.xwray.groupie.GroupieAdapter subscriptionGroupAdapter;
    private final com.xwray.groupie.OnItemClickListener subscriptionPickerItemListener = null;
    private final kotlin.Lazy inputMethodManager$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.schabi.newpipelegacy.local.subscription.dialog.FeedGroupDialog.Companion Companion = null;
    private static final java.lang.String KEY_GROUP_ID = "KEY_GROUP_ID";
    private static final long NO_GROUP_SELECTED = -1L;
    
    public FeedGroupDialog() {
        super();
    }
    
    private final org.schabi.newpipelegacy.databinding.DialogFeedGroupCreateBinding getFeedGroupCreateBinding() {
        return null;
    }
    
    private final org.schabi.newpipelegacy.databinding.ToolbarSearchLayoutBinding getSearchLayoutBinding() {
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public boolean onBackPressed() {
        return false;
    }
    
    private final void setupListeners() {
    }
    
    private final void handlePositiveButton() {
    }
    
    private final void handlePositiveButtonInitialScreen() {
    }
    
    private final void handleGroup(org.schabi.newpipelegacy.database.feed.model.FeedGroupEntity feedGroupEntity) {
    }
    
    private final void setupSubscriptionPicker(java.util.List<org.schabi.newpipelegacy.local.subscription.item.PickerSubscriptionItem> subscriptions, java.util.Set<java.lang.Long> selectedSubscriptions) {
    }
    
    private final void updateSubscriptionSelectedCount() {
    }
    
    private final void setupIconPicker() {
    }
    
    private final void showScreen(org.schabi.newpipelegacy.local.subscription.dialog.FeedGroupDialog.ScreenState screen) {
    }
    
    private final void onlyVisibleIn(android.view.View $this$onlyVisibleIn, org.schabi.newpipelegacy.local.subscription.dialog.FeedGroupDialog.ScreenState... screens) {
    }
    
    private final boolean isSearchVisible() {
        return false;
    }
    
    private final void resetSearch() {
    }
    
    private final void hideSearch() {
    }
    
    private final void showSearch() {
    }
    
    private final android.view.inputmethod.InputMethodManager getInputMethodManager() {
        return null;
    }
    
    private final void showKeyboardSearch() {
    }
    
    private final void hideKeyboardSearch() {
    }
    
    private final void showKeyboard() {
    }
    
    private final void hideKeyboard() {
    }
    
    private final void disableInput() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lorg/schabi/newpipelegacy/local/subscription/dialog/FeedGroupDialog$ScreenState;", "Ljava/io/Serializable;", "()V", "DeleteScreen", "IconPickerScreen", "InitialScreen", "SubscriptionsPickerScreen", "Lorg/schabi/newpipelegacy/local/subscription/dialog/FeedGroupDialog$ScreenState$InitialScreen;", "Lorg/schabi/newpipelegacy/local/subscription/dialog/FeedGroupDialog$ScreenState$IconPickerScreen;", "Lorg/schabi/newpipelegacy/local/subscription/dialog/FeedGroupDialog$ScreenState$SubscriptionsPickerScreen;", "Lorg/schabi/newpipelegacy/local/subscription/dialog/FeedGroupDialog$ScreenState$DeleteScreen;", "app_release"})
    public static abstract class ScreenState implements java.io.Serializable {
        
        private ScreenState() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lorg/schabi/newpipelegacy/local/subscription/dialog/FeedGroupDialog$ScreenState$InitialScreen;", "Lorg/schabi/newpipelegacy/local/subscription/dialog/FeedGroupDialog$ScreenState;", "()V", "app_release"})
        public static final class InitialScreen extends org.schabi.newpipelegacy.local.subscription.dialog.FeedGroupDialog.ScreenState {
            @org.jetbrains.annotations.NotNull()
            public static final org.schabi.newpipelegacy.local.subscription.dialog.FeedGroupDialog.ScreenState.InitialScreen INSTANCE = null;
            
            private InitialScreen() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lorg/schabi/newpipelegacy/local/subscription/dialog/FeedGroupDialog$ScreenState$IconPickerScreen;", "Lorg/schabi/newpipelegacy/local/subscription/dialog/FeedGroupDialog$ScreenState;", "()V", "app_release"})
        public static final class IconPickerScreen extends org.schabi.newpipelegacy.local.subscription.dialog.FeedGroupDialog.ScreenState {
            @org.jetbrains.annotations.NotNull()
            public static final org.schabi.newpipelegacy.local.subscription.dialog.FeedGroupDialog.ScreenState.IconPickerScreen INSTANCE = null;
            
            private IconPickerScreen() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lorg/schabi/newpipelegacy/local/subscription/dialog/FeedGroupDialog$ScreenState$SubscriptionsPickerScreen;", "Lorg/schabi/newpipelegacy/local/subscription/dialog/FeedGroupDialog$ScreenState;", "()V", "app_release"})
        public static final class SubscriptionsPickerScreen extends org.schabi.newpipelegacy.local.subscription.dialog.FeedGroupDialog.ScreenState {
            @org.jetbrains.annotations.NotNull()
            public static final org.schabi.newpipelegacy.local.subscription.dialog.FeedGroupDialog.ScreenState.SubscriptionsPickerScreen INSTANCE = null;
            
            private SubscriptionsPickerScreen() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lorg/schabi/newpipelegacy/local/subscription/dialog/FeedGroupDialog$ScreenState$DeleteScreen;", "Lorg/schabi/newpipelegacy/local/subscription/dialog/FeedGroupDialog$ScreenState;", "()V", "app_release"})
        public static final class DeleteScreen extends org.schabi.newpipelegacy.local.subscription.dialog.FeedGroupDialog.ScreenState {
            @org.jetbrains.annotations.NotNull()
            public static final org.schabi.newpipelegacy.local.subscription.dialog.FeedGroupDialog.ScreenState.DeleteScreen INSTANCE = null;
            
            private DeleteScreen() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lorg/schabi/newpipelegacy/local/subscription/dialog/FeedGroupDialog$Companion;", "", "()V", "KEY_GROUP_ID", "", "NO_GROUP_SELECTED", "", "newInstance", "Lorg/schabi/newpipelegacy/local/subscription/dialog/FeedGroupDialog;", "groupId", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.schabi.newpipelegacy.local.subscription.dialog.FeedGroupDialog newInstance(long groupId) {
            return null;
        }
    }
}
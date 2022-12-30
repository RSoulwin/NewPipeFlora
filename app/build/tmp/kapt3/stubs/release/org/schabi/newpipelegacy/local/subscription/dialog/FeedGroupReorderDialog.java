package org.schabi.newpipelegacy.local.subscription.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0016\u0010\u0015\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J\u0012\u0010\u0019\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\"\u001a\u00020\u0012H\u0016J\u0010\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u001bH\u0016J\u001a\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lorg/schabi/newpipelegacy/local/subscription/dialog/FeedGroupReorderDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "_binding", "Lorg/schabi/newpipelegacy/databinding/DialogFeedGroupReorderBinding;", "binding", "getBinding", "()Lorg/schabi/newpipelegacy/databinding/DialogFeedGroupReorderBinding;", "groupAdapter", "Lcom/xwray/groupie/GroupieAdapter;", "groupOrderedIdList", "Ljava/util/ArrayList;", "", "itemTouchHelper", "Landroidx/recyclerview/widget/ItemTouchHelper;", "viewModel", "Lorg/schabi/newpipelegacy/local/subscription/dialog/FeedGroupReorderDialogViewModel;", "disableInput", "", "getItemTouchCallback", "Landroidx/recyclerview/widget/ItemTouchHelper$SimpleCallback;", "handleGroups", "list", "", "Lorg/schabi/newpipelegacy/database/feed/model/FeedGroupEntity;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onSaveInstanceState", "outState", "onViewCreated", "view", "app_release"})
public final class FeedGroupReorderDialog extends androidx.fragment.app.DialogFragment {
    private org.schabi.newpipelegacy.databinding.DialogFeedGroupReorderBinding _binding;
    private org.schabi.newpipelegacy.local.subscription.dialog.FeedGroupReorderDialogViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmField()
    @icepick.State()
    public java.util.ArrayList<java.lang.Long> groupOrderedIdList;
    private final com.xwray.groupie.GroupieAdapter groupAdapter = null;
    private final androidx.recyclerview.widget.ItemTouchHelper itemTouchHelper = null;
    
    public FeedGroupReorderDialog() {
        super();
    }
    
    private final org.schabi.newpipelegacy.databinding.DialogFeedGroupReorderBinding getBinding() {
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
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    private final void handleGroups(java.util.List<org.schabi.newpipelegacy.database.feed.model.FeedGroupEntity> list) {
    }
    
    private final void disableInput() {
    }
    
    private final androidx.recyclerview.widget.ItemTouchHelper.SimpleCallback getItemTouchCallback() {
        return null;
    }
}
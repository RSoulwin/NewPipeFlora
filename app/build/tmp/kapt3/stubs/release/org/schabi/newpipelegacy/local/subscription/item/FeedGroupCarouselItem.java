package org.schabi.newpipelegacy.local.subscription.item;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0017H\u0014J\u0010\u0010\u0018\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u001a\u001a\u0004\u0018\u00010\u000eJ\u0016\u0010\u001b\u001a\u00020\u00102\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lorg/schabi/newpipelegacy/local/subscription/item/FeedGroupCarouselItem;", "Lcom/xwray/groupie/viewbinding/BindableItem;", "Lorg/schabi/newpipelegacy/databinding/FeedItemCarouselBinding;", "context", "Landroid/content/Context;", "carouselAdapter", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/viewbinding/GroupieViewHolder;", "(Landroid/content/Context;Lcom/xwray/groupie/GroupAdapter;)V", "feedGroupCarouselDecoration", "Lorg/schabi/newpipelegacy/local/subscription/decoration/FeedGroupCarouselDecoration;", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "listState", "Landroid/os/Parcelable;", "bind", "", "viewBinding", "position", "", "getLayout", "initializeViewBinding", "view", "Landroid/view/View;", "onRestoreInstanceState", "state", "onSaveInstanceState", "unbind", "viewHolder", "app_release"})
public final class FeedGroupCarouselItem extends com.xwray.groupie.viewbinding.BindableItem<org.schabi.newpipelegacy.databinding.FeedItemCarouselBinding> {
    private final com.xwray.groupie.GroupAdapter<com.xwray.groupie.viewbinding.GroupieViewHolder<org.schabi.newpipelegacy.databinding.FeedItemCarouselBinding>> carouselAdapter = null;
    private final org.schabi.newpipelegacy.local.subscription.decoration.FeedGroupCarouselDecoration feedGroupCarouselDecoration = null;
    private androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager;
    private android.os.Parcelable listState;
    
    public FeedGroupCarouselItem(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.xwray.groupie.GroupAdapter<com.xwray.groupie.viewbinding.GroupieViewHolder<org.schabi.newpipelegacy.databinding.FeedItemCarouselBinding>> carouselAdapter) {
        super();
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.os.Parcelable onSaveInstanceState() {
        return null;
    }
    
    public final void onRestoreInstanceState(@org.jetbrains.annotations.Nullable()
    android.os.Parcelable state) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected org.schabi.newpipelegacy.databinding.FeedItemCarouselBinding initializeViewBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    @java.lang.Override()
    public void bind(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.databinding.FeedItemCarouselBinding viewBinding, int position) {
    }
    
    @java.lang.Override()
    public void unbind(@org.jetbrains.annotations.NotNull()
    com.xwray.groupie.viewbinding.GroupieViewHolder<org.schabi.newpipelegacy.databinding.FeedItemCarouselBinding> viewHolder) {
    }
}
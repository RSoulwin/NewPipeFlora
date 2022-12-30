package org.schabi.newpipelegacy.local.subscription.item;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\t\u0010\u0012\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00c6\u0003J\u001d\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0016J\u0018\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\t\u0010\u001d\u001a\u00020\u0011H\u00d6\u0001J\u0010\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020 H\u0014J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\u0016\u0010#\u001a\u00020\u000e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020%H\u0016J\u0016\u0010&\u001a\u00020\u000e2\u0006\u0010\'\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u0006R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006("}, d2 = {"Lorg/schabi/newpipelegacy/local/subscription/item/PickerSubscriptionItem;", "Lcom/xwray/groupie/viewbinding/BindableItem;", "Lorg/schabi/newpipelegacy/databinding/PickerSubscriptionItemBinding;", "subscriptionEntity", "Lorg/schabi/newpipelegacy/database/subscription/SubscriptionEntity;", "isSelected", "", "(Lorg/schabi/newpipelegacy/database/subscription/SubscriptionEntity;Z)V", "()Z", "setSelected", "(Z)V", "getSubscriptionEntity", "()Lorg/schabi/newpipelegacy/database/subscription/SubscriptionEntity;", "bind", "", "viewBinding", "position", "", "component1", "component2", "copy", "equals", "other", "", "getId", "", "getLayout", "getSpanSize", "spanCount", "hashCode", "initializeViewBinding", "view", "Landroid/view/View;", "toString", "", "unbind", "viewHolder", "Lcom/xwray/groupie/viewbinding/GroupieViewHolder;", "updateSelected", "containerView", "app_release"})
public final class PickerSubscriptionItem extends com.xwray.groupie.viewbinding.BindableItem<org.schabi.newpipelegacy.databinding.PickerSubscriptionItemBinding> {
    @org.jetbrains.annotations.NotNull()
    private final org.schabi.newpipelegacy.database.subscription.SubscriptionEntity subscriptionEntity = null;
    private boolean isSelected;
    
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipelegacy.local.subscription.item.PickerSubscriptionItem copy(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.database.subscription.SubscriptionEntity subscriptionEntity, boolean isSelected) {
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
    
    public PickerSubscriptionItem(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.database.subscription.SubscriptionEntity subscriptionEntity, boolean isSelected) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipelegacy.database.subscription.SubscriptionEntity component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipelegacy.database.subscription.SubscriptionEntity getSubscriptionEntity() {
        return null;
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final boolean isSelected() {
        return false;
    }
    
    public final void setSelected(boolean p0) {
    }
    
    @java.lang.Override()
    public long getId() {
        return 0L;
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    @java.lang.Override()
    public int getSpanSize(int spanCount, int position) {
        return 0;
    }
    
    @java.lang.Override()
    public void bind(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.databinding.PickerSubscriptionItemBinding viewBinding, int position) {
    }
    
    @java.lang.Override()
    public void unbind(@org.jetbrains.annotations.NotNull()
    com.xwray.groupie.viewbinding.GroupieViewHolder<org.schabi.newpipelegacy.databinding.PickerSubscriptionItemBinding> viewHolder) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected org.schabi.newpipelegacy.databinding.PickerSubscriptionItemBinding initializeViewBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    public final void updateSelected(@org.jetbrains.annotations.NotNull()
    android.view.View containerView, boolean isSelected) {
    }
}
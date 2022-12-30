package org.schabi.newpipelegacy.local.subscription.item;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!BE\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u00a2\u0006\u0002\u0010\rJ\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0006H\u0016J&\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016J\b\u0010\u001c\u001a\u00020\u0006H\u0016J\u0010\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001fH\u0014J\u0010\u0010 \u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0002H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\""}, d2 = {"Lorg/schabi/newpipelegacy/local/subscription/item/HeaderWithMenuItem;", "Lcom/xwray/groupie/viewbinding/BindableItem;", "Lorg/schabi/newpipelegacy/databinding/HeaderWithMenuItemBinding;", "title", "", "itemIcon", "", "showMenuItem", "", "onClickListener", "Lkotlin/Function0;", "", "menuItemOnClickListener", "(Ljava/lang/String;IZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getItemIcon", "()I", "getShowMenuItem", "()Z", "setShowMenuItem", "(Z)V", "getTitle", "()Ljava/lang/String;", "bind", "viewBinding", "position", "payloads", "", "", "getLayout", "initializeViewBinding", "view", "Landroid/view/View;", "updateMenuItemVisibility", "Companion", "app_release"})
public final class HeaderWithMenuItem extends com.xwray.groupie.viewbinding.BindableItem<org.schabi.newpipelegacy.databinding.HeaderWithMenuItemBinding> {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    private final int itemIcon = 0;
    private boolean showMenuItem;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onClickListener = null;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> menuItemOnClickListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.schabi.newpipelegacy.local.subscription.item.HeaderWithMenuItem.Companion Companion = null;
    public static final int PAYLOAD_UPDATE_VISIBILITY_MENU_ITEM = 1;
    
    public HeaderWithMenuItem(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @androidx.annotation.DrawableRes()
    int itemIcon, boolean showMenuItem, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClickListener, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> menuItemOnClickListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final int getItemIcon() {
        return 0;
    }
    
    public final boolean getShowMenuItem() {
        return false;
    }
    
    public final void setShowMenuItem(boolean p0) {
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    @java.lang.Override()
    public void bind(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.databinding.HeaderWithMenuItemBinding viewBinding, int position, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Object> payloads) {
    }
    
    @java.lang.Override()
    public void bind(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.databinding.HeaderWithMenuItemBinding viewBinding, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected org.schabi.newpipelegacy.databinding.HeaderWithMenuItemBinding initializeViewBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    private final void updateMenuItemVisibility(org.schabi.newpipelegacy.databinding.HeaderWithMenuItemBinding viewBinding) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/schabi/newpipelegacy/local/subscription/item/HeaderWithMenuItem$Companion;", "", "()V", "PAYLOAD_UPDATE_VISIBILITY_MENU_ITEM", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
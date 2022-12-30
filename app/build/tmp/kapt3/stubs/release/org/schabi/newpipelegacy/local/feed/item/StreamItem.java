package org.schabi.newpipelegacy.local.feed.item;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u0000 62\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000267B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J&\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0016J\t\u0010!\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0006H\u00c6\u0003J\u001d\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010 H\u00d6\u0003J\u0012\u0010\'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020\u0013H\u0016J\b\u0010,\u001a\u00020\u001dH\u0016J\u0018\u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010/\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0002J\t\u00100\u001a\u00020\u001dH\u00d6\u0001J\u0010\u00101\u001a\u00020\u00022\u0006\u00102\u001a\u000203H\u0014J\b\u00104\u001a\u00020%H\u0016J\t\u00105\u001a\u00020(H\u00d6\u0001R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u00068"}, d2 = {"Lorg/schabi/newpipelegacy/local/feed/item/StreamItem;", "Lcom/xwray/groupie/viewbinding/BindableItem;", "Lorg/schabi/newpipelegacy/databinding/ListStreamItemBinding;", "streamWithState", "Lorg/schabi/newpipelegacy/database/stream/StreamWithState;", "itemVersion", "Lorg/schabi/newpipelegacy/local/feed/item/StreamItem$ItemVersion;", "(Lorg/schabi/newpipelegacy/database/stream/StreamWithState;Lorg/schabi/newpipelegacy/local/feed/item/StreamItem$ItemVersion;)V", "execBindEnd", "Ljava/util/function/Consumer;", "getExecBindEnd", "()Ljava/util/function/Consumer;", "setExecBindEnd", "(Ljava/util/function/Consumer;)V", "getItemVersion", "()Lorg/schabi/newpipelegacy/local/feed/item/StreamItem$ItemVersion;", "setItemVersion", "(Lorg/schabi/newpipelegacy/local/feed/item/StreamItem$ItemVersion;)V", "stateProgressTime", "", "Ljava/lang/Long;", "stream", "Lorg/schabi/newpipelegacy/database/stream/model/StreamEntity;", "getStreamWithState", "()Lorg/schabi/newpipelegacy/database/stream/StreamWithState;", "bind", "", "viewBinding", "position", "", "payloads", "", "", "component1", "component2", "copy", "equals", "", "other", "getFormattedRelativeUploadDate", "", "context", "Landroid/content/Context;", "getId", "getLayout", "getSpanSize", "spanCount", "getStreamInfoDetailLine", "hashCode", "initializeViewBinding", "view", "Landroid/view/View;", "isLongClickable", "toString", "Companion", "ItemVersion", "app_release"})
public final class StreamItem extends com.xwray.groupie.viewbinding.BindableItem<org.schabi.newpipelegacy.databinding.ListStreamItemBinding> {
    @org.jetbrains.annotations.NotNull()
    private final org.schabi.newpipelegacy.database.stream.StreamWithState streamWithState = null;
    @org.jetbrains.annotations.NotNull()
    private org.schabi.newpipelegacy.local.feed.item.StreamItem.ItemVersion itemVersion;
    @org.jetbrains.annotations.NotNull()
    public static final org.schabi.newpipelegacy.local.feed.item.StreamItem.Companion Companion = null;
    public static final int UPDATE_RELATIVE_TIME = 1;
    private final org.schabi.newpipelegacy.database.stream.model.StreamEntity stream = null;
    private final java.lang.Long stateProgressTime = null;
    
    /**
     * Will be executed at the end of the [StreamItem.bind] (with (ListStreamItemBinding,Int)).
     * Can be used e.g. for highlighting a item.
     */
    @org.jetbrains.annotations.Nullable()
    private java.util.function.Consumer<org.schabi.newpipelegacy.databinding.ListStreamItemBinding> execBindEnd;
    
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipelegacy.local.feed.item.StreamItem copy(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.database.stream.StreamWithState streamWithState, @org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.local.feed.item.StreamItem.ItemVersion itemVersion) {
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
    
    public StreamItem(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.database.stream.StreamWithState streamWithState, @org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.local.feed.item.StreamItem.ItemVersion itemVersion) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipelegacy.database.stream.StreamWithState component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipelegacy.database.stream.StreamWithState getStreamWithState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipelegacy.local.feed.item.StreamItem.ItemVersion component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipelegacy.local.feed.item.StreamItem.ItemVersion getItemVersion() {
        return null;
    }
    
    public final void setItemVersion(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.local.feed.item.StreamItem.ItemVersion p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.function.Consumer<org.schabi.newpipelegacy.databinding.ListStreamItemBinding> getExecBindEnd() {
        return null;
    }
    
    public final void setExecBindEnd(@org.jetbrains.annotations.Nullable()
    java.util.function.Consumer<org.schabi.newpipelegacy.databinding.ListStreamItemBinding> p0) {
    }
    
    @java.lang.Override()
    public long getId() {
        return 0L;
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected org.schabi.newpipelegacy.databinding.ListStreamItemBinding initializeViewBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    @java.lang.Override()
    public void bind(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.databinding.ListStreamItemBinding viewBinding, int position, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Object> payloads) {
    }
    
    @java.lang.Override()
    public void bind(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.databinding.ListStreamItemBinding viewBinding, int position) {
    }
    
    @java.lang.Override()
    public boolean isLongClickable() {
        return false;
    }
    
    private final java.lang.String getStreamInfoDetailLine(android.content.Context context) {
        return null;
    }
    
    private final java.lang.String getFormattedRelativeUploadDate(android.content.Context context) {
        return null;
    }
    
    @java.lang.Override()
    public int getSpanSize(int spanCount, int position) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lorg/schabi/newpipelegacy/local/feed/item/StreamItem$ItemVersion;", "", "(Ljava/lang/String;I)V", "NORMAL", "MINI", "GRID", "app_release"})
    public static enum ItemVersion {
        /*public static final*/ NORMAL /* = new NORMAL() */,
        /*public static final*/ MINI /* = new MINI() */,
        /*public static final*/ GRID /* = new GRID() */;
        
        ItemVersion() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/schabi/newpipelegacy/local/feed/item/StreamItem$Companion;", "", "()V", "UPDATE_RELATIVE_TIME", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
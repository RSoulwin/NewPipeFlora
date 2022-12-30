package org.schabi.newpipelegacy.local.subscription.item;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0006H\u0016J\b\u0010\u001e\u001a\u00020\u0018H\u0016J\u0018\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lorg/schabi/newpipelegacy/local/subscription/item/ChannelItem;", "Lcom/xwray/groupie/Item;", "Lcom/xwray/groupie/GroupieViewHolder;", "infoItem", "Lorg/schabi/newpipe/extractor/channel/ChannelInfoItem;", "subscriptionId", "", "itemVersion", "Lorg/schabi/newpipelegacy/local/subscription/item/ChannelItem$ItemVersion;", "gesturesListener", "Lorg/schabi/newpipelegacy/util/OnClickGesture;", "(Lorg/schabi/newpipe/extractor/channel/ChannelInfoItem;JLorg/schabi/newpipelegacy/local/subscription/item/ChannelItem$ItemVersion;Lorg/schabi/newpipelegacy/util/OnClickGesture;)V", "getGesturesListener", "()Lorg/schabi/newpipelegacy/util/OnClickGesture;", "setGesturesListener", "(Lorg/schabi/newpipelegacy/util/OnClickGesture;)V", "getItemVersion", "()Lorg/schabi/newpipelegacy/local/subscription/item/ChannelItem$ItemVersion;", "setItemVersion", "(Lorg/schabi/newpipelegacy/local/subscription/item/ChannelItem$ItemVersion;)V", "bind", "", "viewHolder", "position", "", "getDetailLine", "", "context", "Landroid/content/Context;", "getId", "getLayout", "getSpanSize", "spanCount", "ItemVersion", "app_release"})
public final class ChannelItem extends com.xwray.groupie.Item<com.xwray.groupie.GroupieViewHolder> {
    private final org.schabi.newpipe.extractor.channel.ChannelInfoItem infoItem = null;
    private final long subscriptionId = 0L;
    @org.jetbrains.annotations.NotNull()
    private org.schabi.newpipelegacy.local.subscription.item.ChannelItem.ItemVersion itemVersion;
    @org.jetbrains.annotations.Nullable()
    private org.schabi.newpipelegacy.util.OnClickGesture<org.schabi.newpipe.extractor.channel.ChannelInfoItem> gesturesListener;
    
    public ChannelItem(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipe.extractor.channel.ChannelInfoItem infoItem, long subscriptionId, @org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.local.subscription.item.ChannelItem.ItemVersion itemVersion, @org.jetbrains.annotations.Nullable()
    org.schabi.newpipelegacy.util.OnClickGesture<org.schabi.newpipe.extractor.channel.ChannelInfoItem> gesturesListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipelegacy.local.subscription.item.ChannelItem.ItemVersion getItemVersion() {
        return null;
    }
    
    public final void setItemVersion(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.local.subscription.item.ChannelItem.ItemVersion p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.schabi.newpipelegacy.util.OnClickGesture<org.schabi.newpipe.extractor.channel.ChannelInfoItem> getGesturesListener() {
        return null;
    }
    
    public final void setGesturesListener(@org.jetbrains.annotations.Nullable()
    org.schabi.newpipelegacy.util.OnClickGesture<org.schabi.newpipe.extractor.channel.ChannelInfoItem> p0) {
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
    public void bind(@org.jetbrains.annotations.NotNull()
    com.xwray.groupie.GroupieViewHolder viewHolder, int position) {
    }
    
    private final java.lang.String getDetailLine(android.content.Context context) {
        return null;
    }
    
    @java.lang.Override()
    public int getSpanSize(int spanCount, int position) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lorg/schabi/newpipelegacy/local/subscription/item/ChannelItem$ItemVersion;", "", "(Ljava/lang/String;I)V", "NORMAL", "MINI", "GRID", "app_release"})
    public static enum ItemVersion {
        /*public static final*/ NORMAL /* = new NORMAL() */,
        /*public static final*/ MINI /* = new MINI() */,
        /*public static final*/ GRID /* = new GRID() */;
        
        ItemVersion() {
        }
    }
}
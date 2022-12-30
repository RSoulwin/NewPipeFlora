package org.schabi.newpipelegacy.info_list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J&\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lorg/schabi/newpipelegacy/info_list/StreamSegmentItem;", "Lcom/xwray/groupie/Item;", "Lcom/xwray/groupie/GroupieViewHolder;", "item", "Lorg/schabi/newpipe/extractor/stream/StreamSegment;", "onClick", "Lorg/schabi/newpipelegacy/info_list/StreamSegmentAdapter$StreamSegmentListener;", "(Lorg/schabi/newpipe/extractor/stream/StreamSegment;Lorg/schabi/newpipelegacy/info_list/StreamSegmentAdapter$StreamSegmentListener;)V", "isSelected", "", "()Z", "setSelected", "(Z)V", "bind", "", "viewHolder", "position", "", "payloads", "", "", "getLayout", "Companion", "app_release"})
public final class StreamSegmentItem extends com.xwray.groupie.Item<com.xwray.groupie.GroupieViewHolder> {
    private final org.schabi.newpipe.extractor.stream.StreamSegment item = null;
    private final org.schabi.newpipelegacy.info_list.StreamSegmentAdapter.StreamSegmentListener onClick = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.schabi.newpipelegacy.info_list.StreamSegmentItem.Companion Companion = null;
    public static final int PAYLOAD_SELECT = 1;
    private boolean isSelected = false;
    
    public StreamSegmentItem(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipe.extractor.stream.StreamSegment item, @org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.info_list.StreamSegmentAdapter.StreamSegmentListener onClick) {
        super();
    }
    
    public final boolean isSelected() {
        return false;
    }
    
    public final void setSelected(boolean p0) {
    }
    
    @java.lang.Override()
    public void bind(@org.jetbrains.annotations.NotNull()
    com.xwray.groupie.GroupieViewHolder viewHolder, int position) {
    }
    
    @java.lang.Override()
    public void bind(@org.jetbrains.annotations.NotNull()
    com.xwray.groupie.GroupieViewHolder viewHolder, int position, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Object> payloads) {
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/schabi/newpipelegacy/info_list/StreamSegmentItem$Companion;", "", "()V", "PAYLOAD_SELECT", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
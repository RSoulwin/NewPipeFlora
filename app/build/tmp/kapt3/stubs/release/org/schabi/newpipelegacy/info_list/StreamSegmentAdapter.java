package org.schabi.newpipelegacy.info_list;

import java.lang.System;

/**
 * Custom RecyclerView.Adapter/GroupieAdapter for [StreamSegmentItem] for handling selection state.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0006J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u000bH\u0002R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lorg/schabi/newpipelegacy/info_list/StreamSegmentAdapter;", "Lcom/xwray/groupie/GroupieAdapter;", "listener", "Lorg/schabi/newpipelegacy/info_list/StreamSegmentAdapter$StreamSegmentListener;", "(Lorg/schabi/newpipelegacy/info_list/StreamSegmentAdapter$StreamSegmentListener;)V", "<set-?>", "", "currentIndex", "getCurrentIndex", "()I", "selectSegment", "", "segment", "Lorg/schabi/newpipelegacy/info_list/StreamSegmentItem;", "selectSegmentAt", "position", "setItems", "", "info", "Lorg/schabi/newpipe/extractor/stream/StreamInfo;", "unSelectCurrentSegment", "StreamSegmentListener", "app_release"})
public final class StreamSegmentAdapter extends com.xwray.groupie.GroupieAdapter {
    private final org.schabi.newpipelegacy.info_list.StreamSegmentAdapter.StreamSegmentListener listener = null;
    private int currentIndex = 0;
    
    public StreamSegmentAdapter(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.info_list.StreamSegmentAdapter.StreamSegmentListener listener) {
        super();
    }
    
    public final int getCurrentIndex() {
        return 0;
    }
    
    /**
     * Returns `true` if the provided [StreamInfo] contains segments, `false` otherwise.
     */
    public final boolean setItems(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipe.extractor.stream.StreamInfo info) {
        return false;
    }
    
    public final void selectSegment(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.info_list.StreamSegmentItem segment) {
    }
    
    public final void selectSegmentAt(int position) {
    }
    
    private final void unSelectCurrentSegment() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lorg/schabi/newpipelegacy/info_list/StreamSegmentAdapter$StreamSegmentListener;", "", "onItemClick", "", "item", "Lorg/schabi/newpipelegacy/info_list/StreamSegmentItem;", "seconds", "", "app_release"})
    public static abstract interface StreamSegmentListener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        org.schabi.newpipelegacy.info_list.StreamSegmentItem item, int seconds);
    }
}
package org.schabi.newpipelegacy.settings.notifications;

import java.lang.System;

/**
 * This [RecyclerView.Adapter] is used in the [NotificationModeConfigFragment].
 * The adapter holds all subscribed channels and their [NotificationMode]s
 * and provides the needed data structures and methods for this task.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u001c\u001d\u001e\u001fB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bJ\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000eH\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u000eH\u0016J\u0014\u0010\u0019\u001a\u00020\u00132\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000bR\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lorg/schabi/newpipelegacy/settings/notifications/NotificationModeConfigAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/schabi/newpipelegacy/settings/notifications/NotificationModeConfigAdapter$SubscriptionHolder;", "listener", "Lorg/schabi/newpipelegacy/settings/notifications/NotificationModeConfigAdapter$ModeToggleListener;", "(Lorg/schabi/newpipelegacy/settings/notifications/NotificationModeConfigAdapter$ModeToggleListener;)V", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "Lorg/schabi/newpipelegacy/settings/notifications/NotificationModeConfigAdapter$SubscriptionItem;", "kotlin.jvm.PlatformType", "getCurrentList", "", "getItem", "position", "", "getItemCount", "getItemId", "", "onBindViewHolder", "", "subscriptionHolder", "i", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "update", "newData", "Lorg/schabi/newpipelegacy/database/subscription/SubscriptionEntity;", "DiffCallback", "ModeToggleListener", "SubscriptionHolder", "SubscriptionItem", "app_release"})
public final class NotificationModeConfigAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.schabi.newpipelegacy.settings.notifications.NotificationModeConfigAdapter.SubscriptionHolder> {
    private final org.schabi.newpipelegacy.settings.notifications.NotificationModeConfigAdapter.ModeToggleListener listener = null;
    private final androidx.recyclerview.widget.AsyncListDiffer<org.schabi.newpipelegacy.settings.notifications.NotificationModeConfigAdapter.SubscriptionItem> differ = null;
    
    public NotificationModeConfigAdapter(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.settings.notifications.NotificationModeConfigAdapter.ModeToggleListener listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.schabi.newpipelegacy.settings.notifications.NotificationModeConfigAdapter.SubscriptionHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup viewGroup, int i) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.settings.notifications.NotificationModeConfigAdapter.SubscriptionHolder subscriptionHolder, int i) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipelegacy.settings.notifications.NotificationModeConfigAdapter.SubscriptionItem getItem(int position) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.schabi.newpipelegacy.settings.notifications.NotificationModeConfigAdapter.SubscriptionItem> getCurrentList() {
        return null;
    }
    
    public final void update(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.schabi.newpipelegacy.database.subscription.SubscriptionEntity> newData) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011\u00a8\u0006\u001e"}, d2 = {"Lorg/schabi/newpipelegacy/settings/notifications/NotificationModeConfigAdapter$SubscriptionItem;", "", "id", "", "title", "", "notificationMode", "", "serviceId", "url", "(JLjava/lang/String;IILjava/lang/String;)V", "getId", "()J", "getNotificationMode", "()I", "getServiceId", "getTitle", "()Ljava/lang/String;", "getUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_release"})
    public static final class SubscriptionItem {
        private final long id = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = null;
        private final int notificationMode = 0;
        private final int serviceId = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String url = null;
        
        @org.jetbrains.annotations.NotNull()
        public final org.schabi.newpipelegacy.settings.notifications.NotificationModeConfigAdapter.SubscriptionItem copy(long id, @org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.schabi.newpipelegacy.database.subscription.NotificationMode()
        int notificationMode, int serviceId, @org.jetbrains.annotations.NotNull()
        java.lang.String url) {
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
        
        public SubscriptionItem(long id, @org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.schabi.newpipelegacy.database.subscription.NotificationMode()
        int notificationMode, int serviceId, @org.jetbrains.annotations.NotNull()
        java.lang.String url) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int getNotificationMode() {
            return 0;
        }
        
        public final int component4() {
            return 0;
        }
        
        public final int getServiceId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUrl() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lorg/schabi/newpipelegacy/settings/notifications/NotificationModeConfigAdapter$SubscriptionHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "itemView", "Landroid/view/View;", "listener", "Lorg/schabi/newpipelegacy/settings/notifications/NotificationModeConfigAdapter$ModeToggleListener;", "(Landroid/view/View;Lorg/schabi/newpipelegacy/settings/notifications/NotificationModeConfigAdapter$ModeToggleListener;)V", "checkedTextView", "Landroid/widget/CheckedTextView;", "bind", "", "data", "Lorg/schabi/newpipelegacy/settings/notifications/NotificationModeConfigAdapter$SubscriptionItem;", "onClick", "v", "app_release"})
    public static final class SubscriptionHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        private final org.schabi.newpipelegacy.settings.notifications.NotificationModeConfigAdapter.ModeToggleListener listener = null;
        private final android.widget.CheckedTextView checkedTextView = null;
        
        public SubscriptionHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView, @org.jetbrains.annotations.NotNull()
        org.schabi.newpipelegacy.settings.notifications.NotificationModeConfigAdapter.ModeToggleListener listener) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        org.schabi.newpipelegacy.settings.notifications.NotificationModeConfigAdapter.SubscriptionItem data) {
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u001a\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\u000b"}, d2 = {"Lorg/schabi/newpipelegacy/settings/notifications/NotificationModeConfigAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lorg/schabi/newpipelegacy/settings/notifications/NotificationModeConfigAdapter$SubscriptionItem;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "getChangePayload", "", "app_release"})
    static final class DiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<org.schabi.newpipelegacy.settings.notifications.NotificationModeConfigAdapter.SubscriptionItem> {
        
        public DiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        org.schabi.newpipelegacy.settings.notifications.NotificationModeConfigAdapter.SubscriptionItem oldItem, @org.jetbrains.annotations.NotNull()
        org.schabi.newpipelegacy.settings.notifications.NotificationModeConfigAdapter.SubscriptionItem newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        org.schabi.newpipelegacy.settings.notifications.NotificationModeConfigAdapter.SubscriptionItem oldItem, @org.jetbrains.annotations.NotNull()
        org.schabi.newpipelegacy.settings.notifications.NotificationModeConfigAdapter.SubscriptionItem newItem) {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.Object getChangePayload(@org.jetbrains.annotations.NotNull()
        org.schabi.newpipelegacy.settings.notifications.NotificationModeConfigAdapter.SubscriptionItem oldItem, @org.jetbrains.annotations.NotNull()
        org.schabi.newpipelegacy.settings.notifications.NotificationModeConfigAdapter.SubscriptionItem newItem) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lorg/schabi/newpipelegacy/settings/notifications/NotificationModeConfigAdapter$ModeToggleListener;", "", "onModeChange", "", "position", "", "mode", "app_release"})
    public static abstract interface ModeToggleListener {
        
        /**
         * Triggered when the UI representation of a notification mode is changed.
         */
        public abstract void onModeChange(int position, @org.schabi.newpipelegacy.database.subscription.NotificationMode()
        int mode);
    }
}
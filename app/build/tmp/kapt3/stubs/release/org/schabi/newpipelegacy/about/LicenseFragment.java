package org.schabi.newpipelegacy.about;

import java.lang.System;

/**
 * Fragment containing the software licenses.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J$\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u0015\u001a\u00020\fH\u0016J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082.\u00a2\u0006\u0004\n\u0002\u0010\n\u00a8\u0006\u0018"}, d2 = {"Lorg/schabi/newpipelegacy/about/LicenseFragment;", "Landroidx/fragment/app/Fragment;", "()V", "activeLicense", "Lorg/schabi/newpipelegacy/about/License;", "compositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "softwareComponents", "", "Lorg/schabi/newpipelegacy/about/SoftwareComponent;", "[Lorg/schabi/newpipelegacy/about/SoftwareComponent;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onSaveInstanceState", "Companion", "app_release"})
public final class LicenseFragment extends androidx.fragment.app.Fragment {
    private org.schabi.newpipelegacy.about.SoftwareComponent[] softwareComponents;
    private org.schabi.newpipelegacy.about.License activeLicense;
    private final io.reactivex.rxjava3.disposables.CompositeDisposable compositeDisposable = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.schabi.newpipelegacy.about.LicenseFragment.Companion Companion = null;
    private static final java.lang.String ARG_COMPONENTS = "components";
    private static final java.lang.String LICENSE_KEY = "ACTIVE_LICENSE";
    
    public LicenseFragment() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle savedInstanceState) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lorg/schabi/newpipelegacy/about/LicenseFragment$Companion;", "", "()V", "ARG_COMPONENTS", "", "LICENSE_KEY", "newInstance", "Lorg/schabi/newpipelegacy/about/LicenseFragment;", "softwareComponents", "", "Lorg/schabi/newpipelegacy/about/SoftwareComponent;", "([Lorg/schabi/newpipelegacy/about/SoftwareComponent;)Lorg/schabi/newpipelegacy/about/LicenseFragment;", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.schabi.newpipelegacy.about.LicenseFragment newInstance(@org.jetbrains.annotations.NotNull()
        org.schabi.newpipelegacy.about.SoftwareComponent[] softwareComponents) {
            return null;
        }
    }
}
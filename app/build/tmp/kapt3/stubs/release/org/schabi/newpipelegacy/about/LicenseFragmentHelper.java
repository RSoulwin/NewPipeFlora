package org.schabi.newpipelegacy.about;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0018\u0010\r\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bJ.\u0010\r\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0002J\u0018\u0010\r\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\u0014\u00a8\u0006\u0015"}, d2 = {"Lorg/schabi/newpipelegacy/about/LicenseFragmentHelper;", "", "()V", "getFormattedLicense", "", "context", "Landroid/content/Context;", "license", "Lorg/schabi/newpipelegacy/about/License;", "getHexRGBColor", "color", "", "getLicenseStylesheet", "showLicense", "Lio/reactivex/rxjava3/disposables/Disposable;", "block", "Lkotlin/Function1;", "Landroidx/appcompat/app/AlertDialog$Builder;", "", "component", "Lorg/schabi/newpipelegacy/about/SoftwareComponent;", "app_release"})
public final class LicenseFragmentHelper {
    @org.jetbrains.annotations.NotNull()
    public static final org.schabi.newpipelegacy.about.LicenseFragmentHelper INSTANCE = null;
    
    private LicenseFragmentHelper() {
        super();
    }
    
    /**
     * @param context the context to use
     * @param license the license
     * @return String which contains a HTML formatted license page
     * styled according to the context's theme
     */
    private final java.lang.String getFormattedLicense(android.content.Context context, org.schabi.newpipelegacy.about.License license) {
        return null;
    }
    
    /**
     * @param context the Android context
     * @return String which is a CSS stylesheet according to the context's theme
     */
    private final java.lang.String getLicenseStylesheet(android.content.Context context) {
        return null;
    }
    
    /**
     * Cast R.color to a hexadecimal color value.
     *
     * @param context the context to use
     * @param color   the color number from R.color
     * @return a six characters long String with hexadecimal RGB values
     */
    private final java.lang.String getHexRGBColor(android.content.Context context, int color) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.disposables.Disposable showLicense(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.about.License license) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.disposables.Disposable showLicense(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.schabi.newpipelegacy.about.SoftwareComponent component) {
        return null;
    }
    
    private final io.reactivex.rxjava3.disposables.Disposable showLicense(android.content.Context context, org.schabi.newpipelegacy.about.License license, kotlin.jvm.functions.Function1<? super androidx.appcompat.app.AlertDialog.Builder, kotlin.Unit> block) {
        return null;
    }
}
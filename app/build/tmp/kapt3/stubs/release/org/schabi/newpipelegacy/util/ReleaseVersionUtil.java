package org.schabi.newpipelegacy.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fJ\b\u0010\u0011\u001a\u00020\u000fH\u0007J$\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\n\u0010\u0016\u001a\u00060\u0017j\u0002`\u00182\u0006\u0010\u0019\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u001a"}, d2 = {"Lorg/schabi/newpipelegacy/util/ReleaseVersionUtil;", "", "()V", "RELEASE_CERT_PUBLIC_KEY_SHA1", "", "certificateSHA1Fingerprint", "getCertificateSHA1Fingerprint", "()Ljava/lang/String;", "byte2HexFormatted", "arr", "", "coerceUpdateCheckExpiry", "", "expiryString", "isLastUpdateCheckExpired", "", "expiry", "isReleaseApk", "showRequestError", "", "app", "Lorg/schabi/newpipelegacy/App;", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "request", "app_release"})
public final class ReleaseVersionUtil {
    @org.jetbrains.annotations.NotNull()
    public static final org.schabi.newpipelegacy.util.ReleaseVersionUtil INSTANCE = null;
    private static final java.lang.String RELEASE_CERT_PUBLIC_KEY_SHA1 = "B0:2E:90:7C:1C:D6:FC:57:C3:35:F0:88:D0:8F:50:5F:94:E4:D2:15";
    
    private ReleaseVersionUtil() {
        super();
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean isReleaseApk() {
        return false;
    }
    
    private final java.lang.String getCertificateSHA1Fingerprint() {
        return null;
    }
    
    private final java.lang.String byte2HexFormatted(byte[] arr) {
        return null;
    }
    
    private final void showRequestError(org.schabi.newpipelegacy.App app, java.lang.Exception e, java.lang.String request) {
    }
    
    public final boolean isLastUpdateCheckExpired(long expiry) {
        return false;
    }
    
    /**
     * Coerce expiry date time in between 6 hours and 72 hours from now
     *
     * @return Epoch second of expiry date time
     */
    public final long coerceUpdateCheckExpiry(@org.jetbrains.annotations.Nullable()
    java.lang.String expiryString) {
        return 0L;
    }
}
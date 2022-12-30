package us.shandian.giga.get;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005BE\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\u0011J\t\u0010\'\u001a\u00020\rH\u00d6\u0001J\b\u0010(\u001a\u00020\tH\u0016J\u0019\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\rH\u00d6\u0001R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0013\"\u0004\b&\u0010\u0015\u00a8\u0006."}, d2 = {"Lus/shandian/giga/get/MissionRecoveryInfo;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "stream", "Lorg/schabi/newpipe/extractor/stream/Stream;", "(Lorg/schabi/newpipe/extractor/stream/Stream;)V", "format", "Lorg/schabi/newpipe/extractor/MediaFormat;", "desired", "", "isDesired2", "", "desiredBitrate", "", "kind", "", "validateCondition", "(Lorg/schabi/newpipe/extractor/MediaFormat;Ljava/lang/String;ZICLjava/lang/String;)V", "getDesired", "()Ljava/lang/String;", "setDesired", "(Ljava/lang/String;)V", "getDesiredBitrate", "()I", "setDesiredBitrate", "(I)V", "getFormat", "()Lorg/schabi/newpipe/extractor/MediaFormat;", "setFormat", "(Lorg/schabi/newpipe/extractor/MediaFormat;)V", "()Z", "setDesired2", "(Z)V", "getKind", "()C", "setKind", "(C)V", "getValidateCondition", "setValidateCondition", "describeContents", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"})
public final class MissionRecoveryInfo implements java.io.Serializable, android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    private org.schabi.newpipe.extractor.MediaFormat format;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String desired;
    private boolean isDesired2;
    private int desiredBitrate;
    private char kind;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String validateCondition;
    public static final android.os.Parcelable.Creator<us.shandian.giga.get.MissionRecoveryInfo> CREATOR = null;
    
    public MissionRecoveryInfo(@org.jetbrains.annotations.Nullable()
    org.schabi.newpipe.extractor.MediaFormat format, @org.jetbrains.annotations.Nullable()
    java.lang.String desired, boolean isDesired2, int desiredBitrate, char kind, @org.jetbrains.annotations.Nullable()
    java.lang.String validateCondition) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.schabi.newpipe.extractor.MediaFormat getFormat() {
        return null;
    }
    
    public final void setFormat(@org.jetbrains.annotations.Nullable()
    org.schabi.newpipe.extractor.MediaFormat p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDesired() {
        return null;
    }
    
    public final void setDesired(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean isDesired2() {
        return false;
    }
    
    public final void setDesired2(boolean p0) {
    }
    
    public final int getDesiredBitrate() {
        return 0;
    }
    
    public final void setDesiredBitrate(int p0) {
    }
    
    public final char getKind() {
        return '\u0000';
    }
    
    public final void setKind(char p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getValidateCondition() {
        return null;
    }
    
    public final void setValidateCondition(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public MissionRecoveryInfo(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipe.extractor.stream.Stream stream) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<us.shandian.giga.get.MissionRecoveryInfo> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final us.shandian.giga.get.MissionRecoveryInfo createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final us.shandian.giga.get.MissionRecoveryInfo[] newArray(int size) {
            return null;
        }
    }
}
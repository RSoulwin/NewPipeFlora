package org.schabi.newpipelegacy.settings;

import java.lang.System;

/**
 * Locates specific files of NewPipe based on the home directory of the app.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001b\u0010\u0005\u001a\u00020\u00038FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u00038FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\u000b\u0010\u0007R\u001b\u0010\r\u001a\u00020\u00038FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u000e\u0010\u0007R\u001b\u0010\u0010\u001a\u00020\u00038FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0011\u0010\u0007R\u001b\u0010\u0013\u001a\u00020\u00038FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0014\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00038FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0017\u0010\u0007\u00a8\u0006\u0019"}, d2 = {"Lorg/schabi/newpipelegacy/settings/NewPipeFileLocator;", "", "homeDir", "Ljava/io/File;", "(Ljava/io/File;)V", "db", "getDb", "()Ljava/io/File;", "db$delegate", "Lkotlin/Lazy;", "dbDir", "getDbDir", "dbDir$delegate", "dbJournal", "getDbJournal", "dbJournal$delegate", "dbShm", "getDbShm", "dbShm$delegate", "dbWal", "getDbWal", "dbWal$delegate", "settings", "getSettings", "settings$delegate", "app_release"})
public final class NewPipeFileLocator {
    private final java.io.File homeDir = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy dbDir$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy db$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy dbJournal$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy dbShm$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy dbWal$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy settings$delegate = null;
    
    public NewPipeFileLocator(@org.jetbrains.annotations.NotNull()
    java.io.File homeDir) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.File getDbDir() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.File getDb() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.File getDbJournal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.File getDbShm() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.File getDbWal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.File getSettings() {
        return null;
    }
}
package org.koin.core.logger;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Logger.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lorg/koin/core/logger/Level;", "", "koin-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class Level {

    /* renamed from: a, reason: collision with root package name */
    public static final Level f25554a;

    /* renamed from: b, reason: collision with root package name */
    public static final Level f25555b;

    /* renamed from: c, reason: collision with root package name */
    public static final Level f25556c;

    /* renamed from: d, reason: collision with root package name */
    public static final Level f25557d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Level[] f25558e;

    static {
        Level level = new Level("DEBUG", 0);
        f25554a = level;
        Level level2 = new Level("INFO", 1);
        f25555b = level2;
        Level level3 = new Level("ERROR", 2);
        f25556c = level3;
        Level level4 = new Level("NONE", 3);
        f25557d = level4;
        f25558e = new Level[]{level, level2, level3, level4};
    }

    public Level() {
        throw null;
    }

    public static Level valueOf(String str) {
        return (Level) Enum.valueOf(Level.class, str);
    }

    public static Level[] values() {
        return (Level[]) f25558e.clone();
    }
}

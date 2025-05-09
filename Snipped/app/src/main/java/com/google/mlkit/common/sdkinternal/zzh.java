package com.google.mlkit.common.sdkinternal;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
final class zzh implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final zzh f10525a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ zzh[] f10526b;

    static {
        zzh zzhVar = new zzh("INSTANCE", 0);
        f10525a = zzhVar;
        f10526b = new zzh[]{zzhVar};
    }

    public static zzh[] values() {
        return (zzh[]) f10526b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        a.a().f10523a.post(runnable);
    }
}

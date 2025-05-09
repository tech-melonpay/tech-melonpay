package com.sumsub.sns.internal.fingerprint.infoproviders;

import android.app.ActivityManager;
import android.os.StatFs;
import ca.InterfaceC0635a;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class a0 implements z {

    /* renamed from: a, reason: collision with root package name */
    public final ActivityManager f17297a;

    /* renamed from: b, reason: collision with root package name */
    public final StatFs f17298b;

    /* renamed from: c, reason: collision with root package name */
    public final StatFs f17299c;

    public static final class b extends Lambda implements InterfaceC0635a<Long> {
        public b() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(a0.this.f17298b.getTotalBytes());
        }
    }

    public static final class c extends Lambda implements InterfaceC0635a<Long> {
        public c() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ActivityManager activityManager = a0.this.f17297a;
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
            }
            return Long.valueOf(memoryInfo.totalMem);
        }
    }

    public a0(ActivityManager activityManager, StatFs statFs, StatFs statFs2) {
        this.f17297a = activityManager;
        this.f17298b = statFs;
        this.f17299c = statFs2;
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.z
    public long b() {
        Object a10 = com.sumsub.sns.internal.fingerprint.tools.threading.safe.c.a(0L, new c(), 1, null);
        if (a10 instanceof Result.Failure) {
            a10 = 0L;
        }
        return ((Number) a10).longValue();
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.z
    public long a() {
        Object a10 = com.sumsub.sns.internal.fingerprint.tools.threading.safe.c.a(0L, new b(), 1, null);
        if (a10 instanceof Result.Failure) {
            a10 = 0L;
        }
        return ((Number) a10).longValue();
    }
}

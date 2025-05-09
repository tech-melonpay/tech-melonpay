package com.sumsub.sns.internal.fingerprint.tools.threading.safe;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f17363a = new b();

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal<Boolean> f17364d = new ThreadLocal<>();

    public final void a() {
        f17364d.remove();
    }

    public final boolean b() {
        Boolean bool = f17364d.get();
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final void c() {
        com.sumsub.sns.internal.log.b.b(com.sumsub.sns.internal.log.a.f17535a, "Safe", "logIllegalSafeWithTimeoutUsage", new IllegalStateException("logIllegalSafeWithTimeoutUsage"));
    }

    public final void d() {
        f17364d.set(Boolean.TRUE);
    }
}

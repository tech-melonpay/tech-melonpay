package com.sumsub.sns.internal.core.common;

/* loaded from: classes2.dex */
public final class s$a {

    /* renamed from: a, reason: collision with root package name */
    public static final s$a f15191a = new s$a();

    public void a() {
        Runtime.getRuntime().gc();
        b();
        System.runFinalization();
    }

    public final void b() {
        try {
            Thread.sleep(100L);
        } catch (InterruptedException unused) {
            throw new AssertionError();
        }
    }
}

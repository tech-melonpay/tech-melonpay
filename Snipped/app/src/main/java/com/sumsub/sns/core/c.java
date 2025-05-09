package com.sumsub.sns.core;

import com.sumsub.sns.internal.log.a;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f14016a = new c();

    public static /* synthetic */ void a(c cVar, String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        cVar.a(str, str2, th);
    }

    public static /* synthetic */ void b(c cVar, String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        cVar.b(str, str2, th);
    }

    public final void a(String str, String str2, Throwable th) {
        a.f17535a.a("SumSubSdk").e(str, str2, th);
    }

    public final void b(String str, String str2, Throwable th) {
        a.f17535a.a("SumSubSdk").d(str, str2, th);
    }
}

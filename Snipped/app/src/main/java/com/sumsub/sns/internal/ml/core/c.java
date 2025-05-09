package com.sumsub.sns.internal.ml.core;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f17674a = new c();

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
        com.sumsub.sns.internal.log.a.f17535a.a("SumSubMlSolution").e(str, str2, th);
    }

    public final void b(String str, String str2, Throwable th) {
        com.sumsub.sns.internal.log.a.f17535a.a("SumSubMlSolution").d(str, str2, th);
    }
}

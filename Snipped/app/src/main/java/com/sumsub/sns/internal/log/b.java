package com.sumsub.sns.internal.log;

import java.util.Map;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Map<Integer, String> f17542a = kotlin.collections.a.s(new Pair(6, "E"), new Pair(5, "W"), new Pair(3, "D"), new Pair(4, "I"), new Pair(2, "V"));

    public static final Map<Integer, String> a() {
        return f17542a;
    }

    public static /* synthetic */ void b(a aVar, String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            th = null;
        }
        b(aVar, str, str2, th);
    }

    public static /* synthetic */ void c(a aVar, String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            th = null;
        }
        c(aVar, str, str2, th);
    }

    public static final void b(a aVar, String str, String str2, Throwable th) {
        aVar.a(LoggerType.KIBANA).e(str, str2, th);
    }

    public static final void c(a aVar, String str, String str2, Throwable th) {
        aVar.a(LoggerType.KIBANA).i(str, str2, th);
    }
}

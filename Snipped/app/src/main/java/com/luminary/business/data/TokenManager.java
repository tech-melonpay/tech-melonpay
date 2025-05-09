package com.luminary.business.data;

import K5.a;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: TokenManager.kt */
/* loaded from: classes.dex */
public final class TokenManager {

    /* renamed from: a, reason: collision with root package name */
    public final a f10645a;

    /* renamed from: c, reason: collision with root package name */
    public String f10647c;

    /* renamed from: d, reason: collision with root package name */
    public String f10648d;

    /* renamed from: e, reason: collision with root package name */
    public long f10649e;

    /* renamed from: f, reason: collision with root package name */
    public long f10650f;

    /* renamed from: b, reason: collision with root package name */
    public final String f10646b = "https://api8d9t8.luminaryinc.com/luminaryapi/";

    /* renamed from: g, reason: collision with root package name */
    public final Mutex f10651g = MutexKt.Mutex$default(false, 1, null);

    public TokenManager(a aVar) {
        this.f10645a = aVar;
        this.f10647c = aVar.K();
        this.f10648d = aVar.O();
        this.f10649e = aVar.v();
        this.f10650f = aVar.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(T9.a<? super java.lang.String> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.luminary.business.data.TokenManager$getToken$1
            if (r0 == 0) goto L13
            r0 = r6
            com.luminary.business.data.TokenManager$getToken$1 r0 = (com.luminary.business.data.TokenManager$getToken$1) r0
            int r1 = r0.f10656y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10656y = r1
            goto L18
        L13:
            com.luminary.business.data.TokenManager$getToken$1 r0 = new com.luminary.business.data.TokenManager$getToken$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f10654w
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f10656y
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            kotlinx.coroutines.sync.Mutex r1 = r0.f10653v
            com.luminary.business.data.TokenManager r0 = r0.f10652u
            kotlin.b.b(r6)
            goto L48
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.b.b(r6)
            r0.f10652u = r5
            kotlinx.coroutines.sync.Mutex r6 = r5.f10651g
            r0.f10653v = r6
            r0.f10656y = r3
            java.lang.Object r0 = r6.lock(r4, r0)
            if (r0 != r1) goto L46
            return r1
        L46:
            r0 = r5
            r1 = r6
        L48:
            java.lang.String r6 = r0.f10647c     // Catch: java.lang.Throwable -> L4e
            r1.unlock(r4)
            return r6
        L4e:
            r6 = move-exception
            r1.unlock(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luminary.business.data.TokenManager.a(T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006a A[Catch: all -> 0x00f7, TryCatch #0 {all -> 0x00f7, blocks: (B:11:0x0059, B:13:0x006a, B:15:0x00e9, B:17:0x00f2, B:18:0x00fa, B:20:0x0108, B:23:0x010f, B:25:0x0115, B:26:0x011b, B:29:0x0126, B:31:0x0134, B:32:0x013b, B:35:0x0148, B:40:0x0151, B:43:0x015a), top: B:10:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015a A[Catch: all -> 0x00f7, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00f7, blocks: (B:11:0x0059, B:13:0x006a, B:15:0x00e9, B:17:0x00f2, B:18:0x00fa, B:20:0x0108, B:23:0x010f, B:25:0x0115, B:26:0x011b, B:29:0x0126, B:31:0x0134, B:32:0x013b, B:35:0x0148, B:40:0x0151, B:43:0x015a), top: B:10:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(va.g.a r11, java.lang.String r12, java.lang.String r13, T9.a<? super java.lang.Boolean> r14) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luminary.business.data.TokenManager.b(va.g$a, java.lang.String, java.lang.String, T9.a):java.lang.Object");
    }

    public final void c(String str, String str2, Long l10, Long l11) {
        long j10 = 30;
        long longValue = (l10 != null ? l10.longValue() : 0L) - j10;
        long longValue2 = l11.longValue() - j10;
        this.f10648d = str2;
        this.f10647c = str;
        long j11 = 1000;
        this.f10649e = (System.currentTimeMillis() / j11) + longValue;
        this.f10650f = (System.currentTimeMillis() / j11) + longValue2;
        a aVar = this.f10645a;
        if (str2 != null) {
            aVar.k(str2);
        }
        if (str != null) {
            aVar.V(str);
        }
        aVar.w(longValue);
        aVar.H(longValue2);
    }
}

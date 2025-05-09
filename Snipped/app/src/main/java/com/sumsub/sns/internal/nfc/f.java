package com.sumsub.sns.internal.nfc;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class f {

    @V9.d(c = "com.sumsub.sns.internal.nfc.RunWithRetryKt", f = "RunWithRetry.kt", l = {20}, m = "runWithRetry")
    public static final class a<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f17827a;

        /* renamed from: b, reason: collision with root package name */
        public int f17828b;

        /* renamed from: c, reason: collision with root package name */
        public int f17829c;

        /* renamed from: d, reason: collision with root package name */
        public Object f17830d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f17831e;

        /* renamed from: f, reason: collision with root package name */
        public int f17832f;

        public a(T9.a<? super a> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f17831e = obj;
            this.f17832f |= Integer.MIN_VALUE;
            return f.a(0, 0, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x005f -> B:10:0x0062). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object a(int r7, int r8, ca.InterfaceC0635a<? extends T> r9, T9.a<? super T> r10) {
        /*
            boolean r0 = r10 instanceof com.sumsub.sns.internal.nfc.f.a
            if (r0 == 0) goto L13
            r0 = r10
            com.sumsub.sns.internal.nfc.f$a r0 = (com.sumsub.sns.internal.nfc.f.a) r0
            int r1 = r0.f17832f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17832f = r1
            goto L18
        L13:
            com.sumsub.sns.internal.nfc.f$a r0 = new com.sumsub.sns.internal.nfc.f$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f17831e
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f17832f
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            int r7 = r0.f17829c
            int r8 = r0.f17828b
            int r9 = r0.f17827a
            java.lang.Object r2 = r0.f17830d
            ca.a r2 = (ca.InterfaceC0635a) r2
            kotlin.b.b(r10)
            r10 = r2
            r6 = r9
            r9 = r8
            r8 = r6
            goto L62
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            kotlin.b.b(r10)
            if (r7 < 0) goto L68
            r10 = 0
            r6 = r8
            r8 = r7
            r7 = r10
            r10 = r9
            r9 = r6
        L48:
            java.lang.Object r7 = r10.invoke()     // Catch: java.lang.Throwable -> L4d
            return r7
        L4d:
            r2 = move-exception
            if (r7 == r8) goto L67
            long r4 = (long) r9
            r0.f17830d = r10
            r0.f17827a = r8
            r0.f17828b = r9
            r0.f17829c = r7
            r0.f17832f = r3
            java.lang.Object r2 = kotlinx.coroutines.DelayKt.delay(r4, r0)
            if (r2 != r1) goto L62
            return r1
        L62:
            if (r7 == r8) goto L68
            int r7 = r7 + 1
            goto L48
        L67:
            throw r2
        L68:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Impossible state"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.nfc.f.a(int, int, ca.a, T9.a):java.lang.Object");
    }
}

package com.sumsub.sns.internal.core.domain;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.applicant.b f16314a;

    @V9.d(c = "com.sumsub.sns.internal.core.domain.CheckCodeUseCase", f = "CheckCodeUseCase.kt", l = {12}, m = "invoke-0E7RQCE")
    /* renamed from: com.sumsub.sns.internal.core.domain.a$a, reason: collision with other inner class name */
    public static final class C0237a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f16315a;

        /* renamed from: c, reason: collision with root package name */
        public int f16317c;

        public C0237a(T9.a<? super C0237a> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16315a = obj;
            this.f16317c |= Integer.MIN_VALUE;
            Object a10 = a.this.a(null, null, this);
            return a10 == CoroutineSingletons.f23158a ? a10 : new Result(a10);
        }
    }

    public a(com.sumsub.sns.internal.core.data.source.applicant.b bVar) {
        this.f16314a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r5, java.lang.String r6, T9.a<? super kotlin.Result<com.sumsub.sns.internal.core.data.source.applicant.remote.b0>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.sumsub.sns.internal.core.domain.a.C0237a
            if (r0 == 0) goto L13
            r0 = r7
            com.sumsub.sns.internal.core.domain.a$a r0 = (com.sumsub.sns.internal.core.domain.a.C0237a) r0
            int r1 = r0.f16317c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16317c = r1
            goto L18
        L13:
            com.sumsub.sns.internal.core.domain.a$a r0 = new com.sumsub.sns.internal.core.domain.a$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f16315a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f16317c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.b.b(r7)     // Catch: java.lang.Exception -> L27
            goto L3f
        L27:
            r5 = move-exception
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.b.b(r7)
            com.sumsub.sns.internal.core.data.source.applicant.b r7 = r4.f16314a     // Catch: java.lang.Exception -> L27
            r0.f16317c = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r7 = r7.a(r5, r6, r0)     // Catch: java.lang.Exception -> L27
            if (r7 != r1) goto L3f
            return r1
        L3f:
            com.sumsub.sns.internal.core.data.source.applicant.remote.b0 r7 = (com.sumsub.sns.internal.core.data.source.applicant.remote.b0) r7     // Catch: java.lang.Exception -> L27
            goto L47
        L42:
            kotlin.Result$Failure r7 = new kotlin.Result$Failure
            r7.<init>(r5)
        L47:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.domain.a.a(java.lang.String, java.lang.String, T9.a):java.lang.Object");
    }
}

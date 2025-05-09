package com.sumsub.sns.internal.domain;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class k {

    @V9.d(c = "com.sumsub.sns.internal.domain.SubmitQuestionnaireUseCase", f = "SubmitQuestionnaireUseCase.kt", l = {14}, m = "invoke-0E7RQCE")
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f16858a;

        /* renamed from: c, reason: collision with root package name */
        public int f16860c;

        public a(T9.a<? super a> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16858a = obj;
            this.f16860c |= Integer.MIN_VALUE;
            Object a10 = k.this.a(null, null, this);
            return a10 == CoroutineSingletons.f23158a ? a10 : new Result(a10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.sumsub.sns.internal.core.data.source.applicant.b r5, com.sumsub.sns.internal.core.data.source.applicant.remote.u r6, T9.a<? super kotlin.Result<com.sumsub.sns.internal.core.data.source.applicant.remote.w>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.sumsub.sns.internal.domain.k.a
            if (r0 == 0) goto L13
            r0 = r7
            com.sumsub.sns.internal.domain.k$a r0 = (com.sumsub.sns.internal.domain.k.a) r0
            int r1 = r0.f16860c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16860c = r1
            goto L18
        L13:
            com.sumsub.sns.internal.domain.k$a r0 = new com.sumsub.sns.internal.domain.k$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f16858a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f16860c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.b.b(r7)     // Catch: java.lang.Exception -> L27
            goto L3d
        L27:
            r5 = move-exception
            goto L40
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.b.b(r7)
            r0.f16860c = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r7 = r5.a(r6, r0)     // Catch: java.lang.Exception -> L27
            if (r7 != r1) goto L3d
            return r1
        L3d:
            com.sumsub.sns.internal.core.data.source.applicant.remote.w r7 = (com.sumsub.sns.internal.core.data.source.applicant.remote.w) r7     // Catch: java.lang.Exception -> L27
            goto L45
        L40:
            kotlin.Result$Failure r7 = new kotlin.Result$Failure
            r7.<init>(r5)
        L45:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.domain.k.a(com.sumsub.sns.internal.core.data.source.applicant.b, com.sumsub.sns.internal.core.data.source.applicant.remote.u, T9.a):java.lang.Object");
    }
}

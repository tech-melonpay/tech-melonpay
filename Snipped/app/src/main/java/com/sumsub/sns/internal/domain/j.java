package com.sumsub.sns.internal.domain;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.common.a f16853a;

    @V9.d(c = "com.sumsub.sns.internal.domain.SetApplicantLanguageUseCase", f = "SetApplicantLanguageUseCase.kt", l = {17}, m = "invoke-0E7RQCE")
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f16854a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f16855b;

        /* renamed from: d, reason: collision with root package name */
        public int f16857d;

        public a(T9.a<? super a> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16855b = obj;
            this.f16857d |= Integer.MIN_VALUE;
            Object a10 = j.this.a(null, null, this);
            return a10 == CoroutineSingletons.f23158a ? a10 : new Result(a10);
        }
    }

    public j(com.sumsub.sns.internal.core.data.source.common.a aVar) {
        this.f16853a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r5, com.sumsub.sns.internal.core.data.source.applicant.b r6, T9.a<? super kotlin.Result<O9.p>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.sumsub.sns.internal.domain.j.a
            if (r0 == 0) goto L13
            r0 = r7
            com.sumsub.sns.internal.domain.j$a r0 = (com.sumsub.sns.internal.domain.j.a) r0
            int r1 = r0.f16857d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16857d = r1
            goto L18
        L13:
            com.sumsub.sns.internal.domain.j$a r0 = new com.sumsub.sns.internal.domain.j$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f16855b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f16857d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f16854a
            com.sumsub.sns.internal.domain.j r5 = (com.sumsub.sns.internal.domain.j) r5
            kotlin.b.b(r7)     // Catch: java.lang.Exception -> L2b
            goto L44
        L2b:
            r6 = move-exception
            goto L49
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.b.b(r7)
            r0.f16854a = r4     // Catch: java.lang.Exception -> L47
            r0.f16857d = r3     // Catch: java.lang.Exception -> L47
            java.lang.Object r5 = r6.a(r5, r0)     // Catch: java.lang.Exception -> L47
            if (r5 != r1) goto L43
            return r1
        L43:
            r5 = r4
        L44:
            O9.p r5 = O9.p.f3034a     // Catch: java.lang.Exception -> L2b
            goto L55
        L47:
            r6 = move-exception
            r5 = r4
        L49:
            com.sumsub.sns.internal.core.data.source.common.a r5 = r5.f16853a
            java.lang.Exception r5 = com.sumsub.sns.internal.core.domain.base.d.a(r5, r6)
            kotlin.Result$Failure r6 = new kotlin.Result$Failure
            r6.<init>(r5)
            r5 = r6
        L55:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.domain.j.a(java.lang.String, com.sumsub.sns.internal.core.data.source.applicant.b, T9.a):java.lang.Object");
    }
}

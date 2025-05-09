package com.sumsub.sns.internal.core.domain;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.applicant.b f16414a;

    @V9.d(c = "com.sumsub.sns.internal.core.domain.RequestCodeUseCase", f = "RequestCodeUseCase.kt", l = {17}, m = "invoke-0E7RQCE")
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f16415a;

        /* renamed from: c, reason: collision with root package name */
        public int f16417c;

        public a(T9.a<? super a> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16415a = obj;
            this.f16417c |= Integer.MIN_VALUE;
            Object a10 = l.this.a(null, null, this);
            return a10 == CoroutineSingletons.f23158a ? a10 : new Result(a10);
        }
    }

    public l(com.sumsub.sns.internal.core.data.source.applicant.b bVar) {
        this.f16414a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r6, java.lang.String r7, T9.a<? super kotlin.Result<com.sumsub.sns.internal.core.data.source.applicant.remote.b0>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.sumsub.sns.internal.core.domain.l.a
            if (r0 == 0) goto L13
            r0 = r8
            com.sumsub.sns.internal.core.domain.l$a r0 = (com.sumsub.sns.internal.core.domain.l.a) r0
            int r1 = r0.f16417c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16417c = r1
            goto L18
        L13:
            com.sumsub.sns.internal.core.domain.l$a r0 = new com.sumsub.sns.internal.core.domain.l$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f16415a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f16417c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.b.b(r8)     // Catch: java.lang.Exception -> L27
            goto L46
        L27:
            r6 = move-exception
            goto L49
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.b.b(r8)
            com.sumsub.sns.internal.core.data.source.applicant.b r8 = r5.f16414a     // Catch: java.lang.Exception -> L27
            com.sumsub.sns.internal.core.data.source.applicant.remote.a0 r2 = new com.sumsub.sns.internal.core.data.source.applicant.remote.a0     // Catch: java.lang.Exception -> L27
            java.lang.String r4 = "applicant"
            r2.<init>(r4, r6, r7)     // Catch: java.lang.Exception -> L27
            r0.f16417c = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r8 = r8.a(r2, r0)     // Catch: java.lang.Exception -> L27
            if (r8 != r1) goto L46
            return r1
        L46:
            com.sumsub.sns.internal.core.data.source.applicant.remote.b0 r8 = (com.sumsub.sns.internal.core.data.source.applicant.remote.b0) r8     // Catch: java.lang.Exception -> L27
            goto L4e
        L49:
            kotlin.Result$Failure r8 = new kotlin.Result$Failure
            r8.<init>(r6)
        L4e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.domain.l.a(java.lang.String, java.lang.String, T9.a):java.lang.Object");
    }
}

package com.sumsub.sns.internal.core.domain;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.common.a f16432a;

    /* renamed from: b, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.dynamic.b f16433b;

    @V9.d(c = "com.sumsub.sns.internal.core.domain.SendAgreementUseCase", f = "SendAgreementUseCase.kt", l = {32, 37}, m = "invoke-yxL6bBk")
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f16434a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f16435b;

        /* renamed from: d, reason: collision with root package name */
        public int f16437d;

        public a(T9.a<? super a> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16435b = obj;
            this.f16437d |= Integer.MIN_VALUE;
            Object a10 = n.this.a(null, null, null, false, this);
            return a10 == CoroutineSingletons.f23158a ? a10 : new Result(a10);
        }
    }

    public n(com.sumsub.sns.internal.core.data.source.common.a aVar, com.sumsub.sns.internal.core.data.source.dynamic.b bVar) {
        this.f16432a = aVar;
        this.f16433b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r6v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.sumsub.sns.internal.core.data.source.applicant.b r6, com.sumsub.sns.internal.core.data.model.g r7, com.sumsub.sns.internal.core.data.model.b r8, boolean r9, T9.a<? super kotlin.Result<O9.p>> r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof com.sumsub.sns.internal.core.domain.n.a
            if (r0 == 0) goto L13
            r0 = r10
            com.sumsub.sns.internal.core.domain.n$a r0 = (com.sumsub.sns.internal.core.domain.n.a) r0
            int r1 = r0.f16437d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16437d = r1
            goto L18
        L13:
            com.sumsub.sns.internal.core.domain.n$a r0 = new com.sumsub.sns.internal.core.domain.n$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f16435b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f16437d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f16434a
            com.sumsub.sns.internal.core.domain.n r6 = (com.sumsub.sns.internal.core.domain.n) r6
            kotlin.b.b(r10)     // Catch: java.lang.Exception -> L2e
            goto L6a
        L2e:
            r7 = move-exception
            goto L6f
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.Object r6 = r0.f16434a
            com.sumsub.sns.internal.core.domain.n r6 = (com.sumsub.sns.internal.core.domain.n) r6
            kotlin.b.b(r10)     // Catch: java.lang.Exception -> L2e
            goto L5a
        L40:
            kotlin.b.b(r10)
            com.sumsub.sns.internal.core.data.model.b r10 = r7.r()     // Catch: java.lang.Exception -> L6d
            if (r10 == 0) goto L4e
            if (r9 == 0) goto L4c
            goto L4e
        L4c:
            r6 = r5
            goto L5d
        L4e:
            r0.f16434a = r5     // Catch: java.lang.Exception -> L6d
            r0.f16437d = r4     // Catch: java.lang.Exception -> L6d
            java.lang.Object r10 = r6.a(r8, r0)     // Catch: java.lang.Exception -> L6d
            if (r10 != r1) goto L59
            return r1
        L59:
            r6 = r5
        L5a:
            r7 = r10
            com.sumsub.sns.internal.core.data.model.g r7 = (com.sumsub.sns.internal.core.data.model.g) r7     // Catch: java.lang.Exception -> L2e
        L5d:
            com.sumsub.sns.internal.core.data.source.dynamic.b r8 = r6.f16433b     // Catch: java.lang.Exception -> L2e
            r0.f16434a = r6     // Catch: java.lang.Exception -> L2e
            r0.f16437d = r3     // Catch: java.lang.Exception -> L2e
            java.lang.Object r7 = r8.b(r7, r0)     // Catch: java.lang.Exception -> L2e
            if (r7 != r1) goto L6a
            return r1
        L6a:
            O9.p r6 = O9.p.f3034a     // Catch: java.lang.Exception -> L2e
            goto L86
        L6d:
            r7 = move-exception
            r6 = r5
        L6f:
            com.sumsub.sns.internal.log.a r8 = com.sumsub.sns.internal.log.a.f17535a
            java.lang.String r9 = com.sumsub.sns.internal.log.c.a(r6)
            java.lang.String r10 = "Error during agreement acceptance"
            com.sumsub.sns.internal.log.b.b(r8, r9, r10, r7)
            com.sumsub.sns.internal.core.data.source.common.a r6 = r6.f16432a
            java.lang.Exception r6 = com.sumsub.sns.internal.core.domain.base.d.a(r6, r7)
            kotlin.Result$Failure r7 = new kotlin.Result$Failure
            r7.<init>(r6)
            r6 = r7
        L86:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.domain.n.a(com.sumsub.sns.internal.core.data.source.applicant.b, com.sumsub.sns.internal.core.data.model.g, com.sumsub.sns.internal.core.data.model.b, boolean, T9.a):java.lang.Object");
    }

    public n(com.sumsub.sns.internal.core.a aVar) {
        this(aVar.n(), aVar.p());
    }

    public static /* synthetic */ Object a(n nVar, com.sumsub.sns.internal.core.data.source.applicant.b bVar, com.sumsub.sns.internal.core.data.model.g gVar, com.sumsub.sns.internal.core.data.model.b bVar2, boolean z10, T9.a aVar, int i, Object obj) {
        if ((i & 8) != 0) {
            z10 = true;
        }
        return nVar.a(bVar, gVar, bVar2, z10, aVar);
    }
}

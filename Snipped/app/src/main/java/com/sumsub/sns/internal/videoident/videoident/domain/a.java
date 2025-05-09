package com.sumsub.sns.internal.videoident.videoident.domain;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.common.a f19595a;

    /* renamed from: b, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.applicant.e f19596b;

    @V9.d(c = "com.sumsub.sns.internal.videoident.videoident.domain.AvailableLanguagesUseCase", f = "AvailableLanguagesUseCase.kt", l = {15}, m = "invoke-IoAF18A")
    /* renamed from: com.sumsub.sns.internal.videoident.videoident.domain.a$a, reason: collision with other inner class name */
    public static final class C0363a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f19597a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f19598b;

        /* renamed from: d, reason: collision with root package name */
        public int f19600d;

        public C0363a(T9.a<? super C0363a> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19598b = obj;
            this.f19600d |= Integer.MIN_VALUE;
            Object a10 = a.this.a(this);
            return a10 == CoroutineSingletons.f23158a ? a10 : new Result(a10);
        }
    }

    public a(com.sumsub.sns.internal.core.data.source.common.a aVar, com.sumsub.sns.internal.core.data.source.applicant.e eVar) {
        this.f19595a = aVar;
        this.f19596b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(T9.a<? super kotlin.Result<? extends java.util.List<com.sumsub.sns.internal.core.data.source.applicant.remote.n>>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.sumsub.sns.internal.videoident.videoident.domain.a.C0363a
            if (r0 == 0) goto L13
            r0 = r5
            com.sumsub.sns.internal.videoident.videoident.domain.a$a r0 = (com.sumsub.sns.internal.videoident.videoident.domain.a.C0363a) r0
            int r1 = r0.f19600d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19600d = r1
            goto L18
        L13:
            com.sumsub.sns.internal.videoident.videoident.domain.a$a r0 = new com.sumsub.sns.internal.videoident.videoident.domain.a$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f19598b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f19600d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f19597a
            com.sumsub.sns.internal.videoident.videoident.domain.a r0 = (com.sumsub.sns.internal.videoident.videoident.domain.a) r0
            kotlin.b.b(r5)     // Catch: java.lang.Exception -> L2b
            goto L45
        L2b:
            r5 = move-exception
            goto L48
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.b.b(r5)
            com.sumsub.sns.internal.core.data.source.applicant.e r5 = r4.f19596b     // Catch: java.lang.Exception -> L46
            r0.f19597a = r4     // Catch: java.lang.Exception -> L46
            r0.f19600d = r3     // Catch: java.lang.Exception -> L46
            java.lang.Object r5 = r5.a(r0)     // Catch: java.lang.Exception -> L46
            if (r5 != r1) goto L45
            return r1
        L45:
            return r5
        L46:
            r5 = move-exception
            r0 = r4
        L48:
            com.sumsub.sns.internal.core.data.source.common.a r0 = r0.f19595a
            java.lang.Exception r5 = com.sumsub.sns.internal.core.domain.base.d.a(r0, r5)
            kotlin.Result$Failure r0 = new kotlin.Result$Failure
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.videoident.videoident.domain.a.a(T9.a):java.lang.Object");
    }
}

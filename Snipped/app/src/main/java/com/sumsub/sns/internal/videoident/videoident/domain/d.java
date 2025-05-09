package com.sumsub.sns.internal.videoident.videoident.domain;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.settings.b f19625a;

    /* renamed from: b, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.common.a f19626b;

    /* renamed from: c, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.applicant.e f19627c;

    @V9.d(c = "com.sumsub.sns.internal.videoident.videoident.domain.VideoIdentApplyUseCase", f = "VideoIdentApplyUseCase.kt", l = {17}, m = "invoke-IoAF18A")
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f19628a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f19629b;

        /* renamed from: d, reason: collision with root package name */
        public int f19631d;

        public a(T9.a<? super a> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19629b = obj;
            this.f19631d |= Integer.MIN_VALUE;
            Object a10 = d.this.a(this);
            return a10 == CoroutineSingletons.f23158a ? a10 : new Result(a10);
        }
    }

    public d(com.sumsub.sns.internal.core.data.source.settings.b bVar, com.sumsub.sns.internal.core.data.source.common.a aVar, com.sumsub.sns.internal.core.data.source.applicant.e eVar) {
        this.f19625a = bVar;
        this.f19626b = aVar;
        this.f19627c = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(T9.a<? super kotlin.Result<com.sumsub.sns.internal.core.data.source.applicant.remote.h0>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.sumsub.sns.internal.videoident.videoident.domain.d.a
            if (r0 == 0) goto L13
            r0 = r5
            com.sumsub.sns.internal.videoident.videoident.domain.d$a r0 = (com.sumsub.sns.internal.videoident.videoident.domain.d.a) r0
            int r1 = r0.f19631d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19631d = r1
            goto L18
        L13:
            com.sumsub.sns.internal.videoident.videoident.domain.d$a r0 = new com.sumsub.sns.internal.videoident.videoident.domain.d$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f19629b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f19631d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f19628a
            com.sumsub.sns.internal.videoident.videoident.domain.d r0 = (com.sumsub.sns.internal.videoident.videoident.domain.d) r0
            kotlin.b.b(r5)     // Catch: java.lang.Exception -> L2b
            goto L4b
        L2b:
            r5 = move-exception
            goto L4e
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.b.b(r5)
            com.sumsub.sns.internal.core.data.source.settings.b r5 = r4.f19625a     // Catch: java.lang.Exception -> L4c
            java.lang.String r5 = r5.a()     // Catch: java.lang.Exception -> L4c
            com.sumsub.sns.internal.core.data.source.applicant.e r2 = r4.f19627c     // Catch: java.lang.Exception -> L4c
            r0.f19628a = r4     // Catch: java.lang.Exception -> L4c
            r0.f19631d = r3     // Catch: java.lang.Exception -> L4c
            java.lang.Object r5 = r2.c(r5, r0)     // Catch: java.lang.Exception -> L4c
            if (r5 != r1) goto L4b
            return r1
        L4b:
            return r5
        L4c:
            r5 = move-exception
            r0 = r4
        L4e:
            com.sumsub.sns.internal.core.data.source.common.a r0 = r0.f19626b
            java.lang.Exception r5 = com.sumsub.sns.internal.core.domain.base.d.a(r0, r5)
            kotlin.Result$Failure r0 = new kotlin.Result$Failure
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.videoident.videoident.domain.d.a(T9.a):java.lang.Object");
    }
}

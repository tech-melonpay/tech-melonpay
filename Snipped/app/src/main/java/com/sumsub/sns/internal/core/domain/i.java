package com.sumsub.sns.internal.core.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class i extends com.sumsub.sns.internal.core.domain.base.b<com.sumsub.sns.internal.core.data.model.e, a> {

    /* renamed from: b, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.dynamic.b f16400b;

    public static final class a {
    }

    @V9.d(c = "com.sumsub.sns.internal.core.domain.GetConfigUseCase", f = "GetConfigUseCase.kt", l = {24, 27}, m = "run")
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f16401a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f16402b;

        /* renamed from: d, reason: collision with root package name */
        public int f16404d;

        public b(T9.a<? super b> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16402b = obj;
            this.f16404d |= Integer.MIN_VALUE;
            return i.this.a((a) null, (T9.a<? super com.sumsub.sns.internal.core.domain.model.a<? extends Exception, com.sumsub.sns.internal.core.data.model.e>>) this);
        }
    }

    public i(com.sumsub.sns.internal.core.data.source.common.a aVar, com.sumsub.sns.internal.core.data.source.dynamic.b bVar) {
        super(aVar);
        this.f16400b = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(com.sumsub.sns.internal.core.domain.i.a r6, T9.a<? super com.sumsub.sns.internal.core.domain.model.a<? extends java.lang.Exception, com.sumsub.sns.internal.core.data.model.e>> r7) {
        /*
            r5 = this;
            boolean r6 = r7 instanceof com.sumsub.sns.internal.core.domain.i.b
            if (r6 == 0) goto L13
            r6 = r7
            com.sumsub.sns.internal.core.domain.i$b r6 = (com.sumsub.sns.internal.core.domain.i.b) r6
            int r0 = r6.f16404d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.f16404d = r0
            goto L18
        L13:
            com.sumsub.sns.internal.core.domain.i$b r6 = new com.sumsub.sns.internal.core.domain.i$b
            r6.<init>(r7)
        L18:
            java.lang.Object r7 = r6.f16402b
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r1 = r6.f16404d
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L3d
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2b
            kotlin.b.b(r7)
            goto L64
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            java.lang.Object r1 = r6.f16401a
            com.sumsub.sns.internal.core.domain.i r1 = (com.sumsub.sns.internal.core.domain.i) r1
            kotlin.b.b(r7)     // Catch: java.lang.Exception -> L3b
            goto L4f
        L3b:
            r7 = move-exception
            goto L59
        L3d:
            kotlin.b.b(r7)
            com.sumsub.sns.internal.core.data.source.dynamic.b r7 = r5.f16400b     // Catch: java.lang.Exception -> L57
            r6.f16401a = r5     // Catch: java.lang.Exception -> L57
            r6.f16404d = r4     // Catch: java.lang.Exception -> L57
            r1 = 0
            java.lang.Object r7 = com.sumsub.sns.internal.core.data.source.dynamic.b.a(r7, r1, r6, r4, r2)     // Catch: java.lang.Exception -> L57
            if (r7 != r0) goto L4e
            return r0
        L4e:
            r1 = r5
        L4f:
            com.sumsub.sns.internal.core.data.model.e r7 = (com.sumsub.sns.internal.core.data.model.e) r7     // Catch: java.lang.Exception -> L3b
            com.sumsub.sns.internal.core.domain.model.a$b r4 = new com.sumsub.sns.internal.core.domain.model.a$b     // Catch: java.lang.Exception -> L3b
            r4.<init>(r7)     // Catch: java.lang.Exception -> L3b
            return r4
        L57:
            r7 = move-exception
            r1 = r5
        L59:
            r6.f16401a = r2
            r6.f16404d = r3
            java.lang.Object r7 = r1.a(r7, r6)
            if (r7 != r0) goto L64
            return r0
        L64:
            com.sumsub.sns.internal.core.domain.model.a$a r6 = new com.sumsub.sns.internal.core.domain.model.a$a
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.domain.i.a(com.sumsub.sns.internal.core.domain.i$a, T9.a):java.lang.Object");
    }

    @Override // com.sumsub.sns.internal.core.domain.base.b
    public /* bridge */ /* synthetic */ Object b(a aVar, T9.a<? super com.sumsub.sns.internal.core.domain.model.a<? extends Exception, ? extends com.sumsub.sns.internal.core.data.model.e>> aVar2) {
        return a(aVar, (T9.a<? super com.sumsub.sns.internal.core.domain.model.a<? extends Exception, com.sumsub.sns.internal.core.data.model.e>>) aVar2);
    }

    public i(com.sumsub.sns.internal.core.a aVar) {
        this(aVar.n(), aVar.p());
    }
}

package com.sumsub.sns.internal.domain;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.common.a f16787a;

    /* renamed from: b, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.applicant.b f16788b;

    @V9.d(c = "com.sumsub.sns.internal.domain.DeleteDocumentImagesUseCase", f = "DeleteDocumentImagesUseCase.kt", l = {17}, m = "invoke-gIAlu-s")
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f16789a;

        /* renamed from: b, reason: collision with root package name */
        public Object f16790b;

        /* renamed from: c, reason: collision with root package name */
        public Object f16791c;

        /* renamed from: d, reason: collision with root package name */
        public Object f16792d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f16793e;

        /* renamed from: g, reason: collision with root package name */
        public int f16795g;

        public a(T9.a<? super a> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16793e = obj;
            this.f16795g |= Integer.MIN_VALUE;
            Object a10 = d.this.a(null, this);
            return a10 == CoroutineSingletons.f23158a ? a10 : new Result(a10);
        }
    }

    public d(com.sumsub.sns.internal.core.data.source.common.a aVar, com.sumsub.sns.internal.core.data.source.applicant.b bVar) {
        this.f16787a = aVar;
        this.f16788b = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0056 A[Catch: Exception -> 0x0037, TryCatch #1 {Exception -> 0x0037, blocks: (B:11:0x0033, B:12:0x0073, B:13:0x0050, B:15:0x0056), top: B:10:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0070 -> B:12:0x0073). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.List<java.lang.String> r8, T9.a<? super kotlin.Result<? extends java.util.List<java.lang.String>>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.sumsub.sns.internal.domain.d.a
            if (r0 == 0) goto L13
            r0 = r9
            com.sumsub.sns.internal.domain.d$a r0 = (com.sumsub.sns.internal.domain.d.a) r0
            int r1 = r0.f16795g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16795g = r1
            goto L18
        L13:
            com.sumsub.sns.internal.domain.d$a r0 = new com.sumsub.sns.internal.domain.d$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f16793e
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f16795g
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r8 = r0.f16792d
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r2 = r0.f16791c
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r0.f16790b
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r0.f16789a
            com.sumsub.sns.internal.domain.d r5 = (com.sumsub.sns.internal.domain.d) r5
            kotlin.b.b(r9)     // Catch: java.lang.Exception -> L37
            goto L73
        L37:
            r8 = move-exception
            goto L7a
        L39:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L41:
            kotlin.b.b(r9)
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Exception -> L78
            r9.<init>()     // Catch: java.lang.Exception -> L78
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Exception -> L78
            r5 = r7
            r2 = r8
            r4 = r9
        L50:
            boolean r8 = r2.hasNext()     // Catch: java.lang.Exception -> L37
            if (r8 == 0) goto L77
            java.lang.Object r8 = r2.next()     // Catch: java.lang.Exception -> L37
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L37
            com.sumsub.sns.internal.core.data.source.applicant.b r9 = r5.f16788b     // Catch: java.lang.Exception -> L37
            int r6 = java.lang.Integer.parseInt(r8)     // Catch: java.lang.Exception -> L37
            r0.f16789a = r5     // Catch: java.lang.Exception -> L37
            r0.f16790b = r4     // Catch: java.lang.Exception -> L37
            r0.f16791c = r2     // Catch: java.lang.Exception -> L37
            r0.f16792d = r8     // Catch: java.lang.Exception -> L37
            r0.f16795g = r3     // Catch: java.lang.Exception -> L37
            java.lang.Object r9 = r9.a(r6, r0)     // Catch: java.lang.Exception -> L37
            if (r9 != r1) goto L73
            return r1
        L73:
            r4.add(r8)     // Catch: java.lang.Exception -> L37
            goto L50
        L77:
            return r4
        L78:
            r8 = move-exception
            r5 = r7
        L7a:
            com.sumsub.sns.internal.core.data.source.common.a r9 = r5.f16787a
            java.lang.Exception r8 = com.sumsub.sns.internal.core.domain.base.d.a(r9, r8)
            kotlin.Result$Failure r9 = new kotlin.Result$Failure
            r9.<init>(r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.domain.d.a(java.util.List, T9.a):java.lang.Object");
    }
}

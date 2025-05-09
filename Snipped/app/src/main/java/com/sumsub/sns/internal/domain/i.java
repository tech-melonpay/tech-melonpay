package com.sumsub.sns.internal.domain;

import com.sumsub.sns.internal.core.data.source.applicant.remote.w;
import com.sumsub.sns.internal.core.data.source.applicant.remote.y;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.f;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.applicant.e f16844a;

    /* renamed from: b, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.dynamic.b f16845b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final w f16846a;

        /* renamed from: b, reason: collision with root package name */
        public final y f16847b;

        public a(w wVar, y yVar) {
            this.f16846a = wVar;
            this.f16847b = yVar;
        }

        public final w c() {
            return this.f16846a;
        }

        public final y d() {
            return this.f16847b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return f.b(this.f16846a, aVar.f16846a) && f.b(this.f16847b, aVar.f16847b);
        }

        public int hashCode() {
            int hashCode = this.f16846a.hashCode() * 31;
            y yVar = this.f16847b;
            return hashCode + (yVar == null ? 0 : yVar.hashCode());
        }

        public String toString() {
            return "QuestionnaireInfo(questionnaireResponse=" + this.f16846a + ", questionnaireSubmitModel=" + this.f16847b + ')';
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.domain.RequestQuestionnaireUseCase", f = "RequestQuestionnaireUseCase.kt", l = {25, 27}, m = "invoke-gIAlu-s")
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f16848a;

        /* renamed from: b, reason: collision with root package name */
        public Object f16849b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f16850c;

        /* renamed from: e, reason: collision with root package name */
        public int f16852e;

        public b(T9.a<? super b> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16850c = obj;
            this.f16852e |= Integer.MIN_VALUE;
            Object a10 = i.this.a(null, this);
            return a10 == CoroutineSingletons.f23158a ? a10 : new Result(a10);
        }
    }

    public i(com.sumsub.sns.internal.core.data.source.applicant.e eVar, com.sumsub.sns.internal.core.data.source.dynamic.b bVar) {
        this.f16844a = eVar;
        this.f16845b = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r7, T9.a<? super kotlin.Result<com.sumsub.sns.internal.domain.i.a>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.sumsub.sns.internal.domain.i.b
            if (r0 == 0) goto L13
            r0 = r8
            com.sumsub.sns.internal.domain.i$b r0 = (com.sumsub.sns.internal.domain.i.b) r0
            int r1 = r0.f16852e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16852e = r1
            goto L18
        L13:
            com.sumsub.sns.internal.domain.i$b r0 = new com.sumsub.sns.internal.domain.i$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f16850c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f16852e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.f16849b
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r0 = r0.f16848a
            com.sumsub.sns.internal.core.data.model.g r0 = (com.sumsub.sns.internal.core.data.model.g) r0
            kotlin.b.b(r8)     // Catch: java.lang.Exception -> L32
            goto L75
        L32:
            r7 = move-exception
            goto L86
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            java.lang.Object r7 = r0.f16849b
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r2 = r0.f16848a
            com.sumsub.sns.internal.domain.i r2 = (com.sumsub.sns.internal.domain.i) r2
            kotlin.b.b(r8)     // Catch: java.lang.Exception -> L32
            goto L5d
        L48:
            kotlin.b.b(r8)
            com.sumsub.sns.internal.core.data.source.dynamic.b r8 = r6.f16845b     // Catch: java.lang.Exception -> L32
            r0.f16848a = r6     // Catch: java.lang.Exception -> L32
            r0.f16849b = r7     // Catch: java.lang.Exception -> L32
            r0.f16852e = r4     // Catch: java.lang.Exception -> L32
            r2 = 0
            r5 = 0
            java.lang.Object r8 = com.sumsub.sns.internal.core.data.source.dynamic.b.b(r8, r2, r0, r4, r5)     // Catch: java.lang.Exception -> L32
            if (r8 != r1) goto L5c
            return r1
        L5c:
            r2 = r6
        L5d:
            com.sumsub.sns.internal.core.data.model.g r8 = (com.sumsub.sns.internal.core.data.model.g) r8     // Catch: java.lang.Exception -> L32
            java.lang.String r4 = r8.B()     // Catch: java.lang.Exception -> L32
            com.sumsub.sns.internal.core.data.source.applicant.e r2 = r2.f16844a     // Catch: java.lang.Exception -> L32
            r0.f16848a = r8     // Catch: java.lang.Exception -> L32
            r0.f16849b = r4     // Catch: java.lang.Exception -> L32
            r0.f16852e = r3     // Catch: java.lang.Exception -> L32
            java.lang.Object r7 = r2.g(r7, r0)     // Catch: java.lang.Exception -> L32
            if (r7 != r1) goto L72
            return r1
        L72:
            r0 = r8
            r8 = r7
            r7 = r4
        L75:
            com.sumsub.sns.internal.core.data.source.applicant.remote.w r8 = (com.sumsub.sns.internal.core.data.source.applicant.remote.w) r8     // Catch: java.lang.Exception -> L32
            com.sumsub.sns.internal.domain.i$a r1 = new com.sumsub.sns.internal.domain.i$a     // Catch: java.lang.Exception -> L32
            com.sumsub.sns.internal.core.data.source.applicant.remote.y r2 = new com.sumsub.sns.internal.core.data.source.applicant.remote.y     // Catch: java.lang.Exception -> L32
            java.util.List r0 = r0.H()     // Catch: java.lang.Exception -> L32
            r2.<init>(r7, r0)     // Catch: java.lang.Exception -> L32
            r1.<init>(r8, r2)     // Catch: java.lang.Exception -> L32
            goto L8b
        L86:
            kotlin.Result$Failure r1 = new kotlin.Result$Failure
            r1.<init>(r7)
        L8b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.domain.i.a(java.lang.String, T9.a):java.lang.Object");
    }

    public i(com.sumsub.sns.internal.core.a aVar) {
        this(aVar.h(), aVar.p());
    }
}

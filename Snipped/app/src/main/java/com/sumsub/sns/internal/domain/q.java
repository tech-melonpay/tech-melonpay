package com.sumsub.sns.internal.domain;

import com.sumsub.sns.internal.core.data.model.Document;
import com.sumsub.sns.internal.domain.n;
import java.io.File;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class q extends n<a> {

    public static final class a extends n.a {

        /* renamed from: d, reason: collision with root package name */
        public final File f16920d;

        /* renamed from: e, reason: collision with root package name */
        public final String f16921e;

        public a(Document document, File file, String str) {
            super(document, null, true, 2, null);
            this.f16920d = file;
            this.f16921e = str;
        }

        public final File d() {
            return this.f16920d;
        }

        public final String e() {
            return this.f16921e;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.domain.UploadDocumentVideoSelfieUseCase", f = "UploadDocumentVideoSelfieUseCase.kt", l = {46}, m = "upload")
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f16922a;

        /* renamed from: c, reason: collision with root package name */
        public int f16924c;

        public b(T9.a<? super b> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16922a = obj;
            this.f16924c |= Integer.MIN_VALUE;
            return q.this.b2((a) null, (com.sumsub.sns.internal.core.data.model.g) null, (String) null, (T9.a<? super List<com.sumsub.sns.internal.core.data.model.remote.k>>) this);
        }
    }

    public q(com.sumsub.sns.internal.core.data.source.common.a aVar, com.sumsub.sns.internal.core.data.source.applicant.b bVar, com.sumsub.sns.internal.core.data.source.settings.b bVar2, com.sumsub.sns.internal.core.data.source.dynamic.b bVar3) {
        super(aVar, bVar, bVar2, bVar3);
    }

    @Override // com.sumsub.sns.internal.domain.n
    public /* bridge */ /* synthetic */ Object a(a aVar, com.sumsub.sns.internal.core.data.model.g gVar, String str, T9.a aVar2) {
        return a2(aVar, gVar, str, (T9.a<? super List<com.sumsub.sns.internal.core.data.model.remote.k>>) aVar2);
    }

    @Override // com.sumsub.sns.internal.domain.n
    public /* bridge */ /* synthetic */ Object b(a aVar, com.sumsub.sns.internal.core.data.model.g gVar, String str, T9.a aVar2) {
        return b2(aVar, gVar, str, (T9.a<? super List<com.sumsub.sns.internal.core.data.model.remote.k>>) aVar2);
    }

    public q(com.sumsub.sns.internal.core.a aVar) {
        this(aVar.n(), aVar.g(), aVar.F(), aVar.p());
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    public Object a2(a aVar, com.sumsub.sns.internal.core.data.model.g gVar, String str, T9.a<? super List<com.sumsub.sns.internal.core.data.model.remote.k>> aVar2) {
        throw new UnsupportedOperationException("Not yet implemented and never will");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* renamed from: b, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b2(com.sumsub.sns.internal.domain.q.a r15, com.sumsub.sns.internal.core.data.model.g r16, java.lang.String r17, T9.a<? super java.util.List<com.sumsub.sns.internal.core.data.model.remote.k>> r18) {
        /*
            r14 = this;
            r0 = r18
            boolean r1 = r0 instanceof com.sumsub.sns.internal.domain.q.b
            if (r1 == 0) goto L17
            r1 = r0
            com.sumsub.sns.internal.domain.q$b r1 = (com.sumsub.sns.internal.domain.q.b) r1
            int r2 = r1.f16924c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f16924c = r2
            r2 = r14
        L15:
            r11 = r1
            goto L1e
        L17:
            com.sumsub.sns.internal.domain.q$b r1 = new com.sumsub.sns.internal.domain.q$b
            r2 = r14
            r1.<init>(r0)
            goto L15
        L1e:
            java.lang.Object r0 = r11.f16922a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r3 = r11.f16924c
            r4 = 1
            if (r3 == 0) goto L35
            if (r3 != r4) goto L2d
            kotlin.b.b(r0)
            goto L85
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L35:
            kotlin.b.b(r0)
            com.sumsub.sns.internal.core.data.model.Document r0 = r15.b()
            com.sumsub.sns.internal.core.data.model.DocumentType r0 = r0.getType()
            r3 = r16
            java.util.List r0 = r3.b(r0)
            java.lang.Object r0 = P9.s.L(r0)
            com.sumsub.sns.internal.core.data.model.q r0 = (com.sumsub.sns.internal.core.data.model.q) r0
            if (r0 == 0) goto L57
            java.lang.String r0 = r0.b()
            if (r0 != 0) goto L55
            goto L57
        L55:
            r6 = r0
            goto L5e
        L57:
            com.sumsub.sns.internal.core.data.model.q$g r0 = com.sumsub.sns.internal.core.data.model.q.g.f15567f
            java.lang.String r0 = r0.b()
            goto L55
        L5e:
            java.lang.String r0 = r15.e()
            java.lang.String r0 = com.sumsub.sns.internal.core.common.i.a(r0)
            java.lang.String r3 = "X-Video-Selfie-Phrase"
            java.util.Map r8 = com.google.android.gms.measurement.internal.a.n(r3, r0)
            com.sumsub.sns.internal.core.data.source.applicant.b r3 = r14.b()
            java.io.File r5 = r15.d()
            r11.f16924c = r4
            r12 = 40
            r13 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r4 = r17
            java.lang.Object r0 = com.sumsub.sns.internal.core.data.source.applicant.b.a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r0 != r1) goto L85
            return r1
        L85:
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.domain.q.b2(com.sumsub.sns.internal.domain.q$a, com.sumsub.sns.internal.core.data.model.g, java.lang.String, T9.a):java.lang.Object");
    }
}

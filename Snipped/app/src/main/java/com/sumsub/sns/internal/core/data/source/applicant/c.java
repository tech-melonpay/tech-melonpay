package com.sumsub.sns.internal.core.data.source.applicant;

import ca.InterfaceC0646l;
import com.sumsub.sns.internal.core.data.source.applicant.remote.a0;
import com.sumsub.sns.internal.core.data.source.applicant.remote.u;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.tls.CipherSuite;

/* loaded from: classes2.dex */
public final class c implements com.sumsub.sns.internal.core.data.source.applicant.b {

    /* renamed from: a, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.applicant.a f15831a;

    /* renamed from: b, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.dynamic.b f15832b;

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.applicant.ApplicantProxyRepositoryImpl", f = "ApplicantProxyRepositoryImpl.kt", l = {235}, m = "acquireActionId")
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f15833a;

        /* renamed from: c, reason: collision with root package name */
        public int f15835c;

        public a(T9.a<? super a> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15833a = obj;
            this.f15835c |= Integer.MIN_VALUE;
            return c.this.d(this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.applicant.ApplicantProxyRepositoryImpl", f = "ApplicantProxyRepositoryImpl.kt", l = {239}, m = "acquireApplicantId")
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f15836a;

        /* renamed from: c, reason: collision with root package name */
        public int f15838c;

        public b(T9.a<? super b> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15836a = obj;
            this.f15838c |= Integer.MIN_VALUE;
            return c.this.e(this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.applicant.ApplicantProxyRepositoryImpl", f = "ApplicantProxyRepositoryImpl.kt", l = {30, 32, 38}, m = "acquireQuestionnaireId")
    /* renamed from: com.sumsub.sns.internal.core.data.source.applicant.c$c, reason: collision with other inner class name */
    public static final class C0224c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15839a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f15840b;

        /* renamed from: d, reason: collision with root package name */
        public int f15842d;

        public C0224c(T9.a<? super C0224c> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15840b = obj;
            this.f15842d |= Integer.MIN_VALUE;
            return c.this.c(this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.applicant.ApplicantProxyRepositoryImpl", f = "ApplicantProxyRepositoryImpl.kt", l = {CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256}, m = "buildFileUrlProvider")
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15843a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f15844b;

        /* renamed from: d, reason: collision with root package name */
        public int f15846d;

        public d(T9.a<? super d> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15844b = obj;
            this.f15846d |= Integer.MIN_VALUE;
            return c.this.a(this);
        }
    }

    public static final class e implements InterfaceC0646l<String, String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f15847a;

        public e(String str) {
            this.f15847a = str;
        }

        @Override // ca.InterfaceC0646l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String invoke(String str) {
            return s3.b.o(new StringBuilder("resources/applicantActions/"), this.f15847a, "/images/", str, "?preview=true");
        }
    }

    public static final class f implements InterfaceC0646l<String, String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f15848a;

        public f(String str) {
            this.f15848a = str;
        }

        @Override // ca.InterfaceC0646l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String invoke(String str) {
            return s3.b.o(new StringBuilder("resources/applicants/"), this.f15848a, "/resources/", str, "?preview=true");
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.applicant.ApplicantProxyRepositoryImpl", f = "ApplicantProxyRepositoryImpl.kt", l = {97, 98, 104, 105}, m = "deleteImage")
    public static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15850a;

        /* renamed from: b, reason: collision with root package name */
        public int f15851b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f15852c;

        /* renamed from: e, reason: collision with root package name */
        public int f15854e;

        public h(T9.a<? super h> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15852c = obj;
            this.f15854e |= Integer.MIN_VALUE;
            return c.this.a(0, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.applicant.ApplicantProxyRepositoryImpl", f = "ApplicantProxyRepositoryImpl.kt", l = {70, 71, 74, 75}, m = "postAgreement")
    public static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15855a;

        /* renamed from: b, reason: collision with root package name */
        public Object f15856b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f15857c;

        /* renamed from: e, reason: collision with root package name */
        public int f15859e;

        public i(T9.a<? super i> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15857c = obj;
            this.f15859e |= Integer.MIN_VALUE;
            return c.this.a((com.sumsub.sns.internal.core.data.model.b) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.applicant.ApplicantProxyRepositoryImpl", f = "ApplicantProxyRepositoryImpl.kt", l = {201, 202, 208, 209}, m = "requestCode")
    public static final class j extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15860a;

        /* renamed from: b, reason: collision with root package name */
        public Object f15861b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f15862c;

        /* renamed from: e, reason: collision with root package name */
        public int f15864e;

        public j(T9.a<? super j> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15862c = obj;
            this.f15864e |= Integer.MIN_VALUE;
            return c.this.a((a0) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.applicant.ApplicantProxyRepositoryImpl", f = "ApplicantProxyRepositoryImpl.kt", l = {61, 62}, m = "setApplicantLanguage")
    public static final class k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15865a;

        /* renamed from: b, reason: collision with root package name */
        public Object f15866b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f15867c;

        /* renamed from: e, reason: collision with root package name */
        public int f15869e;

        public k(T9.a<? super k> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15867c = obj;
            this.f15869e |= Integer.MIN_VALUE;
            return c.this.a((String) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.applicant.ApplicantProxyRepositoryImpl", f = "ApplicantProxyRepositoryImpl.kt", l = {45, 46, 47, 53, 54}, m = "setPending")
    public static final class l extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15870a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f15871b;

        /* renamed from: d, reason: collision with root package name */
        public int f15873d;

        public l(T9.a<? super l> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15871b = obj;
            this.f15873d |= Integer.MIN_VALUE;
            return c.this.b(this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.applicant.ApplicantProxyRepositoryImpl", f = "ApplicantProxyRepositoryImpl.kt", l = {80, 81, 91}, m = "submitQuestionnaire")
    public static final class m extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15874a;

        /* renamed from: b, reason: collision with root package name */
        public Object f15875b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f15876c;

        /* renamed from: e, reason: collision with root package name */
        public int f15878e;

        public m(T9.a<? super m> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15876c = obj;
            this.f15878e |= Integer.MIN_VALUE;
            return c.this.a((u) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.applicant.ApplicantProxyRepositoryImpl", f = "ApplicantProxyRepositoryImpl.kt", l = {154, 155, 167, 168}, m = "uploadFile")
    public static final class o extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15879a;

        /* renamed from: b, reason: collision with root package name */
        public Object f15880b;

        /* renamed from: c, reason: collision with root package name */
        public Object f15881c;

        /* renamed from: d, reason: collision with root package name */
        public Object f15882d;

        /* renamed from: e, reason: collision with root package name */
        public Object f15883e;

        /* renamed from: f, reason: collision with root package name */
        public Object f15884f;

        /* renamed from: g, reason: collision with root package name */
        public Object f15885g;

        /* renamed from: h, reason: collision with root package name */
        public Object f15886h;
        public /* synthetic */ Object i;

        /* renamed from: k, reason: collision with root package name */
        public int f15888k;

        public o(T9.a<? super o> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.f15888k |= Integer.MIN_VALUE;
            return c.this.a(null, null, null, null, null, null, null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.applicant.ApplicantProxyRepositoryImpl", f = "ApplicantProxyRepositoryImpl.kt", l = {217, 218, 225, 226}, m = "verifyCode")
    public static final class p extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15889a;

        /* renamed from: b, reason: collision with root package name */
        public Object f15890b;

        /* renamed from: c, reason: collision with root package name */
        public Object f15891c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f15892d;

        /* renamed from: f, reason: collision with root package name */
        public int f15894f;

        public p(T9.a<? super p> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15892d = obj;
            this.f15894f |= Integer.MIN_VALUE;
            return c.this.a(null, null, this);
        }
    }

    public c(com.sumsub.sns.internal.core.data.source.applicant.a aVar, com.sumsub.sns.internal.core.data.source.dynamic.b bVar) {
        this.f15831a = aVar;
        this.f15832b = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // com.sumsub.sns.internal.core.data.source.applicant.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(T9.a<? super java.lang.String> r9) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.applicant.c.c(T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(T9.a<? super java.lang.String> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.sumsub.sns.internal.core.data.source.applicant.c.a
            if (r0 == 0) goto L13
            r0 = r6
            com.sumsub.sns.internal.core.data.source.applicant.c$a r0 = (com.sumsub.sns.internal.core.data.source.applicant.c.a) r0
            int r1 = r0.f15835c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15835c = r1
            goto L18
        L13:
            com.sumsub.sns.internal.core.data.source.applicant.c$a r0 = new com.sumsub.sns.internal.core.data.source.applicant.c$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f15833a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f15835c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            kotlin.b.b(r6)
            goto L3f
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L30:
            kotlin.b.b(r6)
            com.sumsub.sns.internal.core.data.source.dynamic.b r6 = r5.f15832b
            r0.f15835c = r4
            r2 = 0
            java.lang.Object r6 = com.sumsub.sns.internal.core.data.source.dynamic.b.d(r6, r2, r0, r4, r3)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            com.sumsub.sns.internal.core.data.source.dynamic.e r6 = (com.sumsub.sns.internal.core.data.source.dynamic.e) r6
            java.lang.Object r6 = r6.d()
            com.sumsub.sns.internal.core.data.model.e r6 = (com.sumsub.sns.internal.core.data.model.e) r6
            if (r6 == 0) goto L53
            com.sumsub.sns.internal.core.data.model.e$a r6 = r6.r()
            if (r6 == 0) goto L53
            java.lang.String r3 = r6.c()
        L53:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.applicant.c.d(T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(T9.a<? super java.lang.String> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.sumsub.sns.internal.core.data.source.applicant.c.b
            if (r0 == 0) goto L14
            r0 = r8
            com.sumsub.sns.internal.core.data.source.applicant.c$b r0 = (com.sumsub.sns.internal.core.data.source.applicant.c.b) r0
            int r1 = r0.f15838c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f15838c = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.sumsub.sns.internal.core.data.source.applicant.c$b r0 = new com.sumsub.sns.internal.core.data.source.applicant.c$b
            r0.<init>(r8)
            goto L12
        L1a:
            java.lang.Object r8 = r4.f15836a
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r1 = r4.f15838c
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            kotlin.b.b(r8)
            goto L43
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L31:
            kotlin.b.b(r8)
            com.sumsub.sns.internal.core.data.source.dynamic.b r1 = r7.f15832b
            r4.f15838c = r2
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            java.lang.Object r8 = com.sumsub.sns.internal.core.data.source.dynamic.b.d(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L43
            return r0
        L43:
            com.sumsub.sns.internal.core.data.source.dynamic.e r8 = (com.sumsub.sns.internal.core.data.source.dynamic.e) r8
            java.lang.Object r8 = r8.d()
            com.sumsub.sns.internal.core.data.model.g r8 = (com.sumsub.sns.internal.core.data.model.g) r8
            if (r8 == 0) goto L52
            java.lang.String r8 = r8.B()
            goto L53
        L52:
            r8 = 0
        L53:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.applicant.c.e(T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.sumsub.sns.internal.core.data.source.applicant.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.lang.String r6, T9.a<? super O9.p> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.sumsub.sns.internal.core.data.source.applicant.c.k
            if (r0 == 0) goto L13
            r0 = r7
            com.sumsub.sns.internal.core.data.source.applicant.c$k r0 = (com.sumsub.sns.internal.core.data.source.applicant.c.k) r0
            int r1 = r0.f15869e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15869e = r1
            goto L18
        L13:
            com.sumsub.sns.internal.core.data.source.applicant.c$k r0 = new com.sumsub.sns.internal.core.data.source.applicant.c$k
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f15867c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f15869e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.b.b(r7)
            goto L63
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.f15866b
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r2 = r0.f15865a
            com.sumsub.sns.internal.core.data.source.applicant.c r2 = (com.sumsub.sns.internal.core.data.source.applicant.c) r2
            kotlin.b.b(r7)
            goto L4f
        L3e:
            kotlin.b.b(r7)
            r0.f15865a = r5
            r0.f15866b = r6
            r0.f15869e = r4
            java.lang.Object r7 = r5.e(r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            r2 = r5
        L4f:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L63
            com.sumsub.sns.internal.core.data.source.applicant.a r2 = r2.f15831a
            r4 = 0
            r0.f15865a = r4
            r0.f15866b = r4
            r0.f15869e = r3
            java.lang.Object r6 = r2.a(r7, r6, r0)
            if (r6 != r1) goto L63
            return r1
        L63:
            O9.p r6 = O9.p.f3034a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.applicant.c.a(java.lang.String, T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.sumsub.sns.internal.core.data.source.applicant.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(T9.a<? super java.lang.Boolean> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.sumsub.sns.internal.core.data.source.applicant.c.l
            if (r0 == 0) goto L13
            r0 = r10
            com.sumsub.sns.internal.core.data.source.applicant.c$l r0 = (com.sumsub.sns.internal.core.data.source.applicant.c.l) r0
            int r1 = r0.f15873d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15873d = r1
            goto L18
        L13:
            com.sumsub.sns.internal.core.data.source.applicant.c$l r0 = new com.sumsub.sns.internal.core.data.source.applicant.c$l
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f15871b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f15873d
            r3 = 0
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r2 == 0) goto L5d
            if (r2 == r8) goto L55
            if (r2 == r7) goto L4d
            if (r2 == r6) goto L45
            if (r2 == r5) goto L3d
            if (r2 != r4) goto L35
            kotlin.b.b(r10)
            goto Lc0
        L35:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3d:
            java.lang.Object r2 = r0.f15870a
            com.sumsub.sns.internal.core.data.source.applicant.c r2 = (com.sumsub.sns.internal.core.data.source.applicant.c) r2
            kotlin.b.b(r10)
            goto Lae
        L45:
            java.lang.Object r0 = r0.f15870a
            com.sumsub.sns.internal.core.data.model.g r0 = (com.sumsub.sns.internal.core.data.model.g) r0
            kotlin.b.b(r10)
            goto L91
        L4d:
            java.lang.Object r2 = r0.f15870a
            com.sumsub.sns.internal.core.data.source.applicant.c r2 = (com.sumsub.sns.internal.core.data.source.applicant.c) r2
            kotlin.b.b(r10)
            goto L7d
        L55:
            java.lang.Object r2 = r0.f15870a
            com.sumsub.sns.internal.core.data.source.applicant.c r2 = (com.sumsub.sns.internal.core.data.source.applicant.c) r2
            kotlin.b.b(r10)
            goto L6c
        L5d:
            kotlin.b.b(r10)
            r0.f15870a = r9
            r0.f15873d = r8
            java.lang.Object r10 = r9.d(r0)
            if (r10 != r1) goto L6b
            return r1
        L6b:
            r2 = r9
        L6c:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto La3
            com.sumsub.sns.internal.core.data.source.applicant.a r4 = r2.f15831a
            r0.f15870a = r2
            r0.f15873d = r7
            java.lang.Object r10 = r4.f(r10, r0)
            if (r10 != r1) goto L7d
            return r1
        L7d:
            com.sumsub.sns.internal.core.data.model.remote.response.d$c$d r10 = (com.sumsub.sns.internal.core.data.model.remote.response.d.c.C0219d) r10
            com.sumsub.sns.internal.core.data.model.g r10 = com.sumsub.sns.internal.core.data.model.remote.response.e.b(r10)
            com.sumsub.sns.internal.core.data.source.dynamic.b r2 = r2.f15832b
            r0.f15870a = r10
            r0.f15873d = r6
            java.lang.Object r0 = r2.b(r10, r0)
            if (r0 != r1) goto L90
            return r1
        L90:
            r0 = r10
        L91:
            com.sumsub.sns.internal.core.data.model.g$d r10 = r0.J()
            com.sumsub.sns.internal.core.data.model.ReviewStatusType r10 = r10.p()
            com.sumsub.sns.internal.core.data.model.ReviewStatusType r0 = com.sumsub.sns.internal.core.data.model.ReviewStatusType.Pending
            if (r10 != r0) goto L9e
            r3 = r8
        L9e:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)
            return r10
        La3:
            r0.f15870a = r2
            r0.f15873d = r5
            java.lang.Object r10 = r2.e(r0)
            if (r10 != r1) goto Lae
            return r1
        Lae:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto Lc6
            com.sumsub.sns.internal.core.data.source.applicant.a r2 = r2.f15831a
            r3 = 0
            r0.f15870a = r3
            r0.f15873d = r4
            java.lang.Object r10 = r2.a(r10, r0)
            if (r10 != r1) goto Lc0
            return r1
        Lc0:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r3 = r10.booleanValue()
        Lc6:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.applicant.c.b(T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.sumsub.sns.internal.core.data.source.applicant.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(com.sumsub.sns.internal.core.data.model.b r9, T9.a<? super com.sumsub.sns.internal.core.data.model.g> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.sumsub.sns.internal.core.data.source.applicant.c.i
            if (r0 == 0) goto L13
            r0 = r10
            com.sumsub.sns.internal.core.data.source.applicant.c$i r0 = (com.sumsub.sns.internal.core.data.source.applicant.c.i) r0
            int r1 = r0.f15859e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15859e = r1
            goto L18
        L13:
            com.sumsub.sns.internal.core.data.source.applicant.c$i r0 = new com.sumsub.sns.internal.core.data.source.applicant.c$i
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f15857c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f15859e
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L55
            if (r2 == r6) goto L49
            if (r2 == r5) goto L45
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            kotlin.b.b(r10)
            goto L9a
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            java.lang.Object r9 = r0.f15856b
            com.sumsub.sns.internal.core.data.model.b r9 = (com.sumsub.sns.internal.core.data.model.b) r9
            java.lang.Object r2 = r0.f15855a
            com.sumsub.sns.internal.core.data.source.applicant.c r2 = (com.sumsub.sns.internal.core.data.source.applicant.c) r2
            kotlin.b.b(r10)
            goto L87
        L45:
            kotlin.b.b(r10)
            goto L79
        L49:
            java.lang.Object r9 = r0.f15856b
            com.sumsub.sns.internal.core.data.model.b r9 = (com.sumsub.sns.internal.core.data.model.b) r9
            java.lang.Object r2 = r0.f15855a
            com.sumsub.sns.internal.core.data.source.applicant.c r2 = (com.sumsub.sns.internal.core.data.source.applicant.c) r2
            kotlin.b.b(r10)
            goto L66
        L55:
            kotlin.b.b(r10)
            r0.f15855a = r8
            r0.f15856b = r9
            r0.f15859e = r6
            java.lang.Object r10 = r8.d(r0)
            if (r10 != r1) goto L65
            return r1
        L65:
            r2 = r8
        L66:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L7a
            com.sumsub.sns.internal.core.data.source.applicant.a r2 = r2.f15831a
            r0.f15855a = r7
            r0.f15856b = r7
            r0.f15859e = r5
            java.lang.Object r10 = r2.b(r10, r9, r0)
            if (r10 != r1) goto L79
            return r1
        L79:
            return r10
        L7a:
            r0.f15855a = r2
            r0.f15856b = r9
            r0.f15859e = r4
            java.lang.Object r10 = r2.e(r0)
            if (r10 != r1) goto L87
            return r1
        L87:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L9d
            com.sumsub.sns.internal.core.data.source.applicant.a r2 = r2.f15831a
            r0.f15855a = r7
            r0.f15856b = r7
            r0.f15859e = r3
            java.lang.Object r10 = r2.a(r10, r9, r0)
            if (r10 != r1) goto L9a
            return r1
        L9a:
            r7 = r10
            com.sumsub.sns.internal.core.data.model.g r7 = (com.sumsub.sns.internal.core.data.model.g) r7
        L9d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.applicant.c.a(com.sumsub.sns.internal.core.data.model.b, T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.sumsub.sns.internal.core.data.source.applicant.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(com.sumsub.sns.internal.core.data.source.applicant.remote.u r7, T9.a<? super com.sumsub.sns.internal.core.data.source.applicant.remote.w> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.sumsub.sns.internal.core.data.source.applicant.c.m
            if (r0 == 0) goto L13
            r0 = r8
            com.sumsub.sns.internal.core.data.source.applicant.c$m r0 = (com.sumsub.sns.internal.core.data.source.applicant.c.m) r0
            int r1 = r0.f15878e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15878e = r1
            goto L18
        L13:
            com.sumsub.sns.internal.core.data.source.applicant.c$m r0 = new com.sumsub.sns.internal.core.data.source.applicant.c$m
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f15876c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f15878e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.b.b(r8)
            goto L87
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.b.b(r8)
            goto L77
        L39:
            java.lang.Object r7 = r0.f15875b
            com.sumsub.sns.internal.core.data.source.applicant.remote.u r7 = (com.sumsub.sns.internal.core.data.source.applicant.remote.u) r7
            java.lang.Object r2 = r0.f15874a
            com.sumsub.sns.internal.core.data.source.applicant.c r2 = (com.sumsub.sns.internal.core.data.source.applicant.c) r2
            kotlin.b.b(r8)
            goto L56
        L45:
            kotlin.b.b(r8)
            r0.f15874a = r6
            r0.f15875b = r7
            r0.f15878e = r5
            java.lang.Object r8 = r6.d(r0)
            if (r8 != r1) goto L55
            return r1
        L55:
            r2 = r6
        L56:
            java.lang.String r8 = (java.lang.String) r8
            r5 = 0
            if (r8 == 0) goto L78
            com.sumsub.sns.internal.core.data.source.applicant.a r2 = r2.f15831a
            com.sumsub.sns.internal.core.data.source.applicant.remote.y r3 = new com.sumsub.sns.internal.core.data.source.applicant.remote.y
            com.sumsub.sns.internal.core.data.source.applicant.remote.u[] r7 = new com.sumsub.sns.internal.core.data.source.applicant.remote.u[]{r7}
            java.util.ArrayList r7 = P9.m.r(r7)
            r3.<init>(r8, r7)
            r0.f15874a = r5
            r0.f15875b = r5
            r0.f15878e = r4
            java.lang.Object r8 = r2.a(r3, r0)
            if (r8 != r1) goto L77
            return r1
        L77:
            return r8
        L78:
            com.sumsub.sns.internal.core.data.source.applicant.a r8 = r2.f15831a
            r0.f15874a = r5
            r0.f15875b = r5
            r0.f15878e = r3
            java.lang.Object r8 = r8.a(r7, r0)
            if (r8 != r1) goto L87
            return r1
        L87:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.applicant.c.a(com.sumsub.sns.internal.core.data.source.applicant.remote.u, T9.a):java.lang.Object");
    }

    public static final class g extends Lambda implements InterfaceC0646l<String, String> {

        /* renamed from: a, reason: collision with root package name */
        public static final g f15849a = new g();

        public g() {
            super(1);
        }

        @Override // ca.InterfaceC0646l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str) {
            return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.sumsub.sns.internal.core.data.source.applicant.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(int r8, T9.a<? super O9.p> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.sumsub.sns.internal.core.data.source.applicant.c.h
            if (r0 == 0) goto L13
            r0 = r9
            com.sumsub.sns.internal.core.data.source.applicant.c$h r0 = (com.sumsub.sns.internal.core.data.source.applicant.c.h) r0
            int r1 = r0.f15854e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15854e = r1
            goto L18
        L13:
            com.sumsub.sns.internal.core.data.source.applicant.c$h r0 = new com.sumsub.sns.internal.core.data.source.applicant.c$h
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f15852c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f15854e
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L54
            if (r2 == r6) goto L4a
            if (r2 == r5) goto L46
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r8 = r0.f15850a
            java.lang.String r8 = (java.lang.String) r8
            kotlin.b.b(r9)
            goto L98
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            int r8 = r0.f15851b
            java.lang.Object r2 = r0.f15850a
            com.sumsub.sns.internal.core.data.source.applicant.c r2 = (com.sumsub.sns.internal.core.data.source.applicant.c) r2
            kotlin.b.b(r9)
            goto L87
        L46:
            kotlin.b.b(r9)
            goto L77
        L4a:
            int r8 = r0.f15851b
            java.lang.Object r2 = r0.f15850a
            com.sumsub.sns.internal.core.data.source.applicant.c r2 = (com.sumsub.sns.internal.core.data.source.applicant.c) r2
            kotlin.b.b(r9)
            goto L65
        L54:
            kotlin.b.b(r9)
            r0.f15850a = r7
            r0.f15851b = r8
            r0.f15854e = r6
            java.lang.Object r9 = r7.d(r0)
            if (r9 != r1) goto L64
            return r1
        L64:
            r2 = r7
        L65:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L7a
            com.sumsub.sns.internal.core.data.source.applicant.a r2 = r2.f15831a
            r3 = 0
            r0.f15850a = r3
            r0.f15854e = r5
            java.lang.Object r8 = r2.b(r9, r8, r0)
            if (r8 != r1) goto L77
            return r1
        L77:
            O9.p r8 = O9.p.f3034a
            return r8
        L7a:
            r0.f15850a = r2
            r0.f15851b = r8
            r0.f15854e = r4
            java.lang.Object r9 = r2.e(r0)
            if (r9 != r1) goto L87
            return r1
        L87:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L98
            com.sumsub.sns.internal.core.data.source.applicant.a r2 = r2.f15831a
            r0.f15850a = r9
            r0.f15854e = r3
            java.lang.Object r8 = r2.a(r9, r8, r0)
            if (r8 != r1) goto L98
            return r1
        L98:
            O9.p r8 = O9.p.f3034a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.applicant.c.a(int, T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    @Override // com.sumsub.sns.internal.core.data.source.applicant.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.lang.String r19, java.io.File r20, java.lang.String r21, com.sumsub.sns.internal.core.data.model.IdentitySide r22, java.util.Map<java.lang.String, java.lang.String> r23, com.sumsub.sns.internal.core.data.model.DocumentType r24, com.sumsub.sns.internal.core.data.source.applicant.remote.utils.a.InterfaceC0229a r25, T9.a<? super com.sumsub.sns.internal.core.data.model.remote.k> r26) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.applicant.c.a(java.lang.String, java.io.File, java.lang.String, com.sumsub.sns.internal.core.data.model.IdentitySide, java.util.Map, com.sumsub.sns.internal.core.data.model.DocumentType, com.sumsub.sns.internal.core.data.source.applicant.remote.utils.a$a, T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.sumsub.sns.internal.core.data.source.applicant.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(T9.a<? super ca.InterfaceC0646l<? super java.lang.String, java.lang.String>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.sumsub.sns.internal.core.data.source.applicant.c.d
            if (r0 == 0) goto L13
            r0 = r6
            com.sumsub.sns.internal.core.data.source.applicant.c$d r0 = (com.sumsub.sns.internal.core.data.source.applicant.c.d) r0
            int r1 = r0.f15846d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15846d = r1
            goto L18
        L13:
            com.sumsub.sns.internal.core.data.source.applicant.c$d r0 = new com.sumsub.sns.internal.core.data.source.applicant.c$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f15844b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f15846d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.b.b(r6)
            goto L5f
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            java.lang.Object r2 = r0.f15843a
            com.sumsub.sns.internal.core.data.source.applicant.c r2 = (com.sumsub.sns.internal.core.data.source.applicant.c) r2
            kotlin.b.b(r6)
            goto L49
        L3a:
            kotlin.b.b(r6)
            r0.f15843a = r5
            r0.f15846d = r4
            java.lang.Object r6 = r5.d(r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            r2 = r5
        L49:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L53
            com.sumsub.sns.internal.core.data.source.applicant.c$e r0 = new com.sumsub.sns.internal.core.data.source.applicant.c$e
            r0.<init>(r6)
            return r0
        L53:
            r6 = 0
            r0.f15843a = r6
            r0.f15846d = r3
            java.lang.Object r6 = r2.e(r0)
            if (r6 != r1) goto L5f
            return r1
        L5f:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L69
            com.sumsub.sns.internal.core.data.source.applicant.c$f r0 = new com.sumsub.sns.internal.core.data.source.applicant.c$f
            r0.<init>(r6)
            return r0
        L69:
            com.sumsub.sns.internal.core.data.source.applicant.c$g r6 = com.sumsub.sns.internal.core.data.source.applicant.c.g.f15849a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.applicant.c.a(T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.sumsub.sns.internal.core.data.source.applicant.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(com.sumsub.sns.internal.core.data.source.applicant.remote.a0 r9, T9.a<? super com.sumsub.sns.internal.core.data.source.applicant.remote.b0> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.sumsub.sns.internal.core.data.source.applicant.c.j
            if (r0 == 0) goto L13
            r0 = r10
            com.sumsub.sns.internal.core.data.source.applicant.c$j r0 = (com.sumsub.sns.internal.core.data.source.applicant.c.j) r0
            int r1 = r0.f15864e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15864e = r1
            goto L18
        L13:
            com.sumsub.sns.internal.core.data.source.applicant.c$j r0 = new com.sumsub.sns.internal.core.data.source.applicant.c$j
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f15862c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f15864e
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L55
            if (r2 == r6) goto L49
            if (r2 == r5) goto L45
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            kotlin.b.b(r10)
            goto L9a
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            java.lang.Object r9 = r0.f15861b
            com.sumsub.sns.internal.core.data.source.applicant.remote.a0 r9 = (com.sumsub.sns.internal.core.data.source.applicant.remote.a0) r9
            java.lang.Object r2 = r0.f15860a
            com.sumsub.sns.internal.core.data.source.applicant.c r2 = (com.sumsub.sns.internal.core.data.source.applicant.c) r2
            kotlin.b.b(r10)
            goto L87
        L45:
            kotlin.b.b(r10)
            goto L79
        L49:
            java.lang.Object r9 = r0.f15861b
            com.sumsub.sns.internal.core.data.source.applicant.remote.a0 r9 = (com.sumsub.sns.internal.core.data.source.applicant.remote.a0) r9
            java.lang.Object r2 = r0.f15860a
            com.sumsub.sns.internal.core.data.source.applicant.c r2 = (com.sumsub.sns.internal.core.data.source.applicant.c) r2
            kotlin.b.b(r10)
            goto L66
        L55:
            kotlin.b.b(r10)
            r0.f15860a = r8
            r0.f15861b = r9
            r0.f15864e = r6
            java.lang.Object r10 = r8.d(r0)
            if (r10 != r1) goto L65
            return r1
        L65:
            r2 = r8
        L66:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L7a
            com.sumsub.sns.internal.core.data.source.applicant.a r2 = r2.f15831a
            r0.f15860a = r7
            r0.f15861b = r7
            r0.f15864e = r5
            java.lang.Object r10 = r2.b(r10, r9, r0)
            if (r10 != r1) goto L79
            return r1
        L79:
            return r10
        L7a:
            r0.f15860a = r2
            r0.f15861b = r9
            r0.f15864e = r4
            java.lang.Object r10 = r2.e(r0)
            if (r10 != r1) goto L87
            return r1
        L87:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L9f
            com.sumsub.sns.internal.core.data.source.applicant.a r2 = r2.f15831a
            r0.f15860a = r7
            r0.f15861b = r7
            r0.f15864e = r3
            java.lang.Object r10 = r2.a(r10, r9, r0)
            if (r10 != r1) goto L9a
            return r1
        L9a:
            com.sumsub.sns.internal.core.data.source.applicant.remote.b0 r10 = (com.sumsub.sns.internal.core.data.source.applicant.remote.b0) r10
            if (r10 == 0) goto L9f
            return r10
        L9f:
            com.sumsub.sns.core.data.model.SNSException$Unknown r9 = new com.sumsub.sns.core.data.model.SNSException$Unknown
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Applicant id missing"
            r10.<init>(r0)
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.applicant.c.a(com.sumsub.sns.internal.core.data.source.applicant.remote.a0, T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.sumsub.sns.internal.core.data.source.applicant.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.lang.String r10, java.lang.String r11, T9.a<? super com.sumsub.sns.internal.core.data.source.applicant.remote.b0> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.sumsub.sns.internal.core.data.source.applicant.c.p
            if (r0 == 0) goto L13
            r0 = r12
            com.sumsub.sns.internal.core.data.source.applicant.c$p r0 = (com.sumsub.sns.internal.core.data.source.applicant.c.p) r0
            int r1 = r0.f15894f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15894f = r1
            goto L18
        L13:
            com.sumsub.sns.internal.core.data.source.applicant.c$p r0 = new com.sumsub.sns.internal.core.data.source.applicant.c$p
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f15892d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f15894f
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L5f
            if (r2 == r6) goto L4e
            if (r2 == r5) goto L4a
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            kotlin.b.b(r12)
            goto Laf
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            java.lang.Object r10 = r0.f15891c
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r0.f15890b
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r2 = r0.f15889a
            com.sumsub.sns.internal.core.data.source.applicant.c r2 = (com.sumsub.sns.internal.core.data.source.applicant.c) r2
            kotlin.b.b(r12)
            goto L9a
        L4a:
            kotlin.b.b(r12)
            goto L87
        L4e:
            java.lang.Object r10 = r0.f15891c
            r11 = r10
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r0.f15890b
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r2 = r0.f15889a
            com.sumsub.sns.internal.core.data.source.applicant.c r2 = (com.sumsub.sns.internal.core.data.source.applicant.c) r2
            kotlin.b.b(r12)
            goto L72
        L5f:
            kotlin.b.b(r12)
            r0.f15889a = r9
            r0.f15890b = r10
            r0.f15891c = r11
            r0.f15894f = r6
            java.lang.Object r12 = r9.d(r0)
            if (r12 != r1) goto L71
            return r1
        L71:
            r2 = r9
        L72:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L88
            com.sumsub.sns.internal.core.data.source.applicant.a r2 = r2.f15831a
            r0.f15889a = r7
            r0.f15890b = r7
            r0.f15891c = r7
            r0.f15894f = r5
            java.lang.Object r12 = r2.b(r12, r10, r11, r0)
            if (r12 != r1) goto L87
            return r1
        L87:
            return r12
        L88:
            r0.f15889a = r2
            r0.f15890b = r10
            r0.f15891c = r11
            r0.f15894f = r4
            java.lang.Object r12 = r2.e(r0)
            if (r12 != r1) goto L97
            return r1
        L97:
            r8 = r11
            r11 = r10
            r10 = r8
        L9a:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto Lb4
            com.sumsub.sns.internal.core.data.source.applicant.a r2 = r2.f15831a
            r0.f15889a = r7
            r0.f15890b = r7
            r0.f15891c = r7
            r0.f15894f = r3
            java.lang.Object r12 = r2.a(r12, r11, r10, r0)
            if (r12 != r1) goto Laf
            return r1
        Laf:
            com.sumsub.sns.internal.core.data.source.applicant.remote.b0 r12 = (com.sumsub.sns.internal.core.data.source.applicant.remote.b0) r12
            if (r12 == 0) goto Lb4
            return r12
        Lb4:
            com.sumsub.sns.core.data.model.SNSException$Unknown r10 = new com.sumsub.sns.core.data.model.SNSException$Unknown
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Applicant id missing"
            r11.<init>(r12)
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.applicant.c.a(java.lang.String, java.lang.String, T9.a):java.lang.Object");
    }
}

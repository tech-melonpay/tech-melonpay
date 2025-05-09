package com.sumsub.sns.internal.core.data.source.applicant.remote;

import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.core.common.e1;
import com.sumsub.sns.internal.core.data.model.SNSMessage;
import com.sumsub.sns.internal.core.data.model.remote.response.d;
import com.sumsub.sns.videoident.presentation.LanguageSelectionFragment;
import ia.l;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import okhttp3.i;
import okhttp3.o;
import org.bouncycastle.asn1.BERTags;
import sa.AbstractC1244a;

/* loaded from: classes2.dex */
public final class d implements com.sumsub.sns.internal.core.data.source.applicant.a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f15937f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.applicant.remote.e f15938a;

    /* renamed from: b, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.applicant.remote.c f15939b;

    /* renamed from: c, reason: collision with root package name */
    public final va.h f15940c;

    /* renamed from: d, reason: collision with root package name */
    public final String f15941d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC1244a f15942e = com.sumsub.sns.internal.core.common.x.a(false, 1, null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b implements Flow<SNSMessage.ServerMessage> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Flow f15943a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f15944b;

        public static final class a<T> implements FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ FlowCollector f15945a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f15946b;

            @V9.d(c = "com.sumsub.sns.internal.core.data.source.applicant.remote.ApplicantRemoteDataSource$applicantState$$inlined$map$1$2", f = "ApplicantRemoteDataSource.kt", l = {BERTags.FLAGS}, m = "emit")
            /* renamed from: com.sumsub.sns.internal.core.data.source.applicant.remote.d$b$a$a, reason: collision with other inner class name */
            public static final class C0227a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f15947a;

                /* renamed from: b, reason: collision with root package name */
                public int f15948b;

                public C0227a(T9.a aVar) {
                    super(aVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f15947a = obj;
                    this.f15948b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, d dVar) {
                this.f15945a = flowCollector;
                this.f15946b = dVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r6, T9.a r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.sumsub.sns.internal.core.data.source.applicant.remote.d.b.a.C0227a
                    if (r0 == 0) goto L13
                    r0 = r7
                    com.sumsub.sns.internal.core.data.source.applicant.remote.d$b$a$a r0 = (com.sumsub.sns.internal.core.data.source.applicant.remote.d.b.a.C0227a) r0
                    int r1 = r0.f15948b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f15948b = r1
                    goto L18
                L13:
                    com.sumsub.sns.internal.core.data.source.applicant.remote.d$b$a$a r0 = new com.sumsub.sns.internal.core.data.source.applicant.remote.d$b$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f15947a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
                    int r2 = r0.f15948b
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    kotlin.b.b(r7)
                    goto L4b
                L27:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L2f:
                    kotlin.b.b(r7)
                    kotlinx.coroutines.flow.FlowCollector r7 = r5.f15945a
                    java.lang.String r6 = (java.lang.String) r6
                    com.sumsub.sns.internal.core.data.model.SNSMessage$ServerMessage$j r2 = com.sumsub.sns.internal.core.data.model.SNSMessage.ServerMessage.INSTANCE
                    com.sumsub.sns.internal.core.data.source.applicant.remote.d r4 = r5.f15946b
                    sa.a r4 = com.sumsub.sns.internal.core.data.source.applicant.remote.d.a(r4)
                    com.sumsub.sns.internal.core.data.model.SNSMessage$ServerMessage r6 = r2.a(r4, r6)
                    r0.f15948b = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L4b
                    return r1
                L4b:
                    O9.p r6 = O9.p.f3034a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.applicant.remote.d.b.a.emit(java.lang.Object, T9.a):java.lang.Object");
            }
        }

        public b(Flow flow, d dVar) {
            this.f15943a = flow;
            this.f15944b = dVar;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super SNSMessage.ServerMessage> flowCollector, T9.a aVar) {
            Object collect = this.f15943a.collect(new a(flowCollector, this.f15944b), aVar);
            return collect == CoroutineSingletons.f23158a ? collect : O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.applicant.remote.ApplicantRemoteDataSource", f = "ApplicantRemoteDataSource.kt", l = {262}, m = "availableLanguages")
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f15950a;

        /* renamed from: c, reason: collision with root package name */
        public int f15952c;

        public c(T9.a<? super c> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15950a = obj;
            this.f15952c |= Integer.MIN_VALUE;
            return d.this.a(this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.applicant.remote.ApplicantRemoteDataSource", f = "ApplicantRemoteDataSource.kt", l = {239}, m = "getApplicantAddress")
    /* renamed from: com.sumsub.sns.internal.core.data.source.applicant.remote.d$d, reason: collision with other inner class name */
    public static final class C0228d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f15953a;

        /* renamed from: c, reason: collision with root package name */
        public int f15955c;

        public C0228d(T9.a<? super C0228d> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15953a = obj;
            this.f15955c |= Integer.MIN_VALUE;
            return d.this.e(null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.applicant.remote.ApplicantRemoteDataSource", f = "ApplicantRemoteDataSource.kt", l = {288}, m = "postAgreement")
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f15956a;

        /* renamed from: c, reason: collision with root package name */
        public int f15958c;

        public e(T9.a<? super e> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15956a = obj;
            this.f15958c |= Integer.MIN_VALUE;
            return d.this.a((String) null, (com.sumsub.sns.internal.core.data.model.b) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.applicant.remote.ApplicantRemoteDataSource", f = "ApplicantRemoteDataSource.kt", l = {292}, m = "postAgreementForAction")
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f15959a;

        /* renamed from: c, reason: collision with root package name */
        public int f15961c;

        public f(T9.a<? super f> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15959a = obj;
            this.f15961c |= Integer.MIN_VALUE;
            return d.this.b((String) null, (com.sumsub.sns.internal.core.data.model.b) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.applicant.remote.ApplicantRemoteDataSource", f = "ApplicantRemoteDataSource.kt", l = {168}, m = "setCustomFields")
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f15962a;

        /* renamed from: c, reason: collision with root package name */
        public int f15964c;

        public g(T9.a<? super g> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15962a = obj;
            this.f15964c |= Integer.MIN_VALUE;
            return d.this.a((String) null, (String) null, (String) null, (List<com.sumsub.sns.internal.core.data.model.remote.e>) null, (List<String>) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.applicant.remote.ApplicantRemoteDataSource", f = "ApplicantRemoteDataSource.kt", l = {154}, m = "setFields")
    public static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f15965a;

        /* renamed from: c, reason: collision with root package name */
        public int f15967c;

        public h(T9.a<? super h> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15965a = obj;
            this.f15967c |= Integer.MIN_VALUE;
            return d.this.a((String) null, (Map<String, ? extends Object>) null, (List<String>) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.applicant.remote.ApplicantRemoteDataSource", f = "ApplicantRemoteDataSource.kt", l = {132}, m = "setPending")
    public static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f15968a;

        /* renamed from: c, reason: collision with root package name */
        public int f15970c;

        public i(T9.a<? super i> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15968a = obj;
            this.f15970c |= Integer.MIN_VALUE;
            return d.this.a((String) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.applicant.remote.ApplicantRemoteDataSource", f = "ApplicantRemoteDataSource.kt", l = {59}, m = "uploadFile")
    public static final class j extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f15971a;

        /* renamed from: c, reason: collision with root package name */
        public int f15973c;

        public j(T9.a<? super j> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15971a = obj;
            this.f15973c |= Integer.MIN_VALUE;
            return d.this.a(null, null, null, null, null, null, null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.applicant.remote.ApplicantRemoteDataSource", f = "ApplicantRemoteDataSource.kt", l = {101}, m = "uploadFile")
    public static final class k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f15974a;

        /* renamed from: c, reason: collision with root package name */
        public int f15976c;

        public k(T9.a<? super k> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15974a = obj;
            this.f15976c |= Integer.MIN_VALUE;
            return d.this.a(null, null, null, null, null, null, null, null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.applicant.remote.ApplicantRemoteDataSource", f = "ApplicantRemoteDataSource.kt", l = {123}, m = "uploadFileForAction")
    public static final class m extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f15977a;

        /* renamed from: c, reason: collision with root package name */
        public int f15979c;

        public m(T9.a<? super m> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15977a = obj;
            this.f15979c |= Integer.MIN_VALUE;
            return d.this.b(null, null, null, null, null, null, null, null, this);
        }
    }

    public d(com.sumsub.sns.internal.core.data.source.applicant.remote.e eVar, com.sumsub.sns.internal.core.data.source.applicant.remote.c cVar, va.h hVar, String str) {
        this.f15938a = eVar;
        this.f15939b = cVar;
        this.f15940c = hVar;
        this.f15941d = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // com.sumsub.sns.internal.core.data.source.applicant.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(java.lang.String r18, java.lang.String r19, java.io.File r20, java.lang.String r21, com.sumsub.sns.internal.core.data.model.IdentitySide r22, java.util.Map<java.lang.String, java.lang.String> r23, com.sumsub.sns.internal.core.data.model.DocumentType r24, com.sumsub.sns.internal.core.data.source.applicant.remote.utils.a.InterfaceC0229a r25, T9.a<? super com.sumsub.sns.internal.core.data.model.remote.k> r26) {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            r2 = r26
            boolean r3 = r2 instanceof com.sumsub.sns.internal.core.data.source.applicant.remote.d.m
            if (r3 == 0) goto L1a
            r3 = r2
            com.sumsub.sns.internal.core.data.source.applicant.remote.d$m r3 = (com.sumsub.sns.internal.core.data.source.applicant.remote.d.m) r3
            int r4 = r3.f15979c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1a
            int r4 = r4 - r5
            r3.f15979c = r4
        L18:
            r10 = r3
            goto L20
        L1a:
            com.sumsub.sns.internal.core.data.source.applicant.remote.d$m r3 = new com.sumsub.sns.internal.core.data.source.applicant.remote.d$m
            r3.<init>(r2)
            goto L18
        L20:
            java.lang.Object r2 = r10.f15977a
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r4 = r10.f15979c
            r5 = 1
            if (r4 == 0) goto L37
            if (r4 != r5) goto L2f
            kotlin.b.b(r2)
            goto L8e
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L37:
            kotlin.b.b(r2)
            com.sumsub.sns.internal.core.data.source.applicant.remote.utils.a r2 = new com.sumsub.sns.internal.core.data.source.applicant.remote.utils.a
            r4 = 0
            r6 = r25
            r2.<init>(r1, r4, r6)
            okhttp3.j$c r6 = com.sumsub.sns.internal.core.data.source.applicant.remote.utils.c.a(r1, r2)
            r2 = r19
            r7 = r21
            r8 = r22
            okhttp3.o r7 = com.sumsub.sns.internal.core.data.source.applicant.remote.utils.c.a(r2, r7, r8)
            com.sumsub.sns.internal.log.a r11 = com.sumsub.sns.internal.log.a.f17535a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r8 = "uploadFileForAction: meta="
            r2.<init>(r8)
            r2.append(r7)
            java.lang.String r8 = ", file="
            r2.append(r8)
            java.lang.String r1 = r20.getName()
            r2.append(r1)
            java.lang.String r13 = r2.toString()
            r15 = 4
            r16 = 0
            java.lang.String r12 = "ApplicantDataSource"
            r14 = 0
            com.sumsub.log.logger.Logger.d$default(r11, r12, r13, r14, r15, r16)
            com.sumsub.sns.internal.core.data.source.applicant.remote.c r1 = r0.f15939b
            if (r24 == 0) goto L7f
            java.lang.String r2 = r24.c()
            r9 = r2
            goto L80
        L7f:
            r9 = r4
        L80:
            r10.f15979c = r5
            r4 = r1
            r5 = r18
            r8 = r23
            java.lang.Object r2 = r4.b(r5, r6, r7, r8, r9, r10)
            if (r2 != r3) goto L8e
            return r3
        L8e:
            qb.q r2 = (qb.q) r2
            com.sumsub.sns.internal.core.data.model.remote.k r1 = com.sumsub.sns.internal.core.data.source.applicant.remote.utils.c.a(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.applicant.remote.d.b(java.lang.String, java.lang.String, java.io.File, java.lang.String, com.sumsub.sns.internal.core.data.model.IdentitySide, java.util.Map, com.sumsub.sns.internal.core.data.model.DocumentType, com.sumsub.sns.internal.core.data.source.applicant.remote.utils.a$a, T9.a):java.lang.Object");
    }

    @Override // com.sumsub.sns.internal.core.data.source.applicant.a
    public Object c(String str, T9.a<? super h0> aVar) {
        return this.f15938a.c(str, aVar);
    }

    @Override // com.sumsub.sns.internal.core.data.source.applicant.a
    public Object d(String str, T9.a<? super d0> aVar) {
        return this.f15938a.d(str, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.sumsub.sns.internal.core.data.source.applicant.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(java.lang.String r5, T9.a<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.sumsub.sns.internal.core.data.source.applicant.remote.d.C0228d
            if (r0 == 0) goto L13
            r0 = r6
            com.sumsub.sns.internal.core.data.source.applicant.remote.d$d r0 = (com.sumsub.sns.internal.core.data.source.applicant.remote.d.C0228d) r0
            int r1 = r0.f15955c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15955c = r1
            goto L18
        L13:
            com.sumsub.sns.internal.core.data.source.applicant.remote.d$d r0 = new com.sumsub.sns.internal.core.data.source.applicant.remote.d$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f15953a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f15955c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.b.b(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.b.b(r6)
            com.sumsub.sns.internal.core.data.source.applicant.remote.e r6 = r4.f15938a
            r0.f15955c = r3
            java.lang.Object r6 = r6.e(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            com.sumsub.sns.internal.core.data.model.remote.response.d$c$d r6 = (com.sumsub.sns.internal.core.data.model.remote.response.d.c.C0219d) r6
            com.sumsub.sns.internal.core.data.model.remote.response.d$c$c r5 = r6.getFixedInfo()
            if (r5 == 0) goto L52
            java.util.List r5 = r5.n()
            if (r5 == 0) goto L52
            java.lang.Object r5 = P9.s.L(r5)
            java.util.Map r5 = (java.util.Map) r5
            goto L53
        L52:
            r5 = 0
        L53:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.applicant.remote.d.e(java.lang.String, T9.a):java.lang.Object");
    }

    @Override // com.sumsub.sns.internal.core.data.source.applicant.a
    public Object f(String str, T9.a<? super d.c.C0219d> aVar) {
        return this.f15938a.f(str, aVar);
    }

    @Override // com.sumsub.sns.internal.core.data.source.applicant.a
    public Object g(String str, T9.a<? super w> aVar) {
        return this.f15938a.g(str, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // com.sumsub.sns.internal.core.data.source.applicant.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.lang.String r22, java.lang.String r23, java.io.InputStream r24, java.lang.String r25, com.sumsub.sns.internal.core.data.model.IdentitySide r26, java.util.Map<java.lang.String, java.lang.String> r27, com.sumsub.sns.internal.core.data.model.DocumentType r28, T9.a<? super com.sumsub.sns.internal.core.data.model.remote.k> r29) {
        /*
            r21 = this;
            r0 = r21
            r1 = r29
            boolean r2 = r1 instanceof com.sumsub.sns.internal.core.data.source.applicant.remote.d.j
            if (r2 == 0) goto L18
            r2 = r1
            com.sumsub.sns.internal.core.data.source.applicant.remote.d$j r2 = (com.sumsub.sns.internal.core.data.source.applicant.remote.d.j) r2
            int r3 = r2.f15973c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f15973c = r3
        L16:
            r9 = r2
            goto L1e
        L18:
            com.sumsub.sns.internal.core.data.source.applicant.remote.d$j r2 = new com.sumsub.sns.internal.core.data.source.applicant.remote.d$j
            r2.<init>(r1)
            goto L16
        L1e:
            java.lang.Object r1 = r9.f15971a
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r3 = r9.f15973c
            r10 = 0
            r4 = 1
            if (r3 == 0) goto L36
            if (r3 != r4) goto L2e
            kotlin.b.b(r1)
            goto L80
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L36:
            kotlin.b.b(r1)
            okhttp3.j$c r5 = com.sumsub.sns.internal.core.data.source.applicant.remote.utils.c.a(r24)
            r1 = r23
            r3 = r25
            r6 = r26
            okhttp3.o r6 = com.sumsub.sns.internal.core.data.source.applicant.remote.utils.c.a(r1, r3, r6)
            com.sumsub.sns.internal.log.a r11 = com.sumsub.sns.internal.log.a.f17535a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "uploadFile: meta="
            r1.<init>(r3)
            r1.append(r6)
            java.lang.String r3 = ", file="
            r1.append(r3)
            r1.append(r5)
            java.lang.String r13 = r1.toString()
            r15 = 4
            r16 = 0
            java.lang.String r12 = "ApplicantRemoteDataSource"
            r14 = 0
            com.sumsub.log.logger.Logger.d$default(r11, r12, r13, r14, r15, r16)
            com.sumsub.sns.internal.core.data.source.applicant.remote.c r3 = r0.f15939b
            if (r28 == 0) goto L72
            java.lang.String r1 = r28.c()
            r8 = r1
            goto L73
        L72:
            r8 = r10
        L73:
            r9.f15973c = r4
            r4 = r22
            r7 = r27
            java.lang.Object r1 = r3.a(r4, r5, r6, r7, r8, r9)
            if (r1 != r2) goto L80
            return r2
        L80:
            qb.q r1 = (qb.q) r1
            okhttp3.p r2 = r1.f26065a
            okhttp3.g r2 = r2.f24676f
            java.lang.String r3 = "X-Image-Id"
            java.lang.String r18 = r2.a(r3)
            T r1 = r1.f26066b
            if (r18 == 0) goto La7
            r11 = r1
            com.sumsub.sns.internal.core.data.model.remote.k r11 = (com.sumsub.sns.internal.core.data.model.remote.k) r11
            if (r11 == 0) goto La5
            r19 = 63
            r20 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            com.sumsub.sns.internal.core.data.model.remote.k r10 = com.sumsub.sns.internal.core.data.model.remote.k.a(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
        La5:
            if (r10 != 0) goto Laa
        La7:
            r10 = r1
            com.sumsub.sns.internal.core.data.model.remote.k r10 = (com.sumsub.sns.internal.core.data.model.remote.k) r10
        Laa:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.applicant.remote.d.a(java.lang.String, java.lang.String, java.io.InputStream, java.lang.String, com.sumsub.sns.internal.core.data.model.IdentitySide, java.util.Map, com.sumsub.sns.internal.core.data.model.DocumentType, T9.a):java.lang.Object");
    }

    @Override // com.sumsub.sns.internal.core.data.source.applicant.a
    public Object b(String str, int i9, T9.a<? super O9.p> aVar) {
        Object b9 = this.f15939b.b(str, i9, aVar);
        return b9 == CoroutineSingletons.f23158a ? b9 : O9.p.f3034a;
    }

    @Override // com.sumsub.sns.internal.core.data.source.applicant.a
    public Object b(String str, a0 a0Var, T9.a<? super b0> aVar) {
        return this.f15938a.b(str, a0Var, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    @Override // com.sumsub.sns.internal.core.data.source.applicant.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.lang.String r23, java.lang.String r24, java.io.File r25, java.lang.String r26, com.sumsub.sns.internal.core.data.model.IdentitySide r27, java.util.Map<java.lang.String, java.lang.String> r28, com.sumsub.sns.internal.core.data.model.DocumentType r29, com.sumsub.sns.internal.core.data.source.applicant.remote.utils.a.InterfaceC0229a r30, T9.a<? super com.sumsub.sns.internal.core.data.model.remote.k> r31) {
        /*
            r22 = this;
            r0 = r22
            r1 = r25
            r2 = r31
            boolean r3 = r2 instanceof com.sumsub.sns.internal.core.data.source.applicant.remote.d.k
            if (r3 == 0) goto L1a
            r3 = r2
            com.sumsub.sns.internal.core.data.source.applicant.remote.d$k r3 = (com.sumsub.sns.internal.core.data.source.applicant.remote.d.k) r3
            int r4 = r3.f15976c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1a
            int r4 = r4 - r5
            r3.f15976c = r4
        L18:
            r10 = r3
            goto L20
        L1a:
            com.sumsub.sns.internal.core.data.source.applicant.remote.d$k r3 = new com.sumsub.sns.internal.core.data.source.applicant.remote.d$k
            r3.<init>(r2)
            goto L18
        L20:
            java.lang.Object r2 = r10.f15974a
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r4 = r10.f15976c
            r5 = 1
            r11 = 0
            if (r4 == 0) goto L38
            if (r4 != r5) goto L30
            kotlin.b.b(r2)
            goto L8e
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            kotlin.b.b(r2)
            com.sumsub.sns.internal.core.data.source.applicant.remote.utils.a r2 = new com.sumsub.sns.internal.core.data.source.applicant.remote.utils.a
            r4 = r30
            r2.<init>(r1, r11, r4)
            okhttp3.j$c r6 = com.sumsub.sns.internal.core.data.source.applicant.remote.utils.c.a(r1, r2)
            r2 = r24
            r4 = r26
            r7 = r27
            okhttp3.o r7 = com.sumsub.sns.internal.core.data.source.applicant.remote.utils.c.a(r2, r4, r7)
            com.sumsub.sns.internal.log.a r12 = com.sumsub.sns.internal.log.a.f17535a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "uploadFile: meta="
            r2.<init>(r4)
            r2.append(r7)
            java.lang.String r4 = ", file="
            r2.append(r4)
            java.lang.String r1 = r25.getName()
            r2.append(r1)
            java.lang.String r14 = r2.toString()
            r16 = 4
            r17 = 0
            java.lang.String r13 = "ApplicantRemoteDataSource"
            r15 = 0
            com.sumsub.log.logger.Logger.d$default(r12, r13, r14, r15, r16, r17)
            com.sumsub.sns.internal.core.data.source.applicant.remote.c r4 = r0.f15939b
            if (r29 == 0) goto L80
            java.lang.String r1 = r29.c()
            r9 = r1
            goto L81
        L80:
            r9 = r11
        L81:
            r10.f15976c = r5
            r5 = r23
            r8 = r28
            java.lang.Object r2 = r4.a(r5, r6, r7, r8, r9, r10)
            if (r2 != r3) goto L8e
            return r3
        L8e:
            qb.q r2 = (qb.q) r2
            okhttp3.p r1 = r2.f26065a
            okhttp3.g r1 = r1.f24676f
            java.lang.String r3 = "X-Image-Id"
            java.lang.String r19 = r1.a(r3)
            T r1 = r2.f26066b
            if (r19 == 0) goto Lb6
            r12 = r1
            com.sumsub.sns.internal.core.data.model.remote.k r12 = (com.sumsub.sns.internal.core.data.model.remote.k) r12
            if (r12 == 0) goto Lb4
            r20 = 63
            r21 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            com.sumsub.sns.internal.core.data.model.remote.k r11 = com.sumsub.sns.internal.core.data.model.remote.k.a(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
        Lb4:
            if (r11 != 0) goto Lb9
        Lb6:
            r11 = r1
            com.sumsub.sns.internal.core.data.model.remote.k r11 = (com.sumsub.sns.internal.core.data.model.remote.k) r11
        Lb9:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.applicant.remote.d.a(java.lang.String, java.lang.String, java.io.File, java.lang.String, com.sumsub.sns.internal.core.data.model.IdentitySide, java.util.Map, com.sumsub.sns.internal.core.data.model.DocumentType, com.sumsub.sns.internal.core.data.source.applicant.remote.utils.a$a, T9.a):java.lang.Object");
    }

    @Override // com.sumsub.sns.internal.core.data.source.applicant.a
    public Object b(String str, String str2, String str3, T9.a<? super b0> aVar) {
        return this.f15938a.b(str, str2, str3, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.sumsub.sns.internal.core.data.source.applicant.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(java.lang.String r5, com.sumsub.sns.internal.core.data.model.b r6, T9.a<? super com.sumsub.sns.internal.core.data.model.g> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.sumsub.sns.internal.core.data.source.applicant.remote.d.f
            if (r0 == 0) goto L13
            r0 = r7
            com.sumsub.sns.internal.core.data.source.applicant.remote.d$f r0 = (com.sumsub.sns.internal.core.data.source.applicant.remote.d.f) r0
            int r1 = r0.f15961c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15961c = r1
            goto L18
        L13:
            com.sumsub.sns.internal.core.data.source.applicant.remote.d$f r0 = new com.sumsub.sns.internal.core.data.source.applicant.remote.d$f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f15959a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f15961c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.b.b(r7)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.b.b(r7)
            com.sumsub.sns.internal.core.data.source.applicant.remote.e r7 = r4.f15938a
            r0.f15961c = r3
            java.lang.Object r7 = r7.b(r5, r6, r0)
            if (r7 != r1) goto L3d
            return r1
        L3d:
            com.sumsub.sns.internal.core.data.model.remote.response.d$c$d r7 = (com.sumsub.sns.internal.core.data.model.remote.response.d.c.C0219d) r7
            com.sumsub.sns.internal.core.data.model.g r5 = com.sumsub.sns.internal.core.data.model.remote.response.e.b(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.applicant.remote.d.b(java.lang.String, com.sumsub.sns.internal.core.data.model.b, T9.a):java.lang.Object");
    }

    @Override // com.sumsub.sns.internal.core.data.source.applicant.a
    public Object a(String str, int i9, T9.a<? super O9.p> aVar) {
        Object a10 = this.f15939b.a(str, i9, aVar);
        return a10 == CoroutineSingletons.f23158a ? a10 : O9.p.f3034a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.sumsub.sns.internal.core.data.source.applicant.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.lang.String r5, T9.a<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.sumsub.sns.internal.core.data.source.applicant.remote.d.i
            if (r0 == 0) goto L13
            r0 = r6
            com.sumsub.sns.internal.core.data.source.applicant.remote.d$i r0 = (com.sumsub.sns.internal.core.data.source.applicant.remote.d.i) r0
            int r1 = r0.f15970c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15970c = r1
            goto L18
        L13:
            com.sumsub.sns.internal.core.data.source.applicant.remote.d$i r0 = new com.sumsub.sns.internal.core.data.source.applicant.remote.d$i
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f15968a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f15970c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.b.b(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.b.b(r6)
            com.sumsub.sns.internal.core.data.source.applicant.remote.e r6 = r4.f15938a
            r0.f15970c = r3
            java.lang.Object r6 = r6.a(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            com.sumsub.sns.internal.core.data.source.applicant.remote.g r6 = (com.sumsub.sns.internal.core.data.source.applicant.remote.g) r6
            java.lang.Integer r5 = r6.k()
            if (r5 != 0) goto L46
            goto L4d
        L46:
            int r5 = r5.intValue()
            if (r5 != r3) goto L4d
            goto L4e
        L4d:
            r3 = 0
        L4e:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.applicant.remote.d.a(java.lang.String, T9.a):java.lang.Object");
    }

    @Override // com.sumsub.sns.internal.core.data.source.applicant.a
    public Flow<SNSMessage.ServerMessage> a(String str) {
        return new b(e1.a(this.f15940c, s3.b.n(new StringBuilder(), this.f15941d, "ws/iframe?token=", str)), this);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.sumsub.sns.internal.core.data.source.applicant.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.lang.String r12, java.util.Map<java.lang.String, ? extends java.lang.Object> r13, java.util.List<java.lang.String> r14, T9.a<? super com.sumsub.sns.internal.core.data.model.g.a> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.sumsub.sns.internal.core.data.source.applicant.remote.d.h
            if (r0 == 0) goto L13
            r0 = r15
            com.sumsub.sns.internal.core.data.source.applicant.remote.d$h r0 = (com.sumsub.sns.internal.core.data.source.applicant.remote.d.h) r0
            int r1 = r0.f15967c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15967c = r1
            goto L18
        L13:
            com.sumsub.sns.internal.core.data.source.applicant.remote.d$h r0 = new com.sumsub.sns.internal.core.data.source.applicant.remote.d$h
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f15965a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f15967c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            kotlin.b.b(r15)
            goto L95
        L28:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L30:
            kotlin.b.b(r15)
            sa.a r15 = r11.f15942e
            Y8.a r2 = r15.f27066b
            int r5 = ia.l.f21515c
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            kotlin.jvm.internal.k r5 = kotlin.jvm.internal.h.d(r5)
            ia.l r5 = ia.l.a.a(r5)
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            kotlin.jvm.internal.k r6 = kotlin.jvm.internal.h.d(r6)
            ia.l r6 = ia.l.a.a(r6)
            kotlin.jvm.internal.k r5 = kotlin.jvm.internal.h.c(r5, r6)
            na.b r2 = j3.e.B(r2, r5)
            java.lang.String r13 = r15.b(r2, r13)
            com.sumsub.sns.internal.log.a r5 = com.sumsub.sns.internal.log.a.f17535a
            java.lang.String r15 = "setFields: "
            java.lang.String r7 = r15.concat(r13)
            java.lang.String r6 = "ApplicantDataSource"
            r8 = 0
            r9 = 4
            r10 = 0
            com.sumsub.log.logger.Logger.d$default(r5, r6, r7, r8, r9, r10)
            com.sumsub.sns.internal.core.data.source.applicant.remote.e r15 = r11.f15938a
            okhttp3.o$a r2 = okhttp3.o.Companion
            java.util.regex.Pattern r5 = okhttp3.i.f24542d
            java.lang.String r5 = "application/json; charset=utf-8"
            okhttp3.i r5 = okhttp3.i.a.b(r5)
            r2.getClass()
            okhttp3.n r13 = okhttp3.o.a.a(r5, r13)
            if (r14 == 0) goto L8b
            r8 = 0
            r9 = 0
            java.lang.String r6 = ","
            r7 = 0
            r10 = 62
            r5 = r14
            java.lang.String r14 = P9.s.P(r5, r6, r7, r8, r9, r10)
            goto L8c
        L8b:
            r14 = r3
        L8c:
            r0.f15967c = r4
            java.lang.Object r15 = r15.a(r12, r13, r14, r0)
            if (r15 != r1) goto L95
            return r1
        L95:
            com.sumsub.sns.internal.core.data.model.remote.response.d$c$c r15 = (com.sumsub.sns.internal.core.data.model.remote.response.d.c.C0218c) r15
            com.sumsub.sns.internal.core.data.model.g$a r12 = com.sumsub.sns.internal.core.data.model.remote.response.e.a(r15, r3, r4, r3)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.applicant.remote.d.a(java.lang.String, java.util.Map, java.util.List, T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.sumsub.sns.internal.core.data.source.applicant.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.util.List<com.sumsub.sns.internal.core.data.model.remote.e> r15, java.util.List<java.lang.String> r16, T9.a<? super com.sumsub.sns.internal.core.data.model.g> r17) {
        /*
            r11 = this;
            r0 = r11
            r1 = r17
            boolean r2 = r1 instanceof com.sumsub.sns.internal.core.data.source.applicant.remote.d.g
            if (r2 == 0) goto L16
            r2 = r1
            com.sumsub.sns.internal.core.data.source.applicant.remote.d$g r2 = (com.sumsub.sns.internal.core.data.source.applicant.remote.d.g) r2
            int r3 = r2.f15964c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f15964c = r3
            goto L1b
        L16:
            com.sumsub.sns.internal.core.data.source.applicant.remote.d$g r2 = new com.sumsub.sns.internal.core.data.source.applicant.remote.d$g
            r2.<init>(r1)
        L1b:
            java.lang.Object r1 = r2.f15962a
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r4 = r2.f15964c
            r5 = 1
            if (r4 == 0) goto L32
            if (r4 != r5) goto L2a
            kotlin.b.b(r1)
            goto L61
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L32:
            kotlin.b.b(r1)
            com.sumsub.sns.internal.core.data.source.applicant.remote.e r1 = r0.f15938a
            com.sumsub.sns.internal.core.data.model.remote.d r4 = new com.sumsub.sns.internal.core.data.model.remote.d
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r15
            r4.<init>(r12, r13, r14, r15)
            if (r16 == 0) goto L57
            r6 = 0
            r7 = 0
            java.lang.String r8 = ","
            r9 = 0
            r10 = 62
            r12 = r16
            r13 = r8
            r14 = r9
            r15 = r6
            r16 = r7
            r17 = r10
            java.lang.String r6 = P9.s.P(r12, r13, r14, r15, r16, r17)
            goto L58
        L57:
            r6 = 0
        L58:
            r2.f15964c = r5
            java.lang.Object r1 = r1.a(r4, r6, r2)
            if (r1 != r3) goto L61
            return r3
        L61:
            com.sumsub.sns.internal.core.data.model.remote.response.d$c$d r1 = (com.sumsub.sns.internal.core.data.model.remote.response.d.c.C0219d) r1
            com.sumsub.sns.internal.core.data.model.g r1 = com.sumsub.sns.internal.core.data.model.remote.response.e.a(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.applicant.remote.d.a(java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, T9.a):java.lang.Object");
    }

    @Override // com.sumsub.sns.internal.core.data.source.applicant.a
    public Object a(String str, a0 a0Var, T9.a<? super b0> aVar) {
        return this.f15938a.a(str, a0Var, aVar);
    }

    @Override // com.sumsub.sns.internal.core.data.source.applicant.a
    public Object a(String str, String str2, String str3, T9.a<? super b0> aVar) {
        return this.f15938a.a(str, str2, str3, aVar);
    }

    @Override // com.sumsub.sns.internal.core.data.source.applicant.a
    public Object a(String str, String str2, String str3, String str4, List<String> list, T9.a<? super com.sumsub.sns.internal.core.data.source.applicant.remote.g> aVar) {
        return this.f15938a.a(str, new com.sumsub.sns.internal.core.data.model.remote.b(str2, str3, str4, list), aVar);
    }

    @Override // com.sumsub.sns.internal.core.data.source.applicant.a
    public Object a(y yVar, T9.a<? super w> aVar) {
        return this.f15938a.a(yVar, aVar);
    }

    @Override // com.sumsub.sns.internal.core.data.source.applicant.a
    public Object a(u uVar, T9.a<? super w> aVar) {
        return this.f15938a.a(uVar, aVar);
    }

    @Override // com.sumsub.sns.internal.core.data.source.applicant.a
    public Object a(String str, byte[] bArr, T9.a<? super Map<String, ? extends Object>> aVar) {
        com.sumsub.sns.internal.core.data.source.applicant.remote.e eVar = this.f15938a;
        o.a aVar2 = okhttp3.o.Companion;
        Pattern pattern = okhttp3.i.f24542d;
        return eVar.a(str, o.a.b(aVar2, bArr, i.a.b("application/json"), 6), aVar);
    }

    @Override // com.sumsub.sns.internal.core.data.source.applicant.a
    public Object a(String str, com.sumsub.sns.internal.core.data.source.applicant.remote.b bVar, T9.a<? super e0> aVar) {
        return this.f15938a.a(str, bVar, aVar);
    }

    @Override // com.sumsub.sns.internal.core.data.source.applicant.a
    public Object a(String str, String str2, com.sumsub.sns.internal.core.data.source.applicant.remote.a aVar, T9.a<? super e0> aVar2) {
        return this.f15938a.a(str, str2, aVar, aVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.sumsub.sns.internal.core.data.source.applicant.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(T9.a<? super java.util.List<com.sumsub.sns.internal.core.data.source.applicant.remote.n>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.sumsub.sns.internal.core.data.source.applicant.remote.d.c
            if (r0 == 0) goto L13
            r0 = r5
            com.sumsub.sns.internal.core.data.source.applicant.remote.d$c r0 = (com.sumsub.sns.internal.core.data.source.applicant.remote.d.c) r0
            int r1 = r0.f15952c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15952c = r1
            goto L18
        L13:
            com.sumsub.sns.internal.core.data.source.applicant.remote.d$c r0 = new com.sumsub.sns.internal.core.data.source.applicant.remote.d$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f15950a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f15952c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.b.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            kotlin.b.b(r5)
            com.sumsub.sns.internal.core.data.source.applicant.remote.e r5 = r4.f15938a
            r0.f15952c = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.sumsub.sns.internal.core.data.source.applicant.remote.f r5 = (com.sumsub.sns.internal.core.data.source.applicant.remote.f) r5
            java.util.List r5 = r5.b()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.applicant.remote.d.a(T9.a):java.lang.Object");
    }

    @Override // com.sumsub.sns.internal.core.data.source.applicant.a
    public Object a(String str, String str2, T9.a<? super O9.p> aVar) {
        Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, "ApplicantDataSource", s3.b.k("Set language ", str2, " for applicant ", str), null, 4, null);
        AbstractC1244a abstractC1244a = this.f15942e;
        Map s10 = kotlin.collections.a.s(new Pair("id", str), new Pair(LanguageSelectionFragment.RESULT_KEY_SELECTED_LANGUAGE, str2));
        Y8.a aVar2 = abstractC1244a.f27066b;
        int i9 = ia.l.f21515c;
        String b9 = abstractC1244a.b(j3.e.B(aVar2, kotlin.jvm.internal.h.c(l.a.a(kotlin.jvm.internal.h.d(String.class)), l.a.a(kotlin.jvm.internal.h.d(String.class)))), s10);
        com.sumsub.sns.internal.core.data.source.applicant.remote.e eVar = this.f15938a;
        o.a aVar3 = okhttp3.o.Companion;
        Pattern pattern = okhttp3.i.f24542d;
        okhttp3.i b10 = i.a.b("application/json; charset=utf-8");
        aVar3.getClass();
        Object b11 = eVar.b(o.a.a(b10, b9), aVar);
        return b11 == CoroutineSingletons.f23158a ? b11 : O9.p.f3034a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.sumsub.sns.internal.core.data.source.applicant.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.lang.String r5, com.sumsub.sns.internal.core.data.model.b r6, T9.a<? super com.sumsub.sns.internal.core.data.model.g> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.sumsub.sns.internal.core.data.source.applicant.remote.d.e
            if (r0 == 0) goto L13
            r0 = r7
            com.sumsub.sns.internal.core.data.source.applicant.remote.d$e r0 = (com.sumsub.sns.internal.core.data.source.applicant.remote.d.e) r0
            int r1 = r0.f15958c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15958c = r1
            goto L18
        L13:
            com.sumsub.sns.internal.core.data.source.applicant.remote.d$e r0 = new com.sumsub.sns.internal.core.data.source.applicant.remote.d$e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f15956a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f15958c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.b.b(r7)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.b.b(r7)
            com.sumsub.sns.internal.core.data.source.applicant.remote.e r7 = r4.f15938a
            r0.f15958c = r3
            java.lang.Object r7 = r7.a(r5, r6, r0)
            if (r7 != r1) goto L3d
            return r1
        L3d:
            com.sumsub.sns.internal.core.data.model.remote.response.d$c$d r7 = (com.sumsub.sns.internal.core.data.model.remote.response.d.c.C0219d) r7
            com.sumsub.sns.internal.core.data.model.g r5 = com.sumsub.sns.internal.core.data.model.remote.response.e.a(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.applicant.remote.d.a(java.lang.String, com.sumsub.sns.internal.core.data.model.b, T9.a):java.lang.Object");
    }
}

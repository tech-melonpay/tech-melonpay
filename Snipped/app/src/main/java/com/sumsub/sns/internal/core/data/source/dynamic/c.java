package com.sumsub.sns.internal.core.data.source.dynamic;

import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import ca.InterfaceC0651q;
import com.sumsub.sns.core.data.model.FlowType;
import com.sumsub.sns.internal.core.data.model.SNSMessage;
import com.sumsub.sns.internal.core.data.model.remote.response.d;
import com.sumsub.sns.internal.core.data.source.dynamic.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import ka.C0969n;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ShareKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes2.dex */
public final class c implements com.sumsub.sns.internal.core.data.source.dynamic.b {

    /* renamed from: s, reason: collision with root package name */
    public static final a f16146s = new a(null);

    /* renamed from: u, reason: collision with root package name */
    public static final List<String> f16147u = P9.m.q("ARG", "BRA", "ARM", "ATA", "ATF", "ATG", "AUS", "AUT", "AZE", "BDI", "BEL", "BEN");

    /* renamed from: a, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.settings.b f16148a;

    /* renamed from: b, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.applicant.a f16149b;

    /* renamed from: c, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.common.b f16150c;

    /* renamed from: d, reason: collision with root package name */
    public final CoroutineScope f16151d;

    /* renamed from: e, reason: collision with root package name */
    public final CoroutineDispatcher f16152e;

    /* renamed from: f, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.b<String> f16153f;

    /* renamed from: g, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.b<String> f16154g;

    /* renamed from: h, reason: collision with root package name */
    public Job f16155h;
    public Job i;

    /* renamed from: j, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.dynamic.a<com.sumsub.sns.internal.core.data.model.g, String> f16156j;

    /* renamed from: k, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.dynamic.a<com.sumsub.sns.internal.core.data.model.g, String> f16157k;

    /* renamed from: l, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.dynamic.a<com.sumsub.sns.internal.core.data.model.t, O9.p> f16158l;

    /* renamed from: m, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.dynamic.a<com.sumsub.sns.internal.core.data.model.e, Boolean> f16159m;

    /* renamed from: n, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.dynamic.a<b.c, O9.p> f16160n;

    /* renamed from: o, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.dynamic.a<b.C0233b, O9.p> f16161o;

    /* renamed from: p, reason: collision with root package name */
    public final SharedFlow<SNSMessage.ServerMessage> f16162p;

    /* renamed from: q, reason: collision with root package name */
    public final MutableStateFlow<b.a> f16163q;

    /* renamed from: r, reason: collision with root package name */
    public final MutableStateFlow<b.a> f16164r;

    public static final class a {

        @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl$Companion", f = "DataRepositoryImpl.kt", l = {540}, m = "generateFakeAgreements")
        /* renamed from: com.sumsub.sns.internal.core.data.source.dynamic.c$a$a, reason: collision with other inner class name */
        public static final class C0234a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f16165a;

            /* renamed from: c, reason: collision with root package name */
            public int f16167c;

            public C0234a(T9.a<? super C0234a> aVar) {
                super(aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f16165a = obj;
                this.f16167c |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(com.sumsub.sns.internal.core.data.source.common.b r14, T9.a<? super java.util.List<com.sumsub.sns.internal.core.data.model.d>> r15) {
            /*
                r13 = this;
                boolean r0 = r15 instanceof com.sumsub.sns.internal.core.data.source.dynamic.c.a.C0234a
                if (r0 == 0) goto L13
                r0 = r15
                com.sumsub.sns.internal.core.data.source.dynamic.c$a$a r0 = (com.sumsub.sns.internal.core.data.source.dynamic.c.a.C0234a) r0
                int r1 = r0.f16167c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f16167c = r1
                goto L18
            L13:
                com.sumsub.sns.internal.core.data.source.dynamic.c$a$a r0 = new com.sumsub.sns.internal.core.data.source.dynamic.c$a$a
                r0.<init>(r15)
            L18:
                java.lang.Object r15 = r0.f16165a
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
                int r2 = r0.f16167c
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                kotlin.b.b(r15)
                goto L3b
            L27:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r15)
                throw r14
            L2f:
                kotlin.b.b(r15)
                r0.f16167c = r3
                java.lang.Object r15 = r14.d(r0)
                if (r15 != r1) goto L3b
                return r1
            L3b:
                java.util.List r15 = (java.util.List) r15
                com.sumsub.sns.internal.ff.a r14 = com.sumsub.sns.internal.ff.a.f16930a
                com.sumsub.sns.internal.ff.core.a r14 = r14.a()
                java.lang.String r14 = r14.f()
                if (r14 == 0) goto L54
                java.lang.Integer r14 = ka.C0966k.S(r14)
                if (r14 == 0) goto L54
                int r14 = r14.intValue()
                goto L58
            L54:
                int r14 = r15.size()
            L58:
                int r0 = r15.size()
                if (r14 >= r0) goto L63
                java.util.List r14 = P9.s.Y(r15, r14)
                goto Lb9
            L63:
                java.util.ArrayList r14 = new java.util.ArrayList
                r14.<init>()
                r14.addAll(r15)
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 10
                int r1 = P9.n.u(r15, r1)
                r0.<init>(r1)
                java.util.Iterator r15 = r15.iterator()
            L7a:
                boolean r1 = r15.hasNext()
                if (r1 == 0) goto Lb9
                java.lang.Object r1 = r15.next()
                com.sumsub.sns.internal.core.data.model.d r1 = (com.sumsub.sns.internal.core.data.model.d) r1
                java.util.List r1 = com.sumsub.sns.internal.core.data.source.dynamic.c.c()
                kotlin.random.Random$Default r2 = kotlin.random.Random.f23193a
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r1 = P9.s.V(r1, r2)
                r3 = r1
                java.lang.String r3 = (java.lang.String) r3
                com.sumsub.sns.internal.core.data.model.d r1 = new com.sumsub.sns.internal.core.data.model.d
                com.sumsub.sns.internal.core.data.model.c r11 = new com.sumsub.sns.internal.core.data.model.c
                r11.<init>(r3)
                com.sumsub.sns.internal.core.data.model.b r12 = new com.sumsub.sns.internal.core.data.model.b
                java.lang.String r2 = "countries."
                java.lang.String r8 = s3.b.j(r2, r3)
                r6 = 0
                r7 = 0
                r4 = 0
                r5 = 0
                r9 = 30
                r10 = 0
                r2 = r12
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
                r1.<init>(r11, r12)
                r14.add(r1)
                r0.add(r1)
                goto L7a
            Lb9:
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.dynamic.c.a.a(com.sumsub.sns.internal.core.data.source.common.b, T9.a):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl$getStringsAsResult$2", f = "DataRepositoryImpl.kt", l = {419}, m = "invokeSuspend")
    public static final class a0 extends SuspendLambda implements InterfaceC0646l<T9.a<? super com.sumsub.sns.internal.core.data.source.dynamic.e<b.c>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f16168a;

        public a0(T9.a<? super a0> aVar) {
            super(1, aVar);
        }

        @Override // ca.InterfaceC0646l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(T9.a<? super com.sumsub.sns.internal.core.data.source.dynamic.e<b.c>> aVar) {
            return ((a0) create(aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(T9.a<?> aVar) {
            return c.this.new a0(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f16168a;
            if (i == 0) {
                kotlin.b.b(obj);
                com.sumsub.sns.internal.core.data.source.dynamic.a aVar = c.this.f16160n;
                this.f16168a = 1;
                obj = com.sumsub.sns.internal.core.data.source.dynamic.a.b(aVar, false, null, this, 2, null);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return obj;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl$applicantActionKeeper$1", f = "DataRepositoryImpl.kt", l = {81}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements InterfaceC0651q<String, com.sumsub.sns.internal.core.data.model.g, T9.a<? super com.sumsub.sns.internal.core.data.model.g>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f16170a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f16171b;

        public b(T9.a<? super b> aVar) {
            super(3, aVar);
        }

        @Override // ca.InterfaceC0651q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str, com.sumsub.sns.internal.core.data.model.g gVar, T9.a<? super com.sumsub.sns.internal.core.data.model.g> aVar) {
            b bVar = c.this.new b(aVar);
            bVar.f16171b = str;
            return bVar.invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f16170a;
            if (i == 0) {
                kotlin.b.b(obj);
                String str = (String) this.f16171b;
                com.sumsub.sns.internal.core.data.source.common.b bVar = c.this.f16150c;
                if (str == null) {
                    str = c.this.f16148a.b();
                }
                this.f16170a = 1;
                obj = bVar.a(str, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return com.sumsub.sns.internal.core.data.model.remote.response.e.b((d.c.C0219d) obj);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl$restartManualUpdate$1", f = "DataRepositoryImpl.kt", l = {445}, m = "invokeSuspend")
    public static final class b0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f16173a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f16174b;

        @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl$restartManualUpdate$1$1", f = "DataRepositoryImpl.kt", l = {449}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f16176a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f16177b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f16178c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar, T9.a<? super a> aVar) {
                super(2, aVar);
                this.f16178c = cVar;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
                return ((a) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                a aVar2 = new a(this.f16178c, aVar);
                aVar2.f16177b = obj;
                return aVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                int i = this.f16176a;
                if (i == 0) {
                    kotlin.b.b(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f16177b;
                    c cVar = this.f16178c;
                    this.f16176a = 1;
                    if (cVar.a(coroutineScope, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                return O9.p.f3034a;
            }
        }

        public b0(T9.a<? super b0> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((b0) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            b0 b0Var = c.this.new b0(aVar);
            b0Var.f16174b = obj;
            return b0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0032 -> B:5:0x0035). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
                int r1 = r9.f16173a
                r2 = 1
                if (r1 == 0) goto L19
                if (r1 != r2) goto L11
                java.lang.Object r1 = r9.f16174b
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                kotlin.b.b(r10)
                goto L35
            L11:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L19:
                kotlin.b.b(r10)
                java.lang.Object r10 = r9.f16174b
                kotlinx.coroutines.CoroutineScope r10 = (kotlinx.coroutines.CoroutineScope) r10
                r1 = r10
            L21:
                boolean r10 = kotlinx.coroutines.CoroutineScopeKt.isActive(r1)
                if (r10 == 0) goto L54
                r9.f16174b = r1
                r9.f16173a = r2
                r3 = 120000(0x1d4c0, double:5.9288E-319)
                java.lang.Object r10 = kotlinx.coroutines.DelayKt.delay(r3, r9)
                if (r10 != r0) goto L35
                return r0
            L35:
                kotlinx.coroutines.CoroutineScopeKt.ensureActive(r1)
                com.sumsub.sns.core.c r3 = com.sumsub.sns.core.c.f14016a
                r7 = 4
                r8 = 0
                java.lang.String r4 = "DataRepository"
                java.lang.String r5 = "Manually updating data"
                r6 = 0
                com.sumsub.sns.core.c.b(r3, r4, r5, r6, r7, r8)
                com.sumsub.sns.internal.core.data.source.dynamic.c$b0$a r6 = new com.sumsub.sns.internal.core.data.source.dynamic.c$b0$a
                com.sumsub.sns.internal.core.data.source.dynamic.c r10 = com.sumsub.sns.internal.core.data.source.dynamic.c.this
                r3 = 0
                r6.<init>(r10, r3)
                r7 = 3
                r4 = 0
                r5 = 0
                r3 = r1
                kotlinx.coroutines.BuildersKt.launch$default(r3, r4, r5, r6, r7, r8)
                goto L21
            L54:
                O9.p r10 = O9.p.f3034a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.dynamic.c.b0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl$applicantKeeper$1", f = "DataRepositoryImpl.kt", l = {92}, m = "invokeSuspend")
    /* renamed from: com.sumsub.sns.internal.core.data.source.dynamic.c$c, reason: collision with other inner class name */
    public static final class C0235c extends SuspendLambda implements InterfaceC0651q<String, com.sumsub.sns.internal.core.data.model.g, T9.a<? super com.sumsub.sns.internal.core.data.model.g>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f16179a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f16180b;

        public C0235c(T9.a<? super C0235c> aVar) {
            super(3, aVar);
        }

        @Override // ca.InterfaceC0651q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str, com.sumsub.sns.internal.core.data.model.g gVar, T9.a<? super com.sumsub.sns.internal.core.data.model.g> aVar) {
            C0235c c0235c = c.this.new C0235c(aVar);
            c0235c.f16180b = str;
            return c0235c.invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f16179a;
            if (i == 0) {
                kotlin.b.b(obj);
                String str = (String) this.f16180b;
                com.sumsub.sns.internal.core.data.source.common.b bVar = c.this.f16150c;
                if (str == null) {
                    str = c.this.f16148a.a();
                }
                this.f16179a = 1;
                obj = bVar.e(str, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return com.sumsub.sns.internal.core.data.model.remote.response.e.a((d.c.C0219d) obj);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl$socketEventsFlow$1", f = "DataRepositoryImpl.kt", l = {}, m = "invokeSuspend")
    public static final class c0 extends SuspendLambda implements InterfaceC0650p<SNSMessage.ServerMessage, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f16182a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f16183b;

        @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl$socketEventsFlow$1$2", f = "DataRepositoryImpl.kt", l = {261}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f16185a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f16186b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f16187c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar, T9.a<? super a> aVar) {
                super(2, aVar);
                this.f16187c = cVar;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
                return ((a) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                a aVar2 = new a(this.f16187c, aVar);
                aVar2.f16186b = obj;
                return aVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                int i = this.f16185a;
                if (i == 0) {
                    kotlin.b.b(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f16186b;
                    c cVar = this.f16187c;
                    this.f16185a = 1;
                    if (cVar.a(coroutineScope, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                return O9.p.f3034a;
            }
        }

        @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl$socketEventsFlow$1$4", f = "DataRepositoryImpl.kt", l = {268}, m = "invokeSuspend")
        public static final class b extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f16188a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f16189b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f16190c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(c cVar, T9.a<? super b> aVar) {
                super(2, aVar);
                this.f16190c = cVar;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
                return ((b) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                b bVar = new b(this.f16190c, aVar);
                bVar.f16189b = obj;
                return bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                int i = this.f16188a;
                if (i == 0) {
                    kotlin.b.b(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f16189b;
                    c cVar = this.f16190c;
                    this.f16188a = 1;
                    if (cVar.a(coroutineScope, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                return O9.p.f3034a;
            }
        }

        @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl$socketEventsFlow$1$6", f = "DataRepositoryImpl.kt", l = {276}, m = "invokeSuspend")
        /* renamed from: com.sumsub.sns.internal.core.data.source.dynamic.c$c0$c, reason: collision with other inner class name */
        public static final class C0236c extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f16191a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f16192b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f16193c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0236c(c cVar, T9.a<? super C0236c> aVar) {
                super(2, aVar);
                this.f16193c = cVar;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
                return ((C0236c) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                C0236c c0236c = new C0236c(this.f16193c, aVar);
                c0236c.f16192b = obj;
                return c0236c;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                int i = this.f16191a;
                if (i == 0) {
                    kotlin.b.b(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f16192b;
                    c cVar = this.f16193c;
                    this.f16191a = 1;
                    if (cVar.b(coroutineScope, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                return O9.p.f3034a;
            }
        }

        public c0(T9.a<? super c0> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SNSMessage.ServerMessage serverMessage, T9.a<? super O9.p> aVar) {
            return ((c0) create(serverMessage, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            c0 c0Var = c.this.new c0(aVar);
            c0Var.f16183b = obj;
            return c0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String d10;
            String d11;
            String e10;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f16182a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            SNSMessage.ServerMessage serverMessage = (SNSMessage.ServerMessage) this.f16183b;
            com.sumsub.sns.core.c cVar = com.sumsub.sns.core.c.f14016a;
            com.sumsub.sns.core.c.b(cVar, "DataRepository", "Socket event " + serverMessage.getType() + ": " + serverMessage, null, 4, null);
            if (serverMessage instanceof SNSMessage.ServerMessage.e) {
                SNSMessage.ServerMessage.e.c d12 = ((SNSMessage.ServerMessage.e) serverMessage).d();
                if (d12 != null && (e10 = d12.e()) != null) {
                    c.this.f16153f.a(e10);
                }
                BuildersKt__Builders_commonKt.launch$default(c.this.f16151d, c.this.f16152e, null, new a(c.this, null), 2, null);
            } else if (serverMessage instanceof SNSMessage.ServerMessage.g) {
                SNSMessage.ServerMessage.g.c d13 = ((SNSMessage.ServerMessage.g) serverMessage).d();
                if (d13 != null && (d11 = d13.d()) != null) {
                    c.this.f16153f.a(d11);
                }
                BuildersKt__Builders_commonKt.launch$default(c.this.f16151d, c.this.f16152e, null, new b(c.this, null), 2, null);
                c.this.i();
            } else if (serverMessage instanceof SNSMessage.ServerMessage.c) {
                SNSMessage.ServerMessage.c.C0204c d14 = ((SNSMessage.ServerMessage.c) serverMessage).d();
                if (d14 != null && (d10 = d14.d()) != null) {
                    c.this.f16153f.a(d10);
                }
                BuildersKt__Builders_commonKt.launch$default(c.this.f16151d, c.this.f16152e, null, new C0236c(c.this, null), 2, null);
                c.this.i();
            } else if (serverMessage instanceof SNSMessage.ServerMessage.b) {
                c.this.i();
            } else if (!(serverMessage instanceof SNSMessage.ServerMessage.f)) {
                com.sumsub.sns.core.c.b(cVar, "DataRepository", "event dropped", null, 4, null);
            }
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl$configKeeper$1", f = "DataRepositoryImpl.kt", l = {143, 167}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements InterfaceC0651q<Boolean, com.sumsub.sns.internal.core.data.model.e, T9.a<? super com.sumsub.sns.internal.core.data.model.e>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f16194a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f16195b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f16196c;

        public d(T9.a<? super d> aVar) {
            super(3, aVar);
        }

        @Override // ca.InterfaceC0651q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Boolean bool, com.sumsub.sns.internal.core.data.model.e eVar, T9.a<? super com.sumsub.sns.internal.core.data.model.e> aVar) {
            d dVar = c.this.new d(aVar);
            dVar.f16195b = bool;
            dVar.f16196c = eVar;
            return dVar.invokeSuspend(O9.p.f3034a);
        }

        /* JADX WARN: Removed duplicated region for block: B:108:0x0157  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x015a A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:119:0x0171  */
        /* JADX WARN: Removed duplicated region for block: B:124:0x0180  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x018f  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x019e  */
        /* JADX WARN: Removed duplicated region for block: B:139:0x01ad  */
        /* JADX WARN: Removed duplicated region for block: B:143:0x01c1  */
        /* JADX WARN: Removed duplicated region for block: B:154:0x0277  */
        /* JADX WARN: Removed duplicated region for block: B:157:0x027a A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:209:0x0348  */
        /* JADX WARN: Removed duplicated region for block: B:212:0x034b A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:254:0x0366  */
        /* JADX WARN: Removed duplicated region for block: B:258:0x037a  */
        /* JADX WARN: Removed duplicated region for block: B:269:0x0430  */
        /* JADX WARN: Removed duplicated region for block: B:272:0x0433 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:324:0x0500  */
        /* JADX WARN: Removed duplicated region for block: B:327:0x0503 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:369:0x0524  */
        /* JADX WARN: Removed duplicated region for block: B:373:0x052e  */
        /* JADX WARN: Removed duplicated region for block: B:375:0x0539  */
        /* JADX WARN: Removed duplicated region for block: B:378:0x0548  */
        /* JADX WARN: Removed duplicated region for block: B:382:0x0554  */
        /* JADX WARN: Removed duplicated region for block: B:383:0x0540  */
        /* JADX WARN: Removed duplicated region for block: B:384:0x0535  */
        /* JADX WARN: Removed duplicated region for block: B:386:0x0512  */
        /* JADX WARN: Removed duplicated region for block: B:387:0x0517  */
        /* JADX WARN: Removed duplicated region for block: B:388:0x050c  */
        /* JADX WARN: Removed duplicated region for block: B:390:0x036e  */
        /* JADX WARN: Removed duplicated region for block: B:391:0x0373  */
        /* JADX WARN: Removed duplicated region for block: B:393:0x035a  */
        /* JADX WARN: Removed duplicated region for block: B:394:0x035f  */
        /* JADX WARN: Removed duplicated region for block: B:395:0x0354  */
        /* JADX WARN: Removed duplicated region for block: B:397:0x01b5  */
        /* JADX WARN: Removed duplicated region for block: B:398:0x01ba  */
        /* JADX WARN: Removed duplicated region for block: B:403:0x0163  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00ba  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instructions count: 1553
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.dynamic.c.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl$socketEventsFlow$2", f = "DataRepositoryImpl.kt", l = {}, m = "invokeSuspend")
    public static final class d0 extends SuspendLambda implements InterfaceC0650p<FlowCollector<? super SNSMessage.ServerMessage>, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f16198a;

        public d0(T9.a<? super d0> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector<? super SNSMessage.ServerMessage> flowCollector, T9.a<? super O9.p> aVar) {
            return ((d0) create(flowCollector, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return c.this.new d0(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f16198a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            c.this.i();
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl$documentsKeeper$1", f = "DataRepositoryImpl.kt", l = {102, 105, 107}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements InterfaceC0651q<O9.p, com.sumsub.sns.internal.core.data.model.t, T9.a<? super com.sumsub.sns.internal.core.data.model.t>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f16200a;

        public e(T9.a<? super e> aVar) {
            super(3, aVar);
        }

        @Override // ca.InterfaceC0651q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(O9.p pVar, com.sumsub.sns.internal.core.data.model.t tVar, T9.a<? super com.sumsub.sns.internal.core.data.model.t> aVar) {
            return c.this.new e(aVar).invokeSuspend(O9.p.f3034a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x00be A[LOOP:0: B:8:0x00b8->B:10:0x00be, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x00f7  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                Method dump skipped, instructions count: 312
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.dynamic.c.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl$socketEventsFlow$3", f = "DataRepositoryImpl.kt", l = {}, m = "invokeSuspend")
    public static final class e0 extends SuspendLambda implements InterfaceC0651q<FlowCollector<? super SNSMessage.ServerMessage>, Throwable, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f16202a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f16203b;

        public e0(T9.a<? super e0> aVar) {
            super(3, aVar);
        }

        @Override // ca.InterfaceC0651q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector<? super SNSMessage.ServerMessage> flowCollector, Throwable th, T9.a<? super O9.p> aVar) {
            e0 e0Var = new e0(aVar);
            e0Var.f16203b = th;
            return e0Var.invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f16202a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            Throwable th = (Throwable) this.f16203b;
            com.sumsub.sns.core.c.a(com.sumsub.sns.core.c.f14016a, "DataRepository", "socket flow exception: " + th.getMessage(), null, 4, null);
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl$featureFlagsKeeper$1", f = "DataRepositoryImpl.kt", l = {227}, m = "invokeSuspend")
    public static final class f extends SuspendLambda implements InterfaceC0651q<O9.p, b.C0233b, T9.a<? super b.C0233b>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f16204a;

        public f(T9.a<? super f> aVar) {
            super(3, aVar);
        }

        @Override // ca.InterfaceC0651q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(O9.p pVar, b.C0233b c0233b, T9.a<? super b.C0233b> aVar) {
            return c.this.new f(aVar).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f16204a;
            try {
                if (i == 0) {
                    kotlin.b.b(obj);
                    com.sumsub.sns.internal.core.data.source.common.b bVar = c.this.f16150c;
                    com.sumsub.sns.internal.ff.model.a E8 = com.sumsub.sns.internal.ff.a.f16930a.E();
                    this.f16204a = 1;
                    obj = bVar.a(E8, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                Set<Map.Entry> entrySet = ((Map) obj).entrySet();
                ArrayList arrayList = new ArrayList(P9.n.u(entrySet, 10));
                for (Map.Entry entry : entrySet) {
                    arrayList.add(new b.C0233b.a((String) entry.getKey(), ((com.sumsub.sns.internal.ff.model.b) entry.getValue()).d(), ((com.sumsub.sns.internal.ff.model.b) entry.getValue()).h()));
                }
                b.C0233b c0233b = new b.C0233b(arrayList);
                com.sumsub.sns.internal.ff.a.f16930a.a(c0233b);
                return c0233b;
            } catch (Exception e10) {
                if (!(e10 instanceof CancellationException)) {
                    com.sumsub.sns.internal.log.b.b(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(c.this), "Failed to parse remote FFs", e10);
                }
                return new b.C0233b(EmptyList.f23104a);
            }
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl$socketEventsFlow$4", f = "DataRepositoryImpl.kt", l = {}, m = "invokeSuspend")
    public static final class f0 extends SuspendLambda implements InterfaceC0651q<FlowCollector<? super SNSMessage.ServerMessage>, Throwable, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f16206a;

        public f0(T9.a<? super f0> aVar) {
            super(3, aVar);
        }

        @Override // ca.InterfaceC0651q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector<? super SNSMessage.ServerMessage> flowCollector, Throwable th, T9.a<? super O9.p> aVar) {
            return c.this.new f0(aVar).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f16206a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            Job job = c.this.f16155h;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl", f = "DataRepositoryImpl.kt", l = {313, 315, 317}, m = "getAll")
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f16208a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f16209b;

        /* renamed from: d, reason: collision with root package name */
        public int f16211d;

        public g(T9.a<? super g> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16209b = obj;
            this.f16211d |= Integer.MIN_VALUE;
            return c.this.b(this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl$stringsKeeper$1", f = "DataRepositoryImpl.kt", l = {204, 208, 210}, m = "invokeSuspend")
    public static final class g0 extends SuspendLambda implements InterfaceC0651q<O9.p, b.c, T9.a<? super b.c>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f16212a;

        /* renamed from: b, reason: collision with root package name */
        public int f16213b;

        public g0(T9.a<? super g0> aVar) {
            super(3, aVar);
        }

        @Override // ca.InterfaceC0651q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(O9.p pVar, b.c cVar, T9.a<? super b.c> aVar) {
            return c.this.new g0(aVar).invokeSuspend(O9.p.f3034a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x00f2  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0103  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instructions count: 301
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.dynamic.c.g0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl$getAll$2", f = "DataRepositoryImpl.kt", l = {318}, m = "invokeSuspend")
    public static final class h extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f16215a;

        public h(T9.a<? super h> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((h) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return c.this.new h(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f16215a;
            if (i == 0) {
                kotlin.b.b(obj);
                com.sumsub.sns.internal.core.data.source.dynamic.a aVar = c.this.f16157k;
                this.f16215a = 1;
                if (aVar.a((T9.a<? super O9.p>) this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl", f = "DataRepositoryImpl.kt", l = {394}, m = "updateApplicant")
    public static final class h0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f16217a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f16218b;

        /* renamed from: d, reason: collision with root package name */
        public int f16220d;

        public h0(T9.a<? super h0> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16218b = obj;
            this.f16220d |= Integer.MIN_VALUE;
            return c.this.a((com.sumsub.sns.internal.core.data.model.g) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl$getAll$3", f = "DataRepositoryImpl.kt", l = {319}, m = "invokeSuspend")
    public static final class i extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f16221a;

        public i(T9.a<? super i> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((i) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return c.this.new i(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f16221a;
            if (i == 0) {
                kotlin.b.b(obj);
                com.sumsub.sns.internal.core.data.source.dynamic.a aVar = c.this.f16159m;
                this.f16221a = 1;
                if (aVar.a((T9.a<? super O9.p>) this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl", f = "DataRepositoryImpl.kt", l = {400}, m = "updateApplicantAction")
    public static final class i0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f16223a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f16224b;

        /* renamed from: d, reason: collision with root package name */
        public int f16226d;

        public i0(T9.a<? super i0> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16224b = obj;
            this.f16226d |= Integer.MIN_VALUE;
            return c.this.c((com.sumsub.sns.internal.core.data.model.g) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl$getAll$4", f = "DataRepositoryImpl.kt", l = {322}, m = "invokeSuspend")
    public static final class j extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f16227a;

        public j(T9.a<? super j> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((j) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return c.this.new j(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f16227a;
            if (i == 0) {
                kotlin.b.b(obj);
                if (!C0969n.i0(c.this.f16148a.b())) {
                    com.sumsub.sns.internal.core.data.source.dynamic.a aVar = c.this.f16156j;
                    this.f16227a = 1;
                    if (aVar.a((T9.a<? super O9.p>) this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl", f = "DataRepositoryImpl.kt", l = {433, 434}, m = "updateDataPart")
    public static final class j0<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f16229a;

        /* renamed from: b, reason: collision with root package name */
        public Object f16230b;

        /* renamed from: c, reason: collision with root package name */
        public Object f16231c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f16232d;

        /* renamed from: f, reason: collision with root package name */
        public int f16234f;

        public j0(T9.a<? super j0> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16232d = obj;
            this.f16234f |= Integer.MIN_VALUE;
            return c.this.a((c) null, (InterfaceC0646l<? super T9.a<? super c>, ? extends Object>) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl$getAll$5", f = "DataRepositoryImpl.kt", l = {325}, m = "invokeSuspend")
    public static final class k extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f16235a;

        public k(T9.a<? super k> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((k) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return c.this.new k(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f16235a;
            if (i == 0) {
                kotlin.b.b(obj);
                com.sumsub.sns.internal.core.data.source.dynamic.a aVar = c.this.f16160n;
                this.f16235a = 1;
                if (aVar.a((T9.a<? super O9.p>) this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl", f = "DataRepositoryImpl.kt", l = {483}, m = "updateDocumentStatusAndApplicant")
    public static final class k0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f16237a;

        /* renamed from: b, reason: collision with root package name */
        public Object f16238b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f16239c;

        /* renamed from: e, reason: collision with root package name */
        public int f16241e;

        public k0(T9.a<? super k0> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16239c = obj;
            this.f16241e |= Integer.MIN_VALUE;
            return c.this.a((CoroutineScope) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl$getAll$6", f = "DataRepositoryImpl.kt", l = {326}, m = "invokeSuspend")
    public static final class l extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f16242a;

        public l(T9.a<? super l> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((l) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return c.this.new l(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f16242a;
            if (i == 0) {
                kotlin.b.b(obj);
                com.sumsub.sns.internal.core.data.source.dynamic.a aVar = c.this.f16158l;
                this.f16242a = 1;
                if (aVar.a((T9.a<? super O9.p>) this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl$updateDocumentStatusAndApplicant$2", f = "DataRepositoryImpl.kt", l = {486, 488, 492, 496}, m = "invokeSuspend")
    public static final class l0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f16244a;

        /* renamed from: b, reason: collision with root package name */
        public int f16245b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f16247d;

        @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl$updateDocumentStatusAndApplicant$2$1", f = "DataRepositoryImpl.kt", l = {489}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f16248a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f16249b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar, T9.a<? super a> aVar) {
                super(2, aVar);
                this.f16249b = cVar;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
                return ((a) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                return new a(this.f16249b, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                int i = this.f16248a;
                if (i == 0) {
                    kotlin.b.b(obj);
                    com.sumsub.sns.internal.core.data.source.dynamic.a aVar = this.f16249b.f16157k;
                    this.f16248a = 1;
                    if (com.sumsub.sns.internal.core.data.source.dynamic.a.a(aVar, null, this, 1, null) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                return O9.p.f3034a;
            }
        }

        @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl$updateDocumentStatusAndApplicant$2$2", f = "DataRepositoryImpl.kt", l = {490}, m = "invokeSuspend")
        public static final class b extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f16250a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f16251b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(c cVar, T9.a<? super b> aVar) {
                super(2, aVar);
                this.f16251b = cVar;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
                return ((b) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                return new b(this.f16251b, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                int i = this.f16250a;
                if (i == 0) {
                    kotlin.b.b(obj);
                    com.sumsub.sns.internal.core.data.source.dynamic.a aVar = this.f16251b.f16158l;
                    this.f16250a = 1;
                    if (com.sumsub.sns.internal.core.data.source.dynamic.a.a(aVar, null, this, 1, null) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                return O9.p.f3034a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l0(CoroutineScope coroutineScope, T9.a<? super l0> aVar) {
            super(2, aVar);
            this.f16247d = coroutineScope;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((l0) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return c.this.new l0(this.f16247d, aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x00c7 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:8:0x0018, B:9:0x0101, B:17:0x002c, B:19:0x00bf, B:21:0x00c7, B:22:0x00cd, B:26:0x00d6, B:28:0x00ee, B:33:0x0038, B:35:0x00a8, B:38:0x003d, B:40:0x005b, B:42:0x0063, B:43:0x0069, B:48:0x0046), top: B:2:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00d3 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00ee A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:8:0x0018, B:9:0x0101, B:17:0x002c, B:19:0x00bf, B:21:0x00c7, B:22:0x00cd, B:26:0x00d6, B:28:0x00ee, B:33:0x0038, B:35:0x00a8, B:38:0x003d, B:40:0x005b, B:42:0x0063, B:43:0x0069, B:48:0x0046), top: B:2:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00cc  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00be A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instructions count: 318
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.dynamic.c.l0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl$getAll$7", f = "DataRepositoryImpl.kt", l = {}, m = "invokeSuspend")
    public static final class m extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f16252a;

        public m(T9.a<? super m> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((m) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return c.this.new m(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f16252a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            c.this.j();
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl", f = "DataRepositoryImpl.kt", l = {457}, m = "updateDocumentStatusAndApplicantAction")
    public static final class m0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f16254a;

        /* renamed from: b, reason: collision with root package name */
        public Object f16255b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f16256c;

        /* renamed from: e, reason: collision with root package name */
        public int f16258e;

        public m0(T9.a<? super m0> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16256c = obj;
            this.f16258e |= Integer.MIN_VALUE;
            return c.this.b((CoroutineScope) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl", f = "DataRepositoryImpl.kt", l = {368}, m = "getApplicant")
    public static final class n extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f16259a;

        /* renamed from: c, reason: collision with root package name */
        public int f16261c;

        public n(T9.a<? super n> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16259a = obj;
            this.f16261c |= Integer.MIN_VALUE;
            return c.this.b((String) null, false, (T9.a<? super com.sumsub.sns.internal.core.data.model.g>) this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl$updateDocumentStatusAndApplicantAction$2", f = "DataRepositoryImpl.kt", l = {460, 462, 466, 471}, m = "invokeSuspend")
    public static final class n0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f16262a;

        /* renamed from: b, reason: collision with root package name */
        public int f16263b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f16265d;

        @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl$updateDocumentStatusAndApplicantAction$2$1", f = "DataRepositoryImpl.kt", l = {463}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f16266a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f16267b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar, T9.a<? super a> aVar) {
                super(2, aVar);
                this.f16267b = cVar;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
                return ((a) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                return new a(this.f16267b, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                int i = this.f16266a;
                if (i == 0) {
                    kotlin.b.b(obj);
                    com.sumsub.sns.internal.core.data.source.dynamic.a aVar = this.f16267b.f16156j;
                    this.f16266a = 1;
                    if (com.sumsub.sns.internal.core.data.source.dynamic.a.a(aVar, null, this, 1, null) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                return O9.p.f3034a;
            }
        }

        @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl$updateDocumentStatusAndApplicantAction$2$2", f = "DataRepositoryImpl.kt", l = {464}, m = "invokeSuspend")
        public static final class b extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f16268a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f16269b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(c cVar, T9.a<? super b> aVar) {
                super(2, aVar);
                this.f16269b = cVar;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
                return ((b) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                return new b(this.f16269b, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                int i = this.f16268a;
                if (i == 0) {
                    kotlin.b.b(obj);
                    com.sumsub.sns.internal.core.data.source.dynamic.a aVar = this.f16269b.f16158l;
                    this.f16268a = 1;
                    if (com.sumsub.sns.internal.core.data.source.dynamic.a.a(aVar, null, this, 1, null) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                return O9.p.f3034a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n0(CoroutineScope coroutineScope, T9.a<? super n0> aVar) {
            super(2, aVar);
            this.f16265d = coroutineScope;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((n0) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return c.this.new n0(this.f16265d, aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x00c7 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:8:0x0018, B:9:0x0101, B:17:0x002c, B:19:0x00bf, B:21:0x00c7, B:22:0x00cd, B:26:0x00d6, B:28:0x00ee, B:33:0x0038, B:35:0x00a8, B:38:0x003d, B:40:0x005b, B:42:0x0063, B:43:0x0069, B:48:0x0046), top: B:2:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00d3 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00ee A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:8:0x0018, B:9:0x0101, B:17:0x002c, B:19:0x00bf, B:21:0x00c7, B:22:0x00cd, B:26:0x00d6, B:28:0x00ee, B:33:0x0038, B:35:0x00a8, B:38:0x003d, B:40:0x005b, B:42:0x0063, B:43:0x0069, B:48:0x0046), top: B:2:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00cc  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00be A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instructions count: 318
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.dynamic.c.n0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl", f = "DataRepositoryImpl.kt", l = {358}, m = "getApplicantAction")
    public static final class o extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f16270a;

        /* renamed from: c, reason: collision with root package name */
        public int f16272c;

        public o(T9.a<? super o> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16270a = obj;
            this.f16272c |= Integer.MIN_VALUE;
            return c.this.d(null, false, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl$getApplicantActionAsResult$2", f = "DataRepositoryImpl.kt", l = {364}, m = "invokeSuspend")
    public static final class p extends SuspendLambda implements InterfaceC0646l<T9.a<? super com.sumsub.sns.internal.core.data.source.dynamic.e<com.sumsub.sns.internal.core.data.model.g>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f16273a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f16275c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f16276d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(boolean z10, String str, T9.a<? super p> aVar) {
            super(1, aVar);
            this.f16275c = z10;
            this.f16276d = str;
        }

        @Override // ca.InterfaceC0646l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(T9.a<? super com.sumsub.sns.internal.core.data.source.dynamic.e<com.sumsub.sns.internal.core.data.model.g>> aVar) {
            return ((p) create(aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(T9.a<?> aVar) {
            return c.this.new p(this.f16275c, this.f16276d, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f16273a;
            if (i == 0) {
                kotlin.b.b(obj);
                com.sumsub.sns.internal.core.data.source.dynamic.a aVar = c.this.f16156j;
                boolean z10 = this.f16275c;
                String str = this.f16276d;
                this.f16273a = 1;
                obj = aVar.b(z10, str, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return obj;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl$getApplicantAsResult$2", f = "DataRepositoryImpl.kt", l = {374}, m = "invokeSuspend")
    public static final class q extends SuspendLambda implements InterfaceC0646l<T9.a<? super com.sumsub.sns.internal.core.data.source.dynamic.e<com.sumsub.sns.internal.core.data.model.g>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f16277a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f16279c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f16280d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(boolean z10, String str, T9.a<? super q> aVar) {
            super(1, aVar);
            this.f16279c = z10;
            this.f16280d = str;
        }

        @Override // ca.InterfaceC0646l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(T9.a<? super com.sumsub.sns.internal.core.data.source.dynamic.e<com.sumsub.sns.internal.core.data.model.g>> aVar) {
            return ((q) create(aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(T9.a<?> aVar) {
            return c.this.new q(this.f16279c, this.f16280d, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f16277a;
            if (i == 0) {
                kotlin.b.b(obj);
                com.sumsub.sns.internal.core.data.source.dynamic.a aVar = c.this.f16157k;
                boolean z10 = this.f16279c;
                String str = this.f16280d;
                this.f16277a = 1;
                obj = aVar.b(z10, str, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return obj;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl", f = "DataRepositoryImpl.kt", l = {335, 337, 340}, m = "getApplicantByFlowType")
    public static final class r extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f16281a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f16282b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f16283c;

        /* renamed from: e, reason: collision with root package name */
        public int f16285e;

        public r(T9.a<? super r> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16283c = obj;
            this.f16285e |= Integer.MIN_VALUE;
            return c.this.e(false, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl", f = "DataRepositoryImpl.kt", l = {345, 351, 354}, m = "getApplicantByFlowTypeAsResult")
    public static final class s extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f16286a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f16287b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f16288c;

        /* renamed from: e, reason: collision with root package name */
        public int f16290e;

        public s(T9.a<? super s> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16288c = obj;
            this.f16290e |= Integer.MIN_VALUE;
            return c.this.d(false, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl", f = "DataRepositoryImpl.kt", l = {409}, m = "getConfig")
    public static final class t extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f16291a;

        /* renamed from: c, reason: collision with root package name */
        public int f16293c;

        public t(T9.a<? super t> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16291a = obj;
            this.f16293c |= Integer.MIN_VALUE;
            return c.this.a(false, (T9.a<? super com.sumsub.sns.internal.core.data.model.e>) this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl", f = "DataRepositoryImpl.kt", l = {411, 412}, m = "getConfigAsResult")
    public static final class u extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f16294a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f16295b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f16296c;

        /* renamed from: e, reason: collision with root package name */
        public int f16298e;

        public u(T9.a<? super u> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16296c = obj;
            this.f16298e |= Integer.MIN_VALUE;
            return c.this.b(false, (T9.a<? super com.sumsub.sns.internal.core.data.source.dynamic.e<com.sumsub.sns.internal.core.data.model.e>>) this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl$getConfigAsResult$2", f = "DataRepositoryImpl.kt", l = {412}, m = "invokeSuspend")
    public static final class v extends SuspendLambda implements InterfaceC0646l<T9.a<? super com.sumsub.sns.internal.core.data.source.dynamic.e<com.sumsub.sns.internal.core.data.model.e>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f16299a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f16301c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(boolean z10, T9.a<? super v> aVar) {
            super(1, aVar);
            this.f16301c = z10;
        }

        @Override // ca.InterfaceC0646l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(T9.a<? super com.sumsub.sns.internal.core.data.source.dynamic.e<com.sumsub.sns.internal.core.data.model.e>> aVar) {
            return ((v) create(aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(T9.a<?> aVar) {
            return c.this.new v(this.f16301c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f16299a;
            if (i == 0) {
                kotlin.b.b(obj);
                com.sumsub.sns.internal.core.data.source.dynamic.a aVar = c.this.f16159m;
                boolean z10 = this.f16301c;
                this.f16299a = 1;
                obj = com.sumsub.sns.internal.core.data.source.dynamic.a.b(aVar, z10, null, this, 2, null);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return obj;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl$getRequiredIdDocStatus$2", f = "DataRepositoryImpl.kt", l = {406}, m = "invokeSuspend")
    public static final class y extends SuspendLambda implements InterfaceC0646l<T9.a<? super com.sumsub.sns.internal.core.data.source.dynamic.e<com.sumsub.sns.internal.core.data.model.t>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f16302a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f16304c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(boolean z10, T9.a<? super y> aVar) {
            super(1, aVar);
            this.f16304c = z10;
        }

        @Override // ca.InterfaceC0646l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(T9.a<? super com.sumsub.sns.internal.core.data.source.dynamic.e<com.sumsub.sns.internal.core.data.model.t>> aVar) {
            return ((y) create(aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(T9.a<?> aVar) {
            return c.this.new y(this.f16304c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f16302a;
            if (i == 0) {
                kotlin.b.b(obj);
                com.sumsub.sns.internal.core.data.source.dynamic.a aVar = c.this.f16158l;
                boolean z10 = this.f16304c;
                this.f16302a = 1;
                obj = com.sumsub.sns.internal.core.data.source.dynamic.a.b(aVar, z10, null, this, 2, null);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return obj;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataRepositoryImpl", f = "DataRepositoryImpl.kt", l = {415}, m = "getStrings")
    public static final class z extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f16305a;

        /* renamed from: c, reason: collision with root package name */
        public int f16307c;

        public z(T9.a<? super z> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16305a = obj;
            this.f16307c |= Integer.MIN_VALUE;
            return c.this.d(this);
        }
    }

    public c(com.sumsub.sns.internal.core.data.source.settings.b bVar, com.sumsub.sns.internal.core.data.source.applicant.a aVar, com.sumsub.sns.internal.core.data.source.common.b bVar2, CoroutineScope coroutineScope, CoroutineDispatcher coroutineDispatcher, com.sumsub.sns.internal.core.b<String> bVar3, com.sumsub.sns.internal.core.b<String> bVar4) {
        SharedFlow<SNSMessage.ServerMessage> shareIn$default;
        this.f16148a = bVar;
        this.f16149b = aVar;
        this.f16150c = bVar2;
        this.f16151d = coroutineScope;
        this.f16152e = coroutineDispatcher;
        this.f16153f = bVar3;
        this.f16154g = bVar4;
        this.f16156j = new com.sumsub.sns.internal.core.data.source.dynamic.a<>(coroutineScope, coroutineDispatcher, new b(null), com.sumsub.sns.internal.log.c.a(this) + " Action");
        this.f16157k = new com.sumsub.sns.internal.core.data.source.dynamic.a<>(coroutineScope, coroutineDispatcher, new C0235c(null), com.sumsub.sns.internal.log.c.a(this) + " Applicant");
        this.f16158l = new com.sumsub.sns.internal.core.data.source.dynamic.a<>(coroutineScope, coroutineDispatcher, new e(null), com.sumsub.sns.internal.log.c.a(this) + " Documents");
        this.f16159m = new com.sumsub.sns.internal.core.data.source.dynamic.a<>(coroutineScope, coroutineDispatcher, new d(null), com.sumsub.sns.internal.log.c.a(this) + " Config");
        this.f16160n = new com.sumsub.sns.internal.core.data.source.dynamic.a<>(coroutineScope, coroutineDispatcher, new g0(null), com.sumsub.sns.internal.log.c.a(this) + " Strings");
        this.f16161o = new com.sumsub.sns.internal.core.data.source.dynamic.a<>(coroutineScope, coroutineDispatcher, new f(null), com.sumsub.sns.internal.log.c.a(this) + " FeatureFlags");
        shareIn$default = FlowKt__ShareKt.shareIn$default(FlowKt.onCompletion(FlowKt.m142catch(FlowKt.onStart(FlowKt.onEach(FlowKt.conflate(aVar.a(bVar3.get())), new c0(null)), new d0(null)), new e0(null)), new f0(null)), coroutineScope, SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), 0, 4, null);
        this.f16162p = shareIn$default;
        MutableStateFlow<b.a> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.f16163q = MutableStateFlow;
        this.f16164r = MutableStateFlow;
    }

    @Override // com.sumsub.sns.internal.core.data.source.dynamic.b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public SharedFlow<SNSMessage.ServerMessage> a() {
        return this.f16162p;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // com.sumsub.sns.internal.core.data.source.dynamic.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(boolean r8, T9.a<? super com.sumsub.sns.internal.core.data.source.dynamic.e<com.sumsub.sns.internal.core.data.model.g>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.sumsub.sns.internal.core.data.source.dynamic.c.s
            if (r0 == 0) goto L14
            r0 = r9
            com.sumsub.sns.internal.core.data.source.dynamic.c$s r0 = (com.sumsub.sns.internal.core.data.source.dynamic.c.s) r0
            int r1 = r0.f16290e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f16290e = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.sumsub.sns.internal.core.data.source.dynamic.c$s r0 = new com.sumsub.sns.internal.core.data.source.dynamic.c$s
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.f16288c
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r1 = r4.f16290e
            r2 = 3
            r3 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L47
            if (r1 == r5) goto L3d
            if (r1 == r3) goto L39
            if (r1 != r2) goto L31
            kotlin.b.b(r9)
            goto La3
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            kotlin.b.b(r9)
            goto L93
        L3d:
            boolean r8 = r4.f16287b
            java.lang.Object r1 = r4.f16286a
            com.sumsub.sns.internal.core.data.source.dynamic.c r1 = (com.sumsub.sns.internal.core.data.source.dynamic.c) r1
            kotlin.b.b(r9)
            goto L59
        L47:
            kotlin.b.b(r9)
            r4.f16286a = r7
            r4.f16287b = r8
            r4.f16290e = r5
            r9 = 0
            java.lang.Object r9 = com.sumsub.sns.internal.core.data.source.dynamic.b.d(r7, r9, r4, r5, r6)
            if (r9 != r0) goto L58
            return r0
        L58:
            r1 = r7
        L59:
            com.sumsub.sns.internal.core.data.source.dynamic.e r9 = (com.sumsub.sns.internal.core.data.source.dynamic.e) r9
            java.lang.Object r5 = r9.d()
            com.sumsub.sns.internal.core.data.model.e r5 = (com.sumsub.sns.internal.core.data.model.e) r5
            if (r5 != 0) goto L7c
            com.sumsub.sns.internal.core.data.source.dynamic.e$a r8 = com.sumsub.sns.internal.core.data.source.dynamic.e.f16308a
            java.lang.Throwable r9 = r9.a()
            if (r9 == 0) goto L70
            com.sumsub.sns.internal.core.data.source.dynamic.e$c r8 = r8.a(r6, r9)
            return r8
        L70:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Config NOT loaded"
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L7c:
            com.sumsub.sns.core.data.model.FlowType r9 = r5.y()
            com.sumsub.sns.core.data.model.FlowType r5 = com.sumsub.sns.core.data.model.FlowType.Actions
            if (r9 != r5) goto L94
            r4.f16286a = r6
            r4.f16290e = r3
            r5 = 1
            r6 = 0
            r2 = 0
            r3 = r8
            java.lang.Object r9 = com.sumsub.sns.internal.core.data.source.dynamic.b.a(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L93
            return r0
        L93:
            return r9
        L94:
            r4.f16286a = r6
            r4.f16290e = r2
            r5 = 1
            r6 = 0
            r2 = 0
            r3 = r8
            java.lang.Object r9 = com.sumsub.sns.internal.core.data.source.dynamic.b.d(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto La3
            return r0
        La3:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.dynamic.c.d(boolean, T9.a):java.lang.Object");
    }

    @Override // com.sumsub.sns.internal.core.data.source.dynamic.b
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public MutableStateFlow<b.a> b() {
        return this.f16164r;
    }

    public final void i() {
        Job launch$default;
        Job job = this.f16155h;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.f16151d, this.f16152e, null, new b0(null), 2, null);
        this.f16155h = launch$default;
    }

    public final void j() {
        com.sumsub.sns.internal.core.data.source.dynamic.e eVar = (com.sumsub.sns.internal.core.data.source.dynamic.e) P9.s.L(this.f16156j.a().getReplayCache());
        com.sumsub.sns.internal.core.data.source.dynamic.e eVar2 = (com.sumsub.sns.internal.core.data.source.dynamic.e) P9.s.L(this.f16157k.a().getReplayCache());
        com.sumsub.sns.internal.core.data.source.dynamic.e eVar3 = (com.sumsub.sns.internal.core.data.source.dynamic.e) P9.s.L(this.f16158l.a().getReplayCache());
        com.sumsub.sns.internal.core.data.source.dynamic.e eVar4 = (com.sumsub.sns.internal.core.data.source.dynamic.e) P9.s.L(this.f16159m.a().getReplayCache());
        com.sumsub.sns.internal.core.data.source.dynamic.e eVar5 = (com.sumsub.sns.internal.core.data.source.dynamic.e) P9.s.L(this.f16160n.a().getReplayCache());
        com.sumsub.sns.internal.core.data.source.dynamic.e eVar6 = (com.sumsub.sns.internal.core.data.source.dynamic.e) P9.s.L(this.f16161o.a().getReplayCache());
        if (eVar2 == null || eVar3 == null || eVar4 == null || eVar5 == null || eVar6 == null) {
            com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, "DataRepository", "updateDataFlow: skipping ...", null, 4, null);
        } else {
            b().setValue(new b.a(eVar2, eVar, eVar3, eVar4, eVar5, eVar6));
        }
    }

    @Override // com.sumsub.sns.internal.core.data.source.dynamic.b
    public Object c(String str, boolean z10, T9.a<? super com.sumsub.sns.internal.core.data.source.dynamic.e<com.sumsub.sns.internal.core.data.model.g>> aVar) {
        return a((c) P9.s.L(this.f16157k.a().getReplayCache()), (InterfaceC0646l<? super T9.a<? super c>, ? extends Object>) new q(z10, str, null), (T9.a<? super c>) aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // com.sumsub.sns.internal.core.data.source.dynamic.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(boolean r8, T9.a<? super com.sumsub.sns.internal.core.data.model.g> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.sumsub.sns.internal.core.data.source.dynamic.c.r
            if (r0 == 0) goto L14
            r0 = r9
            com.sumsub.sns.internal.core.data.source.dynamic.c$r r0 = (com.sumsub.sns.internal.core.data.source.dynamic.c.r) r0
            int r1 = r0.f16285e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f16285e = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.sumsub.sns.internal.core.data.source.dynamic.c$r r0 = new com.sumsub.sns.internal.core.data.source.dynamic.c$r
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.f16283c
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r1 = r4.f16285e
            r2 = 3
            r3 = 2
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L46
            if (r1 == r6) goto L3c
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            kotlin.b.b(r9)
            goto L81
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            kotlin.b.b(r9)
            goto L71
        L3c:
            boolean r8 = r4.f16282b
            java.lang.Object r1 = r4.f16281a
            com.sumsub.sns.internal.core.data.source.dynamic.c r1 = (com.sumsub.sns.internal.core.data.source.dynamic.c) r1
            kotlin.b.b(r9)
            goto L58
        L46:
            kotlin.b.b(r9)
            r4.f16281a = r7
            r4.f16282b = r8
            r4.f16285e = r6
            r9 = 0
            java.lang.Object r9 = com.sumsub.sns.internal.core.data.source.dynamic.b.a(r7, r9, r4, r6, r5)
            if (r9 != r0) goto L57
            return r0
        L57:
            r1 = r7
        L58:
            com.sumsub.sns.internal.core.data.model.e r9 = (com.sumsub.sns.internal.core.data.model.e) r9
            com.sumsub.sns.core.data.model.FlowType r9 = r9.y()
            com.sumsub.sns.core.data.model.FlowType r6 = com.sumsub.sns.core.data.model.FlowType.Actions
            if (r9 != r6) goto L72
            r4.f16281a = r5
            r4.f16285e = r3
            r5 = 1
            r6 = 0
            r2 = 0
            r3 = r8
            java.lang.Object r9 = com.sumsub.sns.internal.core.data.source.dynamic.b.b(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L71
            return r0
        L71:
            return r9
        L72:
            r4.f16281a = r5
            r4.f16285e = r2
            r5 = 1
            r6 = 0
            r2 = 0
            r3 = r8
            java.lang.Object r9 = com.sumsub.sns.internal.core.data.source.dynamic.b.c(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L81
            return r0
        L81:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.dynamic.c.e(boolean, T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.sumsub.sns.internal.core.data.source.dynamic.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(T9.a<? super O9.p> r19) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.dynamic.c.b(T9.a):java.lang.Object");
    }

    @Override // com.sumsub.sns.internal.core.data.source.dynamic.b
    public Object a(String str, boolean z10, T9.a<? super com.sumsub.sns.internal.core.data.source.dynamic.e<com.sumsub.sns.internal.core.data.model.g>> aVar) {
        return a((c) P9.s.L(this.f16156j.a().getReplayCache()), (InterfaceC0646l<? super T9.a<? super c>, ? extends Object>) new p(z10, str, null), (T9.a<? super c>) aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(com.sumsub.sns.internal.core.data.model.g r5, T9.a<? super O9.p> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.sumsub.sns.internal.core.data.source.dynamic.c.i0
            if (r0 == 0) goto L13
            r0 = r6
            com.sumsub.sns.internal.core.data.source.dynamic.c$i0 r0 = (com.sumsub.sns.internal.core.data.source.dynamic.c.i0) r0
            int r1 = r0.f16226d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16226d = r1
            goto L18
        L13:
            com.sumsub.sns.internal.core.data.source.dynamic.c$i0 r0 = new com.sumsub.sns.internal.core.data.source.dynamic.c$i0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f16224b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f16226d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.f16223a
            com.sumsub.sns.internal.core.data.source.dynamic.c r5 = (com.sumsub.sns.internal.core.data.source.dynamic.c) r5
            kotlin.b.b(r6)
            goto L46
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.b.b(r6)
            if (r5 == 0) goto L49
            com.sumsub.sns.internal.core.data.source.dynamic.a<com.sumsub.sns.internal.core.data.model.g, java.lang.String> r6 = r4.f16156j
            r0.f16223a = r4
            r0.f16226d = r3
            java.lang.Object r5 = r6.b(r5, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r5 = r4
        L46:
            r5.j()
        L49:
            O9.p r5 = O9.p.f3034a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.dynamic.c.c(com.sumsub.sns.internal.core.data.model.g, T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(com.sumsub.sns.internal.core.data.model.g r5, T9.a<? super O9.p> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.sumsub.sns.internal.core.data.source.dynamic.c.h0
            if (r0 == 0) goto L13
            r0 = r6
            com.sumsub.sns.internal.core.data.source.dynamic.c$h0 r0 = (com.sumsub.sns.internal.core.data.source.dynamic.c.h0) r0
            int r1 = r0.f16220d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16220d = r1
            goto L18
        L13:
            com.sumsub.sns.internal.core.data.source.dynamic.c$h0 r0 = new com.sumsub.sns.internal.core.data.source.dynamic.c$h0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f16218b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f16220d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.f16217a
            com.sumsub.sns.internal.core.data.source.dynamic.c r5 = (com.sumsub.sns.internal.core.data.source.dynamic.c) r5
            kotlin.b.b(r6)
            goto L46
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.b.b(r6)
            if (r5 == 0) goto L49
            com.sumsub.sns.internal.core.data.source.dynamic.a<com.sumsub.sns.internal.core.data.model.g, java.lang.String> r6 = r4.f16157k
            r0.f16217a = r4
            r0.f16220d = r3
            java.lang.Object r5 = r6.b(r5, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r5 = r4
        L46:
            r5.j()
        L49:
            O9.p r5 = O9.p.f3034a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.dynamic.c.a(com.sumsub.sns.internal.core.data.model.g, T9.a):java.lang.Object");
    }

    @Override // com.sumsub.sns.internal.core.data.source.dynamic.b
    public Object c(boolean z10, T9.a<? super com.sumsub.sns.internal.core.data.source.dynamic.e<com.sumsub.sns.internal.core.data.model.t>> aVar) {
        return a((c) P9.s.L(this.f16158l.a().getReplayCache()), (InterfaceC0646l<? super T9.a<? super c>, ? extends Object>) new y(z10, null), (T9.a<? super c>) aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.sumsub.sns.internal.core.data.source.dynamic.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(boolean r5, T9.a<? super com.sumsub.sns.internal.core.data.model.e> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.sumsub.sns.internal.core.data.source.dynamic.c.t
            if (r0 == 0) goto L13
            r0 = r6
            com.sumsub.sns.internal.core.data.source.dynamic.c$t r0 = (com.sumsub.sns.internal.core.data.source.dynamic.c.t) r0
            int r1 = r0.f16293c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16293c = r1
            goto L18
        L13:
            com.sumsub.sns.internal.core.data.source.dynamic.c$t r0 = new com.sumsub.sns.internal.core.data.source.dynamic.c$t
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f16291a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f16293c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.b.b(r6)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.b.b(r6)
            r0.f16293c = r3
            java.lang.Object r6 = r4.b(r5, r0)
            if (r6 != r1) goto L3b
            return r1
        L3b:
            com.sumsub.sns.internal.core.data.source.dynamic.e r6 = (com.sumsub.sns.internal.core.data.source.dynamic.e) r6
            java.lang.Object r5 = r6.e()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.dynamic.c.a(boolean, T9.a):java.lang.Object");
    }

    public Object a(T9.a<? super com.sumsub.sns.internal.core.data.source.dynamic.e<b.c>> aVar) {
        return a((c) P9.s.L(this.f16160n.a().getReplayCache()), (InterfaceC0646l<? super T9.a<? super c>, ? extends Object>) new a0(null), (T9.a<? super c>) aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.sumsub.sns.internal.core.data.source.dynamic.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(java.lang.String r5, boolean r6, T9.a<? super com.sumsub.sns.internal.core.data.model.g> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.sumsub.sns.internal.core.data.source.dynamic.c.o
            if (r0 == 0) goto L13
            r0 = r7
            com.sumsub.sns.internal.core.data.source.dynamic.c$o r0 = (com.sumsub.sns.internal.core.data.source.dynamic.c.o) r0
            int r1 = r0.f16272c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16272c = r1
            goto L18
        L13:
            com.sumsub.sns.internal.core.data.source.dynamic.c$o r0 = new com.sumsub.sns.internal.core.data.source.dynamic.c$o
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f16270a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f16272c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.b.b(r7)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.b.b(r7)
            r0.f16272c = r3
            java.lang.Object r7 = r4.a(r5, r6, r0)
            if (r7 != r1) goto L3b
            return r1
        L3b:
            com.sumsub.sns.internal.core.data.source.dynamic.e r7 = (com.sumsub.sns.internal.core.data.source.dynamic.e) r7
            java.lang.Object r5 = r7.e()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.dynamic.c.d(java.lang.String, boolean, T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> java.lang.Object a(T r6, ca.InterfaceC0646l<? super T9.a<? super T>, ? extends java.lang.Object> r7, T9.a<? super T> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.sumsub.sns.internal.core.data.source.dynamic.c.j0
            if (r0 == 0) goto L13
            r0 = r8
            com.sumsub.sns.internal.core.data.source.dynamic.c$j0 r0 = (com.sumsub.sns.internal.core.data.source.dynamic.c.j0) r0
            int r1 = r0.f16234f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16234f = r1
            goto L18
        L13:
            com.sumsub.sns.internal.core.data.source.dynamic.c$j0 r0 = new com.sumsub.sns.internal.core.data.source.dynamic.c$j0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f16232d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f16234f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L49
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f16230b
            java.lang.Object r7 = r0.f16229a
            com.sumsub.sns.internal.core.data.source.dynamic.c r7 = (com.sumsub.sns.internal.core.data.source.dynamic.c) r7
            kotlin.b.b(r8)
            goto L71
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.Object r6 = r0.f16231c
            r7 = r6
            ca.l r7 = (ca.InterfaceC0646l) r7
            java.lang.Object r6 = r0.f16230b
            java.lang.Object r2 = r0.f16229a
            com.sumsub.sns.internal.core.data.source.dynamic.c r2 = (com.sumsub.sns.internal.core.data.source.dynamic.c) r2
            kotlin.b.b(r8)
            r8 = r7
            r7 = r2
            goto L61
        L49:
            kotlin.b.b(r8)
            kotlinx.coroutines.Job r8 = r5.i
            if (r8 == 0) goto L5f
            r0.f16229a = r5
            r0.f16230b = r6
            r0.f16231c = r7
            r0.f16234f = r4
            java.lang.Object r8 = r8.join(r0)
            if (r8 != r1) goto L5f
            return r1
        L5f:
            r8 = r7
            r7 = r5
        L61:
            r0.f16229a = r7
            r0.f16230b = r6
            r2 = 0
            r0.f16231c = r2
            r0.f16234f = r3
            java.lang.Object r8 = r8.invoke(r0)
            if (r8 != r1) goto L71
            return r1
        L71:
            boolean r6 = kotlin.jvm.internal.f.b(r6, r8)
            if (r6 != 0) goto L7a
            r7.j()
        L7a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.dynamic.c.a(java.lang.Object, ca.l, T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.sumsub.sns.internal.core.data.source.dynamic.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(T9.a<? super com.sumsub.sns.internal.core.data.source.dynamic.b.c> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.sumsub.sns.internal.core.data.source.dynamic.c.z
            if (r0 == 0) goto L13
            r0 = r5
            com.sumsub.sns.internal.core.data.source.dynamic.c$z r0 = (com.sumsub.sns.internal.core.data.source.dynamic.c.z) r0
            int r1 = r0.f16307c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16307c = r1
            goto L18
        L13:
            com.sumsub.sns.internal.core.data.source.dynamic.c$z r0 = new com.sumsub.sns.internal.core.data.source.dynamic.c$z
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f16305a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f16307c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.b.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            kotlin.b.b(r5)
            r0.f16307c = r3
            java.lang.Object r5 = r4.a(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            com.sumsub.sns.internal.core.data.source.dynamic.e r5 = (com.sumsub.sns.internal.core.data.source.dynamic.e) r5
            java.lang.Object r5 = r5.e()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.dynamic.c.d(T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.sumsub.sns.internal.core.data.source.dynamic.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(java.lang.String r5, boolean r6, T9.a<? super com.sumsub.sns.internal.core.data.model.g> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.sumsub.sns.internal.core.data.source.dynamic.c.n
            if (r0 == 0) goto L13
            r0 = r7
            com.sumsub.sns.internal.core.data.source.dynamic.c$n r0 = (com.sumsub.sns.internal.core.data.source.dynamic.c.n) r0
            int r1 = r0.f16261c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16261c = r1
            goto L18
        L13:
            com.sumsub.sns.internal.core.data.source.dynamic.c$n r0 = new com.sumsub.sns.internal.core.data.source.dynamic.c$n
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f16259a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f16261c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.b.b(r7)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.b.b(r7)
            r0.f16261c = r3
            java.lang.Object r7 = r4.c(r5, r6, r0)
            if (r7 != r1) goto L3b
            return r1
        L3b:
            com.sumsub.sns.internal.core.data.source.dynamic.e r7 = (com.sumsub.sns.internal.core.data.source.dynamic.e) r7
            java.lang.Object r5 = r7.e()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.dynamic.c.b(java.lang.String, boolean, T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlinx.coroutines.CoroutineScope r9, T9.a<? super O9.p> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.sumsub.sns.internal.core.data.source.dynamic.c.k0
            if (r0 == 0) goto L13
            r0 = r10
            com.sumsub.sns.internal.core.data.source.dynamic.c$k0 r0 = (com.sumsub.sns.internal.core.data.source.dynamic.c.k0) r0
            int r1 = r0.f16241e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16241e = r1
            goto L18
        L13:
            com.sumsub.sns.internal.core.data.source.dynamic.c$k0 r0 = new com.sumsub.sns.internal.core.data.source.dynamic.c$k0
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f16239c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f16241e
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r9 = r0.f16238b
            kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
            java.lang.Object r0 = r0.f16237a
            com.sumsub.sns.internal.core.data.source.dynamic.c r0 = (com.sumsub.sns.internal.core.data.source.dynamic.c) r0
            kotlin.b.b(r10)
        L2e:
            r2 = r9
            goto L4e
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            kotlin.b.b(r10)
            kotlinx.coroutines.Job r10 = r8.i
            if (r10 == 0) goto L4c
            r0.f16237a = r8
            r0.f16238b = r9
            r0.f16241e = r3
            java.lang.Object r10 = r10.join(r0)
            if (r10 != r1) goto L4c
            return r1
        L4c:
            r0 = r8
            goto L2e
        L4e:
            kotlinx.coroutines.CoroutineDispatcher r3 = r0.f16152e
            com.sumsub.sns.internal.core.data.source.dynamic.c$l0 r5 = new com.sumsub.sns.internal.core.data.source.dynamic.c$l0
            r9 = 0
            r5.<init>(r2, r9)
            r6 = 2
            r7 = 0
            r4 = 0
            kotlinx.coroutines.Job r9 = kotlinx.coroutines.BuildersKt.launch$default(r2, r3, r4, r5, r6, r7)
            r0.i = r9
            O9.p r9 = O9.p.f3034a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.dynamic.c.a(kotlinx.coroutines.CoroutineScope, T9.a):java.lang.Object");
    }

    @Override // com.sumsub.sns.internal.core.data.source.dynamic.b
    public Object b(com.sumsub.sns.internal.core.data.model.g gVar, T9.a<? super O9.p> aVar) {
        com.sumsub.sns.internal.core.data.model.e eVar;
        if (gVar == null) {
            return O9.p.f3034a;
        }
        com.sumsub.sns.internal.core.data.source.dynamic.e eVar2 = (com.sumsub.sns.internal.core.data.source.dynamic.e) P9.s.L(this.f16159m.a().getReplayCache());
        if (eVar2 != null && (eVar = (com.sumsub.sns.internal.core.data.model.e) eVar2.d()) != null) {
            if (eVar.y() == FlowType.Actions) {
                Object c2 = c(gVar, aVar);
                return c2 == CoroutineSingletons.f23158a ? c2 : O9.p.f3034a;
            }
            Object a10 = a(gVar, aVar);
            return a10 == CoroutineSingletons.f23158a ? a10 : O9.p.f3034a;
        }
        return O9.p.f3034a;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006e A[PHI: r8
      0x006e: PHI (r8v9 java.lang.Object) = (r8v8 java.lang.Object), (r8v1 java.lang.Object) binds: [B:17:0x006b, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.sumsub.sns.internal.core.data.source.dynamic.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(boolean r7, T9.a<? super com.sumsub.sns.internal.core.data.source.dynamic.e<com.sumsub.sns.internal.core.data.model.e>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.sumsub.sns.internal.core.data.source.dynamic.c.u
            if (r0 == 0) goto L13
            r0 = r8
            com.sumsub.sns.internal.core.data.source.dynamic.c$u r0 = (com.sumsub.sns.internal.core.data.source.dynamic.c.u) r0
            int r1 = r0.f16298e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16298e = r1
            goto L18
        L13:
            com.sumsub.sns.internal.core.data.source.dynamic.c$u r0 = new com.sumsub.sns.internal.core.data.source.dynamic.c$u
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f16296c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f16298e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.b.b(r8)
            goto L6e
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            boolean r7 = r0.f16295b
            java.lang.Object r2 = r0.f16294a
            com.sumsub.sns.internal.core.data.source.dynamic.c r2 = (com.sumsub.sns.internal.core.data.source.dynamic.c) r2
            kotlin.b.b(r8)
            goto L4f
        L3c:
            kotlin.b.b(r8)
            com.sumsub.sns.internal.core.data.source.dynamic.a<com.sumsub.sns.internal.core.data.source.dynamic.b$b, O9.p> r8 = r6.f16161o
            r0.f16294a = r6
            r0.f16295b = r7
            r0.f16298e = r4
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L4e
            return r1
        L4e:
            r2 = r6
        L4f:
            com.sumsub.sns.internal.core.data.source.dynamic.a<com.sumsub.sns.internal.core.data.model.e, java.lang.Boolean> r8 = r2.f16159m
            kotlinx.coroutines.flow.SharedFlow r8 = r8.a()
            java.util.List r8 = r8.getReplayCache()
            java.lang.Object r8 = P9.s.L(r8)
            com.sumsub.sns.internal.core.data.source.dynamic.c$v r4 = new com.sumsub.sns.internal.core.data.source.dynamic.c$v
            r5 = 0
            r4.<init>(r7, r5)
            r0.f16294a = r5
            r0.f16298e = r3
            java.lang.Object r8 = r2.a(r8, r4, r0)
            if (r8 != r1) goto L6e
            return r1
        L6e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.dynamic.c.b(boolean, T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlinx.coroutines.CoroutineScope r9, T9.a<? super O9.p> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.sumsub.sns.internal.core.data.source.dynamic.c.m0
            if (r0 == 0) goto L13
            r0 = r10
            com.sumsub.sns.internal.core.data.source.dynamic.c$m0 r0 = (com.sumsub.sns.internal.core.data.source.dynamic.c.m0) r0
            int r1 = r0.f16258e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16258e = r1
            goto L18
        L13:
            com.sumsub.sns.internal.core.data.source.dynamic.c$m0 r0 = new com.sumsub.sns.internal.core.data.source.dynamic.c$m0
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f16256c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f16258e
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r9 = r0.f16255b
            kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
            java.lang.Object r0 = r0.f16254a
            com.sumsub.sns.internal.core.data.source.dynamic.c r0 = (com.sumsub.sns.internal.core.data.source.dynamic.c) r0
            kotlin.b.b(r10)
        L2e:
            r2 = r9
            goto L4e
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            kotlin.b.b(r10)
            kotlinx.coroutines.Job r10 = r8.i
            if (r10 == 0) goto L4c
            r0.f16254a = r8
            r0.f16255b = r9
            r0.f16258e = r3
            java.lang.Object r10 = r10.join(r0)
            if (r10 != r1) goto L4c
            return r1
        L4c:
            r0 = r8
            goto L2e
        L4e:
            kotlinx.coroutines.CoroutineDispatcher r3 = r0.f16152e
            com.sumsub.sns.internal.core.data.source.dynamic.c$n0 r5 = new com.sumsub.sns.internal.core.data.source.dynamic.c$n0
            r9 = 0
            r5.<init>(r2, r9)
            r6 = 2
            r7 = 0
            r4 = 0
            kotlinx.coroutines.Job r9 = kotlinx.coroutines.BuildersKt.launch$default(r2, r3, r4, r5, r6, r7)
            r0.i = r9
            O9.p r9 = O9.p.f3034a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.dynamic.c.b(kotlinx.coroutines.CoroutineScope, T9.a):java.lang.Object");
    }

    public /* synthetic */ c(com.sumsub.sns.internal.core.data.source.settings.b bVar, com.sumsub.sns.internal.core.data.source.applicant.a aVar, com.sumsub.sns.internal.core.data.source.common.b bVar2, CoroutineScope coroutineScope, CoroutineDispatcher coroutineDispatcher, com.sumsub.sns.internal.core.b bVar3, com.sumsub.sns.internal.core.b bVar4, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, aVar, bVar2, coroutineScope, (i9 & 16) != 0 ? Dispatchers.getIO() : coroutineDispatcher, bVar3, bVar4);
    }
}

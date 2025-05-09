package com.sumsub.sns.internal.ml.core;

import O9.p;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.sumsub.sns.internal.core.analytics.Action;
import com.sumsub.sns.internal.core.analytics.l;
import com.sumsub.sns.internal.core.common.b1;
import com.sumsub.sns.internal.ml.core.e;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.f;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import org.tensorflow.lite.InterpreterApi;

/* loaded from: classes2.dex */
public abstract class b<Input, Output> implements com.sumsub.sns.internal.ml.core.e<Input, Output> {

    /* renamed from: a, reason: collision with root package name */
    public final String f17645a;

    /* renamed from: c, reason: collision with root package name */
    public InterpreterApi f17647c;

    /* renamed from: d, reason: collision with root package name */
    public final long f17648d;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17651g;

    /* renamed from: b, reason: collision with root package name */
    public final b1 f17646b = new b1();

    /* renamed from: e, reason: collision with root package name */
    public final O9.f f17649e = kotlin.a.a(new j(this));

    /* renamed from: f, reason: collision with root package name */
    public final O9.f f17650f = kotlin.a.a(new c(this));

    @V9.d(c = "com.sumsub.sns.internal.ml.core.MlSolution", f = "MlSolution.kt", l = {139}, m = "close$suspendImpl")
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f17652a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f17653b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b<Input, Output> f17654c;

        /* renamed from: d, reason: collision with root package name */
        public int f17655d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b<Input, Output> bVar, T9.a<? super a> aVar) {
            super(aVar);
            this.f17654c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f17653b = obj;
            this.f17655d |= Integer.MIN_VALUE;
            return b.a((b) this.f17654c, (T9.a) this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.ml.core.MlSolution$close$2", f = "MlSolution.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.sumsub.sns.internal.ml.core.b$b, reason: collision with other inner class name */
    public static final class C0273b extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f17656a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b<Input, Output> f17657b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0273b(b<Input, Output> bVar, T9.a<? super C0273b> aVar) {
            super(2, aVar);
            this.f17657b = bVar;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((C0273b) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return new C0273b(this.f17657b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f17656a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            this.f17657b.k();
            InterpreterApi interpreterApi = this.f17657b.f17647c;
            if (interpreterApi != null) {
                interpreterApi.close();
            }
            this.f17657b.f17647c = null;
            this.f17657b.b().close();
            return p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.ml.core.MlSolution$finalize$1", f = "MlSolution.kt", l = {153}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f17659a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b<Input, Output> f17660b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(b<Input, Output> bVar, T9.a<? super d> aVar) {
            super(2, aVar);
            this.f17660b = bVar;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((d) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return new d(this.f17660b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f17659a;
            if (i == 0) {
                kotlin.b.b(obj);
                b<Input, Output> bVar = this.f17660b;
                this.f17659a = 1;
                if (bVar.a((T9.a<? super p>) this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.ml.core.MlSolution", f = "MlSolution.kt", l = {87}, m = "preloadModel-IoAF18A")
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f17661a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b<Input, Output> f17662b;

        /* renamed from: c, reason: collision with root package name */
        public int f17663c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(b<Input, Output> bVar, T9.a<? super e> aVar) {
            super(aVar);
            this.f17662b = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f17661a = obj;
            this.f17663c |= Integer.MIN_VALUE;
            Object b9 = this.f17662b.b(this);
            return b9 == CoroutineSingletons.f23158a ? b9 : new Result(b9);
        }
    }

    public /* synthetic */ class f extends FunctionReferenceImpl implements InterfaceC0650p<CoroutineScope, T9.a<? super Result<? extends Boolean>>, Object> {
        public f(Object obj) {
            super(2, obj, f.a.class, "suspendConversion0", "preloadModel_IoAF18A$suspendConversion0(Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super Result<Boolean>> aVar) {
            Object c2 = b.c((InterfaceC0646l) this.receiver, coroutineScope, aVar);
            return c2 == CoroutineSingletons.f23158a ? c2 : new Result(c2);
        }
    }

    public /* synthetic */ class h extends FunctionReferenceImpl implements InterfaceC0650p<CoroutineScope, T9.a<? super e.a<Output>>, Object> {
        public h(Object obj) {
            super(2, obj, f.a.class, "suspendConversion0", "run$suspendConversion0-0(Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super e.a<Output>> aVar) {
            return b.d((InterfaceC0646l) this.receiver, coroutineScope, aVar);
        }
    }

    public static final class j extends Lambda implements InterfaceC0635a<ExecutorService> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b<Input, Output> f17670a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(b<Input, Output> bVar) {
            super(0);
            this.f17670a = bVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return Executors.newSingleThreadExecutor(new com.sumsub.sns.internal.ml.core.f(this.f17670a, 1));
        }

        public static final Thread a(b bVar, Runnable runnable) {
            return new Thread(runnable, bVar.h() + "Thread");
        }
    }

    public b(String str) {
        this.f17645a = str;
    }

    public abstract Output a(Input input, long j10);

    public void a(InterpreterApi interpreterApi) {
    }

    public abstract Object[] a(Input input);

    public abstract com.sumsub.sns.internal.ml.core.a e();

    public final void finalize() {
        BuildersKt__BuildersKt.runBlocking$default(null, new d(this, null), 1, null);
    }

    public abstract Map<Integer, Object> g();

    public abstract String h();

    public final ExecutorService i() {
        return (ExecutorService) this.f17649e.getValue();
    }

    public final InterpreterApi j() {
        com.sumsub.sns.internal.ml.core.c.b(com.sumsub.sns.internal.ml.core.c.f17674a, this.f17645a, "initInterpreter: " + e(), null, 4, null);
        return InterpreterApi.create(e().a(), d());
    }

    public final void k() {
        l.a(com.sumsub.sns.internal.core.analytics.f.a(0L, 1, null).a(Action.MlModelExecution).e().a(new Pair(AppMeasurementSdk.ConditionalUserProperty.NAME, h()), new Pair("average", this.f17646b.a()), new Pair("median", Long.valueOf(this.f17646b.c())), new Pair("p99", Long.valueOf(this.f17646b.e())), new Pair("p100", Long.valueOf(this.f17646b.d()))), false, 1, null);
        this.f17646b.f();
    }

    public static final class c extends Lambda implements InterfaceC0635a<ExecutorCoroutineDispatcher> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b<Input, Output> f17658a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b<Input, Output> bVar) {
            super(0);
            this.f17658a = bVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ExecutorCoroutineDispatcher invoke() {
            return ExecutorsKt.from(Executors.newSingleThreadExecutor(new com.sumsub.sns.internal.ml.core.f(this.f17658a, 0)));
        }

        public static final Thread a(b bVar, Runnable runnable) {
            return new Thread(runnable, bVar.h() + "CoroutineThread");
        }
    }

    public static final /* synthetic */ Object d(InterfaceC0646l interfaceC0646l, CoroutineScope coroutineScope, T9.a aVar) {
        return interfaceC0646l.invoke(coroutineScope);
    }

    public Object a(T9.a<? super p> aVar) {
        return a((b) this, (T9.a) aVar);
    }

    public long c() {
        return this.f17648d;
    }

    public final boolean f() {
        return this.f17651g;
    }

    public static final /* synthetic */ Object c(InterfaceC0646l interfaceC0646l, CoroutineScope coroutineScope, T9.a aVar) {
        return ((Result) interfaceC0646l.invoke(coroutineScope)).f23091a;
    }

    @Override // com.sumsub.sns.internal.ml.core.e
    public Object a(Input input, T9.a<? super e.a<Output>> aVar) {
        return a(this, input, aVar);
    }

    public final ExecutorCoroutineDispatcher b() {
        return (ExecutorCoroutineDispatcher) this.f17650f.getValue();
    }

    public InterpreterApi.Options d() {
        InterpreterApi.Options options = new InterpreterApi.Options();
        options.setNumThreads(-1);
        options.setCancellable(true);
        return options;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(T9.a<? super kotlin.Result<java.lang.Boolean>> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.sumsub.sns.internal.ml.core.b.e
            if (r0 == 0) goto L13
            r0 = r11
            com.sumsub.sns.internal.ml.core.b$e r0 = (com.sumsub.sns.internal.ml.core.b.e) r0
            int r1 = r0.f17663c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17663c = r1
            goto L18
        L13:
            com.sumsub.sns.internal.ml.core.b$e r0 = new com.sumsub.sns.internal.ml.core.b$e
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f17661a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f17663c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.b.b(r11)
            goto L55
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L2f:
            kotlin.b.b(r11)
            com.sumsub.sns.internal.ml.core.c r4 = com.sumsub.sns.internal.ml.core.c.f17674a
            java.lang.String r5 = r10.f17645a
            r8 = 4
            r9 = 0
            java.lang.String r6 = "preloadModel"
            r7 = 0
            com.sumsub.sns.internal.ml.core.c.b(r4, r5, r6, r7, r8, r9)
            com.sumsub.sns.internal.ml.core.b$g r11 = new com.sumsub.sns.internal.ml.core.b$g
            r11.<init>(r10)
            kotlinx.coroutines.ExecutorCoroutineDispatcher r2 = r10.b()
            com.sumsub.sns.internal.ml.core.b$f r4 = new com.sumsub.sns.internal.ml.core.b$f
            r4.<init>(r11)
            r0.f17663c = r3
            java.lang.Object r11 = kotlinx.coroutines.BuildersKt.withContext(r2, r4, r0)
            if (r11 != r1) goto L55
            return r1
        L55:
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.f23091a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.ml.core.b.b(T9.a):java.lang.Object");
    }

    public static final class i extends Lambda implements InterfaceC0646l<CoroutineScope, e.a<Output>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b<Input, Output> f17666a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Input f17667b;

        public static final class a extends Lambda implements InterfaceC0635a<p> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b<Input, Output> f17668a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Input f17669b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b<Input, Output> bVar, Input input) {
                super(0);
                this.f17668a = bVar;
                this.f17669b = input;
            }

            public final void a() {
                this.f17668a.a().runForMultipleInputsOutputs(this.f17668a.a((b<Input, Output>) this.f17669b), this.f17668a.g());
            }

            @Override // ca.InterfaceC0635a
            public /* bridge */ /* synthetic */ p invoke() {
                a();
                return p.f3034a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(b<Input, Output> bVar, Input input) {
            super(1);
            this.f17666a = bVar;
            this.f17667b = input;
        }

        @Override // ca.InterfaceC0646l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e.a<Output> invoke(CoroutineScope coroutineScope) {
            Future submit = this.f17666a.i().submit(new com.google.firebase.heartbeatinfo.d(2, this.f17666a, this.f17667b));
            if (this.f17666a.c() <= 0) {
                return (e.a) submit.get();
            }
            try {
                return (e.a) submit.get(this.f17666a.c(), TimeUnit.MILLISECONDS);
            } catch (TimeoutException unused) {
                com.sumsub.sns.internal.ml.core.c.a(com.sumsub.sns.internal.ml.core.c.f17674a, this.f17666a.f17645a, "MlSolution timeout (" + this.f17666a.h() + ')', null, 4, null);
                return new e.a.C0276e();
            }
        }

        public static final e.a a(b bVar, Object obj) {
            try {
                return new e.a.d(bVar.a((b) obj, bVar.f17646b.a(new a(bVar, obj))));
            } catch (com.sumsub.sns.internal.ml.core.d e10) {
                bVar.f17651g = true;
                com.sumsub.sns.internal.log.b.b(com.sumsub.sns.internal.log.a.f17535a, bVar.f17645a, "Error while executing ML model", e10);
                com.sumsub.sns.internal.ml.core.c.f17674a.a(bVar.f17645a, "Error while executing ML model", e10);
                return new e.a.b(e10);
            } catch (UnsatisfiedLinkError e11) {
                bVar.f17651g = true;
                com.sumsub.sns.internal.log.b.b(com.sumsub.sns.internal.log.a.f17535a, bVar.f17645a, "Error while loading TF library", e11);
                com.sumsub.sns.internal.ml.core.c.f17674a.a(bVar.f17645a, "Error while loading TF library", e11);
                return new e.a.b(e11);
            } catch (Throwable th) {
                com.sumsub.sns.internal.log.b.b(com.sumsub.sns.internal.log.a.f17535a, bVar.f17645a, "Error while executing ML model", th);
                com.sumsub.sns.internal.ml.core.c.f17674a.a(bVar.f17645a, "Error while executing ML model", th);
                return new e.a.b(th);
            }
        }
    }

    public static /* synthetic */ Object a(b bVar, Object obj, T9.a aVar) {
        return BuildersKt.withContext(bVar.b(), new h(new i(bVar, obj)), aVar);
    }

    public static final class g extends Lambda implements InterfaceC0646l<CoroutineScope, Result<? extends Boolean>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b<Input, Output> f17664a;

        public static final class a extends Lambda implements InterfaceC0635a<p> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b<Input, Output> f17665a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b<Input, Output> bVar) {
                super(0);
                this.f17665a = bVar;
            }

            public final void a() {
                this.f17665a.a();
            }

            @Override // ca.InterfaceC0635a
            public /* bridge */ /* synthetic */ p invoke() {
                a();
                return p.f3034a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(b<Input, Output> bVar) {
            super(1);
            this.f17664a = bVar;
        }

        public final Object a(CoroutineScope coroutineScope) {
            Future submit = this.f17664a.i().submit(new com.google.firebase.heartbeatinfo.a(this.f17664a, 4));
            if (this.f17664a.c() <= 0) {
                return ((Result) submit.get()).f23091a;
            }
            try {
                return ((Result) submit.get(this.f17664a.c(), TimeUnit.MILLISECONDS)).f23091a;
            } catch (TimeoutException e10) {
                com.sumsub.sns.internal.ml.core.c.a(com.sumsub.sns.internal.ml.core.c.f17674a, this.f17664a.f17645a, "MlSolution timeout (" + this.f17664a.h() + ')', null, 4, null);
                return new Result.Failure(e10);
            }
        }

        @Override // ca.InterfaceC0646l
        public /* synthetic */ Result<? extends Boolean> invoke(CoroutineScope coroutineScope) {
            return new Result<>(a(coroutineScope));
        }

        public static final Result a(b bVar) {
            Object failure;
            try {
                bVar.f17646b.a(new a(bVar));
                com.sumsub.sns.internal.ml.core.c.b(com.sumsub.sns.internal.ml.core.c.f17674a, bVar.f17645a, "preloadModel finished", null, 4, null);
                failure = Boolean.TRUE;
            } catch (com.sumsub.sns.internal.ml.core.d e10) {
                bVar.f17651g = true;
                com.sumsub.sns.internal.ml.core.c.f17674a.a(bVar.f17645a, "Error while executing ML model", e10);
                failure = new Result.Failure(e10);
            } catch (UnsatisfiedLinkError e11) {
                bVar.f17651g = true;
                com.sumsub.sns.internal.ml.core.c.f17674a.a(bVar.f17645a, "Error while loading TF library", e11);
                failure = new Result.Failure(e11);
            } catch (Throwable th) {
                com.sumsub.sns.internal.ml.core.c.f17674a.a(bVar.f17645a, "Error while executing ML model", th);
                failure = new Result.Failure(th);
            }
            return new Result(failure);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(com.sumsub.sns.internal.ml.core.b r5, T9.a r6) {
        /*
            boolean r0 = r6 instanceof com.sumsub.sns.internal.ml.core.b.a
            if (r0 == 0) goto L13
            r0 = r6
            com.sumsub.sns.internal.ml.core.b$a r0 = (com.sumsub.sns.internal.ml.core.b.a) r0
            int r1 = r0.f17655d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17655d = r1
            goto L18
        L13:
            com.sumsub.sns.internal.ml.core.b$a r0 = new com.sumsub.sns.internal.ml.core.b$a
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f17653b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f17655d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.f17652a
            com.sumsub.sns.internal.ml.core.b r5 = (com.sumsub.sns.internal.ml.core.b) r5
            kotlin.b.b(r6)
            goto L4b
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.b.b(r6)
            kotlinx.coroutines.ExecutorCoroutineDispatcher r6 = r5.b()
            com.sumsub.sns.internal.ml.core.b$b r2 = new com.sumsub.sns.internal.ml.core.b$b
            r4 = 0
            r2.<init>(r5, r4)
            r0.f17652a = r5
            r0.f17655d = r3
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.withContext(r6, r2, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            java.util.concurrent.ExecutorService r5 = r5.i()
            r5.shutdown()
            O9.p r5 = O9.p.f3034a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.ml.core.b.a(com.sumsub.sns.internal.ml.core.b, T9.a):java.lang.Object");
    }

    public final InterpreterApi a() {
        InterpreterApi interpreterApi = this.f17647c;
        if (interpreterApi != null) {
            return interpreterApi;
        }
        InterpreterApi j10 = j();
        this.f17647c = j10;
        a(j10);
        return j10;
    }
}

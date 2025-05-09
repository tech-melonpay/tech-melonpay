package com.sumsub.sns.internal.core.common;

import I3.b;
import android.content.Context;
import ca.InterfaceC0635a;
import ca.InterfaceC0650p;
import com.sumsub.sns.internal.core.data.model.LogParams;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import okhttp3.i;
import okhttp3.logging.HttpLoggingInterceptor;
import qb.r;
import sa.AbstractC1244a;
import va.h;

/* loaded from: classes2.dex */
public final class q0 implements com.sumsub.sns.internal.log.cacher.a<LogParams> {

    /* renamed from: h, reason: collision with root package name */
    public static final a f15164h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Context f15165a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15166b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1244a f15167c = x.a(false, 1, null);

    /* renamed from: d, reason: collision with root package name */
    public final O9.f f15168d = kotlin.a.a(new i());

    /* renamed from: e, reason: collision with root package name */
    public final O9.f f15169e = kotlin.a.a(new b());

    /* renamed from: f, reason: collision with root package name */
    public final O9.f f15170f = kotlin.a.a(new f());

    /* renamed from: g, reason: collision with root package name */
    public final O9.f f15171g = kotlin.a.a(new h());

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.common.SNSExceptionSink$prepareForCache$2", f = "SNSExceptionSink.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f15173a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ OutputStream f15174b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q0 f15175c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ LogParams f15176d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(OutputStream outputStream, q0 q0Var, LogParams logParams, T9.a<? super c> aVar) {
            super(2, aVar);
            this.f15174b = outputStream;
            this.f15175c = q0Var;
            this.f15176d = logParams;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((c) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return new c(this.f15174b, this.f15175c, this.f15176d, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f15173a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.f15174b);
            q0 q0Var = this.f15175c;
            LogParams logParams = this.f15176d;
            try {
                AbstractC1244a abstractC1244a = q0Var.f15167c;
                outputStreamWriter.write(abstractC1244a.b(j3.e.B(abstractC1244a.f27066b, kotlin.jvm.internal.h.d(LogParams.class)), logParams));
                O9.p pVar = O9.p.f3034a;
                U4.b.d(outputStreamWriter, null);
                return O9.p.f3034a;
            } finally {
            }
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.common.SNSExceptionSink", f = "SNSExceptionSink.kt", l = {103, 103}, m = "resendFromCache")
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15177a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f15178b;

        /* renamed from: d, reason: collision with root package name */
        public int f15180d;

        public d(T9.a<? super d> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15178b = obj;
            this.f15180d |= Integer.MIN_VALUE;
            return q0.this.a((InputStream) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.common.SNSExceptionSink$restoreParams$2", f = "SNSExceptionSink.kt", l = {}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super LogParams>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f15181a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f15182b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InputStream f15183c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ q0 f15184d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InputStream inputStream, q0 q0Var, T9.a<? super e> aVar) {
            super(2, aVar);
            this.f15183c = inputStream;
            this.f15184d = q0Var;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super LogParams> aVar) {
            return ((e) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            e eVar = new e(this.f15183c, this.f15184d, aVar);
            eVar.f15182b = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LogParams logParams;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f15181a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f15182b;
            InputStreamReader inputStreamReader = new InputStreamReader(this.f15183c);
            try {
                try {
                    AbstractC1244a abstractC1244a = this.f15184d.f15167c;
                    logParams = (LogParams) abstractC1244a.c(j3.e.B(abstractC1244a.f27066b, kotlin.jvm.internal.h.d(LogParams.class)), U4.b.y(inputStreamReader));
                } catch (Exception e10) {
                    com.sumsub.sns.internal.log.a.f17535a.e(com.sumsub.sns.internal.log.c.a(coroutineScope), "Can't restore params", e10);
                    logParams = null;
                }
                U4.b.d(inputStreamReader, null);
                return logParams;
            } finally {
            }
        }
    }

    public static final class f extends Lambda implements InterfaceC0635a<qb.r> {
        public f() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final qb.r invoke() {
            r.b bVar = new r.b();
            bVar.b(q0.this.f());
            va.h b9 = q0.this.b();
            Objects.requireNonNull(b9, "client == null");
            bVar.f26079b = b9;
            AbstractC1244a abstractC1244a = q0.this.f15167c;
            Pattern pattern = okhttp3.i.f24542d;
            bVar.a(new I3.a(i.a.a("application/json"), new b.a(abstractC1244a)));
            return bVar.c();
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.common.SNSExceptionSink", f = "SNSExceptionSink.kt", l = {76}, m = "send")
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f15186a;

        /* renamed from: c, reason: collision with root package name */
        public int f15188c;

        public g(T9.a<? super g> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15186a = obj;
            this.f15188c |= Integer.MIN_VALUE;
            return q0.this.a((LogParams) null, this);
        }
    }

    public static final class h extends Lambda implements InterfaceC0635a<com.sumsub.sns.internal.core.data.source.log.b> {
        public h() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.sumsub.sns.internal.core.data.source.log.b invoke() {
            return (com.sumsub.sns.internal.core.data.source.log.b) q0.this.c().b(com.sumsub.sns.internal.core.data.source.log.b.class);
        }
    }

    public static final class i extends Lambda implements InterfaceC0635a<com.sumsub.sns.internal.core.data.source.settings.a> {
        public i() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.sumsub.sns.internal.core.data.source.settings.a invoke() {
            return new com.sumsub.sns.internal.core.data.source.settings.a(q0.this.a().getSharedPreferences("idensic_mobile_sdk", 0));
        }
    }

    public q0(Context context, String str) {
        this.f15165a = context;
        this.f15166b = str;
    }

    public final com.sumsub.sns.internal.core.data.source.settings.b e() {
        return (com.sumsub.sns.internal.core.data.source.settings.b) this.f15168d.getValue();
    }

    public final String f() {
        return this.f15166b;
    }

    @Override // com.sumsub.sns.internal.log.cacher.c
    public /* bridge */ /* synthetic */ Object send(Object obj, T9.a aVar) {
        return a((LogParams) obj, (T9.a<? super Boolean>) aVar);
    }

    @Override // com.sumsub.sns.internal.log.cacher.a
    public /* bridge */ /* synthetic */ Object a(LogParams logParams, OutputStream outputStream, T9.a aVar) {
        return a2(logParams, outputStream, (T9.a<? super O9.p>) aVar);
    }

    public final va.h b() {
        return (va.h) this.f15169e.getValue();
    }

    public final qb.r c() {
        return (qb.r) this.f15170f.getValue();
    }

    public final com.sumsub.sns.internal.core.data.source.log.b d() {
        return (com.sumsub.sns.internal.core.data.source.log.b) this.f15171g.getValue();
    }

    public final Context a() {
        return this.f15165a;
    }

    public final Object b(InputStream inputStream, T9.a<? super LogParams> aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new e(inputStream, this, null), aVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(com.sumsub.sns.internal.core.data.model.LogParams r5, T9.a<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.sumsub.sns.internal.core.common.q0.g
            if (r0 == 0) goto L13
            r0 = r6
            com.sumsub.sns.internal.core.common.q0$g r0 = (com.sumsub.sns.internal.core.common.q0.g) r0
            int r1 = r0.f15188c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15188c = r1
            goto L18
        L13:
            com.sumsub.sns.internal.core.common.q0$g r0 = new com.sumsub.sns.internal.core.common.q0$g
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f15186a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f15188c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.b.b(r6)     // Catch: java.lang.Exception -> L49
            goto L4a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.b.b(r6)
            com.sumsub.sns.internal.core.data.source.log.b r6 = r4.d()     // Catch: java.lang.Exception -> L49
            com.sumsub.sns.internal.core.data.model.LogType r2 = com.sumsub.sns.internal.core.data.model.LogType.Error     // Catch: java.lang.Exception -> L49
            java.lang.String r2 = r2.getValue()     // Catch: java.lang.Exception -> L49
            java.util.Map r5 = com.sumsub.sns.internal.core.data.model.r.a(r5)     // Catch: java.lang.Exception -> L49
            r0.f15188c = r3     // Catch: java.lang.Exception -> L49
            java.lang.Object r5 = r6.a(r2, r5, r0)     // Catch: java.lang.Exception -> L49
            if (r5 != r1) goto L4a
            return r1
        L49:
            r3 = 0
        L4a:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.common.q0.a(com.sumsub.sns.internal.core.data.model.LogParams, T9.a):java.lang.Object");
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    public Object a2(LogParams logParams, OutputStream outputStream, T9.a<? super O9.p> aVar) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new c(outputStream, this, logParams, null), aVar);
        return withContext == CoroutineSingletons.f23158a ? withContext : O9.p.f3034a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.sumsub.sns.internal.log.cacher.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.io.InputStream r6, T9.a<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.sumsub.sns.internal.core.common.q0.d
            if (r0 == 0) goto L13
            r0 = r7
            com.sumsub.sns.internal.core.common.q0$d r0 = (com.sumsub.sns.internal.core.common.q0.d) r0
            int r1 = r0.f15180d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15180d = r1
            goto L18
        L13:
            com.sumsub.sns.internal.core.common.q0$d r0 = new com.sumsub.sns.internal.core.common.q0$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f15178b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f15180d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.b.b(r7)
            goto L59
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.f15177a
            com.sumsub.sns.internal.core.common.q0 r6 = (com.sumsub.sns.internal.core.common.q0) r6
            kotlin.b.b(r7)
            goto L49
        L3a:
            kotlin.b.b(r7)
            r0.f15177a = r5
            r0.f15180d = r4
            java.lang.Object r7 = r5.b(r6, r0)
            if (r7 != r1) goto L48
            return r1
        L48:
            r6 = r5
        L49:
            com.sumsub.sns.internal.core.data.model.LogParams r7 = (com.sumsub.sns.internal.core.data.model.LogParams) r7
            if (r7 == 0) goto L60
            r2 = 0
            r0.f15177a = r2
            r0.f15180d = r3
            java.lang.Object r7 = r6.a(r7, r0)
            if (r7 != r1) goto L59
            return r1
        L59:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r6 = r7.booleanValue()
            goto L61
        L60:
            r6 = 0
        L61:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.common.q0.a(java.io.InputStream, T9.a):java.lang.Object");
    }

    public static final class b extends Lambda implements InterfaceC0635a<va.h> {
        public b() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final va.h invoke() {
            h.a aVar = new h.a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            aVar.f30753x = wa.b.b("timeout", 30L, timeUnit);
            aVar.a(30L, timeUnit);
            aVar.b(30L, timeUnit);
            aVar.c(30L, timeUnit);
            aVar.f30733c.add(new com.sumsub.sns.internal.core.data.network.interceptor.a(q0.this.e()));
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new com.google.android.gms.measurement.internal.a(12));
            httpLoggingInterceptor.f24659c = HttpLoggingInterceptor.Level.f24662c;
            aVar.f30733c.add(httpLoggingInterceptor);
            return new va.h(aVar);
        }

        public static final void a(String str) {
            System.out.println((Object) str);
        }
    }
}

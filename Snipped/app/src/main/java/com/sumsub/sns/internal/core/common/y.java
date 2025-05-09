package com.sumsub.sns.internal.core.common;

import V9.d;
import android.util.Log;
import ca.InterfaceC0650p;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.data.model.SNSException;
import com.sumsub.sns.internal.core.data.model.LogParams;
import com.sumsub.sns.internal.core.data.model.LogType;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.concurrent.Executors;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorsKt;
import sa.AbstractC1244a;

/* loaded from: classes2.dex */
public final class y implements Logger {

    /* renamed from: c, reason: collision with root package name */
    public static final a f15197c = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final CoroutineScope f15198e = CoroutineScopeKt.CoroutineScope(ExecutorsKt.from(Executors.newSingleThreadExecutor()));

    /* renamed from: a, reason: collision with root package name */
    public String f15199a;

    /* renamed from: b, reason: collision with root package name */
    public final com.sumsub.sns.internal.log.cacher.e<LogParams> f15200b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b implements com.sumsub.sns.internal.log.cacher.a<LogParams> {

        /* renamed from: a, reason: collision with root package name */
        public final com.sumsub.sns.internal.core.data.source.log.a f15201a;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC1244a f15202b = x.a(false, 1, null);

        @V9.d(c = "com.sumsub.sns.internal.core.common.KibanaLogger$KibanaSink$prepareForCache$2", f = "KibanaLogger.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f15203a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OutputStream f15204b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f15205c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ LogParams f15206d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(OutputStream outputStream, b bVar, LogParams logParams, T9.a<? super a> aVar) {
                super(2, aVar);
                this.f15204b = outputStream;
                this.f15205c = bVar;
                this.f15206d = logParams;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
                return ((a) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                return new a(this.f15204b, this.f15205c, this.f15206d, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                if (this.f15203a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.f15204b);
                b bVar = this.f15205c;
                LogParams logParams = this.f15206d;
                try {
                    AbstractC1244a abstractC1244a = bVar.f15202b;
                    outputStreamWriter.write(abstractC1244a.b(j3.e.B(abstractC1244a.f27066b, kotlin.jvm.internal.h.d(LogParams.class)), logParams));
                    O9.p pVar = O9.p.f3034a;
                    U4.b.d(outputStreamWriter, null);
                    return O9.p.f3034a;
                } finally {
                }
            }
        }

        @V9.d(c = "com.sumsub.sns.internal.core.common.KibanaLogger$KibanaSink", f = "KibanaLogger.kt", l = {134, 134}, m = "resendFromCache")
        /* renamed from: com.sumsub.sns.internal.core.common.y$b$b, reason: collision with other inner class name */
        public static final class C0197b extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public Object f15207a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f15208b;

            /* renamed from: d, reason: collision with root package name */
            public int f15210d;

            public C0197b(T9.a<? super C0197b> aVar) {
                super(aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f15208b = obj;
                this.f15210d |= Integer.MIN_VALUE;
                return b.this.a((InputStream) null, this);
            }
        }

        @V9.d(c = "com.sumsub.sns.internal.core.common.KibanaLogger$KibanaSink$restoreParams$2", f = "KibanaLogger.kt", l = {}, m = "invokeSuspend")
        public static final class c extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super LogParams>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f15211a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputStream f15212b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f15213c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(InputStream inputStream, b bVar, T9.a<? super c> aVar) {
                super(2, aVar);
                this.f15212b = inputStream;
                this.f15213c = bVar;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, T9.a<? super LogParams> aVar) {
                return ((c) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                return new c(this.f15212b, this.f15213c, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                LogParams logParams;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                if (this.f15211a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                InputStreamReader inputStreamReader = new InputStreamReader(this.f15212b);
                try {
                    try {
                        AbstractC1244a abstractC1244a = this.f15213c.f15202b;
                        logParams = (LogParams) abstractC1244a.c(j3.e.B(abstractC1244a.f27066b, kotlin.jvm.internal.h.d(LogParams.class)), U4.b.y(inputStreamReader));
                    } catch (Exception e10) {
                        com.sumsub.sns.internal.log.a.f17535a.e("KibanaLogger", "Can't restore params", e10);
                        logParams = null;
                    }
                    U4.b.d(inputStreamReader, null);
                    return logParams;
                } finally {
                }
            }
        }

        @V9.d(c = "com.sumsub.sns.internal.core.common.KibanaLogger$KibanaSink$send$2", f = "KibanaLogger.kt", l = {98}, m = "invokeSuspend")
        public static final class d extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super Boolean>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f15214a;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ LogParams f15216c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(LogParams logParams, T9.a<? super d> aVar) {
                super(2, aVar);
                this.f15216c = logParams;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, T9.a<? super Boolean> aVar) {
                return ((d) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                return b.this.new d(this.f15216c, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Integer code;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                int i = this.f15214a;
                boolean z10 = false;
                try {
                    if (i == 0) {
                        kotlin.b.b(obj);
                        com.sumsub.sns.internal.core.data.source.log.a aVar = b.this.f15201a;
                        LogType logType = LogType.Warn;
                        LogParams logParams = this.f15216c;
                        this.f15214a = 1;
                        if (aVar.a(logType, logParams, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.b.b(obj);
                    }
                } catch (SNSException.Api e10) {
                    Integer code2 = e10.getCode();
                    if (code2 == null || code2.intValue() < 400 || ((code = e10.getCode()) != null && code.intValue() > 499)) {
                        com.sumsub.sns.internal.log.a.f17535a.e("KibanaLogger", "Failed to send logs", e10);
                    } else {
                        Logger.i$default(com.sumsub.sns.internal.log.a.f17535a, "KibanaLogger", "Unauthorized, drop packet", null, 4, null);
                    }
                } catch (Exception e11) {
                    com.sumsub.sns.internal.log.a.f17535a.e("KibanaLogger", "Failed to send logs", e11);
                }
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }

        public b(com.sumsub.sns.internal.core.data.source.log.a aVar) {
            this.f15201a = aVar;
        }

        @Override // com.sumsub.sns.internal.log.cacher.c
        public /* bridge */ /* synthetic */ Object send(Object obj, T9.a aVar) {
            return a((LogParams) obj, (T9.a<? super Boolean>) aVar);
        }

        @Override // com.sumsub.sns.internal.log.cacher.a
        public /* bridge */ /* synthetic */ Object a(LogParams logParams, OutputStream outputStream, T9.a aVar) {
            return a2(logParams, outputStream, (T9.a<? super O9.p>) aVar);
        }

        public final Object b(InputStream inputStream, T9.a<? super LogParams> aVar) {
            return BuildersKt.withContext(Dispatchers.getIO(), new c(inputStream, this, null), aVar);
        }

        public Object a(LogParams logParams, T9.a<? super Boolean> aVar) {
            return BuildersKt.withContext(Dispatchers.getIO(), new d(logParams, null), aVar);
        }

        /* renamed from: a, reason: avoid collision after fix types in other method */
        public Object a2(LogParams logParams, OutputStream outputStream, T9.a<? super O9.p> aVar) {
            Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new a(outputStream, this, logParams, null), aVar);
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
                boolean r0 = r7 instanceof com.sumsub.sns.internal.core.common.y.b.C0197b
                if (r0 == 0) goto L13
                r0 = r7
                com.sumsub.sns.internal.core.common.y$b$b r0 = (com.sumsub.sns.internal.core.common.y.b.C0197b) r0
                int r1 = r0.f15210d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f15210d = r1
                goto L18
            L13:
                com.sumsub.sns.internal.core.common.y$b$b r0 = new com.sumsub.sns.internal.core.common.y$b$b
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f15208b
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
                int r2 = r0.f15210d
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
                java.lang.Object r6 = r0.f15207a
                com.sumsub.sns.internal.core.common.y$b r6 = (com.sumsub.sns.internal.core.common.y.b) r6
                kotlin.b.b(r7)
                goto L49
            L3a:
                kotlin.b.b(r7)
                r0.f15207a = r5
                r0.f15210d = r4
                java.lang.Object r7 = r5.b(r6, r0)
                if (r7 != r1) goto L48
                return r1
            L48:
                r6 = r5
            L49:
                com.sumsub.sns.internal.core.data.model.LogParams r7 = (com.sumsub.sns.internal.core.data.model.LogParams) r7
                if (r7 == 0) goto L60
                r2 = 0
                r0.f15207a = r2
                r0.f15210d = r3
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
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.common.y.b.a(java.io.InputStream, T9.a):java.lang.Object");
        }
    }

    @d(c = "com.sumsub.sns.internal.core.common.KibanaLogger$log$1", f = "KibanaLogger.kt", l = {67}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f15217a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f15219c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f15220d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f15221e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Throwable f15222f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i, String str, String str2, Throwable th, T9.a<? super c> aVar) {
            super(2, aVar);
            this.f15219c = i;
            this.f15220d = str;
            this.f15221e = str2;
            this.f15222f = th;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((c) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return y.this.new c(this.f15219c, this.f15220d, this.f15221e, this.f15222f, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f15217a;
            if (i == 0) {
                kotlin.b.b(obj);
                com.sumsub.sns.internal.log.cacher.e eVar = y.this.f15200b;
                LogParams b9 = y.this.b(this.f15219c, this.f15220d, this.f15221e, this.f15222f);
                this.f15217a = 1;
                if (eVar.send(b9, this) == coroutineSingletons) {
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

    public y(com.sumsub.sns.internal.core.data.source.log.a aVar, String str, File file, com.sumsub.sns.internal.log.cacher.e<LogParams> eVar) {
        this.f15199a = str;
        this.f15200b = eVar;
    }

    public final LogParams b(int i, String str, String str2, Throwable th) {
        String str3;
        String str4 = this.f15199a;
        String str5 = com.sumsub.sns.internal.log.b.a().get(Integer.valueOf(i)) + '/' + str2;
        if (th == null || (str3 = Log.getStackTraceString(th)) == null) {
            str3 = "";
        }
        return new LogParams((String) null, str, (String) null, "KibanaLogger.kt", str4, str5, (String) null, str3, 65, (DefaultConstructorMarker) null);
    }

    @Override // com.sumsub.log.logger.Logger
    public void d(String str, String str2, Throwable th) {
        a(3, str, str2, th);
    }

    @Override // com.sumsub.log.logger.Logger
    public void e(String str, String str2, Throwable th) {
        a(6, str, str2, th);
    }

    @Override // com.sumsub.log.logger.Logger
    public void i(String str, String str2, Throwable th) {
        a(4, str, str2, th);
    }

    @Override // com.sumsub.log.logger.Logger
    public void v(String str, String str2, Throwable th) {
        a(2, str, str2, th);
    }

    @Override // com.sumsub.log.logger.Logger
    public void w(String str, String str2, Throwable th) {
        a(5, str, str2, th);
    }

    public final void a(String str) {
        this.f15199a = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ y(com.sumsub.sns.internal.core.data.source.log.a r1, java.lang.String r2, java.io.File r3, com.sumsub.sns.internal.log.cacher.e r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
        /*
            r0 = this;
            r5 = r5 & 8
            if (r5 == 0) goto L18
            com.sumsub.sns.internal.log.cacher.e r4 = new com.sumsub.sns.internal.log.cacher.e
            com.sumsub.sns.internal.core.common.y$b r5 = new com.sumsub.sns.internal.core.common.y$b
            r5.<init>(r1)
            r4.<init>(r5, r3)
            java.lang.String r5 = "_KibanaLogger"
            r4.a(r5)
            com.sumsub.sns.internal.log.cacher.d r5 = com.sumsub.sns.internal.log.cacher.d.f17543a
            r5.a(r4)
        L18:
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.common.y.<init>(com.sumsub.sns.internal.core.data.source.log.a, java.lang.String, java.io.File, com.sumsub.sns.internal.log.cacher.e, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final void a(int i, String str, String str2, Throwable th) {
        BuildersKt__Builders_commonKt.launch$default(f15198e, null, null, new c(i, str, str2, th, null), 3, null);
    }
}

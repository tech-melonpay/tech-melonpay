package com.sumsub.sentry;

import android.content.Context;
import ca.InterfaceC0635a;
import ca.InterfaceC0650p;
import com.sumsub.log.logger.Logger;
import java.lang.Thread;
import java.util.Collections;
import java.util.concurrent.Executors;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;

/* loaded from: classes2.dex */
public final class c0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: f, reason: collision with root package name */
    public static final a f13596f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Context f13597a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0635a<String> f13598b;

    /* renamed from: c, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f13599c;

    /* renamed from: d, reason: collision with root package name */
    public final CoroutineScope f13600d = CoroutineScopeKt.CoroutineScope(ExecutorsKt.from(Executors.newSingleThreadExecutor()));

    /* renamed from: e, reason: collision with root package name */
    public final com.sumsub.sns.internal.log.cacher.e<v> f13601e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Throwable a(Thread thread, Throwable th) {
            return new i(new o(null, "UncaughtExceptionHandler", null, null, Boolean.FALSE, null, null, null, 237, null), th, thread, false, 8, null);
        }

        public a() {
        }
    }

    @V9.d(c = "com.sumsub.sentry.SentryExceptionHandler$uncaughtException$1", f = "SentryExceptionHandler.kt", l = {38}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f13602a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ v f13604c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v vVar, T9.a<? super b> aVar) {
            super(2, aVar);
            this.f13604c = vVar;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((b) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return c0.this.new b(this.f13604c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f13602a;
            try {
                if (i == 0) {
                    kotlin.b.b(obj);
                    com.sumsub.sns.internal.log.cacher.e eVar = c0.this.f13601e;
                    v vVar = this.f13604c;
                    this.f13602a = 1;
                    if (eVar.send(vVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
            } catch (Exception e10) {
                Logger.e$default(com.sumsub.sns.internal.log.a.f17535a, "SentryExceptionHandler", com.google.android.gms.measurement.internal.a.i("Error while sending uncaught exception: ", e10), null, 4, null);
            }
            return O9.p.f3034a;
        }
    }

    public c0(Context context, InterfaceC0635a<String> interfaceC0635a, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f13597a = context;
        this.f13598b = interfaceC0635a;
        this.f13599c = uncaughtExceptionHandler;
        com.sumsub.sns.internal.log.cacher.e<v> eVar = new com.sumsub.sns.internal.log.cacher.e<>(new g0("https://sentry.sumsub.com/"), context.getCacheDir());
        eVar.a("_SentrySink");
        com.sumsub.sns.internal.log.cacher.d.f17543a.a(eVar);
        this.f13601e = eVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        try {
            try {
                v a10 = a(thread, th);
                if (a10 != null) {
                    BuildersKt__Builders_commonKt.launch$default(this.f13600d, null, null, new b(a10, null), 3, null);
                } else {
                    Logger.i$default(com.sumsub.sns.internal.log.a.f17535a, "SentryExceptionHandler", "Ignoring host application's exceptions", null, 4, null);
                }
                uncaughtExceptionHandler = this.f13599c;
                if (uncaughtExceptionHandler == null) {
                    return;
                }
            } catch (Exception e10) {
                Logger.e$default(com.sumsub.sns.internal.log.a.f17535a, "SentryExceptionHandler", "Error while preparing Sentry evenelope: " + e10, null, 4, null);
                uncaughtExceptionHandler = this.f13599c;
                if (uncaughtExceptionHandler == null) {
                    return;
                }
            }
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f13599c;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
            throw th2;
        }
    }

    public final v a(Thread thread, Throwable th) {
        if (!a(th)) {
            return null;
        }
        Throwable a10 = f13596f.a(thread, th);
        String invoke = this.f13598b.invoke();
        Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, "SentryExceptionHandler", "prepare envelope: applicantId=" + invoke + " exception=" + th, null, 4, null);
        try {
            z zVar = new z(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
            zVar.a(a10);
            z a11 = new com.sumsub.sentry.android.c(this.f13597a, new com.sumsub.sentry.android.a(), new com.sumsub.sentry.android.h(this.f13597a, null, null, null, null, 30, null), invoke).a(new n(null, null, k.f13692g.a(), 3, null).a(zVar));
            return new v(new w(a11.getEventId(), (s) null, 2, (DefaultConstructorMarker) null), Collections.singletonList(x.f13805c.a(a11)));
        } catch (Throwable th2) {
            com.sumsub.sns.internal.log.a.f17535a.e("SentryExceptionHandler", "Failed to create event", th2);
            return null;
        }
    }

    public final boolean a(Throwable th) {
        boolean z10 = false;
        if (th == null) {
            return false;
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (stackTrace[i].getClassName().startsWith("com.sumsub")) {
                z10 = true;
                break;
            }
            i++;
        }
        return !z10 ? a(th.getCause()) : z10;
    }
}

package com.sumsub.sns.internal.core.analytics;

import O9.p;
import V9.d;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import com.sumsub.sns.core.data.model.SNSTrackEvents;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import ka.C0969n;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static com.sumsub.sns.internal.core.data.source.analythic.a f14968d;

    /* renamed from: h, reason: collision with root package name */
    public static InterfaceC0646l<? super SNSTrackEvents, p> f14972h;
    public static Timer i;

    /* renamed from: a, reason: collision with root package name */
    public static final b f14967a = new b();

    /* renamed from: e, reason: collision with root package name */
    public static final ArrayList<SNSTrackEvents> f14969e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    public static final ConcurrentHashMap<GlobalStatePayload, String> f14970f = new ConcurrentHashMap<>();

    /* renamed from: g, reason: collision with root package name */
    public static final CoroutineScope f14971g = CoroutineScopeKt.CoroutineScope(ExecutorsKt.from(Executors.newSingleThreadExecutor()));

    /* renamed from: j, reason: collision with root package name */
    public static boolean f14973j = true;

    @d(c = "com.sumsub.sns.internal.core.analytics.Analytics$flush$1", f = "Analytics.kt", l = {87}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14974a;

        public a(T9.a<? super a> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((a) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return new a(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f14974a;
            if (i == 0) {
                kotlin.b.b(obj);
                if (!b.f14969e.isEmpty()) {
                    ArrayList arrayList = new ArrayList(b.f14969e);
                    b.f14969e.clear();
                    com.sumsub.sns.internal.core.data.source.analythic.a aVar = b.f14968d;
                    if (aVar != null) {
                        this.f14974a = 1;
                        obj = aVar.a(arrayList, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
                com.sumsub.sns.internal.log.cacher.d.f17543a.b();
                return p.f3034a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            com.sumsub.sns.internal.log.cacher.d.f17543a.b();
            return p.f3034a;
        }
    }

    /* renamed from: com.sumsub.sns.internal.core.analytics.b$b, reason: collision with other inner class name */
    public static final class C0190b extends TimerTask {
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            b.f14967a.e();
        }
    }

    @d(c = "com.sumsub.sns.internal.core.analytics.Analytics$send$1", f = "Analytics.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14975a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SNSTrackEvents f14976b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f14977c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(SNSTrackEvents sNSTrackEvents, boolean z10, T9.a<? super c> aVar) {
            super(2, aVar);
            this.f14976b = sNSTrackEvents;
            this.f14977c = z10;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((c) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return new c(this.f14976b, this.f14977c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f14975a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            try {
                InterfaceC0646l<SNSTrackEvents, p> g10 = b.f14967a.g();
                if (g10 != null) {
                    g10.invoke(this.f14976b);
                }
            } catch (Throwable unused) {
            }
            b.f14969e.add(this.f14976b);
            if (b.f14969e.size() >= 50 || this.f14977c) {
                b.f14967a.e();
            } else {
                b.f14967a.i();
            }
            return p.f3034a;
        }
    }

    public final void c() {
        f14970f.clear();
    }

    public final void d() {
        Timer timer = i;
        if (timer != null) {
            timer.cancel();
        }
        i = null;
    }

    public final void e() {
        BuildersKt__Builders_commonKt.launch$default(f14971g, null, null, new a(null), 3, null);
    }

    public final ConcurrentHashMap<GlobalStatePayload, String> f() {
        return f14970f;
    }

    public final InterfaceC0646l<SNSTrackEvents, p> g() {
        return f14972h;
    }

    public final boolean h() {
        return f14973j;
    }

    public final void i() {
        if (i != null) {
            d();
        }
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new C0190b(), 5000L, 5000L);
        i = timer;
    }

    public final void j() {
        f14972h = null;
        d();
    }

    public final void a(InterfaceC0646l<? super SNSTrackEvents, p> interfaceC0646l) {
        f14972h = interfaceC0646l;
    }

    public final void a(boolean z10) {
        if (!z10) {
            f14973j = true;
            f.a(0L, 1, null).a(SdkEvent.TrackingDisabled).a(kotlin.collections.a.p()).a(true);
        }
        f14973j = z10;
    }

    public final void a(SNSTrackEvents sNSTrackEvents, boolean z10) {
        if (f14973j || C0969n.Y(sNSTrackEvents.getActivity(), SdkEvent.TrackingDisabled.getText(), false)) {
            BuildersKt__Builders_commonKt.launch$default(f14971g, null, null, new c(sNSTrackEvents, z10, null), 3, null);
        }
    }

    public final void a(com.sumsub.sns.internal.core.data.source.analythic.a aVar) {
        f14968d = aVar;
    }

    public final void a(GlobalStatePayload globalStatePayload, String str) {
        f14970f.put(globalStatePayload, str);
    }

    public final void a(GlobalStatePayload globalStatePayload) {
        f14970f.remove(globalStatePayload);
    }
}

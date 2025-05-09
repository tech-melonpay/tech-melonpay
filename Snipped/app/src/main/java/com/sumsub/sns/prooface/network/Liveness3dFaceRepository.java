package com.sumsub.sns.prooface.network;

import androidx.annotation.Keep;
import ca.InterfaceC0650p;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.data.listener.TokenExpirationHandler;
import com.sumsub.sns.internal.core.common.SNSSession;
import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.common.g0;
import com.sumsub.sns.prooface.data.LivenessMessageType;
import com.sumsub.sns.prooface.data.i;
import com.sumsub.sns.prooface.data.j;
import j3.e;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import okhttp3.k;
import okhttp3.p;
import sa.AbstractC1244a;
import va.h;
import va.l;
import va.m;

/* loaded from: classes2.dex */
public final class Liveness3dFaceRepository {

    /* renamed from: l, reason: collision with root package name */
    public static final b f20249l = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final h f20250a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20251b;

    /* renamed from: c, reason: collision with root package name */
    public final SNSSession f20252c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1244a f20253d;

    /* renamed from: e, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.b<String> f20254e;

    /* renamed from: f, reason: collision with root package name */
    public int f20255f;

    /* renamed from: g, reason: collision with root package name */
    public l f20256g;

    /* renamed from: h, reason: collision with root package name */
    public a f20257h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f20258j;

    /* renamed from: k, reason: collision with root package name */
    public final c f20259k = new c();

    @Keep
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/sumsub/sns/prooface/network/Liveness3dFaceRepository$LivenessRepositoryResult;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "g", "h", "Lcom/sumsub/sns/prooface/network/Liveness3dFaceRepository$LivenessRepositoryResult$a;", "Lcom/sumsub/sns/prooface/network/Liveness3dFaceRepository$LivenessRepositoryResult$b;", "Lcom/sumsub/sns/prooface/network/Liveness3dFaceRepository$LivenessRepositoryResult$c;", "Lcom/sumsub/sns/prooface/network/Liveness3dFaceRepository$LivenessRepositoryResult$d;", "Lcom/sumsub/sns/prooface/network/Liveness3dFaceRepository$LivenessRepositoryResult$e;", "Lcom/sumsub/sns/prooface/network/Liveness3dFaceRepository$LivenessRepositoryResult$f;", "Lcom/sumsub/sns/prooface/network/Liveness3dFaceRepository$LivenessRepositoryResult$g;", "Lcom/sumsub/sns/prooface/network/Liveness3dFaceRepository$LivenessRepositoryResult$h;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    public static abstract class LivenessRepositoryResult {

        public static final class a extends LivenessRepositoryResult {

            /* renamed from: a, reason: collision with root package name */
            public static final a f20260a = new a();

            public a() {
                super(null);
            }
        }

        public static final class b extends LivenessRepositoryResult {

            /* renamed from: a, reason: collision with root package name */
            public final j f20261a;

            public b(j jVar) {
                super(null);
                this.f20261a = jVar;
            }
        }

        public static final class c extends LivenessRepositoryResult {

            /* renamed from: a, reason: collision with root package name */
            public final Throwable f20262a;

            public c(Throwable th) {
                super(null);
                this.f20262a = th;
            }

            public final Throwable a() {
                return this.f20262a;
            }
        }

        public static final class d extends LivenessRepositoryResult {

            /* renamed from: a, reason: collision with root package name */
            public final j f20263a;

            public d(j jVar) {
                super(null);
                this.f20263a = jVar;
            }

            public final j a() {
                return this.f20263a;
            }
        }

        public static final class e extends LivenessRepositoryResult {

            /* renamed from: a, reason: collision with root package name */
            public static final e f20264a = new e();

            public e() {
                super(null);
            }
        }

        public static final class f extends LivenessRepositoryResult {

            /* renamed from: a, reason: collision with root package name */
            public final j f20265a;

            public f(j jVar) {
                super(null);
                this.f20265a = jVar;
            }

            public final j a() {
                return this.f20265a;
            }
        }

        public static final class g extends LivenessRepositoryResult {

            /* renamed from: a, reason: collision with root package name */
            public final j f20266a;

            public g(j jVar) {
                super(null);
                this.f20266a = jVar;
            }

            public final j a() {
                return this.f20266a;
            }
        }

        public static final class h extends LivenessRepositoryResult {

            /* renamed from: a, reason: collision with root package name */
            public final String f20267a;

            public h(String str) {
                super(null);
                this.f20267a = str;
            }
        }

        public /* synthetic */ LivenessRepositoryResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private LivenessRepositoryResult() {
        }
    }

    public interface a {
        void a(LivenessRepositoryResult livenessRepositoryResult);
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    public static final class c extends m {

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f20269a;

            static {
                int[] iArr = new int[LivenessMessageType.values().length];
                iArr[LivenessMessageType.livenessSessionStarted.ordinal()] = 1;
                iArr[LivenessMessageType.livenessSessionInProgress.ordinal()] = 2;
                iArr[LivenessMessageType.livenessSessionCompleted.ordinal()] = 3;
                iArr[LivenessMessageType.livenessSessionTerminated.ordinal()] = 4;
                f20269a = iArr;
            }
        }

        public c() {
        }

        @Override // va.m
        public void onClosed(l lVar, int i, String str) {
            Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "Liveness3dFaceRepository.onClosed: code=" + i + " reason=" + str, null, 4, null);
            Liveness3dFaceRepository.this.f20258j = false;
        }

        @Override // va.m
        public void onClosing(l lVar, int i, String str) {
            Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "Liveness3dFaceRepository.onClosing: code=" + i + " reason=" + str, null, 4, null);
            if (i != 4001 && i != 4002) {
                Liveness3dFaceRepository.this.i = true;
                return;
            }
            a aVar = Liveness3dFaceRepository.this.f20257h;
            if (aVar != null) {
                aVar.a(LivenessRepositoryResult.e.f20264a);
            }
            Liveness3dFaceRepository.this.d();
        }

        @Override // va.m
        public void onFailure(l lVar, Throwable th, p pVar) {
            if (!Liveness3dFaceRepository.this.i) {
                Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "Liveness3dFaceRepository.onFailure: e=" + th + ' ', null, 4, null);
                a aVar = Liveness3dFaceRepository.this.f20257h;
                if (aVar != null) {
                    aVar.a(new LivenessRepositoryResult.c(th));
                }
            }
            Liveness3dFaceRepository.this.f20258j = false;
        }

        @Override // va.m
        public void onMessage(l lVar, String str) {
            try {
                AbstractC1244a abstractC1244a = Liveness3dFaceRepository.this.f20253d;
                com.sumsub.sns.prooface.data.h hVar = (com.sumsub.sns.prooface.data.h) abstractC1244a.c(e.B(abstractC1244a.f27066b, kotlin.jvm.internal.h.d(com.sumsub.sns.prooface.data.h.class)), str);
                int i = a.f20269a[LivenessMessageType.INSTANCE.a(hVar.getType()).ordinal()];
                if (i == 1) {
                    Liveness3dFaceRepository.this.f20255f = 0;
                    a aVar = Liveness3dFaceRepository.this.f20257h;
                    if (aVar != null) {
                        aVar.a(new LivenessRepositoryResult.f(hVar.getSession()));
                    }
                } else if (i == 2) {
                    a aVar2 = Liveness3dFaceRepository.this.f20257h;
                    if (aVar2 != null) {
                        aVar2.a(new LivenessRepositoryResult.d(hVar.getSession()));
                    }
                } else if (i == 3) {
                    a aVar3 = Liveness3dFaceRepository.this.f20257h;
                    if (aVar3 != null) {
                        aVar3.a(new LivenessRepositoryResult.b(hVar.getSession()));
                    }
                } else if (i != 4) {
                    a aVar4 = Liveness3dFaceRepository.this.f20257h;
                    if (aVar4 != null) {
                        aVar4.a(new LivenessRepositoryResult.h(str));
                    }
                } else {
                    a aVar5 = Liveness3dFaceRepository.this.f20257h;
                    if (aVar5 != null) {
                        aVar5.a(new LivenessRepositoryResult.g(hVar.getSession()));
                    }
                }
            } catch (Exception e10) {
                com.sumsub.sns.internal.log.b.b(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "Can't parse liveness message=" + str, e10);
                a aVar6 = Liveness3dFaceRepository.this.f20257h;
                if (aVar6 != null) {
                    aVar6.a(new LivenessRepositoryResult.c(e10));
                }
            }
        }

        @Override // va.m
        public void onOpen(l lVar, p pVar) {
            Liveness3dFaceRepository.this.i = false;
            Liveness3dFaceRepository.this.f20258j = true;
            Liveness3dFaceRepository liveness3dFaceRepository = Liveness3dFaceRepository.this;
            liveness3dFaceRepository.a(i.b(liveness3dFaceRepository.f20251b));
        }
    }

    @V9.d(c = "com.sumsub.sns.prooface.network.Liveness3dFaceRepository$updateToken$1$1", f = "Liveness3dFaceRepository.kt", l = {}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f20270a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f20271b;

        public d(T9.a<? super d> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((d) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            d dVar = Liveness3dFaceRepository.this.new d(aVar);
            dVar.f20271b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f20270a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f20271b;
            String str = null;
            try {
                TokenExpirationHandler tokenExpirationHandler = e0.f15081a.getTokenExpirationHandler();
                if (tokenExpirationHandler != null) {
                    str = tokenExpirationHandler.onTokenExpired();
                }
            } catch (Exception e10) {
                com.sumsub.sns.internal.log.a aVar = com.sumsub.sns.internal.log.a.f17535a;
                String a10 = com.sumsub.sns.internal.log.c.a(coroutineScope);
                String message = e10.getMessage();
                if (message == null) {
                    message = "";
                }
                aVar.e(a10, message, e10);
            }
            if (str != null && g0.b(str)) {
                Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(coroutineScope), s3.b.j("Liveness3dFaceRepository.New token is available. Token is ", str), null, 4, null);
                Liveness3dFaceRepository.this.f20254e.a(str);
                Liveness3dFaceRepository.this.a();
            }
            return O9.p.f3034a;
        }
    }

    public Liveness3dFaceRepository(h hVar, String str, SNSSession sNSSession, AbstractC1244a abstractC1244a, com.sumsub.sns.internal.core.b<String> bVar) {
        this.f20250a = hVar;
        this.f20251b = str;
        this.f20252c = sNSSession;
        this.f20253d = abstractC1244a;
        this.f20254e = bVar;
    }

    public final boolean c() {
        return this.f20258j;
    }

    public final void d() {
        com.sumsub.sns.internal.log.a aVar = com.sumsub.sns.internal.log.a.f17535a;
        Logger.d$default(aVar, com.sumsub.sns.internal.log.c.a(this), "Liveness3dFaceRepository.updateToken", null, 4, null);
        int i = this.f20255f + 1;
        this.f20255f = i;
        if (i > 3) {
            Logger.d$default(aVar, com.sumsub.sns.internal.log.c.a(this), "Liveness3dFaceRepository. Max reconnect attempts reached", null, 4, null);
            a aVar2 = this.f20257h;
            if (aVar2 != null) {
                aVar2.a(new LivenessRepositoryResult.c(new Exception("Invalid access token")));
                return;
            }
            return;
        }
        ExecutorCoroutineDispatcher from = ExecutorsKt.from(Executors.newSingleThreadExecutor());
        try {
            BuildersKt__BuildersKt.runBlocking$default(null, new d(null), 1, null);
            O9.p pVar = O9.p.f3034a;
            U4.b.d(from, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                U4.b.d(from, th);
                throw th2;
            }
        }
    }

    public final void b() {
        Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "Liveness3dFaceRepository.disconnect", null, 4, null);
        l lVar = this.f20256g;
        if (lVar != null) {
            lVar.e(1000, "disconnect");
        }
        this.f20256g = null;
    }

    public final void a(a aVar) {
        this.f20255f = 0;
        this.f20257h = aVar;
        a();
    }

    public final void a(com.sumsub.sns.prooface.data.h hVar) {
        Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "Liveness3dFaceRepository.send: " + hVar.getType() + " isClosed=" + this.i, null, 4, null);
        if (this.i) {
            return;
        }
        l lVar = this.f20256g;
        if (lVar != null) {
            AbstractC1244a abstractC1244a = this.f20253d;
            lVar.a(abstractC1244a.b(e.B(abstractC1244a.f27066b, kotlin.jvm.internal.h.d(com.sumsub.sns.prooface.data.h.class)), hVar));
        } else {
            a aVar = this.f20257h;
            if (aVar != null) {
                aVar.a(LivenessRepositoryResult.a.f20260a);
            }
        }
    }

    public final void a() {
        try {
            Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "Liveness3dFaceRepository.newWebSocket", null, 4, null);
            l lVar = this.f20256g;
            if (lVar != null) {
                lVar.e(1000, "reconnect");
            }
            this.f20256g = null;
            k.a aVar = new k.a();
            aVar.g(this.f20252c.getUrl() + "ws/liveness?token=" + this.f20252c.getAccessToken());
            this.f20256g = this.f20250a.c(aVar.b(), this.f20259k);
        } catch (Exception e10) {
            a aVar2 = this.f20257h;
            if (aVar2 != null) {
                aVar2.a(new LivenessRepositoryResult.c(e10));
            }
        }
    }
}

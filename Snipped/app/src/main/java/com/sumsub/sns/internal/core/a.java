package com.sumsub.sns.internal.core;

import I3.b;
import android.content.Context;
import android.net.Uri;
import android.text.Spanned;
import ca.InterfaceC0635a;
import com.squareup.picasso.Picasso;
import com.sumsub.sns.internal.core.common.SNSSession;
import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.common.o0;
import com.sumsub.sns.internal.core.common.p0;
import com.sumsub.sns.internal.core.common.x;
import com.sumsub.sns.internal.core.common.x0;
import com.sumsub.sns.internal.fingerprint.Fingerprinter;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.SupervisorKt;
import okhttp3.i;
import okhttp3.logging.HttpLoggingInterceptor;
import qb.r;
import sa.AbstractC1244a;
import va.h;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: A, reason: collision with root package name */
    public static a f14917A;

    /* renamed from: z, reason: collision with root package name */
    public static final C0186a f14918z = new C0186a(null);

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference<Context> f14919a;

    /* renamed from: b, reason: collision with root package name */
    public final SNSSession f14920b;

    /* renamed from: c, reason: collision with root package name */
    public final CoroutineScope f14921c = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null));

    /* renamed from: d, reason: collision with root package name */
    public final O9.f f14922d = kotlin.a.a(new t());

    /* renamed from: e, reason: collision with root package name */
    public final O9.f f14923e = kotlin.a.a(new h());

    /* renamed from: f, reason: collision with root package name */
    public final O9.f f14924f = kotlin.a.a(new d());

    /* renamed from: g, reason: collision with root package name */
    public final O9.f f14925g = kotlin.a.a(new e());

    /* renamed from: h, reason: collision with root package name */
    public final O9.f f14926h = kotlin.a.a(new m());
    public final O9.f i = kotlin.a.a(new b());

    /* renamed from: j, reason: collision with root package name */
    public final O9.f f14927j = kotlin.a.a(new f());

    /* renamed from: k, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.extensions.a f14928k = new j();

    /* renamed from: l, reason: collision with root package name */
    public final O9.f f14929l = kotlin.a.a(new i());

    /* renamed from: m, reason: collision with root package name */
    public final O9.f f14930m = kotlin.a.a(new c());

    /* renamed from: n, reason: collision with root package name */
    public final O9.f f14931n = kotlin.a.a(new l());

    /* renamed from: o, reason: collision with root package name */
    public final AbstractC1244a f14932o = x.a(false, 1, null);

    /* renamed from: p, reason: collision with root package name */
    public final O9.f f14933p = kotlin.a.a(new o());

    /* renamed from: q, reason: collision with root package name */
    public final O9.f f14934q = kotlin.a.a(new n());

    /* renamed from: r, reason: collision with root package name */
    public final O9.f f14935r = kotlin.a.a(new g());

    /* renamed from: s, reason: collision with root package name */
    public final O9.f f14936s = kotlin.a.a(new q());

    /* renamed from: t, reason: collision with root package name */
    public final O9.f f14937t = kotlin.a.a(new r());

    /* renamed from: u, reason: collision with root package name */
    public final O9.f f14938u = kotlin.a.a(new p());

    /* renamed from: v, reason: collision with root package name */
    public final O9.f f14939v = kotlin.a.a(new k());

    /* renamed from: w, reason: collision with root package name */
    public final O9.f f14940w = kotlin.a.a(s.f14963a);

    /* renamed from: x, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.b<String> f14941x = new u();

    /* renamed from: y, reason: collision with root package name */
    public final v f14942y = new v();

    /* renamed from: com.sumsub.sns.internal.core.a$a, reason: collision with other inner class name */
    public static final class C0186a {
        public /* synthetic */ C0186a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(Context context, SNSSession sNSSession) {
            if (context != context.getApplicationContext()) {
                throw new IllegalStateException("Check failed.".toString());
            }
            a aVar = a.f14917A;
            if (aVar != null) {
                if (!kotlin.jvm.internal.f.b(aVar.E(), sNSSession)) {
                    aVar = null;
                }
                if (aVar != null) {
                    return aVar;
                }
            }
            a aVar2 = new a(new WeakReference(context), sNSSession);
            a.f14917A = aVar2;
            return aVar2;
        }

        public C0186a() {
        }
    }

    public static final class b extends Lambda implements InterfaceC0635a<com.sumsub.sns.internal.core.data.source.analythic.a> {

        /* renamed from: com.sumsub.sns.internal.core.a$b$a, reason: collision with other inner class name */
        public static final class C0187a extends Lambda implements InterfaceC0635a<UUID> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a f14944a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0187a(a aVar) {
                super(0);
                this.f14944a = aVar;
            }

            @Override // ca.InterfaceC0635a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final UUID invoke() {
                return this.f14944a.F().g();
            }
        }

        public b() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.sumsub.sns.internal.core.data.source.analythic.a invoke() {
            com.sumsub.sns.internal.log.cacher.e eVar = new com.sumsub.sns.internal.log.cacher.e(new com.sumsub.sns.internal.core.analytics.k(a.this.d(), new C0187a(a.this)), a.this.j().getCacheDir());
            eVar.a("_AnalyticsRepository");
            com.sumsub.sns.internal.log.cacher.d.f17543a.a(eVar);
            return new com.sumsub.sns.internal.core.data.source.analythic.a(eVar);
        }
    }

    public static final class c extends Lambda implements InterfaceC0635a<com.sumsub.sns.internal.core.data.source.applicant.remote.d> {
        public c() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.sumsub.sns.internal.core.data.source.applicant.remote.d invoke() {
            return new com.sumsub.sns.internal.core.data.source.applicant.remote.d(a.this.i(), a.this.f(), a.this.w(), a.this.E().getUrl());
        }
    }

    public static final class d extends Lambda implements InterfaceC0635a<com.sumsub.sns.internal.core.data.source.applicant.c> {
        public d() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.sumsub.sns.internal.core.data.source.applicant.c invoke() {
            return new com.sumsub.sns.internal.core.data.source.applicant.c(a.this.e(), a.this.p());
        }
    }

    public static final class e extends Lambda implements InterfaceC0635a<com.sumsub.sns.internal.core.data.source.applicant.f> {
        public e() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.sumsub.sns.internal.core.data.source.applicant.f invoke() {
            return new com.sumsub.sns.internal.core.data.source.applicant.f(a.this.e());
        }
    }

    public static final class f extends Lambda implements InterfaceC0635a<com.sumsub.sns.internal.core.data.source.cache.b> {
        public f() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.sumsub.sns.internal.core.data.source.cache.b invoke() {
            return new com.sumsub.sns.internal.core.data.source.cache.b(a.this.j());
        }
    }

    public static final class g extends Lambda implements InterfaceC0635a<va.h> {
        public g() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final va.h invoke() {
            h.a b9 = a.this.w().b();
            b9.f30740k = new okhttp3.b(new File(a.this.j().getCacheDir(), "sumsub_cache"), 31457280L);
            return new va.h(b9);
        }
    }

    public static final class h extends Lambda implements InterfaceC0635a<com.sumsub.sns.internal.core.data.source.common.c> {
        public h() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.sumsub.sns.internal.core.data.source.common.c invoke() {
            return new com.sumsub.sns.internal.core.data.source.common.c(a.this.o());
        }
    }

    public static final class i extends Lambda implements InterfaceC0635a<com.sumsub.sns.internal.core.data.source.dynamic.c> {
        public i() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.sumsub.sns.internal.core.data.source.dynamic.c invoke() {
            return new com.sumsub.sns.internal.core.data.source.dynamic.c(a.this.F(), a.this.e(), a.this.o(), a.this.f14921c, null, a.this.G(), a.this.f14942y, 16, null);
        }
    }

    public static final class j implements com.sumsub.sns.internal.core.data.source.extensions.a {
        public j() {
        }

        @Override // com.sumsub.sns.internal.core.data.source.extensions.a
        public Spanned a(CharSequence charSequence) {
            return com.sumsub.sns.internal.core.common.i.a(charSequence, a.this.j());
        }
    }

    public static final class k extends Lambda implements InterfaceC0635a<com.sumsub.sns.internal.core.domain.m> {
        public k() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.sumsub.sns.internal.core.domain.m invoke() {
            return new com.sumsub.sns.internal.core.domain.f().b((Context) a.this.f14919a.get());
        }
    }

    public static final class l extends Lambda implements InterfaceC0635a<Fingerprinter> {
        public l() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fingerprinter invoke() {
            return com.sumsub.sns.internal.fingerprint.a.a(a.this.j());
        }
    }

    public static final class m extends Lambda implements InterfaceC0635a<com.sumsub.sns.internal.core.data.source.log.c> {
        public m() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.sumsub.sns.internal.core.data.source.log.c invoke() {
            return new com.sumsub.sns.internal.core.data.source.log.c(a.this.v());
        }
    }

    public static final class n extends Lambda implements InterfaceC0635a<va.h> {
        public n() {
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
            aVar.f30728B = wa.b.b("interval", 20L, timeUnit);
            aVar.f30733c.add(new com.sumsub.sns.internal.core.data.network.interceptor.a(a.this.F()));
            aVar.f30733c.add(new com.sumsub.sns.internal.core.data.network.interceptor.c(a.this.G(), a.this.f14942y));
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
            httpLoggingInterceptor.f24659c = e0.f15081a.isDebug() ? HttpLoggingInterceptor.Level.f24662c : HttpLoggingInterceptor.Level.f24660a;
            aVar.f30733c.add(new com.sumsub.sns.internal.core.data.network.interceptor.b(httpLoggingInterceptor, Collections.singletonList(new Regex("/resources/tracking/trackEventsComp", RegexOption.IGNORE_CASE))));
            return new va.h(aVar);
        }
    }

    public static final class o extends Lambda implements InterfaceC0635a<va.h> {
        public o() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final va.h invoke() {
            h.a aVar = new h.a();
            TimeUnit timeUnit = TimeUnit.MINUTES;
            aVar.f30753x = wa.b.b("timeout", 5L, timeUnit);
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            aVar.a(30L, timeUnit2);
            aVar.b(30L, timeUnit2);
            aVar.c(1L, timeUnit);
            aVar.f30728B = wa.b.b("interval", 20L, timeUnit2);
            aVar.f30733c.add(new com.sumsub.sns.internal.core.data.network.interceptor.a(a.this.F()));
            aVar.f30733c.add(new com.sumsub.sns.internal.core.data.network.interceptor.c(a.this.G(), a.this.f14942y));
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
            httpLoggingInterceptor.f24659c = e0.f15081a.isDebug() ? HttpLoggingInterceptor.Level.f24662c : HttpLoggingInterceptor.Level.f24660a;
            RegexOption regexOption = RegexOption.IGNORE_CASE;
            aVar.f30733c.add(new com.sumsub.sns.internal.core.data.network.interceptor.b(httpLoggingInterceptor, P9.m.q(new Regex("applicantActions/\\w+/images", regexOption), new Regex("resources/applicants/\\w+/info/idDoc", regexOption))));
            return new va.h(aVar);
        }
    }

    public static final class s extends Lambda implements InterfaceC0635a<o0> {

        /* renamed from: a, reason: collision with root package name */
        public static final s f14963a = new s();

        public s() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o0 invoke() {
            return new p0().a();
        }
    }

    public static final class t extends Lambda implements InterfaceC0635a<com.sumsub.sns.internal.core.data.source.settings.a> {
        public t() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.sumsub.sns.internal.core.data.source.settings.a invoke() {
            return new com.sumsub.sns.internal.core.data.source.settings.a(a.this.j().getSharedPreferences("idensic_mobile_sdk", 0));
        }
    }

    public static final class u implements com.sumsub.sns.internal.core.b<String> {
        public u() {
        }

        @Override // com.sumsub.sns.internal.core.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String get() {
            return a.this.E().getAccessToken();
        }

        @Override // com.sumsub.sns.internal.core.b
        public void a(String str) {
            a.this.E().setAccessToken(str);
        }
    }

    public static final class v implements com.sumsub.sns.internal.core.b<String> {

        /* renamed from: a, reason: collision with root package name */
        public String f14966a;

        @Override // com.sumsub.sns.internal.core.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String get() {
            return this.f14966a;
        }

        @Override // com.sumsub.sns.internal.core.b
        public void a(String str) {
            this.f14966a = str;
        }
    }

    public a(WeakReference<Context> weakReference, SNSSession sNSSession) {
        this.f14919a = weakReference;
        this.f14920b = sNSSession;
    }

    public final Picasso A() {
        return (Picasso) this.f14938u.getValue();
    }

    public final qb.r B() {
        return (qb.r) this.f14936s.getValue();
    }

    public final qb.r C() {
        return (qb.r) this.f14937t.getValue();
    }

    public final o0 D() {
        return (o0) this.f14940w.getValue();
    }

    public final SNSSession E() {
        return this.f14920b;
    }

    public final com.sumsub.sns.internal.core.data.source.settings.b F() {
        return (com.sumsub.sns.internal.core.data.source.settings.b) this.f14922d.getValue();
    }

    public final com.sumsub.sns.internal.core.b<String> G() {
        return this.f14941x;
    }

    public final com.sumsub.sns.internal.core.data.source.cache.a k() {
        return (com.sumsub.sns.internal.core.data.source.cache.a) this.f14927j.getValue();
    }

    public final va.h l() {
        return (va.h) this.f14935r.getValue();
    }

    public final com.sumsub.sns.internal.core.data.source.common.a n() {
        return (com.sumsub.sns.internal.core.data.source.common.a) this.f14923e.getValue();
    }

    public final com.sumsub.sns.internal.core.data.source.common.b o() {
        return (com.sumsub.sns.internal.core.data.source.common.b) B().b(com.sumsub.sns.internal.core.data.source.common.b.class);
    }

    public final com.sumsub.sns.internal.core.data.source.dynamic.b p() {
        return (com.sumsub.sns.internal.core.data.source.dynamic.b) this.f14929l.getValue();
    }

    public final com.sumsub.sns.internal.core.data.source.extensions.a q() {
        return this.f14928k;
    }

    public final com.sumsub.sns.internal.core.domain.m r() {
        return (com.sumsub.sns.internal.core.domain.m) this.f14939v.getValue();
    }

    public final Fingerprinter s() {
        return (Fingerprinter) this.f14931n.getValue();
    }

    public final AbstractC1244a t() {
        return this.f14932o;
    }

    public final com.sumsub.sns.internal.core.data.source.log.a u() {
        return (com.sumsub.sns.internal.core.data.source.log.a) this.f14926h.getValue();
    }

    public final com.sumsub.sns.internal.core.data.source.log.b v() {
        return (com.sumsub.sns.internal.core.data.source.log.b) B().b(com.sumsub.sns.internal.core.data.source.log.b.class);
    }

    public final va.h w() {
        return (va.h) this.f14934q.getValue();
    }

    public final va.h y() {
        return (va.h) this.f14933p.getValue();
    }

    public final void b() {
        JobKt__JobKt.cancelChildren$default(this.f14921c.getCoroutineContext(), (CancellationException) null, 1, (Object) null);
    }

    public final com.sumsub.sns.internal.core.data.source.analythic.a c() {
        return (com.sumsub.sns.internal.core.data.source.analythic.a) this.i.getValue();
    }

    public final com.sumsub.sns.internal.core.data.source.analythic.b d() {
        return (com.sumsub.sns.internal.core.data.source.analythic.b) B().b(com.sumsub.sns.internal.core.data.source.analythic.b.class);
    }

    public final com.sumsub.sns.internal.core.data.source.applicant.a e() {
        return (com.sumsub.sns.internal.core.data.source.applicant.a) this.f14930m.getValue();
    }

    public final com.sumsub.sns.internal.core.data.source.applicant.remote.c f() {
        return (com.sumsub.sns.internal.core.data.source.applicant.remote.c) C().b(com.sumsub.sns.internal.core.data.source.applicant.remote.c.class);
    }

    public final com.sumsub.sns.internal.core.data.source.applicant.b g() {
        return (com.sumsub.sns.internal.core.data.source.applicant.b) this.f14924f.getValue();
    }

    public final com.sumsub.sns.internal.core.data.source.applicant.e h() {
        return (com.sumsub.sns.internal.core.data.source.applicant.e) this.f14925g.getValue();
    }

    public final com.sumsub.sns.internal.core.data.source.applicant.remote.e i() {
        return (com.sumsub.sns.internal.core.data.source.applicant.remote.e) B().b(com.sumsub.sns.internal.core.data.source.applicant.remote.e.class);
    }

    public final Context j() {
        return this.f14919a.get().getApplicationContext();
    }

    public static final class p extends Lambda implements InterfaceC0635a<Picasso> {
        public p() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Picasso invoke() {
            Context context = (Context) a.this.f14919a.get();
            if (context == null) {
                return null;
            }
            a aVar = a.this;
            Context applicationContext = context.getApplicationContext();
            com.google.android.gms.measurement.internal.a aVar2 = new com.google.android.gms.measurement.internal.a(11);
            P8.g gVar = new P8.g(aVar.w());
            com.sumsub.sns.geo.presentation.d dVar = new com.sumsub.sns.geo.presentation.d(aVar, 1);
            P8.e eVar = new P8.e(applicationContext);
            com.squareup.picasso.j jVar = new com.squareup.picasso.j();
            P8.h hVar = new P8.h(eVar);
            return new Picasso(applicationContext, new com.squareup.picasso.f(applicationContext, jVar, Picasso.f13371n, gVar, eVar, hVar), eVar, aVar2, dVar, hVar);
        }

        public static final void a(Picasso picasso, Uri uri, Exception exc) {
            com.sumsub.sns.internal.log.a.f17535a.e("Picasso", "Error", exc);
        }

        public static final com.squareup.picasso.k a(a aVar, com.squareup.picasso.k kVar) {
            Uri parse = Uri.parse(aVar.E().getUrl() + kVar.f13467c);
            if (parse != null) {
                return new com.squareup.picasso.k(parse, 0, 0, 0, null, Picasso.Priority.f13390b);
            }
            throw new IllegalArgumentException("Image URI may not be null.");
        }
    }

    public static final class q extends Lambda implements InterfaceC0635a<qb.r> {
        public q() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final qb.r invoke() {
            r.b bVar = new r.b();
            bVar.b(a.this.E().getUrl());
            va.h w2 = a.this.w();
            Objects.requireNonNull(w2, "client == null");
            bVar.f26079b = w2;
            bVar.f26082e.add(new com.sumsub.sns.internal.core.data.adapter.network.b(new C0188a(a.this)));
            AbstractC1244a t3 = a.this.t();
            Pattern pattern = okhttp3.i.f24542d;
            bVar.a(new I3.a(i.a.a("application/json"), new b.a(t3)));
            return bVar.c();
        }

        /* renamed from: com.sumsub.sns.internal.core.a$q$a, reason: collision with other inner class name */
        public static final class C0188a implements x0 {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a f14960a;

            public C0188a(a aVar) {
                this.f14960a = aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:48:0x00ba A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:52:0x008a A[SYNTHETIC] */
            @Override // com.sumsub.sns.internal.core.common.x0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.lang.CharSequence a(java.lang.String r7) {
                /*
                    r6 = this;
                    com.sumsub.sns.internal.core.a r0 = r6.f14960a
                    com.sumsub.sns.internal.core.data.source.dynamic.b r0 = r0.p()
                    kotlinx.coroutines.flow.StateFlow r0 = r0.b()
                    java.lang.Object r0 = r0.getValue()
                    com.sumsub.sns.internal.core.data.source.dynamic.b$a r0 = (com.sumsub.sns.internal.core.data.source.dynamic.b.a) r0
                    r1 = 0
                    if (r0 == 0) goto Lcd
                    com.sumsub.sns.internal.core.data.source.dynamic.e r0 = r0.i()
                    if (r0 == 0) goto Lcd
                    java.lang.Object r0 = r0.d()
                    com.sumsub.sns.internal.core.data.model.e r0 = (com.sumsub.sns.internal.core.data.model.e) r0
                    if (r0 == 0) goto Lcd
                    java.util.Map r0 = r0.C()
                    if (r0 == 0) goto L2e
                    java.lang.String r2 = "errorCodes"
                    java.lang.Object r0 = r0.get(r2)
                    goto L2f
                L2e:
                    r0 = r1
                L2f:
                    boolean r2 = r0 instanceof java.util.Map
                    if (r2 == 0) goto L36
                    java.util.Map r0 = (java.util.Map) r0
                    goto L37
                L36:
                    r0 = r1
                L37:
                    if (r0 == 0) goto L6e
                    java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
                    r2.<init>()
                    java.util.Set r0 = r0.entrySet()
                    java.util.Iterator r0 = r0.iterator()
                L46:
                    boolean r3 = r0.hasNext()
                    if (r3 == 0) goto L6f
                    java.lang.Object r3 = r0.next()
                    java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                    java.lang.Object r4 = r3.getKey()
                    boolean r4 = r4 instanceof java.lang.String
                    if (r4 == 0) goto L46
                    java.lang.Object r4 = r3.getValue()
                    boolean r4 = r4 instanceof java.lang.String
                    if (r4 == 0) goto L46
                    java.lang.Object r4 = r3.getKey()
                    java.lang.Object r3 = r3.getValue()
                    r2.put(r4, r3)
                    goto L46
                L6e:
                    r2 = r1
                L6f:
                    if (r2 == 0) goto L7a
                    boolean r0 = r2.isEmpty()
                    r3 = 1
                    r0 = r0 ^ r3
                    if (r0 != r3) goto L7a
                    goto L7b
                L7a:
                    r2 = r1
                L7b:
                    if (r2 == 0) goto Lc3
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    java.util.Set r2 = r2.entrySet()
                    java.util.Iterator r2 = r2.iterator()
                L8a:
                    boolean r3 = r2.hasNext()
                    if (r3 == 0) goto Lbe
                    java.lang.Object r3 = r2.next()
                    java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                    java.lang.Object r4 = r3.getKey()
                    boolean r5 = r4 instanceof java.lang.String
                    if (r5 != 0) goto L9f
                    r4 = r1
                L9f:
                    java.lang.String r4 = (java.lang.String) r4
                    if (r4 != 0) goto La4
                    goto Lb1
                La4:
                    java.lang.Object r3 = r3.getValue()
                    boolean r5 = r3 instanceof java.lang.String
                    if (r5 != 0) goto Lad
                    r3 = r1
                Lad:
                    java.lang.String r3 = (java.lang.String) r3
                    if (r3 != 0) goto Lb3
                Lb1:
                    r5 = r1
                    goto Lb8
                Lb3:
                    kotlin.Pair r5 = new kotlin.Pair
                    r5.<init>(r4, r3)
                Lb8:
                    if (r5 == 0) goto L8a
                    r0.add(r5)
                    goto L8a
                Lbe:
                    java.util.Map r0 = kotlin.collections.a.v(r0)
                    goto Lc4
                Lc3:
                    r0 = r1
                Lc4:
                    if (r0 == 0) goto Lcd
                    java.lang.Object r7 = r0.get(r7)
                    r1 = r7
                    java.lang.String r1 = (java.lang.String) r1
                Lcd:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.a.q.C0188a.a(java.lang.String):java.lang.CharSequence");
            }

            /* JADX WARN: Removed duplicated region for block: B:48:0x00ba A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:52:0x008a A[SYNTHETIC] */
            @Override // com.sumsub.sns.internal.core.common.x0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.util.Map<java.lang.String, java.lang.String> a() {
                /*
                    r6 = this;
                    com.sumsub.sns.internal.core.a r0 = r6.f14960a
                    com.sumsub.sns.internal.core.data.source.dynamic.b r0 = r0.p()
                    kotlinx.coroutines.flow.StateFlow r0 = r0.b()
                    java.lang.Object r0 = r0.getValue()
                    com.sumsub.sns.internal.core.data.source.dynamic.b$a r0 = (com.sumsub.sns.internal.core.data.source.dynamic.b.a) r0
                    if (r0 == 0) goto Lc4
                    com.sumsub.sns.internal.core.data.source.dynamic.e r0 = r0.i()
                    if (r0 == 0) goto Lc4
                    java.lang.Object r0 = r0.d()
                    com.sumsub.sns.internal.core.data.model.e r0 = (com.sumsub.sns.internal.core.data.model.e) r0
                    if (r0 == 0) goto Lc4
                    java.util.Map r0 = r0.C()
                    r1 = 0
                    if (r0 == 0) goto L2e
                    java.lang.String r2 = "errorCodes"
                    java.lang.Object r0 = r0.get(r2)
                    goto L2f
                L2e:
                    r0 = r1
                L2f:
                    boolean r2 = r0 instanceof java.util.Map
                    if (r2 == 0) goto L36
                    java.util.Map r0 = (java.util.Map) r0
                    goto L37
                L36:
                    r0 = r1
                L37:
                    if (r0 == 0) goto L6e
                    java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
                    r2.<init>()
                    java.util.Set r0 = r0.entrySet()
                    java.util.Iterator r0 = r0.iterator()
                L46:
                    boolean r3 = r0.hasNext()
                    if (r3 == 0) goto L6f
                    java.lang.Object r3 = r0.next()
                    java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                    java.lang.Object r4 = r3.getKey()
                    boolean r4 = r4 instanceof java.lang.String
                    if (r4 == 0) goto L46
                    java.lang.Object r4 = r3.getValue()
                    boolean r4 = r4 instanceof java.lang.String
                    if (r4 == 0) goto L46
                    java.lang.Object r4 = r3.getKey()
                    java.lang.Object r3 = r3.getValue()
                    r2.put(r4, r3)
                    goto L46
                L6e:
                    r2 = r1
                L6f:
                    if (r2 == 0) goto L7a
                    boolean r0 = r2.isEmpty()
                    r3 = 1
                    r0 = r0 ^ r3
                    if (r0 != r3) goto L7a
                    goto L7b
                L7a:
                    r2 = r1
                L7b:
                    if (r2 == 0) goto Lc2
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    java.util.Set r2 = r2.entrySet()
                    java.util.Iterator r2 = r2.iterator()
                L8a:
                    boolean r3 = r2.hasNext()
                    if (r3 == 0) goto Lbe
                    java.lang.Object r3 = r2.next()
                    java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                    java.lang.Object r4 = r3.getKey()
                    boolean r5 = r4 instanceof java.lang.String
                    if (r5 != 0) goto L9f
                    r4 = r1
                L9f:
                    java.lang.String r4 = (java.lang.String) r4
                    if (r4 != 0) goto La4
                    goto Lb1
                La4:
                    java.lang.Object r3 = r3.getValue()
                    boolean r5 = r3 instanceof java.lang.String
                    if (r5 != 0) goto Lad
                    r3 = r1
                Lad:
                    java.lang.String r3 = (java.lang.String) r3
                    if (r3 != 0) goto Lb3
                Lb1:
                    r5 = r1
                    goto Lb8
                Lb3:
                    kotlin.Pair r5 = new kotlin.Pair
                    r5.<init>(r4, r3)
                Lb8:
                    if (r5 == 0) goto L8a
                    r0.add(r5)
                    goto L8a
                Lbe:
                    java.util.Map r1 = kotlin.collections.a.v(r0)
                Lc2:
                    if (r1 != 0) goto Lc8
                Lc4:
                    java.util.Map r1 = kotlin.collections.a.p()
                Lc8:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.a.q.C0188a.a():java.util.Map");
            }
        }
    }

    public static final class r extends Lambda implements InterfaceC0635a<qb.r> {
        public r() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final qb.r invoke() {
            r.b bVar = new r.b();
            bVar.b(a.this.E().getUrl());
            va.h y10 = a.this.y();
            Objects.requireNonNull(y10, "client == null");
            bVar.f26079b = y10;
            bVar.f26082e.add(new com.sumsub.sns.internal.core.data.adapter.network.b(new C0189a(a.this)));
            AbstractC1244a t3 = a.this.t();
            Pattern pattern = okhttp3.i.f24542d;
            bVar.a(new I3.a(i.a.a("application/json"), new b.a(t3)));
            return bVar.c();
        }

        /* renamed from: com.sumsub.sns.internal.core.a$r$a, reason: collision with other inner class name */
        public static final class C0189a implements x0 {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a f14962a;

            public C0189a(a aVar) {
                this.f14962a = aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:48:0x00ba A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:52:0x008a A[SYNTHETIC] */
            @Override // com.sumsub.sns.internal.core.common.x0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.lang.CharSequence a(java.lang.String r7) {
                /*
                    r6 = this;
                    com.sumsub.sns.internal.core.a r0 = r6.f14962a
                    com.sumsub.sns.internal.core.data.source.dynamic.b r0 = r0.p()
                    kotlinx.coroutines.flow.StateFlow r0 = r0.b()
                    java.lang.Object r0 = r0.getValue()
                    com.sumsub.sns.internal.core.data.source.dynamic.b$a r0 = (com.sumsub.sns.internal.core.data.source.dynamic.b.a) r0
                    r1 = 0
                    if (r0 == 0) goto Lcd
                    com.sumsub.sns.internal.core.data.source.dynamic.e r0 = r0.i()
                    if (r0 == 0) goto Lcd
                    java.lang.Object r0 = r0.d()
                    com.sumsub.sns.internal.core.data.model.e r0 = (com.sumsub.sns.internal.core.data.model.e) r0
                    if (r0 == 0) goto Lcd
                    java.util.Map r0 = r0.C()
                    if (r0 == 0) goto L2e
                    java.lang.String r2 = "errorCodes"
                    java.lang.Object r0 = r0.get(r2)
                    goto L2f
                L2e:
                    r0 = r1
                L2f:
                    boolean r2 = r0 instanceof java.util.Map
                    if (r2 == 0) goto L36
                    java.util.Map r0 = (java.util.Map) r0
                    goto L37
                L36:
                    r0 = r1
                L37:
                    if (r0 == 0) goto L6e
                    java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
                    r2.<init>()
                    java.util.Set r0 = r0.entrySet()
                    java.util.Iterator r0 = r0.iterator()
                L46:
                    boolean r3 = r0.hasNext()
                    if (r3 == 0) goto L6f
                    java.lang.Object r3 = r0.next()
                    java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                    java.lang.Object r4 = r3.getKey()
                    boolean r4 = r4 instanceof java.lang.String
                    if (r4 == 0) goto L46
                    java.lang.Object r4 = r3.getValue()
                    boolean r4 = r4 instanceof java.lang.String
                    if (r4 == 0) goto L46
                    java.lang.Object r4 = r3.getKey()
                    java.lang.Object r3 = r3.getValue()
                    r2.put(r4, r3)
                    goto L46
                L6e:
                    r2 = r1
                L6f:
                    if (r2 == 0) goto L7a
                    boolean r0 = r2.isEmpty()
                    r3 = 1
                    r0 = r0 ^ r3
                    if (r0 != r3) goto L7a
                    goto L7b
                L7a:
                    r2 = r1
                L7b:
                    if (r2 == 0) goto Lc3
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    java.util.Set r2 = r2.entrySet()
                    java.util.Iterator r2 = r2.iterator()
                L8a:
                    boolean r3 = r2.hasNext()
                    if (r3 == 0) goto Lbe
                    java.lang.Object r3 = r2.next()
                    java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                    java.lang.Object r4 = r3.getKey()
                    boolean r5 = r4 instanceof java.lang.String
                    if (r5 != 0) goto L9f
                    r4 = r1
                L9f:
                    java.lang.String r4 = (java.lang.String) r4
                    if (r4 != 0) goto La4
                    goto Lb1
                La4:
                    java.lang.Object r3 = r3.getValue()
                    boolean r5 = r3 instanceof java.lang.String
                    if (r5 != 0) goto Lad
                    r3 = r1
                Lad:
                    java.lang.String r3 = (java.lang.String) r3
                    if (r3 != 0) goto Lb3
                Lb1:
                    r5 = r1
                    goto Lb8
                Lb3:
                    kotlin.Pair r5 = new kotlin.Pair
                    r5.<init>(r4, r3)
                Lb8:
                    if (r5 == 0) goto L8a
                    r0.add(r5)
                    goto L8a
                Lbe:
                    java.util.Map r0 = kotlin.collections.a.v(r0)
                    goto Lc4
                Lc3:
                    r0 = r1
                Lc4:
                    if (r0 == 0) goto Lcd
                    java.lang.Object r7 = r0.get(r7)
                    r1 = r7
                    java.lang.String r1 = (java.lang.String) r1
                Lcd:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.a.r.C0189a.a(java.lang.String):java.lang.CharSequence");
            }

            /* JADX WARN: Removed duplicated region for block: B:48:0x00ba A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:52:0x008a A[SYNTHETIC] */
            @Override // com.sumsub.sns.internal.core.common.x0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.util.Map<java.lang.String, java.lang.String> a() {
                /*
                    r6 = this;
                    com.sumsub.sns.internal.core.a r0 = r6.f14962a
                    com.sumsub.sns.internal.core.data.source.dynamic.b r0 = r0.p()
                    kotlinx.coroutines.flow.StateFlow r0 = r0.b()
                    java.lang.Object r0 = r0.getValue()
                    com.sumsub.sns.internal.core.data.source.dynamic.b$a r0 = (com.sumsub.sns.internal.core.data.source.dynamic.b.a) r0
                    if (r0 == 0) goto Lc4
                    com.sumsub.sns.internal.core.data.source.dynamic.e r0 = r0.i()
                    if (r0 == 0) goto Lc4
                    java.lang.Object r0 = r0.d()
                    com.sumsub.sns.internal.core.data.model.e r0 = (com.sumsub.sns.internal.core.data.model.e) r0
                    if (r0 == 0) goto Lc4
                    java.util.Map r0 = r0.C()
                    r1 = 0
                    if (r0 == 0) goto L2e
                    java.lang.String r2 = "errorCodes"
                    java.lang.Object r0 = r0.get(r2)
                    goto L2f
                L2e:
                    r0 = r1
                L2f:
                    boolean r2 = r0 instanceof java.util.Map
                    if (r2 == 0) goto L36
                    java.util.Map r0 = (java.util.Map) r0
                    goto L37
                L36:
                    r0 = r1
                L37:
                    if (r0 == 0) goto L6e
                    java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
                    r2.<init>()
                    java.util.Set r0 = r0.entrySet()
                    java.util.Iterator r0 = r0.iterator()
                L46:
                    boolean r3 = r0.hasNext()
                    if (r3 == 0) goto L6f
                    java.lang.Object r3 = r0.next()
                    java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                    java.lang.Object r4 = r3.getKey()
                    boolean r4 = r4 instanceof java.lang.String
                    if (r4 == 0) goto L46
                    java.lang.Object r4 = r3.getValue()
                    boolean r4 = r4 instanceof java.lang.String
                    if (r4 == 0) goto L46
                    java.lang.Object r4 = r3.getKey()
                    java.lang.Object r3 = r3.getValue()
                    r2.put(r4, r3)
                    goto L46
                L6e:
                    r2 = r1
                L6f:
                    if (r2 == 0) goto L7a
                    boolean r0 = r2.isEmpty()
                    r3 = 1
                    r0 = r0 ^ r3
                    if (r0 != r3) goto L7a
                    goto L7b
                L7a:
                    r2 = r1
                L7b:
                    if (r2 == 0) goto Lc2
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    java.util.Set r2 = r2.entrySet()
                    java.util.Iterator r2 = r2.iterator()
                L8a:
                    boolean r3 = r2.hasNext()
                    if (r3 == 0) goto Lbe
                    java.lang.Object r3 = r2.next()
                    java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                    java.lang.Object r4 = r3.getKey()
                    boolean r5 = r4 instanceof java.lang.String
                    if (r5 != 0) goto L9f
                    r4 = r1
                L9f:
                    java.lang.String r4 = (java.lang.String) r4
                    if (r4 != 0) goto La4
                    goto Lb1
                La4:
                    java.lang.Object r3 = r3.getValue()
                    boolean r5 = r3 instanceof java.lang.String
                    if (r5 != 0) goto Lad
                    r3 = r1
                Lad:
                    java.lang.String r3 = (java.lang.String) r3
                    if (r3 != 0) goto Lb3
                Lb1:
                    r5 = r1
                    goto Lb8
                Lb3:
                    kotlin.Pair r5 = new kotlin.Pair
                    r5.<init>(r4, r3)
                Lb8:
                    if (r5 == 0) goto L8a
                    r0.add(r5)
                    goto L8a
                Lbe:
                    java.util.Map r1 = kotlin.collections.a.v(r0)
                Lc2:
                    if (r1 != 0) goto Lc8
                Lc4:
                    java.util.Map r1 = kotlin.collections.a.p()
                Lc8:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.a.r.C0189a.a():java.util.Map");
            }
        }
    }
}

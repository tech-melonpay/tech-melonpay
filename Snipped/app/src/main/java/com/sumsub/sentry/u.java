package com.sumsub.sentry;

import ca.InterfaceC0635a;
import com.sumsub.sentry.b;
import com.sumsub.sentry.d;
import com.sumsub.sentry.q0;
import com.sumsub.sentry.s;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import na.InterfaceC1078b;
import na.InterfaceC1080d;
import qa.InterfaceC1143c;
import ra.C1169d;
import ra.K;

@InterfaceC1080d
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u0000 ]2\u00020\u0001:\u0001.B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B½\u0001\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0001\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0001\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\u0016\b\u0001\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0002\u0010\u001aJ\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0015¢\u0006\u0004\b \u0010!J\u0017\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b \u0010#J(\u0010 \u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'HÇ\u0001¢\u0006\u0004\b \u0010)R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010*\u0012\u0004\b-\u0010\u0003\u001a\u0004\b+\u0010,R*\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b.\u0010/\u0012\u0004\b3\u0010\u0003\u001a\u0004\b0\u00101\"\u0004\b \u00102R6\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b4\u00105\u0012\u0004\b9\u0010\u0003\u001a\u0004\b6\u00107\"\u0004\b.\u00108R*\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b+\u0010:\u0012\u0004\b>\u0010\u0003\u001a\u0004\b;\u0010<\"\u0004\b=\u0010#R*\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b?\u0010:\u0012\u0004\bA\u0010\u0003\u001a\u0004\b@\u0010<\"\u0004\b4\u0010#R*\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b=\u0010:\u0012\u0004\bC\u0010\u0003\u001a\u0004\bB\u0010<\"\u0004\b?\u0010#R*\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bD\u0010E\u0012\u0004\bI\u0010\u0003\u001a\u0004\bF\u0010G\"\u0004\b \u0010HR*\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b@\u0010:\u0012\u0004\bK\u0010\u0003\u001a\u0004\bJ\u0010<\"\u0004\bD\u0010#R*\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bL\u0010:\u0012\u0004\bM\u0010\u0003\u001a\u0004\b=\u0010<\"\u0004\b.\u0010#R0\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bN\u0010O\u0012\u0004\bR\u0010\u0003\u001a\u0004\b.\u0010P\"\u0004\b \u0010QR6\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bS\u00105\u0012\u0004\bT\u0010\u0003\u001a\u0004\bS\u00107\"\u0004\b \u00108R*\u0010Z\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bU\u0010V\u0012\u0004\bY\u0010\u0003\u001a\u0004\bW\u0010\u001d\"\u0004\b \u0010XR%\u0010\\\u001a\u00020[8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\bN\u0010<\"\u0004\b+\u0010#\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006^"}, d2 = {"Lcom/sumsub/sentry/u;", "", "<init>", "()V", "", "seen1", "Lcom/sumsub/sentry/d;", "contexts", "Lcom/sumsub/sentry/s;", "sdk", "", "", "tags", "release", "environment", "platform", "Lcom/sumsub/sentry/q0;", "user", "serverName", "dist", "", "Lcom/sumsub/sentry/b;", "breadcrumbs", "extra", "Lra/i0;", "serializationConstructorMarker", "(ILcom/sumsub/sentry/d;Lcom/sumsub/sentry/s;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sentry/q0;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Lra/i0;)V", "", "w", "()Ljava/lang/Throwable;", "breadcrumb", "LO9/p;", "a", "(Lcom/sumsub/sentry/b;)V", "message", "(Ljava/lang/String;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "(Lcom/sumsub/sentry/u;Lqa/c;Lpa/f;)V", "Lcom/sumsub/sentry/d;", "d", "()Lcom/sumsub/sentry/d;", "getContexts$annotations", "b", "Lcom/sumsub/sentry/s;", "q", "()Lcom/sumsub/sentry/s;", "(Lcom/sumsub/sentry/s;)V", "getSdk$annotations", "c", "Ljava/util/Map;", "u", "()Ljava/util/Map;", "(Ljava/util/Map;)V", "getTags$annotations", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "f", "getRelease$annotations", "e", "h", "getEnvironment$annotations", "m", "getPlatform$annotations", "g", "Lcom/sumsub/sentry/q0;", "z", "()Lcom/sumsub/sentry/q0;", "(Lcom/sumsub/sentry/q0;)V", "getUser$annotations", "s", "getServerName$annotations", "i", "getDist$annotations", "j", "Ljava/util/List;", "()Ljava/util/List;", "(Ljava/util/List;)V", "getBreadcrumbs$annotations", "k", "getExtra$annotations", "l", "Ljava/lang/Throwable;", "x", "(Ljava/lang/Throwable;)V", "getThrowableMechanism$annotations", "throwableMechanism", "Lcom/sumsub/sentry/d0;", "eventId", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class u {

    /* renamed from: m, reason: collision with root package name */
    public static final String f13785m = "java";

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final d contexts;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public s sdk;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public Map<String, String> tags;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public String release;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public String environment;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public String platform;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public q0 user;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public String serverName;

    /* renamed from: i, reason: from kotlin metadata */
    public String dist;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public List<b> breadcrumbs;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public Map<String, Object> extra;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public Throwable throwableMechanism;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: n, reason: collision with root package name */
    public static final O9.f<InterfaceC1078b<Object>> f13786n = kotlin.a.b(LazyThreadSafetyMode.f23086b, a.f13798a);

    public static final class a extends Lambda implements InterfaceC0635a<InterfaceC1078b<Object>> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13798a = new a();

        public a() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1078b<Object> invoke() {
            kotlinx.serialization.b bVar = new kotlinx.serialization.b(kotlin.jvm.internal.h.a(u.class));
            bVar.f23288b = Arrays.asList(new Annotation[0]);
            return bVar;
        }
    }

    /* renamed from: com.sumsub.sentry.u$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ O9.f a() {
            return u.f13786n;
        }

        public final InterfaceC1078b<u> serializer() {
            return (InterfaceC1078b) a().getValue();
        }

        public Companion() {
        }
    }

    public u() {
        this.contexts = new d();
        this.tags = new LinkedHashMap();
    }

    public static /* synthetic */ void c() {
    }

    public static /* synthetic */ void e() {
    }

    public static /* synthetic */ void g() {
    }

    public final void b(Map<String, String> map) {
        this.tags = map;
    }

    /* renamed from: d, reason: from getter */
    public final d getContexts() {
        return this.contexts;
    }

    public abstract void d(String str);

    public final void f(String str) {
        this.release = str;
    }

    /* renamed from: h, reason: from getter */
    public final String getEnvironment() {
        return this.environment;
    }

    /* renamed from: j */
    public abstract String getEventId();

    public final Map<String, Object> k() {
        return this.extra;
    }

    /* renamed from: m, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* renamed from: o, reason: from getter */
    public final String getRelease() {
        return this.release;
    }

    /* renamed from: q, reason: from getter */
    public final s getSdk() {
        return this.sdk;
    }

    /* renamed from: s, reason: from getter */
    public final String getServerName() {
        return this.serverName;
    }

    public final Map<String, String> u() {
        return this.tags;
    }

    public final Throwable w() {
        Throwable c2;
        Throwable th = this.throwableMechanism;
        i iVar = th instanceof i ? (i) th : null;
        return (iVar == null || (c2 = iVar.c()) == null) ? th : c2;
    }

    /* renamed from: x, reason: from getter */
    public final Throwable getThrowableMechanism() {
        return this.throwableMechanism;
    }

    /* renamed from: z, reason: from getter */
    public final q0 getUser() {
        return this.user;
    }

    public static final void a(u self, InterfaceC1143c output, pa.f serialDesc) {
        if (output.D() || !kotlin.jvm.internal.f.b(self.contexts, new d())) {
            output.C(serialDesc, 0, d.b.f13605a, self.contexts);
        }
        if (output.D() || self.sdk != null) {
            output.e(serialDesc, 1, s.a.f13780a, self.sdk);
        }
        if (output.D() || !kotlin.jvm.internal.f.b(self.tags, new LinkedHashMap())) {
            ra.m0 m0Var = ra.m0.f26414a;
            output.e(serialDesc, 2, new K(m0Var, m0Var), self.tags);
        }
        if (output.D() || self.release != null) {
            output.e(serialDesc, 3, ra.m0.f26414a, self.release);
        }
        if (output.D() || self.environment != null) {
            output.e(serialDesc, 4, ra.m0.f26414a, self.environment);
        }
        if (output.D() || self.platform != null) {
            output.e(serialDesc, 5, ra.m0.f26414a, self.platform);
        }
        if (output.D() || self.user != null) {
            output.e(serialDesc, 6, q0.a.f13768a, self.user);
        }
        if (output.D() || self.serverName != null) {
            output.e(serialDesc, 7, ra.m0.f26414a, self.serverName);
        }
        if (output.D() || self.dist != null) {
            output.e(serialDesc, 8, ra.m0.f26414a, self.dist);
        }
        if (output.D() || self.breadcrumbs != null) {
            output.e(serialDesc, 9, new C1169d(b.a.f13588a, 0), self.breadcrumbs);
        }
        if (!output.D() && self.extra == null) {
            return;
        }
        output.e(serialDesc, 10, new K(ra.m0.f26414a, new kotlinx.serialization.a(kotlin.jvm.internal.h.a(Object.class), new InterfaceC1078b[0])), self.extra);
    }

    public final void b(String str) {
        this.dist = str;
    }

    public final void c(String str) {
        this.environment = str;
    }

    public final void e(String str) {
        this.platform = str;
    }

    /* renamed from: f, reason: from getter */
    public final String getDist() {
        return this.dist;
    }

    public final void g(String str) {
        this.serverName = str;
    }

    public final List<b> b() {
        return this.breadcrumbs;
    }

    public /* synthetic */ u(int i, d dVar, s sVar, Map map, String str, String str2, String str3, q0 q0Var, String str4, String str5, List list, Map map2, ra.i0 i0Var) {
        this.contexts = (i & 1) == 0 ? new d() : dVar;
        if ((i & 2) == 0) {
            this.sdk = null;
        } else {
            this.sdk = sVar;
        }
        if ((i & 4) == 0) {
            this.tags = new LinkedHashMap();
        } else {
            this.tags = map;
        }
        if ((i & 8) == 0) {
            this.release = null;
        } else {
            this.release = str;
        }
        if ((i & 16) == 0) {
            this.environment = null;
        } else {
            this.environment = str2;
        }
        if ((i & 32) == 0) {
            this.platform = null;
        } else {
            this.platform = str3;
        }
        if ((i & 64) == 0) {
            this.user = null;
        } else {
            this.user = q0Var;
        }
        if ((i & 128) == 0) {
            this.serverName = null;
        } else {
            this.serverName = str4;
        }
        if ((i & 256) == 0) {
            this.dist = null;
        } else {
            this.dist = str5;
        }
        if ((i & 512) == 0) {
            this.breadcrumbs = null;
        } else {
            this.breadcrumbs = list;
        }
        if ((i & 1024) == 0) {
            this.extra = null;
        } else {
            this.extra = map2;
        }
        this.throwableMechanism = null;
    }

    public final void a(s sVar) {
        this.sdk = sVar;
    }

    public final void a(q0 q0Var) {
        this.user = q0Var;
    }

    public final void a(List<b> list) {
        this.breadcrumbs = list;
    }

    public final void a(Map<String, Object> map) {
        this.extra = map;
    }

    public final void a(Throwable th) {
        this.throwableMechanism = th;
    }

    public final void a(b breadcrumb) {
        if (this.breadcrumbs == null) {
            this.breadcrumbs = new ArrayList();
        }
        List<b> list = this.breadcrumbs;
        if (list != null) {
            list.add(breadcrumb);
        }
    }

    public final void a(String message) {
        a(new b((Date) null, message, (String) null, (Map) null, (String) null, (SentryLevel) null, 61, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ void A() {
    }

    public static /* synthetic */ void i() {
    }

    public static /* synthetic */ void l() {
    }

    public static /* synthetic */ void n() {
    }

    public static /* synthetic */ void p() {
    }

    public static /* synthetic */ void r() {
    }

    public static /* synthetic */ void t() {
    }

    public static /* synthetic */ void v() {
    }

    public static /* synthetic */ void y() {
    }
}

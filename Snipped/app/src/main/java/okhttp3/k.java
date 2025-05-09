package okhttp3;

import java.util.LinkedHashMap;
import java.util.Map;
import ka.C0967l;
import kotlin.Pair;
import okhttp3.g;
import okhttp3.h;

/* compiled from: Request.kt */
/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final h f24644a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24645b;

    /* renamed from: c, reason: collision with root package name */
    public final g f24646c;

    /* renamed from: d, reason: collision with root package name */
    public final o f24647d;

    /* renamed from: e, reason: collision with root package name */
    public final Map<Class<?>, Object> f24648e;

    /* renamed from: f, reason: collision with root package name */
    public c f24649f;

    /* compiled from: Request.kt */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public h f24650a;

        /* renamed from: d, reason: collision with root package name */
        public o f24653d;

        /* renamed from: e, reason: collision with root package name */
        public LinkedHashMap f24654e = new LinkedHashMap();

        /* renamed from: b, reason: collision with root package name */
        public String f24651b = "GET";

        /* renamed from: c, reason: collision with root package name */
        public g.a f24652c = new g.a();

        public final void a(String str, String str2) {
            this.f24652c.a(str, str2);
        }

        public final k b() {
            h hVar = this.f24650a;
            if (hVar != null) {
                return new k(hVar, this.f24651b, this.f24652c.d(), this.f24653d, wa.b.x(this.f24654e));
            }
            throw new IllegalStateException("url == null".toString());
        }

        public final void c(String str, String str2) {
            this.f24652c.g(str, str2);
        }

        public final void d(String str, o oVar) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true".toString());
            }
            if (oVar == null) {
                if (!(!(kotlin.jvm.internal.f.b(str, "POST") || kotlin.jvm.internal.f.b(str, "PUT") || kotlin.jvm.internal.f.b(str, "PATCH") || kotlin.jvm.internal.f.b(str, "PROPPATCH") || kotlin.jvm.internal.f.b(str, "REPORT")))) {
                    throw new IllegalArgumentException(androidx.camera.core.n.a("method ", str, " must have a request body.").toString());
                }
            } else if (!D9.b.p0(str)) {
                throw new IllegalArgumentException(androidx.camera.core.n.a("method ", str, " must not have a request body.").toString());
            }
            this.f24651b = str;
            this.f24653d = oVar;
        }

        public final void e(String str) {
            this.f24652c.f(str);
        }

        public final void f(Class cls, Object obj) {
            if (obj == null) {
                this.f24654e.remove(cls);
                return;
            }
            if (this.f24654e.isEmpty()) {
                this.f24654e = new LinkedHashMap();
            }
            this.f24654e.put(cls, cls.cast(obj));
        }

        public final void g(String str) {
            if (C0967l.V(0, 0, 3, str, "ws:", true)) {
                str = "http:".concat(str.substring(3));
            } else if (C0967l.V(0, 0, 4, str, "wss:", true)) {
                str = "https:".concat(str.substring(4));
            }
            h.a aVar = new h.a();
            aVar.d(null, str);
            this.f24650a = aVar.a();
        }
    }

    public k(h hVar, String str, g gVar, o oVar, Map<Class<?>, ? extends Object> map) {
        this.f24644a = hVar;
        this.f24645b = str;
        this.f24646c = gVar;
        this.f24647d = oVar;
        this.f24648e = map;
    }

    public final a a() {
        a aVar = new a();
        aVar.f24654e = new LinkedHashMap();
        aVar.f24650a = this.f24644a;
        aVar.f24651b = this.f24645b;
        aVar.f24653d = this.f24647d;
        Map<Class<?>, Object> map = this.f24648e;
        aVar.f24654e = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        aVar.f24652c = this.f24646c.e();
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Request{method=");
        sb2.append(this.f24645b);
        sb2.append(", url=");
        sb2.append(this.f24644a);
        g gVar = this.f24646c;
        if (gVar.size() != 0) {
            sb2.append(", headers=[");
            int i = 0;
            for (Pair<? extends String, ? extends String> pair : gVar) {
                int i9 = i + 1;
                if (i < 0) {
                    P9.m.t();
                    throw null;
                }
                Pair<? extends String, ? extends String> pair2 = pair;
                String str = (String) pair2.f23089a;
                String str2 = (String) pair2.f23090b;
                if (i > 0) {
                    sb2.append(", ");
                }
                sb2.append(str);
                sb2.append(':');
                sb2.append(str2);
                i = i9;
            }
            sb2.append(']');
        }
        Map<Class<?>, Object> map = this.f24648e;
        if (!map.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(map);
        }
        sb2.append('}');
        return sb2.toString();
    }
}

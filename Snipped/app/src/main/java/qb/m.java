package qb;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import okhttp3.g;
import okhttp3.j;
import qb.a;

/* compiled from: ParameterHandler.java */
/* loaded from: classes3.dex */
public abstract class m<T> {

    /* compiled from: ParameterHandler.java */
    public static final class a<T> extends m<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f25974a;

        /* renamed from: b, reason: collision with root package name */
        public final int f25975b;

        /* renamed from: c, reason: collision with root package name */
        public final qb.f<T, okhttp3.o> f25976c;

        public a(Method method, int i, qb.f<T, okhttp3.o> fVar) {
            this.f25974a = method;
            this.f25975b = i;
            this.f25976c = fVar;
        }

        @Override // qb.m
        public final void a(qb.o oVar, T t3) {
            int i = this.f25975b;
            Method method = this.f25974a;
            if (t3 == null) {
                throw retrofit2.b.j(method, i, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                oVar.f26028k = this.f25976c.b(t3);
            } catch (IOException e10) {
                throw retrofit2.b.k(method, e10, i, "Unable to convert " + t3 + " to RequestBody", new Object[0]);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    public static final class b<T> extends m<T> {

        /* renamed from: a, reason: collision with root package name */
        public final String f25977a;

        /* renamed from: b, reason: collision with root package name */
        public final qb.f<T, String> f25978b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f25979c;

        public b(String str, boolean z10) {
            a.d dVar = a.d.f25934a;
            Objects.requireNonNull(str, "name == null");
            this.f25977a = str;
            this.f25978b = dVar;
            this.f25979c = z10;
        }

        @Override // qb.m
        public final void a(qb.o oVar, T t3) {
            String b9;
            if (t3 == null || (b9 = this.f25978b.b(t3)) == null) {
                return;
            }
            oVar.a(this.f25977a, b9, this.f25979c);
        }
    }

    /* compiled from: ParameterHandler.java */
    public static final class c<T> extends m<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f25980a;

        /* renamed from: b, reason: collision with root package name */
        public final int f25981b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f25982c;

        public c(Method method, int i, boolean z10) {
            this.f25980a = method;
            this.f25981b = i;
            this.f25982c = z10;
        }

        @Override // qb.m
        public final void a(qb.o oVar, Object obj) {
            Map map = (Map) obj;
            int i = this.f25981b;
            Method method = this.f25980a;
            if (map == null) {
                throw retrofit2.b.j(method, i, "Field map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw retrofit2.b.j(method, i, "Field map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw retrofit2.b.j(method, i, androidx.camera.core.n.a("Field map contained null value for key '", str, "'."), new Object[0]);
                }
                String obj2 = value.toString();
                if (obj2 == null) {
                    throw retrofit2.b.j(method, i, "Field map value '" + value + "' converted to null by " + a.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                }
                oVar.a(str, obj2, this.f25982c);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    public static final class d<T> extends m<T> {

        /* renamed from: a, reason: collision with root package name */
        public final String f25983a;

        /* renamed from: b, reason: collision with root package name */
        public final qb.f<T, String> f25984b;

        public d(String str) {
            a.d dVar = a.d.f25934a;
            Objects.requireNonNull(str, "name == null");
            this.f25983a = str;
            this.f25984b = dVar;
        }

        @Override // qb.m
        public final void a(qb.o oVar, T t3) {
            String b9;
            if (t3 == null || (b9 = this.f25984b.b(t3)) == null) {
                return;
            }
            oVar.b(this.f25983a, b9);
        }
    }

    /* compiled from: ParameterHandler.java */
    public static final class e<T> extends m<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f25985a;

        /* renamed from: b, reason: collision with root package name */
        public final int f25986b;

        public e(int i, Method method) {
            this.f25985a = method;
            this.f25986b = i;
        }

        @Override // qb.m
        public final void a(qb.o oVar, Object obj) {
            Map map = (Map) obj;
            int i = this.f25986b;
            Method method = this.f25985a;
            if (map == null) {
                throw retrofit2.b.j(method, i, "Header map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw retrofit2.b.j(method, i, "Header map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw retrofit2.b.j(method, i, androidx.camera.core.n.a("Header map contained null value for key '", str, "'."), new Object[0]);
                }
                oVar.b(str, value.toString());
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    public static final class f extends m<okhttp3.g> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f25987a;

        /* renamed from: b, reason: collision with root package name */
        public final int f25988b;

        public f(int i, Method method) {
            this.f25987a = method;
            this.f25988b = i;
        }

        @Override // qb.m
        public final void a(qb.o oVar, okhttp3.g gVar) {
            okhttp3.g gVar2 = gVar;
            if (gVar2 == null) {
                int i = this.f25988b;
                throw retrofit2.b.j(this.f25987a, i, "Headers parameter must not be null.", new Object[0]);
            }
            g.a aVar = oVar.f26024f;
            aVar.getClass();
            int size = gVar2.size();
            for (int i9 = 0; i9 < size; i9++) {
                aVar.c(gVar2.c(i9), gVar2.f(i9));
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    public static final class g<T> extends m<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f25989a;

        /* renamed from: b, reason: collision with root package name */
        public final int f25990b;

        /* renamed from: c, reason: collision with root package name */
        public final okhttp3.g f25991c;

        /* renamed from: d, reason: collision with root package name */
        public final qb.f<T, okhttp3.o> f25992d;

        public g(Method method, int i, okhttp3.g gVar, qb.f<T, okhttp3.o> fVar) {
            this.f25989a = method;
            this.f25990b = i;
            this.f25991c = gVar;
            this.f25992d = fVar;
        }

        @Override // qb.m
        public final void a(qb.o oVar, T t3) {
            if (t3 == null) {
                return;
            }
            try {
                oVar.c(this.f25991c, this.f25992d.b(t3));
            } catch (IOException e10) {
                throw retrofit2.b.j(this.f25989a, this.f25990b, "Unable to convert " + t3 + " to RequestBody", e10);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    public static final class h<T> extends m<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f25993a;

        /* renamed from: b, reason: collision with root package name */
        public final int f25994b;

        /* renamed from: c, reason: collision with root package name */
        public final qb.f<T, okhttp3.o> f25995c;

        /* renamed from: d, reason: collision with root package name */
        public final String f25996d;

        public h(Method method, int i, qb.f<T, okhttp3.o> fVar, String str) {
            this.f25993a = method;
            this.f25994b = i;
            this.f25995c = fVar;
            this.f25996d = str;
        }

        @Override // qb.m
        public final void a(qb.o oVar, Object obj) {
            Map map = (Map) obj;
            int i = this.f25994b;
            Method method = this.f25993a;
            if (map == null) {
                throw retrofit2.b.j(method, i, "Part map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw retrofit2.b.j(method, i, "Part map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw retrofit2.b.j(method, i, androidx.camera.core.n.a("Part map contained null value for key '", str, "'."), new Object[0]);
                }
                oVar.c(g.b.c("Content-Disposition", androidx.camera.core.n.a("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", this.f25996d), (okhttp3.o) this.f25995c.b(value));
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    public static final class i<T> extends m<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f25997a;

        /* renamed from: b, reason: collision with root package name */
        public final int f25998b;

        /* renamed from: c, reason: collision with root package name */
        public final String f25999c;

        /* renamed from: d, reason: collision with root package name */
        public final qb.f<T, String> f26000d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f26001e;

        public i(Method method, int i, String str, boolean z10) {
            a.d dVar = a.d.f25934a;
            this.f25997a = method;
            this.f25998b = i;
            Objects.requireNonNull(str, "name == null");
            this.f25999c = str;
            this.f26000d = dVar;
            this.f26001e = z10;
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00ea  */
        @Override // qb.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(qb.o r18, T r19) {
            /*
                Method dump skipped, instructions count: 271
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: qb.m.i.a(qb.o, java.lang.Object):void");
        }
    }

    /* compiled from: ParameterHandler.java */
    public static final class j<T> extends m<T> {

        /* renamed from: a, reason: collision with root package name */
        public final String f26002a;

        /* renamed from: b, reason: collision with root package name */
        public final qb.f<T, String> f26003b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f26004c;

        public j(String str, boolean z10) {
            a.d dVar = a.d.f25934a;
            Objects.requireNonNull(str, "name == null");
            this.f26002a = str;
            this.f26003b = dVar;
            this.f26004c = z10;
        }

        @Override // qb.m
        public final void a(qb.o oVar, T t3) {
            String b9;
            if (t3 == null || (b9 = this.f26003b.b(t3)) == null) {
                return;
            }
            oVar.d(this.f26002a, b9, this.f26004c);
        }
    }

    /* compiled from: ParameterHandler.java */
    public static final class k<T> extends m<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f26005a;

        /* renamed from: b, reason: collision with root package name */
        public final int f26006b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f26007c;

        public k(Method method, int i, boolean z10) {
            this.f26005a = method;
            this.f26006b = i;
            this.f26007c = z10;
        }

        @Override // qb.m
        public final void a(qb.o oVar, Object obj) {
            Map map = (Map) obj;
            int i = this.f26006b;
            Method method = this.f26005a;
            if (map == null) {
                throw retrofit2.b.j(method, i, "Query map was null", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw retrofit2.b.j(method, i, "Query map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw retrofit2.b.j(method, i, androidx.camera.core.n.a("Query map contained null value for key '", str, "'."), new Object[0]);
                }
                String obj2 = value.toString();
                if (obj2 == null) {
                    throw retrofit2.b.j(method, i, "Query map value '" + value + "' converted to null by " + a.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                }
                oVar.d(str, obj2, this.f26007c);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    public static final class l<T> extends m<T> {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f26008a;

        public l(boolean z10) {
            this.f26008a = z10;
        }

        @Override // qb.m
        public final void a(qb.o oVar, T t3) {
            if (t3 == null) {
                return;
            }
            oVar.d(t3.toString(), null, this.f26008a);
        }
    }

    /* compiled from: ParameterHandler.java */
    /* renamed from: qb.m$m, reason: collision with other inner class name */
    public static final class C0461m extends m<j.c> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0461m f26009a = new C0461m();

        @Override // qb.m
        public final void a(qb.o oVar, j.c cVar) {
            j.c cVar2 = cVar;
            if (cVar2 != null) {
                oVar.i.f24641c.add(cVar2);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    public static final class n extends m<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f26010a;

        /* renamed from: b, reason: collision with root package name */
        public final int f26011b;

        public n(int i, Method method) {
            this.f26010a = method;
            this.f26011b = i;
        }

        @Override // qb.m
        public final void a(qb.o oVar, Object obj) {
            if (obj != null) {
                oVar.f26021c = obj.toString();
            } else {
                int i = this.f26011b;
                throw retrofit2.b.j(this.f26010a, i, "@Url parameter is null.", new Object[0]);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    public static final class o<T> extends m<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<T> f26012a;

        public o(Class<T> cls) {
            this.f26012a = cls;
        }

        @Override // qb.m
        public final void a(qb.o oVar, T t3) {
            oVar.f26023e.f(this.f26012a, t3);
        }
    }

    public abstract void a(qb.o oVar, T t3);
}

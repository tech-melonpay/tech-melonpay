package qb;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: RequestFactory.java */
/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Method f26031a;

    /* renamed from: b, reason: collision with root package name */
    public final okhttp3.h f26032b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26033c;

    /* renamed from: d, reason: collision with root package name */
    public final String f26034d;

    /* renamed from: e, reason: collision with root package name */
    public final okhttp3.g f26035e;

    /* renamed from: f, reason: collision with root package name */
    public final okhttp3.i f26036f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f26037g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f26038h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final m<?>[] f26039j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f26040k;

    /* compiled from: RequestFactory.java */
    public static final class a {

        /* renamed from: x, reason: collision with root package name */
        public static final Pattern f26041x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: y, reason: collision with root package name */
        public static final Pattern f26042y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a, reason: collision with root package name */
        public final r f26043a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f26044b;

        /* renamed from: c, reason: collision with root package name */
        public final Annotation[] f26045c;

        /* renamed from: d, reason: collision with root package name */
        public final Annotation[][] f26046d;

        /* renamed from: e, reason: collision with root package name */
        public final Type[] f26047e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f26048f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f26049g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f26050h;
        public boolean i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f26051j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f26052k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f26053l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f26054m;

        /* renamed from: n, reason: collision with root package name */
        public String f26055n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f26056o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f26057p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f26058q;

        /* renamed from: r, reason: collision with root package name */
        public String f26059r;

        /* renamed from: s, reason: collision with root package name */
        public okhttp3.g f26060s;

        /* renamed from: t, reason: collision with root package name */
        public okhttp3.i f26061t;

        /* renamed from: u, reason: collision with root package name */
        public LinkedHashSet f26062u;

        /* renamed from: v, reason: collision with root package name */
        public m<?>[] f26063v;

        /* renamed from: w, reason: collision with root package name */
        public boolean f26064w;

        public a(r rVar, Method method) {
            this.f26043a = rVar;
            this.f26044b = method;
            this.f26045c = method.getAnnotations();
            this.f26047e = method.getGenericParameterTypes();
            this.f26046d = method.getParameterAnnotations();
        }

        public static Class<?> a(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        public final void b(String str, String str2, boolean z10) {
            String str3 = this.f26055n;
            Method method = this.f26044b;
            if (str3 != null) {
                throw retrofit2.b.i(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f26055n = str;
            this.f26056o = z10;
            if (str2.isEmpty()) {
                return;
            }
            int indexOf = str2.indexOf(63);
            Pattern pattern = f26041x;
            if (indexOf != -1 && indexOf < str2.length() - 1) {
                String substring = str2.substring(indexOf + 1);
                if (pattern.matcher(substring).find()) {
                    throw retrofit2.b.i(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                }
            }
            this.f26059r = str2;
            Matcher matcher = pattern.matcher(str2);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            this.f26062u = linkedHashSet;
        }

        public final void c(int i, Type type) {
            if (retrofit2.b.g(type)) {
                throw retrofit2.b.j(this.f26044b, i, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public p(a aVar) {
        this.f26031a = aVar.f26044b;
        this.f26032b = aVar.f26043a.f26070c;
        this.f26033c = aVar.f26055n;
        this.f26034d = aVar.f26059r;
        this.f26035e = aVar.f26060s;
        this.f26036f = aVar.f26061t;
        this.f26037g = aVar.f26056o;
        this.f26038h = aVar.f26057p;
        this.i = aVar.f26058q;
        this.f26039j = aVar.f26063v;
        this.f26040k = aVar.f26064w;
    }
}

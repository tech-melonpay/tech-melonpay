package j2;

import j2.C0882a;
import java.util.HashMap;
import java.util.Map;

/* compiled from: EventInternal.java */
/* renamed from: j2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0888g {

    /* compiled from: EventInternal.java */
    /* renamed from: j2.g$a */
    public static abstract class a {
        public final void a(String str, String str2) {
            Map<String, String> map = ((C0882a.C0415a) this).f22420f;
            if (map == null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            map.put(str, str2);
        }
    }

    public final String a(String str) {
        String str2 = b().get(str);
        return str2 == null ? "" : str2;
    }

    public abstract Map<String, String> b();

    public abstract Integer c();

    public abstract C0887f d();

    public abstract long e();

    public final int f(String str) {
        String str2 = b().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public abstract String g();

    public abstract long h();

    public final C0882a.C0415a i() {
        C0882a.C0415a c0415a = new C0882a.C0415a();
        String g10 = g();
        if (g10 == null) {
            throw new NullPointerException("Null transportName");
        }
        c0415a.f22415a = g10;
        c0415a.f22416b = c();
        C0887f d10 = d();
        if (d10 == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        c0415a.f22417c = d10;
        c0415a.f22418d = Long.valueOf(e());
        c0415a.f22419e = Long.valueOf(h());
        c0415a.f22420f = new HashMap(b());
        return c0415a;
    }
}

package q3;

import java.sql.Date;
import java.sql.Timestamp;
import n3.c;
import q3.C1130a;
import q3.C1131b;
import q3.c;

/* compiled from: SqlTypesSupport.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f25861a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f25862b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f25863c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1130a.C0458a f25864d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1131b.a f25865e;

    /* renamed from: f, reason: collision with root package name */
    public static final c.a f25866f;

    /* compiled from: SqlTypesSupport.java */
    public class a extends c.b<Date> {
        @Override // n3.c.b
        public final Date a(java.util.Date date) {
            return new Date(date.getTime());
        }
    }

    /* compiled from: SqlTypesSupport.java */
    public class b extends c.b<Timestamp> {
        @Override // n3.c.b
        public final Timestamp a(java.util.Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f25861a = z10;
        if (z10) {
            f25862b = new a(Date.class);
            f25863c = new b(Timestamp.class);
            f25864d = C1130a.f25855b;
            f25865e = C1131b.f25857b;
            f25866f = c.f25859b;
            return;
        }
        f25862b = null;
        f25863c = null;
        f25864d = null;
        f25865e = null;
        f25866f = null;
    }
}

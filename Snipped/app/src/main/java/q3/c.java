package q3;

import com.google.gson.g;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import java.sql.Timestamp;
import java.util.Date;
import r3.C1149a;

/* compiled from: SqlTimestampTypeAdapter.java */
/* loaded from: classes.dex */
public final class c extends r<Timestamp> {

    /* renamed from: b, reason: collision with root package name */
    public static final a f25859b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final r<Date> f25860a;

    /* compiled from: SqlTimestampTypeAdapter.java */
    public class a implements s {
        @Override // com.google.gson.s
        public final <T> r<T> a(g gVar, TypeToken<T> typeToken) {
            if (typeToken.getRawType() != Timestamp.class) {
                return null;
            }
            gVar.getClass();
            return new c(gVar.d(TypeToken.get(Date.class)));
        }
    }

    public c(r rVar) {
        this.f25860a = rVar;
    }

    @Override // com.google.gson.r
    public final Timestamp a(C1149a c1149a) {
        Date a10 = this.f25860a.a(c1149a);
        if (a10 != null) {
            return new Timestamp(a10.getTime());
        }
        return null;
    }

    @Override // com.google.gson.r
    public final void b(r3.b bVar, Timestamp timestamp) {
        this.f25860a.b(bVar, timestamp);
    }
}

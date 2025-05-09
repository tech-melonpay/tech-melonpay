package q3;

import com.google.gson.JsonSyntaxException;
import com.google.gson.g;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.google.gson.stream.JsonToken;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import r3.C1149a;

/* compiled from: SqlDateTypeAdapter.java */
/* renamed from: q3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1130a extends r<Date> {

    /* renamed from: b, reason: collision with root package name */
    public static final C0458a f25855b = new C0458a();

    /* renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f25856a;

    /* compiled from: SqlDateTypeAdapter.java */
    /* renamed from: q3.a$a, reason: collision with other inner class name */
    public class C0458a implements s {
        @Override // com.google.gson.s
        public final <T> r<T> a(g gVar, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new C1130a(0);
            }
            return null;
        }
    }

    public /* synthetic */ C1130a(int i) {
        this();
    }

    @Override // com.google.gson.r
    public final Date a(C1149a c1149a) {
        Date date;
        if (c1149a.k0() == JsonToken.i) {
            c1149a.Y();
            return null;
        }
        String d02 = c1149a.d0();
        synchronized (this) {
            TimeZone timeZone = this.f25856a.getTimeZone();
            try {
                try {
                    date = new Date(this.f25856a.parse(d02).getTime());
                } catch (ParseException e10) {
                    throw new JsonSyntaxException("Failed parsing '" + d02 + "' as SQL Date; at path " + c1149a.E(), e10);
                }
            } finally {
                this.f25856a.setTimeZone(timeZone);
            }
        }
        return date;
    }

    @Override // com.google.gson.r
    public final void b(r3.b bVar, Date date) {
        String format;
        Date date2 = date;
        if (date2 == null) {
            bVar.E();
            return;
        }
        synchronized (this) {
            format = this.f25856a.format((java.util.Date) date2);
        }
        bVar.W(format);
    }

    private C1130a() {
        this.f25856a = new SimpleDateFormat("MMM d, yyyy");
    }
}

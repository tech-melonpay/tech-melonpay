package q3;

import com.google.gson.JsonSyntaxException;
import com.google.gson.g;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.google.gson.stream.JsonToken;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import r3.C1149a;

/* compiled from: SqlTimeTypeAdapter.java */
/* renamed from: q3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1131b extends r<Time> {

    /* renamed from: b, reason: collision with root package name */
    public static final a f25857b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f25858a;

    /* compiled from: SqlTimeTypeAdapter.java */
    /* renamed from: q3.b$a */
    public class a implements s {
        @Override // com.google.gson.s
        public final <T> r<T> a(g gVar, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Time.class) {
                return new C1131b(0);
            }
            return null;
        }
    }

    public /* synthetic */ C1131b(int i) {
        this();
    }

    @Override // com.google.gson.r
    public final Time a(C1149a c1149a) {
        Time time;
        if (c1149a.k0() == JsonToken.i) {
            c1149a.Y();
            return null;
        }
        String d02 = c1149a.d0();
        synchronized (this) {
            TimeZone timeZone = this.f25858a.getTimeZone();
            try {
                try {
                    time = new Time(this.f25858a.parse(d02).getTime());
                } catch (ParseException e10) {
                    throw new JsonSyntaxException("Failed parsing '" + d02 + "' as SQL Time; at path " + c1149a.E(), e10);
                }
            } finally {
                this.f25858a.setTimeZone(timeZone);
            }
        }
        return time;
    }

    @Override // com.google.gson.r
    public final void b(r3.b bVar, Time time) {
        String format;
        Time time2 = time;
        if (time2 == null) {
            bVar.E();
            return;
        }
        synchronized (this) {
            format = this.f25858a.format((Date) time2);
        }
        bVar.W(format);
    }

    private C1131b() {
        this.f25858a = new SimpleDateFormat("hh:mm:ss a");
    }
}

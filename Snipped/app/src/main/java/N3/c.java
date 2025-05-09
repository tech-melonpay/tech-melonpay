package n3;

import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonToken;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import o3.C1088a;
import r3.C1149a;

/* compiled from: DefaultDateTypeAdapter.java */
/* loaded from: classes.dex */
public final class c<T extends Date> extends com.google.gson.r<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final a f24104c = new a();

    /* renamed from: a, reason: collision with root package name */
    public final b<T> f24105a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f24106b;

    /* compiled from: DefaultDateTypeAdapter.java */
    public class a implements com.google.gson.s {
        @Override // com.google.gson.s
        public final <T> com.google.gson.r<T> a(com.google.gson.g gVar, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new c(b.f24107b, 2, 2);
            }
            return null;
        }

        public final String toString() {
            return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
        }
    }

    public c(b bVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.f24106b = arrayList;
        Objects.requireNonNull(bVar);
        this.f24105a = bVar;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    @Override // com.google.gson.r
    public final Object a(C1149a c1149a) {
        Date b9;
        if (c1149a.k0() == JsonToken.i) {
            c1149a.Y();
            return null;
        }
        String d02 = c1149a.d0();
        synchronized (this.f24106b) {
            try {
                Iterator it = this.f24106b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        try {
                            b9 = C1088a.b(d02, new ParsePosition(0));
                            break;
                        } catch (ParseException e10) {
                            StringBuilder m2 = com.google.android.gms.measurement.internal.a.m("Failed parsing '", d02, "' as Date; at path ");
                            m2.append(c1149a.E());
                            throw new JsonSyntaxException(m2.toString(), e10);
                        }
                    }
                    DateFormat dateFormat = (DateFormat) it.next();
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            b9 = dateFormat.parse(d02);
                            break;
                        } catch (ParseException unused) {
                            dateFormat.setTimeZone(timeZone);
                        }
                    } finally {
                        dateFormat.setTimeZone(timeZone);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f24105a.a(b9);
    }

    @Override // com.google.gson.r
    public final void b(r3.b bVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            bVar.E();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f24106b.get(0);
        synchronized (this.f24106b) {
            format = dateFormat.format(date);
        }
        bVar.W(format);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f24106b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    public c(b bVar, int i, int i9) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        this.f24106b = arrayList;
        Objects.requireNonNull(bVar);
        this.f24105a = bVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i9, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i9));
        }
        if (m3.h.f23914a >= 9) {
            StringBuilder sb2 = new StringBuilder();
            if (i == 0) {
                str = "EEEE, MMMM d, yyyy";
            } else if (i == 1) {
                str = "MMMM d, yyyy";
            } else if (i == 2) {
                str = "MMM d, yyyy";
            } else if (i == 3) {
                str = "M/d/yy";
            } else {
                throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.g(i, "Unknown DateFormat style: "));
            }
            sb2.append(str);
            sb2.append(" ");
            if (i9 == 0 || i9 == 1) {
                str2 = "h:mm:ss a z";
            } else if (i9 == 2) {
                str2 = "h:mm:ss a";
            } else if (i9 == 3) {
                str2 = "h:mm a";
            } else {
                throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.g(i9, "Unknown DateFormat style: "));
            }
            sb2.append(str2);
            arrayList.add(new SimpleDateFormat(sb2.toString(), locale));
        }
    }

    /* compiled from: DefaultDateTypeAdapter.java */
    public static abstract class b<T extends Date> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f24107b = new a(Date.class);

        /* renamed from: a, reason: collision with root package name */
        public final Class<T> f24108a;

        public b(Class<T> cls) {
            this.f24108a = cls;
        }

        public abstract T a(Date date);

        /* compiled from: DefaultDateTypeAdapter.java */
        public class a extends b<Date> {
            @Override // n3.c.b
            public final Date a(Date date) {
                return date;
            }
        }
    }
}

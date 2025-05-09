package n3;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonToken;
import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import r3.C1149a;

/* compiled from: TypeAdapters.java */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: A, reason: collision with root package name */
    public static final n3.q f24173A;

    /* renamed from: B, reason: collision with root package name */
    public static final t f24174B;

    /* renamed from: C, reason: collision with root package name */
    public static final n3.s f24175C;

    /* renamed from: D, reason: collision with root package name */
    public static final u f24176D;

    /* renamed from: a, reason: collision with root package name */
    public static final n3.q f24177a = new n3.q(Class.class, new com.google.gson.f(new k(), 2), 1);

    /* renamed from: b, reason: collision with root package name */
    public static final n3.q f24178b = new n3.q(BitSet.class, new com.google.gson.f(new v(), 2), 1);

    /* renamed from: c, reason: collision with root package name */
    public static final x f24179c;

    /* renamed from: d, reason: collision with root package name */
    public static final n3.r f24180d;

    /* renamed from: e, reason: collision with root package name */
    public static final n3.r f24181e;

    /* renamed from: f, reason: collision with root package name */
    public static final n3.r f24182f;

    /* renamed from: g, reason: collision with root package name */
    public static final n3.r f24183g;

    /* renamed from: h, reason: collision with root package name */
    public static final n3.q f24184h;
    public static final n3.q i;

    /* renamed from: j, reason: collision with root package name */
    public static final n3.q f24185j;

    /* renamed from: k, reason: collision with root package name */
    public static final C1066b f24186k;

    /* renamed from: l, reason: collision with root package name */
    public static final C1067c f24187l;

    /* renamed from: m, reason: collision with root package name */
    public static final C1068d f24188m;

    /* renamed from: n, reason: collision with root package name */
    public static final n3.r f24189n;

    /* renamed from: o, reason: collision with root package name */
    public static final g f24190o;

    /* renamed from: p, reason: collision with root package name */
    public static final h f24191p;

    /* renamed from: q, reason: collision with root package name */
    public static final i f24192q;

    /* renamed from: r, reason: collision with root package name */
    public static final n3.q f24193r;

    /* renamed from: s, reason: collision with root package name */
    public static final n3.q f24194s;

    /* renamed from: t, reason: collision with root package name */
    public static final n3.q f24195t;

    /* renamed from: u, reason: collision with root package name */
    public static final n3.q f24196u;

    /* renamed from: v, reason: collision with root package name */
    public static final n3.q f24197v;

    /* renamed from: w, reason: collision with root package name */
    public static final n3.s f24198w;

    /* renamed from: x, reason: collision with root package name */
    public static final n3.q f24199x;

    /* renamed from: y, reason: collision with root package name */
    public static final n3.q f24200y;

    /* renamed from: z, reason: collision with root package name */
    public static final n3.r f24201z;

    /* compiled from: TypeAdapters.java */
    public class A extends com.google.gson.r<Number> {
        @Override // com.google.gson.r
        public final Number a(C1149a c1149a) {
            if (c1149a.k0() == JsonToken.i) {
                c1149a.Y();
                return null;
            }
            try {
                return Integer.valueOf(c1149a.Q());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // com.google.gson.r
        public final void b(r3.b bVar, Number number) {
            if (number == null) {
                bVar.E();
            } else {
                bVar.Q(r4.intValue());
            }
        }
    }

    /* compiled from: TypeAdapters.java */
    public class B extends com.google.gson.r<AtomicInteger> {
        @Override // com.google.gson.r
        public final AtomicInteger a(C1149a c1149a) {
            try {
                return new AtomicInteger(c1149a.Q());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // com.google.gson.r
        public final void b(r3.b bVar, AtomicInteger atomicInteger) {
            bVar.Q(atomicInteger.get());
        }
    }

    /* compiled from: TypeAdapters.java */
    public class C extends com.google.gson.r<AtomicBoolean> {
        @Override // com.google.gson.r
        public final AtomicBoolean a(C1149a c1149a) {
            return new AtomicBoolean(c1149a.N());
        }

        @Override // com.google.gson.r
        public final void b(r3.b bVar, AtomicBoolean atomicBoolean) {
            bVar.Y(atomicBoolean.get());
        }
    }

    /* compiled from: TypeAdapters.java */
    public static final class D<T extends Enum<T>> extends com.google.gson.r<T> {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f24202a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        public final HashMap f24203b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        public final HashMap f24204c = new HashMap();

        /* compiled from: TypeAdapters.java */
        public class a implements PrivilegedAction<Field[]> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Class f24205a;

            public a(Class cls) {
                this.f24205a = cls;
            }

            @Override // java.security.PrivilegedAction
            public final Field[] run() {
                Field[] declaredFields = this.f24205a.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.isEnumConstant()) {
                        arrayList.add(field);
                    }
                }
                Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                AccessibleObject.setAccessible(fieldArr, true);
                return fieldArr;
            }
        }

        public D(Class<T> cls) {
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new a(cls))) {
                    Enum r42 = (Enum) field.get(null);
                    String name = r42.name();
                    String str = r42.toString();
                    l3.b bVar = (l3.b) field.getAnnotation(l3.b.class);
                    if (bVar != null) {
                        name = bVar.value();
                        for (String str2 : bVar.alternate()) {
                            this.f24202a.put(str2, r42);
                        }
                    }
                    this.f24202a.put(name, r42);
                    this.f24203b.put(str, r42);
                    this.f24204c.put(r42, name);
                }
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.gson.r
        public final Object a(C1149a c1149a) {
            if (c1149a.k0() == JsonToken.i) {
                c1149a.Y();
                return null;
            }
            String d02 = c1149a.d0();
            Enum r02 = (Enum) this.f24202a.get(d02);
            return r02 == null ? (Enum) this.f24203b.get(d02) : r02;
        }

        @Override // com.google.gson.r
        public final void b(r3.b bVar, Object obj) {
            Enum r32 = (Enum) obj;
            bVar.W(r32 == null ? null : (String) this.f24204c.get(r32));
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: n3.p$a, reason: case insensitive filesystem */
    public class C1065a extends com.google.gson.r<AtomicIntegerArray> {
        @Override // com.google.gson.r
        public final AtomicIntegerArray a(C1149a c1149a) {
            ArrayList arrayList = new ArrayList();
            c1149a.d();
            while (c1149a.G()) {
                try {
                    arrayList.add(Integer.valueOf(c1149a.Q()));
                } catch (NumberFormatException e10) {
                    throw new JsonSyntaxException(e10);
                }
            }
            c1149a.y();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i = 0; i < size; i++) {
                atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // com.google.gson.r
        public final void b(r3.b bVar, AtomicIntegerArray atomicIntegerArray) {
            bVar.i();
            int length = atomicIntegerArray.length();
            for (int i = 0; i < length; i++) {
                bVar.Q(r6.get(i));
            }
            bVar.y();
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: n3.p$b, reason: case insensitive filesystem */
    public class C1066b extends com.google.gson.r<Number> {
        @Override // com.google.gson.r
        public final Number a(C1149a c1149a) {
            if (c1149a.k0() == JsonToken.i) {
                c1149a.Y();
                return null;
            }
            try {
                return Long.valueOf(c1149a.T());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // com.google.gson.r
        public final void b(r3.b bVar, Number number) {
            Number number2 = number;
            if (number2 == null) {
                bVar.E();
            } else {
                bVar.Q(number2.longValue());
            }
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: n3.p$c, reason: case insensitive filesystem */
    public class C1067c extends com.google.gson.r<Number> {
        @Override // com.google.gson.r
        public final Number a(C1149a c1149a) {
            if (c1149a.k0() != JsonToken.i) {
                return Float.valueOf((float) c1149a.P());
            }
            c1149a.Y();
            return null;
        }

        @Override // com.google.gson.r
        public final void b(r3.b bVar, Number number) {
            Number number2 = number;
            if (number2 == null) {
                bVar.E();
                return;
            }
            if (!(number2 instanceof Float)) {
                number2 = Float.valueOf(number2.floatValue());
            }
            bVar.V(number2);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: n3.p$d, reason: case insensitive filesystem */
    public class C1068d extends com.google.gson.r<Number> {
        @Override // com.google.gson.r
        public final Number a(C1149a c1149a) {
            if (c1149a.k0() != JsonToken.i) {
                return Double.valueOf(c1149a.P());
            }
            c1149a.Y();
            return null;
        }

        @Override // com.google.gson.r
        public final void b(r3.b bVar, Number number) {
            Number number2 = number;
            if (number2 == null) {
                bVar.E();
            } else {
                bVar.P(number2.doubleValue());
            }
        }
    }

    /* compiled from: TypeAdapters.java */
    public class e extends com.google.gson.r<Character> {
        @Override // com.google.gson.r
        public final Character a(C1149a c1149a) {
            if (c1149a.k0() == JsonToken.i) {
                c1149a.Y();
                return null;
            }
            String d02 = c1149a.d0();
            if (d02.length() == 1) {
                return Character.valueOf(d02.charAt(0));
            }
            StringBuilder m2 = com.google.android.gms.measurement.internal.a.m("Expecting character, got: ", d02, "; at ");
            m2.append(c1149a.E());
            throw new JsonSyntaxException(m2.toString());
        }

        @Override // com.google.gson.r
        public final void b(r3.b bVar, Character ch) {
            Character ch2 = ch;
            bVar.W(ch2 == null ? null : String.valueOf(ch2));
        }
    }

    /* compiled from: TypeAdapters.java */
    public class f extends com.google.gson.r<String> {
        @Override // com.google.gson.r
        public final String a(C1149a c1149a) {
            JsonToken k02 = c1149a.k0();
            if (k02 != JsonToken.i) {
                return k02 == JsonToken.f10417h ? Boolean.toString(c1149a.N()) : c1149a.d0();
            }
            c1149a.Y();
            return null;
        }

        @Override // com.google.gson.r
        public final void b(r3.b bVar, String str) {
            bVar.W(str);
        }
    }

    /* compiled from: TypeAdapters.java */
    public class g extends com.google.gson.r<BigDecimal> {
        @Override // com.google.gson.r
        public final BigDecimal a(C1149a c1149a) {
            if (c1149a.k0() == JsonToken.i) {
                c1149a.Y();
                return null;
            }
            String d02 = c1149a.d0();
            try {
                return j3.e.A(d02);
            } catch (NumberFormatException e10) {
                StringBuilder m2 = com.google.android.gms.measurement.internal.a.m("Failed parsing '", d02, "' as BigDecimal; at path ");
                m2.append(c1149a.E());
                throw new JsonSyntaxException(m2.toString(), e10);
            }
        }

        @Override // com.google.gson.r
        public final void b(r3.b bVar, BigDecimal bigDecimal) {
            bVar.V(bigDecimal);
        }
    }

    /* compiled from: TypeAdapters.java */
    public class h extends com.google.gson.r<BigInteger> {
        @Override // com.google.gson.r
        public final BigInteger a(C1149a c1149a) {
            if (c1149a.k0() == JsonToken.i) {
                c1149a.Y();
                return null;
            }
            String d02 = c1149a.d0();
            try {
                j3.e.d(d02);
                return new BigInteger(d02);
            } catch (NumberFormatException e10) {
                StringBuilder m2 = com.google.android.gms.measurement.internal.a.m("Failed parsing '", d02, "' as BigInteger; at path ");
                m2.append(c1149a.E());
                throw new JsonSyntaxException(m2.toString(), e10);
            }
        }

        @Override // com.google.gson.r
        public final void b(r3.b bVar, BigInteger bigInteger) {
            bVar.V(bigInteger);
        }
    }

    /* compiled from: TypeAdapters.java */
    public class i extends com.google.gson.r<LazilyParsedNumber> {
        @Override // com.google.gson.r
        public final LazilyParsedNumber a(C1149a c1149a) {
            if (c1149a.k0() != JsonToken.i) {
                return new LazilyParsedNumber(c1149a.d0());
            }
            c1149a.Y();
            return null;
        }

        @Override // com.google.gson.r
        public final void b(r3.b bVar, LazilyParsedNumber lazilyParsedNumber) {
            bVar.V(lazilyParsedNumber);
        }
    }

    /* compiled from: TypeAdapters.java */
    public class j extends com.google.gson.r<StringBuilder> {
        @Override // com.google.gson.r
        public final StringBuilder a(C1149a c1149a) {
            if (c1149a.k0() != JsonToken.i) {
                return new StringBuilder(c1149a.d0());
            }
            c1149a.Y();
            return null;
        }

        @Override // com.google.gson.r
        public final void b(r3.b bVar, StringBuilder sb2) {
            StringBuilder sb3 = sb2;
            bVar.W(sb3 == null ? null : sb3.toString());
        }
    }

    /* compiled from: TypeAdapters.java */
    public class k extends com.google.gson.r<Class> {
        @Override // com.google.gson.r
        public final Class a(C1149a c1149a) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee " + j3.e.i("java-lang-class-unsupported"));
        }

        @Override // com.google.gson.r
        public final void b(r3.b bVar, Class cls) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?\nSee " + j3.e.i("java-lang-class-unsupported"));
        }
    }

    /* compiled from: TypeAdapters.java */
    public class l extends com.google.gson.r<StringBuffer> {
        @Override // com.google.gson.r
        public final StringBuffer a(C1149a c1149a) {
            if (c1149a.k0() != JsonToken.i) {
                return new StringBuffer(c1149a.d0());
            }
            c1149a.Y();
            return null;
        }

        @Override // com.google.gson.r
        public final void b(r3.b bVar, StringBuffer stringBuffer) {
            StringBuffer stringBuffer2 = stringBuffer;
            bVar.W(stringBuffer2 == null ? null : stringBuffer2.toString());
        }
    }

    /* compiled from: TypeAdapters.java */
    public class m extends com.google.gson.r<URL> {
        @Override // com.google.gson.r
        public final URL a(C1149a c1149a) {
            if (c1149a.k0() == JsonToken.i) {
                c1149a.Y();
                return null;
            }
            String d02 = c1149a.d0();
            if (d02.equals("null")) {
                return null;
            }
            return new URL(d02);
        }

        @Override // com.google.gson.r
        public final void b(r3.b bVar, URL url) {
            URL url2 = url;
            bVar.W(url2 == null ? null : url2.toExternalForm());
        }
    }

    /* compiled from: TypeAdapters.java */
    public class n extends com.google.gson.r<URI> {
        @Override // com.google.gson.r
        public final URI a(C1149a c1149a) {
            if (c1149a.k0() == JsonToken.i) {
                c1149a.Y();
                return null;
            }
            try {
                String d02 = c1149a.d0();
                if (d02.equals("null")) {
                    return null;
                }
                return new URI(d02);
            } catch (URISyntaxException e10) {
                throw new JsonIOException(e10);
            }
        }

        @Override // com.google.gson.r
        public final void b(r3.b bVar, URI uri) {
            URI uri2 = uri;
            bVar.W(uri2 == null ? null : uri2.toASCIIString());
        }
    }

    /* compiled from: TypeAdapters.java */
    public class o extends com.google.gson.r<InetAddress> {
        @Override // com.google.gson.r
        public final InetAddress a(C1149a c1149a) {
            if (c1149a.k0() != JsonToken.i) {
                return InetAddress.getByName(c1149a.d0());
            }
            c1149a.Y();
            return null;
        }

        @Override // com.google.gson.r
        public final void b(r3.b bVar, InetAddress inetAddress) {
            InetAddress inetAddress2 = inetAddress;
            bVar.W(inetAddress2 == null ? null : inetAddress2.getHostAddress());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: n3.p$p, reason: collision with other inner class name */
    public class C0435p extends com.google.gson.r<UUID> {
        @Override // com.google.gson.r
        public final UUID a(C1149a c1149a) {
            if (c1149a.k0() == JsonToken.i) {
                c1149a.Y();
                return null;
            }
            String d02 = c1149a.d0();
            try {
                return UUID.fromString(d02);
            } catch (IllegalArgumentException e10) {
                StringBuilder m2 = com.google.android.gms.measurement.internal.a.m("Failed parsing '", d02, "' as UUID; at path ");
                m2.append(c1149a.E());
                throw new JsonSyntaxException(m2.toString(), e10);
            }
        }

        @Override // com.google.gson.r
        public final void b(r3.b bVar, UUID uuid) {
            UUID uuid2 = uuid;
            bVar.W(uuid2 == null ? null : uuid2.toString());
        }
    }

    /* compiled from: TypeAdapters.java */
    public class q extends com.google.gson.r<Currency> {
        @Override // com.google.gson.r
        public final Currency a(C1149a c1149a) {
            String d02 = c1149a.d0();
            try {
                return Currency.getInstance(d02);
            } catch (IllegalArgumentException e10) {
                StringBuilder m2 = com.google.android.gms.measurement.internal.a.m("Failed parsing '", d02, "' as Currency; at path ");
                m2.append(c1149a.E());
                throw new JsonSyntaxException(m2.toString(), e10);
            }
        }

        @Override // com.google.gson.r
        public final void b(r3.b bVar, Currency currency) {
            bVar.W(currency.getCurrencyCode());
        }
    }

    /* compiled from: TypeAdapters.java */
    public class r extends com.google.gson.r<Calendar> {
        @Override // com.google.gson.r
        public final Calendar a(C1149a c1149a) {
            int Q4;
            if (c1149a.k0() == JsonToken.i) {
                c1149a.Y();
                return null;
            }
            c1149a.i();
            int i = 0;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (c1149a.k0() != JsonToken.f10413d) {
                String V = c1149a.V();
                Q4 = c1149a.Q();
                V.getClass();
                switch (V) {
                    case "dayOfMonth":
                        i10 = Q4;
                        break;
                    case "minute":
                        i12 = Q4;
                        break;
                    case "second":
                        i13 = Q4;
                        break;
                    case "year":
                        i = Q4;
                        break;
                    case "month":
                        i9 = Q4;
                        break;
                    case "hourOfDay":
                        i11 = Q4;
                        break;
                }
            }
            c1149a.A();
            return new GregorianCalendar(i, i9, i10, i11, i12, i13);
        }

        @Override // com.google.gson.r
        public final void b(r3.b bVar, Calendar calendar) {
            if (calendar == null) {
                bVar.E();
                return;
            }
            bVar.j();
            bVar.C("year");
            bVar.Q(r4.get(1));
            bVar.C("month");
            bVar.Q(r4.get(2));
            bVar.C("dayOfMonth");
            bVar.Q(r4.get(5));
            bVar.C("hourOfDay");
            bVar.Q(r4.get(11));
            bVar.C("minute");
            bVar.Q(r4.get(12));
            bVar.C("second");
            bVar.Q(r4.get(13));
            bVar.A();
        }
    }

    /* compiled from: TypeAdapters.java */
    public class s extends com.google.gson.r<Locale> {
        @Override // com.google.gson.r
        public final Locale a(C1149a c1149a) {
            if (c1149a.k0() == JsonToken.i) {
                c1149a.Y();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(c1149a.d0(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            return (nextToken2 == null && nextToken3 == null) ? new Locale(nextToken) : nextToken3 == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, nextToken3);
        }

        @Override // com.google.gson.r
        public final void b(r3.b bVar, Locale locale) {
            Locale locale2 = locale;
            bVar.W(locale2 == null ? null : locale2.toString());
        }
    }

    /* compiled from: TypeAdapters.java */
    public class t extends com.google.gson.r<com.google.gson.l> {
        public static com.google.gson.l c(C1149a c1149a, JsonToken jsonToken) {
            int ordinal = jsonToken.ordinal();
            if (ordinal == 5) {
                return new com.google.gson.o(c1149a.d0());
            }
            if (ordinal == 6) {
                return new com.google.gson.o(new LazilyParsedNumber(c1149a.d0()));
            }
            if (ordinal == 7) {
                return new com.google.gson.o(Boolean.valueOf(c1149a.N()));
            }
            if (ordinal == 8) {
                c1149a.Y();
                return com.google.gson.m.f10407a;
            }
            throw new IllegalStateException("Unexpected token: " + jsonToken);
        }

        public static void d(com.google.gson.l lVar, r3.b bVar) {
            if (lVar == null || (lVar instanceof com.google.gson.m)) {
                bVar.E();
                return;
            }
            boolean z10 = lVar instanceof com.google.gson.o;
            if (z10) {
                if (!z10) {
                    throw new IllegalStateException("Not a JSON Primitive: " + lVar);
                }
                com.google.gson.o oVar = (com.google.gson.o) lVar;
                Serializable serializable = oVar.f10409a;
                if (serializable instanceof Number) {
                    bVar.V(oVar.f());
                    return;
                } else if (serializable instanceof Boolean) {
                    bVar.Y(oVar.c());
                    return;
                } else {
                    bVar.W(oVar.a());
                    return;
                }
            }
            boolean z11 = lVar instanceof com.google.gson.j;
            if (z11) {
                bVar.i();
                if (!z11) {
                    throw new IllegalStateException("Not a JSON Array: " + lVar);
                }
                Iterator<com.google.gson.l> it = ((com.google.gson.j) lVar).f10406a.iterator();
                while (it.hasNext()) {
                    d(it.next(), bVar);
                }
                bVar.y();
                return;
            }
            boolean z12 = lVar instanceof com.google.gson.n;
            if (!z12) {
                throw new IllegalArgumentException("Couldn't write " + lVar.getClass());
            }
            bVar.j();
            if (!z12) {
                throw new IllegalStateException("Not a JSON Object: " + lVar);
            }
            Iterator it2 = ((LinkedTreeMap.b) ((com.google.gson.n) lVar).f10408a.entrySet()).iterator();
            while (((LinkedTreeMap.d) it2).hasNext()) {
                Map.Entry a10 = ((LinkedTreeMap.b.a) it2).a();
                bVar.C((String) a10.getKey());
                d((com.google.gson.l) a10.getValue(), bVar);
            }
            bVar.A();
        }

        @Override // com.google.gson.r
        public final com.google.gson.l a(C1149a c1149a) {
            com.google.gson.l jVar;
            com.google.gson.l jVar2;
            com.google.gson.l lVar;
            com.google.gson.l lVar2;
            if (c1149a instanceof n3.e) {
                n3.e eVar = (n3.e) c1149a;
                JsonToken k02 = eVar.k0();
                if (k02 != JsonToken.f10414e && k02 != JsonToken.f10411b && k02 != JsonToken.f10413d && k02 != JsonToken.f10418j) {
                    com.google.gson.l lVar3 = (com.google.gson.l) eVar.A0();
                    eVar.t0();
                    return lVar3;
                }
                throw new IllegalStateException("Unexpected " + k02 + " when reading a JsonElement.");
            }
            JsonToken k03 = c1149a.k0();
            int ordinal = k03.ordinal();
            if (ordinal == 0) {
                c1149a.d();
                jVar = new com.google.gson.j();
            } else if (ordinal != 2) {
                jVar = null;
            } else {
                c1149a.i();
                jVar = new com.google.gson.n();
            }
            if (jVar == null) {
                return c(c1149a, k03);
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            while (true) {
                if (c1149a.G()) {
                    String V = jVar instanceof com.google.gson.n ? c1149a.V() : null;
                    JsonToken k04 = c1149a.k0();
                    int ordinal2 = k04.ordinal();
                    if (ordinal2 == 0) {
                        c1149a.d();
                        jVar2 = new com.google.gson.j();
                    } else if (ordinal2 != 2) {
                        jVar2 = null;
                    } else {
                        c1149a.i();
                        jVar2 = new com.google.gson.n();
                    }
                    boolean z10 = jVar2 != null;
                    if (jVar2 == null) {
                        jVar2 = c(c1149a, k04);
                    }
                    if (jVar instanceof com.google.gson.j) {
                        com.google.gson.j jVar3 = (com.google.gson.j) jVar;
                        if (jVar2 == null) {
                            jVar3.getClass();
                            lVar2 = com.google.gson.m.f10407a;
                        } else {
                            lVar2 = jVar2;
                        }
                        jVar3.f10406a.add(lVar2);
                    } else {
                        com.google.gson.n nVar = (com.google.gson.n) jVar;
                        if (jVar2 == null) {
                            nVar.getClass();
                            lVar = com.google.gson.m.f10407a;
                        } else {
                            lVar = jVar2;
                        }
                        nVar.f10408a.put(V, lVar);
                    }
                    if (z10) {
                        arrayDeque.addLast(jVar);
                        jVar = jVar2;
                    }
                } else {
                    if (jVar instanceof com.google.gson.j) {
                        c1149a.y();
                    } else {
                        c1149a.A();
                    }
                    if (arrayDeque.isEmpty()) {
                        return jVar;
                    }
                    jVar = (com.google.gson.l) arrayDeque.removeLast();
                }
            }
        }

        @Override // com.google.gson.r
        public final /* bridge */ /* synthetic */ void b(r3.b bVar, com.google.gson.l lVar) {
            d(lVar, bVar);
        }
    }

    /* compiled from: TypeAdapters.java */
    public class u implements com.google.gson.s {
        @Override // com.google.gson.s
        public final <T> com.google.gson.r<T> a(com.google.gson.g gVar, TypeToken<T> typeToken) {
            Class<? super T> rawType = typeToken.getRawType();
            if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                return null;
            }
            if (!rawType.isEnum()) {
                rawType = rawType.getSuperclass();
            }
            return new D(rawType);
        }
    }

    /* compiled from: TypeAdapters.java */
    public class v extends com.google.gson.r<BitSet> {
        @Override // com.google.gson.r
        public final BitSet a(C1149a c1149a) {
            BitSet bitSet = new BitSet();
            c1149a.d();
            JsonToken k02 = c1149a.k0();
            int i = 0;
            while (k02 != JsonToken.f10411b) {
                int ordinal = k02.ordinal();
                if (ordinal == 5 || ordinal == 6) {
                    int Q4 = c1149a.Q();
                    if (Q4 != 0) {
                        if (Q4 != 1) {
                            StringBuilder l10 = com.google.android.gms.measurement.internal.a.l("Invalid bitset value ", Q4, ", expected 0 or 1; at path ");
                            l10.append(c1149a.E());
                            throw new JsonSyntaxException(l10.toString());
                        }
                        bitSet.set(i);
                        i++;
                        k02 = c1149a.k0();
                    } else {
                        continue;
                        i++;
                        k02 = c1149a.k0();
                    }
                } else {
                    if (ordinal != 7) {
                        throw new JsonSyntaxException("Invalid bitset value type: " + k02 + "; at path " + c1149a.getPath());
                    }
                    if (!c1149a.N()) {
                        i++;
                        k02 = c1149a.k0();
                    }
                    bitSet.set(i);
                    i++;
                    k02 = c1149a.k0();
                }
            }
            c1149a.y();
            return bitSet;
        }

        @Override // com.google.gson.r
        public final void b(r3.b bVar, BitSet bitSet) {
            BitSet bitSet2 = bitSet;
            bVar.i();
            int length = bitSet2.length();
            for (int i = 0; i < length; i++) {
                bVar.Q(bitSet2.get(i) ? 1L : 0L);
            }
            bVar.y();
        }
    }

    /* compiled from: TypeAdapters.java */
    public class w extends com.google.gson.r<Boolean> {
        @Override // com.google.gson.r
        public final Boolean a(C1149a c1149a) {
            JsonToken k02 = c1149a.k0();
            if (k02 != JsonToken.i) {
                return k02 == JsonToken.f10415f ? Boolean.valueOf(Boolean.parseBoolean(c1149a.d0())) : Boolean.valueOf(c1149a.N());
            }
            c1149a.Y();
            return null;
        }

        @Override // com.google.gson.r
        public final void b(r3.b bVar, Boolean bool) {
            bVar.T(bool);
        }
    }

    /* compiled from: TypeAdapters.java */
    public class x extends com.google.gson.r<Boolean> {
        @Override // com.google.gson.r
        public final Boolean a(C1149a c1149a) {
            if (c1149a.k0() != JsonToken.i) {
                return Boolean.valueOf(c1149a.d0());
            }
            c1149a.Y();
            return null;
        }

        @Override // com.google.gson.r
        public final void b(r3.b bVar, Boolean bool) {
            Boolean bool2 = bool;
            bVar.W(bool2 == null ? "null" : bool2.toString());
        }
    }

    /* compiled from: TypeAdapters.java */
    public class y extends com.google.gson.r<Number> {
        @Override // com.google.gson.r
        public final Number a(C1149a c1149a) {
            if (c1149a.k0() == JsonToken.i) {
                c1149a.Y();
                return null;
            }
            try {
                int Q4 = c1149a.Q();
                if (Q4 <= 255 && Q4 >= -128) {
                    return Byte.valueOf((byte) Q4);
                }
                StringBuilder l10 = com.google.android.gms.measurement.internal.a.l("Lossy conversion from ", Q4, " to byte; at path ");
                l10.append(c1149a.E());
                throw new JsonSyntaxException(l10.toString());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // com.google.gson.r
        public final void b(r3.b bVar, Number number) {
            if (number == null) {
                bVar.E();
            } else {
                bVar.Q(r4.byteValue());
            }
        }
    }

    /* compiled from: TypeAdapters.java */
    public class z extends com.google.gson.r<Number> {
        @Override // com.google.gson.r
        public final Number a(C1149a c1149a) {
            if (c1149a.k0() == JsonToken.i) {
                c1149a.Y();
                return null;
            }
            try {
                int Q4 = c1149a.Q();
                if (Q4 <= 65535 && Q4 >= -32768) {
                    return Short.valueOf((short) Q4);
                }
                StringBuilder l10 = com.google.android.gms.measurement.internal.a.l("Lossy conversion from ", Q4, " to short; at path ");
                l10.append(c1149a.E());
                throw new JsonSyntaxException(l10.toString());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // com.google.gson.r
        public final void b(r3.b bVar, Number number) {
            if (number == null) {
                bVar.E();
            } else {
                bVar.Q(r4.shortValue());
            }
        }
    }

    static {
        w wVar = new w();
        f24179c = new x();
        f24180d = new n3.r(Boolean.TYPE, Boolean.class, wVar);
        f24181e = new n3.r(Byte.TYPE, Byte.class, new y());
        f24182f = new n3.r(Short.TYPE, Short.class, new z());
        f24183g = new n3.r(Integer.TYPE, Integer.class, new A());
        f24184h = new n3.q(AtomicInteger.class, new com.google.gson.f(new B(), 2), 1);
        i = new n3.q(AtomicBoolean.class, new com.google.gson.f(new C(), 2), 1);
        f24185j = new n3.q(AtomicIntegerArray.class, new com.google.gson.f(new C1065a(), 2), 1);
        f24186k = new C1066b();
        f24187l = new C1067c();
        f24188m = new C1068d();
        f24189n = new n3.r(Character.TYPE, Character.class, new e());
        f fVar = new f();
        f24190o = new g();
        f24191p = new h();
        f24192q = new i();
        f24193r = new n3.q(String.class, fVar, 1);
        f24194s = new n3.q(StringBuilder.class, new j(), 1);
        f24195t = new n3.q(StringBuffer.class, new l(), 1);
        f24196u = new n3.q(URL.class, new m(), 1);
        f24197v = new n3.q(URI.class, new n(), 1);
        f24198w = new n3.s(InetAddress.class, new o());
        f24199x = new n3.q(UUID.class, new C0435p(), 1);
        f24200y = new n3.q(Currency.class, new com.google.gson.f(new q(), 2), 1);
        f24201z = new n3.r(new r());
        f24173A = new n3.q(Locale.class, new s(), 1);
        t tVar = new t();
        f24174B = tVar;
        f24175C = new n3.s(com.google.gson.l.class, tVar);
        f24176D = new u();
    }
}

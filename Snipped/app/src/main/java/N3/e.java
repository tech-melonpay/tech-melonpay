package n3;

import com.google.gson.Strictness;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.Reader;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import r3.C1149a;

/* compiled from: JsonTreeReader.java */
/* loaded from: classes.dex */
public final class e extends C1149a {

    /* renamed from: t, reason: collision with root package name */
    public static final Object f24113t;

    /* renamed from: p, reason: collision with root package name */
    public Object[] f24114p;

    /* renamed from: q, reason: collision with root package name */
    public int f24115q;

    /* renamed from: r, reason: collision with root package name */
    public String[] f24116r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f24117s;

    /* compiled from: JsonTreeReader.java */
    public class a extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i, int i9) {
            throw new AssertionError();
        }
    }

    static {
        new a();
        f24113t = new Object();
    }

    @Override // r3.C1149a
    public final void A() {
        w0(JsonToken.f10413d);
        this.f24116r[this.f24115q - 1] = null;
        B0();
        B0();
        int i = this.f24115q;
        if (i > 0) {
            int[] iArr = this.f24117s;
            int i9 = i - 1;
            iArr[i9] = iArr[i9] + 1;
        }
    }

    public final Object A0() {
        return this.f24114p[this.f24115q - 1];
    }

    public final Object B0() {
        Object[] objArr = this.f24114p;
        int i = this.f24115q - 1;
        this.f24115q = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void C0(Object obj) {
        int i = this.f24115q;
        Object[] objArr = this.f24114p;
        if (i == objArr.length) {
            int i9 = i * 2;
            this.f24114p = Arrays.copyOf(objArr, i9);
            this.f24117s = Arrays.copyOf(this.f24117s, i9);
            this.f24116r = (String[]) Arrays.copyOf(this.f24116r, i9);
        }
        Object[] objArr2 = this.f24114p;
        int i10 = this.f24115q;
        this.f24115q = i10 + 1;
        objArr2[i10] = obj;
    }

    @Override // r3.C1149a
    public final String E() {
        return x0(true);
    }

    @Override // r3.C1149a
    public final boolean G() {
        JsonToken k02 = k0();
        return (k02 == JsonToken.f10413d || k02 == JsonToken.f10411b || k02 == JsonToken.f10418j) ? false : true;
    }

    @Override // r3.C1149a
    public final boolean N() {
        w0(JsonToken.f10417h);
        boolean c2 = ((com.google.gson.o) B0()).c();
        int i = this.f24115q;
        if (i > 0) {
            int[] iArr = this.f24117s;
            int i9 = i - 1;
            iArr[i9] = iArr[i9] + 1;
        }
        return c2;
    }

    @Override // r3.C1149a
    public final double P() {
        JsonToken k02 = k0();
        JsonToken jsonToken = JsonToken.f10416g;
        if (k02 != jsonToken && k02 != JsonToken.f10415f) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + k02 + y0());
        }
        double e10 = ((com.google.gson.o) A0()).e();
        if (this.f26150b != Strictness.f10313a && (Double.isNaN(e10) || Double.isInfinite(e10))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + e10);
        }
        B0();
        int i = this.f24115q;
        if (i > 0) {
            int[] iArr = this.f24117s;
            int i9 = i - 1;
            iArr[i9] = iArr[i9] + 1;
        }
        return e10;
    }

    @Override // r3.C1149a
    public final int Q() {
        JsonToken k02 = k0();
        JsonToken jsonToken = JsonToken.f10416g;
        if (k02 != jsonToken && k02 != JsonToken.f10415f) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + k02 + y0());
        }
        com.google.gson.o oVar = (com.google.gson.o) A0();
        int intValue = oVar.f10409a instanceof Number ? oVar.f().intValue() : Integer.parseInt(oVar.a());
        B0();
        int i = this.f24115q;
        if (i > 0) {
            int[] iArr = this.f24117s;
            int i9 = i - 1;
            iArr[i9] = iArr[i9] + 1;
        }
        return intValue;
    }

    @Override // r3.C1149a
    public final long T() {
        JsonToken k02 = k0();
        JsonToken jsonToken = JsonToken.f10416g;
        if (k02 != jsonToken && k02 != JsonToken.f10415f) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + k02 + y0());
        }
        com.google.gson.o oVar = (com.google.gson.o) A0();
        long longValue = oVar.f10409a instanceof Number ? oVar.f().longValue() : Long.parseLong(oVar.a());
        B0();
        int i = this.f24115q;
        if (i > 0) {
            int[] iArr = this.f24117s;
            int i9 = i - 1;
            iArr[i9] = iArr[i9] + 1;
        }
        return longValue;
    }

    @Override // r3.C1149a
    public final String V() {
        return z0(false);
    }

    @Override // r3.C1149a
    public final void Y() {
        w0(JsonToken.i);
        B0();
        int i = this.f24115q;
        if (i > 0) {
            int[] iArr = this.f24117s;
            int i9 = i - 1;
            iArr[i9] = iArr[i9] + 1;
        }
    }

    @Override // r3.C1149a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f24114p = new Object[]{f24113t};
        this.f24115q = 1;
    }

    @Override // r3.C1149a
    public final void d() {
        w0(JsonToken.f10410a);
        C0(((com.google.gson.j) A0()).f10406a.iterator());
        this.f24117s[this.f24115q - 1] = 0;
    }

    @Override // r3.C1149a
    public final String d0() {
        JsonToken k02 = k0();
        JsonToken jsonToken = JsonToken.f10415f;
        if (k02 != jsonToken && k02 != JsonToken.f10416g) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + k02 + y0());
        }
        String a10 = ((com.google.gson.o) B0()).a();
        int i = this.f24115q;
        if (i > 0) {
            int[] iArr = this.f24117s;
            int i9 = i - 1;
            iArr[i9] = iArr[i9] + 1;
        }
        return a10;
    }

    @Override // r3.C1149a
    public final String getPath() {
        return x0(false);
    }

    @Override // r3.C1149a
    public final void i() {
        w0(JsonToken.f10412c);
        C0(((LinkedTreeMap.b) ((com.google.gson.n) A0()).f10408a.entrySet()).iterator());
    }

    @Override // r3.C1149a
    public final JsonToken k0() {
        if (this.f24115q == 0) {
            return JsonToken.f10418j;
        }
        Object A02 = A0();
        if (A02 instanceof Iterator) {
            boolean z10 = this.f24114p[this.f24115q - 2] instanceof com.google.gson.n;
            Iterator it = (Iterator) A02;
            if (!it.hasNext()) {
                return z10 ? JsonToken.f10413d : JsonToken.f10411b;
            }
            if (z10) {
                return JsonToken.f10414e;
            }
            C0(it.next());
            return k0();
        }
        if (A02 instanceof com.google.gson.n) {
            return JsonToken.f10412c;
        }
        if (A02 instanceof com.google.gson.j) {
            return JsonToken.f10410a;
        }
        if (A02 instanceof com.google.gson.o) {
            Serializable serializable = ((com.google.gson.o) A02).f10409a;
            if (serializable instanceof String) {
                return JsonToken.f10415f;
            }
            if (serializable instanceof Boolean) {
                return JsonToken.f10417h;
            }
            if (serializable instanceof Number) {
                return JsonToken.f10416g;
            }
            throw new AssertionError();
        }
        if (A02 instanceof com.google.gson.m) {
            return JsonToken.i;
        }
        if (A02 == f24113t) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new MalformedJsonException("Custom JsonElement subclass " + A02.getClass().getName() + " is not supported");
    }

    @Override // r3.C1149a
    public final void t0() {
        int ordinal = k0().ordinal();
        if (ordinal == 1) {
            y();
            return;
        }
        if (ordinal != 9) {
            if (ordinal == 3) {
                A();
                return;
            }
            if (ordinal == 4) {
                z0(true);
                return;
            }
            B0();
            int i = this.f24115q;
            if (i > 0) {
                int[] iArr = this.f24117s;
                int i9 = i - 1;
                iArr[i9] = iArr[i9] + 1;
            }
        }
    }

    @Override // r3.C1149a
    public final String toString() {
        return e.class.getSimpleName() + y0();
    }

    public final void w0(JsonToken jsonToken) {
        if (k0() == jsonToken) {
            return;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + k0() + y0());
    }

    public final String x0(boolean z10) {
        StringBuilder sb2 = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i9 = this.f24115q;
            if (i >= i9) {
                return sb2.toString();
            }
            Object[] objArr = this.f24114p;
            Object obj = objArr[i];
            if (obj instanceof com.google.gson.j) {
                i++;
                if (i < i9 && (objArr[i] instanceof Iterator)) {
                    int i10 = this.f24117s[i];
                    if (z10 && i10 > 0 && (i == i9 - 1 || i == i9 - 2)) {
                        i10--;
                    }
                    sb2.append('[');
                    sb2.append(i10);
                    sb2.append(']');
                }
            } else if ((obj instanceof com.google.gson.n) && (i = i + 1) < i9 && (objArr[i] instanceof Iterator)) {
                sb2.append('.');
                String str = this.f24116r[i];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i++;
        }
    }

    @Override // r3.C1149a
    public final void y() {
        w0(JsonToken.f10411b);
        B0();
        B0();
        int i = this.f24115q;
        if (i > 0) {
            int[] iArr = this.f24117s;
            int i9 = i - 1;
            iArr[i9] = iArr[i9] + 1;
        }
    }

    public final String y0() {
        return " at path " + x0(false);
    }

    public final String z0(boolean z10) {
        w0(JsonToken.f10414e);
        Map.Entry entry = (Map.Entry) ((Iterator) A0()).next();
        String str = (String) entry.getKey();
        this.f24116r[this.f24115q - 1] = z10 ? "<skipped>" : str;
        C0(entry.getValue());
        return str;
    }
}

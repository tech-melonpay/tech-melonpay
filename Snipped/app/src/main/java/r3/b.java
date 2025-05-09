package r3;

import com.google.gson.Strictness;
import com.google.gson.c;
import com.sumsub.sns.internal.core.data.model.p;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* compiled from: JsonWriter.java */
/* loaded from: classes.dex */
public class b implements Closeable, Flushable {

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f26163l = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f26164m = new String[128];

    /* renamed from: n, reason: collision with root package name */
    public static final String[] f26165n;

    /* renamed from: a, reason: collision with root package name */
    public final Writer f26166a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f26167b;

    /* renamed from: c, reason: collision with root package name */
    public int f26168c;

    /* renamed from: d, reason: collision with root package name */
    public c f26169d;

    /* renamed from: e, reason: collision with root package name */
    public String f26170e;

    /* renamed from: f, reason: collision with root package name */
    public String f26171f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f26172g;

    /* renamed from: h, reason: collision with root package name */
    public Strictness f26173h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public String f26174j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f26175k;

    static {
        for (int i = 0; i <= 31; i++) {
            f26164m[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f26164m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f26165n = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        int[] iArr = new int[32];
        this.f26167b = iArr;
        this.f26168c = 0;
        if (iArr.length == 0) {
            this.f26167b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f26167b;
        int i = this.f26168c;
        this.f26168c = i + 1;
        iArr2[i] = 6;
        this.f26173h = Strictness.f10314b;
        this.f26175k = true;
        Objects.requireNonNull(writer, "out == null");
        this.f26166a = writer;
        H(c.f10320d);
    }

    public void A() {
        p('}', 3, 5);
    }

    public void C(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f26174j != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int G8 = G();
        if (G8 != 3 && G8 != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f26174j = str;
    }

    public final void D() {
        if (this.f26172g) {
            return;
        }
        String str = this.f26169d.f10322a;
        Writer writer = this.f26166a;
        writer.write(str);
        int i = this.f26168c;
        for (int i9 = 1; i9 < i; i9++) {
            writer.write(this.f26169d.f10323b);
        }
    }

    public b E() {
        if (this.f26174j != null) {
            if (!this.f26175k) {
                this.f26174j = null;
                return this;
            }
            a0();
        }
        d();
        this.f26166a.write("null");
        return this;
    }

    public final int G() {
        int i = this.f26168c;
        if (i != 0) {
            return this.f26167b[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void H(c cVar) {
        Objects.requireNonNull(cVar);
        this.f26169d = cVar;
        this.f26171f = ",";
        if (cVar.f10324c) {
            this.f26170e = ": ";
            if (cVar.f10322a.isEmpty()) {
                this.f26171f = ", ";
            }
        } else {
            this.f26170e = p.f15541a;
        }
        this.f26172g = this.f26169d.f10322a.isEmpty() && this.f26169d.f10323b.isEmpty();
    }

    public final void M(Strictness strictness) {
        Objects.requireNonNull(strictness);
        this.f26173h = strictness;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = r8.i
            if (r0 == 0) goto L7
            java.lang.String[] r0 = r3.b.f26165n
            goto L9
        L7:
            java.lang.String[] r0 = r3.b.f26164m
        L9:
            java.io.Writer r1 = r8.f26166a
            r2 = 34
            r1.write(r2)
            int r3 = r9.length()
            r4 = 0
            r5 = r4
        L16:
            if (r4 >= r3) goto L41
            char r6 = r9.charAt(r4)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L25
            r6 = r0[r6]
            if (r6 != 0) goto L32
            goto L3e
        L25:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L2c
            java.lang.String r6 = "\\u2028"
            goto L32
        L2c:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L3e
            java.lang.String r6 = "\\u2029"
        L32:
            if (r5 >= r4) goto L39
            int r7 = r4 - r5
            r1.write(r9, r5, r7)
        L39:
            r1.write(r6)
            int r5 = r4 + 1
        L3e:
            int r4 = r4 + 1
            goto L16
        L41:
            if (r5 >= r3) goto L47
            int r3 = r3 - r5
            r1.write(r9, r5, r3)
        L47:
            r1.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.b.N(java.lang.String):void");
    }

    public void P(double d10) {
        a0();
        if (this.f26173h == Strictness.f10313a || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            d();
            this.f26166a.append((CharSequence) Double.toString(d10));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        }
    }

    public void Q(long j10) {
        a0();
        d();
        this.f26166a.write(Long.toString(j10));
    }

    public void T(Boolean bool) {
        if (bool == null) {
            E();
            return;
        }
        a0();
        d();
        this.f26166a.write(bool.booleanValue() ? "true" : "false");
    }

    public void V(Number number) {
        if (number == null) {
            E();
            return;
        }
        a0();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !f26163l.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (this.f26173h != Strictness.f10313a) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(obj));
        }
        d();
        this.f26166a.append((CharSequence) obj);
    }

    public void W(String str) {
        if (str == null) {
            E();
            return;
        }
        a0();
        d();
        N(str);
    }

    public void Y(boolean z10) {
        a0();
        d();
        this.f26166a.write(z10 ? "true" : "false");
    }

    public final void a0() {
        if (this.f26174j != null) {
            int G8 = G();
            if (G8 == 5) {
                this.f26166a.write(this.f26171f);
            } else if (G8 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            D();
            this.f26167b[this.f26168c - 1] = 4;
            N(this.f26174j);
            this.f26174j = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f26166a.close();
        int i = this.f26168c;
        if (i > 1 || (i == 1 && this.f26167b[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f26168c = 0;
    }

    public final void d() {
        int G8 = G();
        if (G8 == 1) {
            this.f26167b[this.f26168c - 1] = 2;
            D();
            return;
        }
        Writer writer = this.f26166a;
        if (G8 == 2) {
            writer.append((CharSequence) this.f26171f);
            D();
        } else {
            if (G8 == 4) {
                writer.append((CharSequence) this.f26170e);
                this.f26167b[this.f26168c - 1] = 5;
                return;
            }
            if (G8 != 6) {
                if (G8 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f26173h != Strictness.f10313a) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f26167b[this.f26168c - 1] = 7;
        }
    }

    public void flush() {
        if (this.f26168c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f26166a.flush();
    }

    public void i() {
        a0();
        d();
        int i = this.f26168c;
        int[] iArr = this.f26167b;
        if (i == iArr.length) {
            this.f26167b = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f26167b;
        int i9 = this.f26168c;
        this.f26168c = i9 + 1;
        iArr2[i9] = 1;
        this.f26166a.write(91);
    }

    public void j() {
        a0();
        d();
        int i = this.f26168c;
        int[] iArr = this.f26167b;
        if (i == iArr.length) {
            this.f26167b = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f26167b;
        int i9 = this.f26168c;
        this.f26168c = i9 + 1;
        iArr2[i9] = 3;
        this.f26166a.write(123);
    }

    public final void p(char c2, int i, int i9) {
        int G8 = G();
        if (G8 != i9 && G8 != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f26174j != null) {
            throw new IllegalStateException("Dangling name: " + this.f26174j);
        }
        this.f26168c--;
        if (G8 == i9) {
            D();
        }
        this.f26166a.write(c2);
    }

    public void y() {
        p(']', 1, 2);
    }
}

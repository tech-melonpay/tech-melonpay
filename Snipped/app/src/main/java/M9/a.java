package M9;

import com.sumsub.sns.internal.core.data.model.p;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* compiled from: JsonWriter.java */
/* loaded from: classes2.dex */
public class a implements Closeable, Flushable {

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f2729h = new String[128];

    /* renamed from: a, reason: collision with root package name */
    public final Writer f2730a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f2731b;

    /* renamed from: c, reason: collision with root package name */
    public int f2732c;

    /* renamed from: d, reason: collision with root package name */
    public String f2733d;

    /* renamed from: e, reason: collision with root package name */
    public String f2734e;

    /* renamed from: f, reason: collision with root package name */
    public String f2735f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2736g;

    static {
        for (int i = 0; i <= 31; i++) {
            f2729h[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f2729h;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public a(Writer writer) {
        int[] iArr = new int[32];
        this.f2731b = iArr;
        this.f2732c = 0;
        if (iArr.length == 0) {
            this.f2731b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f2731b;
        int i = this.f2732c;
        this.f2732c = i + 1;
        iArr2[i] = 6;
        this.f2734e = p.f15541a;
        this.f2736g = true;
        this.f2730a = writer;
    }

    public final void A() {
        if (this.f2735f != null) {
            if (!this.f2736g) {
                this.f2735f = null;
                return;
            }
            N();
        }
        d();
        this.f2730a.write("null");
    }

    public final int C() {
        int i = this.f2732c;
        if (i != 0) {
            return this.f2731b[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String[] r0 = M9.a.f2729h
            java.io.Writer r1 = r8.f2730a
            r2 = 34
            r1.write(r2)
            int r3 = r9.length()
            r4 = 0
            r5 = r4
        Lf:
            if (r4 >= r3) goto L3a
            char r6 = r9.charAt(r4)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L1e
            r6 = r0[r6]
            if (r6 != 0) goto L2b
            goto L37
        L1e:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L25
            java.lang.String r6 = "\\u2028"
            goto L2b
        L25:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L37
            java.lang.String r6 = "\\u2029"
        L2b:
            if (r5 >= r4) goto L32
            int r7 = r4 - r5
            r1.write(r9, r5, r7)
        L32:
            r1.write(r6)
            int r5 = r4 + 1
        L37:
            int r4 = r4 + 1
            goto Lf
        L3a:
            if (r5 >= r3) goto L40
            int r3 = r3 - r5
            r1.write(r9, r5, r3)
        L40:
            r1.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: M9.a.D(java.lang.String):void");
    }

    public final void E(Boolean bool) {
        if (bool == null) {
            A();
            return;
        }
        N();
        d();
        this.f2730a.write(bool.booleanValue() ? "true" : "false");
    }

    public final void G(Number number) {
        if (number == null) {
            A();
            return;
        }
        N();
        String obj = number.toString();
        if (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN")) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        d();
        this.f2730a.append((CharSequence) obj);
    }

    public final void H(String str) {
        if (str == null) {
            A();
            return;
        }
        N();
        d();
        D(str);
    }

    public final void M(boolean z10) {
        N();
        d();
        this.f2730a.write(z10 ? "true" : "false");
    }

    public final void N() {
        if (this.f2735f != null) {
            int C10 = C();
            if (C10 == 5) {
                this.f2730a.write(44);
            } else if (C10 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            y();
            this.f2731b[this.f2732c - 1] = 4;
            D(this.f2735f);
            this.f2735f = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2730a.close();
        int i = this.f2732c;
        if (i > 1 || (i == 1 && this.f2731b[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f2732c = 0;
    }

    public final void d() {
        int C10 = C();
        if (C10 == 1) {
            this.f2731b[this.f2732c - 1] = 2;
            y();
            return;
        }
        Writer writer = this.f2730a;
        if (C10 == 2) {
            writer.append(',');
            y();
        } else if (C10 == 4) {
            writer.append((CharSequence) this.f2734e);
            this.f2731b[this.f2732c - 1] = 5;
        } else if (C10 == 6) {
            this.f2731b[this.f2732c - 1] = 7;
        } else {
            if (C10 != 7) {
                throw new IllegalStateException("Nesting problem.");
            }
            throw new IllegalStateException("JSON must have only one top-level value.");
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f2732c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f2730a.flush();
    }

    public final void i() {
        N();
        d();
        int i = this.f2732c;
        int[] iArr = this.f2731b;
        if (i == iArr.length) {
            this.f2731b = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f2731b;
        int i9 = this.f2732c;
        this.f2732c = i9 + 1;
        iArr2[i9] = 3;
        this.f2730a.write(123);
    }

    public final void j(char c2, int i, int i9) {
        int C10 = C();
        if (C10 != i9 && C10 != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f2735f != null) {
            throw new IllegalStateException("Dangling name: " + this.f2735f);
        }
        this.f2732c--;
        if (C10 == i9) {
            y();
        }
        this.f2730a.write(c2);
    }

    public final void p() {
        j('}', 3, 5);
    }

    public final void y() {
        if (this.f2733d == null) {
            return;
        }
        Writer writer = this.f2730a;
        writer.write(10);
        int i = this.f2732c;
        for (int i9 = 1; i9 < i; i9++) {
            writer.write(this.f2733d);
        }
    }
}

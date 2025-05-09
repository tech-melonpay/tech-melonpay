package n3;

import com.google.gson.Strictness;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: JsonTreeWriter.java */
/* loaded from: classes.dex */
public final class f extends r3.b {

    /* renamed from: r, reason: collision with root package name */
    public static final a f24118r = new a();

    /* renamed from: s, reason: collision with root package name */
    public static final com.google.gson.o f24119s = new com.google.gson.o("closed");

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f24120o;

    /* renamed from: p, reason: collision with root package name */
    public String f24121p;

    /* renamed from: q, reason: collision with root package name */
    public com.google.gson.l f24122q;

    /* compiled from: JsonTreeWriter.java */
    public class a extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i, int i9) {
            throw new AssertionError();
        }
    }

    public f() {
        super(f24118r);
        this.f24120o = new ArrayList();
        this.f24122q = com.google.gson.m.f10407a;
    }

    @Override // r3.b
    public final void A() {
        ArrayList arrayList = this.f24120o;
        if (arrayList.isEmpty() || this.f24121p != null) {
            throw new IllegalStateException();
        }
        if (!(d0() instanceof com.google.gson.n)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // r3.b
    public final void C(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f24120o.isEmpty() || this.f24121p != null) {
            throw new IllegalStateException("Did not expect a name");
        }
        if (!(d0() instanceof com.google.gson.n)) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f24121p = str;
    }

    @Override // r3.b
    public final r3.b E() {
        g0(com.google.gson.m.f10407a);
        return this;
    }

    @Override // r3.b
    public final void P(double d10) {
        if (this.f26173h == Strictness.f10313a || (!Double.isNaN(d10) && !Double.isInfinite(d10))) {
            g0(new com.google.gson.o(Double.valueOf(d10)));
        } else {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d10);
        }
    }

    @Override // r3.b
    public final void Q(long j10) {
        g0(new com.google.gson.o(Long.valueOf(j10)));
    }

    @Override // r3.b
    public final void T(Boolean bool) {
        if (bool == null) {
            g0(com.google.gson.m.f10407a);
        } else {
            g0(new com.google.gson.o(bool));
        }
    }

    @Override // r3.b
    public final void V(Number number) {
        if (number == null) {
            g0(com.google.gson.m.f10407a);
            return;
        }
        if (this.f26173h != Strictness.f10313a) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        g0(new com.google.gson.o(number));
    }

    @Override // r3.b
    public final void W(String str) {
        if (str == null) {
            g0(com.google.gson.m.f10407a);
        } else {
            g0(new com.google.gson.o(str));
        }
    }

    @Override // r3.b
    public final void Y(boolean z10) {
        g0(new com.google.gson.o(Boolean.valueOf(z10)));
    }

    @Override // r3.b, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = this.f24120o;
        if (!arrayList.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        arrayList.add(f24119s);
    }

    public final com.google.gson.l d0() {
        return (com.google.gson.l) com.google.android.gms.measurement.internal.a.f(1, this.f24120o);
    }

    public final void g0(com.google.gson.l lVar) {
        if (this.f24121p != null) {
            lVar.getClass();
            if (!(lVar instanceof com.google.gson.m) || this.f26175k) {
                com.google.gson.n nVar = (com.google.gson.n) d0();
                nVar.f10408a.put(this.f24121p, lVar);
            }
            this.f24121p = null;
            return;
        }
        if (this.f24120o.isEmpty()) {
            this.f24122q = lVar;
            return;
        }
        com.google.gson.l d02 = d0();
        if (!(d02 instanceof com.google.gson.j)) {
            throw new IllegalStateException();
        }
        com.google.gson.j jVar = (com.google.gson.j) d02;
        if (lVar == null) {
            jVar.getClass();
            lVar = com.google.gson.m.f10407a;
        }
        jVar.f10406a.add(lVar);
    }

    @Override // r3.b
    public final void i() {
        com.google.gson.j jVar = new com.google.gson.j();
        g0(jVar);
        this.f24120o.add(jVar);
    }

    @Override // r3.b
    public final void j() {
        com.google.gson.n nVar = new com.google.gson.n();
        g0(nVar);
        this.f24120o.add(nVar);
    }

    @Override // r3.b
    public final void y() {
        ArrayList arrayList = this.f24120o;
        if (arrayList.isEmpty() || this.f24121p != null) {
            throw new IllegalStateException();
        }
        if (!(d0() instanceof com.google.gson.j)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // r3.b, java.io.Flushable
    public final void flush() {
    }
}

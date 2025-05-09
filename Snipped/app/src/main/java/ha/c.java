package Ha;

import U8.l;
import android.graphics.Typeface;
import java.util.List;
import kotlin.jvm.internal.h;
import kotlinx.serialization.SerializationException;
import na.InterfaceC1077a;
import na.InterfaceC1078b;
import pa.f;
import qa.InterfaceC1142b;
import qa.InterfaceC1144d;
import ra.c0;

/* compiled from: CertificateChainCleaner.kt */
/* loaded from: classes2.dex */
public abstract class c implements InterfaceC1144d, InterfaceC1142b {
    public static int F(int i, int i9) {
        return (i & 16777215) | (i9 << 24);
    }

    @Override // qa.InterfaceC1144d
    public abstract short A();

    @Override // qa.InterfaceC1144d
    public float B() {
        H();
        throw null;
    }

    @Override // qa.InterfaceC1142b
    public Object C(f fVar, int i, InterfaceC1077a interfaceC1077a, Object obj) {
        return x(interfaceC1077a);
    }

    @Override // qa.InterfaceC1142b
    public Object D(f fVar, int i, InterfaceC1078b interfaceC1078b, Object obj) {
        if (interfaceC1078b.getDescriptor().c() || t()) {
            return x(interfaceC1078b);
        }
        return null;
    }

    @Override // qa.InterfaceC1144d
    public double E() {
        H();
        throw null;
    }

    public abstract List G(String str, List list);

    public void H() {
        throw new SerializationException(h.a(getClass()) + " can't retrieve untyped values");
    }

    public abstract void I(int i);

    public abstract void J(Typeface typeface, boolean z10);

    public abstract void K(l lVar, Y8.h hVar);

    public abstract Y8.l L(String str);

    public abstract void M(int i, int i9, byte[] bArr);

    @Override // qa.InterfaceC1142b
    public int d(f fVar, int i) {
        return n();
    }

    @Override // qa.InterfaceC1144d
    public boolean e() {
        H();
        throw null;
    }

    @Override // qa.InterfaceC1144d
    public char f() {
        H();
        throw null;
    }

    @Override // qa.InterfaceC1142b
    public InterfaceC1144d g(c0 c0Var, int i) {
        return o(c0Var.i(i));
    }

    @Override // qa.InterfaceC1142b
    public long h(c0 c0Var, int i) {
        return r();
    }

    @Override // qa.InterfaceC1144d
    public int i(f fVar) {
        H();
        throw null;
    }

    @Override // qa.InterfaceC1142b
    public float j(f fVar, int i) {
        return B();
    }

    @Override // qa.InterfaceC1142b
    public byte k(c0 c0Var, int i) {
        return z();
    }

    @Override // qa.InterfaceC1142b
    public short m(c0 c0Var, int i) {
        return A();
    }

    @Override // qa.InterfaceC1144d
    public abstract int n();

    @Override // qa.InterfaceC1144d
    public String p() {
        H();
        throw null;
    }

    @Override // qa.InterfaceC1144d
    public abstract long r();

    @Override // qa.InterfaceC1142b
    public double s(f fVar, int i) {
        return E();
    }

    @Override // qa.InterfaceC1144d
    public boolean t() {
        return true;
    }

    @Override // qa.InterfaceC1142b
    public char u(c0 c0Var, int i) {
        return f();
    }

    @Override // qa.InterfaceC1142b
    public boolean w(f fVar, int i) {
        return e();
    }

    @Override // qa.InterfaceC1144d
    public Object x(InterfaceC1077a interfaceC1077a) {
        return interfaceC1077a.deserialize(this);
    }

    @Override // qa.InterfaceC1142b
    public String y(f fVar, int i) {
        return p();
    }

    @Override // qa.InterfaceC1144d
    public abstract byte z();

    @Override // qa.InterfaceC1142b
    public void b(f fVar) {
    }

    @Override // qa.InterfaceC1144d
    public InterfaceC1142b c(f fVar) {
        return this;
    }

    @Override // qa.InterfaceC1144d
    public InterfaceC1144d o(f fVar) {
        return this;
    }
}

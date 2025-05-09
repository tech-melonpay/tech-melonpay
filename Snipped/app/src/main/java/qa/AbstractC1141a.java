package qa;

import kotlin.jvm.internal.h;
import kotlinx.serialization.SerializationException;
import na.InterfaceC1078b;
import na.InterfaceC1081e;
import pa.f;
import ra.c0;

/* compiled from: AbstractEncoder.kt */
/* renamed from: qa.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1141a implements InterfaceC1145e, InterfaceC1143c {
    @Override // qa.InterfaceC1143c
    public final InterfaceC1145e A(c0 c0Var, int i) {
        G(c0Var, i);
        return z(c0Var.i(i));
    }

    @Override // qa.InterfaceC1145e
    public void B(long j10) {
        H(Long.valueOf(j10));
    }

    @Override // qa.InterfaceC1143c
    public final <T> void C(f fVar, int i, InterfaceC1081e<? super T> interfaceC1081e, T t3) {
        G(fVar, i);
        s(interfaceC1081e, t3);
    }

    @Override // qa.InterfaceC1143c
    public boolean D() {
        return true;
    }

    @Override // qa.InterfaceC1143c
    public final void E(c0 c0Var, int i, byte b9) {
        G(c0Var, i);
        i(b9);
    }

    @Override // qa.InterfaceC1145e
    public void F(String str) {
        H(str);
    }

    public void H(Object obj) {
        throw new SerializationException("Non-serializable " + h.a(obj.getClass()) + " is not supported by " + h.a(getClass()) + " encoder");
    }

    @Override // qa.InterfaceC1143c
    public final void d(c0 c0Var, int i, char c2) {
        G(c0Var, i);
        q(c2);
    }

    @Override // qa.InterfaceC1143c
    public void e(f fVar, int i, InterfaceC1078b interfaceC1078b, Object obj) {
        G(fVar, i);
        if (interfaceC1078b.getDescriptor().c()) {
            s(interfaceC1078b, obj);
        } else if (obj == null) {
            f();
        } else {
            s(interfaceC1078b, obj);
        }
    }

    @Override // qa.InterfaceC1145e
    public void f() {
        throw new SerializationException("'null' is not supported by default");
    }

    @Override // qa.InterfaceC1145e
    public void g(double d10) {
        H(Double.valueOf(d10));
    }

    @Override // qa.InterfaceC1145e
    public void h(short s10) {
        H(Short.valueOf(s10));
    }

    @Override // qa.InterfaceC1145e
    public void i(byte b9) {
        H(Byte.valueOf(b9));
    }

    @Override // qa.InterfaceC1143c
    public final void j(f fVar, int i, double d10) {
        G(fVar, i);
        g(d10);
    }

    @Override // qa.InterfaceC1145e
    public void k(boolean z10) {
        H(Boolean.valueOf(z10));
    }

    @Override // qa.InterfaceC1145e
    public void l(f fVar, int i) {
        H(Integer.valueOf(i));
    }

    @Override // qa.InterfaceC1143c
    public final void m(int i, int i9, f fVar) {
        G(fVar, i);
        y(i9);
    }

    @Override // qa.InterfaceC1143c
    public final void n(f fVar, int i, float f10) {
        G(fVar, i);
        p(f10);
    }

    @Override // qa.InterfaceC1143c
    public final void o(c0 c0Var, int i, short s10) {
        G(c0Var, i);
        h(s10);
    }

    @Override // qa.InterfaceC1145e
    public void p(float f10) {
        H(Float.valueOf(f10));
    }

    @Override // qa.InterfaceC1145e
    public void q(char c2) {
        H(Character.valueOf(c2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qa.InterfaceC1145e
    public <T> void s(InterfaceC1081e<? super T> interfaceC1081e, T t3) {
        interfaceC1081e.serialize(this, t3);
    }

    @Override // qa.InterfaceC1143c
    public final void t(c0 c0Var, int i, long j10) {
        G(c0Var, i);
        B(j10);
    }

    @Override // qa.InterfaceC1145e
    public final InterfaceC1143c u(f fVar) {
        return c(fVar);
    }

    @Override // qa.InterfaceC1143c
    public final void v(f fVar, int i, boolean z10) {
        G(fVar, i);
        k(z10);
    }

    @Override // qa.InterfaceC1143c
    public final void x(f fVar, int i, String str) {
        G(fVar, i);
        F(str);
    }

    @Override // qa.InterfaceC1145e
    public void y(int i) {
        H(Integer.valueOf(i));
    }

    @Override // qa.InterfaceC1145e
    public final void r() {
    }

    @Override // qa.InterfaceC1143c
    public void b(f fVar) {
    }

    @Override // qa.InterfaceC1145e
    public InterfaceC1143c c(f fVar) {
        return this;
    }

    @Override // qa.InterfaceC1145e
    public InterfaceC1145e z(f fVar) {
        return this;
    }

    public void G(f fVar, int i) {
    }
}

package ra;

import java.util.ArrayList;
import kotlinx.serialization.SerializationException;
import na.InterfaceC1078b;
import na.InterfaceC1081e;
import qa.InterfaceC1143c;
import qa.InterfaceC1145e;

/* compiled from: Tagged.kt */
/* loaded from: classes2.dex */
public abstract class V implements InterfaceC1145e, InterfaceC1143c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<String> f26372a = new ArrayList<>();

    @Override // qa.InterfaceC1143c
    public final InterfaceC1145e A(c0 c0Var, int i) {
        return N(T(c0Var, i), c0Var.i(i));
    }

    @Override // qa.InterfaceC1145e
    public final void B(long j10) {
        P(j10, U());
    }

    @Override // qa.InterfaceC1143c
    public final <T> void C(pa.f fVar, int i, InterfaceC1081e<? super T> interfaceC1081e, T t3) {
        this.f26372a.add(T(fVar, i));
        s(interfaceC1081e, t3);
    }

    @Override // qa.InterfaceC1143c
    public final void E(c0 c0Var, int i, byte b9) {
        I(T(c0Var, i), b9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qa.InterfaceC1145e
    public final void F(String str) {
        R(U(), str);
    }

    public abstract String G(pa.f fVar, int i);

    public abstract void H(String str, boolean z10);

    public abstract void I(String str, byte b9);

    public abstract void J(String str, char c2);

    public abstract void K(String str, double d10);

    public abstract void L(String str, pa.f fVar, int i);

    public abstract void M(String str, float f10);

    public abstract InterfaceC1145e N(String str, pa.f fVar);

    public abstract void O(int i, Object obj);

    public abstract void P(long j10, Object obj);

    public abstract void Q(short s10, Object obj);

    public abstract void R(String str, String str2);

    public abstract void S();

    public final String T(pa.f fVar, int i) {
        String G8 = G(fVar, i);
        return G8;
    }

    public final String U() {
        ArrayList<String> arrayList = this.f26372a;
        if (!arrayList.isEmpty()) {
            return arrayList.remove(P9.m.p(arrayList));
        }
        throw new SerializationException("No tag in stack for requested element");
    }

    @Override // qa.InterfaceC1143c
    public final void b(pa.f fVar) {
        if (!this.f26372a.isEmpty()) {
            U();
        }
        S();
    }

    @Override // qa.InterfaceC1143c
    public final void d(c0 c0Var, int i, char c2) {
        J(T(c0Var, i), c2);
    }

    @Override // qa.InterfaceC1143c
    public void e(pa.f fVar, int i, InterfaceC1078b interfaceC1078b, Object obj) {
        this.f26372a.add(T(fVar, i));
        if (interfaceC1078b.getDescriptor().c()) {
            s(interfaceC1078b, obj);
        } else if (obj == null) {
            f();
        } else {
            s(interfaceC1078b, obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qa.InterfaceC1145e
    public final void g(double d10) {
        K(U(), d10);
    }

    @Override // qa.InterfaceC1145e
    public final void h(short s10) {
        Q(s10, U());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qa.InterfaceC1145e
    public final void i(byte b9) {
        I(U(), b9);
    }

    @Override // qa.InterfaceC1143c
    public final void j(pa.f fVar, int i, double d10) {
        K(T(fVar, i), d10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qa.InterfaceC1145e
    public final void k(boolean z10) {
        H(U(), z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qa.InterfaceC1145e
    public final void l(pa.f fVar, int i) {
        L(U(), fVar, i);
    }

    @Override // qa.InterfaceC1143c
    public final void m(int i, int i9, pa.f fVar) {
        O(i9, T(fVar, i));
    }

    @Override // qa.InterfaceC1143c
    public final void n(pa.f fVar, int i, float f10) {
        M(T(fVar, i), f10);
    }

    @Override // qa.InterfaceC1143c
    public final void o(c0 c0Var, int i, short s10) {
        Q(s10, T(c0Var, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qa.InterfaceC1145e
    public final void p(float f10) {
        M(U(), f10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qa.InterfaceC1145e
    public final void q(char c2) {
        J(U(), c2);
    }

    @Override // qa.InterfaceC1145e
    public abstract <T> void s(InterfaceC1081e<? super T> interfaceC1081e, T t3);

    @Override // qa.InterfaceC1143c
    public final void t(c0 c0Var, int i, long j10) {
        P(j10, T(c0Var, i));
    }

    @Override // qa.InterfaceC1145e
    public final InterfaceC1143c u(pa.f fVar) {
        return c(fVar);
    }

    @Override // qa.InterfaceC1143c
    public final void v(pa.f fVar, int i, boolean z10) {
        H(T(fVar, i), z10);
    }

    @Override // qa.InterfaceC1143c
    public final void x(pa.f fVar, int i, String str) {
        R(T(fVar, i), str);
    }

    @Override // qa.InterfaceC1145e
    public final void y(int i) {
        O(i, U());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qa.InterfaceC1145e
    public InterfaceC1145e z(pa.f fVar) {
        return N(U(), fVar);
    }
}

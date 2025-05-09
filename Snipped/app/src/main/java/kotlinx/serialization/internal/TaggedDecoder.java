package kotlinx.serialization.internal;

import P9.m;
import ca.InterfaceC0635a;
import java.util.ArrayList;
import na.InterfaceC1077a;
import na.InterfaceC1078b;
import pa.f;
import qa.InterfaceC1142b;
import qa.InterfaceC1144d;
import ra.c0;

/* compiled from: Tagged.kt */
/* loaded from: classes2.dex */
public abstract class TaggedDecoder<Tag> implements InterfaceC1144d, InterfaceC1142b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<Tag> f23349a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public boolean f23350b;

    @Override // qa.InterfaceC1144d
    public final short A() {
        return O(R());
    }

    @Override // qa.InterfaceC1144d
    public final float B() {
        return K(R());
    }

    @Override // qa.InterfaceC1142b
    public final <T> T C(f fVar, int i, final InterfaceC1077a<? extends T> interfaceC1077a, final T t3) {
        String Q4 = Q(fVar, i);
        InterfaceC0635a<T> interfaceC0635a = new InterfaceC0635a<T>(this) { // from class: kotlinx.serialization.internal.TaggedDecoder$decodeSerializableElement$1

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ TaggedDecoder<Tag> f23354l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f23354l = this;
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return (T) this.f23354l.x(interfaceC1077a);
            }
        };
        this.f23349a.add(Q4);
        T t10 = (T) interfaceC0635a.invoke();
        if (!this.f23350b) {
            R();
        }
        this.f23350b = false;
        return t10;
    }

    @Override // qa.InterfaceC1142b
    public final Object D(f fVar, int i, final InterfaceC1078b interfaceC1078b, final Object obj) {
        String Q4 = Q(fVar, i);
        InterfaceC0635a<Object> interfaceC0635a = new InterfaceC0635a<Object>() { // from class: kotlinx.serialization.internal.TaggedDecoder$decodeNullableSerializableElement$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                InterfaceC1077a<Object> interfaceC1077a = interfaceC1078b;
                boolean c2 = interfaceC1077a.getDescriptor().c();
                TaggedDecoder<Object> taggedDecoder = TaggedDecoder.this;
                if (c2 || taggedDecoder.t()) {
                    return taggedDecoder.x(interfaceC1077a);
                }
                return null;
            }
        };
        this.f23349a.add(Q4);
        Object invoke = interfaceC0635a.invoke();
        if (!this.f23350b) {
            R();
        }
        this.f23350b = false;
        return invoke;
    }

    @Override // qa.InterfaceC1144d
    public final double E() {
        return I(R());
    }

    public abstract boolean F(Tag tag);

    public abstract byte G(Tag tag);

    public abstract char H(Tag tag);

    public abstract double I(Tag tag);

    public abstract int J(Tag tag, f fVar);

    public abstract float K(Tag tag);

    public abstract InterfaceC1144d L(Tag tag, f fVar);

    public abstract int M(Tag tag);

    public abstract long N(Tag tag);

    public abstract short O(Tag tag);

    public abstract String P(Tag tag);

    public abstract String Q(f fVar, int i);

    public final Tag R() {
        ArrayList<Tag> arrayList = this.f23349a;
        Tag remove = arrayList.remove(m.p(arrayList));
        this.f23350b = true;
        return remove;
    }

    @Override // qa.InterfaceC1142b
    public final int d(f fVar, int i) {
        return M(Q(fVar, i));
    }

    @Override // qa.InterfaceC1144d
    public final boolean e() {
        return F(R());
    }

    @Override // qa.InterfaceC1144d
    public final char f() {
        return H(R());
    }

    @Override // qa.InterfaceC1142b
    public final InterfaceC1144d g(c0 c0Var, int i) {
        return L(Q(c0Var, i), c0Var.i(i));
    }

    @Override // qa.InterfaceC1142b
    public final long h(c0 c0Var, int i) {
        return N(Q(c0Var, i));
    }

    @Override // qa.InterfaceC1144d
    public final int i(f fVar) {
        return J(R(), fVar);
    }

    @Override // qa.InterfaceC1142b
    public final float j(f fVar, int i) {
        return K(Q(fVar, i));
    }

    @Override // qa.InterfaceC1142b
    public final byte k(c0 c0Var, int i) {
        return G(Q(c0Var, i));
    }

    @Override // qa.InterfaceC1142b
    public final short m(c0 c0Var, int i) {
        return O(Q(c0Var, i));
    }

    @Override // qa.InterfaceC1144d
    public final int n() {
        return M(R());
    }

    @Override // qa.InterfaceC1144d
    public InterfaceC1144d o(f fVar) {
        return L(R(), fVar);
    }

    @Override // qa.InterfaceC1144d
    public final String p() {
        return P(R());
    }

    @Override // qa.InterfaceC1144d
    public final long r() {
        return N(R());
    }

    @Override // qa.InterfaceC1142b
    public final double s(f fVar, int i) {
        return I(Q(fVar, i));
    }

    @Override // qa.InterfaceC1142b
    public final char u(c0 c0Var, int i) {
        return H(Q(c0Var, i));
    }

    @Override // qa.InterfaceC1142b
    public final boolean w(f fVar, int i) {
        return F(Q(fVar, i));
    }

    @Override // qa.InterfaceC1144d
    public abstract <T> T x(InterfaceC1077a<? extends T> interfaceC1077a);

    @Override // qa.InterfaceC1142b
    public final String y(f fVar, int i) {
        return P(Q(fVar, i));
    }

    @Override // qa.InterfaceC1144d
    public final byte z() {
        return G(R());
    }
}

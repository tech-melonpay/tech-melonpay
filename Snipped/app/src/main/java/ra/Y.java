package ra;

import na.InterfaceC1078b;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;

/* compiled from: NullableSerializer.kt */
/* loaded from: classes2.dex */
public final class Y<T> implements InterfaceC1078b<T> {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1078b<T> f26378a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f26379b;

    public Y(InterfaceC1078b<T> interfaceC1078b) {
        this.f26378a = interfaceC1078b;
        this.f26379b = new h0(interfaceC1078b.getDescriptor());
    }

    @Override // na.InterfaceC1077a
    public final T deserialize(InterfaceC1144d interfaceC1144d) {
        if (interfaceC1144d.t()) {
            return (T) interfaceC1144d.x(this.f26378a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Y.class == obj.getClass() && kotlin.jvm.internal.f.b(this.f26378a, ((Y) obj).f26378a);
    }

    @Override // na.InterfaceC1081e, na.InterfaceC1077a
    public final pa.f getDescriptor() {
        return this.f26379b;
    }

    public final int hashCode() {
        return this.f26378a.hashCode();
    }

    @Override // na.InterfaceC1081e
    public final void serialize(InterfaceC1145e interfaceC1145e, T t3) {
        if (t3 == null) {
            interfaceC1145e.f();
        } else {
            interfaceC1145e.r();
            interfaceC1145e.s(this.f26378a, t3);
        }
    }
}

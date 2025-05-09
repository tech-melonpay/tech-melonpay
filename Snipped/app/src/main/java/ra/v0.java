package ra;

import na.InterfaceC1078b;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;

/* compiled from: ValueClasses.kt */
/* loaded from: classes2.dex */
public final class v0 implements InterfaceC1078b<O9.k> {

    /* renamed from: a, reason: collision with root package name */
    public static final v0 f26442a = new v0();

    /* renamed from: b, reason: collision with root package name */
    public static final C1165D f26443b = a0.a("kotlin.ULong", O.f26364a);

    @Override // na.InterfaceC1077a
    public final Object deserialize(InterfaceC1144d interfaceC1144d) {
        return new O9.k(interfaceC1144d.o(f26443b).r());
    }

    @Override // na.InterfaceC1081e, na.InterfaceC1077a
    public final pa.f getDescriptor() {
        return f26443b;
    }

    @Override // na.InterfaceC1081e
    public final void serialize(InterfaceC1145e interfaceC1145e, Object obj) {
        interfaceC1145e.z(f26443b).B(((O9.k) obj).f3025a);
    }
}

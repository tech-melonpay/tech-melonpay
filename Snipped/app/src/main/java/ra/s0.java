package ra;

import na.InterfaceC1078b;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;

/* compiled from: ValueClasses.kt */
/* loaded from: classes2.dex */
public final class s0 implements InterfaceC1078b<O9.i> {

    /* renamed from: a, reason: collision with root package name */
    public static final s0 f26432a = new s0();

    /* renamed from: b, reason: collision with root package name */
    public static final C1165D f26433b = a0.a("kotlin.UInt", H.f26353a);

    @Override // na.InterfaceC1077a
    public final Object deserialize(InterfaceC1144d interfaceC1144d) {
        return new O9.i(interfaceC1144d.o(f26433b).n());
    }

    @Override // na.InterfaceC1081e, na.InterfaceC1077a
    public final pa.f getDescriptor() {
        return f26433b;
    }

    @Override // na.InterfaceC1081e
    public final void serialize(InterfaceC1145e interfaceC1145e, Object obj) {
        interfaceC1145e.z(f26433b).y(((O9.i) obj).f3021a);
    }
}

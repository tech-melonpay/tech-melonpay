package ra;

import na.InterfaceC1078b;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;

/* compiled from: ValueClasses.kt */
/* loaded from: classes2.dex */
public final class y0 implements InterfaceC1078b<O9.n> {

    /* renamed from: a, reason: collision with root package name */
    public static final y0 f26455a = new y0();

    /* renamed from: b, reason: collision with root package name */
    public static final C1165D f26456b = a0.a("kotlin.UShort", l0.f26411a);

    @Override // na.InterfaceC1077a
    public final Object deserialize(InterfaceC1144d interfaceC1144d) {
        return new O9.n(interfaceC1144d.o(f26456b).A());
    }

    @Override // na.InterfaceC1081e, na.InterfaceC1077a
    public final pa.f getDescriptor() {
        return f26456b;
    }

    @Override // na.InterfaceC1081e
    public final void serialize(InterfaceC1145e interfaceC1145e, Object obj) {
        interfaceC1145e.z(f26456b).h(((O9.n) obj).f3030a);
    }
}

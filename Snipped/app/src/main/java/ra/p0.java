package ra;

import na.InterfaceC1078b;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;

/* compiled from: ValueClasses.kt */
/* loaded from: classes2.dex */
public final class p0 implements InterfaceC1078b<O9.g> {

    /* renamed from: a, reason: collision with root package name */
    public static final p0 f26424a = new p0();

    /* renamed from: b, reason: collision with root package name */
    public static final C1165D f26425b = a0.a("kotlin.UByte", C1175j.f26405a);

    @Override // na.InterfaceC1077a
    public final Object deserialize(InterfaceC1144d interfaceC1144d) {
        return new O9.g(interfaceC1144d.o(f26425b).z());
    }

    @Override // na.InterfaceC1081e, na.InterfaceC1077a
    public final pa.f getDescriptor() {
        return f26425b;
    }

    @Override // na.InterfaceC1081e
    public final void serialize(InterfaceC1145e interfaceC1145e, Object obj) {
        interfaceC1145e.z(f26425b).i(((O9.g) obj).f3017a);
    }
}

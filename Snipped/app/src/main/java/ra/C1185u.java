package ra;

import na.InterfaceC1078b;
import pa.e;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;

/* compiled from: Primitives.kt */
/* renamed from: ra.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1185u implements InterfaceC1078b<Double> {

    /* renamed from: a, reason: collision with root package name */
    public static final C1185u f26437a = new C1185u();

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f26438b = new e0("kotlin.Double", e.d.f25733a);

    @Override // na.InterfaceC1077a
    public final Object deserialize(InterfaceC1144d interfaceC1144d) {
        return Double.valueOf(interfaceC1144d.E());
    }

    @Override // na.InterfaceC1081e, na.InterfaceC1077a
    public final pa.f getDescriptor() {
        return f26438b;
    }

    @Override // na.InterfaceC1081e
    public final void serialize(InterfaceC1145e interfaceC1145e, Object obj) {
        interfaceC1145e.g(((Number) obj).doubleValue());
    }
}

package ra;

import na.InterfaceC1078b;
import pa.e;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;

/* compiled from: Primitives.kt */
/* loaded from: classes2.dex */
public final class l0 implements InterfaceC1078b<Short> {

    /* renamed from: a, reason: collision with root package name */
    public static final l0 f26411a = new l0();

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f26412b = new e0("kotlin.Short", e.h.f25737a);

    @Override // na.InterfaceC1077a
    public final Object deserialize(InterfaceC1144d interfaceC1144d) {
        return Short.valueOf(interfaceC1144d.A());
    }

    @Override // na.InterfaceC1081e, na.InterfaceC1077a
    public final pa.f getDescriptor() {
        return f26412b;
    }

    @Override // na.InterfaceC1081e
    public final void serialize(InterfaceC1145e interfaceC1145e, Object obj) {
        interfaceC1145e.h(((Number) obj).shortValue());
    }
}

package ra;

import na.InterfaceC1078b;
import pa.e;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;

/* compiled from: Primitives.kt */
/* loaded from: classes2.dex */
public final class H implements InterfaceC1078b<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public static final H f26353a = new H();

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f26354b = new e0("kotlin.Int", e.f.f25735a);

    @Override // na.InterfaceC1077a
    public final Object deserialize(InterfaceC1144d interfaceC1144d) {
        return Integer.valueOf(interfaceC1144d.n());
    }

    @Override // na.InterfaceC1081e, na.InterfaceC1077a
    public final pa.f getDescriptor() {
        return f26354b;
    }

    @Override // na.InterfaceC1081e
    public final void serialize(InterfaceC1145e interfaceC1145e, Object obj) {
        interfaceC1145e.y(((Number) obj).intValue());
    }
}

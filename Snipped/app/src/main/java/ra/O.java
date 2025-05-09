package ra;

import na.InterfaceC1078b;
import pa.e;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;

/* compiled from: Primitives.kt */
/* loaded from: classes2.dex */
public final class O implements InterfaceC1078b<Long> {

    /* renamed from: a, reason: collision with root package name */
    public static final O f26364a = new O();

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f26365b = new e0("kotlin.Long", e.g.f25736a);

    @Override // na.InterfaceC1077a
    public final Object deserialize(InterfaceC1144d interfaceC1144d) {
        return Long.valueOf(interfaceC1144d.r());
    }

    @Override // na.InterfaceC1081e, na.InterfaceC1077a
    public final pa.f getDescriptor() {
        return f26365b;
    }

    @Override // na.InterfaceC1081e
    public final void serialize(InterfaceC1145e interfaceC1145e, Object obj) {
        interfaceC1145e.B(((Number) obj).longValue());
    }
}

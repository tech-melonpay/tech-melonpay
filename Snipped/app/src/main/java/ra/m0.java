package ra;

import na.InterfaceC1078b;
import pa.e;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;

/* compiled from: Primitives.kt */
/* loaded from: classes2.dex */
public final class m0 implements InterfaceC1078b<String> {

    /* renamed from: a, reason: collision with root package name */
    public static final m0 f26414a = new m0();

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f26415b = new e0("kotlin.String", e.i.f25738a);

    @Override // na.InterfaceC1077a
    public final Object deserialize(InterfaceC1144d interfaceC1144d) {
        return interfaceC1144d.p();
    }

    @Override // na.InterfaceC1081e, na.InterfaceC1077a
    public final pa.f getDescriptor() {
        return f26415b;
    }

    @Override // na.InterfaceC1081e
    public final void serialize(InterfaceC1145e interfaceC1145e, Object obj) {
        interfaceC1145e.F((String) obj);
    }
}

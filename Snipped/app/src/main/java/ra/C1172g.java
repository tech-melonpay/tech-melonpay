package ra;

import na.InterfaceC1078b;
import pa.e;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;

/* compiled from: Primitives.kt */
/* renamed from: ra.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1172g implements InterfaceC1078b<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public static final C1172g f26395a = new C1172g();

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f26396b = new e0("kotlin.Boolean", e.a.f25730a);

    @Override // na.InterfaceC1077a
    public final Object deserialize(InterfaceC1144d interfaceC1144d) {
        return Boolean.valueOf(interfaceC1144d.e());
    }

    @Override // na.InterfaceC1081e, na.InterfaceC1077a
    public final pa.f getDescriptor() {
        return f26396b;
    }

    @Override // na.InterfaceC1081e
    public final void serialize(InterfaceC1145e interfaceC1145e, Object obj) {
        interfaceC1145e.k(((Boolean) obj).booleanValue());
    }
}

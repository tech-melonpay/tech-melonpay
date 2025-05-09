package ra;

import na.InterfaceC1078b;
import pa.e;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;

/* compiled from: Primitives.kt */
/* renamed from: ra.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1190z implements InterfaceC1078b<Float> {

    /* renamed from: a, reason: collision with root package name */
    public static final C1190z f26457a = new C1190z();

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f26458b = new e0("kotlin.Float", e.C0450e.f25734a);

    @Override // na.InterfaceC1077a
    public final Object deserialize(InterfaceC1144d interfaceC1144d) {
        return Float.valueOf(interfaceC1144d.B());
    }

    @Override // na.InterfaceC1081e, na.InterfaceC1077a
    public final pa.f getDescriptor() {
        return f26458b;
    }

    @Override // na.InterfaceC1081e
    public final void serialize(InterfaceC1145e interfaceC1145e, Object obj) {
        interfaceC1145e.p(((Number) obj).floatValue());
    }
}

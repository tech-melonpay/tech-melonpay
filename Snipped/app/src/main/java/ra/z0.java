package ra;

import na.InterfaceC1078b;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;

/* compiled from: Primitives.kt */
/* loaded from: classes2.dex */
public final class z0 implements InterfaceC1078b<O9.p> {

    /* renamed from: b, reason: collision with root package name */
    public static final z0 f26459b = new z0();

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.serialization.internal.a<O9.p> f26460a = new kotlinx.serialization.internal.a<>(O9.p.f3034a);

    @Override // na.InterfaceC1077a
    public final Object deserialize(InterfaceC1144d interfaceC1144d) {
        this.f26460a.deserialize(interfaceC1144d);
        return O9.p.f3034a;
    }

    @Override // na.InterfaceC1081e, na.InterfaceC1077a
    public final pa.f getDescriptor() {
        return this.f26460a.getDescriptor();
    }

    @Override // na.InterfaceC1081e
    public final void serialize(InterfaceC1145e interfaceC1145e, Object obj) {
        this.f26460a.serialize(interfaceC1145e, (O9.p) obj);
    }
}

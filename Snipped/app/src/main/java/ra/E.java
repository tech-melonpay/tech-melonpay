package ra;

import na.InterfaceC1078b;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;

/* compiled from: InlineClassDescriptor.kt */
/* loaded from: classes2.dex */
public final class E implements InterfaceC1162A<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1078b<Object> f26349a;

    public E(InterfaceC1078b<Object> interfaceC1078b) {
        this.f26349a = interfaceC1078b;
    }

    @Override // ra.InterfaceC1162A
    public final InterfaceC1078b<?>[] childSerializers() {
        return new InterfaceC1078b[]{this.f26349a};
    }

    @Override // na.InterfaceC1077a
    public final Object deserialize(InterfaceC1144d interfaceC1144d) {
        throw new IllegalStateException("unsupported".toString());
    }

    @Override // na.InterfaceC1081e, na.InterfaceC1077a
    public final pa.f getDescriptor() {
        throw new IllegalStateException("unsupported".toString());
    }

    @Override // na.InterfaceC1081e
    public final void serialize(InterfaceC1145e interfaceC1145e, Object obj) {
        throw new IllegalStateException("unsupported".toString());
    }

    @Override // ra.InterfaceC1162A
    public final InterfaceC1078b<?>[] typeParametersSerializers() {
        return a0.f26382b;
    }
}

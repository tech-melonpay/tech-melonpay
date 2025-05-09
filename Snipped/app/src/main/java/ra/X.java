package ra;

import kotlinx.serialization.SerializationException;
import na.InterfaceC1078b;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;

/* compiled from: BuiltInSerializers.kt */
/* loaded from: classes2.dex */
public final class X implements InterfaceC1078b {

    /* renamed from: a, reason: collision with root package name */
    public static final X f26376a = new X();

    /* renamed from: b, reason: collision with root package name */
    public static final W f26377b = W.f26373a;

    @Override // na.InterfaceC1077a
    public final Object deserialize(InterfaceC1144d interfaceC1144d) {
        throw new SerializationException("'kotlin.Nothing' does not have instances");
    }

    @Override // na.InterfaceC1081e, na.InterfaceC1077a
    public final pa.f getDescriptor() {
        return f26377b;
    }

    @Override // na.InterfaceC1081e
    public final void serialize(InterfaceC1145e interfaceC1145e, Object obj) {
        throw new SerializationException("'kotlin.Nothing' cannot be serialized");
    }
}

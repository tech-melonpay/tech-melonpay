package sa;

import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.descriptors.SerialDescriptorsKt$buildSerialDescriptor$1;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.internal.JsonDecodingException;
import na.InterfaceC1078b;
import pa.C1124b;
import pa.g;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;

/* compiled from: JsonElementSerializers.kt */
/* loaded from: classes2.dex */
public final class o implements InterfaceC1078b<JsonNull> {

    /* renamed from: a, reason: collision with root package name */
    public static final o f27110a = new o();

    /* renamed from: b, reason: collision with root package name */
    public static final SerialDescriptorImpl f27111b;

    static {
        SerialDescriptorImpl c2;
        c2 = kotlinx.serialization.descriptors.a.c("kotlinx.serialization.json.JsonNull", g.b.f25740a, new pa.f[0], SerialDescriptorsKt$buildSerialDescriptor$1.f23308l);
        f27111b = c2;
    }

    @Override // na.InterfaceC1077a
    public final Object deserialize(InterfaceC1144d interfaceC1144d) {
        C1124b.i(interfaceC1144d);
        if (interfaceC1144d.t()) {
            throw new JsonDecodingException("Expected 'null' literal");
        }
        return JsonNull.INSTANCE;
    }

    @Override // na.InterfaceC1081e, na.InterfaceC1077a
    public final pa.f getDescriptor() {
        return f27111b;
    }

    @Override // na.InterfaceC1081e
    public final void serialize(InterfaceC1145e interfaceC1145e, Object obj) {
        C1124b.h(interfaceC1145e);
        interfaceC1145e.f();
    }
}

package sa;

import O9.p;
import ca.InterfaceC0646l;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonPrimitive;
import na.InterfaceC1078b;
import pa.C1123a;
import pa.C1124b;
import pa.e;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;

/* compiled from: JsonElementSerializers.kt */
/* loaded from: classes2.dex */
public final class r implements InterfaceC1078b<JsonPrimitive> {

    /* renamed from: a, reason: collision with root package name */
    public static final r f27118a = new r();

    /* renamed from: b, reason: collision with root package name */
    public static final SerialDescriptorImpl f27119b;

    static {
        SerialDescriptorImpl c2;
        c2 = kotlinx.serialization.descriptors.a.c("kotlinx.serialization.json.JsonPrimitive", e.i.f25738a, new pa.f[0], new InterfaceC0646l<C1123a, O9.p>() { // from class: kotlinx.serialization.descriptors.SerialDescriptorsKt$buildSerialDescriptor$1
            @Override // ca.InterfaceC0646l
            public final /* bridge */ /* synthetic */ p invoke(C1123a c1123a3) {
                return p.f3034a;
            }
        });
        f27119b = c2;
    }

    @Override // na.InterfaceC1077a
    public final Object deserialize(InterfaceC1144d interfaceC1144d) {
        JsonElement l10 = C1124b.i(interfaceC1144d).l();
        if (l10 instanceof JsonPrimitive) {
            return (JsonPrimitive) l10;
        }
        throw C1124b.g(-1, "Unexpected JSON element, expected JsonPrimitive, had " + kotlin.jvm.internal.h.a(l10.getClass()), l10.toString());
    }

    @Override // na.InterfaceC1081e, na.InterfaceC1077a
    public final pa.f getDescriptor() {
        return f27119b;
    }

    @Override // na.InterfaceC1081e
    public final void serialize(InterfaceC1145e interfaceC1145e, Object obj) {
        JsonPrimitive jsonPrimitive = (JsonPrimitive) obj;
        C1124b.h(interfaceC1145e);
        if (jsonPrimitive instanceof JsonNull) {
            interfaceC1145e.s(o.f27110a, JsonNull.INSTANCE);
        } else {
            interfaceC1145e.s(m.f27108a, (l) jsonPrimitive);
        }
    }
}

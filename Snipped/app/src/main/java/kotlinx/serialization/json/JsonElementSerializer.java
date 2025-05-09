package kotlinx.serialization.json;

import O9.p;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.descriptors.a;
import na.InterfaceC1078b;
import pa.C1123a;
import pa.C1124b;
import pa.d;
import pa.f;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;
import sa.C1246c;
import sa.i;
import sa.m;
import sa.o;
import sa.q;
import sa.r;

/* compiled from: JsonElementSerializers.kt */
/* loaded from: classes2.dex */
public final class JsonElementSerializer implements InterfaceC1078b<JsonElement> {

    /* renamed from: a, reason: collision with root package name */
    public static final JsonElementSerializer f23368a = new JsonElementSerializer();

    /* renamed from: b, reason: collision with root package name */
    public static final SerialDescriptorImpl f23369b = a.c("kotlinx.serialization.json.JsonElement", d.b.f25729a, new f[0], new InterfaceC0646l<C1123a, p>() { // from class: kotlinx.serialization.json.JsonElementSerializer$descriptor$1
        @Override // ca.InterfaceC0646l
        public final p invoke(C1123a c1123a) {
            C1123a c1123a2 = c1123a;
            C1123a.a(c1123a2, "JsonPrimitive", new i(new InterfaceC0635a<f>() { // from class: kotlinx.serialization.json.JsonElementSerializer$descriptor$1.1
                @Override // ca.InterfaceC0635a
                public final f invoke() {
                    return r.f27119b;
                }
            }));
            C1123a.a(c1123a2, "JsonNull", new i(new InterfaceC0635a<f>() { // from class: kotlinx.serialization.json.JsonElementSerializer$descriptor$1.2
                @Override // ca.InterfaceC0635a
                public final f invoke() {
                    return o.f27111b;
                }
            }));
            C1123a.a(c1123a2, "JsonLiteral", new i(new InterfaceC0635a<f>() { // from class: kotlinx.serialization.json.JsonElementSerializer$descriptor$1.3
                @Override // ca.InterfaceC0635a
                public final f invoke() {
                    return m.f27109b;
                }
            }));
            C1123a.a(c1123a2, "JsonObject", new i(new InterfaceC0635a<f>() { // from class: kotlinx.serialization.json.JsonElementSerializer$descriptor$1.4
                @Override // ca.InterfaceC0635a
                public final f invoke() {
                    return q.f27114b;
                }
            }));
            C1123a.a(c1123a2, "JsonArray", new i(new InterfaceC0635a<f>() { // from class: kotlinx.serialization.json.JsonElementSerializer$descriptor$1.5
                @Override // ca.InterfaceC0635a
                public final f invoke() {
                    return C1246c.f27070b;
                }
            }));
            return p.f3034a;
        }
    });

    @Override // na.InterfaceC1077a
    public final Object deserialize(InterfaceC1144d interfaceC1144d) {
        return C1124b.i(interfaceC1144d).l();
    }

    @Override // na.InterfaceC1081e, na.InterfaceC1077a
    public final f getDescriptor() {
        return f23369b;
    }

    @Override // na.InterfaceC1081e
    public final void serialize(InterfaceC1145e interfaceC1145e, Object obj) {
        JsonElement jsonElement = (JsonElement) obj;
        C1124b.h(interfaceC1145e);
        if (jsonElement instanceof JsonPrimitive) {
            interfaceC1145e.s(r.f27118a, jsonElement);
        } else if (jsonElement instanceof JsonObject) {
            interfaceC1145e.s(q.f27113a, jsonElement);
        } else if (jsonElement instanceof JsonArray) {
            interfaceC1145e.s(C1246c.f27069a, jsonElement);
        }
    }
}

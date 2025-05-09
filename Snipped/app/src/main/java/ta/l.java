package ta;

import ca.InterfaceC0646l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.internal.AbstractJsonTreeEncoder;
import na.InterfaceC1078b;
import sa.AbstractC1244a;

/* compiled from: TreeJsonEncoder.kt */
/* loaded from: classes2.dex */
public class l extends AbstractJsonTreeEncoder {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f29995f;

    /* renamed from: g, reason: collision with root package name */
    public Object f29996g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(AbstractC1244a abstractC1244a, InterfaceC0646l interfaceC0646l, int i) {
        super(abstractC1244a, interfaceC0646l);
        this.f29995f = i;
        switch (i) {
            case 1:
                super(abstractC1244a, interfaceC0646l);
                this.f29996g = new LinkedHashMap();
                break;
            case 2:
                super(abstractC1244a, interfaceC0646l);
                this.f29996g = new ArrayList();
                break;
            default:
                this.f26372a.add("primitive");
                break;
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder, ra.V
    public String G(pa.f fVar, int i) {
        switch (this.f29995f) {
            case 2:
                return String.valueOf(i);
            default:
                return super.G(fVar, i);
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public JsonElement V() {
        switch (this.f29995f) {
            case 0:
                JsonElement jsonElement = (JsonElement) this.f29996g;
                if (jsonElement != null) {
                    return jsonElement;
                }
                throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?".toString());
            case 1:
                return new JsonObject((LinkedHashMap) this.f29996g);
            default:
                return new JsonArray((ArrayList) this.f29996g);
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public void W(String str, JsonElement jsonElement) {
        switch (this.f29995f) {
            case 0:
                if (str != "primitive") {
                    throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag".toString());
                }
                if (((JsonElement) this.f29996g) != null) {
                    throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?".toString());
                }
                this.f29996g = jsonElement;
                this.f23379c.invoke(jsonElement);
                return;
            case 1:
                ((LinkedHashMap) this.f29996g).put(str, jsonElement);
                return;
            default:
                ((ArrayList) this.f29996g).add(Integer.parseInt(str), jsonElement);
                return;
        }
    }

    @Override // ra.V, qa.InterfaceC1143c
    public void e(pa.f fVar, int i, InterfaceC1078b interfaceC1078b, Object obj) {
        switch (this.f29995f) {
            case 1:
                if (obj != null || this.f23380d.f27094f) {
                    super.e(fVar, i, interfaceC1078b, obj);
                    break;
                }
                break;
            default:
                super.e(fVar, i, interfaceC1078b, obj);
                break;
        }
    }
}

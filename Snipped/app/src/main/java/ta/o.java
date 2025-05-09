package ta;

import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import pa.C1124b;
import sa.C1246c;

/* compiled from: TreeJsonEncoder.kt */
/* loaded from: classes2.dex */
public final class o extends l {

    /* renamed from: h, reason: collision with root package name */
    public String f30004h;
    public boolean i;

    @Override // ta.l, kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public final JsonElement V() {
        return new JsonObject((LinkedHashMap) this.f29996g);
    }

    @Override // ta.l, kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public final void W(String str, JsonElement jsonElement) {
        if (!this.i) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f29996g;
            String str2 = this.f30004h;
            if (str2 == null) {
                str2 = null;
            }
            linkedHashMap.put(str2, jsonElement);
            this.i = true;
            return;
        }
        if (jsonElement instanceof JsonPrimitive) {
            this.f30004h = ((JsonPrimitive) jsonElement).getContent();
            this.i = false;
        } else {
            if (jsonElement instanceof JsonObject) {
                throw C1124b.e(sa.q.f27114b);
            }
            if (!(jsonElement instanceof JsonArray)) {
                throw new NoWhenBranchMatchedException();
            }
            throw C1124b.e(C1246c.f27070b);
        }
    }
}

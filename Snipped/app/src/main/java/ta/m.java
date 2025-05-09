package ta;

import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import sa.AbstractC1244a;

/* compiled from: TreeJsonDecoder.kt */
/* loaded from: classes2.dex */
public final class m extends AbstractC1493a {

    /* renamed from: e, reason: collision with root package name */
    public final JsonArray f29997e;

    /* renamed from: f, reason: collision with root package name */
    public final int f29998f;

    /* renamed from: g, reason: collision with root package name */
    public int f29999g;

    public m(AbstractC1244a abstractC1244a, JsonArray jsonArray) {
        super(abstractC1244a, jsonArray);
        this.f29997e = jsonArray;
        this.f29998f = jsonArray.size();
        this.f29999g = -1;
    }

    @Override // ra.U
    public final String S(pa.f fVar, int i) {
        return String.valueOf(i);
    }

    @Override // ta.AbstractC1493a
    public final JsonElement T(String str) {
        return this.f29997e.get(Integer.parseInt(str));
    }

    @Override // ta.AbstractC1493a
    public final JsonElement W() {
        return this.f29997e;
    }

    @Override // qa.InterfaceC1142b
    public final int q(pa.f fVar) {
        int i = this.f29999g;
        if (i >= this.f29998f - 1) {
            return -1;
        }
        int i9 = i + 1;
        this.f29999g = i9;
        return i9;
    }
}

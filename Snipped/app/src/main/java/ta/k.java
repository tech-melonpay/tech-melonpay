package ta;

import kotlinx.serialization.json.JsonElement;
import sa.AbstractC1244a;

/* compiled from: TreeJsonDecoder.kt */
/* loaded from: classes2.dex */
public final class k extends AbstractC1493a {

    /* renamed from: e, reason: collision with root package name */
    public final JsonElement f29994e;

    public k(AbstractC1244a abstractC1244a, JsonElement jsonElement) {
        super(abstractC1244a, jsonElement);
        this.f29994e = jsonElement;
        this.f23349a.add("primitive");
    }

    @Override // ta.AbstractC1493a
    public final JsonElement T(String str) {
        if (str == "primitive") {
            return this.f29994e;
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag".toString());
    }

    @Override // ta.AbstractC1493a
    public final JsonElement W() {
        return this.f29994e;
    }

    @Override // qa.InterfaceC1142b
    public final int q(pa.f fVar) {
        return 0;
    }
}

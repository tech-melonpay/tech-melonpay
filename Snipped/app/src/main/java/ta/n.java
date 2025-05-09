package ta;

import java.util.List;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import sa.AbstractC1244a;

/* compiled from: TreeJsonDecoder.kt */
/* loaded from: classes2.dex */
public final class n extends kotlinx.serialization.json.internal.c {

    /* renamed from: j, reason: collision with root package name */
    public final JsonObject f30000j;

    /* renamed from: k, reason: collision with root package name */
    public final List<String> f30001k;

    /* renamed from: l, reason: collision with root package name */
    public final int f30002l;

    /* renamed from: m, reason: collision with root package name */
    public int f30003m;

    public n(AbstractC1244a abstractC1244a, JsonObject jsonObject) {
        super(abstractC1244a, jsonObject, null, null);
        this.f30000j = jsonObject;
        List<String> c02 = P9.s.c0(jsonObject.keySet());
        this.f30001k = c02;
        this.f30002l = c02.size() * 2;
        this.f30003m = -1;
    }

    @Override // kotlinx.serialization.json.internal.c, ra.U
    public final String S(pa.f fVar, int i) {
        return this.f30001k.get(i / 2);
    }

    @Override // kotlinx.serialization.json.internal.c, ta.AbstractC1493a
    public final JsonElement T(String str) {
        return this.f30003m % 2 == 0 ? sa.h.b(str) : (JsonElement) kotlin.collections.a.q(this.f30000j, str);
    }

    @Override // kotlinx.serialization.json.internal.c, ta.AbstractC1493a
    public final JsonElement W() {
        return this.f30000j;
    }

    @Override // kotlinx.serialization.json.internal.c
    /* renamed from: Y */
    public final JsonObject W() {
        return this.f30000j;
    }

    @Override // kotlinx.serialization.json.internal.c, qa.InterfaceC1142b
    public final int q(pa.f fVar) {
        int i = this.f30003m;
        if (i >= this.f30002l - 1) {
            return -1;
        }
        int i9 = i + 1;
        this.f30003m = i9;
        return i9;
    }

    @Override // kotlinx.serialization.json.internal.c, ta.AbstractC1493a, qa.InterfaceC1142b
    public final void b(pa.f fVar) {
    }
}

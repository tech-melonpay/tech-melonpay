package sa;

import kotlinx.serialization.json.JsonPrimitive;
import ta.v;

/* compiled from: JsonElement.kt */
/* loaded from: classes2.dex */
public final class l extends JsonPrimitive {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f27105a;

    /* renamed from: b, reason: collision with root package name */
    public final pa.f f27106b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27107c;

    public l(Object obj, boolean z10, pa.f fVar) {
        super(null);
        this.f27105a = z10;
        this.f27106b = fVar;
        this.f27107c = obj.toString();
        if (fVar != null && !fVar.isInline()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return this.f27105a == lVar.f27105a && kotlin.jvm.internal.f.b(this.f27107c, lVar.f27107c);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final String getContent() {
        return this.f27107c;
    }

    public final int hashCode() {
        return this.f27107c.hashCode() + (Boolean.hashCode(this.f27105a) * 31);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final boolean isString() {
        return this.f27105a;
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final String toString() {
        String str = this.f27107c;
        if (!this.f27105a) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        v.a(sb2, str);
        return sb2.toString();
    }
}

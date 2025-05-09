package f4;

import e4.C0715a;
import h4.C0796a;

/* compiled from: KYCQuestionaireResponse.kt */
/* loaded from: classes.dex */
public final class f extends C0715a {

    /* renamed from: b, reason: collision with root package name */
    @l3.b("event_uuid")
    private final String f20681b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("client")
    private final C0796a f20682c;

    public final C0796a b() {
        return this.f20682c;
    }

    public final String c() {
        return this.f20681b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.f.b(this.f20681b, fVar.f20681b) && kotlin.jvm.internal.f.b(this.f20682c, fVar.f20682c);
    }

    public final int hashCode() {
        String str = this.f20681b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        C0796a c0796a = this.f20682c;
        return hashCode + (c0796a != null ? c0796a.hashCode() : 0);
    }

    public final String toString() {
        return "KYCQuestionaireResponse(eventUUID=" + this.f20681b + ", client=" + this.f20682c + ")";
    }
}

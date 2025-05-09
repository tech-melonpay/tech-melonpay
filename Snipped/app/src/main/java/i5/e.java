package I5;

import s5.C1205a;

/* compiled from: KYCQuestionareDomain.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f1749a;

    /* renamed from: b, reason: collision with root package name */
    public final C1205a f1750b;

    public e(String str, C1205a c1205a) {
        this.f1749a = str;
        this.f1750b = c1205a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.f.b(this.f1749a, eVar.f1749a) && kotlin.jvm.internal.f.b(this.f1750b, eVar.f1750b);
    }

    public final int hashCode() {
        String str = this.f1749a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        C1205a c1205a = this.f1750b;
        return hashCode + (c1205a != null ? c1205a.hashCode() : 0);
    }

    public final String toString() {
        return "KYCQuestionareDomain(uuid=" + this.f1749a + ", client=" + this.f1750b + ")";
    }
}

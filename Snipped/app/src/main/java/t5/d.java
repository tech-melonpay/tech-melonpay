package t5;

/* compiled from: CardsDetailsRequest.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f27531a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27532b;

    public d(String str, String str2) {
        this.f27531a = str;
        this.f27532b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.f.b(this.f27531a, dVar.f27531a) && kotlin.jvm.internal.f.b(this.f27532b, dVar.f27532b);
    }

    public final int hashCode() {
        return this.f27532b.hashCode() + (this.f27531a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CardsDetailsRequest(clientId=");
        sb2.append(this.f27531a);
        sb2.append(", cardId=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f27532b, ")");
    }
}

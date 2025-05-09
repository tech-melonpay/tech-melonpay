package t5;

import C.v;

/* compiled from: EditVaultRequestDomain.kt */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f27546a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27547b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27548c;

    public g(int i, int i9, String str) {
        this.f27546a = i;
        this.f27547b = i9;
        this.f27548c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f27546a == gVar.f27546a && this.f27547b == gVar.f27547b && kotlin.jvm.internal.f.b(this.f27548c, gVar.f27548c);
    }

    public final int hashCode() {
        return this.f27548c.hashCode() + v.b(this.f27547b, Integer.hashCode(this.f27546a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EditVaultRequestDomain(clientId=");
        sb2.append(this.f27546a);
        sb2.append(", vaultId=");
        sb2.append(this.f27547b);
        sb2.append(", name=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f27548c, ")");
    }
}

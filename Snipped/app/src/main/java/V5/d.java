package v5;

import C.v;

/* compiled from: CryptoCreateDomain.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f30610a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30611b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30612c;

    /* renamed from: d, reason: collision with root package name */
    public final String f30613d;

    /* renamed from: e, reason: collision with root package name */
    public final String f30614e;

    public d(int i, String str, String str2, String str3, String str4) {
        this.f30610a = i;
        this.f30611b = str;
        this.f30612c = str2;
        this.f30613d = str3;
        this.f30614e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f30610a == dVar.f30610a && kotlin.jvm.internal.f.b(this.f30611b, dVar.f30611b) && kotlin.jvm.internal.f.b(this.f30612c, dVar.f30612c) && kotlin.jvm.internal.f.b(this.f30613d, dVar.f30613d) && kotlin.jvm.internal.f.b(this.f30614e, dVar.f30614e);
    }

    public final int hashCode() {
        int c2 = v.c(Integer.hashCode(this.f30610a) * 31, 31, this.f30611b);
        String str = this.f30612c;
        int hashCode = (c2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f30613d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f30614e;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CryptoCreateDomain(clientId=");
        sb2.append(this.f30610a);
        sb2.append(", prettyName=");
        sb2.append(this.f30611b);
        sb2.append(", token=");
        sb2.append(this.f30612c);
        sb2.append(", address=");
        sb2.append(this.f30613d);
        sb2.append(", network=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f30614e, ")");
    }
}

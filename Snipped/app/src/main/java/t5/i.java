package t5;

import C.v;

/* compiled from: Update3dSecureRequestDomain.kt */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f27549a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27550b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27551c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27552d;

    /* renamed from: e, reason: collision with root package name */
    public final String f27553e;

    public i(int i, String str, String str2, String str3, String str4) {
        this.f27549a = str;
        this.f27550b = i;
        this.f27551c = str2;
        this.f27552d = str3;
        this.f27553e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.f.b(this.f27549a, iVar.f27549a) && this.f27550b == iVar.f27550b && kotlin.jvm.internal.f.b(this.f27551c, iVar.f27551c) && kotlin.jvm.internal.f.b(this.f27552d, iVar.f27552d) && kotlin.jvm.internal.f.b(this.f27553e, iVar.f27553e);
    }

    public final int hashCode() {
        return this.f27553e.hashCode() + v.c(v.c(v.b(this.f27550b, this.f27549a.hashCode() * 31, 31), 31, this.f27551c), 31, this.f27552d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Update3dSecureRequestDomain(clientId=");
        sb2.append(this.f27549a);
        sb2.append(", cardId=");
        sb2.append(this.f27550b);
        sb2.append(", phone=");
        sb2.append(this.f27551c);
        sb2.append(", email=");
        sb2.append(this.f27552d);
        sb2.append(", password=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f27553e, ")");
    }
}

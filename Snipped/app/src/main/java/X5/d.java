package x5;

import C.v;
import kotlin.jvm.internal.f;

/* compiled from: SelfSendRequestDomain.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f30939a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30940b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30941c;

    /* renamed from: d, reason: collision with root package name */
    public final String f30942d;

    /* renamed from: e, reason: collision with root package name */
    public final String f30943e;

    public d(String str, String str2, String str3, String str4, String str5) {
        this.f30939a = str;
        this.f30940b = str2;
        this.f30941c = str3;
        this.f30942d = str4;
        this.f30943e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return f.b(this.f30939a, dVar.f30939a) && f.b(this.f30940b, dVar.f30940b) && f.b(this.f30941c, dVar.f30941c) && f.b(this.f30942d, dVar.f30942d) && f.b(this.f30943e, dVar.f30943e);
    }

    public final int hashCode() {
        return this.f30943e.hashCode() + v.c(v.c(v.c(this.f30939a.hashCode() * 31, 31, this.f30940b), 31, this.f30941c), 31, this.f30942d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelfSendRequestDomain(fromCurrency=");
        sb2.append(this.f30939a);
        sb2.append(", toAccount=");
        sb2.append(this.f30940b);
        sb2.append(", amount=");
        sb2.append(this.f30941c);
        sb2.append(", currency=");
        sb2.append(this.f30942d);
        sb2.append(", details=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f30943e, ")");
    }
}

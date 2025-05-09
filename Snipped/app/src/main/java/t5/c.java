package t5;

import C.v;

/* compiled from: CardVirtualRequestDomain.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f27527a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27528b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27529c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27530d;

    public c(String str, String str2, String str3, String str4) {
        this.f27527a = str;
        this.f27528b = str2;
        this.f27529c = str3;
        this.f27530d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.f.b(this.f27527a, cVar.f27527a) && kotlin.jvm.internal.f.b(this.f27528b, cVar.f27528b) && kotlin.jvm.internal.f.b(this.f27529c, cVar.f27529c) && kotlin.jvm.internal.f.b(this.f27530d, cVar.f27530d);
    }

    public final int hashCode() {
        return this.f27530d.hashCode() + v.c(v.c(this.f27527a.hashCode() * 31, 31, this.f27528b), 31, this.f27529c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CardVirtualRequestDomain(phone=");
        sb2.append(this.f27527a);
        sb2.append(", email=");
        sb2.append(this.f27528b);
        sb2.append(", cardPrettyName=");
        sb2.append(this.f27529c);
        sb2.append(", password=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f27530d, ")");
    }
}

package B5;

import C.v;

/* compiled from: CounterpartyByEmailRequestDomain.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f304a = "CORPORATE";

    /* renamed from: b, reason: collision with root package name */
    public final String f305b;

    /* renamed from: c, reason: collision with root package name */
    public final String f306c;

    /* renamed from: d, reason: collision with root package name */
    public final int f307d;

    public d(String str, String str2, int i) {
        this.f305b = str;
        this.f306c = str2;
        this.f307d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.f.b(this.f304a, dVar.f304a) && kotlin.jvm.internal.f.b(this.f305b, dVar.f305b) && kotlin.jvm.internal.f.b(this.f306c, dVar.f306c) && this.f307d == dVar.f307d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f307d) + v.c(v.c(this.f304a.hashCode() * 31, 31, this.f305b), 31, this.f306c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CounterpartyByEmailRequestDomain(receiverLegalType=");
        sb2.append(this.f304a);
        sb2.append(", receiverEmail=");
        sb2.append(this.f305b);
        sb2.append(", currency=");
        sb2.append(this.f306c);
        sb2.append(", senderId=");
        return s3.b.m(sb2, this.f307d, ")");
    }
}

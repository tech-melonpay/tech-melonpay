package v5;

import java.util.ArrayList;
import java.util.List;
import w5.C1572a;

/* compiled from: AllCurrencyDomain.kt */
/* renamed from: v5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1545a {

    /* renamed from: a, reason: collision with root package name */
    public final List<C1572a> f30601a;

    /* renamed from: b, reason: collision with root package name */
    public final List<C1572a> f30602b;

    public C1545a(ArrayList arrayList, ArrayList arrayList2) {
        this.f30601a = arrayList;
        this.f30602b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1545a)) {
            return false;
        }
        C1545a c1545a = (C1545a) obj;
        return kotlin.jvm.internal.f.b(this.f30601a, c1545a.f30601a) && kotlin.jvm.internal.f.b(this.f30602b, c1545a.f30602b);
    }

    public final int hashCode() {
        return this.f30602b.hashCode() + (this.f30601a.hashCode() * 31);
    }

    public final String toString() {
        return "AllCurrencyDomain(fiat=" + this.f30601a + ", crypto=" + this.f30602b + ")";
    }
}

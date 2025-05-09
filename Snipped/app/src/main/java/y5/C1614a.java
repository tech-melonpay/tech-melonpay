package y5;

import kotlin.jvm.internal.f;

/* compiled from: IndustryDomain.kt */
/* renamed from: y5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1614a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f31115a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31116b;

    public C1614a(String str, Integer num) {
        this.f31115a = num;
        this.f31116b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1614a)) {
            return false;
        }
        C1614a c1614a = (C1614a) obj;
        return f.b(this.f31115a, c1614a.f31115a) && f.b(this.f31116b, c1614a.f31116b);
    }

    public final int hashCode() {
        Integer num = this.f31115a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f31116b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "IndustryDomain(id=" + this.f31115a + ", name=" + this.f31116b + ")";
    }
}

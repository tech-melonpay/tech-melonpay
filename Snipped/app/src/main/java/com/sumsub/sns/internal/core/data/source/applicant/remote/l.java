package com.sumsub.sns.internal.core.data.source.applicant.remote;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f16034a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16035b;

    public l(String str, String str2) {
        this.f16034a = str;
        this.f16035b = str2;
    }

    public final String c() {
        return this.f16034a;
    }

    public final String d() {
        return this.f16035b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.f.b(this.f16034a, lVar.f16034a) && kotlin.jvm.internal.f.b(this.f16035b, lVar.f16035b);
    }

    public int hashCode() {
        return this.f16035b.hashCode() + (this.f16034a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("KeyValue(key=");
        sb2.append(this.f16034a);
        sb2.append(", value=");
        return C.v.q(sb2, this.f16035b, ')');
    }
}

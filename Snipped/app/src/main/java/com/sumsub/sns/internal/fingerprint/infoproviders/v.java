package com.sumsub.sns.internal.fingerprint.infoproviders;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final String f17352a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17353b;

    public v(String str, String str2) {
        this.f17352a = str;
        this.f17353b = str2;
    }

    public final String c() {
        return this.f17352a;
    }

    public final String d() {
        return this.f17353b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return kotlin.jvm.internal.f.b(this.f17352a, vVar.f17352a) && kotlin.jvm.internal.f.b(this.f17353b, vVar.f17353b);
    }

    public int hashCode() {
        return this.f17353b.hashCode() + (this.f17352a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("InputDeviceData(name=");
        sb2.append(this.f17352a);
        sb2.append(", vendor=");
        return C.v.q(sb2, this.f17353b, ')');
    }
}

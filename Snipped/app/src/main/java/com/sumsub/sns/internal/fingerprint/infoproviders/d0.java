package com.sumsub.sns.internal.fingerprint.infoproviders;

/* loaded from: classes2.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f17314a;

    public d0(String str) {
        this.f17314a = str;
    }

    public final String b() {
        return this.f17314a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && kotlin.jvm.internal.f.b(this.f17314a, ((d0) obj).f17314a);
    }

    public int hashCode() {
        return this.f17314a.hashCode();
    }

    public String toString() {
        return this.f17314a;
    }
}

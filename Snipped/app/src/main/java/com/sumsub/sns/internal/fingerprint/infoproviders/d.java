package com.sumsub.sns.internal.fingerprint.infoproviders;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f17311a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17312b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17313c;

    public d(String str, String str2, String str3) {
        this.f17311a = str;
        this.f17312b = str2;
        this.f17313c = str3;
    }

    public final String d() {
        return this.f17311a;
    }

    public final String e() {
        return this.f17313c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.f.b(this.f17311a, dVar.f17311a) && kotlin.jvm.internal.f.b(this.f17312b, dVar.f17312b) && kotlin.jvm.internal.f.b(this.f17313c, dVar.f17313c);
    }

    public final String f() {
        return this.f17312b;
    }

    public int hashCode() {
        return this.f17313c.hashCode() + C.v.c(this.f17311a.hashCode() * 31, 31, this.f17312b);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CameraInfo(cameraName=");
        sb2.append(this.f17311a);
        sb2.append(", cameraType=");
        sb2.append(this.f17312b);
        sb2.append(", cameraOrientation=");
        return C.v.q(sb2, this.f17313c, ')');
    }
}

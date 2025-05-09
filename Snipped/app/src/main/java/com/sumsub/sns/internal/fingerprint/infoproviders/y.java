package com.sumsub.sns.internal.fingerprint.infoproviders;

import java.util.List;

/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final String f17356a;

    /* renamed from: b, reason: collision with root package name */
    public final List<String> f17357b;

    public y(String str, List<String> list) {
        this.f17356a = str;
        this.f17357b = list;
    }

    public final List<String> c() {
        return this.f17357b;
    }

    public final String d() {
        return this.f17356a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return kotlin.jvm.internal.f.b(this.f17356a, yVar.f17356a) && kotlin.jvm.internal.f.b(this.f17357b, yVar.f17357b);
    }

    public int hashCode() {
        return this.f17357b.hashCode() + (this.f17356a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MediaCodecInfo(name=");
        sb2.append(this.f17356a);
        sb2.append(", capabilities=");
        return C.v.r(sb2, this.f17357b, ')');
    }
}

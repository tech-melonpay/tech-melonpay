package com.sumsub.sns.internal.core.presentation.intro;

import C.v;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f16607a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16608b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16609c;

    public c(String str, String str2, String str3) {
        this.f16607a = str;
        this.f16608b = str2;
        this.f16609c = str3;
    }

    public final String d() {
        return this.f16609c;
    }

    public final String e() {
        return this.f16608b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.f.b(this.f16607a, cVar.f16607a) && kotlin.jvm.internal.f.b(this.f16608b, cVar.f16608b) && kotlin.jvm.internal.f.b(this.f16609c, cVar.f16609c);
    }

    public final String f() {
        return this.f16607a;
    }

    public int hashCode() {
        return this.f16609c.hashCode() + v.c(this.f16607a.hashCode() * 31, 31, this.f16608b);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SNSIntroItem(title=");
        sb2.append(this.f16607a);
        sb2.append(", subTitle=");
        sb2.append(this.f16608b);
        sb2.append(", iconKey=");
        return v.q(sb2, this.f16609c, ')');
    }
}

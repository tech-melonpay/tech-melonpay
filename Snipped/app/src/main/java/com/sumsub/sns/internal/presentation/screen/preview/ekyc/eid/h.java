package com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid;

import C.v;

/* loaded from: classes2.dex */
public final class h extends f {

    /* renamed from: b, reason: collision with root package name */
    public final String f18219b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18220c;

    public h(String str, String str2) {
        super(false, "Authentication is not started", null, 4, null);
        this.f18219b = str;
        this.f18220c = str2;
    }

    public final String d() {
        return this.f18220c;
    }

    public final String e() {
        return this.f18219b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.f.b(this.f18219b, hVar.f18219b) && kotlin.jvm.internal.f.b(this.f18220c, hVar.f18220c);
    }

    public int hashCode() {
        int hashCode = this.f18219b.hashCode() * 31;
        String str = this.f18220c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SNSEidStartReadingException(cardPin=");
        sb2.append(this.f18219b);
        sb2.append(", cardCan=");
        return v.q(sb2, this.f18220c, ')');
    }
}

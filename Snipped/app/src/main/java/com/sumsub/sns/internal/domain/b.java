package com.sumsub.sns.internal.domain;

import com.google.android.gms.measurement.internal.a;
import kotlin.jvm.internal.f;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.model.h f16780a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f16781b;

    public b(com.sumsub.sns.internal.core.data.model.h hVar, CharSequence charSequence) {
        this.f16780a = hVar;
        this.f16781b = charSequence;
    }

    public final com.sumsub.sns.internal.core.data.model.h c() {
        return this.f16780a;
    }

    public final CharSequence d() {
        return this.f16781b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return f.b(this.f16780a, bVar.f16780a) && f.b(this.f16781b, bVar.f16781b);
    }

    public int hashCode() {
        int hashCode = this.f16780a.hashCode() * 31;
        CharSequence charSequence = this.f16781b;
        return hashCode + (charSequence == null ? 0 : charSequence.hashCode());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ApplicantDataError(field=");
        sb2.append(this.f16780a);
        sb2.append(", text=");
        return a.j(sb2, this.f16781b, ')');
    }
}

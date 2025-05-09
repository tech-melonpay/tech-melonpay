package com.sumsub.sns.internal.domain;

import com.google.android.gms.measurement.internal.a;
import kotlin.jvm.internal.f;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f16861a;

    /* renamed from: b, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.model.remote.o f16862b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f16863c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f16864d;

    public l(CharSequence charSequence, com.sumsub.sns.internal.core.data.model.remote.o oVar, CharSequence charSequence2, CharSequence charSequence3) {
        this.f16861a = charSequence;
        this.f16862b = oVar;
        this.f16863c = charSequence2;
        this.f16864d = charSequence3;
    }

    public final CharSequence e() {
        return this.f16864d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return f.b(this.f16861a, lVar.f16861a) && f.b(this.f16862b, lVar.f16862b) && f.b(this.f16863c, lVar.f16863c) && f.b(this.f16864d, lVar.f16864d);
    }

    public final CharSequence f() {
        return this.f16863c;
    }

    public final CharSequence g() {
        return this.f16861a;
    }

    public int hashCode() {
        CharSequence charSequence = this.f16861a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        com.sumsub.sns.internal.core.data.model.remote.o oVar = this.f16862b;
        int hashCode2 = (hashCode + (oVar == null ? 0 : oVar.hashCode())) * 31;
        CharSequence charSequence2 = this.f16863c;
        int hashCode3 = (hashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f16864d;
        return hashCode3 + (charSequence3 != null ? charSequence3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Tin(label=");
        sb2.append((Object) this.f16861a);
        sb2.append(", tinInfo=");
        sb2.append(this.f16862b);
        sb2.append(", hint=");
        sb2.append((Object) this.f16863c);
        sb2.append(", example=");
        return a.j(sb2, this.f16864d, ')');
    }
}

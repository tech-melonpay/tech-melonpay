package com.sumsub.sns.internal.geo.presentation;

import com.sumsub.sns.internal.core.data.model.h;
import kotlin.jvm.internal.f;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final h.d f17401a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f17402b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f17403c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f17404d;

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f17405e;

    public a(h.d dVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4) {
        this.f17401a = dVar;
        this.f17402b = charSequence;
        this.f17403c = charSequence2;
        this.f17404d = charSequence3;
        this.f17405e = charSequence4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f.b(this.f17401a, aVar.f17401a) && f.b(this.f17402b, aVar.f17402b) && f.b(this.f17403c, aVar.f17403c) && f.b(this.f17404d, aVar.f17404d) && f.b(this.f17405e, aVar.f17405e);
    }

    public final CharSequence f() {
        return this.f17405e;
    }

    public final h.d g() {
        return this.f17401a;
    }

    public final CharSequence h() {
        return this.f17404d;
    }

    public int hashCode() {
        int hashCode = this.f17401a.hashCode() * 31;
        CharSequence charSequence = this.f17402b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.f17403c;
        int hashCode3 = (hashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f17404d;
        int hashCode4 = (hashCode3 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        CharSequence charSequence4 = this.f17405e;
        return hashCode4 + (charSequence4 != null ? charSequence4.hashCode() : 0);
    }

    public final CharSequence i() {
        return this.f17403c;
    }

    public final CharSequence j() {
        return this.f17402b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LocationItem(field=");
        sb2.append(this.f17401a);
        sb2.append(", value=");
        sb2.append((Object) this.f17402b);
        sb2.append(", title=");
        sb2.append((Object) this.f17403c);
        sb2.append(", hint=");
        sb2.append((Object) this.f17404d);
        sb2.append(", error=");
        return com.google.android.gms.measurement.internal.a.j(sb2, this.f17405e, ')');
    }
}

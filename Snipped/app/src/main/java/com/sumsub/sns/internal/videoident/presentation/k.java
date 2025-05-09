package com.sumsub.sns.internal.videoident.presentation;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f19510a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f19511b;

    public k(CharSequence charSequence, CharSequence charSequence2) {
        this.f19510a = charSequence;
        this.f19511b = charSequence2;
    }

    public final void a(CharSequence charSequence) {
        this.f19511b = charSequence;
    }

    public final CharSequence c() {
        return this.f19511b;
    }

    public final CharSequence d() {
        return this.f19510a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kotlin.jvm.internal.f.b(this.f19510a, kVar.f19510a) && kotlin.jvm.internal.f.b(this.f19511b, kVar.f19511b);
    }

    public int hashCode() {
        CharSequence charSequence = this.f19510a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f19511b;
        return hashCode + (charSequence2 != null ? charSequence2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SNSWarning(title=");
        sb2.append((Object) this.f19510a);
        sb2.append(", text=");
        return com.google.android.gms.measurement.internal.a.j(sb2, this.f19511b, ')');
    }
}

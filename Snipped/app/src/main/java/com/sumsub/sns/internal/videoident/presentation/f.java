package com.sumsub.sns.internal.videoident.presentation;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f19235a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f19236b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f19237c;

    public f(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this.f19235a = charSequence;
        this.f19236b = charSequence2;
        this.f19237c = charSequence3;
    }

    public final CharSequence d() {
        return this.f19235a;
    }

    public final CharSequence e() {
        return this.f19237c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.f.b(this.f19235a, fVar.f19235a) && kotlin.jvm.internal.f.b(this.f19236b, fVar.f19236b) && kotlin.jvm.internal.f.b(this.f19237c, fVar.f19237c);
    }

    public final CharSequence f() {
        return this.f19236b;
    }

    public int hashCode() {
        CharSequence charSequence = this.f19235a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f19236b;
        int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f19237c;
        return hashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SNSPermissionDialog(message=");
        sb2.append((Object) this.f19235a);
        sb2.append(", positiveButton=");
        sb2.append((Object) this.f19236b);
        sb2.append(", negativeButton=");
        return com.google.android.gms.measurement.internal.a.j(sb2, this.f19237c, ')');
    }
}

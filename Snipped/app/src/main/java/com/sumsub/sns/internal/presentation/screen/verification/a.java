package com.sumsub.sns.internal.presentation.screen.verification;

import kotlin.jvm.internal.f;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f18889a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f18890b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f18891c;

    public a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this.f18889a = charSequence;
        this.f18890b = charSequence2;
        this.f18891c = charSequence3;
    }

    public final CharSequence d() {
        return this.f18891c;
    }

    public final CharSequence e() {
        return this.f18890b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f.b(this.f18889a, aVar.f18889a) && f.b(this.f18890b, aVar.f18890b) && f.b(this.f18891c, aVar.f18891c);
    }

    public final CharSequence f() {
        return this.f18889a;
    }

    public int hashCode() {
        CharSequence charSequence = this.f18889a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f18890b;
        int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f18891c;
        return hashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ConfirmExitDialog(message=");
        sb2.append((Object) this.f18889a);
        sb2.append(", buttonPositive=");
        sb2.append((Object) this.f18890b);
        sb2.append(", buttonNegative=");
        return com.google.android.gms.measurement.internal.a.j(sb2, this.f18891c, ')');
    }
}

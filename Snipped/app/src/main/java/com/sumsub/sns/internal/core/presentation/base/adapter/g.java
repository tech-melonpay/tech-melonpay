package com.sumsub.sns.internal.core.presentation.base.adapter;

/* loaded from: classes2.dex */
public final class g extends a {

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f16460b;

    public final CharSequence c() {
        return this.f16460b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && kotlin.jvm.internal.f.b(this.f16460b, ((g) obj).f16460b);
    }

    public int hashCode() {
        CharSequence charSequence = this.f16460b;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.hashCode();
    }

    public String toString() {
        return com.google.android.gms.measurement.internal.a.j(new StringBuilder("SNSTextViewItem(text="), this.f16460b, ')');
    }
}

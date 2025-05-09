package com.sumsub.sns.internal.core.presentation.base.adapter;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class d extends a {

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f16455b;

    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final CharSequence c() {
        return this.f16455b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && kotlin.jvm.internal.f.b(this.f16455b, ((d) obj).f16455b);
    }

    public int hashCode() {
        CharSequence charSequence = this.f16455b;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.hashCode();
    }

    public String toString() {
        return com.google.android.gms.measurement.internal.a.j(new StringBuilder("SNSDocumentsModeratorCommentViewItem(moderatorComment="), this.f16455b, ')');
    }

    public /* synthetic */ d(CharSequence charSequence, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : charSequence);
    }

    public d(CharSequence charSequence) {
        super(6);
        this.f16455b = charSequence;
    }
}

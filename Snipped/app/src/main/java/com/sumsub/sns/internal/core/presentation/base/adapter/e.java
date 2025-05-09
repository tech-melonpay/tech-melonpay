package com.sumsub.sns.internal.core.presentation.base.adapter;

import C.v;

/* loaded from: classes2.dex */
public final class e extends a {

    /* renamed from: b, reason: collision with root package name */
    public final String f16456b;

    public final String c() {
        return this.f16456b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && kotlin.jvm.internal.f.b(this.f16456b, ((e) obj).f16456b);
    }

    public int hashCode() {
        return this.f16456b.hashCode();
    }

    public String toString() {
        return v.q(new StringBuilder("SNSHugeIconViewItem(iconKey="), this.f16456b, ')');
    }
}

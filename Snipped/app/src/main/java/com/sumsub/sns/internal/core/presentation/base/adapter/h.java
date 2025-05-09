package com.sumsub.sns.internal.core.presentation.base.adapter;

import C.v;

/* loaded from: classes2.dex */
public final class h extends a {

    /* renamed from: b, reason: collision with root package name */
    public final String f16461b;

    public final String c() {
        return this.f16461b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && kotlin.jvm.internal.f.b(this.f16461b, ((h) obj).f16461b);
    }

    public int hashCode() {
        String str = this.f16461b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return v.q(new StringBuilder("SNSTitleViewItem(text="), this.f16461b, ')');
    }
}

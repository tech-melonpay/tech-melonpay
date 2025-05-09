package com.sumsub.sns.core.presentation.support;

import androidx.lifecycle.Q;
import androidx.lifecycle.T;

/* loaded from: classes2.dex */
public final class c implements T {

    /* renamed from: a, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.a f14354a;

    public c(com.sumsub.sns.internal.core.a aVar) {
        this.f14354a = aVar;
    }

    @Override // androidx.lifecycle.T
    public <T extends Q> T create(Class<T> cls) {
        return new b(this.f14354a.q(), this.f14354a.n(), this.f14354a.p());
    }
}

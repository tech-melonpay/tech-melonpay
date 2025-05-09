package com.sumsub.sns.internal.presentation.screen.verification;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0535a;
import androidx.lifecycle.G;
import androidx.lifecycle.Q;
import b1.InterfaceC0584d;
import com.sumsub.sns.internal.core.domain.n;

/* loaded from: classes2.dex */
public final class c extends AbstractC0535a {

    /* renamed from: a, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.a f18969a;

    public c(InterfaceC0584d interfaceC0584d, com.sumsub.sns.internal.core.a aVar, Bundle bundle) {
        super(interfaceC0584d, bundle);
        this.f18969a = aVar;
    }

    @Override // androidx.lifecycle.AbstractC0535a
    public <T extends Q> T create(String str, Class<T> cls, G g10) {
        return new b(this.f18969a.n(), new n(this.f18969a), this.f18969a.p(), this.f18969a.g(), this.f18969a.q());
    }
}

package com.sumsub.sns.internal.presentation.consent;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0535a;
import androidx.lifecycle.G;
import androidx.lifecycle.Q;
import b1.InterfaceC0584d;
import com.sumsub.sns.internal.core.domain.n;

/* loaded from: classes2.dex */
public final class b extends AbstractC0535a {

    /* renamed from: a, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.a f17870a;

    public b(InterfaceC0584d interfaceC0584d, com.sumsub.sns.internal.core.a aVar, Bundle bundle) {
        super(interfaceC0584d, bundle);
        this.f17870a = aVar;
    }

    @Override // androidx.lifecycle.AbstractC0535a
    public <T extends Q> T create(String str, Class<T> cls, G g10) {
        return new a(this.f17870a.n(), this.f17870a.p(), this.f17870a.g(), new n(this.f17870a), this.f17870a.q(), g10);
    }
}

package com.sumsub.sns.internal.videoident.presentation;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0535a;
import androidx.lifecycle.G;
import androidx.lifecycle.Q;
import b1.InterfaceC0584d;

/* loaded from: classes2.dex */
public final class b extends AbstractC0535a {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f19222a;

    /* renamed from: b, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.a f19223b;

    public b(InterfaceC0584d interfaceC0584d, Bundle bundle, com.sumsub.sns.internal.core.a aVar) {
        super(interfaceC0584d, bundle);
        this.f19222a = bundle;
        this.f19223b = aVar;
    }

    @Override // androidx.lifecycle.AbstractC0535a
    public <T extends Q> T create(String str, Class<T> cls, G g10) {
        Bundle bundle = this.f19222a;
        if (bundle != null) {
            return new a(bundle, this.f19223b.n(), this.f19223b.p());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}

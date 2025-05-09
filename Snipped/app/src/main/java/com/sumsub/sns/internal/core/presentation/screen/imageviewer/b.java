package com.sumsub.sns.internal.core.presentation.screen.imageviewer;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0535a;
import androidx.lifecycle.G;
import androidx.lifecycle.Q;
import b1.InterfaceC0584d;

/* loaded from: classes2.dex */
public final class b extends AbstractC0535a {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f16643a;

    /* renamed from: b, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.a f16644b;

    public b(InterfaceC0584d interfaceC0584d, Bundle bundle, com.sumsub.sns.internal.core.a aVar) {
        super(interfaceC0584d, bundle);
        this.f16643a = bundle;
        this.f16644b = aVar;
    }

    @Override // androidx.lifecycle.AbstractC0535a
    public <T extends Q> T create(String str, Class<T> cls, G g10) {
        return new a(this.f16643a, this.f16644b.n(), this.f16644b.p());
    }
}

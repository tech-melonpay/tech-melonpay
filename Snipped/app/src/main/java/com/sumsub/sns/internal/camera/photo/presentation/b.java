package com.sumsub.sns.internal.camera.photo.presentation;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0535a;
import androidx.lifecycle.G;
import androidx.lifecycle.Q;
import b1.InterfaceC0584d;
import com.sumsub.sns.internal.core.domain.e;

/* loaded from: classes2.dex */
public final class b extends AbstractC0535a {

    /* renamed from: a, reason: collision with root package name */
    public final String f14585a;

    /* renamed from: b, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.a f14586b;

    public b(InterfaceC0584d interfaceC0584d, String str, com.sumsub.sns.internal.core.a aVar, Bundle bundle) {
        super(interfaceC0584d, bundle);
        this.f14585a = str;
        this.f14586b = aVar;
    }

    @Override // androidx.lifecycle.AbstractC0535a
    public <T extends Q> T create(String str, Class<T> cls, G g10) {
        return new a(this.f14585a, this.f14586b.q(), new com.sumsub.sns.internal.core.domain.b(this.f14586b.n(), this.f14586b.p()), new e(this.f14586b), this.f14586b.n(), this.f14586b.p());
    }
}

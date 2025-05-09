package com.sumsub.sns.internal.presentation.screen.preview.selfie;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0535a;
import androidx.lifecycle.G;
import androidx.lifecycle.Q;
import b1.InterfaceC0584d;
import com.sumsub.sns.internal.core.data.model.Document;
import com.sumsub.sns.internal.domain.q;

/* loaded from: classes2.dex */
public final class b extends AbstractC0535a {

    /* renamed from: a, reason: collision with root package name */
    public final Document f18786a;

    /* renamed from: b, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.a f18787b;

    public b(Document document, InterfaceC0584d interfaceC0584d, com.sumsub.sns.internal.core.a aVar, Bundle bundle) {
        super(interfaceC0584d, bundle);
        this.f18786a = document;
        this.f18787b = aVar;
    }

    @Override // androidx.lifecycle.AbstractC0535a
    public <T extends Q> T create(String str, Class<T> cls, G g10) {
        return new a(this.f18786a, g10, this.f18787b.n(), this.f18787b.p(), new q(this.f18787b), new com.sumsub.sns.internal.core.domain.b(this.f18787b.n(), this.f18787b.p()));
    }
}

package com.sumsub.sns.internal.presentation.screen.preview.photo.common;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0535a;
import androidx.lifecycle.G;
import androidx.lifecycle.Q;
import b1.InterfaceC0584d;
import com.sumsub.sns.internal.core.data.model.Document;
import com.sumsub.sns.internal.domain.o;

/* loaded from: classes2.dex */
public final class b extends AbstractC0535a {

    /* renamed from: a, reason: collision with root package name */
    public final Document f18659a;

    /* renamed from: b, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.a f18660b;

    public b(Document document, InterfaceC0584d interfaceC0584d, com.sumsub.sns.internal.core.a aVar, Bundle bundle) {
        super(interfaceC0584d, bundle);
        this.f18659a = document;
        this.f18660b = aVar;
    }

    @Override // androidx.lifecycle.AbstractC0535a
    public <T extends Q> T create(String str, Class<T> cls, G g10) {
        return new a(this.f18659a, g10, new o(this.f18660b), this.f18660b.n(), this.f18660b.p(), this.f18660b.q(), this.f18660b.D(), com.sumsub.sns.internal.ml.badphotos.a.f17608p.a(this.f18660b.j(), this.f18660b.l(), this.f18660b.E().getUrl(), com.sumsub.sns.internal.ff.a.f16930a.B().g(), this.f18659a.getType()), new com.sumsub.sns.internal.core.domain.b(this.f18660b.n(), this.f18660b.p()));
    }
}

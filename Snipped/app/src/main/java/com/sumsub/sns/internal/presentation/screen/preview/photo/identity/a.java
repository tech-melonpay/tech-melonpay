package com.sumsub.sns.internal.presentation.screen.preview.photo.identity;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0535a;
import androidx.lifecycle.G;
import androidx.lifecycle.Q;
import b1.InterfaceC0584d;
import com.sumsub.sns.internal.core.data.model.Document;
import com.sumsub.sns.internal.core.domain.b;
import com.sumsub.sns.internal.domain.o;

/* loaded from: classes2.dex */
public final class a extends AbstractC0535a {

    /* renamed from: a, reason: collision with root package name */
    public final Document f18694a;

    /* renamed from: b, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.a f18695b;

    public a(Document document, InterfaceC0584d interfaceC0584d, com.sumsub.sns.internal.core.a aVar, Bundle bundle) {
        super(interfaceC0584d, bundle);
        this.f18694a = document;
        this.f18695b = aVar;
    }

    @Override // androidx.lifecycle.AbstractC0535a
    public <T extends Q> T create(String str, Class<T> cls, G g10) {
        return new SNSPreviewIdentityDocumentViewModel(this.f18694a, g10, new o(this.f18695b), this.f18695b.n(), this.f18695b.p(), this.f18695b.q(), this.f18695b.D(), com.sumsub.sns.internal.ml.badphotos.a.f17608p.a(this.f18695b.j(), this.f18695b.l(), this.f18695b.E().getUrl(), com.sumsub.sns.internal.ff.a.f16930a.B().g(), this.f18694a.getType()), new b(this.f18695b.n(), this.f18695b.p()));
    }
}

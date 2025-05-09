package com.sumsub.sns.internal.camera.photo.presentation.selfie;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0535a;
import androidx.lifecycle.G;
import androidx.lifecycle.Q;
import b1.InterfaceC0584d;
import com.sumsub.sns.internal.core.data.model.DocumentType;

/* loaded from: classes2.dex */
public final class b extends AbstractC0535a {

    /* renamed from: a, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.a f14852a;

    public b(InterfaceC0584d interfaceC0584d, com.sumsub.sns.internal.core.a aVar, Bundle bundle) {
        super(interfaceC0584d, bundle);
        this.f14852a = aVar;
    }

    @Override // androidx.lifecycle.AbstractC0535a
    public <T extends Q> T create(String str, Class<T> cls, G g10) {
        DocumentType a10 = DocumentType.INSTANCE.a((String) g10.b("EXTRA_DOCUMENT_TYPE"));
        com.sumsub.sns.internal.core.data.source.common.a n10 = this.f14852a.n();
        com.sumsub.sns.internal.core.data.source.dynamic.b p10 = this.f14852a.p();
        Boolean bool = (Boolean) g10.b("EXTRA_GALLERY_AVAILABLE");
        return new a(a10, n10, p10, bool != null ? bool.booleanValue() : false);
    }
}

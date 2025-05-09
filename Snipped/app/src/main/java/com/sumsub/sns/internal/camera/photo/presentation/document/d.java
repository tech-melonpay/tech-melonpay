package com.sumsub.sns.internal.camera.photo.presentation.document;

import O9.p;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0535a;
import androidx.lifecycle.G;
import androidx.lifecycle.Q;
import b1.InterfaceC0584d;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.ml.autocapture.SeamlessDocaptureMobileConfig;
import com.sumsub.sns.internal.ml.autocapture.a;

/* loaded from: classes2.dex */
public final class d extends AbstractC0535a {

    /* renamed from: a, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.a f14850a;

    public d(InterfaceC0584d interfaceC0584d, com.sumsub.sns.internal.core.a aVar, Bundle bundle) {
        super(interfaceC0584d, bundle);
        this.f14850a = aVar;
    }

    @Override // androidx.lifecycle.AbstractC0535a
    public <T extends Q> T create(String str, Class<T> cls, G g10) {
        a.b bVar = com.sumsub.sns.internal.ml.autocapture.a.f17588m;
        com.sumsub.sns.internal.ml.autocapture.a a10 = bVar.a();
        a.C0270a m2 = a10.m();
        DocumentType a11 = DocumentType.INSTANCE.a((String) g10.b("EXTRA_DOCUMENT_TYPE"));
        String str2 = (String) g10.b("EXTRA_ONLY_ID_DOC");
        com.sumsub.sns.internal.core.data.source.common.a n10 = this.f14850a.n();
        com.sumsub.sns.internal.core.data.source.dynamic.b p10 = this.f14850a.p();
        com.sumsub.sns.internal.ml.core.e<Bitmap, com.sumsub.sns.internal.ml.badphotos.models.a> a12 = com.sumsub.sns.internal.ml.badphotos.a.f17608p.a(this.f14850a.j(), this.f14850a.l(), this.f14850a.E().getUrl(), true, a11);
        com.sumsub.sns.internal.ml.badphotos.a aVar = a12 instanceof com.sumsub.sns.internal.ml.badphotos.a ? (com.sumsub.sns.internal.ml.badphotos.a) a12 : null;
        com.sumsub.sns.internal.ml.docdetector.b bVar2 = new com.sumsub.sns.internal.ml.docdetector.b(this.f14850a.j(), this.f14850a.l(), this.f14850a.E().getUrl() + "resources/embeddedModels/" + a10.m().b(), m2);
        b.b(b.f14849a, "DocCapture", "autocap config: inputSize=" + m2.i() + ", outputSize=" + m2.j(), null, 4, null);
        p pVar = p.f3034a;
        com.sumsub.sns.internal.ml.badphotos.c a13 = com.sumsub.sns.internal.ml.badphotos.c.f17617h.a();
        com.sumsub.sns.internal.ml.autocapture.a a14 = bVar.a();
        SeamlessDocaptureMobileConfig a15 = SeamlessDocaptureMobileConfig.f17580f.a();
        Boolean bool = (Boolean) g10.b("EXTRA_GALLERY_AVAILABLE");
        return new SNSPhotoDocumentPickerViewModel(a11, str2, n10, p10, aVar, bVar2, a13, a14, a15, g10, bool != null ? bool.booleanValue() : false);
    }
}

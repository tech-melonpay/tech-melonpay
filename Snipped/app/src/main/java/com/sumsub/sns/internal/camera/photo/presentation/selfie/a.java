package com.sumsub.sns.internal.camera.photo.presentation.selfie;

import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.core.data.model.g;
import com.sumsub.sns.internal.core.presentation.intro.f;
import com.sumsub.sns.internal.log.c;

/* loaded from: classes2.dex */
public final class a extends com.sumsub.sns.internal.camera.b {
    public a(DocumentType documentType, com.sumsub.sns.internal.core.data.source.common.a aVar, com.sumsub.sns.internal.core.data.source.dynamic.b bVar, boolean z10) {
        super(documentType, null, z10, aVar, bVar, 2, null);
    }

    @Override // com.sumsub.sns.internal.camera.c
    public com.sumsub.sns.internal.core.presentation.helper.camera.b a(g gVar, f fVar, String str) {
        Logger.i$default(com.sumsub.sns.internal.log.a.f17535a, c.a(this), "Selfie With Document Picker", null, 4, null);
        return com.sumsub.sns.internal.core.presentation.helper.camera.a.a(com.sumsub.sns.internal.core.presentation.helper.camera.a.f16589a, h(), u(), gVar.a(u()), fVar, str, null, null, 96, null);
    }
}

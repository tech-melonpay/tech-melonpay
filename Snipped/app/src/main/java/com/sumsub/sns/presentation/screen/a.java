package com.sumsub.sns.presentation.screen;

import com.sumsub.sns.internal.core.data.model.Document;
import com.sumsub.sns.internal.core.data.model.VideoRequiredType;
import com.sumsub.sns.internal.core.data.model.g;
import com.sumsub.sns.presentation.screen.b;

/* loaded from: classes2.dex */
public final class a {
    public static /* synthetic */ b.d a(Document document, com.sumsub.sns.internal.core.data.model.g gVar, boolean z10, int i, Object obj) {
        if ((i & 2) != 0) {
            z10 = false;
        }
        return a(document, gVar, z10);
    }

    public static final b.d a(Document document, com.sumsub.sns.internal.core.data.model.g gVar, boolean z10) {
        if (document.getType().g()) {
            return new b.d.i(document);
        }
        if (document.getType().f()) {
            return new b.d.C0370d(document);
        }
        if (document.getType().i()) {
            return new b.d.e(document);
        }
        if (document.getType().j()) {
            b.d.n nVar = new b.d.n(document);
            com.sumsub.sns.internal.core.domain.model.c b9 = nVar.b();
            nVar.a(b9 != null ? com.sumsub.sns.internal.core.domain.model.c.a(b9, null, null, null, z10, 7, null) : null);
            return nVar;
        }
        if (document.getType().k()) {
            b.d a10 = a(gVar, document);
            com.sumsub.sns.internal.core.domain.model.c b10 = a10.b();
            a10.a(b10 != null ? com.sumsub.sns.internal.core.domain.model.c.a(b10, null, null, null, z10, 7, null) : null);
            return a10;
        }
        if (document.getType().d()) {
            return new b.d.C0369b(document);
        }
        if (!document.getType().h()) {
            return document.getType().e() ? new b.d.f(document) : new b.d.j(document);
        }
        g.c.a a11 = gVar.a(document.getType());
        return (a11 == null || !a11.t()) ? new b.d.m(document) : new b.d.g(document);
    }

    public static final b.d a(com.sumsub.sns.internal.core.data.model.g gVar, Document document) {
        g.c.a a10 = gVar.a(document.getType());
        if (a10 != null && a10.w()) {
            return new b.d.k(document);
        }
        if (a10 != null && a10.v()) {
            return new b.d.j(document);
        }
        if (kotlin.jvm.internal.f.b(a10 != null ? a10.r() : null, VideoRequiredType.Enabled.getValue())) {
            return new b.d.l(document);
        }
        return new b.d.h(document);
    }
}

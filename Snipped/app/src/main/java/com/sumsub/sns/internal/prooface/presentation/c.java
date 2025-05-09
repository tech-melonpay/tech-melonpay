package com.sumsub.sns.internal.prooface.presentation;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0535a;
import androidx.lifecycle.G;
import androidx.lifecycle.Q;
import b1.InterfaceC0584d;
import com.sumsub.sns.internal.core.a;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.core.data.model.q;
import com.sumsub.sns.internal.core.domain.m;
import com.sumsub.sns.prooface.network.Liveness3dFaceRepository;
import sa.AbstractC1244a;
import va.h;

/* loaded from: classes2.dex */
public final class c extends AbstractC0535a {

    /* renamed from: a, reason: collision with root package name */
    public final a f19158a;

    public c(InterfaceC0584d interfaceC0584d, a aVar, Bundle bundle) {
        super(interfaceC0584d, bundle);
        this.f19158a = aVar;
    }

    @Override // androidx.lifecycle.AbstractC0535a
    public <T extends Q> T create(String str, Class<T> cls, G g10) {
        m r8 = this.f19158a.r();
        String str2 = (String) g10.b("EXTRA_ID_DOC_SET_TYPE");
        if (str2 == null) {
            str2 = DocumentType.f15253j;
        }
        DocumentType documentType = new DocumentType(str2);
        AbstractC1244a t3 = this.f19158a.t();
        com.sumsub.sns.prooface.network.b bVar = new com.sumsub.sns.prooface.network.b();
        h w2 = this.f19158a.w();
        String str3 = (String) g10.b("EXTRA_ID_DOC_SET_TYPE");
        if (str3 == null) {
            str3 = q.g.f15567f.b();
        }
        return new b(r8, documentType, t3, bVar, new Liveness3dFaceRepository(w2, str3, this.f19158a.E(), this.f19158a.t(), this.f19158a.G()), this.f19158a.F(), this.f19158a.n(), this.f19158a.p(), this.f19158a.s());
    }
}

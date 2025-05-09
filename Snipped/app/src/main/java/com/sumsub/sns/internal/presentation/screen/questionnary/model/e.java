package com.sumsub.sns.internal.presentation.screen.questionnary.model;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0535a;
import androidx.lifecycle.G;
import androidx.lifecycle.Q;
import b1.InterfaceC0584d;
import com.sumsub.sns.internal.core.a;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.core.data.source.applicant.remote.w;
import com.sumsub.sns.internal.core.data.source.applicant.remote.y;
import com.sumsub.sns.internal.domain.i;
import com.sumsub.sns.internal.domain.k;
import com.sumsub.sns.internal.domain.o;

/* loaded from: classes2.dex */
public final class e extends AbstractC0535a {

    /* renamed from: a, reason: collision with root package name */
    public final a f18887a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f18888b;

    public e(InterfaceC0584d interfaceC0584d, a aVar, Bundle bundle) {
        super(interfaceC0584d, bundle);
        this.f18887a = aVar;
        this.f18888b = bundle;
    }

    @Override // androidx.lifecycle.AbstractC0535a
    public <T extends Q> T create(String str, Class<T> cls, G g10) {
        i iVar = new i(this.f18887a);
        k kVar = new k();
        com.sumsub.sns.internal.core.data.source.common.a n10 = this.f18887a.n();
        com.sumsub.sns.internal.core.data.source.applicant.b g11 = this.f18887a.g();
        com.sumsub.sns.internal.core.data.source.dynamic.b p10 = this.f18887a.p();
        com.sumsub.sns.internal.core.domain.b bVar = new com.sumsub.sns.internal.core.domain.b(this.f18887a.n(), this.f18887a.p());
        o oVar = new o(this.f18887a);
        com.sumsub.sns.internal.domain.d dVar = new com.sumsub.sns.internal.domain.d(this.f18887a.n(), this.f18887a.g());
        Bundle bundle = this.f18888b;
        w wVar = bundle != null ? (w) bundle.getParcelable(DocumentType.i) : null;
        Bundle bundle2 = this.f18888b;
        y yVar = bundle2 != null ? (y) bundle2.getParcelable("QUESTIONNAIRE_SUMMARY") : null;
        Bundle bundle3 = this.f18888b;
        return new d(g10, iVar, kVar, oVar, dVar, n10, g11, p10, bVar, wVar, yVar, bundle3 != null ? (com.sumsub.sns.internal.core.presentation.form.model.d) bundle3.getParcelable("COUNTRIES_DATA") : null);
    }
}

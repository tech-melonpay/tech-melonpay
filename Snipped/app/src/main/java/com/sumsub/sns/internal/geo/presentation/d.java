package com.sumsub.sns.internal.geo.presentation;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0535a;
import androidx.lifecycle.G;
import androidx.lifecycle.Q;
import b1.InterfaceC0584d;
import com.sumsub.sns.core.SNSCoreModule;
import com.sumsub.sns.core.SNSModule;
import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.data.model.Document;

/* loaded from: classes2.dex */
public final class d extends AbstractC0535a {

    /* renamed from: a, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.a f17519a;

    public d(InterfaceC0584d interfaceC0584d, com.sumsub.sns.internal.core.a aVar, Bundle bundle) {
        super(interfaceC0584d, bundle);
        this.f17519a = aVar;
    }

    @Override // androidx.lifecycle.AbstractC0535a
    public <T extends Q> T create(String str, Class<T> cls, G g10) {
        com.sumsub.sns.internal.core.data.source.common.a n10 = this.f17519a.n();
        com.sumsub.sns.internal.core.data.source.dynamic.b p10 = this.f17519a.p();
        com.sumsub.sns.internal.geo.domain.b bVar = new com.sumsub.sns.internal.geo.domain.b(this.f17519a.h(), this.f17519a.n(), this.f17519a.p(), this.f17519a.t());
        com.sumsub.sns.internal.geo.domain.c cVar = new com.sumsub.sns.internal.geo.domain.c(this.f17519a.h(), this.f17519a.F(), this.f17519a.n());
        SNSModule pluggedModule = e0.f15081a.getPluggedModule(SNSCoreModule.class.getName());
        SNSCoreModule sNSCoreModule = pluggedModule instanceof SNSCoreModule ? (SNSCoreModule) pluggedModule : null;
        boolean z10 = sNSCoreModule != null && sNSCoreModule.isSkipGeolocationForm();
        com.sumsub.sns.internal.core.domain.b bVar2 = new com.sumsub.sns.internal.core.domain.b(this.f17519a.n(), this.f17519a.p());
        Object b9 = g10.b("ARGS_DOCUMENT");
        if (b9 != null) {
            return new c(g10, n10, p10, bVar, cVar, z10, bVar2, (Document) b9);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}

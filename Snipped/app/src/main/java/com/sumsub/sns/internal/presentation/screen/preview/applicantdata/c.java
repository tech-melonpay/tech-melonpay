package com.sumsub.sns.internal.presentation.screen.preview.applicantdata;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0535a;
import androidx.lifecycle.G;
import androidx.lifecycle.Q;
import b1.InterfaceC0584d;
import com.sumsub.sns.internal.core.a;
import com.sumsub.sns.internal.core.common.a1;
import com.sumsub.sns.internal.core.data.model.Document;
import com.sumsub.sns.internal.domain.m;

/* loaded from: classes2.dex */
public final class c extends AbstractC0535a {

    /* renamed from: a, reason: collision with root package name */
    public final Document f17998a;

    /* renamed from: b, reason: collision with root package name */
    public final a f17999b;

    public c(Document document, InterfaceC0584d interfaceC0584d, a aVar, Bundle bundle) {
        super(interfaceC0584d, bundle);
        this.f17998a = document;
        this.f17999b = aVar;
    }

    @Override // androidx.lifecycle.AbstractC0535a
    public <T extends Q> T create(String str, Class<T> cls, G g10) {
        return new b(this.f17998a, g10, this.f17999b.n(), this.f17999b.p(), new m(this.f17999b), new com.sumsub.sns.internal.core.domain.b(this.f17999b.n(), this.f17999b.p()), new a1());
    }
}

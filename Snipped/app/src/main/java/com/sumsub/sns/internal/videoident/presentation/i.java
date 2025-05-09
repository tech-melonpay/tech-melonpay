package com.sumsub.sns.internal.videoident.presentation;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0535a;
import androidx.lifecycle.G;
import androidx.lifecycle.Q;
import b1.InterfaceC0584d;
import com.sumsub.sns.internal.core.common.c1;
import com.sumsub.sns.internal.core.data.model.Document;
import java.util.List;

/* loaded from: classes2.dex */
public final class i extends AbstractC0535a {

    /* renamed from: a, reason: collision with root package name */
    public final List<Document> f19506a;

    /* renamed from: b, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.a f19507b;

    /* renamed from: c, reason: collision with root package name */
    public final g f19508c;

    /* renamed from: d, reason: collision with root package name */
    public final c1 f19509d;

    public i(List<Document> list, InterfaceC0584d interfaceC0584d, com.sumsub.sns.internal.core.a aVar, Bundle bundle, g gVar, c1 c1Var) {
        super(interfaceC0584d, bundle);
        this.f19506a = list;
        this.f19507b = aVar;
        this.f19508c = gVar;
        this.f19509d = c1Var;
    }

    @Override // androidx.lifecycle.AbstractC0535a
    public <T extends Q> T create(String str, Class<T> cls, G g10) {
        return new h(this.f19506a, this.f19507b.t(), this.f19507b.n(), this.f19507b.p(), g10, new com.sumsub.sns.internal.videoident.videoident.domain.d(this.f19507b.F(), this.f19507b.n(), this.f19507b.h()), new com.sumsub.sns.internal.videoident.videoident.domain.e(this.f19507b.F(), this.f19507b.n(), this.f19507b.h()), new com.sumsub.sns.internal.videoident.videoident.domain.c(this.f19507b.n(), this.f19507b.h(), this.f19507b.p()), new com.sumsub.sns.internal.videoident.videoident.domain.b(this.f19507b.n(), this.f19507b.h(), this.f19507b.p()), new com.sumsub.sns.internal.videoident.videoident.domain.a(this.f19507b.n(), this.f19507b.h()), new com.sumsub.sns.internal.domain.j(this.f19507b.n()), this.f19508c, this.f19509d, this.f19507b.g());
    }
}

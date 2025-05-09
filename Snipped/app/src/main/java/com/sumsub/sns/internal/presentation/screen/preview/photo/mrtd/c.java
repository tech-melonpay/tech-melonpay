package com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0535a;
import androidx.lifecycle.G;
import androidx.lifecycle.Q;
import b1.InterfaceC0584d;
import com.sumsub.sns.internal.core.a;
import com.sumsub.sns.internal.domain.h;

/* loaded from: classes2.dex */
public final class c extends AbstractC0535a {

    /* renamed from: a, reason: collision with root package name */
    public final a f18752a;

    public c(InterfaceC0584d interfaceC0584d, a aVar, Bundle bundle) {
        super(interfaceC0584d, bundle);
        this.f18752a = aVar;
    }

    @Override // androidx.lifecycle.AbstractC0535a
    public <T extends Q> T create(String str, Class<T> cls, G g10) {
        return new b(g10, new h(this.f18752a.h(), this.f18752a.n()), this.f18752a.n(), this.f18752a.p());
    }
}

package com.sumsub.sns.internal.camera.video.presentation;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0535a;
import androidx.lifecycle.G;
import androidx.lifecycle.Q;
import b1.InterfaceC0584d;
import com.sumsub.sns.internal.core.domain.d;
import com.sumsub.sns.internal.core.domain.i;

/* loaded from: classes2.dex */
public final class a extends AbstractC0535a {

    /* renamed from: a, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.a f14915a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f14916b;

    public a(InterfaceC0584d interfaceC0584d, com.sumsub.sns.internal.core.a aVar, Bundle bundle) {
        super(interfaceC0584d, bundle);
        this.f14915a = aVar;
        this.f14916b = bundle;
    }

    @Override // androidx.lifecycle.AbstractC0535a
    public <T extends Q> T create(String str, Class<T> cls, G g10) {
        d dVar = new d(this.f14915a);
        i iVar = new i(this.f14915a);
        Bundle bundle = this.f14916b;
        String string = bundle != null ? bundle.getString("EXTRA_ID_DOC_SET_TYPE") : null;
        Bundle bundle2 = this.f14916b;
        return new SNSVideoSelfieViewModel(dVar, iVar, string, bundle2 != null ? bundle2.getString("EXTRA_TYPE") : null, this.f14915a.n(), this.f14915a.p());
    }
}

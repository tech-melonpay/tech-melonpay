package com.sumsub.sns.internal.presentation.screen.error;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0535a;
import androidx.lifecycle.G;
import androidx.lifecycle.Q;
import b1.InterfaceC0584d;
import com.sumsub.sns.internal.core.data.model.o;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class b extends AbstractC0535a {

    /* renamed from: a, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.a f17885a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f17886b;

    public b(InterfaceC0584d interfaceC0584d, com.sumsub.sns.internal.core.a aVar, Bundle bundle) {
        super(interfaceC0584d, bundle);
        this.f17885a = aVar;
        this.f17886b = bundle;
    }

    @Override // androidx.lifecycle.AbstractC0535a
    public <T extends Q> T create(String str, Class<T> cls, G g10) {
        Bundle bundle = this.f17886b;
        Serializable serializable = bundle != null ? bundle.getSerializable("arg_error") : null;
        o oVar = serializable instanceof o ? (o) serializable : null;
        if (oVar == null) {
            oVar = new o.c(null, null, null, 7, null);
        }
        return new a(oVar, this.f17885a.q(), this.f17885a.n(), this.f17885a.p());
    }
}

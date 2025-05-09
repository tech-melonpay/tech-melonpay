package com.sumsub.sns.presentation.screen;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0535a;
import androidx.lifecycle.G;
import androidx.lifecycle.Q;
import b1.InterfaceC0584d;
import com.sumsub.sns.internal.core.domain.n;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class e extends AbstractC0535a {

    /* renamed from: a, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.a f19889a;

    public /* synthetic */ e(InterfaceC0584d interfaceC0584d, com.sumsub.sns.internal.core.a aVar, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC0584d, aVar, (i & 4) != 0 ? null : bundle);
    }

    @Override // androidx.lifecycle.AbstractC0535a
    public <T extends Q> T create(String str, Class<T> cls, G g10) {
        return new d(g10, new com.sumsub.sns.internal.domain.g(this.f19889a), new com.sumsub.sns.internal.domain.e(this.f19889a.n(), this.f19889a.p(), "SNSAppViewModel"), new n(this.f19889a), this.f19889a.n(), this.f19889a.F(), this.f19889a.p(), this.f19889a.g());
    }

    public e(InterfaceC0584d interfaceC0584d, com.sumsub.sns.internal.core.a aVar, Bundle bundle) {
        super(interfaceC0584d, bundle);
        this.f19889a = aVar;
    }
}

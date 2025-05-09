package com.sumsub.sns.internal.presentation.screen.intro;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0535a;
import androidx.lifecycle.G;
import androidx.lifecycle.Q;
import b1.InterfaceC0584d;
import com.sumsub.sns.internal.core.data.model.DocumentType;

/* loaded from: classes2.dex */
public final class b extends AbstractC0535a {

    /* renamed from: a, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.a f17898a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f17899b;

    public b(InterfaceC0584d interfaceC0584d, com.sumsub.sns.internal.core.a aVar, Bundle bundle) {
        super(interfaceC0584d, bundle);
        this.f17898a = aVar;
        this.f17899b = bundle;
    }

    @Override // androidx.lifecycle.AbstractC0535a
    public <T extends Q> T create(String str, Class<T> cls, G g10) {
        String str2;
        String string;
        String string2;
        Bundle bundle = this.f17899b;
        if (bundle == null || (str2 = bundle.getString("sns_param_step")) == null) {
            str2 = DocumentType.f15253j;
        }
        String str3 = str2;
        Bundle bundle2 = this.f17899b;
        String string3 = bundle2 != null ? bundle2.getString("sns_param_document_type") : null;
        Bundle bundle3 = this.f17899b;
        String str4 = (bundle3 == null || (string2 = bundle3.getString("sns_param_scene")) == null) ? "" : string2;
        com.sumsub.sns.internal.core.data.source.common.a n10 = this.f17898a.n();
        com.sumsub.sns.internal.core.data.source.dynamic.b p10 = this.f17898a.p();
        Bundle bundle4 = this.f17899b;
        String str5 = (bundle4 == null || (string = bundle4.getString("sns_param_country_code")) == null) ? "" : string;
        Bundle bundle5 = this.f17899b;
        return new a(str3, string3, str4, str5, bundle5 != null ? bundle5.getBoolean("sns_param_cancel_on_back") : false, n10, p10);
    }
}

package com.luminary.business.presentation.ui.fragments.crypto.deposit_crypto;

import C.v;
import F8.o;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import g8.g;
import java.io.Serializable;
import o7.C1092b;
import t6.K3;

/* compiled from: DepositCryptoFragment.kt */
/* loaded from: classes2.dex */
public final class DepositCryptoFragment extends BaseFragment<K3> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12091n0 = R.layout.fragment_deposit_crypto;

    /* renamed from: o0, reason: collision with root package name */
    public C1092b f12092o0;

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        String str;
        CryptoAccountDomain cryptoAccountDomain;
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        C1092b c1092b = this.f12092o0;
        if (c1092b == null || (cryptoAccountDomain = c1092b.f24390a) == null || (str = cryptoAccountDomain.f10969g) == null) {
            str = "";
        }
        toolbarStatus.f13263a = getString(R.string.deposit_name, str);
        toolbarStatus.f13265c = 18;
        toolbarStatus.f13276o = null;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        String str;
        CryptoAccountDomain cryptoAccountDomain;
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        C1092b c1092b = this.f12092o0;
        if (c1092b == null || (cryptoAccountDomain = c1092b.f24390a) == null || (str = cryptoAccountDomain.f10969g) == null) {
            str = "";
        }
        toolbarStatus.f13263a = getString(R.string.deposit_name, str);
        toolbarStatus.f13265c = 18;
        toolbarStatus.f13276o = null;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (!v.y(arguments, C1092b.class, "account")) {
                throw new IllegalArgumentException("Required argument \"account\" is missing and does not have an android:defaultValue");
            }
            if (!Parcelable.class.isAssignableFrom(CryptoAccountDomain.class) && !Serializable.class.isAssignableFrom(CryptoAccountDomain.class)) {
                throw new UnsupportedOperationException(CryptoAccountDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            this.f12092o0 = new C1092b((CryptoAccountDomain) arguments.get("account"));
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    @SuppressLint({"SetTextI18n"})
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        K3 u02 = u0();
        o.c(u02.f28069n, 500L, new g(this, 13));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12091n0;
    }
}

package com.luminary.business.presentation.ui.fragments.crypto.deposit_crypto;

import B6.g;
import D9.b;
import F8.o;
import O9.p;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import ca.InterfaceC0635a;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import com.luminary.business.domain.entity.cryptowallet.CryptowalletDomain;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.crypto.deposit_crypto.DepositCryptoDetailsFragment;
import com.luminary.business.presentation.ui.fragments.crypto.deposit_crypto.a;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import t6.M3;
import y8.DialogC1623d;

/* compiled from: DepositCryptoDetailsFragment.kt */
/* loaded from: classes2.dex */
public final class DepositCryptoDetailsFragment extends BaseFragment<M3> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12089n0 = R.layout.fragment_deposit_crypto_details;

    /* renamed from: o0, reason: collision with root package name */
    public a f12090o0;

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        String str;
        CryptowalletDomain cryptowalletDomain;
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        a aVar = this.f12090o0;
        if (aVar == null || (cryptowalletDomain = aVar.f12093a) == null || (str = cryptowalletDomain.f11078g) == null) {
            str = "";
        }
        toolbarStatus.f13263a = getString(R.string.deposit_name, str);
        toolbarStatus.f13278q = 5;
        toolbarStatus.f13276o = null;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        String str;
        CryptowalletDomain cryptowalletDomain;
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        a aVar = this.f12090o0;
        if (aVar == null || (cryptowalletDomain = aVar.f12093a) == null || (str = cryptowalletDomain.f11078g) == null) {
            str = "";
        }
        toolbarStatus.f13263a = getString(R.string.deposit_name, str);
        toolbarStatus.f13278q = 5;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        toolbarStatus.f13276o = null;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f12090o0 = a.C0124a.a(arguments);
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    @SuppressLint({"SetTextI18n"})
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        Integer z10;
        super.onViewCreated(view, bundle);
        o.c(u0().f28170o, 500L, new g(17));
        final int i = 0;
        o.c(u0().f28173r, 500L, new InterfaceC0635a(this) { // from class: o7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DepositCryptoDetailsFragment f24389b;

            {
                this.f24389b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                CryptowalletDomain cryptowalletDomain;
                String str4;
                CryptoAccountDomain cryptoAccountDomain;
                String str5;
                String str6;
                CryptoAccountDomain cryptoAccountDomain2;
                String str7;
                switch (i) {
                    case 0:
                        DepositCryptoDetailsFragment depositCryptoDetailsFragment = this.f24389b;
                        com.luminary.business.presentation.ui.fragments.crypto.deposit_crypto.a aVar = depositCryptoDetailsFragment.f12090o0;
                        if (aVar != null && (cryptowalletDomain = aVar.f12093a) != null && (str4 = cryptowalletDomain.f11081k) != null) {
                            depositCryptoDetailsFragment.r0(str4);
                        }
                        break;
                    case 1:
                        U4.b.g(this.f24389b).m(R.id.homeFragment, false);
                        break;
                    case 2:
                        DepositCryptoDetailsFragment depositCryptoDetailsFragment2 = this.f24389b;
                        com.luminary.business.presentation.ui.fragments.crypto.deposit_crypto.a aVar2 = depositCryptoDetailsFragment2.f12090o0;
                        DialogC1623d dialogC1623d = null;
                        if (aVar2 != null && (cryptoAccountDomain = aVar2.f12094b) != null && (str5 = cryptoAccountDomain.f10969g) != null && (str6 = cryptoAccountDomain.f10965c) != null) {
                            dialogC1623d = new DialogC1623d(depositCryptoDetailsFragment2.requireContext(), str6, str5);
                        }
                        if (dialogC1623d != null) {
                            dialogC1623d.f31135s.f29099p.setText(depositCryptoDetailsFragment2.getString(R.string.qr));
                        }
                        if (dialogC1623d != null) {
                            dialogC1623d.show();
                        }
                        break;
                    default:
                        DepositCryptoDetailsFragment depositCryptoDetailsFragment3 = this.f24389b;
                        com.luminary.business.presentation.ui.fragments.crypto.deposit_crypto.a aVar3 = depositCryptoDetailsFragment3.f12090o0;
                        if (aVar3 != null && (cryptoAccountDomain2 = aVar3.f12094b) != null && (str7 = cryptoAccountDomain2.f10965c) != null) {
                            depositCryptoDetailsFragment3.r0(str7);
                        }
                        break;
                }
                return p.f3034a;
            }
        });
        a aVar = this.f12090o0;
        CryptowalletDomain cryptowalletDomain = aVar != null ? aVar.f12093a : null;
        CryptoAccountDomain cryptoAccountDomain = aVar != null ? aVar.f12094b : null;
        u0().f28175t.setText(b.G0(cryptowalletDomain != null ? cryptowalletDomain.f11078g : null, cryptowalletDomain != null ? cryptowalletDomain.f11077f : null));
        u0().f28171p.setText(cryptowalletDomain != null ? cryptowalletDomain.f11074c : null);
        if (cryptowalletDomain != null && (str3 = cryptowalletDomain.f11078g) != null && (z10 = b.z(str3)) != null) {
            u0().f28172q.setImageResource(z10.intValue());
        }
        M3 u02 = u0();
        String str4 = "";
        if (cryptoAccountDomain == null || (str = cryptoAccountDomain.f10965c) == null) {
            str = "";
        }
        u02.f28177v.setText(str);
        M3 u03 = u0();
        if (cryptoAccountDomain != null && (str2 = cryptoAccountDomain.f10968f) != null) {
            str4 = str2;
        }
        u03.f28178w.setText(str4);
        u0().f28169n.setText(cryptoAccountDomain != null ? defpackage.a.a(cryptoAccountDomain, 30, 20) : null);
        u0().f28176u.setText(b.G0(cryptoAccountDomain != null ? cryptoAccountDomain.f10969g : null, cryptoAccountDomain != null ? cryptoAccountDomain.f10968f : null));
        final int i9 = 1;
        o.c(u0().f28170o, 500L, new InterfaceC0635a(this) { // from class: o7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DepositCryptoDetailsFragment f24389b;

            {
                this.f24389b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                CryptowalletDomain cryptowalletDomain2;
                String str42;
                CryptoAccountDomain cryptoAccountDomain2;
                String str5;
                String str6;
                CryptoAccountDomain cryptoAccountDomain22;
                String str7;
                switch (i9) {
                    case 0:
                        DepositCryptoDetailsFragment depositCryptoDetailsFragment = this.f24389b;
                        com.luminary.business.presentation.ui.fragments.crypto.deposit_crypto.a aVar2 = depositCryptoDetailsFragment.f12090o0;
                        if (aVar2 != null && (cryptowalletDomain2 = aVar2.f12093a) != null && (str42 = cryptowalletDomain2.f11081k) != null) {
                            depositCryptoDetailsFragment.r0(str42);
                        }
                        break;
                    case 1:
                        U4.b.g(this.f24389b).m(R.id.homeFragment, false);
                        break;
                    case 2:
                        DepositCryptoDetailsFragment depositCryptoDetailsFragment2 = this.f24389b;
                        com.luminary.business.presentation.ui.fragments.crypto.deposit_crypto.a aVar22 = depositCryptoDetailsFragment2.f12090o0;
                        DialogC1623d dialogC1623d = null;
                        if (aVar22 != null && (cryptoAccountDomain2 = aVar22.f12094b) != null && (str5 = cryptoAccountDomain2.f10969g) != null && (str6 = cryptoAccountDomain2.f10965c) != null) {
                            dialogC1623d = new DialogC1623d(depositCryptoDetailsFragment2.requireContext(), str6, str5);
                        }
                        if (dialogC1623d != null) {
                            dialogC1623d.f31135s.f29099p.setText(depositCryptoDetailsFragment2.getString(R.string.qr));
                        }
                        if (dialogC1623d != null) {
                            dialogC1623d.show();
                        }
                        break;
                    default:
                        DepositCryptoDetailsFragment depositCryptoDetailsFragment3 = this.f24389b;
                        com.luminary.business.presentation.ui.fragments.crypto.deposit_crypto.a aVar3 = depositCryptoDetailsFragment3.f12090o0;
                        if (aVar3 != null && (cryptoAccountDomain22 = aVar3.f12094b) != null && (str7 = cryptoAccountDomain22.f10965c) != null) {
                            depositCryptoDetailsFragment3.r0(str7);
                        }
                        break;
                }
                return p.f3034a;
            }
        });
        final int i10 = 2;
        o.c(u0().f28174s, 500L, new InterfaceC0635a(this) { // from class: o7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DepositCryptoDetailsFragment f24389b;

            {
                this.f24389b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                CryptowalletDomain cryptowalletDomain2;
                String str42;
                CryptoAccountDomain cryptoAccountDomain2;
                String str5;
                String str6;
                CryptoAccountDomain cryptoAccountDomain22;
                String str7;
                switch (i10) {
                    case 0:
                        DepositCryptoDetailsFragment depositCryptoDetailsFragment = this.f24389b;
                        com.luminary.business.presentation.ui.fragments.crypto.deposit_crypto.a aVar2 = depositCryptoDetailsFragment.f12090o0;
                        if (aVar2 != null && (cryptowalletDomain2 = aVar2.f12093a) != null && (str42 = cryptowalletDomain2.f11081k) != null) {
                            depositCryptoDetailsFragment.r0(str42);
                        }
                        break;
                    case 1:
                        U4.b.g(this.f24389b).m(R.id.homeFragment, false);
                        break;
                    case 2:
                        DepositCryptoDetailsFragment depositCryptoDetailsFragment2 = this.f24389b;
                        com.luminary.business.presentation.ui.fragments.crypto.deposit_crypto.a aVar22 = depositCryptoDetailsFragment2.f12090o0;
                        DialogC1623d dialogC1623d = null;
                        if (aVar22 != null && (cryptoAccountDomain2 = aVar22.f12094b) != null && (str5 = cryptoAccountDomain2.f10969g) != null && (str6 = cryptoAccountDomain2.f10965c) != null) {
                            dialogC1623d = new DialogC1623d(depositCryptoDetailsFragment2.requireContext(), str6, str5);
                        }
                        if (dialogC1623d != null) {
                            dialogC1623d.f31135s.f29099p.setText(depositCryptoDetailsFragment2.getString(R.string.qr));
                        }
                        if (dialogC1623d != null) {
                            dialogC1623d.show();
                        }
                        break;
                    default:
                        DepositCryptoDetailsFragment depositCryptoDetailsFragment3 = this.f24389b;
                        com.luminary.business.presentation.ui.fragments.crypto.deposit_crypto.a aVar3 = depositCryptoDetailsFragment3.f12090o0;
                        if (aVar3 != null && (cryptoAccountDomain22 = aVar3.f12094b) != null && (str7 = cryptoAccountDomain22.f10965c) != null) {
                            depositCryptoDetailsFragment3.r0(str7);
                        }
                        break;
                }
                return p.f3034a;
            }
        });
        final int i11 = 3;
        o.c(u0().f28173r, 500L, new InterfaceC0635a(this) { // from class: o7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DepositCryptoDetailsFragment f24389b;

            {
                this.f24389b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                CryptowalletDomain cryptowalletDomain2;
                String str42;
                CryptoAccountDomain cryptoAccountDomain2;
                String str5;
                String str6;
                CryptoAccountDomain cryptoAccountDomain22;
                String str7;
                switch (i11) {
                    case 0:
                        DepositCryptoDetailsFragment depositCryptoDetailsFragment = this.f24389b;
                        com.luminary.business.presentation.ui.fragments.crypto.deposit_crypto.a aVar2 = depositCryptoDetailsFragment.f12090o0;
                        if (aVar2 != null && (cryptowalletDomain2 = aVar2.f12093a) != null && (str42 = cryptowalletDomain2.f11081k) != null) {
                            depositCryptoDetailsFragment.r0(str42);
                        }
                        break;
                    case 1:
                        U4.b.g(this.f24389b).m(R.id.homeFragment, false);
                        break;
                    case 2:
                        DepositCryptoDetailsFragment depositCryptoDetailsFragment2 = this.f24389b;
                        com.luminary.business.presentation.ui.fragments.crypto.deposit_crypto.a aVar22 = depositCryptoDetailsFragment2.f12090o0;
                        DialogC1623d dialogC1623d = null;
                        if (aVar22 != null && (cryptoAccountDomain2 = aVar22.f12094b) != null && (str5 = cryptoAccountDomain2.f10969g) != null && (str6 = cryptoAccountDomain2.f10965c) != null) {
                            dialogC1623d = new DialogC1623d(depositCryptoDetailsFragment2.requireContext(), str6, str5);
                        }
                        if (dialogC1623d != null) {
                            dialogC1623d.f31135s.f29099p.setText(depositCryptoDetailsFragment2.getString(R.string.qr));
                        }
                        if (dialogC1623d != null) {
                            dialogC1623d.show();
                        }
                        break;
                    default:
                        DepositCryptoDetailsFragment depositCryptoDetailsFragment3 = this.f24389b;
                        com.luminary.business.presentation.ui.fragments.crypto.deposit_crypto.a aVar3 = depositCryptoDetailsFragment3.f12090o0;
                        if (aVar3 != null && (cryptoAccountDomain22 = aVar3.f12094b) != null && (str7 = cryptoAccountDomain22.f10965c) != null) {
                            depositCryptoDetailsFragment3.r0(str7);
                        }
                        break;
                }
                return p.f3034a;
            }
        });
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12089n0;
    }
}

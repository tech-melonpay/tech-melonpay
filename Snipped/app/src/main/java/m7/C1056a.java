package m7;

import F8.o;
import O9.p;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.appcompat.app.b;
import androidx.navigation.NavController;
import ca.InterfaceC0635a;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import com.luminary.business.presentation.ui.fragments.crypto.crypto_exchange.CryptoExchangeFragment;
import com.luminary.business.presentation.ui.fragments.crypto.crypto_exchange.CryptoExchangeFragment$Companion$DirectionType;
import com.luminary.mobile.R;

/* compiled from: R8$$SyntheticClass */
/* renamed from: m7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1056a implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23956a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CryptoExchangeFragment f23957b;

    public /* synthetic */ C1056a(CryptoExchangeFragment cryptoExchangeFragment, int i) {
        this.f23956a = i;
        this.f23957b = cryptoExchangeFragment;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        Window window;
        Float f10;
        switch (this.f23956a) {
            case 0:
                this.f23957b.u0().f27789w.callOnClick();
                break;
            case 1:
                CryptoExchangeFragment cryptoExchangeFragment = this.f23957b;
                if (cryptoExchangeFragment.f12018B0 == CryptoExchangeFragment$Companion$DirectionType.f12051b) {
                    cryptoExchangeFragment.e1(true);
                } else {
                    cryptoExchangeFragment.e1(true);
                }
                break;
            case 2:
                androidx.appcompat.app.b bVar = this.f23957b.f12028L0;
                if (bVar != null) {
                    bVar.dismiss();
                }
                break;
            case 3:
                CryptoExchangeFragment cryptoExchangeFragment2 = this.f23957b;
                if (cryptoExchangeFragment2.f12018B0 == CryptoExchangeFragment$Companion$DirectionType.f12051b) {
                    cryptoExchangeFragment2.e1(false);
                } else {
                    cryptoExchangeFragment2.e1(false);
                }
                break;
            case 4:
                CryptoExchangeFragment cryptoExchangeFragment3 = this.f23957b;
                View inflate = cryptoExchangeFragment3.getLayoutInflater().inflate(R.layout.dialog_rates, (ViewGroup) null);
                cryptoExchangeFragment3.f12028L0 = new b.a(cryptoExchangeFragment3.requireContext()).setView(inflate).create();
                o.c((ImageView) inflate.findViewById(R.id.close), 500L, new C1056a(cryptoExchangeFragment3, 2));
                androidx.appcompat.app.b bVar2 = cryptoExchangeFragment3.f12028L0;
                if (bVar2 != null && (window = bVar2.getWindow()) != null) {
                    window.setBackgroundDrawableResource(android.R.color.transparent);
                }
                androidx.appcompat.app.b bVar3 = cryptoExchangeFragment3.f12028L0;
                if (bVar3 != null) {
                    bVar3.show();
                }
                break;
            case 5:
                CryptoExchangeFragment cryptoExchangeFragment4 = this.f23957b;
                if (K3.a.c(cryptoExchangeFragment4.f12021E0) && K3.a.c(cryptoExchangeFragment4.f12022F0)) {
                    Float f11 = cryptoExchangeFragment4.f12023G0;
                    if (f11 != null) {
                        U4.b.g(cryptoExchangeFragment4).j(new g(null, null, cryptoExchangeFragment4.f12038w0, cryptoExchangeFragment4.f12041z0, cryptoExchangeFragment4.f12021E0, cryptoExchangeFragment4.f12022F0, Float.parseFloat(D9.b.r0(String.valueOf(cryptoExchangeFragment4.u0().f27775B.getText()))), Float.parseFloat(D9.b.r0(String.valueOf(cryptoExchangeFragment4.u0().f27787u.getText()))), f11.floatValue(), cryptoExchangeFragment4.f12024H0, false));
                    }
                } else {
                    if (K3.a.c(cryptoExchangeFragment4.f12021E0) && D9.b.Z(cryptoExchangeFragment4.f12022F0) && cryptoExchangeFragment4.u0().f27792z.getSelectedTabPosition() == 0) {
                        Float f12 = cryptoExchangeFragment4.f12023G0;
                        if (f12 != null) {
                            U4.b.g(cryptoExchangeFragment4).j(new g(cryptoExchangeFragment4.f12017A0, null, cryptoExchangeFragment4.f12038w0, null, cryptoExchangeFragment4.f12021E0, cryptoExchangeFragment4.f12022F0, Float.parseFloat(D9.b.r0(String.valueOf(cryptoExchangeFragment4.u0().f27775B.getText()))), Float.parseFloat(D9.b.r0(String.valueOf(cryptoExchangeFragment4.u0().f27787u.getText()))), f12.floatValue(), cryptoExchangeFragment4.f12024H0, cryptoExchangeFragment4.u0().f27792z.getSelectedTabPosition() == 1));
                        }
                    } else if (D9.b.Z(cryptoExchangeFragment4.f12021E0) && D9.b.Z(cryptoExchangeFragment4.f12022F0) && cryptoExchangeFragment4.u0().f27792z.getSelectedTabPosition() == 0) {
                        Float f13 = cryptoExchangeFragment4.f12023G0;
                        if (f13 != null) {
                            U4.b.g(cryptoExchangeFragment4).j(new g(cryptoExchangeFragment4.f12039x0, cryptoExchangeFragment4.f12017A0, null, null, cryptoExchangeFragment4.f12021E0, cryptoExchangeFragment4.f12022F0, Float.parseFloat(D9.b.r0(String.valueOf(cryptoExchangeFragment4.u0().f27775B.getText()))), Float.parseFloat(D9.b.r0(String.valueOf(cryptoExchangeFragment4.u0().f27787u.getText()))), f13.floatValue(), cryptoExchangeFragment4.f12024H0, false));
                        }
                    } else if (K3.a.c(cryptoExchangeFragment4.f12021E0) && D9.b.Z(cryptoExchangeFragment4.f12022F0) && cryptoExchangeFragment4.u0().f27792z.getSelectedTabPosition() == 1) {
                        Float f14 = cryptoExchangeFragment4.f12023G0;
                        if (f14 != null) {
                            float floatValue = f14.floatValue();
                            NavController g10 = U4.b.g(cryptoExchangeFragment4);
                            BankAccountDomain bankAccountDomain = cryptoExchangeFragment4.f12041z0;
                            if (bankAccountDomain == null) {
                                bankAccountDomain = cryptoExchangeFragment4.f12038w0;
                            }
                            BankAccountDomain bankAccountDomain2 = bankAccountDomain;
                            CryptoAccountDomain cryptoAccountDomain = cryptoExchangeFragment4.f12017A0;
                            if (cryptoAccountDomain == null) {
                                cryptoAccountDomain = cryptoExchangeFragment4.f12039x0;
                            }
                            g10.j(new f(cryptoAccountDomain, bankAccountDomain2, cryptoExchangeFragment4.f12021E0, cryptoExchangeFragment4.f12022F0, Float.parseFloat(D9.b.r0(String.valueOf(cryptoExchangeFragment4.u0().f27775B.getText()))), Float.parseFloat(D9.b.r0(String.valueOf(cryptoExchangeFragment4.u0().f27787u.getText()))), floatValue));
                        }
                    } else if (D9.b.Z(cryptoExchangeFragment4.f12021E0) && K3.a.c(cryptoExchangeFragment4.f12022F0) && cryptoExchangeFragment4.u0().f27792z.getSelectedTabPosition() == 0) {
                        Float f15 = cryptoExchangeFragment4.f12023G0;
                        if (f15 != null) {
                            U4.b.g(cryptoExchangeFragment4).j(new g(cryptoExchangeFragment4.f12039x0, null, null, cryptoExchangeFragment4.f12041z0, cryptoExchangeFragment4.f12021E0, cryptoExchangeFragment4.f12022F0, Float.parseFloat(D9.b.r0(String.valueOf(cryptoExchangeFragment4.u0().f27775B.getText()))), Float.parseFloat(D9.b.r0(String.valueOf(cryptoExchangeFragment4.u0().f27787u.getText()))), f15.floatValue(), cryptoExchangeFragment4.f12024H0, false));
                        }
                    } else if (D9.b.Z(cryptoExchangeFragment4.f12021E0) && K3.a.c(cryptoExchangeFragment4.f12022F0) && cryptoExchangeFragment4.u0().f27792z.getSelectedTabPosition() == 1 && (f10 = cryptoExchangeFragment4.f12023G0) != null) {
                        float floatValue2 = f10.floatValue();
                        NavController g11 = U4.b.g(cryptoExchangeFragment4);
                        CryptoAccountDomain cryptoAccountDomain2 = cryptoExchangeFragment4.f12017A0;
                        if (cryptoAccountDomain2 == null) {
                            cryptoAccountDomain2 = cryptoExchangeFragment4.f12039x0;
                        }
                        g11.j(new h(cryptoAccountDomain2, cryptoExchangeFragment4.f12021E0, cryptoExchangeFragment4.f12022F0, Float.parseFloat(D9.b.r0(String.valueOf(cryptoExchangeFragment4.u0().f27775B.getText()))), Float.parseFloat(D9.b.r0(String.valueOf(cryptoExchangeFragment4.u0().f27787u.getText()))), floatValue2, cryptoExchangeFragment4.f12024H0));
                    }
                }
                break;
            case 6:
                this.f23957b.u0().f27780n.callOnClick();
                break;
            default:
                this.f23957b.u0().f27788v.callOnClick();
                break;
        }
        return p.f3034a;
    }
}

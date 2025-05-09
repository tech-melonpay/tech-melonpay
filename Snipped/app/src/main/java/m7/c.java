package m7;

import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import com.luminary.business.presentation.ui.fragments.crypto.crypto_exchange.CryptoExchangeFragment;
import java.math.BigDecimal;
import ka.C0966k;
import t6.E3;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23960a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CryptoExchangeFragment f23961b;

    public /* synthetic */ c(CryptoExchangeFragment cryptoExchangeFragment, int i) {
        this.f23960a = i;
        this.f23961b = cryptoExchangeFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        double d10;
        switch (this.f23960a) {
            case 0:
                CryptoExchangeFragment cryptoExchangeFragment = this.f23961b;
                if (cryptoExchangeFragment.isAdded()) {
                    cryptoExchangeFragment.Z0();
                    break;
                }
                break;
            case 1:
                CryptoExchangeFragment cryptoExchangeFragment2 = this.f23961b;
                E3 u02 = cryptoExchangeFragment2.u0();
                BankAccountDomain bankAccountDomain = cryptoExchangeFragment2.f12038w0;
                BigDecimal bigDecimal = bankAccountDomain != null ? bankAccountDomain.f10698e : null;
                CryptoAccountDomain cryptoAccountDomain = cryptoExchangeFragment2.f12039x0;
                Double d11 = cryptoAccountDomain != null ? cryptoAccountDomain.f10977p : null;
                boolean z11 = false;
                if (bigDecimal == null || cryptoExchangeFragment2.f12020D0 != 0) {
                    z10 = false;
                    d10 = 0.0d;
                } else {
                    d10 = bigDecimal.doubleValue();
                    z10 = true;
                }
                if (d11 != null) {
                    d10 = d11.doubleValue();
                    z10 = true;
                }
                cryptoExchangeFragment2.u0();
                if (z10) {
                    if (d10 < (D9.b.r0(String.valueOf(cryptoExchangeFragment2.u0().f27787u.getText())).length() == 0 ? 0.0d : Double.parseDouble(D9.b.r0(String.valueOf(cryptoExchangeFragment2.u0().f27787u.getText()))))) {
                        cryptoExchangeFragment2.c1(true, null);
                        u02.f27780n.setEnabled(z11);
                        cryptoExchangeFragment2.u0().f27781o.setEnabled(cryptoExchangeFragment2.u0().f27780n.isEnabled());
                        break;
                    } else {
                        cryptoExchangeFragment2.u0().f27786t.setError(null);
                    }
                } else {
                    cryptoExchangeFragment2.u0().f27786t.setError(null);
                }
                if (cryptoExchangeFragment2.f12021E0.length() > 0 && cryptoExchangeFragment2.f12022F0.length() > 0 && String.valueOf(cryptoExchangeFragment2.u0().f27775B.getText()).length() > 0) {
                    Double R = C0966k.R(D9.b.r0(String.valueOf(cryptoExchangeFragment2.u0().f27775B.getText())));
                    if ((R != null ? R.doubleValue() : 0.0d) > 0.0d && cryptoExchangeFragment2.u0().f27787u.f() && cryptoExchangeFragment2.f12023G0 != null && cryptoExchangeFragment2.f12034r0 != null) {
                        z11 = true;
                    }
                }
                u02.f27780n.setEnabled(z11);
                cryptoExchangeFragment2.u0().f27781o.setEnabled(cryptoExchangeFragment2.u0().f27780n.isEnabled());
                break;
            default:
                CryptoExchangeFragment cryptoExchangeFragment3 = this.f23961b;
                if (cryptoExchangeFragment3.f12040y0 != null) {
                    cryptoExchangeFragment3.u0().f27787u.c(K3.a.a(cryptoExchangeFragment3.f12021E0), CryptoExchangeFragment.W0(cryptoExchangeFragment3.f12021E0, cryptoExchangeFragment3.f12040y0));
                    break;
                }
                break;
        }
    }
}

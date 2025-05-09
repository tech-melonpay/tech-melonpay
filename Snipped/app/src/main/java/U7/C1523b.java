package u7;

import O9.p;
import androidx.navigation.NavController;
import ca.InterfaceC0635a;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import com.luminary.business.presentation.ui.fragments.crypto.crypto_wallet_list.CryptoListFragment;
import com.luminary.business.presentation.ui.fragments.crypto.withdraw_crypto.WithdrawCryptoFragment;
import com.luminary.mobile.R;

/* compiled from: R8$$SyntheticClass */
/* renamed from: u7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1523b implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30327a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WithdrawCryptoFragment f30328b;

    public /* synthetic */ C1523b(WithdrawCryptoFragment withdrawCryptoFragment, int i) {
        this.f30327a = i;
        this.f30328b = withdrawCryptoFragment;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        String str;
        Long l10;
        switch (this.f30327a) {
            case 0:
                WithdrawCryptoFragment withdrawCryptoFragment = this.f30328b;
                NavController g10 = U4.b.g(withdrawCryptoFragment);
                com.luminary.business.presentation.ui.fragments.crypto.withdraw_crypto.a aVar = withdrawCryptoFragment.f12186o0;
                g10.j(new C1524c(aVar != null ? aVar.f12200c : null, CryptoListFragment.DIRECTION.f12080b));
                return p.f3034a;
            case 1:
                WithdrawCryptoFragment withdrawCryptoFragment2 = this.f30328b;
                final f fVar = (f) withdrawCryptoFragment2.f12187p0.getValue();
                CryptoAccountDomain cryptoAccountDomain = withdrawCryptoFragment2.f12190t0;
                if (cryptoAccountDomain == null || (str = cryptoAccountDomain.f10969g) == null) {
                    str = "";
                }
                final String str2 = str;
                final int longValue = (cryptoAccountDomain == null || (l10 = cryptoAccountDomain.f10963a) == null) ? 0 : (int) l10.longValue();
                Integer num = withdrawCryptoFragment2.s0;
                final int intValue = num != null ? num.intValue() : 0;
                final float parseFloat = Float.parseFloat(D9.b.r0(String.valueOf(withdrawCryptoFragment2.u0().f27752p.getText())));
                InterfaceC0635a<p> interfaceC0635a = new InterfaceC0635a() { // from class: u7.d
                    @Override // ca.InterfaceC0635a
                    public final Object invoke() {
                        f fVar2 = f.this;
                        fVar2.l();
                        v5.c cVar = new v5.c(fVar2.f30339T0.h(), str2, Integer.valueOf(longValue), Integer.valueOf(intValue), Float.valueOf(parseFloat));
                        fVar2.f30340U0.a(new e(fVar2, 0), cVar);
                        return p.f3034a;
                    }
                };
                fVar.f418J0 = interfaceC0635a;
                interfaceC0635a.invoke();
                return p.f3034a;
            case 2:
                this.f30328b.u0().f27754r.performClick();
                return p.f3034a;
            default:
                return Boolean.valueOf(U4.b.g(this.f30328b).m(R.id.homeFragment, false));
        }
    }
}

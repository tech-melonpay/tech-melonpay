package q7;

import O9.p;
import ca.InterfaceC0635a;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.crypto.crypto_exchange.CryptoExchangeFragment$Companion$DirectionType;
import com.luminary.business.presentation.ui.fragments.crypto.exchange_list.ExchangeListFragment;
import com.luminary.mobile.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25899a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ExchangeListFragment f25900b;

    public /* synthetic */ f(ExchangeListFragment exchangeListFragment, int i) {
        this.f25899a = i;
        this.f25900b = exchangeListFragment;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        switch (this.f25899a) {
            case 0:
                ExchangeListFragment exchangeListFragment = this.f25900b;
                G5.a l10 = ((K5.a) exchangeListFragment.f12109q0.getValue()).l();
                String str = l10 != null ? l10.f1320a : null;
                if (str == null || str.length() == 0) {
                    BaseFragment.q0(exchangeListFragment, P9.m.n(exchangeListFragment.getString(R.string.support_email_app_name)));
                } else {
                    G5.a l11 = ((K5.a) exchangeListFragment.f12109q0.getValue()).l();
                    BaseFragment.q0(exchangeListFragment, P9.m.n(l11 != null ? l11.f1320a : null));
                }
                break;
            default:
                U4.b.g(this.f25900b).j(i.a(true, CryptoExchangeFragment$Companion$DirectionType.f12051b, "", ""));
                break;
        }
        return p.f3034a;
    }
}

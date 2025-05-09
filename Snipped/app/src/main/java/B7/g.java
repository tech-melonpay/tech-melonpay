package B7;

import C.v;
import O9.p;
import androidx.navigation.NavController;
import ca.InterfaceC0635a;
import com.luminary.business.presentation.ui.fragments.crypto.crypto_exchange.CryptoExchangeFragment$Companion$DirectionType;
import com.luminary.business.presentation.ui.fragments.home.newhome.NewHomeFragment;
import com.luminary.mobile.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f448a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewHomeFragment f449b;

    public /* synthetic */ g(NewHomeFragment newHomeFragment, int i) {
        this.f448a = i;
        this.f449b = newHomeFragment;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        NewHomeFragment newHomeFragment = this.f449b;
        switch (this.f448a) {
            case 0:
                newHomeFragment.J0();
                break;
            case 1:
                NavController g10 = U4.b.g(newHomeFragment);
                CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType = CryptoExchangeFragment$Companion$DirectionType.f12050a;
                g10.j(new j("", "", 0.0f));
                break;
            case 2:
                v.w(U4.b.g(newHomeFragment), R.id.action_homeFragment_to_createAccountFragment);
                break;
            default:
                v.w(U4.b.g(newHomeFragment), R.id.action_homeFragment_to_allFeeFragment);
                break;
        }
        return p.f3034a;
    }
}

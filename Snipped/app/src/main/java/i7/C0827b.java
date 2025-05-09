package i7;

import C.v;
import O9.p;
import androidx.navigation.NavController;
import ca.InterfaceC0635a;
import com.luminary.business.presentation.ui.fragments.crypto.buy_external_account.BuyExternalAccountDetailsFragment;
import com.luminary.mobile.R;
import g8.g;

/* compiled from: R8$$SyntheticClass */
/* renamed from: i7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0827b implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21485a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BuyExternalAccountDetailsFragment f21486b;

    public /* synthetic */ C0827b(BuyExternalAccountDetailsFragment buyExternalAccountDetailsFragment, int i) {
        this.f21485a = i;
        this.f21486b = buyExternalAccountDetailsFragment;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        switch (this.f21485a) {
            case 0:
                NavController g10 = U4.b.g(this.f21486b);
                g10.i(R.id.action_buyExternalAccountDetailsFragment_to_countrySelectFragment, v.h(g10, "isCountryCode", false, "fieldName", ""));
                break;
            case 1:
                C0830e T02 = this.f21486b.T0();
                T02.getClass();
                g gVar = new g(T02, 5);
                T02.f418J0 = gVar;
                gVar.invoke();
                break;
            case 2:
                BuyExternalAccountDetailsFragment buyExternalAccountDetailsFragment = this.f21486b;
                buyExternalAccountDetailsFragment.r0(((Object) buyExternalAccountDetailsFragment.u0().f28262u.getText()) + "\n" + ((Object) buyExternalAccountDetailsFragment.u0().f28263v.getText()) + "\n" + ((Object) buyExternalAccountDetailsFragment.u0().f28250B.getText()) + "\n" + ((Object) buyExternalAccountDetailsFragment.u0().f28251C.getText()) + "\n" + ((Object) buyExternalAccountDetailsFragment.u0().f28252D.getText()) + "\n" + ((Object) buyExternalAccountDetailsFragment.u0().f28253E.getText()) + "\n" + ((Object) buyExternalAccountDetailsFragment.u0().f28264w.getText()) + "\n" + ((Object) buyExternalAccountDetailsFragment.u0().f28265x.getText()) + "\n" + ((Object) buyExternalAccountDetailsFragment.u0().f28260s.getText()) + "\n" + ((Object) buyExternalAccountDetailsFragment.u0().f28261t.getText()) + "\n");
                break;
            default:
                U4.b.g(this.f21486b).m(R.id.homeFragment, false);
                break;
        }
        return p.f3034a;
    }
}

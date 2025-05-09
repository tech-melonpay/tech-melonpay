package G6;

import Fa.h;
import O9.p;
import androidx.navigation.NavController;
import ca.InterfaceC0646l;
import com.luminary.business.presentation.ui.fragments.auth.accountinformation.AccountInformationFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1326a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AccountInformationFragment f1327b;

    public /* synthetic */ b(AccountInformationFragment accountInformationFragment, int i) {
        this.f1326a = i;
        this.f1327b = accountInformationFragment;
    }

    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        switch (this.f1326a) {
            case 0:
                AccountInformationFragment accountInformationFragment = this.f1327b;
                accountInformationFragment.u0().f27664B.setText((String) obj);
                accountInformationFragment.u0().f27664B.setSelection(0);
                accountInformationFragment.T0();
                break;
            default:
                AccountInformationFragment accountInformationFragment2 = this.f1327b;
                NavController g10 = U4.b.g(accountInformationFragment2);
                h hVar = accountInformationFragment2.f11533w0;
                g10.j(new d(((c) hVar.getValue()).f1328a, ((c) hVar.getValue()).f1329b, ((c) hVar.getValue()).f1330c, ((c) hVar.getValue()).f1331d));
                break;
        }
        return p.f3034a;
    }
}

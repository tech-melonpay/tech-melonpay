package V6;

import O9.p;
import ca.InterfaceC0635a;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.domain.entity.cards.VaultDomain;
import com.luminary.business.presentation.ui.fragments.cards.confirm_topup.ConfirmTopUpFragment;
import ka.C0966k;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3727a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConfirmTopUpFragment f3728b;

    public /* synthetic */ a(ConfirmTopUpFragment confirmTopUpFragment, int i) {
        this.f3727a = i;
        this.f3728b = confirmTopUpFragment;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        BankAccountDomain bankAccountDomain;
        Integer num;
        VaultDomain vaultDomain;
        switch (this.f3727a) {
            case 0:
                ConfirmTopUpFragment confirmTopUpFragment = this.f3728b;
                VaultDomain vaultDomain2 = confirmTopUpFragment.T0().f3730b;
                Double R = C0966k.R(D9.b.r0(confirmTopUpFragment.T0().f3734f));
                VaultDomain vaultDomain3 = confirmTopUpFragment.T0().f3732d;
                H1.a aVar = confirmTopUpFragment.f11778o0;
                if (vaultDomain3 != null && vaultDomain2 != null && (vaultDomain = confirmTopUpFragment.T0().f3732d) != null && R != null) {
                    double doubleValue = R.doubleValue();
                    e eVar = (e) aVar.getValue();
                    c cVar = new c(eVar, vaultDomain.f10778a, vaultDomain2.f10778a, doubleValue, 0);
                    eVar.f421M0 = cVar;
                    cVar.invoke();
                }
                if (confirmTopUpFragment.T0().f3731c != null && vaultDomain2 != null && (bankAccountDomain = confirmTopUpFragment.T0().f3731c) != null && (num = bankAccountDomain.f10694a) != null) {
                    int intValue = num.intValue();
                    if (R != null) {
                        double doubleValue2 = R.doubleValue();
                        e eVar2 = (e) aVar.getValue();
                        c cVar2 = new c(eVar2, intValue, vaultDomain2.f10778a, doubleValue2, 1);
                        eVar2.f420L0 = cVar2;
                        cVar2.invoke();
                    }
                }
                return p.f3034a;
            case 1:
                this.f3728b.u0().f29311o.performClick();
                return p.f3034a;
            case 2:
                ConfirmTopUpFragment confirmTopUpFragment2 = this.f3728b;
                return Boolean.valueOf(U4.b.g(confirmTopUpFragment2).m(confirmTopUpFragment2.T0().f3729a, false));
            default:
                ConfirmTopUpFragment confirmTopUpFragment3 = this.f3728b;
                return Boolean.valueOf(U4.b.g(confirmTopUpFragment3).m(confirmTopUpFragment3.T0().f3729a, false));
        }
    }
}

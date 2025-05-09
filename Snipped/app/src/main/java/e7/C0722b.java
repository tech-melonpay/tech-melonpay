package e7;

import O9.p;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.cards.VaultDomain;
import com.luminary.business.presentation.ui.fragments.createNewVirtualCard.CreateNewVirtualCardFragment;
import h4.i;

/* compiled from: FragmentExt.kt */
/* renamed from: e7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0722b implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20539a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreateNewVirtualCardFragment f20540b;

    public /* synthetic */ C0722b(CreateNewVirtualCardFragment createNewVirtualCardFragment, int i) {
        this.f20539a = i;
        this.f20540b = createNewVirtualCardFragment;
    }

    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        Integer num;
        switch (this.f20539a) {
            case 0:
                Boolean bool = (Boolean) obj;
                if (bool != null) {
                    CreateNewVirtualCardFragment createNewVirtualCardFragment = this.f20540b;
                    createNewVirtualCardFragment.u0().f27605n.setEnabled(bool.booleanValue());
                    createNewVirtualCardFragment.u0().f27606o.setEnabled(bool.booleanValue());
                }
                break;
            case 1:
                i iVar = (i) obj;
                if (iVar != null) {
                    String str = iVar.f21120c;
                    CreateNewVirtualCardFragment createNewVirtualCardFragment2 = this.f20540b;
                    createNewVirtualCardFragment2.V0(str);
                    createNewVirtualCardFragment2.u0().f27609r.setVisibility(0);
                    createNewVirtualCardFragment2.u0().f27609r.setInfoText(iVar.f21122e);
                }
                break;
            default:
                CreateNewVirtualCardFragment createNewVirtualCardFragment3 = this.f20540b;
                VaultDomain vaultDomain = createNewVirtualCardFragment3.T0().f20547g;
                if (vaultDomain != null && (num = vaultDomain.f10793q) != null) {
                    createNewVirtualCardFragment3.U0().m(num.intValue());
                }
                break;
        }
        return p.f3034a;
    }
}

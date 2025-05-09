package R7;

import C.v;
import O9.p;
import P9.s;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavController;
import ca.InterfaceC0646l;
import com.luminary.business.presentation.entity.company.BankAccountOutside;
import com.luminary.business.presentation.entity.company.CompanyDetailsUI;
import com.luminary.business.presentation.ui.fragments.newcompany.NewCompanyViewModel;
import com.luminary.business.presentation.ui.fragments.newcompany.businessactivity.BusinessActivityFragment;
import com.luminary.mobile.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3301a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BusinessActivityFragment f3302b;

    public /* synthetic */ d(BusinessActivityFragment businessActivityFragment, int i) {
        this.f3301a = i;
        this.f3302b = businessActivityFragment;
    }

    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        ArrayList<BankAccountOutside> arrayList;
        List<String> list;
        List<String> list2;
        switch (this.f3301a) {
            case 0:
                String str = (String) obj;
                BusinessActivityFragment businessActivityFragment = this.f3302b;
                businessActivityFragment.f12535t0.add(str);
                businessActivityFragment.u0().f28160r.setText(str);
                businessActivityFragment.f12535t0 = new ArrayList<>(s.F(businessActivityFragment.f12535t0));
                CompanyDetailsUI companyDetailsUI = businessActivityFragment.V0().f12446k1;
                if (companyDetailsUI == null) {
                    companyDetailsUI = null;
                }
                CompanyDetailsUI.CompanyUI companyUI = companyDetailsUI.f11192a;
                if (companyUI != null) {
                    companyUI.f11239l0 = businessActivityFragment.f12535t0;
                }
                businessActivityFragment.X0(businessActivityFragment.u0().f28161s, businessActivityFragment.f12535t0);
                businessActivityFragment.Y0();
                return p.f3034a;
            case 1:
                BusinessActivityFragment businessActivityFragment2 = this.f3302b;
                if (businessActivityFragment2.f12534r0.isEmpty()) {
                    businessActivityFragment2.u0().f28162t.setText("");
                    CompanyDetailsUI companyDetailsUI2 = businessActivityFragment2.V0().f12446k1;
                    if (companyDetailsUI2 == null) {
                        companyDetailsUI2 = null;
                    }
                    CompanyDetailsUI.CompanyUI companyUI2 = companyDetailsUI2.f11192a;
                    if (companyUI2 != null && (list2 = companyUI2.f11235j0) != null) {
                        for (String str2 : list2) {
                            businessActivityFragment2.f12534r0.add(new Pair<>(businessActivityFragment2.V0().i0(str2), str2));
                        }
                    }
                }
                if (businessActivityFragment2.f12533q0.isEmpty()) {
                    businessActivityFragment2.u0().f28167y.setText("");
                    CompanyDetailsUI companyDetailsUI3 = businessActivityFragment2.V0().f12446k1;
                    if (companyDetailsUI3 == null) {
                        companyDetailsUI3 = null;
                    }
                    CompanyDetailsUI.CompanyUI companyUI3 = companyDetailsUI3.f11192a;
                    if (companyUI3 != null && (list = companyUI3.f11237k0) != null) {
                        for (String str3 : list) {
                            businessActivityFragment2.f12533q0.add(new Pair<>(businessActivityFragment2.V0().i0(str3), str3));
                        }
                    }
                }
                businessActivityFragment2.W0(businessActivityFragment2.u0().f28163u, businessActivityFragment2.f12534r0);
                businessActivityFragment2.W0(businessActivityFragment2.u0().f28168z, businessActivityFragment2.f12533q0);
                CompanyDetailsUI companyDetailsUI4 = businessActivityFragment2.V0().f12446k1;
                CompanyDetailsUI.CompanyUI companyUI4 = (companyDetailsUI4 != null ? companyDetailsUI4 : null).f11192a;
                if (companyUI4 != null && (arrayList = companyUI4.f11241m0) != null) {
                    for (BankAccountOutside bankAccountOutside : arrayList) {
                        NewCompanyViewModel V02 = businessActivityFragment2.V0();
                        String str4 = bankAccountOutside.f11189b;
                        if (str4 == null) {
                            str4 = "";
                        }
                        bankAccountOutside.f11190c = V02.i0(str4);
                    }
                }
                businessActivityFragment2.T0();
                return p.f3034a;
            default:
                BusinessActivityFragment businessActivityFragment3 = this.f3302b;
                NavController g10 = U4.b.g(businessActivityFragment3);
                Parcelable parcelable = businessActivityFragment3.V0().f12446k1;
                if (parcelable == null) {
                    parcelable = null;
                }
                Bundle g11 = v.g(g10);
                if (Parcelable.class.isAssignableFrom(CompanyDetailsUI.class)) {
                    g11.putParcelable("companyDetails", parcelable);
                } else {
                    if (!Serializable.class.isAssignableFrom(CompanyDetailsUI.class)) {
                        throw new UnsupportedOperationException(CompanyDetailsUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                    }
                    g11.putSerializable("companyDetails", (Serializable) parcelable);
                }
                g10.i(R.id.action_businessActivityFragment_to_cryptoInformationFragment, g11);
                return p.f3034a;
        }
    }
}

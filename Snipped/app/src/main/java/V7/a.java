package V7;

import F8.o;
import O9.p;
import P9.s;
import android.os.Bundle;
import androidx.navigation.NavController;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.company.CorporateDetailsDomain;
import com.luminary.business.presentation.entity.company.CreateCompanyUI;
import com.luminary.business.presentation.ui.fragments.newcompany.positionincompany.PositionInCompanyFragment;
import com.luminary.mobile.R;
import java.util.List;
import kotlin.jvm.internal.f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3747a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PositionInCompanyFragment f3748b;

    public /* synthetic */ a(PositionInCompanyFragment positionInCompanyFragment, int i) {
        this.f3747a = i;
        this.f3748b = positionInCompanyFragment;
    }

    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        String str;
        CorporateDetailsDomain.a aVar;
        Integer num;
        String num2;
        Integer num3;
        switch (this.f3747a) {
            case 0:
                CorporateDetailsDomain corporateDetailsDomain = (CorporateDetailsDomain) obj;
                CorporateDetailsDomain.a aVar2 = corporateDetailsDomain.f10804a;
                if (aVar2 == null || (num3 = aVar2.f10889a) == null || (str = num3.toString()) == null) {
                    str = "";
                }
                PositionInCompanyFragment positionInCompanyFragment = this.f3748b;
                positionInCompanyFragment.s0 = str;
                if (!positionInCompanyFragment.f12623q0 && (aVar = corporateDetailsDomain.f10804a) != null && (num = aVar.f10889a) != null && (num2 = num.toString()) != null) {
                    positionInCompanyFragment.f12623q0 = true;
                    NavController g10 = U4.b.g(positionInCompanyFragment);
                    g10.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putString("companyId", num2);
                    bundle.putBoolean("isEdit", false);
                    g10.i(R.id.action_positionInCompanyFragment_to_additionalInformationFragment, bundle);
                }
                break;
            case 1:
                String str2 = (String) obj;
                PositionInCompanyFragment positionInCompanyFragment2 = this.f3748b;
                positionInCompanyFragment2.u0().f27684o.setText(str2);
                if (f.b(str2, "UBO") || f.b(str2, "Shareholder")) {
                    positionInCompanyFragment2.u0().f27690u.setVisibility(0);
                    positionInCompanyFragment2.u0().f27689t.setVisibility(0);
                } else {
                    o.b(positionInCompanyFragment2.u0().f27690u);
                    o.b(positionInCompanyFragment2.u0().f27689t);
                }
                CreateCompanyUI createCompanyUI = positionInCompanyFragment2.T0().f12445j1;
                if (createCompanyUI == null) {
                    createCompanyUI = null;
                }
                createCompanyUI.f11267a = str2;
                positionInCompanyFragment2.U0();
                break;
            default:
                List<String> list = (List) obj;
                PositionInCompanyFragment positionInCompanyFragment3 = this.f3748b;
                positionInCompanyFragment3.u0().f27688s.setText(s.P(list, ", ", null, null, null, 62));
                CreateCompanyUI createCompanyUI2 = positionInCompanyFragment3.T0().f12445j1;
                if (createCompanyUI2 == null) {
                    createCompanyUI2 = null;
                }
                createCompanyUI2.f11287v = list;
                positionInCompanyFragment3.U0();
                break;
        }
        return p.f3034a;
    }
}

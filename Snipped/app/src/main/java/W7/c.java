package W7;

import C.v;
import F8.o;
import O9.p;
import P9.AbstractC0500b;
import P9.n;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.b;
import androidx.navigation.NavController;
import ca.InterfaceC0635a;
import com.luminary.business.domain.entity.company.CorporateDetailsDomain;
import com.luminary.business.presentation.entity.company.CreateCompanyUI;
import com.luminary.business.presentation.ui.fragments.newcompany.NewCompanyViewModel;
import com.luminary.business.presentation.ui.fragments.newcompany.selectcompany.SelectCompanyFragment;
import com.luminary.business.presentation.ui.views.dialogs.SelectorDialog;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3871a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectCompanyFragment f3872b;

    public /* synthetic */ c(SelectCompanyFragment selectCompanyFragment, int i) {
        this.f3871a = i;
        this.f3872b = selectCompanyFragment;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        Window window;
        switch (this.f3871a) {
            case 0:
                SelectCompanyFragment selectCompanyFragment = this.f3872b;
                SelectorDialog selectorDialog = new SelectorDialog(selectCompanyFragment.requireContext());
                selectorDialog.f13206v = new a(selectCompanyFragment, 2);
                selectorDialog.show();
                selectorDialog.l();
                List list = CorporateDetailsDomain.CompanyTypes.i;
                ArrayList arrayList = new ArrayList(n.u(list, 10));
                Iterator it = ((AbstractC0500b) list).iterator();
                while (it.hasNext()) {
                    arrayList.add(((CorporateDetailsDomain.CompanyTypes) it.next()).f10828a);
                }
                selectorDialog.m(arrayList, false);
                selectorDialog.n(selectCompanyFragment.getString(R.string.company_type));
                break;
            case 1:
                SelectCompanyFragment selectCompanyFragment2 = this.f3872b;
                SelectorDialog selectorDialog2 = new SelectorDialog(selectCompanyFragment2.requireContext());
                selectorDialog2.f13206v = new a(selectCompanyFragment2, 6);
                selectorDialog2.show();
                selectorDialog2.l();
                List list2 = CorporateDetailsDomain.EmployeeCount.i;
                ArrayList arrayList2 = new ArrayList(n.u(list2, 10));
                Iterator it2 = ((AbstractC0500b) list2).iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((CorporateDetailsDomain.EmployeeCount) it2.next()).f10836a);
                }
                selectorDialog2.m(arrayList2, false);
                selectorDialog2.n(selectCompanyFragment2.getString(R.string.number_of_employees));
                break;
            case 2:
                SelectCompanyFragment selectCompanyFragment3 = this.f3872b;
                SelectorDialog selectorDialog3 = new SelectorDialog(selectCompanyFragment3.requireContext());
                selectorDialog3.f13206v = new a(selectCompanyFragment3, 5);
                selectorDialog3.show();
                selectorDialog3.l();
                List list3 = CorporateDetailsDomain.SourceOfFunds.i;
                ArrayList arrayList3 = new ArrayList(n.u(list3, 10));
                Iterator it3 = ((AbstractC0500b) list3).iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((CorporateDetailsDomain.SourceOfFunds) it3.next()).f10844a);
                }
                selectorDialog3.m(arrayList3, false);
                selectorDialog3.n(selectCompanyFragment3.getString(R.string.source_of_funds));
                break;
            case 3:
                SelectCompanyFragment selectCompanyFragment4 = this.f3872b;
                SelectorDialog selectorDialog4 = new SelectorDialog(selectCompanyFragment4.requireContext());
                selectorDialog4.f13206v = new a(selectCompanyFragment4, 7);
                selectorDialog4.show();
                selectorDialog4.l();
                List list4 = CorporateDetailsDomain.CompanySourceOfWealth.i;
                ArrayList arrayList4 = new ArrayList(n.u(list4, 10));
                Iterator it4 = ((AbstractC0500b) list4).iterator();
                while (it4.hasNext()) {
                    arrayList4.add(((CorporateDetailsDomain.CompanySourceOfWealth) it4.next()).f10820a);
                }
                selectorDialog4.m(arrayList4, false);
                selectorDialog4.n(selectCompanyFragment4.getString(R.string.source_of_wealth));
                break;
            case 4:
                SelectCompanyFragment selectCompanyFragment5 = this.f3872b;
                View inflate = selectCompanyFragment5.getLayoutInflater().inflate(R.layout.dialog_rates, (ViewGroup) null);
                selectCompanyFragment5.f12640u0 = new b.a(selectCompanyFragment5.requireContext()).setView(inflate).create();
                ImageView imageView = (ImageView) inflate.findViewById(R.id.close);
                TextView textView = (TextView) inflate.findViewById(R.id.tvTitle);
                TextView textView2 = (TextView) inflate.findViewById(R.id.tvDescription);
                textView.setText(R.string.domiciliary_company);
                textView2.setText(R.string.domiciliary_company_description);
                o.c(imageView, 500L, new c(selectCompanyFragment5, 6));
                androidx.appcompat.app.b bVar = selectCompanyFragment5.f12640u0;
                if (bVar != null && (window = bVar.getWindow()) != null) {
                    window.setBackgroundDrawableResource(android.R.color.transparent);
                }
                androidx.appcompat.app.b bVar2 = selectCompanyFragment5.f12640u0;
                if (bVar2 != null) {
                    bVar2.show();
                }
                break;
            case 5:
                SelectCompanyFragment selectCompanyFragment6 = this.f3872b;
                SelectorDialog selectorDialog5 = new SelectorDialog(selectCompanyFragment6.requireContext());
                selectorDialog5.f13206v = new a(selectCompanyFragment6, 1);
                selectorDialog5.show();
                selectorDialog5.l();
                List<String> value = selectCompanyFragment6.T0().f12457w1.getValue();
                if (value == null) {
                    value = new ArrayList<>();
                }
                selectorDialog5.m(value, false);
                selectorDialog5.n(selectCompanyFragment6.getString(R.string.business_sector_type));
                break;
            case 6:
                androidx.appcompat.app.b bVar3 = this.f3872b.f12640u0;
                if (bVar3 != null) {
                    bVar3.dismiss();
                }
                break;
            case 7:
                SelectCompanyFragment selectCompanyFragment7 = this.f3872b;
                if (selectCompanyFragment7.f12641v0) {
                    NavController g10 = U4.b.g(selectCompanyFragment7);
                    CreateCompanyUI createCompanyUI = selectCompanyFragment7.T0().f12445j1;
                    if (createCompanyUI == null) {
                        createCompanyUI = null;
                    }
                    g10.j(new e(createCompanyUI, selectCompanyFragment7.f12641v0, selectCompanyFragment7.f12642w0));
                } else {
                    NewCompanyViewModel T02 = selectCompanyFragment7.T0();
                    O7.b bVar4 = new O7.b(T02, String.valueOf(selectCompanyFragment7.u0().f27817v.getText()), 5);
                    T02.f12424D1 = bVar4;
                    bVar4.invoke();
                }
                break;
            case 8:
                this.f3872b.u0().f27814s.callOnClick();
                break;
            case 9:
                SelectCompanyFragment selectCompanyFragment8 = this.f3872b;
                CreateCompanyUI createCompanyUI2 = selectCompanyFragment8.T0().f12445j1;
                if (createCompanyUI2 == null) {
                    createCompanyUI2 = null;
                }
                createCompanyUI2.f11266C = Boolean.TRUE;
                selectCompanyFragment8.U0();
                break;
            case 10:
                SelectCompanyFragment selectCompanyFragment9 = this.f3872b;
                CreateCompanyUI createCompanyUI3 = selectCompanyFragment9.T0().f12445j1;
                if (createCompanyUI3 == null) {
                    createCompanyUI3 = null;
                }
                createCompanyUI3.f11266C = Boolean.FALSE;
                selectCompanyFragment9.U0();
                break;
            default:
                NavController g11 = U4.b.g(this.f3872b);
                g11.i(R.id.action_selectCompanyFragment_to_countrySelectFragment, v.h(g11, "isCountryCode", true, "fieldName", ""));
                break;
        }
        return p.f3034a;
    }
}

package W7;

import F8.o;
import O9.p;
import P9.n;
import P9.s;
import androidx.navigation.NavController;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.company.CorporateDetailsDomain;
import com.luminary.business.presentation.entity.company.CreateCompanyUI;
import com.luminary.business.presentation.ui.fragments.newcompany.NewCompanyViewModel;
import com.luminary.business.presentation.ui.fragments.newcompany.selectcompany.SelectCompanyFragment;
import com.luminary.business.presentation.ui.views.dialogs.SelectorDialog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ka.C0967l;
import kotlin.jvm.internal.f;
import t6.E4;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3867a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectCompanyFragment f3868b;

    public /* synthetic */ a(SelectCompanyFragment selectCompanyFragment, int i) {
        this.f3867a = i;
        this.f3868b = selectCompanyFragment;
    }

    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        String str;
        SelectCompanyFragment selectCompanyFragment = this.f3868b;
        switch (this.f3867a) {
            case 0:
                E4 u02 = selectCompanyFragment.u0();
                CreateCompanyUI createCompanyUI = selectCompanyFragment.T0().f12445j1;
                u02.f27819x.setText((createCompanyUI != null ? createCompanyUI : null).f11274h);
                selectCompanyFragment.U0();
                break;
            case 1:
                String str2 = (String) obj;
                selectCompanyFragment.u0().f27813r.setText(str2);
                selectCompanyFragment.u0().f27813r.setSelection(0);
                CreateCompanyUI createCompanyUI2 = selectCompanyFragment.T0().f12445j1;
                if (createCompanyUI2 == null) {
                    createCompanyUI2 = null;
                }
                createCompanyUI2.f11278m = str2;
                CreateCompanyUI createCompanyUI3 = selectCompanyFragment.T0().f12445j1;
                if (f.b(String.valueOf((createCompanyUI3 != null ? createCompanyUI3 : null).f11278m).toLowerCase(Locale.ROOT), "other")) {
                    selectCompanyFragment.u0().f27811p.setVisibility(0);
                } else {
                    o.b(selectCompanyFragment.u0().f27811p);
                }
                selectCompanyFragment.U0();
                break;
            case 2:
                String str3 = (String) obj;
                selectCompanyFragment.u0().f27821z.setText(str3);
                selectCompanyFragment.u0().f27821z.setSelection(0);
                CreateCompanyUI createCompanyUI4 = selectCompanyFragment.T0().f12445j1;
                CreateCompanyUI createCompanyUI5 = createCompanyUI4 != null ? createCompanyUI4 : null;
                createCompanyUI5.getClass();
                String X = C0967l.X(str3, " ", "_", false);
                Locale locale = Locale.ROOT;
                createCompanyUI5.f11275j = X.toUpperCase(locale);
                if (f.b(str3.toLowerCase(locale), "other")) {
                    selectCompanyFragment.u0().f27793A.setVisibility(0);
                } else {
                    o.b(selectCompanyFragment.u0().f27793A);
                }
                selectCompanyFragment.U0();
                break;
            case 3:
                String str4 = (String) obj;
                selectCompanyFragment.f12637q0 = false;
                selectCompanyFragment.u0().f27818w.setText(str4);
                selectCompanyFragment.T0().k0(str4);
                break;
            case 4:
                String str5 = (String) obj;
                if (str5.length() > 2) {
                    NewCompanyViewModel T02 = selectCompanyFragment.T0();
                    T02.getClass();
                    O7.b bVar = new O7.b(T02, str5, 1);
                    T02.f418J0 = bVar;
                    bVar.invoke();
                }
                break;
            case 5:
                String str6 = (String) obj;
                selectCompanyFragment.u0().f27805M.setText(str6);
                selectCompanyFragment.u0().f27805M.setSelection(0);
                CreateCompanyUI createCompanyUI6 = selectCompanyFragment.T0().f12445j1;
                if (createCompanyUI6 == null) {
                    createCompanyUI6 = null;
                }
                CreateCompanyUI createCompanyUI7 = selectCompanyFragment.T0().f12445j1;
                (createCompanyUI7 != null ? createCompanyUI7 : null).getClass();
                String X10 = C0967l.X(str6, " ", "_", false);
                Locale locale2 = Locale.ROOT;
                createCompanyUI6.f11289x = X10.toUpperCase(locale2);
                String lowerCase = str6.toLowerCase(locale2);
                CorporateDetailsDomain.SourceOfFunds.a aVar = CorporateDetailsDomain.SourceOfFunds.f10837b;
                if (f.b(lowerCase, "Other".toLowerCase(locale2))) {
                    selectCompanyFragment.u0().f27806N.setVisibility(0);
                } else {
                    o.b(selectCompanyFragment.u0().f27806N);
                }
                selectCompanyFragment.U0();
                break;
            case 6:
                String str7 = (String) obj;
                selectCompanyFragment.u0().f27798F.setText(str7);
                selectCompanyFragment.u0().f27798F.setSelection(0);
                CreateCompanyUI createCompanyUI8 = selectCompanyFragment.T0().f12445j1;
                (createCompanyUI8 != null ? createCompanyUI8 : null).f11288w = str7;
                selectCompanyFragment.U0();
                break;
            case 7:
                String str8 = (String) obj;
                selectCompanyFragment.u0().f27820y.setText(str8);
                selectCompanyFragment.u0().f27820y.setSelection(0);
                selectCompanyFragment.u0().f27809n.setVisibility(0);
                CreateCompanyUI createCompanyUI9 = selectCompanyFragment.T0().f12445j1;
                if (createCompanyUI9 == null) {
                    createCompanyUI9 = null;
                }
                CreateCompanyUI createCompanyUI10 = selectCompanyFragment.T0().f12445j1;
                (createCompanyUI10 != null ? createCompanyUI10 : null).getClass();
                String X11 = C0967l.X(str8, " ", "_", false);
                Locale locale3 = Locale.ROOT;
                createCompanyUI9.f11291z = X11.toUpperCase(locale3);
                String lowerCase2 = str8.toLowerCase(locale3);
                CorporateDetailsDomain.CompanySourceOfWealth.a aVar2 = CorporateDetailsDomain.CompanySourceOfWealth.f10813b;
                if (f.b(lowerCase2, "Other".toLowerCase(locale3))) {
                    selectCompanyFragment.u0().f27800H.setVisibility(0);
                } else {
                    o.b(selectCompanyFragment.u0().f27800H);
                }
                selectCompanyFragment.U0();
                break;
            case 8:
                List list = (List) obj;
                if (selectCompanyFragment.getView() != null) {
                    if (selectCompanyFragment.f12637q0) {
                        SelectorDialog selectorDialog = selectCompanyFragment.f12636p0;
                        if (selectorDialog != null) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : list) {
                                if (((u5.e) obj2).f30264j != null) {
                                    arrayList.add(obj2);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(n.u(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((u5.e) it.next()).f30264j);
                            }
                            selectorDialog.m(arrayList2, false);
                        }
                    } else if (list.size() == 1) {
                        u5.e eVar = (u5.e) s.L(list);
                        if (eVar != null && (str = eVar.f30264j) != null) {
                            selectCompanyFragment.T0().k0(str);
                            selectCompanyFragment.u0().f27818w.setText(str);
                        }
                    } else {
                        CreateCompanyUI createCompanyUI11 = selectCompanyFragment.T0().f12445j1;
                        (createCompanyUI11 != null ? createCompanyUI11 : null).f11274h = String.valueOf(selectCompanyFragment.u0().f27819x.getText());
                    }
                }
                break;
            default:
                Boolean bool = (Boolean) obj;
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    selectCompanyFragment.f12638r0 = booleanValue;
                    selectCompanyFragment.U0();
                    selectCompanyFragment.T0().f12451q1.postValue(null);
                    if (booleanValue) {
                        NavController g10 = U4.b.g(selectCompanyFragment);
                        CreateCompanyUI createCompanyUI12 = selectCompanyFragment.T0().f12445j1;
                        g10.j(new e(createCompanyUI12 != null ? createCompanyUI12 : null, selectCompanyFragment.f12641v0, selectCompanyFragment.f12642w0));
                    }
                }
                break;
        }
        return p.f3034a;
    }
}

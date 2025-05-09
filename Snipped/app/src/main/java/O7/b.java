package O7;

import O9.p;
import ca.InterfaceC0635a;
import com.luminary.business.domain.entity.company.CorporateDetailsDomain;
import com.luminary.business.presentation.entity.company.CompanyDetailsUI;
import com.luminary.business.presentation.entity.company.CreateCompanyUI;
import com.luminary.business.presentation.ui.fragments.newcompany.NewCompanyViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2962a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewCompanyViewModel f2963b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2964c;

    public /* synthetic */ b(NewCompanyViewModel newCompanyViewModel, String str, int i) {
        this.f2962a = i;
        this.f2963b = newCompanyViewModel;
        this.f2964c = str;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        ArrayList arrayList;
        ArrayList arrayList2;
        Map<Integer, CreateCompanyUI.ContractorUI> map;
        Map<Integer, CreateCompanyUI.ContractorUI> map2;
        switch (this.f2962a) {
            case 0:
                NewCompanyViewModel newCompanyViewModel = this.f2963b;
                newCompanyViewModel.l();
                CompanyDetailsUI companyDetailsUI = newCompanyViewModel.f12446k1;
                if (companyDetailsUI == null) {
                    companyDetailsUI = null;
                }
                CompanyDetailsUI.CompanyUI companyUI = companyDetailsUI.f11192a;
                if (companyUI == null || (map2 = companyUI.f11243n0) == null) {
                    arrayList = new ArrayList();
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<Integer, CreateCompanyUI.ContractorUI> entry : map2.entrySet()) {
                        CreateCompanyUI.ContractorUI value = entry.getValue();
                        String str = value != null ? value.f11292a : null;
                        if (str != null && str.length() != 0) {
                            CreateCompanyUI.ContractorUI value2 = entry.getValue();
                            String str2 = value2 != null ? value2.f11293b : null;
                            if (str2 != null && str2.length() != 0) {
                                CreateCompanyUI.ContractorUI value3 = entry.getValue();
                                String str3 = value3 != null ? value3.f11294c : null;
                                if (str3 != null && str3.length() != 0) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                        }
                    }
                    arrayList = new ArrayList(linkedHashMap.size());
                    Iterator it = linkedHashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        CreateCompanyUI.ContractorUI contractorUI = (CreateCompanyUI.ContractorUI) ((Map.Entry) it.next()).getValue();
                        arrayList.add(contractorUI != null ? new CorporateDetailsDomain.a.b(contractorUI.f11292a, contractorUI.f11293b, contractorUI.f11294c, contractorUI.f11295d) : null);
                    }
                }
                CompanyDetailsUI companyDetailsUI2 = newCompanyViewModel.f12446k1;
                if (companyDetailsUI2 == null) {
                    companyDetailsUI2 = null;
                }
                CompanyDetailsUI.CompanyUI companyUI2 = companyDetailsUI2.f11192a;
                if (companyUI2 == null || (map = companyUI2.f11245o0) == null) {
                    arrayList2 = new ArrayList();
                } else {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry<Integer, CreateCompanyUI.ContractorUI> entry2 : map.entrySet()) {
                        CreateCompanyUI.ContractorUI value4 = entry2.getValue();
                        String str4 = value4 != null ? value4.f11292a : null;
                        if (str4 != null && str4.length() != 0) {
                            CreateCompanyUI.ContractorUI value5 = entry2.getValue();
                            String str5 = value5 != null ? value5.f11293b : null;
                            if (str5 != null && str5.length() != 0) {
                                CreateCompanyUI.ContractorUI value6 = entry2.getValue();
                                String str6 = value6 != null ? value6.f11294c : null;
                                if (str6 != null && str6.length() != 0) {
                                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                                }
                            }
                        }
                    }
                    arrayList2 = new ArrayList(linkedHashMap2.size());
                    Iterator it2 = linkedHashMap2.entrySet().iterator();
                    while (it2.hasNext()) {
                        CreateCompanyUI.ContractorUI contractorUI2 = (CreateCompanyUI.ContractorUI) ((Map.Entry) it2.next()).getValue();
                        arrayList2.add(contractorUI2 != null ? new CorporateDetailsDomain.a.b(contractorUI2.f11292a, contractorUI2.f11293b, contractorUI2.f11294c, contractorUI2.f11295d) : null);
                    }
                }
                newCompanyViewModel.f12439d1.a(new e(newCompanyViewModel, 2), new Pair(this.f2964c, new com.luminary.business.domain.entity.company.a(arrayList, arrayList2)));
                break;
            case 1:
                NewCompanyViewModel newCompanyViewModel2 = this.f2963b;
                newCompanyViewModel2.f12429T0.a(new e(newCompanyViewModel2, 12), this.f2964c);
                break;
            case 2:
                NewCompanyViewModel newCompanyViewModel3 = this.f2963b;
                newCompanyViewModel3.l();
                newCompanyViewModel3.f12436a1.a(new e(newCompanyViewModel3, 10), this.f2964c);
                break;
            case 3:
                NewCompanyViewModel newCompanyViewModel4 = this.f2963b;
                newCompanyViewModel4.l();
                newCompanyViewModel4.f12440e1.a(new e(newCompanyViewModel4, 7), this.f2964c);
                break;
            case 4:
                NewCompanyViewModel newCompanyViewModel5 = this.f2963b;
                newCompanyViewModel5.l();
                newCompanyViewModel5.f12434Y0.a(new e(newCompanyViewModel5, 9), this.f2964c);
                break;
            default:
                NewCompanyViewModel newCompanyViewModel6 = this.f2963b;
                newCompanyViewModel6.l();
                newCompanyViewModel6.f12437b1.a(new e(newCompanyViewModel6, 8), this.f2964c);
                break;
        }
        return p.f3034a;
    }
}

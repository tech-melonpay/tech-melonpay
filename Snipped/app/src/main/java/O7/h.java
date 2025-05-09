package O7;

import J5.a;
import O9.p;
import androidx.lifecycle.C0559z;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.company.CorporateDetailsDomain;
import com.luminary.business.presentation.entity.company.UploadFileUI;
import com.luminary.business.presentation.ui.fragments.newcompany.NewCompanyViewModel;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2991a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewCompanyViewModel f2992b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UploadFileUI f2993c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f2994d;

    public /* synthetic */ h(NewCompanyViewModel newCompanyViewModel, UploadFileUI uploadFileUI, String str, int i) {
        this.f2991a = i;
        this.f2992b = newCompanyViewModel;
        this.f2993c = uploadFileUI;
        this.f2994d = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        String str = this.f2994d;
        UploadFileUI uploadFileUI = this.f2993c;
        final NewCompanyViewModel newCompanyViewModel = this.f2992b;
        J5.a aVar = (J5.a) obj;
        switch (this.f2991a) {
            case 0:
                newCompanyViewModel.k();
                e eVar = new e(newCompanyViewModel, 27);
                if (aVar instanceof a.C0026a) {
                    eVar.invoke(((a.C0026a) aVar).f2145a);
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    final CorporateDetailsDomain corporateDetailsDomain = (CorporateDetailsDomain) ((a.b) aVar).f2146a;
                    if (uploadFileUI == null) {
                        newCompanyViewModel.n1.postValue(corporateDetailsDomain);
                        newCompanyViewModel.f12449o1.postValue(corporateDetailsDomain);
                    } else {
                        final int i = 1;
                        newCompanyViewModel.l0(str, uploadFileUI, new InterfaceC0635a() { // from class: O7.i
                            @Override // ca.InterfaceC0635a
                            public final Object invoke() {
                                switch (i) {
                                    case 0:
                                        NewCompanyViewModel newCompanyViewModel2 = newCompanyViewModel;
                                        C0559z<CorporateDetailsDomain> c0559z = newCompanyViewModel2.n1;
                                        CorporateDetailsDomain corporateDetailsDomain2 = corporateDetailsDomain;
                                        c0559z.postValue(corporateDetailsDomain2);
                                        newCompanyViewModel2.f12449o1.postValue(corporateDetailsDomain2);
                                        break;
                                    default:
                                        NewCompanyViewModel newCompanyViewModel3 = newCompanyViewModel;
                                        C0559z<CorporateDetailsDomain> c0559z2 = newCompanyViewModel3.n1;
                                        CorporateDetailsDomain corporateDetailsDomain3 = corporateDetailsDomain;
                                        c0559z2.postValue(corporateDetailsDomain3);
                                        newCompanyViewModel3.f12449o1.postValue(corporateDetailsDomain3);
                                        break;
                                }
                                return p.f3034a;
                            }
                        });
                    }
                    p pVar = p.f3034a;
                }
                return p.f3034a;
            default:
                newCompanyViewModel.k();
                e eVar2 = new e(newCompanyViewModel, 26);
                if (aVar instanceof a.C0026a) {
                    eVar2.invoke(((a.C0026a) aVar).f2145a);
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    final CorporateDetailsDomain corporateDetailsDomain2 = (CorporateDetailsDomain) ((a.b) aVar).f2146a;
                    if (uploadFileUI == null) {
                        newCompanyViewModel.n1.postValue(corporateDetailsDomain2);
                        newCompanyViewModel.f12449o1.postValue(corporateDetailsDomain2);
                    } else {
                        final int i9 = 0;
                        newCompanyViewModel.l0(str, uploadFileUI, new InterfaceC0635a() { // from class: O7.i
                            @Override // ca.InterfaceC0635a
                            public final Object invoke() {
                                switch (i9) {
                                    case 0:
                                        NewCompanyViewModel newCompanyViewModel2 = newCompanyViewModel;
                                        C0559z<CorporateDetailsDomain> c0559z = newCompanyViewModel2.n1;
                                        CorporateDetailsDomain corporateDetailsDomain22 = corporateDetailsDomain2;
                                        c0559z.postValue(corporateDetailsDomain22);
                                        newCompanyViewModel2.f12449o1.postValue(corporateDetailsDomain22);
                                        break;
                                    default:
                                        NewCompanyViewModel newCompanyViewModel3 = newCompanyViewModel;
                                        C0559z<CorporateDetailsDomain> c0559z2 = newCompanyViewModel3.n1;
                                        CorporateDetailsDomain corporateDetailsDomain3 = corporateDetailsDomain2;
                                        c0559z2.postValue(corporateDetailsDomain3);
                                        newCompanyViewModel3.f12449o1.postValue(corporateDetailsDomain3);
                                        break;
                                }
                                return p.f3034a;
                            }
                        });
                    }
                    p pVar2 = p.f3034a;
                }
                return p.f3034a;
        }
    }
}

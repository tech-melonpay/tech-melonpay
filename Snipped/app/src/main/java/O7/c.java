package O7;

import O9.p;
import ca.InterfaceC0635a;
import com.luminary.business.presentation.ui.fragments.newcompany.NewCompanyViewModel;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2965a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewCompanyViewModel f2966b;

    public /* synthetic */ c(NewCompanyViewModel newCompanyViewModel, int i) {
        this.f2965a = i;
        this.f2966b = newCompanyViewModel;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        switch (this.f2965a) {
            case 0:
                NewCompanyViewModel newCompanyViewModel = this.f2966b;
                newCompanyViewModel.f12443h1.a(new e(newCompanyViewModel, 11), "");
                return p.f3034a;
            default:
                NewCompanyViewModel newCompanyViewModel2 = this.f2966b;
                newCompanyViewModel2.l();
                p pVar = p.f3034a;
                newCompanyViewModel2.f12441f1.a(new e(newCompanyViewModel2, 3), pVar);
                return pVar;
        }
    }
}

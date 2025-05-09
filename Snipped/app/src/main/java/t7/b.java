package T7;

import F8.o;
import O9.p;
import ca.InterfaceC0635a;
import com.luminary.business.presentation.entity.company.CompanyDetailsUI;
import com.luminary.business.presentation.ui.fragments.newcompany.NewCompanyViewModel;
import com.luminary.business.presentation.ui.fragments.newcompany.crypto_info.CryptoInformationFragment;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import t6.AbstractC1478y4;
import u5.C1521a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3578a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CryptoInformationFragment f3579b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC1478y4 f3580c;

    public /* synthetic */ b(CryptoInformationFragment cryptoInformationFragment, AbstractC1478y4 abstractC1478y4) {
        this.f3578a = 1;
        this.f3579b = cryptoInformationFragment;
        this.f3580c = abstractC1478y4;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [O7.j] */
    /* JADX WARN: Type inference failed for: r0v17, types: [O7.j] */
    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        List arrayList;
        List arrayList2;
        List arrayList3;
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        Long l10;
        Long l11;
        switch (this.f3578a) {
            case 0:
                AbstractC1478y4 abstractC1478y4 = this.f3580c;
                abstractC1478y4.f29855A.setChecked(true);
                CryptoInformationFragment cryptoInformationFragment = this.f3579b;
                CompanyDetailsUI companyDetailsUI = cryptoInformationFragment.U0().f12446k1;
                if (companyDetailsUI == null) {
                    companyDetailsUI = null;
                }
                CompanyDetailsUI.CompanyUI companyUI = companyDetailsUI.f11192a;
                if (companyUI != null) {
                    companyUI.f11247p0 = Boolean.FALSE;
                }
                o.b(abstractC1478y4.f29860q);
                cryptoInformationFragment.X0();
                break;
            case 1:
                CryptoInformationFragment cryptoInformationFragment2 = this.f3579b;
                if (cryptoInformationFragment2.X0()) {
                    AbstractC1478y4 abstractC1478y42 = this.f3580c;
                    if (abstractC1478y42.f29855A.isChecked()) {
                        final NewCompanyViewModel U02 = cryptoInformationFragment2.U0();
                        CompanyDetailsUI companyDetailsUI2 = cryptoInformationFragment2.U0().f12446k1;
                        if (companyDetailsUI2 == null) {
                            companyDetailsUI2 = null;
                        }
                        CompanyDetailsUI.CompanyUI companyUI2 = companyDetailsUI2.f11192a;
                        final String valueOf = String.valueOf(companyUI2 != null ? companyUI2.f11218a : null);
                        final Boolean bool = Boolean.FALSE;
                        final Float f10 = null;
                        final Float f11 = null;
                        final Float f12 = null;
                        final Float f13 = null;
                        final List list = null;
                        final List list2 = null;
                        final List list3 = null;
                        ?? r02 = new InterfaceC0635a() { // from class: O7.j
                            @Override // ca.InterfaceC0635a
                            public final Object invoke() {
                                NewCompanyViewModel newCompanyViewModel = NewCompanyViewModel.this;
                                newCompanyViewModel.l();
                                Pair pair = new Pair(valueOf, new C1521a(bool, f10, f11, f12, f13, list, list2, list3));
                                newCompanyViewModel.f12442g1.a(new e(newCompanyViewModel, 4), pair);
                                return p.f3034a;
                            }
                        };
                        U02.f12427G1 = r02;
                        r02.invoke();
                    } else if (abstractC1478y42.f29856B.isChecked()) {
                        final NewCompanyViewModel U03 = cryptoInformationFragment2.U0();
                        CompanyDetailsUI companyDetailsUI3 = cryptoInformationFragment2.U0().f12446k1;
                        if (companyDetailsUI3 == null) {
                            companyDetailsUI3 = null;
                        }
                        CompanyDetailsUI.CompanyUI companyUI3 = companyDetailsUI3.f11192a;
                        final String valueOf2 = String.valueOf(companyUI3 != null ? companyUI3.f11218a : null);
                        final Boolean bool2 = Boolean.TRUE;
                        CompanyDetailsUI companyDetailsUI4 = cryptoInformationFragment2.U0().f12446k1;
                        if (companyDetailsUI4 == null) {
                            companyDetailsUI4 = null;
                        }
                        CompanyDetailsUI.CompanyUI companyUI4 = companyDetailsUI4.f11192a;
                        final Float valueOf3 = (companyUI4 == null || (l11 = companyUI4.f11249q0) == null) ? null : Float.valueOf(l11.longValue());
                        CompanyDetailsUI companyDetailsUI5 = cryptoInformationFragment2.U0().f12446k1;
                        if (companyDetailsUI5 == null) {
                            companyDetailsUI5 = null;
                        }
                        CompanyDetailsUI.CompanyUI companyUI5 = companyDetailsUI5.f11192a;
                        final Float valueOf4 = (companyUI5 == null || (l10 = companyUI5.f11251r0) == null) ? null : Float.valueOf(l10.longValue());
                        CompanyDetailsUI companyDetailsUI6 = cryptoInformationFragment2.U0().f12446k1;
                        if (companyDetailsUI6 == null) {
                            companyDetailsUI6 = null;
                        }
                        CompanyDetailsUI.CompanyUI companyUI6 = companyDetailsUI6.f11192a;
                        final Float valueOf5 = (companyUI6 == null || (bigDecimal2 = companyUI6.s0) == null) ? null : Float.valueOf(bigDecimal2.floatValue());
                        CompanyDetailsUI companyDetailsUI7 = cryptoInformationFragment2.U0().f12446k1;
                        if (companyDetailsUI7 == null) {
                            companyDetailsUI7 = null;
                        }
                        CompanyDetailsUI.CompanyUI companyUI7 = companyDetailsUI7.f11192a;
                        final Float valueOf6 = (companyUI7 == null || (bigDecimal = companyUI7.f11254t0) == null) ? null : Float.valueOf(bigDecimal.floatValue());
                        CompanyDetailsUI companyDetailsUI8 = cryptoInformationFragment2.U0().f12446k1;
                        if (companyDetailsUI8 == null) {
                            companyDetailsUI8 = null;
                        }
                        CompanyDetailsUI.CompanyUI companyUI8 = companyDetailsUI8.f11192a;
                        if (companyUI8 == null || (arrayList = companyUI8.f11256u0) == null) {
                            arrayList = new ArrayList();
                        }
                        final List list4 = arrayList;
                        CompanyDetailsUI companyDetailsUI9 = cryptoInformationFragment2.U0().f12446k1;
                        if (companyDetailsUI9 == null) {
                            companyDetailsUI9 = null;
                        }
                        CompanyDetailsUI.CompanyUI companyUI9 = companyDetailsUI9.f11192a;
                        if (companyUI9 == null || (arrayList2 = companyUI9.f11237k0) == null) {
                            arrayList2 = new ArrayList();
                        }
                        final List list5 = arrayList2;
                        CompanyDetailsUI companyDetailsUI10 = cryptoInformationFragment2.U0().f12446k1;
                        CompanyDetailsUI.CompanyUI companyUI10 = (companyDetailsUI10 != null ? companyDetailsUI10 : null).f11192a;
                        if (companyUI10 == null || (arrayList3 = companyUI10.f11260w0) == null) {
                            arrayList3 = new ArrayList();
                        }
                        final List list6 = arrayList3;
                        ?? r03 = new InterfaceC0635a() { // from class: O7.j
                            @Override // ca.InterfaceC0635a
                            public final Object invoke() {
                                NewCompanyViewModel newCompanyViewModel = NewCompanyViewModel.this;
                                newCompanyViewModel.l();
                                Pair pair = new Pair(valueOf2, new C1521a(bool2, valueOf3, valueOf4, valueOf5, valueOf6, list4, list5, list6));
                                newCompanyViewModel.f12442g1.a(new e(newCompanyViewModel, 4), pair);
                                return p.f3034a;
                            }
                        };
                        U03.f12427G1 = r03;
                        r03.invoke();
                    }
                }
                break;
            default:
                AbstractC1478y4 abstractC1478y43 = this.f3580c;
                abstractC1478y43.f29856B.setChecked(true);
                CryptoInformationFragment cryptoInformationFragment3 = this.f3579b;
                CompanyDetailsUI companyDetailsUI11 = cryptoInformationFragment3.U0().f12446k1;
                if (companyDetailsUI11 == null) {
                    companyDetailsUI11 = null;
                }
                CompanyDetailsUI.CompanyUI companyUI11 = companyDetailsUI11.f11192a;
                if (companyUI11 != null) {
                    companyUI11.f11247p0 = Boolean.TRUE;
                }
                abstractC1478y43.f29860q.setVisibility(0);
                cryptoInformationFragment3.X0();
                break;
        }
        return p.f3034a;
    }

    public /* synthetic */ b(AbstractC1478y4 abstractC1478y4, CryptoInformationFragment cryptoInformationFragment, int i) {
        this.f3578a = i;
        this.f3580c = abstractC1478y4;
        this.f3579b = cryptoInformationFragment;
    }
}

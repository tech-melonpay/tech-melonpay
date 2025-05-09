package R7;

import O9.p;
import P9.n;
import P9.s;
import android.os.Bundle;
import ca.InterfaceC0650p;
import com.luminary.business.presentation.entity.company.CompanyDetailsUI;
import com.luminary.business.presentation.ui.fragments.newcompany.businessactivity.BusinessActivityFragment;
import com.luminary.business.presentation.ui.fragments.newcompany.crypto_info.CryptoInformationFragment;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Ref$IntRef;
import t6.AbstractC1478y4;
import t6.M2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements InterfaceC0650p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3303a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3304b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3305c;

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.f3303a = i;
        this.f3304b = obj;
        this.f3305c = obj2;
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3303a) {
            case 0:
                Bundle bundle = (Bundle) obj2;
                if (!kotlin.jvm.internal.f.b((String) obj, "country")) {
                    break;
                } else {
                    String string = bundle.getString("field");
                    if (string == null) {
                        string = "";
                    }
                    String string2 = bundle.getString("selected_country");
                    if (string2 == null) {
                        string2 = "";
                    }
                    String string3 = bundle.getString("selected_country_code");
                    String str = string3 != null ? string3 : "";
                    boolean b9 = kotlin.jvm.internal.f.b(string, "outgoing_payment");
                    BusinessActivityFragment businessActivityFragment = (BusinessActivityFragment) this.f3304b;
                    if (b9) {
                        businessActivityFragment.f12533q0.add(new Pair<>(string2, str));
                        businessActivityFragment.f12533q0 = new ArrayList<>(s.F(businessActivityFragment.f12533q0));
                        businessActivityFragment.u0().f28167y.setText(string2);
                        CompanyDetailsUI companyDetailsUI = businessActivityFragment.V0().f12446k1;
                        if (companyDetailsUI == null) {
                            companyDetailsUI = null;
                        }
                        CompanyDetailsUI.CompanyUI companyUI = companyDetailsUI.f11192a;
                        if (companyUI != null) {
                            ArrayList<Pair<String, String>> arrayList = businessActivityFragment.f12533q0;
                            ArrayList arrayList2 = new ArrayList(n.u(arrayList, 10));
                            Iterator<Pair<String, String>> it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(it.next().f23090b);
                            }
                            companyUI.f11237k0 = arrayList2;
                        }
                    }
                    if (kotlin.jvm.internal.f.b(string, "incoming_payment")) {
                        businessActivityFragment.f12534r0.add(new Pair<>(string2, str));
                        businessActivityFragment.f12534r0 = new ArrayList<>(s.F(businessActivityFragment.f12534r0));
                        businessActivityFragment.u0().f28162t.setText(string2);
                        CompanyDetailsUI companyDetailsUI2 = businessActivityFragment.V0().f12446k1;
                        CompanyDetailsUI.CompanyUI companyUI2 = (companyDetailsUI2 != null ? companyDetailsUI2 : null).f11192a;
                        if (companyUI2 != null) {
                            ArrayList<Pair<String, String>> arrayList3 = businessActivityFragment.f12534r0;
                            ArrayList arrayList4 = new ArrayList(n.u(arrayList3, 10));
                            Iterator<Pair<String, String>> it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                arrayList4.add(it2.next().f23090b);
                            }
                            companyUI2.f11235j0 = arrayList4;
                        }
                    }
                    M2 m2 = (M2) this.f3305c;
                    businessActivityFragment.W0(m2.f28163u, businessActivityFragment.f12534r0);
                    businessActivityFragment.W0(m2.f28168z, businessActivityFragment.f12533q0);
                    businessActivityFragment.X0(m2.f28161s, businessActivityFragment.f12535t0);
                    businessActivityFragment.Y0();
                    break;
                }
            case 1:
                Bundle bundle2 = (Bundle) obj2;
                if (!kotlin.jvm.internal.f.b((String) obj, "country")) {
                    break;
                } else {
                    String string4 = bundle2.getString("field");
                    if (string4 == null) {
                        string4 = "";
                    }
                    String string5 = bundle2.getString("selected_country");
                    if (string5 == null) {
                        string5 = "";
                    }
                    String string6 = bundle2.getString("selected_country_code");
                    String str2 = string6 != null ? string6 : "";
                    boolean b10 = kotlin.jvm.internal.f.b(string4, "outgoing_payment");
                    CryptoInformationFragment cryptoInformationFragment = (CryptoInformationFragment) this.f3304b;
                    if (b10) {
                        cryptoInformationFragment.f12580q0.add(new Pair<>(string5, str2));
                        cryptoInformationFragment.f12580q0 = new ArrayList<>(s.F(cryptoInformationFragment.f12580q0));
                        cryptoInformationFragment.u0().f29867x.setText(string5);
                        CompanyDetailsUI companyDetailsUI3 = cryptoInformationFragment.U0().f12446k1;
                        if (companyDetailsUI3 == null) {
                            companyDetailsUI3 = null;
                        }
                        CompanyDetailsUI.CompanyUI companyUI3 = companyDetailsUI3.f11192a;
                        if (companyUI3 != null) {
                            ArrayList<Pair<String, String>> arrayList5 = cryptoInformationFragment.f12580q0;
                            ArrayList arrayList6 = new ArrayList(n.u(arrayList5, 10));
                            Iterator<Pair<String, String>> it3 = arrayList5.iterator();
                            while (it3.hasNext()) {
                                arrayList6.add(it3.next().f23090b);
                            }
                            companyUI3.f11258v0 = arrayList6;
                        }
                    }
                    if (kotlin.jvm.internal.f.b(string4, "incoming_payment")) {
                        cryptoInformationFragment.f12581r0.add(new Pair<>(string5, str2));
                        cryptoInformationFragment.f12581r0 = new ArrayList<>(s.F(cryptoInformationFragment.f12581r0));
                        cryptoInformationFragment.u0().f29863t.setText(string5);
                        CompanyDetailsUI companyDetailsUI4 = cryptoInformationFragment.U0().f12446k1;
                        CompanyDetailsUI.CompanyUI companyUI4 = (companyDetailsUI4 != null ? companyDetailsUI4 : null).f11192a;
                        if (companyUI4 != null) {
                            ArrayList<Pair<String, String>> arrayList7 = cryptoInformationFragment.f12581r0;
                            ArrayList arrayList8 = new ArrayList(n.u(arrayList7, 10));
                            Iterator<Pair<String, String>> it4 = arrayList7.iterator();
                            while (it4.hasNext()) {
                                arrayList8.add(it4.next().f23090b);
                            }
                            companyUI4.f11256u0 = arrayList8;
                        }
                    }
                    AbstractC1478y4 abstractC1478y4 = (AbstractC1478y4) this.f3305c;
                    cryptoInformationFragment.V0(abstractC1478y4.f29864u, cryptoInformationFragment.f12581r0);
                    cryptoInformationFragment.V0(abstractC1478y4.f29868y, cryptoInformationFragment.f12580q0);
                    cryptoInformationFragment.W0(abstractC1478y4.f29862s, cryptoInformationFragment.f12582t0);
                    cryptoInformationFragment.X0();
                    break;
                }
            default:
                Ref$IntRef ref$IntRef = (Ref$IntRef) this.f3305c;
                int i = ref$IntRef.f23177a;
                ref$IntRef.f23177a = i + 1;
                ((kotlin.coroutines.d[]) this.f3304b)[i] = (d.b) obj2;
                break;
        }
        return p.f3034a;
    }
}

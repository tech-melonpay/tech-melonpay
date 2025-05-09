package Z6;

import F8.o;
import O9.p;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.domain.entity.cards.VaultDomain;
import com.luminary.business.presentation.ui.fragments.cards.topup.TopUpFragment;
import com.luminary.business.presentation.ui.fragments.statements.StatementsSelectorDialog;
import com.luminary.mobile.R;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ka.C0966k;
import t6.v6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4201a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TopUpFragment f4202b;

    public /* synthetic */ b(TopUpFragment topUpFragment, int i) {
        this.f4201a = i;
        this.f4202b = topUpFragment;
    }

    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        Double R;
        VaultDomain vaultDomain;
        BankAccountDomain bankAccountDomain;
        String str;
        Integer g10;
        Object obj2;
        VaultDomain vaultDomain2;
        String str2;
        String str3;
        String I10;
        Object obj3;
        switch (this.f4201a) {
            case 0:
                List list = (List) obj;
                if (list == null) {
                    break;
                } else {
                    TopUpFragment topUpFragment = this.f4202b;
                    topUpFragment.f11829q0.clear();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : list) {
                        BankAccountDomain bankAccountDomain2 = (BankAccountDomain) obj4;
                        if (bankAccountDomain2.i != null) {
                            VaultDomain vaultDomain3 = topUpFragment.f11833v0;
                            if (kotlin.jvm.internal.f.b(vaultDomain3 != null ? vaultDomain3.f10782e : null, bankAccountDomain2.f10701h)) {
                                arrayList.add(obj4);
                            }
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        BankAccountDomain bankAccountDomain3 = (BankAccountDomain) it.next();
                        ArrayList arrayList2 = topUpFragment.f11829q0;
                        String str4 = bankAccountDomain3.i;
                        String str5 = str4 == null ? "" : str4;
                        String str6 = bankAccountDomain3.f10701h;
                        String D2 = D9.b.D(str6);
                        String str7 = str6 == null ? "" : str6;
                        String b9 = F8.b.b(bankAccountDomain3);
                        String c2 = F8.b.c(bankAccountDomain3);
                        BigDecimal bigDecimal = bankAccountDomain3.f10698e;
                        arrayList2.add(new StatementsSelectorDialog.a(str5, D2, str7, b9, c2, null, bankAccountDomain3.f10701h, bankAccountDomain3.f10694a, !(bigDecimal != null && bigDecimal.compareTo(BigDecimal.ZERO) <= 0), 32));
                    }
                    break;
                }
            case 1:
                List list2 = (List) obj;
                if (list2 == null) {
                    break;
                } else {
                    TopUpFragment topUpFragment2 = this.f4202b;
                    topUpFragment2.f11830r0.clear();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj5 : list2) {
                        VaultDomain vaultDomain4 = (VaultDomain) obj5;
                        if (vaultDomain4.f10781d != null) {
                            VaultDomain vaultDomain5 = topUpFragment2.f11833v0;
                            if (kotlin.jvm.internal.f.b(vaultDomain5 != null ? vaultDomain5.f10782e : null, vaultDomain4.f10782e) && ((vaultDomain = topUpFragment2.f11833v0) == null || vaultDomain.f10778a != vaultDomain4.f10778a)) {
                                if (kotlin.jvm.internal.f.b(vaultDomain != null ? vaultDomain.f10793q : null, vaultDomain4.f10793q)) {
                                    arrayList3.add(obj5);
                                }
                            }
                        }
                    }
                    for (Iterator it2 = arrayList3.iterator(); it2.hasNext(); it2 = it2) {
                        VaultDomain vaultDomain6 = (VaultDomain) it2.next();
                        ArrayList arrayList4 = topUpFragment2.f11830r0;
                        String str8 = vaultDomain6.f10781d;
                        if (str8 == null) {
                            str8 = "";
                        }
                        String str9 = str8;
                        Integer valueOf = Integer.valueOf(vaultDomain6.f10778a);
                        String str10 = vaultDomain6.f10785h;
                        arrayList4.add(new StatementsSelectorDialog.a(str9, "", "", "", "", null, "", valueOf, ((str10 == null || (R = C0966k.R(str10)) == null) ? 0.0d : R.doubleValue()) > 0.0d, 32));
                    }
                    break;
                }
                break;
            case 2:
                StatementsSelectorDialog.a aVar = (StatementsSelectorDialog.a) obj;
                TopUpFragment topUpFragment3 = this.f4202b;
                List<BankAccountDomain> value = topUpFragment3.V0().f4222Y0.getValue();
                if (value != null) {
                    Iterator<T> it3 = value.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj2 = it3.next();
                            if (kotlin.jvm.internal.f.b(((BankAccountDomain) obj2).f10694a, aVar.f13059h)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    bankAccountDomain = (BankAccountDomain) obj2;
                } else {
                    bankAccountDomain = null;
                }
                if (bankAccountDomain != null && (g10 = F8.b.g(bankAccountDomain, topUpFragment3.requireContext())) != null) {
                    topUpFragment3.u0().f29725t.setImageResource(g10.intValue());
                }
                topUpFragment3.u0().f29725t.setVisibility(0);
                topUpFragment3.u0().f29724s.setText(bankAccountDomain != null ? bankAccountDomain.i : null);
                topUpFragment3.u0().f29723r.e();
                topUpFragment3.s0 = bankAccountDomain;
                topUpFragment3.u0().f29728w.setVisibility(0);
                v6 u02 = topUpFragment3.u0();
                if (bankAccountDomain == null || (str = F8.b.f(bankAccountDomain)) == null) {
                    str = "";
                }
                u02.f29728w.setText(topUpFragment3.getString(R.string.balance, str));
                topUpFragment3.W0();
                topUpFragment3.T0();
                break;
            default:
                StatementsSelectorDialog.a aVar2 = (StatementsSelectorDialog.a) obj;
                TopUpFragment topUpFragment4 = this.f4202b;
                List<VaultDomain> value2 = topUpFragment4.V0().f4223Z0.getValue();
                if (value2 != null) {
                    Iterator<T> it4 = value2.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            obj3 = it4.next();
                            int i = ((VaultDomain) obj3).f10778a;
                            Integer num = aVar2.f13059h;
                            if (num != null && i == num.intValue()) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    vaultDomain2 = (VaultDomain) obj3;
                } else {
                    vaultDomain2 = null;
                }
                o.b(topUpFragment4.u0().f29725t);
                topUpFragment4.u0().f29724s.setText(vaultDomain2 != null ? vaultDomain2.f10781d : null);
                topUpFragment4.f11831t0 = vaultDomain2;
                topUpFragment4.u0().f29728w.setVisibility(0);
                v6 u03 = topUpFragment4.u0();
                String str11 = "";
                if (vaultDomain2 == null || (str2 = vaultDomain2.f10782e) == null) {
                    str2 = "";
                }
                if (vaultDomain2 != null && (str3 = vaultDomain2.f10785h) != null && (I10 = D9.b.I(str3, vaultDomain2.f10782e)) != null) {
                    str11 = I10;
                }
                u03.f29728w.setText(topUpFragment4.getString(R.string.available_balance_value, D9.b.o(str2, str11)));
                topUpFragment4.W0();
                break;
        }
        return p.f3034a;
    }
}

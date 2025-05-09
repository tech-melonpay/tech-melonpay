package p8;

import O9.p;
import P9.s;
import S6.d;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.presentation.ui.fragments.statements.StatementsSelectorDialog;
import com.luminary.business.presentation.ui.fragments.statistics.StatisticsFragment;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.f;

/* compiled from: R8$$SyntheticClass */
/* renamed from: p8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1116a implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25709a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StatisticsFragment f25710b;

    public /* synthetic */ C1116a(StatisticsFragment statisticsFragment, int i) {
        this.f25709a = i;
        this.f25710b = statisticsFragment;
    }

    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        Integer num;
        BankAccountDomain bankAccountDomain;
        Integer num2;
        Object obj2;
        switch (this.f25709a) {
            case 0:
                List list = (List) obj;
                StatisticsFragment statisticsFragment = this.f25710b;
                statisticsFragment.f13098u0.clear();
                if (!list.isEmpty()) {
                    statisticsFragment.u0().f28845v.setVisibility(0);
                    statisticsFragment.u0().f28839p.setVisibility(0);
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (((BankAccountDomain) obj3).i != null) {
                        arrayList.add(obj3);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    BankAccountDomain bankAccountDomain2 = (BankAccountDomain) it.next();
                    ArrayList arrayList2 = statisticsFragment.f13098u0;
                    String str = bankAccountDomain2.i;
                    String str2 = str == null ? "" : str;
                    String str3 = bankAccountDomain2.f10701h;
                    arrayList2.add(new StatementsSelectorDialog.a(str2, D9.b.D(str3), str3 == null ? "" : str3, F8.b.b(bankAccountDomain2), F8.b.c(bankAccountDomain2), null, null, null, false, 480));
                }
                List<BankAccountDomain> value = statisticsFragment.T0().f25716W0.getValue();
                BankAccountDomain bankAccountDomain3 = value != null ? (BankAccountDomain) s.L(value) : null;
                statisticsFragment.f13099v0 = bankAccountDomain3;
                statisticsFragment.f13095q0 = bankAccountDomain3 != null ? bankAccountDomain3.f10694a : null;
                Long l10 = statisticsFragment.s0;
                String F02 = l10 != null ? D9.b.F0(new Date(l10.longValue()), "yyyy-MM-dd") : null;
                Long l11 = statisticsFragment.f13097t0;
                String F03 = l11 != null ? D9.b.F0(new Date(l11.longValue()), "yyyy-MM-dd") : null;
                BankAccountDomain bankAccountDomain4 = statisticsFragment.f13099v0;
                if (bankAccountDomain4 != null && (num = bankAccountDomain4.f10694a) != null) {
                    int intValue = num.intValue();
                    C1118c T02 = statisticsFragment.T0();
                    d dVar = new d(T02, intValue, statisticsFragment.f13094p0.toString(), F02, F03);
                    T02.f418J0 = dVar;
                    dVar.invoke();
                }
                statisticsFragment.L0();
                break;
            case 1:
                this.f25710b.U0(new ArrayList<>((List) obj));
                break;
            default:
                String str4 = (String) obj;
                StatisticsFragment statisticsFragment2 = this.f25710b;
                List<BankAccountDomain> value2 = statisticsFragment2.T0().f25716W0.getValue();
                if (value2 != null) {
                    Iterator<T> it2 = value2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj2 = it2.next();
                            if (f.b(((BankAccountDomain) obj2).i, str4)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    bankAccountDomain = (BankAccountDomain) obj2;
                } else {
                    bankAccountDomain = null;
                }
                statisticsFragment2.f13099v0 = bankAccountDomain;
                Long l12 = statisticsFragment2.s0;
                String F04 = l12 != null ? D9.b.F0(new Date(l12.longValue()), "yyyy-MM-dd") : null;
                Long l13 = statisticsFragment2.f13097t0;
                String F05 = l13 != null ? D9.b.F0(new Date(l13.longValue()), "yyyy-MM-dd") : null;
                statisticsFragment2.L0();
                BankAccountDomain bankAccountDomain5 = statisticsFragment2.f13099v0;
                statisticsFragment2.f13095q0 = bankAccountDomain5 != null ? bankAccountDomain5.f10694a : null;
                if (bankAccountDomain5 != null && (num2 = bankAccountDomain5.f10694a) != null) {
                    int intValue2 = num2.intValue();
                    C1118c T03 = statisticsFragment2.T0();
                    d dVar2 = new d(T03, intValue2, statisticsFragment2.f13094p0.toString(), F04, F05);
                    T03.f418J0 = dVar2;
                    dVar2.invoke();
                }
                break;
        }
        return p.f3034a;
    }
}

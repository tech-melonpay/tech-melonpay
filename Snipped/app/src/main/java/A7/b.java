package A7;

import F8.k;
import J5.a;
import O9.p;
import P9.s;
import androidx.lifecycle.C0559z;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;
import com.luminary.business.presentation.entity.transaction.TransactionUI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import u5.f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f104a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f105b;

    public /* synthetic */ b(e eVar, int i) {
        this.f104a = i;
        this.f105b = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        String str;
        Object obj2;
        Object obj3;
        int i;
        int i9 = 3;
        int i10 = 0;
        int i11 = 1;
        e eVar = this.f105b;
        switch (this.f104a) {
            case 0:
                J5.a aVar = (J5.a) obj;
                eVar.k();
                b bVar = new b(eVar, i9);
                aVar.getClass();
                if (aVar instanceof a.C0026a) {
                    J5.b bVar2 = (J5.b) ((a.C0026a) aVar).f2145a;
                    if (eVar.a(bVar2)) {
                        eVar.f413E0 = eVar.f418J0;
                    }
                    if (!eVar.c(bVar2)) {
                        eVar.d(bVar2);
                    }
                    p pVar = p.f3034a;
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar.invoke(((a.b) aVar).f2146a);
                }
                return p.f3034a;
            case 1:
                List<BankAccountDomain> list = (List) obj;
                for (BankAccountDomain bankAccountDomain : list) {
                    u5.d u6 = eVar.f113W0.u();
                    bankAccountDomain.f10711s = u6 != null ? u6.f30239c : null;
                    Map<String, BankAccountDomain.ProviderRequisiteDomain> map = bankAccountDomain.f10699f;
                    if (map != null) {
                        for (Map.Entry<String, BankAccountDomain.ProviderRequisiteDomain> entry : map.entrySet()) {
                            BankAccountDomain.ProviderRequisiteDomain value = entry.getValue();
                            String str2 = entry.getValue().i;
                            if (str2 == null) {
                                str2 = "";
                            }
                            List<f> value2 = eVar.f125i1.getValue();
                            if (value2 != null) {
                                Iterator<T> it = value2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj2 = it.next();
                                        if (kotlin.jvm.internal.f.b(((f) obj2).f30276c, str2)) {
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                f fVar = (f) obj2;
                                if (fVar != null) {
                                    str = fVar.f30277d;
                                    value.f10723m = str;
                                }
                            }
                            str = null;
                            value.f10723m = str;
                        }
                    }
                }
                eVar.f117a1.postValue(list);
                return p.f3034a;
            case 2:
                J5.a aVar2 = (J5.a) obj;
                eVar.k();
                aVar2.getClass();
                if (aVar2 instanceof a.C0026a) {
                    J5.b bVar3 = (J5.b) ((a.C0026a) aVar2).f2145a;
                    if (eVar.a(bVar3)) {
                        eVar.f413E0 = eVar.f422O0;
                    }
                    if (!eVar.c(bVar3)) {
                        eVar.d(bVar3);
                    }
                    p pVar2 = p.f3034a;
                } else {
                    if (!(aVar2 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVar.f124h1.postValue(s.Y(s.X(s.F((List) ((a.b) aVar2).f2146a), new d(0)), 3));
                    p pVar3 = p.f3034a;
                }
                return p.f3034a;
            case 3:
                BankAccountDomain bankAccountDomain2 = (BankAccountDomain) obj;
                ArrayList arrayList = new ArrayList();
                List<BankAccountDomain> value3 = eVar.f117a1.getValue();
                if (value3 != null) {
                    arrayList.addAll(value3);
                }
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj3 = it2.next();
                        if (kotlin.jvm.internal.f.b(((BankAccountDomain) obj3).f10700g, bankAccountDomain2.f10700g)) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                BankAccountDomain bankAccountDomain3 = (BankAccountDomain) obj3;
                if (bankAccountDomain3 != null) {
                    i10 = arrayList.indexOf(bankAccountDomain3);
                    arrayList.remove(bankAccountDomain3);
                }
                u5.d u10 = eVar.f113W0.u();
                bankAccountDomain2.f10711s = u10 != null ? u10.f30239c : null;
                arrayList.add(i10, bankAccountDomain2);
                eVar.f117a1.postValue(arrayList);
                return p.f3034a;
            case 4:
                J5.a aVar3 = (J5.a) obj;
                eVar.k();
                b bVar4 = new b(eVar, i11);
                aVar3.getClass();
                if (aVar3 instanceof a.C0026a) {
                    J5.b bVar5 = (J5.b) ((a.C0026a) aVar3).f2145a;
                    if (eVar.a(bVar5)) {
                        eVar.f413E0 = eVar.f419K0;
                    }
                    if (!eVar.c(bVar5)) {
                        eVar.d(bVar5);
                    }
                    p pVar4 = p.f3034a;
                } else {
                    if (!(aVar3 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar4.invoke(((a.b) aVar3).f2146a);
                }
                return p.f3034a;
            case 5:
                J5.a aVar4 = (J5.a) obj;
                eVar.k();
                aVar4.getClass();
                if (aVar4 instanceof a.C0026a) {
                    J5.b bVar6 = (J5.b) ((a.C0026a) aVar4).f2145a;
                    if (eVar.a(bVar6)) {
                        eVar.f413E0 = eVar.f421M0;
                    }
                    if (!eVar.c(bVar6)) {
                        eVar.d(bVar6);
                    }
                    p pVar5 = p.f3034a;
                } else {
                    if (!(aVar4 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVar.f122f1.postValue((List) ((a.b) aVar4).f2146a);
                    p pVar6 = p.f3034a;
                }
                return p.f3034a;
            case 6:
                J5.a aVar5 = (J5.a) obj;
                aVar5.getClass();
                if (aVar5 instanceof a.C0026a) {
                    J5.b bVar7 = (J5.b) ((a.C0026a) aVar5).f2145a;
                    eVar.k();
                    if (eVar.a(bVar7)) {
                        eVar.f413E0 = eVar.f420L0;
                    }
                    if (!eVar.c(bVar7)) {
                        eVar.d(bVar7);
                    }
                    p pVar7 = p.f3034a;
                } else {
                    if (!(aVar5 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List list2 = (List) ((a.b) aVar5).f2146a;
                    eVar.k();
                    ArrayList b9 = k.b(list2);
                    boolean isEmpty = list2.isEmpty();
                    C0559z<List<TransactionUI>> c0559z = eVar.f119c1;
                    ArrayList<TransactionUI> arrayList2 = eVar.f120d1;
                    if (isEmpty && (i = eVar.f126j1) == 1) {
                        eVar.f126j1 = i + 1;
                        arrayList2.addAll(b9);
                        c0559z.postValue(s.F(arrayList2));
                    } else if (!b9.isEmpty()) {
                        eVar.f126j1++;
                        arrayList2.addAll(b9);
                        c0559z.postValue(s.F(arrayList2));
                    }
                    p pVar8 = p.f3034a;
                }
                return p.f3034a;
            default:
                J5.a aVar6 = (J5.a) obj;
                eVar.k();
                aVar6.getClass();
                if (aVar6 instanceof a.C0026a) {
                    J5.b bVar8 = (J5.b) ((a.C0026a) aVar6).f2145a;
                    if (eVar.a(bVar8)) {
                        eVar.f413E0 = eVar.N0;
                    }
                    if (!eVar.c(bVar8)) {
                        eVar.d(bVar8);
                    }
                    p pVar9 = p.f3034a;
                } else {
                    if (!(aVar6 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List list3 = (List) ((a.b) aVar6).f2146a;
                    eVar.k();
                    if (list3.isEmpty()) {
                        eVar.f128l1 = true;
                    }
                    boolean isEmpty2 = list3.isEmpty();
                    C0559z<List<CryptoExchangeDomain>> c0559z2 = eVar.f123g1;
                    ArrayList<CryptoExchangeDomain> arrayList3 = eVar.f121e1;
                    if (isEmpty2 && eVar.f127k1 == 1) {
                        arrayList3.addAll(list3);
                        c0559z2.postValue(s.F(arrayList3));
                    } else if (!list3.isEmpty()) {
                        eVar.f127k1++;
                        arrayList3.addAll(list3);
                        c0559z2.postValue(s.F(arrayList3));
                    }
                    p pVar10 = p.f3034a;
                }
                return p.f3034a;
        }
    }
}

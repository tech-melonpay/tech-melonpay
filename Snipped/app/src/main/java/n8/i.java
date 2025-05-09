package n8;

import J5.a;
import O9.p;
import P9.n;
import P9.s;
import androidx.lifecycle.C0552s;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import com.luminary.business.presentation.ui.fragments.statements.StatementsSelectorDialog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24309a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.luminary.business.presentation.ui.fragments.statements.c f24310b;

    public /* synthetic */ i(com.luminary.business.presentation.ui.fragments.statements.c cVar, int i) {
        this.f24309a = i;
        this.f24310b = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        int i = 7;
        int i9 = 2;
        final int i10 = 0;
        final int i11 = 1;
        final com.luminary.business.presentation.ui.fragments.statements.c cVar = this.f24310b;
        switch (this.f24309a) {
            case 0:
                J5.b bVar = (J5.b) obj;
                if (cVar.a(bVar)) {
                    cVar.f413E0 = cVar.f424Q0;
                }
                if (!cVar.c(bVar)) {
                    cVar.d(bVar);
                }
                return p.f3034a;
            case 1:
                J5.b bVar2 = (J5.b) obj;
                if (cVar.a(bVar2)) {
                    cVar.f413E0 = cVar.f423P0;
                }
                if (!cVar.c(bVar2)) {
                    cVar.d(bVar2);
                }
                return p.f3034a;
            case 2:
                J5.b bVar3 = (J5.b) obj;
                if (cVar.a(bVar3)) {
                    cVar.f413E0 = cVar.f419K0;
                }
                if (!cVar.c(bVar3)) {
                    cVar.d(bVar3);
                }
                return p.f3034a;
            case 3:
                J5.a aVar = (J5.a) obj;
                cVar.k();
                InterfaceC0646l interfaceC0646l = new InterfaceC0646l() { // from class: com.luminary.business.presentation.ui.fragments.statements.b
                    @Override // ca.InterfaceC0646l
                    public final Object invoke(Object obj2) {
                        Job launch$default;
                        Job launch$default2;
                        List list = (List) obj2;
                        switch (i10) {
                            case 0:
                                c cVar2 = cVar;
                                launch$default = BuildersKt__Builders_commonKt.launch$default(C0552s.b(cVar2), null, null, new StatementsViewModel$loadCards$1$1$2$1(cVar2, list, null), 3, null);
                                return launch$default;
                            default:
                                c cVar3 = cVar;
                                launch$default2 = BuildersKt__Builders_commonKt.launch$default(C0552s.b(cVar3), null, null, new StatementsViewModel$loadVaults$1$1$2$1(cVar3, list, null), 3, null);
                                return launch$default2;
                        }
                    }
                };
                aVar.getClass();
                if (aVar instanceof a.C0026a) {
                    J5.b bVar4 = (J5.b) ((a.C0026a) aVar).f2145a;
                    if (cVar.a(bVar4)) {
                        cVar.f413E0 = cVar.f422O0;
                    }
                    if (!cVar.c(bVar4)) {
                        cVar.d(bVar4);
                    }
                    p pVar = p.f3034a;
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC0646l.invoke(((a.b) aVar).f2146a);
                }
                return p.f3034a;
            case 4:
                J5.a aVar2 = (J5.a) obj;
                i iVar = new i(cVar, i);
                aVar2.getClass();
                if (aVar2 instanceof a.C0026a) {
                    J5.b bVar5 = (J5.b) ((a.C0026a) aVar2).f2145a;
                    if (cVar.a(bVar5)) {
                        cVar.f413E0 = cVar.f418J0;
                    }
                    if (!cVar.c(bVar5)) {
                        cVar.d(bVar5);
                    }
                    p pVar2 = p.f3034a;
                } else {
                    if (!(aVar2 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iVar.invoke(((a.b) aVar2).f2146a);
                }
                return p.f3034a;
            case 5:
                J5.a aVar3 = (J5.a) obj;
                cVar.k();
                InterfaceC0646l interfaceC0646l2 = new InterfaceC0646l() { // from class: com.luminary.business.presentation.ui.fragments.statements.b
                    @Override // ca.InterfaceC0646l
                    public final Object invoke(Object obj2) {
                        Job launch$default;
                        Job launch$default2;
                        List list = (List) obj2;
                        switch (i11) {
                            case 0:
                                c cVar2 = cVar;
                                launch$default = BuildersKt__Builders_commonKt.launch$default(C0552s.b(cVar2), null, null, new StatementsViewModel$loadCards$1$1$2$1(cVar2, list, null), 3, null);
                                return launch$default;
                            default:
                                c cVar3 = cVar;
                                launch$default2 = BuildersKt__Builders_commonKt.launch$default(C0552s.b(cVar3), null, null, new StatementsViewModel$loadVaults$1$1$2$1(cVar3, list, null), 3, null);
                                return launch$default2;
                        }
                    }
                };
                aVar3.getClass();
                if (aVar3 instanceof a.C0026a) {
                    J5.b bVar6 = (J5.b) ((a.C0026a) aVar3).f2145a;
                    if (cVar.a(bVar6)) {
                        cVar.f413E0 = cVar.N0;
                    }
                    if (!cVar.c(bVar6)) {
                        cVar.d(bVar6);
                    }
                    p pVar3 = p.f3034a;
                } else {
                    if (!(aVar3 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC0646l2.invoke(((a.b) aVar3).f2146a);
                }
                return p.f3034a;
            case 6:
                J5.a aVar4 = (J5.a) obj;
                cVar.k();
                i iVar2 = new i(cVar, 8);
                aVar4.getClass();
                if (aVar4 instanceof a.C0026a) {
                    J5.b bVar7 = (J5.b) ((a.C0026a) aVar4).f2145a;
                    if (cVar.a(bVar7)) {
                        cVar.f413E0 = cVar.f420L0;
                    }
                    if (!cVar.c(bVar7)) {
                        cVar.d(bVar7);
                    }
                    p pVar4 = p.f3034a;
                } else {
                    if (!(aVar4 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iVar2.invoke(((a.b) aVar4).f2146a);
                }
                return p.f3034a;
            case 7:
                List<BankAccountDomain> list = (List) obj;
                cVar.f13076c1 = list;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((BankAccountDomain) obj2).i != null) {
                        arrayList.add(obj2);
                    }
                }
                List<BankAccountDomain> X = s.X(arrayList, new A7.d(7));
                ArrayList arrayList2 = new ArrayList(n.u(X, 10));
                for (BankAccountDomain bankAccountDomain : X) {
                    String str = bankAccountDomain.i;
                    String str2 = str == null ? "" : str;
                    String str3 = bankAccountDomain.f10701h;
                    arrayList2.add(new StatementsSelectorDialog.a(str2, D9.b.D(str3), str3 == null ? "" : str3, F8.b.b(bankAccountDomain), F8.b.c(bankAccountDomain), null, bankAccountDomain.f10701h, bankAccountDomain.f10694a, false, 288));
                }
                cVar.f13077d1 = arrayList2;
                return p.f3034a;
            case 8:
                List<CryptoAccountDomain> list2 = (List) obj;
                cVar.f13079f1 = list2;
                O9.f a10 = org.koin.java.a.a(K5.a.class);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list2) {
                    if (((CryptoAccountDomain) obj3).f10966d != null) {
                        arrayList3.add(obj3);
                    }
                }
                List X10 = s.X(arrayList3, new A7.d(2));
                ArrayList arrayList4 = new ArrayList(n.u(X10, 10));
                Iterator it = X10.iterator();
                while (it.hasNext()) {
                    CryptoAccountDomain cryptoAccountDomain = (CryptoAccountDomain) it.next();
                    String str4 = cryptoAccountDomain.f10969g;
                    String str5 = str4 == null ? "" : str4;
                    String str6 = cryptoAccountDomain.f10968f;
                    String str7 = str6 == null ? "" : str6;
                    String str8 = str4 == null ? "" : str4;
                    String a11 = cryptoAccountDomain.a();
                    String b9 = cryptoAccountDomain.b(((K5.a) a10.getValue()).Q(cryptoAccountDomain.f10969g));
                    Long l10 = cryptoAccountDomain.f10963a;
                    Iterator it2 = it;
                    arrayList4.add(new StatementsSelectorDialog.a(str5, str7, str8, a11, b9, null, str4, l10 != null ? Integer.valueOf((int) l10.longValue()) : null, false, 288));
                    it = it2;
                }
                cVar.f13080g1 = arrayList4;
                return p.f3034a;
            case 9:
                J5.a aVar5 = (J5.a) obj;
                cVar.k();
                i iVar3 = new i(cVar, 13);
                if (aVar5 instanceof a.C0026a) {
                    iVar3.invoke(((a.C0026a) aVar5).f2145a);
                } else {
                    if (!(aVar5 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar.f13078e1.postValue((String) ((a.b) aVar5).f2146a);
                    p pVar5 = p.f3034a;
                }
                return p.f3034a;
            case 10:
                J5.a aVar6 = (J5.a) obj;
                cVar.k();
                i iVar4 = new i(cVar, i9);
                if (aVar6 instanceof a.C0026a) {
                    iVar4.invoke(((a.C0026a) aVar6).f2145a);
                } else {
                    if (!(aVar6 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar.f13078e1.postValue((String) ((a.b) aVar6).f2146a);
                    p pVar6 = p.f3034a;
                }
                return p.f3034a;
            case 11:
                J5.a aVar7 = (J5.a) obj;
                cVar.k();
                i iVar5 = new i(cVar, i10);
                if (aVar7 instanceof a.C0026a) {
                    iVar5.invoke(((a.C0026a) aVar7).f2145a);
                } else {
                    if (!(aVar7 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar.f13078e1.postValue((String) ((a.b) aVar7).f2146a);
                    p pVar7 = p.f3034a;
                }
                return p.f3034a;
            case 12:
                J5.a aVar8 = (J5.a) obj;
                cVar.k();
                i iVar6 = new i(cVar, i11);
                if (aVar8 instanceof a.C0026a) {
                    iVar6.invoke(((a.C0026a) aVar8).f2145a);
                } else {
                    if (!(aVar8 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar.f13078e1.postValue((String) ((a.b) aVar8).f2146a);
                    p pVar8 = p.f3034a;
                }
                return p.f3034a;
            default:
                J5.b bVar8 = (J5.b) obj;
                if (cVar.a(bVar8)) {
                    cVar.f413E0 = cVar.f421M0;
                }
                if (!cVar.c(bVar8)) {
                    cVar.d(bVar8);
                }
                return p.f3034a;
        }
    }
}

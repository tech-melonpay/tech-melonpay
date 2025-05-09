package d7;

import J5.a;
import O9.p;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.domain.entity.cards.TopUpCommissionDomain;
import com.luminary.business.presentation.ui.fragments.statements.StatementsSelectorDialog;
import h4.i;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* renamed from: d7.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0694e implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20452a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0695f f20453b;

    public /* synthetic */ C0694e(C0695f c0695f, int i) {
        this.f20452a = i;
        this.f20453b = c0695f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        BigDecimal bigDecimal;
        StatementsSelectorDialog.a aVar;
        BigDecimal bigDecimal2 = null;
        C0695f c0695f = this.f20453b;
        switch (this.f20452a) {
            case 0:
                J5.a aVar2 = (J5.a) obj;
                c0695f.k();
                C0694e c0694e = new C0694e(c0695f, 2);
                aVar2.getClass();
                if (aVar2 instanceof a.C0026a) {
                    c0695f.d((J5.b) ((a.C0026a) aVar2).f2145a);
                    p pVar = p.f3034a;
                } else {
                    if (!(aVar2 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c0694e.invoke(((a.b) aVar2).f2146a);
                }
                return p.f3034a;
            case 1:
                J5.a aVar3 = (J5.a) obj;
                aVar3.getClass();
                if (aVar3 instanceof a.C0026a) {
                    J5.b bVar = (J5.b) ((a.C0026a) aVar3).f2145a;
                    if (c0695f.a(bVar)) {
                        c0695f.f413E0 = c0695f.f418J0;
                    }
                    if (!c0695f.c(bVar)) {
                        c0695f.d(bVar);
                    }
                    p pVar2 = p.f3034a;
                } else {
                    if (!(aVar3 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    TopUpCommissionDomain topUpCommissionDomain = (TopUpCommissionDomain) ((a.b) aVar3).f2146a;
                    BankAccountDomain bankAccountDomain = c0695f.f20457W0;
                    if (bankAccountDomain != null && (bigDecimal = bankAccountDomain.f10698e) != null) {
                        bigDecimal2 = bigDecimal.subtract(new BigDecimal(String.valueOf(topUpCommissionDomain.f10775a)));
                    }
                    boolean z10 = bigDecimal2 != null && bigDecimal2.compareTo(BigDecimal.ZERO) < 0;
                    c0695f.f20466f1 = z10;
                    c0695f.f20464d1.postValue(Boolean.valueOf(z10));
                    c0695f.h0();
                    p pVar3 = p.f3034a;
                }
                return p.f3034a;
            default:
                List<i> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (hashSet.add(((i) obj2).f21120c)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    i iVar = (i) it.next();
                    if (iVar.f21119b != null) {
                        String str = iVar.f21120c;
                        if (str == null) {
                            str = "";
                        }
                        aVar = new StatementsSelectorDialog.a(str, "", "", "", "", null, "", Integer.valueOf(iVar.f21118a), false, 288);
                    } else {
                        aVar = null;
                    }
                    if (aVar != null) {
                        arrayList2.add(aVar);
                    }
                }
                c0695f.f20462b1 = arrayList2;
                c0695f.f20461a1.postValue(list);
                return p.f3034a;
        }
    }
}

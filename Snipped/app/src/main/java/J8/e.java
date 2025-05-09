package j8;

import F8.k;
import J5.a;
import O9.p;
import P9.s;
import androidx.lifecycle.C0559z;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.transaction.PaymentType;
import com.luminary.business.presentation.entity.transaction.TransactionUI;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22553a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.luminary.business.presentation.ui.fragments.payments.a f22554b;

    public /* synthetic */ e(com.luminary.business.presentation.ui.fragments.payments.a aVar, int i) {
        this.f22553a = i;
        this.f22554b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        com.luminary.business.presentation.ui.fragments.payments.a aVar = this.f22554b;
        J5.a aVar2 = (J5.a) obj;
        switch (this.f22553a) {
            case 0:
                aVar2.getClass();
                if (aVar2 instanceof a.C0026a) {
                    J5.b bVar = (J5.b) ((a.C0026a) aVar2).f2145a;
                    aVar.k();
                    if (aVar.a(bVar)) {
                        aVar.f413E0 = aVar.f419K0;
                    }
                    if (!aVar.c(bVar)) {
                        aVar.d(bVar);
                    }
                    p pVar = p.f3034a;
                } else {
                    if (!(aVar2 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List list = (List) ((a.b) aVar2).f2146a;
                    aVar.k();
                    ArrayList b9 = k.b(list);
                    boolean isEmpty = list.isEmpty();
                    C0559z<List<TransactionUI>> c0559z = aVar.f12956W0;
                    ArrayList<TransactionUI> arrayList = aVar.f12957X0;
                    if (isEmpty && aVar.f12962c1 == 1) {
                        arrayList.addAll(b9);
                        c0559z.postValue(s.F(arrayList));
                    } else if (!b9.isEmpty()) {
                        aVar.f12962c1++;
                        arrayList.addAll(b9);
                        c0559z.postValue(s.F(arrayList));
                    }
                    p pVar2 = p.f3034a;
                }
                return p.f3034a;
            default:
                aVar.k();
                aVar2.getClass();
                if (aVar2 instanceof a.C0026a) {
                    J5.b bVar2 = (J5.b) ((a.C0026a) aVar2).f2145a;
                    if (aVar.a(bVar2)) {
                        aVar.f413E0 = aVar.f418J0;
                    }
                    if (!aVar.c(bVar2)) {
                        aVar.d(bVar2);
                    }
                    p pVar3 = p.f3034a;
                } else {
                    if (!(aVar2 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List list2 = (List) ((a.b) aVar2).f2146a;
                    C0559z<List<H5.b>> c0559z2 = aVar.f12960a1;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list2) {
                        PaymentType paymentType = ((H5.b) obj2).f1502g;
                        if (paymentType == PaymentType.f11147a || paymentType == PaymentType.f11151e) {
                            arrayList2.add(obj2);
                        }
                    }
                    c0559z2.postValue(arrayList2);
                    p pVar4 = p.f3034a;
                }
                return p.f3034a;
        }
    }
}

package p8;

import J5.a;
import O9.p;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import u5.d;

/* compiled from: R8$$SyntheticClass */
/* renamed from: p8.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1117b implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25711a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1118c f25712b;

    public /* synthetic */ C1117b(C1118c c1118c, int i) {
        this.f25711a = i;
        this.f25712b = c1118c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        C1118c c1118c = this.f25712b;
        J5.a aVar = (J5.a) obj;
        switch (this.f25711a) {
            case 0:
                aVar.getClass();
                if (aVar instanceof a.C0026a) {
                    J5.b bVar = (J5.b) ((a.C0026a) aVar).f2145a;
                    c1118c.k();
                    if (c1118c.a(bVar)) {
                        c1118c.f413E0 = c1118c.f418J0;
                    }
                    if (!c1118c.c(bVar)) {
                        c1118c.d(bVar);
                    }
                    p pVar = p.f3034a;
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c1118c.f25717X0.postValue((List) ((a.b) aVar).f2146a);
                    p pVar2 = p.f3034a;
                }
                return p.f3034a;
            default:
                c1118c.k();
                aVar.getClass();
                if (aVar instanceof a.C0026a) {
                    J5.b bVar2 = (J5.b) ((a.C0026a) aVar).f2145a;
                    if (c1118c.a(bVar2)) {
                        c1118c.f413E0 = c1118c.f419K0;
                    }
                    if (!c1118c.c(bVar2)) {
                        c1118c.d(bVar2);
                    }
                    p pVar3 = p.f3034a;
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List<BankAccountDomain> list = (List) ((a.b) aVar).f2146a;
                    for (BankAccountDomain bankAccountDomain : list) {
                        d u6 = c1118c.f25714U0.u();
                        bankAccountDomain.f10711s = u6 != null ? u6.f30239c : null;
                    }
                    c1118c.f25716W0.postValue(list);
                    p pVar4 = p.f3034a;
                }
                return p.f3034a;
        }
    }
}

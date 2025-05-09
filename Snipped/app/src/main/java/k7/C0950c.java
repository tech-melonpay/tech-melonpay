package k7;

import J5.a;
import O9.p;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import v5.C1545a;

/* compiled from: R8$$SyntheticClass */
/* renamed from: k7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0950c implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23032a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f23033b;

    public /* synthetic */ C0950c(e eVar, int i) {
        this.f23032a = i;
        this.f23033b = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        e eVar = this.f23033b;
        switch (this.f23032a) {
            case 0:
                J5.a aVar = (J5.a) obj;
                eVar.k();
                C0950c c0950c = new C0950c(eVar, 1);
                if (aVar instanceof a.C0026a) {
                    c0950c.invoke(((a.C0026a) aVar).f2145a);
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVar.f23042Z0.postValue((CryptoAccountDomain) ((a.b) aVar).f2146a);
                    p pVar = p.f3034a;
                }
                return p.f3034a;
            case 1:
                J5.b bVar = (J5.b) obj;
                if (eVar.a(bVar)) {
                    eVar.f413E0 = eVar.f418J0;
                }
                if (!eVar.c(bVar)) {
                    eVar.d(bVar);
                }
                return p.f3034a;
            case 2:
                J5.a aVar2 = (J5.a) obj;
                eVar.k();
                C0950c c0950c2 = new C0950c(eVar, 5);
                if (aVar2 instanceof a.C0026a) {
                    c0950c2.invoke(((a.C0026a) aVar2).f2145a);
                } else {
                    if (!(aVar2 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVar.f23040X0.postValue(((C1545a) ((a.b) aVar2).f2146a).f30602b);
                    p pVar2 = p.f3034a;
                }
                return p.f3034a;
            case 3:
                J5.a aVar3 = (J5.a) obj;
                eVar.k();
                C0950c c0950c3 = new C0950c(eVar, 4);
                if (aVar3 instanceof a.C0026a) {
                    c0950c3.invoke(((a.C0026a) aVar3).f2145a);
                } else {
                    if (!(aVar3 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVar.f23041Y0.postValue((List) ((a.b) aVar3).f2146a);
                    p pVar3 = p.f3034a;
                }
                return p.f3034a;
            case 4:
                J5.b bVar2 = (J5.b) obj;
                if (eVar.a(bVar2)) {
                    eVar.f413E0 = eVar.f420L0;
                }
                if (!eVar.c(bVar2)) {
                    eVar.d(bVar2);
                }
                return p.f3034a;
            default:
                J5.b bVar3 = (J5.b) obj;
                if (eVar.a(bVar3)) {
                    eVar.f413E0 = eVar.f419K0;
                }
                if (!eVar.c(bVar3)) {
                    eVar.d(bVar3);
                }
                return p.f3034a;
        }
    }
}

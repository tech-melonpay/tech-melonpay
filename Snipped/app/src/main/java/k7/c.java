package K7;

import I5.k;
import J5.a;
import O9.p;
import ca.InterfaceC0646l;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2262a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f2263b;

    public /* synthetic */ c(d dVar, int i) {
        this.f2262a = i;
        this.f2263b = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        d dVar = this.f2263b;
        J5.a aVar = (J5.a) obj;
        switch (this.f2262a) {
            case 0:
                dVar.k();
                aVar.getClass();
                if (aVar instanceof a.C0026a) {
                    dVar.d((J5.b) ((a.C0026a) aVar).f2145a);
                    p pVar = p.f3034a;
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar.f2268X0.postValue((List) ((a.b) aVar).f2146a);
                    p pVar2 = p.f3034a;
                }
                return p.f3034a;
            case 1:
                dVar.k();
                aVar.getClass();
                if (aVar instanceof a.C0026a) {
                    dVar.d((J5.b) ((a.C0026a) aVar).f2145a);
                    p pVar3 = p.f3034a;
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar.f2270Z0.setValue(null);
                    p pVar4 = p.f3034a;
                }
                return p.f3034a;
            case 2:
                dVar.k();
                aVar.getClass();
                if (aVar instanceof a.C0026a) {
                    dVar.d((J5.b) ((a.C0026a) aVar).f2145a);
                    p pVar5 = p.f3034a;
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar.f2272b1.postValue((k) ((a.b) aVar).f2146a);
                    dVar.l();
                    p pVar6 = p.f3034a;
                    dVar.f2266V0.a(new c(dVar, 3), pVar6);
                }
                return p.f3034a;
            default:
                dVar.k();
                aVar.getClass();
                if (aVar instanceof a.C0026a) {
                    dVar.d((J5.b) ((a.C0026a) aVar).f2145a);
                    p pVar7 = p.f3034a;
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar.f2272b1.postValue((k) ((a.b) aVar).f2146a);
                    p pVar8 = p.f3034a;
                }
                return p.f3034a;
        }
    }
}

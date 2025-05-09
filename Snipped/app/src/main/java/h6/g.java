package H6;

import J5.a;
import O9.p;
import ca.InterfaceC0646l;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1534a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f1535b;

    public /* synthetic */ g(i iVar, int i) {
        this.f1534a = i;
        this.f1535b = iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        i iVar = this.f1535b;
        switch (this.f1534a) {
            case 0:
                J5.a aVar = (J5.a) obj;
                iVar.k();
                g gVar = new g(iVar, 1);
                if (aVar instanceof a.C0026a) {
                    gVar.invoke(((a.C0026a) aVar).f2145a);
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iVar.f1544X0.p();
                    iVar.f1546Z0.setValue(null);
                    p pVar = p.f3034a;
                }
                return p.f3034a;
            case 1:
                iVar.d((J5.b) obj);
                return p.f3034a;
            case 2:
                J5.a aVar2 = (J5.a) obj;
                iVar.k();
                g gVar2 = new g(iVar, 5);
                if (aVar2 instanceof a.C0026a) {
                    gVar2.invoke(((a.C0026a) aVar2).f2145a);
                } else {
                    if (!(aVar2 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iVar.f1545Y0.postValue((String) ((a.b) aVar2).f2146a);
                    p pVar2 = p.f3034a;
                }
                return p.f3034a;
            case 3:
                J5.a aVar3 = (J5.a) obj;
                iVar.k();
                g gVar3 = new g(iVar, 4);
                if (aVar3 instanceof a.C0026a) {
                    gVar3.invoke(((a.C0026a) aVar3).f2145a);
                } else {
                    if (!(aVar3 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iVar.f1547a1.setValue(null);
                    p pVar3 = p.f3034a;
                }
                return p.f3034a;
            case 4:
                J5.b bVar = (J5.b) obj;
                if (iVar.a(bVar)) {
                    iVar.f413E0 = iVar.f418J0;
                }
                iVar.d(bVar);
                return p.f3034a;
            default:
                J5.b bVar2 = (J5.b) obj;
                if (iVar.a(bVar2)) {
                    iVar.f413E0 = iVar.f419K0;
                }
                iVar.d(bVar2);
                return p.f3034a;
        }
    }
}

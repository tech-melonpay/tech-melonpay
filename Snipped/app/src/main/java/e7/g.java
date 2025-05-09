package E7;

import J5.a;
import O9.p;
import ca.InterfaceC0646l;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1086a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f1087b;

    public /* synthetic */ g(h hVar, int i) {
        this.f1086a = i;
        this.f1087b = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        String str;
        int i = 0;
        h hVar = this.f1087b;
        switch (this.f1086a) {
            case 0:
                J5.a aVar = (J5.a) obj;
                hVar.k();
                g gVar = new g(hVar, 5);
                if (aVar instanceof a.C0026a) {
                    gVar.invoke(((a.C0026a) aVar).f2145a);
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hVar.f1094Z0.postValue((String) ((a.b) aVar).f2146a);
                    p pVar = p.f3034a;
                }
                return p.f3034a;
            case 1:
                J5.a aVar2 = (J5.a) obj;
                aVar2.getClass();
                if (aVar2 instanceof a.C0026a) {
                    J5.b bVar = (J5.b) ((a.C0026a) aVar2).f2145a;
                    if (hVar.a(bVar)) {
                        hVar.f413E0 = hVar.f421M0;
                    }
                    if (!hVar.c(bVar)) {
                        hVar.f1095a1.setValue(null);
                        hVar.d(bVar);
                    }
                    p pVar2 = p.f3034a;
                } else {
                    if (!(aVar2 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    F5.b value = hVar.f1093Y0.getValue();
                    if (value != null && (str = value.f1188a) != null) {
                        e eVar = new e(hVar, str, i);
                        hVar.f419K0 = eVar;
                        eVar.invoke();
                        p pVar3 = p.f3034a;
                    }
                    p pVar4 = p.f3034a;
                }
                return p.f3034a;
            case 2:
                J5.a aVar3 = (J5.a) obj;
                hVar.k();
                if (aVar3 instanceof a.C0026a) {
                    J5.b bVar2 = (J5.b) ((a.C0026a) aVar3).f2145a;
                    if (hVar.a(bVar2)) {
                        hVar.f413E0 = hVar.f418J0;
                    }
                    if (!hVar.c(bVar2)) {
                        hVar.d(bVar2);
                    }
                    p pVar5 = p.f3034a;
                } else {
                    if (!(aVar3 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    e eVar2 = new e(hVar, ((F5.b) ((a.b) aVar3).f2146a).f1188a.toString(), i);
                    hVar.f419K0 = eVar2;
                    eVar2.invoke();
                    p pVar6 = p.f3034a;
                }
                return p.f3034a;
            case 3:
                J5.a aVar4 = (J5.a) obj;
                hVar.k();
                g gVar2 = new g(hVar, 4);
                if (aVar4 instanceof a.C0026a) {
                    gVar2.invoke(((a.C0026a) aVar4).f2145a);
                } else {
                    if (!(aVar4 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hVar.f1093Y0.postValue((F5.b) ((a.b) aVar4).f2146a);
                    p pVar7 = p.f3034a;
                }
                return p.f3034a;
            case 4:
                J5.b bVar3 = (J5.b) obj;
                if (hVar.a(bVar3)) {
                    hVar.f413E0 = hVar.f419K0;
                }
                if (!hVar.c(bVar3)) {
                    hVar.f1093Y0.postValue(null);
                }
                return p.f3034a;
            default:
                J5.b bVar4 = (J5.b) obj;
                if (hVar.a(bVar4)) {
                    hVar.f413E0 = hVar.f420L0;
                }
                if (!hVar.c(bVar4)) {
                    hVar.d(bVar4);
                }
                return p.f3034a;
        }
    }
}

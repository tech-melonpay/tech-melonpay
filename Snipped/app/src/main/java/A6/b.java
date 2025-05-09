package A6;

import I5.s;
import J5.a;
import O9.p;
import ca.InterfaceC0646l;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import u5.f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f95b;

    public /* synthetic */ b(c cVar, int i) {
        this.f94a = i;
        this.f95b = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        int i = 2;
        c cVar = this.f95b;
        switch (this.f94a) {
            case 0:
                J5.a aVar = (J5.a) obj;
                b bVar = new b(cVar, 1);
                aVar.getClass();
                if (aVar instanceof a.C0026a) {
                    cVar.getClass();
                    p pVar = p.f3034a;
                    cVar.f98V0.a(new b(cVar, i), pVar);
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar.invoke(((a.b) aVar).f2146a);
                }
                return p.f3034a;
            case 1:
                s sVar = (s) obj;
                String str = sVar.f1878a;
                if (str == null) {
                    cVar.getClass();
                    p pVar2 = p.f3034a;
                    cVar.f98V0.a(new b(cVar, i), pVar2);
                } else {
                    if (new io.github.g00fy2.versioncompare.a(cVar.f97U0).compareTo(new io.github.g00fy2.versioncompare.a(str)) < 0) {
                        cVar.f101Y0.postValue(sVar.f1880c);
                    } else {
                        p pVar3 = p.f3034a;
                        cVar.f98V0.a(new b(cVar, i), pVar3);
                    }
                }
                return p.f3034a;
            case 2:
                J5.a aVar2 = (J5.a) obj;
                aVar2.getClass();
                if (aVar2 instanceof a.C0026a) {
                    cVar.d((J5.b) ((a.C0026a) aVar2).f2145a);
                    p pVar4 = p.f3034a;
                } else {
                    if (!(aVar2 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List<f> list = (List) ((a.b) aVar2).f2146a;
                    for (f fVar : list) {
                        fVar.f30275b = fVar.f30277d;
                        fVar.f30279f = fVar.f30276c;
                    }
                    cVar.f99W0.U(list);
                    cVar.f100X0.setValue(null);
                    p pVar5 = p.f3034a;
                }
                return p.f3034a;
            case 3:
                J5.a aVar3 = (J5.a) obj;
                aVar3.getClass();
                if (aVar3 instanceof a.C0026a) {
                    cVar.d((J5.b) ((a.C0026a) aVar3).f2145a);
                    p pVar6 = p.f3034a;
                } else {
                    if (!(aVar3 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar.f99W0.T((G5.a) ((a.b) aVar3).f2146a);
                    p pVar7 = p.f3034a;
                }
                return p.f3034a;
            default:
                J5.a aVar4 = (J5.a) obj;
                aVar4.getClass();
                if (aVar4 instanceof a.C0026a) {
                    cVar.d((J5.b) ((a.C0026a) aVar4).f2145a);
                    p pVar8 = p.f3034a;
                } else {
                    if (!(aVar4 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar.f99W0.s((List) ((a.b) aVar4).f2146a);
                    p pVar9 = p.f3034a;
                }
                return p.f3034a;
        }
    }
}

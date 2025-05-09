package D7;

import J5.a;
import O9.p;
import ca.InterfaceC0646l;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f969a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f970b;

    public /* synthetic */ f(g gVar, int i) {
        this.f969a = i;
        this.f970b = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        g gVar = this.f970b;
        switch (this.f969a) {
            case 0:
                J5.a aVar = (J5.a) obj;
                gVar.k();
                f fVar = new f(gVar, 3);
                if (aVar instanceof a.C0026a) {
                    fVar.invoke(((a.C0026a) aVar).f2145a);
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gVar.h0();
                    p pVar = p.f3034a;
                }
                return p.f3034a;
            case 1:
                J5.a aVar2 = (J5.a) obj;
                gVar.k();
                f fVar2 = new f(gVar, 4);
                if (aVar2 instanceof a.C0026a) {
                    fVar2.invoke(((a.C0026a) aVar2).f2145a);
                } else {
                    if (!(aVar2 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gVar.f975X0.postValue((List) ((a.b) aVar2).f2146a);
                    p pVar2 = p.f3034a;
                }
                return p.f3034a;
            case 2:
                J5.a aVar3 = (J5.a) obj;
                gVar.k();
                f fVar3 = new f(gVar, 5);
                if (aVar3 instanceof a.C0026a) {
                    fVar3.invoke(((a.C0026a) aVar3).f2145a);
                } else {
                    if (!(aVar3 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gVar.f976Y0.postValue((String) ((a.b) aVar3).f2146a);
                    p pVar3 = p.f3034a;
                }
                return p.f3034a;
            case 3:
                J5.b bVar = (J5.b) obj;
                if (gVar.a(bVar)) {
                    gVar.f413E0 = gVar.f419K0;
                }
                if (!gVar.c(bVar)) {
                    gVar.d(bVar);
                }
                return p.f3034a;
            case 4:
                J5.b bVar2 = (J5.b) obj;
                if (gVar.a(bVar2)) {
                    gVar.f413E0 = gVar.f418J0;
                }
                if (!gVar.c(bVar2)) {
                    gVar.d(bVar2);
                }
                return p.f3034a;
            default:
                J5.b bVar3 = (J5.b) obj;
                if (gVar.a(bVar3)) {
                    gVar.f413E0 = gVar.f420L0;
                }
                if (!gVar.c(bVar3)) {
                    gVar.d(bVar3);
                }
                return p.f3034a;
        }
    }
}

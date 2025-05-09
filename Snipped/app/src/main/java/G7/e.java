package G7;

import J5.a;
import O9.p;
import ca.InterfaceC0646l;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1348a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f1349b;

    public /* synthetic */ e(g gVar, int i) {
        this.f1348a = i;
        this.f1349b = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        g gVar = this.f1349b;
        switch (this.f1348a) {
            case 0:
                J5.a aVar = (J5.a) obj;
                gVar.k();
                e eVar = new e(gVar, 2);
                if (aVar instanceof a.C0026a) {
                    eVar.invoke(((a.C0026a) aVar).f2145a);
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gVar.f1357W0.postValue((z5.c) ((a.b) aVar).f2146a);
                    p pVar = p.f3034a;
                }
                return p.f3034a;
            case 1:
                J5.a aVar2 = (J5.a) obj;
                gVar.k();
                e eVar2 = new e(gVar, 3);
                if (aVar2 instanceof a.C0026a) {
                    eVar2.invoke(((a.C0026a) aVar2).f2145a);
                } else {
                    if (!(aVar2 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    p pVar2 = p.f3034a;
                }
                return p.f3034a;
            case 2:
                J5.b bVar = (J5.b) obj;
                if (gVar.a(bVar)) {
                    gVar.f413E0 = gVar.f419K0;
                }
                if (!gVar.c(bVar)) {
                    gVar.d(bVar);
                }
                return p.f3034a;
            default:
                J5.b bVar2 = (J5.b) obj;
                if (gVar.a(bVar2)) {
                    gVar.f413E0 = gVar.f418J0;
                }
                if (!gVar.c(bVar2)) {
                    gVar.d(bVar2);
                }
                return p.f3034a;
        }
    }
}

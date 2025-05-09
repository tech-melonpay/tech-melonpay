package R6;

import J5.a;
import O9.p;
import ca.InterfaceC0646l;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3287a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f3288b;

    public /* synthetic */ h(i iVar, int i) {
        this.f3287a = i;
        this.f3288b = iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        i iVar = this.f3288b;
        switch (this.f3287a) {
            case 0:
                J5.a aVar = (J5.a) obj;
                iVar.k();
                h hVar = new h(iVar, 2);
                if (aVar instanceof a.C0026a) {
                    hVar.invoke(((a.C0026a) aVar).f2145a);
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iVar.f3292W0.setValue(null);
                    p pVar = p.f3034a;
                }
                return p.f3034a;
            case 1:
                J5.a aVar2 = (J5.a) obj;
                iVar.k();
                h hVar2 = new h(iVar, 3);
                if (aVar2 instanceof a.C0026a) {
                    hVar2.invoke(((a.C0026a) aVar2).f2145a);
                } else {
                    if (!(aVar2 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iVar.f3292W0.setValue(null);
                    p pVar2 = p.f3034a;
                }
                return p.f3034a;
            case 2:
                J5.b bVar = (J5.b) obj;
                if (iVar.a(bVar)) {
                    iVar.f413E0 = iVar.f418J0;
                }
                if (!iVar.c(bVar)) {
                    iVar.d(bVar);
                }
                return p.f3034a;
            default:
                J5.b bVar2 = (J5.b) obj;
                if (iVar.a(bVar2)) {
                    iVar.f413E0 = iVar.f419K0;
                }
                if (!iVar.c(bVar2)) {
                    iVar.d(bVar2);
                }
                return p.f3034a;
        }
    }
}

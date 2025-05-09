package H7;

import J5.a;
import O9.p;
import ca.InterfaceC0646l;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1561a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f1562b;

    public /* synthetic */ d(e eVar, int i) {
        this.f1561a = i;
        this.f1562b = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        e eVar = this.f1562b;
        switch (this.f1561a) {
            case 0:
                J5.a aVar = (J5.a) obj;
                eVar.k();
                d dVar = new d(eVar, 1);
                if (aVar instanceof a.C0026a) {
                    dVar.invoke(((a.C0026a) aVar).f2145a);
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVar.f1565V0.setValue(null);
                    p pVar = p.f3034a;
                }
                return p.f3034a;
            default:
                J5.b bVar = (J5.b) obj;
                if (eVar.a(bVar)) {
                    eVar.f413E0 = eVar.f418J0;
                }
                if (!eVar.c(bVar)) {
                    eVar.d(bVar);
                }
                return p.f3034a;
        }
    }
}

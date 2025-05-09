package v7;

import J5.a;
import O9.p;
import ca.InterfaceC0646l;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30662a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f30663b;

    public /* synthetic */ c(d dVar, int i) {
        this.f30662a = i;
        this.f30663b = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        d dVar = this.f30663b;
        switch (this.f30662a) {
            case 0:
                J5.a aVar = (J5.a) obj;
                dVar.k();
                c cVar = new c(dVar, 1);
                if (aVar instanceof a.C0026a) {
                    cVar.invoke(((a.C0026a) aVar).f2145a);
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar.f30666V0.setValue(null);
                    p pVar = p.f3034a;
                }
                return p.f3034a;
            default:
                J5.b bVar = (J5.b) obj;
                if (dVar.a(bVar)) {
                    dVar.f413E0 = dVar.f418J0;
                }
                dVar.d(bVar);
                return p.f3034a;
        }
    }
}

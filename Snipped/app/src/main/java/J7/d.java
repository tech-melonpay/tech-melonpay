package j7;

import J5.a;
import O9.p;
import ca.InterfaceC0646l;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22539a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f22540b;

    public /* synthetic */ d(e eVar, int i) {
        this.f22539a = i;
        this.f22540b = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        e eVar = this.f22540b;
        switch (this.f22539a) {
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
                    eVar.f22543V0.postValue((v5.b) ((a.b) aVar).f2146a);
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

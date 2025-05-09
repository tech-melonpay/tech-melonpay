package Y6;

import J5.a;
import O9.p;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.cards.VaultDomain;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4111a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f4112b;

    public /* synthetic */ d(e eVar, int i) {
        this.f4111a = i;
        this.f4112b = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        e eVar = this.f4112b;
        switch (this.f4111a) {
            case 0:
                J5.a aVar = (J5.a) obj;
                eVar.k();
                d dVar = new d(eVar, 3);
                if (aVar instanceof a.C0026a) {
                    dVar.invoke(((a.C0026a) aVar).f2145a);
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVar.f4117X0.postValue((VaultDomain) ((a.b) aVar).f2146a);
                    p pVar = p.f3034a;
                }
                return p.f3034a;
            case 1:
                J5.a aVar2 = (J5.a) obj;
                eVar.k();
                d dVar2 = new d(eVar, 2);
                if (aVar2 instanceof a.C0026a) {
                    dVar2.invoke(((a.C0026a) aVar2).f2145a);
                } else {
                    if (!(aVar2 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVar.f4116W0.setValue(null);
                    p pVar2 = p.f3034a;
                }
                return p.f3034a;
            case 2:
                J5.b bVar = (J5.b) obj;
                if (eVar.a(bVar)) {
                    eVar.f413E0 = eVar.f418J0;
                }
                if (!eVar.c(bVar)) {
                    eVar.d(bVar);
                }
                return p.f3034a;
            default:
                J5.b bVar2 = (J5.b) obj;
                if (eVar.a(bVar2)) {
                    eVar.f413E0 = eVar.f419K0;
                }
                if (!eVar.c(bVar2)) {
                    eVar.d(bVar2);
                }
                return p.f3034a;
        }
    }
}

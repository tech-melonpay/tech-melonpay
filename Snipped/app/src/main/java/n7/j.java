package n7;

import J5.a;
import O9.p;
import ca.InterfaceC0646l;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import v5.C1545a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class j implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24274a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f24275b;

    public /* synthetic */ j(k kVar, int i) {
        this.f24274a = i;
        this.f24275b = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        k kVar = this.f24275b;
        switch (this.f24274a) {
            case 0:
                J5.a aVar = (J5.a) obj;
                kVar.k();
                j jVar = new j(kVar, 3);
                if (aVar instanceof a.C0026a) {
                    jVar.invoke(((a.C0026a) aVar).f2145a);
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kVar.f24282Z0.postValue((List) ((a.b) aVar).f2146a);
                    p pVar = p.f3034a;
                }
                return p.f3034a;
            case 1:
                J5.a aVar2 = (J5.a) obj;
                kVar.k();
                j jVar2 = new j(kVar, 2);
                if (aVar2 instanceof a.C0026a) {
                    jVar2.invoke(((a.C0026a) aVar2).f2145a);
                } else {
                    if (!(aVar2 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kVar.f24283a1.postValue((C1545a) ((a.b) aVar2).f2146a);
                    p pVar2 = p.f3034a;
                }
                return p.f3034a;
            case 2:
                J5.b bVar = (J5.b) obj;
                if (kVar.a(bVar)) {
                    kVar.f413E0 = kVar.f419K0;
                }
                if (!kVar.c(bVar)) {
                    kVar.d(bVar);
                }
                return p.f3034a;
            default:
                J5.b bVar2 = (J5.b) obj;
                if (kVar.a(bVar2)) {
                    kVar.f413E0 = kVar.f421M0;
                }
                if (!kVar.c(bVar2)) {
                    kVar.d(bVar2);
                }
                return p.f3034a;
        }
    }
}

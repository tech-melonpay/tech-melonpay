package T6;

import J5.a;
import O9.p;
import ca.InterfaceC0646l;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3571a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f3572b;

    public /* synthetic */ f(g gVar, int i) {
        this.f3571a = i;
        this.f3572b = gVar;
    }

    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        g gVar = this.f3572b;
        switch (this.f3571a) {
            case 0:
                J5.a aVar = (J5.a) obj;
                gVar.k();
                f fVar = new f(gVar, 1);
                if (aVar instanceof a.C0026a) {
                    fVar.invoke(((a.C0026a) aVar).f2145a);
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gVar.f3575V0.postValue((List) ((a.b) aVar).f2146a);
                    p pVar = p.f3034a;
                }
                return p.f3034a;
            default:
                J5.b bVar = (J5.b) obj;
                if (gVar.a(bVar)) {
                    gVar.f413E0 = gVar.f418J0;
                }
                if (!gVar.c(bVar)) {
                    gVar.d(bVar);
                }
                return p.f3034a;
        }
    }
}

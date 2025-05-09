package I7;

import J5.a;
import O9.p;
import ca.InterfaceC0646l;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1907a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f1908b;

    public /* synthetic */ f(g gVar, int i) {
        this.f1907a = i;
        this.f1908b = gVar;
    }

    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        g gVar = this.f1908b;
        switch (this.f1907a) {
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
                    gVar.f1912W0.postValue((List) ((a.b) aVar).f2146a);
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

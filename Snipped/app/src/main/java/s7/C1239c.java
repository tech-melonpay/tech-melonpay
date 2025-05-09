package s7;

import J5.a;
import O9.p;
import ca.InterfaceC0646l;
import kotlin.NoWhenBranchMatchedException;
import v5.C1545a;

/* compiled from: R8$$SyntheticClass */
/* renamed from: s7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1239c implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27050a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1240d f27051b;

    public /* synthetic */ C1239c(C1240d c1240d, int i) {
        this.f27050a = i;
        this.f27051b = c1240d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        C1240d c1240d = this.f27051b;
        switch (this.f27050a) {
            case 0:
                J5.a aVar = (J5.a) obj;
                c1240d.k();
                C1239c c1239c = new C1239c(c1240d, 1);
                if (aVar instanceof a.C0026a) {
                    c1239c.invoke(((a.C0026a) aVar).f2145a);
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c1240d.f27056X0.setValue(null);
                    p pVar = p.f3034a;
                }
                return p.f3034a;
            case 1:
                J5.b bVar = (J5.b) obj;
                if (c1240d.a(bVar)) {
                    c1240d.f413E0 = c1240d.f419K0;
                }
                if (!c1240d.c(bVar)) {
                    c1240d.d(bVar);
                }
                return p.f3034a;
            case 2:
                J5.a aVar2 = (J5.a) obj;
                c1240d.k();
                C1239c c1239c2 = new C1239c(c1240d, 3);
                if (aVar2 instanceof a.C0026a) {
                    c1239c2.invoke(((a.C0026a) aVar2).f2145a);
                } else {
                    if (!(aVar2 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c1240d.f27055W0.postValue(((C1545a) ((a.b) aVar2).f2146a).f30602b);
                    p pVar2 = p.f3034a;
                }
                return p.f3034a;
            default:
                J5.b bVar2 = (J5.b) obj;
                if (c1240d.a(bVar2)) {
                    c1240d.f413E0 = c1240d.f418J0;
                }
                if (!c1240d.c(bVar2)) {
                    c1240d.d(bVar2);
                }
                return p.f3034a;
        }
    }
}

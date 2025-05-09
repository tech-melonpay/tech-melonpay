package t7;

import J5.a;
import O9.p;
import ca.InterfaceC0646l;
import kotlin.NoWhenBranchMatchedException;
import v5.C1545a;

/* compiled from: R8$$SyntheticClass */
/* renamed from: t7.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1491e implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29925a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f29926b;

    public /* synthetic */ C1491e(f fVar, int i) {
        this.f29925a = i;
        this.f29926b = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        f fVar = this.f29926b;
        switch (this.f29925a) {
            case 0:
                J5.a aVar = (J5.a) obj;
                fVar.k();
                C1491e c1491e = new C1491e(fVar, 1);
                if (aVar instanceof a.C0026a) {
                    c1491e.invoke(((a.C0026a) aVar).f2145a);
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fVar.f29931X0.setValue(null);
                    p pVar = p.f3034a;
                }
                return p.f3034a;
            case 1:
                J5.b bVar = (J5.b) obj;
                if (fVar.a(bVar)) {
                    fVar.f413E0 = fVar.f419K0;
                }
                if (!fVar.c(bVar)) {
                    fVar.d(bVar);
                }
                return p.f3034a;
            case 2:
                J5.a aVar2 = (J5.a) obj;
                fVar.k();
                C1491e c1491e2 = new C1491e(fVar, 3);
                if (aVar2 instanceof a.C0026a) {
                    c1491e2.invoke(((a.C0026a) aVar2).f2145a);
                } else {
                    if (!(aVar2 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fVar.f29930W0.postValue(((C1545a) ((a.b) aVar2).f2146a).f30602b);
                    p pVar2 = p.f3034a;
                }
                return p.f3034a;
            default:
                J5.b bVar2 = (J5.b) obj;
                if (fVar.a(bVar2)) {
                    fVar.f413E0 = fVar.f418J0;
                }
                if (!fVar.c(bVar2)) {
                    fVar.d(bVar2);
                }
                return p.f3034a;
        }
    }
}

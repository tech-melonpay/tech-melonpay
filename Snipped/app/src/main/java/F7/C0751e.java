package f7;

import J5.a;
import O9.p;
import ca.InterfaceC0646l;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* renamed from: f7.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0751e implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20711a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f20712b;

    public /* synthetic */ C0751e(f fVar, int i) {
        this.f20711a = i;
        this.f20712b = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        f fVar = this.f20712b;
        switch (this.f20711a) {
            case 0:
                J5.a aVar = (J5.a) obj;
                fVar.k();
                C0751e c0751e = new C0751e(fVar, 1);
                if (aVar instanceof a.C0026a) {
                    c0751e.invoke(((a.C0026a) aVar).f2145a);
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fVar.f20715V0.setValue(null);
                    p pVar = p.f3034a;
                }
                return p.f3034a;
            default:
                J5.b bVar = (J5.b) obj;
                if (fVar.a(bVar)) {
                    fVar.f413E0 = fVar.f418J0;
                }
                fVar.d(bVar);
                return p.f3034a;
        }
    }
}

package S6;

import J5.a;
import O9.p;
import ca.InterfaceC0646l;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3389a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f3390b;

    public /* synthetic */ e(f fVar, int i) {
        this.f3389a = i;
        this.f3390b = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        f fVar = this.f3390b;
        switch (this.f3389a) {
            case 0:
                J5.a aVar = (J5.a) obj;
                fVar.k();
                e eVar = new e(fVar, 1);
                if (aVar instanceof a.C0026a) {
                    eVar.invoke(((a.C0026a) aVar).f2145a);
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fVar.f3393V0.setValue(null);
                    p pVar = p.f3034a;
                }
                return p.f3034a;
            default:
                J5.b bVar = (J5.b) obj;
                if (fVar.a(bVar)) {
                    fVar.f413E0 = fVar.f418J0;
                }
                if (!fVar.c(bVar)) {
                    fVar.d(bVar);
                }
                return p.f3034a;
        }
    }
}

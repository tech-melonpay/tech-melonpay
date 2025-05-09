package p7;

import J5.a;
import O9.p;
import ca.InterfaceC0646l;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* renamed from: p7.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1115f implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25704a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f25705b;

    public /* synthetic */ C1115f(g gVar, int i) {
        this.f25704a = i;
        this.f25705b = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        g gVar = this.f25705b;
        switch (this.f25704a) {
            case 0:
                J5.a aVar = (J5.a) obj;
                gVar.k();
                C1115f c1115f = new C1115f(gVar, 1);
                if (aVar instanceof a.C0026a) {
                    c1115f.invoke(((a.C0026a) aVar).f2145a);
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gVar.f25708V0.postValue((String) ((a.b) aVar).f2146a);
                    p pVar = p.f3034a;
                }
                return p.f3034a;
            default:
                J5.b bVar = (J5.b) obj;
                if (gVar.a(bVar)) {
                    gVar.f413E0 = gVar.f419K0;
                }
                if (!gVar.c(bVar)) {
                    gVar.d(bVar);
                }
                return p.f3034a;
        }
    }
}

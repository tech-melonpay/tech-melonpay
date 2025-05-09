package z6;

import J5.a;
import O9.p;
import ca.InterfaceC0646l;
import kotlin.NoWhenBranchMatchedException;
import s5.i;

/* compiled from: R8$$SyntheticClass */
/* renamed from: z6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1647b implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31328a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1648c f31329b;

    public /* synthetic */ C1647b(C1648c c1648c, int i) {
        this.f31328a = i;
        this.f31329b = c1648c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        C1648c c1648c = this.f31329b;
        switch (this.f31328a) {
            case 0:
                J5.a aVar = (J5.a) obj;
                c1648c.k();
                C1647b c1647b = new C1647b(c1648c, 1);
                if (aVar instanceof a.C0026a) {
                    c1647b.invoke(((a.C0026a) aVar).f2145a);
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c1648c.f31333W0.postValue((i) ((a.b) aVar).f2146a);
                    p pVar = p.f3034a;
                }
                return p.f3034a;
            default:
                J5.b bVar = (J5.b) obj;
                if (c1648c.a(bVar)) {
                    c1648c.f413E0 = c1648c.f418J0;
                }
                c1648c.d(bVar);
                c1648c.f31332V0.setValue(null);
                return p.f3034a;
        }
    }
}

package w7;

import J5.a;
import O9.p;
import ca.InterfaceC0646l;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import x5.C1590a;

/* compiled from: R8$$SyntheticClass */
/* renamed from: w7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1574a implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30843a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1575b f30844b;

    public /* synthetic */ C1574a(C1575b c1575b, int i) {
        this.f30843a = i;
        this.f30844b = c1575b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        C1575b c1575b = this.f30844b;
        switch (this.f30843a) {
            case 0:
                J5.a aVar = (J5.a) obj;
                c1575b.k();
                C1574a c1574a = new C1574a(c1575b, 2);
                if (aVar instanceof a.C0026a) {
                    c1574a.invoke(((a.C0026a) aVar).f2145a);
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c1575b.f30849X0.postValue((C1590a) ((a.b) aVar).f2146a);
                    p pVar = p.f3034a;
                }
                return p.f3034a;
            case 1:
                J5.a aVar2 = (J5.a) obj;
                c1575b.k();
                C1574a c1574a2 = new C1574a(c1575b, 3);
                if (aVar2 instanceof a.C0026a) {
                    c1574a2.invoke(((a.C0026a) aVar2).f2145a);
                } else {
                    if (!(aVar2 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c1575b.f30848W0.postValue((List) ((a.b) aVar2).f2146a);
                    p pVar2 = p.f3034a;
                }
                return p.f3034a;
            case 2:
                c1575b.d((J5.b) obj);
                return p.f3034a;
            default:
                c1575b.d((J5.b) obj);
                return p.f3034a;
        }
    }
}

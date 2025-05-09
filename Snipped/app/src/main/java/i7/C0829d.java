package i7;

import J5.a;
import O9.p;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* renamed from: i7.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0829d implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21496a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0830e f21497b;

    public /* synthetic */ C0829d(C0830e c0830e, int i) {
        this.f21496a = i;
        this.f21497b = c0830e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        C0830e c0830e = this.f21497b;
        switch (this.f21496a) {
            case 0:
                J5.a aVar = (J5.a) obj;
                c0830e.k();
                C0829d c0829d = new C0829d(c0830e, 4);
                if (aVar instanceof a.C0026a) {
                    c0829d.invoke(((a.C0026a) aVar).f2145a);
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c0830e.f21501W0.postValue((CryptoExchangeDomain) ((a.b) aVar).f2146a);
                    p pVar = p.f3034a;
                }
                return p.f3034a;
            case 1:
                J5.a aVar2 = (J5.a) obj;
                c0830e.k();
                C0829d c0829d2 = new C0829d(c0830e, 3);
                if (aVar2 instanceof a.C0026a) {
                    c0829d2.invoke(((a.C0026a) aVar2).f2145a);
                } else {
                    if (!(aVar2 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c0830e.f21502X0.setValue(null);
                    p pVar2 = p.f3034a;
                }
                return p.f3034a;
            case 2:
                J5.a aVar3 = (J5.a) obj;
                c0830e.k();
                C0829d c0829d3 = new C0829d(c0830e, 5);
                if (aVar3 instanceof a.C0026a) {
                    c0829d3.invoke(((a.C0026a) aVar3).f2145a);
                } else {
                    if (!(aVar3 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c0830e.f21501W0.postValue(((v5.b) ((a.b) aVar3).f2146a).f30603a);
                    p pVar3 = p.f3034a;
                }
                return p.f3034a;
            case 3:
                J5.b bVar = (J5.b) obj;
                if (c0830e.a(bVar)) {
                    c0830e.f413E0 = c0830e.f418J0;
                }
                if (!c0830e.c(bVar)) {
                    c0830e.d(bVar);
                }
                return p.f3034a;
            case 4:
                J5.b bVar2 = (J5.b) obj;
                if (c0830e.a(bVar2)) {
                    c0830e.f413E0 = c0830e.f419K0;
                }
                if (!c0830e.c(bVar2)) {
                    c0830e.d(bVar2);
                    c0830e.f426S0.postValue(bVar2);
                }
                return p.f3034a;
            default:
                J5.b bVar3 = (J5.b) obj;
                if (c0830e.a(bVar3)) {
                    c0830e.f413E0 = c0830e.f420L0;
                }
                if (!c0830e.c(bVar3)) {
                    c0830e.d(bVar3);
                    c0830e.f426S0.postValue(bVar3);
                }
                return p.f3034a;
        }
    }
}

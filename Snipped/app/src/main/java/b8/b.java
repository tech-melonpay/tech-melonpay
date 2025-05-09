package b8;

import J5.a;
import J5.b;
import O9.p;
import android.content.Context;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.payments.PaymentDomain;
import com.luminary.mobile.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8400a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f8401b;

    public /* synthetic */ b(h hVar, int i) {
        this.f8400a = i;
        this.f8401b = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        h hVar = this.f8401b;
        switch (this.f8400a) {
            case 0:
                J5.b bVar = (J5.b) obj;
                if (hVar.a(bVar)) {
                    hVar.f413E0 = hVar.f423P0;
                }
                hVar.f8477p1.postValue(bVar.b());
                return p.f3034a;
            case 1:
                J5.a aVar = (J5.a) obj;
                hVar.k();
                b bVar2 = new b(hVar, 7);
                aVar.getClass();
                if (aVar instanceof a.C0026a) {
                    bVar2.invoke(((a.C0026a) aVar).f2145a);
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hVar.f8476o1.postValue((PaymentDomain) ((a.b) aVar).f2146a);
                    p pVar = p.f3034a;
                }
                return p.f3034a;
            case 2:
                J5.a aVar2 = (J5.a) obj;
                aVar2.getClass();
                if (aVar2 instanceof a.C0026a) {
                    J5.b bVar3 = (J5.b) ((a.C0026a) aVar2).f2145a;
                    if (hVar.a(bVar3)) {
                        hVar.f413E0 = hVar.f418J0;
                    }
                    if (!hVar.c(bVar3)) {
                        hVar.d(bVar3);
                    }
                    p pVar2 = p.f3034a;
                } else {
                    if (!(aVar2 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hVar.f8472j1.postValue((s5.e) ((a.b) aVar2).f2146a);
                    p pVar3 = p.f3034a;
                }
                return p.f3034a;
            case 3:
                J5.a aVar3 = (J5.a) obj;
                hVar.k();
                b bVar4 = new b(hVar, 6);
                aVar3.getClass();
                if (aVar3 instanceof a.C0026a) {
                    bVar4.invoke(((a.C0026a) aVar3).f2145a);
                } else {
                    if (!(aVar3 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hVar.f8479r1.postValue(((H5.b) ((a.b) aVar3).f2146a).f1499d);
                    p pVar4 = p.f3034a;
                }
                return p.f3034a;
            case 4:
                J5.a aVar4 = (J5.a) obj;
                hVar.k();
                b bVar5 = new b(hVar, 8);
                aVar4.getClass();
                if (aVar4 instanceof a.C0026a) {
                    bVar5.invoke(((a.C0026a) aVar4).f2145a);
                } else {
                    if (!(aVar4 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hVar.f8476o1.postValue((PaymentDomain) ((a.b) aVar4).f2146a);
                    p pVar5 = p.f3034a;
                }
                return p.f3034a;
            case 5:
                J5.a aVar5 = (J5.a) obj;
                hVar.k();
                b bVar6 = new b(hVar, 9);
                aVar5.getClass();
                if (aVar5 instanceof a.C0026a) {
                    bVar6.invoke(((a.C0026a) aVar5).f2145a);
                } else {
                    if (!(aVar5 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hVar.f8476o1.postValue((PaymentDomain) ((a.b) aVar5).f2146a);
                    p pVar6 = p.f3034a;
                }
                return p.f3034a;
            case 6:
                J5.b bVar7 = (J5.b) obj;
                if (hVar.a(bVar7)) {
                    hVar.f413E0 = hVar.f8484w1;
                }
                if (!hVar.c(bVar7)) {
                    if ((bVar7 instanceof b.C0027b) && ((b.C0027b) bVar7).f2149a == 404) {
                        hVar.f8480s1.setValue(null);
                    } else {
                        hVar.d(bVar7);
                    }
                }
                return p.f3034a;
            case 7:
                J5.b bVar8 = (J5.b) obj;
                if (bVar8.b().length() > 0) {
                    if (hVar.a(bVar8)) {
                        hVar.f413E0 = hVar.f420L0;
                    }
                    if (!hVar.c(bVar8)) {
                        hVar.d(bVar8);
                    }
                } else {
                    hVar.d(new b.c(((Context) hVar.f8481t1.getValue()).getString(R.string.you_do_not_have_enough_funds)));
                }
                return p.f3034a;
            case 8:
                J5.b bVar9 = (J5.b) obj;
                if (hVar.a(bVar9)) {
                    hVar.f413E0 = hVar.f424Q0;
                }
                if (!hVar.c(bVar9)) {
                    hVar.d(bVar9);
                }
                return p.f3034a;
            case 9:
                J5.b bVar10 = (J5.b) obj;
                if (bVar10.b().length() > 0) {
                    if (hVar.a(bVar10)) {
                        hVar.f413E0 = hVar.f421M0;
                    }
                    if (!hVar.c(bVar10)) {
                        hVar.d(bVar10);
                    }
                } else {
                    hVar.d(new b.c(((Context) hVar.f8481t1.getValue()).getString(R.string.you_do_not_have_enough_funds)));
                }
                return p.f3034a;
            case 10:
                J5.b bVar11 = (J5.b) obj;
                if (hVar.a(bVar11)) {
                    hVar.f413E0 = hVar.f8482u1;
                }
                if (!hVar.c(bVar11)) {
                    hVar.d(bVar11);
                }
                return p.f3034a;
            case 11:
                J5.a aVar6 = (J5.a) obj;
                aVar6.getClass();
                if (aVar6 instanceof a.C0026a) {
                    J5.b bVar12 = (J5.b) ((a.C0026a) aVar6).f2145a;
                    if (hVar.a(bVar12)) {
                        hVar.f413E0 = hVar.f419K0;
                    }
                    if (!hVar.c(bVar12)) {
                        hVar.d(bVar12);
                    }
                    p pVar7 = p.f3034a;
                } else {
                    if (!(aVar6 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hVar.n1.postValue((B5.a) ((a.b) aVar6).f2146a);
                    p pVar8 = p.f3034a;
                }
                return p.f3034a;
            case 12:
                J5.b bVar13 = (J5.b) obj;
                if (hVar.a(bVar13)) {
                    hVar.f413E0 = hVar.f8483v1;
                }
                if (!hVar.c(bVar13)) {
                    hVar.d(bVar13);
                }
                return p.f3034a;
            default:
                J5.a aVar7 = (J5.a) obj;
                hVar.k();
                b bVar14 = new b(hVar, 0);
                aVar7.getClass();
                if (aVar7 instanceof a.C0026a) {
                    bVar14.invoke(((a.C0026a) aVar7).f2145a);
                } else {
                    if (!(aVar7 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hVar.f8475m1.postValue((B5.c) ((a.b) aVar7).f2146a);
                    p pVar9 = p.f3034a;
                }
                return p.f3034a;
        }
    }
}

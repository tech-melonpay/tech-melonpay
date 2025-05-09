package t8;

import J5.a;
import O9.p;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29951a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f29952b;

    public /* synthetic */ h(j jVar, int i) {
        this.f29951a = i;
        this.f29952b = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        String str;
        j jVar = this.f29952b;
        switch (this.f29951a) {
            case 0:
                J5.a aVar = (J5.a) obj;
                jVar.k();
                h hVar = new h(jVar, 6);
                if (aVar instanceof a.C0026a) {
                    hVar.invoke(((a.C0026a) aVar).f2145a);
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jVar.f29967d1.postValue((String) ((a.b) aVar).f2146a);
                    p pVar = p.f3034a;
                }
                return p.f3034a;
            case 1:
                J5.b bVar = (J5.b) obj;
                if (jVar.a(bVar)) {
                    jVar.f413E0 = jVar.f418J0;
                }
                if (!jVar.c(bVar)) {
                    jVar.f29964a1.postValue(null);
                }
                return p.f3034a;
            case 2:
                J5.a aVar2 = (J5.a) obj;
                jVar.k();
                h hVar2 = new h(jVar, 5);
                if (aVar2 instanceof a.C0026a) {
                    hVar2.invoke(((a.C0026a) aVar2).f2145a);
                } else {
                    if (!(aVar2 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jVar.f29967d1.postValue((String) ((a.b) aVar2).f2146a);
                    p pVar2 = p.f3034a;
                }
                return p.f3034a;
            case 3:
                J5.a aVar3 = (J5.a) obj;
                jVar.k();
                h hVar3 = new h(jVar, 4);
                if (aVar3 instanceof a.C0026a) {
                    hVar3.invoke(((a.C0026a) aVar3).f2145a);
                } else {
                    if (!(aVar3 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jVar.f29968e1.postValue((CryptoExchangeDomain) ((a.b) aVar3).f2146a);
                    p pVar3 = p.f3034a;
                }
                return p.f3034a;
            case 4:
                J5.b bVar2 = (J5.b) obj;
                if (jVar.a(bVar2)) {
                    jVar.f413E0 = jVar.f422O0;
                }
                if (!jVar.c(bVar2)) {
                    jVar.d(bVar2);
                }
                return p.f3034a;
            case 5:
                J5.b bVar3 = (J5.b) obj;
                if (jVar.a(bVar3)) {
                    jVar.f413E0 = jVar.f421M0;
                }
                if (!jVar.c(bVar3)) {
                    jVar.d(bVar3);
                }
                return p.f3034a;
            case 6:
                J5.b bVar4 = (J5.b) obj;
                if (jVar.a(bVar4)) {
                    jVar.f413E0 = jVar.f423P0;
                }
                if (!jVar.c(bVar4)) {
                    jVar.d(bVar4);
                }
                return p.f3034a;
            case 7:
                J5.a aVar4 = (J5.a) obj;
                jVar.k();
                aVar4.getClass();
                if (aVar4 instanceof a.C0026a) {
                    J5.b bVar5 = (J5.b) ((a.C0026a) aVar4).f2145a;
                    if (jVar.a(bVar5)) {
                        jVar.f413E0 = jVar.f419K0;
                    }
                    if (!jVar.c(bVar5)) {
                        jVar.d(bVar5);
                    }
                    p pVar4 = p.f3034a;
                } else {
                    if (!(aVar4 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    F5.b value = jVar.f29964a1.getValue();
                    if (value != null && (str = value.f1188a) != null) {
                        A7.c cVar = new A7.c(23, jVar, str);
                        jVar.f418J0 = cVar;
                        cVar.invoke();
                        p pVar5 = p.f3034a;
                    }
                    p pVar6 = p.f3034a;
                }
                return p.f3034a;
            case 8:
                J5.a aVar5 = (J5.a) obj;
                jVar.k();
                h hVar4 = new h(jVar, 1);
                if (aVar5 instanceof a.C0026a) {
                    hVar4.invoke(((a.C0026a) aVar5).f2145a);
                } else {
                    if (!(aVar5 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jVar.f29964a1.postValue((F5.b) ((a.b) aVar5).f2146a);
                    p pVar7 = p.f3034a;
                }
                return p.f3034a;
            default:
                J5.b bVar6 = (J5.b) obj;
                if (jVar.a(bVar6)) {
                    jVar.f413E0 = jVar.f420L0;
                }
                if (!jVar.c(bVar6)) {
                    jVar.d(bVar6);
                }
                return p.f3034a;
        }
    }
}

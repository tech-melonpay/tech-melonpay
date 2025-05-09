package q7;

import J5.a;
import O9.p;
import P9.s;
import androidx.lifecycle.C0559z;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25909a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f25910b;

    public /* synthetic */ k(n nVar, int i) {
        this.f25909a = i;
        this.f25910b = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        HashMap<String, Double> hashMap;
        n nVar = this.f25910b;
        switch (this.f25909a) {
            case 0:
                J5.b bVar = (J5.b) obj;
                if (nVar.a(bVar)) {
                    nVar.f413E0 = nVar.f419K0;
                }
                if (!nVar.c(bVar)) {
                    nVar.d(bVar);
                }
                return p.f3034a;
            case 1:
                J5.b bVar2 = (J5.b) obj;
                if (nVar.a(bVar2)) {
                    nVar.f413E0 = nVar.f421M0;
                }
                if (!nVar.c(bVar2)) {
                    nVar.d(bVar2);
                }
                return p.f3034a;
            case 2:
                v5.j jVar = (v5.j) obj;
                nVar.f25926b1.put(jVar.f30651a, jVar);
                C0559z<List<CryptoExchangeDomain>> c0559z = nVar.f25924Z0;
                List<CryptoExchangeDomain> value = c0559z.getValue();
                if (value != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : value) {
                        CryptoExchangeDomain cryptoExchangeDomain = (CryptoExchangeDomain) obj2;
                        if (cryptoExchangeDomain.f() && cryptoExchangeDomain.f11030o == null) {
                            arrayList.add(obj2);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        CryptoExchangeDomain cryptoExchangeDomain2 = (CryptoExchangeDomain) it.next();
                        v5.j jVar2 = nVar.f25926b1.get(cryptoExchangeDomain2.f11027l);
                        Double d10 = (jVar2 == null || (hashMap = jVar2.f30652b) == null) ? null : hashMap.get(cryptoExchangeDomain2.f11028m);
                        Double d11 = cryptoExchangeDomain2.f11029n;
                        if (d11 != null) {
                            cryptoExchangeDomain2.f11030o = d10 != null ? Double.valueOf(d10.doubleValue() * d11.doubleValue()) : null;
                        }
                    }
                }
                c0559z.postValue(c0559z.getValue());
                return p.f3034a;
            case 3:
                J5.b bVar3 = (J5.b) obj;
                if (nVar.a(bVar3)) {
                    nVar.f413E0 = nVar.N0;
                }
                if (!nVar.c(bVar3)) {
                    nVar.d(bVar3);
                }
                return p.f3034a;
            case 4:
                J5.a aVar = (J5.a) obj;
                nVar.k();
                nVar.f25925a1.setValue(null);
                k kVar = new k(nVar, 0);
                if (aVar instanceof a.C0026a) {
                    kVar.invoke(((a.C0026a) aVar).f2145a);
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nVar.f25923Y0.postValue((List) ((a.b) aVar).f2146a);
                    p pVar = p.f3034a;
                }
                return p.f3034a;
            case 5:
                J5.a aVar2 = (J5.a) obj;
                nVar.k();
                nVar.f25925a1.setValue(null);
                aVar2.getClass();
                if (aVar2 instanceof a.C0026a) {
                    J5.b bVar4 = (J5.b) ((a.C0026a) aVar2).f2145a;
                    if (nVar.a(bVar4)) {
                        nVar.f413E0 = nVar.f420L0;
                    }
                    if (!nVar.c(bVar4)) {
                        nVar.d(bVar4);
                    }
                    p pVar2 = p.f3034a;
                } else {
                    if (!(aVar2 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List list = (List) ((a.b) aVar2).f2146a;
                    nVar.k();
                    boolean isEmpty = list.isEmpty();
                    C0559z<List<CryptoExchangeDomain>> c0559z2 = nVar.f25924Z0;
                    ArrayList<CryptoExchangeDomain> arrayList2 = nVar.f25928d1;
                    if (isEmpty && nVar.f25927c1 == 1) {
                        arrayList2.addAll(list);
                        c0559z2.postValue(s.F(arrayList2));
                    } else if (!list.isEmpty()) {
                        nVar.f25927c1++;
                        arrayList2.addAll(list);
                        c0559z2.postValue(s.F(arrayList2));
                    }
                    p pVar3 = p.f3034a;
                }
                return p.f3034a;
            default:
                J5.a aVar3 = (J5.a) obj;
                k kVar2 = new k(nVar, 2);
                aVar3.getClass();
                if (aVar3 instanceof a.C0026a) {
                    J5.b bVar5 = (J5.b) ((a.C0026a) aVar3).f2145a;
                    if (nVar.a(bVar5)) {
                        nVar.f413E0 = nVar.f418J0;
                    }
                    if (!nVar.c(bVar5)) {
                        nVar.d(bVar5);
                    }
                    p pVar4 = p.f3034a;
                } else {
                    if (!(aVar3 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kVar2.invoke(((a.b) aVar3).f2146a);
                }
                return p.f3034a;
        }
    }
}

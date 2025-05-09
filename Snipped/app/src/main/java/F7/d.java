package F7;

import B6.i;
import F8.k;
import J5.a;
import O9.p;
import P9.s;
import ca.InterfaceC0646l;
import com.luminary.business.presentation.entity.transaction.TransactionUI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import t8.h;
import t8.j;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1253a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1254b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f1255c;

    public /* synthetic */ d(i iVar, boolean z10, int i) {
        this.f1253a = i;
        this.f1255c = iVar;
        this.f1254b = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        boolean z10 = this.f1254b;
        i iVar = this.f1255c;
        switch (this.f1253a) {
            case 0:
                J5.a aVar = (J5.a) obj;
                e eVar = (e) iVar;
                eVar.k();
                d dVar = new d(z10, eVar);
                aVar.getClass();
                if (aVar instanceof a.C0026a) {
                    J5.b bVar = (J5.b) ((a.C0026a) aVar).f2145a;
                    if (eVar.a(bVar)) {
                        eVar.f413E0 = eVar.f418J0;
                    }
                    if (!eVar.c(bVar)) {
                        eVar.d(bVar);
                    }
                    p pVar = p.f3034a;
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar.invoke(((a.b) aVar).f2146a);
                }
                return p.f3034a;
            case 1:
                ArrayList b9 = k.b((List) obj);
                ArrayList arrayList = new ArrayList();
                Iterator it = b9.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (true ^ D9.b.a0((TransactionUI) next)) {
                        arrayList.add(next);
                    }
                }
                e eVar2 = (e) iVar;
                if (z10) {
                    if (arrayList.isEmpty() && eVar2.f1262Z0 == 1) {
                        ArrayList<TransactionUI> arrayList2 = eVar2.f1260X0;
                        arrayList2.addAll(arrayList);
                        eVar2.f1258V0.postValue(s.F(arrayList2));
                    } else if (!arrayList.isEmpty()) {
                        eVar2.f1262Z0++;
                        ArrayList<TransactionUI> arrayList3 = eVar2.f1260X0;
                        arrayList3.addAll(arrayList);
                        eVar2.f1258V0.postValue(s.F(arrayList3));
                    }
                } else if (arrayList.isEmpty() && eVar2.f1263a1 == 1) {
                    ArrayList<TransactionUI> arrayList4 = eVar2.f1261Y0;
                    arrayList4.addAll(arrayList);
                    eVar2.f1259W0.postValue(s.F(arrayList4));
                } else if (!arrayList.isEmpty()) {
                    eVar2.f1263a1++;
                    ArrayList<TransactionUI> arrayList5 = eVar2.f1261Y0;
                    arrayList5.addAll(arrayList);
                    eVar2.f1259W0.postValue(s.F(arrayList5));
                }
                return p.f3034a;
            default:
                J5.a aVar2 = (J5.a) obj;
                j jVar = (j) iVar;
                jVar.k();
                h hVar = new h(jVar, 9);
                if (aVar2 instanceof a.C0026a) {
                    hVar.invoke(((a.C0026a) aVar2).f2145a);
                } else {
                    if (!(aVar2 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String str = (String) ((a.b) aVar2).f2146a;
                    if (z10) {
                        jVar.f29966c1.postValue(str);
                    } else {
                        jVar.f29965b1.postValue(str);
                    }
                    p pVar2 = p.f3034a;
                }
                return p.f3034a;
        }
    }

    public /* synthetic */ d(boolean z10, e eVar) {
        this.f1253a = 1;
        this.f1254b = z10;
        this.f1255c = eVar;
    }
}

package m7;

import J5.a;
import J5.b;
import O9.p;
import androidx.lifecycle.C0559z;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import v5.C1545a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23994a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f23995b;

    public /* synthetic */ i(k kVar, int i) {
        this.f23994a = i;
        this.f23995b = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        k kVar = this.f23995b;
        switch (this.f23994a) {
            case 0:
                J5.a aVar = (J5.a) obj;
                aVar.getClass();
                if (aVar instanceof a.C0026a) {
                    J5.b bVar = (J5.b) ((a.C0026a) aVar).f2145a;
                    if (kVar.a(bVar)) {
                        kVar.f413E0 = kVar.f418J0;
                    }
                    if (!kVar.c(bVar)) {
                        kVar.d(bVar);
                    }
                    p pVar = p.f3034a;
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kVar.f24006b1.postValue((C1545a) ((a.b) aVar).f2146a);
                    p pVar2 = p.f3034a;
                }
                return p.f3034a;
            case 1:
                J5.a aVar2 = (J5.a) obj;
                kVar.k();
                i iVar = new i(kVar, 2);
                if (aVar2 instanceof a.C0026a) {
                    iVar.invoke(((a.C0026a) aVar2).f2145a);
                } else {
                    if (!(aVar2 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kVar.f24008d1.postValue((List) ((a.b) aVar2).f2146a);
                    p pVar3 = p.f3034a;
                }
                return p.f3034a;
            case 2:
                J5.b bVar2 = (J5.b) obj;
                if (kVar.a(bVar2)) {
                    kVar.f413E0 = kVar.f422O0;
                }
                if (!kVar.c(bVar2)) {
                    kVar.d(bVar2);
                }
                return p.f3034a;
            case 3:
                J5.a aVar3 = (J5.a) obj;
                i iVar2 = new i(kVar, 6);
                aVar3.getClass();
                if (aVar3 instanceof a.C0026a) {
                    iVar2.invoke(((a.C0026a) aVar3).f2145a);
                } else {
                    if (!(aVar3 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CryptoExchangeDomain cryptoExchangeDomain = (CryptoExchangeDomain) ((a.b) aVar3).f2146a;
                    kVar.f24010f1.postValue(new Pair<>(Boolean.FALSE, null));
                    kVar.f24005a1.postValue(cryptoExchangeDomain);
                    p pVar4 = p.f3034a;
                }
                return p.f3034a;
            case 4:
                J5.a aVar4 = (J5.a) obj;
                i iVar3 = new i(kVar, 5);
                aVar4.getClass();
                if (aVar4 instanceof a.C0026a) {
                    iVar3.invoke(((a.C0026a) aVar4).f2145a);
                } else {
                    if (!(aVar4 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    v5.h hVar = (v5.h) ((a.b) aVar4).f2146a;
                    kVar.f24010f1.postValue(new Pair<>(Boolean.FALSE, null));
                    kVar.f24009e1.postValue(hVar);
                    p pVar5 = p.f3034a;
                }
                return p.f3034a;
            case 5:
                J5.b bVar3 = (J5.b) obj;
                if (kVar.a(bVar3)) {
                    kVar.f413E0 = kVar.f421M0;
                }
                b.a aVar5 = bVar3 instanceof b.a ? (b.a) bVar3 : null;
                C0559z<Pair<Boolean, b.a>> c0559z = kVar.f24010f1;
                if (aVar5 != null) {
                    c0559z.postValue(new Pair<>(Boolean.TRUE, aVar5));
                } else if (bVar3 instanceof b.C0027b) {
                    kVar.f24011g1.postValue(((b.C0027b) bVar3).f2150b.c());
                } else {
                    if (!kVar.c(bVar3)) {
                        kVar.d(bVar3);
                    }
                    c0559z.postValue(new Pair<>(Boolean.FALSE, null));
                }
                return p.f3034a;
            case 6:
                J5.b bVar4 = (J5.b) obj;
                if (kVar.a(bVar4)) {
                    kVar.f413E0 = kVar.f420L0;
                }
                b.a aVar6 = bVar4 instanceof b.a ? (b.a) bVar4 : null;
                C0559z<Pair<Boolean, b.a>> c0559z2 = kVar.f24010f1;
                if (aVar6 != null) {
                    c0559z2.postValue(new Pair<>(Boolean.TRUE, aVar6));
                } else if (bVar4 instanceof b.C0027b) {
                    kVar.f24011g1.postValue(((b.C0027b) bVar4).f2150b.c());
                } else {
                    if (!kVar.c(bVar4)) {
                        kVar.d(bVar4);
                    }
                    c0559z2.postValue(new Pair<>(Boolean.FALSE, null));
                }
                return p.f3034a;
            default:
                J5.a aVar7 = (J5.a) obj;
                aVar7.getClass();
                if (aVar7 instanceof a.C0026a) {
                    J5.b bVar5 = (J5.b) ((a.C0026a) aVar7).f2145a;
                    if (kVar.a(bVar5)) {
                        kVar.f413E0 = kVar.f419K0;
                    }
                    if (!kVar.c(bVar5)) {
                        kVar.d(bVar5);
                    }
                    p pVar6 = p.f3034a;
                } else {
                    if (!(aVar7 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kVar.f24007c1.postValue((List) ((a.b) aVar7).f2146a);
                    p pVar7 = p.f3034a;
                }
                return p.f3034a;
        }
    }
}

package u7;

import J5.a;
import O9.p;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30337a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f30338b;

    public /* synthetic */ e(f fVar, int i) {
        this.f30337a = i;
        this.f30338b = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        f fVar = this.f30338b;
        switch (this.f30337a) {
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
                    fVar.f30341V0.postValue((CryptoExchangeDomain) ((a.b) aVar).f2146a);
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

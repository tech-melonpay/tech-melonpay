package W6;

import J5.a;
import O9.p;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.account.CardsDomain;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3851a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f3852b;

    public /* synthetic */ k(m mVar, int i) {
        this.f3851a = i;
        this.f3852b = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        m mVar = this.f3852b;
        switch (this.f3851a) {
            case 0:
                J5.b bVar = (J5.b) obj;
                if (mVar.a(bVar)) {
                    mVar.f413E0 = mVar.f419K0;
                }
                if (!mVar.c(bVar)) {
                    mVar.d(bVar);
                }
                return p.f3034a;
            case 1:
                J5.b bVar2 = (J5.b) obj;
                if (mVar.a(bVar2)) {
                    mVar.f413E0 = mVar.f420L0;
                }
                if (!mVar.c(bVar2)) {
                    mVar.d(bVar2);
                }
                return p.f3034a;
            case 2:
                J5.b bVar3 = (J5.b) obj;
                if (mVar.a(bVar3)) {
                    mVar.f413E0 = mVar.f418J0;
                }
                if (!mVar.c(bVar3)) {
                    mVar.d(bVar3);
                }
                return p.f3034a;
            case 3:
                J5.a aVar = (J5.a) obj;
                aVar.getClass();
                if (aVar instanceof a.C0026a) {
                    J5.b bVar4 = (J5.b) ((a.C0026a) aVar).f2145a;
                    if (mVar.a(bVar4)) {
                        mVar.f413E0 = mVar.f421M0;
                    }
                    if (!mVar.c(bVar4)) {
                        mVar.d(bVar4);
                    }
                    p pVar = p.f3034a;
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mVar.f3866d1.postValue((CardsDomain) ((a.b) aVar).f2146a);
                    p pVar2 = p.f3034a;
                }
                return p.f3034a;
            case 4:
                J5.a aVar2 = (J5.a) obj;
                mVar.k();
                k kVar = new k(mVar, 6);
                if (aVar2 instanceof a.C0026a) {
                    kVar.invoke(((a.C0026a) aVar2).f2145a);
                } else {
                    if (!(aVar2 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mVar.f3865c1.postValue((z5.c) ((a.b) aVar2).f2146a);
                    p pVar3 = p.f3034a;
                }
                return p.f3034a;
            case 5:
                J5.a aVar3 = (J5.a) obj;
                mVar.k();
                k kVar2 = new k(mVar, 0);
                if (aVar3 instanceof a.C0026a) {
                    kVar2.invoke(((a.C0026a) aVar3).f2145a);
                } else {
                    if (!(aVar3 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mVar.f3864b1.postValue((CardsDomain) ((a.b) aVar3).f2146a);
                    p pVar4 = p.f3034a;
                }
                return p.f3034a;
            case 6:
                J5.b bVar5 = (J5.b) obj;
                if (mVar.a(bVar5)) {
                    mVar.f413E0 = mVar.f421M0;
                }
                if (!mVar.c(bVar5)) {
                    mVar.d(bVar5);
                }
                return p.f3034a;
            case 7:
                J5.a aVar4 = (J5.a) obj;
                mVar.k();
                k kVar3 = new k(mVar, 2);
                if (aVar4 instanceof a.C0026a) {
                    kVar3.invoke(((a.C0026a) aVar4).f2145a);
                } else {
                    if (!(aVar4 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mVar.f3863a1.postValue((List) ((a.b) aVar4).f2146a);
                    p pVar5 = p.f3034a;
                }
                return p.f3034a;
            default:
                J5.a aVar5 = (J5.a) obj;
                mVar.k();
                k kVar4 = new k(mVar, 1);
                if (aVar5 instanceof a.C0026a) {
                    kVar4.invoke(((a.C0026a) aVar5).f2145a);
                } else {
                    if (!(aVar5 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mVar.f3864b1.postValue((CardsDomain) ((a.b) aVar5).f2146a);
                    p pVar6 = p.f3034a;
                }
                return p.f3034a;
        }
    }
}

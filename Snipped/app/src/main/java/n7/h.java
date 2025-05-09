package n7;

import J5.a;
import O9.p;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.cryptowallet.CryptowalletDomain;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24268a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f24269b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f24270c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f24271d;

    public /* synthetic */ h(k kVar, String str, String str2, int i) {
        this.f24268a = i;
        this.f24269b = kVar;
        this.f24270c = str;
        this.f24271d = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        String str = this.f24271d;
        String str2 = this.f24270c;
        k kVar = this.f24269b;
        J5.a aVar = (J5.a) obj;
        switch (this.f24268a) {
            case 0:
                kVar.k();
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
                    List<CryptowalletDomain> list = (List) ((a.b) aVar).f2146a;
                    if (str2.length() > 0) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            CryptowalletDomain cryptowalletDomain = (CryptowalletDomain) obj2;
                            if (kotlin.jvm.internal.f.b(cryptowalletDomain.f11078g, str2) && kotlin.jvm.internal.f.b(cryptowalletDomain.f11077f, str)) {
                                arrayList.add(obj2);
                            }
                        }
                        list = arrayList;
                    }
                    kVar.f24281Y0.postValue(list);
                    p pVar2 = p.f3034a;
                }
                return p.f3034a;
            default:
                kVar.k();
                if (aVar instanceof a.C0026a) {
                    J5.b bVar2 = (J5.b) ((a.C0026a) aVar).f2145a;
                    if (kVar.a(bVar2)) {
                        kVar.f413E0 = kVar.f420L0;
                    }
                    if (!kVar.c(bVar2)) {
                        kVar.d(bVar2);
                    }
                    p pVar3 = p.f3034a;
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kVar.f24284b1.setValue(null);
                    D7.e eVar = new D7.e(str2, str, 6, kVar);
                    kVar.f418J0 = eVar;
                    eVar.invoke();
                    p pVar4 = p.f3034a;
                }
                return p.f3034a;
        }
    }
}

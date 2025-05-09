package b8;

import J5.a;
import O9.p;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.payments.PaymentDomain;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8402a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f8403b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f8404c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f8405d;

    public /* synthetic */ c(h hVar, String str, String str2, int i) {
        this.f8402a = i;
        this.f8403b = hVar;
        this.f8404c = str;
        this.f8405d = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        String str;
        String str2 = this.f8405d;
        String str3 = this.f8404c;
        h hVar = this.f8403b;
        switch (this.f8402a) {
            case 0:
                J5.a aVar = (J5.a) obj;
                hVar.k();
                aVar.getClass();
                if (aVar instanceof a.C0026a) {
                    J5.b bVar = (J5.b) ((a.C0026a) aVar).f2145a;
                    if (hVar.a(bVar)) {
                        hVar.f413E0 = hVar.N0;
                    }
                    if (!hVar.c(bVar)) {
                        hVar.d(bVar);
                    }
                    p pVar = p.f3034a;
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    PaymentDomain paymentDomain = (PaymentDomain) ((a.b) aVar).f2146a;
                    if (str3 == null || str3.length() == 0 || str2 == null || str2.length() == 0) {
                        hVar.f8476o1.postValue(paymentDomain);
                    } else {
                        String str4 = paymentDomain.f11104a;
                        hVar.o(str3, str2, str4 != null ? str4 : "", paymentDomain);
                    }
                    p pVar2 = p.f3034a;
                }
                return p.f3034a;
            case 1:
                hVar.k();
                ((J5.a) obj).a(new b(hVar, 10), new c(str3, str2, hVar));
                return p.f3034a;
            default:
                PaymentDomain paymentDomain2 = (PaymentDomain) obj;
                String str5 = this.f8404c;
                h hVar2 = this.f8403b;
                if (str5 == null || str5.length() == 0 || (str = this.f8405d) == null || str.length() == 0) {
                    hVar2.f8476o1.postValue(paymentDomain2);
                } else {
                    String str6 = paymentDomain2.f11104a;
                    String str7 = str6 == null ? "" : str6;
                    hVar2.getClass();
                    E6.c cVar = new E6.c(hVar2, str7, str5, str, paymentDomain2, 4);
                    hVar2.f8483v1 = cVar;
                    cVar.invoke();
                }
                return p.f3034a;
        }
    }

    public /* synthetic */ c(String str, String str2, h hVar) {
        this.f8402a = 2;
        this.f8404c = str;
        this.f8405d = str2;
        this.f8403b = hVar;
    }
}

package q7;

import O9.p;
import P9.s;
import ca.InterfaceC0635a;
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class j implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25907a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f25908b;

    public /* synthetic */ j(n nVar, int i) {
        this.f25907a = i;
        this.f25908b = nVar;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        switch (this.f25907a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                n nVar = this.f25908b;
                List<CryptoExchangeDomain> value = nVar.f25924Z0.getValue();
                if (value != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : value) {
                        CryptoExchangeDomain cryptoExchangeDomain = (CryptoExchangeDomain) obj;
                        if (cryptoExchangeDomain.f() && cryptoExchangeDomain.f11030o == null) {
                            arrayList2.add(obj);
                        }
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        String str = ((CryptoExchangeDomain) it.next()).f11027l;
                        if (str != null) {
                            arrayList.add(str.toUpperCase(Locale.ROOT));
                        }
                    }
                }
                for (String str2 : s.F(arrayList)) {
                    nVar.f25922X0.a(new k(nVar, 6), str2);
                }
                break;
            default:
                n nVar2 = this.f25908b;
                nVar2.l();
                Integer valueOf = Integer.valueOf(nVar2.f25918T0.h());
                nVar2.f25919U0.a(new k(nVar2, 4), valueOf);
                break;
        }
        return p.f3034a;
    }
}

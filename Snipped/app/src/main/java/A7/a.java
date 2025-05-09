package A7;

import O9.p;
import P9.m;
import android.util.Log;
import ca.InterfaceC0635a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f102a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f103b;

    public /* synthetic */ a(e eVar, int i) {
        this.f102a = i;
        this.f103b = eVar;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        switch (this.f102a) {
            case 0:
                Log.e("TAG", "accounts:   ");
                e eVar = this.f103b;
                eVar.l();
                eVar.f110T0.a(new b(eVar, 4), String.valueOf(eVar.f113W0.h()));
                break;
            case 1:
                e eVar2 = this.f103b;
                eVar2.l();
                Log.e("TAG", "wallets:   ");
                eVar2.f114X0.a(new b(eVar2, 5), Integer.valueOf(eVar2.f113W0.h()));
                break;
            case 2:
                Log.e("TAG", "fee:   ");
                e eVar3 = this.f103b;
                eVar3.l();
                eVar3.f116Z0.a(new b(eVar3, 2), Integer.valueOf(eVar3.f113W0.h()));
                break;
            case 3:
                Log.e("TAG", "exchanges:   ");
                e eVar4 = this.f103b;
                if (!eVar4.f128l1) {
                    eVar4.l();
                    eVar4.f115Y0.a(new b(eVar4, 7), new v5.e(eVar4.f113W0.h(), null, null, eVar4.f127k1, m.n("FIAT-CRYPTO", "CRYPTO-CRYPTO", "CRYPTO-FIAT"), null));
                }
                break;
            default:
                Log.e("TAG", "transactions:   ");
                e eVar5 = this.f103b;
                eVar5.getClass();
                eVar5.l();
                u5.d u6 = eVar5.f113W0.u();
                eVar5.f111U0.a(new b(eVar5, 6), new H5.a(String.valueOf(u6 != null ? u6.f30237a : null), null, eVar5.f126j1, null, null, null, null, null, null, null, 20, 1016));
                break;
        }
        return p.f3034a;
    }
}

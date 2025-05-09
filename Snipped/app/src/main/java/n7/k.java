package n7;

import O9.p;
import androidx.lifecycle.C0559z;
import ca.InterfaceC0635a;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import com.luminary.business.domain.entity.cryptowallet.CryptowalletDomain;
import d6.C0689c;
import e6.C0718b;
import f6.C0746a;
import java.util.List;
import v5.C1545a;

/* compiled from: CryptoListViewModel.kt */
/* loaded from: classes2.dex */
public final class k extends B6.i {

    /* renamed from: T0, reason: collision with root package name */
    public final K5.a f24276T0;

    /* renamed from: U0, reason: collision with root package name */
    public final e6.k f24277U0;

    /* renamed from: V0, reason: collision with root package name */
    public final C0746a f24278V0;

    /* renamed from: W0, reason: collision with root package name */
    public final C0718b f24279W0;

    /* renamed from: X0, reason: collision with root package name */
    public final C0689c f24280X0;

    /* renamed from: Y0, reason: collision with root package name */
    public final C0559z<List<CryptowalletDomain>> f24281Y0 = new C0559z<>();

    /* renamed from: Z0, reason: collision with root package name */
    public final C0559z<List<CryptoAccountDomain>> f24282Z0 = new C0559z<>();

    /* renamed from: a1, reason: collision with root package name */
    public final C0559z<C1545a> f24283a1 = new C0559z<>();

    /* renamed from: b1, reason: collision with root package name */
    public final J8.d<p> f24284b1 = new J8.d<>();

    public k(K5.a aVar, e6.k kVar, C0746a c0746a, C0718b c0718b, C0689c c0689c) {
        this.f24276T0 = aVar;
        this.f24277U0 = kVar;
        this.f24278V0 = c0746a;
        this.f24279W0 = c0718b;
        this.f24280X0 = c0689c;
        final int i = 1;
        InterfaceC0635a<p> interfaceC0635a = new InterfaceC0635a(this) { // from class: n7.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f24273b;

            {
                this.f24273b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i) {
                    case 0:
                        k kVar2 = this.f24273b;
                        kVar2.l();
                        Integer valueOf = Integer.valueOf(kVar2.f24276T0.h());
                        kVar2.f24280X0.a(new j(kVar2, 0), valueOf);
                        break;
                    default:
                        k kVar3 = this.f24273b;
                        kVar3.l();
                        kVar3.f24278V0.a(new j(kVar3, 1), "");
                        break;
                }
                return p.f3034a;
            }
        };
        this.f419K0 = interfaceC0635a;
        interfaceC0635a.invoke();
        final int i9 = 0;
        InterfaceC0635a<p> interfaceC0635a2 = new InterfaceC0635a(this) { // from class: n7.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f24273b;

            {
                this.f24273b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        k kVar2 = this.f24273b;
                        kVar2.l();
                        Integer valueOf = Integer.valueOf(kVar2.f24276T0.h());
                        kVar2.f24280X0.a(new j(kVar2, 0), valueOf);
                        break;
                    default:
                        k kVar3 = this.f24273b;
                        kVar3.l();
                        kVar3.f24278V0.a(new j(kVar3, 1), "");
                        break;
                }
                return p.f3034a;
            }
        };
        this.f421M0 = interfaceC0635a2;
        interfaceC0635a2.invoke();
    }
}

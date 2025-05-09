package k7;

import B6.i;
import O9.p;
import androidx.lifecycle.C0559z;
import ca.InterfaceC0635a;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import d6.C0687a;
import d6.C0689c;
import f6.C0746a;
import java.util.List;
import w5.C1572a;

/* compiled from: CreateAccountViewModel.kt */
/* loaded from: classes2.dex */
public final class e extends i {

    /* renamed from: T0, reason: collision with root package name */
    public final K5.a f23036T0;

    /* renamed from: U0, reason: collision with root package name */
    public final C0689c f23037U0;

    /* renamed from: V0, reason: collision with root package name */
    public final C0687a f23038V0;

    /* renamed from: W0, reason: collision with root package name */
    public final C0746a f23039W0;

    /* renamed from: X0, reason: collision with root package name */
    public final C0559z<List<C1572a>> f23040X0 = new C0559z<>();

    /* renamed from: Y0, reason: collision with root package name */
    public final C0559z<List<CryptoAccountDomain>> f23041Y0 = new C0559z<>();

    /* renamed from: Z0, reason: collision with root package name */
    public final C0559z<CryptoAccountDomain> f23042Z0 = new C0559z<>();

    public e(K5.a aVar, C0689c c0689c, C0687a c0687a, C0746a c0746a) {
        this.f23036T0 = aVar;
        this.f23037U0 = c0689c;
        this.f23038V0 = c0687a;
        this.f23039W0 = c0746a;
        final int i = 0;
        InterfaceC0635a<p> interfaceC0635a = new InterfaceC0635a(this) { // from class: k7.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f23035b;

            {
                this.f23035b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i) {
                    case 0:
                        e eVar = this.f23035b;
                        eVar.l();
                        Integer valueOf = Integer.valueOf(eVar.f23036T0.h());
                        eVar.f23037U0.a(new C0950c(eVar, 3), valueOf);
                        break;
                    default:
                        e eVar2 = this.f23035b;
                        eVar2.l();
                        eVar2.f23039W0.a(new C0950c(eVar2, 2), "");
                        break;
                }
                return p.f3034a;
            }
        };
        this.f420L0 = interfaceC0635a;
        interfaceC0635a.invoke();
        final int i9 = 1;
        InterfaceC0635a<p> interfaceC0635a2 = new InterfaceC0635a(this) { // from class: k7.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f23035b;

            {
                this.f23035b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        e eVar = this.f23035b;
                        eVar.l();
                        Integer valueOf = Integer.valueOf(eVar.f23036T0.h());
                        eVar.f23037U0.a(new C0950c(eVar, 3), valueOf);
                        break;
                    default:
                        e eVar2 = this.f23035b;
                        eVar2.l();
                        eVar2.f23039W0.a(new C0950c(eVar2, 2), "");
                        break;
                }
                return p.f3034a;
            }
        };
        this.f419K0 = interfaceC0635a2;
        interfaceC0635a2.invoke();
    }
}

package V6;

import B6.i;
import O9.p;
import Z6.f;
import Z6.g;
import ca.InterfaceC0635a;
import com.luminary.business.domain.entity.cards.BankTopUpRequestDomain;
import com.luminary.business.domain.entity.cards.VaultTopUpRequestDomain;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3736a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f3737b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3738c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3739d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f3740e;

    public /* synthetic */ c(i iVar, int i, int i9, double d10, int i10) {
        this.f3736a = i10;
        this.f3737b = iVar;
        this.f3738c = i;
        this.f3739d = i9;
        this.f3740e = d10;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        switch (this.f3736a) {
            case 0:
                e eVar = (e) this.f3737b;
                eVar.l();
                VaultTopUpRequestDomain vaultTopUpRequestDomain = new VaultTopUpRequestDomain(eVar.f3743T0.h(), this.f3738c, this.f3739d, this.f3740e);
                eVar.f3745V0.a(new d(eVar, 1), vaultTopUpRequestDomain);
                break;
            case 1:
                e eVar2 = (e) this.f3737b;
                eVar2.l();
                BankTopUpRequestDomain bankTopUpRequestDomain = new BankTopUpRequestDomain(eVar2.f3743T0.h(), this.f3738c, this.f3739d, this.f3740e);
                eVar2.f3744U0.a(new d(eVar2, 0), bankTopUpRequestDomain);
                break;
            default:
                g gVar = (g) this.f3737b;
                BankTopUpRequestDomain bankTopUpRequestDomain2 = new BankTopUpRequestDomain(gVar.f4217T0.h(), this.f3738c, this.f3739d, this.f3740e);
                gVar.f4220W0.a(new f(gVar, 1), bankTopUpRequestDomain2);
                break;
        }
        return p.f3034a;
    }
}

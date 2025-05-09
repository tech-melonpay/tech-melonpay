package H7;

import B6.i;
import J5.a;
import O9.p;
import W6.m;
import b8.h;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.ReceiverLegalType;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1556a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1557b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1558c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f1559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1560e;

    public /* synthetic */ c(e eVar, String str, int i, z5.d dVar) {
        this.f1559d = eVar;
        this.f1557b = str;
        this.f1558c = i;
        this.f1560e = dVar;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        final int i = this.f1558c;
        String str = this.f1557b;
        Object obj = this.f1560e;
        i iVar = this.f1559d;
        switch (this.f1556a) {
            case 0:
                e eVar = (e) iVar;
                eVar.f1563T0.a(new d(eVar, 0), new Triple(str, Integer.valueOf(i), (z5.d) obj));
                break;
            case 1:
                final m mVar = (m) iVar;
                String valueOf = String.valueOf(mVar.f3856T0.h());
                mVar.l();
                Pair pair = new Pair(valueOf, str);
                final Boolean bool = (Boolean) obj;
                mVar.f3860X0.a(new InterfaceC0646l() { // from class: W6.l
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // ca.InterfaceC0646l
                    public final Object invoke(Object obj2) {
                        J5.a aVar = (J5.a) obj2;
                        m mVar2 = m.this;
                        mVar2.k();
                        if (aVar instanceof a.C0026a) {
                            J5.b bVar = (J5.b) ((a.C0026a) aVar).f2145a;
                            if (mVar2.a(bVar)) {
                                mVar2.f413E0 = mVar2.f421M0;
                            }
                            if (!mVar2.c(bVar)) {
                                mVar2.d(bVar);
                            }
                            p pVar = p.f3034a;
                        } else {
                            if (!(aVar instanceof a.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            G7.f fVar = new G7.f(mVar2, i, bool, 1);
                            mVar2.f418J0 = fVar;
                            fVar.invoke();
                            p pVar2 = p.f3034a;
                        }
                        return p.f3034a;
                    }
                }, pair);
                break;
            default:
                h hVar = (h) iVar;
                hVar.l();
                ReceiverLegalType[] receiverLegalTypeArr = ReceiverLegalType.f10693a;
                B5.d dVar = new B5.d(str, ((String) obj).toUpperCase(Locale.ROOT), i);
                hVar.f8464b1.a(new b8.b(hVar, 13), dVar);
                break;
        }
        return p.f3034a;
    }

    public /* synthetic */ c(m mVar, String str, int i) {
        Boolean bool = Boolean.FALSE;
        this.f1559d = mVar;
        this.f1557b = str;
        this.f1558c = i;
        this.f1560e = bool;
    }

    public /* synthetic */ c(h hVar, String str, String str2, int i) {
        this.f1559d = hVar;
        this.f1557b = str;
        this.f1560e = str2;
        this.f1558c = i;
    }
}

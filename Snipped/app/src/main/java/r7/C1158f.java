package r7;

import J5.a;
import O9.p;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.templates.CheckRequisitesDomain;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* renamed from: r7.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1158f implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26318a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1159g f26319b;

    public /* synthetic */ C1158f(C1159g c1159g, int i) {
        this.f26318a = i;
        this.f26319b = c1159g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        C1159g c1159g = this.f26319b;
        switch (this.f26318a) {
            case 0:
                J5.a aVar = (J5.a) obj;
                c1159g.k();
                C1158f c1158f = new C1158f(c1159g, 3);
                if (aVar instanceof a.C0026a) {
                    c1158f.invoke(((a.C0026a) aVar).f2145a);
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c1159g.f26323W0.postValue((List) ((a.b) aVar).f2146a);
                    p pVar = p.f3034a;
                }
                return p.f3034a;
            case 1:
                J5.a aVar2 = (J5.a) obj;
                c1159g.k();
                C1158f c1158f2 = new C1158f(c1159g, 2);
                if (aVar2 instanceof a.C0026a) {
                    c1158f2.invoke(((a.C0026a) aVar2).f2145a);
                } else {
                    if (!(aVar2 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c1159g.f26324X0.postValue((CheckRequisitesDomain) ((a.b) aVar2).f2146a);
                    p pVar2 = p.f3034a;
                }
                return p.f3034a;
            case 2:
                J5.b bVar = (J5.b) obj;
                if (c1159g.a(bVar)) {
                    c1159g.f413E0 = c1159g.f419K0;
                }
                if (!c1159g.c(bVar)) {
                    c1159g.d(bVar);
                }
                return p.f3034a;
            default:
                J5.b bVar2 = (J5.b) obj;
                if (c1159g.a(bVar2)) {
                    c1159g.f413E0 = c1159g.f418J0;
                }
                if (!c1159g.c(bVar2)) {
                    c1159g.d(bVar2);
                }
                return p.f3034a;
        }
    }
}

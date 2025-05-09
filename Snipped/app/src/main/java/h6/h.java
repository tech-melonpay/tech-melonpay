package H6;

import J5.a;
import O9.p;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.business.presentation.ui.fragments.newcompany.NewCompanyViewModel;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1536a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B6.i f1537b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1538c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1539d;

    public /* synthetic */ h(B6.i iVar, Object obj, Object obj2, int i) {
        this.f1536a = i;
        this.f1537b = iVar;
        this.f1538c = obj;
        this.f1539d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        Object obj2 = this.f1539d;
        Object obj3 = this.f1538c;
        B6.i iVar = this.f1537b;
        J5.a aVar = (J5.a) obj;
        switch (this.f1536a) {
            case 0:
                i iVar2 = (i) iVar;
                iVar2.k();
                aVar.getClass();
                if (aVar instanceof a.C0026a) {
                    iVar2.d((J5.b) ((a.C0026a) aVar).f2145a);
                    p pVar = p.f3034a;
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    I5.j jVar = (I5.j) ((a.b) aVar).f2146a;
                    String str = jVar.f1786a;
                    K5.a aVar2 = iVar2.f1544X0;
                    if (str != null) {
                        aVar2.V(str);
                    }
                    String str2 = jVar.f1787b;
                    if (str2 != null) {
                        aVar2.k(str2);
                    }
                    iVar2.m((String) obj3, (String) obj2);
                    p pVar2 = p.f3034a;
                }
                return p.f3034a;
            default:
                NewCompanyViewModel newCompanyViewModel = (NewCompanyViewModel) iVar;
                newCompanyViewModel.k();
                J8.c cVar = new J8.c(3, newCompanyViewModel, (InterfaceC0635a) obj3);
                if (aVar instanceof a.C0026a) {
                    cVar.invoke(((a.C0026a) aVar).f2145a);
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InterfaceC0635a interfaceC0635a = (InterfaceC0635a) obj2;
                    if (interfaceC0635a != null) {
                        interfaceC0635a.invoke();
                    }
                }
                return p.f3034a;
        }
    }
}

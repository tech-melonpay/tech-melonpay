package b7;

import J5.a;
import O9.p;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.company.CorporateDetailsDomain;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* renamed from: b7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0604c implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8370a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0606e f8371b;

    public /* synthetic */ C0604c(C0606e c0606e, int i) {
        this.f8370a = i;
        this.f8371b = c0606e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        String str;
        Object obj2;
        String str2;
        C0606e c0606e = this.f8371b;
        switch (this.f8370a) {
            case 0:
                J5.a aVar = (J5.a) obj;
                c0606e.k();
                C0604c c0604c = new C0604c(c0606e, 1);
                aVar.getClass();
                if (aVar instanceof a.C0026a) {
                    J5.b bVar = (J5.b) ((a.C0026a) aVar).f2145a;
                    if (c0606e.a(bVar)) {
                        c0606e.f413E0 = c0606e.f418J0;
                    }
                    if (!c0606e.c(bVar)) {
                        c0606e.d(bVar);
                    }
                    p pVar = p.f3034a;
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c0604c.invoke(((a.b) aVar).f2146a);
                }
                return p.f3034a;
            default:
                List<CorporateDetailsDomain> list = (List) obj;
                c0606e.getClass();
                for (CorporateDetailsDomain corporateDetailsDomain : list) {
                    Iterator<T> it = c0606e.f8376U0.f().iterator();
                    while (true) {
                        str = null;
                        if (it.hasNext()) {
                            obj2 = it.next();
                            u5.f fVar = (u5.f) obj2;
                            CorporateDetailsDomain.a aVar2 = corporateDetailsDomain.f10804a;
                            String lowerCase = (aVar2 == null || (str2 = aVar2.f10884N) == null) ? "" : str2.toLowerCase(Locale.ROOT);
                            String str3 = fVar.f30276c;
                            if (kotlin.jvm.internal.f.b(lowerCase, str3 != null ? str3.toLowerCase(Locale.ROOT) : null)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    u5.f fVar2 = (u5.f) obj2;
                    if (fVar2 != null) {
                        str = fVar2.f30277d;
                    }
                    corporateDetailsDomain.i = str;
                }
                c0606e.f8378W0.postValue(list);
                return p.f3034a;
        }
    }
}

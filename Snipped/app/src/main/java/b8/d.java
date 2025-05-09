package b8;

import J5.a;
import O9.p;
import androidx.lifecycle.C0559z;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8406a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f8407b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8408c;

    public /* synthetic */ d(h hVar, int i, int i9) {
        this.f8406a = i9;
        this.f8407b = hVar;
        this.f8408c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        int i = this.f8408c;
        h hVar = this.f8407b;
        switch (this.f8406a) {
            case 0:
                J5.a aVar = (J5.a) obj;
                hVar.k();
                d dVar = new d(hVar, i, 1);
                aVar.getClass();
                if (aVar instanceof a.C0026a) {
                    J5.b bVar = (J5.b) ((a.C0026a) aVar).f2145a;
                    if (hVar.a(bVar)) {
                        hVar.f413E0 = hVar.f422O0;
                    }
                    if (!hVar.c(bVar)) {
                        hVar.d(bVar);
                    }
                    p pVar = p.f3034a;
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar.invoke(((a.b) aVar).f2146a);
                }
                return p.f3034a;
            default:
                List<BankAccountDomain> list = (List) obj;
                hVar.f8469g1.postValue(list);
                C0559z<List<BankAccountDomain>> c0559z = hVar.f8468f1;
                String str = i != 0 ? i != 2 ? "eur" : "" : "gbp";
                if (str.length() != 0) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        String str2 = ((BankAccountDomain) obj2).f10701h;
                        if (kotlin.jvm.internal.f.b(str2 != null ? str2.toLowerCase(Locale.ROOT) : null, str)) {
                            arrayList.add(obj2);
                        }
                    }
                    list = arrayList;
                }
                c0559z.postValue(list);
                return p.f3034a;
        }
    }
}

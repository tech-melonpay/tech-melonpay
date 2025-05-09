package b7;

import B6.i;
import J5.a;
import O9.p;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.company.CorporateDetailsDomain;
import com.luminary.business.presentation.ui.fragments.settings.SettingsViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* renamed from: b7.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0605d implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8372a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8373b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f8374c;

    public /* synthetic */ C0605d(i iVar, int i, int i9) {
        this.f8372a = i9;
        this.f8374c = iVar;
        this.f8373b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        Object obj2;
        CorporateDetailsDomain.a aVar;
        Integer num;
        int i = this.f8373b;
        i iVar = this.f8374c;
        J5.a aVar2 = (J5.a) obj;
        switch (this.f8372a) {
            case 0:
                C0606e c0606e = (C0606e) iVar;
                c0606e.k();
                aVar2.getClass();
                if (aVar2 instanceof a.C0026a) {
                    J5.b bVar = (J5.b) ((a.C0026a) aVar2).f2145a;
                    if (c0606e.a(bVar)) {
                        c0606e.f413E0 = c0606e.f420L0;
                    }
                    if (!c0606e.c(bVar)) {
                        c0606e.d(bVar);
                    }
                    p pVar = p.f3034a;
                } else {
                    if (!(aVar2 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!((List) ((a.b) aVar2).f2146a).isEmpty()) {
                        c0606e.f8376U0.S(i);
                        c0606e.f8380Y0.setValue(null);
                    } else {
                        c0606e.f8383b1.setValue(null);
                    }
                    p pVar2 = p.f3034a;
                }
                return p.f3034a;
            default:
                SettingsViewModel settingsViewModel = (SettingsViewModel) iVar;
                settingsViewModel.k();
                aVar2.getClass();
                if (aVar2 instanceof a.C0026a) {
                    J5.b bVar2 = (J5.b) ((a.C0026a) aVar2).f2145a;
                    if (settingsViewModel.a(bVar2)) {
                        settingsViewModel.f413E0 = settingsViewModel.f420L0;
                    }
                    if (!settingsViewModel.c(bVar2)) {
                        settingsViewModel.d(bVar2);
                    }
                    p pVar3 = p.f3034a;
                } else {
                    if (!(aVar2 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Iterator it = ((List) ((a.b) aVar2).f2146a).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            CorporateDetailsDomain.a aVar3 = ((CorporateDetailsDomain) obj2).f10804a;
                            if (aVar3 == null || (num = aVar3.f10889a) == null || num.intValue() != i) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    CorporateDetailsDomain corporateDetailsDomain = (CorporateDetailsDomain) obj2;
                    if (corporateDetailsDomain != null && (aVar = corporateDetailsDomain.f10804a) != null) {
                        String str = aVar.f10884N;
                        aVar.f10880J0 = str != null ? settingsViewModel.i0(str) : null;
                    }
                    settingsViewModel.f13007b1.postValue(corporateDetailsDomain);
                    settingsViewModel.f13008c1.postValue(corporateDetailsDomain);
                    p pVar4 = p.f3034a;
                }
                return p.f3034a;
        }
    }
}

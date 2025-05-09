package m8;

import J5.a;
import O9.p;
import ca.InterfaceC0646l;
import com.luminary.business.presentation.ui.fragments.settings.SettingsViewModel;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24033a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SettingsViewModel f24034b;

    public /* synthetic */ k(int i, SettingsViewModel settingsViewModel) {
        this.f24033a = i;
        this.f24034b = settingsViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        int i = 1;
        SettingsViewModel settingsViewModel = this.f24034b;
        switch (this.f24033a) {
            case 0:
                J5.b bVar = (J5.b) obj;
                if (settingsViewModel.a(bVar)) {
                    settingsViewModel.f413E0 = settingsViewModel.f421M0;
                }
                if (!settingsViewModel.c(bVar)) {
                    settingsViewModel.d(bVar);
                }
                return p.f3034a;
            case 1:
                J5.b bVar2 = (J5.b) obj;
                if (settingsViewModel.a(bVar2)) {
                    settingsViewModel.f413E0 = settingsViewModel.N0;
                }
                if (!settingsViewModel.c(bVar2)) {
                    settingsViewModel.d(bVar2);
                }
                return p.f3034a;
            case 2:
                J5.a aVar = (J5.a) obj;
                settingsViewModel.k();
                k kVar = new k(6, settingsViewModel);
                aVar.getClass();
                if (aVar instanceof a.C0026a) {
                    kVar.invoke(((a.C0026a) aVar).f2145a);
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    settingsViewModel.f12999T0.p();
                    settingsViewModel.f13011f1.setValue(null);
                    p pVar = p.f3034a;
                }
                return p.f3034a;
            case 3:
                J5.a aVar2 = (J5.a) obj;
                settingsViewModel.k();
                aVar2.getClass();
                if (aVar2 instanceof a.C0026a) {
                    J5.b bVar3 = (J5.b) ((a.C0026a) aVar2).f2145a;
                    if (settingsViewModel.a(bVar3)) {
                        settingsViewModel.f413E0 = settingsViewModel.f419K0;
                    }
                    if (!settingsViewModel.c(bVar3)) {
                        settingsViewModel.d(bVar3);
                    }
                    p pVar2 = p.f3034a;
                } else {
                    if (!(aVar2 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    I5.k kVar2 = (I5.k) ((a.b) aVar2).f2146a;
                    String str = kVar2.f1839p;
                    kVar2.f1835l0 = str != null ? settingsViewModel.i0(str) : null;
                    settingsViewModel.f13006a1.postValue(kVar2);
                    j jVar = new j(i, settingsViewModel);
                    settingsViewModel.f420L0 = jVar;
                    jVar.invoke();
                    p pVar3 = p.f3034a;
                }
                return p.f3034a;
            case 4:
                J5.a aVar3 = (J5.a) obj;
                settingsViewModel.k();
                k kVar3 = new k(0, settingsViewModel);
                if (aVar3 instanceof a.C0026a) {
                    kVar3.invoke(((a.C0026a) aVar3).f2145a);
                } else {
                    if (!(aVar3 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    settingsViewModel.k0();
                    p pVar4 = p.f3034a;
                }
                return p.f3034a;
            case 5:
                J5.a aVar4 = (J5.a) obj;
                settingsViewModel.k();
                k kVar4 = new k(i, settingsViewModel);
                if (aVar4 instanceof a.C0026a) {
                    kVar4.invoke(((a.C0026a) aVar4).f2145a);
                } else {
                    if (!(aVar4 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    settingsViewModel.k0();
                    p pVar5 = p.f3034a;
                }
                return p.f3034a;
            default:
                J5.b bVar4 = (J5.b) obj;
                if (settingsViewModel.a(bVar4)) {
                    settingsViewModel.f413E0 = settingsViewModel.f422O0;
                }
                settingsViewModel.d(bVar4);
                return p.f3034a;
        }
    }
}

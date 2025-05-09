package m8;

import O9.p;
import b7.C0605d;
import ca.InterfaceC0635a;
import com.luminary.business.presentation.ui.fragments.settings.SettingsViewModel;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class j implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24031a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SettingsViewModel f24032b;

    public /* synthetic */ j(int i, SettingsViewModel settingsViewModel) {
        this.f24031a = i;
        this.f24032b = settingsViewModel;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        switch (this.f24031a) {
            case 0:
                SettingsViewModel settingsViewModel = this.f24032b;
                settingsViewModel.l();
                p pVar = p.f3034a;
                settingsViewModel.f13005Z0.a(new k(2, settingsViewModel), pVar);
                break;
            case 1:
                SettingsViewModel settingsViewModel2 = this.f24032b;
                int h9 = settingsViewModel2.f12999T0.h();
                settingsViewModel2.l();
                settingsViewModel2.f13001V0.a(new C0605d(settingsViewModel2, h9, 1), "");
                break;
            default:
                SettingsViewModel settingsViewModel3 = this.f24032b;
                long y10 = settingsViewModel3.f12999T0.y();
                settingsViewModel3.l();
                String valueOf = String.valueOf(y10);
                settingsViewModel3.f13000U0.a(new k(3, settingsViewModel3), valueOf);
                break;
        }
        return p.f3034a;
    }
}

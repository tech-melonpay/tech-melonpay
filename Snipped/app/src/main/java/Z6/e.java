package Z6;

import B6.i;
import O9.p;
import a7.C0519d;
import b7.C0605d;
import b7.C0606e;
import b8.h;
import ca.InterfaceC0635a;
import com.luminary.business.presentation.ui.fragments.settings.SettingsViewModel;
import kotlin.Pair;
import kotlin.Triple;
import m8.k;
import t8.j;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4212a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4213b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f4214c;

    public /* synthetic */ e(int i, SettingsViewModel settingsViewModel) {
        this.f4212a = 4;
        this.f4213b = i;
        this.f4214c = settingsViewModel;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        Integer num;
        Integer num2;
        String num3;
        switch (this.f4212a) {
            case 0:
                g gVar = (g) this.f4214c;
                gVar.f4221X0.a(new f(gVar, 0), new Pair(String.valueOf(gVar.f4217T0.h()), Integer.valueOf(this.f4213b)));
                break;
            case 1:
                C0519d c0519d = (C0519d) this.f4214c;
                c0519d.l();
                u5.d u6 = c0519d.f4467U0.u();
                String num4 = (u6 == null || (num = u6.f30237a) == null) ? null : num.toString();
                if (num4 == null) {
                    num4 = "";
                }
                c0519d.f4466T0.a(new C7.a(c0519d, 16), new Triple(num4, Integer.valueOf(this.f4213b), Integer.valueOf(c0519d.f4470X0)));
                break;
            case 2:
                C0606e c0606e = (C0606e) this.f4214c;
                c0606e.l();
                int i = this.f4213b;
                c0606e.f8377V0.a(new C0605d(c0606e, i, 0), String.valueOf(i));
                break;
            case 3:
                h hVar = (h) this.f4214c;
                hVar.l();
                hVar.f8457U0.a(new b8.d(hVar, this.f4213b, 0), String.valueOf(hVar.f8456T0.h()));
                break;
            case 4:
                int i9 = this.f4213b;
                SettingsViewModel settingsViewModel = (SettingsViewModel) this.f4214c;
                Object valueOf = i9 == 0 ? Long.valueOf(settingsViewModel.f12999T0.y()) : Integer.valueOf(settingsViewModel.f12999T0.h());
                settingsViewModel.l();
                settingsViewModel.f13004Y0.a(new k(5, settingsViewModel), valueOf.toString());
                break;
            default:
                j jVar = (j) this.f4214c;
                u5.d u10 = jVar.f29957T0.u();
                if (u10 != null && (num2 = u10.f30237a) != null && (num3 = num2.toString()) != null) {
                    jVar.l();
                    jVar.f29962Y0.a(new t8.h(jVar, 3), new Pair(Integer.valueOf(this.f4213b), Integer.valueOf(Integer.parseInt(num3))));
                }
                break;
        }
        return p.f3034a;
    }

    public /* synthetic */ e(i iVar, int i, int i9) {
        this.f4212a = i9;
        this.f4214c = iVar;
        this.f4213b = i;
    }
}

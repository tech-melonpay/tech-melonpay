package G7;

import B6.i;
import O9.p;
import W6.k;
import W6.m;
import android.text.SpannableStringBuilder;
import ca.InterfaceC0635a;
import com.luminary.business.presentation.ui.fragments.settings.SettingsViewModel;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.text.Regex;
import l7.h;
import z5.C1645a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1350a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1351b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1352c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1353d;

    public /* synthetic */ f(int i, SettingsViewModel settingsViewModel, String str) {
        this.f1350a = 4;
        this.f1351b = i;
        this.f1352c = settingsViewModel;
        this.f1353d = str;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        switch (this.f1350a) {
            case 0:
                g gVar = (g) this.f1352c;
                String valueOf = String.valueOf(gVar.f1355U0.h());
                gVar.l();
                gVar.f1356V0.a(new e(gVar, 1), new Triple(valueOf, Integer.valueOf(this.f1351b), (C1645a) this.f1353d));
                break;
            case 1:
                m mVar = (m) this.f1352c;
                int h9 = mVar.f3856T0.h();
                mVar.l();
                mVar.f3857U0.a(new k(mVar, 7), new Triple(String.valueOf(h9), Integer.valueOf(this.f1351b), (Boolean) this.f1353d));
                break;
            case 2:
                Pattern pattern = ((Regex) this.f1352c).f23200a;
                CharSequence charSequence = (CharSequence) this.f1353d;
                Matcher matcher = pattern.matcher(charSequence);
                if (matcher.find(this.f1351b)) {
                    break;
                }
                break;
            case 3:
                h hVar = (h) this.f1352c;
                if (!hVar.f23580X0) {
                    hVar.l();
                    hVar.f23577U0.a(new C7.a(hVar, 26), new v5.e(hVar.f23576T0.h(), Integer.valueOf(this.f1351b), (String) this.f1353d, hVar.f23579W0, P9.m.n("FIAT-CRYPTO", "CRYPTO-CRYPTO", "CRYPTO-FIAT"), null));
                }
                break;
            default:
                int i = this.f1351b;
                SettingsViewModel settingsViewModel = (SettingsViewModel) this.f1352c;
                Object valueOf2 = i == 0 ? Long.valueOf(settingsViewModel.f12999T0.y()) : Integer.valueOf(settingsViewModel.f12999T0.h());
                settingsViewModel.l();
                settingsViewModel.f13002W0.a(new m8.k(4, settingsViewModel), new Pair((String) this.f1353d, valueOf2.toString()));
                break;
        }
        return p.f3034a;
    }

    public /* synthetic */ f(i iVar, int i, Object obj, int i9) {
        this.f1350a = i9;
        this.f1352c = iVar;
        this.f1351b = i;
        this.f1353d = obj;
    }

    public /* synthetic */ f(Regex regex, SpannableStringBuilder spannableStringBuilder, int i) {
        this.f1350a = 2;
        this.f1352c = regex;
        this.f1353d = spannableStringBuilder;
        this.f1351b = i;
    }
}

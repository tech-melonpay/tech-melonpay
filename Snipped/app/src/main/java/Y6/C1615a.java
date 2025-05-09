package y6;

import O9.p;
import ca.InterfaceC0635a;
import com.luminary.business.presentation.ui.activity.main.MainActivity;

/* compiled from: R8$$SyntheticClass */
/* renamed from: y6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1615a implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31117a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f31118b;

    public /* synthetic */ C1615a(MainActivity mainActivity, int i) {
        this.f31117a = i;
        this.f31118b = mainActivity;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        MainActivity mainActivity = this.f31118b;
        switch (this.f31117a) {
            case 0:
                int i = MainActivity.f11402F;
                return androidx.navigation.a.a(mainActivity);
            default:
                int i9 = MainActivity.f11402F;
                mainActivity.onBackPressed();
                return p.f3034a;
        }
    }
}

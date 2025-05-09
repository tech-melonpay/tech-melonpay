package L2;

import android.window.OnBackInvokedCallback;
import ca.InterfaceC0635a;
import h.LayoutInflaterFactory2C0778e;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2473a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2474b;

    public /* synthetic */ d(Object obj, int i) {
        this.f2473a = i;
        this.f2474b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f2473a) {
            case 0:
                ((b) this.f2474b).handleBackInvoked();
                break;
            case 1:
                ((InterfaceC0635a) this.f2474b).invoke();
                break;
            case 2:
                ((LayoutInflaterFactory2C0778e) this.f2474b).R();
                break;
            default:
                ((Runnable) this.f2474b).run();
                break;
        }
    }
}

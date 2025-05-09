package q1;

import android.os.Handler;
import androidx.lifecycle.InterfaceC0550p;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.r;

/* compiled from: FragmentStateAdapter.java */
/* loaded from: classes.dex */
public final class c implements InterfaceC0550p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f25849a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f25850b;

    public c(Handler handler, E1.a aVar) {
        this.f25849a = handler;
        this.f25850b = aVar;
    }

    @Override // androidx.lifecycle.InterfaceC0550p
    public final void d(r rVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.f25849a.removeCallbacks(this.f25850b);
            rVar.getLifecycle().c(this);
        }
    }
}

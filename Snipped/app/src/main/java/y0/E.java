package y0;

import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: ViewPropertyAnimatorCompat.java */
/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference<View> f30981a;

    public E(View view) {
        this.f30981a = new WeakReference<>(view);
    }

    public final void a(float f10) {
        View view = this.f30981a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
    }

    public final void b() {
        View view = this.f30981a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j10) {
        View view = this.f30981a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
    }

    public final void d(F f10) {
        View view = this.f30981a.get();
        if (view != null) {
            if (f10 != null) {
                view.animate().setListener(new N2.o(f10, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f10) {
        View view = this.f30981a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
    }
}

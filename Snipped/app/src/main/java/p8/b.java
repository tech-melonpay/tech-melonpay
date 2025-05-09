package P8;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: DeferredRequestCreator.java */
/* loaded from: classes2.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        throw null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnPreDrawListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnPreDrawListener(this);
    }
}

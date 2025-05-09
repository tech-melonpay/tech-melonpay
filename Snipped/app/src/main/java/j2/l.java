package J2;

import android.view.View;
import java.util.WeakHashMap;
import y0.C1596C;
import y0.E;

/* compiled from: ViewUtils.java */
/* loaded from: classes.dex */
public final class l implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        C1596C.c.c(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}

package I2;

import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.d;

/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f1728a;

    public b(d dVar) {
        this.f1728a = dVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        d dVar = this.f1728a;
        float rotation = dVar.f9568q.getRotation();
        if (dVar.f9561j == rotation) {
            return true;
        }
        dVar.f9561j = rotation;
        return true;
    }
}

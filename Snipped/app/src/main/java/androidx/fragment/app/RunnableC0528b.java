package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.SpecialEffectsController;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.fragment.app.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0528b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6842a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6843b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6844c;

    public /* synthetic */ RunnableC0528b(int i, Object obj, Object obj2) {
        this.f6842a = i;
        this.f6843b = obj;
        this.f6844c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6842a) {
            case 0:
                ((DefaultSpecialEffectsController) this.f6843b).a((SpecialEffectsController.Operation) this.f6844c);
                break;
            default:
                Iterator<T> it = ((DefaultSpecialEffectsController.TransitionEffect) this.f6843b).f6629c.iterator();
                while (it.hasNext()) {
                    SpecialEffectsController.Operation operation = ((DefaultSpecialEffectsController.g) it.next()).f6670a;
                    View view = operation.f6817c.getView();
                    if (view != null) {
                        operation.f6815a.a(view, (ViewGroup) this.f6844c);
                    }
                }
                break;
        }
    }
}

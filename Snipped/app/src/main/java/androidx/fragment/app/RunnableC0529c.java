package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.SpecialEffectsController;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.fragment.app.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0529c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6845a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SpecialEffectsController.Operation f6846b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DefaultSpecialEffectsController.TransitionEffect f6847c;

    public /* synthetic */ RunnableC0529c(SpecialEffectsController.Operation operation, DefaultSpecialEffectsController.TransitionEffect transitionEffect, int i) {
        this.f6845a = i;
        this.f6846b = operation;
        this.f6847c = transitionEffect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6845a) {
            case 0:
                boolean isLoggable = Log.isLoggable("FragmentManager", 2);
                SpecialEffectsController.Operation operation = this.f6846b;
                if (isLoggable) {
                    Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
                }
                operation.c(this.f6847c);
                break;
            default:
                boolean isLoggable2 = Log.isLoggable("FragmentManager", 2);
                SpecialEffectsController.Operation operation2 = this.f6846b;
                if (isLoggable2) {
                    Log.v("FragmentManager", "Transition for operation " + operation2 + " has completed");
                }
                operation2.c(this.f6847c);
                break;
        }
    }
}

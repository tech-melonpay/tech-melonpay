package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

/* compiled from: FragmentTransitionCompat21.java */
/* loaded from: classes.dex */
public final class A implements Transition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f6596a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6597b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6598c = null;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6599d = null;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6600e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6601f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z f6602g;

    public A(z zVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f6602g = zVar;
        this.f6596a = obj;
        this.f6597b = arrayList;
        this.f6600e = obj2;
        this.f6601f = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        z zVar = this.f6602g;
        Object obj = this.f6596a;
        if (obj != null) {
            zVar.A(obj, this.f6597b, null);
        }
        Object obj2 = this.f6598c;
        if (obj2 != null) {
            zVar.A(obj2, this.f6599d, null);
        }
        Object obj3 = this.f6600e;
        if (obj3 != null) {
            zVar.A(obj3, this.f6601f, null);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }
}

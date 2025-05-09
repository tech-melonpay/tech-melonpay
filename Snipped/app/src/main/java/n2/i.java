package N2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import l1.AbstractC0978c;

/* compiled from: DrawableWithAnimatedVisibilityChange.java */
/* loaded from: classes.dex */
public final class i extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2794a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f2795b;

    public /* synthetic */ i(j jVar, int i) {
        this.f2794a = i;
        this.f2795b = jVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f2794a) {
            case 1:
                super.onAnimationEnd(animator);
                j jVar = this.f2795b;
                super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
                ArrayList arrayList = jVar.f2802f;
                if (arrayList != null && !jVar.f2803g) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((AbstractC0978c) it.next()).a(jVar);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f2794a) {
            case 0:
                super.onAnimationStart(animator);
                j jVar = this.f2795b;
                ArrayList arrayList = jVar.f2802f;
                if (arrayList != null && !jVar.f2803g) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((AbstractC0978c) it.next()).b(jVar);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}

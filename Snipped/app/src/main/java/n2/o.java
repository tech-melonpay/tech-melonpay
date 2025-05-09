package N2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.ArrayList;
import l1.AbstractC0978c;
import l1.C0979d;
import y0.F;

/* compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
/* loaded from: classes.dex */
public final class o extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2821a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2822b;

    public /* synthetic */ o(Object obj, int i) {
        this.f2821a = i;
        this.f2822b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f2821a) {
            case 4:
                ((F) this.f2822b).a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f2821a) {
            case 1:
                X2.h hVar = (X2.h) this.f2822b;
                hVar.q();
                hVar.f3978r.start();
                break;
            case 2:
                C0979d c0979d = (C0979d) this.f2822b;
                ArrayList arrayList = new ArrayList(c0979d.f23471e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC0978c) arrayList.get(i)).a(c0979d);
                }
                break;
            case 3:
                ((HideBottomViewOnScrollBehavior) this.f2822b).f9113j = null;
                break;
            case 4:
                ((F) this.f2822b).c();
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.f2821a) {
            case 0:
                super.onAnimationRepeat(animator);
                p pVar = (p) this.f2822b;
                pVar.f2826f = (pVar.f2826f + 1) % pVar.f2825e.f2762c.length;
                pVar.f2827g = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f2821a) {
            case 2:
                C0979d c0979d = (C0979d) this.f2822b;
                ArrayList arrayList = new ArrayList(c0979d.f23471e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC0978c) arrayList.get(i)).b(c0979d);
                }
                break;
            case 3:
            default:
                super.onAnimationStart(animator);
                break;
            case 4:
                ((F) this.f2822b).b();
                break;
        }
    }

    public o(F f10, View view) {
        this.f2821a = 4;
        this.f2822b = f10;
    }
}

package V2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* compiled from: BaseTransientBottomBar.java */
/* loaded from: classes.dex */
public final class a extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3720a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f3721b;

    public /* synthetic */ a(BaseTransientBottomBar baseTransientBottomBar, int i) {
        this.f3720a = i;
        this.f3721b = baseTransientBottomBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3720a) {
            case 0:
                this.f3721b.c();
                break;
            case 1:
                this.f3721b.d();
                break;
            case 2:
                this.f3721b.c();
                break;
            default:
                this.f3721b.d();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f3720a) {
            case 1:
                BaseTransientBottomBar baseTransientBottomBar = this.f3721b;
                c cVar = baseTransientBottomBar.f9751j;
                int i = baseTransientBottomBar.f9745c;
                int i9 = baseTransientBottomBar.f9743a;
                int i10 = i - i9;
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) cVar;
                snackbarContentLayout.f9780a.setAlpha(0.0f);
                long j10 = i9;
                ViewPropertyAnimator duration = snackbarContentLayout.f9780a.animate().alpha(1.0f).setDuration(j10);
                TimeInterpolator timeInterpolator = snackbarContentLayout.f9782c;
                long j11 = i10;
                duration.setInterpolator(timeInterpolator).setStartDelay(j11).start();
                if (snackbarContentLayout.f9781b.getVisibility() == 0) {
                    snackbarContentLayout.f9781b.setAlpha(0.0f);
                    snackbarContentLayout.f9781b.animate().alpha(1.0f).setDuration(j10).setInterpolator(timeInterpolator).setStartDelay(j11).start();
                    break;
                }
                break;
            case 2:
                BaseTransientBottomBar baseTransientBottomBar2 = this.f3721b;
                c cVar2 = baseTransientBottomBar2.f9751j;
                int i11 = baseTransientBottomBar2.f9744b;
                SnackbarContentLayout snackbarContentLayout2 = (SnackbarContentLayout) cVar2;
                snackbarContentLayout2.f9780a.setAlpha(1.0f);
                long j12 = i11;
                ViewPropertyAnimator duration2 = snackbarContentLayout2.f9780a.animate().alpha(0.0f).setDuration(j12);
                TimeInterpolator timeInterpolator2 = snackbarContentLayout2.f9782c;
                long j13 = 0;
                duration2.setInterpolator(timeInterpolator2).setStartDelay(j13).start();
                if (snackbarContentLayout2.f9781b.getVisibility() == 0) {
                    snackbarContentLayout2.f9781b.setAlpha(1.0f);
                    snackbarContentLayout2.f9781b.animate().alpha(0.0f).setDuration(j12).setInterpolator(timeInterpolator2).setStartDelay(j13).start();
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ a(BaseTransientBottomBar baseTransientBottomBar, int i, int i9) {
        this.f3720a = i9;
        this.f3721b = baseTransientBottomBar;
    }
}

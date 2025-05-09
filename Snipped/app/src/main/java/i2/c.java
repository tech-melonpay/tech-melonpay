package I2;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.floatingactionbutton.d;
import java.util.ArrayList;

/* compiled from: FloatingActionButtonImplLollipop.java */
/* loaded from: classes.dex */
public final class c extends d {

    /* renamed from: I, reason: collision with root package name */
    public StateListAnimator f1729I;

    @Override // com.google.android.material.floatingactionbutton.d
    public final float e() {
        return this.f9568q.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void f(Rect rect) {
        if (FloatingActionButton.this.i) {
            super.f(rect);
            return;
        }
        boolean z10 = this.f9554b;
        FloatingActionButton floatingActionButton = this.f9568q;
        if (!z10 || floatingActionButton.getSizeDimension() >= 0) {
            rect.set(0, 0, 0, 0);
        } else {
            int sizeDimension = (0 - floatingActionButton.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void h() {
        l();
        throw null;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void j(float f10, float f11, float f12) {
        FloatingActionButton floatingActionButton = this.f9568q;
        if (floatingActionButton.getStateListAnimator() == this.f1729I) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(d.f9544C, m(f10, f12));
            stateListAnimator.addState(d.f9545D, m(f10, f11));
            stateListAnimator.addState(d.f9546E, m(f10, f11));
            stateListAnimator.addState(d.f9547F, m(f10, f11));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f10).setDuration(0L));
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(d.f9550x);
            stateListAnimator.addState(d.f9548G, animatorSet);
            stateListAnimator.addState(d.f9549H, m(0.0f, 0.0f));
            this.f1729I = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (n()) {
            l();
            throw null;
        }
    }

    public final AnimatorSet m(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = {f10};
        FloatingActionButton floatingActionButton = this.f9568q;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", fArr).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f11).setDuration(100L));
        animatorSet.setInterpolator(d.f9550x);
        return animatorSet;
    }

    public final boolean n() {
        return FloatingActionButton.this.i || (this.f9554b && this.f9568q.getSizeDimension() < 0);
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void g() {
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void i(int[] iArr) {
    }
}

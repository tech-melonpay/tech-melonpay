package U2;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.firebase.messaging.ServiceStarter;

/* compiled from: RightSheetDelegate.java */
/* loaded from: classes.dex */
public final class b extends d {

    /* renamed from: a, reason: collision with root package name */
    public final SideSheetBehavior<? extends View> f3661a;

    public b(SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f3661a = sideSheetBehavior;
    }

    @Override // U2.d
    public final int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // U2.d
    public final float b(int i) {
        float f10 = this.f3661a.f9719n;
        return (f10 - i) / (f10 - d());
    }

    @Override // U2.d
    public final int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // U2.d
    public final int d() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f3661a;
        return Math.max(0, (sideSheetBehavior.f9719n - sideSheetBehavior.f9718m) - sideSheetBehavior.f9721p);
    }

    @Override // U2.d
    public final int e() {
        return this.f3661a.f9719n;
    }

    @Override // U2.d
    public final int f() {
        return this.f3661a.f9719n;
    }

    @Override // U2.d
    public final int g() {
        return d();
    }

    @Override // U2.d
    public final <V extends View> int h(V v10) {
        return v10.getLeft() - this.f3661a.f9721p;
    }

    @Override // U2.d
    public final int i(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override // U2.d
    public final int j() {
        return 0;
    }

    @Override // U2.d
    public final boolean k(float f10) {
        return f10 < 0.0f;
    }

    @Override // U2.d
    public final boolean l(View view) {
        return view.getLeft() > (d() + this.f3661a.f9719n) / 2;
    }

    @Override // U2.d
    public final boolean m(float f10, float f11) {
        if (Math.abs(f10) > Math.abs(f11)) {
            float abs = Math.abs(f10);
            this.f3661a.getClass();
            if (abs > ServiceStarter.ERROR_UNKNOWN) {
                return true;
            }
        }
        return false;
    }

    @Override // U2.d
    public final boolean n(View view, float f10) {
        return Math.abs((f10 * this.f3661a.f9717l) + ((float) view.getRight())) > 0.5f;
    }

    @Override // U2.d
    public final void o(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.rightMargin = i;
    }

    @Override // U2.d
    public final void p(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i9) {
        int i10 = this.f3661a.f9719n;
        if (i <= i10) {
            marginLayoutParams.rightMargin = i10 - i;
        }
    }
}

package U2;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.firebase.messaging.ServiceStarter;

/* compiled from: LeftSheetDelegate.java */
/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    public final SideSheetBehavior<? extends View> f3660a;

    public a(SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f3660a = sideSheetBehavior;
    }

    @Override // U2.d
    public final int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // U2.d
    public final float b(int i) {
        float e10 = e();
        return (i - e10) / (d() - e10);
    }

    @Override // U2.d
    public final int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // U2.d
    public final int d() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f3660a;
        return Math.max(0, sideSheetBehavior.f9720o + sideSheetBehavior.f9721p);
    }

    @Override // U2.d
    public final int e() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f3660a;
        return (-sideSheetBehavior.f9718m) - sideSheetBehavior.f9721p;
    }

    @Override // U2.d
    public final int f() {
        return this.f3660a.f9721p;
    }

    @Override // U2.d
    public final int g() {
        return -this.f3660a.f9718m;
    }

    @Override // U2.d
    public final <V extends View> int h(V v10) {
        return v10.getRight() + this.f3660a.f9721p;
    }

    @Override // U2.d
    public final int i(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // U2.d
    public final int j() {
        return 1;
    }

    @Override // U2.d
    public final boolean k(float f10) {
        return f10 > 0.0f;
    }

    @Override // U2.d
    public final boolean l(View view) {
        return view.getRight() < (d() - e()) / 2;
    }

    @Override // U2.d
    public final boolean m(float f10, float f11) {
        if (Math.abs(f10) > Math.abs(f11)) {
            float abs = Math.abs(f10);
            this.f3660a.getClass();
            if (abs > ServiceStarter.ERROR_UNKNOWN) {
                return true;
            }
        }
        return false;
    }

    @Override // U2.d
    public final boolean n(View view, float f10) {
        return Math.abs((f10 * this.f3660a.f9717l) + ((float) view.getLeft())) > 0.5f;
    }

    @Override // U2.d
    public final void o(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.leftMargin = i;
    }

    @Override // U2.d
    public final void p(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i9) {
        if (i <= this.f3660a.f9719n) {
            marginLayoutParams.leftMargin = i9;
        }
    }
}

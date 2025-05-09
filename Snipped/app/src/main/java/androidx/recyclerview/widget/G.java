package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OrientationHelper.java */
/* loaded from: classes.dex */
public final class G extends H {
    @Override // androidx.recyclerview.widget.H
    public final int b(View view) {
        return this.f7423a.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.o) view.getLayoutParams())).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.H
    public final int c(View view) {
        RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
        return this.f7423a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) oVar).topMargin + ((ViewGroup.MarginLayoutParams) oVar).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.H
    public final int d(View view) {
        RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
        return this.f7423a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) oVar).leftMargin + ((ViewGroup.MarginLayoutParams) oVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.H
    public final int e(View view) {
        return this.f7423a.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.o) view.getLayoutParams())).topMargin;
    }

    @Override // androidx.recyclerview.widget.H
    public final int f() {
        return this.f7423a.getHeight();
    }

    @Override // androidx.recyclerview.widget.H
    public final int g() {
        RecyclerView.n nVar = this.f7423a;
        return nVar.getHeight() - nVar.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.H
    public final int h() {
        return this.f7423a.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.H
    public final int i() {
        return this.f7423a.getHeightMode();
    }

    @Override // androidx.recyclerview.widget.H
    public final int j() {
        return this.f7423a.getWidthMode();
    }

    @Override // androidx.recyclerview.widget.H
    public final int k() {
        return this.f7423a.getPaddingTop();
    }

    @Override // androidx.recyclerview.widget.H
    public final int l() {
        RecyclerView.n nVar = this.f7423a;
        return (nVar.getHeight() - nVar.getPaddingTop()) - nVar.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.H
    public final int n(View view) {
        RecyclerView.n nVar = this.f7423a;
        Rect rect = this.f7425c;
        nVar.getTransformedBoundingBox(view, true, rect);
        return rect.bottom;
    }

    @Override // androidx.recyclerview.widget.H
    public final int o(View view) {
        RecyclerView.n nVar = this.f7423a;
        Rect rect = this.f7425c;
        nVar.getTransformedBoundingBox(view, true, rect);
        return rect.top;
    }

    @Override // androidx.recyclerview.widget.H
    public final void p(int i) {
        this.f7423a.offsetChildrenVertical(i);
    }
}

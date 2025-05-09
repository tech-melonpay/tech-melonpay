package e0;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import f0.C0736d;

/* compiled from: MotionHelper.java */
/* renamed from: e0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0709c extends androidx.constraintlayout.widget.a implements MotionLayout.c {
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f20496j;

    /* renamed from: k, reason: collision with root package name */
    public float f20497k;

    /* renamed from: l, reason: collision with root package name */
    public View[] f20498l;

    public float getProgress() {
        return this.f20497k;
    }

    @Override // androidx.constraintlayout.widget.a
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0736d.f20597h);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.i = obtainStyledAttributes.getBoolean(index, this.i);
                } else if (index == 0) {
                    this.f20496j = obtainStyledAttributes.getBoolean(index, this.f20496j);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f10) {
        this.f20497k = f10;
        int i = 0;
        if (this.f6321b <= 0) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            int childCount = viewGroup.getChildCount();
            while (i < childCount) {
                boolean z10 = viewGroup.getChildAt(i) instanceof C0709c;
                i++;
            }
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        View[] viewArr = this.f6326g;
        if (viewArr == null || viewArr.length != this.f6321b) {
            this.f6326g = new View[this.f6321b];
        }
        for (int i9 = 0; i9 < this.f6321b; i9++) {
            this.f6326g[i9] = constraintLayout.getViewById(this.f6320a[i9]);
        }
        this.f20498l = this.f6326g;
        while (i < this.f6321b) {
            View view = this.f20498l[i];
            i++;
        }
    }
}

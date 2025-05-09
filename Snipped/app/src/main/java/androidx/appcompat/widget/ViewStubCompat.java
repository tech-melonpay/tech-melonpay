package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import g.C0756a;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: a, reason: collision with root package name */
    public int f5097a;

    /* renamed from: b, reason: collision with root package name */
    public int f5098b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference<View> f5099c;

    /* renamed from: d, reason: collision with root package name */
    public LayoutInflater f5100d;

    public interface a {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f5097a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0756a.f20728A, 0, 0);
        this.f5098b = obtainStyledAttributes.getResourceId(2, -1);
        this.f5097a = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f5097a == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflater = this.f5100d;
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(getContext());
        }
        View inflate = layoutInflater.inflate(this.f5097a, viewGroup, false);
        int i = this.f5098b;
        if (i != -1) {
            inflate.setId(i);
        }
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(inflate, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(inflate, indexOfChild);
        }
        this.f5099c = new WeakReference<>(inflate);
        return inflate;
    }

    public int getInflatedId() {
        return this.f5098b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f5100d;
    }

    public int getLayoutResource() {
        return this.f5097a;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i9) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f5098b = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f5100d = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f5097a = i;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f5099c;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            a();
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
    }

    public void setOnInflateListener(a aVar) {
    }
}

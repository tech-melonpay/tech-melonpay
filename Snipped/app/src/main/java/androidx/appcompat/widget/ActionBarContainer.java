package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.luminary.mobile.R;
import g.C0756a;
import m.C1000b;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4836a;

    /* renamed from: b, reason: collision with root package name */
    public b f4837b;

    /* renamed from: c, reason: collision with root package name */
    public View f4838c;

    /* renamed from: d, reason: collision with root package name */
    public View f4839d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f4840e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f4841f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f4842g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f4843h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final int f4844j;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C1000b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0756a.f20729a);
        boolean z10 = false;
        this.f4840e = obtainStyledAttributes.getDrawable(0);
        this.f4841f = obtainStyledAttributes.getDrawable(2);
        this.f4844j = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f4843h = true;
            this.f4842g = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f4843h ? !(this.f4840e != null || this.f4841f != null) : this.f4842g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
    }

    public static int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f4840e;
        if (drawable != null && drawable.isStateful()) {
            this.f4840e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f4841f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f4841f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f4842g;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f4842g.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f4837b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f4840e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f4841f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f4842g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f4838c = findViewById(R.id.action_bar);
        this.f4839d = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f4836a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i, int i9, int i10, int i11) {
        Drawable drawable;
        super.onLayout(z10, i, i9, i10, i11);
        b bVar = this.f4837b;
        boolean z11 = true;
        boolean z12 = (bVar == null || bVar.getVisibility() == 8) ? false : true;
        if (bVar != null && bVar.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) bVar.getLayoutParams();
            int measuredHeight2 = measuredHeight - bVar.getMeasuredHeight();
            int i12 = layoutParams.bottomMargin;
            bVar.layout(i, measuredHeight2 - i12, i10, measuredHeight - i12);
        }
        if (this.f4843h) {
            Drawable drawable2 = this.f4842g;
            if (drawable2 == null) {
                return;
            } else {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        } else {
            if (this.f4840e == null) {
                z11 = false;
            } else if (this.f4838c.getVisibility() == 0) {
                this.f4840e.setBounds(this.f4838c.getLeft(), this.f4838c.getTop(), this.f4838c.getRight(), this.f4838c.getBottom());
            } else {
                View view = this.f4839d;
                if (view == null || view.getVisibility() != 0) {
                    this.f4840e.setBounds(0, 0, 0, 0);
                } else {
                    this.f4840e.setBounds(this.f4839d.getLeft(), this.f4839d.getTop(), this.f4839d.getRight(), this.f4839d.getBottom());
                }
            }
            this.i = z12;
            if (z12 && (drawable = this.f4841f) != null) {
                drawable.setBounds(bVar.getLeft(), bVar.getTop(), bVar.getRight(), bVar.getBottom());
            } else if (!z11) {
                return;
            }
        }
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i9) {
        int a10;
        int i10;
        if (this.f4838c == null && View.MeasureSpec.getMode(i9) == Integer.MIN_VALUE && (i10 = this.f4844j) >= 0) {
            i9 = View.MeasureSpec.makeMeasureSpec(Math.min(i10, View.MeasureSpec.getSize(i9)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i9);
        if (this.f4838c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i9);
        b bVar = this.f4837b;
        if (bVar == null || bVar.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        View view = this.f4838c;
        if (view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0) {
            View view2 = this.f4839d;
            a10 = (view2 == null || view2.getVisibility() == 8 || view2.getMeasuredHeight() == 0) ? 0 : a(this.f4839d);
        } else {
            a10 = a(this.f4838c);
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(a(this.f4837b) + a10, mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i9) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f4840e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f4840e);
        }
        this.f4840e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f4838c;
            if (view != null) {
                this.f4840e.setBounds(view.getLeft(), this.f4838c.getTop(), this.f4838c.getRight(), this.f4838c.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f4843h ? !(this.f4840e != null || this.f4841f != null) : this.f4842g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f4842g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f4842g);
        }
        this.f4842g = drawable;
        boolean z10 = this.f4843h;
        boolean z11 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z10 && (drawable2 = this.f4842g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z10 ? !(this.f4840e != null || this.f4841f != null) : this.f4842g == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f4841f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f4841f);
        }
        this.f4841f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.i && (drawable2 = this.f4841f) != null) {
                drawable2.setBounds(this.f4837b.getLeft(), this.f4837b.getTop(), this.f4837b.getRight(), this.f4837b.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f4843h ? !(this.f4840e != null || this.f4841f != null) : this.f4842g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(b bVar) {
        b bVar2 = this.f4837b;
        if (bVar2 != null) {
            removeView(bVar2);
        }
        this.f4837b = bVar;
        if (bVar != null) {
            addView(bVar);
            ViewGroup.LayoutParams layoutParams = bVar.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            bVar.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z10) {
        this.f4836a = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z10 = i == 0;
        Drawable drawable = this.f4840e;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f4841f;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f4842g;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f4840e;
        boolean z10 = this.f4843h;
        return (drawable == drawable2 && !z10) || (drawable == this.f4841f && this.i) || ((drawable == this.f4842g && z10) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }
}

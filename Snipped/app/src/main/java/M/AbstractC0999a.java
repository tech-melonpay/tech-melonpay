package m;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;
import com.luminary.mobile.R;
import g.C0756a;
import y0.C1596C;

/* compiled from: AbsActionBarView.java */
/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0999a extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final C0430a f23730a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f23731b;

    /* renamed from: c, reason: collision with root package name */
    public ActionMenuView f23732c;

    /* renamed from: d, reason: collision with root package name */
    public ActionMenuPresenter f23733d;

    /* renamed from: e, reason: collision with root package name */
    public int f23734e;

    /* renamed from: f, reason: collision with root package name */
    public y0.E f23735f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f23736g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f23737h;

    /* compiled from: AbsActionBarView.java */
    /* renamed from: m.a$a, reason: collision with other inner class name */
    public class C0430a implements y0.F {

        /* renamed from: a, reason: collision with root package name */
        public boolean f23738a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f23739b;

        public C0430a() {
        }

        @Override // y0.F
        public final void a() {
            this.f23738a = true;
        }

        @Override // y0.F
        public final void b() {
            AbstractC0999a.super.setVisibility(0);
            this.f23738a = false;
        }

        @Override // y0.F
        public final void c() {
            if (this.f23738a) {
                return;
            }
            AbstractC0999a abstractC0999a = AbstractC0999a.this;
            abstractC0999a.f23735f = null;
            AbstractC0999a.super.setVisibility(this.f23739b);
        }
    }

    public AbstractC0999a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static int c(View view, int i, int i9) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i9);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int d(int i, int i9, int i10, View view, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int t3 = com.google.android.gms.measurement.internal.a.t(i10, measuredHeight, 2, i9);
        if (z10) {
            view.layout(i - measuredWidth, t3, i, measuredHeight + t3);
        } else {
            view.layout(i, t3, i + measuredWidth, measuredHeight + t3);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public final y0.E e(int i, long j10) {
        y0.E e10 = this.f23735f;
        if (e10 != null) {
            e10.b();
        }
        C0430a c0430a = this.f23730a;
        if (i != 0) {
            y0.E a10 = C1596C.a(this);
            a10.a(0.0f);
            a10.c(j10);
            AbstractC0999a.this.f23735f = a10;
            c0430a.f23739b = i;
            a10.d(c0430a);
            return a10;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        y0.E a11 = C1596C.a(this);
        a11.a(1.0f);
        a11.c(j10);
        AbstractC0999a.this.f23735f = a11;
        c0430a.f23739b = i;
        a11.d(c0430a);
        return a11;
    }

    public int getAnimatedVisibility() {
        return this.f23735f != null ? this.f23730a.f23739b : getVisibility();
    }

    public int getContentHeight() {
        return this.f23734e;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C0756a.f20729a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f23733d;
        if (actionMenuPresenter != null) {
            Configuration configuration2 = actionMenuPresenter.f4689b.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i9 = configuration2.screenHeightDp;
            actionMenuPresenter.f4897q = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i9 > 720) || (i > 720 && i9 > 960)) ? 5 : (i >= 500 || (i > 640 && i9 > 480) || (i > 480 && i9 > 640)) ? 4 : i >= 360 ? 3 : 2;
            androidx.appcompat.view.menu.f fVar = actionMenuPresenter.f4690c;
            if (fVar != null) {
                fVar.p(true);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f23737h = false;
        }
        if (!this.f23737h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f23737h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f23737h = false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f23736g = false;
        }
        if (!this.f23736g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f23736g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f23736g = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f23734e = i;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            y0.E e10 = this.f23735f;
            if (e10 != null) {
                e10.b();
            }
            super.setVisibility(i);
        }
    }

    public AbstractC0999a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23730a = new C0430a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f23731b = context;
        } else {
            this.f23731b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}

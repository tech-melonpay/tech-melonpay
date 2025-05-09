package N2;

import N2.c;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.Arrays;
import l1.AbstractC0978c;
import t2.C1279a;

/* compiled from: BaseProgressIndicator.java */
/* loaded from: classes.dex */
public abstract class b<S extends N2.c> extends ProgressBar {

    /* renamed from: a, reason: collision with root package name */
    public final S f2745a;

    /* renamed from: b, reason: collision with root package name */
    public int f2746b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2747c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2748d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2749e;

    /* renamed from: f, reason: collision with root package name */
    public N2.a f2750f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2751g;

    /* renamed from: h, reason: collision with root package name */
    public int f2752h;
    public final a i;

    /* renamed from: j, reason: collision with root package name */
    public final RunnableC0035b f2753j;

    /* renamed from: k, reason: collision with root package name */
    public final c f2754k;

    /* renamed from: l, reason: collision with root package name */
    public final d f2755l;

    /* compiled from: BaseProgressIndicator.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            if (bVar.f2749e > 0) {
                SystemClock.uptimeMillis();
            }
            bVar.setVisibility(0);
        }
    }

    /* compiled from: BaseProgressIndicator.java */
    /* renamed from: N2.b$b, reason: collision with other inner class name */
    public class RunnableC0035b implements Runnable {
        public RunnableC0035b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            ((j) bVar.getCurrentDrawable()).c(false, false, true);
            if ((bVar.getProgressDrawable() == null || !bVar.getProgressDrawable().isVisible()) && (bVar.getIndeterminateDrawable() == null || !bVar.getIndeterminateDrawable().isVisible())) {
                bVar.setVisibility(4);
            }
            bVar.getClass();
        }
    }

    /* compiled from: BaseProgressIndicator.java */
    public class c extends AbstractC0978c {
        public c() {
        }

        @Override // l1.AbstractC0978c
        public final void a(Drawable drawable) {
            b bVar = b.this;
            bVar.setIndeterminate(false);
            bVar.b(bVar.f2746b, bVar.f2747c);
        }
    }

    /* compiled from: BaseProgressIndicator.java */
    public class d extends AbstractC0978c {
        public d() {
        }

        @Override // l1.AbstractC0978c
        public final void a(Drawable drawable) {
            b bVar = b.this;
            if (bVar.f2751g) {
                return;
            }
            bVar.setVisibility(bVar.f2752h);
        }
    }

    public b(Context context, AttributeSet attributeSet, int i, int i9) {
        super(Y2.a.a(context, attributeSet, i, 2132083913), attributeSet, i);
        this.f2751g = false;
        this.f2752h = 4;
        this.i = new a();
        this.f2753j = new RunnableC0035b();
        this.f2754k = new c();
        this.f2755l = new d();
        Context context2 = getContext();
        this.f2745a = a(context2, attributeSet);
        int[] iArr = C1279a.f27487d;
        J2.i.a(context2, attributeSet, i, i9);
        J2.i.b(context2, attributeSet, iArr, i, i9, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, i9);
        obtainStyledAttributes.getInt(6, -1);
        this.f2749e = Math.min(obtainStyledAttributes.getInt(4, -1), 1000);
        obtainStyledAttributes.recycle();
        this.f2750f = new N2.a();
        this.f2748d = true;
    }

    private k<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().f2813l;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().f2789l;
    }

    public abstract S a(Context context, AttributeSet attributeSet);

    public void b(int i, boolean z10) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() == null || z10) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.f2746b = i;
            this.f2747c = z10;
            this.f2751g = true;
            if (getIndeterminateDrawable().isVisible()) {
                N2.a aVar = this.f2750f;
                ContentResolver contentResolver = getContext().getContentResolver();
                aVar.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                    getIndeterminateDrawable().f2814m.e();
                    return;
                }
            }
            this.f2754k.a(getIndeterminateDrawable());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c() {
        /*
            r2 = this;
            java.util.WeakHashMap<android.view.View, y0.E> r0 = y0.C1596C.f30963a
            boolean r0 = r2.isAttachedToWindow()
            if (r0 == 0) goto L2c
            int r0 = r2.getWindowVisibility()
            if (r0 != 0) goto L2c
            r0 = r2
        Lf:
            int r1 = r0.getVisibility()
            if (r1 == 0) goto L16
            goto L2c
        L16:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L23
            int r0 = r2.getWindowVisibility()
            if (r0 != 0) goto L2c
            goto L27
        L23:
            boolean r1 = r0 instanceof android.view.View
            if (r1 != 0) goto L29
        L27:
            r0 = 1
            goto L2d
        L29:
            android.view.View r0 = (android.view.View) r0
            goto Lf
        L2c:
            r0 = 0
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.b.c():boolean");
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f2745a.f2765f;
    }

    public int[] getIndicatorColor() {
        return this.f2745a.f2762c;
    }

    public int getIndicatorTrackGapSize() {
        return this.f2745a.f2766g;
    }

    public int getShowAnimationBehavior() {
        return this.f2745a.f2764e;
    }

    public int getTrackColor() {
        return this.f2745a.f2763d;
    }

    public int getTrackCornerRadius() {
        return this.f2745a.f2761b;
    }

    public int getTrackThickness() {
        return this.f2745a.f2760a;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f2814m.d(this.f2754k);
        }
        h<S> progressDrawable = getProgressDrawable();
        d dVar = this.f2755l;
        if (progressDrawable != null) {
            h<S> progressDrawable2 = getProgressDrawable();
            if (progressDrawable2.f2802f == null) {
                progressDrawable2.f2802f = new ArrayList();
            }
            if (!progressDrawable2.f2802f.contains(dVar)) {
                progressDrawable2.f2802f.add(dVar);
            }
        }
        if (getIndeterminateDrawable() != null) {
            m<S> indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.f2802f == null) {
                indeterminateDrawable.f2802f = new ArrayList();
            }
            if (!indeterminateDrawable.f2802f.contains(dVar)) {
                indeterminateDrawable.f2802f.add(dVar);
            }
        }
        if (c()) {
            if (this.f2749e > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f2753j);
        removeCallbacks(this.i);
        ((j) getCurrentDrawable()).c(false, false, false);
        m<S> indeterminateDrawable = getIndeterminateDrawable();
        d dVar = this.f2755l;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().e(dVar);
            getIndeterminateDrawable().f2814m.g();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().e(dVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            int save = canvas.save();
            if (getPaddingLeft() == 0) {
                if (getPaddingTop() != 0) {
                }
                if (getPaddingRight() == 0 || getPaddingBottom() != 0) {
                    canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
                }
                getCurrentDrawable().draw(canvas);
                canvas.restoreToCount(save);
            }
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (getPaddingRight() == 0) {
            }
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i9) {
        try {
            k<S> currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(currentDrawingDelegate.f() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i) : currentDrawingDelegate.f() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.e() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i9) : currentDrawingDelegate.e() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z10 = i == 0;
        if (this.f2748d) {
            ((j) getCurrentDrawable()).c(c(), false, z10);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.f2748d) {
            ((j) getCurrentDrawable()).c(c(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(N2.a aVar) {
        this.f2750f = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f2799c = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f2799c = aVar;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.f2745a.f2765f = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z10) {
        try {
            if (z10 == isIndeterminate()) {
                return;
            }
            j jVar = (j) getCurrentDrawable();
            if (jVar != null) {
                jVar.c(false, false, false);
            }
            super.setIndeterminate(z10);
            j jVar2 = (j) getCurrentDrawable();
            if (jVar2 != null) {
                jVar2.c(c(), false, false);
            }
            if ((jVar2 instanceof m) && c()) {
                ((m) jVar2).f2814m.f();
            }
            this.f2751g = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof m)) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            ((j) drawable).c(false, false, false);
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{D9.b.y(getContext(), R.attr.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f2745a.f2762c = iArr;
        getIndeterminateDrawable().f2814m.c();
        invalidate();
    }

    public void setIndicatorTrackGapSize(int i) {
        S s10 = this.f2745a;
        if (s10.f2766g != i) {
            s10.f2766g = i;
            s10.a();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        b(i, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof h)) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            h hVar = (h) drawable;
            hVar.c(false, false, false);
            super.setProgressDrawable(hVar);
            hVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.f2745a.f2764e = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        S s10 = this.f2745a;
        if (s10.f2763d != i) {
            s10.f2763d = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        S s10 = this.f2745a;
        if (s10.f2761b != i) {
            s10.f2761b = Math.min(i, s10.f2760a / 2);
            invalidate();
        }
    }

    public void setTrackThickness(int i) {
        S s10 = this.f2745a;
        if (s10.f2760a != i) {
            s10.f2760a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i != 0 && i != 4 && i != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f2752h = i;
    }

    @Override // android.widget.ProgressBar
    public m<S> getIndeterminateDrawable() {
        return (m) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public h<S> getProgressDrawable() {
        return (h) super.getProgressDrawable();
    }
}

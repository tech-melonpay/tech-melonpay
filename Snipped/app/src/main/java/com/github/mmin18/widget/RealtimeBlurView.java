package com.github.mmin18.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import e2.C0711a;
import f2.C0740a;
import f2.b;
import f2.c;
import f2.d;

/* loaded from: classes.dex */
public class RealtimeBlurView extends View {

    /* renamed from: p, reason: collision with root package name */
    public static int f8883p;

    /* renamed from: q, reason: collision with root package name */
    public static int f8884q;

    /* renamed from: r, reason: collision with root package name */
    public static final StopException f8885r = new StopException(0);

    /* renamed from: a, reason: collision with root package name */
    public float f8886a;

    /* renamed from: b, reason: collision with root package name */
    public int f8887b;

    /* renamed from: c, reason: collision with root package name */
    public float f8888c;

    /* renamed from: d, reason: collision with root package name */
    public final c f8889d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8890e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f8891f;

    /* renamed from: g, reason: collision with root package name */
    public Bitmap f8892g;

    /* renamed from: h, reason: collision with root package name */
    public Canvas f8893h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final Paint f8894j;

    /* renamed from: k, reason: collision with root package name */
    public final Rect f8895k;

    /* renamed from: l, reason: collision with root package name */
    public final Rect f8896l;

    /* renamed from: m, reason: collision with root package name */
    public View f8897m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8898n;

    /* renamed from: o, reason: collision with root package name */
    public final a f8899o;

    public static class StopException extends RuntimeException {
        private StopException() {
        }

        public /* synthetic */ StopException(int i) {
            this();
        }
    }

    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
        
            if (r8 != false) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0080, code lost:
        
            if (r6 == null) goto L26;
         */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean onPreDraw() {
            /*
                Method dump skipped, instructions count: 312
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.github.mmin18.widget.RealtimeBlurView.a.onPreDraw():boolean");
        }
    }

    public RealtimeBlurView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8895k = new Rect();
        this.f8896l = new Rect();
        this.f8899o = new a();
        this.f8889d = getBlurImpl();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0711a.f20505a);
        this.f8888c = obtainStyledAttributes.getDimension(0, TypedValue.applyDimension(1, 10.0f, context.getResources().getDisplayMetrics()));
        this.f8886a = obtainStyledAttributes.getFloat(1, 4.0f);
        this.f8887b = obtainStyledAttributes.getColor(2, -1426063361);
        obtainStyledAttributes.recycle();
        this.f8894j = new Paint();
    }

    public final void a() {
        b();
        this.f8889d.release();
    }

    public final void b() {
        Bitmap bitmap = this.f8891f;
        if (bitmap != null) {
            bitmap.recycle();
            this.f8891f = null;
        }
        Bitmap bitmap2 = this.f8892g;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.f8892g = null;
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.i) {
            throw f8885r;
        }
        if (f8883p > 0) {
            return;
        }
        super.draw(canvas);
    }

    public View getActivityDecorView() {
        Context context = getContext();
        for (int i = 0; i < 4 && context != null && !(context instanceof Activity) && (context instanceof ContextWrapper); i++) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof Activity) {
            return ((Activity) context).getWindow().getDecorView();
        }
        return null;
    }

    public c getBlurImpl() {
        if (f8884q == 0) {
            try {
                C0740a c0740a = new C0740a();
                Bitmap createBitmap = Bitmap.createBitmap(4, 4, Bitmap.Config.ARGB_8888);
                c0740a.b(getContext(), createBitmap, 4.0f);
                c0740a.release();
                createBitmap.recycle();
                f8884q = 3;
            } catch (Throwable unused) {
            }
        }
        if (f8884q == 0) {
            try {
                getClass().getClassLoader().loadClass("androidx.renderscript.RenderScript");
                b bVar = new b();
                Bitmap createBitmap2 = Bitmap.createBitmap(4, 4, Bitmap.Config.ARGB_8888);
                bVar.b(getContext(), createBitmap2, 4.0f);
                bVar.release();
                createBitmap2.recycle();
                f8884q = 1;
            } catch (Throwable unused2) {
            }
        }
        if (f8884q == 0) {
            try {
                getClass().getClassLoader().loadClass("androidx.renderscript.RenderScript");
                d dVar = new d();
                Bitmap createBitmap3 = Bitmap.createBitmap(4, 4, Bitmap.Config.ARGB_8888);
                dVar.b(getContext(), createBitmap3, 4.0f);
                dVar.release();
                createBitmap3.recycle();
                f8884q = 2;
            } catch (Throwable unused3) {
            }
        }
        if (f8884q == 0) {
            f8884q = -1;
        }
        int i = f8884q;
        return i != 1 ? i != 2 ? i != 3 ? new U4.b() : new C0740a() : new d() : new b();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        View activityDecorView = getActivityDecorView();
        this.f8897m = activityDecorView;
        if (activityDecorView == null) {
            this.f8898n = false;
            return;
        }
        activityDecorView.getViewTreeObserver().addOnPreDrawListener(this.f8899o);
        boolean z10 = this.f8897m.getRootView() != getRootView();
        this.f8898n = z10;
        if (z10) {
            this.f8897m.postInvalidate();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        View view = this.f8897m;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f8899o);
        }
        a();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.f8892g;
        int i = this.f8887b;
        Rect rect = this.f8896l;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            Rect rect2 = this.f8895k;
            rect2.right = width;
            rect2.bottom = bitmap.getHeight();
            rect.right = getWidth();
            rect.bottom = getHeight();
            canvas.drawBitmap(bitmap, rect2, rect, (Paint) null);
        }
        Paint paint = this.f8894j;
        paint.setColor(i);
        canvas.drawRect(rect, paint);
    }

    public void setBlurRadius(float f10) {
        if (this.f8888c != f10) {
            this.f8888c = f10;
            this.f8890e = true;
            invalidate();
        }
    }

    public void setDownsampleFactor(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Downsample factor must be greater than 0.");
        }
        if (this.f8886a != f10) {
            this.f8886a = f10;
            this.f8890e = true;
            b();
            invalidate();
        }
    }

    public void setOverlayColor(int i) {
        if (this.f8887b != i) {
            this.f8887b = i;
            invalidate();
        }
    }
}

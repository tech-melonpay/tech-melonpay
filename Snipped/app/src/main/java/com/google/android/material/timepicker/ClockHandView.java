package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewConfiguration;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import t2.C1279a;
import u2.C1512a;
import y0.C1596C;
import y0.E;

/* loaded from: classes.dex */
class ClockHandView extends View {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f9945v = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f9946a;

    /* renamed from: b, reason: collision with root package name */
    public final TimeInterpolator f9947b;

    /* renamed from: c, reason: collision with root package name */
    public final ValueAnimator f9948c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9949d;

    /* renamed from: e, reason: collision with root package name */
    public float f9950e;

    /* renamed from: f, reason: collision with root package name */
    public float f9951f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9952g;

    /* renamed from: h, reason: collision with root package name */
    public final int f9953h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f9954j;

    /* renamed from: k, reason: collision with root package name */
    public final int f9955k;

    /* renamed from: l, reason: collision with root package name */
    public final float f9956l;

    /* renamed from: m, reason: collision with root package name */
    public final Paint f9957m;

    /* renamed from: n, reason: collision with root package name */
    public final RectF f9958n;

    /* renamed from: o, reason: collision with root package name */
    public final int f9959o;

    /* renamed from: p, reason: collision with root package name */
    public float f9960p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9961q;

    /* renamed from: r, reason: collision with root package name */
    public b f9962r;

    /* renamed from: s, reason: collision with root package name */
    public double f9963s;

    /* renamed from: t, reason: collision with root package name */
    public int f9964t;

    /* renamed from: u, reason: collision with root package name */
    public int f9965u;

    public class a extends AnimatorListenerAdapter {
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface b {
    }

    public interface c {
        void b(float f10, boolean z10);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f9948c = new ValueAnimator();
        this.f9954j = new ArrayList();
        Paint paint = new Paint();
        this.f9957m = paint;
        this.f9958n = new RectF();
        this.f9965u = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1279a.f27494l, R.attr.materialClockStyle, 2132083937);
        this.f9946a = L2.k.c(context, R.attr.motionDurationLong2, 200);
        this.f9947b = L2.k.d(context, R.attr.motionEasingEmphasizedInterpolator, C1512a.f30142b);
        this.f9964t = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f9955k = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f9959o = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f9956l = r4.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        c(0.0f, false);
        this.f9953h = ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
    }

    public final int a(float f10, float f11) {
        int degrees = (int) Math.toDegrees(Math.atan2(f11 - (getHeight() / 2), f10 - (getWidth() / 2)));
        int i = degrees + 90;
        return i < 0 ? degrees + 450 : i;
    }

    public final int b(int i) {
        return i == 2 ? Math.round(this.f9964t * 0.66f) : this.f9964t;
    }

    public final void c(float f10, boolean z10) {
        ValueAnimator valueAnimator = this.f9948c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z10) {
            d(f10, false);
            return;
        }
        float f11 = this.f9960p;
        if (Math.abs(f11 - f10) > 180.0f) {
            if (f11 > 180.0f && f10 < 180.0f) {
                f10 += 360.0f;
            }
            if (f11 < 180.0f && f10 > 180.0f) {
                f11 += 360.0f;
            }
        }
        Pair pair = new Pair(Float.valueOf(f11), Float.valueOf(f10));
        valueAnimator.setFloatValues(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
        valueAnimator.setDuration(this.f9946a);
        valueAnimator.setInterpolator(this.f9947b);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i = ClockHandView.f9945v;
                ClockHandView clockHandView = ClockHandView.this;
                clockHandView.getClass();
                clockHandView.d(((Float) valueAnimator2.getAnimatedValue()).floatValue(), true);
            }
        });
        valueAnimator.addListener(new a());
        valueAnimator.start();
    }

    public final void d(float f10, boolean z10) {
        float f11 = f10 % 360.0f;
        this.f9960p = f11;
        this.f9963s = Math.toRadians(f11 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float b9 = b(this.f9965u);
        float cos = (((float) Math.cos(this.f9963s)) * b9) + width;
        float sin = (b9 * ((float) Math.sin(this.f9963s))) + height;
        float f12 = this.f9955k;
        this.f9958n.set(cos - f12, sin - f12, cos + f12, sin + f12);
        Iterator it = this.f9954j.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b(f11, z10);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f10 = width;
        float b9 = b(this.f9965u);
        float cos = (((float) Math.cos(this.f9963s)) * b9) + f10;
        float f11 = height;
        float sin = (b9 * ((float) Math.sin(this.f9963s))) + f11;
        Paint paint = this.f9957m;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.f9955k, paint);
        double sin2 = Math.sin(this.f9963s);
        paint.setStrokeWidth(this.f9959o);
        canvas.drawLine(f10, f11, width + ((int) (Math.cos(this.f9963s) * r12)), height + ((int) (r12 * sin2)), paint);
        canvas.drawCircle(f10, f11, this.f9956l, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i, int i9, int i10, int i11) {
        super.onLayout(z10, i, i9, i10, i11);
        if (this.f9948c.isRunning()) {
            return;
        }
        c(this.f9960p, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dd  */
    @Override // android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.timepicker.ClockHandView.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

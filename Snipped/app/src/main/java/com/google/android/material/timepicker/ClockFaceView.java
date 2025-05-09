package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.timepicker.ClockHandView;
import com.luminary.mobile.R;
import java.util.Arrays;
import k0.C0913a;
import t2.C1279a;
import y0.C1596C;
import z0.C1638d;

/* loaded from: classes.dex */
class ClockFaceView extends h implements ClockHandView.c {

    /* renamed from: d, reason: collision with root package name */
    public final ClockHandView f9931d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f9932e;

    /* renamed from: f, reason: collision with root package name */
    public final RectF f9933f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f9934g;

    /* renamed from: h, reason: collision with root package name */
    public final SparseArray<TextView> f9935h;
    public final c i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f9936j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f9937k;

    /* renamed from: l, reason: collision with root package name */
    public final int f9938l;

    /* renamed from: m, reason: collision with root package name */
    public final int f9939m;

    /* renamed from: n, reason: collision with root package name */
    public final int f9940n;

    /* renamed from: o, reason: collision with root package name */
    public final int f9941o;

    /* renamed from: p, reason: collision with root package name */
    public String[] f9942p;

    /* renamed from: q, reason: collision with root package name */
    public float f9943q;

    /* renamed from: r, reason: collision with root package name */
    public final ColorStateList f9944r;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f9932e = new Rect();
        this.f9933f = new RectF();
        this.f9934g = new Rect();
        this.f9935h = new SparseArray<>();
        this.f9937k = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1279a.f27493k, R.attr.materialClockStyle, 2132083937);
        Resources resources = getResources();
        ColorStateList b9 = P2.c.b(obtainStyledAttributes, context, 1);
        this.f9944r = b9;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f9931d = clockHandView;
        this.f9938l = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = b9.getColorForState(new int[]{android.R.attr.state_selected}, b9.getDefaultColor());
        this.f9936j = new int[]{colorForState, colorForState, b9.getDefaultColor()};
        clockHandView.f9954j.add(this);
        int defaultColor = C0913a.getColorStateList(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList b10 = P2.c.b(obtainStyledAttributes, context, 0);
        setBackgroundColor(b10 != null ? b10.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.i = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        d(strArr, 0);
        this.f9939m = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f9940n = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f9941o = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.h
    public final void a() {
        super.a();
        int i = 0;
        while (true) {
            SparseArray<TextView> sparseArray = this.f9935h;
            if (i >= sparseArray.size()) {
                return;
            }
            sparseArray.get(i).setVisibility(0);
            i++;
        }
    }

    @Override // com.google.android.material.timepicker.ClockHandView.c
    public final void b(float f10, boolean z10) {
        if (Math.abs(this.f9943q - f10) > 0.001f) {
            this.f9943q = f10;
            c();
        }
    }

    public final void c() {
        SparseArray<TextView> sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.f9931d.f9958n;
        float f10 = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.f9935h;
            int size = sparseArray.size();
            rectF = this.f9933f;
            rect = this.f9932e;
            if (i >= size) {
                break;
            }
            TextView textView2 = sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f10) {
                    textView = textView2;
                    f10 = height;
                }
            }
            i++;
        }
        for (int i9 = 0; i9 < sparseArray.size(); i9++) {
            TextView textView3 = sparseArray.get(i9);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f9934g);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f9936j, this.f9937k, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    public final void d(String[] strArr, int i) {
        this.f9942p = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        SparseArray<TextView> sparseArray = this.f9935h;
        int size = sparseArray.size();
        boolean z10 = false;
        for (int i9 = 0; i9 < Math.max(this.f9942p.length, size); i9++) {
            TextView textView = sparseArray.get(i9);
            if (i9 >= this.f9942p.length) {
                removeView(textView);
                sparseArray.remove(i9);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i9, textView);
                    addView(textView);
                }
                textView.setText(this.f9942p[i9]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i9));
                int i10 = (i9 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i10));
                if (i10 > 1) {
                    z10 = true;
                }
                C1596C.o(textView, this.i);
                textView.setTextColor(this.f9944r);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, this.f9942p[i9]));
                }
            }
        }
        ClockHandView clockHandView = this.f9931d;
        if (clockHandView.i && !z10) {
            clockHandView.f9965u = 1;
        }
        clockHandView.i = z10;
        clockHandView.invalidate();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C1638d.e.a(1, this.f9942p.length, 1, false).f31233a);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i, int i9, int i10, int i11) {
        super.onLayout(z10, i, i9, i10, i11);
        c();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i9) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.f9941o / Math.max(Math.max(this.f9939m / displayMetrics.heightPixels, this.f9940n / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}

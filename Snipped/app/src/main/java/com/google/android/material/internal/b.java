package com.google.android.material.internal;

import C.v;
import P2.a;
import P2.d;
import P2.f;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import java.util.WeakHashMap;
import pa.C1124b;
import u2.C1512a;
import v0.e;
import y0.C1596C;
import y0.E;

/* compiled from: CollapsingTextHelper.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: A, reason: collision with root package name */
    public Typeface f9623A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f9624B;

    /* renamed from: C, reason: collision with root package name */
    public Typeface f9625C;

    /* renamed from: D, reason: collision with root package name */
    public P2.a f9626D;

    /* renamed from: E, reason: collision with root package name */
    public P2.a f9627E;

    /* renamed from: G, reason: collision with root package name */
    public CharSequence f9629G;

    /* renamed from: H, reason: collision with root package name */
    public CharSequence f9630H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f9631I;

    /* renamed from: K, reason: collision with root package name */
    public Bitmap f9633K;

    /* renamed from: L, reason: collision with root package name */
    public float f9634L;

    /* renamed from: M, reason: collision with root package name */
    public float f9635M;

    /* renamed from: N, reason: collision with root package name */
    public float f9636N;

    /* renamed from: O, reason: collision with root package name */
    public float f9637O;

    /* renamed from: P, reason: collision with root package name */
    public float f9638P;

    /* renamed from: Q, reason: collision with root package name */
    public int f9639Q;
    public int[] R;
    public boolean S;
    public final TextPaint T;
    public final TextPaint U;
    public TimeInterpolator V;
    public TimeInterpolator W;
    public float X;
    public float Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f9640Z;

    /* renamed from: a, reason: collision with root package name */
    public final View f9641a;

    /* renamed from: a0, reason: collision with root package name */
    public ColorStateList f9642a0;

    /* renamed from: b, reason: collision with root package name */
    public float f9643b;

    /* renamed from: b0, reason: collision with root package name */
    public float f9644b0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9645c;

    /* renamed from: c0, reason: collision with root package name */
    public float f9646c0;

    /* renamed from: d, reason: collision with root package name */
    public float f9647d;

    /* renamed from: d0, reason: collision with root package name */
    public float f9648d0;

    /* renamed from: e, reason: collision with root package name */
    public float f9649e;

    /* renamed from: e0, reason: collision with root package name */
    public ColorStateList f9650e0;

    /* renamed from: f, reason: collision with root package name */
    public int f9651f;

    /* renamed from: f0, reason: collision with root package name */
    public float f9652f0;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f9653g;

    /* renamed from: g0, reason: collision with root package name */
    public float f9654g0;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f9655h;

    /* renamed from: h0, reason: collision with root package name */
    public float f9656h0;
    public final RectF i;

    /* renamed from: i0, reason: collision with root package name */
    public StaticLayout f9657i0;

    /* renamed from: j0, reason: collision with root package name */
    public float f9659j0;

    /* renamed from: k0, reason: collision with root package name */
    public float f9661k0;

    /* renamed from: l0, reason: collision with root package name */
    public float f9663l0;

    /* renamed from: m0, reason: collision with root package name */
    public CharSequence f9665m0;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f9666n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f9668o;

    /* renamed from: p, reason: collision with root package name */
    public int f9670p;

    /* renamed from: q, reason: collision with root package name */
    public float f9672q;

    /* renamed from: r, reason: collision with root package name */
    public float f9674r;

    /* renamed from: s, reason: collision with root package name */
    public float f9675s;

    /* renamed from: t, reason: collision with root package name */
    public float f9676t;

    /* renamed from: u, reason: collision with root package name */
    public float f9677u;

    /* renamed from: v, reason: collision with root package name */
    public float f9678v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f9679w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f9680x;

    /* renamed from: y, reason: collision with root package name */
    public Typeface f9681y;

    /* renamed from: z, reason: collision with root package name */
    public Typeface f9682z;

    /* renamed from: j, reason: collision with root package name */
    public int f9658j = 16;

    /* renamed from: k, reason: collision with root package name */
    public int f9660k = 16;

    /* renamed from: l, reason: collision with root package name */
    public float f9662l = 15.0f;

    /* renamed from: m, reason: collision with root package name */
    public float f9664m = 15.0f;

    /* renamed from: F, reason: collision with root package name */
    public TextUtils.TruncateAt f9628F = TextUtils.TruncateAt.END;

    /* renamed from: J, reason: collision with root package name */
    public boolean f9632J = true;

    /* renamed from: n0, reason: collision with root package name */
    public int f9667n0 = 1;

    /* renamed from: o0, reason: collision with root package name */
    public float f9669o0 = 0.0f;

    /* renamed from: p0, reason: collision with root package name */
    public float f9671p0 = 1.0f;

    /* renamed from: q0, reason: collision with root package name */
    public int f9673q0 = 1;

    /* compiled from: CollapsingTextHelper.java */
    public class a implements a.InterfaceC0036a {
        public a() {
        }

        @Override // P2.a.InterfaceC0036a
        public final void a(Typeface typeface) {
            b bVar = b.this;
            if (bVar.m(typeface)) {
                bVar.i(false);
            }
        }
    }

    /* compiled from: CollapsingTextHelper.java */
    /* renamed from: com.google.android.material.internal.b$b, reason: collision with other inner class name */
    public class C0105b implements a.InterfaceC0036a {
        public C0105b() {
        }

        @Override // P2.a.InterfaceC0036a
        public final void a(Typeface typeface) {
            b bVar = b.this;
            if (bVar.o(typeface)) {
                bVar.i(false);
            }
        }
    }

    public b(View view) {
        this.f9641a = view;
        TextPaint textPaint = new TextPaint(129);
        this.T = textPaint;
        this.U = new TextPaint(textPaint);
        this.f9655h = new Rect();
        this.f9653g = new Rect();
        this.i = new RectF();
        float f10 = this.f9647d;
        this.f9649e = com.google.android.gms.measurement.internal.a.d(1.0f, f10, 0.5f, f10);
        h(view.getContext().getResources().getConfiguration());
    }

    public static int a(int i, float f10, int i9) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i9) * f10) + (Color.alpha(i) * f11)), Math.round((Color.red(i9) * f10) + (Color.red(i) * f11)), Math.round((Color.green(i9) * f10) + (Color.green(i) * f11)), Math.round((Color.blue(i9) * f10) + (Color.blue(i) * f11)));
    }

    public static float g(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return C1512a.a(f10, f11, f12);
    }

    public final boolean b(CharSequence charSequence) {
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        boolean z10 = this.f9641a.getLayoutDirection() == 1;
        if (this.f9632J) {
            return (z10 ? e.f30529d : e.f30528c).b(charSequence.length(), charSequence);
        }
        return z10;
    }

    public final void c(float f10, boolean z10) {
        float f11;
        float f12;
        Typeface typeface;
        boolean z11;
        Layout.Alignment alignment;
        if (this.f9629G == null) {
            return;
        }
        float width = this.f9655h.width();
        float width2 = this.f9653g.width();
        if (Math.abs(f10 - 1.0f) < 1.0E-5f) {
            f11 = this.f9664m;
            f12 = this.f9652f0;
            this.f9634L = 1.0f;
            typeface = this.f9679w;
        } else {
            float f13 = this.f9662l;
            float f14 = this.f9654g0;
            Typeface typeface2 = this.f9682z;
            if (Math.abs(f10 - 0.0f) < 1.0E-5f) {
                this.f9634L = 1.0f;
            } else {
                this.f9634L = g(this.f9662l, this.f9664m, f10, this.W) / this.f9662l;
            }
            float f15 = this.f9664m / this.f9662l;
            width = (z10 || this.f9645c || width2 * f15 <= width) ? width2 : Math.min(width / f15, width2);
            f11 = f13;
            f12 = f14;
            typeface = typeface2;
        }
        TextPaint textPaint = this.T;
        if (width > 0.0f) {
            boolean z12 = this.f9635M != f11;
            boolean z13 = this.f9656h0 != f12;
            boolean z14 = this.f9625C != typeface;
            StaticLayout staticLayout = this.f9657i0;
            boolean z15 = z12 || z13 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z14 || this.S;
            this.f9635M = f11;
            this.f9656h0 = f12;
            this.f9625C = typeface;
            this.S = false;
            textPaint.setLinearText(this.f9634L != 1.0f);
            z11 = z15;
        } else {
            z11 = false;
        }
        if (this.f9630H == null || z11) {
            textPaint.setTextSize(this.f9635M);
            textPaint.setTypeface(this.f9625C);
            textPaint.setLetterSpacing(this.f9656h0);
            boolean b9 = b(this.f9629G);
            this.f9631I = b9;
            int i = this.f9667n0;
            if (i <= 1 || (b9 && !this.f9645c)) {
                i = 1;
            }
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f9658j, b9 ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f9631I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f9631I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            StaticLayoutBuilderCompat staticLayoutBuilderCompat = new StaticLayoutBuilderCompat(this.f9629G, textPaint, (int) width);
            staticLayoutBuilderCompat.f9620l = this.f9628F;
            staticLayoutBuilderCompat.f9619k = b9;
            staticLayoutBuilderCompat.f9614e = alignment;
            staticLayoutBuilderCompat.f9618j = false;
            staticLayoutBuilderCompat.f9615f = i;
            float f16 = this.f9669o0;
            float f17 = this.f9671p0;
            staticLayoutBuilderCompat.f9616g = f16;
            staticLayoutBuilderCompat.f9617h = f17;
            staticLayoutBuilderCompat.i = this.f9673q0;
            StaticLayout a10 = staticLayoutBuilderCompat.a();
            a10.getClass();
            this.f9657i0 = a10;
            this.f9630H = a10.getText();
        }
    }

    public final void d(Canvas canvas) {
        int save = canvas.save();
        if (this.f9630H != null) {
            RectF rectF = this.i;
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            TextPaint textPaint = this.T;
            textPaint.setTextSize(this.f9635M);
            float f10 = this.f9677u;
            float f11 = this.f9678v;
            float f12 = this.f9634L;
            if (f12 != 1.0f && !this.f9645c) {
                canvas.scale(f12, f12, f10, f11);
            }
            if (this.f9667n0 <= 1 || ((this.f9631I && !this.f9645c) || (this.f9645c && this.f9643b <= this.f9649e))) {
                canvas.translate(f10, f11);
                this.f9657i0.draw(canvas);
            } else {
                float lineStart = this.f9677u - this.f9657i0.getLineStart(0);
                int alpha = textPaint.getAlpha();
                canvas.translate(lineStart, f11);
                if (!this.f9645c) {
                    textPaint.setAlpha((int) (this.f9663l0 * alpha));
                    if (Build.VERSION.SDK_INT >= 31) {
                        textPaint.setShadowLayer(this.f9636N, this.f9637O, this.f9638P, D9.b.m(this.f9639Q, textPaint.getAlpha()));
                    }
                    this.f9657i0.draw(canvas);
                }
                if (!this.f9645c) {
                    textPaint.setAlpha((int) (this.f9661k0 * alpha));
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 31) {
                    textPaint.setShadowLayer(this.f9636N, this.f9637O, this.f9638P, D9.b.m(this.f9639Q, textPaint.getAlpha()));
                }
                int lineBaseline = this.f9657i0.getLineBaseline(0);
                CharSequence charSequence = this.f9665m0;
                float f13 = lineBaseline;
                canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f13, textPaint);
                if (i >= 31) {
                    textPaint.setShadowLayer(this.f9636N, this.f9637O, this.f9638P, this.f9639Q);
                }
                if (!this.f9645c) {
                    String trim = this.f9665m0.toString().trim();
                    if (trim.endsWith("…")) {
                        trim = v.j(1, 0, trim);
                    }
                    String str = trim;
                    textPaint.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(this.f9657i0.getLineEnd(0), str.length()), 0.0f, f13, (Paint) textPaint);
                }
            }
            canvas.restoreToCount(save);
        }
    }

    public final float e() {
        TextPaint textPaint = this.U;
        textPaint.setTextSize(this.f9664m);
        textPaint.setTypeface(this.f9679w);
        textPaint.setLetterSpacing(this.f9652f0);
        return -textPaint.ascent();
    }

    public final int f(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.R;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void h(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f9681y;
            if (typeface != null) {
                this.f9680x = f.a(configuration, typeface);
            }
            Typeface typeface2 = this.f9624B;
            if (typeface2 != null) {
                this.f9623A = f.a(configuration, typeface2);
            }
            Typeface typeface3 = this.f9680x;
            if (typeface3 == null) {
                typeface3 = this.f9681y;
            }
            this.f9679w = typeface3;
            Typeface typeface4 = this.f9623A;
            if (typeface4 == null) {
                typeface4 = this.f9624B;
            }
            this.f9682z = typeface4;
            i(true);
        }
    }

    public final void i(boolean z10) {
        float measureText;
        float f10;
        StaticLayout staticLayout;
        View view = this.f9641a;
        if ((view.getHeight() <= 0 || view.getWidth() <= 0) && !z10) {
            return;
        }
        c(1.0f, z10);
        CharSequence charSequence = this.f9630H;
        TextPaint textPaint = this.T;
        if (charSequence != null && (staticLayout = this.f9657i0) != null) {
            this.f9665m0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f9628F);
        }
        CharSequence charSequence2 = this.f9665m0;
        if (charSequence2 != null) {
            this.f9659j0 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f9659j0 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f9660k, this.f9631I ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.f9655h;
        if (i == 48) {
            this.f9674r = rect.top;
        } else if (i != 80) {
            this.f9674r = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f9674r = textPaint.ascent() + rect.bottom;
        }
        int i9 = absoluteGravity & 8388615;
        if (i9 == 1) {
            this.f9676t = rect.centerX() - (this.f9659j0 / 2.0f);
        } else if (i9 != 5) {
            this.f9676t = rect.left;
        } else {
            this.f9676t = rect.right - this.f9659j0;
        }
        c(0.0f, z10);
        float height = this.f9657i0 != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f9657i0;
        if (staticLayout2 == null || this.f9667n0 <= 1) {
            CharSequence charSequence3 = this.f9630H;
            measureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            measureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f9657i0;
        this.f9670p = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f9658j, this.f9631I ? 1 : 0);
        int i10 = absoluteGravity2 & 112;
        Rect rect2 = this.f9653g;
        if (i10 == 48) {
            this.f9672q = rect2.top;
        } else if (i10 != 80) {
            this.f9672q = rect2.centerY() - (height / 2.0f);
        } else {
            this.f9672q = textPaint.descent() + (rect2.bottom - height);
        }
        int i11 = absoluteGravity2 & 8388615;
        if (i11 == 1) {
            this.f9675s = rect2.centerX() - (measureText / 2.0f);
        } else if (i11 != 5) {
            this.f9675s = rect2.left;
        } else {
            this.f9675s = rect2.right - measureText;
        }
        Bitmap bitmap = this.f9633K;
        if (bitmap != null) {
            bitmap.recycle();
            this.f9633K = null;
        }
        q(this.f9643b);
        float f11 = this.f9643b;
        boolean z11 = this.f9645c;
        RectF rectF = this.i;
        if (z11) {
            if (f11 < this.f9649e) {
                rect = rect2;
            }
            rectF.set(rect);
        } else {
            rectF.left = g(rect2.left, rect.left, f11, this.V);
            rectF.top = g(this.f9672q, this.f9674r, f11, this.V);
            rectF.right = g(rect2.right, rect.right, f11, this.V);
            rectF.bottom = g(rect2.bottom, rect.bottom, f11, this.V);
        }
        if (!this.f9645c) {
            this.f9677u = g(this.f9675s, this.f9676t, f11, this.V);
            this.f9678v = g(this.f9672q, this.f9674r, f11, this.V);
            q(f11);
            f10 = f11;
        } else if (f11 < this.f9649e) {
            this.f9677u = this.f9675s;
            this.f9678v = this.f9672q;
            q(0.0f);
            f10 = 0.0f;
        } else {
            this.f9677u = this.f9676t;
            this.f9678v = this.f9674r - Math.max(0, this.f9651f);
            q(1.0f);
            f10 = 1.0f;
        }
        P0.a aVar = C1512a.f30142b;
        this.f9661k0 = 1.0f - g(0.0f, 1.0f, 1.0f - f11, aVar);
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        view.postInvalidateOnAnimation();
        this.f9663l0 = g(1.0f, 0.0f, f11, aVar);
        view.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f9668o;
        ColorStateList colorStateList2 = this.f9666n;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(f(colorStateList2), f10, f(this.f9668o)));
        } else {
            textPaint.setColor(f(colorStateList));
        }
        int i12 = Build.VERSION.SDK_INT;
        float f12 = this.f9652f0;
        float f13 = this.f9654g0;
        if (f12 != f13) {
            textPaint.setLetterSpacing(g(f13, f12, f11, aVar));
        } else {
            textPaint.setLetterSpacing(f12);
        }
        this.f9636N = g(this.f9644b0, this.X, f11, null);
        this.f9637O = g(this.f9646c0, this.Y, f11, null);
        this.f9638P = g(this.f9648d0, this.f9640Z, f11, null);
        int a10 = a(f(this.f9650e0), f11, f(this.f9642a0));
        this.f9639Q = a10;
        textPaint.setShadowLayer(this.f9636N, this.f9637O, this.f9638P, a10);
        if (this.f9645c) {
            int alpha = textPaint.getAlpha();
            float f14 = this.f9649e;
            textPaint.setAlpha((int) ((f11 <= f14 ? C1512a.b(1.0f, 0.0f, this.f9647d, f14, f11) : C1512a.b(0.0f, 1.0f, f14, 1.0f, f11)) * alpha));
            if (i12 >= 31) {
                textPaint.setShadowLayer(this.f9636N, this.f9637O, this.f9638P, D9.b.m(this.f9639Q, textPaint.getAlpha()));
            }
        }
        view.postInvalidateOnAnimation();
    }

    public final void j(ColorStateList colorStateList) {
        if (this.f9668o == colorStateList && this.f9666n == colorStateList) {
            return;
        }
        this.f9668o = colorStateList;
        this.f9666n = colorStateList;
        i(false);
    }

    public final void k(int i) {
        View view = this.f9641a;
        d dVar = new d(view.getContext(), i);
        ColorStateList colorStateList = dVar.f3060j;
        if (colorStateList != null) {
            this.f9668o = colorStateList;
        }
        float f10 = dVar.f3061k;
        if (f10 != 0.0f) {
            this.f9664m = f10;
        }
        ColorStateList colorStateList2 = dVar.f3052a;
        if (colorStateList2 != null) {
            this.f9642a0 = colorStateList2;
        }
        this.Y = dVar.f3056e;
        this.f9640Z = dVar.f3057f;
        this.X = dVar.f3058g;
        this.f9652f0 = dVar.i;
        P2.a aVar = this.f9627E;
        if (aVar != null) {
            aVar.f3051c = true;
        }
        a aVar2 = new a();
        dVar.a();
        this.f9627E = new P2.a(aVar2, dVar.f3064n);
        dVar.c(view.getContext(), this.f9627E);
        i(false);
    }

    public final void l(int i) {
        if (this.f9660k != i) {
            this.f9660k = i;
            i(false);
        }
    }

    public final boolean m(Typeface typeface) {
        P2.a aVar = this.f9627E;
        if (aVar != null) {
            aVar.f3051c = true;
        }
        if (this.f9681y == typeface) {
            return false;
        }
        this.f9681y = typeface;
        Typeface a10 = f.a(this.f9641a.getContext().getResources().getConfiguration(), typeface);
        this.f9680x = a10;
        if (a10 == null) {
            a10 = this.f9681y;
        }
        this.f9679w = a10;
        return true;
    }

    public final void n(int i) {
        View view = this.f9641a;
        d dVar = new d(view.getContext(), i);
        ColorStateList colorStateList = dVar.f3060j;
        if (colorStateList != null) {
            this.f9666n = colorStateList;
        }
        float f10 = dVar.f3061k;
        if (f10 != 0.0f) {
            this.f9662l = f10;
        }
        ColorStateList colorStateList2 = dVar.f3052a;
        if (colorStateList2 != null) {
            this.f9650e0 = colorStateList2;
        }
        this.f9646c0 = dVar.f3056e;
        this.f9648d0 = dVar.f3057f;
        this.f9644b0 = dVar.f3058g;
        this.f9654g0 = dVar.i;
        P2.a aVar = this.f9626D;
        if (aVar != null) {
            aVar.f3051c = true;
        }
        C0105b c0105b = new C0105b();
        dVar.a();
        this.f9626D = new P2.a(c0105b, dVar.f3064n);
        dVar.c(view.getContext(), this.f9626D);
        i(false);
    }

    public final boolean o(Typeface typeface) {
        P2.a aVar = this.f9626D;
        if (aVar != null) {
            aVar.f3051c = true;
        }
        if (this.f9624B == typeface) {
            return false;
        }
        this.f9624B = typeface;
        Typeface a10 = f.a(this.f9641a.getContext().getResources().getConfiguration(), typeface);
        this.f9623A = a10;
        if (a10 == null) {
            a10 = this.f9624B;
        }
        this.f9682z = a10;
        return true;
    }

    public final void p(float f10) {
        float f11;
        float r8 = C1124b.r(f10, 0.0f, 1.0f);
        if (r8 != this.f9643b) {
            this.f9643b = r8;
            boolean z10 = this.f9645c;
            RectF rectF = this.i;
            Rect rect = this.f9655h;
            Rect rect2 = this.f9653g;
            if (z10) {
                if (r8 < this.f9649e) {
                    rect = rect2;
                }
                rectF.set(rect);
            } else {
                rectF.left = g(rect2.left, rect.left, r8, this.V);
                rectF.top = g(this.f9672q, this.f9674r, r8, this.V);
                rectF.right = g(rect2.right, rect.right, r8, this.V);
                rectF.bottom = g(rect2.bottom, rect.bottom, r8, this.V);
            }
            if (!this.f9645c) {
                this.f9677u = g(this.f9675s, this.f9676t, r8, this.V);
                this.f9678v = g(this.f9672q, this.f9674r, r8, this.V);
                q(r8);
                f11 = r8;
            } else if (r8 < this.f9649e) {
                this.f9677u = this.f9675s;
                this.f9678v = this.f9672q;
                q(0.0f);
                f11 = 0.0f;
            } else {
                this.f9677u = this.f9676t;
                this.f9678v = this.f9674r - Math.max(0, this.f9651f);
                q(1.0f);
                f11 = 1.0f;
            }
            P0.a aVar = C1512a.f30142b;
            this.f9661k0 = 1.0f - g(0.0f, 1.0f, 1.0f - r8, aVar);
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            View view = this.f9641a;
            view.postInvalidateOnAnimation();
            this.f9663l0 = g(1.0f, 0.0f, r8, aVar);
            view.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f9668o;
            ColorStateList colorStateList2 = this.f9666n;
            TextPaint textPaint = this.T;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f(colorStateList2), f11, f(this.f9668o)));
            } else {
                textPaint.setColor(f(colorStateList));
            }
            int i = Build.VERSION.SDK_INT;
            float f12 = this.f9652f0;
            float f13 = this.f9654g0;
            if (f12 != f13) {
                textPaint.setLetterSpacing(g(f13, f12, r8, aVar));
            } else {
                textPaint.setLetterSpacing(f12);
            }
            this.f9636N = g(this.f9644b0, this.X, r8, null);
            this.f9637O = g(this.f9646c0, this.Y, r8, null);
            this.f9638P = g(this.f9648d0, this.f9640Z, r8, null);
            int a10 = a(f(this.f9650e0), r8, f(this.f9642a0));
            this.f9639Q = a10;
            textPaint.setShadowLayer(this.f9636N, this.f9637O, this.f9638P, a10);
            if (this.f9645c) {
                int alpha = textPaint.getAlpha();
                float f14 = this.f9649e;
                textPaint.setAlpha((int) ((r8 <= f14 ? C1512a.b(1.0f, 0.0f, this.f9647d, f14, r8) : C1512a.b(0.0f, 1.0f, f14, 1.0f, r8)) * alpha));
                if (i >= 31) {
                    textPaint.setShadowLayer(this.f9636N, this.f9637O, this.f9638P, D9.b.m(this.f9639Q, textPaint.getAlpha()));
                }
            }
            view.postInvalidateOnAnimation();
        }
    }

    public final void q(float f10) {
        c(f10, false);
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        this.f9641a.postInvalidateOnAnimation();
    }
}

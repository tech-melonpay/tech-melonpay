package com.google.android.material.chip;

import J2.f;
import J2.k;
import P2.d;
import T2.f;
import T2.i;
import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import o0.b;
import u2.C1517f;

/* compiled from: ChipDrawable.java */
/* loaded from: classes.dex */
public final class a extends f implements Drawable.Callback, f.b {

    /* renamed from: I0, reason: collision with root package name */
    public static final int[] f9309I0 = {R.attr.state_enabled};

    /* renamed from: J0, reason: collision with root package name */
    public static final ShapeDrawable f9310J0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A, reason: collision with root package name */
    public float f9311A;

    /* renamed from: A0, reason: collision with root package name */
    public int[] f9312A0;

    /* renamed from: B, reason: collision with root package name */
    public float f9313B;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f9314B0;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f9315C;

    /* renamed from: C0, reason: collision with root package name */
    public ColorStateList f9316C0;

    /* renamed from: D, reason: collision with root package name */
    public float f9317D;

    /* renamed from: D0, reason: collision with root package name */
    public WeakReference<InterfaceC0103a> f9318D0;

    /* renamed from: E, reason: collision with root package name */
    public ColorStateList f9319E;

    /* renamed from: E0, reason: collision with root package name */
    public TextUtils.TruncateAt f9320E0;

    /* renamed from: F, reason: collision with root package name */
    public CharSequence f9321F;

    /* renamed from: F0, reason: collision with root package name */
    public boolean f9322F0;

    /* renamed from: G, reason: collision with root package name */
    public boolean f9323G;

    /* renamed from: G0, reason: collision with root package name */
    public int f9324G0;

    /* renamed from: H, reason: collision with root package name */
    public Drawable f9325H;

    /* renamed from: H0, reason: collision with root package name */
    public boolean f9326H0;

    /* renamed from: I, reason: collision with root package name */
    public ColorStateList f9327I;

    /* renamed from: J, reason: collision with root package name */
    public float f9328J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f9329K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f9330L;

    /* renamed from: M, reason: collision with root package name */
    public Drawable f9331M;

    /* renamed from: N, reason: collision with root package name */
    public RippleDrawable f9332N;

    /* renamed from: O, reason: collision with root package name */
    public ColorStateList f9333O;

    /* renamed from: P, reason: collision with root package name */
    public float f9334P;

    /* renamed from: Q, reason: collision with root package name */
    public SpannableStringBuilder f9335Q;
    public boolean R;
    public boolean S;
    public Drawable T;
    public ColorStateList U;
    public C1517f V;
    public C1517f W;
    public float X;
    public float Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f9336Z;

    /* renamed from: a0, reason: collision with root package name */
    public float f9337a0;

    /* renamed from: b0, reason: collision with root package name */
    public float f9338b0;

    /* renamed from: c0, reason: collision with root package name */
    public float f9339c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f9340d0;

    /* renamed from: f0, reason: collision with root package name */
    public float f9341f0;

    /* renamed from: g0, reason: collision with root package name */
    public final Context f9342g0;

    /* renamed from: h0, reason: collision with root package name */
    public final Paint f9343h0;

    /* renamed from: i0, reason: collision with root package name */
    public final Paint.FontMetrics f9344i0;

    /* renamed from: j0, reason: collision with root package name */
    public final RectF f9345j0;

    /* renamed from: k0, reason: collision with root package name */
    public final PointF f9346k0;

    /* renamed from: l0, reason: collision with root package name */
    public final Path f9347l0;

    /* renamed from: m0, reason: collision with root package name */
    public final J2.f f9348m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f9349n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f9350o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f9351p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f9352q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f9353r0;
    public int s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f9354t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f9355u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f9356v0;

    /* renamed from: w0, reason: collision with root package name */
    public ColorFilter f9357w0;

    /* renamed from: x0, reason: collision with root package name */
    public PorterDuffColorFilter f9358x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f9359y;

    /* renamed from: y0, reason: collision with root package name */
    public ColorStateList f9360y0;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f9361z;

    /* renamed from: z0, reason: collision with root package name */
    public PorterDuff.Mode f9362z0;

    /* compiled from: ChipDrawable.java */
    /* renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    public interface InterfaceC0103a {
        void a();
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.luminary.mobile.R.attr.chipStyle, 2132083859);
        this.f9313B = -1.0f;
        this.f9343h0 = new Paint(1);
        this.f9344i0 = new Paint.FontMetrics();
        this.f9345j0 = new RectF();
        this.f9346k0 = new PointF();
        this.f9347l0 = new Path();
        this.f9356v0 = 255;
        this.f9362z0 = PorterDuff.Mode.SRC_IN;
        this.f9318D0 = new WeakReference<>(null);
        k(context);
        this.f9342g0 = context;
        J2.f fVar = new J2.f(this);
        this.f9348m0 = fVar;
        this.f9321F = "";
        fVar.f2125a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f9309I0;
        setState(iArr);
        if (!Arrays.equals(this.f9312A0, iArr)) {
            this.f9312A0 = iArr;
            if (b0()) {
                E(getState(), iArr);
            }
        }
        this.f9322F0 = true;
        int[] iArr2 = Q2.a.f3179a;
        f9310J0.setTint(-1);
    }

    public static boolean B(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean C(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static void c0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public final float A() {
        return this.f9326H0 ? i() : this.f9313B;
    }

    public final void D() {
        InterfaceC0103a interfaceC0103a = this.f9318D0.get();
        if (interfaceC0103a != null) {
            interfaceC0103a.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean E(int[] r9, int[] r10) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.a.E(int[], int[]):boolean");
    }

    public final void F(boolean z10) {
        if (this.R != z10) {
            this.R = z10;
            float y10 = y();
            if (!z10 && this.f9354t0) {
                this.f9354t0 = false;
            }
            float y11 = y();
            invalidateSelf();
            if (y10 != y11) {
                D();
            }
        }
    }

    public final void G(Drawable drawable) {
        if (this.T != drawable) {
            float y10 = y();
            this.T = drawable;
            float y11 = y();
            c0(this.T);
            w(this.T);
            invalidateSelf();
            if (y10 != y11) {
                D();
            }
        }
    }

    public final void H(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.U != colorStateList) {
            this.U = colorStateList;
            if (this.S && (drawable = this.T) != null && this.R) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void I(boolean z10) {
        if (this.S != z10) {
            boolean Z10 = Z();
            this.S = z10;
            boolean Z11 = Z();
            if (Z10 != Z11) {
                if (Z11) {
                    w(this.T);
                } else {
                    c0(this.T);
                }
                invalidateSelf();
                D();
            }
        }
    }

    @Deprecated
    public final void J(float f10) {
        if (this.f9313B != f10) {
            this.f9313B = f10;
            i.a e10 = this.f3448a.f3471a.e();
            e10.c(f10);
            setShapeAppearanceModel(e10.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void K(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f9325H;
        if (drawable3 != 0) {
            boolean z10 = drawable3 instanceof b;
            drawable2 = drawable3;
            if (z10) {
                drawable2 = ((b) drawable3).b();
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float y10 = y();
            this.f9325H = drawable != null ? drawable.mutate() : null;
            float y11 = y();
            c0(drawable2);
            if (a0()) {
                w(this.f9325H);
            }
            invalidateSelf();
            if (y10 != y11) {
                D();
            }
        }
    }

    public final void L(float f10) {
        if (this.f9328J != f10) {
            float y10 = y();
            this.f9328J = f10;
            float y11 = y();
            invalidateSelf();
            if (y10 != y11) {
                D();
            }
        }
    }

    public final void M(ColorStateList colorStateList) {
        this.f9329K = true;
        if (this.f9327I != colorStateList) {
            this.f9327I = colorStateList;
            if (a0()) {
                this.f9325H.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void N(boolean z10) {
        if (this.f9323G != z10) {
            boolean a02 = a0();
            this.f9323G = z10;
            boolean a03 = a0();
            if (a02 != a03) {
                if (a03) {
                    w(this.f9325H);
                } else {
                    c0(this.f9325H);
                }
                invalidateSelf();
                D();
            }
        }
    }

    public final void O(ColorStateList colorStateList) {
        if (this.f9315C != colorStateList) {
            this.f9315C = colorStateList;
            if (this.f9326H0) {
                r(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void P(float f10) {
        if (this.f9317D != f10) {
            this.f9317D = f10;
            this.f9343h0.setStrokeWidth(f10);
            if (this.f9326H0) {
                s(f10);
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f9331M;
        if (drawable3 != 0) {
            boolean z10 = drawable3 instanceof b;
            drawable2 = drawable3;
            if (z10) {
                drawable2 = ((b) drawable3).b();
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float z11 = z();
            this.f9331M = drawable != null ? drawable.mutate() : null;
            int[] iArr = Q2.a.f3179a;
            this.f9332N = new RippleDrawable(Q2.a.c(this.f9319E), this.f9331M, f9310J0);
            float z12 = z();
            c0(drawable2);
            if (b0()) {
                w(this.f9331M);
            }
            invalidateSelf();
            if (z11 != z12) {
                D();
            }
        }
    }

    public final void R(float f10) {
        if (this.f9340d0 != f10) {
            this.f9340d0 = f10;
            invalidateSelf();
            if (b0()) {
                D();
            }
        }
    }

    public final void S(float f10) {
        if (this.f9334P != f10) {
            this.f9334P = f10;
            invalidateSelf();
            if (b0()) {
                D();
            }
        }
    }

    public final void T(float f10) {
        if (this.f9339c0 != f10) {
            this.f9339c0 = f10;
            invalidateSelf();
            if (b0()) {
                D();
            }
        }
    }

    public final void U(ColorStateList colorStateList) {
        if (this.f9333O != colorStateList) {
            this.f9333O = colorStateList;
            if (b0()) {
                this.f9331M.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void V(boolean z10) {
        if (this.f9330L != z10) {
            boolean b02 = b0();
            this.f9330L = z10;
            boolean b03 = b0();
            if (b02 != b03) {
                if (b03) {
                    w(this.f9331M);
                } else {
                    c0(this.f9331M);
                }
                invalidateSelf();
                D();
            }
        }
    }

    public final void W(float f10) {
        if (this.f9336Z != f10) {
            float y10 = y();
            this.f9336Z = f10;
            float y11 = y();
            invalidateSelf();
            if (y10 != y11) {
                D();
            }
        }
    }

    public final void X(float f10) {
        if (this.Y != f10) {
            float y10 = y();
            this.Y = f10;
            float y11 = y();
            invalidateSelf();
            if (y10 != y11) {
                D();
            }
        }
    }

    public final void Y(ColorStateList colorStateList) {
        if (this.f9319E != colorStateList) {
            this.f9319E = colorStateList;
            this.f9316C0 = this.f9314B0 ? Q2.a.c(colorStateList) : null;
            onStateChange(getState());
        }
    }

    public final boolean Z() {
        return this.S && this.T != null && this.f9354t0;
    }

    @Override // J2.f.b
    public final void a() {
        D();
        invalidateSelf();
    }

    public final boolean a0() {
        return this.f9323G && this.f9325H != null;
    }

    public final boolean b0() {
        return this.f9330L && this.f9331M != null;
    }

    @Override // T2.f, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        RectF rectF;
        int i9;
        int i10;
        int i11;
        RectF rectF2;
        float f10;
        int i12;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f9356v0) == 0) {
            return;
        }
        int saveLayerAlpha = i < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        boolean z10 = this.f9326H0;
        Paint paint = this.f9343h0;
        RectF rectF3 = this.f9345j0;
        if (!z10) {
            paint.setColor(this.f9349n0);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, A(), A(), paint);
        }
        if (!this.f9326H0) {
            paint.setColor(this.f9350o0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f9357w0;
            if (colorFilter == null) {
                colorFilter = this.f9358x0;
            }
            paint.setColorFilter(colorFilter);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, A(), A(), paint);
        }
        if (this.f9326H0) {
            super.draw(canvas);
        }
        if (this.f9317D > 0.0f && !this.f9326H0) {
            paint.setColor(this.f9352q0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f9326H0) {
                ColorFilter colorFilter2 = this.f9357w0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f9358x0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f11 = bounds.left;
            float f12 = this.f9317D / 2.0f;
            rectF3.set(f11 + f12, bounds.top + f12, bounds.right - f12, bounds.bottom - f12);
            float f13 = this.f9313B - (this.f9317D / 2.0f);
            canvas.drawRoundRect(rectF3, f13, f13, paint);
        }
        paint.setColor(this.f9353r0);
        paint.setStyle(Paint.Style.FILL);
        rectF3.set(bounds);
        if (this.f9326H0) {
            RectF rectF4 = new RectF(bounds);
            Path path = this.f9347l0;
            f.b bVar = this.f3448a;
            this.f3464r.a(bVar.f3471a, bVar.f3479j, rectF4, this.f3463q, path);
            f(canvas, paint, path, this.f3448a.f3471a, h());
        } else {
            canvas.drawRoundRect(rectF3, A(), A(), paint);
        }
        if (a0()) {
            x(bounds, rectF3);
            float f14 = rectF3.left;
            float f15 = rectF3.top;
            canvas.translate(f14, f15);
            this.f9325H.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f9325H.draw(canvas);
            canvas.translate(-f14, -f15);
        }
        if (Z()) {
            x(bounds, rectF3);
            float f16 = rectF3.left;
            float f17 = rectF3.top;
            canvas.translate(f16, f17);
            this.T.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.T.draw(canvas);
            canvas.translate(-f16, -f17);
        }
        if (!this.f9322F0 || this.f9321F == null) {
            rectF = rectF3;
            i9 = saveLayerAlpha;
            i10 = 0;
            i11 = 255;
        } else {
            PointF pointF = this.f9346k0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f9321F;
            J2.f fVar = this.f9348m0;
            if (charSequence != null) {
                float y10 = y() + this.X + this.f9337a0;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + y10;
                } else {
                    pointF.x = bounds.right - y10;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = fVar.f2125a;
                Paint.FontMetrics fontMetrics = this.f9344i0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF3.setEmpty();
            if (this.f9321F != null) {
                float y11 = y() + this.X + this.f9337a0;
                float z11 = z() + this.f9341f0 + this.f9338b0;
                if (getLayoutDirection() == 0) {
                    rectF3.left = bounds.left + y11;
                    rectF3.right = bounds.right - z11;
                } else {
                    rectF3.left = bounds.left + z11;
                    rectF3.right = bounds.right - y11;
                }
                rectF3.top = bounds.top;
                rectF3.bottom = bounds.bottom;
            }
            d dVar = fVar.f2131g;
            TextPaint textPaint2 = fVar.f2125a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                fVar.f2131g.e(this.f9342g0, textPaint2, fVar.f2126b);
            }
            textPaint2.setTextAlign(align);
            String charSequence2 = this.f9321F.toString();
            if (fVar.f2129e) {
                fVar.a(charSequence2);
                f10 = fVar.f2127c;
            } else {
                f10 = fVar.f2127c;
            }
            boolean z12 = Math.round(f10) > Math.round(rectF3.width());
            if (z12) {
                i12 = canvas.save();
                canvas.clipRect(rectF3);
            } else {
                i12 = 0;
            }
            CharSequence charSequence3 = this.f9321F;
            if (z12 && this.f9320E0 != null) {
                charSequence3 = TextUtils.ellipsize(charSequence3, textPaint2, rectF3.width(), this.f9320E0);
            }
            CharSequence charSequence4 = charSequence3;
            int length = charSequence4.length();
            float f18 = pointF.x;
            float f19 = pointF.y;
            rectF = rectF3;
            i9 = saveLayerAlpha;
            i10 = 0;
            i11 = 255;
            canvas.drawText(charSequence4, 0, length, f18, f19, textPaint2);
            if (z12) {
                canvas.restoreToCount(i12);
            }
        }
        if (b0()) {
            rectF.setEmpty();
            if (b0()) {
                float f20 = this.f9341f0 + this.f9340d0;
                if (getLayoutDirection() == 0) {
                    float f21 = bounds.right - f20;
                    rectF2 = rectF;
                    rectF2.right = f21;
                    rectF2.left = f21 - this.f9334P;
                } else {
                    rectF2 = rectF;
                    float f22 = bounds.left + f20;
                    rectF2.left = f22;
                    rectF2.right = f22 + this.f9334P;
                }
                float exactCenterY = bounds.exactCenterY();
                float f23 = this.f9334P;
                float f24 = exactCenterY - (f23 / 2.0f);
                rectF2.top = f24;
                rectF2.bottom = f24 + f23;
            } else {
                rectF2 = rectF;
            }
            float f25 = rectF2.left;
            float f26 = rectF2.top;
            canvas.translate(f25, f26);
            this.f9331M.setBounds(i10, i10, (int) rectF2.width(), (int) rectF2.height());
            int[] iArr = Q2.a.f3179a;
            this.f9332N.setBounds(this.f9331M.getBounds());
            this.f9332N.jumpToCurrentState();
            this.f9332N.draw(canvas);
            canvas.translate(-f25, -f26);
        }
        if (this.f9356v0 < i11) {
            canvas.restoreToCount(i9);
        }
    }

    @Override // T2.f, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f9356v0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f9357w0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f9311A;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f10;
        float y10 = y() + this.X + this.f9337a0;
        String charSequence = this.f9321F.toString();
        J2.f fVar = this.f9348m0;
        if (fVar.f2129e) {
            fVar.a(charSequence);
            f10 = fVar.f2127c;
        } else {
            f10 = fVar.f2127c;
        }
        return Math.min(Math.round(z() + f10 + y10 + this.f9338b0 + this.f9341f0), this.f9324G0);
    }

    @Override // T2.f, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // T2.f, android.graphics.drawable.Drawable
    @TargetApi(21)
    public final void getOutline(Outline outline) {
        if (this.f9326H0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f9311A, this.f9313B);
        } else {
            outline.setRoundRect(bounds, this.f9313B);
        }
        outline.setAlpha(this.f9356v0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // T2.f, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        d dVar;
        ColorStateList colorStateList;
        return B(this.f9359y) || B(this.f9361z) || B(this.f9315C) || (this.f9314B0 && B(this.f9316C0)) || (!((dVar = this.f9348m0.f2131g) == null || (colorStateList = dVar.f3060j) == null || !colorStateList.isStateful()) || ((this.S && this.T != null && this.R) || C(this.f9325H) || C(this.T) || B(this.f9360y0)));
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (a0()) {
            onLayoutDirectionChanged |= this.f9325H.setLayoutDirection(i);
        }
        if (Z()) {
            onLayoutDirectionChanged |= this.T.setLayoutDirection(i);
        }
        if (b0()) {
            onLayoutDirectionChanged |= this.f9331M.setLayoutDirection(i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (a0()) {
            onLevelChange |= this.f9325H.setLevel(i);
        }
        if (Z()) {
            onLevelChange |= this.T.setLevel(i);
        }
        if (b0()) {
            onLevelChange |= this.f9331M.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // T2.f, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f9326H0) {
            super.onStateChange(iArr);
        }
        return E(iArr, this.f9312A0);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // T2.f, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f9356v0 != i) {
            this.f9356v0 = i;
            invalidateSelf();
        }
    }

    @Override // T2.f, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f9357w0 != colorFilter) {
            this.f9357w0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // T2.f, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f9360y0 != colorStateList) {
            this.f9360y0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // T2.f, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f9362z0 != mode) {
            this.f9362z0 = mode;
            ColorStateList colorStateList = this.f9360y0;
            this.f9358x0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (a0()) {
            visible |= this.f9325H.setVisible(z10, z11);
        }
        if (Z()) {
            visible |= this.T.setVisible(z10, z11);
        }
        if (b0()) {
            visible |= this.f9331M.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void w(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f9331M) {
            if (drawable.isStateful()) {
                drawable.setState(this.f9312A0);
            }
            drawable.setTintList(this.f9333O);
            return;
        }
        Drawable drawable2 = this.f9325H;
        if (drawable == drawable2 && this.f9329K) {
            drawable2.setTintList(this.f9327I);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void x(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (a0() || Z()) {
            float f10 = this.X + this.Y;
            Drawable drawable = this.f9354t0 ? this.T : this.f9325H;
            float f11 = this.f9328J;
            if (f11 <= 0.0f && drawable != null) {
                f11 = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f12 = rect.left + f10;
                rectF.left = f12;
                rectF.right = f12 + f11;
            } else {
                float f13 = rect.right - f10;
                rectF.right = f13;
                rectF.left = f13 - f11;
            }
            Drawable drawable2 = this.f9354t0 ? this.T : this.f9325H;
            float f14 = this.f9328J;
            if (f14 <= 0.0f && drawable2 != null) {
                f14 = (float) Math.ceil(k.b(this.f9342g0, 24));
                if (drawable2.getIntrinsicHeight() <= f14) {
                    f14 = drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f14 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f14;
        }
    }

    public final float y() {
        if (!a0() && !Z()) {
            return 0.0f;
        }
        float f10 = this.Y;
        Drawable drawable = this.f9354t0 ? this.T : this.f9325H;
        float f11 = this.f9328J;
        if (f11 <= 0.0f && drawable != null) {
            f11 = drawable.getIntrinsicWidth();
        }
        return f11 + f10 + this.f9336Z;
    }

    public final float z() {
        if (b0()) {
            return this.f9339c0 + this.f9334P + this.f9340d0;
        }
        return 0.0f;
    }
}

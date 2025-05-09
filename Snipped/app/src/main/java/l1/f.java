package l1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import m0.i;
import n0.d;
import o0.C1085a;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: VectorDrawableCompat.java */
/* loaded from: classes.dex */
public final class f extends AbstractC0980e {

    /* renamed from: j, reason: collision with root package name */
    public static final PorterDuff.Mode f23480j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public g f23481b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuffColorFilter f23482c;

    /* renamed from: d, reason: collision with root package name */
    public ColorFilter f23483d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f23484e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23485f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f23486g;

    /* renamed from: h, reason: collision with root package name */
    public final Matrix f23487h;
    public final Rect i;

    /* compiled from: VectorDrawableCompat.java */
    public static class a extends e {
    }

    /* compiled from: VectorDrawableCompat.java */
    public static class b extends e {

        /* renamed from: e, reason: collision with root package name */
        public m0.d f23488e;

        /* renamed from: g, reason: collision with root package name */
        public m0.d f23490g;

        /* renamed from: f, reason: collision with root package name */
        public float f23489f = 0.0f;

        /* renamed from: h, reason: collision with root package name */
        public float f23491h = 1.0f;
        public float i = 1.0f;

        /* renamed from: j, reason: collision with root package name */
        public float f23492j = 0.0f;

        /* renamed from: k, reason: collision with root package name */
        public float f23493k = 1.0f;

        /* renamed from: l, reason: collision with root package name */
        public float f23494l = 0.0f;

        /* renamed from: m, reason: collision with root package name */
        public Paint.Cap f23495m = Paint.Cap.BUTT;

        /* renamed from: n, reason: collision with root package name */
        public Paint.Join f23496n = Paint.Join.MITER;

        /* renamed from: o, reason: collision with root package name */
        public float f23497o = 4.0f;

        @Override // l1.f.d
        public final boolean a() {
            return this.f23490g.b() || this.f23488e.b();
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @Override // l1.f.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean b(int[] r7) {
            /*
                r6 = this;
                m0.d r0 = r6.f23490g
                boolean r1 = r0.b()
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L1c
                android.content.res.ColorStateList r1 = r0.f23844b
                int r4 = r1.getDefaultColor()
                int r1 = r1.getColorForState(r7, r4)
                int r4 = r0.f23845c
                if (r1 == r4) goto L1c
                r0.f23845c = r1
                r0 = r3
                goto L1d
            L1c:
                r0 = r2
            L1d:
                m0.d r1 = r6.f23488e
                boolean r4 = r1.b()
                if (r4 == 0) goto L36
                android.content.res.ColorStateList r4 = r1.f23844b
                int r5 = r4.getDefaultColor()
                int r7 = r4.getColorForState(r7, r5)
                int r4 = r1.f23845c
                if (r7 == r4) goto L36
                r1.f23845c = r7
                r2 = r3
            L36:
                r7 = r0 | r2
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: l1.f.b.b(int[]):boolean");
        }

        public float getFillAlpha() {
            return this.i;
        }

        public int getFillColor() {
            return this.f23490g.f23845c;
        }

        public float getStrokeAlpha() {
            return this.f23491h;
        }

        public int getStrokeColor() {
            return this.f23488e.f23845c;
        }

        public float getStrokeWidth() {
            return this.f23489f;
        }

        public float getTrimPathEnd() {
            return this.f23493k;
        }

        public float getTrimPathOffset() {
            return this.f23494l;
        }

        public float getTrimPathStart() {
            return this.f23492j;
        }

        public void setFillAlpha(float f10) {
            this.i = f10;
        }

        public void setFillColor(int i) {
            this.f23490g.f23845c = i;
        }

        public void setStrokeAlpha(float f10) {
            this.f23491h = f10;
        }

        public void setStrokeColor(int i) {
            this.f23488e.f23845c = i;
        }

        public void setStrokeWidth(float f10) {
            this.f23489f = f10;
        }

        public void setTrimPathEnd(float f10) {
            this.f23493k = f10;
        }

        public void setTrimPathOffset(float f10) {
            this.f23494l = f10;
        }

        public void setTrimPathStart(float f10) {
            this.f23492j = f10;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    public static abstract class d {
        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    public static class g extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public int f23528a;

        /* renamed from: b, reason: collision with root package name */
        public C0428f f23529b;

        /* renamed from: c, reason: collision with root package name */
        public ColorStateList f23530c;

        /* renamed from: d, reason: collision with root package name */
        public PorterDuff.Mode f23531d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f23532e;

        /* renamed from: f, reason: collision with root package name */
        public Bitmap f23533f;

        /* renamed from: g, reason: collision with root package name */
        public ColorStateList f23534g;

        /* renamed from: h, reason: collision with root package name */
        public PorterDuff.Mode f23535h;
        public int i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f23536j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f23537k;

        /* renamed from: l, reason: collision with root package name */
        public Paint f23538l;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f23528a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new f(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new f(this);
        }
    }

    public f() {
        this.f23485f = true;
        this.f23486g = new float[9];
        this.f23487h = new Matrix();
        this.i = new Rect();
        g gVar = new g();
        gVar.f23530c = null;
        gVar.f23531d = f23480j;
        gVar.f23529b = new C0428f();
        this.f23481b = gVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f23479a;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f23479a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.i;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f23483d;
        if (colorFilter == null) {
            colorFilter = this.f23482c;
        }
        Matrix matrix = this.f23487h;
        canvas.getMatrix(matrix);
        float[] fArr = this.f23486g;
        matrix.getValues(fArr);
        float abs = Math.abs(fArr[0]);
        float abs2 = Math.abs(fArr[4]);
        float abs3 = Math.abs(fArr[1]);
        float abs4 = Math.abs(fArr[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int width = (int) (rect.width() * abs);
        int min = Math.min(2048, width);
        int min2 = Math.min(2048, (int) (rect.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        g gVar = this.f23481b;
        Bitmap bitmap = gVar.f23533f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != gVar.f23533f.getHeight()) {
            gVar.f23533f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            gVar.f23537k = true;
        }
        if (this.f23485f) {
            g gVar2 = this.f23481b;
            if (gVar2.f23537k || gVar2.f23534g != gVar2.f23530c || gVar2.f23535h != gVar2.f23531d || gVar2.f23536j != gVar2.f23532e || gVar2.i != gVar2.f23529b.getRootAlpha()) {
                g gVar3 = this.f23481b;
                gVar3.f23533f.eraseColor(0);
                Canvas canvas2 = new Canvas(gVar3.f23533f);
                C0428f c0428f = gVar3.f23529b;
                c0428f.a(c0428f.f23520g, C0428f.f23513p, canvas2, min, min2);
                g gVar4 = this.f23481b;
                gVar4.f23534g = gVar4.f23530c;
                gVar4.f23535h = gVar4.f23531d;
                gVar4.i = gVar4.f23529b.getRootAlpha();
                gVar4.f23536j = gVar4.f23532e;
                gVar4.f23537k = false;
            }
        } else {
            g gVar5 = this.f23481b;
            gVar5.f23533f.eraseColor(0);
            Canvas canvas3 = new Canvas(gVar5.f23533f);
            C0428f c0428f2 = gVar5.f23529b;
            c0428f2.a(c0428f2.f23520g, C0428f.f23513p, canvas3, min, min2);
        }
        g gVar6 = this.f23481b;
        if (gVar6.f23529b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (gVar6.f23538l == null) {
                Paint paint2 = new Paint();
                gVar6.f23538l = paint2;
                paint2.setFilterBitmap(true);
            }
            gVar6.f23538l.setAlpha(gVar6.f23529b.getRootAlpha());
            gVar6.f23538l.setColorFilter(colorFilter);
            paint = gVar6.f23538l;
        }
        canvas.drawBitmap(gVar6.f23533f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f23479a;
        return drawable != null ? drawable.getAlpha() : this.f23481b.f23529b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f23479a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f23481b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f23479a;
        return drawable != null ? drawable.getColorFilter() : this.f23483d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f23479a != null) {
            return new h(this.f23479a.getConstantState());
        }
        this.f23481b.f23528a = getChangingConfigurations();
        return this.f23481b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f23479a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f23481b.f23529b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f23479a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f23481b.f23529b.f23521h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f23479a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f23479a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f23479a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f23479a;
        return drawable != null ? drawable.isAutoMirrored() : this.f23481b.f23532e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f23479a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            g gVar = this.f23481b;
            if (gVar != null) {
                C0428f c0428f = gVar.f23529b;
                if (c0428f.f23526n == null) {
                    c0428f.f23526n = Boolean.valueOf(c0428f.f23520g.a());
                }
                if (c0428f.f23526n.booleanValue() || ((colorStateList = this.f23481b.f23530c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f23479a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f23484e && super.mutate() == this) {
            g gVar = this.f23481b;
            g gVar2 = new g();
            gVar2.f23530c = null;
            gVar2.f23531d = f23480j;
            if (gVar != null) {
                gVar2.f23528a = gVar.f23528a;
                C0428f c0428f = new C0428f(gVar.f23529b);
                gVar2.f23529b = c0428f;
                if (gVar.f23529b.f23518e != null) {
                    c0428f.f23518e = new Paint(gVar.f23529b.f23518e);
                }
                if (gVar.f23529b.f23517d != null) {
                    gVar2.f23529b.f23517d = new Paint(gVar.f23529b.f23517d);
                }
                gVar2.f23530c = gVar.f23530c;
                gVar2.f23531d = gVar.f23531d;
                gVar2.f23532e = gVar.f23532e;
            }
            this.f23481b = gVar2;
            this.f23484e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f23479a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f23479a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        g gVar = this.f23481b;
        ColorStateList colorStateList = gVar.f23530c;
        if (colorStateList == null || (mode = gVar.f23531d) == null) {
            z10 = false;
        } else {
            this.f23482c = a(colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        C0428f c0428f = gVar.f23529b;
        if (c0428f.f23526n == null) {
            c0428f.f23526n = Boolean.valueOf(c0428f.f23520g.a());
        }
        if (c0428f.f23526n.booleanValue()) {
            boolean b9 = gVar.f23529b.f23520g.b(iArr);
            gVar.f23537k |= b9;
            if (b9) {
                invalidateSelf();
                return true;
            }
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f23479a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f23479a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f23481b.f23529b.getRootAlpha() != i) {
            this.f23481b.f23529b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f23479a;
        if (drawable != null) {
            drawable.setAutoMirrored(z10);
        } else {
            this.f23481b.f23532e = z10;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f23479a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f23483d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f23479a;
        if (drawable != null) {
            C1085a.a(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f23479a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        g gVar = this.f23481b;
        if (gVar.f23530c != colorStateList) {
            gVar.f23530c = colorStateList;
            this.f23482c = a(colorStateList, gVar.f23531d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f23479a;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        g gVar = this.f23481b;
        if (gVar.f23531d != mode) {
            gVar.f23531d = mode;
            this.f23482c = a(gVar.f23530c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f23479a;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f23479a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    public static class h extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f23539a;

        public h(Drawable.ConstantState constantState) {
            this.f23539a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f23539a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f23539a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            f fVar = new f();
            fVar.f23479a = (VectorDrawable) this.f23539a.newDrawable();
            return fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            f fVar = new f();
            fVar.f23479a = (VectorDrawable) this.f23539a.newDrawable(resources);
            return fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            f fVar = new f();
            fVar.f23479a = (VectorDrawable) this.f23539a.newDrawable(resources, theme);
            return fVar;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    public static abstract class e extends d {

        /* renamed from: a, reason: collision with root package name */
        public d.a[] f23509a;

        /* renamed from: b, reason: collision with root package name */
        public String f23510b;

        /* renamed from: c, reason: collision with root package name */
        public int f23511c;

        /* renamed from: d, reason: collision with root package name */
        public final int f23512d;

        public e() {
            this.f23509a = null;
            this.f23511c = 0;
        }

        public d.a[] getPathData() {
            return this.f23509a;
        }

        public String getPathName() {
            return this.f23510b;
        }

        public void setPathData(d.a[] aVarArr) {
            if (!n0.d.a(this.f23509a, aVarArr)) {
                this.f23509a = n0.d.e(aVarArr);
                return;
            }
            d.a[] aVarArr2 = this.f23509a;
            for (int i = 0; i < aVarArr.length; i++) {
                aVarArr2[i].f24071a = aVarArr[i].f24071a;
                int i9 = 0;
                while (true) {
                    float[] fArr = aVarArr[i].f24072b;
                    if (i9 < fArr.length) {
                        aVarArr2[i].f24072b[i9] = fArr[i9];
                        i9++;
                    }
                }
            }
        }

        public e(e eVar) {
            this.f23509a = null;
            this.f23511c = 0;
            this.f23510b = eVar.f23510b;
            this.f23512d = eVar.f23512d;
            this.f23509a = n0.d.e(eVar.f23509a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0428f c0428f;
        int i;
        int i9;
        boolean z10;
        int i10;
        int i11;
        Drawable drawable = this.f23479a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        g gVar = this.f23481b;
        gVar.f23529b = new C0428f();
        TypedArray e10 = i.e(resources, theme, attributeSet, C0976a.f23460a);
        g gVar2 = this.f23481b;
        C0428f c0428f2 = gVar2.f23529b;
        int b9 = i.b(e10, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i12 = 3;
        if (b9 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (b9 != 5) {
            if (b9 != 9) {
                switch (b9) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        gVar2.f23531d = mode;
        int i13 = 1;
        ColorStateList colorStateList = null;
        boolean z11 = false;
        if (i.d(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            e10.getValue(1, typedValue);
            int i14 = typedValue.type;
            if (i14 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i14 >= 28 && i14 <= 31) {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = e10.getResources();
                int resourceId = e10.getResourceId(1, 0);
                ThreadLocal<TypedValue> threadLocal = m0.c.f23842a;
                try {
                    colorStateList = m0.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e11) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e11);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            gVar2.f23530c = colorStateList2;
        }
        boolean z12 = gVar2.f23532e;
        if (i.d(xmlPullParser, "autoMirrored")) {
            z12 = e10.getBoolean(5, z12);
        }
        gVar2.f23532e = z12;
        float f10 = c0428f2.f23522j;
        if (i.d(xmlPullParser, "viewportWidth")) {
            f10 = e10.getFloat(7, f10);
        }
        c0428f2.f23522j = f10;
        float f11 = c0428f2.f23523k;
        if (i.d(xmlPullParser, "viewportHeight")) {
            f11 = e10.getFloat(8, f11);
        }
        c0428f2.f23523k = f11;
        if (c0428f2.f23522j <= 0.0f) {
            throw new XmlPullParserException(e10.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f11 > 0.0f) {
            c0428f2.f23521h = e10.getDimension(3, c0428f2.f23521h);
            float dimension = e10.getDimension(2, c0428f2.i);
            c0428f2.i = dimension;
            if (c0428f2.f23521h <= 0.0f) {
                throw new XmlPullParserException(e10.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = c0428f2.getAlpha();
                if (i.d(xmlPullParser, "alpha")) {
                    alpha = e10.getFloat(4, alpha);
                }
                c0428f2.setAlpha(alpha);
                String string = e10.getString(0);
                if (string != null) {
                    c0428f2.f23525m = string;
                    c0428f2.f23527o.put(string, c0428f2);
                }
                e10.recycle();
                gVar.f23528a = getChangingConfigurations();
                gVar.f23537k = true;
                g gVar3 = this.f23481b;
                C0428f c0428f3 = gVar3.f23529b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(c0428f3.f23520g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z13 = true;
                while (eventType != i13 && (xmlPullParser.getDepth() >= depth || eventType != i12)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        c cVar = (c) arrayDeque.peek();
                        boolean equals = "path".equals(name);
                        androidx.collection.a<String, Object> aVar = c0428f3.f23527o;
                        c0428f = c0428f3;
                        if (equals) {
                            b bVar = new b();
                            TypedArray e12 = i.e(resources, theme, attributeSet, C0976a.f23462c);
                            if (i.d(xmlPullParser, "pathData")) {
                                String string2 = e12.getString(0);
                                if (string2 != null) {
                                    bVar.f23510b = string2;
                                }
                                String string3 = e12.getString(2);
                                if (string3 != null) {
                                    bVar.f23509a = n0.d.c(string3);
                                }
                                bVar.f23490g = i.a(e12, xmlPullParser, theme, "fillColor", 1);
                                float f12 = bVar.i;
                                if (i.d(xmlPullParser, "fillAlpha")) {
                                    f12 = e12.getFloat(12, f12);
                                }
                                bVar.i = f12;
                                int i15 = !i.d(xmlPullParser, "strokeLineCap") ? -1 : e12.getInt(8, -1);
                                Paint.Cap cap = bVar.f23495m;
                                if (i15 != 0) {
                                    i = depth;
                                    if (i15 == 1) {
                                        cap = Paint.Cap.ROUND;
                                    } else if (i15 == 2) {
                                        cap = Paint.Cap.SQUARE;
                                    }
                                } else {
                                    i = depth;
                                    cap = Paint.Cap.BUTT;
                                }
                                bVar.f23495m = cap;
                                int i16 = !i.d(xmlPullParser, "strokeLineJoin") ? -1 : e12.getInt(9, -1);
                                Paint.Join join = bVar.f23496n;
                                if (i16 == 0) {
                                    join = Paint.Join.MITER;
                                } else if (i16 == 1) {
                                    join = Paint.Join.ROUND;
                                } else if (i16 == 2) {
                                    join = Paint.Join.BEVEL;
                                }
                                bVar.f23496n = join;
                                float f13 = bVar.f23497o;
                                if (i.d(xmlPullParser, "strokeMiterLimit")) {
                                    f13 = e12.getFloat(10, f13);
                                }
                                bVar.f23497o = f13;
                                bVar.f23488e = i.a(e12, xmlPullParser, theme, "strokeColor", 3);
                                float f14 = bVar.f23491h;
                                if (i.d(xmlPullParser, "strokeAlpha")) {
                                    f14 = e12.getFloat(11, f14);
                                }
                                bVar.f23491h = f14;
                                float f15 = bVar.f23489f;
                                if (i.d(xmlPullParser, "strokeWidth")) {
                                    f15 = e12.getFloat(4, f15);
                                }
                                bVar.f23489f = f15;
                                float f16 = bVar.f23493k;
                                if (i.d(xmlPullParser, "trimPathEnd")) {
                                    f16 = e12.getFloat(6, f16);
                                }
                                bVar.f23493k = f16;
                                float f17 = bVar.f23494l;
                                if (i.d(xmlPullParser, "trimPathOffset")) {
                                    f17 = e12.getFloat(7, f17);
                                }
                                bVar.f23494l = f17;
                                float f18 = bVar.f23492j;
                                if (i.d(xmlPullParser, "trimPathStart")) {
                                    f18 = e12.getFloat(5, f18);
                                }
                                bVar.f23492j = f18;
                                int i17 = bVar.f23511c;
                                if (i.d(xmlPullParser, "fillType")) {
                                    i17 = e12.getInt(13, i17);
                                }
                                bVar.f23511c = i17;
                            } else {
                                i = depth;
                            }
                            e12.recycle();
                            cVar.f23499b.add(bVar);
                            if (bVar.getPathName() != null) {
                                aVar.put(bVar.getPathName(), bVar);
                            }
                            gVar3.f23528a |= bVar.f23512d;
                            z10 = false;
                            i11 = 1;
                            z13 = false;
                        } else {
                            i = depth;
                            if ("clip-path".equals(name)) {
                                a aVar2 = new a();
                                if (i.d(xmlPullParser, "pathData")) {
                                    TypedArray e13 = i.e(resources, theme, attributeSet, C0976a.f23463d);
                                    String string4 = e13.getString(0);
                                    if (string4 != null) {
                                        aVar2.f23510b = string4;
                                    }
                                    String string5 = e13.getString(1);
                                    if (string5 != null) {
                                        aVar2.f23509a = n0.d.c(string5);
                                    }
                                    aVar2.f23511c = !i.d(xmlPullParser, "fillType") ? 0 : e13.getInt(2, 0);
                                    e13.recycle();
                                }
                                cVar.f23499b.add(aVar2);
                                if (aVar2.getPathName() != null) {
                                    aVar.put(aVar2.getPathName(), aVar2);
                                }
                                gVar3.f23528a |= aVar2.f23512d;
                            } else if ("group".equals(name)) {
                                c cVar2 = new c();
                                TypedArray e14 = i.e(resources, theme, attributeSet, C0976a.f23461b);
                                float f19 = cVar2.f23500c;
                                if (i.d(xmlPullParser, "rotation")) {
                                    f19 = e14.getFloat(5, f19);
                                }
                                cVar2.f23500c = f19;
                                i11 = 1;
                                cVar2.f23501d = e14.getFloat(1, cVar2.f23501d);
                                cVar2.f23502e = e14.getFloat(2, cVar2.f23502e);
                                float f20 = cVar2.f23503f;
                                if (i.d(xmlPullParser, "scaleX")) {
                                    f20 = e14.getFloat(3, f20);
                                }
                                cVar2.f23503f = f20;
                                float f21 = cVar2.f23504g;
                                if (i.d(xmlPullParser, "scaleY")) {
                                    f21 = e14.getFloat(4, f21);
                                }
                                cVar2.f23504g = f21;
                                float f22 = cVar2.f23505h;
                                if (i.d(xmlPullParser, "translateX")) {
                                    f22 = e14.getFloat(6, f22);
                                }
                                cVar2.f23505h = f22;
                                float f23 = cVar2.i;
                                if (i.d(xmlPullParser, "translateY")) {
                                    f23 = e14.getFloat(7, f23);
                                }
                                cVar2.i = f23;
                                z10 = false;
                                String string6 = e14.getString(0);
                                if (string6 != null) {
                                    cVar2.f23508l = string6;
                                }
                                cVar2.c();
                                e14.recycle();
                                cVar.f23499b.add(cVar2);
                                arrayDeque.push(cVar2);
                                if (cVar2.getGroupName() != null) {
                                    aVar.put(cVar2.getGroupName(), cVar2);
                                }
                                gVar3.f23528a = cVar2.f23507k | gVar3.f23528a;
                            }
                            z10 = false;
                            i11 = 1;
                        }
                        i9 = i11;
                        i10 = 3;
                    } else {
                        c0428f = c0428f3;
                        i = depth;
                        i9 = i13;
                        z10 = z11;
                        i10 = 3;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i12 = i10;
                    z11 = z10;
                    i13 = i9;
                    c0428f3 = c0428f;
                    depth = i;
                }
                if (!z13) {
                    this.f23482c = a(gVar.f23530c, gVar.f23531d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(e10.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(e10.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    /* compiled from: VectorDrawableCompat.java */
    public static class c extends d {

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f23498a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList<d> f23499b;

        /* renamed from: c, reason: collision with root package name */
        public float f23500c;

        /* renamed from: d, reason: collision with root package name */
        public float f23501d;

        /* renamed from: e, reason: collision with root package name */
        public float f23502e;

        /* renamed from: f, reason: collision with root package name */
        public float f23503f;

        /* renamed from: g, reason: collision with root package name */
        public float f23504g;

        /* renamed from: h, reason: collision with root package name */
        public float f23505h;
        public float i;

        /* renamed from: j, reason: collision with root package name */
        public final Matrix f23506j;

        /* renamed from: k, reason: collision with root package name */
        public final int f23507k;

        /* renamed from: l, reason: collision with root package name */
        public String f23508l;

        public c() {
            this.f23498a = new Matrix();
            this.f23499b = new ArrayList<>();
            this.f23500c = 0.0f;
            this.f23501d = 0.0f;
            this.f23502e = 0.0f;
            this.f23503f = 1.0f;
            this.f23504g = 1.0f;
            this.f23505h = 0.0f;
            this.i = 0.0f;
            this.f23506j = new Matrix();
            this.f23508l = null;
        }

        @Override // l1.f.d
        public final boolean a() {
            int i = 0;
            while (true) {
                ArrayList<d> arrayList = this.f23499b;
                if (i >= arrayList.size()) {
                    return false;
                }
                if (arrayList.get(i).a()) {
                    return true;
                }
                i++;
            }
        }

        @Override // l1.f.d
        public final boolean b(int[] iArr) {
            int i = 0;
            boolean z10 = false;
            while (true) {
                ArrayList<d> arrayList = this.f23499b;
                if (i >= arrayList.size()) {
                    return z10;
                }
                z10 |= arrayList.get(i).b(iArr);
                i++;
            }
        }

        public final void c() {
            Matrix matrix = this.f23506j;
            matrix.reset();
            matrix.postTranslate(-this.f23501d, -this.f23502e);
            matrix.postScale(this.f23503f, this.f23504g);
            matrix.postRotate(this.f23500c, 0.0f, 0.0f);
            matrix.postTranslate(this.f23505h + this.f23501d, this.i + this.f23502e);
        }

        public String getGroupName() {
            return this.f23508l;
        }

        public Matrix getLocalMatrix() {
            return this.f23506j;
        }

        public float getPivotX() {
            return this.f23501d;
        }

        public float getPivotY() {
            return this.f23502e;
        }

        public float getRotation() {
            return this.f23500c;
        }

        public float getScaleX() {
            return this.f23503f;
        }

        public float getScaleY() {
            return this.f23504g;
        }

        public float getTranslateX() {
            return this.f23505h;
        }

        public float getTranslateY() {
            return this.i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f23501d) {
                this.f23501d = f10;
                c();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f23502e) {
                this.f23502e = f10;
                c();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f23500c) {
                this.f23500c = f10;
                c();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f23503f) {
                this.f23503f = f10;
                c();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f23504g) {
                this.f23504g = f10;
                c();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f23505h) {
                this.f23505h = f10;
                c();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.i) {
                this.i = f10;
                c();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(c cVar, androidx.collection.a<String, Object> aVar) {
            a aVar2;
            this.f23498a = new Matrix();
            this.f23499b = new ArrayList<>();
            this.f23500c = 0.0f;
            this.f23501d = 0.0f;
            this.f23502e = 0.0f;
            this.f23503f = 1.0f;
            this.f23504g = 1.0f;
            this.f23505h = 0.0f;
            this.i = 0.0f;
            Matrix matrix = new Matrix();
            this.f23506j = matrix;
            this.f23508l = null;
            this.f23500c = cVar.f23500c;
            this.f23501d = cVar.f23501d;
            this.f23502e = cVar.f23502e;
            this.f23503f = cVar.f23503f;
            this.f23504g = cVar.f23504g;
            this.f23505h = cVar.f23505h;
            this.i = cVar.i;
            String str = cVar.f23508l;
            this.f23508l = str;
            this.f23507k = cVar.f23507k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(cVar.f23506j);
            ArrayList<d> arrayList = cVar.f23499b;
            for (int i = 0; i < arrayList.size(); i++) {
                d dVar = arrayList.get(i);
                if (dVar instanceof c) {
                    this.f23499b.add(new c((c) dVar, aVar));
                } else {
                    if (dVar instanceof b) {
                        b bVar = (b) dVar;
                        b bVar2 = new b(bVar);
                        bVar2.f23489f = 0.0f;
                        bVar2.f23491h = 1.0f;
                        bVar2.i = 1.0f;
                        bVar2.f23492j = 0.0f;
                        bVar2.f23493k = 1.0f;
                        bVar2.f23494l = 0.0f;
                        bVar2.f23495m = Paint.Cap.BUTT;
                        bVar2.f23496n = Paint.Join.MITER;
                        bVar2.f23497o = 4.0f;
                        bVar2.f23488e = bVar.f23488e;
                        bVar2.f23489f = bVar.f23489f;
                        bVar2.f23491h = bVar.f23491h;
                        bVar2.f23490g = bVar.f23490g;
                        bVar2.f23511c = bVar.f23511c;
                        bVar2.i = bVar.i;
                        bVar2.f23492j = bVar.f23492j;
                        bVar2.f23493k = bVar.f23493k;
                        bVar2.f23494l = bVar.f23494l;
                        bVar2.f23495m = bVar.f23495m;
                        bVar2.f23496n = bVar.f23496n;
                        bVar2.f23497o = bVar.f23497o;
                        aVar2 = bVar2;
                    } else if (dVar instanceof a) {
                        aVar2 = new a((a) dVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f23499b.add(aVar2);
                    String str2 = aVar2.f23510b;
                    if (str2 != null) {
                        aVar.put(str2, aVar2);
                    }
                }
            }
        }
    }

    public f(g gVar) {
        this.f23485f = true;
        this.f23486g = new float[9];
        this.f23487h = new Matrix();
        this.i = new Rect();
        this.f23481b = gVar;
        this.f23482c = a(gVar.f23530c, gVar.f23531d);
    }

    /* compiled from: VectorDrawableCompat.java */
    /* renamed from: l1.f$f, reason: collision with other inner class name */
    public static class C0428f {

        /* renamed from: p, reason: collision with root package name */
        public static final Matrix f23513p = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        public final Path f23514a;

        /* renamed from: b, reason: collision with root package name */
        public final Path f23515b;

        /* renamed from: c, reason: collision with root package name */
        public final Matrix f23516c;

        /* renamed from: d, reason: collision with root package name */
        public Paint f23517d;

        /* renamed from: e, reason: collision with root package name */
        public Paint f23518e;

        /* renamed from: f, reason: collision with root package name */
        public PathMeasure f23519f;

        /* renamed from: g, reason: collision with root package name */
        public final c f23520g;

        /* renamed from: h, reason: collision with root package name */
        public float f23521h;
        public float i;

        /* renamed from: j, reason: collision with root package name */
        public float f23522j;

        /* renamed from: k, reason: collision with root package name */
        public float f23523k;

        /* renamed from: l, reason: collision with root package name */
        public int f23524l;

        /* renamed from: m, reason: collision with root package name */
        public String f23525m;

        /* renamed from: n, reason: collision with root package name */
        public Boolean f23526n;

        /* renamed from: o, reason: collision with root package name */
        public final androidx.collection.a<String, Object> f23527o;

        public C0428f() {
            this.f23516c = new Matrix();
            this.f23521h = 0.0f;
            this.i = 0.0f;
            this.f23522j = 0.0f;
            this.f23523k = 0.0f;
            this.f23524l = 255;
            this.f23525m = null;
            this.f23526n = null;
            this.f23527o = new androidx.collection.a<>();
            this.f23520g = new c();
            this.f23514a = new Path();
            this.f23515b = new Path();
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
        
            if (r0.f23493k != 1.0f) goto L33;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0 */
        /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r11v16 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(l1.f.c r19, android.graphics.Matrix r20, android.graphics.Canvas r21, int r22, int r23) {
            /*
                Method dump skipped, instructions count: 550
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: l1.f.C0428f.a(l1.f$c, android.graphics.Matrix, android.graphics.Canvas, int, int):void");
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f23524l;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f23524l = i;
        }

        public C0428f(C0428f c0428f) {
            this.f23516c = new Matrix();
            this.f23521h = 0.0f;
            this.i = 0.0f;
            this.f23522j = 0.0f;
            this.f23523k = 0.0f;
            this.f23524l = 255;
            this.f23525m = null;
            this.f23526n = null;
            androidx.collection.a<String, Object> aVar = new androidx.collection.a<>();
            this.f23527o = aVar;
            this.f23520g = new c(c0428f.f23520g, aVar);
            this.f23514a = new Path(c0428f.f23514a);
            this.f23515b = new Path(c0428f.f23515b);
            this.f23521h = c0428f.f23521h;
            this.i = c0428f.i;
            this.f23522j = c0428f.f23522j;
            this.f23523k = c0428f.f23523k;
            this.f23524l = c0428f.f23524l;
            this.f23525m = c0428f.f23525m;
            String str = c0428f.f23525m;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f23526n = c0428f.f23526n;
        }
    }
}

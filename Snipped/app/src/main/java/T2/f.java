package T2;

import F2.a;
import T2.i;
import T2.j;
import T2.l;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;

/* compiled from: MaterialShapeDrawable.java */
/* loaded from: classes.dex */
public class f extends Drawable implements m {

    /* renamed from: x, reason: collision with root package name */
    public static final Paint f3447x;

    /* renamed from: a, reason: collision with root package name */
    public b f3448a;

    /* renamed from: b, reason: collision with root package name */
    public final l.f[] f3449b;

    /* renamed from: c, reason: collision with root package name */
    public final l.f[] f3450c;

    /* renamed from: d, reason: collision with root package name */
    public final BitSet f3451d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3452e;

    /* renamed from: f, reason: collision with root package name */
    public final Matrix f3453f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f3454g;

    /* renamed from: h, reason: collision with root package name */
    public final Path f3455h;
    public final RectF i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f3456j;

    /* renamed from: k, reason: collision with root package name */
    public final Region f3457k;

    /* renamed from: l, reason: collision with root package name */
    public final Region f3458l;

    /* renamed from: m, reason: collision with root package name */
    public i f3459m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f3460n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f3461o;

    /* renamed from: p, reason: collision with root package name */
    public final S2.a f3462p;

    /* renamed from: q, reason: collision with root package name */
    public final a f3463q;

    /* renamed from: r, reason: collision with root package name */
    public final j f3464r;

    /* renamed from: s, reason: collision with root package name */
    public PorterDuffColorFilter f3465s;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuffColorFilter f3466t;

    /* renamed from: u, reason: collision with root package name */
    public int f3467u;

    /* renamed from: v, reason: collision with root package name */
    public final RectF f3468v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3469w;

    /* compiled from: MaterialShapeDrawable.java */
    public class a {
        public a() {
        }
    }

    static {
        Paint paint = new Paint(1);
        f3447x = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public f() {
        this(new i());
    }

    public final void b(RectF rectF, Path path) {
        b bVar = this.f3448a;
        this.f3464r.a(bVar.f3471a, bVar.f3479j, rectF, this.f3463q, path);
        if (this.f3448a.i != 1.0f) {
            Matrix matrix = this.f3453f;
            matrix.reset();
            float f10 = this.f3448a.i;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f3468v, true);
    }

    public final PorterDuffColorFilter c(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z10) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z10) {
                colorForState = d(colorForState);
            }
            this.f3467u = colorForState;
            return new PorterDuffColorFilter(colorForState, mode);
        }
        if (z10) {
            int color = paint.getColor();
            int d10 = d(color);
            this.f3467u = d10;
            if (d10 != color) {
                porterDuffColorFilter = new PorterDuffColorFilter(d10, PorterDuff.Mode.SRC_IN);
                return porterDuffColorFilter;
            }
        }
        porterDuffColorFilter = null;
        return porterDuffColorFilter;
    }

    public final int d(int i) {
        b bVar = this.f3448a;
        float f10 = bVar.f3483n + bVar.f3484o + bVar.f3482m;
        G2.a aVar = bVar.f3472b;
        return aVar != null ? aVar.a(i, f10) : i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00eb, code lost:
    
        if (r1 < 29) goto L40;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r19) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.f.draw(android.graphics.Canvas):void");
    }

    public final void e(Canvas canvas) {
        if (this.f3451d.cardinality() > 0) {
            Log.w("f", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f3448a.f3487r;
        Path path = this.f3454g;
        S2.a aVar = this.f3462p;
        if (i != 0) {
            canvas.drawPath(path, aVar.f3367a);
        }
        for (int i9 = 0; i9 < 4; i9++) {
            l.f fVar = this.f3449b[i9];
            int i10 = this.f3448a.f3486q;
            Matrix matrix = l.f.f3551b;
            fVar.a(matrix, aVar, i10, canvas);
            this.f3450c[i9].a(matrix, aVar, this.f3448a.f3486q, canvas);
        }
        if (this.f3469w) {
            b bVar = this.f3448a;
            int sin = (int) (Math.sin(Math.toRadians(bVar.f3488s)) * bVar.f3487r);
            b bVar2 = this.f3448a;
            int cos = (int) (Math.cos(Math.toRadians(bVar2.f3488s)) * bVar2.f3487r);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f3447x);
            canvas.translate(sin, cos);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, i iVar, RectF rectF) {
        if (!iVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a10 = iVar.f3498f.a(rectF) * this.f3448a.f3479j;
            canvas.drawRoundRect(rectF, a10, a10, paint);
        }
    }

    public void g(Canvas canvas) {
        Paint paint = this.f3461o;
        Path path = this.f3455h;
        i iVar = this.f3459m;
        RectF rectF = this.f3456j;
        rectF.set(h());
        float strokeWidth = j() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        f(canvas, paint, path, iVar, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f3448a.f3481l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f3448a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f3448a.f3485p == 2) {
            return;
        }
        if (l()) {
            outline.setRoundRect(getBounds(), i() * this.f3448a.f3479j);
            return;
        }
        RectF h9 = h();
        Path path = this.f3454g;
        b(h9, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            a.b.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                a.C0015a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            a.C0015a.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f3448a.f3478h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f3457k;
        region.set(bounds);
        RectF h9 = h();
        Path path = this.f3454g;
        b(h9, path);
        Region region2 = this.f3458l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final RectF h() {
        RectF rectF = this.i;
        rectF.set(getBounds());
        return rectF;
    }

    public final float i() {
        return this.f3448a.f3471a.f3497e.a(h());
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f3452e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f3448a.f3476f) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f3448a.f3475e) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f3448a.f3474d) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f3448a.f3473c) != null && colorStateList4.isStateful())));
    }

    public final boolean j() {
        Paint.Style style = this.f3448a.f3490u;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f3461o.getStrokeWidth() > 0.0f;
    }

    public final void k(Context context) {
        this.f3448a.f3472b = new G2.a(context);
        v();
    }

    public final boolean l() {
        return this.f3448a.f3471a.d(h());
    }

    public final void m(float f10) {
        i.a e10 = this.f3448a.f3471a.e();
        e10.c(f10);
        setShapeAppearanceModel(e10.a());
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f3448a = new b(this.f3448a);
        return this;
    }

    public final void n(float f10) {
        b bVar = this.f3448a;
        if (bVar.f3483n != f10) {
            bVar.f3483n = f10;
            v();
        }
    }

    public final void o(ColorStateList colorStateList) {
        b bVar = this.f3448a;
        if (bVar.f3473c != colorStateList) {
            bVar.f3473c = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f3452e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z10 = t(iArr) || u();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    public final void p(float f10) {
        b bVar = this.f3448a;
        if (bVar.f3479j != f10) {
            bVar.f3479j = f10;
            this.f3452e = true;
            invalidateSelf();
        }
    }

    public final void q() {
        this.f3462p.a(-12303292);
        this.f3448a.f3489t = false;
        super.invalidateSelf();
    }

    public final void r(ColorStateList colorStateList) {
        b bVar = this.f3448a;
        if (bVar.f3474d != colorStateList) {
            bVar.f3474d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void s(float f10) {
        this.f3448a.f3480k = f10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        b bVar = this.f3448a;
        if (bVar.f3481l != i) {
            bVar.f3481l = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f3448a.getClass();
        super.invalidateSelf();
    }

    @Override // T2.m
    public final void setShapeAppearanceModel(i iVar) {
        this.f3448a.f3471a = iVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f3448a.f3476f = colorStateList;
        u();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f3448a;
        if (bVar.f3477g != mode) {
            bVar.f3477g = mode;
            u();
            super.invalidateSelf();
        }
    }

    public final boolean t(int[] iArr) {
        boolean z10;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f3448a.f3473c == null || color2 == (colorForState2 = this.f3448a.f3473c.getColorForState(iArr, (color2 = (paint2 = this.f3460n).getColor())))) {
            z10 = false;
        } else {
            paint2.setColor(colorForState2);
            z10 = true;
        }
        if (this.f3448a.f3474d == null || color == (colorForState = this.f3448a.f3474d.getColorForState(iArr, (color = (paint = this.f3461o).getColor())))) {
            return z10;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean u() {
        PorterDuffColorFilter porterDuffColorFilter = this.f3465s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f3466t;
        b bVar = this.f3448a;
        this.f3465s = c(bVar.f3476f, bVar.f3477g, this.f3460n, true);
        b bVar2 = this.f3448a;
        this.f3466t = c(bVar2.f3475e, bVar2.f3477g, this.f3461o, false);
        b bVar3 = this.f3448a;
        if (bVar3.f3489t) {
            this.f3462p.a(bVar3.f3476f.getColorForState(getState(), 0));
        }
        return (Objects.equals(porterDuffColorFilter, this.f3465s) && Objects.equals(porterDuffColorFilter2, this.f3466t)) ? false : true;
    }

    public final void v() {
        b bVar = this.f3448a;
        float f10 = bVar.f3483n + bVar.f3484o;
        bVar.f3486q = (int) Math.ceil(0.75f * f10);
        this.f3448a.f3487r = (int) Math.ceil(f10 * 0.25f);
        u();
        super.invalidateSelf();
    }

    public f(Context context, AttributeSet attributeSet, int i, int i9) {
        this(i.b(context, attributeSet, i, i9).a());
    }

    public f(i iVar) {
        this(new b(iVar));
    }

    public f(b bVar) {
        j jVar;
        this.f3449b = new l.f[4];
        this.f3450c = new l.f[4];
        this.f3451d = new BitSet(8);
        this.f3453f = new Matrix();
        this.f3454g = new Path();
        this.f3455h = new Path();
        this.i = new RectF();
        this.f3456j = new RectF();
        this.f3457k = new Region();
        this.f3458l = new Region();
        Paint paint = new Paint(1);
        this.f3460n = paint;
        Paint paint2 = new Paint(1);
        this.f3461o = paint2;
        this.f3462p = new S2.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            jVar = j.a.f3526a;
        } else {
            jVar = new j();
        }
        this.f3464r = jVar;
        this.f3468v = new RectF();
        this.f3469w = true;
        this.f3448a = bVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        u();
        t(getState());
        this.f3463q = new a();
    }

    /* compiled from: MaterialShapeDrawable.java */
    public static class b extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public i f3471a;

        /* renamed from: b, reason: collision with root package name */
        public G2.a f3472b;

        /* renamed from: c, reason: collision with root package name */
        public ColorStateList f3473c;

        /* renamed from: d, reason: collision with root package name */
        public ColorStateList f3474d;

        /* renamed from: e, reason: collision with root package name */
        public final ColorStateList f3475e;

        /* renamed from: f, reason: collision with root package name */
        public ColorStateList f3476f;

        /* renamed from: g, reason: collision with root package name */
        public PorterDuff.Mode f3477g;

        /* renamed from: h, reason: collision with root package name */
        public Rect f3478h;
        public final float i;

        /* renamed from: j, reason: collision with root package name */
        public float f3479j;

        /* renamed from: k, reason: collision with root package name */
        public float f3480k;

        /* renamed from: l, reason: collision with root package name */
        public int f3481l;

        /* renamed from: m, reason: collision with root package name */
        public float f3482m;

        /* renamed from: n, reason: collision with root package name */
        public float f3483n;

        /* renamed from: o, reason: collision with root package name */
        public final float f3484o;

        /* renamed from: p, reason: collision with root package name */
        public final int f3485p;

        /* renamed from: q, reason: collision with root package name */
        public int f3486q;

        /* renamed from: r, reason: collision with root package name */
        public int f3487r;

        /* renamed from: s, reason: collision with root package name */
        public final int f3488s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f3489t;

        /* renamed from: u, reason: collision with root package name */
        public final Paint.Style f3490u;

        public b(i iVar) {
            this.f3473c = null;
            this.f3474d = null;
            this.f3475e = null;
            this.f3476f = null;
            this.f3477g = PorterDuff.Mode.SRC_IN;
            this.f3478h = null;
            this.i = 1.0f;
            this.f3479j = 1.0f;
            this.f3481l = 255;
            this.f3482m = 0.0f;
            this.f3483n = 0.0f;
            this.f3484o = 0.0f;
            this.f3485p = 0;
            this.f3486q = 0;
            this.f3487r = 0;
            this.f3488s = 0;
            this.f3489t = false;
            this.f3490u = Paint.Style.FILL_AND_STROKE;
            this.f3471a = iVar;
            this.f3472b = null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            f fVar = new f(this);
            fVar.f3452e = true;
            return fVar;
        }

        public b(b bVar) {
            this.f3473c = null;
            this.f3474d = null;
            this.f3475e = null;
            this.f3476f = null;
            this.f3477g = PorterDuff.Mode.SRC_IN;
            this.f3478h = null;
            this.i = 1.0f;
            this.f3479j = 1.0f;
            this.f3481l = 255;
            this.f3482m = 0.0f;
            this.f3483n = 0.0f;
            this.f3484o = 0.0f;
            this.f3485p = 0;
            this.f3486q = 0;
            this.f3487r = 0;
            this.f3488s = 0;
            this.f3489t = false;
            this.f3490u = Paint.Style.FILL_AND_STROKE;
            this.f3471a = bVar.f3471a;
            this.f3472b = bVar.f3472b;
            this.f3480k = bVar.f3480k;
            this.f3473c = bVar.f3473c;
            this.f3474d = bVar.f3474d;
            this.f3477g = bVar.f3477g;
            this.f3476f = bVar.f3476f;
            this.f3481l = bVar.f3481l;
            this.i = bVar.i;
            this.f3487r = bVar.f3487r;
            this.f3485p = bVar.f3485p;
            this.f3489t = bVar.f3489t;
            this.f3479j = bVar.f3479j;
            this.f3482m = bVar.f3482m;
            this.f3483n = bVar.f3483n;
            this.f3484o = bVar.f3484o;
            this.f3486q = bVar.f3486q;
            this.f3488s = bVar.f3488s;
            this.f3475e = bVar.f3475e;
            this.f3490u = bVar.f3490u;
            if (bVar.f3478h != null) {
                this.f3478h = new Rect(bVar.f3478h);
            }
        }
    }
}

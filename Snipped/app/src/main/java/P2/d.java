package P2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import m0.f;
import t2.C1279a;

/* compiled from: TextAppearance.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f3052a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3053b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3054c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3055d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3056e;

    /* renamed from: f, reason: collision with root package name */
    public final float f3057f;

    /* renamed from: g, reason: collision with root package name */
    public final float f3058g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f3059h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f3060j;

    /* renamed from: k, reason: collision with root package name */
    public float f3061k;

    /* renamed from: l, reason: collision with root package name */
    public final int f3062l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3063m = false;

    /* renamed from: n, reason: collision with root package name */
    public Typeface f3064n;

    /* compiled from: TextAppearance.java */
    public class a extends f.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ha.c f3065a;

        public a(Ha.c cVar) {
            this.f3065a = cVar;
        }

        @Override // m0.f.c
        public final void b(int i) {
            d.this.f3063m = true;
            this.f3065a.I(i);
        }

        @Override // m0.f.c
        public final void c(Typeface typeface) {
            d dVar = d.this;
            dVar.f3064n = Typeface.create(typeface, dVar.f3054c);
            dVar.f3063m = true;
            this.f3065a.J(dVar.f3064n, false);
        }
    }

    public d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C1279a.f27483Q);
        this.f3061k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f3060j = c.b(obtainStyledAttributes, context, 3);
        c.b(obtainStyledAttributes, context, 4);
        c.b(obtainStyledAttributes, context, 5);
        this.f3054c = obtainStyledAttributes.getInt(2, 0);
        this.f3055d = obtainStyledAttributes.getInt(1, 1);
        int i9 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f3062l = obtainStyledAttributes.getResourceId(i9, 0);
        this.f3053b = obtainStyledAttributes.getString(i9);
        obtainStyledAttributes.getBoolean(14, false);
        this.f3052a = c.b(obtainStyledAttributes, context, 6);
        this.f3056e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f3057f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f3058g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, C1279a.f27469C);
        this.f3059h = obtainStyledAttributes2.hasValue(0);
        this.i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f3064n;
        int i = this.f3054c;
        if (typeface == null && (str = this.f3053b) != null) {
            this.f3064n = Typeface.create(str, i);
        }
        if (this.f3064n == null) {
            int i9 = this.f3055d;
            if (i9 == 1) {
                this.f3064n = Typeface.SANS_SERIF;
            } else if (i9 == 2) {
                this.f3064n = Typeface.SERIF;
            } else if (i9 != 3) {
                this.f3064n = Typeface.DEFAULT;
            } else {
                this.f3064n = Typeface.MONOSPACE;
            }
            this.f3064n = Typeface.create(this.f3064n, i);
        }
    }

    public final Typeface b(Context context) {
        if (this.f3063m) {
            return this.f3064n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a10 = m0.f.a(context, this.f3062l);
                this.f3064n = a10;
                if (a10 != null) {
                    this.f3064n = Typeface.create(a10, this.f3054c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                Log.d("TextAppearance", "Error loading font " + this.f3053b, e10);
            }
        }
        a();
        this.f3063m = true;
        return this.f3064n;
    }

    public final void c(Context context, Ha.c cVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i = this.f3062l;
        if (i == 0) {
            this.f3063m = true;
        }
        if (this.f3063m) {
            cVar.J(this.f3064n, true);
            return;
        }
        try {
            a aVar = new a(cVar);
            ThreadLocal<TypedValue> threadLocal = m0.f.f23858a;
            if (context.isRestricted()) {
                aVar.a(-4);
            } else {
                m0.f.b(context, i, new TypedValue(), 0, aVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f3063m = true;
            cVar.I(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.f3053b, e10);
            this.f3063m = true;
            cVar.I(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typeface = null;
        int i = this.f3062l;
        if (i != 0) {
            ThreadLocal<TypedValue> threadLocal = m0.f.f23858a;
            if (!context.isRestricted()) {
                typeface = m0.f.b(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typeface != null;
    }

    public final void e(Context context, TextPaint textPaint, Ha.c cVar) {
        f(context, textPaint, cVar);
        ColorStateList colorStateList = this.f3060j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f3052a;
        textPaint.setShadowLayer(this.f3058g, this.f3056e, this.f3057f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, Ha.c cVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f3064n);
        c(context, new e(this, context, textPaint, cVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface a10 = f.a(context.getResources().getConfiguration(), typeface);
        if (a10 != null) {
            typeface = a10;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f3054c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f3061k);
        if (this.f3059h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}

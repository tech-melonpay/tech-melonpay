package m;

import B0.d;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import g.C0756a;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import k0.C0913a;
import m0.f;
import y0.C1596C;

/* compiled from: AppCompatTextHelper.java */
/* renamed from: m.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1022y {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f23813a;

    /* renamed from: b, reason: collision with root package name */
    public X f23814b;

    /* renamed from: c, reason: collision with root package name */
    public X f23815c;

    /* renamed from: d, reason: collision with root package name */
    public X f23816d;

    /* renamed from: e, reason: collision with root package name */
    public X f23817e;

    /* renamed from: f, reason: collision with root package name */
    public X f23818f;

    /* renamed from: g, reason: collision with root package name */
    public X f23819g;

    /* renamed from: h, reason: collision with root package name */
    public X f23820h;
    public final C0991A i;

    /* renamed from: j, reason: collision with root package name */
    public int f23821j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f23822k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f23823l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f23824m;

    /* compiled from: AppCompatTextHelper.java */
    /* renamed from: m.y$b */
    public static class b {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* compiled from: AppCompatTextHelper.java */
    /* renamed from: m.y$c */
    public static class c {
        public static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        public static void b(TextView textView, int i, int i9, int i10, int i11) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i9, i10, i11);
        }

        public static void c(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        public static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* compiled from: AppCompatTextHelper.java */
    /* renamed from: m.y$d */
    public static class d {
        public static Typeface a(Typeface typeface, int i, boolean z10) {
            return Typeface.create(typeface, i, z10);
        }
    }

    public C1022y(TextView textView) {
        this.f23813a = textView;
        this.i = new C0991A(textView);
    }

    public static X c(Context context, C1008j c1008j, int i) {
        ColorStateList h9;
        synchronized (c1008j) {
            h9 = c1008j.f23778a.h(context, i);
        }
        if (h9 == null) {
            return null;
        }
        X x9 = new X();
        x9.f23726d = true;
        x9.f23723a = h9;
        return x9;
    }

    public final void a(Drawable drawable, X x9) {
        if (drawable == null || x9 == null) {
            return;
        }
        C1008j.e(drawable, x9, this.f23813a.getDrawableState());
    }

    public final void b() {
        X x9 = this.f23814b;
        TextView textView = this.f23813a;
        if (x9 != null || this.f23815c != null || this.f23816d != null || this.f23817e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f23814b);
            a(compoundDrawables[1], this.f23815c);
            a(compoundDrawables[2], this.f23816d);
            a(compoundDrawables[3], this.f23817e);
        }
        if (this.f23818f == null && this.f23819g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f23818f);
        a(compoundDrawablesRelative[2], this.f23819g);
    }

    public final ColorStateList d() {
        X x9 = this.f23820h;
        if (x9 != null) {
            return x9.f23723a;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        X x9 = this.f23820h;
        if (x9 != null) {
            return x9.f23724b;
        }
        return null;
    }

    @SuppressLint({"NewApi"})
    public final void f(AttributeSet attributeSet, int i) {
        boolean z10;
        boolean z11;
        String str;
        String str2;
        int i9;
        int i10;
        int i11;
        float f10;
        ColorStateList colorStateList;
        int resourceId;
        int i12;
        int resourceId2;
        int i13;
        TextView textView = this.f23813a;
        Context context = textView.getContext();
        C1008j a10 = C1008j.a();
        int[] iArr = C0756a.f20736h;
        Z f11 = Z.f(context, attributeSet, iArr, i, 0);
        C1596C.n(textView, textView.getContext(), iArr, attributeSet, f11.f23728b, i);
        TypedArray typedArray = f11.f23728b;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f23814b = c(context, a10, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f23815c = c(context, a10, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f23816d = c(context, a10, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f23817e = c(context, a10, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f23818f = c(context, a10, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f23819g = c(context, a10, typedArray.getResourceId(6, 0));
        }
        f11.g();
        boolean z12 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = C0756a.f20750w;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            Z z13 = new Z(context, obtainStyledAttributes);
            if (z12 || !obtainStyledAttributes.hasValue(14)) {
                z10 = false;
                z11 = false;
            } else {
                z10 = obtainStyledAttributes.getBoolean(14, false);
                z11 = true;
            }
            m(context, z13);
            if (obtainStyledAttributes.hasValue(15)) {
                str2 = obtainStyledAttributes.getString(15);
                i13 = 13;
            } else {
                i13 = 13;
                str2 = null;
            }
            str = obtainStyledAttributes.hasValue(i13) ? obtainStyledAttributes.getString(i13) : null;
            z13.g();
        } else {
            z10 = false;
            z11 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        Z z14 = new Z(context, obtainStyledAttributes2);
        if (!z12 && obtainStyledAttributes2.hasValue(14)) {
            z10 = obtainStyledAttributes2.getBoolean(14, false);
            z11 = true;
        }
        boolean z15 = z10;
        int i14 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        if (obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (i14 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, z14);
        z14.g();
        if (!z12 && z11) {
            textView.setAllCaps(z15);
        }
        Typeface typeface = this.f23823l;
        if (typeface != null) {
            if (this.f23822k == -1) {
                textView.setTypeface(typeface, this.f23821j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            c.d(textView, str);
        }
        if (str2 != null) {
            b.b(textView, b.a(str2));
        }
        int[] iArr3 = C0756a.i;
        C0991A c0991a = this.i;
        Context context2 = c0991a.f23604j;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = c0991a.i;
        C1596C.n(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes3, i);
        if (obtainStyledAttributes3.hasValue(5)) {
            c0991a.f23596a = obtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes3.hasValue(4) ? obtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes3.hasValue(2) ? obtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes3.hasValue(1) ? obtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes3.hasValue(3) && (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i15 = 0; i15 < length; i15++) {
                    iArr4[i15] = obtainTypedArray.getDimensionPixelSize(i15, -1);
                }
                c0991a.f23601f = C0991A.b(iArr4);
                c0991a.i();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (!c0991a.j()) {
            c0991a.f23596a = 0;
        } else if (c0991a.f23596a == 1) {
            if (!c0991a.f23602g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i12 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i12 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i12, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c0991a.k(dimension2, dimension3, dimension);
            }
            c0991a.h();
        }
        if (e0.f23755c && c0991a.f23596a != 0) {
            int[] iArr5 = c0991a.f23601f;
            if (iArr5.length > 0) {
                if (c.a(textView) != -1.0f) {
                    c.b(textView, Math.round(c0991a.f23599d), Math.round(c0991a.f23600e), Math.round(c0991a.f23598c), 0);
                } else {
                    c.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        Drawable b9 = resourceId4 != -1 ? a10.b(context, resourceId4) : null;
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        Drawable b10 = resourceId5 != -1 ? a10.b(context, resourceId5) : null;
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        Drawable b11 = resourceId6 != -1 ? a10.b(context, resourceId6) : null;
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        Drawable b12 = resourceId7 != -1 ? a10.b(context, resourceId7) : null;
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        Drawable b13 = resourceId8 != -1 ? a10.b(context, resourceId8) : null;
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        Drawable b14 = resourceId9 != -1 ? a10.b(context, resourceId9) : null;
        if (b13 != null || b14 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (b13 == null) {
                b13 = compoundDrawablesRelative[0];
            }
            if (b10 == null) {
                b10 = compoundDrawablesRelative[1];
            }
            if (b14 == null) {
                b14 = compoundDrawablesRelative[2];
            }
            if (b12 == null) {
                b12 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(b13, b10, b14, b12);
        } else if (b9 != null || b10 != null || b11 != null || b12 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (b9 == null) {
                    b9 = compoundDrawables[0];
                }
                if (b10 == null) {
                    b10 = compoundDrawables[1];
                }
                if (b11 == null) {
                    b11 = compoundDrawables[2];
                }
                if (b12 == null) {
                    b12 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(b9, b10, b11, b12);
            } else {
                if (b10 == null) {
                    b10 = compoundDrawablesRelative2[1];
                }
                if (b12 == null) {
                    b12 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, b10, compoundDrawablesRelative2[2], b12);
            }
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = C0913a.getColorStateList(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            i9 = -1;
            textView.setCompoundDrawableTintMode(C0996F.b(obtainStyledAttributes4.getInt(12, -1), null));
        } else {
            i9 = -1;
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(15, i9);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(18, i9);
        if (obtainStyledAttributes4.hasValue(19)) {
            TypedValue peekValue = obtainStyledAttributes4.peekValue(19);
            if (peekValue == null || peekValue.type != 5) {
                i10 = -1;
                f10 = obtainStyledAttributes4.getDimensionPixelSize(19, -1);
                i11 = -1;
            } else {
                int i16 = peekValue.data;
                int i17 = i16 & 15;
                f10 = TypedValue.complexToFloat(i16);
                i11 = i17;
                i10 = -1;
            }
        } else {
            i10 = -1;
            i11 = -1;
            f10 = -1.0f;
        }
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != i10) {
            B0.d.b(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != i10) {
            B0.d.c(textView, dimensionPixelSize2);
        }
        if (f10 != -1.0f) {
            if (i11 == i10) {
                B0.d.d(textView, (int) f10);
            } else if (Build.VERSION.SDK_INT >= 34) {
                d.b.a(textView, i11, f10);
            } else {
                B0.d.d(textView, Math.round(TypedValue.applyDimension(i11, f10, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    public final void g(Context context, int i) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C0756a.f20750w);
        Z z10 = new Z(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f23813a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, z10);
        if (obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            c.d(textView, string);
        }
        z10.g();
        Typeface typeface = this.f23823l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f23821j);
        }
    }

    public final void h(int i, int i9, int i10, int i11) {
        C0991A c0991a = this.i;
        if (c0991a.j()) {
            DisplayMetrics displayMetrics = c0991a.f23604j.getResources().getDisplayMetrics();
            c0991a.k(TypedValue.applyDimension(i11, i, displayMetrics), TypedValue.applyDimension(i11, i9, displayMetrics), TypedValue.applyDimension(i11, i10, displayMetrics));
            if (c0991a.h()) {
                c0991a.a();
            }
        }
    }

    public final void i(int[] iArr, int i) {
        C0991A c0991a = this.i;
        if (c0991a.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c0991a.f23604j.getResources().getDisplayMetrics();
                    for (int i9 = 0; i9 < length; i9++) {
                        iArr2[i9] = Math.round(TypedValue.applyDimension(i, iArr[i9], displayMetrics));
                    }
                }
                c0991a.f23601f = C0991A.b(iArr2);
                if (!c0991a.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c0991a.f23602g = false;
            }
            if (c0991a.h()) {
                c0991a.a();
            }
        }
    }

    public final void j(int i) {
        C0991A c0991a = this.i;
        if (c0991a.j()) {
            if (i == 0) {
                c0991a.f23596a = 0;
                c0991a.f23599d = -1.0f;
                c0991a.f23600e = -1.0f;
                c0991a.f23598c = -1.0f;
                c0991a.f23601f = new int[0];
                c0991a.f23597b = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.g(i, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = c0991a.f23604j.getResources().getDisplayMetrics();
            c0991a.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c0991a.h()) {
                c0991a.a();
            }
        }
    }

    public final void k(ColorStateList colorStateList) {
        if (this.f23820h == null) {
            this.f23820h = new X();
        }
        X x9 = this.f23820h;
        x9.f23723a = colorStateList;
        x9.f23726d = colorStateList != null;
        this.f23814b = x9;
        this.f23815c = x9;
        this.f23816d = x9;
        this.f23817e = x9;
        this.f23818f = x9;
        this.f23819g = x9;
    }

    public final void l(PorterDuff.Mode mode) {
        if (this.f23820h == null) {
            this.f23820h = new X();
        }
        X x9 = this.f23820h;
        x9.f23724b = mode;
        x9.f23725c = mode != null;
        this.f23814b = x9;
        this.f23815c = x9;
        this.f23816d = x9;
        this.f23817e = x9;
        this.f23818f = x9;
        this.f23819g = x9;
    }

    public final void m(Context context, Z z10) {
        String string;
        int i = this.f23821j;
        TypedArray typedArray = z10.f23728b;
        this.f23821j = typedArray.getInt(2, i);
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 28) {
            int i10 = typedArray.getInt(11, -1);
            this.f23822k = i10;
            if (i10 != -1) {
                this.f23821j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f23824m = false;
                int i11 = typedArray.getInt(1, 1);
                if (i11 == 1) {
                    this.f23823l = Typeface.SANS_SERIF;
                    return;
                } else if (i11 == 2) {
                    this.f23823l = Typeface.SERIF;
                    return;
                } else {
                    if (i11 != 3) {
                        return;
                    }
                    this.f23823l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f23823l = null;
        int i12 = typedArray.hasValue(12) ? 12 : 10;
        int i13 = this.f23822k;
        int i14 = this.f23821j;
        if (!context.isRestricted()) {
            try {
                Typeface d10 = z10.d(i12, this.f23821j, new a(i13, i14, new WeakReference(this.f23813a)));
                if (d10 != null) {
                    if (i9 < 28 || this.f23822k == -1) {
                        this.f23823l = d10;
                    } else {
                        this.f23823l = d.a(Typeface.create(d10, 0), this.f23822k, (this.f23821j & 2) != 0);
                    }
                }
                this.f23824m = this.f23823l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f23823l != null || (string = typedArray.getString(i12)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f23822k == -1) {
            this.f23823l = Typeface.create(string, this.f23821j);
        } else {
            this.f23823l = d.a(Typeface.create(string, 0), this.f23822k, (this.f23821j & 2) != 0);
        }
    }

    /* compiled from: AppCompatTextHelper.java */
    /* renamed from: m.y$a */
    public class a extends f.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f23825a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f23826b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ WeakReference f23827c;

        public a(int i, int i9, WeakReference weakReference) {
            this.f23825a = i;
            this.f23826b = i9;
            this.f23827c = weakReference;
        }

        @Override // m0.f.c
        public final void c(Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f23825a) != -1) {
                typeface = d.a(typeface, i, (this.f23826b & 2) != 0);
            }
            C1022y c1022y = C1022y.this;
            if (c1022y.f23824m) {
                c1022y.f23823l = typeface;
                TextView textView = (TextView) this.f23827c.get();
                if (textView != null) {
                    if (textView.isAttachedToWindow()) {
                        textView.post(new A1.e(textView, typeface, c1022y.f23821j));
                    } else {
                        textView.setTypeface(typeface, c1022y.f23821j);
                    }
                }
            }
        }

        @Override // m0.f.c
        public final void b(int i) {
        }
    }
}

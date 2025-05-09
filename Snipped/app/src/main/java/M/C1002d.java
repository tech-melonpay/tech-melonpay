package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import g.C0756a;
import java.util.WeakHashMap;
import y0.C1596C;

/* compiled from: AppCompatBackgroundHelper.java */
/* renamed from: m.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1002d {

    /* renamed from: a, reason: collision with root package name */
    public final View f23746a;

    /* renamed from: d, reason: collision with root package name */
    public X f23749d;

    /* renamed from: e, reason: collision with root package name */
    public X f23750e;

    /* renamed from: f, reason: collision with root package name */
    public X f23751f;

    /* renamed from: c, reason: collision with root package name */
    public int f23748c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final C1008j f23747b = C1008j.a();

    public C1002d(View view) {
        this.f23746a = view;
    }

    public final void a() {
        View view = this.f23746a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f23749d != null) {
                if (this.f23751f == null) {
                    this.f23751f = new X();
                }
                X x9 = this.f23751f;
                x9.f23723a = null;
                x9.f23726d = false;
                x9.f23724b = null;
                x9.f23725c = false;
                WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
                ColorStateList c2 = C1596C.d.c(view);
                if (c2 != null) {
                    x9.f23726d = true;
                    x9.f23723a = c2;
                }
                PorterDuff.Mode d10 = C1596C.d.d(view);
                if (d10 != null) {
                    x9.f23725c = true;
                    x9.f23724b = d10;
                }
                if (x9.f23726d || x9.f23725c) {
                    C1008j.e(background, x9, view.getDrawableState());
                    return;
                }
            }
            X x10 = this.f23750e;
            if (x10 != null) {
                C1008j.e(background, x10, view.getDrawableState());
                return;
            }
            X x11 = this.f23749d;
            if (x11 != null) {
                C1008j.e(background, x11, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        X x9 = this.f23750e;
        if (x9 != null) {
            return x9.f23723a;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        X x9 = this.f23750e;
        if (x9 != null) {
            return x9.f23724b;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i) {
        ColorStateList h9;
        View view = this.f23746a;
        Context context = view.getContext();
        int[] iArr = C0756a.f20753z;
        Z f10 = Z.f(context, attributeSet, iArr, i, 0);
        TypedArray typedArray = f10.f23728b;
        View view2 = this.f23746a;
        C1596C.n(view2, view2.getContext(), iArr, attributeSet, f10.f23728b, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f23748c = typedArray.getResourceId(0, -1);
                C1008j c1008j = this.f23747b;
                Context context2 = view.getContext();
                int i9 = this.f23748c;
                synchronized (c1008j) {
                    h9 = c1008j.f23778a.h(context2, i9);
                }
                if (h9 != null) {
                    g(h9);
                }
            }
            if (typedArray.hasValue(1)) {
                C1596C.d.j(view, f10.a(1));
            }
            if (typedArray.hasValue(2)) {
                C1596C.d.k(view, C0996F.b(typedArray.getInt(2, -1), null));
            }
            f10.g();
        } catch (Throwable th) {
            f10.g();
            throw th;
        }
    }

    public final void e() {
        this.f23748c = -1;
        g(null);
        a();
    }

    public final void f(int i) {
        ColorStateList colorStateList;
        this.f23748c = i;
        C1008j c1008j = this.f23747b;
        if (c1008j != null) {
            Context context = this.f23746a.getContext();
            synchronized (c1008j) {
                colorStateList = c1008j.f23778a.h(context, i);
            }
        } else {
            colorStateList = null;
        }
        g(colorStateList);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f23749d == null) {
                this.f23749d = new X();
            }
            X x9 = this.f23749d;
            x9.f23723a = colorStateList;
            x9.f23726d = true;
        } else {
            this.f23749d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f23750e == null) {
            this.f23750e = new X();
        }
        X x9 = this.f23750e;
        x9.f23723a = colorStateList;
        x9.f23726d = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f23750e == null) {
            this.f23750e = new X();
        }
        X x9 = this.f23750e;
        x9.f23724b = mode;
        x9.f23725c = true;
        a();
    }
}

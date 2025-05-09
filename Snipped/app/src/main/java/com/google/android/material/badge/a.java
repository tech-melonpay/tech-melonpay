package com.google.android.material.badge;

import J2.f;
import J2.i;
import P2.d;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeState;
import com.luminary.mobile.R;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;

/* compiled from: BadgeDrawable.java */
/* loaded from: classes.dex */
public final class a extends Drawable implements f.b {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference<Context> f9094a;

    /* renamed from: b, reason: collision with root package name */
    public final T2.f f9095b;

    /* renamed from: c, reason: collision with root package name */
    public final f f9096c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f9097d;

    /* renamed from: e, reason: collision with root package name */
    public final BadgeState f9098e;

    /* renamed from: f, reason: collision with root package name */
    public float f9099f;

    /* renamed from: g, reason: collision with root package name */
    public float f9100g;

    /* renamed from: h, reason: collision with root package name */
    public final int f9101h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f9102j;

    /* renamed from: k, reason: collision with root package name */
    public float f9103k;

    /* renamed from: l, reason: collision with root package name */
    public WeakReference<View> f9104l;

    /* renamed from: m, reason: collision with root package name */
    public WeakReference<FrameLayout> f9105m;

    public a(Context context, BadgeState.State state) {
        d dVar;
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.f9094a = weakReference;
        i.c(context, i.f2135b, "Theme.MaterialComponents");
        this.f9097d = new Rect();
        f fVar = new f(this);
        this.f9096c = fVar;
        TextPaint textPaint = fVar.f2125a;
        textPaint.setTextAlign(Paint.Align.CENTER);
        BadgeState badgeState = new BadgeState(context, state);
        this.f9098e = badgeState;
        boolean f10 = f();
        BadgeState.State state2 = badgeState.f9056b;
        T2.f fVar2 = new T2.f(T2.i.a(context, f10 ? state2.f9075g.intValue() : state2.f9073e.intValue(), f() ? state2.f9076h.intValue() : state2.f9074f.intValue(), new T2.a(0)).a());
        this.f9095b = fVar2;
        h();
        Context context2 = weakReference.get();
        if (context2 != null && fVar.f2131g != (dVar = new d(context2, state2.f9072d.intValue()))) {
            fVar.b(dVar, context2);
            textPaint.setColor(state2.f9071c.intValue());
            invalidateSelf();
            j();
            invalidateSelf();
        }
        int i = state2.f9079l;
        if (i != -2) {
            this.f9101h = ((int) Math.pow(10.0d, i - 1.0d)) - 1;
        } else {
            this.f9101h = state2.f9080m;
        }
        fVar.f2129e = true;
        j();
        invalidateSelf();
        fVar.f2129e = true;
        h();
        j();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(state2.f9070b.intValue());
        if (fVar2.f3448a.f3473c != valueOf) {
            fVar2.o(valueOf);
            invalidateSelf();
        }
        textPaint.setColor(state2.f9071c.intValue());
        invalidateSelf();
        WeakReference<View> weakReference2 = this.f9104l;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = this.f9104l.get();
            WeakReference<FrameLayout> weakReference3 = this.f9105m;
            i(view, weakReference3 != null ? weakReference3.get() : null);
        }
        j();
        setVisible(state2.f9087t.booleanValue(), false);
    }

    @Override // J2.f.b
    public final void a() {
        invalidateSelf();
    }

    public final String b() {
        BadgeState badgeState = this.f9098e;
        BadgeState.State state = badgeState.f9056b;
        String str = state.f9077j;
        boolean z10 = str != null;
        WeakReference<Context> weakReference = this.f9094a;
        if (z10) {
            int i = state.f9079l;
            if (i == -2 || str == null || str.length() <= i) {
                return str;
            }
            Context context = weakReference.get();
            if (context == null) {
                return "";
            }
            return String.format(context.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i - 1), "…");
        }
        if (!g()) {
            return null;
        }
        int i9 = this.f9101h;
        BadgeState.State state2 = badgeState.f9056b;
        if (i9 == -2 || e() <= this.f9101h) {
            return NumberFormat.getInstance(state2.f9081n).format(e());
        }
        Context context2 = weakReference.get();
        return context2 == null ? "" : String.format(state2.f9081n, context2.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f9101h), "+");
    }

    public final CharSequence c() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        BadgeState badgeState = this.f9098e;
        BadgeState.State state = badgeState.f9056b;
        String str = state.f9077j;
        if (str != null) {
            CharSequence charSequence = state.f9082o;
            return charSequence != null ? charSequence : str;
        }
        boolean g10 = g();
        BadgeState.State state2 = badgeState.f9056b;
        if (!g10) {
            return state2.f9083p;
        }
        if (state2.f9084q == 0 || (context = this.f9094a.get()) == null) {
            return null;
        }
        if (this.f9101h != -2) {
            int e10 = e();
            int i = this.f9101h;
            if (e10 > i) {
                return context.getString(state2.f9085r, Integer.valueOf(i));
            }
        }
        return context.getResources().getQuantityString(state2.f9084q, e(), Integer.valueOf(e()));
    }

    public final FrameLayout d() {
        WeakReference<FrameLayout> weakReference = this.f9105m;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String b9;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f9095b.draw(canvas);
        if (!f() || (b9 = b()) == null) {
            return;
        }
        Rect rect = new Rect();
        f fVar = this.f9096c;
        fVar.f2125a.getTextBounds(b9, 0, b9.length(), rect);
        float exactCenterY = this.f9100g - rect.exactCenterY();
        canvas.drawText(b9, this.f9099f, rect.bottom <= 0 ? (int) exactCenterY : Math.round(exactCenterY), fVar.f2125a);
    }

    public final int e() {
        int i = this.f9098e.f9056b.f9078k;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    public final boolean f() {
        return this.f9098e.f9056b.f9077j != null || g();
    }

    public final boolean g() {
        BadgeState.State state = this.f9098e.f9056b;
        return state.f9077j == null && state.f9078k != -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f9098e.f9056b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f9097d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f9097d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        Context context = this.f9094a.get();
        if (context == null) {
            return;
        }
        boolean f10 = f();
        BadgeState badgeState = this.f9098e;
        this.f9095b.setShapeAppearanceModel(T2.i.a(context, f10 ? badgeState.f9056b.f9075g.intValue() : badgeState.f9056b.f9073e.intValue(), f() ? badgeState.f9056b.f9076h.intValue() : badgeState.f9056b.f9074f.intValue(), new T2.a(0)).a());
        invalidateSelf();
    }

    public final void i(View view, FrameLayout frameLayout) {
        this.f9104l = new WeakReference<>(view);
        this.f9105m = new WeakReference<>(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        j();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.badge.a.j():void");
    }

    @Override // android.graphics.drawable.Drawable, J2.f.b
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        BadgeState badgeState = this.f9098e;
        badgeState.f9055a.i = i;
        badgeState.f9056b.i = i;
        this.f9096c.f2125a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

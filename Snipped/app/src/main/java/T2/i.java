package T2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import t2.C1279a;

/* compiled from: ShapeAppearanceModel.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public Ja.a f3493a = new h();

    /* renamed from: b, reason: collision with root package name */
    public Ja.a f3494b = new h();

    /* renamed from: c, reason: collision with root package name */
    public Ja.a f3495c = new h();

    /* renamed from: d, reason: collision with root package name */
    public Ja.a f3496d = new h();

    /* renamed from: e, reason: collision with root package name */
    public c f3497e = new T2.a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public c f3498f = new T2.a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public c f3499g = new T2.a(0.0f);

    /* renamed from: h, reason: collision with root package name */
    public c f3500h = new T2.a(0.0f);
    public e i = new e();

    /* renamed from: j, reason: collision with root package name */
    public e f3501j = new e();

    /* renamed from: k, reason: collision with root package name */
    public e f3502k = new e();

    /* renamed from: l, reason: collision with root package name */
    public e f3503l = new e();

    /* compiled from: ShapeAppearanceModel.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public Ja.a f3504a = new h();

        /* renamed from: b, reason: collision with root package name */
        public Ja.a f3505b = new h();

        /* renamed from: c, reason: collision with root package name */
        public Ja.a f3506c = new h();

        /* renamed from: d, reason: collision with root package name */
        public Ja.a f3507d = new h();

        /* renamed from: e, reason: collision with root package name */
        public c f3508e = new T2.a(0.0f);

        /* renamed from: f, reason: collision with root package name */
        public c f3509f = new T2.a(0.0f);

        /* renamed from: g, reason: collision with root package name */
        public c f3510g = new T2.a(0.0f);

        /* renamed from: h, reason: collision with root package name */
        public c f3511h = new T2.a(0.0f);
        public e i = new e();

        /* renamed from: j, reason: collision with root package name */
        public e f3512j = new e();

        /* renamed from: k, reason: collision with root package name */
        public e f3513k = new e();

        /* renamed from: l, reason: collision with root package name */
        public e f3514l = new e();

        public static float b(Ja.a aVar) {
            if (aVar instanceof h) {
                return ((h) aVar).f3492b;
            }
            if (aVar instanceof d) {
                return ((d) aVar).f3446b;
            }
            return -1.0f;
        }

        public final i a() {
            i iVar = new i();
            iVar.f3493a = this.f3504a;
            iVar.f3494b = this.f3505b;
            iVar.f3495c = this.f3506c;
            iVar.f3496d = this.f3507d;
            iVar.f3497e = this.f3508e;
            iVar.f3498f = this.f3509f;
            iVar.f3499g = this.f3510g;
            iVar.f3500h = this.f3511h;
            iVar.i = this.i;
            iVar.f3501j = this.f3512j;
            iVar.f3502k = this.f3513k;
            iVar.f3503l = this.f3514l;
            return iVar;
        }

        public final void c(float f10) {
            f(f10);
            g(f10);
            e(f10);
            d(f10);
        }

        public final void d(float f10) {
            this.f3511h = new T2.a(f10);
        }

        public final void e(float f10) {
            this.f3510g = new T2.a(f10);
        }

        public final void f(float f10) {
            this.f3508e = new T2.a(f10);
        }

        public final void g(float f10) {
            this.f3509f = new T2.a(f10);
        }
    }

    public static a a(Context context, int i, int i9, T2.a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i9 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i9);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(C1279a.f27477K);
        try {
            int i10 = obtainStyledAttributes.getInt(0, 0);
            int i11 = obtainStyledAttributes.getInt(3, i10);
            int i12 = obtainStyledAttributes.getInt(4, i10);
            int i13 = obtainStyledAttributes.getInt(2, i10);
            int i14 = obtainStyledAttributes.getInt(1, i10);
            c c2 = c(obtainStyledAttributes, 5, aVar);
            c c10 = c(obtainStyledAttributes, 8, c2);
            c c11 = c(obtainStyledAttributes, 9, c2);
            c c12 = c(obtainStyledAttributes, 7, c2);
            c c13 = c(obtainStyledAttributes, 6, c2);
            a aVar2 = new a();
            Ja.a e10 = Ja.a.e(i11);
            aVar2.f3504a = e10;
            float b9 = a.b(e10);
            if (b9 != -1.0f) {
                aVar2.f(b9);
            }
            aVar2.f3508e = c10;
            Ja.a e11 = Ja.a.e(i12);
            aVar2.f3505b = e11;
            float b10 = a.b(e11);
            if (b10 != -1.0f) {
                aVar2.g(b10);
            }
            aVar2.f3509f = c11;
            Ja.a e12 = Ja.a.e(i13);
            aVar2.f3506c = e12;
            float b11 = a.b(e12);
            if (b11 != -1.0f) {
                aVar2.e(b11);
            }
            aVar2.f3510g = c12;
            Ja.a e13 = Ja.a.e(i14);
            aVar2.f3507d = e13;
            float b12 = a.b(e13);
            if (b12 != -1.0f) {
                aVar2.d(b12);
            }
            aVar2.f3511h = c13;
            return aVar2;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static a b(Context context, AttributeSet attributeSet, int i, int i9) {
        T2.a aVar = new T2.a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1279a.f27468B, i, i9);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return cVar;
        }
        int i9 = peekValue.type;
        return i9 == 5 ? new T2.a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i9 == 6 ? new g(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public final boolean d(RectF rectF) {
        boolean z10 = this.f3503l.getClass().equals(e.class) && this.f3501j.getClass().equals(e.class) && this.i.getClass().equals(e.class) && this.f3502k.getClass().equals(e.class);
        float a10 = this.f3497e.a(rectF);
        return z10 && ((this.f3498f.a(rectF) > a10 ? 1 : (this.f3498f.a(rectF) == a10 ? 0 : -1)) == 0 && (this.f3500h.a(rectF) > a10 ? 1 : (this.f3500h.a(rectF) == a10 ? 0 : -1)) == 0 && (this.f3499g.a(rectF) > a10 ? 1 : (this.f3499g.a(rectF) == a10 ? 0 : -1)) == 0) && ((this.f3494b instanceof h) && (this.f3493a instanceof h) && (this.f3495c instanceof h) && (this.f3496d instanceof h));
    }

    public final a e() {
        a aVar = new a();
        aVar.f3504a = new h();
        aVar.f3505b = new h();
        aVar.f3506c = new h();
        aVar.f3507d = new h();
        aVar.f3508e = new T2.a(0.0f);
        aVar.f3509f = new T2.a(0.0f);
        aVar.f3510g = new T2.a(0.0f);
        aVar.f3511h = new T2.a(0.0f);
        aVar.i = new e();
        aVar.f3512j = new e();
        aVar.f3513k = new e();
        new e();
        aVar.f3504a = this.f3493a;
        aVar.f3505b = this.f3494b;
        aVar.f3506c = this.f3495c;
        aVar.f3507d = this.f3496d;
        aVar.f3508e = this.f3497e;
        aVar.f3509f = this.f3498f;
        aVar.f3510g = this.f3499g;
        aVar.f3511h = this.f3500h;
        aVar.i = this.i;
        aVar.f3512j = this.f3501j;
        aVar.f3513k = this.f3502k;
        aVar.f3514l = this.f3503l;
        return aVar;
    }
}

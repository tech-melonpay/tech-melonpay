package N2;

import N2.c;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* compiled from: DrawingDelegate.java */
/* loaded from: classes.dex */
public abstract class k<S extends c> {

    /* renamed from: a, reason: collision with root package name */
    public final S f2806a;

    /* compiled from: DrawingDelegate.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public float f2807a;

        /* renamed from: b, reason: collision with root package name */
        public float f2808b;

        /* renamed from: c, reason: collision with root package name */
        public int f2809c;

        /* renamed from: d, reason: collision with root package name */
        public int f2810d;
    }

    public k(S s10) {
        this.f2806a = s10;
    }

    public abstract void a(Canvas canvas, Rect rect, float f10, boolean z10, boolean z11);

    public abstract void b(Canvas canvas, Paint paint, int i, int i9);

    public abstract void c(Canvas canvas, Paint paint, a aVar, int i);

    public abstract void d(Canvas canvas, Paint paint, float f10, float f11, int i, int i9, int i10);

    public abstract int e();

    public abstract int f();
}

package S2;

import android.graphics.Paint;
import android.graphics.Path;

/* compiled from: ShadowRenderer.java */
/* loaded from: classes.dex */
public final class a {
    public static final int[] i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f3364j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f3365k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f3366l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f3367a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f3368b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f3369c;

    /* renamed from: d, reason: collision with root package name */
    public int f3370d;

    /* renamed from: e, reason: collision with root package name */
    public int f3371e;

    /* renamed from: f, reason: collision with root package name */
    public int f3372f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f3373g = new Path();

    /* renamed from: h, reason: collision with root package name */
    public final Paint f3374h;

    public a() {
        Paint paint = new Paint();
        this.f3374h = paint;
        this.f3367a = new Paint();
        a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f3368b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f3369c = new Paint(paint2);
    }

    public final void a(int i9) {
        this.f3370d = n0.a.h(i9, 68);
        this.f3371e = n0.a.h(i9, 20);
        this.f3372f = n0.a.h(i9, 0);
        this.f3367a.setColor(this.f3370d);
    }
}

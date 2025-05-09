package G2;

import P2.b;
import android.content.Context;
import android.graphics.Color;
import com.luminary.mobile.R;

/* compiled from: ElevationOverlayProvider.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f1308f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1309a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1310b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1311c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1312d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1313e;

    public a(Context context) {
        boolean b9 = b.b(context, R.attr.elevationOverlayEnabled, false);
        int y10 = D9.b.y(context, R.attr.elevationOverlayColor, 0);
        int y11 = D9.b.y(context, R.attr.elevationOverlayAccentColor, 0);
        int y12 = D9.b.y(context, R.attr.colorSurface, 0);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f1309a = b9;
        this.f1310b = y10;
        this.f1311c = y11;
        this.f1312d = y12;
        this.f1313e = f10;
    }

    public final int a(int i, float f10) {
        int i9;
        if (!this.f1309a || n0.a.h(i, 255) != this.f1312d) {
            return i;
        }
        float min = (this.f1313e <= 0.0f || f10 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f10 / r1)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int n02 = D9.b.n0(n0.a.h(i, 255), min, this.f1310b);
        if (min > 0.0f && (i9 = this.f1311c) != 0) {
            n02 = n0.a.f(n0.a.h(i9, f1308f), n02);
        }
        return n0.a.h(n02, alpha);
    }
}

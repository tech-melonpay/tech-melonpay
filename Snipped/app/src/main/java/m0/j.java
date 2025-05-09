package m0;

/* compiled from: ViewingConditions.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: k, reason: collision with root package name */
    public static final j f23869k;

    /* renamed from: a, reason: collision with root package name */
    public final float f23870a;

    /* renamed from: b, reason: collision with root package name */
    public final float f23871b;

    /* renamed from: c, reason: collision with root package name */
    public final float f23872c;

    /* renamed from: d, reason: collision with root package name */
    public final float f23873d;

    /* renamed from: e, reason: collision with root package name */
    public final float f23874e;

    /* renamed from: f, reason: collision with root package name */
    public final float f23875f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f23876g;

    /* renamed from: h, reason: collision with root package name */
    public final float f23877h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final float f23878j;

    static {
        float[] fArr = b.f23840c;
        float c2 = (float) ((b.c() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f23838a;
        float f10 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f11 = fArr3[0] * f10;
        float f12 = fArr[1];
        float f13 = (fArr3[1] * f12) + f11;
        float f14 = fArr[2];
        float f15 = (fArr3[2] * f14) + f13;
        float[] fArr4 = fArr2[1];
        float f16 = (fArr4[2] * f14) + (fArr4[1] * f12) + (fArr4[0] * f10);
        float[] fArr5 = fArr2[2];
        float f17 = (f14 * fArr5[2]) + (f12 * fArr5[1]) + (f10 * fArr5[0]);
        float f18 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float exp = (1.0f - (((float) Math.exp(((-c2) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d10 = exp;
        if (d10 > 1.0d) {
            exp = 1.0f;
        } else if (d10 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f15) * exp) + 1.0f) - exp, (((100.0f / f16) * exp) + 1.0f) - exp, (((100.0f / f17) * exp) + 1.0f) - exp};
        float f19 = 1.0f / ((5.0f * c2) + 1.0f);
        float f20 = f19 * f19 * f19 * f19;
        float f21 = 1.0f - f20;
        float cbrt = (0.1f * f21 * f21 * ((float) Math.cbrt(c2 * 5.0d))) + (f20 * c2);
        float c10 = b.c() / fArr[1];
        double d11 = c10;
        float sqrt = ((float) Math.sqrt(d11)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d11, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f15) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f16) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * cbrt) * f17) / 100.0d, 0.42d)};
        float f22 = fArr7[0];
        float f23 = (f22 * 400.0f) / (f22 + 27.13f);
        float f24 = fArr7[1];
        float f25 = (f24 * 400.0f) / (f24 + 27.13f);
        float f26 = fArr7[2];
        float[] fArr8 = {f23, f25, (400.0f * f26) / (f26 + 27.13f)};
        f23869k = new j(c10, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * pow, pow, pow, f18, 1.0f, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public j(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f23875f = f10;
        this.f23870a = f11;
        this.f23871b = f12;
        this.f23872c = f13;
        this.f23873d = f14;
        this.f23874e = f15;
        this.f23876g = fArr;
        this.f23877h = f16;
        this.i = f17;
        this.f23878j = f18;
    }
}

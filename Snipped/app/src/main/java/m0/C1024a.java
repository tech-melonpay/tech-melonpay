package m0;

import android.graphics.Color;

/* compiled from: CamColor.java */
/* renamed from: m0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1024a {

    /* renamed from: a, reason: collision with root package name */
    public final float f23832a;

    /* renamed from: b, reason: collision with root package name */
    public final float f23833b;

    /* renamed from: c, reason: collision with root package name */
    public final float f23834c;

    /* renamed from: d, reason: collision with root package name */
    public final float f23835d;

    /* renamed from: e, reason: collision with root package name */
    public final float f23836e;

    /* renamed from: f, reason: collision with root package name */
    public final float f23837f;

    public C1024a(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f23832a = f10;
        this.f23833b = f11;
        this.f23834c = f12;
        this.f23835d = f13;
        this.f23836e = f14;
        this.f23837f = f15;
    }

    public static C1024a a(int i) {
        j jVar = j.f23869k;
        float b9 = b.b(Color.red(i));
        float b10 = b.b(Color.green(i));
        float b11 = b.b(Color.blue(i));
        float[][] fArr = b.f23841d;
        float[] fArr2 = fArr[0];
        float f10 = (fArr2[2] * b11) + (fArr2[1] * b10) + (fArr2[0] * b9);
        float[] fArr3 = fArr[1];
        float f11 = (fArr3[2] * b11) + (fArr3[1] * b10) + (fArr3[0] * b9);
        float[] fArr4 = fArr[2];
        float f12 = (b11 * fArr4[2]) + (b10 * fArr4[1]) + (b9 * fArr4[0]);
        float[][] fArr5 = b.f23838a;
        float[] fArr6 = fArr5[0];
        float f13 = (fArr6[2] * f12) + (fArr6[1] * f11) + (fArr6[0] * f10);
        float[] fArr7 = fArr5[1];
        float f14 = (fArr7[2] * f12) + (fArr7[1] * f11) + (fArr7[0] * f10);
        float[] fArr8 = fArr5[2];
        float f15 = (f12 * fArr8[2]) + (f11 * fArr8[1]) + (f10 * fArr8[0]);
        float[] fArr9 = jVar.f23876g;
        float f16 = fArr9[0] * f13;
        float f17 = fArr9[1] * f14;
        float f18 = fArr9[2] * f15;
        float abs = Math.abs(f16);
        float f19 = jVar.f23877h;
        float pow = (float) Math.pow((abs * f19) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f17) * f19) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f18) * f19) / 100.0d, 0.42d);
        float signum = ((Math.signum(f16) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f17) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f18) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d10 = signum3;
        float f20 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d10)) / 11.0f;
        float f21 = ((float) ((signum + signum2) - (d10 * 2.0d))) / 9.0f;
        float f22 = signum2 * 20.0f;
        float f23 = ((21.0f * signum3) + ((signum * 20.0f) + f22)) / 20.0f;
        float f24 = (((signum * 40.0f) + f22) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f21, f20)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f25 = atan2;
        float f26 = (3.1415927f * f25) / 180.0f;
        float f27 = f24 * jVar.f23871b;
        float f28 = jVar.f23870a;
        float f29 = jVar.f23873d;
        float pow4 = ((float) Math.pow(f27 / f28, jVar.f23878j * f29)) * 100.0f;
        Math.sqrt(pow4 / 100.0f);
        float f30 = f28 + 4.0f;
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, jVar.f23875f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f25) < 20.14d ? 360.0f + f25 : f25) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * jVar.f23874e) * jVar.f23872c) * ((float) Math.sqrt((f21 * f21) + (f20 * f20)))) / (f23 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        float f31 = jVar.i * pow5;
        Math.sqrt((r3 * f29) / f30);
        float f32 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((f31 * 0.0228f) + 1.0f)) * 43.85965f;
        double d11 = f26;
        return new C1024a(f25, pow5, pow4, f32, log * ((float) Math.cos(d11)), log * ((float) Math.sin(d11)));
    }

    public static C1024a b(float f10, float f11, float f12) {
        j jVar = j.f23869k;
        float f13 = jVar.f23873d;
        Math.sqrt(f10 / 100.0d);
        float f14 = jVar.f23870a + 4.0f;
        float f15 = jVar.i * f11;
        Math.sqrt(((f11 / ((float) Math.sqrt(r1))) * jVar.f23873d) / f14);
        float f16 = (1.7f * f10) / ((0.007f * f10) + 1.0f);
        float log = ((float) Math.log((f15 * 0.0228d) + 1.0d)) * 43.85965f;
        double d10 = (3.1415927f * f12) / 180.0f;
        return new C1024a(f12, f11, f10, f16, log * ((float) Math.cos(d10)), log * ((float) Math.sin(d10)));
    }

    public final int c(j jVar) {
        float f10;
        float f11 = this.f23833b;
        double d10 = f11;
        float f12 = this.f23834c;
        if (d10 != 0.0d) {
            double d11 = f12;
            if (d11 != 0.0d) {
                f10 = f11 / ((float) Math.sqrt(d11 / 100.0d));
                float pow = (float) Math.pow(f10 / Math.pow(1.64d - Math.pow(0.29d, jVar.f23875f), 0.73d), 1.1111111111111112d);
                double d12 = (this.f23832a * 3.1415927f) / 180.0f;
                float cos = ((float) (Math.cos(2.0d + d12) + 3.8d)) * 0.25f;
                float pow2 = jVar.f23870a * ((float) Math.pow(f12 / 100.0d, (1.0d / jVar.f23873d) / jVar.f23878j));
                float f13 = cos * 3846.1538f * jVar.f23874e * jVar.f23872c;
                float f14 = pow2 / jVar.f23871b;
                float sin = (float) Math.sin(d12);
                float cos2 = (float) Math.cos(d12);
                float f15 = (((0.305f + f14) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (f13 * 23.0f)));
                float f16 = cos2 * f15;
                float f17 = f15 * sin;
                float f18 = f14 * 460.0f;
                float f19 = ((288.0f * f17) + ((451.0f * f16) + f18)) / 1403.0f;
                float f20 = ((f18 - (891.0f * f16)) - (261.0f * f17)) / 1403.0f;
                float f21 = ((f18 - (f16 * 220.0f)) - (f17 * 6300.0f)) / 1403.0f;
                float max = (float) Math.max(0.0d, (Math.abs(f19) * 27.13d) / (400.0d - Math.abs(f19)));
                float signum = Math.signum(f19);
                float f22 = 100.0f / jVar.f23877h;
                float pow3 = signum * f22 * ((float) Math.pow(max, 2.380952380952381d));
                float signum2 = Math.signum(f20) * f22 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f20) * 27.13d) / (400.0d - Math.abs(f20))), 2.380952380952381d));
                float signum3 = Math.signum(f21) * f22 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f21) * 27.13d) / (400.0d - Math.abs(f21))), 2.380952380952381d));
                float[] fArr = jVar.f23876g;
                float f23 = pow3 / fArr[0];
                float f24 = signum2 / fArr[1];
                float f25 = signum3 / fArr[2];
                float[][] fArr2 = b.f23839b;
                float[] fArr3 = fArr2[0];
                float f26 = (fArr3[2] * f25) + (fArr3[1] * f24) + (fArr3[0] * f23);
                float[] fArr4 = fArr2[1];
                float f27 = (fArr4[2] * f25) + (fArr4[1] * f24) + (fArr4[0] * f23);
                float[] fArr5 = fArr2[2];
                return n0.a.b(f26, f27, (f25 * fArr5[2]) + (f24 * fArr5[1]) + (f23 * fArr5[0]));
            }
        }
        f10 = 0.0f;
        float pow4 = (float) Math.pow(f10 / Math.pow(1.64d - Math.pow(0.29d, jVar.f23875f), 0.73d), 1.1111111111111112d);
        double d122 = (this.f23832a * 3.1415927f) / 180.0f;
        float cos3 = ((float) (Math.cos(2.0d + d122) + 3.8d)) * 0.25f;
        float pow22 = jVar.f23870a * ((float) Math.pow(f12 / 100.0d, (1.0d / jVar.f23873d) / jVar.f23878j));
        float f132 = cos3 * 3846.1538f * jVar.f23874e * jVar.f23872c;
        float f142 = pow22 / jVar.f23871b;
        float sin2 = (float) Math.sin(d122);
        float cos22 = (float) Math.cos(d122);
        float f152 = (((0.305f + f142) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + (((11.0f * pow4) * cos22) + (f132 * 23.0f)));
        float f162 = cos22 * f152;
        float f172 = f152 * sin2;
        float f182 = f142 * 460.0f;
        float f192 = ((288.0f * f172) + ((451.0f * f162) + f182)) / 1403.0f;
        float f202 = ((f182 - (891.0f * f162)) - (261.0f * f172)) / 1403.0f;
        float f212 = ((f182 - (f162 * 220.0f)) - (f172 * 6300.0f)) / 1403.0f;
        float max2 = (float) Math.max(0.0d, (Math.abs(f192) * 27.13d) / (400.0d - Math.abs(f192)));
        float signum4 = Math.signum(f192);
        float f222 = 100.0f / jVar.f23877h;
        float pow32 = signum4 * f222 * ((float) Math.pow(max2, 2.380952380952381d));
        float signum22 = Math.signum(f202) * f222 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f202) * 27.13d) / (400.0d - Math.abs(f202))), 2.380952380952381d));
        float signum32 = Math.signum(f212) * f222 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f212) * 27.13d) / (400.0d - Math.abs(f212))), 2.380952380952381d));
        float[] fArr6 = jVar.f23876g;
        float f232 = pow32 / fArr6[0];
        float f242 = signum22 / fArr6[1];
        float f252 = signum32 / fArr6[2];
        float[][] fArr22 = b.f23839b;
        float[] fArr32 = fArr22[0];
        float f262 = (fArr32[2] * f252) + (fArr32[1] * f242) + (fArr32[0] * f232);
        float[] fArr42 = fArr22[1];
        float f272 = (fArr42[2] * f252) + (fArr42[1] * f242) + (fArr42[0] * f232);
        float[] fArr52 = fArr22[2];
        return n0.a.b(f262, f272, (f252 * fArr52[2]) + (f242 * fArr52[1]) + (f232 * fArr52[0]));
    }
}

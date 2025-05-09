package n0;

import android.graphics.Path;
import android.util.Log;

/* compiled from: PathParser.java */
/* loaded from: classes.dex */
public final class d {
    public static boolean a(a[] aVarArr, a[] aVarArr2) {
        if (aVarArr == null || aVarArr2 == null || aVarArr.length != aVarArr2.length) {
            return false;
        }
        for (int i = 0; i < aVarArr.length; i++) {
            a aVar = aVarArr[i];
            char c2 = aVar.f24071a;
            a aVar2 = aVarArr2[i];
            if (c2 != aVar2.f24071a || aVar.f24072b.length != aVar2.f24072b.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] b(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int min = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:35:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static n0.d.a[] c(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.d.c(java.lang.String):n0.d$a[]");
    }

    public static Path d(String str) {
        Path path = new Path();
        try {
            a.b(c(str), path);
            return path;
        } catch (RuntimeException e10) {
            throw new RuntimeException("Error in parsing ".concat(str), e10);
        }
    }

    public static a[] e(a[] aVarArr) {
        a[] aVarArr2 = new a[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            aVarArr2[i] = new a(aVarArr[i]);
        }
        return aVarArr2;
    }

    /* compiled from: PathParser.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public char f24071a;

        /* renamed from: b, reason: collision with root package name */
        public final float[] f24072b;

        public a(char c2, float[] fArr) {
            this.f24071a = c2;
            this.f24072b = fArr;
        }

        public static void a(Path path, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z10, boolean z11) {
            double d10;
            double d11;
            double radians = Math.toRadians(f16);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d12 = f10;
            double d13 = f11;
            double d14 = (d13 * sin) + (d12 * cos);
            double d15 = d12;
            double d16 = f14;
            double d17 = d14 / d16;
            double d18 = f15;
            double d19 = ((d13 * cos) + ((-f10) * sin)) / d18;
            double d20 = d13;
            double d21 = f13;
            double d22 = ((d21 * sin) + (f12 * cos)) / d16;
            double d23 = ((d21 * cos) + ((-f12) * sin)) / d18;
            double d24 = d17 - d22;
            double d25 = d19 - d23;
            double d26 = (d17 + d22) / 2.0d;
            double d27 = (d19 + d23) / 2.0d;
            double d28 = (d25 * d25) + (d24 * d24);
            if (d28 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d29 = (1.0d / d28) - 0.25d;
            if (d29 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d28);
                float sqrt = (float) (Math.sqrt(d28) / 1.99999d);
                a(path, f10, f11, f12, f13, f14 * sqrt, f15 * sqrt, f16, z10, z11);
                return;
            }
            double sqrt2 = Math.sqrt(d29);
            double d30 = d24 * sqrt2;
            double d31 = sqrt2 * d25;
            if (z10 == z11) {
                d10 = d26 - d31;
                d11 = d27 + d30;
            } else {
                d10 = d26 + d31;
                d11 = d27 - d30;
            }
            double atan2 = Math.atan2(d19 - d11, d17 - d10);
            double atan22 = Math.atan2(d23 - d11, d22 - d10) - atan2;
            if (z11 != (atan22 >= 0.0d)) {
                atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d32 = d10 * d16;
            double d33 = d11 * d18;
            double d34 = (d32 * cos) - (d33 * sin);
            double d35 = (d33 * cos) + (d32 * sin);
            int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
            double cos2 = Math.cos(radians);
            double sin2 = Math.sin(radians);
            double cos3 = Math.cos(atan2);
            double sin3 = Math.sin(atan2);
            double d36 = -d16;
            double d37 = d36 * cos2;
            double d38 = d18 * sin2;
            double d39 = (d37 * sin3) - (d38 * cos3);
            double d40 = d36 * sin2;
            double d41 = d18 * cos2;
            double d42 = (cos3 * d41) + (sin3 * d40);
            double d43 = d41;
            double d44 = atan22 / ceil;
            int i = 0;
            while (i < ceil) {
                double d45 = atan2 + d44;
                double sin4 = Math.sin(d45);
                double cos4 = Math.cos(d45);
                double d46 = d44;
                double d47 = (((d16 * cos2) * cos4) + d34) - (d38 * sin4);
                double d48 = d43;
                double d49 = d34;
                double d50 = (d48 * sin4) + (d16 * sin2 * cos4) + d35;
                double d51 = (d37 * sin4) - (d38 * cos4);
                double d52 = (cos4 * d48) + (sin4 * d40);
                double d53 = d45 - atan2;
                double tan = Math.tan(d53 / 2.0d);
                double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d53)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) ((d39 * sqrt3) + d15), (float) ((d42 * sqrt3) + d20), (float) (d47 - (sqrt3 * d51)), (float) (d50 - (sqrt3 * d52)), (float) d47, (float) d50);
                i++;
                atan2 = d45;
                d40 = d40;
                cos2 = cos2;
                ceil = ceil;
                d42 = d52;
                d16 = d16;
                d39 = d51;
                d15 = d47;
                d20 = d50;
                d34 = d49;
                d44 = d46;
                d43 = d48;
            }
        }

        @Deprecated
        public static void b(a[] aVarArr, Path path) {
            int i;
            int i9;
            char c2;
            int i10;
            int i11;
            a aVar;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            float f20;
            float f21;
            a[] aVarArr2 = aVarArr;
            int i12 = 6;
            float[] fArr = new float[6];
            int length = aVarArr2.length;
            int i13 = 0;
            char c10 = 'm';
            while (i13 < length) {
                a aVar2 = aVarArr2[i13];
                char c11 = aVar2.f24071a;
                float f22 = fArr[0];
                float f23 = fArr[1];
                float f24 = fArr[2];
                float f25 = fArr[3];
                float f26 = fArr[4];
                float f27 = fArr[5];
                switch (c11) {
                    case 'A':
                    case 'a':
                        i = 7;
                        break;
                    case 'C':
                    case 'c':
                        i = i12;
                        break;
                    case 'H':
                    case 'V':
                    case 'h':
                    case 'v':
                        i = 1;
                        break;
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        i = 4;
                        break;
                    case 'Z':
                    case 'z':
                        path.close();
                        path.moveTo(f26, f27);
                        f22 = f26;
                        f24 = f22;
                        f23 = f27;
                        f25 = f23;
                    default:
                        i = 2;
                        break;
                }
                float f28 = f26;
                float f29 = f27;
                float f30 = f22;
                float f31 = f23;
                int i14 = 0;
                while (true) {
                    float[] fArr2 = aVar2.f24072b;
                    if (i14 < fArr2.length) {
                        if (c11 != 'A') {
                            if (c11 != 'C') {
                                if (c11 == 'H') {
                                    i9 = i14;
                                    c2 = c11;
                                    i10 = i13;
                                    i11 = length;
                                    aVar = aVar2;
                                    path.lineTo(fArr2[i9], f31);
                                    f30 = fArr2[i9];
                                } else if (c11 == 'Q') {
                                    i9 = i14;
                                    c2 = c11;
                                    i10 = i13;
                                    i11 = length;
                                    aVar = aVar2;
                                    float f32 = fArr2[i9];
                                    int i15 = i9 + 1;
                                    float f33 = fArr2[i15];
                                    int i16 = i9 + 2;
                                    int i17 = i9 + 3;
                                    path.quadTo(f32, f33, fArr2[i16], fArr2[i17]);
                                    f10 = fArr2[i9];
                                    f11 = fArr2[i15];
                                    f30 = fArr2[i16];
                                    f31 = fArr2[i17];
                                } else if (c11 == 'V') {
                                    i9 = i14;
                                    c2 = c11;
                                    i10 = i13;
                                    i11 = length;
                                    aVar = aVar2;
                                    path.lineTo(f30, fArr2[i9]);
                                    f31 = fArr2[i9];
                                } else if (c11 != 'a') {
                                    if (c11 != 'c') {
                                        if (c11 != 'h') {
                                            if (c11 == 'q') {
                                                i9 = i14;
                                                float f34 = f31;
                                                float f35 = f30;
                                                int i18 = i9 + 1;
                                                int i19 = i9 + 2;
                                                int i20 = i9 + 3;
                                                path.rQuadTo(fArr2[i9], fArr2[i18], fArr2[i19], fArr2[i20]);
                                                float f36 = f35 + fArr2[i9];
                                                float f37 = fArr2[i18] + f34;
                                                float f38 = f35 + fArr2[i19];
                                                f31 = f34 + fArr2[i20];
                                                f25 = f37;
                                                f24 = f36;
                                                c2 = c11;
                                                i10 = i13;
                                                i11 = length;
                                                f30 = f38;
                                            } else if (c11 == 'v') {
                                                i9 = i14;
                                                path.rLineTo(0.0f, fArr2[i9]);
                                                f31 += fArr2[i9];
                                            } else if (c11 == 'L') {
                                                i9 = i14;
                                                int i21 = i9 + 1;
                                                path.lineTo(fArr2[i9], fArr2[i21]);
                                                f30 = fArr2[i9];
                                                f31 = fArr2[i21];
                                            } else if (c11 == 'M') {
                                                i9 = i14;
                                                f30 = fArr2[i9];
                                                f31 = fArr2[i9 + 1];
                                                if (i9 > 0) {
                                                    path.lineTo(f30, f31);
                                                } else {
                                                    path.moveTo(f30, f31);
                                                    f29 = f31;
                                                    f28 = f30;
                                                }
                                            } else if (c11 == 'S') {
                                                i9 = i14;
                                                float f39 = f31;
                                                float f40 = f30;
                                                if (c10 == 'c' || c10 == 's' || c10 == 'C' || c10 == 'S') {
                                                    f16 = (f39 * 2.0f) - f25;
                                                    f17 = (f40 * 2.0f) - f24;
                                                } else {
                                                    f17 = f40;
                                                    f16 = f39;
                                                }
                                                int i22 = i9 + 1;
                                                int i23 = i9 + 2;
                                                int i24 = i9 + 3;
                                                path.cubicTo(f17, f16, fArr2[i9], fArr2[i22], fArr2[i23], fArr2[i24]);
                                                float f41 = fArr2[i9];
                                                float f42 = fArr2[i22];
                                                f30 = fArr2[i23];
                                                f31 = fArr2[i24];
                                                f25 = f42;
                                                f24 = f41;
                                            } else if (c11 == 'T') {
                                                i9 = i14;
                                                float f43 = f31;
                                                float f44 = f30;
                                                if (c10 == 'q' || c10 == 't' || c10 == 'Q' || c10 == 'T') {
                                                    f12 = (f44 * 2.0f) - f24;
                                                    f13 = (f43 * 2.0f) - f25;
                                                } else {
                                                    f12 = f44;
                                                    f13 = f43;
                                                }
                                                int i25 = i9 + 1;
                                                path.quadTo(f12, f13, fArr2[i9], fArr2[i25]);
                                                f14 = fArr2[i9];
                                                f15 = fArr2[i25];
                                            } else if (c11 == 'l') {
                                                i9 = i14;
                                                int i26 = i9 + 1;
                                                path.rLineTo(fArr2[i9], fArr2[i26]);
                                                f30 += fArr2[i9];
                                                f31 += fArr2[i26];
                                            } else if (c11 == 'm') {
                                                i9 = i14;
                                                float f45 = fArr2[i9];
                                                f30 += f45;
                                                float f46 = fArr2[i9 + 1];
                                                f31 += f46;
                                                if (i9 > 0) {
                                                    path.rLineTo(f45, f46);
                                                } else {
                                                    path.rMoveTo(f45, f46);
                                                    f29 = f31;
                                                    f28 = f30;
                                                }
                                            } else if (c11 == 's') {
                                                if (c10 == 'c' || c10 == 's' || c10 == 'C' || c10 == 'S') {
                                                    float f47 = f30 - f24;
                                                    f18 = f31 - f25;
                                                    f19 = f47;
                                                } else {
                                                    f18 = 0.0f;
                                                    f19 = 0.0f;
                                                }
                                                int i27 = i14 + 1;
                                                int i28 = i14 + 2;
                                                int i29 = i14 + 3;
                                                i9 = i14;
                                                float f48 = f31;
                                                float f49 = f30;
                                                path.rCubicTo(f19, f18, fArr2[i14], fArr2[i27], fArr2[i28], fArr2[i29]);
                                                f12 = f49 + fArr2[i9];
                                                f13 = f48 + fArr2[i27];
                                                f14 = f49 + fArr2[i28];
                                                f15 = fArr2[i29] + f48;
                                            } else if (c11 != 't') {
                                                i9 = i14;
                                            } else {
                                                if (c10 == 'q' || c10 == 't' || c10 == 'Q' || c10 == 'T') {
                                                    f20 = f30 - f24;
                                                    f21 = f31 - f25;
                                                } else {
                                                    f21 = 0.0f;
                                                    f20 = 0.0f;
                                                }
                                                int i30 = i14 + 1;
                                                path.rQuadTo(f20, f21, fArr2[i14], fArr2[i30]);
                                                float f50 = f20 + f30;
                                                float f51 = f21 + f31;
                                                f30 += fArr2[i14];
                                                f31 += fArr2[i30];
                                                f25 = f51;
                                                i9 = i14;
                                                c2 = c11;
                                                i10 = i13;
                                                i11 = length;
                                                f24 = f50;
                                            }
                                            aVar = aVar2;
                                        } else {
                                            i9 = i14;
                                            path.rLineTo(fArr2[i9], 0.0f);
                                            f30 += fArr2[i9];
                                        }
                                        c2 = c11;
                                        i10 = i13;
                                        i11 = length;
                                        aVar = aVar2;
                                    } else {
                                        i9 = i14;
                                        float f52 = f31;
                                        float f53 = f30;
                                        int i31 = i9 + 2;
                                        int i32 = i9 + 3;
                                        int i33 = i9 + 4;
                                        int i34 = i9 + 5;
                                        path.rCubicTo(fArr2[i9], fArr2[i9 + 1], fArr2[i31], fArr2[i32], fArr2[i33], fArr2[i34]);
                                        f12 = f53 + fArr2[i31];
                                        f13 = f52 + fArr2[i32];
                                        f14 = f53 + fArr2[i33];
                                        f15 = fArr2[i34] + f52;
                                    }
                                    f25 = f13;
                                    f24 = f12;
                                    c2 = c11;
                                    i10 = i13;
                                    i11 = length;
                                    f30 = f14;
                                    f31 = f15;
                                    aVar = aVar2;
                                } else {
                                    i9 = i14;
                                    float f54 = f31;
                                    float f55 = f30;
                                    int i35 = i9 + 5;
                                    int i36 = i9 + 6;
                                    c2 = c11;
                                    i11 = length;
                                    aVar = aVar2;
                                    i10 = i13;
                                    a(path, f55, f54, fArr2[i35] + f55, fArr2[i36] + f54, fArr2[i9], fArr2[i9 + 1], fArr2[i9 + 2], fArr2[i9 + 3] != 0.0f, fArr2[i9 + 4] != 0.0f);
                                    f30 = f55 + fArr2[i35];
                                    f31 = f54 + fArr2[i36];
                                }
                                i14 = i9 + i;
                                aVar2 = aVar;
                                length = i11;
                                c10 = c2;
                                c11 = c10;
                                i13 = i10;
                            } else {
                                i9 = i14;
                                c2 = c11;
                                i10 = i13;
                                i11 = length;
                                aVar = aVar2;
                                int i37 = i9 + 2;
                                int i38 = i9 + 3;
                                int i39 = i9 + 4;
                                int i40 = i9 + 5;
                                path.cubicTo(fArr2[i9], fArr2[i9 + 1], fArr2[i37], fArr2[i38], fArr2[i39], fArr2[i40]);
                                f30 = fArr2[i39];
                                f31 = fArr2[i40];
                                f10 = fArr2[i37];
                                f11 = fArr2[i38];
                            }
                            f24 = f10;
                            f25 = f11;
                            i14 = i9 + i;
                            aVar2 = aVar;
                            length = i11;
                            c10 = c2;
                            c11 = c10;
                            i13 = i10;
                        } else {
                            i9 = i14;
                            c2 = c11;
                            i10 = i13;
                            i11 = length;
                            aVar = aVar2;
                            int i41 = i9 + 5;
                            int i42 = i9 + 6;
                            a(path, f30, f31, fArr2[i41], fArr2[i42], fArr2[i9], fArr2[i9 + 1], fArr2[i9 + 2], fArr2[i9 + 3] != 0.0f, fArr2[i9 + 4] != 0.0f);
                            f30 = fArr2[i41];
                            f31 = fArr2[i42];
                        }
                        f25 = f31;
                        f24 = f30;
                        i14 = i9 + i;
                        aVar2 = aVar;
                        length = i11;
                        c10 = c2;
                        c11 = c10;
                        i13 = i10;
                    }
                }
                fArr[0] = f30;
                fArr[1] = f31;
                fArr[2] = f24;
                fArr[3] = f25;
                fArr[4] = f28;
                fArr[5] = f29;
                c10 = aVar2.f24071a;
                i13++;
                aVarArr2 = aVarArr;
                length = length;
                i12 = 6;
            }
        }

        public a(a aVar) {
            this.f24071a = aVar.f24071a;
            float[] fArr = aVar.f24072b;
            this.f24072b = d.b(fArr, fArr.length);
        }
    }
}

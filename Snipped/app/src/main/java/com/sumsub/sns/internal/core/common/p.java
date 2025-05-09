package com.sumsub.sns.internal.core.common;

import android.graphics.Bitmap;
import org.bouncycastle.tls.CipherSuite;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final p f15158a = new p();

    public final Bitmap a(Bitmap bitmap, int i, boolean z10) {
        int[] iArr;
        int i9 = i;
        Bitmap copy = z10 ? bitmap : bitmap.copy(bitmap.getConfig(), true);
        if (i9 < 1) {
            return null;
        }
        int width = copy.getWidth();
        int height = copy.getHeight();
        int i10 = width * height;
        int[] iArr2 = new int[i10];
        copy.getPixels(iArr2, 0, width, 0, 0, width, height);
        int i11 = width - 1;
        int i12 = height - 1;
        int i13 = i9 + i9;
        int i14 = i13 + 1;
        int[] iArr3 = new int[i10];
        int[] iArr4 = new int[i10];
        int[] iArr5 = new int[i10];
        int[] iArr6 = new int[width < height ? height : width];
        int i15 = (i13 + 2) >> 1;
        int i16 = i15 * i15;
        int i17 = i16 * 256;
        int[] iArr7 = new int[i17];
        for (int i18 = 0; i18 < i17; i18++) {
            iArr7[i18] = i18 / i16;
        }
        int[][] iArr8 = new int[i14][];
        for (int i19 = 0; i19 < i14; i19++) {
            iArr8[i19] = new int[3];
        }
        int i20 = i9 + 1;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        while (i21 < height) {
            Bitmap bitmap2 = copy;
            int i24 = -i9;
            int i25 = 0;
            int i26 = 0;
            int i27 = 0;
            int i28 = 0;
            int i29 = 0;
            int i30 = 0;
            int i31 = 0;
            int i32 = 0;
            int i33 = 0;
            while (i24 <= i9) {
                int i34 = height;
                int i35 = i24 < 0 ? 0 : i24;
                if (i11 <= i35) {
                    i35 = i11;
                }
                int i36 = iArr2[i22 + i35];
                int[] iArr9 = iArr8[i24 + i9];
                iArr9[0] = (i36 & 16711680) >> 16;
                iArr9[1] = (i36 & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB) >> 8;
                iArr9[2] = i36 & 255;
                int abs = i20 - Math.abs(i24);
                int i37 = iArr9[0];
                i27 = (i37 * abs) + i27;
                int i38 = iArr9[1];
                i26 = (i38 * abs) + i26;
                int i39 = iArr9[2];
                i25 = (abs * i39) + i25;
                if (i24 > 0) {
                    i31 += i37;
                    i32 += i38;
                    i33 += i39;
                } else {
                    i30 += i37;
                    i29 += i38;
                    i28 += i39;
                }
                i24++;
                height = i34;
            }
            int i40 = height;
            int i41 = i9;
            int i42 = 0;
            while (i42 < width) {
                iArr3[i22] = iArr7[i27];
                iArr4[i22] = iArr7[i26];
                iArr5[i22] = iArr7[i25];
                int i43 = i27 - i30;
                int i44 = i26 - i29;
                int i45 = i25 - i28;
                int[] iArr10 = iArr8[((i41 - i9) + i14) % i14];
                int i46 = i30 - iArr10[0];
                int i47 = i29 - iArr10[1];
                int i48 = i28 - iArr10[2];
                if (i21 == 0) {
                    iArr = iArr7;
                    int i49 = i42 + i9 + 1;
                    if (i49 > i11) {
                        i49 = i11;
                    }
                    iArr6[i42] = i49;
                } else {
                    iArr = iArr7;
                }
                int i50 = iArr2[i23 + iArr6[i42]];
                int i51 = (i50 & 16711680) >> 16;
                iArr10[0] = i51;
                int i52 = (i50 & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB) >> 8;
                iArr10[1] = i52;
                int i53 = i50 & 255;
                iArr10[2] = i53;
                int i54 = i31 + i51;
                int i55 = i32 + i52;
                int i56 = i33 + i53;
                i27 = i43 + i54;
                i26 = i44 + i55;
                i25 = i45 + i56;
                i41 = (i41 + 1) % i14;
                int[] iArr11 = iArr8[i41 % i14];
                int i57 = iArr11[0];
                i30 = i46 + i57;
                int i58 = iArr11[1];
                i29 = i47 + i58;
                int i59 = iArr11[2];
                i28 = i48 + i59;
                i31 = i54 - i57;
                i32 = i55 - i58;
                i33 = i56 - i59;
                i22++;
                i42++;
                iArr7 = iArr;
            }
            i23 += width;
            i21++;
            copy = bitmap2;
            height = i40;
        }
        Bitmap bitmap3 = copy;
        int i60 = height;
        int[] iArr12 = iArr7;
        int i61 = 0;
        while (i61 < width) {
            int i62 = -i9;
            int i63 = i62 * width;
            int i64 = 0;
            int i65 = 0;
            int i66 = 0;
            int i67 = 0;
            int i68 = 0;
            int i69 = 0;
            int i70 = 0;
            int i71 = 0;
            int i72 = 0;
            while (i62 <= i9) {
                int i73 = (i63 > 0 ? i63 : 0) + i61;
                int[] iArr13 = iArr8[i62 + i9];
                iArr13[0] = iArr3[i73];
                iArr13[1] = iArr4[i73];
                iArr13[2] = iArr5[i73];
                int abs2 = i20 - Math.abs(i62);
                i66 = (iArr3[i73] * abs2) + i66;
                i65 = (iArr4[i73] * abs2) + i65;
                i64 = (iArr5[i73] * abs2) + i64;
                if (i62 > 0) {
                    i70 += iArr13[0];
                    i71 += iArr13[1];
                    i72 += iArr13[2];
                } else {
                    i69 += iArr13[0];
                    i68 += iArr13[1];
                    i67 += iArr13[2];
                }
                if (i62 < i12) {
                    i63 += width;
                }
                i62++;
            }
            int i74 = i9;
            int i75 = i61;
            int i76 = 0;
            int i77 = i60;
            while (i76 < i77) {
                iArr2[i75] = (iArr2[i75] & (-16777216)) | (iArr12[i66] << 16) | (iArr12[i65] << 8) | iArr12[i64];
                int i78 = i66 - i69;
                int i79 = i65 - i68;
                int i80 = i64 - i67;
                int[] iArr14 = iArr8[((i74 - i9) + i14) % i14];
                int i81 = i69 - iArr14[0];
                int i82 = i68 - iArr14[1];
                int i83 = i67 - iArr14[2];
                if (i61 == 0) {
                    int i84 = i76 + i20;
                    if (i84 > i12) {
                        i84 = i12;
                    }
                    iArr6[i76] = i84 * width;
                }
                int i85 = iArr6[i76] + i61;
                int i86 = iArr3[i85];
                iArr14[0] = i86;
                int i87 = iArr4[i85];
                iArr14[1] = i87;
                int i88 = iArr5[i85];
                iArr14[2] = i88;
                int i89 = i70 + i86;
                int i90 = i71 + i87;
                int i91 = i72 + i88;
                i66 = i78 + i89;
                i65 = i79 + i90;
                i64 = i80 + i91;
                i74 = (i74 + 1) % i14;
                int[] iArr15 = iArr8[i74];
                int i92 = iArr15[0];
                i69 = i81 + i92;
                int i93 = iArr15[1];
                i68 = i82 + i93;
                int i94 = iArr15[2];
                i67 = i83 + i94;
                i70 = i89 - i92;
                i71 = i90 - i93;
                i72 = i91 - i94;
                i75 += width;
                i76++;
                i9 = i;
            }
            i61++;
            i9 = i;
            i60 = i77;
        }
        bitmap3.setPixels(iArr2, 0, width, 0, 0, width, i60);
        return bitmap3;
    }
}

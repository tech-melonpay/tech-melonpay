package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class MurmurHash3 {
    private MurmurHash3() {
    }

    @KeepForSdk
    public static int murmurhash3_x86_32(byte[] bArr, int i, int i9, int i10) {
        int i11;
        int i12 = i;
        while (true) {
            i11 = (i9 & (-4)) + i;
            if (i12 >= i11) {
                break;
            }
            int i13 = ((bArr[i12] & 255) | ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12 + 2] & 255) << 16) | (bArr[i12 + 3] << 24)) * (-862048943);
            int i14 = i10 ^ (((i13 >>> 17) | (i13 << 15)) * 461845907);
            i10 = (((i14 >>> 19) | (i14 << 13)) * 5) - 430675100;
            i12 += 4;
        }
        int i15 = i9 & 3;
        if (i15 != 1) {
            if (i15 != 2) {
                r0 = i15 == 3 ? (bArr[i11 + 2] & 255) << 16 : 0;
                int i16 = i10 ^ i9;
                int i17 = (i16 ^ (i16 >>> 16)) * (-2048144789);
                int i18 = (i17 ^ (i17 >>> 13)) * (-1028477387);
                return i18 ^ (i18 >>> 16);
            }
            r0 |= (bArr[i11 + 1] & 255) << 8;
        }
        int i19 = ((bArr[i11] & 255) | r0) * (-862048943);
        i10 ^= ((i19 >>> 17) | (i19 << 15)) * 461845907;
        int i162 = i10 ^ i9;
        int i172 = (i162 ^ (i162 >>> 16)) * (-2048144789);
        int i182 = (i172 ^ (i172 >>> 13)) * (-1028477387);
        return i182 ^ (i182 >>> 16);
    }
}

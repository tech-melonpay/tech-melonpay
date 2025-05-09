package com.google.android.gms.internal.gtm;

import net.sf.scuba.smartcards.ISO7816;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
final class zzyb extends zzya {
    @Override // com.google.android.gms.internal.gtm.zzya
    public final int zza(int i, byte[] bArr, int i9, int i10) {
        while (i9 < i10 && bArr[i9] >= 0) {
            i9++;
        }
        if (i9 >= i10) {
            return 0;
        }
        while (i9 < i10) {
            int i11 = i9 + 1;
            byte b9 = bArr[i9];
            if (b9 < 0) {
                if (b9 < -32) {
                    if (i11 >= i10) {
                        return b9;
                    }
                    if (b9 >= -62) {
                        i9 += 2;
                        if (bArr[i11] > -65) {
                        }
                    }
                    return -1;
                }
                if (b9 < -16) {
                    if (i11 >= i10 - 1) {
                        return zzyd.zza(bArr, i11, i10);
                    }
                    int i12 = i9 + 2;
                    byte b10 = bArr[i11];
                    if (b10 <= -65 && ((b9 != -32 || b10 >= -96) && (b9 != -19 || b10 < -96))) {
                        i9 += 3;
                        if (bArr[i12] > -65) {
                        }
                    }
                    return -1;
                }
                if (i11 >= i10 - 2) {
                    return zzyd.zza(bArr, i11, i10);
                }
                int i13 = i9 + 2;
                byte b11 = bArr[i11];
                if (b11 <= -65) {
                    if ((((b11 + ISO7816.INS_MANAGE_CHANNEL) + (b9 << 28)) >> 30) == 0) {
                        int i14 = i9 + 3;
                        if (bArr[i13] <= -65) {
                            i9 += 4;
                            if (bArr[i14] > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
            i9 = i11;
        }
        return 0;
    }
}

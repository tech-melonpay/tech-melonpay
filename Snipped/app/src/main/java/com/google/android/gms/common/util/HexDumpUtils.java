package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public final class HexDumpUtils {
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public static String dump(byte[] bArr, int i, int i9, boolean z10) {
        int length;
        if (bArr == null || (length = bArr.length) == 0 || i < 0 || i9 <= 0 || i + i9 > length) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(((i9 + 15) / 16) * (z10 ? 75 : 57));
        int i10 = i9;
        int i11 = 0;
        int i12 = 0;
        while (i10 > 0) {
            if (i11 == 0) {
                if (i9 < 65536) {
                    sb2.append(String.format("%04X:", Integer.valueOf(i)));
                } else {
                    sb2.append(String.format("%08X:", Integer.valueOf(i)));
                }
                i12 = i;
            } else if (i11 == 8) {
                sb2.append(" -");
            }
            sb2.append(String.format(" %02X", Integer.valueOf(bArr[i] & 255)));
            i10--;
            i11++;
            if (z10 && (i11 == 16 || i10 == 0)) {
                int i13 = 16 - i11;
                if (i13 > 0) {
                    for (int i14 = 0; i14 < i13; i14++) {
                        sb2.append("   ");
                    }
                }
                if (i13 >= 8) {
                    sb2.append("  ");
                }
                sb2.append("  ");
                for (int i15 = 0; i15 < i11; i15++) {
                    char c2 = (char) bArr[i12 + i15];
                    if (c2 < ' ' || c2 > '~') {
                        c2 = '.';
                    }
                    sb2.append(c2);
                }
            }
            if (i11 == 16 || i10 == 0) {
                sb2.append('\n');
                i11 = 0;
            }
            i++;
        }
        return sb2.toString();
    }
}

package com.google.android.gms.common;

import com.google.android.gms.common.internal.ShowFirstParty;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@ShowFirstParty
/* loaded from: classes.dex */
public final class zzd {
    public static int zza(int i) {
        int[] iArr = {1, 2, 3};
        for (int i9 = 0; i9 < 3; i9++) {
            int i10 = iArr[i9];
            int i11 = i10 - 1;
            if (i10 == 0) {
                throw null;
            }
            if (i11 == i) {
                return i10;
            }
        }
        return 1;
    }
}

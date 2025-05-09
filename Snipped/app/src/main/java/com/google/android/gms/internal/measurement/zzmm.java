package com.google.android.gms.internal.measurement;

import net.sf.scuba.smartcards.ISO7816;
import org.jmrtd.PassportService;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* loaded from: classes.dex */
final class zzmm {
    public static /* synthetic */ void zza(byte b9, byte b10, byte b11, byte b12, char[] cArr, int i) {
        if (!zze(b10)) {
            if ((((b10 + ISO7816.INS_MANAGE_CHANNEL) + (b9 << 28)) >> 30) == 0 && !zze(b11) && !zze(b12)) {
                int i9 = ((b9 & 7) << 18) | ((b10 & 63) << 12) | ((b11 & 63) << 6) | (b12 & 63);
                cArr[i] = (char) ((i9 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i9 & 1023) + 56320);
                return;
            }
        }
        throw zzkh.zzc();
    }

    public static /* synthetic */ void zzb(byte b9, byte b10, char[] cArr, int i) {
        if (b9 < -62 || zze(b10)) {
            throw zzkh.zzc();
        }
        cArr[i] = (char) (((b9 & 31) << 6) | (b10 & 63));
    }

    public static /* synthetic */ void zzc(byte b9, byte b10, byte b11, char[] cArr, int i) {
        if (!zze(b10)) {
            if (b9 == -32) {
                if (b10 >= -96) {
                    b9 = -32;
                }
            }
            if (b9 == -19) {
                if (b10 < -96) {
                    b9 = -19;
                }
            }
            if (!zze(b11)) {
                cArr[i] = (char) (((b9 & PassportService.SFI_DG15) << 12) | ((b10 & 63) << 6) | (b11 & 63));
                return;
            }
        }
        throw zzkh.zzc();
    }

    public static /* synthetic */ boolean zzd(byte b9) {
        return b9 >= 0;
    }

    private static boolean zze(byte b9) {
        return b9 > -65;
    }
}

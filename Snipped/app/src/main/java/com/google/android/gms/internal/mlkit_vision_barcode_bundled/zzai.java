package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import org.bouncycastle.math.Primes;
import org.bouncycastle.tls.CipherSuite;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
final class zzai implements zzeh {
    static final zzeh zza = new zzai();

    private zzai() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    public final boolean zza(int i) {
        if (i == 129 || i == 161 || i == 209 || i == 2705 || i == 20753 || i == 20769 || i == 215 || i == 216 || i == 1297 || i == 1298) {
            return true;
        }
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                switch (i) {
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        return true;
                    default:
                        switch (i) {
                            case 81:
                            case 82:
                            case 83:
                            case 84:
                            case 85:
                                return true;
                            default:
                                switch (i) {
                                    case 163:
                                    case 164:
                                    case 165:
                                    case 166:
                                    case 167:
                                    case 168:
                                    case CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384 /* 169 */:
                                        return true;
                                    default:
                                        switch (i) {
                                            case Primes.SMALL_FACTOR_LIMIT /* 211 */:
                                            case 212:
                                            case 213:
                                                return true;
                                            default:
                                                return false;
                                        }
                                }
                        }
                }
        }
    }
}

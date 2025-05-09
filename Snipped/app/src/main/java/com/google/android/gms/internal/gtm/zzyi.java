package com.google.android.gms.internal.gtm;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
final class zzyi extends zzuj {
    private zzyi() {
        super(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.gtm.zzuj
    public final <CT extends zzwk> zzux<CT, ?> zzc(CT ct, int i) {
        char c2;
        String name = ct.getClass().getName();
        switch (name.hashCode()) {
            case -1328301759:
                if (name.equals("com.google.android.gms.internal.gtm.zzak")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -1328301158:
                if (name.equals("com.google.android.gms.internal.gtm.zztw")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1328301155:
                if (name.equals("com.google.android.gms.internal.gtm.zztz")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1328301148:
                if (name.equals("com.google.android.gms.internal.gtm.zzub")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            switch (i) {
                case 21596320:
                    break;
                case 21623477:
                    break;
                case 21713708:
                    break;
                case 23459630:
                    break;
                case 26652850:
                    break;
                case 53697879:
                    break;
                case 56871503:
                    break;
            }
            return null;
        }
        if (c2 == 1) {
            switch (i) {
                case 21467048:
                    break;
                case 21596320:
                    break;
                case 21623477:
                    break;
                case 21713708:
                    break;
                case 26652850:
                    break;
            }
            return null;
        }
        if (c2 == 2) {
            if (i == 21596320) {
                return zzyq.zzm;
            }
            if (i != 28993747) {
                return null;
            }
            return zzyq.zzn;
        }
        if (c2 != 3) {
            return null;
        }
        if (i == 101) {
            return zzae.zza;
        }
        if (i != 47497405) {
            return null;
        }
        return zze.zza;
    }

    public /* synthetic */ zzyi(zzyg zzygVar) {
        super(true);
    }
}

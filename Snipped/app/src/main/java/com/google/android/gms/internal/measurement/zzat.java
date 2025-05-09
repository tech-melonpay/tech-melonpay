package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* loaded from: classes.dex */
public final class zzat implements Iterable<zzap>, zzap {
    private final String zza;

    public zzat(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzat) {
            return this.zza.equals(((zzat) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<zzap> iterator() {
        return new zzas(this);
    }

    public final String toString() {
        String str = this.zza;
        StringBuilder sb2 = new StringBuilder(str.length() + 2);
        sb2.append('\"');
        sb2.append(str);
        sb2.append('\"');
        return sb2.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0332  */
    @Override // com.google.android.gms.internal.measurement.zzap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.zzap zzbK(java.lang.String r22, com.google.android.gms.internal.measurement.zzg r23, java.util.List<com.google.android.gms.internal.measurement.zzap> r24) {
        /*
            Method dump skipped, instructions count: 1780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzat.zzbK(java.lang.String, com.google.android.gms.internal.measurement.zzg, java.util.List):com.google.android.gms.internal.measurement.zzap");
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return new zzat(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        if (this.zza.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.zza);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator<zzap> zzl() {
        return new zzar(this);
    }
}

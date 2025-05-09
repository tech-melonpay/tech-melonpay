package com.google.android.gms.measurement.internal;

import C.v;
import android.os.Bundle;
import androidx.camera.core.n;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
public final class zzeg {
    protected static final AtomicReference<String[]> zza = new AtomicReference<>();
    protected static final AtomicReference<String[]> zzb = new AtomicReference<>();
    protected static final AtomicReference<String[]> zzc = new AtomicReference<>();
    private final zzef zzd;

    public zzeg(zzef zzefVar) {
        this.zzd = zzefVar;
    }

    private static final String zzg(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (zzkz.zzak(str, strArr[i])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i];
                        if (str2 == null) {
                            str2 = strArr2[i] + "(" + strArr[i] + ")";
                            strArr3[i] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String zza(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder s10 = v.s("[");
        for (Object obj : objArr) {
            String zzb2 = obj instanceof Bundle ? zzb((Bundle) obj) : String.valueOf(obj);
            if (zzb2 != null) {
                if (s10.length() != 1) {
                    s10.append(", ");
                }
                s10.append(zzb2);
            }
        }
        s10.append("]");
        return s10.toString();
    }

    public final String zzb(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return bundle.toString();
        }
        StringBuilder s10 = v.s("Bundle[{");
        for (String str : bundle.keySet()) {
            if (s10.length() != 8) {
                s10.append(", ");
            }
            s10.append(zze(str));
            s10.append("=");
            Object obj = bundle.get(str);
            s10.append(obj instanceof Bundle ? zza(new Object[]{obj}) : obj instanceof Object[] ? zza((Object[]) obj) : obj instanceof ArrayList ? zza(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        s10.append("}]");
        return s10.toString();
    }

    public final String zzc(zzat zzatVar) {
        if (!this.zzd.zza()) {
            return zzatVar.toString();
        }
        StringBuilder sb2 = new StringBuilder("origin=");
        sb2.append(zzatVar.zzc);
        sb2.append(",name=");
        sb2.append(zzd(zzatVar.zza));
        sb2.append(",params=");
        zzar zzarVar = zzatVar.zzb;
        sb2.append(zzarVar == null ? null : !this.zzd.zza() ? zzarVar.toString() : zzb(zzarVar.zzc()));
        return sb2.toString();
    }

    public final String zzd(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzgs.zzc, zzgs.zza, zza);
    }

    public final String zze(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzgt.zzb, zzgt.zza, zzb);
    }

    public final String zzf(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : str.startsWith("_exp_") ? n.a("experiment_id(", str, ")") : zzg(str, zzgu.zzb, zzgu.zza, zzc);
    }
}

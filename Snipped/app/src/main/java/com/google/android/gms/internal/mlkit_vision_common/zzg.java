package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.measurement.internal.a;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* loaded from: classes.dex */
public final class zzg {
    public static String zza(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String sb2;
        int i = 0;
        int i9 = 0;
        while (true) {
            length = objArr.length;
            if (i9 >= length) {
                break;
            }
            Object obj = objArr[i9];
            if (obj == null) {
                sb2 = "null";
            } else {
                try {
                    sb2 = obj.toString();
                } catch (Exception e10) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e10);
                    StringBuilder m2 = a.m("<", str2, " threw ");
                    m2.append(e10.getClass().getName());
                    m2.append(">");
                    sb2 = m2.toString();
                }
            }
            objArr[i9] = sb2;
            i9++;
        }
        StringBuilder sb3 = new StringBuilder(str.length() + (length * 16));
        int i10 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i10)) == -1) {
                break;
            }
            sb3.append((CharSequence) str, i10, indexOf);
            sb3.append(objArr[i]);
            i10 = indexOf + 2;
            i++;
        }
        sb3.append((CharSequence) str, i10, str.length());
        if (i < length2) {
            sb3.append(" [");
            sb3.append(objArr[i]);
            for (int i11 = i + 1; i11 < objArr.length; i11++) {
                sb3.append(", ");
                sb3.append(objArr[i11]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }

    public static boolean zzb(String str) {
        return zze.zza(str);
    }
}

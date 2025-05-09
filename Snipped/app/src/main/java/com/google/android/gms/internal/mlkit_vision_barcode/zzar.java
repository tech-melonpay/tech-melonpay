package com.google.android.gms.internal.mlkit_vision_barcode;

import C.v;
import java.util.logging.Level;
import java.util.logging.Logger;
import s3.b;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes.dex */
public final class zzar {
    public static String zza(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String l10;
        int i = 0;
        int i9 = 0;
        while (true) {
            length = objArr.length;
            if (i9 >= length) {
                break;
            }
            Object obj = objArr[i9];
            if (obj == null) {
                l10 = "null";
            } else {
                try {
                    l10 = obj.toString();
                } catch (Exception e10) {
                    String p10 = v.p(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(p10), (Throwable) e10);
                    l10 = b.l("<", p10, " threw ", e10.getClass().getName(), ">");
                }
            }
            objArr[i9] = l10;
            i9++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i10 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i10)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i10, indexOf);
            sb2.append(objArr[i]);
            i10 = indexOf + 2;
            i++;
        }
        sb2.append((CharSequence) str, i10, str.length());
        if (i < length2) {
            sb2.append(" [");
            sb2.append(objArr[i]);
            for (int i11 = i + 1; i11 < objArr.length; i11++) {
                sb2.append(", ");
                sb2.append(objArr[i11]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static boolean zzb(String str) {
        int i = zzap.zza;
        return str == null || str.isEmpty();
    }
}

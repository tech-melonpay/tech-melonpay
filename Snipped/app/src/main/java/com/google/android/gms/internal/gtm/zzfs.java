package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.bumptech.glide.load.Key;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.HttpUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzfs {
    public static long zza(String str) {
        if (str == null) {
            return 0L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    public static zzaw zzb(zzfb zzfbVar, String str) {
        Preconditions.checkNotNull(zzfbVar);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        new HashMap();
        try {
            String valueOf = String.valueOf(str);
            Map<String, String> parse = HttpUtils.parse(new URI(valueOf.length() != 0 ? "?".concat(valueOf) : new String("?")), Key.STRING_CHARSET_NAME);
            zzaw zzawVar = new zzaw();
            zzawVar.zzp(parse.get("utm_content"));
            zzawVar.zzu(parse.get("utm_medium"));
            zzawVar.zzv(parse.get("utm_campaign"));
            zzawVar.zzw(parse.get("utm_source"));
            zzawVar.zzt(parse.get("utm_term"));
            zzawVar.zzs(parse.get("utm_id"));
            zzawVar.zzo(parse.get("anid"));
            zzawVar.zzr(parse.get("gclid"));
            zzawVar.zzq(parse.get("dclid"));
            zzawVar.zzn(parse.get(FirebaseAnalytics.Param.ACLID));
            return zzawVar;
        } catch (URISyntaxException e10) {
            zzfbVar.zzS("No valid campaign data found", e10);
            return null;
        }
    }

    public static String zzc(boolean z10) {
        return true != z10 ? "0" : "1";
    }

    public static String zzd(Locale locale) {
        if (locale == null) {
            return null;
        }
        String language = locale.getLanguage();
        if (TextUtils.isEmpty(language)) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(language.toLowerCase(locale));
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb2.append("-");
            sb2.append(locale.getCountry().toLowerCase(locale));
        }
        return sb2.toString();
    }

    public static MessageDigest zze(String str) {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static Map<String, String> zzf(String str) {
        HashMap hashMap = new HashMap();
        for (String str2 : str.split("&")) {
            String[] split = str2.split("=", 3);
            int length = split.length;
            if (length > 1) {
                hashMap.put(split[0], TextUtils.isEmpty(split[1]) ? null : split[1]);
                if (length == 3 && !TextUtils.isEmpty(split[1]) && !hashMap.containsKey(split[1])) {
                    hashMap.put(split[1], TextUtils.isEmpty(split[2]) ? null : split[2]);
                }
            } else if (length == 1 && split[0].length() != 0) {
                hashMap.put(split[0], null);
            }
        }
        return hashMap;
    }

    public static void zzg(Map<String, String> map, String str, String str2) {
        if (str2 == null || map.containsKey(str)) {
            return;
        }
        map.put(str, str2);
    }

    public static void zzh(Map<String, String> map, String str, Map<String, String> map2) {
        zzg(map, str, map2.get(str));
    }

    public static boolean zzi(Context context, String str, boolean z10) {
        try {
            ActivityInfo receiverInfo = context.getPackageManager().getReceiverInfo(new ComponentName(context, str), 0);
            if (receiverInfo != null && receiverInfo.enabled) {
                if (!z10) {
                    return true;
                }
                if (receiverInfo.exported) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean zzj(double d10, String str) {
        int i;
        if (d10 > 0.0d && d10 < 100.0d) {
            if (TextUtils.isEmpty(str)) {
                i = 1;
            } else {
                i = 0;
                for (int length = str.length() - 1; length >= 0; length--) {
                    char charAt = str.charAt(length);
                    i = ((i << 6) & 268435455) + charAt + (charAt << 14);
                    int i9 = i >> 21;
                    if ((266338304 & i) != 0) {
                        i ^= i9 & 127;
                    }
                }
            }
            if (i % ModuleDescriptor.MODULE_VERSION >= d10 * 100.0d) {
                return true;
            }
        }
        return false;
    }
}

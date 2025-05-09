package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzbi extends zzbs {
    public static boolean zza;
    private AdvertisingIdClient.Info zzb;
    private final zzfo zzc;
    private String zzd;
    private boolean zze;
    private final Object zzf;

    public zzbi(zzbv zzbvVar) {
        super(zzbvVar);
        this.zze = false;
        this.zzf = new Object();
        this.zzc = new zzfo(zzbvVar.zzr());
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0163, code lost:
    
        if (r0 == false) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044 A[Catch: all -> 0x001b, TryCatch #4 {, blocks: (B:3:0x0001, B:5:0x000b, B:8:0x0012, B:9:0x0032, B:12:0x003c, B:15:0x0165, B:16:0x0044, B:17:0x004e, B:34:0x0168, B:85:0x0178, B:87:0x0038, B:92:0x001f, B:94:0x0023, B:89:0x002c, B:95:0x0179, B:19:0x004f, B:64:0x0054, B:66:0x006c, B:69:0x0085, B:70:0x008e, B:72:0x0093, B:77:0x009d, B:22:0x00b1, B:27:0x00c2, B:29:0x00d0, B:30:0x00db, B:31:0x00df, B:35:0x00d5, B:36:0x00e2, B:38:0x00ec, B:39:0x00f6, B:40:0x00f1, B:41:0x00bc, B:42:0x00fc, B:44:0x010a, B:45:0x0115, B:47:0x011f, B:49:0x0121, B:51:0x0129, B:53:0x012b, B:55:0x0133, B:56:0x0145, B:58:0x0153, B:59:0x015e, B:60:0x0162, B:61:0x0158, B:62:0x010f, B:67:0x00ac), top: B:2:0x0001, inners: #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0038 A[Catch: all -> 0x001b, TryCatch #4 {, blocks: (B:3:0x0001, B:5:0x000b, B:8:0x0012, B:9:0x0032, B:12:0x003c, B:15:0x0165, B:16:0x0044, B:17:0x004e, B:34:0x0168, B:85:0x0178, B:87:0x0038, B:92:0x001f, B:94:0x0023, B:89:0x002c, B:95:0x0179, B:19:0x004f, B:64:0x0054, B:66:0x006c, B:69:0x0085, B:70:0x008e, B:72:0x0093, B:77:0x009d, B:22:0x00b1, B:27:0x00c2, B:29:0x00d0, B:30:0x00db, B:31:0x00df, B:35:0x00d5, B:36:0x00e2, B:38:0x00ec, B:39:0x00f6, B:40:0x00f1, B:41:0x00bc, B:42:0x00fc, B:44:0x010a, B:45:0x0115, B:47:0x011f, B:49:0x0121, B:51:0x0129, B:53:0x012b, B:55:0x0133, B:56:0x0145, B:58:0x0153, B:59:0x015e, B:60:0x0162, B:61:0x0158, B:62:0x010f, B:67:0x00ac), top: B:2:0x0001, inners: #6, #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized com.google.android.gms.ads.identifier.AdvertisingIdClient.Info zzc() {
        /*
            Method dump skipped, instructions count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzbi.zzc():com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
    }

    private static String zze(String str) {
        MessageDigest zze = zzfs.zze("MD5");
        if (zze == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, zze.digest(str.getBytes())));
    }

    private final boolean zzf(String str) {
        try {
            String zze = zze(str);
            zzO("Storing hashed adid.");
            FileOutputStream openFileOutput = zzo().openFileOutput("gaClientIdData", 0);
            openFileOutput.write(zze.getBytes());
            openFileOutput.close();
            this.zzd = zze;
            return true;
        } catch (IOException e10) {
            zzK("Error creating hash file", e10);
            return false;
        }
    }

    public final String zza() {
        zzW();
        AdvertisingIdClient.Info zzc = zzc();
        String id = zzc != null ? zzc.getId() : null;
        if (TextUtils.isEmpty(id)) {
            return null;
        }
        return id;
    }

    public final boolean zzb() {
        zzW();
        AdvertisingIdClient.Info zzc = zzc();
        return (zzc == null || zzc.isLimitAdTrackingEnabled()) ? false : true;
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    public final void zzd() {
    }
}

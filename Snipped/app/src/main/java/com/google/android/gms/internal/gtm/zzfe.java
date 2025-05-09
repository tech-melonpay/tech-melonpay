package com.google.android.gms.internal.gtm;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.camera.core.impl.utils.a;
import com.bumptech.glide.load.Key;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.Map;
import s3.b;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
final class zzfe extends zzbs {
    private static final byte[] zza = "\n".getBytes();
    private final String zzb;
    private final zzfo zzc;

    public zzfe(zzbv zzbvVar) {
        super(zzbvVar);
        String str = zzbt.zza;
        String str2 = Build.VERSION.RELEASE;
        String zzd = zzfs.zzd(Locale.getDefault());
        String str3 = Build.MODEL;
        String str4 = Build.ID;
        StringBuilder p10 = b.p("GoogleAnalytics/", str, " (Linux; U; Android ", str2, "; ");
        a.u(p10, zzd, "; ", str3, " Build/");
        this.zzb = a.n(p10, str4, ")");
        this.zzc = new zzfo(zzbvVar.zzr());
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzg(java.net.URL r6, byte[] r7) {
        /*
            r5 = this;
            java.lang.String r0 = "Error closing http post connection output stream"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)
            int r1 = r7.length
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "POST bytes, url"
            r5.zzH(r3, r2, r6)
            boolean r2 = com.google.android.gms.internal.gtm.zzbr.zzV()
            if (r2 == 0) goto L22
            java.lang.String r2 = new java.lang.String
            r2.<init>(r7)
            java.lang.String r3 = "Post payload\n"
            r5.zzP(r3, r2)
        L22:
            r2 = 0
            android.content.Context r3 = r5.zzo()     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L73
            r3.getPackageName()     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L73
            java.net.HttpURLConnection r6 = r5.zzb(r6)     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L73
            r3 = 1
            r6.setDoOutput(r3)     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
            r6.setFixedLengthStreamingMode(r1)     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
            r6.connect()     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
            java.io.OutputStream r2 = r6.getOutputStream()     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
            r2.write(r7)     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
            r5.zzk(r6)     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
            int r7 = r6.getResponseCode()     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
            r1 = 200(0xc8, float:2.8E-43)
            if (r7 != r1) goto L57
            com.google.android.gms.internal.gtm.zzbq r7 = r5.zzs()     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
            r7.zzi()     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
            r7 = r1
            goto L57
        L53:
            r7 = move-exception
            goto L93
        L55:
            r7 = move-exception
            goto L6c
        L57:
            java.lang.String r1 = "POST status"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
            r5.zzG(r1, r3)     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
            r2.close()     // Catch: java.io.IOException -> L64
            goto L68
        L64:
            r1 = move-exception
            r5.zzK(r0, r1)
        L68:
            r6.disconnect()
            return r7
        L6c:
            r4 = r2
            r2 = r6
            r6 = r4
            goto L79
        L70:
            r6 = move-exception
            r7 = r6
            goto L76
        L73:
            r6 = move-exception
            r7 = r6
            goto L78
        L76:
            r6 = r2
            goto L93
        L78:
            r6 = r2
        L79:
            java.lang.String r1 = "Network POST connection error"
            r5.zzS(r1, r7)     // Catch: java.lang.Throwable -> L8f
            if (r6 == 0) goto L88
            r6.close()     // Catch: java.io.IOException -> L84
            goto L88
        L84:
            r6 = move-exception
            r5.zzK(r0, r6)
        L88:
            if (r2 == 0) goto L8d
            r2.disconnect()
        L8d:
            r6 = 0
            return r6
        L8f:
            r7 = move-exception
            r4 = r2
            r2 = r6
            r6 = r4
        L93:
            if (r2 == 0) goto L9d
            r2.close()     // Catch: java.io.IOException -> L99
            goto L9d
        L99:
            r1 = move-exception
            r5.zzK(r0, r1)
        L9d:
            if (r6 == 0) goto La2
            r6.disconnect()
        La2:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfe.zzg(java.net.URL, byte[]):int");
    }

    private final URL zzh() {
        zzw();
        String zzi = zzct.zzi();
        zzw();
        String zzb = zzeu.zzt.zzb();
        try {
            return new URL(zzb.length() != 0 ? zzi.concat(zzb) : new String(zzi));
        } catch (MalformedURLException e10) {
            zzK("Error trying to parse the hardcoded host url", e10);
            return null;
        }
    }

    private final URL zzi(zzex zzexVar) {
        String str;
        String concat;
        if (zzexVar.zzh()) {
            zzw();
            String zzi = zzct.zzi();
            zzw();
            String zzj = zzct.zzj();
            if (zzj.length() != 0) {
                concat = zzi.concat(zzj);
            } else {
                str = new String(zzi);
                concat = str;
            }
        } else {
            zzw();
            String zzk = zzct.zzk();
            zzw();
            String zzj2 = zzct.zzj();
            if (zzj2.length() != 0) {
                concat = zzk.concat(zzj2);
            } else {
                str = new String(zzk);
                concat = str;
            }
        }
        try {
            return new URL(concat);
        } catch (MalformedURLException e10) {
            zzK("Error trying to parse the hardcoded host url", e10);
            return null;
        }
    }

    private final URL zzj(zzex zzexVar, String str) {
        String o10;
        if (zzexVar.zzh()) {
            zzw();
            String zzi = zzct.zzi();
            zzw();
            String zzj = zzct.zzj();
            o10 = b.o(new StringBuilder(com.google.android.gms.measurement.internal.a.u(zzi.length(), 1, zzj.length(), str.length())), zzi, zzj, "?", str);
        } else {
            zzw();
            String zzk = zzct.zzk();
            zzw();
            String zzj2 = zzct.zzj();
            o10 = b.o(new StringBuilder(com.google.android.gms.measurement.internal.a.u(zzk.length(), 1, zzj2.length(), str.length())), zzk, zzj2, "?", str);
        }
        try {
            return new URL(o10);
        } catch (MalformedURLException e10) {
            zzK("Error trying to parse the hardcoded host url", e10);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0014, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0015, code lost:
    
        zzK("Error closing http connection input stream", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0018, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzk(java.net.HttpURLConnection r4) {
        /*
            r3 = this;
            java.lang.String r0 = "Error closing http connection input stream"
            java.io.InputStream r4 = r4.getInputStream()     // Catch: java.lang.Throwable -> L1b
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L19
        La:
            int r2 = r4.read(r1)     // Catch: java.lang.Throwable -> L19
            if (r2 > 0) goto La
            r4.close()     // Catch: java.io.IOException -> L14
            return
        L14:
            r4 = move-exception
            r3.zzK(r0, r4)
            return
        L19:
            r1 = move-exception
            goto L1d
        L1b:
            r1 = move-exception
            r4 = 0
        L1d:
            if (r4 == 0) goto L27
            r4.close()     // Catch: java.io.IOException -> L23
            goto L27
        L23:
            r4 = move-exception
            r3.zzK(r0, r4)
        L27:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfe.zzk(java.net.HttpURLConnection):void");
    }

    private static final void zzl(StringBuilder sb2, String str, String str2) {
        if (sb2.length() != 0) {
            sb2.append('&');
        }
        sb2.append(URLEncoder.encode(str, Key.STRING_CHARSET_NAME));
        sb2.append('=');
        sb2.append(URLEncoder.encode(str2, Key.STRING_CHARSET_NAME));
    }

    @VisibleForTesting
    public final String zza(zzex zzexVar, boolean z10) {
        Preconditions.checkNotNull(zzexVar);
        StringBuilder sb2 = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : zzexVar.zzg().entrySet()) {
                String key = entry.getKey();
                if (!"ht".equals(key) && !"qt".equals(key) && !"AppUID".equals(key) && !"z".equals(key) && !"_gmsv".equals(key)) {
                    zzl(sb2, key, entry.getValue());
                }
            }
            zzl(sb2, "ht", String.valueOf(zzexVar.zzd()));
            zzl(sb2, "qt", String.valueOf(zzC().currentTimeMillis() - zzexVar.zzd()));
            zzw();
            if (z10) {
                long zzc = zzexVar.zzc();
                zzl(sb2, "z", zzc != 0 ? String.valueOf(zzc) : String.valueOf(zzexVar.zzb()));
            }
            return sb2.toString();
        } catch (UnsupportedEncodingException e10) {
            zzK("Failed to encode name or value", e10);
            return null;
        }
    }

    @VisibleForTesting
    public final HttpURLConnection zzb(URL url) {
        URLConnection openConnection = url.openConnection();
        if (!(openConnection instanceof HttpURLConnection)) {
            throw new IOException("Failed to obtain http connection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setDefaultUseCaches(false);
        zzw();
        httpURLConnection.setConnectTimeout(zzeu.zzE.zzb().intValue());
        zzw();
        httpURLConnection.setReadTimeout(zzeu.zzF.zzb().intValue());
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestProperty("User-Agent", this.zzb);
        httpURLConnection.setDoInput(true);
        return httpURLConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x032f A[EDGE_INSN: B:116:0x032f->B:117:0x032f BREAK  A[LOOP:1: B:108:0x023c->B:118:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[LOOP:1: B:108:0x023c->B:118:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<java.lang.Long> zzc(java.util.List<com.google.android.gms.internal.gtm.zzex> r20) {
        /*
            Method dump skipped, instructions count: 816
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfe.zzc(java.util.List):java.util.List");
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    public final void zzd() {
        zzP("Network initialized. User agent", this.zzb);
    }

    public final boolean zze() {
        NetworkInfo networkInfo;
        com.google.android.gms.analytics.zzr.zzh();
        zzW();
        try {
            networkInfo = ((ConnectivityManager) zzo().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException unused) {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        zzO("No network connectivity");
        return false;
    }
}

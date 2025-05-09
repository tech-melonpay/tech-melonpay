package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
public final class zzcn extends zzbs {
    private volatile String zza;
    private Future<String> zzb;

    public zzcn(zzbv zzbvVar) {
        super(zzbvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @VisibleForTesting
    public final String zzf() {
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        try {
            Context zza = zzq().zza();
            Preconditions.checkNotEmpty(lowerCase);
            Preconditions.checkNotMainThread("ClientId should be saved from worker thread");
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    try {
                        zzP("Storing clientId", lowerCase);
                        fileOutputStream = zza.openFileOutput("gaClientId", 0);
                        fileOutputStream.write(lowerCase.getBytes());
                        try {
                            fileOutputStream.close();
                        } catch (IOException e10) {
                            zzK("Failed to close clientId writing stream", e10);
                        }
                        return lowerCase;
                    } catch (IOException e11) {
                        zzK("Error writing to clientId file", e11);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e12) {
                                e = e12;
                                zzK("Failed to close clientId writing stream", e);
                                return "0";
                            }
                        }
                        return "0";
                    }
                } catch (FileNotFoundException e13) {
                    zzK("Error creating clientId file", e13);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e14) {
                            e = e14;
                            zzK("Failed to close clientId writing stream", e);
                            return "0";
                        }
                    }
                    return "0";
                }
            } finally {
            }
        } catch (Exception e15) {
            zzK("Error saving clientId file", e15);
            return "0";
        }
    }

    public final String zzb() {
        String str;
        zzW();
        synchronized (this) {
            try {
                if (this.zza == null) {
                    this.zzb = zzq().zzg(new zzcl(this));
                }
                Future<String> future = this.zzb;
                if (future != null) {
                    try {
                        this.zza = future.get();
                    } catch (InterruptedException e10) {
                        zzS("ClientId loading or generation was interrupted", e10);
                        this.zza = "0";
                    } catch (ExecutionException e11) {
                        zzK("Failed to load or generate client id", e11);
                        this.zza = "0";
                    }
                    if (this.zza == null) {
                        this.zza = "0";
                    }
                    zzP("Loaded clientId", this.zza);
                    this.zzb = null;
                }
                str = this.zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089 A[Catch: IOException -> 0x0034, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException -> 0x0034, blocks: (B:10:0x0030, B:25:0x004c, B:39:0x0077, B:35:0x0089), top: B:3:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0077 A[Catch: IOException -> 0x0034, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException -> 0x0034, blocks: (B:10:0x0030, B:25:0x004c, B:39:0x0077, B:35:0x0089), top: B:3:0x0012 }] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.IOException, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0089 -> B:11:0x008c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0075 -> B:13:0x008c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0077 -> B:11:0x008c). Please report as a decompilation issue!!! */
    @com.google.android.gms.common.util.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String zzc() {
        /*
            r9 = this;
            java.lang.String r0 = "gaClientId"
            java.lang.String r1 = "Failed to close client id reading stream"
            com.google.android.gms.analytics.zzr r2 = r9.zzq()
            android.content.Context r2 = r2.zza()
            java.lang.String r3 = "ClientId should be loaded from worker thread"
            com.google.android.gms.common.internal.Preconditions.checkNotMainThread(r3)
            r3 = 0
            java.io.FileInputStream r4 = r2.openFileInput(r0)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b java.io.FileNotFoundException -> L86
            r5 = 36
            byte[] r6 = new byte[r5]     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b java.io.FileNotFoundException -> L87
            r7 = 0
            int r5 = r4.read(r6, r7, r5)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b java.io.FileNotFoundException -> L87
            int r8 = r4.available()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b java.io.FileNotFoundException -> L87
            if (r8 <= 0) goto L3d
            java.lang.String r5 = "clientId file seems corrupted, deleting it."
            r9.zzR(r5)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b java.io.FileNotFoundException -> L87
            r4.close()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b java.io.FileNotFoundException -> L87
            r2.deleteFile(r0)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b java.io.FileNotFoundException -> L87
            r4.close()     // Catch: java.io.IOException -> L34
            goto L8c
        L34:
            r0 = move-exception
            r9.zzK(r1, r0)
            goto L8c
        L39:
            r0 = move-exception
            goto L67
        L3b:
            r5 = move-exception
            goto L6d
        L3d:
            r8 = 14
            if (r5 >= r8) goto L50
            java.lang.String r5 = "clientId file is empty, deleting it."
            r9.zzR(r5)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b java.io.FileNotFoundException -> L87
            r4.close()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b java.io.FileNotFoundException -> L87
            r2.deleteFile(r0)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b java.io.FileNotFoundException -> L87
            r4.close()     // Catch: java.io.IOException -> L34
            goto L8c
        L50:
            r4.close()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b java.io.FileNotFoundException -> L87
            java.lang.String r8 = new java.lang.String     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b java.io.FileNotFoundException -> L87
            r8.<init>(r6, r7, r5)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b java.io.FileNotFoundException -> L87
            java.lang.String r5 = "Read client id from disk"
            r9.zzP(r5, r8)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b java.io.FileNotFoundException -> L87
            r4.close()     // Catch: java.io.IOException -> L61
            goto L65
        L61:
            r0 = move-exception
            r9.zzK(r1, r0)
        L65:
            r3 = r8
            goto L8c
        L67:
            r3 = r4
            goto L7b
        L69:
            r0 = move-exception
            goto L7b
        L6b:
            r5 = move-exception
            r4 = r3
        L6d:
            java.lang.String r6 = "Error reading client id file, deleting it"
            r9.zzK(r6, r5)     // Catch: java.lang.Throwable -> L39
            r2.deleteFile(r0)     // Catch: java.lang.Throwable -> L39
            if (r4 == 0) goto L8c
            r4.close()     // Catch: java.io.IOException -> L34
            goto L8c
        L7b:
            if (r3 == 0) goto L85
            r3.close()     // Catch: java.io.IOException -> L81
            goto L85
        L81:
            r2 = move-exception
            r9.zzK(r1, r2)
        L85:
            throw r0
        L86:
            r4 = r3
        L87:
            if (r4 == 0) goto L8c
            r4.close()     // Catch: java.io.IOException -> L34
        L8c:
            if (r3 != 0) goto L93
            java.lang.String r0 = r9.zzf()
            return r0
        L93:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzcn.zzc():java.lang.String");
    }

    public final String zze() {
        synchronized (this) {
            this.zza = null;
            this.zzb = zzq().zzg(new zzcm(this));
        }
        return zzb();
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    public final void zzd() {
    }
}

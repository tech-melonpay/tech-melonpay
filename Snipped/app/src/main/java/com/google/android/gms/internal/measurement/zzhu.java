package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
public abstract class zzhu<T> {
    public static final /* synthetic */ int zzc = 0;
    private static volatile zzhs zze = null;
    private static volatile boolean zzf = false;
    final zzhr zza;
    final String zzb;
    private final T zzj;
    private volatile int zzk = -1;
    private volatile T zzl;
    private final boolean zzm;
    private static final Object zzd = new Object();
    private static final AtomicReference<Collection<zzhu<?>>> zzg = new AtomicReference<>();
    private static final zzhw zzh = new zzhw(new Object() { // from class: com.google.android.gms.internal.measurement.zzhl
    }, null);
    private static final AtomicInteger zzi = new AtomicInteger();

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ zzhu(zzhr zzhrVar, String str, Object obj, boolean z10, zzht zzhtVar) {
        if (zzhrVar.zzb == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.zza = zzhrVar;
        this.zzb = str;
        this.zzj = obj;
        this.zzm = true;
    }

    @Deprecated
    public static void zzd(final Context context) {
        synchronized (zzd) {
            try {
                zzhs zzhsVar = zze;
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                if (zzhsVar != null) {
                    if (zzhsVar.zza() != context) {
                    }
                }
                zzha.zze();
                zzhv.zzc();
                zzhh.zze();
                zze = new zzgx(context, zzif.zza(new zzib() { // from class: com.google.android.gms.internal.measurement.zzhm
                    @Override // com.google.android.gms.internal.measurement.zzib
                    public final Object zza() {
                        zzhz zzc2;
                        zzhz zzc3;
                        Context context2 = context;
                        int i = zzhu.zzc;
                        String str = Build.TYPE;
                        String str2 = Build.TAGS;
                        if ((!str.equals("eng") && !str.equals("userdebug")) || (!str2.contains("dev-keys") && !str2.contains("test-keys"))) {
                            return zzhz.zzc();
                        }
                        if (zzgw.zza() && !context2.isDeviceProtectedStorage()) {
                            context2 = context2.createDeviceProtectedStorageContext();
                        }
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            StrictMode.allowThreadDiskWrites();
                            try {
                                File file = new File(context2.getDir("phenotype_hermetic", 0), "overrides.txt");
                                zzc2 = file.exists() ? zzhz.zzd(file) : zzhz.zzc();
                            } catch (RuntimeException e10) {
                                Log.e("HermeticFileOverrides", "no data dir", e10);
                                zzc2 = zzhz.zzc();
                            }
                            if (zzc2.zzb()) {
                                File file2 = (File) zzc2.zza();
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                    try {
                                        HashMap hashMap = new HashMap();
                                        HashMap hashMap2 = new HashMap();
                                        while (true) {
                                            String readLine = bufferedReader.readLine();
                                            if (readLine == null) {
                                                break;
                                            }
                                            String[] split = readLine.split(" ", 3);
                                            if (split.length != 3) {
                                                Log.e("HermeticFileOverrides", readLine.length() != 0 ? "Invalid: ".concat(readLine) : new String("Invalid: "));
                                            } else {
                                                String str3 = new String(split[0]);
                                                String decode = Uri.decode(new String(split[1]));
                                                String str4 = (String) hashMap2.get(split[2]);
                                                if (str4 == null) {
                                                    String str5 = new String(split[2]);
                                                    str4 = Uri.decode(str5);
                                                    if (str4.length() < 1024 || str4 == str5) {
                                                        hashMap2.put(str5, str4);
                                                    }
                                                }
                                                if (!hashMap.containsKey(str3)) {
                                                    hashMap.put(str3, new HashMap());
                                                }
                                                ((Map) hashMap.get(str3)).put(decode, str4);
                                            }
                                        }
                                        String obj = file2.toString();
                                        StringBuilder sb2 = new StringBuilder(obj.length() + 7);
                                        sb2.append("Parsed ");
                                        sb2.append(obj);
                                        Log.i("HermeticFileOverrides", sb2.toString());
                                        zzhi zzhiVar = new zzhi(hashMap);
                                        bufferedReader.close();
                                        zzc3 = zzhz.zzd(zzhiVar);
                                    } finally {
                                        try {
                                            bufferedReader.close();
                                        } catch (Throwable unused) {
                                        }
                                    }
                                } catch (IOException e11) {
                                    throw new RuntimeException(e11);
                                }
                            } else {
                                zzc3 = zzhz.zzc();
                            }
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            return zzc3;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            throw th;
                        }
                    }
                }));
                zzi.incrementAndGet();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void zze() {
        zzi.incrementAndGet();
    }

    public abstract T zza(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:29:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f7 A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:12:0x001c, B:14:0x0020, B:16:0x0026, B:18:0x003b, B:20:0x0047, B:22:0x0050, B:24:0x0062, B:25:0x0070, B:26:0x006a, B:30:0x00e7, B:32:0x00f7, B:34:0x010b, B:35:0x010e, B:36:0x0112, B:37:0x00bf, B:39:0x00c5, B:42:0x00d7, B:44:0x00dd, B:46:0x00e5, B:47:0x00d5, B:49:0x0075, B:51:0x007b, B:53:0x0089, B:55:0x00ae, B:57:0x00b8, B:59:0x00a0, B:60:0x0117, B:61:0x011c, B:62:0x011d), top: B:11:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:12:0x001c, B:14:0x0020, B:16:0x0026, B:18:0x003b, B:20:0x0047, B:22:0x0050, B:24:0x0062, B:25:0x0070, B:26:0x006a, B:30:0x00e7, B:32:0x00f7, B:34:0x010b, B:35:0x010e, B:36:0x0112, B:37:0x00bf, B:39:0x00c5, B:42:0x00d7, B:44:0x00dd, B:46:0x00e5, B:47:0x00d5, B:49:0x0075, B:51:0x007b, B:53:0x0089, B:55:0x00ae, B:57:0x00b8, B:59:0x00a0, B:60:0x0117, B:61:0x011c, B:62:0x011d), top: B:11:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e5 A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:12:0x001c, B:14:0x0020, B:16:0x0026, B:18:0x003b, B:20:0x0047, B:22:0x0050, B:24:0x0062, B:25:0x0070, B:26:0x006a, B:30:0x00e7, B:32:0x00f7, B:34:0x010b, B:35:0x010e, B:36:0x0112, B:37:0x00bf, B:39:0x00c5, B:42:0x00d7, B:44:0x00dd, B:46:0x00e5, B:47:0x00d5, B:49:0x0075, B:51:0x007b, B:53:0x0089, B:55:0x00ae, B:57:0x00b8, B:59:0x00a0, B:60:0x0117, B:61:0x011c, B:62:0x011d), top: B:11:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final T zzb() {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzhu.zzb():java.lang.Object");
    }

    public final String zzc() {
        String str = this.zza.zzd;
        return this.zzb;
    }
}

package com.google.android.gms.internal.gtm;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.CampaignTrackingReceiver;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
final class zzck extends zzbs {
    private boolean zza;
    private final zzce zzb;
    private final zzfe zzc;
    private final zzfc zzd;
    private final zzcc zze;
    private long zzf;
    private final zzcw zzg;
    private final zzcw zzh;
    private final zzfo zzi;
    private long zzj;
    private boolean zzk;

    public zzck(zzbv zzbvVar, zzbw zzbwVar) {
        super(zzbvVar);
        Preconditions.checkNotNull(zzbwVar);
        this.zzf = Long.MIN_VALUE;
        this.zzd = new zzfc(zzbvVar);
        this.zzb = new zzce(zzbvVar);
        this.zzc = new zzfe(zzbvVar);
        this.zze = new zzcc(zzbvVar);
        this.zzi = new zzfo(zzC());
        this.zzg = new zzcg(this, zzbvVar);
        this.zzh = new zzch(this, zzbvVar);
    }

    private final void zzag() {
        zzcy zzy = zzy();
        if (zzy.zze()) {
            zzy.zza();
        }
    }

    private final void zzah() {
        if (this.zzg.zzh()) {
            zzO("All hits dispatched or no network/service. Going to power save mode");
        }
        this.zzg.zzf();
    }

    private final void zzai() {
        long j10;
        zzcy zzy = zzy();
        if (zzy.zzc() && !zzy.zze()) {
            com.google.android.gms.analytics.zzr.zzh();
            zzW();
            try {
                j10 = this.zzb.zzc();
            } catch (SQLiteException e10) {
                zzK("Failed to get min/max hit times from local store", e10);
                j10 = 0;
            }
            if (j10 != 0) {
                long abs = Math.abs(zzC().currentTimeMillis() - j10);
                zzw();
                if (abs <= zzeu.zzn.zzb().longValue()) {
                    zzw();
                    zzP("Dispatch alarm scheduled (ms)", Long.valueOf(zzct.zzd()));
                    zzy.zzb();
                }
            }
        }
    }

    private final void zzaj(zzbx zzbxVar, zzaw zzawVar) {
        Preconditions.checkNotNull(zzbxVar);
        Preconditions.checkNotNull(zzawVar);
        com.google.android.gms.analytics.zza zzaVar = new com.google.android.gms.analytics.zza(zzt());
        zzaVar.zzc(zzbxVar.zzc());
        zzaVar.zzd(zzbxVar.zzf());
        com.google.android.gms.analytics.zzh zza = zzaVar.zza();
        zzbe zzbeVar = (zzbe) zza.zzb(zzbe.class);
        zzbeVar.zzk(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        zzbeVar.zzl(true);
        zza.zzg(zzawVar);
        zzaz zzazVar = (zzaz) zza.zzb(zzaz.class);
        zzav zzavVar = (zzav) zza.zzb(zzav.class);
        for (Map.Entry<String, String> entry : zzbxVar.zzd().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if ("an".equals(key)) {
                zzavVar.zzk(value);
            } else if ("av".equals(key)) {
                zzavVar.zzl(value);
            } else if ("aid".equals(key)) {
                zzavVar.zzi(value);
            } else if ("aiid".equals(key)) {
                zzavVar.zzj(value);
            } else if ("uid".equals(key)) {
                zzbeVar.zzm(value);
            } else {
                zzazVar.zze(key, value);
            }
        }
        zzH("Sending installation campaign to", zzbxVar.zzc(), zzawVar);
        zza.zzj(zzA().zza());
        zza.zzk();
    }

    private final boolean zzak(String str) {
        return Wrappers.packageManager(zzo()).checkCallingOrSelfPermission(str) == 0;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzck zzckVar) {
        try {
            zzckVar.zzb.zza();
            zzckVar.zzae();
        } catch (SQLiteException e10) {
            zzckVar.zzS("Failed to delete stale hits", e10);
        }
        zzcw zzcwVar = zzckVar.zzh;
        zzckVar.zzw();
        zzcwVar.zzg(86400000L);
    }

    public final void zzZ(long j10) {
        com.google.android.gms.analytics.zzr.zzh();
        zzW();
        if (j10 < 0) {
            j10 = 0;
        }
        this.zzf = j10;
        zzae();
    }

    public final long zza() {
        long j10 = this.zzf;
        if (j10 != Long.MIN_VALUE) {
            return j10;
        }
        zzw();
        long longValue = zzeu.zzi.zzb().longValue();
        zzft zzB = zzB();
        zzB.zzW();
        if (!zzB.zzc) {
            return longValue;
        }
        zzB().zzW();
        return r0.zzd * 1000;
    }

    public final void zzaa() {
        zzW();
        Preconditions.checkState(!this.zza, "Analytics backend already started");
        this.zza = true;
        zzq().zzi(new zzci(this));
    }

    public final void zzab() {
        zzW();
        zzw();
        com.google.android.gms.analytics.zzr.zzh();
        Context zza = zzt().zza();
        if (!zzfi.zza(zza)) {
            zzR("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
        } else if (!zzfn.zzh(zza)) {
            zzJ("AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!CampaignTrackingReceiver.zzb(zza)) {
            zzR("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
        zzA().zza();
        if (!zzak("android.permission.ACCESS_NETWORK_STATE")) {
            zzJ("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            zzad();
        }
        if (!zzak("android.permission.INTERNET")) {
            zzJ("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            zzad();
        }
        if (zzfn.zzh(zzo())) {
            zzO("AnalyticsService registered in the app manifest and enabled");
        } else {
            zzw();
            zzR("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!this.zzk) {
            zzw();
            if (!this.zzb.zzac()) {
                zzi();
            }
        }
        zzae();
    }

    public final void zzac() {
        com.google.android.gms.analytics.zzr.zzh();
        zzW();
        zzF("Sync dispatching local hits");
        long j10 = this.zzj;
        zzw();
        zzi();
        try {
            zzaf();
            zzA().zzi();
            zzae();
            if (this.zzj != j10) {
                this.zzd.zzb();
            }
        } catch (Exception e10) {
            zzK("Sync local dispatch failed", e10);
            zzae();
        }
    }

    public final void zzad() {
        zzW();
        com.google.android.gms.analytics.zzr.zzh();
        this.zzk = true;
        this.zze.zzc();
        zzae();
    }

    public final void zzae() {
        long min;
        com.google.android.gms.analytics.zzr.zzh();
        zzW();
        if (!this.zzk) {
            zzw();
            if (zza() > 0) {
                if (this.zzb.zzac()) {
                    this.zzd.zzc();
                    zzah();
                    zzag();
                    return;
                }
                if (!zzeu.zzJ.zzb().booleanValue()) {
                    this.zzd.zza();
                    if (!this.zzd.zzd()) {
                        zzah();
                        zzag();
                        zzai();
                        return;
                    }
                }
                zzai();
                long zza = zza();
                long zzb = zzA().zzb();
                if (zzb != 0) {
                    min = zza - Math.abs(zzC().currentTimeMillis() - zzb);
                    if (min <= 0) {
                        zzw();
                        min = Math.min(zzct.zze(), zza);
                    }
                } else {
                    zzw();
                    min = Math.min(zzct.zze(), zza);
                }
                zzP("Dispatch scheduled (ms)", Long.valueOf(min));
                if (!this.zzg.zzh()) {
                    this.zzg.zzg(min);
                    return;
                } else {
                    this.zzg.zze(Math.max(1L, min + this.zzg.zzb()));
                    return;
                }
            }
        }
        this.zzd.zzc();
        zzah();
        zzag();
    }

    public final boolean zzaf() {
        boolean z10;
        com.google.android.gms.analytics.zzr.zzh();
        zzW();
        zzO("Dispatching a batch of local hits");
        if (this.zze.zzg()) {
            z10 = false;
        } else {
            zzw();
            z10 = true;
        }
        boolean zze = true ^ this.zzc.zze();
        if (z10 && zze) {
            zzO("No network or service available. Will retry later");
            return false;
        }
        zzw();
        int zzh = zzct.zzh();
        zzw();
        long max = Math.max(zzh, zzct.zzg());
        ArrayList arrayList = new ArrayList();
        long j10 = 0;
        while (true) {
            try {
                this.zzb.zzm();
                arrayList.clear();
                try {
                    List<zzex> zzj = this.zzb.zzj(max);
                    if (zzj.isEmpty()) {
                        zzO("Store is empty, nothing to dispatch");
                        zzah();
                        zzag();
                        try {
                            this.zzb.zzab();
                            this.zzb.zzaa();
                            return false;
                        } catch (SQLiteException e10) {
                            zzK("Failed to commit local dispatch transaction", e10);
                            zzah();
                            zzag();
                            return false;
                        }
                    }
                    zzP("Hits loaded from store. count", Integer.valueOf(zzj.size()));
                    Iterator<zzex> it = zzj.iterator();
                    while (it.hasNext()) {
                        if (it.next().zzb() == j10) {
                            zzL("Database contains successfully uploaded hit", Long.valueOf(j10), Integer.valueOf(zzj.size()));
                            zzah();
                            zzag();
                            try {
                                this.zzb.zzab();
                                this.zzb.zzaa();
                                return false;
                            } catch (SQLiteException e11) {
                                zzK("Failed to commit local dispatch transaction", e11);
                                zzah();
                                zzag();
                                return false;
                            }
                        }
                    }
                    if (this.zze.zzg()) {
                        zzw();
                        zzO("Service connected, sending hits to the service");
                        while (!zzj.isEmpty()) {
                            zzex zzexVar = zzj.get(0);
                            if (!this.zze.zzh(zzexVar)) {
                                break;
                            }
                            j10 = Math.max(j10, zzexVar.zzb());
                            zzj.remove(zzexVar);
                            zzG("Hit sent do device AnalyticsService for delivery", zzexVar);
                            try {
                                this.zzb.zzn(zzexVar.zzb());
                                arrayList.add(Long.valueOf(zzexVar.zzb()));
                            } catch (SQLiteException e12) {
                                zzK("Failed to remove hit that was send for delivery", e12);
                                zzah();
                                zzag();
                                try {
                                    this.zzb.zzab();
                                    this.zzb.zzaa();
                                    return false;
                                } catch (SQLiteException e13) {
                                    zzK("Failed to commit local dispatch transaction", e13);
                                    zzah();
                                    zzag();
                                    return false;
                                }
                            }
                        }
                    }
                    if (this.zzc.zze()) {
                        List<Long> zzc = this.zzc.zzc(zzj);
                        Iterator<Long> it2 = zzc.iterator();
                        while (it2.hasNext()) {
                            j10 = Math.max(j10, it2.next().longValue());
                        }
                        try {
                            this.zzb.zzZ(zzc);
                            arrayList.addAll(zzc);
                        } catch (SQLiteException e14) {
                            zzK("Failed to remove successfully uploaded hits", e14);
                            zzah();
                            zzag();
                            try {
                                this.zzb.zzab();
                                this.zzb.zzaa();
                                return false;
                            } catch (SQLiteException e15) {
                                zzK("Failed to commit local dispatch transaction", e15);
                                zzah();
                                zzag();
                                return false;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        try {
                            this.zzb.zzab();
                            this.zzb.zzaa();
                            return false;
                        } catch (SQLiteException e16) {
                            zzK("Failed to commit local dispatch transaction", e16);
                            zzah();
                            zzag();
                            return false;
                        }
                    }
                    try {
                        this.zzb.zzab();
                        this.zzb.zzaa();
                    } catch (SQLiteException e17) {
                        zzK("Failed to commit local dispatch transaction", e17);
                        zzah();
                        zzag();
                        return false;
                    }
                } catch (SQLiteException e18) {
                    zzS("Failed to read hits from persisted store", e18);
                    zzah();
                    zzag();
                    try {
                        this.zzb.zzab();
                        this.zzb.zzaa();
                        return false;
                    } catch (SQLiteException e19) {
                        zzK("Failed to commit local dispatch transaction", e19);
                        zzah();
                        zzag();
                        return false;
                    }
                }
            } catch (Throwable th) {
                this.zzb.zzab();
                this.zzb.zzaa();
                throw th;
            }
            try {
                this.zzb.zzab();
                this.zzb.zzaa();
                throw th;
            } catch (SQLiteException e20) {
                zzK("Failed to commit local dispatch transaction", e20);
                zzah();
                zzag();
                return false;
            }
        }
    }

    public final long zzb(zzbx zzbxVar, boolean z10) {
        Preconditions.checkNotNull(zzbxVar);
        zzW();
        com.google.android.gms.analytics.zzr.zzh();
        try {
            try {
                this.zzb.zzm();
                zzce zzceVar = this.zzb;
                String zzb = zzbxVar.zzb();
                Preconditions.checkNotEmpty(zzb);
                zzceVar.zzW();
                com.google.android.gms.analytics.zzr.zzh();
                int delete = zzceVar.zzf().delete("properties", "app_uid=? AND cid<>?", new String[]{"0", zzb});
                if (delete > 0) {
                    zzceVar.zzP("Deleted property records", Integer.valueOf(delete));
                }
                long zze = this.zzb.zze(0L, zzbxVar.zzb(), zzbxVar.zzc());
                zzbxVar.zze(1 + zze);
                zzce zzceVar2 = this.zzb;
                Preconditions.checkNotNull(zzbxVar);
                zzceVar2.zzW();
                com.google.android.gms.analytics.zzr.zzh();
                SQLiteDatabase zzf = zzceVar2.zzf();
                Map<String, String> zzd = zzbxVar.zzd();
                Preconditions.checkNotNull(zzd);
                Uri.Builder builder = new Uri.Builder();
                for (Map.Entry<String, String> entry : zzd.entrySet()) {
                    builder.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                String encodedQuery = builder.build().getEncodedQuery();
                if (encodedQuery == null) {
                    encodedQuery = "";
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_uid", (Long) 0L);
                contentValues.put("cid", zzbxVar.zzb());
                contentValues.put("tid", zzbxVar.zzc());
                contentValues.put("adid", Integer.valueOf(zzbxVar.zzf() ? 1 : 0));
                contentValues.put("hits_count", Long.valueOf(zzbxVar.zza()));
                contentValues.put("params", encodedQuery);
                try {
                    if (zzf.insertWithOnConflict("properties", null, contentValues, 5) == -1) {
                        zzceVar2.zzJ("Failed to insert/update a property (got -1)");
                    }
                } catch (SQLiteException e10) {
                    zzceVar2.zzK("Error storing a property", e10);
                }
                this.zzb.zzab();
                try {
                    this.zzb.zzaa();
                } catch (SQLiteException e11) {
                    zzK("Failed to end transaction", e11);
                }
                return zze;
            } catch (Throwable th) {
                try {
                    this.zzb.zzaa();
                } catch (SQLiteException e12) {
                    zzK("Failed to end transaction", e12);
                }
                throw th;
            }
        } catch (SQLiteException e13) {
            zzK("Failed to update Analytics property", e13);
            try {
                this.zzb.zzaa();
            } catch (SQLiteException e14) {
                zzK("Failed to end transaction", e14);
            }
            return -1L;
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    public final void zzd() {
        this.zzb.zzX();
        this.zzc.zzX();
        this.zze.zzX();
    }

    public final void zzf(zzcz zzczVar) {
        zzg(zzczVar, this.zzj);
    }

    public final void zzg(zzcz zzczVar, long j10) {
        com.google.android.gms.analytics.zzr.zzh();
        zzW();
        long zzb = zzA().zzb();
        zzG("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(zzb != 0 ? Math.abs(zzC().currentTimeMillis() - zzb) : -1L));
        zzw();
        zzi();
        try {
            zzaf();
            zzA().zzi();
            zzae();
            if (zzczVar != null) {
                zzczVar.zza(null);
            }
            if (this.zzj != j10) {
                this.zzd.zzb();
            }
        } catch (Exception e10) {
            zzK("Local dispatch failed", e10);
            zzA().zzi();
            zzae();
            if (zzczVar != null) {
                zzczVar.zza(e10);
            }
        }
    }

    public final void zzh() {
        com.google.android.gms.analytics.zzr.zzh();
        zzW();
        zzw();
        zzO("Delete all hits from local store");
        try {
            zzce zzceVar = this.zzb;
            com.google.android.gms.analytics.zzr.zzh();
            zzceVar.zzW();
            zzceVar.zzf().delete("hits2", null, null);
            zzce zzceVar2 = this.zzb;
            com.google.android.gms.analytics.zzr.zzh();
            zzceVar2.zzW();
            zzceVar2.zzf().delete("properties", null, null);
            zzae();
        } catch (SQLiteException e10) {
            zzS("Failed to delete hits from store", e10);
        }
        zzi();
        if (this.zze.zze()) {
            zzO("Device service unavailable. Can't clear hits stored on the device service.");
        }
    }

    public final void zzi() {
        if (this.zzk) {
            return;
        }
        zzw();
        if (zzct.zzl() && !this.zze.zzg()) {
            zzw();
            if (this.zzi.zzc(zzeu.zzO.zzb().longValue())) {
                this.zzi.zzb();
                zzO("Connecting to service");
                if (this.zze.zzf()) {
                    zzO("Connected to service");
                    this.zzi.zza();
                    zzm();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0184, code lost:
    
        if (r2 == 0) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v11, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzj(com.google.android.gms.internal.gtm.zzex r20) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzck.zzj(com.google.android.gms.internal.gtm.zzex):void");
    }

    public final void zzk(zzbx zzbxVar) {
        com.google.android.gms.analytics.zzr.zzh();
        zzG("Sending first hit to property", zzbxVar.zzc());
        zzfo zzf = zzA().zzf();
        zzw();
        if (zzf.zzc(zzct.zzc())) {
            return;
        }
        String zzg = zzA().zzg();
        if (TextUtils.isEmpty(zzg)) {
            return;
        }
        zzaw zzb = zzfs.zzb(zzz(), zzg);
        zzG("Found relevant installation campaign", zzb);
        zzaj(zzbxVar, zzb);
    }

    public final void zzl() {
        com.google.android.gms.analytics.zzr.zzh();
        this.zzj = zzC().currentTimeMillis();
    }

    public final void zzm() {
        com.google.android.gms.analytics.zzr.zzh();
        zzw();
        com.google.android.gms.analytics.zzr.zzh();
        zzW();
        zzE();
        zzw();
        if (!zzct.zzl()) {
            zzR("Service client disabled. Can't dispatch local hits to device AnalyticsService");
        }
        if (!this.zze.zzg()) {
            zzO("Service not connected");
            return;
        }
        if (this.zzb.zzac()) {
            return;
        }
        zzO("Dispatching local hits to device AnalyticsService");
        while (true) {
            try {
                zzce zzceVar = this.zzb;
                zzw();
                List<zzex> zzj = zzceVar.zzj(zzct.zzh());
                if (zzj.isEmpty()) {
                    zzae();
                    return;
                }
                while (!zzj.isEmpty()) {
                    zzex zzexVar = zzj.get(0);
                    if (!this.zze.zzh(zzexVar)) {
                        zzae();
                        return;
                    }
                    zzj.remove(zzexVar);
                    try {
                        this.zzb.zzn(zzexVar.zzb());
                    } catch (SQLiteException e10) {
                        zzK("Failed to remove hit that was send for delivery", e10);
                        zzah();
                        zzag();
                        return;
                    }
                }
            } catch (SQLiteException e11) {
                zzK("Failed to read hits from store", e11);
                zzah();
                zzag();
                return;
            }
        }
    }

    public final void zzn(String str) {
        Preconditions.checkNotEmpty(str);
        com.google.android.gms.analytics.zzr.zzh();
        zzE();
        zzaw zzb = zzfs.zzb(zzz(), str);
        if (zzb == null) {
            zzS("Parsing failed. Ignoring invalid campaign data", str);
            return;
        }
        String zzg = zzA().zzg();
        if (str.equals(zzg)) {
            zzR("Ignoring duplicate install campaign");
            return;
        }
        if (!TextUtils.isEmpty(zzg)) {
            zzL("Ignoring multiple install campaigns. original, new", zzg, str);
            return;
        }
        zzA().zzh(str);
        zzfo zzf = zzA().zzf();
        zzw();
        if (zzf.zzc(zzct.zzc())) {
            zzS("Campaign received too late, ignoring", zzb);
            return;
        }
        zzG("Received installation campaign", zzb);
        zzce zzceVar = this.zzb;
        zzceVar.zzW();
        com.google.android.gms.analytics.zzr.zzh();
        SQLiteDatabase zzf2 = zzceVar.zzf();
        Cursor cursor = null;
        try {
            try {
                zzceVar.zzw();
                int intValue = zzeu.zzh.zzb().intValue();
                cursor = zzf2.query("properties", new String[]{"cid", "tid", "adid", "hits_count", "params"}, "app_uid=?", new String[]{"0"}, null, null, null, String.valueOf(intValue));
                ArrayList arrayList = new ArrayList();
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(0);
                        String string2 = cursor.getString(1);
                        boolean z10 = cursor.getInt(2) != 0;
                        long j10 = cursor.getInt(3);
                        Map<String, String> zzl = zzceVar.zzl(cursor.getString(4));
                        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                            arrayList.add(new zzbx(0L, string, string2, z10, j10, zzl));
                        }
                        zzceVar.zzT("Read property with empty client id or tracker id", string, string2);
                    } while (cursor.moveToNext());
                }
                if (arrayList.size() >= intValue) {
                    zzceVar.zzR("Sending hits to too many properties. Campaign report might be incorrect");
                }
                cursor.close();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zzaj((zzbx) it.next(), zzb);
                }
            } catch (SQLiteException e10) {
                zzceVar.zzK("Error loading hits from the database", e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }
}

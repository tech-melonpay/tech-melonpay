package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zznu;
import com.google.android.gms.internal.measurement.zznx;
import com.google.android.gms.internal.measurement.zzod;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.DebugKt;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
public final class zzia extends zzf {

    @VisibleForTesting
    protected zzhz zza;
    final zzr zzb;

    @VisibleForTesting
    protected boolean zzc;
    private zzgv zzd;
    private final Set<zzgw> zze;
    private boolean zzf;
    private final AtomicReference<String> zzg;
    private final Object zzh;
    private zzag zzi;
    private int zzj;
    private final AtomicLong zzk;
    private long zzl;
    private int zzm;
    private final zzky zzn;

    public zzia(zzfv zzfvVar) {
        super(zzfvVar);
        this.zze = new CopyOnWriteArraySet();
        this.zzh = new Object();
        this.zzc = true;
        this.zzn = new zzho(this);
        this.zzg = new AtomicReference<>();
        this.zzi = new zzag(null, null);
        this.zzj = 100;
        this.zzl = -1L;
        this.zzm = 100;
        this.zzk = new AtomicLong(0L);
        this.zzb = new zzr(zzfvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzab, reason: merged with bridge method [inline-methods] */
    public final void zzB(Bundle bundle, long j10) {
        zznx.zzc();
        if (!this.zzs.zzf().zzs(null, zzdy.zzar) || TextUtils.isEmpty(this.zzs.zzh().zzn())) {
            zzR(bundle, 0, j10);
        } else {
            this.zzs.zzay().zzl().zza("Using developer consent only; google app id found");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzac(Boolean bool, boolean z10) {
        zzg();
        zza();
        this.zzs.zzay().zzc().zzb("Setting app measurement enabled (FE)", bool);
        this.zzs.zzm().zzh(bool);
        if (z10) {
            zzfa zzm = this.zzs.zzm();
            zzfv zzfvVar = zzm.zzs;
            zzm.zzg();
            SharedPreferences.Editor edit = zzm.zza().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (this.zzs.zzK() || !(bool == null || bool.booleanValue())) {
            zzad();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzad() {
        zzg();
        String zza = this.zzs.zzm().zzh.zza();
        if (zza != null) {
            if ("unset".equals(zza)) {
                zzZ(com.sumsub.sentry.a.f13540h, "_npa", null, this.zzs.zzav().currentTimeMillis());
            } else {
                zzZ(com.sumsub.sentry.a.f13540h, "_npa", Long.valueOf(true != "true".equals(zza) ? 0L : 1L), this.zzs.zzav().currentTimeMillis());
            }
        }
        if (!this.zzs.zzJ() || !this.zzc) {
            this.zzs.zzay().zzc().zza("Updating Scion state (FE)");
            this.zzs.zzt().zzI();
            return;
        }
        this.zzs.zzay().zzc().zza("Recording app launch after enabling measurement for the first time (FE)");
        zzy();
        zzod.zzc();
        if (this.zzs.zzf().zzs(null, zzdy.zzai)) {
            this.zzs.zzu().zza.zza();
        }
        this.zzs.zzaz().zzp(new zzhd(this));
    }

    public static /* synthetic */ void zzv(zzia zziaVar, zzag zzagVar, int i, long j10, boolean z10, boolean z11) {
        zziaVar.zzg();
        zziaVar.zza();
        if (j10 <= zziaVar.zzl && zzag.zzl(zziaVar.zzm, i)) {
            zziaVar.zzs.zzay().zzi().zzb("Dropped out-of-date consent setting, proposed settings", zzagVar);
            return;
        }
        zzfa zzm = zziaVar.zzs.zzm();
        zzfv zzfvVar = zzm.zzs;
        zzm.zzg();
        if (!zzm.zzl(i)) {
            zziaVar.zzs.zzay().zzi().zzb("Lower precedence consent source ignored, proposed source", Integer.valueOf(i));
            return;
        }
        SharedPreferences.Editor edit = zzm.zza().edit();
        edit.putString("consent_settings", zzagVar.zzi());
        edit.putInt("consent_source", i);
        edit.apply();
        zziaVar.zzl = j10;
        zziaVar.zzm = i;
        zziaVar.zzs.zzt().zzF(z10);
        if (z11) {
            zziaVar.zzs.zzt().zzu(new AtomicReference<>());
        }
    }

    public final void zzA() {
        if (!(this.zzs.zzau().getApplicationContext() instanceof Application) || this.zza == null) {
            return;
        }
        ((Application) this.zzs.zzau().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
    }

    public final /* synthetic */ void zzC(Bundle bundle) {
        if (bundle == null) {
            this.zzs.zzm().zzr.zzb(new Bundle());
            return;
        }
        Bundle zza = this.zzs.zzm().zzr.zza();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.zzs.zzv().zzae(obj)) {
                    this.zzs.zzv().zzM(this.zzn, null, 27, null, null, 0);
                }
                this.zzs.zzay().zzl().zzc("Invalid default event parameter type. Name, value", str, obj);
            } else if (zzkz.zzag(str)) {
                this.zzs.zzay().zzl().zzb("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                zza.remove(str);
            } else {
                zzkz zzv = this.zzs.zzv();
                this.zzs.zzf();
                if (zzv.zzZ("param", str, 100, obj)) {
                    this.zzs.zzv().zzN(zza, str, obj);
                }
            }
        }
        this.zzs.zzv();
        int zzc = this.zzs.zzf().zzc();
        if (zza.size() > zzc) {
            Iterator it = new TreeSet(zza.keySet()).iterator();
            int i = 0;
            while (it.hasNext()) {
                String str2 = (String) it.next();
                i++;
                if (i > zzc) {
                    zza.remove(str2);
                }
            }
            this.zzs.zzv().zzM(this.zzn, null, 26, null, null, 0);
            this.zzs.zzay().zzl().zza("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.zzs.zzm().zzr.zzb(zza);
        this.zzs.zzt().zzH(zza);
    }

    public final void zzD(String str, String str2, Bundle bundle) {
        zzE(str, str2, bundle, true, true, this.zzs.zzav().currentTimeMillis());
    }

    public final void zzE(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        String str3 = str == null ? com.sumsub.sentry.a.f13540h : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (zzkz.zzak(str2, FirebaseAnalytics.Event.SCREEN_VIEW)) {
            this.zzs.zzs().zzx(bundle2, j10);
            return;
        }
        boolean z12 = true;
        if (z11 && this.zzd != null && !zzkz.zzag(str2)) {
            z12 = false;
        }
        zzM(str3, str2, j10, bundle2, z11, z12, z10, null);
    }

    public final void zzF(String str, String str2, Bundle bundle, String str3) {
        zzfv.zzO();
        zzM(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, str2, this.zzs.zzav().currentTimeMillis(), bundle, false, true, true, str3);
    }

    public final void zzG(String str, String str2, Bundle bundle) {
        zzg();
        zzH(str, str2, this.zzs.zzav().currentTimeMillis(), bundle);
    }

    public final void zzH(String str, String str2, long j10, Bundle bundle) {
        zzg();
        zzI(str, str2, j10, bundle, true, this.zzd == null || zzkz.zzag(str2), true, null);
    }

    public final void zzI(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        boolean z13;
        String str4;
        long j11;
        String str5;
        String str6;
        Bundle[] bundleArr;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(bundle);
        zzg();
        zza();
        if (!this.zzs.zzJ()) {
            this.zzs.zzay().zzc().zza("Event not sent since app measurement is disabled");
            return;
        }
        List<String> zzo = this.zzs.zzh().zzo();
        if (zzo != null && !zzo.contains(str2)) {
            this.zzs.zzay().zzc().zzc("Dropping non-safelisted event. event name, origin", str2, str);
            return;
        }
        if (!this.zzf) {
            this.zzf = true;
            try {
                try {
                    (!this.zzs.zzN() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.zzs.zzau().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, this.zzs.zzau());
                } catch (Exception e10) {
                    this.zzs.zzay().zzk().zzb("Failed to invoke Tag Manager's initialize() method", e10);
                }
            } catch (ClassNotFoundException unused) {
                this.zzs.zzay().zzi().zza("Tag Manager is not found and thus will not be used");
            }
        }
        if (Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(str2) && bundle.containsKey("gclid")) {
            this.zzs.zzaw();
            zzZ(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_lgclid", bundle.getString("gclid"), this.zzs.zzav().currentTimeMillis());
        }
        this.zzs.zzaw();
        if (z10 && zzkz.zzal(str2)) {
            this.zzs.zzv().zzK(bundle, this.zzs.zzm().zzr.zza());
        }
        if (!z12) {
            this.zzs.zzaw();
            if (!"_iap".equals(str2)) {
                zzkz zzv = this.zzs.zzv();
                int i = 2;
                if (zzv.zzab("event", str2)) {
                    if (zzv.zzY("event", zzgs.zza, zzgs.zzb, str2)) {
                        zzv.zzs.zzf();
                        if (zzv.zzX("event", 40, str2)) {
                            i = 0;
                        }
                    } else {
                        i = 13;
                    }
                }
                if (i != 0) {
                    this.zzs.zzay().zze().zzb("Invalid public event name. Event will not be logged (FE)", this.zzs.zzj().zzd(str2));
                    zzkz zzv2 = this.zzs.zzv();
                    this.zzs.zzf();
                    this.zzs.zzv().zzM(this.zzn, null, i, "_ev", zzv2.zzC(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        zzpn.zzc();
        if (this.zzs.zzf().zzs(null, zzdy.zzaA)) {
            this.zzs.zzaw();
            zzih zzj = this.zzs.zzs().zzj(false);
            if (zzj != null && !bundle.containsKey("_sc")) {
                zzj.zzd = true;
            }
            zzkz.zzJ(zzj, bundle, z10 && !z12);
        } else {
            this.zzs.zzaw();
            zzih zzj2 = this.zzs.zzs().zzj(false);
            if (zzj2 != null && !bundle.containsKey("_sc")) {
                zzj2.zzd = true;
            }
            zzkz.zzJ(zzj2, bundle, z10 && !z12);
        }
        boolean equals = "am".equals(str);
        boolean zzag = zzkz.zzag(str2);
        if (!z10 || this.zzd == null || zzag) {
            z13 = equals;
        } else {
            if (!equals) {
                this.zzs.zzay().zzc().zzc("Passing event to registered event handler (FE)", this.zzs.zzj().zzd(str2), this.zzs.zzj().zzb(bundle));
                Preconditions.checkNotNull(this.zzd);
                this.zzd.interceptEvent(str, str2, bundle, j10);
                return;
            }
            z13 = true;
        }
        if (this.zzs.zzM()) {
            int zzh = this.zzs.zzv().zzh(str2);
            if (zzh != 0) {
                this.zzs.zzay().zze().zzb("Invalid event name. Event will not be logged (FE)", this.zzs.zzj().zzd(str2));
                zzkz zzv3 = this.zzs.zzv();
                this.zzs.zzf();
                this.zzs.zzv().zzM(this.zzn, str3, zzh, "_ev", zzv3.zzC(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            Bundle zzy = this.zzs.zzv().zzy(str3, str2, bundle, CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"}), z12);
            Preconditions.checkNotNull(zzy);
            this.zzs.zzaw();
            if (this.zzs.zzs().zzj(false) != null && "_ae".equals(str2)) {
                zzkb zzkbVar = this.zzs.zzu().zzb;
                long elapsedRealtime = zzkbVar.zzc.zzs.zzav().elapsedRealtime();
                long j12 = elapsedRealtime - zzkbVar.zzb;
                zzkbVar.zzb = elapsedRealtime;
                if (j12 > 0) {
                    this.zzs.zzv().zzH(zzy, j12);
                }
            }
            zznu.zzc();
            if (this.zzs.zzf().zzs(null, zzdy.zzah)) {
                if (!DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(str) && "_ssr".equals(str2)) {
                    zzkz zzv4 = this.zzs.zzv();
                    String string = zzy.getString("_ffr");
                    if (Strings.isEmptyOrWhitespace(string)) {
                        string = null;
                    } else if (string != null) {
                        string = string.trim();
                    }
                    if (zzkz.zzak(string, zzv4.zzs.zzm().zzo.zza())) {
                        zzv4.zzs.zzay().zzc().zza("Not logging duplicate session_start_with_rollout event");
                        return;
                    }
                    zzv4.zzs.zzm().zzo.zzb(string);
                } else if ("_ae".equals(str2)) {
                    String zza = this.zzs.zzv().zzs.zzm().zzo.zza();
                    if (!TextUtils.isEmpty(zza)) {
                        zzy.putString("_ffr", zza);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(zzy);
            if (this.zzs.zzm().zzj.zza() > 0 && this.zzs.zzm().zzk(j10) && this.zzs.zzm().zzl.zzb()) {
                a.q(this.zzs, "Current session is expired, remove the session number, ID, and engagement time");
                str4 = "_ae";
                j11 = 0;
                zzZ(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_sid", null, this.zzs.zzav().currentTimeMillis());
                zzZ(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_sno", null, this.zzs.zzav().currentTimeMillis());
                zzZ(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_se", null, this.zzs.zzav().currentTimeMillis());
            } else {
                str4 = "_ae";
                j11 = 0;
            }
            if (zzy.getLong(FirebaseAnalytics.Param.EXTEND_SESSION, j11) == 1) {
                a.q(this.zzs, "EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                this.zzs.zzu().zza.zzb(j10, true);
            }
            ArrayList arrayList2 = new ArrayList(zzy.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i9 = 0; i9 < size; i9++) {
                String str7 = (String) arrayList2.get(i9);
                if (str7 != null) {
                    this.zzs.zzv();
                    Object obj = zzy.get(str7);
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[]{(Bundle) obj};
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList3 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        zzy.putParcelableArray(str7, bundleArr);
                    }
                }
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Bundle bundle2 = (Bundle) arrayList.get(i10);
                if (i10 != 0) {
                    str6 = "_ep";
                    str5 = str;
                } else {
                    str5 = str;
                    str6 = str2;
                }
                bundle2.putString("_o", str5);
                if (z11) {
                    bundle2 = this.zzs.zzv().zzt(bundle2);
                }
                Bundle bundle3 = bundle2;
                this.zzs.zzt().zzA(new zzat(str6, new zzar(bundle3), str, j10), str3);
                if (!z13) {
                    Iterator<zzgw> it = this.zze.iterator();
                    while (it.hasNext()) {
                        it.next().onEvent(str, str2, new Bundle(bundle3), j10);
                    }
                }
            }
            this.zzs.zzaw();
            if (this.zzs.zzs().zzj(false) == null || !str4.equals(str2)) {
                return;
            }
            this.zzs.zzu().zzb.zzd(true, true, this.zzs.zzav().elapsedRealtime());
        }
    }

    public final void zzJ(zzgw zzgwVar) {
        zza();
        Preconditions.checkNotNull(zzgwVar);
        if (this.zze.add(zzgwVar)) {
            return;
        }
        androidx.camera.core.impl.utils.a.y(this.zzs, "OnEventListener already registered");
    }

    public final void zzK(long j10) {
        this.zzg.set(null);
        this.zzs.zzaz().zzp(new zzhi(this, j10));
    }

    public final void zzL(long j10, boolean z10) {
        zzg();
        zza();
        this.zzs.zzay().zzc().zza("Resetting analytics data (FE)");
        zzkd zzu = this.zzs.zzu();
        zzu.zzg();
        zzu.zzb.zza();
        boolean zzJ = this.zzs.zzJ();
        zzfa zzm = this.zzs.zzm();
        zzm.zzc.zzb(j10);
        if (!TextUtils.isEmpty(zzm.zzs.zzm().zzo.zza())) {
            zzm.zzo.zzb(null);
        }
        zzod.zzc();
        zzaf zzf = zzm.zzs.zzf();
        zzdx<Boolean> zzdxVar = zzdy.zzai;
        if (zzf.zzs(null, zzdxVar)) {
            zzm.zzj.zzb(0L);
        }
        if (!zzm.zzs.zzf().zzv()) {
            zzm.zzi(!zzJ);
        }
        zzm.zzp.zzb(null);
        zzm.zzq.zzb(0L);
        zzm.zzr.zzb(null);
        if (z10) {
            this.zzs.zzt().zzC();
        }
        zzod.zzc();
        if (this.zzs.zzf().zzs(null, zzdxVar)) {
            this.zzs.zzu().zza.zza();
        }
        this.zzc = !zzJ;
    }

    public final void zzM(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        this.zzs.zzaz().zzp(new zzhf(this, str, str2, j10, bundle2, z10, z11, z12, str3));
    }

    public final void zzN(String str, String str2, long j10, Object obj) {
        this.zzs.zzaz().zzp(new zzhg(this, str, str2, obj, j10));
    }

    public final void zzO(String str) {
        this.zzg.set(str);
    }

    public final void zzP(Bundle bundle) {
        zzQ(bundle, this.zzs.zzav().currentTimeMillis());
    }

    public final void zzQ(Bundle bundle, long j10) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            androidx.camera.core.impl.utils.a.y(this.zzs, "Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.checkNotNull(bundle2);
        zzgr.zza(bundle2, "app_id", String.class, null);
        zzgr.zza(bundle2, "origin", String.class, null);
        zzgr.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.NAME, String.class, null);
        zzgr.zza(bundle2, "value", Object.class, null);
        zzgr.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        zzgr.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L);
        zzgr.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        zzgr.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        zzgr.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        zzgr.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        zzgr.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L);
        zzgr.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        zzgr.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME));
        Preconditions.checkNotEmpty(bundle2.getString("origin"));
        Preconditions.checkNotNull(bundle2.get("value"));
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j10);
        String string = bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
        Object obj = bundle2.get("value");
        if (this.zzs.zzv().zzl(string) != 0) {
            this.zzs.zzay().zzd().zzb("Invalid conditional user property name", this.zzs.zzj().zzf(string));
            return;
        }
        if (this.zzs.zzv().zzd(string, obj) != 0) {
            this.zzs.zzay().zzd().zzc("Invalid conditional user property value", this.zzs.zzj().zzf(string), obj);
            return;
        }
        Object zzB = this.zzs.zzv().zzB(string, obj);
        if (zzB == null) {
            this.zzs.zzay().zzd().zzc("Unable to normalize conditional user property value", this.zzs.zzj().zzf(string), obj);
            return;
        }
        zzgr.zzb(bundle2, zzB);
        long j11 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
        if (!TextUtils.isEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME))) {
            this.zzs.zzf();
            if (j11 > 15552000000L || j11 < 1) {
                this.zzs.zzay().zzd().zzc("Invalid conditional user property timeout", this.zzs.zzj().zzf(string), Long.valueOf(j11));
                return;
            }
        }
        long j12 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
        this.zzs.zzf();
        if (j12 > 15552000000L || j12 < 1) {
            this.zzs.zzay().zzd().zzc("Invalid conditional user property time to live", this.zzs.zzj().zzf(string), Long.valueOf(j12));
        } else {
            this.zzs.zzaz().zzp(new zzhj(this, bundle2));
        }
    }

    public final void zzR(Bundle bundle, int i, long j10) {
        zza();
        String zzh = zzag.zzh(bundle);
        if (zzh != null) {
            this.zzs.zzay().zzl().zzb("Ignoring invalid consent setting", zzh);
            this.zzs.zzay().zzl().zza("Valid consent values are 'granted', 'denied'");
        }
        zzS(zzag.zza(bundle), i, j10);
    }

    public final void zzS(zzag zzagVar, int i, long j10) {
        boolean z10;
        zzag zzagVar2;
        boolean z11;
        boolean z12;
        zza();
        if (i != -10 && zzagVar.zze() == null && zzagVar.zzf() == null) {
            this.zzs.zzay().zzl().zza("Discarding empty consent settings");
            return;
        }
        synchronized (this.zzh) {
            try {
                z10 = false;
                if (zzag.zzl(i, this.zzj)) {
                    z12 = zzagVar.zzm(this.zzi);
                    if (zzagVar.zzk() && !this.zzi.zzk()) {
                        z10 = true;
                    }
                    zzag zzd = zzagVar.zzd(this.zzi);
                    this.zzi = zzd;
                    this.zzj = i;
                    zzagVar2 = zzd;
                    z11 = z10;
                    z10 = true;
                } else {
                    zzagVar2 = zzagVar;
                    z11 = false;
                    z12 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z10) {
            this.zzs.zzay().zzi().zzb("Ignoring lower-priority consent settings, proposed settings", zzagVar2);
            return;
        }
        long andIncrement = this.zzk.getAndIncrement();
        if (z12) {
            this.zzg.set(null);
            this.zzs.zzaz().zzq(new zzhu(this, zzagVar2, j10, i, andIncrement, z11));
        } else if (i == 30 || i == -10) {
            this.zzs.zzaz().zzq(new zzhv(this, zzagVar2, i, andIncrement, z11));
        } else {
            this.zzs.zzaz().zzp(new zzhw(this, zzagVar2, i, andIncrement, z11));
        }
    }

    public final void zzT(final Bundle bundle, final long j10) {
        zznx.zzc();
        if (this.zzs.zzf().zzs(null, zzdy.zzas)) {
            this.zzs.zzaz().zzq(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhb
                @Override // java.lang.Runnable
                public final void run() {
                    zzia.this.zzB(bundle, j10);
                }
            });
        } else {
            zzB(bundle, j10);
        }
    }

    public final void zzU(zzgv zzgvVar) {
        zzgv zzgvVar2;
        zzg();
        zza();
        if (zzgvVar != null && zzgvVar != (zzgvVar2 = this.zzd)) {
            Preconditions.checkState(zzgvVar2 == null, "EventInterceptor already set.");
        }
        this.zzd = zzgvVar;
    }

    public final void zzV(Boolean bool) {
        zza();
        this.zzs.zzaz().zzp(new zzht(this, bool));
    }

    public final void zzW(zzag zzagVar) {
        zzg();
        boolean z10 = (zzagVar.zzk() && zzagVar.zzj()) || this.zzs.zzt().zzM();
        if (z10 != this.zzs.zzK()) {
            this.zzs.zzG(z10);
            zzfa zzm = this.zzs.zzm();
            zzfv zzfvVar = zzm.zzs;
            zzm.zzg();
            Boolean valueOf = zzm.zza().contains("measurement_enabled_from_api") ? Boolean.valueOf(zzm.zza().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z10 || valueOf == null || valueOf.booleanValue()) {
                zzac(Boolean.valueOf(z10), false);
            }
        }
    }

    public final void zzX(String str, String str2, Object obj, boolean z10) {
        zzY(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ldl", obj, true, this.zzs.zzav().currentTimeMillis());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzY(java.lang.String r18, java.lang.String r19, java.lang.Object r20, boolean r21, long r22) {
        /*
            r17 = this;
            r6 = r17
            r2 = r19
            r0 = r20
            if (r18 != 0) goto Lb
            java.lang.String r1 = "app"
            goto Ld
        Lb:
            r1 = r18
        Ld:
            r3 = 0
            r4 = 24
            if (r21 == 0) goto L1e
            com.google.android.gms.measurement.internal.zzfv r5 = r6.zzs
            com.google.android.gms.measurement.internal.zzkz r5 = r5.zzv()
            int r5 = r5.zzl(r2)
        L1c:
            r13 = r5
            goto L48
        L1e:
            com.google.android.gms.measurement.internal.zzfv r5 = r6.zzs
            com.google.android.gms.measurement.internal.zzkz r5 = r5.zzv()
            java.lang.String r7 = "user property"
            boolean r8 = r5.zzab(r7, r2)
            r9 = 6
            if (r8 != 0) goto L2f
        L2d:
            r13 = r9
            goto L48
        L2f:
            java.lang.String[] r8 = com.google.android.gms.measurement.internal.zzgu.zza
            r10 = 0
            boolean r8 = r5.zzY(r7, r8, r10, r2)
            if (r8 != 0) goto L3b
            r5 = 15
            goto L1c
        L3b:
            com.google.android.gms.measurement.internal.zzfv r8 = r5.zzs
            r8.zzf()
            boolean r5 = r5.zzX(r7, r4, r2)
            if (r5 != 0) goto L47
            goto L2d
        L47:
            r13 = r3
        L48:
            r5 = 1
            if (r13 == 0) goto L71
            com.google.android.gms.measurement.internal.zzfv r0 = r6.zzs
            com.google.android.gms.measurement.internal.zzkz r0 = r0.zzv()
            com.google.android.gms.measurement.internal.zzfv r1 = r6.zzs
            r1.zzf()
            java.lang.String r15 = r0.zzC(r2, r4, r5)
            if (r2 == 0) goto L60
            int r3 = r19.length()
        L60:
            r16 = r3
            com.google.android.gms.measurement.internal.zzfv r0 = r6.zzs
            com.google.android.gms.measurement.internal.zzkz r10 = r0.zzv()
            com.google.android.gms.measurement.internal.zzky r11 = r6.zzn
            r12 = 0
            java.lang.String r14 = "_ev"
            r10.zzM(r11, r12, r13, r14, r15, r16)
            return
        L71:
            if (r0 == 0) goto Lc7
            com.google.android.gms.measurement.internal.zzfv r7 = r6.zzs
            com.google.android.gms.measurement.internal.zzkz r7 = r7.zzv()
            int r11 = r7.zzd(r2, r0)
            if (r11 == 0) goto Lb1
            com.google.android.gms.measurement.internal.zzfv r1 = r6.zzs
            com.google.android.gms.measurement.internal.zzkz r1 = r1.zzv()
            com.google.android.gms.measurement.internal.zzfv r7 = r6.zzs
            r7.zzf()
            java.lang.String r13 = r1.zzC(r2, r4, r5)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 != 0) goto L99
            boolean r1 = r0 instanceof java.lang.CharSequence
            if (r1 == 0) goto L97
            goto L99
        L97:
            r14 = r3
            goto La2
        L99:
            java.lang.String r0 = r20.toString()
            int r3 = r0.length()
            goto L97
        La2:
            com.google.android.gms.measurement.internal.zzfv r0 = r6.zzs
            com.google.android.gms.measurement.internal.zzkz r8 = r0.zzv()
            com.google.android.gms.measurement.internal.zzky r9 = r6.zzn
            r10 = 0
            java.lang.String r12 = "_ev"
            r8.zzM(r9, r10, r11, r12, r13, r14)
            return
        Lb1:
            com.google.android.gms.measurement.internal.zzfv r3 = r6.zzs
            com.google.android.gms.measurement.internal.zzkz r3 = r3.zzv()
            java.lang.Object r5 = r3.zzB(r2, r0)
            if (r5 == 0) goto Lc6
            r0 = r17
            r2 = r19
            r3 = r22
            r0.zzN(r1, r2, r3, r5)
        Lc6:
            return
        Lc7:
            r5 = 0
            r0 = r17
            r2 = r19
            r3 = r22
            r0.zzN(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzia.zzY(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzZ(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10)
            r8.zzg()
            r8.zza()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L61
            boolean r0 = r11 instanceof java.lang.String
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L50
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L50
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            java.lang.String r11 = "false"
            boolean r10 = r11.equals(r10)
            r2 = 1
            r0 = 1
            if (r0 == r10) goto L37
            r4 = 0
            goto L38
        L37:
            r4 = r2
        L38:
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            com.google.android.gms.measurement.internal.zzfv r0 = r8.zzs
            com.google.android.gms.measurement.internal.zzfa r0 = r0.zzm()
            com.google.android.gms.measurement.internal.zzez r0 = r0.zzh
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L4a
            java.lang.String r11 = "true"
        L4a:
            r0.zzb(r11)
            r6 = r10
        L4e:
            r3 = r1
            goto L63
        L50:
            if (r11 != 0) goto L61
            com.google.android.gms.measurement.internal.zzfv r10 = r8.zzs
            com.google.android.gms.measurement.internal.zzfa r10 = r10.zzm()
            com.google.android.gms.measurement.internal.zzez r10 = r10.zzh
            java.lang.String r0 = "unset"
            r10.zzb(r0)
            r6 = r11
            goto L4e
        L61:
            r3 = r10
            r6 = r11
        L63:
            com.google.android.gms.measurement.internal.zzfv r10 = r8.zzs
            boolean r10 = r10.zzJ()
            if (r10 != 0) goto L73
            com.google.android.gms.measurement.internal.zzfv r9 = r8.zzs
            java.lang.String r10 = "User property not set since app measurement is disabled"
            com.google.android.gms.measurement.internal.a.q(r9, r10)
            return
        L73:
            com.google.android.gms.measurement.internal.zzfv r10 = r8.zzs
            boolean r10 = r10.zzM()
            if (r10 != 0) goto L7c
            return
        L7c:
            com.google.android.gms.measurement.internal.zzkv r10 = new com.google.android.gms.measurement.internal.zzkv
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.zzfv r9 = r8.zzs
            com.google.android.gms.measurement.internal.zzjo r9 = r9.zzt()
            r9.zzK(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzia.zzZ(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void zzaa(zzgw zzgwVar) {
        zza();
        Preconditions.checkNotNull(zzgwVar);
        if (this.zze.remove(zzgwVar)) {
            return;
        }
        androidx.camera.core.impl.utils.a.y(this.zzs, "OnEventListener had not been registered");
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return false;
    }

    public final int zzh(String str) {
        Preconditions.checkNotEmpty(str);
        this.zzs.zzf();
        return 25;
    }

    public final Boolean zzi() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.zzs.zzaz().zzd(atomicReference, 15000L, "boolean test flag value", new zzhl(this, atomicReference));
    }

    public final Double zzj() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.zzs.zzaz().zzd(atomicReference, 15000L, "double test flag value", new zzhs(this, atomicReference));
    }

    public final Integer zzl() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.zzs.zzaz().zzd(atomicReference, 15000L, "int test flag value", new zzhr(this, atomicReference));
    }

    public final Long zzm() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.zzs.zzaz().zzd(atomicReference, 15000L, "long test flag value", new zzhq(this, atomicReference));
    }

    public final String zzo() {
        return this.zzg.get();
    }

    public final String zzp() {
        zzih zzi = this.zzs.zzs().zzi();
        if (zzi != null) {
            return zzi.zzb;
        }
        return null;
    }

    public final String zzq() {
        zzih zzi = this.zzs.zzs().zzi();
        if (zzi != null) {
            return zzi.zza;
        }
        return null;
    }

    public final String zzr() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.zzs.zzaz().zzd(atomicReference, 15000L, "String test flag value", new zzhp(this, atomicReference));
    }

    public final ArrayList<Bundle> zzs(String str, String str2) {
        if (this.zzs.zzaz().zzs()) {
            this.zzs.zzay().zzd().zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        }
        this.zzs.zzaw();
        if (zzaa.zza()) {
            this.zzs.zzay().zzd().zza("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzs.zzaz().zzd(atomicReference, 5000L, "get conditional user properties", new zzhm(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return zzkz.zzG(list);
        }
        this.zzs.zzay().zzd().zzb("Timed out waiting for get conditional user properties", null);
        return new ArrayList<>();
    }

    public final List<zzkv> zzt(boolean z10) {
        zza();
        a.q(this.zzs, "Getting user properties (FE)");
        if (this.zzs.zzaz().zzs()) {
            this.zzs.zzay().zzd().zza("Cannot get all user properties from analytics worker thread");
            return Collections.emptyList();
        }
        this.zzs.zzaw();
        if (zzaa.zza()) {
            this.zzs.zzay().zzd().zza("Cannot get all user properties from main thread");
            return Collections.emptyList();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzs.zzaz().zzd(atomicReference, 5000L, "get user properties", new zzhh(this, atomicReference, z10));
        List<zzkv> list = (List) atomicReference.get();
        if (list != null) {
            return list;
        }
        this.zzs.zzay().zzd().zzb("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z10));
        return Collections.emptyList();
    }

    public final Map<String, Object> zzu(String str, String str2, boolean z10) {
        if (this.zzs.zzaz().zzs()) {
            this.zzs.zzay().zzd().zza("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        this.zzs.zzaw();
        if (zzaa.zza()) {
            this.zzs.zzay().zzd().zza("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzs.zzaz().zzd(atomicReference, 5000L, "get user properties", new zzhn(this, atomicReference, null, str, str2, z10));
        List<zzkv> list = (List) atomicReference.get();
        if (list == null) {
            this.zzs.zzay().zzd().zzb("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z10));
            return Collections.emptyMap();
        }
        androidx.collection.a aVar = new androidx.collection.a(list.size());
        for (zzkv zzkvVar : list) {
            Object zza = zzkvVar.zza();
            if (zza != null) {
                aVar.put(zzkvVar.zzb, zza);
            }
        }
        return aVar;
    }

    public final void zzy() {
        zzg();
        zza();
        if (this.zzs.zzM()) {
            if (this.zzs.zzf().zzs(null, zzdy.zzZ)) {
                zzaf zzf = this.zzs.zzf();
                zzf.zzs.zzaw();
                Boolean zzk = zzf.zzk("google_analytics_deferred_deep_link_enabled");
                if (zzk != null && zzk.booleanValue()) {
                    this.zzs.zzay().zzc().zza("Deferred Deep Link feature enabled.");
                    this.zzs.zzaz().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzgz
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzia zziaVar = zzia.this;
                            zziaVar.zzg();
                            if (zziaVar.zzs.zzm().zzm.zzb()) {
                                zziaVar.zzs.zzay().zzc().zza("Deferred Deep Link already retrieved. Not fetching again.");
                                return;
                            }
                            long zza = zziaVar.zzs.zzm().zzn.zza();
                            zziaVar.zzs.zzm().zzn.zzb(1 + zza);
                            zziaVar.zzs.zzf();
                            if (zza < 5) {
                                zziaVar.zzs.zzE();
                            } else {
                                androidx.camera.core.impl.utils.a.y(zziaVar.zzs, "Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                zziaVar.zzs.zzm().zzm.zza(true);
                            }
                        }
                    });
                }
            }
            this.zzs.zzt().zzq();
            this.zzc = false;
            zzfa zzm = this.zzs.zzm();
            zzm.zzg();
            String string = zzm.zza().getString("previous_os_version", null);
            zzm.zzs.zzg().zzu();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = zzm.zza().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.zzs.zzg().zzu();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            zzG(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ou", bundle);
        }
    }

    public final void zzz(String str, String str2, Bundle bundle) {
        long currentTimeMillis = this.zzs.zzav().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, currentTimeMillis);
        if (str2 != null) {
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str2);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        this.zzs.zzaz().zzp(new zzhk(this, bundle2));
    }
}

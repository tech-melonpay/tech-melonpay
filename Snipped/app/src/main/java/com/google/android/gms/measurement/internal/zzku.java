package com.google.android.gms.measurement.internal;

import C.v;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.zzlb;
import com.google.android.gms.internal.measurement.zzpe;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.sumsub.sns.internal.core.data.model.p;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* loaded from: classes.dex */
public final class zzku extends zzki {
    public zzku(zzks zzksVar) {
        super(zzksVar);
    }

    public static final void zzA(com.google.android.gms.internal.measurement.zzfn zzfnVar, String str, Object obj) {
        List<com.google.android.gms.internal.measurement.zzfs> zzp = zzfnVar.zzp();
        int i = 0;
        while (true) {
            if (i >= zzp.size()) {
                i = -1;
                break;
            } else if (str.equals(zzp.get(i).zzg())) {
                break;
            } else {
                i++;
            }
        }
        com.google.android.gms.internal.measurement.zzfr zze = com.google.android.gms.internal.measurement.zzfs.zze();
        zze.zzj(str);
        if (obj instanceof Long) {
            zze.zzi(((Long) obj).longValue());
        } else if (obj instanceof String) {
            zze.zzk((String) obj);
        } else if (obj instanceof Double) {
            zze.zzh(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            zze.zzb(zzq((Bundle[]) obj));
        }
        if (i >= 0) {
            zzfnVar.zzj(i, zze);
        } else {
            zzfnVar.zze(zze);
        }
    }

    public static final boolean zzB(zzat zzatVar, zzp zzpVar) {
        Preconditions.checkNotNull(zzatVar);
        Preconditions.checkNotNull(zzpVar);
        return (TextUtils.isEmpty(zzpVar.zzb) && TextUtils.isEmpty(zzpVar.zzq)) ? false : true;
    }

    public static final com.google.android.gms.internal.measurement.zzfs zzC(com.google.android.gms.internal.measurement.zzfo zzfoVar, String str) {
        for (com.google.android.gms.internal.measurement.zzfs zzfsVar : zzfoVar.zzi()) {
            if (zzfsVar.zzg().equals(str)) {
                return zzfsVar;
            }
        }
        return null;
    }

    public static final Object zzD(com.google.android.gms.internal.measurement.zzfo zzfoVar, String str) {
        com.google.android.gms.internal.measurement.zzfs zzC = zzC(zzfoVar, str);
        if (zzC == null) {
            return null;
        }
        if (zzC.zzy()) {
            return zzC.zzh();
        }
        if (zzC.zzw()) {
            return Long.valueOf(zzC.zzd());
        }
        if (zzC.zzu()) {
            return Double.valueOf(zzC.zza());
        }
        if (zzC.zzc() <= 0) {
            return null;
        }
        List<com.google.android.gms.internal.measurement.zzfs> zzi = zzC.zzi();
        ArrayList arrayList = new ArrayList();
        for (com.google.android.gms.internal.measurement.zzfs zzfsVar : zzi) {
            if (zzfsVar != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.zzfs zzfsVar2 : zzfsVar.zzi()) {
                    if (zzfsVar2.zzy()) {
                        bundle.putString(zzfsVar2.zzg(), zzfsVar2.zzh());
                    } else if (zzfsVar2.zzw()) {
                        bundle.putLong(zzfsVar2.zzg(), zzfsVar2.zzd());
                    } else if (zzfsVar2.zzu()) {
                        bundle.putDouble(zzfsVar2.zzg(), zzfsVar2.zza());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    private final void zzE(StringBuilder sb2, int i, List<com.google.android.gms.internal.measurement.zzfs> list) {
        if (list == null) {
            return;
        }
        int i9 = i + 1;
        for (com.google.android.gms.internal.measurement.zzfs zzfsVar : list) {
            if (zzfsVar != null) {
                zzG(sb2, i9);
                sb2.append("param {\n");
                zzJ(sb2, i9, AppMeasurementSdk.ConditionalUserProperty.NAME, zzfsVar.zzx() ? this.zzs.zzj().zze(zzfsVar.zzg()) : null);
                zzJ(sb2, i9, "string_value", zzfsVar.zzy() ? zzfsVar.zzh() : null);
                zzJ(sb2, i9, "int_value", zzfsVar.zzw() ? Long.valueOf(zzfsVar.zzd()) : null);
                zzJ(sb2, i9, "double_value", zzfsVar.zzu() ? Double.valueOf(zzfsVar.zza()) : null);
                if (zzfsVar.zzc() > 0) {
                    zzE(sb2, i9, zzfsVar.zzi());
                }
                zzG(sb2, i9);
                sb2.append("}\n");
            }
        }
    }

    private final void zzF(StringBuilder sb2, int i, com.google.android.gms.internal.measurement.zzel zzelVar) {
        String str;
        if (zzelVar == null) {
            return;
        }
        zzG(sb2, i);
        sb2.append("filter {\n");
        if (zzelVar.zzh()) {
            zzJ(sb2, i, "complement", Boolean.valueOf(zzelVar.zzg()));
        }
        if (zzelVar.zzj()) {
            zzJ(sb2, i, "param_name", this.zzs.zzj().zze(zzelVar.zze()));
        }
        if (zzelVar.zzk()) {
            int i9 = i + 1;
            com.google.android.gms.internal.measurement.zzex zzd = zzelVar.zzd();
            if (zzd != null) {
                zzG(sb2, i9);
                sb2.append("string_filter {\n");
                if (zzd.zzi()) {
                    switch (zzd.zzj()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    zzJ(sb2, i9, "match_type", str);
                }
                if (zzd.zzh()) {
                    zzJ(sb2, i9, "expression", zzd.zzd());
                }
                if (zzd.zzg()) {
                    zzJ(sb2, i9, "case_sensitive", Boolean.valueOf(zzd.zzf()));
                }
                if (zzd.zza() > 0) {
                    zzG(sb2, i + 2);
                    sb2.append("expression_list {\n");
                    for (String str2 : zzd.zze()) {
                        zzG(sb2, i + 3);
                        sb2.append(str2);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                zzG(sb2, i9);
                sb2.append("}\n");
            }
        }
        if (zzelVar.zzi()) {
            zzK(sb2, i + 1, "number_filter", zzelVar.zzc());
        }
        zzG(sb2, i);
        sb2.append("}\n");
    }

    private static final void zzG(StringBuilder sb2, int i) {
        for (int i9 = 0; i9 < i; i9++) {
            sb2.append("  ");
        }
    }

    private static final String zzH(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("Dynamic ");
        }
        if (z11) {
            sb2.append("Sequence ");
        }
        if (z12) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    private static final void zzI(StringBuilder sb2, int i, String str, com.google.android.gms.internal.measurement.zzgd zzgdVar) {
        if (zzgdVar == null) {
            return;
        }
        zzG(sb2, 3);
        sb2.append(str);
        sb2.append(" {\n");
        if (zzgdVar.zzb() != 0) {
            zzG(sb2, 4);
            sb2.append("results: ");
            int i9 = 0;
            for (Long l10 : zzgdVar.zzk()) {
                int i10 = i9 + 1;
                if (i9 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l10);
                i9 = i10;
            }
            sb2.append('\n');
        }
        if (zzgdVar.zzd() != 0) {
            zzG(sb2, 4);
            sb2.append("status: ");
            int i11 = 0;
            for (Long l11 : zzgdVar.zzn()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i11 = i12;
            }
            sb2.append('\n');
        }
        if (zzgdVar.zza() != 0) {
            zzG(sb2, 4);
            sb2.append("dynamic_filter_timestamps: {");
            int i13 = 0;
            for (com.google.android.gms.internal.measurement.zzfm zzfmVar : zzgdVar.zzj()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb2.append(", ");
                }
                sb2.append(zzfmVar.zzh() ? Integer.valueOf(zzfmVar.zza()) : null);
                sb2.append(p.f15541a);
                sb2.append(zzfmVar.zzg() ? Long.valueOf(zzfmVar.zzb()) : null);
                i13 = i14;
            }
            sb2.append("}\n");
        }
        if (zzgdVar.zzc() != 0) {
            zzG(sb2, 4);
            sb2.append("sequence_filter_timestamps: {");
            int i15 = 0;
            for (com.google.android.gms.internal.measurement.zzgf zzgfVar : zzgdVar.zzm()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb2.append(", ");
                }
                sb2.append(zzgfVar.zzi() ? Integer.valueOf(zzgfVar.zzb()) : null);
                sb2.append(": [");
                Iterator<Long> it = zzgfVar.zzf().iterator();
                int i17 = 0;
                while (it.hasNext()) {
                    long longValue = it.next().longValue();
                    int i18 = i17 + 1;
                    if (i17 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(longValue);
                    i17 = i18;
                }
                sb2.append("]");
                i15 = i16;
            }
            sb2.append("}\n");
        }
        zzG(sb2, 3);
        sb2.append("}\n");
    }

    private static final void zzJ(StringBuilder sb2, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        zzG(sb2, i + 1);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    private static final void zzK(StringBuilder sb2, int i, String str, com.google.android.gms.internal.measurement.zzeq zzeqVar) {
        if (zzeqVar == null) {
            return;
        }
        zzG(sb2, i);
        sb2.append(str);
        sb2.append(" {\n");
        if (zzeqVar.zzg()) {
            int zzm = zzeqVar.zzm();
            zzJ(sb2, i, "comparison_type", zzm != 1 ? zzm != 2 ? zzm != 3 ? zzm != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (zzeqVar.zzi()) {
            zzJ(sb2, i, "match_as_float", Boolean.valueOf(zzeqVar.zzf()));
        }
        if (zzeqVar.zzh()) {
            zzJ(sb2, i, "comparison_value", zzeqVar.zzc());
        }
        if (zzeqVar.zzk()) {
            zzJ(sb2, i, "min_comparison_value", zzeqVar.zze());
        }
        if (zzeqVar.zzj()) {
            zzJ(sb2, i, "max_comparison_value", zzeqVar.zzd());
        }
        zzG(sb2, i);
        sb2.append("}\n");
    }

    public static int zza(com.google.android.gms.internal.measurement.zzfx zzfxVar, String str) {
        for (int i = 0; i < zzfxVar.zzb(); i++) {
            if (str.equals(zzfxVar.zzak(i).zzf())) {
                return i;
            }
        }
        return -1;
    }

    public static <Builder extends zzlb> Builder zzl(Builder builder, byte[] bArr) {
        com.google.android.gms.internal.measurement.zzjj zzb = com.google.android.gms.internal.measurement.zzjj.zzb();
        return zzb != null ? (Builder) builder.zzaw(bArr, zzb) : (Builder) builder.zzav(bArr);
    }

    public static List<com.google.android.gms.internal.measurement.zzfs> zzq(Bundle[] bundleArr) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : bundleArr) {
            if (bundle != null) {
                com.google.android.gms.internal.measurement.zzfr zze = com.google.android.gms.internal.measurement.zzfs.zze();
                for (String str : bundle.keySet()) {
                    com.google.android.gms.internal.measurement.zzfr zze2 = com.google.android.gms.internal.measurement.zzfs.zze();
                    zze2.zzj(str);
                    Object obj = bundle.get(str);
                    if (obj instanceof Long) {
                        zze2.zzi(((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        zze2.zzk((String) obj);
                    } else if (obj instanceof Double) {
                        zze2.zzh(((Double) obj).doubleValue());
                    }
                    zze.zzc(zze2);
                }
                if (zze.zza() > 0) {
                    arrayList.add(zze.zzaA());
                }
            }
        }
        return arrayList;
    }

    public static List<Long> zzs(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j10 = 0;
            for (int i9 = 0; i9 < 64; i9++) {
                int i10 = (i * 64) + i9;
                if (i10 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i10)) {
                    j10 |= 1 << i9;
                }
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    public static boolean zzw(List<Long> list, int i) {
        if (i < list.size() * 64) {
            return ((1 << (i % 64)) & list.get(i / 64).longValue()) != 0;
        }
        return false;
    }

    public static boolean zzy(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    @Override // com.google.android.gms.measurement.internal.zzki
    public final boolean zzb() {
        return false;
    }

    public final long zzd(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        this.zzs.zzv().zzg();
        MessageDigest zzE = zzkz.zzE();
        if (zzE != null) {
            return zzkz.zzp(zzE.digest(bArr));
        }
        androidx.camera.core.impl.utils.a.t(this.zzs, "Failed to get MD5");
        return 0L;
    }

    public final Bundle zzf(Map<String, Object> map, boolean z10) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z10) {
                zzpe.zzc();
                if (this.zzs.zzf().zzs(null, zzdy.zzau)) {
                    ArrayList arrayList = (ArrayList) obj;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        arrayList2.add(zzf((Map) arrayList.get(i), false));
                    }
                    bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                } else {
                    ArrayList arrayList3 = (ArrayList) obj;
                    ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
                    int size2 = arrayList3.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        arrayList4.add(zzf((Map) arrayList3.get(i9), false));
                    }
                    bundle.putParcelableArrayList(str, arrayList4);
                }
            }
        }
        return bundle;
    }

    public final <T extends Parcelable> T zzh(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return creator.createFromParcel(obtain);
        } catch (SafeParcelReader.ParseException unused) {
            this.zzs.zzay().zzd().zza("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    public final zzat zzi(com.google.android.gms.internal.measurement.zzaa zzaaVar) {
        Object obj;
        Bundle zzf = zzf(zzaaVar.zze(), true);
        String obj2 = (!zzf.containsKey("_o") || (obj = zzf.get("_o")) == null) ? com.sumsub.sentry.a.f13540h : obj.toString();
        String zzb = zzgs.zzb(zzaaVar.zzd());
        if (zzb == null) {
            zzb = zzaaVar.zzd();
        }
        return new zzat(zzb, new zzar(zzf), obj2, zzaaVar.zza());
    }

    public final com.google.android.gms.internal.measurement.zzfo zzj(zzao zzaoVar) {
        com.google.android.gms.internal.measurement.zzfn zze = com.google.android.gms.internal.measurement.zzfo.zze();
        zze.zzl(zzaoVar.zze);
        zzaq zzaqVar = new zzaq(zzaoVar.zzf);
        while (zzaqVar.hasNext()) {
            String next = zzaqVar.next();
            com.google.android.gms.internal.measurement.zzfr zze2 = com.google.android.gms.internal.measurement.zzfs.zze();
            zze2.zzj(next);
            Object zzf = zzaoVar.zzf.zzf(next);
            Preconditions.checkNotNull(zzf);
            zzu(zze2, zzf);
            zze.zze(zze2);
        }
        return zze.zzaA();
    }

    public final String zzm(com.google.android.gms.internal.measurement.zzfw zzfwVar) {
        if (zzfwVar == null) {
            return "";
        }
        StringBuilder s10 = v.s("\nbatch {\n");
        for (com.google.android.gms.internal.measurement.zzfy zzfyVar : zzfwVar.zzd()) {
            if (zzfyVar != null) {
                zzG(s10, 1);
                s10.append("bundle {\n");
                if (zzfyVar.zzbh()) {
                    zzJ(s10, 1, "protocol_version", Integer.valueOf(zzfyVar.zzd()));
                }
                zzJ(s10, 1, "platform", zzfyVar.zzK());
                if (zzfyVar.zzbd()) {
                    zzJ(s10, 1, "gmp_version", Long.valueOf(zzfyVar.zzn()));
                }
                if (zzfyVar.zzbn()) {
                    zzJ(s10, 1, "uploading_gmp_version", Long.valueOf(zzfyVar.zzs()));
                }
                if (zzfyVar.zzbb()) {
                    zzJ(s10, 1, "dynamite_version", Long.valueOf(zzfyVar.zzk()));
                }
                if (zzfyVar.zzaY()) {
                    zzJ(s10, 1, "config_version", Long.valueOf(zzfyVar.zzi()));
                }
                zzJ(s10, 1, "gmp_app_id", zzfyVar.zzH());
                zzJ(s10, 1, "admob_app_id", zzfyVar.zzx());
                zzJ(s10, 1, "app_id", zzfyVar.zzy());
                zzJ(s10, 1, "app_version", zzfyVar.zzB());
                if (zzfyVar.zzaW()) {
                    zzJ(s10, 1, "app_version_major", Integer.valueOf(zzfyVar.zza()));
                }
                zzJ(s10, 1, "firebase_instance_id", zzfyVar.zzF());
                if (zzfyVar.zzba()) {
                    zzJ(s10, 1, "dev_cert_hash", Long.valueOf(zzfyVar.zzj()));
                }
                zzJ(s10, 1, "app_store", zzfyVar.zzA());
                if (zzfyVar.zzbm()) {
                    zzJ(s10, 1, "upload_timestamp_millis", Long.valueOf(zzfyVar.zzr()));
                }
                if (zzfyVar.zzbk()) {
                    zzJ(s10, 1, "start_timestamp_millis", Long.valueOf(zzfyVar.zzq()));
                }
                if (zzfyVar.zzbc()) {
                    zzJ(s10, 1, "end_timestamp_millis", Long.valueOf(zzfyVar.zzm()));
                }
                if (zzfyVar.zzbg()) {
                    zzJ(s10, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzfyVar.zzp()));
                }
                if (zzfyVar.zzbf()) {
                    zzJ(s10, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzfyVar.zzo()));
                }
                zzJ(s10, 1, "app_instance_id", zzfyVar.zzz());
                zzJ(s10, 1, "resettable_device_id", zzfyVar.zzL());
                zzJ(s10, 1, "ds_id", zzfyVar.zzE());
                if (zzfyVar.zzbe()) {
                    zzJ(s10, 1, "limited_ad_tracking", Boolean.valueOf(zzfyVar.zzaT()));
                }
                zzJ(s10, 1, "os_version", zzfyVar.zzJ());
                zzJ(s10, 1, "device_model", zzfyVar.zzD());
                zzJ(s10, 1, "user_default_language", zzfyVar.zzM());
                if (zzfyVar.zzbl()) {
                    zzJ(s10, 1, "time_zone_offset_minutes", Integer.valueOf(zzfyVar.zzf()));
                }
                if (zzfyVar.zzaX()) {
                    zzJ(s10, 1, "bundle_sequential_index", Integer.valueOf(zzfyVar.zzb()));
                }
                if (zzfyVar.zzbj()) {
                    zzJ(s10, 1, "service_upload", Boolean.valueOf(zzfyVar.zzaU()));
                }
                zzJ(s10, 1, "health_monitor", zzfyVar.zzI());
                if (!this.zzs.zzf().zzs(null, zzdy.zzam) && zzfyVar.zzaV() && zzfyVar.zzh() != 0) {
                    zzJ(s10, 1, "android_id", Long.valueOf(zzfyVar.zzh()));
                }
                if (zzfyVar.zzbi()) {
                    zzJ(s10, 1, "retry_counter", Integer.valueOf(zzfyVar.zze()));
                }
                if (zzfyVar.zzaZ()) {
                    zzJ(s10, 1, "consent_signals", zzfyVar.zzC());
                }
                List<com.google.android.gms.internal.measurement.zzgh> zzP = zzfyVar.zzP();
                if (zzP != null) {
                    for (com.google.android.gms.internal.measurement.zzgh zzghVar : zzP) {
                        if (zzghVar != null) {
                            zzG(s10, 2);
                            s10.append("user_property {\n");
                            zzJ(s10, 2, "set_timestamp_millis", zzghVar.zzs() ? Long.valueOf(zzghVar.zzc()) : null);
                            zzJ(s10, 2, AppMeasurementSdk.ConditionalUserProperty.NAME, this.zzs.zzj().zzf(zzghVar.zzf()));
                            zzJ(s10, 2, "string_value", zzghVar.zzg());
                            zzJ(s10, 2, "int_value", zzghVar.zzr() ? Long.valueOf(zzghVar.zzb()) : null);
                            zzJ(s10, 2, "double_value", zzghVar.zzq() ? Double.valueOf(zzghVar.zza()) : null);
                            zzG(s10, 2);
                            s10.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.zzfk> zzN = zzfyVar.zzN();
                if (zzN != null) {
                    for (com.google.android.gms.internal.measurement.zzfk zzfkVar : zzN) {
                        if (zzfkVar != null) {
                            zzG(s10, 2);
                            s10.append("audience_membership {\n");
                            if (zzfkVar.zzk()) {
                                zzJ(s10, 2, "audience_id", Integer.valueOf(zzfkVar.zza()));
                            }
                            if (zzfkVar.zzm()) {
                                zzJ(s10, 2, "new_audience", Boolean.valueOf(zzfkVar.zzj()));
                            }
                            zzI(s10, 2, "current_data", zzfkVar.zzd());
                            if (zzfkVar.zzn()) {
                                zzI(s10, 2, "previous_data", zzfkVar.zze());
                            }
                            zzG(s10, 2);
                            s10.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.zzfo> zzO = zzfyVar.zzO();
                if (zzO != null) {
                    for (com.google.android.gms.internal.measurement.zzfo zzfoVar : zzO) {
                        if (zzfoVar != null) {
                            zzG(s10, 2);
                            s10.append("event {\n");
                            zzJ(s10, 2, AppMeasurementSdk.ConditionalUserProperty.NAME, this.zzs.zzj().zzd(zzfoVar.zzh()));
                            if (zzfoVar.zzu()) {
                                zzJ(s10, 2, "timestamp_millis", Long.valueOf(zzfoVar.zzd()));
                            }
                            if (zzfoVar.zzt()) {
                                zzJ(s10, 2, "previous_timestamp_millis", Long.valueOf(zzfoVar.zzc()));
                            }
                            if (zzfoVar.zzs()) {
                                zzJ(s10, 2, "count", Integer.valueOf(zzfoVar.zza()));
                            }
                            if (zzfoVar.zzb() != 0) {
                                zzE(s10, 2, zzfoVar.zzi());
                            }
                            zzG(s10, 2);
                            s10.append("}\n");
                        }
                    }
                }
                zzG(s10, 1);
                s10.append("}\n");
            }
        }
        s10.append("}\n");
        return s10.toString();
    }

    public final String zzo(com.google.android.gms.internal.measurement.zzej zzejVar) {
        if (zzejVar == null) {
            return "null";
        }
        StringBuilder s10 = v.s("\nevent_filter {\n");
        if (zzejVar.zzp()) {
            zzJ(s10, 0, "filter_id", Integer.valueOf(zzejVar.zzb()));
        }
        zzJ(s10, 0, "event_name", this.zzs.zzj().zzd(zzejVar.zzg()));
        String zzH = zzH(zzejVar.zzk(), zzejVar.zzm(), zzejVar.zzn());
        if (!zzH.isEmpty()) {
            zzJ(s10, 0, "filter_type", zzH);
        }
        if (zzejVar.zzo()) {
            zzK(s10, 1, "event_count_filter", zzejVar.zzf());
        }
        if (zzejVar.zza() > 0) {
            s10.append("  filters {\n");
            Iterator<com.google.android.gms.internal.measurement.zzel> it = zzejVar.zzh().iterator();
            while (it.hasNext()) {
                zzF(s10, 2, it.next());
            }
        }
        zzG(s10, 1);
        s10.append("}\n}\n");
        return s10.toString();
    }

    public final String zzp(com.google.android.gms.internal.measurement.zzes zzesVar) {
        if (zzesVar == null) {
            return "null";
        }
        StringBuilder s10 = v.s("\nproperty_filter {\n");
        if (zzesVar.zzj()) {
            zzJ(s10, 0, "filter_id", Integer.valueOf(zzesVar.zza()));
        }
        zzJ(s10, 0, "property_name", this.zzs.zzj().zzf(zzesVar.zze()));
        String zzH = zzH(zzesVar.zzg(), zzesVar.zzh(), zzesVar.zzi());
        if (!zzH.isEmpty()) {
            zzJ(s10, 0, "filter_type", zzH);
        }
        zzF(s10, 1, zzesVar.zzb());
        s10.append("}\n");
        return s10.toString();
    }

    public final List<Long> zzr(List<Long> list, List<Integer> list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                this.zzs.zzay().zzk().zzb("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.zzs.zzay().zzk().zzc("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i9 = size2;
            i = size;
            size = i9;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        r4 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if ((r3 instanceof android.os.Parcelable[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        r3 = (android.os.Parcelable[]) r3;
        r5 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (r7 >= r5) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        r4.add(zzt((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a1, code lost:
    
        r0.put(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        if ((r3 instanceof java.util.ArrayList) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        r3 = (java.util.ArrayList) r3;
        r5 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
    
        if (r7 >= r5) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
    
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0086, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0088, code lost:
    
        r4.add(zzt((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0091, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0096, code lost:
    
        if ((r3 instanceof android.os.Bundle) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0098, code lost:
    
        r4.add(zzt((android.os.Bundle) r3, false));
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x000d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.String, java.lang.Object> zzt(android.os.Bundle r11, boolean r12) {
        /*
            r10 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La6
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r11.get(r2)
            com.google.android.gms.internal.measurement.zzpe.zzc()
            com.google.android.gms.measurement.internal.zzfv r4 = r10.zzs
            com.google.android.gms.measurement.internal.zzaf r4 = r4.zzf()
            r5 = 0
            com.google.android.gms.measurement.internal.zzdx<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.zzdy.zzau
            boolean r4 = r4.zzs(r5, r6)
            if (r4 == 0) goto L3c
            boolean r4 = r3 instanceof android.os.Parcelable[]
            if (r4 != 0) goto L4f
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 != 0) goto L4f
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L49
            goto L4f
        L3c:
            boolean r4 = r3 instanceof android.os.Bundle[]
            if (r4 != 0) goto L4f
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 != 0) goto L4f
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L49
            goto L4f
        L49:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L4f:
            if (r12 == 0) goto Ld
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean r5 = r3 instanceof android.os.Parcelable[]
            r6 = 0
            if (r5 == 0) goto L73
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r5 = r3.length
            r7 = r6
        L5f:
            if (r7 >= r5) goto La1
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L70
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.zzt(r8, r6)
            r4.add(r8)
        L70:
            int r7 = r7 + 1
            goto L5f
        L73:
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 == 0) goto L94
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r5 = r3.size()
            r7 = r6
        L7e:
            if (r7 >= r5) goto La1
            java.lang.Object r8 = r3.get(r7)
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L91
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.zzt(r8, r6)
            r4.add(r8)
        L91:
            int r7 = r7 + 1
            goto L7e
        L94:
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto La1
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.Map r3 = r10.zzt(r3, r6)
            r4.add(r3)
        La1:
            r0.put(r2, r4)
            goto Ld
        La6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzku.zzt(android.os.Bundle, boolean):java.util.Map");
    }

    public final void zzu(com.google.android.gms.internal.measurement.zzfr zzfrVar, Object obj) {
        Preconditions.checkNotNull(obj);
        zzfrVar.zzg();
        zzfrVar.zze();
        zzfrVar.zzd();
        zzfrVar.zzf();
        if (obj instanceof String) {
            zzfrVar.zzk((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzfrVar.zzi(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            zzfrVar.zzh(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            zzfrVar.zzb(zzq((Bundle[]) obj));
        } else {
            this.zzs.zzay().zzd().zzb("Ignoring invalid (type) event param value", obj);
        }
    }

    public final void zzv(com.google.android.gms.internal.measurement.zzgg zzggVar, Object obj) {
        Preconditions.checkNotNull(obj);
        zzggVar.zzc();
        zzggVar.zzb();
        zzggVar.zza();
        if (obj instanceof String) {
            zzggVar.zzh((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzggVar.zze(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzggVar.zzd(((Double) obj).doubleValue());
        } else {
            this.zzs.zzay().zzd().zzb("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final boolean zzx(long j10, long j11) {
        return j10 == 0 || j11 <= 0 || Math.abs(this.zzs.zzav().currentTimeMillis() - j10) > j11;
    }

    public final byte[] zzz(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            this.zzs.zzay().zzd().zzb("Failed to gzip content", e10);
            throw e10;
        }
    }
}

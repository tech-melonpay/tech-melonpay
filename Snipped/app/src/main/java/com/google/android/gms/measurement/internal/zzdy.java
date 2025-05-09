package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzmt;
import com.google.android.gms.internal.measurement.zzmw;
import com.google.android.gms.internal.measurement.zzmz;
import com.google.android.gms.internal.measurement.zznc;
import com.google.android.gms.internal.measurement.zznf;
import com.google.android.gms.internal.measurement.zzni;
import com.google.android.gms.internal.measurement.zznl;
import com.google.android.gms.internal.measurement.zzno;
import com.google.android.gms.internal.measurement.zznr;
import com.google.android.gms.internal.measurement.zznu;
import com.google.android.gms.internal.measurement.zznx;
import com.google.android.gms.internal.measurement.zzoa;
import com.google.android.gms.internal.measurement.zzod;
import com.google.android.gms.internal.measurement.zzog;
import com.google.android.gms.internal.measurement.zzoj;
import com.google.android.gms.internal.measurement.zzom;
import com.google.android.gms.internal.measurement.zzop;
import com.google.android.gms.internal.measurement.zzos;
import com.google.android.gms.internal.measurement.zzov;
import com.google.android.gms.internal.measurement.zzoy;
import com.google.android.gms.internal.measurement.zzpb;
import com.google.android.gms.internal.measurement.zzpe;
import com.google.android.gms.internal.measurement.zzph;
import com.google.android.gms.internal.measurement.zzpk;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.internal.measurement.zzpq;
import com.google.android.gms.internal.measurement.zzpt;
import com.google.android.gms.internal.measurement.zzpw;
import com.google.android.gms.internal.measurement.zzpz;
import com.google.firebase.messaging.ServiceStarter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.test.TestBuildersKt;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzdy {
    public static final zzdx<Long> zzA;
    public static final zzdx<Integer> zzB;
    public static final zzdx<Long> zzC;
    public static final zzdx<Integer> zzD;
    public static final zzdx<Integer> zzE;
    public static final zzdx<Integer> zzF;
    public static final zzdx<Integer> zzG;
    public static final zzdx<Integer> zzH;
    public static final zzdx<Long> zzI;
    public static final zzdx<Boolean> zzJ;
    public static final zzdx<String> zzK;
    public static final zzdx<Long> zzL;
    public static final zzdx<Integer> zzM;
    public static final zzdx<Double> zzN;
    public static final zzdx<Integer> zzO;
    public static final zzdx<Integer> zzP;
    public static final zzdx<Long> zzQ;
    public static final zzdx<Boolean> zzR;
    public static final zzdx<Boolean> zzS;
    public static final zzdx<Boolean> zzT;
    public static final zzdx<Boolean> zzU;
    public static final zzdx<Boolean> zzV;
    public static final zzdx<Boolean> zzW;
    public static final zzdx<Boolean> zzX;
    public static final zzdx<Boolean> zzY;
    public static final zzdx<Boolean> zzZ;
    public static final zzdx<Boolean> zzaA;
    public static final zzdx<Boolean> zzaB;
    public static final zzdx<Boolean> zzaC;
    public static final zzdx<Boolean> zzaa;
    public static final zzdx<Boolean> zzab;
    public static final zzdx<Boolean> zzac;
    public static final zzdx<Boolean> zzad;
    public static final zzdx<Boolean> zzae;
    public static final zzdx<Boolean> zzaf;
    public static final zzdx<Boolean> zzag;
    public static final zzdx<Boolean> zzah;
    public static final zzdx<Boolean> zzai;
    public static final zzdx<Boolean> zzaj;
    public static final zzdx<Boolean> zzak;
    public static final zzdx<Boolean> zzal;
    public static final zzdx<Boolean> zzam;
    public static final zzdx<Integer> zzan;
    public static final zzdx<Boolean> zzao;
    public static final zzdx<Boolean> zzap;
    public static final zzdx<Boolean> zzaq;
    public static final zzdx<Boolean> zzar;
    public static final zzdx<Boolean> zzas;
    public static final zzdx<Boolean> zzat;
    public static final zzdx<Boolean> zzau;
    public static final zzdx<Boolean> zzav;
    public static final zzdx<Boolean> zzaw;
    public static final zzdx<Boolean> zzax;
    public static final zzdx<Boolean> zzay;
    public static final zzdx<Boolean> zzaz;
    public static final zzdx<Integer> zzm;
    public static final zzdx<Integer> zzn;
    public static final zzdx<Integer> zzo;
    public static final zzdx<String> zzp;
    public static final zzdx<Long> zzq;
    public static final zzdx<Long> zzr;
    public static final zzdx<Long> zzs;
    public static final zzdx<Long> zzt;
    public static final zzdx<Long> zzu;
    public static final zzdx<Long> zzv;
    public static final zzdx<Long> zzw;
    public static final zzdx<Long> zzx;
    public static final zzdx<Long> zzy;
    public static final zzdx<Long> zzz;
    private static final List<zzdx<?>> zzaD = Collections.synchronizedList(new ArrayList());
    private static final Set<zzdx<?>> zzaE = Collections.synchronizedSet(new HashSet());
    public static final zzdx<Long> zza = zza("measurement.ad_id_cache_time", 10000L, 10000L, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzav
        @Override // com.google.android.gms.measurement.internal.zzdu
        public final Object zza() {
            zzdx<Long> zzdxVar = zzdy.zza;
            return Long.valueOf(zznf.zzb());
        }
    });
    public static final zzdx<Long> zzb = zza("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzbg
        @Override // com.google.android.gms.measurement.internal.zzdu
        public final Object zza() {
            zzdx<Long> zzdxVar = zzdy.zza;
            return Long.valueOf(zznf.zzl());
        }
    });
    public static final zzdx<Long> zzc = zza("measurement.config.cache_time", 86400000L, 3600000L, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzay
        @Override // com.google.android.gms.measurement.internal.zzdu
        public final Object zza() {
            zzdx<Long> zzdxVar = zzdy.zza;
            return Long.valueOf(zznf.zzd());
        }
    });
    public static final zzdx<String> zzd = zza("measurement.config.url_scheme", "https", "https", new zzdu() { // from class: com.google.android.gms.measurement.internal.zzbk
        @Override // com.google.android.gms.measurement.internal.zzdu
        public final Object zza() {
            zzdx<Long> zzdxVar = zzdy.zza;
            return zznf.zzJ();
        }
    });
    public static final zzdx<String> zze = zza("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", new zzdu() { // from class: com.google.android.gms.measurement.internal.zzbw
        @Override // com.google.android.gms.measurement.internal.zzdu
        public final Object zza() {
            zzdx<Long> zzdxVar = zzdy.zza;
            return zznf.zzI();
        }
    });
    public static final zzdx<Integer> zzf = zza("measurement.upload.max_bundles", 100, 100, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzci
        @Override // com.google.android.gms.measurement.internal.zzdu
        public final Object zza() {
            zzdx<Long> zzdxVar = zzdy.zza;
            return Integer.valueOf((int) zznf.zzv());
        }
    });
    public static final zzdx<Integer> zzg = zza("measurement.upload.max_batch_size", 65536, 65536, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzcu
        @Override // com.google.android.gms.measurement.internal.zzdu
        public final Object zza() {
            zzdx<Long> zzdxVar = zzdy.zza;
            return Integer.valueOf((int) zznf.zzD());
        }
    });
    public static final zzdx<Integer> zzh = zza("measurement.upload.max_bundle_size", 65536, 65536, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzdg
        @Override // com.google.android.gms.measurement.internal.zzdu
        public final Object zza() {
            zzdx<Long> zzdxVar = zzdy.zza;
            return Integer.valueOf((int) zznf.zzu());
        }
    });
    public static final zzdx<Integer> zzi = zza("measurement.upload.max_events_per_bundle", 1000, 1000, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzdp
        @Override // com.google.android.gms.measurement.internal.zzdu
        public final Object zza() {
            zzdx<Long> zzdxVar = zzdy.zza;
            return Integer.valueOf((int) zznf.zzy());
        }
    });
    public static final zzdx<Integer> zzj = zza("measurement.upload.max_events_per_day", 100000, 100000, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzdq
        @Override // com.google.android.gms.measurement.internal.zzdu
        public final Object zza() {
            zzdx<Long> zzdxVar = zzdy.zza;
            return Integer.valueOf((int) zznf.zzz());
        }
    });
    public static final zzdx<Integer> zzk = zza("measurement.upload.max_error_events_per_day", 1000, 1000, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzbr
        @Override // com.google.android.gms.measurement.internal.zzdu
        public final Object zza() {
            zzdx<Long> zzdxVar = zzdy.zza;
            return Integer.valueOf((int) zznf.zzx());
        }
    });
    public static final zzdx<Integer> zzl = zza("measurement.upload.max_public_events_per_day", 50000, 50000, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzcc
        @Override // com.google.android.gms.measurement.internal.zzdu
        public final Object zza() {
            zzdx<Long> zzdxVar = zzdy.zza;
            return Integer.valueOf((int) zznf.zzA());
        }
    });

    static {
        Integer valueOf = Integer.valueOf(ModuleDescriptor.MODULE_VERSION);
        zzm = zza("measurement.upload.max_conversions_per_day", valueOf, valueOf, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzcn
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Integer.valueOf((int) zznf.zzw());
            }
        });
        zzn = zza("measurement.upload.max_realtime_events_per_day", 10, 10, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzcy
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Integer.valueOf((int) zznf.zzC());
            }
        });
        zzo = zza("measurement.store.max_stored_events_per_app", 100000, 100000, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzdj
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Integer.valueOf((int) zznf.zzg());
            }
        });
        zzp = zza("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", new zzdu() { // from class: com.google.android.gms.measurement.internal.zzdr
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return zznf.zzK();
            }
        });
        zzq = zza("measurement.upload.backoff_period", 43200000L, 43200000L, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzds
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Long.valueOf(zznf.zzr());
            }
        });
        zzr = zza("measurement.upload.window_interval", 3600000L, 3600000L, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzdt
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Long.valueOf(zznf.zzG());
            }
        });
        zzs = zza("measurement.upload.interval", 3600000L, 3600000L, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzaw
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Long.valueOf(zznf.zzt());
            }
        });
        zzt = zza("measurement.upload.realtime_upload_interval", 10000L, 10000L, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzax
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Long.valueOf(zznf.zzm());
            }
        });
        zzu = zza("measurement.upload.debug_upload_interval", 1000L, 1000L, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzaz
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Long.valueOf(zznf.zze());
            }
        });
        zzv = zza("measurement.upload.minimum_delay", 500L, 500L, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzba
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Long.valueOf(zznf.zzk());
            }
        });
        Long valueOf2 = Long.valueOf(TestBuildersKt.DEFAULT_DISPATCH_TIMEOUT_MS);
        zzw = zza("measurement.alarm_manager.minimum_interval", valueOf2, valueOf2, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzbb
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Long.valueOf(zznf.zzj());
            }
        });
        zzx = zza("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzbc
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Long.valueOf(zznf.zzp());
            }
        });
        zzy = zza("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzbd
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Long.valueOf(zznf.zzn());
            }
        });
        zzz = zza("measurement.upload.initial_upload_delay_time", 15000L, 15000L, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzbe
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Long.valueOf(zznf.zzs());
            }
        });
        zzA = zza("measurement.upload.retry_time", 1800000L, 1800000L, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzbf
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Long.valueOf(zznf.zzF());
            }
        });
        zzB = zza("measurement.upload.retry_count", 6, 6, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzbh
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Integer.valueOf((int) zznf.zzE());
            }
        });
        zzC = zza("measurement.upload.max_queue_time", 2419200000L, 2419200000L, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzbi
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Long.valueOf(zznf.zzB());
            }
        });
        zzD = zza("measurement.lifetimevalue.max_currency_tracked", 4, 4, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzbj
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Integer.valueOf((int) zznf.zzf());
            }
        });
        zzE = zza("measurement.audience.filter_result_max_count", 200, 200, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzbl
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Integer.valueOf((int) zznf.zzi());
            }
        });
        zzF = zza("measurement.upload.max_public_user_properties", 25, 25, null);
        Integer valueOf3 = Integer.valueOf(ServiceStarter.ERROR_UNKNOWN);
        zzG = zza("measurement.upload.max_event_name_cardinality", valueOf3, valueOf3, null);
        zzH = zza("measurement.upload.max_public_event_params", 25, 25, null);
        zzI = zza("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzbm
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Long.valueOf(zznf.zzo());
            }
        });
        Boolean bool = Boolean.FALSE;
        zzJ = zza("measurement.test.boolean_flag", bool, bool, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzbn
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Boolean.valueOf(zzpb.zzg());
            }
        });
        zzK = zza("measurement.test.string_flag", "---", "---", new zzdu() { // from class: com.google.android.gms.measurement.internal.zzbo
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return zzpb.zzf();
            }
        });
        zzL = zza("measurement.test.long_flag", -1L, -1L, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzbp
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Long.valueOf(zzpb.zzd());
            }
        });
        zzM = zza("measurement.test.int_flag", -2, -2, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzbq
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Integer.valueOf((int) zzpb.zzc());
            }
        });
        Double valueOf4 = Double.valueOf(-3.0d);
        zzN = zza("measurement.test.double_flag", valueOf4, valueOf4, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzbs
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Double.valueOf(zzpb.zzb());
            }
        });
        zzO = zza("measurement.experiment.max_ids", 50, 50, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzbt
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Integer.valueOf((int) zznf.zzh());
            }
        });
        zzP = zza("measurement.max_bundles_per_iteration", 100, 100, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzbu
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Integer.valueOf((int) zznf.zzc());
            }
        });
        zzQ = zza("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzbv
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Long.valueOf(zznf.zzq());
            }
        });
        zzR = zza("measurement.validation.internal_limits_internal_event_params", bool, bool, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzbx
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Boolean.valueOf(zzov.zzc());
            }
        });
        Boolean bool2 = Boolean.TRUE;
        zzS = zza("measurement.collection.firebase_global_collection_flag_enabled", bool2, bool2, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzby
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Boolean.valueOf(zzoj.zzc());
            }
        });
        zzT = zza("measurement.collection.redundant_engagement_removal_enabled", bool, bool, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzbz
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Boolean.valueOf(zzog.zzc());
            }
        });
        zzU = zza("measurement.collection.log_event_and_bundle_v2", bool2, bool2, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzca
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Boolean.valueOf(zzph.zzc());
            }
        });
        zzV = zza("measurement.quality.checksum", bool, bool, null);
        zzW = zza("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzcb
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Boolean.valueOf(zzoa.zze());
            }
        });
        zzX = zza("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzcd
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Boolean.valueOf(zzoa.zzd());
            }
        });
        zzY = zza("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzce
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Boolean.valueOf(zzoa.zzf());
            }
        });
        zzZ = zza("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzcf
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Boolean.valueOf(zzpw.zzc());
            }
        });
        zzaa = zza("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzcg
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Boolean.valueOf(zzop.zzd());
            }
        });
        zzab = zza("measurement.sdk.collection.enable_extend_user_property_size", bool2, bool2, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzch
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Boolean.valueOf(zzop.zzc());
            }
        });
        zzac = zza("measurement.ga.ga_app_id", bool, bool, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzcj
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Boolean.valueOf(zzom.zzd());
            }
        });
        zzad = zza("measurement.lifecycle.app_in_background_parameter", bool, bool, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzck
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Boolean.valueOf(zzos.zzd());
            }
        });
        zzae = zza("measurement.integration.disable_firebase_instance_id", bool, bool, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzcl
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Boolean.valueOf(zzpt.zzd());
            }
        });
        zzaf = zza("measurement.lifecycle.app_backgrounded_engagement", bool, bool, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzcm
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Boolean.valueOf(zzos.zzc());
            }
        });
        zzag = zza("measurement.collection.service.update_with_analytics_fix", bool, bool, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzco
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Boolean.valueOf(zzpz.zzc());
            }
        });
        zzah = zza("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzcp
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Boolean.valueOf(zznu.zzd());
            }
        });
        zzai = zza("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzcq
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Boolean.valueOf(zzod.zzd());
            }
        });
        zzaj = zza("measurement.scheduler.task_thread.cleanup_on_exit", bool, bool, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzcr
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Boolean.valueOf(zzpk.zzc());
            }
        });
        zzak = zza("measurement.upload.file_truncate_fix", bool, bool, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzcs
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Boolean.valueOf(zznr.zzc());
            }
        });
        zzal = zza("measurement.collection.synthetic_data_mitigation", bool, bool, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzct
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Boolean.valueOf(zzpq.zzc());
            }
        });
        zzam = zza("measurement.androidId.delete_feature", bool2, bool2, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzcv
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Boolean.valueOf(zzmw.zzc());
            }
        });
        zzan = zza("measurement.service.storage_consent_support_version", 203600, 203600, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzcw
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Integer.valueOf((int) zzni.zzb());
            }
        });
        zzao = zza("measurement.client.click_identifier_control.dev", bool, bool, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzcx
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Boolean.valueOf(zzmz.zzc());
            }
        });
        zzap = zza("measurement.service.click_identifier_control", bool, bool, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzcz
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Boolean.valueOf(zznc.zzc());
            }
        });
        zzaq = zza("measurement.config.persist_last_modified", bool2, bool2, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzda
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Boolean.valueOf(zzoy.zzd());
            }
        });
        zzar = zza("measurement.client.consent.suppress_1p_in_ga4f_install", bool2, bool2, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzdb
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Boolean.valueOf(zznx.zzd());
            }
        });
        zzas = zza("measurement.client.consent.gmpappid_worker_thread_fix", bool2, bool2, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzdc
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Boolean.valueOf(zznx.zze());
            }
        });
        zzat = zza("measurement.module.pixie.ees", bool2, bool2, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzdd
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Boolean.valueOf(zzpe.zzd());
            }
        });
        zzau = zza("measurement.module.pixie.fix_array", bool2, bool2, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzde
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Boolean.valueOf(zzpe.zze());
            }
        });
        zzav = zza("measurement.adid_zero.service", bool, bool, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzdf
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Boolean.valueOf(zzmt.zze());
            }
        });
        zzaw = zza("measurement.adid_zero.remove_lair_if_adidzero_false", bool2, bool2, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzdh
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Boolean.valueOf(zzmt.zzg());
            }
        });
        zzax = zza("measurement.adid_zero.remove_lair_if_userid_cleared", bool2, bool2, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzdi
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Boolean.valueOf(zzmt.zzh());
            }
        });
        zzay = zza("measurement.adid_zero.adid_uid", bool, bool, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzdk
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Boolean.valueOf(zzmt.zzf());
            }
        });
        zzaz = zza("measurement.adid_zero.app_instance_id_fix", bool2, bool2, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzdl
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Boolean.valueOf(zzmt.zzd());
            }
        });
        zzaA = zza("measurement.service.refactor.package_side_screen", bool2, bool2, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzdm
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Boolean.valueOf(zzpn.zzd());
            }
        });
        zzaB = zza("measurement.config.fix_feature_flags_from_config", bool2, bool2, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzdn
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Boolean.valueOf(zzno.zzc());
            }
        });
        zzaC = zza("measurement.service.event_config_fix", bool2, bool2, new zzdu() { // from class: com.google.android.gms.measurement.internal.zzdo
            @Override // com.google.android.gms.measurement.internal.zzdu
            public final Object zza() {
                zzdx<Long> zzdxVar = zzdy.zza;
                return Boolean.valueOf(zznl.zzd());
            }
        });
    }

    @VisibleForTesting
    public static <V> zzdx<V> zza(String str, V v10, V v11, zzdu<V> zzduVar) {
        zzdx<V> zzdxVar = new zzdx<>(str, v10, v11, zzduVar, null);
        zzaD.add(zzdxVar);
        return zzdxVar;
    }

    public static Map<String, String> zzc(Context context) {
        com.google.android.gms.internal.measurement.zzha zza2 = com.google.android.gms.internal.measurement.zzha.zza(context.getContentResolver(), com.google.android.gms.internal.measurement.zzhk.zza("com.google.android.gms.measurement"));
        return zza2 == null ? Collections.emptyMap() : zza2.zzc();
    }
}

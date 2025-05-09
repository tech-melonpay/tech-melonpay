package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* loaded from: classes.dex */
public final class zzki {
    public static final zzki zza;
    public static final zzki zzb;
    public static final zzki zzc;
    public static final zzki zzd;
    public static final zzki zze;
    public static final zzki zzf;
    public static final zzki zzg;
    public static final zzki zzh;
    public static final zzki zzi;
    public static final zzki zzj;
    private static final /* synthetic */ zzki[] zzk;
    private final Class<?> zzl;
    private final Class<?> zzm;
    private final Object zzn;

    static {
        zzki zzkiVar = new zzki("VOID", 0, Void.class, Void.class, null);
        zza = zzkiVar;
        Class cls = Integer.TYPE;
        zzki zzkiVar2 = new zzki("INT", 1, cls, Integer.class, 0);
        zzb = zzkiVar2;
        zzki zzkiVar3 = new zzki("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzkiVar3;
        zzki zzkiVar4 = new zzki("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzkiVar4;
        zzki zzkiVar5 = new zzki("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzkiVar5;
        zzki zzkiVar6 = new zzki("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzkiVar6;
        zzki zzkiVar7 = new zzki("STRING", 6, String.class, String.class, "");
        zzg = zzkiVar7;
        zzki zzkiVar8 = new zzki("BYTE_STRING", 7, zzix.class, zzix.class, zzix.zzb);
        zzh = zzkiVar8;
        zzki zzkiVar9 = new zzki("ENUM", 8, cls, Integer.class, null);
        zzi = zzkiVar9;
        zzki zzkiVar10 = new zzki("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzkiVar10;
        zzk = new zzki[]{zzkiVar, zzkiVar2, zzkiVar3, zzkiVar4, zzkiVar5, zzkiVar6, zzkiVar7, zzkiVar8, zzkiVar9, zzkiVar10};
    }

    private zzki(String str, int i, Class cls, Class cls2, Object obj) {
        this.zzl = cls;
        this.zzm = cls2;
        this.zzn = obj;
    }

    public static zzki[] values() {
        return (zzki[]) zzk.clone();
    }

    public final Class<?> zza() {
        return this.zzm;
    }
}

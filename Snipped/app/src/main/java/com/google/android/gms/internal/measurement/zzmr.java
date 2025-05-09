package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
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
public final class zzmr {
    public static final zzmr zza;
    public static final zzmr zzb;
    public static final zzmr zzc;
    public static final zzmr zzd;
    public static final zzmr zze;
    public static final zzmr zzf;
    public static final zzmr zzg;
    public static final zzmr zzh;
    public static final zzmr zzi;
    public static final zzmr zzj;
    public static final zzmr zzk;
    public static final zzmr zzl;
    public static final zzmr zzm;
    public static final zzmr zzn;
    public static final zzmr zzo;
    public static final zzmr zzp;
    public static final zzmr zzq;
    public static final zzmr zzr;
    private static final /* synthetic */ zzmr[] zzs;
    private final zzms zzt;

    static {
        zzmr zzmrVar = new zzmr("DOUBLE", 0, zzms.DOUBLE, 1);
        zza = zzmrVar;
        zzmr zzmrVar2 = new zzmr("FLOAT", 1, zzms.FLOAT, 5);
        zzb = zzmrVar2;
        zzms zzmsVar = zzms.LONG;
        zzmr zzmrVar3 = new zzmr("INT64", 2, zzmsVar, 0);
        zzc = zzmrVar3;
        zzmr zzmrVar4 = new zzmr("UINT64", 3, zzmsVar, 0);
        zzd = zzmrVar4;
        zzms zzmsVar2 = zzms.INT;
        zzmr zzmrVar5 = new zzmr("INT32", 4, zzmsVar2, 0);
        zze = zzmrVar5;
        zzmr zzmrVar6 = new zzmr("FIXED64", 5, zzmsVar, 1);
        zzf = zzmrVar6;
        zzmr zzmrVar7 = new zzmr("FIXED32", 6, zzmsVar2, 5);
        zzg = zzmrVar7;
        zzmr zzmrVar8 = new zzmr("BOOL", 7, zzms.BOOLEAN, 0);
        zzh = zzmrVar8;
        zzmr zzmrVar9 = new zzmr("STRING", 8, zzms.STRING, 2);
        zzi = zzmrVar9;
        zzms zzmsVar3 = zzms.MESSAGE;
        zzmr zzmrVar10 = new zzmr("GROUP", 9, zzmsVar3, 3);
        zzj = zzmrVar10;
        zzmr zzmrVar11 = new zzmr("MESSAGE", 10, zzmsVar3, 2);
        zzk = zzmrVar11;
        zzmr zzmrVar12 = new zzmr("BYTES", 11, zzms.BYTE_STRING, 2);
        zzl = zzmrVar12;
        zzmr zzmrVar13 = new zzmr("UINT32", 12, zzmsVar2, 0);
        zzm = zzmrVar13;
        zzmr zzmrVar14 = new zzmr("ENUM", 13, zzms.ENUM, 0);
        zzn = zzmrVar14;
        zzmr zzmrVar15 = new zzmr("SFIXED32", 14, zzmsVar2, 5);
        zzo = zzmrVar15;
        zzmr zzmrVar16 = new zzmr("SFIXED64", 15, zzmsVar, 1);
        zzp = zzmrVar16;
        zzmr zzmrVar17 = new zzmr("SINT32", 16, zzmsVar2, 0);
        zzq = zzmrVar17;
        zzmr zzmrVar18 = new zzmr("SINT64", 17, zzmsVar, 0);
        zzr = zzmrVar18;
        zzs = new zzmr[]{zzmrVar, zzmrVar2, zzmrVar3, zzmrVar4, zzmrVar5, zzmrVar6, zzmrVar7, zzmrVar8, zzmrVar9, zzmrVar10, zzmrVar11, zzmrVar12, zzmrVar13, zzmrVar14, zzmrVar15, zzmrVar16, zzmrVar17, zzmrVar18};
    }

    private zzmr(String str, int i, zzms zzmsVar, int i9) {
        this.zzt = zzmsVar;
    }

    public static zzmr[] values() {
        return (zzmr[]) zzs.clone();
    }

    public final zzms zza() {
        return this.zzt;
    }
}

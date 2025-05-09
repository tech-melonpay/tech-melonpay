package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zza' uses external variables
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
public final class zzjp {
    public static final zzjp zzA;
    public static final zzjp zzB;
    public static final zzjp zzC;
    public static final zzjp zzD;
    public static final zzjp zzE;
    public static final zzjp zzF;
    public static final zzjp zzG;
    public static final zzjp zzH;
    public static final zzjp zzI;
    public static final zzjp zzJ;
    public static final zzjp zzK;
    public static final zzjp zzL;
    public static final zzjp zzM;
    public static final zzjp zzN;
    public static final zzjp zzO;
    public static final zzjp zzP;
    public static final zzjp zzQ;
    public static final zzjp zzR;
    public static final zzjp zzS;
    public static final zzjp zzT;
    public static final zzjp zzU;
    public static final zzjp zzV;
    public static final zzjp zzW;
    public static final zzjp zzX;
    public static final zzjp zzY;
    private static final zzjp[] zzZ;
    public static final zzjp zza;
    private static final /* synthetic */ zzjp[] zzaa;
    public static final zzjp zzb;
    public static final zzjp zzc;
    public static final zzjp zzd;
    public static final zzjp zze;
    public static final zzjp zzf;
    public static final zzjp zzg;
    public static final zzjp zzh;
    public static final zzjp zzi;
    public static final zzjp zzj;
    public static final zzjp zzk;
    public static final zzjp zzl;
    public static final zzjp zzm;
    public static final zzjp zzn;
    public static final zzjp zzo;
    public static final zzjp zzp;
    public static final zzjp zzq;
    public static final zzjp zzr;
    public static final zzjp zzs;
    public static final zzjp zzt;
    public static final zzjp zzu;
    public static final zzjp zzv;
    public static final zzjp zzw;
    public static final zzjp zzx;
    public static final zzjp zzy;
    public static final zzjp zzz;
    private final zzki zzab;
    private final int zzac;
    private final Class<?> zzad;

    static {
        zzki zzkiVar = zzki.zze;
        zzjp zzjpVar = new zzjp("DOUBLE", 0, 0, 1, zzkiVar);
        zza = zzjpVar;
        zzki zzkiVar2 = zzki.zzd;
        zzjp zzjpVar2 = new zzjp("FLOAT", 1, 1, 1, zzkiVar2);
        zzb = zzjpVar2;
        zzki zzkiVar3 = zzki.zzc;
        zzjp zzjpVar3 = new zzjp("INT64", 2, 2, 1, zzkiVar3);
        zzc = zzjpVar3;
        zzjp zzjpVar4 = new zzjp("UINT64", 3, 3, 1, zzkiVar3);
        zzd = zzjpVar4;
        zzki zzkiVar4 = zzki.zzb;
        zzjp zzjpVar5 = new zzjp("INT32", 4, 4, 1, zzkiVar4);
        zze = zzjpVar5;
        zzjp zzjpVar6 = new zzjp("FIXED64", 5, 5, 1, zzkiVar3);
        zzf = zzjpVar6;
        zzjp zzjpVar7 = new zzjp("FIXED32", 6, 6, 1, zzkiVar4);
        zzg = zzjpVar7;
        zzki zzkiVar5 = zzki.zzf;
        zzjp zzjpVar8 = new zzjp("BOOL", 7, 7, 1, zzkiVar5);
        zzh = zzjpVar8;
        zzki zzkiVar6 = zzki.zzg;
        zzjp zzjpVar9 = new zzjp("STRING", 8, 8, 1, zzkiVar6);
        zzi = zzjpVar9;
        zzki zzkiVar7 = zzki.zzj;
        zzjp zzjpVar10 = new zzjp("MESSAGE", 9, 9, 1, zzkiVar7);
        zzj = zzjpVar10;
        zzki zzkiVar8 = zzki.zzh;
        zzjp zzjpVar11 = new zzjp("BYTES", 10, 10, 1, zzkiVar8);
        zzk = zzjpVar11;
        zzjp zzjpVar12 = new zzjp("UINT32", 11, 11, 1, zzkiVar4);
        zzl = zzjpVar12;
        zzki zzkiVar9 = zzki.zzi;
        zzjp zzjpVar13 = new zzjp("ENUM", 12, 12, 1, zzkiVar9);
        zzm = zzjpVar13;
        zzjp zzjpVar14 = new zzjp("SFIXED32", 13, 13, 1, zzkiVar4);
        zzn = zzjpVar14;
        zzjp zzjpVar15 = new zzjp("SFIXED64", 14, 14, 1, zzkiVar3);
        zzo = zzjpVar15;
        zzjp zzjpVar16 = new zzjp("SINT32", 15, 15, 1, zzkiVar4);
        zzp = zzjpVar16;
        zzjp zzjpVar17 = new zzjp("SINT64", 16, 16, 1, zzkiVar3);
        zzq = zzjpVar17;
        zzjp zzjpVar18 = new zzjp("GROUP", 17, 17, 1, zzkiVar7);
        zzr = zzjpVar18;
        zzjp zzjpVar19 = new zzjp("DOUBLE_LIST", 18, 18, 2, zzkiVar);
        zzs = zzjpVar19;
        zzjp zzjpVar20 = new zzjp("FLOAT_LIST", 19, 19, 2, zzkiVar2);
        zzt = zzjpVar20;
        zzjp zzjpVar21 = new zzjp("INT64_LIST", 20, 20, 2, zzkiVar3);
        zzu = zzjpVar21;
        zzjp zzjpVar22 = new zzjp("UINT64_LIST", 21, 21, 2, zzkiVar3);
        zzv = zzjpVar22;
        zzjp zzjpVar23 = new zzjp("INT32_LIST", 22, 22, 2, zzkiVar4);
        zzw = zzjpVar23;
        zzjp zzjpVar24 = new zzjp("FIXED64_LIST", 23, 23, 2, zzkiVar3);
        zzx = zzjpVar24;
        zzjp zzjpVar25 = new zzjp("FIXED32_LIST", 24, 24, 2, zzkiVar4);
        zzy = zzjpVar25;
        zzjp zzjpVar26 = new zzjp("BOOL_LIST", 25, 25, 2, zzkiVar5);
        zzz = zzjpVar26;
        zzjp zzjpVar27 = new zzjp("STRING_LIST", 26, 26, 2, zzkiVar6);
        zzA = zzjpVar27;
        zzjp zzjpVar28 = new zzjp("MESSAGE_LIST", 27, 27, 2, zzkiVar7);
        zzB = zzjpVar28;
        zzjp zzjpVar29 = new zzjp("BYTES_LIST", 28, 28, 2, zzkiVar8);
        zzC = zzjpVar29;
        zzjp zzjpVar30 = new zzjp("UINT32_LIST", 29, 29, 2, zzkiVar4);
        zzD = zzjpVar30;
        zzjp zzjpVar31 = new zzjp("ENUM_LIST", 30, 30, 2, zzkiVar9);
        zzE = zzjpVar31;
        zzjp zzjpVar32 = new zzjp("SFIXED32_LIST", 31, 31, 2, zzkiVar4);
        zzF = zzjpVar32;
        zzjp zzjpVar33 = new zzjp("SFIXED64_LIST", 32, 32, 2, zzkiVar3);
        zzG = zzjpVar33;
        zzjp zzjpVar34 = new zzjp("SINT32_LIST", 33, 33, 2, zzkiVar4);
        zzH = zzjpVar34;
        zzjp zzjpVar35 = new zzjp("SINT64_LIST", 34, 34, 2, zzkiVar3);
        zzI = zzjpVar35;
        zzjp zzjpVar36 = new zzjp("DOUBLE_LIST_PACKED", 35, 35, 3, zzkiVar);
        zzJ = zzjpVar36;
        zzjp zzjpVar37 = new zzjp("FLOAT_LIST_PACKED", 36, 36, 3, zzkiVar2);
        zzK = zzjpVar37;
        zzjp zzjpVar38 = new zzjp("INT64_LIST_PACKED", 37, 37, 3, zzkiVar3);
        zzL = zzjpVar38;
        zzjp zzjpVar39 = new zzjp("UINT64_LIST_PACKED", 38, 38, 3, zzkiVar3);
        zzM = zzjpVar39;
        zzjp zzjpVar40 = new zzjp("INT32_LIST_PACKED", 39, 39, 3, zzkiVar4);
        zzN = zzjpVar40;
        zzjp zzjpVar41 = new zzjp("FIXED64_LIST_PACKED", 40, 40, 3, zzkiVar3);
        zzO = zzjpVar41;
        zzjp zzjpVar42 = new zzjp("FIXED32_LIST_PACKED", 41, 41, 3, zzkiVar4);
        zzP = zzjpVar42;
        zzjp zzjpVar43 = new zzjp("BOOL_LIST_PACKED", 42, 42, 3, zzkiVar5);
        zzQ = zzjpVar43;
        zzjp zzjpVar44 = new zzjp("UINT32_LIST_PACKED", 43, 43, 3, zzkiVar4);
        zzR = zzjpVar44;
        zzjp zzjpVar45 = new zzjp("ENUM_LIST_PACKED", 44, 44, 3, zzkiVar9);
        zzS = zzjpVar45;
        zzjp zzjpVar46 = new zzjp("SFIXED32_LIST_PACKED", 45, 45, 3, zzkiVar4);
        zzT = zzjpVar46;
        zzjp zzjpVar47 = new zzjp("SFIXED64_LIST_PACKED", 46, 46, 3, zzkiVar3);
        zzU = zzjpVar47;
        zzjp zzjpVar48 = new zzjp("SINT32_LIST_PACKED", 47, 47, 3, zzkiVar4);
        zzV = zzjpVar48;
        zzjp zzjpVar49 = new zzjp("SINT64_LIST_PACKED", 48, 48, 3, zzkiVar3);
        zzW = zzjpVar49;
        zzjp zzjpVar50 = new zzjp("GROUP_LIST", 49, 49, 2, zzkiVar7);
        zzX = zzjpVar50;
        zzjp zzjpVar51 = new zzjp("MAP", 50, 50, 4, zzki.zza);
        zzY = zzjpVar51;
        zzaa = new zzjp[]{zzjpVar, zzjpVar2, zzjpVar3, zzjpVar4, zzjpVar5, zzjpVar6, zzjpVar7, zzjpVar8, zzjpVar9, zzjpVar10, zzjpVar11, zzjpVar12, zzjpVar13, zzjpVar14, zzjpVar15, zzjpVar16, zzjpVar17, zzjpVar18, zzjpVar19, zzjpVar20, zzjpVar21, zzjpVar22, zzjpVar23, zzjpVar24, zzjpVar25, zzjpVar26, zzjpVar27, zzjpVar28, zzjpVar29, zzjpVar30, zzjpVar31, zzjpVar32, zzjpVar33, zzjpVar34, zzjpVar35, zzjpVar36, zzjpVar37, zzjpVar38, zzjpVar39, zzjpVar40, zzjpVar41, zzjpVar42, zzjpVar43, zzjpVar44, zzjpVar45, zzjpVar46, zzjpVar47, zzjpVar48, zzjpVar49, zzjpVar50, zzjpVar51};
        zzjp[] values = values();
        zzZ = new zzjp[values.length];
        for (zzjp zzjpVar52 : values) {
            zzZ[zzjpVar52.zzac] = zzjpVar52;
        }
    }

    private zzjp(String str, int i, int i9, int i10, zzki zzkiVar) {
        this.zzac = i9;
        this.zzab = zzkiVar;
        zzki zzkiVar2 = zzki.zza;
        int i11 = i10 - 1;
        if (i11 == 1) {
            this.zzad = zzkiVar.zza();
        } else if (i11 != 3) {
            this.zzad = null;
        } else {
            this.zzad = zzkiVar.zza();
        }
        if (i10 == 1) {
            zzkiVar.ordinal();
        }
    }

    public static zzjp[] values() {
        return (zzjp[]) zzaa.clone();
    }

    public final int zza() {
        return this.zzac;
    }
}

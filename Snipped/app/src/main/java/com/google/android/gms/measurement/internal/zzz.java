package com.google.android.gms.measurement.internal;

import java.util.BitSet;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* loaded from: classes.dex */
final class zzz extends zzki {
    private String zza;
    private Set<Integer> zzb;
    private Map<Integer, zzt> zzc;
    private Long zzd;
    private Long zze;

    public zzz(zzks zzksVar) {
        super(zzksVar);
    }

    private final zzt zzd(Integer num) {
        if (this.zzc.containsKey(num)) {
            return this.zzc.get(num);
        }
        zzt zztVar = new zzt(this, this.zza, null);
        this.zzc.put(num, zztVar);
        return zztVar;
    }

    private final boolean zzf(int i, int i9) {
        BitSet bitSet;
        zzt zztVar = this.zzc.get(Integer.valueOf(i));
        if (zztVar == null) {
            return false;
        }
        bitSet = zztVar.zze;
        return bitSet.get(i9);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:2|(2:4|(2:6|7)(1:521))(2:522|523))|8|(3:10|11|12)|16|(17:(6:19|20|21|22|23|(21:(7:25|26|27|28|(1:30)(3:496|(1:498)(1:500)|499)|31|(1:34)(1:33))|35|36|37|38|39|40|(2:42|43)(3:455|(6:456|457|458|459|460|(1:463)(1:462))|464)|44|(5:286|(3:288|(10:290|291|292|293|294|(1:(4:296|(1:298)|299|300))(1:347)|303|304|(6:307|(2:342|343)(2:311|(8:317|318|(4:321|(2:323|324)(1:326)|325|319)|327|328|(4:331|(2:333|334)(1:336)|335|329)|337|338)(4:313|314|315|316))|339|340|316|305)|345)|362)(1:454)|363|(11:366|(3:370|(4:373|(5:375|376|(1:378)(1:382)|379|380)(1:383)|381|371)|384)|385|386|(3:390|(4:393|(3:398|399|400)|401|391)|404)|405|(3:407|(6:410|(2:412|(3:414|415|416))(1:419)|417|418|416|408)|420)|421|(3:430|(8:433|(1:435)|436|(1:438)|439|(3:441|442|443)(1:445)|444|431)|446)|447|364)|453)|46|47|(3:177|(4:180|(9:182|(1:184)(1:283)|185|(9:187|188|189|190|191|192|194|195|(4:197|(11:198|199|200|201|202|203|204|(3:206|207|208)(1:252)|209|210|(1:213)(1:212))|214|215)(4:262|263|248|215))(1:282)|216|(4:219|(3:237|238|239)(6:221|222|(2:223|(2:225|(1:227)(2:228|229))(2:235|236))|(1:231)|232|233)|234|217)|240|241|242)(1:284)|243|178)|285)|49|50|(3:77|(6:80|(6:82|83|84|85|86|(3:(9:88|89|90|91|92|(1:94)(1:151)|95|96|(1:99)(1:98))|100|101)(4:158|159|150|101))(1:175)|102|(2:103|(2:105|(3:141|142|143)(8:107|(2:108|(4:110|(3:112|(1:114)(1:137)|115)(1:138)|116|(1:1)(2:120|(1:122)(2:123|124)))(2:139|140))|131|(1:133)(1:135)|134|126|127|128))(0))|144|78)|176)|52|53|(9:56|57|58|59|60|61|(2:63|64)(1:66)|65|54)|74|75)(2:504|505))|39|40|(0)(0)|44|(0)|46|47|(0)|49|50|(0)|52|53|(1:54)|74|75)|520|36|37|38|(5:(0)|(0)|(0)|(0)|(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(17:(6:19|20|21|22|23|(21:(7:25|26|27|28|(1:30)(3:496|(1:498)(1:500)|499)|31|(1:34)(1:33))|35|36|37|38|39|40|(2:42|43)(3:455|(6:456|457|458|459|460|(1:463)(1:462))|464)|44|(5:286|(3:288|(10:290|291|292|293|294|(1:(4:296|(1:298)|299|300))(1:347)|303|304|(6:307|(2:342|343)(2:311|(8:317|318|(4:321|(2:323|324)(1:326)|325|319)|327|328|(4:331|(2:333|334)(1:336)|335|329)|337|338)(4:313|314|315|316))|339|340|316|305)|345)|362)(1:454)|363|(11:366|(3:370|(4:373|(5:375|376|(1:378)(1:382)|379|380)(1:383)|381|371)|384)|385|386|(3:390|(4:393|(3:398|399|400)|401|391)|404)|405|(3:407|(6:410|(2:412|(3:414|415|416))(1:419)|417|418|416|408)|420)|421|(3:430|(8:433|(1:435)|436|(1:438)|439|(3:441|442|443)(1:445)|444|431)|446)|447|364)|453)|46|47|(3:177|(4:180|(9:182|(1:184)(1:283)|185|(9:187|188|189|190|191|192|194|195|(4:197|(11:198|199|200|201|202|203|204|(3:206|207|208)(1:252)|209|210|(1:213)(1:212))|214|215)(4:262|263|248|215))(1:282)|216|(4:219|(3:237|238|239)(6:221|222|(2:223|(2:225|(1:227)(2:228|229))(2:235|236))|(1:231)|232|233)|234|217)|240|241|242)(1:284)|243|178)|285)|49|50|(3:77|(6:80|(6:82|83|84|85|86|(3:(9:88|89|90|91|92|(1:94)(1:151)|95|96|(1:99)(1:98))|100|101)(4:158|159|150|101))(1:175)|102|(2:103|(2:105|(3:141|142|143)(8:107|(2:108|(4:110|(3:112|(1:114)(1:137)|115)(1:138)|116|(1:1)(2:120|(1:122)(2:123|124)))(2:139|140))|131|(1:133)(1:135)|134|126|127|128))(0))|144|78)|176)|52|53|(9:56|57|58|59|60|61|(2:63|64)(1:66)|65|54)|74|75)(2:504|505))|39|40|(0)(0)|44|(0)|46|47|(0)|49|50|(0)|52|53|(1:54)|74|75) */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0a0d, code lost:
    
        if (r13 != false) goto L486;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x08ed, code lost:
    
        if (r13 == null) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x073f, code lost:
    
        if (r11 != null) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0303, code lost:
    
        if (r5 == null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x01bd, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x01be, code lost:
    
        r18 = "audience_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x022b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x022c, code lost:
    
        r18 = "audience_id";
        r19 = com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0234, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0229, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0231, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x0172, code lost:
    
        if (r5 == null) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ac A[Catch: all -> 0x01ba, SQLiteException -> 0x01bd, TRY_LEAVE, TryCatch #15 {all -> 0x01ba, blocks: (B:40:0x01a6, B:42:0x01ac, B:455:0x01c4, B:456:0x01c9, B:458:0x01d3, B:459:0x01e3, B:460:0x020f, B:473:0x01f2, B:476:0x0202, B:479:0x0208, B:467:0x0235), top: B:39:0x01a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:455:0x01c4 A[Catch: all -> 0x01ba, SQLiteException -> 0x01bd, TRY_ENTER, TryCatch #15 {all -> 0x01ba, blocks: (B:40:0x01a6, B:42:0x01ac, B:455:0x01c4, B:456:0x01c9, B:458:0x01d3, B:459:0x01e3, B:460:0x020f, B:473:0x01f2, B:476:0x0202, B:479:0x0208, B:467:0x0235), top: B:39:0x01a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:469:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0a32  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0801  */
    /* JADX WARN: Type inference failed for: r4v39, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v39, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.internal.measurement.zzfk> zza(java.lang.String r66, java.util.List<com.google.android.gms.internal.measurement.zzfo> r67, java.util.List<com.google.android.gms.internal.measurement.zzgh> r68, java.lang.Long r69, java.lang.Long r70) {
        /*
            Method dump skipped, instructions count: 2755
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzz.zza(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }

    @Override // com.google.android.gms.measurement.internal.zzki
    public final boolean zzb() {
        return false;
    }
}

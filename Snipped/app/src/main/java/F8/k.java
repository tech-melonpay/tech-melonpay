package F8;

import com.luminary.business.presentation.entity.transaction.TransactionUI;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: TransactionDomainExt.kt */
/* loaded from: classes2.dex */
public final class k {
    public static final TransactionUI a(F5.b bVar) {
        String str = bVar.f1188a;
        String str2 = str != null ? str : null;
        List singletonList = Collections.singletonList("referencedBy");
        String str3 = bVar.f1194g;
        String lowerCase = str3 != null ? str3.toLowerCase(Locale.ROOT) : null;
        String str4 = bVar.f1193f;
        String str5 = !kotlin.jvm.internal.f.b(str4, "DEBIT") ? bVar.f1199m : bVar.f1207u;
        String str6 = !kotlin.jvm.internal.f.b(str4, "DEBIT") ? bVar.f1200n : bVar.f1208v;
        boolean z10 = !kotlin.jvm.internal.f.b(str4, "DEBIT");
        Boolean bool = bVar.f1175E;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        B5.a aVar = bVar.f1179I;
        TransactionUI.CommissionUI commissionUI = aVar != null ? new TransactionUI.CommissionUI(aVar.f297d, aVar.f295b) : null;
        BigDecimal bigDecimal = bVar.f1210x;
        Integer num = bVar.S;
        String str7 = bVar.f1196j;
        String str8 = bVar.f1197k;
        String str9 = bVar.f1198l;
        String str10 = bVar.i;
        String str11 = bVar.f1204r;
        String str12 = bVar.f1205s;
        return new TransactionUI(str2, 0, singletonList, str7, lowerCase, str8, str9, str10, str9, str11, str12, false, bVar.f1171A, bVar.f1195h, bVar.f1212z, str12, str5, str6, z10, booleanValue, bVar.f1177G, bVar.f1178H, bVar.f1201o, bVar.f1209w, bVar.f1206t, commissionUI, bVar.f1203q, bVar.f1211y, bVar.f1202p, bigDecimal, num);
    }

    public static final ArrayList b(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(P9.n.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(a((F5.b) it.next()));
        }
        return arrayList;
    }
}

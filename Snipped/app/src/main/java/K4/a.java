package K4;

import P9.n;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import f4.C0744a;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: BankAccountRawMapper.kt */
/* loaded from: classes.dex */
public final class a {
    public static final BankAccountDomain a(C0744a c0744a) {
        HashMap hashMap;
        Integer j10 = c0744a.j();
        Integer f10 = c0744a.f();
        String g10 = c0744a.g();
        String b9 = c0744a.b();
        BigDecimal c2 = c0744a.c();
        HashMap<String, C0744a.C0398a> m2 = c0744a.m();
        if (m2 != null) {
            hashMap = new HashMap();
            Iterator<T> it = m2.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                hashMap.put(entry.getKey(), c((C0744a.C0398a) entry.getValue()));
            }
        } else {
            hashMap = null;
        }
        String k3 = c0744a.k();
        String i = c0744a.i();
        String l10 = c0744a.l();
        Integer n10 = c0744a.n();
        String h9 = c0744a.h();
        return new BankAccountDomain(j10, f10, g10, b9, c2, hashMap, k3, i, l10, n10, h9 != null ? U4.b.E(h9) : null, c0744a.s(), c0744a.o(), c0744a.p(), c0744a.d(), c0744a.e(), c0744a.q(), c0744a.r());
    }

    public static final ArrayList b(List list) {
        if (list == null) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(n.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(a((C0744a) it.next()));
        }
        return arrayList;
    }

    public static final BankAccountDomain.ProviderRequisiteDomain c(C0744a.C0398a c0398a) {
        return new BankAccountDomain.ProviderRequisiteDomain(c0398a.f(), c0398a.a(), c0398a.l(), c0398a.j(), c0398a.g(), c0398a.e(), c0398a.d(), c0398a.b(), c0398a.c(), c0398a.k(), c0398a.h(), c0398a.i());
    }
}

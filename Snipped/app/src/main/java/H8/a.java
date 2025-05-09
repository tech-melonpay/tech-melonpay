package H8;

import D9.b;
import P9.m;
import P9.q;
import android.content.Context;
import android.text.format.DateUtils;
import androidx.fragment.app.Fragment;
import com.luminary.business.domain.entity.account.FeeDomain;
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;
import com.luminary.business.presentation.entity.transaction.TransactionUI;
import com.luminary.business.presentation.ui.fragments.home.newhome.a;
import com.luminary.business.presentation.ui.fragments.home.newhome.b;
import com.luminary.mobile.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: TransactionDetailsListFilter.kt */
/* loaded from: classes2.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    public static final List<com.luminary.business.presentation.ui.fragments.home.newhome.a> a(Fragment fragment, List<CryptoExchangeDomain> list) {
        Pair pair;
        Context requireContext = fragment.requireContext();
        List<CryptoExchangeDomain> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return EmptyList.f23104a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Calendar calendar = Calendar.getInstance();
        for (CryptoExchangeDomain cryptoExchangeDomain : list) {
            Calendar calendar2 = Calendar.getInstance();
            Date date = cryptoExchangeDomain.f11032q;
            calendar2.setTimeInMillis(date != null ? date.getTime() : 0L);
            if (DateUtils.isToday(calendar2.getTimeInMillis())) {
                pair = new Pair(-4, new a.b(requireContext.getString(R.string.today)));
            } else if (b.m0(calendar2.getTime())) {
                pair = new Pair(-3, new a.b(requireContext.getString(R.string.yesterday)));
            } else if (calendar2.get(3) == calendar.get(3)) {
                pair = new Pair(-2, new a.b(requireContext.getString(R.string.this_week)));
            } else if (calendar2.get(3) == calendar.get(3) - 1) {
                pair = new Pair(-1, new a.b(requireContext.getString(R.string.last_week)));
            } else {
                int i = calendar.get(1) - calendar2.get(1);
                pair = new Pair(Integer.valueOf(((i * 100) + 12) - calendar2.get(2)), new a.b(new SimpleDateFormat(i < 1 ? "LLLL" : "LLLL yyyy", Locale.US).format(calendar2.getTime())));
            }
            int intValue = ((Number) pair.f23089a).intValue();
            a.b bVar = (a.b) pair.f23090b;
            Integer valueOf = Integer.valueOf(intValue);
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = m.r(bVar);
                linkedHashMap.put(valueOf, obj);
            }
            ((List) obj).add(new a.C0129a(cryptoExchangeDomain));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            q.x(arrayList, (Iterable) ((Map.Entry) it.next()).getValue());
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List<com.luminary.business.presentation.ui.fragments.home.newhome.b> b(Fragment fragment, List<TransactionUI> list, List<FeeDomain> list2) {
        Pair pair;
        Context requireContext = fragment.requireContext();
        List<TransactionUI> list3 = list;
        if (list3 == null || list3.isEmpty()) {
            return EmptyList.f23104a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Calendar calendar = Calendar.getInstance();
        if (list2 != null) {
            for (FeeDomain feeDomain : list2) {
                Object obj = linkedHashMap.get(-5);
                if (obj == null) {
                    obj = m.r(new b.c(requireContext.getString(R.string.outstanding_fees)));
                    linkedHashMap.put(-5, obj);
                }
                ((List) obj).add(new b.C0130b(feeDomain));
            }
        }
        for (TransactionUI transactionUI : list) {
            Calendar calendar2 = Calendar.getInstance();
            Date date = transactionUI.f11382m;
            calendar2.setTimeInMillis(date != null ? date.getTime() : 0L);
            if (DateUtils.isToday(calendar2.getTimeInMillis())) {
                pair = new Pair(-4, new b.c(requireContext.getString(R.string.today)));
            } else if (D9.b.m0(calendar2.getTime())) {
                pair = new Pair(-3, new b.c(requireContext.getString(R.string.yesterday)));
            } else if (calendar2.get(3) == calendar.get(3)) {
                pair = new Pair(-2, new b.c(requireContext.getString(R.string.this_week)));
            } else if (calendar2.get(3) == calendar.get(3) - 1) {
                pair = new Pair(-1, new b.c(requireContext.getString(R.string.last_week)));
            } else {
                int i = calendar.get(1) - calendar2.get(1);
                pair = new Pair(Integer.valueOf(((i * 100) + 12) - calendar2.get(2)), new b.c(new SimpleDateFormat(i < 1 ? "LLLL" : "LLLL yyyy", Locale.US).format(calendar2.getTime())));
            }
            int intValue = ((Number) pair.f23089a).intValue();
            b.c cVar = (b.c) pair.f23090b;
            Integer valueOf = Integer.valueOf(intValue);
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = m.r(cVar);
                linkedHashMap.put(valueOf, obj2);
            }
            ((List) obj2).add(new b.a(transactionUI));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            q.x(arrayList, (Iterable) ((Map.Entry) it.next()).getValue());
        }
        return arrayList;
    }
}

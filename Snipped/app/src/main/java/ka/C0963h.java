package ka;

import P9.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Indent.kt */
/* renamed from: ka.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0963h extends j3.e {
    public static String N(String str) {
        int i;
        Comparable comparable;
        List l02 = C0969n.l0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : l02) {
            if (!C0969n.i0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(P9.n.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length = str2.length();
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                }
                if (!j3.e.u(str2.charAt(i))) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                i = str2.length();
            }
            arrayList2.add(Integer.valueOf(i));
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int intValue = num != null ? num.intValue() : 0;
        int length2 = str.length();
        l02.size();
        int p10 = P9.m.p(l02);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : l02) {
            int i9 = i + 1;
            if (i < 0) {
                P9.m.t();
                throw null;
            }
            String str3 = (String) obj2;
            String w02 = ((i == 0 || i == p10) && C0969n.i0(str3)) ? null : C0970o.w0(intValue, str3);
            if (w02 != null) {
                arrayList3.add(w02);
            }
            i = i9;
        }
        StringBuilder sb2 = new StringBuilder(length2);
        s.N(arrayList3, sb2, "\n", "", "", -1, "...", null);
        return sb2.toString();
    }

    public static String O(String str) {
        if (!(!C0969n.i0("|"))) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        List l02 = C0969n.l0(str);
        int length = str.length();
        l02.size();
        int p10 = P9.m.p(l02);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : l02) {
            int i9 = i + 1;
            String str2 = null;
            if (i < 0) {
                P9.m.t();
                throw null;
            }
            String str3 = (String) obj;
            if ((i != 0 && i != p10) || !C0969n.i0(str3)) {
                int length2 = str3.length();
                int i10 = 0;
                while (true) {
                    if (i10 >= length2) {
                        i10 = -1;
                        break;
                    }
                    if (!j3.e.u(str3.charAt(i10))) {
                        break;
                    }
                    i10++;
                }
                if (i10 != -1 && str3.startsWith("|", i10)) {
                    str2 = str3.substring(i10 + 1);
                }
                if (str2 == null) {
                    str2 = str3;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i = i9;
        }
        StringBuilder sb2 = new StringBuilder(length);
        s.N(arrayList, sb2, "\n", "", "", -1, "...", null);
        return sb2.toString();
    }
}

package com.sumsub.sns.internal.core.common;

import ha.C0805d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ka.C0970o;

/* loaded from: classes2.dex */
public final class z0 {
    public static final byte[] a(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalStateException("Must have an even length".toString());
        }
        ArrayList v02 = C0970o.v0(2, str);
        ArrayList arrayList = new ArrayList(P9.n.u(v02, 10));
        Iterator it = v02.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            j3.e.e(16);
            arrayList.add(Byte.valueOf((byte) Integer.parseInt(str2, 16)));
        }
        byte[] bArr = new byte[arrayList.size()];
        Iterator it2 = arrayList.iterator();
        int i = 0;
        while (it2.hasNext()) {
            bArr[i] = ((Number) it2.next()).byteValue();
            i++;
        }
        return bArr;
    }

    public static final String a(List<String> list) {
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(list.get(0).toLowerCase(Locale.ROOT));
        Iterator<Integer> it = ha.h.V(1, list.size()).iterator();
        while (((C0805d) it).f21231c) {
            int a10 = ((P9.w) it).a();
            String valueOf = String.valueOf(list.get(a10).charAt(0));
            Locale locale = Locale.ROOT;
            sb2.append(valueOf.toUpperCase(locale));
            sb2.append(list.get(a10).substring(1).toLowerCase(locale));
        }
        return sb2.toString();
    }
}

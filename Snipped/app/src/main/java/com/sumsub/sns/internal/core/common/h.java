package com.sumsub.sns.internal.core.common;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ka.C0969n;

/* loaded from: classes2.dex */
public final class h {
    public static final String[] a(CharSequence charSequence) {
        List q02 = C0969n.q0(charSequence, new char[]{',', ';', '|', ':'});
        ArrayList arrayList = new ArrayList(P9.n.u(q02, 10));
        Iterator it = q02.iterator();
        while (it.hasNext()) {
            arrayList.add(C0969n.u0((String) it.next()).toString());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}

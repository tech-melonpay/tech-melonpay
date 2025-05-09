package com.sumsub.sns.internal.core.data.model.remote;

import P9.z;
import com.sumsub.sns.internal.core.data.model.Document;
import com.sumsub.sns.internal.core.data.model.remote.m;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class n {
    public static final Document.b.C0198b a(m.c cVar) {
        return new Document.b.C0198b(cVar.e(), cVar.i(), cVar.g(), cVar.k());
    }

    public static final Document.b a(m mVar) {
        m.c n10 = mVar.n();
        LinkedHashMap linkedHashMap = null;
        Document.b.C0198b a10 = n10 != null ? a(n10) : null;
        String f10 = mVar.f();
        String h9 = mVar.h();
        List<Integer> j10 = mVar.j();
        Map<Integer, m.c> l10 = mVar.l();
        if (l10 != null) {
            linkedHashMap = new LinkedHashMap(z.n(l10.size()));
            Iterator<T> it = l10.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), a((m.c) entry.getValue()));
            }
        }
        return new Document.b(a10, f10, h9, j10, linkedHashMap);
    }
}

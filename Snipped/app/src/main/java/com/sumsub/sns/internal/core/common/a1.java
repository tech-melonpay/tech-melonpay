package com.sumsub.sns.internal.core.common;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.Regex;

/* loaded from: classes2.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public Map<String, Regex> f15034a = kotlin.collections.a.p();

    public final boolean a(String str, String str2) {
        Object obj;
        if (str2 == null || (obj = str2.toUpperCase(Locale.ROOT)) == null) {
            obj = Boolean.TRUE;
        }
        Regex regex = this.f15034a.get(obj);
        if (regex != null) {
            return regex.b(str);
        }
        return true;
    }

    public final void a(Map<String, com.sumsub.sns.internal.core.data.model.remote.o> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, com.sumsub.sns.internal.core.data.model.remote.o> entry : map.entrySet()) {
            String d10 = entry.getValue().d();
            Pair pair = d10 != null ? new Pair(entry.getKey().toUpperCase(Locale.ROOT), new Regex(d10)) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        this.f15034a = kotlin.collections.a.v(arrayList);
    }
}

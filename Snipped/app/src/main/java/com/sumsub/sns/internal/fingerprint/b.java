package com.sumsub.sns.internal.fingerprint;

import com.sumsub.sns.internal.fingerprint.fingerprintingsignals.v;
import com.sumsub.sns.internal.fingerprint.fingerprintingsignals.x;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final x f17000a;

    public b(x xVar) {
        this.f17000a = xVar;
    }

    public final Object a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = this.f17000a.L().iterator();
        while (it.hasNext()) {
            linkedHashMap.putAll(((v) it.next()).d());
        }
        return linkedHashMap;
    }
}

package io.sentry;

import java.util.ArrayList;
import java.util.Map;

/* compiled from: SentryThreadFactory.java */
/* loaded from: classes2.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final B1.f f22061a;

    /* renamed from: b, reason: collision with root package name */
    public final SentryOptions f22062b;

    public k0(B1.f fVar, SentryOptions sentryOptions) {
        this.f22061a = fVar;
        D9.b.t0(sentryOptions, "The SentryOptions is required");
        this.f22062b = sentryOptions;
    }

    public final ArrayList a(Map map, ArrayList arrayList) {
        Thread currentThread = Thread.currentThread();
        if (map.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!map.containsKey(currentThread)) {
            map.put(currentThread, currentThread.getStackTrace());
        }
        for (Map.Entry entry : map.entrySet()) {
            Thread thread = (Thread) entry.getKey();
            boolean z10 = thread == currentThread || (arrayList != null && arrayList.contains(Long.valueOf(thread.getId())));
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) entry.getValue();
            Thread thread2 = (Thread) entry.getKey();
            H9.l lVar = new H9.l();
            lVar.f1640c = thread2.getName();
            lVar.f1639b = Integer.valueOf(thread2.getPriority());
            lVar.f1638a = Long.valueOf(thread2.getId());
            lVar.f1644g = Boolean.valueOf(thread2.isDaemon());
            lVar.f1641d = thread2.getState().name();
            lVar.f1642e = Boolean.valueOf(z10);
            ArrayList p10 = this.f22061a.p(stackTraceElementArr);
            if (this.f22062b.isAttachStacktrace() && p10 != null && !p10.isEmpty()) {
                H9.k kVar = new H9.k(p10);
                kVar.f1636c = Boolean.TRUE;
                lVar.f1645h = kVar;
            }
            arrayList2.add(lVar);
        }
        return arrayList2;
    }
}

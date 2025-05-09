package com.sumsub.sentry;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f13713a;

    public l0(j0 j0Var) {
        this.f13713a = j0Var;
    }

    public final List<k0> a(List<Long> list) {
        return a(Thread.getAllStackTraces(), list);
    }

    public final List<k0> a(Map<Thread, StackTraceElement[]> map, List<Long> list) {
        Thread currentThread = Thread.currentThread();
        if (map.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!map.containsKey(currentThread)) {
            map.put(currentThread, currentThread.getStackTrace());
        }
        for (Map.Entry<Thread, StackTraceElement[]> entry : map.entrySet()) {
            Thread key = entry.getKey();
            arrayList.add(a(key == currentThread || (list != null && list.contains(Long.valueOf(key.getId()))), entry.getValue(), key));
        }
        return arrayList;
    }

    public final k0 a(boolean z10, StackTraceElement[] stackTraceElementArr, Thread thread) {
        i0 i0Var;
        List<h0> a10 = this.f13713a.a(stackTraceElementArr);
        String name = thread.getName();
        int priority = thread.getPriority();
        long id = thread.getId();
        boolean isDaemon = thread.isDaemon();
        String name2 = thread.getState().name();
        if (a10 != null) {
            List<h0> list = a10.isEmpty() ^ true ? a10 : null;
            if (list != null) {
                i0Var = new i0(list, (Map) null, Boolean.TRUE, 2, (DefaultConstructorMarker) null);
                return new k0(Long.valueOf(id), Integer.valueOf(priority), name, name2, Boolean.valueOf(z10), (Boolean) null, Boolean.valueOf(isDaemon), i0Var, 32, (DefaultConstructorMarker) null);
            }
        }
        i0Var = null;
        return new k0(Long.valueOf(id), Integer.valueOf(priority), name, name2, Boolean.valueOf(z10), (Boolean) null, Boolean.valueOf(isDaemon), i0Var, 32, (DefaultConstructorMarker) null);
    }
}

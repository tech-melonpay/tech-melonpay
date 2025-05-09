package io.sentry;

import io.sentry.exception.ExceptionMechanismException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: DuplicateEventDetectionEventProcessor.java */
/* renamed from: io.sentry.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0847e implements InterfaceC0850h {

    /* renamed from: a, reason: collision with root package name */
    public final Map<Throwable, Object> f21986a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    public final SentryOptions f21987b;

    public C0847e(SentryOptions sentryOptions) {
        D9.b.t0(sentryOptions, "options are required");
        this.f21987b = sentryOptions;
    }

    @Override // io.sentry.InterfaceC0850h
    public final i0 d(i0 i0Var, C0852j c0852j) {
        SentryOptions sentryOptions = this.f21987b;
        if (sentryOptions.isEnableDeduplication()) {
            Throwable th = i0Var.f21925j;
            if (th instanceof ExceptionMechanismException) {
                th = ((ExceptionMechanismException) th).f21991b;
            }
            if (th != null) {
                Map<Throwable, Object> map = this.f21986a;
                if (!map.containsKey(th)) {
                    ArrayList arrayList = new ArrayList();
                    for (Throwable th2 = th; th2.getCause() != null; th2 = th2.getCause()) {
                        arrayList.add(th2.getCause());
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (map.containsKey(it.next())) {
                        }
                    }
                    map.put(th, null);
                }
                sentryOptions.getLogger().h(SentryLevel.DEBUG, "Duplicate Exception detected. Event %s will be discarded.", i0Var.f21917a);
                return null;
            }
        } else {
            sentryOptions.getLogger().h(SentryLevel.DEBUG, "Event deduplication is disabled.", new Object[0]);
        }
        return i0Var;
    }
}

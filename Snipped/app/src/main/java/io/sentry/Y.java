package io.sentry;

import io.sentry.r0;
import java.util.Iterator;

/* compiled from: Sentry.java */
/* loaded from: classes2.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<InterfaceC0858p> f21914a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    public static volatile InterfaceC0858p f21915b = J.f21827b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f21916c = false;

    /* compiled from: Sentry.java */
    public interface a<T extends SentryOptions> {
        void c(T t3);
    }

    public static synchronized void a() {
        synchronized (Y.class) {
            InterfaceC0858p b9 = b();
            f21915b = J.f21827b;
            f21914a.remove();
            b9.close();
        }
    }

    public static InterfaceC0858p b() {
        if (f21916c) {
            return f21915b;
        }
        ThreadLocal<InterfaceC0858p> threadLocal = f21914a;
        InterfaceC0858p interfaceC0858p = threadLocal.get();
        if (interfaceC0858p != null && !(interfaceC0858p instanceof J)) {
            return interfaceC0858p;
        }
        InterfaceC0858p m93clone = f21915b.m93clone();
        threadLocal.set(m93clone);
        return m93clone;
    }

    public static void c(P p10, M.b bVar) {
        SentryOptions sentryOptions = (SentryOptions) p10.f21834a.getDeclaredConstructor(null).newInstance(null);
        try {
            bVar.c(sentryOptions);
        } catch (Throwable th) {
            sentryOptions.getLogger().f(SentryLevel.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th);
        }
        synchronized (Y.class) {
            try {
                if (e()) {
                    sentryOptions.getLogger().h(SentryLevel.WARNING, "Sentry has been already initialized. Previous configuration will be overwritten.", new Object[0]);
                }
                if (d(sentryOptions)) {
                    sentryOptions.getLogger().h(SentryLevel.INFO, "GlobalHubMode: '%s'", String.valueOf(true));
                    f21916c = true;
                    InterfaceC0858p b9 = b();
                    if (sentryOptions.getDsn() == null || sentryOptions.getDsn().isEmpty()) {
                        throw new IllegalArgumentException("Hub requires a DSN to be instantiated. Considering using the NoOpHub if no DSN is available.");
                    }
                    f21915b = new C0854l(sentryOptions, new r0(sentryOptions.getLogger(), new r0.a(sentryOptions, new a0(sentryOptions), new U(sentryOptions))));
                    f21914a.set(f21915b);
                    b9.close();
                    Iterator<InterfaceC0867z> it = sentryOptions.getIntegrations().iterator();
                    while (it.hasNext()) {
                        it.next().d(sentryOptions);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0115 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016a A[LOOP:0: B:35:0x0164->B:37:0x016a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b9 A[LOOP:1: B:43:0x01b3->B:45:0x01b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01d5 A[LOOP:2: B:48:0x01cf->B:50:0x01d5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0234 A[LOOP:4: B:75:0x022e->B:77:0x0234, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0125 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean d(io.sentry.SentryOptions r9) {
        /*
            Method dump skipped, instructions count: 869
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.Y.d(io.sentry.SentryOptions):boolean");
    }

    public static boolean e() {
        return b().isEnabled();
    }
}

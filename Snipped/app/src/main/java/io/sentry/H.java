package io.sentry;

import io.sentry.exception.ExceptionMechanismException;
import io.sentry.protocol.DebugImage;
import java.io.Closeable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* compiled from: MainEventProcessor.java */
/* loaded from: classes2.dex */
public final class H implements InterfaceC0850h, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final SentryOptions f21820a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f21821b;

    /* renamed from: c, reason: collision with root package name */
    public final C.N f21822c;

    /* renamed from: d, reason: collision with root package name */
    public volatile C0853k f21823d = null;

    public H(SentryOptions sentryOptions) {
        D9.b.t0(sentryOptions, "The SentryOptions is required.");
        this.f21820a = sentryOptions;
        B1.f fVar = new B1.f(11, sentryOptions.getInAppExcludes(), sentryOptions.getInAppIncludes());
        this.f21822c = new C.N(fVar, 16);
        this.f21821b = new k0(fVar, sentryOptions);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f21823d != null) {
            this.f21823d.f22059f.shutdown();
        }
    }

    @Override // io.sentry.InterfaceC0850h
    public final i0 d(i0 i0Var, C0852j c0852j) {
        ArrayList arrayList;
        Thread currentThread;
        boolean z10;
        H9.b bVar;
        if (i0Var.f21924h == null) {
            i0Var.f21924h = com.sumsub.sentry.u.f13785m;
        }
        Throwable th = i0Var.f21925j;
        if (th != null) {
            C.N n10 = this.f21822c;
            n10.getClass();
            ArrayDeque arrayDeque = new ArrayDeque();
            HashSet hashSet = new HashSet();
            while (th != null && hashSet.add(th)) {
                if (th instanceof ExceptionMechanismException) {
                    ExceptionMechanismException exceptionMechanismException = (ExceptionMechanismException) th;
                    H9.b bVar2 = exceptionMechanismException.f21990a;
                    Throwable th2 = exceptionMechanismException.f21991b;
                    currentThread = exceptionMechanismException.f21992c;
                    z10 = exceptionMechanismException.f21993d;
                    th = th2;
                    bVar = bVar2;
                } else {
                    currentThread = Thread.currentThread();
                    z10 = false;
                    bVar = null;
                }
                Package r10 = th.getClass().getPackage();
                String name = th.getClass().getName();
                H9.f fVar = new H9.f();
                String message = th.getMessage();
                if (r10 != null) {
                    name = name.replace(r10.getName() + ".", "");
                }
                String name2 = r10 != null ? r10.getName() : null;
                ArrayList p10 = ((B1.f) n10.f535b).p(th.getStackTrace());
                if (p10 != null && !p10.isEmpty()) {
                    H9.k kVar = new H9.k(p10);
                    if (z10) {
                        kVar.f1636c = Boolean.TRUE;
                    }
                    fVar.f1601e = kVar;
                }
                if (currentThread != null) {
                    fVar.f1600d = Long.valueOf(currentThread.getId());
                }
                fVar.f1597a = name;
                fVar.f1602f = bVar;
                fVar.f1599c = name2;
                fVar.f1598b = message;
                arrayDeque.addFirst(fVar);
                th = th.getCause();
            }
            i0Var.f22040s = new C.N(new ArrayList(arrayDeque));
        }
        SentryOptions sentryOptions = this.f21820a;
        if (sentryOptions.getProguardUuid() != null) {
            io.sentry.protocol.c cVar = i0Var.f22046y;
            if (cVar == null) {
                cVar = new io.sentry.protocol.c();
            }
            if (cVar.f22153b == null) {
                cVar.f22153b = new ArrayList(new ArrayList());
            }
            List<DebugImage> list = cVar.f22153b;
            if (list != null) {
                DebugImage debugImage = new DebugImage();
                debugImage.setType("proguard");
                debugImage.setUuid(sentryOptions.getProguardUuid());
                list.add(debugImage);
                i0Var.f22046y = cVar;
            }
        }
        Map<String, String> a10 = sentryOptions.getModulesLoader().a();
        if (a10 != null) {
            Map<String, String> map = i0Var.f22045x;
            if (map == null) {
                i0Var.f22045x = new HashMap(a10);
            } else {
                map.putAll(a10);
            }
        }
        if (J9.b.d(c0852j)) {
            j(i0Var);
            C.N n11 = i0Var.f22039r;
            if ((n11 != null ? (ArrayList) n11.f535b : null) == null) {
                C.N n12 = i0Var.f22040s;
                ArrayList<H9.f> arrayList2 = n12 == null ? null : (ArrayList) n12.f535b;
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = null;
                    for (H9.f fVar2 : arrayList2) {
                        if (fVar2.f1602f != null && fVar2.f1600d != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(fVar2.f1600d);
                        }
                    }
                }
                boolean isAttachThreads = sentryOptions.isAttachThreads();
                k0 k0Var = this.f21821b;
                if (isAttachThreads) {
                    k0Var.getClass();
                    i0Var.f22039r = new C.N(k0Var.a(Thread.getAllStackTraces(), arrayList));
                } else if (sentryOptions.isAttachStacktrace() && ((arrayList2 == null || arrayList2.isEmpty()) && !E9.b.class.isInstance(J9.b.b(c0852j)))) {
                    k0Var.getClass();
                    HashMap hashMap = new HashMap();
                    Thread currentThread2 = Thread.currentThread();
                    hashMap.put(currentThread2, currentThread2.getStackTrace());
                    i0Var.f22039r = new C.N(k0Var.a(hashMap, null));
                }
            }
        } else {
            sentryOptions.getLogger().h(SentryLevel.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", i0Var.f21917a);
        }
        return i0Var;
    }

    @Override // io.sentry.InterfaceC0850h
    public final H9.m i(H9.m mVar, C0852j c0852j) {
        if (mVar.f21924h == null) {
            mVar.f21924h = com.sumsub.sentry.u.f13785m;
        }
        if (J9.b.d(c0852j)) {
            j(mVar);
        } else {
            this.f21820a.getLogger().h(SentryLevel.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", mVar.f21917a);
        }
        return mVar;
    }

    public final void j(Z z10) {
        if (z10.f21922f == null) {
            z10.f21922f = this.f21820a.getRelease();
        }
        if (z10.f21923g == null) {
            SentryOptions sentryOptions = this.f21820a;
            z10.f21923g = sentryOptions.getEnvironment() != null ? sentryOptions.getEnvironment() : "production";
        }
        if (z10.f21926k == null) {
            z10.f21926k = this.f21820a.getServerName();
        }
        if (this.f21820a.isAttachServerName() && z10.f21926k == null) {
            if (this.f21823d == null) {
                synchronized (this) {
                    try {
                        if (this.f21823d == null) {
                            if (C0853k.i == null) {
                                C0853k.i = new C0853k();
                            }
                            this.f21823d = C0853k.i;
                        }
                    } finally {
                    }
                }
            }
            if (this.f21823d != null) {
                C0853k c0853k = this.f21823d;
                if (c0853k.f22056c < System.currentTimeMillis() && c0853k.f22057d.compareAndSet(false, true)) {
                    c0853k.a();
                }
                z10.f21926k = c0853k.f22055b;
            }
        }
        if (z10.f21927l == null) {
            z10.f21927l = this.f21820a.getDist();
        }
        if (z10.f21919c == null) {
            z10.f21919c = this.f21820a.getSdkVersion();
        }
        Map<String, String> map = z10.f21921e;
        SentryOptions sentryOptions2 = this.f21820a;
        if (map == null) {
            z10.f21921e = new HashMap(new HashMap(sentryOptions2.getTags()));
        } else {
            for (Map.Entry<String, String> entry : sentryOptions2.getTags().entrySet()) {
                if (!z10.f21921e.containsKey(entry.getKey())) {
                    z10.a(entry.getKey(), entry.getValue());
                }
            }
        }
        if (this.f21820a.isSendDefaultPii()) {
            H9.o oVar = z10.i;
            if (oVar == null) {
                H9.o oVar2 = new H9.o();
                oVar2.f1659e = "{{auto}}";
                z10.i = oVar2;
            } else if (oVar.f1659e == null) {
                oVar.f1659e = "{{auto}}";
            }
        }
    }
}

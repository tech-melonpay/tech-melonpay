package io.sentry;

import io.sentry.protocol.Contexts;
import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Scope.java */
/* loaded from: classes2.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public final SentryLevel f21895a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0864w f21896b;

    /* renamed from: c, reason: collision with root package name */
    public String f21897c;

    /* renamed from: d, reason: collision with root package name */
    public final H9.o f21898d;

    /* renamed from: e, reason: collision with root package name */
    public final H9.d f21899e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f21900f;

    /* renamed from: g, reason: collision with root package name */
    public final Queue<C0844b> f21901g;

    /* renamed from: h, reason: collision with root package name */
    public final ConcurrentHashMap f21902h;
    public final ConcurrentHashMap i;

    /* renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f21903j;

    /* renamed from: k, reason: collision with root package name */
    public final SentryOptions f21904k;

    /* renamed from: l, reason: collision with root package name */
    public volatile Session f21905l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f21906m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f21907n;

    /* renamed from: o, reason: collision with root package name */
    public final Contexts f21908o;

    /* renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f21909p;

    /* compiled from: Scope.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Session f21910a;

        /* renamed from: b, reason: collision with root package name */
        public final Session f21911b;

        public a(Session session, Session session2) {
            this.f21911b = session;
            this.f21910a = session2;
        }
    }

    public U(SentryOptions sentryOptions) {
        this.f21900f = new ArrayList();
        this.f21902h = new ConcurrentHashMap();
        this.i = new ConcurrentHashMap();
        this.f21903j = new CopyOnWriteArrayList();
        this.f21906m = new Object();
        this.f21907n = new Object();
        this.f21908o = new Contexts();
        this.f21909p = new CopyOnWriteArrayList();
        this.f21904k = sentryOptions;
        this.f21901g = new SynchronizedQueue(new CircularFifoQueue(sentryOptions.getMaxBreadcrumbs()));
    }

    public final void a() {
        synchronized (this.f21907n) {
            this.f21896b = null;
        }
        this.f21897c = null;
    }

    public final void b(InterfaceC0864w interfaceC0864w) {
        synchronized (this.f21907n) {
            this.f21896b = interfaceC0864w;
        }
    }

    public U(U u6) {
        H9.o oVar;
        this.f21900f = new ArrayList();
        this.f21902h = new ConcurrentHashMap();
        this.i = new ConcurrentHashMap();
        this.f21903j = new CopyOnWriteArrayList();
        this.f21906m = new Object();
        this.f21907n = new Object();
        this.f21908o = new Contexts();
        this.f21909p = new CopyOnWriteArrayList();
        this.f21896b = u6.f21896b;
        this.f21897c = u6.f21897c;
        this.f21905l = u6.f21905l;
        this.f21904k = u6.f21904k;
        this.f21895a = u6.f21895a;
        H9.o oVar2 = u6.f21898d;
        H9.d dVar = null;
        if (oVar2 != null) {
            oVar = new H9.o();
            oVar.f1655a = oVar2.f1655a;
            oVar.f1657c = oVar2.f1657c;
            oVar.f1656b = oVar2.f1656b;
            oVar.f1659e = oVar2.f1659e;
            oVar.f1658d = oVar2.f1658d;
            oVar.f1660f = J9.a.a(oVar2.f1660f);
            oVar.f1661g = J9.a.a(oVar2.f1661g);
        } else {
            oVar = null;
        }
        this.f21898d = oVar;
        H9.d dVar2 = u6.f21899e;
        if (dVar2 != null) {
            dVar = new H9.d();
            dVar.f1582a = dVar2.f1582a;
            dVar.f1586e = dVar2.f1586e;
            dVar.f1583b = dVar2.f1583b;
            dVar.f1584c = dVar2.f1584c;
            dVar.f1587f = J9.a.a(dVar2.f1587f);
            dVar.f1588g = J9.a.a(dVar2.f1588g);
            dVar.i = J9.a.a(dVar2.i);
            dVar.f1591k = J9.a.a(dVar2.f1591k);
            dVar.f1585d = dVar2.f1585d;
            dVar.f1590j = dVar2.f1590j;
            dVar.f1589h = dVar2.f1589h;
        }
        this.f21899e = dVar;
        this.f21900f = new ArrayList(u6.f21900f);
        this.f21903j = new CopyOnWriteArrayList(u6.f21903j);
        C0844b[] c0844bArr = (C0844b[]) ((SynchronizedQueue) u6.f21901g).toArray(new C0844b[0]);
        SynchronizedQueue synchronizedQueue = new SynchronizedQueue(new CircularFifoQueue(u6.f21904k.getMaxBreadcrumbs()));
        for (C0844b c0844b : c0844bArr) {
            synchronizedQueue.add(new C0844b(c0844b));
        }
        this.f21901g = synchronizedQueue;
        ConcurrentHashMap concurrentHashMap = u6.f21902h;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (entry != null) {
                concurrentHashMap2.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        this.f21902h = concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3 = u6.i;
        ConcurrentHashMap concurrentHashMap4 = new ConcurrentHashMap();
        for (Map.Entry entry2 : concurrentHashMap3.entrySet()) {
            if (entry2 != null) {
                concurrentHashMap4.put((String) entry2.getKey(), entry2.getValue());
            }
        }
        this.i = concurrentHashMap4;
        this.f21908o = new Contexts(u6.f21908o);
        this.f21909p = new CopyOnWriteArrayList(u6.f21909p);
    }
}

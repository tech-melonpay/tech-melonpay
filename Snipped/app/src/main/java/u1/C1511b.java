package u1;

import B1.p;
import C1.j;
import android.content.Context;
import android.text.TextUtils;
import androidx.work.WorkInfo$State;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import s1.AbstractC1197g;
import s1.C1192b;
import t1.C1276a;
import t1.InterfaceC1277b;
import t1.e;
import t1.k;
import x1.C1583d;
import x1.InterfaceC1582c;

/* compiled from: GreedyScheduler.java */
/* renamed from: u1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1511b implements e, InterfaceC1582c, InterfaceC1277b {
    public static final String i = AbstractC1197g.e("GreedyScheduler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f30133a;

    /* renamed from: b, reason: collision with root package name */
    public final k f30134b;

    /* renamed from: c, reason: collision with root package name */
    public final C1583d f30135c;

    /* renamed from: e, reason: collision with root package name */
    public final C1510a f30137e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f30138f;

    /* renamed from: h, reason: collision with root package name */
    public Boolean f30140h;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f30136d = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final Object f30139g = new Object();

    public C1511b(Context context, androidx.work.a aVar, D1.b bVar, k kVar) {
        this.f30133a = context;
        this.f30134b = kVar;
        this.f30135c = new C1583d(context, bVar, this);
        this.f30137e = new C1510a(this, aVar.f8122e);
    }

    @Override // t1.e
    public final boolean a() {
        return false;
    }

    @Override // t1.InterfaceC1277b
    public final void b(String str, boolean z10) {
        synchronized (this.f30139g) {
            try {
                Iterator it = this.f30136d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    p pVar = (p) it.next();
                    if (pVar.f243a.equals(str)) {
                        AbstractC1197g.c().a(i, "Stopping tracking for " + str, new Throwable[0]);
                        this.f30136d.remove(pVar);
                        this.f30135c.b(this.f30136d);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // t1.e
    public final void c(String str) {
        Runnable runnable;
        Boolean bool = this.f30140h;
        k kVar = this.f30134b;
        if (bool == null) {
            this.f30140h = Boolean.valueOf(j.a(this.f30133a, kVar.f27439b));
        }
        boolean booleanValue = this.f30140h.booleanValue();
        String str2 = i;
        if (!booleanValue) {
            AbstractC1197g.c().d(str2, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.f30138f) {
            kVar.f27443f.a(this);
            this.f30138f = true;
        }
        AbstractC1197g.c().a(str2, s3.b.j("Cancelling work ID ", str), new Throwable[0]);
        C1510a c1510a = this.f30137e;
        if (c1510a != null && (runnable = (Runnable) c1510a.f30132c.remove(str)) != null) {
            c1510a.f30131b.f27406a.removeCallbacks(runnable);
        }
        kVar.g(str);
    }

    @Override // x1.InterfaceC1582c
    public final void d(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC1197g.c().a(i, s3.b.j("Constraints not met: Cancelling work ID ", str), new Throwable[0]);
            this.f30134b.g(str);
        }
    }

    @Override // x1.InterfaceC1582c
    public final void e(List<String> list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC1197g.c().a(i, s3.b.j("Constraints met: Scheduling work ID ", str), new Throwable[0]);
            this.f30134b.f(str, null);
        }
    }

    @Override // t1.e
    public final void f(p... pVarArr) {
        if (this.f30140h == null) {
            this.f30140h = Boolean.valueOf(j.a(this.f30133a, this.f30134b.f27439b));
        }
        if (!this.f30140h.booleanValue()) {
            AbstractC1197g.c().d(i, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.f30138f) {
            this.f30134b.f27443f.a(this);
            this.f30138f = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (p pVar : pVarArr) {
            long a10 = pVar.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (pVar.f244b == WorkInfo$State.f8102a) {
                if (currentTimeMillis < a10) {
                    C1510a c1510a = this.f30137e;
                    if (c1510a != null) {
                        HashMap hashMap = c1510a.f30132c;
                        Runnable runnable = (Runnable) hashMap.remove(pVar.f243a);
                        C1276a c1276a = c1510a.f30131b;
                        if (runnable != null) {
                            c1276a.f27406a.removeCallbacks(runnable);
                        }
                        A3.k kVar = new A3.k(5, c1510a, pVar, false);
                        hashMap.put(pVar.f243a, kVar);
                        c1276a.f27406a.postDelayed(kVar, pVar.a() - System.currentTimeMillis());
                    }
                } else if (pVar.b()) {
                    C1192b c1192b = pVar.f251j;
                    if (c1192b.f26499c) {
                        AbstractC1197g.c().a(i, "Ignoring WorkSpec " + pVar + ", Requires device idle.", new Throwable[0]);
                    } else if (c1192b.f26504h.f26505a.size() > 0) {
                        AbstractC1197g.c().a(i, "Ignoring WorkSpec " + pVar + ", Requires ContentUri triggers.", new Throwable[0]);
                    } else {
                        hashSet.add(pVar);
                        hashSet2.add(pVar.f243a);
                    }
                } else {
                    AbstractC1197g.c().a(i, s3.b.j("Starting work for ", pVar.f243a), new Throwable[0]);
                    this.f30134b.f(pVar.f243a, null);
                }
            }
        }
        synchronized (this.f30139g) {
            try {
                if (!hashSet.isEmpty()) {
                    AbstractC1197g.c().a(i, "Starting tracking for [" + TextUtils.join(",", hashSet2) + "]", new Throwable[0]);
                    this.f30136d.addAll(hashSet);
                    this.f30135c.b(this.f30136d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

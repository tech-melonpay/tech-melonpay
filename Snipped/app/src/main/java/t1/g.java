package t1;

import androidx.work.ExistingWorkPolicy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import s1.AbstractC1197g;
import s1.AbstractC1201k;

/* compiled from: WorkContinuationImpl.java */
/* loaded from: classes.dex */
public final class g extends Y8.a {

    /* renamed from: j, reason: collision with root package name */
    public static final String f27424j = AbstractC1197g.e("WorkContinuationImpl");

    /* renamed from: b, reason: collision with root package name */
    public final k f27425b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27426c;

    /* renamed from: d, reason: collision with root package name */
    public final ExistingWorkPolicy f27427d;

    /* renamed from: e, reason: collision with root package name */
    public final List<? extends AbstractC1201k> f27428e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f27429f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f27430g;

    /* renamed from: h, reason: collision with root package name */
    public final List<g> f27431h;
    public boolean i;

    public g() {
        throw null;
    }

    public g(k kVar, List<? extends AbstractC1201k> list) {
        ExistingWorkPolicy existingWorkPolicy = ExistingWorkPolicy.f8080a;
        this.f27425b = kVar;
        this.f27426c = null;
        this.f27427d = existingWorkPolicy;
        this.f27428e = list;
        this.f27431h = null;
        this.f27429f = new ArrayList(list.size());
        this.f27430g = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String uuid = list.get(i).f26517a.toString();
            this.f27429f.add(uuid);
            this.f27430g.add(uuid);
        }
    }

    public static boolean f(g gVar, HashSet hashSet) {
        hashSet.addAll(gVar.f27429f);
        HashSet g10 = g(gVar);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (g10.contains((String) it.next())) {
                return true;
            }
        }
        List<g> list = gVar.f27431h;
        if (list != null && !list.isEmpty()) {
            Iterator<g> it2 = list.iterator();
            while (it2.hasNext()) {
                if (f(it2.next(), hashSet)) {
                    return true;
                }
            }
        }
        hashSet.removeAll(gVar.f27429f);
        return false;
    }

    public static HashSet g(g gVar) {
        HashSet hashSet = new HashSet();
        List<g> list = gVar.f27431h;
        if (list != null && !list.isEmpty()) {
            Iterator<g> it = list.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().f27429f);
            }
        }
        return hashSet;
    }
}

package y1;

import B1.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import s1.AbstractC1197g;
import x1.C1583d;
import x1.InterfaceC1580a;
import x1.InterfaceC1582c;

/* compiled from: ConstraintController.java */
/* renamed from: y1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1610b<T> implements InterfaceC1580a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f31105a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public T f31106b;

    /* renamed from: c, reason: collision with root package name */
    public final z1.d<T> f31107c;

    /* renamed from: d, reason: collision with root package name */
    public a f31108d;

    /* compiled from: ConstraintController.java */
    /* renamed from: y1.b$a */
    public interface a {
    }

    public AbstractC1610b(z1.d<T> dVar) {
        this.f31107c = dVar;
    }

    @Override // x1.InterfaceC1580a
    public final void a(T t3) {
        this.f31106b = t3;
        e(this.f31108d, t3);
    }

    public abstract boolean b(p pVar);

    public abstract boolean c(T t3);

    public final void d(Collection collection) {
        this.f31105a.clear();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            if (b(pVar)) {
                this.f31105a.add(pVar.f243a);
            }
        }
        if (this.f31105a.isEmpty()) {
            this.f31107c.b(this);
        } else {
            z1.d<T> dVar = this.f31107c;
            synchronized (dVar.f31243c) {
                try {
                    if (dVar.f31244d.add(this)) {
                        if (dVar.f31244d.size() == 1) {
                            dVar.f31245e = dVar.a();
                            AbstractC1197g.c().a(z1.d.f31240f, String.format("%s: initial state = %s", dVar.getClass().getSimpleName(), dVar.f31245e), new Throwable[0]);
                            dVar.d();
                        }
                        a(dVar.f31245e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        e(this.f31108d, this.f31106b);
    }

    public final void e(a aVar, T t3) {
        if (this.f31105a.isEmpty() || aVar == null) {
            return;
        }
        if (t3 == null || c(t3)) {
            ArrayList arrayList = this.f31105a;
            C1583d c1583d = (C1583d) aVar;
            synchronized (c1583d.f30915c) {
                InterfaceC1582c interfaceC1582c = c1583d.f30913a;
                if (interfaceC1582c != null) {
                    interfaceC1582c.d(arrayList);
                }
            }
            return;
        }
        ArrayList arrayList2 = this.f31105a;
        C1583d c1583d2 = (C1583d) aVar;
        synchronized (c1583d2.f30915c) {
            try {
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (c1583d2.a(str)) {
                        AbstractC1197g.c().a(C1583d.f30912d, "Constraints met for " + str, new Throwable[0]);
                        arrayList3.add(str);
                    }
                }
                InterfaceC1582c interfaceC1582c2 = c1583d2.f30913a;
                if (interfaceC1582c2 != null) {
                    interfaceC1582c2.e(arrayList3);
                }
            } finally {
            }
        }
    }
}

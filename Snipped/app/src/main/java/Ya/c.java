package ya;

import O9.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* compiled from: TaskQueue.kt */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d f31183a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31184b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f31185c;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC1633a f31186d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f31187e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f31188f;

    public c(d dVar, String str) {
        this.f31183a = dVar;
        this.f31184b = str;
    }

    public final void a() {
        byte[] bArr = wa.b.f30872a;
        synchronized (this.f31183a) {
            try {
                if (b()) {
                    this.f31183a.e(this);
                }
                p pVar = p.f3034a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        AbstractC1633a abstractC1633a = this.f31186d;
        if (abstractC1633a != null && abstractC1633a.f31180b) {
            this.f31188f = true;
        }
        ArrayList arrayList = this.f31187e;
        boolean z10 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((AbstractC1633a) arrayList.get(size)).f31180b) {
                AbstractC1633a abstractC1633a2 = (AbstractC1633a) arrayList.get(size);
                if (d.i.isLoggable(Level.FINE)) {
                    b.a(abstractC1633a2, this, "canceled");
                }
                arrayList.remove(size);
                z10 = true;
            }
        }
        return z10;
    }

    public final void c(AbstractC1633a abstractC1633a, long j10) {
        synchronized (this.f31183a) {
            if (!this.f31185c) {
                if (e(abstractC1633a, j10, false)) {
                    this.f31183a.e(this);
                }
                p pVar = p.f3034a;
            } else if (abstractC1633a.f31180b) {
                d dVar = d.f31189h;
                if (d.i.isLoggable(Level.FINE)) {
                    b.a(abstractC1633a, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                d dVar2 = d.f31189h;
                if (d.i.isLoggable(Level.FINE)) {
                    b.a(abstractC1633a, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean e(AbstractC1633a abstractC1633a, long j10, boolean z10) {
        c cVar = abstractC1633a.f31181c;
        if (cVar != this) {
            if (cVar != null) {
                throw new IllegalStateException("task is in multiple queues".toString());
            }
            abstractC1633a.f31181c = this;
        }
        long nanoTime = this.f31183a.f31190a.nanoTime();
        long j11 = nanoTime + j10;
        ArrayList arrayList = this.f31187e;
        int indexOf = arrayList.indexOf(abstractC1633a);
        if (indexOf != -1) {
            if (abstractC1633a.f31182d <= j11) {
                if (d.i.isLoggable(Level.FINE)) {
                    b.a(abstractC1633a, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        abstractC1633a.f31182d = j11;
        if (d.i.isLoggable(Level.FINE)) {
            b.a(abstractC1633a, this, z10 ? "run again after ".concat(b.b(j11 - nanoTime)) : "scheduled after ".concat(b.b(j11 - nanoTime)));
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((AbstractC1633a) it.next()).f31182d - nanoTime > j10) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = arrayList.size();
        }
        arrayList.add(i, abstractC1633a);
        return i == 0;
    }

    public final void f() {
        byte[] bArr = wa.b.f30872a;
        synchronized (this.f31183a) {
            try {
                this.f31185c = true;
                if (b()) {
                    this.f31183a.e(this);
                }
                p pVar = p.f3034a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        return this.f31184b;
    }
}

package androidx.lifecycle;

import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import java.util.Iterator;
import java.util.Map;
import n.C1058a;
import o.b;

/* compiled from: LiveData.java */
/* renamed from: androidx.lifecycle.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0557x<T> {
    static final Object NOT_SET = new Object();
    static final int START_VERSION = -1;
    int mActiveCount;
    private boolean mChangingActiveState;
    private volatile Object mData;
    final Object mDataLock;
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private o.b<A<? super T>, AbstractC0557x<T>.d> mObservers;
    volatile Object mPendingData;
    private final Runnable mPostValueRunnable;
    private int mVersion;

    /* compiled from: LiveData.java */
    /* renamed from: androidx.lifecycle.x$a */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            Object obj;
            synchronized (AbstractC0557x.this.mDataLock) {
                obj = AbstractC0557x.this.mPendingData;
                AbstractC0557x.this.mPendingData = AbstractC0557x.NOT_SET;
            }
            AbstractC0557x.this.setValue(obj);
        }
    }

    /* compiled from: LiveData.java */
    /* renamed from: androidx.lifecycle.x$b */
    public class b extends AbstractC0557x<T>.d {
        @Override // androidx.lifecycle.AbstractC0557x.d
        public final boolean e() {
            return true;
        }
    }

    /* compiled from: LiveData.java */
    /* renamed from: androidx.lifecycle.x$c */
    public class c extends AbstractC0557x<T>.d implements InterfaceC0550p {

        /* renamed from: e, reason: collision with root package name */
        public final r f7109e;

        public c(r rVar, A<? super T> a10) {
            super(a10);
            this.f7109e = rVar;
        }

        @Override // androidx.lifecycle.AbstractC0557x.d
        public final void b() {
            this.f7109e.getLifecycle().c(this);
        }

        @Override // androidx.lifecycle.AbstractC0557x.d
        public final boolean c(r rVar) {
            return this.f7109e == rVar;
        }

        @Override // androidx.lifecycle.InterfaceC0550p
        public final void d(r rVar, Lifecycle.Event event) {
            r rVar2 = this.f7109e;
            Lifecycle.State b9 = rVar2.getLifecycle().b();
            if (b9 == Lifecycle.State.f6975a) {
                AbstractC0557x.this.removeObserver(this.f7111a);
                return;
            }
            Lifecycle.State state = null;
            while (state != b9) {
                a(e());
                state = b9;
                b9 = rVar2.getLifecycle().b();
            }
        }

        @Override // androidx.lifecycle.AbstractC0557x.d
        public final boolean e() {
            return this.f7109e.getLifecycle().b().a(Lifecycle.State.f6978d);
        }
    }

    public AbstractC0557x(T t3) {
        this.mDataLock = new Object();
        this.mObservers = new o.b<>();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new a();
        this.mData = t3;
        this.mVersion = 0;
    }

    public static void assertMainThread(String str) {
        C1058a.f().f24059b.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(androidx.camera.core.n.a("Cannot invoke ", str, " on a background thread"));
        }
    }

    private void considerNotify(AbstractC0557x<T>.d dVar) {
        if (dVar.f7112b) {
            if (!dVar.e()) {
                dVar.a(false);
                return;
            }
            int i = dVar.f7113c;
            int i9 = this.mVersion;
            if (i >= i9) {
                return;
            }
            dVar.f7113c = i9;
            dVar.f7111a.onChanged((Object) this.mData);
        }
    }

    public void changeActiveCounter(int i) {
        int i9 = this.mActiveCount;
        this.mActiveCount = i + i9;
        if (this.mChangingActiveState) {
            return;
        }
        this.mChangingActiveState = true;
        while (true) {
            try {
                int i10 = this.mActiveCount;
                if (i9 == i10) {
                    this.mChangingActiveState = false;
                    return;
                }
                boolean z10 = i9 == 0 && i10 > 0;
                boolean z11 = i9 > 0 && i10 == 0;
                if (z10) {
                    onActive();
                } else if (z11) {
                    onInactive();
                }
                i9 = i10;
            } catch (Throwable th) {
                this.mChangingActiveState = false;
                throw th;
            }
        }
    }

    public void dispatchingValue(AbstractC0557x<T>.d dVar) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (dVar != null) {
                considerNotify(dVar);
                dVar = null;
            } else {
                o.b<A<? super T>, AbstractC0557x<T>.d> bVar = this.mObservers;
                bVar.getClass();
                b.d dVar2 = new b.d();
                bVar.f24328c.put(dVar2, Boolean.FALSE);
                while (dVar2.hasNext()) {
                    considerNotify((d) ((Map.Entry) dVar2.next()).getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    public T getValue() {
        T t3 = (T) this.mData;
        if (t3 != NOT_SET) {
            return t3;
        }
        return null;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public boolean hasActiveObservers() {
        return this.mActiveCount > 0;
    }

    public boolean hasObservers() {
        return this.mObservers.f24329d > 0;
    }

    public boolean isInitialized() {
        return this.mData != NOT_SET;
    }

    public void observe(r rVar, A<? super T> a10) {
        assertMainThread("observe");
        if (rVar.getLifecycle().b() == Lifecycle.State.f6975a) {
            return;
        }
        c cVar = new c(rVar, a10);
        AbstractC0557x<T>.d b9 = this.mObservers.b(a10, cVar);
        if (b9 != null && !b9.c(rVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (b9 != null) {
            return;
        }
        rVar.getLifecycle().a(cVar);
    }

    public void observeForever(A<? super T> a10) {
        assertMainThread("observeForever");
        b bVar = new b(a10);
        AbstractC0557x<T>.d b9 = this.mObservers.b(a10, bVar);
        if (b9 instanceof c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (b9 != null) {
            return;
        }
        bVar.a(true);
    }

    public void postValue(T t3) {
        boolean z10;
        synchronized (this.mDataLock) {
            z10 = this.mPendingData == NOT_SET;
            this.mPendingData = t3;
        }
        if (z10) {
            C1058a.f().h(this.mPostValueRunnable);
        }
    }

    public void removeObserver(A<? super T> a10) {
        assertMainThread("removeObserver");
        AbstractC0557x<T>.d c2 = this.mObservers.c(a10);
        if (c2 == null) {
            return;
        }
        c2.b();
        c2.a(false);
    }

    public void removeObservers(r rVar) {
        assertMainThread("removeObservers");
        Iterator<Map.Entry<A<? super T>, AbstractC0557x<T>.d>> it = this.mObservers.iterator();
        while (true) {
            b.e eVar = (b.e) it;
            if (!eVar.hasNext()) {
                return;
            }
            Map.Entry entry = (Map.Entry) eVar.next();
            if (((d) entry.getValue()).c(rVar)) {
                removeObserver((A) entry.getKey());
            }
        }
    }

    public void setValue(T t3) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = t3;
        dispatchingValue(null);
    }

    public AbstractC0557x() {
        this.mDataLock = new Object();
        this.mObservers = new o.b<>();
        this.mActiveCount = 0;
        Object obj = NOT_SET;
        this.mPendingData = obj;
        this.mPostValueRunnable = new a();
        this.mData = obj;
        this.mVersion = -1;
    }

    /* compiled from: LiveData.java */
    /* renamed from: androidx.lifecycle.x$d */
    public abstract class d {

        /* renamed from: a, reason: collision with root package name */
        public final A<? super T> f7111a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f7112b;

        /* renamed from: c, reason: collision with root package name */
        public int f7113c = -1;

        public d(A<? super T> a10) {
            this.f7111a = a10;
        }

        public final void a(boolean z10) {
            if (z10 == this.f7112b) {
                return;
            }
            this.f7112b = z10;
            int i = z10 ? 1 : -1;
            AbstractC0557x abstractC0557x = AbstractC0557x.this;
            abstractC0557x.changeActiveCounter(i);
            if (this.f7112b) {
                abstractC0557x.dispatchingValue(this);
            }
        }

        public boolean c(r rVar) {
            return false;
        }

        public abstract boolean e();

        public void b() {
        }
    }

    public void onActive() {
    }

    public void onInactive() {
    }
}

package androidx.paging;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p.InterfaceC1096a;

/* compiled from: DataSource.java */
/* loaded from: classes.dex */
public abstract class c<Key, Value> {
    private AtomicBoolean mInvalid = new AtomicBoolean(false);
    private CopyOnWriteArrayList<b> mOnInvalidatedCallbacks = new CopyOnWriteArrayList<>();

    /* JADX INFO: Add missing generic type declarations: [X, Y] */
    /* compiled from: DataSource.java */
    public static class a<X, Y> implements InterfaceC1096a<List<X>, List<Y>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1096a f7342a;

        public a(InterfaceC1096a interfaceC1096a) {
            this.f7342a = interfaceC1096a;
        }

        @Override // p.InterfaceC1096a
        public final Object apply(Object obj) {
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(this.f7342a.apply(list.get(i)));
            }
            return arrayList;
        }
    }

    /* compiled from: DataSource.java */
    public interface b {
        void a();
    }

    /* compiled from: DataSource.java */
    /* renamed from: androidx.paging.c$c, reason: collision with other inner class name */
    public static class C0079c<T> {

        /* renamed from: a, reason: collision with root package name */
        public final int f7343a;

        /* renamed from: b, reason: collision with root package name */
        public final c f7344b;

        /* renamed from: d, reason: collision with root package name */
        public Executor f7346d;

        /* renamed from: c, reason: collision with root package name */
        public final Object f7345c = new Object();

        /* renamed from: e, reason: collision with root package name */
        public boolean f7347e = false;

        /* compiled from: DataSource.java */
        /* renamed from: androidx.paging.c$c$a */
        public class a implements Runnable {
            public a(d dVar) {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0079c c0079c = C0079c.this;
                c0079c.getClass();
                int i = c0079c.f7343a;
                throw null;
            }
        }

        public C0079c(c cVar, int i, Executor executor) {
            this.f7344b = cVar;
            this.f7343a = i;
            this.f7346d = executor;
        }

        public final void a(d<T> dVar) {
            Executor executor;
            synchronized (this.f7345c) {
                if (this.f7347e) {
                    throw new IllegalStateException("callback.onResult already called, cannot call again.");
                }
                this.f7347e = true;
                executor = this.f7346d;
            }
            executor.getClass();
            executor.execute(new a(dVar));
        }
    }

    public static <A, B> List<B> convert(InterfaceC1096a<List<A>, List<B>> interfaceC1096a, List<A> list) {
        List<B> apply = interfaceC1096a.apply(list);
        if (apply.size() == list.size()) {
            return apply;
        }
        throw new IllegalStateException("Invalid Function " + interfaceC1096a + " changed return size. This is not supported.");
    }

    public static <X, Y> InterfaceC1096a<List<X>, List<Y>> createListFunction(InterfaceC1096a<X, Y> interfaceC1096a) {
        return new a(interfaceC1096a);
    }

    public void addInvalidatedCallback(b bVar) {
        this.mOnInvalidatedCallbacks.add(bVar);
    }

    public void invalidate() {
        if (this.mInvalid.compareAndSet(false, true)) {
            Iterator<b> it = this.mOnInvalidatedCallbacks.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public abstract boolean isContiguous();

    public boolean isInvalid() {
        return this.mInvalid.get();
    }

    public abstract <ToValue> c<Key, ToValue> map(InterfaceC1096a<Value, ToValue> interfaceC1096a);

    public abstract <ToValue> c<Key, ToValue> mapByPage(InterfaceC1096a<List<Value>, List<ToValue>> interfaceC1096a);

    public void removeInvalidatedCallback(b bVar) {
        this.mOnInvalidatedCallbacks.remove(bVar);
    }
}

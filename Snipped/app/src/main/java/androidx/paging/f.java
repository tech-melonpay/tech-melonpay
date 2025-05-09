package androidx.paging;

import androidx.paging.c;
import androidx.paging.d;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import p.InterfaceC1096a;

/* compiled from: PositionalDataSource.java */
/* loaded from: classes.dex */
public abstract class f<T> extends androidx.paging.c<Integer, T> {

    /* compiled from: PositionalDataSource.java */
    public static class a<Value> extends androidx.paging.b<Integer, Value> {

        /* renamed from: a, reason: collision with root package name */
        public final f<Value> f7357a;

        public a(f<Value> fVar) {
            this.f7357a = fVar;
        }

        @Override // androidx.paging.c
        public final void addInvalidatedCallback(c.b bVar) {
            this.f7357a.addInvalidatedCallback(bVar);
        }

        @Override // androidx.paging.c
        public final void invalidate() {
            this.f7357a.invalidate();
        }

        @Override // androidx.paging.c
        public final boolean isInvalid() {
            return this.f7357a.isInvalid();
        }

        @Override // androidx.paging.c
        public final <ToValue> androidx.paging.c<Integer, ToValue> map(InterfaceC1096a<Value, ToValue> interfaceC1096a) {
            throw new UnsupportedOperationException("Inaccessible inner type doesn't support map op");
        }

        @Override // androidx.paging.c
        public final <ToValue> androidx.paging.c<Integer, ToValue> mapByPage(InterfaceC1096a<List<Value>, List<ToValue>> interfaceC1096a) {
            throw new UnsupportedOperationException("Inaccessible inner type doesn't support map op");
        }

        @Override // androidx.paging.c
        public final void removeInvalidatedCallback(c.b bVar) {
            this.f7357a.removeInvalidatedCallback(bVar);
        }
    }

    /* compiled from: PositionalDataSource.java */
    public static abstract class b<T> {
        public abstract void a(List<T> list, int i, int i9);
    }

    /* compiled from: PositionalDataSource.java */
    public static class c<T> extends b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final c.C0079c<T> f7358a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f7359b;

        /* renamed from: c, reason: collision with root package name */
        public final int f7360c;

        public c(f fVar, boolean z10, int i) {
            this.f7358a = new c.C0079c<>(fVar, 0, null);
            this.f7359b = z10;
            this.f7360c = i;
            if (i < 1) {
                throw new IllegalArgumentException("Page size must be non-negative");
            }
        }

        @Override // androidx.paging.f.b
        public final void a(List<T> list, int i, int i9) {
            c.C0079c<T> c0079c = this.f7358a;
            if (c0079c.f7344b.isInvalid()) {
                c0079c.a(androidx.paging.d.f7349e);
                return;
            }
            if (i < 0) {
                throw new IllegalArgumentException("Position must be non-negative");
            }
            if (list.size() + i > i9) {
                throw new IllegalArgumentException("List size + position too large, last item in list beyond totalCount.");
            }
            if (list.size() == 0 && i9 > 0) {
                throw new IllegalArgumentException("Initial result cannot be empty if items are present in data set.");
            }
            if (list.size() + i != i9) {
                int size = list.size();
                int i10 = this.f7360c;
                if (size % i10 != 0) {
                    throw new IllegalArgumentException("PositionalDataSource requires initial load size to be a multiple of page size to support internal tiling. loadSize " + list.size() + ", position " + i + ", totalCount " + i9 + ", pageSize " + i10);
                }
            }
            if (this.f7359b) {
                c0079c.a(new androidx.paging.d<>(list, i, (i9 - i) - list.size(), 0));
            } else {
                c0079c.a(new androidx.paging.d<>(list, i));
            }
        }
    }

    /* compiled from: PositionalDataSource.java */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f7361a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7362b;

        /* renamed from: c, reason: collision with root package name */
        public final int f7363c;

        public d(int i, int i9, int i10) {
            this.f7361a = i;
            this.f7362b = i9;
            this.f7363c = i10;
        }
    }

    /* compiled from: PositionalDataSource.java */
    public static abstract class e<T> {
        public abstract void a(List<T> list);
    }

    /* compiled from: PositionalDataSource.java */
    /* renamed from: androidx.paging.f$f, reason: collision with other inner class name */
    public static class C0080f<T> extends e<T> {

        /* renamed from: a, reason: collision with root package name */
        public final c.C0079c<T> f7364a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7365b;

        public C0080f(f fVar, int i, int i9, Executor executor) {
            this.f7364a = new c.C0079c<>(fVar, i, executor);
            this.f7365b = i9;
        }

        @Override // androidx.paging.f.e
        public final void a(List<T> list) {
            c.C0079c<T> c0079c = this.f7364a;
            if (c0079c.f7344b.isInvalid()) {
                c0079c.a(androidx.paging.d.f7349e);
            } else {
                c0079c.a(new androidx.paging.d<>(list, 0, 0, this.f7365b));
            }
        }
    }

    /* compiled from: PositionalDataSource.java */
    public static class g {

        /* renamed from: a, reason: collision with root package name */
        public final int f7366a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7367b;

        public g(int i, int i9) {
            this.f7366a = i;
            this.f7367b = i9;
        }
    }

    public static int computeInitialLoadPosition(d dVar, int i) {
        int i9 = dVar.f7361a;
        int i10 = dVar.f7363c;
        return Math.max(0, Math.min(((((i - dVar.f7362b) + i10) - 1) / i10) * i10, Math.round(i9 / i10) * i10));
    }

    public static int computeInitialLoadSize(d dVar, int i, int i9) {
        return Math.min(i9 - i, dVar.f7362b);
    }

    public final void dispatchLoadInitial(boolean z10, int i, int i9, int i10, Executor executor, d.a<T> aVar) {
        c cVar = new c(this, z10, i10);
        loadInitial(new d(i, i9, i10), cVar);
        c.C0079c<T> c0079c = cVar.f7358a;
        synchronized (c0079c.f7345c) {
            c0079c.f7346d = executor;
        }
    }

    public final void dispatchLoadRange(int i, int i9, int i10, Executor executor, d.a<T> aVar) {
        C0080f c0080f = new C0080f(this, i, i9, executor);
        if (i10 == 0) {
            c0080f.a(Collections.emptyList());
        } else {
            loadRange(new g(i9, i10), c0080f);
        }
    }

    @Override // androidx.paging.c
    public boolean isContiguous() {
        return false;
    }

    public abstract void loadInitial(d dVar, b<T> bVar);

    public abstract void loadRange(g gVar, e<T> eVar);

    public androidx.paging.b<Integer, T> wrapAsContiguousWithoutPlaceholders() {
        return new a(this);
    }

    @Override // androidx.paging.c
    public final <V> f<V> map(InterfaceC1096a<T, V> interfaceC1096a) {
        return mapByPage((InterfaceC1096a) androidx.paging.c.createListFunction(interfaceC1096a));
    }

    @Override // androidx.paging.c
    public final <V> f<V> mapByPage(InterfaceC1096a<List<T>, List<V>> interfaceC1096a) {
        return new androidx.paging.g(this, interfaceC1096a);
    }
}

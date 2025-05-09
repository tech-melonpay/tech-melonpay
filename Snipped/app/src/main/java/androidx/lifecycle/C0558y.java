package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
import o.b;

/* compiled from: MediatorLiveData.java */
/* renamed from: androidx.lifecycle.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0558y<T> extends C0559z<T> {

    /* renamed from: a, reason: collision with root package name */
    public final o.b<AbstractC0557x<?>, a<?>> f7115a;

    /* compiled from: MediatorLiveData.java */
    /* renamed from: androidx.lifecycle.y$a */
    public static class a<V> implements A<V> {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC0557x<V> f7116a;

        /* renamed from: b, reason: collision with root package name */
        public final A<? super V> f7117b;

        /* renamed from: c, reason: collision with root package name */
        public int f7118c = -1;

        public a(AbstractC0557x<V> abstractC0557x, A<? super V> a10) {
            this.f7116a = abstractC0557x;
            this.f7117b = a10;
        }

        @Override // androidx.lifecycle.A
        public final void onChanged(V v10) {
            int i = this.f7118c;
            AbstractC0557x<V> abstractC0557x = this.f7116a;
            if (i != abstractC0557x.getVersion()) {
                this.f7118c = abstractC0557x.getVersion();
                this.f7117b.onChanged(v10);
            }
        }
    }

    public C0558y(T t3) {
        super(t3);
        this.f7115a = new o.b<>();
    }

    public <S> void a(AbstractC0557x<S> abstractC0557x, A<? super S> a10) {
        if (abstractC0557x == null) {
            throw new NullPointerException("source cannot be null");
        }
        a<?> aVar = new a<>(abstractC0557x, a10);
        a<?> b9 = this.f7115a.b(abstractC0557x, aVar);
        if (b9 != null && b9.f7117b != a10) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (b9 == null && hasActiveObservers()) {
            abstractC0557x.observeForever(aVar);
        }
    }

    @Override // androidx.lifecycle.AbstractC0557x
    public final void onActive() {
        Iterator<Map.Entry<AbstractC0557x<?>, a<?>>> it = this.f7115a.iterator();
        while (true) {
            b.e eVar = (b.e) it;
            if (!eVar.hasNext()) {
                return;
            }
            a aVar = (a) ((Map.Entry) eVar.next()).getValue();
            aVar.f7116a.observeForever(aVar);
        }
    }

    @Override // androidx.lifecycle.AbstractC0557x
    public final void onInactive() {
        Iterator<Map.Entry<AbstractC0557x<?>, a<?>>> it = this.f7115a.iterator();
        while (true) {
            b.e eVar = (b.e) it;
            if (!eVar.hasNext()) {
                return;
            }
            a aVar = (a) ((Map.Entry) eVar.next()).getValue();
            aVar.f7116a.removeObserver(aVar);
        }
    }

    public C0558y() {
        this.f7115a = new o.b<>();
    }
}

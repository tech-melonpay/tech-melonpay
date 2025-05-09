package androidx.recyclerview.widget;

import a0.C0506b;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ViewInfoStore.java */
/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.collection.g<RecyclerView.C, a> f7470a = new androidx.collection.g<>();

    /* renamed from: b, reason: collision with root package name */
    public final androidx.collection.d<RecyclerView.C> f7471b = new androidx.collection.d<>();

    /* compiled from: ViewInfoStore.java */
    public static class a {

        /* renamed from: d, reason: collision with root package name */
        public static final C0506b f7472d = new C0506b(20);

        /* renamed from: a, reason: collision with root package name */
        public int f7473a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView.k.c f7474b;

        /* renamed from: c, reason: collision with root package name */
        public RecyclerView.k.c f7475c;

        public static a a() {
            a aVar = (a) f7472d.acquire();
            return aVar == null ? new a() : aVar;
        }
    }

    /* compiled from: ViewInfoStore.java */
    public interface b {
    }

    public final void a(RecyclerView.C c2, RecyclerView.k.c cVar) {
        androidx.collection.g<RecyclerView.C, a> gVar = this.f7470a;
        a aVar = gVar.get(c2);
        if (aVar == null) {
            aVar = a.a();
            gVar.put(c2, aVar);
        }
        aVar.f7475c = cVar;
        aVar.f7473a |= 8;
    }

    public final RecyclerView.k.c b(RecyclerView.C c2, int i) {
        a valueAt;
        RecyclerView.k.c cVar;
        androidx.collection.g<RecyclerView.C, a> gVar = this.f7470a;
        int indexOfKey = gVar.indexOfKey(c2);
        if (indexOfKey >= 0 && (valueAt = gVar.valueAt(indexOfKey)) != null) {
            int i9 = valueAt.f7473a;
            if ((i9 & i) != 0) {
                int i10 = i9 & (~i);
                valueAt.f7473a = i10;
                if (i == 4) {
                    cVar = valueAt.f7474b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    cVar = valueAt.f7475c;
                }
                if ((i10 & 12) == 0) {
                    gVar.removeAt(indexOfKey);
                    valueAt.f7473a = 0;
                    valueAt.f7474b = null;
                    valueAt.f7475c = null;
                    a.f7472d.release(valueAt);
                }
                return cVar;
            }
        }
        return null;
    }

    public final void c(RecyclerView.C c2) {
        a aVar = this.f7470a.get(c2);
        if (aVar == null) {
            return;
        }
        aVar.f7473a &= -2;
    }

    public final void d(RecyclerView.C c2) {
        androidx.collection.d<RecyclerView.C> dVar = this.f7471b;
        int size = dVar.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            if (c2 == dVar.valueAt(size)) {
                dVar.removeAt(size);
                break;
            }
            size--;
        }
        a remove = this.f7470a.remove(c2);
        if (remove != null) {
            remove.f7473a = 0;
            remove.f7474b = null;
            remove.f7475c = null;
            a.f7472d.release(remove);
        }
    }
}

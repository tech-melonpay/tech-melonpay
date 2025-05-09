package h0;

import a0.C0506b;
import androidx.collection.g;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: DirectedAcyclicGraph.java */
/* renamed from: h0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0791a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final C0506b f21017a = new C0506b(10);

    /* renamed from: b, reason: collision with root package name */
    public final g<T, ArrayList<T>> f21018b = new g<>();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<T> f21019c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    public final HashSet<T> f21020d = new HashSet<>();

    public final void a(T t3, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t3)) {
            return;
        }
        if (hashSet.contains(t3)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t3);
        ArrayList<T> arrayList2 = this.f21018b.get(t3);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                a(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(t3);
        arrayList.add(t3);
    }
}

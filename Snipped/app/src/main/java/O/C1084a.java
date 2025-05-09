package o;

import java.util.HashMap;
import o.b;

/* compiled from: FastSafeIterableMap.java */
/* renamed from: o.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1084a<K, V> extends b<K, V> {

    /* renamed from: e, reason: collision with root package name */
    public final HashMap<K, b.c<K, V>> f24325e = new HashMap<>();

    @Override // o.b
    public final b.c<K, V> a(K k3) {
        return this.f24325e.get(k3);
    }

    @Override // o.b
    public final V b(K k3, V v10) {
        b.c<K, V> a10 = a(k3);
        if (a10 != null) {
            return a10.f24331b;
        }
        HashMap<K, b.c<K, V>> hashMap = this.f24325e;
        b.c<K, V> cVar = new b.c<>(k3, v10);
        this.f24329d++;
        b.c<K, V> cVar2 = this.f24327b;
        if (cVar2 == null) {
            this.f24326a = cVar;
            this.f24327b = cVar;
        } else {
            cVar2.f24332c = cVar;
            cVar.f24333d = cVar2;
            this.f24327b = cVar;
        }
        hashMap.put(k3, cVar);
        return null;
    }

    @Override // o.b
    public final V c(K k3) {
        V v10 = (V) super.c(k3);
        this.f24325e.remove(k3);
        return v10;
    }
}

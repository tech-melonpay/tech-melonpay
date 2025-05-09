package androidx.collection;

import P9.w;

/* compiled from: SparseArray.kt */
/* loaded from: classes.dex */
public final class i extends w {

    /* renamed from: a, reason: collision with root package name */
    public int f5903a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h<Object> f5904b;

    public i(h<Object> hVar) {
        this.f5904b = hVar;
    }

    @Override // P9.w
    public final int a() {
        int i = this.f5903a;
        this.f5903a = i + 1;
        return this.f5904b.d(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5903a < this.f5904b.f();
    }
}

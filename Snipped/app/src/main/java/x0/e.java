package x0;

import a0.C0506b;

/* compiled from: Pools.kt */
/* loaded from: classes.dex */
public final class e<T> extends C0506b {

    /* renamed from: c, reason: collision with root package name */
    public final Object f30907c;

    public e(int i) {
        super(i);
        this.f30907c = new Object();
    }

    @Override // a0.C0506b, x0.d
    public final T acquire() {
        T t3;
        synchronized (this.f30907c) {
            t3 = (T) super.acquire();
        }
        return t3;
    }

    @Override // a0.C0506b, x0.d
    public final boolean release(T t3) {
        boolean release;
        synchronized (this.f30907c) {
            release = super.release(t3);
        }
        return release;
    }
}

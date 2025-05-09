package t6;

/* compiled from: LoadingDialogBindingImpl.java */
/* loaded from: classes2.dex */
public final class J6 extends I6 {

    /* renamed from: p, reason: collision with root package name */
    public long f28034p;

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28034p = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28034p != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        return true;
    }
}

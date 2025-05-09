package androidx.work;

/* compiled from: Worker.java */
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Worker f8132a;

    public d(Worker worker) {
        this.f8132a = worker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Worker worker = this.f8132a;
        try {
            worker.f8110f.i(worker.h());
        } catch (Throwable th) {
            worker.f8110f.j(th);
        }
    }
}

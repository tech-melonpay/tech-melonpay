package androidx.lifecycle;

import java.util.ArrayDeque;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* compiled from: DispatchQueue.jvm.kt */
/* renamed from: androidx.lifecycle.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0540f {

    /* renamed from: b, reason: collision with root package name */
    public boolean f7083b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7084c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f7082a = true;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f7085d = new ArrayDeque();

    public final void a(kotlin.coroutines.d dVar, Runnable runnable) {
        MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
        if (immediate.isDispatchNeeded(dVar) || this.f7083b || !this.f7082a) {
            immediate.mo168dispatch(dVar, new B6.d(25, this, runnable));
        } else {
            if (!this.f7085d.offer(runnable)) {
                throw new IllegalStateException("cannot enqueue any more runnables".toString());
            }
            b();
        }
    }

    public final void b() {
        if (this.f7084c) {
            return;
        }
        try {
            this.f7084c = true;
            while (true) {
                ArrayDeque arrayDeque = this.f7085d;
                if (!(!arrayDeque.isEmpty()) || (!this.f7083b && this.f7082a)) {
                    break;
                }
                Runnable runnable = (Runnable) arrayDeque.poll();
                if (runnable != null) {
                    runnable.run();
                }
            }
        } finally {
            this.f7084c = false;
        }
    }
}

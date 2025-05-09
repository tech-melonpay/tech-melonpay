package A3;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f77a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f78b;

    public /* synthetic */ n(Runnable runnable, int i) {
        this.f77a = i;
        this.f78b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f77a) {
            case 0:
                h.f67b.set(new ArrayDeque());
                this.f78b.run();
                break;
            default:
                Deque deque = (Deque) h.f67b.get();
                Preconditions.checkNotNull(deque);
                Runnable runnable = this.f78b;
                deque.add(runnable);
                if (deque.size() <= 1) {
                    do {
                        runnable.run();
                        deque.removeFirst();
                        runnable = (Runnable) deque.peekFirst();
                    } while (runnable != null);
                }
                break;
        }
    }
}

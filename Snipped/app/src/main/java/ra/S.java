package ra;

import ca.InterfaceC0635a;
import java.lang.ref.SoftReference;

/* compiled from: Caching.kt */
/* loaded from: classes2.dex */
public final class S<T> {
    public volatile SoftReference<T> reference = new SoftReference<>(null);

    public final synchronized T a(InterfaceC0635a<? extends T> interfaceC0635a) {
        T t3 = this.reference.get();
        if (t3 != null) {
            return t3;
        }
        T invoke = interfaceC0635a.invoke();
        this.reference = new SoftReference<>(invoke);
        return invoke;
    }
}

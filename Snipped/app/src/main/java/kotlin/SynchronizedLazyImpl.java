package kotlin;

import O9.f;
import O9.m;
import ca.InterfaceC0635a;
import java.io.Serializable;

/* compiled from: LazyJVM.kt */
/* loaded from: classes2.dex */
final class SynchronizedLazyImpl<T> implements f<T>, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC0635a<? extends T> f23096a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f23097b = m.f3029a;

    /* renamed from: c, reason: collision with root package name */
    public final Object f23098c = this;

    public SynchronizedLazyImpl(InterfaceC0635a interfaceC0635a) {
        this.f23096a = interfaceC0635a;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // O9.f
    public final boolean c() {
        return this.f23097b != m.f3029a;
    }

    @Override // O9.f
    public final T getValue() {
        T t3;
        T t10 = (T) this.f23097b;
        m mVar = m.f3029a;
        if (t10 != mVar) {
            return t10;
        }
        synchronized (this.f23098c) {
            t3 = (T) this.f23097b;
            if (t3 == mVar) {
                t3 = this.f23096a.invoke();
                this.f23097b = t3;
                this.f23096a = null;
            }
        }
        return t3;
    }

    public final String toString() {
        return c() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

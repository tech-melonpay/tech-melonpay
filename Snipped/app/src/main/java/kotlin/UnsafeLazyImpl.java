package kotlin;

import O9.f;
import O9.m;
import ca.InterfaceC0635a;
import java.io.Serializable;

/* compiled from: Lazy.kt */
/* loaded from: classes2.dex */
public final class UnsafeLazyImpl<T> implements f<T>, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC0635a<? extends T> f23102a;

    /* renamed from: b, reason: collision with root package name */
    public Object f23103b;

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // O9.f
    public final boolean c() {
        return this.f23103b != m.f3029a;
    }

    @Override // O9.f
    public final T getValue() {
        if (this.f23103b == m.f3029a) {
            this.f23103b = this.f23102a.invoke();
            this.f23102a = null;
        }
        return (T) this.f23103b;
    }

    public final String toString() {
        return c() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

package kotlin;

import O9.f;
import O9.m;
import ca.InterfaceC0635a;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: LazyJVM.kt */
/* loaded from: classes2.dex */
final class SafePublicationLazyImpl<T> implements f<T>, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> f23093c = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "b");

    /* renamed from: a, reason: collision with root package name */
    public volatile InterfaceC0635a<? extends T> f23094a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f23095b;

    public SafePublicationLazyImpl() {
        throw null;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // O9.f
    public final boolean c() {
        return this.f23095b != m.f3029a;
    }

    @Override // O9.f
    public final T getValue() {
        T t3 = (T) this.f23095b;
        m mVar = m.f3029a;
        if (t3 != mVar) {
            return t3;
        }
        InterfaceC0635a<? extends T> interfaceC0635a = this.f23094a;
        if (interfaceC0635a != null) {
            T invoke = interfaceC0635a.invoke();
            AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> atomicReferenceFieldUpdater = f23093c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != mVar) {
                }
            }
            this.f23094a = null;
            return invoke;
        }
        return (T) this.f23095b;
    }

    public final String toString() {
        return c() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

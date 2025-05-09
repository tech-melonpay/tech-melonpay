package kotlin;

import O9.f;
import java.io.Serializable;

/* compiled from: Lazy.kt */
/* loaded from: classes2.dex */
public final class InitializedLazyImpl<T> implements f<T>, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final T f23084a;

    public InitializedLazyImpl(T t3) {
        this.f23084a = t3;
    }

    @Override // O9.f
    public final boolean c() {
        throw null;
    }

    @Override // O9.f
    public final T getValue() {
        return this.f23084a;
    }

    public final String toString() {
        return String.valueOf(this.f23084a);
    }
}

package O9;

import ca.InterfaceC0651q;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: DeepRecursive.kt */
/* loaded from: classes2.dex */
public final class c<T, R> extends b<T, R> implements T9.a<R> {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC0651q<? super b<?, ?>, Object, ? super T9.a<Object>, ? extends Object> f3008a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3009b;

    /* renamed from: c, reason: collision with root package name */
    public T9.a<Object> f3010c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3011d;

    @Override // O9.b
    public final void a(p pVar, T9.a aVar) {
        this.f3010c = aVar;
        this.f3009b = pVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
    }

    @Override // T9.a
    public final kotlin.coroutines.d getContext() {
        return EmptyCoroutineContext.f23155a;
    }

    @Override // T9.a
    public final void resumeWith(Object obj) {
        this.f3010c = null;
        this.f3011d = obj;
    }
}

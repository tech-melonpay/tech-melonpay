package T9;

import V9.c;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: SafeContinuationJvm.kt */
/* loaded from: classes2.dex */
public final class b<T> implements a<T>, c {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<b<?>, Object> f3586b = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "result");

    /* renamed from: a, reason: collision with root package name */
    public final a<T> f3587a;
    private volatile Object result;

    public b() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(a<? super T> aVar) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23159b;
        this.f3587a = aVar;
        this.result = coroutineSingletons;
    }

    public final Object a() {
        Object obj = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23159b;
        if (obj == coroutineSingletons) {
            AtomicReferenceFieldUpdater<b<?>, Object> atomicReferenceFieldUpdater = f3586b;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.f23158a;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, coroutineSingletons, coroutineSingletons2)) {
                if (atomicReferenceFieldUpdater.get(this) != coroutineSingletons) {
                    obj = this.result;
                }
            }
            return CoroutineSingletons.f23158a;
        }
        if (obj == CoroutineSingletons.f23160c) {
            return CoroutineSingletons.f23158a;
        }
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).f23092a;
        }
        return obj;
    }

    @Override // V9.c
    public final c getCallerFrame() {
        a<T> aVar = this.f3587a;
        if (aVar instanceof c) {
            return (c) aVar;
        }
        return null;
    }

    @Override // T9.a
    public final d getContext() {
        return this.f3587a.getContext();
    }

    @Override // V9.c
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // T9.a
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23159b;
            if (obj2 == coroutineSingletons) {
                AtomicReferenceFieldUpdater<b<?>, Object> atomicReferenceFieldUpdater = f3586b;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, coroutineSingletons, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != coroutineSingletons) {
                        break;
                    }
                }
                return;
            }
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.f23158a;
            if (obj2 != coroutineSingletons2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater<b<?>, Object> atomicReferenceFieldUpdater2 = f3586b;
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.f23160c;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, coroutineSingletons2, coroutineSingletons3)) {
                if (atomicReferenceFieldUpdater2.get(this) != coroutineSingletons2) {
                    break;
                }
            }
            this.f3587a.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f3587a;
    }
}

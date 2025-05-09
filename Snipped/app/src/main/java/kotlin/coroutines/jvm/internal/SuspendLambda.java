package kotlin.coroutines.jvm.internal;

import T9.a;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes2.dex */
public abstract class SuspendLambda extends ContinuationImpl implements e<Object> {
    private final int arity;

    public SuspendLambda(int i, a<Object> aVar) {
        super(aVar);
        this.arity = i;
    }

    @Override // kotlin.jvm.internal.e
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        h.f23186a.getClass();
        return i.a(this);
    }

    public SuspendLambda(int i) {
        this(i, null);
    }
}

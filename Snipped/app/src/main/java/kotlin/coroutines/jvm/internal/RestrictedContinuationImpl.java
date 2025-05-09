package kotlin.coroutines.jvm.internal;

import T9.a;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes2.dex */
public abstract class RestrictedContinuationImpl extends BaseContinuationImpl {
    public RestrictedContinuationImpl(a<Object> aVar) {
        super(aVar);
        if (aVar != null && aVar.getContext() != EmptyCoroutineContext.f23155a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }

    @Override // T9.a
    public d getContext() {
        return EmptyCoroutineContext.f23155a;
    }
}

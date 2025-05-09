package kotlin.coroutines.jvm.internal;

import T9.a;
import V9.b;
import kotlin.coroutines.c;
import kotlin.coroutines.d;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes2.dex */
public abstract class ContinuationImpl extends BaseContinuationImpl {
    private final d _context;
    private transient a<Object> intercepted;

    public ContinuationImpl(a<Object> aVar, d dVar) {
        super(aVar);
        this._context = dVar;
    }

    @Override // T9.a
    public d getContext() {
        return this._context;
    }

    public final a<Object> intercepted() {
        a<Object> aVar = this.intercepted;
        if (aVar == null) {
            c cVar = (c) getContext().get(c.a.f23157a);
            if (cVar == null || (aVar = cVar.interceptContinuation(this)) == null) {
                aVar = this;
            }
            this.intercepted = aVar;
        }
        return aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        a<?> aVar = this.intercepted;
        if (aVar != null && aVar != this) {
            ((c) getContext().get(c.a.f23157a)).releaseInterceptedContinuation(aVar);
        }
        this.intercepted = b.f3768a;
    }

    public ContinuationImpl(a<Object> aVar) {
        this(aVar, aVar != null ? aVar.getContext() : null);
    }
}

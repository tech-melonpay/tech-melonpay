package kotlinx.coroutines.test;

import O9.p;
import P9.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.internal.CoroutineExceptionHandlerImpl_commonKt;

/* compiled from: TestCoroutineExceptionHandler.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u0004R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/test/TestCoroutineExceptionHandler;", "Lkotlin/coroutines/a;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "<init>", "()V", "Lkotlin/coroutines/d;", "context", "", "exception", "LO9/p;", "handleException", "(Lkotlin/coroutines/d;Ljava/lang/Throwable;)V", "cleanupTestCoroutines", "", "_exceptions", "Ljava/util/List;", "", "_lock", "Ljava/lang/Object;", "", "_coroutinesCleanedUp", "Z", "", "getUncaughtExceptions", "()Ljava/util/List;", "uncaughtExceptions", "kotlinx-coroutines-test"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class TestCoroutineExceptionHandler extends kotlin.coroutines.a implements CoroutineExceptionHandler {
    private boolean _coroutinesCleanedUp;
    private final List<Throwable> _exceptions;
    private final Object _lock;

    public TestCoroutineExceptionHandler() {
        super(CoroutineExceptionHandler.INSTANCE);
        this._exceptions = new ArrayList();
        this._lock = new Object();
    }

    public final void cleanupTestCoroutines() {
        synchronized (this._lock) {
            try {
                this._coroutinesCleanedUp = true;
                Throwable th = (Throwable) s.L(this._exceptions);
                if (th != null) {
                    Iterator it = s.G(this._exceptions).iterator();
                    while (it.hasNext()) {
                        ((Throwable) it.next()).printStackTrace();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final List<Throwable> getUncaughtExceptions() {
        List<Throwable> c02;
        synchronized (this._lock) {
            c02 = s.c0(this._exceptions);
        }
        return c02;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(kotlin.coroutines.d context, Throwable exception) {
        synchronized (this._lock) {
            try {
                if (this._coroutinesCleanedUp) {
                    CoroutineExceptionHandlerImpl_commonKt.handleUncaughtCoroutineException(context, exception);
                }
                this._exceptions.add(exception);
                p pVar = p.f3034a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

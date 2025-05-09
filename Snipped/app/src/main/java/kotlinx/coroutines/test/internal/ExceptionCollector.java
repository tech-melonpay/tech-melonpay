package kotlinx.coroutines.test.internal;

import O9.p;
import ca.InterfaceC0646l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.a;
import kotlin.coroutines.d;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;

/* compiled from: ExceptionCollector.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\tJ\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R,\u0010\"\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\f0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lkotlinx/coroutines/test/internal/ExceptionCollector;", "Lkotlin/coroutines/a;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "<init>", "()V", "", "exception", "", "reportException", "(Ljava/lang/Throwable;)Z", "", "owner", "Lkotlin/Function1;", "LO9/p;", "callback", "addOnExceptionCallback", "(Ljava/lang/Object;Lca/l;)V", "removeOnExceptionCallback", "(Ljava/lang/Object;)V", "handleException", "Lkotlin/coroutines/d;", "context", "(Lkotlin/coroutines/d;Ljava/lang/Throwable;)V", "other", "equals", "(Ljava/lang/Object;)Z", "lock", "Ljava/lang/Object;", "enabled", "Z", "", "unprocessedExceptions", "Ljava/util/List;", "", "callbacks", "Ljava/util/Map;", "kotlinx-coroutines-test"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class ExceptionCollector extends a implements CoroutineExceptionHandler {
    private static boolean enabled;
    public static final ExceptionCollector INSTANCE = new ExceptionCollector();
    private static final Object lock = new Object();
    private static final List<Throwable> unprocessedExceptions = new ArrayList();
    private static final Map<Object, InterfaceC0646l<Throwable, p>> callbacks = new LinkedHashMap();

    private ExceptionCollector() {
        super(CoroutineExceptionHandler.INSTANCE);
    }

    private final boolean reportException(Throwable exception) {
        Iterator<InterfaceC0646l<Throwable, p>> it = callbacks.values().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            it.next().invoke(exception);
            z10 = true;
        }
        return z10;
    }

    public final void addOnExceptionCallback(Object owner, InterfaceC0646l<? super Throwable, p> callback) {
        synchronized (lock) {
            try {
                enabled = true;
                if (callbacks.put(owner, callback) != null) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                Iterator<T> it = unprocessedExceptions.iterator();
                while (it.hasNext()) {
                    INSTANCE.reportException((Throwable) it.next());
                }
                unprocessedExceptions.clear();
                p pVar = p.f3034a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean equals(Object other) {
        return (other instanceof ExceptionCollector) || (other instanceof ExceptionCollectorAsService);
    }

    public final boolean handleException(Throwable exception) {
        synchronized (lock) {
            if (!enabled) {
                return false;
            }
            if (INSTANCE.reportException(exception)) {
                return true;
            }
            unprocessedExceptions.add(exception);
            return false;
        }
    }

    public final void removeOnExceptionCallback(Object owner) {
        synchronized (lock) {
            try {
                if (enabled && callbacks.remove(owner) == null) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                p pVar = p.f3034a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(d context, Throwable exception) {
        if (handleException(exception)) {
            throw ExceptionSuccessfullyProcessed.INSTANCE;
        }
    }
}

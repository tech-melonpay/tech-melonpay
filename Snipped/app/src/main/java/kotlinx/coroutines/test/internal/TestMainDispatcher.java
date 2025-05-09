package kotlinx.coroutines.test.internal;

import O9.p;
import androidx.camera.core.impl.utils.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DefaultExecutorKt;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.test.TestCoroutineScheduler;
import kotlinx.coroutines.test.TestDispatcher;

/* compiled from: TestMainDispatcher.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0002*+B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0012\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0006J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00172\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010#R\u0014\u0010&\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lkotlinx/coroutines/test/internal/TestMainDispatcher;", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "Lkotlinx/coroutines/CoroutineDispatcher;", "delegate", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "Lkotlin/coroutines/d;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "LO9/p;", "dispatch", "(Lkotlin/coroutines/d;Ljava/lang/Runnable;)V", "", "isDispatchNeeded", "(Lkotlin/coroutines/d;)Z", "dispatchYield", "dispatcher", "setDispatcher", "resetDispatcher", "()V", "", "timeMillis", "Lkotlinx/coroutines/CancellableContinuation;", "continuation", "scheduleResumeAfterDelay", "(JLkotlinx/coroutines/CancellableContinuation;)V", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnTimeout", "(JLjava/lang/Runnable;Lkotlin/coroutines/d;)Lkotlinx/coroutines/DisposableHandle;", "mainDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/test/internal/TestMainDispatcher$NonConcurrentlyModifiable;", "Lkotlinx/coroutines/test/internal/TestMainDispatcher$NonConcurrentlyModifiable;", "getDelay", "()Lkotlinx/coroutines/Delay;", "delay", "getImmediate", "()Lkotlinx/coroutines/MainCoroutineDispatcher;", "immediate", "Companion", "NonConcurrentlyModifiable", "kotlinx-coroutines-test"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class TestMainDispatcher extends MainCoroutineDispatcher implements Delay {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private NonConcurrentlyModifiable<CoroutineDispatcher> delegate;
    private final CoroutineDispatcher mainDispatcher;

    /* compiled from: TestMainDispatcher.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/test/internal/TestMainDispatcher$Companion;", "", "<init>", "()V", "currentTestDispatcher", "Lkotlinx/coroutines/test/TestDispatcher;", "getCurrentTestDispatcher$kotlinx_coroutines_test", "()Lkotlinx/coroutines/test/TestDispatcher;", "currentTestScheduler", "Lkotlinx/coroutines/test/TestCoroutineScheduler;", "getCurrentTestScheduler$kotlinx_coroutines_test", "()Lkotlinx/coroutines/test/TestCoroutineScheduler;", "kotlinx-coroutines-test"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final TestDispatcher getCurrentTestDispatcher$kotlinx_coroutines_test() {
            NonConcurrentlyModifiable nonConcurrentlyModifiable;
            MainCoroutineDispatcher main = Dispatchers.getMain();
            TestMainDispatcher testMainDispatcher = main instanceof TestMainDispatcher ? (TestMainDispatcher) main : null;
            CoroutineDispatcher coroutineDispatcher = (testMainDispatcher == null || (nonConcurrentlyModifiable = testMainDispatcher.delegate) == null) ? null : (CoroutineDispatcher) nonConcurrentlyModifiable.getValue();
            if (coroutineDispatcher instanceof TestDispatcher) {
                return (TestDispatcher) coroutineDispatcher;
            }
            return null;
        }

        public final TestCoroutineScheduler getCurrentTestScheduler$kotlinx_coroutines_test() {
            TestDispatcher currentTestDispatcher$kotlinx_coroutines_test = getCurrentTestDispatcher$kotlinx_coroutines_test();
            if (currentTestDispatcher$kotlinx_coroutines_test != null) {
                return currentTestDispatcher$kotlinx_coroutines_test.getScheduler();
            }
            return null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: TestMainDispatcher.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0002J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082\u0004R\t\u0010\u000b\u001a\u00020\fX\u0082\u0004R\u0011\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082\u0004R\u0011\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082\u0004R\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\tX\u0082\u0004R$\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u00008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/test/internal/TestMainDispatcher$NonConcurrentlyModifiable;", "T", "", "initialValue", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "reader", "Lkotlinx/atomicfu/AtomicRef;", "", "readers", "Lkotlinx/atomicfu/AtomicInt;", "writer", "exceptionWhenReading", "_value", "concurrentWW", "Ljava/lang/IllegalStateException;", FirebaseAnalytics.Param.LOCATION, "concurrentRW", "value", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "kotlinx-coroutines-test"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NonConcurrentlyModifiable<T> {
        private volatile /* synthetic */ Object _value$volatile;
        private volatile /* synthetic */ Object exceptionWhenReading$volatile;
        private final String name;
        private volatile /* synthetic */ Object reader$volatile;
        private volatile /* synthetic */ int readers$volatile;
        private volatile /* synthetic */ Object writer$volatile;
        private static final /* synthetic */ AtomicReferenceFieldUpdater reader$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(NonConcurrentlyModifiable.class, Object.class, "reader$volatile");
        private static final /* synthetic */ AtomicIntegerFieldUpdater readers$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(NonConcurrentlyModifiable.class, "readers$volatile");
        private static final /* synthetic */ AtomicReferenceFieldUpdater writer$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(NonConcurrentlyModifiable.class, Object.class, "writer$volatile");
        private static final /* synthetic */ AtomicReferenceFieldUpdater exceptionWhenReading$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(NonConcurrentlyModifiable.class, Object.class, "exceptionWhenReading$volatile");
        private static final /* synthetic */ AtomicReferenceFieldUpdater _value$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(NonConcurrentlyModifiable.class, Object.class, "_value$volatile");

        public NonConcurrentlyModifiable(T t3, String str) {
            this.name = str;
            this._value$volatile = t3;
        }

        private final IllegalStateException concurrentRW(Throwable location) {
            return new IllegalStateException(a.n(new StringBuilder(), this.name, " is used concurrently with setting it"), location);
        }

        private final IllegalStateException concurrentWW(Throwable location) {
            return new IllegalStateException(a.n(new StringBuilder(), this.name, " is modified concurrently"), location);
        }

        private final /* synthetic */ Object getExceptionWhenReading$volatile() {
            return this.exceptionWhenReading$volatile;
        }

        private final /* synthetic */ Object getReader$volatile() {
            return this.reader$volatile;
        }

        private final /* synthetic */ int getReaders$volatile() {
            return this.readers$volatile;
        }

        private final /* synthetic */ Object getWriter$volatile() {
            return this.writer$volatile;
        }

        private final /* synthetic */ Object get_value$volatile() {
            return this._value$volatile;
        }

        private final /* synthetic */ void setExceptionWhenReading$volatile(Object obj) {
            this.exceptionWhenReading$volatile = obj;
        }

        private final /* synthetic */ void setReader$volatile(Object obj) {
            this.reader$volatile = obj;
        }

        private final /* synthetic */ void setReaders$volatile(int i) {
            this.readers$volatile = i;
        }

        private final /* synthetic */ void setWriter$volatile(Object obj) {
            this.writer$volatile = obj;
        }

        private final /* synthetic */ void set_value$volatile(Object obj) {
            this._value$volatile = obj;
        }

        public final T getValue() {
            reader$volatile$FU.set(this, new Throwable("reader location"));
            readers$volatile$FU.incrementAndGet(this);
            Throwable th = (Throwable) writer$volatile$FU.get(this);
            if (th != null) {
                exceptionWhenReading$volatile$FU.set(this, concurrentRW(th));
            }
            T t3 = (T) _value$volatile$FU.get(this);
            readers$volatile$FU.decrementAndGet(this);
            return t3;
        }

        public final void setValue(T t3) {
            Throwable th;
            Throwable th2;
            Throwable th3 = (Throwable) exceptionWhenReading$volatile$FU.getAndSet(this, null);
            if (th3 != null) {
                throw th3;
            }
            if (readers$volatile$FU.get(this) != 0 && (th2 = (Throwable) reader$volatile$FU.get(this)) != null) {
                throw concurrentRW(th2);
            }
            Throwable th4 = new Throwable("other writer location");
            Throwable th5 = (Throwable) writer$volatile$FU.getAndSet(this, th4);
            if (th5 != null) {
                throw concurrentWW(th5);
            }
            _value$volatile$FU.set(this, t3);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = writer$volatile$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, th4, null) && atomicReferenceFieldUpdater.get(this) == th4) {
            }
            if (readers$volatile$FU.get(this) != 0 && (th = (Throwable) reader$volatile$FU.get(this)) != null) {
                throw concurrentRW(th);
            }
        }
    }

    public TestMainDispatcher(CoroutineDispatcher coroutineDispatcher) {
        this.mainDispatcher = coroutineDispatcher;
        this.delegate = new NonConcurrentlyModifiable<>(coroutineDispatcher, "Dispatchers.Main");
    }

    private final Delay getDelay() {
        d.b value = this.delegate.getValue();
        Delay delay = value instanceof Delay ? (Delay) value : null;
        return delay == null ? DefaultExecutorKt.getDefaultDelay() : delay;
    }

    @Override // kotlinx.coroutines.Delay
    public Object delay(long j10, T9.a<? super p> aVar) {
        return Delay.DefaultImpls.delay(this, j10, aVar);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch */
    public void mo168dispatch(d context, Runnable block) {
        this.delegate.getValue().mo168dispatch(context, block);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(d context, Runnable block) {
        this.delegate.getValue().dispatchYield(context, block);
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher
    public MainCoroutineDispatcher getImmediate() {
        MainCoroutineDispatcher immediate;
        CoroutineDispatcher value = this.delegate.getValue();
        MainCoroutineDispatcher mainCoroutineDispatcher = value instanceof MainCoroutineDispatcher ? (MainCoroutineDispatcher) value : null;
        return (mainCoroutineDispatcher == null || (immediate = mainCoroutineDispatcher.getImmediate()) == null) ? this : immediate;
    }

    @Override // kotlinx.coroutines.Delay
    public DisposableHandle invokeOnTimeout(long timeMillis, Runnable block, d context) {
        return getDelay().invokeOnTimeout(timeMillis, block, context);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(d context) {
        return this.delegate.getValue().isDispatchNeeded(context);
    }

    public final void resetDispatcher() {
        this.delegate.setValue(this.mainDispatcher);
    }

    @Override // kotlinx.coroutines.Delay
    /* renamed from: scheduleResumeAfterDelay */
    public void mo169scheduleResumeAfterDelay(long timeMillis, CancellableContinuation<? super p> continuation) {
        getDelay().mo169scheduleResumeAfterDelay(timeMillis, continuation);
    }

    public final void setDispatcher(CoroutineDispatcher dispatcher) {
        this.delegate.setValue(dispatcher);
    }
}

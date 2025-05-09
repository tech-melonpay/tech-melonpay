package kotlinx.coroutines.test;

import O9.p;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.internal.ThreadSafeHeap;
import kotlinx.coroutines.selects.SelectClause1;
import la.AbstractC0989a;
import la.c;

/* compiled from: TestCoroutineScheduler.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 M2\u00020\u00012\u00020\u0002:\u0001MB\u0007¢\u0006\u0004\b\u0003\u0010\u0004JM\u0010\u0014\u001a\u00020\u0011\"\b\b\u0000\u0010\u0006*\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u000eH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0019\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u0004J\u001d\u0010\u001e\u001a\u00020\u001a2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0015H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010\u0004J\u0017\u0010!\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\tH\u0007¢\u0006\u0004\b!\u0010\"J\u0015\u0010!\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010\"J\u0019\u0010)\u001a\u00020\u000f2\b\b\u0002\u0010&\u001a\u00020\u000fH\u0000¢\u0006\u0004\b'\u0010(J\u0017\u0010,\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b*\u0010+J\u0010\u0010/\u001a\u00020\u001aH\u0080@¢\u0006\u0004\b-\u0010.R \u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000501008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R*\u00107\u001a\u00020\t2\u0006\u00106\u001a\u00020\t8F@BX\u0087\u000e¢\u0006\u0012\n\u0004\b7\u00108\u0012\u0004\b;\u0010\u0004\u001a\u0004\b9\u0010:R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001a0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001a0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010>R\u0017\u0010A\u001a\u00020@8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\u001a0E8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u001a0E8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bI\u0010GR\u000b\u0010L\u001a\u00020K8\u0002X\u0082\u0004¨\u0006N"}, d2 = {"Lkotlinx/coroutines/test/TestCoroutineScheduler;", "Lkotlin/coroutines/a;", "Lkotlin/coroutines/d$b;", "<init>", "()V", "", "T", "Lkotlinx/coroutines/test/TestDispatcher;", "dispatcher", "", "timeDeltaMillis", "marker", "Lkotlin/coroutines/d;", "context", "Lkotlin/Function1;", "", "isCancelled", "Lkotlinx/coroutines/DisposableHandle;", "registerEvent$kotlinx_coroutines_test", "(Lkotlinx/coroutines/test/TestDispatcher;JLjava/lang/Object;Lkotlin/coroutines/d;Lca/l;)Lkotlinx/coroutines/DisposableHandle;", "registerEvent", "Lkotlin/Function0;", "condition", "tryRunNextTaskUnless$kotlinx_coroutines_test", "(Lca/a;)Z", "tryRunNextTaskUnless", "LO9/p;", "advanceUntilIdle", "advanceUntilIdleOr$kotlinx_coroutines_test", "(Lca/a;)V", "advanceUntilIdleOr", "runCurrent", "delayTimeMillis", "advanceTimeBy", "(J)V", "Lla/c;", "delayTime", "advanceTimeBy-LRDsOJo", "strict", "isIdle$kotlinx_coroutines_test", "(Z)Z", "isIdle", "sendDispatchEvent$kotlinx_coroutines_test", "(Lkotlin/coroutines/d;)V", "sendDispatchEvent", "receiveDispatchEvent$kotlinx_coroutines_test", "(LT9/a;)Ljava/lang/Object;", "receiveDispatchEvent", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "Lkotlinx/coroutines/test/TestDispatchEvent;", "events", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "lock", "Ljava/lang/Object;", "value", "currentTime", "J", "getCurrentTime", "()J", "getCurrentTime$annotations", "Lkotlinx/coroutines/channels/Channel;", "dispatchEventsForeground", "Lkotlinx/coroutines/channels/Channel;", "dispatchEvents", "Lla/h;", "timeSource", "Lla/h;", "getTimeSource", "()Lla/h;", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnDispatchEvent$kotlinx_coroutines_test", "()Lkotlinx/coroutines/selects/SelectClause1;", "onDispatchEvent", "getOnDispatchEventForeground$kotlinx_coroutines_test", "onDispatchEventForeground", "Lkotlinx/atomicfu/AtomicLong;", "count", "Key", "kotlinx-coroutines-test"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class TestCoroutineScheduler extends kotlin.coroutines.a {

    /* renamed from: Key, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final /* synthetic */ AtomicLongFieldUpdater count$volatile$FU = AtomicLongFieldUpdater.newUpdater(TestCoroutineScheduler.class, "count$volatile");
    private volatile /* synthetic */ long count$volatile;
    private long currentTime;
    private final Channel<p> dispatchEvents;
    private final Channel<p> dispatchEventsForeground;
    private final ThreadSafeHeap<TestDispatchEvent<Object>> events;
    private final Object lock;
    private final la.h timeSource;

    /* compiled from: TestCoroutineScheduler.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/test/TestCoroutineScheduler$Key;", "Lkotlin/coroutines/d$c;", "Lkotlinx/coroutines/test/TestCoroutineScheduler;", "<init>", "()V", "kotlinx-coroutines-test"}, k = 1, mv = {2, 0, 0})
    /* renamed from: kotlinx.coroutines.test.TestCoroutineScheduler$Key, reason: from kotlin metadata */
    public static final class Companion implements d.c<TestCoroutineScheduler> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public TestCoroutineScheduler() {
        super(INSTANCE);
        this.events = new ThreadSafeHeap<>();
        this.lock = new Object();
        this.dispatchEventsForeground = ChannelKt.Channel$default(-1, null, null, 6, null);
        this.dispatchEvents = ChannelKt.Channel$default(-1, null, null, 6, null);
        final DurationUnit durationUnit = DurationUnit.MILLISECONDS;
        this.timeSource = new AbstractC0989a(durationUnit) { // from class: kotlinx.coroutines.test.TestCoroutineScheduler$timeSource$1
            @Override // la.AbstractC0989a
            public long read() {
                return TestCoroutineScheduler.this.getCurrentTime();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean advanceUntilIdle$lambda$7(TestCoroutineScheduler testCoroutineScheduler) {
        boolean none;
        none = TestCoroutineSchedulerKt.none(testCoroutineScheduler.events, new PropertyReference1Impl() { // from class: kotlinx.coroutines.test.TestCoroutineScheduler$advanceUntilIdle$1$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, ia.InterfaceC0842j
            public Object get(Object obj) {
                return Boolean.valueOf(((TestDispatchEvent) obj).isForeground);
            }
        });
        return none;
    }

    private final /* synthetic */ long getCount$volatile() {
        return this.count$volatile;
    }

    public static /* synthetic */ boolean isIdle$kotlinx_coroutines_test$default(TestCoroutineScheduler testCoroutineScheduler, boolean z10, int i, Object obj) {
        if ((i & 1) != 0) {
            z10 = true;
        }
        return testCoroutineScheduler.isIdle$kotlinx_coroutines_test(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isIdle$lambda$15$lambda$14(TestDispatchEvent testDispatchEvent) {
        return !testDispatchEvent.isCancelled.invoke().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean registerEvent$lambda$5$lambda$2(InterfaceC0646l interfaceC0646l, Object obj) {
        return ((Boolean) interfaceC0646l.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerEvent$lambda$5$lambda$4(TestCoroutineScheduler testCoroutineScheduler, TestDispatchEvent testDispatchEvent) {
        synchronized (testCoroutineScheduler.lock) {
            testCoroutineScheduler.events.remove(testDispatchEvent);
            p pVar = p.f3034a;
        }
    }

    private final /* synthetic */ void setCount$volatile(long j10) {
        this.count$volatile = j10;
    }

    @ExperimentalCoroutinesApi
    public final void advanceTimeBy(long delayTimeMillis) {
        c.a aVar = la.c.f23587b;
        m194advanceTimeByLRDsOJo(la.e.g(delayTimeMillis, DurationUnit.MILLISECONDS));
    }

    /* renamed from: advanceTimeBy-LRDsOJo, reason: not valid java name */
    public final void m194advanceTimeByLRDsOJo(long delayTime) {
        long addClamping;
        TestDispatchEvent<Object> testDispatchEvent;
        TestDispatchEvent<Object> testDispatchEvent2;
        if (!(!la.c.j(delayTime))) {
            throw new IllegalArgumentException(("Can not advance time by a negative delay: " + ((Object) la.c.m(delayTime))).toString());
        }
        addClamping = TestCoroutineSchedulerKt.addClamping(getCurrentTime(), la.c.e(delayTime));
        while (true) {
            synchronized (this.lock) {
                long currentTime = getCurrentTime();
                ThreadSafeHeap<TestDispatchEvent<Object>> threadSafeHeap = this.events;
                synchronized (threadSafeHeap) {
                    TestDispatchEvent<Object> firstImpl = threadSafeHeap.firstImpl();
                    if (firstImpl != null) {
                        testDispatchEvent = addClamping > firstImpl.time ? threadSafeHeap.removeAtImpl(0) : null;
                    }
                }
                testDispatchEvent2 = testDispatchEvent;
                if (testDispatchEvent2 == null) {
                    this.currentTime = addClamping;
                    return;
                }
                long j10 = testDispatchEvent2.time;
                if (currentTime > j10) {
                    TestCoroutineSchedulerKt.currentTimeAheadOfEvents();
                    throw new KotlinNothingValueException();
                }
                this.currentTime = j10;
            }
            testDispatchEvent2.dispatcher.processEvent$kotlinx_coroutines_test(testDispatchEvent2.marker);
        }
    }

    public final void advanceUntilIdle() {
        advanceUntilIdleOr$kotlinx_coroutines_test(new c(1, this));
    }

    public final void advanceUntilIdleOr$kotlinx_coroutines_test(InterfaceC0635a<Boolean> condition) {
        while (tryRunNextTaskUnless$kotlinx_coroutines_test(condition)) {
        }
    }

    public final long getCurrentTime() {
        long j10;
        synchronized (this.lock) {
            j10 = this.currentTime;
        }
        return j10;
    }

    public final SelectClause1<p> getOnDispatchEvent$kotlinx_coroutines_test() {
        return this.dispatchEvents.getOnReceive();
    }

    public final SelectClause1<p> getOnDispatchEventForeground$kotlinx_coroutines_test() {
        return this.dispatchEventsForeground.getOnReceive();
    }

    public final la.h getTimeSource() {
        return this.timeSource;
    }

    public final boolean isIdle$kotlinx_coroutines_test(boolean strict) {
        boolean isEmpty;
        synchronized (this.lock) {
            try {
                isEmpty = strict ? this.events.isEmpty() : TestCoroutineSchedulerKt.none(this.events, new a(1));
            } catch (Throwable th) {
                throw th;
            }
        }
        return isEmpty;
    }

    public final Object receiveDispatchEvent$kotlinx_coroutines_test(T9.a<? super p> aVar) {
        Object receive = this.dispatchEvents.receive(aVar);
        return receive == CoroutineSingletons.f23158a ? receive : p.f3034a;
    }

    public final <T> DisposableHandle registerEvent$kotlinx_coroutines_test(TestDispatcher dispatcher, long timeDeltaMillis, T marker, kotlin.coroutines.d context, InterfaceC0646l<? super T, Boolean> isCancelled) {
        long addClamping;
        DisposableHandle disposableHandle;
        if (timeDeltaMillis < 0) {
            throw new IllegalArgumentException(("Attempted scheduling an event earlier in time (with the time delta " + timeDeltaMillis + ')').toString());
        }
        TestCoroutineSchedulerKt.checkSchedulerInContext(this, context);
        long andIncrement = count$volatile$FU.getAndIncrement(this);
        boolean z10 = context.get(BackgroundWork.INSTANCE) == null;
        synchronized (this.lock) {
            addClamping = TestCoroutineSchedulerKt.addClamping(getCurrentTime(), timeDeltaMillis);
            final TestDispatchEvent<Object> testDispatchEvent = new TestDispatchEvent<>(dispatcher, andIncrement, addClamping, marker, z10, new f(1, isCancelled, marker));
            this.events.addLast(testDispatchEvent);
            sendDispatchEvent$kotlinx_coroutines_test(context);
            disposableHandle = new DisposableHandle() { // from class: kotlinx.coroutines.test.g
                @Override // kotlinx.coroutines.DisposableHandle
                public final void dispose() {
                    TestCoroutineScheduler.registerEvent$lambda$5$lambda$4(TestCoroutineScheduler.this, testDispatchEvent);
                }
            };
        }
        return disposableHandle;
    }

    public final void runCurrent() {
        long currentTime;
        TestDispatchEvent<Object> testDispatchEvent;
        TestDispatchEvent<Object> testDispatchEvent2;
        synchronized (this.lock) {
            currentTime = getCurrentTime();
        }
        while (true) {
            synchronized (this.lock) {
                ThreadSafeHeap<TestDispatchEvent<Object>> threadSafeHeap = this.events;
                synchronized (threadSafeHeap) {
                    TestDispatchEvent<Object> firstImpl = threadSafeHeap.firstImpl();
                    if (firstImpl != null) {
                        testDispatchEvent = firstImpl.time <= currentTime ? threadSafeHeap.removeAtImpl(0) : null;
                    }
                }
                testDispatchEvent2 = testDispatchEvent;
                if (testDispatchEvent2 == null) {
                    return;
                }
            }
            testDispatchEvent2.dispatcher.processEvent$kotlinx_coroutines_test(testDispatchEvent2.marker);
        }
    }

    public final void sendDispatchEvent$kotlinx_coroutines_test(kotlin.coroutines.d context) {
        Channel<p> channel = this.dispatchEvents;
        p pVar = p.f3034a;
        channel.mo110trySendJP2dKIU(pVar);
        BackgroundWork backgroundWork = BackgroundWork.INSTANCE;
        if (context.get(backgroundWork) != backgroundWork) {
            this.dispatchEventsForeground.mo110trySendJP2dKIU(pVar);
        }
    }

    public final boolean tryRunNextTaskUnless$kotlinx_coroutines_test(InterfaceC0635a<Boolean> condition) {
        synchronized (this.lock) {
            if (condition.invoke().booleanValue()) {
                return false;
            }
            TestDispatchEvent<Object> removeFirstOrNull = this.events.removeFirstOrNull();
            if (removeFirstOrNull == null) {
                return false;
            }
            long currentTime = getCurrentTime();
            long j10 = removeFirstOrNull.time;
            if (currentTime > j10) {
                TestCoroutineSchedulerKt.currentTimeAheadOfEvents();
                throw new KotlinNothingValueException();
            }
            this.currentTime = j10;
            removeFirstOrNull.dispatcher.processEvent$kotlinx_coroutines_test(removeFirstOrNull.marker);
            return true;
        }
    }

    @ExperimentalCoroutinesApi
    public static /* synthetic */ void getCurrentTime$annotations() {
    }
}

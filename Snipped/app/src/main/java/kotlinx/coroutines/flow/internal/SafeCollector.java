package kotlinx.coroutines.flow.internal;

import O9.p;
import T9.a;
import V9.c;
import b5.C0588a;
import ca.InterfaceC0651q;
import ka.C0963h;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.f;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: SafeCollector.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u000e2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010!J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u000f\u0010\"R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010&\u001a\u00020%8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010$R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector;", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "LV9/c;", "collector", "Lkotlin/coroutines/d;", "collectContext", "<init>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/d;)V", "LT9/a;", "LO9/p;", "uCont", "value", "", "emit", "(LT9/a;Ljava/lang/Object;)Ljava/lang/Object;", "currentContext", "previousContext", "checkContext", "(Lkotlin/coroutines/d;Lkotlin/coroutines/d;Ljava/lang/Object;)V", "Lkotlinx/coroutines/flow/internal/DownstreamExceptionContext;", "exception", "exceptionTransparencyViolated", "(Lkotlinx/coroutines/flow/internal/DownstreamExceptionContext;Ljava/lang/Object;)V", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lkotlin/Result;", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "()V", "(Ljava/lang/Object;LT9/a;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/coroutines/d;", "", "collectContextSize", "I", "lastEmissionContext", "completion_", "LT9/a;", "getCallerFrame", "()LV9/c;", "callerFrame", "getContext", "()Lkotlin/coroutines/d;", "context", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class SafeCollector<T> extends ContinuationImpl implements FlowCollector<T> {
    public final d collectContext;
    public final int collectContextSize;
    public final FlowCollector<T> collector;
    private a<? super p> completion_;
    private d lastEmissionContext;

    /* JADX WARN: Multi-variable type inference failed */
    public SafeCollector(FlowCollector<? super T> flowCollector, d dVar) {
        super(NoOpContinuation.INSTANCE, EmptyCoroutineContext.f23155a);
        this.collector = flowCollector;
        this.collectContext = dVar;
        this.collectContextSize = ((Number) dVar.fold(0, new C0588a(20))).intValue();
    }

    private final void checkContext(d currentContext, d previousContext, T value) {
        if (previousContext instanceof DownstreamExceptionContext) {
            exceptionTransparencyViolated((DownstreamExceptionContext) previousContext, value);
        }
        SafeCollector_commonKt.checkContext(this, currentContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int collectContextSize$lambda$0(int i, d.b bVar) {
        return i + 1;
    }

    private final void exceptionTransparencyViolated(DownstreamExceptionContext exception, Object value) {
        throw new IllegalStateException(C0963h.N("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + exception.e + ", but then emission attempt of value '" + value + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t3, a<? super p> aVar) {
        try {
            Object emit = emit(aVar, (a<? super p>) t3);
            return emit == CoroutineSingletons.f23158a ? emit : p.f3034a;
        } catch (Throwable th) {
            this.lastEmissionContext = new DownstreamExceptionContext(th, aVar.getContext());
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, V9.c
    public c getCallerFrame() {
        a<? super p> aVar = this.completion_;
        if (aVar instanceof c) {
            return (c) aVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, T9.a
    public d getContext() {
        d dVar = this.lastEmissionContext;
        return dVar == null ? EmptyCoroutineContext.f23155a : dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, V9.c
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public Object invokeSuspend(Object result) {
        Throwable a10 = Result.a(result);
        if (a10 != null) {
            this.lastEmissionContext = new DownstreamExceptionContext(a10, getContext());
        }
        a<? super p> aVar = this.completion_;
        if (aVar != null) {
            aVar.resumeWith(result);
        }
        return CoroutineSingletons.f23158a;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }

    private final Object emit(a<? super p> uCont, T value) {
        InterfaceC0651q interfaceC0651q;
        d context = uCont.getContext();
        JobKt.ensureActive(context);
        d dVar = this.lastEmissionContext;
        if (dVar != context) {
            checkContext(context, dVar, value);
            this.lastEmissionContext = context;
        }
        this.completion_ = uCont;
        interfaceC0651q = SafeCollectorKt.emitFun;
        Object invoke = interfaceC0651q.invoke(this.collector, value, this);
        if (!f.b(invoke, CoroutineSingletons.f23158a)) {
            this.completion_ = null;
        }
        return invoke;
    }
}

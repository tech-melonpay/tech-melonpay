package kotlinx.coroutines.flow;

import O9.p;
import ca.InterfaceC0650p;
import ca.InterfaceC0651q;
import ca.InterfaceC0652r;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* compiled from: Lint.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\tH\u0007¢\u0006\u0004\b\f\u0010\u000b\u001a)\u0010\u0012\u001a\u00020\u0011*\u0006\u0012\u0002\b\u00030\r2\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001aX\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000120\b\b\u0010\u0018\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0014H\u0087\b¢\u0006\u0004\b\u0019\u0010\u001a\u001aV\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u001b2$\b\n\u0010\u001f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u001dH\u0087\b¢\u0006\u0004\b \u0010!\u001a^\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000126\b\b\u0010\u001f\u001a0\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\"H\u0087\b¢\u0006\u0004\b#\u0010$\u001a&\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087H¢\u0006\u0004\b&\u0010'\u001a.\u0010&\u001a\u00020*\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0087H¢\u0006\u0004\b&\u0010+\u001a&\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087H¢\u0006\u0004\b-\u0010'\u001a.\u0010-\u001a\u00020*\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000.H\u0087H¢\u0006\u0004\b-\u0010/\u001a \u00101\u001a\u000200\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087H¢\u0006\u0004\b1\u0010'\"\"\u00102\u001a\u00020\u001e*\u0006\u0012\u0002\b\u00030\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b4\u00105\u001a\u0004\b2\u00103\"\"\u00109\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b8\u00105\u001a\u0004\b6\u00107¨\u0006:"}, d2 = {"T", "Lkotlinx/coroutines/flow/SharedFlow;", "Lkotlinx/coroutines/flow/Flow;", "cancellable", "(Lkotlinx/coroutines/flow/SharedFlow;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/coroutines/d;", "context", "flowOn", "(Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/coroutines/d;)Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/StateFlow;", "conflate", "(Lkotlinx/coroutines/flow/StateFlow;)Lkotlinx/coroutines/flow/Flow;", "distinctUntilChanged", "Lkotlinx/coroutines/flow/FlowCollector;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "LO9/p;", "cancel", "(Lkotlinx/coroutines/flow/FlowCollector;Ljava/util/concurrent/CancellationException;)V", "Lkotlin/Function3;", "", "LT9/a;", "", "action", "catch", "(Lkotlinx/coroutines/flow/SharedFlow;Lca/q;)Lkotlinx/coroutines/flow/Flow;", "", "retries", "Lkotlin/Function2;", "", "predicate", "retry", "(Lkotlinx/coroutines/flow/SharedFlow;JLca/p;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function4;", "retryWhen", "(Lkotlinx/coroutines/flow/SharedFlow;Lca/r;)Lkotlinx/coroutines/flow/Flow;", "", "toList", "(Lkotlinx/coroutines/flow/SharedFlow;LT9/a;)Ljava/lang/Object;", "", FirebaseAnalytics.Param.DESTINATION, "", "(Lkotlinx/coroutines/flow/SharedFlow;Ljava/util/List;LT9/a;)Ljava/lang/Object;", "", "toSet", "", "(Lkotlinx/coroutines/flow/SharedFlow;Ljava/util/Set;LT9/a;)Ljava/lang/Object;", "", "count", "isActive", "(Lkotlinx/coroutines/flow/FlowCollector;)Z", "isActive$annotations", "(Lkotlinx/coroutines/flow/FlowCollector;)V", "getCoroutineContext", "(Lkotlinx/coroutines/flow/FlowCollector;)Lkotlin/coroutines/d;", "getCoroutineContext$annotations", "coroutineContext", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class LintKt {
    public static final void cancel(FlowCollector<?> flowCollector, CancellationException cancellationException) {
        throw e.a();
    }

    public static /* synthetic */ void cancel$default(FlowCollector flowCollector, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        cancel(flowCollector, cancellationException);
    }

    public static final <T> Flow<T> cancellable(SharedFlow<? extends T> sharedFlow) {
        throw e.a();
    }

    /* renamed from: catch, reason: not valid java name */
    private static final <T> Flow<T> m154catch(SharedFlow<? extends T> sharedFlow, InterfaceC0651q<? super FlowCollector<? super T>, ? super Throwable, ? super T9.a<? super p>, ? extends Object> interfaceC0651q) {
        return FlowKt.m142catch(sharedFlow, interfaceC0651q);
    }

    public static final <T> Flow<T> conflate(StateFlow<? extends T> stateFlow) {
        throw e.a();
    }

    private static final <T> Object count(SharedFlow<? extends T> sharedFlow, T9.a<? super Integer> aVar) {
        return FlowKt.count(sharedFlow, aVar);
    }

    public static final <T> Flow<T> distinctUntilChanged(StateFlow<? extends T> stateFlow) {
        throw e.a();
    }

    public static final <T> Flow<T> flowOn(SharedFlow<? extends T> sharedFlow, kotlin.coroutines.d dVar) {
        throw e.a();
    }

    public static final kotlin.coroutines.d getCoroutineContext(FlowCollector<?> flowCollector) {
        throw e.a();
    }

    public static final boolean isActive(FlowCollector<?> flowCollector) {
        throw e.a();
    }

    private static final <T> Flow<T> retry(SharedFlow<? extends T> sharedFlow, long j10, InterfaceC0650p<? super Throwable, ? super T9.a<? super Boolean>, ? extends Object> interfaceC0650p) {
        return FlowKt.retry(sharedFlow, j10, interfaceC0650p);
    }

    public static /* synthetic */ Flow retry$default(SharedFlow sharedFlow, long j10, InterfaceC0650p interfaceC0650p, int i, Object obj) {
        if ((i & 1) != 0) {
            j10 = Long.MAX_VALUE;
        }
        if ((i & 2) != 0) {
            interfaceC0650p = new LintKt$retry$1(null);
        }
        return FlowKt.retry(sharedFlow, j10, interfaceC0650p);
    }

    private static final <T> Flow<T> retryWhen(SharedFlow<? extends T> sharedFlow, InterfaceC0652r<? super FlowCollector<? super T>, ? super Throwable, ? super Long, ? super T9.a<? super Boolean>, ? extends Object> interfaceC0652r) {
        return FlowKt.retryWhen(sharedFlow, interfaceC0652r);
    }

    private static final <T> Object toList(SharedFlow<? extends T> sharedFlow, T9.a<? super List<? extends T>> aVar) {
        Object list$default;
        list$default = FlowKt__CollectionKt.toList$default(sharedFlow, null, aVar, 1, null);
        return list$default;
    }

    private static final <T> Object toSet(SharedFlow<? extends T> sharedFlow, T9.a<? super Set<? extends T>> aVar) {
        Object set$default;
        set$default = FlowKt__CollectionKt.toSet$default(sharedFlow, null, aVar, 1, null);
        return set$default;
    }

    private static final <T> Object toList(SharedFlow<? extends T> sharedFlow, List<T> list, T9.a<?> aVar) {
        FlowKt.toList(sharedFlow, list, aVar);
        throw new IllegalStateException("this code is supposed to be unreachable");
    }

    private static final <T> Object toSet(SharedFlow<? extends T> sharedFlow, Set<T> set, T9.a<?> aVar) {
        FlowKt.toSet(sharedFlow, set, aVar);
        throw new IllegalStateException("this code is supposed to be unreachable");
    }

    public static /* synthetic */ void getCoroutineContext$annotations(FlowCollector flowCollector) {
    }

    public static /* synthetic */ void isActive$annotations(FlowCollector flowCollector) {
    }
}

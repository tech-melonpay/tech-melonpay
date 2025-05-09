package kotlinx.coroutines.selects;

import O9.p;
import P9.s;
import T9.a;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import ca.InterfaceC0651q;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.f;
import kotlinx.coroutines.CancelHandler;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.SelectBuilder;

/* compiled from: Select.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004:\u0001WB\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0000H\u0091@¢\u0006\u0004\b\t\u0010\nJ2\u0010\u0011\u001a\u00020\u0010*\u00020\u000b2\u001c\u0010\u000f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012JD\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0001\u0010\u0013*\b\u0012\u0004\u0012\u00028\u00010\u00142\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0015H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0016JX\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0001\u0010\u0017\"\u0004\b\u0002\u0010\u0013*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00182\u0006\u0010\u0019\u001a\u00028\u00012\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0015H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u001aJ'\u0010\u001e\u001a\u00020\u0010*\f0\u001bR\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J#\u0010(\u001a\u00020\u00102\n\u0010%\u001a\u0006\u0012\u0002\b\u00030$2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0019\u0010+\u001a\u00020\u00102\b\u0010*\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b+\u0010,J!\u0010/\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u000e2\b\u0010.\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b/\u00100J\u001f\u00102\u001a\u0002012\u0006\u0010-\u001a\u00020\u000e2\b\u0010.\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b2\u00103J\u0019\u0010\u0011\u001a\u00020\u00102\b\u00105\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b\u0011\u00106J\u0010\u00107\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b7\u0010\nJ\u0017\u00108\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u000eH\u0002¢\u0006\u0004\b8\u0010,J\u0010\u00109\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b9\u0010\nJ\u0017\u0010:\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u000eH\u0002¢\u0006\u0004\b:\u0010,J!\u0010;\u001a\u00020&2\u0006\u0010-\u001a\u00020\u000e2\b\u0010*\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b;\u0010<J#\u0010=\u001a\u000e\u0018\u00010\u001bR\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010-\u001a\u00020\u000eH\u0002¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b?\u0010\nJ,\u0010A\u001a\u00028\u00002\u0010\u0010@\u001a\f0\u001bR\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010*\u001a\u0004\u0018\u00010\u000eH\u0082@¢\u0006\u0004\bA\u0010BJ!\u0010D\u001a\u00020\u00102\u0010\u0010C\u001a\f0\u001bR\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\bD\u0010ER\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010F\u001a\u0004\bG\u0010HR(\u0010J\u001a\u0014\u0012\u000e\u0012\f0\u001bR\b\u0012\u0004\u0012\u00028\u00000\u0000\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010L\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010N\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010*\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010MR\u0014\u0010R\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010QR\u0014\u0010T\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010QR\u0011\u0010V\u001a\b\u0012\u0004\u0012\u00020\u000e0U8\u0002X\u0082\u0004¨\u0006X"}, d2 = {"Lkotlinx/coroutines/selects/SelectImplementation;", "R", "Lkotlinx/coroutines/CancelHandler;", "Lkotlinx/coroutines/selects/SelectBuilder;", "Lkotlinx/coroutines/selects/SelectInstanceInternal;", "Lkotlin/coroutines/d;", "context", "<init>", "(Lkotlin/coroutines/d;)V", "doSelect", "(LT9/a;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/SelectClause0;", "Lkotlin/Function1;", "LT9/a;", "", "block", "LO9/p;", "invoke", "(Lkotlinx/coroutines/selects/SelectClause0;Lca/l;)V", "Q", "Lkotlinx/coroutines/selects/SelectClause1;", "Lkotlin/Function2;", "(Lkotlinx/coroutines/selects/SelectClause1;Lca/p;)V", "P", "Lkotlinx/coroutines/selects/SelectClause2;", "param", "(Lkotlinx/coroutines/selects/SelectClause2;Ljava/lang/Object;Lca/p;)V", "Lkotlinx/coroutines/selects/SelectImplementation$ClauseData;", "", "reregister", "register", "(Lkotlinx/coroutines/selects/SelectImplementation$ClauseData;Z)V", "Lkotlinx/coroutines/DisposableHandle;", "disposableHandle", "disposeOnCompletion", "(Lkotlinx/coroutines/DisposableHandle;)V", "Lkotlinx/coroutines/internal/Segment;", "segment", "", FirebaseAnalytics.Param.INDEX, "invokeOnCancellation", "(Lkotlinx/coroutines/internal/Segment;I)V", "internalResult", "selectInRegistrationPhase", "(Ljava/lang/Object;)V", "clauseObject", "result", "trySelect", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/selects/TrySelectDetailedResult;", "trySelectDetailed", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlinx/coroutines/selects/TrySelectDetailedResult;", "", "cause", "(Ljava/lang/Throwable;)V", "doSelectSuspend", "checkClauseObject", "waitUntilSelected", "reregisterClause", "trySelectInternal", "(Ljava/lang/Object;Ljava/lang/Object;)I", "findClause", "(Ljava/lang/Object;)Lkotlinx/coroutines/selects/SelectImplementation$ClauseData;", "complete", "clause", "processResultAndInvokeBlockRecoveringException", "(Lkotlinx/coroutines/selects/SelectImplementation$ClauseData;Ljava/lang/Object;LT9/a;)Ljava/lang/Object;", "selectedClause", "cleanup", "(Lkotlinx/coroutines/selects/SelectImplementation$ClauseData;)V", "Lkotlin/coroutines/d;", "getContext", "()Lkotlin/coroutines/d;", "", "clauses", "Ljava/util/List;", "disposableHandleOrSegment", "Ljava/lang/Object;", "indexInSegment", "I", "getInRegistrationPhase", "()Z", "inRegistrationPhase", "isSelected", "isCancelled", "Lkotlinx/atomicfu/AtomicRef;", "state", "ClauseData", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public class SelectImplementation<R> implements CancelHandler, SelectBuilder<R>, SelectInstanceInternal<R> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater state$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(SelectImplementation.class, Object.class, "state$volatile");
    private List<SelectImplementation<R>.ClauseData> clauses;
    private final d context;
    private Object disposableHandleOrSegment;
    private int indexInSegment;
    private Object internalResult;
    private volatile /* synthetic */ Object state$volatile;

    /* compiled from: Select.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0004\u0018\u00002\u00020\u0001B¿\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012(\u0010\u0007\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006\u0012(\u0010\t\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0002`\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000b\u001a\u00020\u0001\u0012H\u0010\u000f\u001aD\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0003\u0018\u00010\u0003j\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00028\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\u001eJ?\u0010 \u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b \u0010!R\u0014\u0010\u0002\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\"R6\u0010\u0007\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R6\u0010\t\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\"R\u0014\u0010\u000b\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"RV\u0010\u000f\u001aD\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0003\u0018\u00010\u0003j\u0004\u0018\u0001`\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010&\u001a\u00020%8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lkotlinx/coroutines/selects/SelectImplementation$ClauseData;", "", "clauseObject", "Lkotlin/Function3;", "Lkotlinx/coroutines/selects/SelectInstance;", "LO9/p;", "Lkotlinx/coroutines/selects/RegistrationFunction;", "regFunc", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "processResFunc", "param", "block", "", "Lkotlin/coroutines/d;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "onCancellationConstructor", "<init>", "(Lkotlinx/coroutines/selects/SelectImplementation;Ljava/lang/Object;Lca/q;Lca/q;Ljava/lang/Object;Ljava/lang/Object;Lca/q;)V", "Lkotlinx/coroutines/selects/SelectImplementation;", "select", "", "tryRegisterAsWaiter", "(Lkotlinx/coroutines/selects/SelectImplementation;)Z", "result", "processResult", "(Ljava/lang/Object;)Ljava/lang/Object;", "argument", "invokeBlock", "(Ljava/lang/Object;LT9/a;)Ljava/lang/Object;", "dispose", "()V", "internalResult", "createOnCancellationAction", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)Lca/q;", "Ljava/lang/Object;", "Lca/q;", "disposableHandleOrSegment", "", "indexInSegment", "I", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
    public final class ClauseData {
        private final Object block;
        public final Object clauseObject;
        public Object disposableHandleOrSegment;
        public int indexInSegment = -1;
        public final InterfaceC0651q<SelectInstance<?>, Object, Object, InterfaceC0651q<Throwable, Object, d, p>> onCancellationConstructor;
        private final Object param;
        private final InterfaceC0651q<Object, Object, Object, Object> processResFunc;
        private final InterfaceC0651q<Object, SelectInstance<?>, Object, p> regFunc;

        /* JADX WARN: Multi-variable type inference failed */
        public ClauseData(Object obj, InterfaceC0651q<Object, ? super SelectInstance<?>, Object, p> interfaceC0651q, InterfaceC0651q<Object, Object, Object, ? extends Object> interfaceC0651q2, Object obj2, Object obj3, InterfaceC0651q<? super SelectInstance<?>, Object, Object, ? extends InterfaceC0651q<? super Throwable, Object, ? super d, p>> interfaceC0651q3) {
            this.clauseObject = obj;
            this.regFunc = interfaceC0651q;
            this.processResFunc = interfaceC0651q2;
            this.param = obj2;
            this.block = obj3;
            this.onCancellationConstructor = interfaceC0651q3;
        }

        public final InterfaceC0651q<Throwable, Object, d, p> createOnCancellationAction(SelectInstance<?> select, Object internalResult) {
            InterfaceC0651q<SelectInstance<?>, Object, Object, InterfaceC0651q<Throwable, Object, d, p>> interfaceC0651q = this.onCancellationConstructor;
            if (interfaceC0651q != null) {
                return interfaceC0651q.invoke(select, this.param, internalResult);
            }
            return null;
        }

        public final void dispose() {
            Object obj = this.disposableHandleOrSegment;
            SelectImplementation<R> selectImplementation = SelectImplementation.this;
            if (obj instanceof Segment) {
                ((Segment) obj).onCancellation(this.indexInSegment, null, selectImplementation.getContext());
                return;
            }
            DisposableHandle disposableHandle = obj instanceof DisposableHandle ? (DisposableHandle) obj : null;
            if (disposableHandle != null) {
                disposableHandle.dispose();
            }
        }

        public final Object invokeBlock(Object obj, a<? super R> aVar) {
            Object obj2 = this.block;
            return this.param == SelectKt.getPARAM_CLAUSE_0() ? ((InterfaceC0646l) obj2).invoke(aVar) : ((InterfaceC0650p) obj2).invoke(obj, aVar);
        }

        public final Object processResult(Object result) {
            return this.processResFunc.invoke(this.clauseObject, this.param, result);
        }

        public final boolean tryRegisterAsWaiter(SelectImplementation<R> select) {
            Symbol symbol;
            this.regFunc.invoke(this.clauseObject, select, this.param);
            Object obj = ((SelectImplementation) select).internalResult;
            symbol = SelectKt.NO_RESULT;
            return obj == symbol;
        }
    }

    public SelectImplementation(d dVar) {
        Symbol symbol;
        Symbol symbol2;
        this.context = dVar;
        symbol = SelectKt.STATE_REG;
        this.state$volatile = symbol;
        this.clauses = new ArrayList(2);
        this.indexInSegment = -1;
        symbol2 = SelectKt.NO_RESULT;
        this.internalResult = symbol2;
    }

    private final void checkClauseObject(Object clauseObject) {
        List<SelectImplementation<R>.ClauseData> list = this.clauses;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((ClauseData) it.next()).clauseObject == clauseObject) {
                throw new IllegalStateException(androidx.camera.core.impl.utils.a.j(clauseObject, "Cannot use select clauses on the same object: ").toString());
            }
        }
    }

    private final void cleanup(SelectImplementation<R>.ClauseData selectedClause) {
        Symbol symbol;
        Symbol symbol2;
        List<SelectImplementation<R>.ClauseData> list = this.clauses;
        if (list == null) {
            return;
        }
        for (SelectImplementation<R>.ClauseData clauseData : list) {
            if (clauseData != selectedClause) {
                clauseData.dispose();
            }
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = state$volatile$FU;
        symbol = SelectKt.STATE_COMPLETED;
        atomicReferenceFieldUpdater.set(this, symbol);
        symbol2 = SelectKt.NO_RESULT;
        this.internalResult = symbol2;
        this.clauses = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object complete(a<? super R> aVar) {
        SelectImplementation<R>.ClauseData clauseData = (ClauseData) state$volatile$FU.get(this);
        Object obj = this.internalResult;
        cleanup(clauseData);
        return clauseData.invokeBlock(clauseData.processResult(obj), aVar);
    }

    public static /* synthetic */ <R> Object doSelect$suspendImpl(SelectImplementation<R> selectImplementation, a<? super R> aVar) {
        return selectImplementation.isSelected() ? selectImplementation.complete(aVar) : selectImplementation.doSelectSuspend(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0055 A[PHI: r6
      0x0055: PHI (r6v5 java.lang.Object) = (r6v4 java.lang.Object), (r6v1 java.lang.Object) binds: [B:17:0x0052, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object doSelectSuspend(T9.a<? super R> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1 r0 = (kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1 r0 = new kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.b.b(r6)
            goto L55
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.selects.SelectImplementation r2 = (kotlinx.coroutines.selects.SelectImplementation) r2
            kotlin.b.b(r6)
            goto L49
        L3a:
            kotlin.b.b(r6)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r5.waitUntilSelected(r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            r2 = r5
        L49:
            r6 = 0
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r6 = r2.complete(r0)
            if (r6 != r1) goto L55
            return r1
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.SelectImplementation.doSelectSuspend(T9.a):java.lang.Object");
    }

    private final SelectImplementation<R>.ClauseData findClause(Object clauseObject) {
        List<SelectImplementation<R>.ClauseData> list = this.clauses;
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((ClauseData) next).clauseObject == clauseObject) {
                obj = next;
                break;
            }
        }
        SelectImplementation<R>.ClauseData clauseData = (ClauseData) obj;
        if (clauseData != null) {
            return clauseData;
        }
        throw new IllegalStateException(("Clause with object " + clauseObject + " is not found").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getInRegistrationPhase() {
        Symbol symbol;
        Object obj = state$volatile$FU.get(this);
        symbol = SelectKt.STATE_REG;
        return obj == symbol || (obj instanceof List);
    }

    private final /* synthetic */ Object getState$volatile() {
        return this.state$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCancelled() {
        Symbol symbol;
        Object obj = state$volatile$FU.get(this);
        symbol = SelectKt.STATE_CANCELLED;
        return obj == symbol;
    }

    private final boolean isSelected() {
        return state$volatile$FU.get(this) instanceof ClauseData;
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, InterfaceC0646l<Object, p> interfaceC0646l) {
        while (true) {
            interfaceC0646l.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object processResultAndInvokeBlockRecoveringException(kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData r5, java.lang.Object r6, T9.a<? super R> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1 r0 = (kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1 r0 = new kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.b.b(r7)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.b.b(r7)
            java.lang.Object r6 = r5.processResult(r6)
            r0.label = r3
            java.lang.Object r7 = r5.invokeBlock(r6, r0)
            if (r7 != r1) goto L3f
            return r1
        L3f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.SelectImplementation.processResultAndInvokeBlockRecoveringException(kotlinx.coroutines.selects.SelectImplementation$ClauseData, java.lang.Object, T9.a):java.lang.Object");
    }

    public static /* synthetic */ void register$default(SelectImplementation selectImplementation, ClauseData clauseData, boolean z10, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
        if ((i & 1) != 0) {
            z10 = false;
        }
        selectImplementation.register(clauseData, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reregisterClause(Object clauseObject) {
        SelectImplementation<R>.ClauseData findClause = findClause(clauseObject);
        findClause.disposableHandleOrSegment = null;
        findClause.indexInSegment = -1;
        register(findClause, true);
    }

    private final /* synthetic */ void setState$volatile(Object obj) {
        this.state$volatile = obj;
    }

    private final int trySelectInternal(Object clauseObject, Object internalResult) {
        boolean tryResume;
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        Symbol symbol4;
        while (true) {
            Object obj = state$volatile$FU.get(this);
            if (!(obj instanceof CancellableContinuation)) {
                symbol2 = SelectKt.STATE_COMPLETED;
                if (f.b(obj, symbol2) || (obj instanceof ClauseData)) {
                    return 3;
                }
                symbol3 = SelectKt.STATE_CANCELLED;
                if (f.b(obj, symbol3)) {
                    return 2;
                }
                symbol4 = SelectKt.STATE_REG;
                if (f.b(obj, symbol4)) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = state$volatile$FU;
                    List singletonList = Collections.singletonList(clauseObject);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, singletonList)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    return 1;
                }
                if (!(obj instanceof List)) {
                    throw new IllegalStateException(("Unexpected state: " + obj).toString());
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = state$volatile$FU;
                ArrayList T = s.T(clauseObject, (Collection) obj);
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, T)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
                return 1;
            }
            SelectImplementation<R>.ClauseData findClause = findClause(clauseObject);
            if (findClause != null) {
                InterfaceC0651q<Throwable, Object, d, p> createOnCancellationAction = findClause.createOnCancellationAction(this, internalResult);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = state$volatile$FU;
                while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, findClause)) {
                    if (atomicReferenceFieldUpdater3.get(this) != obj) {
                        break;
                    }
                }
                this.internalResult = internalResult;
                tryResume = SelectKt.tryResume((CancellableContinuation) obj, createOnCancellationAction);
                if (tryResume) {
                    return 0;
                }
                symbol = SelectKt.NO_RESULT;
                this.internalResult = symbol;
                return 2;
            }
            continue;
        }
    }

    private final /* synthetic */ void update$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, InterfaceC0646l<Object, ? extends Object> interfaceC0646l) {
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(obj);
            Object invoke = interfaceC0646l.invoke(obj2);
            while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, invoke)) {
                if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                    break;
                }
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        r6 = r0.getResult();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        if (r6 != kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        return O9.p.f3034a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object waitUntilSelected(T9.a<? super O9.p> r6) {
        /*
            r5 = this;
            kotlinx.coroutines.CancellableContinuationImpl r0 = new kotlinx.coroutines.CancellableContinuationImpl
            T9.a r6 = U4.b.p(r6)
            r1 = 1
            r0.<init>(r6, r1)
            r0.initCancellability()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = access$getState$volatile$FU()
        L11:
            java.lang.Object r1 = r6.get(r5)
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.selects.SelectKt.access$getSTATE_REG$p()
            if (r1 != r2) goto L30
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = access$getState$volatile$FU()
        L1f:
            boolean r3 = r2.compareAndSet(r5, r1, r0)
            if (r3 == 0) goto L29
            kotlinx.coroutines.CancellableContinuationKt.invokeOnCancellation(r0, r5)
            goto L70
        L29:
            java.lang.Object r3 = r2.get(r5)
            if (r3 == r1) goto L1f
            goto L11
        L30:
            boolean r2 = r1 instanceof java.util.List
            if (r2 == 0) goto L5d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = access$getState$volatile$FU()
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.selects.SelectKt.access$getSTATE_REG$p()
        L3c:
            boolean r4 = r2.compareAndSet(r5, r1, r3)
            if (r4 == 0) goto L56
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L48:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L11
            java.lang.Object r2 = r1.next()
            access$reregisterClause(r5, r2)
            goto L48
        L56:
            java.lang.Object r4 = r2.get(r5)
            if (r4 == r1) goto L3c
            goto L11
        L5d:
            boolean r6 = r1 instanceof kotlinx.coroutines.selects.SelectImplementation.ClauseData
            if (r6 == 0) goto L7c
            O9.p r6 = O9.p.f3034a
            kotlinx.coroutines.selects.SelectImplementation$ClauseData r1 = (kotlinx.coroutines.selects.SelectImplementation.ClauseData) r1
            java.lang.Object r2 = access$getInternalResult$p(r5)
            ca.q r1 = r1.createOnCancellationAction(r5, r2)
            r0.resume(r6, r1)
        L70:
            java.lang.Object r6 = r0.getResult()
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            if (r6 != r0) goto L79
            return r6
        L79:
            O9.p r6 = O9.p.f3034a
            return r6
        L7c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "unexpected state: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.SelectImplementation.waitUntilSelected(T9.a):java.lang.Object");
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public void disposeOnCompletion(DisposableHandle disposableHandle) {
        this.disposableHandleOrSegment = disposableHandle;
    }

    public Object doSelect(a<? super R> aVar) {
        return doSelect$suspendImpl(this, aVar);
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public d getContext() {
        return this.context;
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <P, Q> void invoke(SelectClause2<? super P, ? extends Q> selectClause2, InterfaceC0650p<? super Q, ? super a<? super R>, ? extends Object> interfaceC0650p) {
        SelectBuilder.DefaultImpls.invoke(this, selectClause2, interfaceC0650p);
    }

    @Override // kotlinx.coroutines.Waiter
    public void invokeOnCancellation(Segment<?> segment, int index) {
        this.disposableHandleOrSegment = segment;
        this.indexInSegment = index;
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    @ExperimentalCoroutinesApi
    public void onTimeout(long j10, InterfaceC0646l<? super a<? super R>, ? extends Object> interfaceC0646l) {
        SelectBuilder.DefaultImpls.onTimeout(this, j10, interfaceC0646l);
    }

    public final void register(SelectImplementation<R>.ClauseData clauseData, boolean z10) {
        if (state$volatile$FU.get(this) instanceof ClauseData) {
            return;
        }
        if (!z10) {
            checkClauseObject(clauseData.clauseObject);
        }
        if (!clauseData.tryRegisterAsWaiter(this)) {
            state$volatile$FU.set(this, clauseData);
            return;
        }
        if (!z10) {
            this.clauses.add(clauseData);
        }
        clauseData.disposableHandleOrSegment = this.disposableHandleOrSegment;
        clauseData.indexInSegment = this.indexInSegment;
        this.disposableHandleOrSegment = null;
        this.indexInSegment = -1;
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public void selectInRegistrationPhase(Object internalResult) {
        this.internalResult = internalResult;
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public boolean trySelect(Object clauseObject, Object result) {
        return trySelectInternal(clauseObject, result) == 0;
    }

    public final TrySelectDetailedResult trySelectDetailed(Object clauseObject, Object result) {
        TrySelectDetailedResult TrySelectDetailedResult;
        TrySelectDetailedResult = SelectKt.TrySelectDetailedResult(trySelectInternal(clauseObject, result));
        return TrySelectDetailedResult;
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public void invoke(SelectClause0 selectClause0, InterfaceC0646l<? super a<? super R>, ? extends Object> interfaceC0646l) {
        register$default(this, new ClauseData(selectClause0.getClauseObject(), selectClause0.getRegFunc(), selectClause0.getProcessResFunc(), SelectKt.getPARAM_CLAUSE_0(), interfaceC0646l, selectClause0.getOnCancellationConstructor()), false, 1, null);
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <Q> void invoke(SelectClause1<? extends Q> selectClause1, InterfaceC0650p<? super Q, ? super a<? super R>, ? extends Object> interfaceC0650p) {
        register$default(this, new ClauseData(selectClause1.getClauseObject(), selectClause1.getRegFunc(), selectClause1.getProcessResFunc(), null, interfaceC0650p, selectClause1.getOnCancellationConstructor()), false, 1, null);
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <P, Q> void invoke(SelectClause2<? super P, ? extends Q> selectClause2, P p10, InterfaceC0650p<? super Q, ? super a<? super R>, ? extends Object> interfaceC0650p) {
        register$default(this, new ClauseData(selectClause2.getClauseObject(), selectClause2.getRegFunc(), selectClause2.getProcessResFunc(), p10, interfaceC0650p, selectClause2.getOnCancellationConstructor()), false, 1, null);
    }

    @Override // kotlinx.coroutines.CancelHandler
    public void invoke(Throwable cause) {
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = state$volatile$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            symbol = SelectKt.STATE_COMPLETED;
            if (obj == symbol) {
                return;
            }
            symbol2 = SelectKt.STATE_CANCELLED;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, symbol2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            List<SelectImplementation<R>.ClauseData> list = this.clauses;
            if (list == null) {
                return;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((ClauseData) it.next()).dispose();
            }
            symbol3 = SelectKt.NO_RESULT;
            this.internalResult = symbol3;
            this.clauses = null;
            return;
        }
    }
}

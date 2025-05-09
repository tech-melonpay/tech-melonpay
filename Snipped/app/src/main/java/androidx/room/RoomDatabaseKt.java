package androidx.room;

import O9.p;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ThreadContextElementKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: RoomDatabaseExt.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0003\u001a;\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aI\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0011\u001a\u00020\b*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a;\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00190\u0018*\u00020\u00012\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"R", "Landroidx/room/RoomDatabase;", "Lkotlin/Function1;", "LT9/a;", "", "block", "withTransaction", "(Landroidx/room/RoomDatabase;Lca/l;LT9/a;)Ljava/lang/Object;", "Lkotlin/coroutines/d;", "context", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "transactionBlock", "startTransactionCoroutine", "(Landroidx/room/RoomDatabase;Lkotlin/coroutines/d;Lca/p;LT9/a;)Ljava/lang/Object;", "Lkotlin/coroutines/c;", "dispatcher", "createTransactionContext", "(Landroidx/room/RoomDatabase;Lkotlin/coroutines/c;)Lkotlin/coroutines/d;", "", "", "tables", "", "emitInitialState", "Lkotlinx/coroutines/flow/Flow;", "", "invalidationTrackerFlow", "(Landroidx/room/RoomDatabase;[Ljava/lang/String;Z)Lkotlinx/coroutines/flow/Flow;", "room-ktx_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class RoomDatabaseKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.coroutines.d createTransactionContext(RoomDatabase roomDatabase, kotlin.coroutines.c cVar) {
        TransactionElement transactionElement = new TransactionElement(cVar);
        return cVar.plus(transactionElement).plus(ThreadContextElementKt.asContextElement(roomDatabase.getSuspendingTransactionId(), Integer.valueOf(System.identityHashCode(transactionElement))));
    }

    public static final Flow<Set<String>> invalidationTrackerFlow(RoomDatabase roomDatabase, String[] strArr, boolean z10) {
        return FlowKt.callbackFlow(new RoomDatabaseKt$invalidationTrackerFlow$1(z10, roomDatabase, strArr, null));
    }

    public static /* synthetic */ Flow invalidationTrackerFlow$default(RoomDatabase roomDatabase, String[] strArr, boolean z10, int i, Object obj) {
        if ((i & 2) != 0) {
            z10 = true;
        }
        return invalidationTrackerFlow(roomDatabase, strArr, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <R> Object startTransactionCoroutine(final RoomDatabase roomDatabase, final kotlin.coroutines.d dVar, final InterfaceC0650p<? super CoroutineScope, ? super T9.a<? super R>, ? extends Object> interfaceC0650p, T9.a<? super R> aVar) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(U4.b.p(aVar), 1);
        cancellableContinuationImpl.initCancellability();
        try {
            roomDatabase.getTransactionExecutor().execute(new Runnable() { // from class: androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1

                /* compiled from: RoomDatabaseExt.kt */
                @V9.d(c = "androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1$1", f = "RoomDatabaseExt.kt", l = {103}, m = "invokeSuspend")
                @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lkotlinx/coroutines/CoroutineScope;", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
                /* renamed from: androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1$1, reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {
                    final /* synthetic */ CancellableContinuation<R> $continuation;
                    final /* synthetic */ RoomDatabase $this_startTransactionCoroutine;
                    final /* synthetic */ InterfaceC0650p<CoroutineScope, T9.a<? super R>, Object> $transactionBlock;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public AnonymousClass1(RoomDatabase roomDatabase, CancellableContinuation<? super R> cancellableContinuation, InterfaceC0650p<? super CoroutineScope, ? super T9.a<? super R>, ? extends Object> interfaceC0650p, T9.a<? super AnonymousClass1> aVar) {
                        super(2, aVar);
                        this.$this_startTransactionCoroutine = roomDatabase;
                        this.$continuation = cancellableContinuation;
                        this.$transactionBlock = interfaceC0650p;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_startTransactionCoroutine, this.$continuation, this.$transactionBlock, aVar);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        kotlin.coroutines.d createTransactionContext;
                        T9.a aVar;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                        int i = this.label;
                        if (i == 0) {
                            kotlin.b.b(obj);
                            createTransactionContext = RoomDatabaseKt.createTransactionContext(this.$this_startTransactionCoroutine, (kotlin.coroutines.c) ((CoroutineScope) this.L$0).getCoroutineContext().get(c.a.f23157a));
                            T9.a aVar2 = this.$continuation;
                            InterfaceC0650p<CoroutineScope, T9.a<? super R>, Object> interfaceC0650p = this.$transactionBlock;
                            this.L$0 = aVar2;
                            this.label = 1;
                            obj = BuildersKt.withContext(createTransactionContext, interfaceC0650p, this);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            aVar = aVar2;
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar = (T9.a) this.L$0;
                            kotlin.b.b(obj);
                        }
                        aVar.resumeWith(obj);
                        return p.f3034a;
                    }

                    @Override // ca.InterfaceC0650p
                    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
                        return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        BuildersKt.runBlocking(kotlin.coroutines.d.this.minusKey(c.a.f23157a), new AnonymousClass1(roomDatabase, cancellableContinuationImpl, interfaceC0650p, null));
                    } catch (Throwable th) {
                        cancellableContinuationImpl.cancel(th);
                    }
                }
            });
        } catch (RejectedExecutionException e10) {
            cancellableContinuationImpl.cancel(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e10));
        }
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        return result;
    }

    public static final <R> Object withTransaction(RoomDatabase roomDatabase, InterfaceC0646l<? super T9.a<? super R>, ? extends Object> interfaceC0646l, T9.a<? super R> aVar) {
        RoomDatabaseKt$withTransaction$transactionBlock$1 roomDatabaseKt$withTransaction$transactionBlock$1 = new RoomDatabaseKt$withTransaction$transactionBlock$1(roomDatabase, interfaceC0646l, null);
        TransactionElement transactionElement = (TransactionElement) aVar.getContext().get(TransactionElement.INSTANCE);
        kotlin.coroutines.c transactionDispatcher = transactionElement != null ? transactionElement.getTransactionDispatcher() : null;
        return transactionDispatcher != null ? BuildersKt.withContext(transactionDispatcher, roomDatabaseKt$withTransaction$transactionBlock$1, aVar) : startTransactionCoroutine(roomDatabase, aVar.getContext(), roomDatabaseKt$withTransaction$transactionBlock$1, aVar);
    }
}

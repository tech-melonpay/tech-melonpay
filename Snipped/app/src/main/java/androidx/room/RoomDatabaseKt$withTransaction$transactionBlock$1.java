package androidx.room;

import O9.p;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: RoomDatabaseExt.kt */
@V9.d(c = "androidx.room.RoomDatabaseKt$withTransaction$transactionBlock$1", f = "RoomDatabaseExt.kt", l = {62}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RoomDatabaseKt$withTransaction$transactionBlock$1<R> extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super R>, Object> {
    final /* synthetic */ InterfaceC0646l<T9.a<? super R>, Object> $block;
    final /* synthetic */ RoomDatabase $this_withTransaction;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RoomDatabaseKt$withTransaction$transactionBlock$1(RoomDatabase roomDatabase, InterfaceC0646l<? super T9.a<? super R>, ? extends Object> interfaceC0646l, T9.a<? super RoomDatabaseKt$withTransaction$transactionBlock$1> aVar) {
        super(2, aVar);
        this.$this_withTransaction = roomDatabase;
        this.$block = interfaceC0646l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        RoomDatabaseKt$withTransaction$transactionBlock$1 roomDatabaseKt$withTransaction$transactionBlock$1 = new RoomDatabaseKt$withTransaction$transactionBlock$1(this.$this_withTransaction, this.$block, aVar);
        roomDatabaseKt$withTransaction$transactionBlock$1.L$0 = obj;
        return roomDatabaseKt$withTransaction$transactionBlock$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.coroutines.intrinsics.CoroutineSingletons] */
    /* JADX WARN: Type inference failed for: r0v3 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        TransactionElement transactionElement;
        TransactionElement transactionElement2 = CoroutineSingletons.f23158a;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                TransactionElement transactionElement3 = (TransactionElement) ((CoroutineScope) this.L$0).getCoroutineContext().get(TransactionElement.INSTANCE);
                transactionElement3.acquire();
                try {
                    this.$this_withTransaction.beginTransaction();
                    try {
                        InterfaceC0646l<T9.a<? super R>, Object> interfaceC0646l = this.$block;
                        this.L$0 = transactionElement3;
                        this.label = 1;
                        Object invoke = interfaceC0646l.invoke(this);
                        if (invoke == transactionElement2) {
                            return transactionElement2;
                        }
                        transactionElement = transactionElement3;
                        obj = invoke;
                    } catch (Throwable th2) {
                        th = th2;
                        this.$this_withTransaction.endTransaction();
                        throw th;
                    }
                } catch (Throwable th3) {
                    transactionElement2 = transactionElement3;
                    th = th3;
                    transactionElement2.release();
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                transactionElement = (TransactionElement) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th4) {
                    th = th4;
                    this.$this_withTransaction.endTransaction();
                    throw th;
                }
            }
            this.$this_withTransaction.setTransactionSuccessful();
            this.$this_withTransaction.endTransaction();
            transactionElement.release();
            return obj;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super R> aVar) {
        return ((RoomDatabaseKt$withTransaction$transactionBlock$1) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }
}

package kotlinx.coroutines.intrinsics;

import O9.p;
import T9.a;
import U4.b;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.jvm.internal.j;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.internal.DispatchedContinuationKt;

/* compiled from: Cancellable.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\u001a=\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001aQ\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u000b\u001a%\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00050\u00022\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\r\u001a*\u0010\u0010\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\u0082\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0014\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"T", "Lkotlin/Function1;", "LT9/a;", "", "completion", "LO9/p;", "startCoroutineCancellable", "(Lca/l;LT9/a;)V", "R", "Lkotlin/Function2;", "receiver", "(Lca/p;Ljava/lang/Object;LT9/a;)V", "fatalCompletion", "(LT9/a;LT9/a;)V", "Lkotlin/Function0;", "block", "runSafely", "(LT9/a;Lca/a;)V", "", "e", "dispatcherFailure", "(LT9/a;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class CancellableKt {
    private static final void dispatcherFailure(a<?> aVar, Throwable th) {
        aVar.resumeWith(new Result.Failure(th));
        throw th;
    }

    private static final void runSafely(a<?> aVar, InterfaceC0635a<p> interfaceC0635a) {
        try {
            interfaceC0635a.invoke();
        } catch (Throwable th) {
            dispatcherFailure(aVar, th);
        }
    }

    public static final <R, T> void startCoroutineCancellable(InterfaceC0650p<? super R, ? super a<? super T>, ? extends Object> interfaceC0650p, R r8, a<? super T> aVar) {
        try {
            DispatchedContinuationKt.resumeCancellableWith(b.p(b.f(interfaceC0650p, r8, aVar)), p.f3034a);
        } catch (Throwable th) {
            dispatcherFailure(aVar, th);
        }
    }

    public static final void startCoroutineCancellable(a<? super p> aVar, a<?> aVar2) {
        try {
            DispatchedContinuationKt.resumeCancellableWith(b.p(aVar), p.f3034a);
        } catch (Throwable th) {
            dispatcherFailure(aVar2, th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InternalCoroutinesApi
    public static final <T> void startCoroutineCancellable(final InterfaceC0646l<? super a<? super T>, ? extends Object> interfaceC0646l, final a<? super T> aVar) {
        a<p> aVar2;
        try {
            if (interfaceC0646l instanceof BaseContinuationImpl) {
                aVar2 = ((BaseContinuationImpl) interfaceC0646l).create(aVar);
            } else {
                final d context = aVar.getContext();
                if (context == EmptyCoroutineContext.f23155a) {
                    aVar2 = new RestrictedContinuationImpl(aVar) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1

                        /* renamed from: u, reason: collision with root package name */
                        public int f23162u;

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            int i = this.f23162u;
                            if (i != 0) {
                                if (i != 1) {
                                    throw new IllegalStateException("This coroutine had already completed".toString());
                                }
                                this.f23162u = 2;
                                kotlin.b.b(obj);
                                return obj;
                            }
                            this.f23162u = 1;
                            kotlin.b.b(obj);
                            InterfaceC0646l interfaceC0646l2 = InterfaceC0646l.this;
                            j.c(1, interfaceC0646l2);
                            return interfaceC0646l2.invoke(this);
                        }
                    };
                } else {
                    aVar2 = new ContinuationImpl(aVar, context) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2

                        /* renamed from: u, reason: collision with root package name */
                        public int f23164u;

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            int i = this.f23164u;
                            if (i != 0) {
                                if (i != 1) {
                                    throw new IllegalStateException("This coroutine had already completed".toString());
                                }
                                this.f23164u = 2;
                                kotlin.b.b(obj);
                                return obj;
                            }
                            this.f23164u = 1;
                            kotlin.b.b(obj);
                            InterfaceC0646l interfaceC0646l2 = interfaceC0646l;
                            j.c(1, interfaceC0646l2);
                            return interfaceC0646l2.invoke(this);
                        }
                    };
                }
            }
            DispatchedContinuationKt.resumeCancellableWith(b.p(aVar2), p.f3034a);
        } catch (Throwable th) {
            dispatcherFailure(aVar, th);
        }
    }
}

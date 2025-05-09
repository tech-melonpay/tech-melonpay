package kotlinx.coroutines.flow;

import O9.p;
import ca.InterfaceC0635a;
import ca.InterfaceC0650p;
import ca.InterfaceC0651q;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f;
import org.bouncycastle.tls.CipherSuite;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: Zip.kt */
@V9.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7", f = "Zip.kt", l = {304}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lkotlinx/coroutines/flow/FlowCollector;", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class FlowKt__ZipKt$combineTransform$7<R> extends SuspendLambda implements InterfaceC0650p<FlowCollector<? super R>, T9.a<? super p>, Object> {
    final /* synthetic */ Flow<T>[] $flowArray;
    final /* synthetic */ InterfaceC0651q<FlowCollector<? super R>, T[], T9.a<? super p>, Object> $transform;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Zip.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = CipherSuite.TLS_PSK_WITH_NULL_SHA256)
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$1, reason: invalid class name */
    public static final class AnonymousClass1<T> implements InterfaceC0635a<T[]> {
        final /* synthetic */ Flow<T>[] $flowArray;

        public AnonymousClass1(Flow<T>[] flowArr) {
            this.$flowArray = flowArr;
        }

        @Override // ca.InterfaceC0635a
        public final T[] invoke() {
            int length = this.$flowArray.length;
            f.e();
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Zip.kt */
    @V9.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2", f = "Zip.kt", l = {304}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2, reason: invalid class name */
    public static final class AnonymousClass2<T> extends SuspendLambda implements InterfaceC0651q<FlowCollector<? super R>, T[], T9.a<? super p>, Object> {
        final /* synthetic */ InterfaceC0651q<FlowCollector<? super R>, T[], T9.a<? super p>, Object> $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(InterfaceC0651q<? super FlowCollector<? super R>, ? super T[], ? super T9.a<? super p>, ? extends Object> interfaceC0651q, T9.a<? super AnonymousClass2> aVar) {
            super(3, aVar);
            this.$transform = interfaceC0651q;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Object[] objArr = (Object[]) this.L$1;
                InterfaceC0651q<FlowCollector<? super R>, T[], T9.a<? super p>, Object> interfaceC0651q = this.$transform;
                this.L$0 = null;
                this.label = 1;
                if (interfaceC0651q.invoke(flowCollector, objArr, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return p.f3034a;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            this.$transform.invoke((FlowCollector) this.L$0, (Object[]) this.L$1, this);
            return p.f3034a;
        }

        @Override // ca.InterfaceC0651q
        public final Object invoke(FlowCollector<? super R> flowCollector, T[] tArr, T9.a<? super p> aVar) {
            f.e();
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combineTransform$7(Flow<T>[] flowArr, InterfaceC0651q<? super FlowCollector<? super R>, ? super T[], ? super T9.a<? super p>, ? extends Object> interfaceC0651q, T9.a<? super FlowKt__ZipKt$combineTransform$7> aVar) {
        super(2, aVar);
        this.$flowArray = flowArr;
        this.$transform = interfaceC0651q;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        FlowKt__ZipKt$combineTransform$7 flowKt__ZipKt$combineTransform$7 = new FlowKt__ZipKt$combineTransform$7(this.$flowArray, this.$transform, aVar);
        flowKt__ZipKt$combineTransform$7.L$0 = obj;
        return flowKt__ZipKt$combineTransform$7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return p.f3034a;
        }
        kotlin.b.b(obj);
        f.e();
        throw null;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        f.e();
        throw null;
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(FlowCollector<? super R> flowCollector, T9.a<? super p> aVar) {
        return ((FlowKt__ZipKt$combineTransform$7) create(flowCollector, aVar)).invokeSuspend(p.f3034a);
    }
}

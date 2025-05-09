package com.sumsub.sns.videoident.presentation;

import O9.p;
import ca.InterfaceC0650p;
import com.sumsub.sns.internal.videoident.videoident.SNSVideoIdent;
import com.sumsub.sns.internal.videoident.videoident.chat.SNSVideoChatController;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@V9.d(c = "com.sumsub.sns.videoident.presentation.SNSVideoIdentFragment$attachChatControllerListeners$1", f = "SNSVideoIdentFragment.kt", l = {687}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSVideoIdentFragment$attachChatControllerListeners$1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {
    final /* synthetic */ SNSVideoChatController $videoChatController;
    int label;
    final /* synthetic */ SNSVideoIdentFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SNSVideoIdentFragment$attachChatControllerListeners$1(SNSVideoChatController sNSVideoChatController, SNSVideoIdentFragment sNSVideoIdentFragment, T9.a<? super SNSVideoIdentFragment$attachChatControllerListeners$1> aVar) {
        super(2, aVar);
        this.$videoChatController = sNSVideoChatController;
        this.this$0 = sNSVideoIdentFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        return new SNSVideoIdentFragment$attachChatControllerListeners$1(this.$videoChatController, this.this$0, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Flow<String> d10 = this.$videoChatController.d();
            final SNSVideoIdentFragment sNSVideoIdentFragment = this.this$0;
            FlowCollector<? super String> flowCollector = new FlowCollector() { // from class: com.sumsub.sns.videoident.presentation.SNSVideoIdentFragment$attachChatControllerListeners$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, T9.a aVar) {
                    return emit((String) obj2, (T9.a<? super p>) aVar);
                }

                public final Object emit(String str, T9.a<? super p> aVar) {
                    com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, s3.b.j("message: ", str), null, 4, null);
                    Object b9 = SNSVideoIdentFragment.this.getViewModel().b(str, aVar);
                    return b9 == CoroutineSingletons.f23158a ? b9 : p.f3034a;
                }
            };
            this.label = 1;
            if (d10.collect(flowCollector, this) == coroutineSingletons) {
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

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
        return ((SNSVideoIdentFragment$attachChatControllerListeners$1) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }
}

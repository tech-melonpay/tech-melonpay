package com.sumsub.sns.videoident.presentation;

import O9.p;
import android.content.Intent;
import ca.InterfaceC0650p;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.videoident.videoident.SNSVideoIdent;
import com.sumsub.sns.internal.videoident.videoident.chat.SNSVideoChatState;
import com.sumsub.sns.videoident.service.SNSVideoChatService;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@V9.d(c = "com.sumsub.sns.videoident.presentation.SNSVideoIdentFragment$attachChatControllerListeners$2", f = "SNSVideoIdentFragment.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/sumsub/sns/internal/videoident/videoident/chat/SNSVideoChatState;", "state", "LO9/p;", "<anonymous>", "(Lcom/sumsub/sns/internal/videoident/videoident/chat/SNSVideoChatState;)V"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSVideoIdentFragment$attachChatControllerListeners$2 extends SuspendLambda implements InterfaceC0650p<SNSVideoChatState, T9.a<? super p>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SNSVideoIdentFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SNSVideoIdentFragment$attachChatControllerListeners$2(SNSVideoIdentFragment sNSVideoIdentFragment, T9.a<? super SNSVideoIdentFragment$attachChatControllerListeners$2> aVar) {
        super(2, aVar);
        this.this$0 = sNSVideoIdentFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        SNSVideoIdentFragment$attachChatControllerListeners$2 sNSVideoIdentFragment$attachChatControllerListeners$2 = new SNSVideoIdentFragment$attachChatControllerListeners$2(this.this$0, aVar);
        sNSVideoIdentFragment$attachChatControllerListeners$2.L$0 = obj;
        return sNSVideoIdentFragment$attachChatControllerListeners$2;
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(SNSVideoChatState sNSVideoChatState, T9.a<? super p> aVar) {
        return ((SNSVideoIdentFragment$attachChatControllerListeners$2) create(sNSVideoChatState, aVar)).invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SNSVideoChatService service;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        SNSVideoChatState sNSVideoChatState = (SNSVideoChatState) this.L$0;
        if (sNSVideoChatState instanceof SNSVideoChatState.c) {
            if (this.this$0.serviceConnection.getConnected()) {
                com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "exiting foreground", null, 4, null);
                SNSVideoChatService service2 = this.this$0.serviceConnection.getService();
                if (service2 != null && service2.getIsInForeground() && (service = this.this$0.serviceConnection.getService()) != null) {
                    service.stopForeground(true);
                }
                this.this$0.requireActivity().stopService(new Intent(this.this$0.requireContext(), (Class<?>) SNSVideoChatService.class));
            } else {
                Logger.e$default(com.sumsub.sns.internal.log.a.f17535a, "SumSubVideoIdent", "SNSDisconnected but service is NOT connected", null, 4, null);
            }
        }
        this.this$0.getViewModel().a(sNSVideoChatState);
        return p.f3034a;
    }
}

package com.sumsub.sns.videoident.service;

import O9.p;
import T9.a;
import V9.d;
import ca.InterfaceC0650p;
import com.sumsub.sns.internal.videoident.videoident.chat.SNSVideoChatState;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

@d(c = "com.sumsub.sns.videoident.service.SNSVideoChatService$onCreate$1", f = "SNSVideoChatService.kt", l = {103, 106}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSVideoChatService$onCreate$1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, a<? super p>, Object> {
    int label;
    final /* synthetic */ SNSVideoChatService this$0;

    @d(c = "com.sumsub.sns.videoident.service.SNSVideoChatService$onCreate$1$2", f = "SNSVideoChatService.kt", l = {107}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.sumsub.sns.videoident.service.SNSVideoChatService$onCreate$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, a<? super p>, Object> {
        int label;
        final /* synthetic */ SNSVideoChatService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SNSVideoChatService sNSVideoChatService, a<? super AnonymousClass2> aVar) {
            super(2, aVar);
            this.this$0 = sNSVideoChatService;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<p> create(Object obj, a<?> aVar) {
            return new AnonymousClass2(this.this$0, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                StateFlow<SNSVideoChatState> l10 = this.this$0.getVideoChatController().l();
                final SNSVideoChatService sNSVideoChatService = this.this$0;
                FlowCollector<? super SNSVideoChatState> flowCollector = new FlowCollector() { // from class: com.sumsub.sns.videoident.service.SNSVideoChatService.onCreate.1.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, a aVar) {
                        return emit((SNSVideoChatState) obj2, (a<? super p>) aVar);
                    }

                    public final Object emit(SNSVideoChatState sNSVideoChatState, a<? super p> aVar) {
                        SNSVideoChatService.this.handleChatState(sNSVideoChatState);
                        return p.f3034a;
                    }
                };
                this.label = 1;
                if (l10.collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // ca.InterfaceC0650p
        public final Object invoke(CoroutineScope coroutineScope, a<? super p> aVar) {
            return ((AnonymousClass2) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SNSVideoChatService$onCreate$1(SNSVideoChatService sNSVideoChatService, a<? super SNSVideoChatService$onCreate$1> aVar) {
        super(2, aVar);
        this.this$0 = sNSVideoChatService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<p> create(Object obj, a<?> aVar) {
        return new SNSVideoChatService$onCreate$1(this.this$0, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0057 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.b.b(r7)
            goto L58
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            kotlin.b.b(r7)
            goto L36
        L1c:
            kotlin.b.b(r7)
            com.sumsub.sns.videoident.service.SNSVideoChatService r7 = r6.this$0
            com.sumsub.sns.internal.core.a r7 = com.sumsub.sns.videoident.service.SNSVideoChatService.access$getServiceLocator(r7)
            if (r7 == 0) goto L3f
            com.sumsub.sns.internal.core.data.source.dynamic.b r7 = r7.p()
            if (r7 == 0) goto L3f
            r6.label = r3
            java.lang.Object r7 = r7.d(r6)
            if (r7 != r0) goto L36
            return r0
        L36:
            com.sumsub.sns.internal.core.data.source.dynamic.b$c r7 = (com.sumsub.sns.internal.core.data.source.dynamic.b.c) r7
            if (r7 == 0) goto L3f
            com.sumsub.sns.videoident.service.SNSVideoChatService r1 = r6.this$0
            com.sumsub.sns.videoident.service.SNSVideoChatService.access$setStrings$p(r1, r7)
        L3f:
            com.sumsub.sns.videoident.service.SNSVideoChatService r7 = r6.this$0
            androidx.lifecycle.Lifecycle r7 = r7.getLifecycle()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.f6977c
            com.sumsub.sns.videoident.service.SNSVideoChatService$onCreate$1$2 r3 = new com.sumsub.sns.videoident.service.SNSVideoChatService$onCreate$1$2
            com.sumsub.sns.videoident.service.SNSVideoChatService r4 = r6.this$0
            r5 = 0
            r3.<init>(r4, r5)
            r6.label = r2
            java.lang.Object r7 = androidx.lifecycle.RepeatOnLifecycleKt.a(r7, r1, r3, r6)
            if (r7 != r0) goto L58
            return r0
        L58:
            O9.p r7 = O9.p.f3034a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.videoident.service.SNSVideoChatService$onCreate$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, a<? super p> aVar) {
        return ((SNSVideoChatService$onCreate$1) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }
}

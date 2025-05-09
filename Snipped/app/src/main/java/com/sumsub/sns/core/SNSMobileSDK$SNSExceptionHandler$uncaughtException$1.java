package com.sumsub.sns.core;

import O9.p;
import T9.a;
import V9.d;
import ca.InterfaceC0650p;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.SNSMobileSDK;
import com.sumsub.sns.internal.core.data.model.LogParams;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@d(c = "com.sumsub.sns.core.SNSMobileSDK$SNSExceptionHandler$uncaughtException$1", f = "SNSMobileSDK.kt", l = {667}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSMobileSDK$SNSExceptionHandler$uncaughtException$1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, a<? super p>, Object> {
    final /* synthetic */ Throwable $e;
    int label;
    final /* synthetic */ SNSMobileSDK.SNSExceptionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SNSMobileSDK$SNSExceptionHandler$uncaughtException$1(SNSMobileSDK.SNSExceptionHandler sNSExceptionHandler, Throwable th, a<? super SNSMobileSDK$SNSExceptionHandler$uncaughtException$1> aVar) {
        super(2, aVar);
        this.this$0 = sNSExceptionHandler;
        this.$e = th;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<p> create(Object obj, a<?> aVar) {
        return new SNSMobileSDK$SNSExceptionHandler$uncaughtException$1(this.this$0, this.$e, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LogParams prepareLogParams;
        com.sumsub.sns.internal.log.cacher.c cVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            prepareLogParams = this.this$0.prepareLogParams(this.$e);
            if (prepareLogParams == null) {
                Logger.i$default(com.sumsub.sns.internal.log.a.f17535a, "SDK", "Ignoring host appliaction's exceptions", null, 4, null);
                return p.f3034a;
            }
            cVar = this.this$0.sink;
            this.label = 1;
            obj = cVar.send(prepareLogParams, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        ((Boolean) obj).booleanValue();
        return p.f3034a;
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, a<? super p> aVar) {
        return ((SNSMobileSDK$SNSExceptionHandler$uncaughtException$1) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }
}

package com.sumsub.sns.core.data.listener;

import O9.p;
import T9.a;
import V9.d;
import ca.InterfaceC0650p;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

@d(c = "com.sumsub.sns.core.data.listener.CordovaTokenExpirationHandler$onTokenExpired$1", f = "TokenExpirationHandler.kt", l = {25}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CordovaTokenExpirationHandler$onTokenExpired$1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, a<? super String>, Object> {
    int label;
    final /* synthetic */ CordovaTokenExpirationHandler this$0;

    @d(c = "com.sumsub.sns.core.data.listener.CordovaTokenExpirationHandler$onTokenExpired$1$1", f = "TokenExpirationHandler.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.sumsub.sns.core.data.listener.CordovaTokenExpirationHandler$onTokenExpired$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, a<? super String>, Object> {
        int label;
        final /* synthetic */ CordovaTokenExpirationHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CordovaTokenExpirationHandler cordovaTokenExpirationHandler, a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.this$0 = cordovaTokenExpirationHandler;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<p> create(Object obj, a<?> aVar) {
            return new AnonymousClass1(this.this$0, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            return this.this$0.onTokenExpiredMain();
        }

        @Override // ca.InterfaceC0650p
        public final Object invoke(CoroutineScope coroutineScope, a<? super String> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CordovaTokenExpirationHandler$onTokenExpired$1(CordovaTokenExpirationHandler cordovaTokenExpirationHandler, a<? super CordovaTokenExpirationHandler$onTokenExpired$1> aVar) {
        super(2, aVar);
        this.this$0 = cordovaTokenExpirationHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<p> create(Object obj, a<?> aVar) {
        return new CordovaTokenExpirationHandler$onTokenExpired$1(this.this$0, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            obj = BuildersKt.withContext(main, anonymousClass1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return obj;
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, a<? super String> aVar) {
        return ((CordovaTokenExpirationHandler$onTokenExpired$1) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }
}

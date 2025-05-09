package kotlinx.coroutines.debug.internal;

import O9.p;
import T9.a;
import V9.c;
import V9.d;
import ca.InterfaceC0650p;
import ja.j;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: DebugCoroutineInfoImpl.kt */
@d(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1", f = "DebugCoroutineInfoImpl.kt", l = {164}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lja/j;", "Ljava/lang/StackTraceElement;", "LO9/p;", "<anonymous>", "(Lja/j;)V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class DebugCoroutineInfoImpl$creationStackTrace$1 extends RestrictedSuspendLambda implements InterfaceC0650p<j<? super StackTraceElement>, a<? super p>, Object> {
    final /* synthetic */ StackTraceFrame $bottom;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DebugCoroutineInfoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebugCoroutineInfoImpl$creationStackTrace$1(DebugCoroutineInfoImpl debugCoroutineInfoImpl, StackTraceFrame stackTraceFrame, a<? super DebugCoroutineInfoImpl$creationStackTrace$1> aVar) {
        super(2, aVar);
        this.this$0 = debugCoroutineInfoImpl;
        this.$bottom = stackTraceFrame;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<p> create(Object obj, a<?> aVar) {
        DebugCoroutineInfoImpl$creationStackTrace$1 debugCoroutineInfoImpl$creationStackTrace$1 = new DebugCoroutineInfoImpl$creationStackTrace$1(this.this$0, this.$bottom, aVar);
        debugCoroutineInfoImpl$creationStackTrace$1.L$0 = obj;
        return debugCoroutineInfoImpl$creationStackTrace$1;
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(j<? super StackTraceElement> jVar, a<? super p> aVar) {
        return ((DebugCoroutineInfoImpl$creationStackTrace$1) create(jVar, aVar)).invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object yieldFrames;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            j jVar = (j) this.L$0;
            DebugCoroutineInfoImpl debugCoroutineInfoImpl = this.this$0;
            c callerFrame = this.$bottom.getCallerFrame();
            this.label = 1;
            yieldFrames = debugCoroutineInfoImpl.yieldFrames(jVar, callerFrame, this);
            if (yieldFrames == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return p.f3034a;
    }
}

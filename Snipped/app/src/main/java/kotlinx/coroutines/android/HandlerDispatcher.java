package kotlinx.coroutines.android;

import O9.p;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* compiled from: HandlerDispatcher.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\b¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/android/HandlerDispatcher;", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "<init>", "()V", "immediate", "getImmediate", "()Lkotlinx/coroutines/android/HandlerDispatcher;", "Lkotlinx/coroutines/android/HandlerContext;", "kotlinx-coroutines-android"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class HandlerDispatcher extends MainCoroutineDispatcher implements Delay {
    public /* synthetic */ HandlerDispatcher(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // kotlinx.coroutines.Delay
    public Object delay(long j10, T9.a<? super p> aVar) {
        return Delay.DefaultImpls.delay(this, j10, aVar);
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher
    public abstract HandlerDispatcher getImmediate();

    public DisposableHandle invokeOnTimeout(long j10, Runnable runnable, d dVar) {
        return Delay.DefaultImpls.invokeOnTimeout(this, j10, runnable, dVar);
    }

    private HandlerDispatcher() {
    }
}

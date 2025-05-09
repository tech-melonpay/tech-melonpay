package kotlinx.coroutines.debug.internal;

import T9.a;
import kotlin.Metadata;

/* compiled from: DebugProbes.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001b\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a)\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LT9/a;", "frame", "LO9/p;", "probeCoroutineResumed", "(LT9/a;)V", "probeCoroutineSuspended", "T", "completion", "probeCoroutineCreated", "(LT9/a;)LT9/a;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class DebugProbesKt {
    public static final <T> a<T> probeCoroutineCreated(a<? super T> aVar) {
        return DebugProbesImpl.INSTANCE.probeCoroutineCreated$kotlinx_coroutines_core(aVar);
    }

    public static final void probeCoroutineResumed(a<?> aVar) {
        DebugProbesImpl.INSTANCE.probeCoroutineResumed$kotlinx_coroutines_core(aVar);
    }

    public static final void probeCoroutineSuspended(a<?> aVar) {
        DebugProbesImpl.INSTANCE.probeCoroutineSuspended$kotlinx_coroutines_core(aVar);
    }
}

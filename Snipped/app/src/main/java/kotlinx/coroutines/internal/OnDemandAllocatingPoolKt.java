package kotlinx.coroutines.internal;

import O9.p;
import ca.InterfaceC0635a;
import kotlin.Metadata;

/* compiled from: OnDemandAllocatingPool.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001e\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0082\b¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/Function0;", "LO9/p;", "block", "", "loop", "(Lca/a;)Ljava/lang/Void;", "", "IS_CLOSED_MASK", "I", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class OnDemandAllocatingPoolKt {
    private static final int IS_CLOSED_MASK = Integer.MIN_VALUE;

    private static final Void loop(InterfaceC0635a<p> interfaceC0635a) {
        while (true) {
            interfaceC0635a.invoke();
        }
    }
}

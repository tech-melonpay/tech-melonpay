package kotlinx.coroutines;

import O9.p;
import ca.InterfaceC0635a;
import kotlin.Metadata;

/* compiled from: Runnable.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a$\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\u000e\b\u0004\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006*\n\u0010\u0005\"\u00020\u00032\u00020\u0003¨\u0006\u0007"}, d2 = {"Lkotlin/Function0;", "LO9/p;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Runnable", "(Lca/a;)Ljava/lang/Runnable;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class RunnableKt {
    public static final Runnable Runnable(final InterfaceC0635a<p> interfaceC0635a) {
        return new Runnable() { // from class: kotlinx.coroutines.RunnableKt$Runnable$1
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC0635a.invoke();
            }
        };
    }
}

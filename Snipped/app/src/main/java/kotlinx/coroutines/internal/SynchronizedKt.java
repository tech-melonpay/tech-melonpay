package kotlinx.coroutines.internal;

import ca.InterfaceC0635a;
import kotlin.Metadata;
import kotlinx.coroutines.InternalCoroutinesApi;

/* compiled from: Synchronized.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a0\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0007*\u0010\b\u0007\u0010\t\"\u00020\u00012\u00020\u0001B\u0002\b\b¨\u0006\n"}, d2 = {"T", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "lock", "Lkotlin/Function0;", "block", "synchronizedImpl", "(Ljava/lang/Object;Lca/a;)Ljava/lang/Object;", "Lkotlinx/coroutines/InternalCoroutinesApi;", "SynchronizedObject", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class SynchronizedKt {
    @InternalCoroutinesApi
    public static final <T> T synchronizedImpl(Object obj, InterfaceC0635a<? extends T> interfaceC0635a) {
        T invoke;
        synchronized (obj) {
            invoke = interfaceC0635a.invoke();
        }
        return invoke;
    }

    @InternalCoroutinesApi
    public static /* synthetic */ void SynchronizedObject$annotations() {
    }
}

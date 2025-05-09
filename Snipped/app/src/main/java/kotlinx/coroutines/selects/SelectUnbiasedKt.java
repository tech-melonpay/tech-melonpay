package kotlinx.coroutines.selects;

import O9.p;
import T9.a;
import ca.InterfaceC0646l;
import kotlin.Metadata;

/* compiled from: SelectUnbiased.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086H\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"R", "Lkotlin/Function1;", "Lkotlinx/coroutines/selects/SelectBuilder;", "LO9/p;", "builder", "selectUnbiased", "(Lca/l;LT9/a;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class SelectUnbiasedKt {
    public static final <R> Object selectUnbiased(InterfaceC0646l<? super SelectBuilder<? super R>, p> interfaceC0646l, a<? super R> aVar) {
        UnbiasedSelectImplementation unbiasedSelectImplementation = new UnbiasedSelectImplementation(aVar.getContext());
        interfaceC0646l.invoke(unbiasedSelectImplementation);
        return unbiasedSelectImplementation.doSelect(aVar);
    }

    private static final <R> Object selectUnbiased$$forInline(InterfaceC0646l<? super SelectBuilder<? super R>, p> interfaceC0646l, a<? super R> aVar) {
        throw null;
    }
}

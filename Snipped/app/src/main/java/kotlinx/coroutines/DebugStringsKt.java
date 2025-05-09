package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Result;
import kotlinx.coroutines.internal.DispatchedContinuation;

/* compiled from: DebugStrings.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0007\u001a\u00020\u0001*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0018\u0010\t\u001a\u00020\u0001*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"LT9/a;", "", "toDebugString", "(LT9/a;)Ljava/lang/String;", "", "getHexAddress", "(Ljava/lang/Object;)Ljava/lang/String;", "hexAddress", "getClassSimpleName", "classSimpleName", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class DebugStringsKt {
    public static final String getClassSimpleName(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String getHexAddress(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String toDebugString(T9.a<?> aVar) {
        Object failure;
        if (aVar instanceof DispatchedContinuation) {
            return ((DispatchedContinuation) aVar).toString();
        }
        try {
            failure = aVar + '@' + getHexAddress(aVar);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) != null) {
            failure = aVar.getClass().getName() + '@' + getHexAddress(aVar);
        }
        return (String) failure;
    }
}

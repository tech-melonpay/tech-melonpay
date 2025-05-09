package kotlinx.coroutines.test;

import kotlin.Metadata;
import kotlinx.coroutines.ExperimentalCoroutinesApi;

/* compiled from: TestScope.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00060\u0002j\u0002`\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/test/UncompletedCoroutinesError;", "Lkotlin/AssertionError;", "Ljava/lang/AssertionError;", "message", "", "<init>", "(Ljava/lang/String;)V", "kotlinx-coroutines-test"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ExperimentalCoroutinesApi
/* loaded from: classes2.dex */
public final class UncompletedCoroutinesError extends AssertionError {
    public UncompletedCoroutinesError(String str) {
        super(str);
    }
}

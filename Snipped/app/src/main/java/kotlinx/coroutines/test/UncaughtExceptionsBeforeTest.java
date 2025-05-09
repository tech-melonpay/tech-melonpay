package kotlinx.coroutines.test;

import kotlin.Metadata;

/* compiled from: TestScope.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00060\u0002j\u0002`\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/test/UncaughtExceptionsBeforeTest;", "Lkotlin/IllegalStateException;", "Ljava/lang/IllegalStateException;", "<init>", "()V", "kotlinx-coroutines-test"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UncaughtExceptionsBeforeTest extends IllegalStateException {
    public UncaughtExceptionsBeforeTest() {
        super("There were uncaught exceptions before the test started. Please avoid this, as such exceptions are also reported in a platform-dependent manner so that they are not lost.");
    }
}

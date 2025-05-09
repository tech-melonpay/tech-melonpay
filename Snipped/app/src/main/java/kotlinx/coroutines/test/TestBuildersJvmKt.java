package kotlinx.coroutines.test;

import O9.p;
import ca.InterfaceC0650p;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.PrintStream;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;

/* compiled from: TestBuildersJvm.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a3\u0010\u0006\u001a\u00020\u00032\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\f\u0010\r*\n\u0010\u000e\"\u00020\u00032\u00020\u0003¨\u0006\u000f"}, d2 = {"Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "LT9/a;", "LO9/p;", "", "testProcedure", "createTestResult", "(Lca/p;)V", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "systemPropertyImpl", "(Ljava/lang/String;)Ljava/lang/String;", "dumpCoroutines", "()V", "TestResult", "kotlinx-coroutines-test"}, k = 2, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class TestBuildersJvmKt {
    public static final void createTestResult(InterfaceC0650p<? super CoroutineScope, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        BuildersKt__BuildersKt.runBlocking$default(null, new TestBuildersJvmKt$createTestResult$1(interfaceC0650p, null), 1, null);
    }

    public static final void dumpCoroutines() {
        DebugProbesImpl debugProbesImpl = DebugProbesImpl.INSTANCE;
        if (debugProbesImpl.isInstalled$kotlinx_coroutines_debug()) {
            debugProbesImpl.install$kotlinx_coroutines_core();
            try {
                PrintStream printStream = System.err;
                debugProbesImpl.dumpCoroutines(printStream);
                printStream.flush();
                debugProbesImpl.uninstall$kotlinx_coroutines_core();
            } catch (Throwable th) {
                DebugProbesImpl.INSTANCE.uninstall$kotlinx_coroutines_core();
                throw th;
            }
        }
    }

    public static final String systemPropertyImpl(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static /* synthetic */ void TestResult$annotations() {
    }
}

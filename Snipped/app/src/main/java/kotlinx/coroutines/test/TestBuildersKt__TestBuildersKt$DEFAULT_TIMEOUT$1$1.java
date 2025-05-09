package kotlinx.coroutines.test;

import androidx.camera.core.n;
import ca.InterfaceC0646l;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import la.c;

/* compiled from: TestBuilders.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class TestBuildersKt__TestBuildersKt$DEFAULT_TIMEOUT$1$1 extends FunctionReferenceImpl implements InterfaceC0646l<String, la.c> {
    public TestBuildersKt__TestBuildersKt$DEFAULT_TIMEOUT$1$1(Object obj) {
        super(1, obj, c.a.class, "parse", "parse-UwyO8pc(Ljava/lang/String;)J", 0);
    }

    @Override // ca.InterfaceC0646l
    public /* synthetic */ la.c invoke(String str) {
        return new la.c(m193invoke5sfh64U(str));
    }

    /* renamed from: invoke-5sfh64U, reason: not valid java name */
    public final long m193invoke5sfh64U(String str) {
        ((c.a) this.receiver).getClass();
        try {
            return la.e.a(str, false);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException(n.a("Invalid duration string format: '", str, "'."), e10);
        }
    }
}

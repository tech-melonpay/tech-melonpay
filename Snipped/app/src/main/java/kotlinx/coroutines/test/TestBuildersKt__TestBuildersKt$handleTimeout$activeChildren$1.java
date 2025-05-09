package kotlinx.coroutines.test;

import ca.InterfaceC0646l;
import kotlin.Metadata;
import kotlinx.coroutines.Job;

/* compiled from: TestBuilders.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TestBuildersKt__TestBuildersKt$handleTimeout$activeChildren$1 implements InterfaceC0646l<Job, Boolean> {
    public static final TestBuildersKt__TestBuildersKt$handleTimeout$activeChildren$1 INSTANCE = new TestBuildersKt__TestBuildersKt$handleTimeout$activeChildren$1();

    @Override // ca.InterfaceC0646l
    public final Boolean invoke(Job job) {
        return Boolean.valueOf(job.isActive());
    }
}

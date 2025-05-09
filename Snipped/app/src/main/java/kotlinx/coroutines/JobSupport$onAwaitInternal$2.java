package kotlinx.coroutines;

import ca.InterfaceC0651q;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: JobSupport.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class JobSupport$onAwaitInternal$2 extends FunctionReferenceImpl implements InterfaceC0651q<JobSupport, Object, Object, Object> {
    public static final JobSupport$onAwaitInternal$2 INSTANCE = new JobSupport$onAwaitInternal$2();

    public JobSupport$onAwaitInternal$2() {
        super(3, JobSupport.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // ca.InterfaceC0651q
    public final Object invoke(JobSupport jobSupport, Object obj, Object obj2) {
        Object onAwaitInternalProcessResFunc;
        onAwaitInternalProcessResFunc = jobSupport.onAwaitInternalProcessResFunc(obj, obj2);
        return onAwaitInternalProcessResFunc;
    }
}

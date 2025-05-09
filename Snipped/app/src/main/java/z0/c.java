package Z0;

import java.util.concurrent.Executor;
import n.C1058a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4170a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f4170a) {
            case 0:
                runnable.run();
                break;
            case 1:
                C1058a.f().h(runnable);
                break;
            default:
                C1058a.f().f24059b.f24061c.execute(runnable);
                break;
        }
    }
}

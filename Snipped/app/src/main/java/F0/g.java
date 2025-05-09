package F0;

import android.view.Choreographer;

/* compiled from: ViewDataBinding.java */
/* loaded from: classes.dex */
public final class g implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f1154a;

    public g(f fVar) {
        this.f1154a = fVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.f1154a.f1145a.run();
    }
}

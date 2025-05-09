package t;

import androidx.camera.core.ZoomState;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class n0 implements CallbackToFutureAdapter.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27317a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f27318b;
    public final /* synthetic */ ZoomState i;

    public /* synthetic */ n0(p0 p0Var, ZoomState zoomState, int i) {
        this.f27317a = i;
        this.f27318b = p0Var;
        this.i = zoomState;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
    public final Object attachCompleter(final CallbackToFutureAdapter.a aVar) {
        switch (this.f27317a) {
            case 0:
                final p0 p0Var = this.f27318b;
                p0Var.getClass();
                final ZoomState zoomState = this.i;
                final int i = 0;
                p0Var.f27325b.execute(new Runnable() { // from class: t.o0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                p0Var.b(aVar, zoomState);
                                break;
                            default:
                                p0Var.b(aVar, zoomState);
                                break;
                        }
                    }
                });
                return "setZoomRatio";
            default:
                final p0 p0Var2 = this.f27318b;
                p0Var2.getClass();
                final ZoomState zoomState2 = this.i;
                final int i9 = 1;
                p0Var2.f27325b.execute(new Runnable() { // from class: t.o0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i9) {
                            case 0:
                                p0Var2.b(aVar, zoomState2);
                                break;
                            default:
                                p0Var2.b(aVar, zoomState2);
                                break;
                        }
                    }
                });
                return "setLinearZoom";
        }
    }
}

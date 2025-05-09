package M;

import C.v;
import S1.i;
import a3.InterfaceFutureC0509a;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.camera2.internal.CaptureSession;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.ShaderProvider;
import androidx.camera.view.c;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.C0558y;
import ca.InterfaceC0650p;
import j2.AbstractC0888g;
import j2.AbstractC0892k;
import java.util.Arrays;
import k2.j;
import kotlin.jvm.internal.Ref$ObjectRef;
import n2.C1060a;
import u.f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2512a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2513b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2514c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2516e;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f2512a = i;
        this.f2513b = obj;
        this.f2514c = obj2;
        this.f2515d = obj3;
        this.f2516e = obj4;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f2516e;
        ?? r12 = this.f2515d;
        Object obj2 = this.f2514c;
        Object obj3 = this.f2513b;
        switch (this.f2512a) {
            case 0:
                androidx.camera.view.e eVar = (androidx.camera.view.e) obj3;
                eVar.getClass();
                Logger.d("TextureViewImpl", "Safe to release surface.");
                c.a aVar = eVar.f5867l;
                if (aVar != null) {
                    ((b) aVar).b();
                    eVar.f5867l = null;
                }
                ((Surface) obj2).release();
                if (eVar.f5863g == ((InterfaceFutureC0509a) r12)) {
                    eVar.f5863g = null;
                }
                if (eVar.f5864h == ((SurfaceRequest) obj)) {
                    eVar.f5864h = null;
                    break;
                }
                break;
            case 1:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj3;
                Object obj4 = ref$ObjectRef.f23179a;
                if (obj4 == i.f3353a || !((Boolean) ((InterfaceC0650p) obj2).invoke(obj4, r12)).booleanValue()) {
                    ref$ObjectRef.f23179a = r12;
                    ((C0558y) obj).postValue(r12);
                    break;
                }
                break;
            case 2:
                ((DefaultSurfaceProcessor) obj3).lambda$initGlRenderer$8((DynamicRange) obj2, (ShaderProvider) r12, (CallbackToFutureAdapter.a) obj);
                break;
            case 3:
                AbstractC0892k abstractC0892k = (AbstractC0892k) obj2;
                v vVar = (v) r12;
                AbstractC0888g abstractC0888g = (AbstractC0888g) obj;
                C1060a c1060a = (C1060a) obj3;
                c1060a.getClass();
                java.util.logging.Logger logger = C1060a.f24087f;
                try {
                    j jVar = c1060a.f24090c.get(abstractC0892k.b());
                    if (jVar == null) {
                        String str = "Transport backend '" + abstractC0892k.b() + "' is not registered";
                        logger.warning(str);
                        new IllegalArgumentException(str);
                        vVar.getClass();
                    } else {
                        c1060a.f24092e.d(new b(c1060a, abstractC0892k, jVar.a(abstractC0888g), 6));
                        vVar.getClass();
                    }
                    break;
                } catch (Exception e10) {
                    logger.warning("Error scheduling event " + e10.getMessage());
                    vVar.getClass();
                    return;
                }
            case 4:
                Camera2CameraImpl camera2CameraImpl = (Camera2CameraImpl) obj3;
                CaptureSession captureSession = (CaptureSession) obj2;
                camera2CameraImpl.f5145u.remove(captureSession);
                InterfaceFutureC0509a o10 = camera2CameraImpl.o(captureSession);
                DeferrableSurface deferrableSurface = (DeferrableSurface) r12;
                deferrableSurface.close();
                Futures.successfulAsList(Arrays.asList(o10, deferrableSurface.getTerminationFuture())).addListener((Runnable) obj, CameraXExecutors.directExecutor());
                break;
            case 5:
                ((f.b) obj3).f30038a.onCaptureCompleted((CameraCaptureSession) obj2, (CaptureRequest) r12, (TotalCaptureResult) obj);
                break;
            case 6:
                ((f.b) obj3).f30038a.onCaptureProgressed((CameraCaptureSession) obj2, (CaptureRequest) r12, (CaptureResult) obj);
                break;
            default:
                ((f.b) obj3).f30038a.onCaptureFailed((CameraCaptureSession) obj2, (CaptureRequest) r12, (CaptureFailure) obj);
                break;
        }
    }
}

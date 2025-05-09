package androidx.camera.camera2.internal;

import a3.InterfaceFutureC0509a;
import android.text.TextUtils;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.core.Preview;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.ArrayList;
import java.util.List;
import pa.C1124b;
import t.C1259k;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5232a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Camera2CameraImpl f5233b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5234c;

    public /* synthetic */ b(Camera2CameraImpl camera2CameraImpl, Object obj, int i) {
        this.f5232a = i;
        this.f5233b = camera2CameraImpl;
        this.f5234c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5232a) {
            case 0:
                Camera2CameraImpl camera2CameraImpl = this.f5233b;
                List<Camera2CameraImpl.f> list = (List) this.f5234c;
                camera2CameraImpl.getClass();
                ArrayList arrayList = new ArrayList();
                boolean z10 = false;
                for (Camera2CameraImpl.f fVar : list) {
                    if (camera2CameraImpl.f5126a.isUseCaseAttached(fVar.d())) {
                        camera2CameraImpl.f5126a.removeUseCase(fVar.d());
                        arrayList.add(fVar.d());
                        if (fVar.e() == Preview.class) {
                            z10 = true;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    camera2CameraImpl.e("Use cases [" + TextUtils.join(", ", arrayList) + "] now DETACHED for camera", null);
                    if (z10) {
                        camera2CameraImpl.f5133h.f27250g.f27171e = null;
                    }
                    camera2CameraImpl.a();
                    if (camera2CameraImpl.f5126a.getAttachedUseCaseConfigs().isEmpty()) {
                        camera2CameraImpl.f5133h.f27253k.f27377c = false;
                    } else {
                        camera2CameraImpl.y();
                    }
                    if (camera2CameraImpl.f5126a.getAttachedSessionConfigs().isEmpty()) {
                        camera2CameraImpl.f5133h.b();
                        camera2CameraImpl.q();
                        camera2CameraImpl.f5133h.i(false);
                        camera2CameraImpl.f5137m = camera2CameraImpl.k();
                        camera2CameraImpl.c();
                        break;
                    } else {
                        camera2CameraImpl.x();
                        camera2CameraImpl.q();
                        if (camera2CameraImpl.f5130e == Camera2CameraImpl.InternalState.f5154d) {
                            camera2CameraImpl.m();
                            break;
                        }
                    }
                }
                break;
            default:
                Camera2CameraImpl camera2CameraImpl2 = this.f5233b;
                CallbackToFutureAdapter.a aVar = (CallbackToFutureAdapter.a) this.f5234c;
                if (camera2CameraImpl2.f5139o == null) {
                    if (camera2CameraImpl2.f5130e != Camera2CameraImpl.InternalState.i) {
                        camera2CameraImpl2.f5139o = CallbackToFutureAdapter.a(new C1259k(camera2CameraImpl2, 2));
                    } else {
                        camera2CameraImpl2.f5139o = Futures.immediateFuture(null);
                    }
                }
                InterfaceFutureC0509a<Void> interfaceFutureC0509a = camera2CameraImpl2.f5139o;
                int ordinal = camera2CameraImpl2.f5130e.ordinal();
                Camera2CameraImpl.InternalState internalState = Camera2CameraImpl.InternalState.f5158h;
                switch (ordinal) {
                    case 0:
                    case 1:
                        C1124b.q(camera2CameraImpl2.f5135k == null, null);
                        camera2CameraImpl2.r(internalState);
                        C1124b.q(camera2CameraImpl2.j(), null);
                        camera2CameraImpl2.f();
                        break;
                    case 2:
                    case 5:
                    case 6:
                    case 7:
                        boolean a10 = camera2CameraImpl2.i.a();
                        camera2CameraImpl2.r(internalState);
                        if (a10) {
                            C1124b.q(camera2CameraImpl2.j(), null);
                            camera2CameraImpl2.f();
                            break;
                        }
                        break;
                    case 3:
                    case 4:
                        camera2CameraImpl2.r(internalState);
                        camera2CameraImpl2.b();
                        break;
                    default:
                        camera2CameraImpl2.e("release() ignored due to being in state: " + camera2CameraImpl2.f5130e, null);
                        break;
                }
                Futures.propagate(interfaceFutureC0509a, aVar);
                break;
        }
    }
}

package u;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Executor;
import u.o;
import u.v;

/* compiled from: CameraManagerCompatBaseImpl.java */
/* loaded from: classes.dex */
public class z implements v.b {

    /* renamed from: a, reason: collision with root package name */
    public final CameraManager f30080a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f30081b;

    /* compiled from: CameraManagerCompatBaseImpl.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f30082a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        public final Handler f30083b;

        public a(Handler handler) {
            this.f30083b = handler;
        }
    }

    public z(Context context, a aVar) {
        this.f30080a = (CameraManager) context.getSystemService("camera");
        this.f30081b = aVar;
    }

    @Override // u.v.b
    public void a(Camera2CameraImpl.b bVar) {
        v.a aVar;
        if (bVar != null) {
            a aVar2 = (a) this.f30081b;
            synchronized (aVar2.f30082a) {
                aVar = (v.a) aVar2.f30082a.remove(bVar);
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            synchronized (aVar.f30078c) {
                aVar.f30079d = true;
            }
        }
        this.f30080a.unregisterAvailabilityCallback(aVar);
    }

    @Override // u.v.b
    public CameraCharacteristics b(String str) {
        try {
            return this.f30080a.getCameraCharacteristics(str);
        } catch (CameraAccessException e10) {
            throw CameraAccessExceptionCompat.a(e10);
        }
    }

    @Override // u.v.b
    public void c(Executor executor, Camera2CameraImpl.b bVar) {
        v.a aVar;
        if (executor == null) {
            throw new IllegalArgumentException("executor was null");
        }
        a aVar2 = (a) this.f30081b;
        synchronized (aVar2.f30082a) {
            try {
                aVar = (v.a) aVar2.f30082a.get(bVar);
                if (aVar == null) {
                    aVar = new v.a(executor, bVar);
                    aVar2.f30082a.put(bVar, aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f30080a.registerAvailabilityCallback(aVar, aVar2.f30083b);
    }

    @Override // u.v.b
    public Set<Set<String>> d() {
        return Collections.emptySet();
    }

    @Override // u.v.b
    public void e(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        executor.getClass();
        stateCallback.getClass();
        try {
            this.f30080a.openCamera(str, new o.b(executor, stateCallback), ((a) this.f30081b).f30083b);
        } catch (CameraAccessException e10) {
            throw CameraAccessExceptionCompat.a(e10);
        }
    }
}

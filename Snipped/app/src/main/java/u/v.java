package u;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import c.RunnableC0615f;
import java.util.Set;
import java.util.concurrent.Executor;
import u.z;

/* compiled from: CameraManagerCompat.java */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final b f30074a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayMap f30075b = new ArrayMap(4);

    /* compiled from: CameraManagerCompat.java */
    public static final class a extends CameraManager.AvailabilityCallback {

        /* renamed from: a, reason: collision with root package name */
        public final Executor f30076a;

        /* renamed from: b, reason: collision with root package name */
        public final CameraManager.AvailabilityCallback f30077b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f30078c = new Object();

        /* renamed from: d, reason: collision with root package name */
        public boolean f30079d = false;

        public a(Executor executor, Camera2CameraImpl.b bVar) {
            this.f30076a = executor;
            this.f30077b = bVar;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAccessPrioritiesChanged() {
            synchronized (this.f30078c) {
                try {
                    if (!this.f30079d) {
                        this.f30076a.execute(new RunnableC0615f(this, 23));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAvailable(String str) {
            synchronized (this.f30078c) {
                try {
                    if (!this.f30079d) {
                        this.f30076a.execute(new u(this, str, 0));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraUnavailable(String str) {
            synchronized (this.f30078c) {
                try {
                    if (!this.f30079d) {
                        this.f30076a.execute(new u(this, str, 1));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: CameraManagerCompat.java */
    public interface b {
        void a(Camera2CameraImpl.b bVar);

        CameraCharacteristics b(String str);

        void c(Executor executor, Camera2CameraImpl.b bVar);

        Set<Set<String>> d();

        void e(String str, Executor executor, CameraDevice.StateCallback stateCallback);
    }

    public v(z zVar) {
        this.f30074a = zVar;
    }

    public static v a(Context context, Handler handler) {
        int i = Build.VERSION.SDK_INT;
        return new v(i >= 30 ? new y(context, null) : i >= 29 ? new x(context, null) : i >= 28 ? new w(context, null) : new z(context, new z.a(handler)));
    }

    public final n b(String str) {
        n nVar;
        synchronized (this.f30075b) {
            nVar = (n) this.f30075b.get(str);
            if (nVar == null) {
                try {
                    n nVar2 = new n(this.f30074a.b(str), str);
                    this.f30075b.put(str, nVar2);
                    nVar = nVar2;
                } catch (AssertionError e10) {
                    throw new CameraAccessExceptionCompat(e10.getMessage(), e10);
                }
            }
        }
        return nVar;
    }
}

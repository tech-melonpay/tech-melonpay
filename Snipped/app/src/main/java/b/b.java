package B;

import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.lifecycle.B;
import androidx.lifecycle.InterfaceC0551q;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.r;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: LifecycleCamera.java */
/* loaded from: classes.dex */
public final class b implements InterfaceC0551q, Camera {

    /* renamed from: b, reason: collision with root package name */
    public final r f166b;

    /* renamed from: c, reason: collision with root package name */
    public final CameraUseCaseAdapter f167c;

    /* renamed from: a, reason: collision with root package name */
    public final Object f165a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public boolean f168d = false;

    public b(r rVar, CameraUseCaseAdapter cameraUseCaseAdapter) {
        this.f166b = rVar;
        this.f167c = cameraUseCaseAdapter;
        if (rVar.getLifecycle().b().a(Lifecycle.State.f6978d)) {
            cameraUseCaseAdapter.attachUseCases();
        } else {
            cameraUseCaseAdapter.detachUseCases();
        }
        rVar.getLifecycle().a(this);
    }

    public final List<UseCase> a() {
        List<UseCase> unmodifiableList;
        synchronized (this.f165a) {
            unmodifiableList = Collections.unmodifiableList(this.f167c.getUseCases());
        }
        return unmodifiableList;
    }

    public final void b() {
        synchronized (this.f165a) {
            try {
                if (this.f168d) {
                    return;
                }
                onStop(this.f166b);
                this.f168d = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.f165a) {
            try {
                if (this.f168d) {
                    this.f168d = false;
                    if (this.f166b.getLifecycle().b().a(Lifecycle.State.f6978d)) {
                        onStart(this.f166b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.Camera
    public final CameraControl getCameraControl() {
        return this.f167c.getCameraControl();
    }

    @Override // androidx.camera.core.Camera
    public final CameraInfo getCameraInfo() {
        return this.f167c.getCameraInfo();
    }

    @Override // androidx.camera.core.Camera
    public final LinkedHashSet<CameraInternal> getCameraInternals() {
        return this.f167c.getCameraInternals();
    }

    @Override // androidx.camera.core.Camera
    public final CameraConfig getExtendedConfig() {
        return this.f167c.getExtendedConfig();
    }

    @Override // androidx.camera.core.Camera
    public final boolean isUseCasesCombinationSupported(UseCase... useCaseArr) {
        return this.f167c.isUseCasesCombinationSupported(useCaseArr);
    }

    @B(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(r rVar) {
        synchronized (this.f165a) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.f167c;
            cameraUseCaseAdapter.removeUseCases(cameraUseCaseAdapter.getUseCases());
        }
    }

    @B(Lifecycle.Event.ON_PAUSE)
    public void onPause(r rVar) {
        this.f167c.setActiveResumingMode(false);
    }

    @B(Lifecycle.Event.ON_RESUME)
    public void onResume(r rVar) {
        this.f167c.setActiveResumingMode(true);
    }

    @B(Lifecycle.Event.ON_START)
    public void onStart(r rVar) {
        synchronized (this.f165a) {
            try {
                if (!this.f168d) {
                    this.f167c.attachUseCases();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @B(Lifecycle.Event.ON_STOP)
    public void onStop(r rVar) {
        synchronized (this.f165a) {
            try {
                if (!this.f168d) {
                    this.f167c.detachUseCases();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.Camera
    public final void setExtendedConfig(CameraConfig cameraConfig) {
        this.f167c.setExtendedConfig(cameraConfig);
    }
}

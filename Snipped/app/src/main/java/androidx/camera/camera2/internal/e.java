package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import t.J;
import u.C1494a;

/* compiled from: Camera2CameraImpl.java */
/* loaded from: classes.dex */
public final class e implements FutureCallback<Void> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f5243a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Camera2CameraImpl f5244b;

    public e(Camera2CameraImpl camera2CameraImpl, J j10) {
        this.f5244b = camera2CameraImpl;
        this.f5243a = j10;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public final void onSuccess(Void r22) {
        CameraDevice cameraDevice;
        this.f5244b.f5141q.remove(this.f5243a);
        int ordinal = this.f5244b.f5130e.ordinal();
        if (ordinal != 5) {
            if (ordinal != 6) {
                if (ordinal != 7) {
                    return;
                }
            } else if (this.f5244b.f5136l == 0) {
                return;
            }
        }
        if (!this.f5244b.j() || (cameraDevice = this.f5244b.f5135k) == null) {
            return;
        }
        C1494a.a(cameraDevice);
        this.f5244b.f5135k = null;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public final void onFailure(Throwable th) {
    }
}

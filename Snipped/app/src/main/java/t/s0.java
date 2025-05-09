package t;

import android.hardware.camera2.CameraCharacteristics;
import android.media.ImageWriter;
import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.internal.utils.ZslRingBuffer;

/* compiled from: ZslControlImpl.java */
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final u.n f27375a;

    /* renamed from: b, reason: collision with root package name */
    public final ZslRingBuffer f27376b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f27377c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f27378d = false;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f27379e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f27380f;

    /* renamed from: g, reason: collision with root package name */
    public SafeCloseImageReaderProxy f27381g;

    /* renamed from: h, reason: collision with root package name */
    public CameraCaptureCallback f27382h;
    public ImmediateSurface i;

    /* renamed from: j, reason: collision with root package name */
    public ImageWriter f27383j;

    public s0(u.n nVar) {
        boolean z10;
        this.f27379e = false;
        this.f27380f = false;
        this.f27375a = nVar;
        int[] iArr = (int[]) nVar.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 4) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        this.f27379e = z10;
        this.f27380f = w.k.f30775a.get(w.I.class) != null;
        this.f27376b = new ZslRingBuffer(3, new s3.b(16));
    }
}

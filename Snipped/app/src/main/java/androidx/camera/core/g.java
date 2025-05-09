package androidx.camera.core;

import android.content.Context;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.Executor;
import u.C1496c;
import u.f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5317a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f5318b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5319c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5320d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5321e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5322f;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, long j10, int i) {
        this.f5317a = i;
        this.f5319c = obj;
        this.f5320d = obj2;
        this.f5321e = obj3;
        this.f5322f = obj4;
        this.f5318b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5317a) {
            case 0:
                ((CameraX) this.f5319c).lambda$initAndRetryRecursively$2((Context) this.f5320d, (Executor) this.f5321e, (CallbackToFutureAdapter.a) this.f5322f, this.f5318b);
                break;
            default:
                C1496c.a(((f.b) this.f5319c).f30038a, (CameraCaptureSession) this.f5320d, (CaptureRequest) this.f5321e, (Surface) this.f5322f, this.f5318b);
                break;
        }
    }
}

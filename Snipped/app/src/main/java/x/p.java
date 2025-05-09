package x;

import a3.InterfaceFutureC0509a;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import w.C1560h;

/* compiled from: WaitForRepeatingRequestStart.java */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f30896a;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceFutureC0509a<Void> f30898c;

    /* renamed from: d, reason: collision with root package name */
    public CallbackToFutureAdapter.a<Void> f30899d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f30900e;

    /* renamed from: b, reason: collision with root package name */
    public final Object f30897b = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final a f30901f = new a();

    /* compiled from: WaitForRepeatingRequestStart.java */
    public class a extends CameraCaptureSession.CaptureCallback {
        public a() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
            p pVar = p.this;
            CallbackToFutureAdapter.a<Void> aVar = pVar.f30899d;
            if (aVar != null) {
                aVar.f5931d = true;
                CallbackToFutureAdapter.c<Void> cVar = aVar.f5929b;
                if (cVar != null && cVar.f5933b.cancel(true)) {
                    aVar.f5928a = null;
                    aVar.f5929b = null;
                    aVar.f5930c = null;
                }
                pVar.f30899d = null;
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
            p pVar = p.this;
            CallbackToFutureAdapter.a<Void> aVar = pVar.f30899d;
            if (aVar != null) {
                aVar.b(null);
                pVar.f30899d = null;
            }
        }
    }

    /* compiled from: WaitForRepeatingRequestStart.java */
    @FunctionalInterface
    public interface b {
    }

    public p(Quirks quirks) {
        boolean contains = quirks.contains(C1560h.class);
        this.f30896a = contains;
        if (contains) {
            this.f30898c = CallbackToFutureAdapter.a(new com.sumsub.sns.geo.presentation.d(this, 29));
        } else {
            this.f30898c = Futures.immediateFuture(null);
        }
    }

    public static FutureChain a(CameraDevice cameraDevice, v.l lVar, List list, ArrayList arrayList, com.sumsub.sns.geo.presentation.d dVar) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((androidx.camera.camera2.internal.o) it.next()).i());
        }
        return FutureChain.from(Futures.successfulAsList(arrayList2)).transformAsync(new com.sumsub.sns.internal.core.domain.h(dVar, cameraDevice, lVar, list), CameraXExecutors.directExecutor());
    }
}

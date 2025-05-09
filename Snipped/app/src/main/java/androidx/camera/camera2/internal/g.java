package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.camera2.internal.CaptureSession;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.RequestProcessor;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.SessionProcessorSurface;
import androidx.camera.core.impl.TagBundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import pa.C1124b;
import t.C1252d;
import t.C1253e;
import t.G;

/* compiled from: Camera2RequestProcessor.java */
/* loaded from: classes.dex */
public final class g implements RequestProcessor {

    /* renamed from: a, reason: collision with root package name */
    public final CaptureSession f5246a;

    /* renamed from: b, reason: collision with root package name */
    public final List<SessionProcessorSurface> f5247b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f5248c = false;

    /* renamed from: d, reason: collision with root package name */
    public volatile SessionConfig f5249d;

    /* compiled from: Camera2RequestProcessor.java */
    public class a extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a, reason: collision with root package name */
        public final RequestProcessor.Callback f5250a;

        /* renamed from: b, reason: collision with root package name */
        public final RequestProcessor.Request f5251b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f5252c;

        public a(RequestProcessor.Request request, RequestProcessor.Callback callback, boolean z10) {
            this.f5250a = callback;
            this.f5251b = request;
            this.f5252c = z10;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j10) {
            int i;
            Iterator<SessionProcessorSurface> it = g.this.f5247b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                SessionProcessorSurface next = it.next();
                if (next.getSurface().get() == surface) {
                    i = next.getOutputConfigId();
                    break;
                }
                continue;
            }
            this.f5250a.onCaptureBufferLost(this.f5251b, j10, i);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.f5250a.onCaptureCompleted(this.f5251b, new C1253e(totalCaptureResult));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            this.f5250a.onCaptureFailed(this.f5251b, new C1252d(CameraCaptureFailure.Reason.ERROR, captureFailure));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            this.f5250a.onCaptureProgressed(this.f5251b, new C1253e(captureResult));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
            if (this.f5252c) {
                this.f5250a.onCaptureSequenceAborted(i);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j10) {
            if (this.f5252c) {
                this.f5250a.onCaptureSequenceCompleted(i, j10);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
            this.f5250a.onCaptureStarted(this.f5251b, j11, j10);
        }
    }

    public g(CaptureSession captureSession, ArrayList arrayList) {
        C1124b.m(captureSession.f5187l == CaptureSession.State.f5198e, "CaptureSession state must be OPENED. Current state:" + captureSession.f5187l);
        this.f5246a = captureSession;
        this.f5247b = Collections.unmodifiableList(new ArrayList(arrayList));
    }

    public final SessionProcessorSurface a(int i) {
        for (SessionProcessorSurface sessionProcessorSurface : this.f5247b) {
            if (sessionProcessorSurface.getOutputConfigId() == i) {
                return sessionProcessorSurface;
            }
        }
        return null;
    }

    @Override // androidx.camera.core.impl.RequestProcessor
    public final void abortCaptures() {
        if (this.f5248c) {
            return;
        }
        CaptureSession captureSession = this.f5246a;
        synchronized (captureSession.f5177a) {
            if (captureSession.f5187l != CaptureSession.State.f5198e) {
                Logger.e("CaptureSession", "Unable to abort captures. Incorrect state:" + captureSession.f5187l);
            } else {
                try {
                    captureSession.f5182f.abortCaptures();
                } catch (CameraAccessException e10) {
                    Logger.e("CaptureSession", "Unable to abort captures.", e10);
                }
            }
        }
    }

    public final boolean b(RequestProcessor.Request request) {
        if (request.getTargetOutputConfigIds().isEmpty()) {
            Logger.e("Camera2RequestProcessor", "Unable to submit the RequestProcessor.Request: empty targetOutputConfigIds");
            return false;
        }
        for (Integer num : request.getTargetOutputConfigIds()) {
            if (a(num.intValue()) == null) {
                Logger.e("Camera2RequestProcessor", "Unable to submit the RequestProcessor.Request: targetOutputConfigId(" + num + ") is not a valid id");
                return false;
            }
        }
        return true;
    }

    @Override // androidx.camera.core.impl.RequestProcessor
    public final int setRepeating(RequestProcessor.Request request, RequestProcessor.Callback callback) {
        if (this.f5248c || !b(request)) {
            return -1;
        }
        SessionConfig.Builder builder = new SessionConfig.Builder();
        builder.setTemplateType(request.getTemplateId());
        builder.setImplementationOptions(request.getParameters());
        builder.addCameraCaptureCallback(new G(new a(request, callback, true)));
        if (this.f5249d != null) {
            Iterator<CameraCaptureCallback> it = this.f5249d.getRepeatingCameraCaptureCallbacks().iterator();
            while (it.hasNext()) {
                builder.addCameraCaptureCallback(it.next());
            }
            TagBundle tagBundle = this.f5249d.getRepeatingCaptureConfig().getTagBundle();
            for (String str : tagBundle.listKeys()) {
                builder.addTag(str, tagBundle.getTag(str));
            }
        }
        Iterator<Integer> it2 = request.getTargetOutputConfigIds().iterator();
        while (it2.hasNext()) {
            builder.addSurface(a(it2.next().intValue()));
        }
        return this.f5246a.l(builder.build());
    }

    @Override // androidx.camera.core.impl.RequestProcessor
    public final void stopRepeating() {
        if (this.f5248c) {
            return;
        }
        CaptureSession captureSession = this.f5246a;
        synchronized (captureSession.f5177a) {
            if (captureSession.f5187l != CaptureSession.State.f5198e) {
                Logger.e("CaptureSession", "Unable to stop repeating. Incorrect state:" + captureSession.f5187l);
            } else {
                try {
                    captureSession.f5182f.stopRepeating();
                } catch (CameraAccessException e10) {
                    Logger.e("CaptureSession", "Unable to stop repeating.", e10);
                }
            }
        }
    }

    @Override // androidx.camera.core.impl.RequestProcessor
    public final int submit(RequestProcessor.Request request, RequestProcessor.Callback callback) {
        return submit(Arrays.asList(request), callback);
    }

    @Override // androidx.camera.core.impl.RequestProcessor
    public final int submit(List<RequestProcessor.Request> list, RequestProcessor.Callback callback) {
        if (this.f5248c) {
            return -1;
        }
        Iterator<RequestProcessor.Request> it = list.iterator();
        while (it.hasNext()) {
            if (!b(it.next())) {
                return -1;
            }
        }
        ArrayList arrayList = new ArrayList();
        boolean z10 = true;
        for (RequestProcessor.Request request : list) {
            CaptureConfig.Builder builder = new CaptureConfig.Builder();
            builder.setTemplateType(request.getTemplateId());
            builder.setImplementationOptions(request.getParameters());
            builder.addCameraCaptureCallback(new G(new a(request, callback, z10)));
            Iterator<Integer> it2 = request.getTargetOutputConfigIds().iterator();
            while (it2.hasNext()) {
                builder.addSurface(a(it2.next().intValue()));
            }
            arrayList.add(builder.build());
            z10 = false;
        }
        return this.f5246a.k(arrayList);
    }
}

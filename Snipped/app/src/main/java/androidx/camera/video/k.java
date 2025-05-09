package androidx.camera.video;

import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.video.Recorder;

/* compiled from: Recorder.java */
/* loaded from: classes.dex */
public final class k implements FutureCallback<androidx.camera.video.internal.encoder.a> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VideoEncoderSession f5766a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Recorder f5767b;

    public k(Recorder recorder, VideoEncoderSession videoEncoderSession) {
        this.f5767b = recorder;
        this.f5766a = videoEncoderSession;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public final void onFailure(Throwable th) {
        d dVar;
        Logger.d("Recorder", "VideoEncoder Setup error: " + th);
        Recorder recorder = this.f5767b;
        synchronized (recorder.f5487f) {
            try {
                dVar = null;
                switch (recorder.f5489h.ordinal()) {
                    case 1:
                    case 2:
                        d dVar2 = recorder.f5492l;
                        recorder.f5492l = null;
                        dVar = dVar2;
                    case 0:
                        recorder.B(-1);
                        recorder.A(Recorder.State.i);
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        throw new AssertionError("Encountered encoder setup error while in unexpected state " + recorder.f5489h + ": " + th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (dVar != null) {
            recorder.h(dVar, 7, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d1 A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:15:0x007c, B:16:0x0082, B:19:0x00f6, B:34:0x0087, B:35:0x0093, B:38:0x0099, B:39:0x00a0, B:41:0x00a4, B:43:0x00b2, B:44:0x00c5, B:46:0x00c9, B:49:0x00d1, B:51:0x00d7, B:52:0x00e2, B:54:0x00ed), top: B:14:0x007c }] */
    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onSuccess(androidx.camera.video.internal.encoder.a r9) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.k.onSuccess(java.lang.Object):void");
    }
}

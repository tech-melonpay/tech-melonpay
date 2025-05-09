package androidx.camera.video;

import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.video.internal.encoder.EncoderImpl;
import java.util.concurrent.ScheduledFuture;

/* compiled from: Recorder.java */
/* loaded from: classes.dex */
public final class l implements FutureCallback<androidx.camera.video.internal.encoder.a> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VideoEncoderSession f5768a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Recorder f5769b;

    public l(Recorder recorder, VideoEncoderSession videoEncoderSession) {
        this.f5769b = recorder;
        this.f5768a = videoEncoderSession;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public final void onFailure(Throwable th) {
        Logger.d("Recorder", "Error in ReadyToReleaseFuture: " + th);
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public final void onSuccess(androidx.camera.video.internal.encoder.a aVar) {
        EncoderImpl encoderImpl;
        androidx.camera.video.internal.encoder.a aVar2 = aVar;
        Logger.d("Recorder", "VideoEncoder can be released: " + aVar2);
        if (aVar2 == null) {
            return;
        }
        Recorder recorder = this.f5769b;
        ScheduledFuture<?> scheduledFuture = recorder.X;
        if (scheduledFuture != null && scheduledFuture.cancel(false) && (encoderImpl = recorder.f5464C) != null && encoderImpl == aVar2) {
            Recorder.p(encoderImpl);
        }
        recorder.f5481a0 = this.f5768a;
        recorder.z(null);
        recorder.s(recorder.m());
    }
}

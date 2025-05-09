package J;

import C.N;
import android.media.MediaCodec;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.video.internal.encoder.EncoderImpl;

/* compiled from: EncoderImpl.java */
/* loaded from: classes.dex */
public final class n implements FutureCallback<Void> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N f2073a;

    public n(N n10) {
        this.f2073a = n10;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public final void onFailure(Throwable th) {
        boolean z10 = th instanceof MediaCodec.CodecException;
        N n10 = this.f2073a;
        if (!z10) {
            ((EncoderImpl) n10.f535b).c(0, th.getMessage(), th);
            return;
        }
        EncoderImpl encoderImpl = (EncoderImpl) n10.f535b;
        MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
        encoderImpl.getClass();
        encoderImpl.c(1, codecException.getMessage(), codecException);
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public final /* bridge */ /* synthetic */ void onSuccess(Void r12) {
    }
}

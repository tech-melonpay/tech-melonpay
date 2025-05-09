package androidx.camera.video.internal.encoder;

import J.j;
import J.r;
import android.media.MediaCodec;
import androidx.camera.core.Logger;
import androidx.camera.video.internal.encoder.EncoderImpl;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5755a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5756b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5757c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5758d;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i) {
        this.f5755a = i;
        this.f5756b = obj;
        this.f5757c = obj2;
        this.f5758d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5755a) {
            case 0:
                EncoderImpl encoderImpl = (EncoderImpl) this.f5756b;
                if (encoderImpl.f5711t != EncoderImpl.InternalState.f5725h) {
                    if (!((List) this.f5757c).isEmpty()) {
                        Logger.d(encoderImpl.f5693a, "encoded data and input buffers are returned");
                    }
                    boolean z10 = encoderImpl.f5698f instanceof EncoderImpl.d;
                    MediaCodec mediaCodec = encoderImpl.f5697e;
                    if (!z10 || encoderImpl.f5691B) {
                        mediaCodec.stop();
                    } else {
                        mediaCodec.flush();
                        encoderImpl.f5690A = true;
                    }
                }
                Runnable runnable = (Runnable) this.f5758d;
                if (runnable != null) {
                    runnable.run();
                }
                EncoderImpl.InternalState internalState = encoderImpl.f5711t;
                if (internalState != EncoderImpl.InternalState.f5724g) {
                    if (!encoderImpl.f5690A) {
                        encoderImpl.j();
                    }
                    encoderImpl.l(EncoderImpl.InternalState.f5718a);
                    EncoderImpl.InternalState internalState2 = EncoderImpl.InternalState.f5722e;
                    EncoderImpl.InternalState internalState3 = EncoderImpl.InternalState.f5723f;
                    if (internalState == internalState2 || internalState == internalState3) {
                        encoderImpl.n();
                        if (internalState == internalState3) {
                            encoderImpl.f();
                            break;
                        }
                    }
                } else {
                    encoderImpl.h();
                    break;
                }
                break;
            default:
                Executor executor = (Executor) this.f5757c;
                j jVar = (j) this.f5758d;
                EncoderImpl encoderImpl2 = ((EncoderImpl.c) this.f5756b).f5739j;
                if (encoderImpl2.f5711t != EncoderImpl.InternalState.f5725h) {
                    try {
                        Objects.requireNonNull(jVar);
                        executor.execute(new r(jVar, 1));
                        break;
                    } catch (RejectedExecutionException e10) {
                        Logger.e(encoderImpl2.f5693a, "Unable to post to the supplied executor.", e10);
                    }
                }
                break;
        }
    }
}

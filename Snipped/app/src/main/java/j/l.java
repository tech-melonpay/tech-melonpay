package J;

import C.N;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.video.internal.encoder.EncoderImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2066a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EncoderImpl f2067b;

    public /* synthetic */ l(EncoderImpl encoderImpl, int i) {
        this.f2066a = i;
        this.f2067b = encoderImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2066a) {
            case 0:
                EncoderImpl encoderImpl = this.f2067b;
                if (encoderImpl.f5714w) {
                    Logger.w(encoderImpl.f5693a, "The data didn't reach the expected timestamp before timeout, stop the codec.");
                    encoderImpl.f5715x = null;
                    encoderImpl.m();
                    encoderImpl.f5714w = false;
                    return;
                }
                return;
            case 1:
                EncoderImpl encoderImpl2 = this.f2067b;
                Futures.addCallback(encoderImpl2.a(), new N(encoderImpl2, 2), encoderImpl2.f5700h);
                return;
            case 2:
                EncoderImpl encoderImpl3 = this.f2067b;
                int ordinal = encoderImpl3.f5711t.ordinal();
                if (ordinal == 1) {
                    encoderImpl3.i();
                    return;
                } else {
                    if (ordinal == 6 || ordinal == 8) {
                        throw new IllegalStateException("Encoder is released");
                    }
                    return;
                }
            case 3:
                EncoderImpl encoderImpl4 = this.f2067b;
                encoderImpl4.f5691B = true;
                if (encoderImpl4.f5690A) {
                    encoderImpl4.f5697e.stop();
                    encoderImpl4.j();
                    return;
                }
                return;
            default:
                EncoderImpl encoderImpl5 = this.f2067b;
                encoderImpl5.getClass();
                encoderImpl5.f5700h.execute(new l(encoderImpl5, 0));
                return;
        }
    }
}

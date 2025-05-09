package androidx.camera.video.internal.encoder;

import H.s;
import android.media.MediaCodec;
import android.os.Bundle;
import android.util.Range;
import androidx.camera.core.Logger;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.camera.video.internal.encoder.a;
import java.util.ArrayDeque;
import pa.C1124b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5748a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EncoderImpl f5749b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f5750c;

    public /* synthetic */ b(EncoderImpl encoderImpl, long j10, int i) {
        this.f5748a = i;
        this.f5749b = encoderImpl;
        this.f5750c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5748a) {
            case 0:
                EncoderImpl encoderImpl = this.f5749b;
                switch (encoderImpl.f5711t.ordinal()) {
                    case 0:
                    case 2:
                    case 3:
                    case 5:
                    case 7:
                        return;
                    case 1:
                        long j10 = this.f5750c;
                        Logger.d(encoderImpl.f5693a, "Pause on ".concat(E.c.c(j10)));
                        encoderImpl.f5706o.addLast(Range.create(Long.valueOf(j10), Long.MAX_VALUE));
                        encoderImpl.l(EncoderImpl.InternalState.f5720c);
                        return;
                    case 4:
                        encoderImpl.l(EncoderImpl.InternalState.f5723f);
                        return;
                    case 6:
                    case 8:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        throw new IllegalStateException("Unknown state: " + encoderImpl.f5711t);
                }
            default:
                EncoderImpl encoderImpl2 = this.f5749b;
                int ordinal = encoderImpl2.f5711t.ordinal();
                EncoderImpl.InternalState internalState = EncoderImpl.InternalState.f5719b;
                MediaCodec mediaCodec = encoderImpl2.f5697e;
                long j11 = this.f5750c;
                a.b bVar = encoderImpl2.f5698f;
                String str = encoderImpl2.f5693a;
                switch (ordinal) {
                    case 0:
                        encoderImpl2.f5715x = null;
                        Logger.d(str, "Start on ".concat(E.c.c(j11)));
                        try {
                            if (encoderImpl2.f5690A) {
                                encoderImpl2.j();
                            }
                            encoderImpl2.f5712u = Range.create(Long.valueOf(j11), Long.MAX_VALUE);
                            mediaCodec.start();
                            if (bVar instanceof EncoderImpl.b) {
                                ((EncoderImpl.b) bVar).c(true);
                            }
                            encoderImpl2.l(internalState);
                            return;
                        } catch (MediaCodec.CodecException e10) {
                            encoderImpl2.c(1, e10.getMessage(), e10);
                            return;
                        }
                    case 1:
                    case 4:
                    case 7:
                        return;
                    case 2:
                        encoderImpl2.f5715x = null;
                        ArrayDeque arrayDeque = encoderImpl2.f5706o;
                        Range range = (Range) arrayDeque.removeLast();
                        C1124b.q(range != null && ((Long) range.getUpper()).longValue() == Long.MAX_VALUE, "There should be a \"pause\" before \"resume\"");
                        Long l10 = (Long) range.getLower();
                        long longValue = l10.longValue();
                        arrayDeque.addLast(Range.create(l10, Long.valueOf(j11)));
                        Logger.d(str, "Resume on " + E.c.c(j11) + "\nPaused duration = " + E.c.c(j11 - longValue));
                        boolean z10 = encoderImpl2.f5695c;
                        if ((z10 || H.f.f1368a.get(H.a.class) == null) && (!z10 || H.f.f1368a.get(s.class) == null)) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("drop-input-frames", 0);
                            mediaCodec.setParameters(bundle);
                            if (bVar instanceof EncoderImpl.b) {
                                ((EncoderImpl.b) bVar).c(true);
                            }
                        }
                        if (z10) {
                            encoderImpl2.i();
                        }
                        encoderImpl2.l(internalState);
                        return;
                    case 3:
                    case 5:
                        encoderImpl2.l(EncoderImpl.InternalState.f5722e);
                        return;
                    case 6:
                    case 8:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        throw new IllegalStateException("Unknown state: " + encoderImpl2.f5711t);
                }
        }
    }
}

package G;

import android.media.MediaCodecInfo;
import android.util.Range;

/* compiled from: Api28Impl.java */
/* loaded from: classes.dex */
public final class c {
    public static Range<Integer> a(MediaCodecInfo.EncoderCapabilities encoderCapabilities) {
        return encoderCapabilities.getQualityRange();
    }
}

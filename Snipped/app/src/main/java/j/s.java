package J;

import android.media.MediaCodecInfo;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.util.Objects;

/* compiled from: EncoderInfoImpl.java */
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f2084a;

    public s(MediaCodecInfo mediaCodecInfo, String str) {
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            Objects.requireNonNull(capabilitiesForType);
            this.f2084a = capabilitiesForType;
        } catch (RuntimeException e10) {
            throw new InvalidConfigException(s3.b.j("Unable to get CodecCapabilities for mime: ", str), e10);
        }
    }
}

package C;

import J.d;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.util.Size;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.util.List;
import p.InterfaceC1096a;
import t.r;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class K implements InterfaceC1096a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f521a;

    public /* synthetic */ K(int i) {
        this.f521a = i;
    }

    @Override // p.InterfaceC1096a
    public final Object apply(Object obj) {
        switch (this.f521a) {
            case 0:
                J.v vVar = (J.v) obj;
                try {
                    MediaCodec a10 = new L.a().a(vVar.a());
                    MediaCodecInfo codecInfo = a10.getCodecInfo();
                    a10.release();
                    return new J.y(codecInfo, ((J.d) vVar).f2034a);
                } catch (InvalidConfigException e10) {
                    Logger.w("VideoCapture", "Unable to find VideoEncoderInfo", e10);
                    return null;
                }
            case 1:
                EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = (EncoderProfilesProxy.VideoProfileProxy) obj;
                if (videoProfileProxy == null) {
                    return null;
                }
                d.a c2 = J.v.c();
                String mediaType = videoProfileProxy.getMediaType();
                if (mediaType == null) {
                    throw new NullPointerException("Null mimeType");
                }
                c2.f2042a = mediaType;
                c2.f2043b = Integer.valueOf(videoProfileProxy.getProfile());
                c2.f2045d = new Size(videoProfileProxy.getWidth(), videoProfileProxy.getHeight());
                c2.f2048g = Integer.valueOf(videoProfileProxy.getFrameRate());
                c2.i = Integer.valueOf(videoProfileProxy.getBitrate());
                Timebase timebase = E.b.f992e;
                if (timebase == null) {
                    throw new NullPointerException("Null inputTimebase");
                }
                c2.f2044c = timebase;
                J.d a11 = c2.a();
                try {
                    MediaCodec a12 = new L.a().a(a11.a());
                    MediaCodecInfo codecInfo2 = a12.getCodecInfo();
                    a12.release();
                    J.y yVar = new J.y(codecInfo2, a11.f2034a);
                    int i = a11.i;
                    int intValue = yVar.f2097b.getBitrateRange().clamp(Integer.valueOf(i)).intValue();
                    if (intValue != i) {
                        videoProfileProxy = EncoderProfilesProxy.VideoProfileProxy.create(videoProfileProxy.getCodec(), videoProfileProxy.getMediaType(), intValue, videoProfileProxy.getFrameRate(), videoProfileProxy.getWidth(), videoProfileProxy.getHeight(), videoProfileProxy.getProfile(), videoProfileProxy.getBitDepth(), videoProfileProxy.getChromaSubsampling(), videoProfileProxy.getHdrFormat());
                    }
                    return videoProfileProxy;
                } catch (InvalidConfigException unused) {
                    return null;
                }
            case 2:
                return new DefaultSurfaceProcessor((DynamicRange) obj);
            case 3:
                return Boolean.TRUE;
            case 4:
                return Boolean.valueOf(((List) obj).contains(Boolean.TRUE));
            default:
                int i9 = r.f.f27368f;
                return Boolean.FALSE;
        }
    }
}

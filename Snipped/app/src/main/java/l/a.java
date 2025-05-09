package L;

import H.f;
import H.l;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import androidx.camera.core.Logger;
import pa.C1124b;

/* compiled from: EncoderFinder.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2350a;

    public a() {
        this.f2350a = ((l) f.f1368a.get(l.class)) != null;
    }

    public static String b(MediaFormat mediaFormat, MediaCodecInfo[] mediaCodecInfoArr) {
        int i;
        Integer num;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        int i9;
        String string = mediaFormat.getString("mime");
        Integer num2 = null;
        if (string == null) {
            Logger.w("EncoderFinder", "MediaFormat does not contain mime info.");
            return null;
        }
        int length = mediaCodecInfoArr.length;
        for (0; i < length; i + 1) {
            MediaCodecInfo mediaCodecInfo = mediaCodecInfoArr[i];
            if (mediaCodecInfo.isEncoder()) {
                try {
                    capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(string);
                    boolean z10 = true;
                    C1124b.m(capabilitiesForType != null, "MIME type is not supported");
                    if (mediaFormat.containsKey("bitrate")) {
                        MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                        if (videoCapabilities == null) {
                            z10 = false;
                        }
                        C1124b.m(z10, "Not video codec");
                        num = Integer.valueOf(mediaFormat.getInteger("bitrate"));
                        try {
                            i9 = videoCapabilities.getBitrateRange().clamp(num).intValue();
                            mediaFormat.setInteger("bitrate", i9);
                        } catch (IllegalArgumentException unused) {
                            i = num == null ? i + 1 : 0;
                            mediaFormat.setInteger("bitrate", num.intValue());
                        } catch (Throwable th) {
                            th = th;
                            num2 = num;
                            if (num2 != null) {
                                mediaFormat.setInteger("bitrate", num2.intValue());
                            }
                            throw th;
                        }
                    } else {
                        i9 = -1;
                        num = null;
                    }
                } catch (IllegalArgumentException unused2) {
                    num = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                if (capabilitiesForType.isFormatSupported(mediaFormat)) {
                    Logger.w("EncoderFinder", String.format("No encoder found that supports requested bitrate. Adjusting bitrate to nearest supported bitrate [requested: %dbps, nearest: %dbps]", num, Integer.valueOf(i9)));
                    String name = mediaCodecInfo.getName();
                    if (num != null) {
                        mediaFormat.setInteger("bitrate", num.intValue());
                    }
                    return name;
                }
                if (num == null) {
                }
                mediaFormat.setInteger("bitrate", num.intValue());
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0152, code lost:
    
        if (r9 == 1080) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0154, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0172, code lost:
    
        if (r9 == 2160) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.media.MediaCodec a(android.media.MediaFormat r18) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: L.a.a(android.media.MediaFormat):android.media.MediaCodec");
    }
}

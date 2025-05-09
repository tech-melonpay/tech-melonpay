package I;

import I.h;
import J.w;
import android.util.Range;
import android.util.Rational;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.r;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import pa.C1124b;

/* compiled from: VideoConfigUtil.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f1691a;

    static {
        HashMap hashMap = new HashMap();
        f1691a = hashMap;
        HashMap hashMap2 = new HashMap();
        J.e eVar = w.f2093a;
        hashMap2.put(1, eVar);
        J.e eVar2 = w.f2095c;
        hashMap2.put(2, eVar2);
        J.e eVar3 = w.f2096d;
        hashMap2.put(4096, eVar3);
        hashMap2.put(8192, eVar3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(1, eVar);
        hashMap3.put(2, eVar2);
        hashMap3.put(4096, eVar3);
        hashMap3.put(8192, eVar3);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(1, eVar);
        hashMap4.put(4, eVar2);
        hashMap4.put(4096, eVar3);
        hashMap4.put(16384, eVar3);
        hashMap4.put(2, eVar);
        hashMap4.put(8, eVar2);
        hashMap4.put(8192, eVar3);
        hashMap4.put(32768, eVar3);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(256, eVar2);
        hashMap5.put(512, w.f2094b);
        hashMap.put("video/hevc", hashMap2);
        hashMap.put("video/av01", hashMap3);
        hashMap.put("video/x-vnd.on2.vp9", hashMap4);
        hashMap.put("video/dolby-vision", hashMap5);
    }

    public static w a(int i, String str) {
        w wVar;
        Map map = (Map) f1691a.get(str);
        if (map != null && (wVar = (w) map.get(Integer.valueOf(i))) != null) {
            return wVar;
        }
        Logger.w("VideoConfigUtil", String.format("Unsupported mime type %s or profile level %d. Data space is unspecified.", str, Integer.valueOf(i)));
        return w.f2093a;
    }

    public static h b(androidx.camera.video.g gVar, DynamicRange dynamicRange, E.e eVar) {
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxy;
        C1124b.q(dynamicRange.isFullySpecified(), "Dynamic range must be a fully specified dynamic range [provided dynamic range: " + dynamicRange + "]");
        String str = "video/avc";
        String str2 = gVar.c() != 1 ? "video/avc" : "video/x-vnd.on2.vp8";
        if (eVar != null) {
            Set set = (Set) K.a.f2212b.get(Integer.valueOf(dynamicRange.getEncoding()));
            if (set == null) {
                set = Collections.emptySet();
            }
            Set set2 = (Set) K.a.f2211a.get(Integer.valueOf(dynamicRange.getBitDepth()));
            if (set2 == null) {
                set2 = Collections.emptySet();
            }
            Iterator<EncoderProfilesProxy.VideoProfileProxy> it = eVar.getVideoProfiles().iterator();
            while (it.hasNext()) {
                videoProfileProxy = it.next();
                if (set.contains(Integer.valueOf(videoProfileProxy.getHdrFormat())) && set2.contains(Integer.valueOf(videoProfileProxy.getBitDepth()))) {
                    String mediaType = videoProfileProxy.getMediaType();
                    if (str2.equals(mediaType)) {
                        Logger.d("VideoConfigUtil", "MediaSpec video mime matches EncoderProfiles. Using EncoderProfiles to derive VIDEO settings [mime type: " + str2 + "]");
                    } else if (gVar.c() == -1) {
                        Logger.d("VideoConfigUtil", "MediaSpec contains OUTPUT_FORMAT_AUTO. Using CamcorderProfile to derive VIDEO settings [mime type: " + str2 + ", dynamic range: " + dynamicRange + "]");
                    }
                    str2 = mediaType;
                    break;
                }
            }
        }
        videoProfileProxy = null;
        if (videoProfileProxy == null) {
            if (gVar.c() == -1) {
                int encoding = dynamicRange.getEncoding();
                if (encoding != 1) {
                    if (encoding == 3 || encoding == 4 || encoding == 5) {
                        str = "video/hevc";
                    } else {
                        if (encoding != 6) {
                            throw new UnsupportedOperationException("Unsupported dynamic range: " + dynamicRange + "\nNo supported default mime type available.");
                        }
                        str = "video/dolby-vision";
                    }
                }
                str2 = str;
            }
            if (eVar == null) {
                Logger.d("VideoConfigUtil", "No EncoderProfiles present. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + str2 + ", dynamic range: " + dynamicRange + "]");
            } else {
                Logger.d("VideoConfigUtil", "No video EncoderProfile is compatible with requested output format and dynamic range. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + str2 + ", dynamic range: " + dynamicRange + "]");
            }
        }
        h.a aVar = new h.a();
        if (str2 == null) {
            throw new NullPointerException("Null mimeType");
        }
        aVar.f1688a = str2;
        aVar.f1689b = -1;
        if (videoProfileProxy != null) {
            aVar.f1690c = videoProfileProxy;
        }
        String str3 = aVar.f1688a == null ? " mimeType" : "";
        if (str3.isEmpty()) {
            return new h(aVar.f1688a, aVar.f1689b.intValue(), aVar.f1690c);
        }
        throw new IllegalStateException("Missing required properties:".concat(str3));
    }

    public static int c(int i, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Range<Integer> range) {
        Rational rational = new Rational(i9, i10);
        Rational rational2 = new Rational(i11, i12);
        int doubleValue = (int) (new Rational(i15, i16).doubleValue() * new Rational(i13, i14).doubleValue() * rational2.doubleValue() * rational.doubleValue() * i);
        String format = Logger.isDebugEnabled("VideoConfigUtil") ? String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) * Frame Rate Ratio(%d / %d) * Width Ratio(%d / %d) * Height Ratio(%d / %d) = %d", Integer.valueOf(i), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(doubleValue)) : "";
        if (!r.f5805b.equals(range)) {
            Integer clamp = range.clamp(Integer.valueOf(doubleValue));
            int intValue = clamp.intValue();
            if (Logger.isDebugEnabled("VideoConfigUtil")) {
                format = format.concat(String.format("\nClamped to range %s -> %dbps", range, clamp));
            }
            doubleValue = intValue;
        }
        Logger.d("VideoConfigUtil", format);
        return doubleValue;
    }
}

package I;

import J.d;
import J.v;
import J.w;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.r;
import java.util.Objects;

/* compiled from: VideoEncoderConfigVideoProfileResolver.java */
/* loaded from: classes.dex */
public final class l implements x0.f<v> {

    /* renamed from: a, reason: collision with root package name */
    public final String f1700a;

    /* renamed from: b, reason: collision with root package name */
    public final Timebase f1701b;

    /* renamed from: c, reason: collision with root package name */
    public final r f1702c;

    /* renamed from: d, reason: collision with root package name */
    public final Size f1703d;

    /* renamed from: e, reason: collision with root package name */
    public final EncoderProfilesProxy.VideoProfileProxy f1704e;

    /* renamed from: f, reason: collision with root package name */
    public final DynamicRange f1705f;

    /* renamed from: g, reason: collision with root package name */
    public final Range<Integer> f1706g;

    public l(String str, Timebase timebase, r rVar, Size size, EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, DynamicRange dynamicRange, Range<Integer> range) {
        this.f1700a = str;
        this.f1701b = timebase;
        this.f1702c = rVar;
        this.f1703d = size;
        this.f1704e = videoProfileProxy;
        this.f1705f = dynamicRange;
        this.f1706g = range;
    }

    @Override // x0.f
    public final v get() {
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = this.f1704e;
        int frameRate = videoProfileProxy.getFrameRate();
        Range<Integer> range = SurfaceRequest.FRAME_RATE_RANGE_UNSPECIFIED;
        Range<Integer> range2 = this.f1706g;
        int intValue = !Objects.equals(range2, range) ? range2.clamp(Integer.valueOf(frameRate)).intValue() : frameRate;
        Integer valueOf = Integer.valueOf(intValue);
        Integer valueOf2 = Integer.valueOf(frameRate);
        boolean equals = Objects.equals(range2, range);
        Object obj = range2;
        if (!equals) {
            obj = "<UNSPECIFIED>";
        }
        Logger.d("VidEncVdPrflRslvr", String.format("Resolved frame rate %dfps [Video profile frame rate: %dfps, Expected operating range: %s]", valueOf, valueOf2, obj));
        Logger.d("VidEncVdPrflRslvr", "Resolved VIDEO frame rate: " + intValue + "fps");
        Range<Integer> c2 = this.f1702c.c();
        Logger.d("VidEncVdPrflRslvr", "Using resolved VIDEO bitrate from EncoderProfiles");
        int bitrate = videoProfileProxy.getBitrate();
        int bitDepth = this.f1705f.getBitDepth();
        int bitDepth2 = videoProfileProxy.getBitDepth();
        int frameRate2 = videoProfileProxy.getFrameRate();
        Size size = this.f1703d;
        int c10 = j.c(bitrate, bitDepth, bitDepth2, intValue, frameRate2, size.getWidth(), videoProfileProxy.getWidth(), size.getHeight(), videoProfileProxy.getHeight(), c2);
        int profile = videoProfileProxy.getProfile();
        String str = this.f1700a;
        w a10 = j.a(profile, str);
        d.a c11 = v.c();
        if (str == null) {
            throw new NullPointerException("Null mimeType");
        }
        c11.f2042a = str;
        Timebase timebase = this.f1701b;
        if (timebase == null) {
            throw new NullPointerException("Null inputTimebase");
        }
        c11.f2044c = timebase;
        c11.f2045d = size;
        c11.i = Integer.valueOf(c10);
        c11.f2048g = Integer.valueOf(intValue);
        c11.f2043b = Integer.valueOf(profile);
        if (a10 == null) {
            throw new NullPointerException("Null dataSpace");
        }
        c11.f2047f = a10;
        return c11.a();
    }
}

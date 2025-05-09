package I;

import J.d;
import J.v;
import J.w;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.r;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: VideoEncoderConfigDefaultResolver.java */
/* loaded from: classes.dex */
public final class k implements x0.f<v> {

    /* renamed from: g, reason: collision with root package name */
    public static final Size f1692g = new Size(1280, 720);

    /* renamed from: h, reason: collision with root package name */
    public static final Range<Integer> f1693h = new Range<>(1, 60);

    /* renamed from: a, reason: collision with root package name */
    public final String f1694a;

    /* renamed from: b, reason: collision with root package name */
    public final Timebase f1695b;

    /* renamed from: c, reason: collision with root package name */
    public final r f1696c;

    /* renamed from: d, reason: collision with root package name */
    public final Size f1697d;

    /* renamed from: e, reason: collision with root package name */
    public final DynamicRange f1698e;

    /* renamed from: f, reason: collision with root package name */
    public final Range<Integer> f1699f;

    public k(String str, Timebase timebase, r rVar, Size size, DynamicRange dynamicRange, Range<Integer> range) {
        this.f1694a = str;
        this.f1695b = timebase;
        this.f1696c = rVar;
        this.f1697d = size;
        this.f1698e = dynamicRange;
        this.f1699f = range;
    }

    @Override // x0.f
    public final v get() {
        Integer num;
        Range<Integer> range = SurfaceRequest.FRAME_RATE_RANGE_UNSPECIFIED;
        Range<Integer> range2 = this.f1699f;
        int intValue = !Objects.equals(range2, range) ? f1693h.clamp(range2.getUpper()).intValue() : 30;
        Integer valueOf = Integer.valueOf(intValue);
        boolean equals = Objects.equals(range2, range);
        Object obj = range2;
        if (!equals) {
            obj = "<UNSPECIFIED>";
        }
        Logger.d("VidEncCfgDefaultRslvr", String.format("Default resolved frame rate: %dfps. [Expected operating range: %s]", valueOf, obj));
        Logger.d("VidEncCfgDefaultRslvr", "Resolved VIDEO frame rate: " + intValue + "fps");
        Range<Integer> c2 = this.f1696c.c();
        Logger.d("VidEncCfgDefaultRslvr", "Using fallback VIDEO bitrate");
        DynamicRange dynamicRange = this.f1698e;
        int bitDepth = dynamicRange.getBitDepth();
        Size size = this.f1697d;
        int width = size.getWidth();
        Size size2 = f1692g;
        int c10 = j.c(14000000, bitDepth, 8, intValue, 30, width, size2.getWidth(), size.getHeight(), size2.getHeight(), c2);
        HashMap hashMap = K.a.f2213c;
        String str = this.f1694a;
        Map map = (Map) hashMap.get(str);
        int intValue2 = (map == null || (num = (Integer) map.get(dynamicRange)) == null) ? -1 : num.intValue();
        w a10 = j.a(intValue2, str);
        d.a c11 = v.c();
        if (str == null) {
            throw new NullPointerException("Null mimeType");
        }
        c11.f2042a = str;
        Timebase timebase = this.f1695b;
        if (timebase == null) {
            throw new NullPointerException("Null inputTimebase");
        }
        c11.f2044c = timebase;
        c11.f2045d = size;
        c11.i = Integer.valueOf(c10);
        c11.f2048g = Integer.valueOf(intValue);
        c11.f2043b = Integer.valueOf(intValue2);
        if (a10 == null) {
            throw new NullPointerException("Null dataSpace");
        }
        c11.f2047f = a10;
        return c11.a();
    }
}

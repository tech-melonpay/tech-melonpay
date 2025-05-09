package K;

import androidx.camera.core.DynamicRange;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: DynamicRangeUtil.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f2211a;

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f2212b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f2213c;

    static {
        HashMap hashMap = new HashMap();
        f2211a = hashMap;
        HashMap hashMap2 = new HashMap();
        f2212b = hashMap2;
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        f2213c = hashMap4;
        hashMap.put(8, new HashSet(Collections.singletonList(8)));
        hashMap.put(10, new HashSet(Collections.singletonList(10)));
        hashMap.put(0, new HashSet(Arrays.asList(8, 10)));
        hashMap2.put(0, new HashSet(Arrays.asList(0, 1, 2, 3, 4)));
        hashMap2.put(1, new HashSet(Collections.singletonList(0)));
        hashMap2.put(2, new HashSet(Arrays.asList(1, 2, 3, 4)));
        hashMap2.put(3, new HashSet(Collections.singletonList(1)));
        hashMap2.put(4, new HashSet(Collections.singletonList(2)));
        hashMap2.put(5, new HashSet(Collections.singletonList(3)));
        hashMap2.put(6, new HashSet(Collections.singletonList(4)));
        hashMap3.put(0, 1);
        hashMap3.put(1, 3);
        hashMap3.put(2, 4);
        hashMap3.put(3, 5);
        hashMap3.put(4, 6);
        HashMap hashMap5 = new HashMap();
        DynamicRange dynamicRange = DynamicRange.SDR;
        hashMap5.put(dynamicRange, 1);
        DynamicRange dynamicRange2 = DynamicRange.HLG_10_BIT;
        hashMap5.put(dynamicRange2, 2);
        DynamicRange dynamicRange3 = DynamicRange.HDR10_10_BIT;
        hashMap5.put(dynamicRange3, 4096);
        DynamicRange dynamicRange4 = DynamicRange.HDR10_PLUS_10_BIT;
        hashMap5.put(dynamicRange4, 8192);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(dynamicRange, 1);
        hashMap6.put(dynamicRange2, 2);
        hashMap6.put(dynamicRange3, 4096);
        hashMap6.put(dynamicRange4, 8192);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(dynamicRange, 1);
        hashMap7.put(dynamicRange2, 4);
        hashMap7.put(dynamicRange3, 4096);
        hashMap7.put(dynamicRange4, 16384);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(DynamicRange.DOLBY_VISION_10_BIT, 256);
        hashMap8.put(DynamicRange.DOLBY_VISION_8_BIT, 512);
        hashMap4.put("video/hevc", hashMap5);
        hashMap4.put("video/av01", hashMap6);
        hashMap4.put("video/x-vnd.on2.vp9", hashMap7);
        hashMap4.put("video/dolby-vision", hashMap8);
    }
}

package v;

import android.hardware.camera2.params.DynamicRangeProfiles;
import androidx.camera.core.DynamicRange;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: DynamicRangeConversions.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f30485a;

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f30486b;

    static {
        HashMap hashMap = new HashMap();
        f30485a = hashMap;
        HashMap hashMap2 = new HashMap();
        f30486b = hashMap2;
        DynamicRange dynamicRange = DynamicRange.SDR;
        hashMap.put(1L, dynamicRange);
        hashMap2.put(dynamicRange, Collections.singletonList(1L));
        hashMap.put(2L, DynamicRange.HLG_10_BIT);
        hashMap2.put((DynamicRange) hashMap.get(2L), Collections.singletonList(2L));
        DynamicRange dynamicRange2 = DynamicRange.HDR10_10_BIT;
        hashMap.put(4L, dynamicRange2);
        hashMap2.put(dynamicRange2, Collections.singletonList(4L));
        DynamicRange dynamicRange3 = DynamicRange.HDR10_PLUS_10_BIT;
        hashMap.put(8L, dynamicRange3);
        hashMap2.put(dynamicRange3, Collections.singletonList(8L));
        List asList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            f30485a.put((Long) it.next(), DynamicRange.DOLBY_VISION_10_BIT);
        }
        f30486b.put(DynamicRange.DOLBY_VISION_10_BIT, asList);
        List asList2 = Arrays.asList(1024L, 2048L, 256L, 512L);
        Iterator it2 = asList2.iterator();
        while (it2.hasNext()) {
            f30485a.put((Long) it2.next(), DynamicRange.DOLBY_VISION_8_BIT);
        }
        f30486b.put(DynamicRange.DOLBY_VISION_8_BIT, asList2);
    }

    public static Long a(DynamicRange dynamicRange, DynamicRangeProfiles dynamicRangeProfiles) {
        Set supportedProfiles;
        List<Long> list = (List) f30486b.get(dynamicRange);
        if (list == null) {
            return null;
        }
        supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l10 : list) {
            if (supportedProfiles.contains(l10)) {
                return l10;
            }
        }
        return null;
    }

    public static DynamicRange b(long j10) {
        return (DynamicRange) f30485a.get(Long.valueOf(j10));
    }
}

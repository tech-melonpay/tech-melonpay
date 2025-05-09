package t;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.AttachedSurfaceInfo;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.SurfaceCombination;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.SurfaceSizeDefinition;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import androidx.camera.core.internal.utils.SizeUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import pa.C1124b;

/* compiled from: SupportedSurfaceCombination.java */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: g, reason: collision with root package name */
    public final String f27223g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC1251c f27224h;
    public final u.n i;

    /* renamed from: j, reason: collision with root package name */
    public final C.N f27225j;

    /* renamed from: k, reason: collision with root package name */
    public final int f27226k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f27227l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f27228m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f27229n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f27230o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f27231p;

    /* renamed from: q, reason: collision with root package name */
    public SurfaceSizeDefinition f27232q;

    /* renamed from: s, reason: collision with root package name */
    public final L f27234s;

    /* renamed from: v, reason: collision with root package name */
    public final M f27237v;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f27217a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f27218b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f27219c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f27220d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f27221e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f27222f = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f27233r = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public final C1124b f27235t = new C1124b();

    /* renamed from: u, reason: collision with root package name */
    public final x.k f27236u = new x.k();

    /* compiled from: SupportedSurfaceCombination.java */
    public static class a {
        public static Size[] a(StreamConfigurationMap streamConfigurationMap, int i) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i);
        }
    }

    /* compiled from: SupportedSurfaceCombination.java */
    public static abstract class b {
        public abstract int a();

        public abstract int b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x03fb, code lost:
    
        if (r12.length != 0) goto L90;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g0(android.content.Context r12, java.lang.String r13, u.v r14, t.InterfaceC1251c r15) {
        /*
            Method dump skipped, instructions count: 1346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.g0.<init>(android.content.Context, java.lang.String, u.v, t.c):void");
    }

    public static Size c(StreamConfigurationMap streamConfigurationMap, int i, boolean z10) {
        Size[] a10;
        Size[] outputSizes = i == 34 ? streamConfigurationMap.getOutputSizes(SurfaceTexture.class) : streamConfigurationMap.getOutputSizes(i);
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        CompareSizesByArea compareSizesByArea = new CompareSizesByArea();
        Size size = (Size) Collections.max(Arrays.asList(outputSizes), compareSizesByArea);
        Size size2 = SizeUtil.RESOLUTION_ZERO;
        if (z10 && (a10 = a.a(streamConfigurationMap, i)) != null && a10.length > 0) {
            size2 = (Size) Collections.max(Arrays.asList(a10), compareSizesByArea);
        }
        return (Size) Collections.max(Arrays.asList(size, size2), compareSizesByArea);
    }

    public static int e(Range<Integer> range, Range<Integer> range2) {
        C1124b.q((range.contains((Range<Integer>) range2.getUpper()) || range.contains((Range<Integer>) range2.getLower())) ? false : true, "Ranges must not intersect");
        return range.getLower().intValue() > range2.getUpper().intValue() ? range.getLower().intValue() - range2.getUpper().intValue() : range2.getLower().intValue() - range.getUpper().intValue();
    }

    public static int f(Range<Integer> range) {
        return (range.getUpper().intValue() - range.getLower().intValue()) + 1;
    }

    public final boolean a(C1250b c1250b, List list) {
        List list2;
        HashMap hashMap = this.f27220d;
        if (hashMap.containsKey(c1250b)) {
            list2 = (List) hashMap.get(c1250b);
        } else {
            ArrayList arrayList = new ArrayList();
            int i = c1250b.f27195a;
            int i9 = c1250b.f27196b;
            if (i9 == 8) {
                if (i != 1) {
                    ArrayList arrayList2 = this.f27217a;
                    if (i != 2) {
                        arrayList.addAll(arrayList2);
                    } else {
                        arrayList.addAll(this.f27218b);
                        arrayList.addAll(arrayList2);
                    }
                } else {
                    arrayList = this.f27219c;
                }
            } else if (i9 == 10 && i == 0) {
                arrayList.addAll(this.f27221e);
            }
            hashMap.put(c1250b, arrayList);
            list2 = arrayList;
        }
        Iterator it = list2.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 = ((SurfaceCombination) it.next()).getOrderedSupportedSurfaceConfigList(list) != null;
            if (z10) {
                break;
            }
        }
        return z10;
    }

    public final void b() {
        Size size;
        Size size2;
        int parseInt;
        InterfaceC1251c interfaceC1251c;
        CamcorderProfile camcorderProfile;
        CamcorderProfile a10;
        Size e10 = this.f27234s.e();
        try {
            parseInt = Integer.parseInt(this.f27223g);
            interfaceC1251c = this.f27224h;
            camcorderProfile = null;
            a10 = interfaceC1251c.b(parseInt, 1) ? interfaceC1251c.a(parseInt, 1) : null;
        } catch (NumberFormatException unused) {
            Size[] outputSizes = this.i.b().f30032a.f30036a.getOutputSizes(MediaRecorder.class);
            if (outputSizes != null) {
                Arrays.sort(outputSizes, new CompareSizesByArea(true));
                int length = outputSizes.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        size = SizeUtil.RESOLUTION_480P;
                        break;
                    }
                    Size size3 = outputSizes[i];
                    int width = size3.getWidth();
                    Size size4 = SizeUtil.RESOLUTION_1080P;
                    if (width <= size4.getWidth() && size3.getHeight() <= size4.getHeight()) {
                        size = size3;
                        break;
                    }
                    i++;
                }
            } else {
                size = SizeUtil.RESOLUTION_480P;
            }
        }
        if (a10 != null) {
            size2 = new Size(a10.videoFrameWidth, a10.videoFrameHeight);
            this.f27232q = SurfaceSizeDefinition.create(SizeUtil.RESOLUTION_VGA, new HashMap(), e10, new HashMap(), size2, new HashMap(), new HashMap());
        }
        size = SizeUtil.RESOLUTION_480P;
        if (interfaceC1251c.b(parseInt, 10)) {
            camcorderProfile = interfaceC1251c.a(parseInt, 10);
        } else if (interfaceC1251c.b(parseInt, 8)) {
            camcorderProfile = interfaceC1251c.a(parseInt, 8);
        } else if (interfaceC1251c.b(parseInt, 12)) {
            camcorderProfile = interfaceC1251c.a(parseInt, 12);
        } else if (interfaceC1251c.b(parseInt, 6)) {
            camcorderProfile = interfaceC1251c.a(parseInt, 6);
        } else if (interfaceC1251c.b(parseInt, 5)) {
            camcorderProfile = interfaceC1251c.a(parseInt, 5);
        } else if (interfaceC1251c.b(parseInt, 4)) {
            camcorderProfile = interfaceC1251c.a(parseInt, 4);
        }
        if (camcorderProfile != null) {
            size = new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
        }
        size2 = size;
        this.f27232q = SurfaceSizeDefinition.create(SizeUtil.RESOLUTION_VGA, new HashMap(), e10, new HashMap(), size2, new HashMap(), new HashMap());
    }

    public final List d(C1250b c1250b, List list) {
        Config.Option<Long> option = f0.f27212a;
        if (c1250b.f27195a == 0 && c1250b.f27196b == 8) {
            Iterator it = this.f27222f.iterator();
            while (it.hasNext()) {
                List<SurfaceConfig> orderedSupportedSurfaceConfigList = ((SurfaceCombination) it.next()).getOrderedSupportedSurfaceConfigList(list);
                if (orderedSupportedSurfaceConfigList != null) {
                    return orderedSupportedSurfaceConfigList;
                }
            }
        }
        return null;
    }

    public final Pair g(int i, List list, List list2, ArrayList arrayList, ArrayList arrayList2, int i9, HashMap hashMap, HashMap hashMap2) {
        int i10;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AttachedSurfaceInfo attachedSurfaceInfo = (AttachedSurfaceInfo) it.next();
            arrayList3.add(attachedSurfaceInfo.getSurfaceConfig());
            if (hashMap != null) {
                hashMap.put(Integer.valueOf(arrayList3.size() - 1), attachedSurfaceInfo);
            }
        }
        for (int i11 = 0; i11 < list2.size(); i11++) {
            Size size = (Size) list2.get(i11);
            UseCaseConfig useCaseConfig = (UseCaseConfig) arrayList.get(((Integer) arrayList2.get(i11)).intValue());
            int inputFormat = useCaseConfig.getInputFormat();
            arrayList3.add(SurfaceConfig.transformSurfaceConfig(i, inputFormat, size, h(inputFormat)));
            if (hashMap2 != null) {
                hashMap2.put(Integer.valueOf(arrayList3.size() - 1), useCaseConfig);
            }
            try {
                i10 = (int) (1.0E9d / ((StreamConfigurationMap) this.i.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(useCaseConfig.getInputFormat(), size));
            } catch (Exception unused) {
                i10 = 0;
            }
            i9 = Math.min(i9, i10);
        }
        return new Pair(arrayList3, Integer.valueOf(i9));
    }

    public final SurfaceSizeDefinition h(int i) {
        CameraCharacteristics.Key key;
        ArrayList arrayList = this.f27233r;
        if (!arrayList.contains(Integer.valueOf(i))) {
            i(this.f27232q.getS720pSizeMap(), SizeUtil.RESOLUTION_720P, i);
            i(this.f27232q.getS1440pSizeMap(), SizeUtil.RESOLUTION_1440P, i);
            Map<Integer, Size> maximumSizeMap = this.f27232q.getMaximumSizeMap();
            u.n nVar = this.i;
            Size c2 = c(nVar.b().f30032a.f30036a, i, true);
            if (c2 != null) {
                maximumSizeMap.put(Integer.valueOf(i), c2);
            }
            Map<Integer, Size> ultraMaximumSizeMap = this.f27232q.getUltraMaximumSizeMap();
            if (Build.VERSION.SDK_INT >= 31 && this.f27231p) {
                key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION;
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) nVar.a(key);
                if (streamConfigurationMap != null) {
                    ultraMaximumSizeMap.put(Integer.valueOf(i), c(streamConfigurationMap, i, true));
                }
            }
            arrayList.add(Integer.valueOf(i));
        }
        return this.f27232q;
    }

    public final void i(Map<Integer, Size> map, Size size, int i) {
        if (this.f27229n) {
            Size c2 = c(this.i.b().f30032a.f30036a, i, false);
            Integer valueOf = Integer.valueOf(i);
            if (c2 != null) {
                size = (Size) Collections.min(Arrays.asList(size, c2), new CompareSizesByArea());
            }
            map.put(valueOf, size);
        }
    }
}

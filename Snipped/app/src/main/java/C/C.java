package C;

import C.o;
import android.util.Size;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.ResolutionValidatedEncoderProfilesProvider;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import pa.C1124b;

/* compiled from: RecorderVideoCapabilities.java */
/* loaded from: classes.dex */
public final class C implements E {

    /* renamed from: b, reason: collision with root package name */
    public final L.b f497b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f498c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f499d;

    /* compiled from: RecorderVideoCapabilities.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f500a = new LinkedHashMap();

        /* renamed from: b, reason: collision with root package name */
        public final TreeMap<Size, o> f501b = new TreeMap<>(new CompareSizesByArea());

        /* renamed from: c, reason: collision with root package name */
        public final E.e f502c;

        /* renamed from: d, reason: collision with root package name */
        public final E.e f503d;

        public a(E.d dVar) {
            C0491g c0491g = o.f560a;
            Iterator it = new ArrayList(o.i).iterator();
            while (true) {
                E.a aVar = null;
                if (!it.hasNext()) {
                    break;
                }
                o oVar = (o) it.next();
                C1124b.q(oVar instanceof o.a, "Currently only support ConstantQuality");
                EncoderProfilesProxy a10 = dVar.a(((o.a) oVar).b());
                if (a10 != null) {
                    Logger.d("RecorderVideoCapabilities", "profiles = " + a10);
                    if (!a10.getVideoProfiles().isEmpty()) {
                        int defaultDurationSeconds = a10.getDefaultDurationSeconds();
                        int recommendedFileFormat = a10.getRecommendedFileFormat();
                        List<EncoderProfilesProxy.AudioProfileProxy> audioProfiles = a10.getAudioProfiles();
                        List<EncoderProfilesProxy.VideoProfileProxy> videoProfiles = a10.getVideoProfiles();
                        C1124b.m(!videoProfiles.isEmpty(), "Should contain at least one VideoProfile.");
                        aVar = new E.a(defaultDurationSeconds, recommendedFileFormat, Collections.unmodifiableList(new ArrayList(audioProfiles)), Collections.unmodifiableList(new ArrayList(videoProfiles)), audioProfiles.isEmpty() ? null : audioProfiles.get(0), videoProfiles.get(0));
                    }
                    if (aVar == null) {
                        Logger.w("RecorderVideoCapabilities", "EncoderProfiles of quality " + oVar + " has no video validated profiles.");
                    } else {
                        EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = aVar.f990f;
                        this.f501b.put(new Size(videoProfileProxy.getWidth(), videoProfileProxy.getHeight()), oVar);
                        this.f500a.put(oVar, aVar);
                    }
                }
            }
            if (this.f500a.isEmpty()) {
                Logger.e("RecorderVideoCapabilities", "No supported EncoderProfiles");
                this.f503d = null;
                this.f502c = null;
            } else {
                ArrayDeque arrayDeque = new ArrayDeque(this.f500a.values());
                this.f502c = (E.e) arrayDeque.peekFirst();
                this.f503d = (E.e) arrayDeque.peekLast();
            }
        }

        public final E.e a(o oVar) {
            C1124b.m(o.f567h.contains(oVar), "Unknown quality: " + oVar);
            return oVar == o.f565f ? this.f502c : oVar == o.f564e ? this.f503d : (E.e) this.f500a.get(oVar);
        }
    }

    public C(CameraInfoInternal cameraInfoInternal) {
        K k3 = E.b.f991d;
        this.f498c = new HashMap();
        this.f499d = new HashMap();
        EncoderProfilesProvider encoderProfilesProvider = cameraInfoInternal.getEncoderProfilesProvider();
        Iterator<DynamicRange> it = cameraInfoInternal.getSupportedDynamicRanges().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            DynamicRange next = it.next();
            Integer valueOf = Integer.valueOf(next.getEncoding());
            int bitDepth = next.getBitDepth();
            if (valueOf.equals(3) && bitDepth == 10) {
                encoderProfilesProvider = new E.b(encoderProfilesProvider);
                break;
            }
        }
        this.f497b = new L.b(new ResolutionValidatedEncoderProfilesProvider(encoderProfilesProvider, cameraInfoInternal.getCameraQuirks()), cameraInfoInternal, H.f.f1368a);
        for (DynamicRange dynamicRange : cameraInfoInternal.getSupportedDynamicRanges()) {
            a aVar = new a(new E.d(this.f497b, dynamicRange));
            if (!new ArrayList(aVar.f500a.keySet()).isEmpty()) {
                this.f498c.put(dynamicRange, aVar);
            }
        }
    }

    public static boolean e(DynamicRange dynamicRange) {
        return (dynamicRange.getEncoding() == 0 || dynamicRange.getEncoding() == 2 || dynamicRange.getBitDepth() == 0) ? false : true;
    }

    @Override // C.E
    public final E.e a(Size size, DynamicRange dynamicRange) {
        o value;
        a d10 = d(dynamicRange);
        E.e eVar = null;
        if (d10 != null) {
            TreeMap<Size, o> treeMap = d10.f501b;
            Map.Entry<Size, o> ceilingEntry = treeMap.ceilingEntry(size);
            if (ceilingEntry != null) {
                value = ceilingEntry.getValue();
            } else {
                Map.Entry<Size, o> floorEntry = treeMap.floorEntry(size);
                value = floorEntry != null ? floorEntry.getValue() : o.f566g;
            }
            Logger.d("RecorderVideoCapabilities", "Using supported quality of " + value + " for size " + size);
            if (value != o.f566g && (eVar = d10.a(value)) == null) {
                throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles for advertised quality.");
            }
        }
        return eVar;
    }

    @Override // C.E
    public final ArrayList b(DynamicRange dynamicRange) {
        a d10 = d(dynamicRange);
        return d10 == null ? new ArrayList() : new ArrayList(d10.f500a.keySet());
    }

    @Override // C.E
    public final E.e c(o oVar, DynamicRange dynamicRange) {
        a d10 = d(dynamicRange);
        if (d10 == null) {
            return null;
        }
        return d10.a(oVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (r1.contains(r7) == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final C.C.a d(androidx.camera.core.DynamicRange r7) {
        /*
            r6 = this;
            boolean r0 = e(r7)
            java.util.HashMap r1 = r6.f498c
            if (r0 == 0) goto Lf
            java.lang.Object r7 = r1.get(r7)
            C.C$a r7 = (C.C.a) r7
            return r7
        Lf:
            java.util.HashMap r0 = r6.f499d
            boolean r2 = r0.containsKey(r7)
            if (r2 == 0) goto L1e
            java.lang.Object r7 = r0.get(r7)
            C.C$a r7 = (C.C.a) r7
            return r7
        L1e:
            java.util.Set r1 = r1.keySet()
            boolean r2 = e(r7)
            if (r2 == 0) goto L2f
            boolean r1 = r1.contains(r7)
            if (r1 != 0) goto L74
            goto L81
        L2f:
            java.util.Iterator r1 = r1.iterator()
        L33:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L81
            java.lang.Object r2 = r1.next()
            androidx.camera.core.DynamicRange r2 = (androidx.camera.core.DynamicRange) r2
            boolean r3 = e(r2)
            java.lang.String r4 = "Fully specified range is not actually fully specified."
            pa.C1124b.q(r3, r4)
            int r3 = r7.getBitDepth()
            if (r3 != 0) goto L4f
            goto L59
        L4f:
            int r3 = r7.getBitDepth()
            int r5 = r2.getBitDepth()
            if (r3 != r5) goto L33
        L59:
            boolean r3 = e(r2)
            pa.C1124b.q(r3, r4)
            int r3 = r7.getEncoding()
            if (r3 != 0) goto L67
            goto L74
        L67:
            int r2 = r2.getEncoding()
            r4 = 2
            if (r3 != r4) goto L72
            r4 = 1
            if (r2 == r4) goto L72
            goto L74
        L72:
            if (r3 != r2) goto L33
        L74:
            E.d r1 = new E.d
            L.b r2 = r6.f497b
            r1.<init>(r2, r7)
            C.C$a r2 = new C.C$a
            r2.<init>(r1)
            goto L82
        L81:
            r2 = 0
        L82:
            r0.put(r7, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: C.C.d(androidx.camera.core.DynamicRange):C.C$a");
    }
}

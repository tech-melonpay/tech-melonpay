package u;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import androidx.camera.core.Logger;
import java.util.HashMap;

/* compiled from: StreamConfigurationMapCompat.java */
/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final B f30032a;

    /* renamed from: b, reason: collision with root package name */
    public final B1.f f30033b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f30034c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f30035d = new HashMap();

    public A(StreamConfigurationMap streamConfigurationMap, B1.f fVar) {
        new HashMap();
        this.f30032a = new B(streamConfigurationMap);
        this.f30033b = fVar;
    }

    public final Size[] a(int i) {
        HashMap hashMap = this.f30034c;
        if (hashMap.containsKey(Integer.valueOf(i))) {
            if (((Size[]) hashMap.get(Integer.valueOf(i))) == null) {
                return null;
            }
            return (Size[]) ((Size[]) hashMap.get(Integer.valueOf(i))).clone();
        }
        Size[] outputSizes = this.f30032a.f30036a.getOutputSizes(i);
        if (outputSizes != null && outputSizes.length != 0) {
            Size[] k3 = this.f30033b.k(outputSizes, i);
            hashMap.put(Integer.valueOf(i), k3);
            return (Size[]) k3.clone();
        }
        Logger.w("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + i);
        return outputSizes;
    }
}

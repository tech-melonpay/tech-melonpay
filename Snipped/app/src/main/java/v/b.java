package v;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import androidx.camera.core.DynamicRange;
import java.util.Set;
import pa.C1124b;
import u.n;

/* compiled from: DynamicRangesCompat.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final a f30487a;

    /* compiled from: DynamicRangesCompat.java */
    public interface a {
        Set<DynamicRange> a(DynamicRange dynamicRange);

        Set<DynamicRange> getSupportedDynamicRanges();

        DynamicRangeProfiles unwrap();
    }

    public b(a aVar) {
        this.f30487a = aVar;
    }

    public static b a(n nVar) {
        CameraCharacteristics.Key key;
        int i = Build.VERSION.SDK_INT;
        b bVar = null;
        if (i >= 33) {
            key = CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES;
            DynamicRangeProfiles g10 = L2.c.g(nVar.a(key));
            if (g10 != null) {
                C1124b.q(i >= 33, "DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.");
                bVar = new b(new c(g10));
            }
        }
        return bVar == null ? d.f30489a : bVar;
    }
}

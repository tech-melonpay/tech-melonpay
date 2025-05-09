package androidx.camera.core.impl;

import android.content.Context;
import android.util.Pair;
import android.util.Size;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public interface CameraDeviceSurfaceManager {

    public interface Provider {
        CameraDeviceSurfaceManager newInstance(Context context, Object obj, Set<String> set);
    }

    Pair<Map<UseCaseConfig<?>, StreamSpec>, Map<AttachedSurfaceInfo, StreamSpec>> getSuggestedStreamSpecs(int i, String str, List<AttachedSurfaceInfo> list, Map<UseCaseConfig<?>, List<Size>> map);

    SurfaceConfig transformSurfaceConfig(int i, String str, int i9, Size size);
}

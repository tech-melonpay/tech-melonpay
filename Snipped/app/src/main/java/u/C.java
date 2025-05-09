package u;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;

/* compiled from: StreamConfigurationMapCompatBaseImpl.java */
/* loaded from: classes.dex */
public class C {

    /* renamed from: a, reason: collision with root package name */
    public final StreamConfigurationMap f30036a;

    /* compiled from: StreamConfigurationMapCompatBaseImpl.java */
    public static class a {
        public static Size[] a(StreamConfigurationMap streamConfigurationMap, int i) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i);
        }
    }

    public C(StreamConfigurationMap streamConfigurationMap) {
        this.f30036a = streamConfigurationMap;
    }
}

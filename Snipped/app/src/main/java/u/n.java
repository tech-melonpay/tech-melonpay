package u;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import java.util.HashMap;

/* compiled from: CameraCharacteristicsCompat.java */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public final m f30059b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30060c;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f30058a = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public A f30061d = null;

    public n(CameraCharacteristics cameraCharacteristics, String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f30059b = new l(cameraCharacteristics);
        } else {
            this.f30059b = new m(cameraCharacteristics);
        }
        this.f30060c = str;
    }

    public final <T> T a(CameraCharacteristics.Key<T> key) {
        if (key.equals(CameraCharacteristics.SENSOR_ORIENTATION)) {
            return (T) this.f30059b.f30057a.get(key);
        }
        synchronized (this) {
            try {
                T t3 = (T) this.f30058a.get(key);
                if (t3 != null) {
                    return t3;
                }
                T t10 = (T) this.f30059b.f30057a.get(key);
                if (t10 != null) {
                    this.f30058a.put(key, t10);
                }
                return t10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final A b() {
        if (this.f30061d == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    throw new IllegalArgumentException("StreamConfigurationMap is null!");
                }
                this.f30061d = new A(streamConfigurationMap, new B1.f(this.f30060c));
            } catch (AssertionError e10) {
                throw new IllegalArgumentException(e10.getMessage());
            }
        }
        return this.f30061d;
    }
}

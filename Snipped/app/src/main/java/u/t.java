package u;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import androidx.camera.core.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u.o;
import v.l;

/* compiled from: CameraDeviceCompatBaseImpl.java */
/* loaded from: classes.dex */
public class t implements o.a {

    /* renamed from: a, reason: collision with root package name */
    public final CameraDevice f30068a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f30069b;

    /* compiled from: CameraDeviceCompatBaseImpl.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f30070a;

        public a(Handler handler) {
            this.f30070a = handler;
        }
    }

    public t(CameraDevice cameraDevice, a aVar) {
        cameraDevice.getClass();
        this.f30068a = cameraDevice;
        this.f30069b = aVar;
    }

    public static void b(CameraDevice cameraDevice, v.l lVar) {
        cameraDevice.getClass();
        lVar.getClass();
        l.c cVar = lVar.f30502a;
        cVar.b().getClass();
        List<v.f> g10 = cVar.g();
        if (g10 == null) {
            throw new IllegalArgumentException("Invalid output configurations");
        }
        if (cVar.e() == null) {
            throw new IllegalArgumentException("Invalid executor");
        }
        String id = cameraDevice.getId();
        Iterator<v.f> it = g10.iterator();
        while (it.hasNext()) {
            String d10 = it.next().f30493a.d();
            if (d10 != null && !d10.isEmpty()) {
                Logger.w("CameraDeviceCompat", s3.b.l("Camera ", id, ": Camera doesn't support physicalCameraId ", d10, ". Ignoring."));
            }
        }
    }

    public static ArrayList c(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((v.f) it.next()).f30493a.getSurface());
        }
        return arrayList;
    }
}

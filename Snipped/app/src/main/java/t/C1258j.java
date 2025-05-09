package t;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Handler;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.Logger;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.CameraFactory;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CameraStateRegistry;
import androidx.camera.core.impl.CameraThreadConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import pa.C1124b;

/* compiled from: Camera2CameraFactory.java */
/* renamed from: t.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1258j implements CameraFactory {

    /* renamed from: a, reason: collision with root package name */
    public final y.a f27276a;

    /* renamed from: b, reason: collision with root package name */
    public final CameraThreadConfig f27277b;

    /* renamed from: c, reason: collision with root package name */
    public final CameraStateRegistry f27278c;

    /* renamed from: d, reason: collision with root package name */
    public final u.v f27279d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f27280e;

    /* renamed from: f, reason: collision with root package name */
    public final L f27281f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f27282g = new HashMap();

    public C1258j(Context context, CameraThreadConfig cameraThreadConfig, CameraSelector cameraSelector) {
        String str;
        this.f27277b = cameraThreadConfig;
        u.v a10 = u.v.a(context, cameraThreadConfig.getSchedulerHandler());
        this.f27279d = a10;
        this.f27281f = L.b(context);
        try {
            ArrayList arrayList = new ArrayList();
            u.z zVar = (u.z) a10.f30074a;
            zVar.getClass();
            try {
                List<String> asList = Arrays.asList(zVar.f30080a.getCameraIdList());
                if (cameraSelector == null) {
                    Iterator it = asList.iterator();
                    while (it.hasNext()) {
                        arrayList.add((String) it.next());
                    }
                } else {
                    try {
                        str = D.a(a10, cameraSelector.getLensFacing(), asList);
                    } catch (IllegalStateException unused) {
                        str = null;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (String str2 : asList) {
                        if (!str2.equals(str)) {
                            arrayList2.add(a(str2));
                        }
                    }
                    Iterator<CameraInfo> it2 = cameraSelector.filter(arrayList2).iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((CameraInfoInternal) it2.next()).getCameraId());
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    String str3 = (String) it3.next();
                    if (!str3.equals("0") && !str3.equals("1")) {
                        if (!"robolectric".equals(Build.FINGERPRINT)) {
                            try {
                                int[] iArr = (int[]) this.f27279d.b(str3).a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                                if (iArr != null) {
                                    for (int i : iArr) {
                                        if (i != 0) {
                                        }
                                    }
                                }
                                Logger.d("Camera2CameraFactory", "Camera " + str3 + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
                            } catch (CameraAccessExceptionCompat e10) {
                                throw new InitializationException(C1124b.t(e10));
                            }
                        }
                        arrayList3.add(str3);
                        break;
                    } else {
                        arrayList3.add(str3);
                    }
                }
                this.f27280e = arrayList3;
                y.a aVar = new y.a(this.f27279d);
                this.f27276a = aVar;
                CameraStateRegistry cameraStateRegistry = new CameraStateRegistry(aVar, 1);
                this.f27278c = cameraStateRegistry;
                aVar.addListener(cameraStateRegistry);
            } catch (CameraAccessException e11) {
                throw CameraAccessExceptionCompat.a(e11);
            }
        } catch (CameraAccessExceptionCompat e12) {
            throw new InitializationException(C1124b.t(e12));
        } catch (CameraUnavailableException e13) {
            throw new InitializationException(e13);
        }
    }

    public final C1262n a(String str) {
        HashMap hashMap = this.f27282g;
        try {
            C1262n c1262n = (C1262n) hashMap.get(str);
            if (c1262n != null) {
                return c1262n;
            }
            C1262n c1262n2 = new C1262n(str, this.f27279d);
            hashMap.put(str, c1262n2);
            return c1262n2;
        } catch (CameraAccessExceptionCompat e10) {
            throw C1124b.t(e10);
        }
    }

    @Override // androidx.camera.core.impl.CameraFactory
    public final Set<String> getAvailableCameraIds() {
        return new LinkedHashSet(this.f27280e);
    }

    @Override // androidx.camera.core.impl.CameraFactory
    public final CameraInternal getCamera(String str) {
        if (!this.f27280e.contains(str)) {
            throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
        }
        C1262n a10 = a(str);
        CameraThreadConfig cameraThreadConfig = this.f27277b;
        Executor cameraExecutor = cameraThreadConfig.getCameraExecutor();
        Handler schedulerHandler = cameraThreadConfig.getSchedulerHandler();
        return new Camera2CameraImpl(this.f27279d, str, a10, this.f27276a, this.f27278c, cameraExecutor, schedulerHandler, this.f27281f);
    }

    @Override // androidx.camera.core.impl.CameraFactory
    public final CameraCoordinator getCameraCoordinator() {
        return this.f27276a;
    }

    @Override // androidx.camera.core.impl.CameraFactory
    public final Object getCameraManager() {
        return this.f27279d;
    }
}

package y;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.Logger;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import pa.C1124b;
import t.C1262n;
import u.v;

/* compiled from: Camera2CameraCoordinator.java */
/* loaded from: classes.dex */
public final class a implements CameraCoordinator {

    /* renamed from: a, reason: collision with root package name */
    public final v f30957a;

    /* renamed from: e, reason: collision with root package name */
    public final Set<Set<String>> f30961e;

    /* renamed from: f, reason: collision with root package name */
    public int f30962f = 0;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f30959c = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f30958b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f30960d = new ArrayList();

    public a(v vVar) {
        this.f30957a = vVar;
        this.f30961e = new HashSet();
        try {
            this.f30961e = vVar.f30074a.d();
        } catch (CameraAccessExceptionCompat unused) {
            Logger.e("Camera2CameraCoordinator", "Failed to get concurrent camera ids");
        }
        Iterator<Set<String>> it = this.f30961e.iterator();
        while (it.hasNext()) {
            ArrayList arrayList = new ArrayList(it.next());
            if (arrayList.size() >= 2) {
                String str = (String) arrayList.get(0);
                String str2 = (String) arrayList.get(1);
                HashMap hashMap = this.f30959c;
                if (!hashMap.containsKey(str)) {
                    hashMap.put(str, new ArrayList());
                }
                if (!hashMap.containsKey(str2)) {
                    hashMap.put(str2, new ArrayList());
                }
                ((List) hashMap.get(str)).add((String) arrayList.get(1));
                ((List) hashMap.get(str2)).add((String) arrayList.get(0));
            }
        }
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public final void addListener(CameraCoordinator.ConcurrentCameraModeListener concurrentCameraModeListener) {
        this.f30958b.add(concurrentCameraModeListener);
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public final List<CameraInfo> getActiveConcurrentCameraInfos() {
        return this.f30960d;
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public final int getCameraOperatingMode() {
        return this.f30962f;
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public final List<List<CameraSelector>> getConcurrentCameraSelectors() {
        ArrayList arrayList = new ArrayList();
        for (Set<String> set : this.f30961e) {
            ArrayList arrayList2 = new ArrayList();
            for (String str : set) {
                v vVar = this.f30957a;
                CameraSelector.Builder addCameraFilter = new CameraSelector.Builder().addCameraFilter(new c(str, 1));
                try {
                    addCameraFilter.requireLensFacing(((Integer) vVar.b(str).a(CameraCharacteristics.LENS_FACING)).intValue());
                    arrayList2.add(addCameraFilter.build());
                } catch (CameraAccessExceptionCompat e10) {
                    throw new RuntimeException(e10);
                }
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public final String getPairedConcurrentCameraId(String str) {
        HashMap hashMap = this.f30959c;
        if (!hashMap.containsKey(str)) {
            return null;
        }
        for (String str2 : (List) hashMap.get(str)) {
            Iterator it = this.f30960d.iterator();
            while (it.hasNext()) {
                CameraInfoInternal implementation = ((CameraInfoInternal) ((CameraInfo) it.next())).getImplementation();
                C1124b.m(implementation instanceof C1262n, "CameraInfo doesn't contain Camera2 implementation.");
                if (str2.equals(((C1262n) implementation).f27306c.f31212a.f27304a)) {
                    return str2;
                }
            }
        }
        return null;
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public final void removeListener(CameraCoordinator.ConcurrentCameraModeListener concurrentCameraModeListener) {
        this.f30958b.remove(concurrentCameraModeListener);
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public final void setActiveConcurrentCameraInfos(List<CameraInfo> list) {
        this.f30960d = new ArrayList(list);
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public final void setCameraOperatingMode(int i) {
        if (i != this.f30962f) {
            Iterator it = this.f30958b.iterator();
            while (it.hasNext()) {
                ((CameraCoordinator.ConcurrentCameraModeListener) it.next()).onCameraOperatingModeUpdated(this.f30962f, i);
            }
        }
        if (this.f30962f == 2 && i != 2) {
            this.f30960d.clear();
        }
        this.f30962f = i;
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public final void shutdown() {
        this.f30958b.clear();
        this.f30959c.clear();
        this.f30960d.clear();
        this.f30961e.clear();
        this.f30962f = 0;
    }
}

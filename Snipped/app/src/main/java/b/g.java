package B;

import B.c;
import a3.InterfaceFutureC0509a;
import android.content.Context;
import androidx.camera.core.CameraEffect;
import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraProvider;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraX;
import androidx.camera.core.UseCase;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.ViewPort;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.ExtendedCameraConfigProviderStore;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import pa.C1124b;

/* compiled from: ProcessCameraProvider.java */
/* loaded from: classes.dex */
public final class g implements CameraProvider {

    /* renamed from: g, reason: collision with root package name */
    public static final g f182g = new g();

    /* renamed from: b, reason: collision with root package name */
    public CallbackToFutureAdapter.c f184b;

    /* renamed from: e, reason: collision with root package name */
    public CameraX f187e;

    /* renamed from: f, reason: collision with root package name */
    public Context f188f;

    /* renamed from: a, reason: collision with root package name */
    public final Object f183a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceFutureC0509a<Void> f185c = Futures.immediateFuture(null);

    /* renamed from: d, reason: collision with root package name */
    public final c f186d = new c();

    public final b a(CameraSelector cameraSelector, UseCaseGroup useCaseGroup, r rVar) {
        CameraConfig cameraConfig;
        b bVar;
        Collection<b> unmodifiableCollection;
        CameraConfig config;
        boolean contains;
        CameraX cameraX = this.f187e;
        if (cameraX != null && cameraX.getCameraFactory().getCameraCoordinator().getCameraOperatingMode() == 2) {
            throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
        }
        CameraX cameraX2 = this.f187e;
        if (cameraX2 != null) {
            cameraX2.getCameraFactory().getCameraCoordinator().setCameraOperatingMode(1);
        }
        ViewPort viewPort = useCaseGroup.getViewPort();
        List<CameraEffect> effects = useCaseGroup.getEffects();
        UseCase[] useCaseArr = (UseCase[]) useCaseGroup.getUseCases().toArray(new UseCase[0]);
        Threads.checkMainThread();
        CameraSelector.Builder fromSelector = CameraSelector.Builder.fromSelector(cameraSelector);
        int length = useCaseArr.length;
        int i = 0;
        while (true) {
            cameraConfig = null;
            if (i >= length) {
                break;
            }
            CameraSelector cameraSelector2 = useCaseArr[i].getCurrentConfig().getCameraSelector(null);
            if (cameraSelector2 != null) {
                Iterator<CameraFilter> it = cameraSelector2.getCameraFilterSet().iterator();
                while (it.hasNext()) {
                    fromSelector.addCameraFilter(it.next());
                }
            }
            i++;
        }
        LinkedHashSet<CameraInternal> filter = fromSelector.build().filter(this.f187e.getCameraRepository().getCameras());
        if (filter.isEmpty()) {
            throw new IllegalArgumentException("Provided camera selector unable to resolve a camera for the given use case");
        }
        CameraUseCaseAdapter.CameraId generateCameraId = CameraUseCaseAdapter.generateCameraId(filter);
        c cVar = this.f186d;
        synchronized (cVar.f169a) {
            bVar = (b) cVar.f170b.get(new a(rVar, generateCameraId));
        }
        c cVar2 = this.f186d;
        synchronized (cVar2.f169a) {
            unmodifiableCollection = Collections.unmodifiableCollection(cVar2.f170b.values());
        }
        for (UseCase useCase : useCaseArr) {
            for (b bVar2 : unmodifiableCollection) {
                synchronized (bVar2.f165a) {
                    contains = bVar2.f167c.getUseCases().contains(useCase);
                }
                if (contains && bVar2 != bVar) {
                    throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", useCase));
                }
            }
        }
        if (bVar == null) {
            c cVar3 = this.f186d;
            CameraUseCaseAdapter cameraUseCaseAdapter = new CameraUseCaseAdapter(filter, this.f187e.getCameraFactory().getCameraCoordinator(), this.f187e.getCameraDeviceSurfaceManager(), this.f187e.getDefaultConfigFactory());
            synchronized (cVar3.f169a) {
                try {
                    C1124b.m(cVar3.f170b.get(new a(rVar, cameraUseCaseAdapter.getCameraId())) == null, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
                    if (rVar.getLifecycle().b() == Lifecycle.State.f6975a) {
                        throw new IllegalArgumentException("Trying to create LifecycleCamera with destroyed lifecycle.");
                    }
                    bVar = new b(rVar, cameraUseCaseAdapter);
                    if (cameraUseCaseAdapter.getUseCases().isEmpty()) {
                        bVar.b();
                    }
                    cVar3.d(bVar);
                } finally {
                }
            }
        }
        b bVar3 = bVar;
        Iterator<CameraFilter> it2 = cameraSelector.getCameraFilterSet().iterator();
        while (it2.hasNext()) {
            CameraFilter next = it2.next();
            if (next.getIdentifier() != CameraFilter.DEFAULT_ID && (config = ExtendedCameraConfigProviderStore.getConfigProvider(next.getIdentifier()).getConfig(bVar3.f167c.getCameraInfo(), this.f188f)) != null) {
                if (cameraConfig != null) {
                    throw new IllegalArgumentException("Cannot apply multiple extended camera configs at the same time.");
                }
                cameraConfig = config;
            }
        }
        bVar3.setExtendedConfig(cameraConfig);
        if (useCaseArr.length != 0) {
            this.f186d.a(bVar3, viewPort, effects, Arrays.asList(useCaseArr), this.f187e.getCameraFactory().getCameraCoordinator());
        }
        return bVar3;
    }

    public final void b() {
        r rVar;
        Threads.checkMainThread();
        CameraX cameraX = this.f187e;
        if (cameraX != null) {
            cameraX.getCameraFactory().getCameraCoordinator().setCameraOperatingMode(0);
        }
        c cVar = this.f186d;
        synchronized (cVar.f169a) {
            Iterator it = cVar.f170b.keySet().iterator();
            while (it.hasNext()) {
                b bVar = (b) cVar.f170b.get((c.a) it.next());
                synchronized (bVar.f165a) {
                    CameraUseCaseAdapter cameraUseCaseAdapter = bVar.f167c;
                    cameraUseCaseAdapter.removeUseCases(cameraUseCaseAdapter.getUseCases());
                }
                synchronized (bVar.f165a) {
                    rVar = bVar.f166b;
                }
                cVar.f(rVar);
            }
        }
    }

    @Override // androidx.camera.core.CameraProvider
    public final List<CameraInfo> getAvailableCameraInfos() {
        ArrayList arrayList = new ArrayList();
        Iterator<CameraInternal> it = this.f187e.getCameraRepository().getCameras().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getCameraInfo());
        }
        return arrayList;
    }

    @Override // androidx.camera.core.CameraProvider
    public final boolean hasCamera(CameraSelector cameraSelector) {
        try {
            cameraSelector.select(this.f187e.getCameraRepository().getCameras());
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }
}

package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import c.RunnableC0615f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* compiled from: CaptureSessionRepository.java */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f5259a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5260b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f5261c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f5262d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f5263e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public final a f5264f = new a();

    public k(Executor executor) {
        this.f5259a = executor;
    }

    public final ArrayList a() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        synchronized (this.f5260b) {
            arrayList = new ArrayList();
            synchronized (this.f5260b) {
                arrayList2 = new ArrayList(this.f5261c);
            }
            arrayList.addAll(arrayList2);
            synchronized (this.f5260b) {
                arrayList3 = new ArrayList(this.f5263e);
            }
            arrayList.addAll(arrayList3);
        }
        return arrayList;
    }

    /* compiled from: CaptureSessionRepository.java */
    public class a extends CameraDevice.StateCallback {
        public a() {
        }

        public final void a() {
            ArrayList a10;
            synchronized (k.this.f5260b) {
                a10 = k.this.a();
                k.this.f5263e.clear();
                k.this.f5261c.clear();
                k.this.f5262d.clear();
            }
            Iterator it = a10.iterator();
            while (it.hasNext()) {
                ((o) it.next()).c();
            }
        }

        public final void b() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (k.this.f5260b) {
                linkedHashSet.addAll(k.this.f5263e);
                linkedHashSet.addAll(k.this.f5261c);
            }
            k.this.f5259a.execute(new RunnableC0615f(linkedHashSet, 18));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onClosed(CameraDevice cameraDevice) {
            a();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(CameraDevice cameraDevice) {
            b();
            a();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(CameraDevice cameraDevice, int i) {
            b();
            a();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(CameraDevice cameraDevice) {
        }
    }
}

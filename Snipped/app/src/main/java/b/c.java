package B;

import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.lifecycle.B;
import androidx.lifecycle.InterfaceC0551q;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.r;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: LifecycleCameraRepository.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f169a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f170b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f171c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque<r> f172d = new ArrayDeque<>();

    /* renamed from: e, reason: collision with root package name */
    public CameraCoordinator f173e;

    /* compiled from: LifecycleCameraRepository.java */
    public static abstract class a {
        public abstract CameraUseCaseAdapter.CameraId a();

        public abstract r b();
    }

    /* compiled from: LifecycleCameraRepository.java */
    public static class b implements InterfaceC0551q {

        /* renamed from: a, reason: collision with root package name */
        public final c f174a;

        /* renamed from: b, reason: collision with root package name */
        public final r f175b;

        public b(r rVar, c cVar) {
            this.f175b = rVar;
            this.f174a = cVar;
        }

        @B(Lifecycle.Event.ON_DESTROY)
        public void onDestroy(r rVar) {
            c cVar = this.f174a;
            synchronized (cVar.f169a) {
                try {
                    b b9 = cVar.b(rVar);
                    if (b9 == null) {
                        return;
                    }
                    cVar.f(rVar);
                    Iterator it = ((Set) cVar.f171c.get(b9)).iterator();
                    while (it.hasNext()) {
                        cVar.f170b.remove((a) it.next());
                    }
                    cVar.f171c.remove(b9);
                    b9.f175b.getLifecycle().c(b9);
                } finally {
                }
            }
        }

        @B(Lifecycle.Event.ON_START)
        public void onStart(r rVar) {
            this.f174a.e(rVar);
        }

        @B(Lifecycle.Event.ON_STOP)
        public void onStop(r rVar) {
            this.f174a.f(rVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(B.b r5, androidx.camera.core.ViewPort r6, java.util.List r7, java.util.List r8, androidx.camera.core.concurrent.CameraCoordinator r9) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f169a
            monitor-enter(r0)
            boolean r1 = r8.isEmpty()     // Catch: java.lang.Throwable -> L2c
            r1 = r1 ^ 1
            pa.C1124b.l(r1)     // Catch: java.lang.Throwable -> L2c
            r4.f173e = r9     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r9 = r5.f165a     // Catch: java.lang.Throwable -> L2c
            monitor-enter(r9)     // Catch: java.lang.Throwable -> L2c
            androidx.lifecycle.r r1 = r5.f166b     // Catch: java.lang.Throwable -> L98
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L98
            B.c$b r9 = r4.b(r1)     // Catch: java.lang.Throwable -> L2c
            java.util.HashMap r2 = r4.f171c     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r9 = r2.get(r9)     // Catch: java.lang.Throwable -> L2c
            java.util.Set r9 = (java.util.Set) r9     // Catch: java.lang.Throwable -> L2c
            androidx.camera.core.concurrent.CameraCoordinator r2 = r4.f173e     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L2e
            int r2 = r2.getCameraOperatingMode()     // Catch: java.lang.Throwable -> L2c
            r3 = 2
            if (r2 == r3) goto L62
            goto L2e
        L2c:
            r5 = move-exception
            goto L9b
        L2e:
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L2c
        L32:
            boolean r2 = r9.hasNext()     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L62
            java.lang.Object r2 = r9.next()     // Catch: java.lang.Throwable -> L2c
            B.c$a r2 = (B.c.a) r2     // Catch: java.lang.Throwable -> L2c
            java.util.HashMap r3 = r4.f170b     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.Throwable -> L2c
            B.b r2 = (B.b) r2     // Catch: java.lang.Throwable -> L2c
            r2.getClass()     // Catch: java.lang.Throwable -> L2c
            boolean r3 = r2.equals(r5)     // Catch: java.lang.Throwable -> L2c
            if (r3 != 0) goto L32
            java.util.List r2 = r2.a()     // Catch: java.lang.Throwable -> L2c
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L5a
            goto L32
        L5a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L2c
            java.lang.String r6 = "Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner."
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L2c
            throw r5     // Catch: java.lang.Throwable -> L2c
        L62:
            androidx.camera.core.internal.CameraUseCaseAdapter r9 = r5.f167c     // Catch: java.lang.Throwable -> L2c androidx.camera.core.internal.CameraUseCaseAdapter.CameraException -> L8d
            r9.setViewPort(r6)     // Catch: java.lang.Throwable -> L2c androidx.camera.core.internal.CameraUseCaseAdapter.CameraException -> L8d
            androidx.camera.core.internal.CameraUseCaseAdapter r6 = r5.f167c     // Catch: java.lang.Throwable -> L2c androidx.camera.core.internal.CameraUseCaseAdapter.CameraException -> L8d
            r6.setEffects(r7)     // Catch: java.lang.Throwable -> L2c androidx.camera.core.internal.CameraUseCaseAdapter.CameraException -> L8d
            java.lang.Object r6 = r5.f165a     // Catch: java.lang.Throwable -> L2c androidx.camera.core.internal.CameraUseCaseAdapter.CameraException -> L8d
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L2c androidx.camera.core.internal.CameraUseCaseAdapter.CameraException -> L8d
            androidx.camera.core.internal.CameraUseCaseAdapter r5 = r5.f167c     // Catch: java.lang.Throwable -> L8a
            r5.addUseCases(r8)     // Catch: java.lang.Throwable -> L8a
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L8a
            androidx.lifecycle.Lifecycle r5 = r1.getLifecycle()     // Catch: java.lang.Throwable -> L2c
            androidx.lifecycle.Lifecycle$State r5 = r5.b()     // Catch: java.lang.Throwable -> L2c
            androidx.lifecycle.Lifecycle$State r6 = androidx.lifecycle.Lifecycle.State.f6978d     // Catch: java.lang.Throwable -> L2c
            boolean r5 = r5.a(r6)     // Catch: java.lang.Throwable -> L2c
            if (r5 == 0) goto L88
            r4.e(r1)     // Catch: java.lang.Throwable -> L2c
        L88:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            return
        L8a:
            r5 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L8a
            throw r5     // Catch: java.lang.Throwable -> L2c androidx.camera.core.internal.CameraUseCaseAdapter.CameraException -> L8d
        L8d:
            r5 = move-exception
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L2c
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L2c
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L2c
            throw r6     // Catch: java.lang.Throwable -> L2c
        L98:
            r5 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L98
            throw r5     // Catch: java.lang.Throwable -> L2c
        L9b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: B.c.a(B.b, androidx.camera.core.ViewPort, java.util.List, java.util.List, androidx.camera.core.concurrent.CameraCoordinator):void");
    }

    public final b b(r rVar) {
        synchronized (this.f169a) {
            try {
                for (b bVar : this.f171c.keySet()) {
                    if (rVar.equals(bVar.f175b)) {
                        return bVar;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(r rVar) {
        synchronized (this.f169a) {
            try {
                b b9 = b(rVar);
                if (b9 == null) {
                    return false;
                }
                Iterator it = ((Set) this.f171c.get(b9)).iterator();
                while (it.hasNext()) {
                    B.b bVar = (B.b) this.f170b.get((a) it.next());
                    bVar.getClass();
                    if (!bVar.a().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(B.b bVar) {
        r rVar;
        synchronized (this.f169a) {
            try {
                synchronized (bVar.f165a) {
                    rVar = bVar.f166b;
                }
                B.a aVar = new B.a(rVar, bVar.f167c.getCameraId());
                b b9 = b(rVar);
                Set hashSet = b9 != null ? (Set) this.f171c.get(b9) : new HashSet();
                hashSet.add(aVar);
                this.f170b.put(aVar, bVar);
                if (b9 == null) {
                    b bVar2 = new b(rVar, this);
                    this.f171c.put(bVar2, hashSet);
                    rVar.getLifecycle().a(bVar2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(r rVar) {
        synchronized (this.f169a) {
            try {
                if (c(rVar)) {
                    if (this.f172d.isEmpty()) {
                        this.f172d.push(rVar);
                    } else {
                        CameraCoordinator cameraCoordinator = this.f173e;
                        if (cameraCoordinator == null || cameraCoordinator.getCameraOperatingMode() != 2) {
                            r peek = this.f172d.peek();
                            if (!rVar.equals(peek)) {
                                g(peek);
                                this.f172d.remove(rVar);
                                this.f172d.push(rVar);
                            }
                        }
                    }
                    h(rVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(r rVar) {
        synchronized (this.f169a) {
            try {
                this.f172d.remove(rVar);
                g(rVar);
                if (!this.f172d.isEmpty()) {
                    h(this.f172d.peek());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(r rVar) {
        synchronized (this.f169a) {
            try {
                b b9 = b(rVar);
                if (b9 == null) {
                    return;
                }
                Iterator it = ((Set) this.f171c.get(b9)).iterator();
                while (it.hasNext()) {
                    B.b bVar = (B.b) this.f170b.get((a) it.next());
                    bVar.getClass();
                    bVar.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(r rVar) {
        synchronized (this.f169a) {
            try {
                Iterator it = ((Set) this.f171c.get(b(rVar))).iterator();
                while (it.hasNext()) {
                    B.b bVar = (B.b) this.f170b.get((a) it.next());
                    bVar.getClass();
                    if (!bVar.a().isEmpty()) {
                        bVar.c();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import androidx.camera.camera2.internal.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import t.A;
import t.C1273z;
import u.C1495b;

/* compiled from: SynchronizedCaptureSessionStateCallbacks.java */
/* loaded from: classes.dex */
public final class s extends o.a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5301a;

    public s(List<o.a> list) {
        ArrayList arrayList = new ArrayList();
        this.f5301a = arrayList;
        arrayList.addAll(list);
    }

    @Override // androidx.camera.camera2.internal.o.a
    public final void j(p pVar) {
        Iterator it = this.f5301a.iterator();
        while (it.hasNext()) {
            ((o.a) it.next()).j(pVar);
        }
    }

    @Override // androidx.camera.camera2.internal.o.a
    public final void k(p pVar) {
        Iterator it = this.f5301a.iterator();
        while (it.hasNext()) {
            ((o.a) it.next()).k(pVar);
        }
    }

    @Override // androidx.camera.camera2.internal.o.a
    public final void l(o oVar) {
        Iterator it = this.f5301a.iterator();
        while (it.hasNext()) {
            ((o.a) it.next()).l(oVar);
        }
    }

    @Override // androidx.camera.camera2.internal.o.a
    public final void m(o oVar) {
        Iterator it = this.f5301a.iterator();
        while (it.hasNext()) {
            ((o.a) it.next()).m(oVar);
        }
    }

    @Override // androidx.camera.camera2.internal.o.a
    public final void n(p pVar) {
        Iterator it = this.f5301a.iterator();
        while (it.hasNext()) {
            ((o.a) it.next()).n(pVar);
        }
    }

    @Override // androidx.camera.camera2.internal.o.a
    public final void o(p pVar) {
        Iterator it = this.f5301a.iterator();
        while (it.hasNext()) {
            ((o.a) it.next()).o(pVar);
        }
    }

    @Override // androidx.camera.camera2.internal.o.a
    public final void p(o oVar) {
        Iterator it = this.f5301a.iterator();
        while (it.hasNext()) {
            ((o.a) it.next()).p(oVar);
        }
    }

    @Override // androidx.camera.camera2.internal.o.a
    public final void q(p pVar, Surface surface) {
        Iterator it = this.f5301a.iterator();
        while (it.hasNext()) {
            ((o.a) it.next()).q(pVar, surface);
        }
    }

    /* compiled from: SynchronizedCaptureSessionStateCallbacks.java */
    public static class a extends o.a {

        /* renamed from: a, reason: collision with root package name */
        public final CameraCaptureSession.StateCallback f5302a;

        public a(List<CameraCaptureSession.StateCallback> list) {
            this.f5302a = list.isEmpty() ? new A() : list.size() == 1 ? list.get(0) : new C1273z(list);
        }

        @Override // androidx.camera.camera2.internal.o.a
        public final void j(p pVar) {
            this.f5302a.onActive(pVar.d().f30037a.f30054a);
        }

        @Override // androidx.camera.camera2.internal.o.a
        public final void k(p pVar) {
            u.d.b(this.f5302a, pVar.d().f30037a.f30054a);
        }

        @Override // androidx.camera.camera2.internal.o.a
        public final void l(o oVar) {
            this.f5302a.onClosed(oVar.d().f30037a.f30054a);
        }

        @Override // androidx.camera.camera2.internal.o.a
        public final void m(o oVar) {
            this.f5302a.onConfigureFailed(oVar.d().f30037a.f30054a);
        }

        @Override // androidx.camera.camera2.internal.o.a
        public final void n(p pVar) {
            this.f5302a.onConfigured(pVar.d().f30037a.f30054a);
        }

        @Override // androidx.camera.camera2.internal.o.a
        public final void o(p pVar) {
            this.f5302a.onReady(pVar.d().f30037a.f30054a);
        }

        @Override // androidx.camera.camera2.internal.o.a
        public final void q(p pVar, Surface surface) {
            C1495b.a(this.f5302a, pVar.d().f30037a.f30054a, surface);
        }

        @Override // androidx.camera.camera2.internal.o.a
        public final void p(o oVar) {
        }
    }
}

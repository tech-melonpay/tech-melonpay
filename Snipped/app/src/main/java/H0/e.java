package H0;

import H0.a;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;

/* compiled from: SpringAnimation.java */
/* loaded from: classes.dex */
public final class e extends b<e> {

    /* renamed from: s, reason: collision with root package name */
    public f f1405s;

    /* renamed from: t, reason: collision with root package name */
    public float f1406t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1407u;

    public <K> e(K k3, c<K> cVar, float f10) {
        super(k3, cVar);
        this.f1405s = null;
        this.f1406t = Float.MAX_VALUE;
        this.f1407u = false;
        this.f1405s = new f(f10);
    }

    public final void e(float f10) {
        if (this.f1395f) {
            this.f1406t = f10;
            return;
        }
        if (this.f1405s == null) {
            this.f1405s = new f(f10);
        }
        this.f1405s.i = f10;
        g();
    }

    public final void f() {
        if (this.f1405s.f1409b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f1395f) {
            this.f1407u = true;
        }
    }

    public final void g() {
        f fVar = this.f1405s;
        if (fVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double d10 = (float) fVar.i;
        if (d10 > this.f1396g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d10 < this.f1397h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double abs = Math.abs(this.f1398j * 0.75f);
        fVar.f1411d = abs;
        fVar.f1412e = abs * 62.5d;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        boolean z10 = this.f1395f;
        if (z10 || z10) {
            return;
        }
        this.f1395f = true;
        if (!this.f1392c) {
            this.f1391b = this.f1394e.getValue(this.f1393d);
        }
        float f10 = this.f1391b;
        if (f10 > this.f1396g || f10 < this.f1397h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        ThreadLocal<a> threadLocal = a.f1373f;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        a aVar = threadLocal.get();
        ArrayList<a.b> arrayList = aVar.f1375b;
        if (arrayList.size() == 0) {
            if (aVar.f1377d == null) {
                aVar.f1377d = new a.d(aVar.f1376c);
            }
            a.d dVar = aVar.f1377d;
            dVar.f1381b.postFrameCallback(dVar.f1382c);
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }
}

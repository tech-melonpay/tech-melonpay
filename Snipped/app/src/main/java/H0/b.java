package H0;

import H0.a;
import H0.b;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
import y0.C1596C;
import y0.E;

/* compiled from: DynamicAnimation.java */
/* loaded from: classes.dex */
public abstract class b<T extends b<T>> implements a.b {

    /* renamed from: m, reason: collision with root package name */
    public static final j f1384m;

    /* renamed from: n, reason: collision with root package name */
    public static final k f1385n;

    /* renamed from: o, reason: collision with root package name */
    public static final l f1386o;

    /* renamed from: p, reason: collision with root package name */
    public static final m f1387p;

    /* renamed from: q, reason: collision with root package name */
    public static final n f1388q;

    /* renamed from: r, reason: collision with root package name */
    public static final c f1389r;

    /* renamed from: a, reason: collision with root package name */
    public float f1390a;

    /* renamed from: b, reason: collision with root package name */
    public float f1391b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1392c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1393d;

    /* renamed from: e, reason: collision with root package name */
    public final H0.c f1394e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1395f;

    /* renamed from: g, reason: collision with root package name */
    public float f1396g;

    /* renamed from: h, reason: collision with root package name */
    public float f1397h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public float f1398j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList<q> f1399k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList<r> f1400l;

    /* compiled from: DynamicAnimation.java */
    public static class a extends s {
        @Override // H0.c
        public final float getValue(View view) {
            return view.getY();
        }

        @Override // H0.c
        public final void setValue(View view, float f10) {
            view.setY(f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: H0.b$b, reason: collision with other inner class name */
    public static class C0020b extends s {
        @Override // H0.c
        public final float getValue(View view) {
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            return C1596C.d.h(view);
        }

        @Override // H0.c
        public final void setValue(View view, float f10) {
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            C1596C.d.p(view, f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    public static class c extends s {
        @Override // H0.c
        public final float getValue(View view) {
            return view.getAlpha();
        }

        @Override // H0.c
        public final void setValue(View view, float f10) {
            view.setAlpha(f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    public static class d extends s {
        @Override // H0.c
        public final float getValue(View view) {
            return view.getScrollX();
        }

        @Override // H0.c
        public final void setValue(View view, float f10) {
            view.setScrollX((int) f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    public static class e extends s {
        @Override // H0.c
        public final float getValue(View view) {
            return view.getScrollY();
        }

        @Override // H0.c
        public final void setValue(View view, float f10) {
            view.setScrollY((int) f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    public class f extends H0.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ H0.d f1401a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(H0.d dVar) {
            super("FloatValueHolder");
            this.f1401a = dVar;
        }

        @Override // H0.c
        public final float getValue(Object obj) {
            return this.f1401a.f1404a;
        }

        @Override // H0.c
        public final void setValue(Object obj, float f10) {
            this.f1401a.f1404a = f10;
        }
    }

    /* compiled from: DynamicAnimation.java */
    public static class g extends s {
        @Override // H0.c
        public final float getValue(View view) {
            return view.getTranslationX();
        }

        @Override // H0.c
        public final void setValue(View view, float f10) {
            view.setTranslationX(f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    public static class h extends s {
        @Override // H0.c
        public final float getValue(View view) {
            return view.getTranslationY();
        }

        @Override // H0.c
        public final void setValue(View view, float f10) {
            view.setTranslationY(f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    public static class i extends s {
        @Override // H0.c
        public final float getValue(View view) {
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            return C1596C.d.g(view);
        }

        @Override // H0.c
        public final void setValue(View view, float f10) {
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            C1596C.d.o(view, f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    public static class j extends s {
        @Override // H0.c
        public final float getValue(View view) {
            return view.getScaleX();
        }

        @Override // H0.c
        public final void setValue(View view, float f10) {
            view.setScaleX(f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    public static class k extends s {
        @Override // H0.c
        public final float getValue(View view) {
            return view.getScaleY();
        }

        @Override // H0.c
        public final void setValue(View view, float f10) {
            view.setScaleY(f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    public static class l extends s {
        @Override // H0.c
        public final float getValue(View view) {
            return view.getRotation();
        }

        @Override // H0.c
        public final void setValue(View view, float f10) {
            view.setRotation(f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    public static class m extends s {
        @Override // H0.c
        public final float getValue(View view) {
            return view.getRotationX();
        }

        @Override // H0.c
        public final void setValue(View view, float f10) {
            view.setRotationX(f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    public static class n extends s {
        @Override // H0.c
        public final float getValue(View view) {
            return view.getRotationY();
        }

        @Override // H0.c
        public final void setValue(View view, float f10) {
            view.setRotationY(f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    public static class o extends s {
        @Override // H0.c
        public final float getValue(View view) {
            return view.getX();
        }

        @Override // H0.c
        public final void setValue(View view, float f10) {
            view.setX(f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    public static class p {

        /* renamed from: a, reason: collision with root package name */
        public float f1402a;

        /* renamed from: b, reason: collision with root package name */
        public float f1403b;
    }

    /* compiled from: DynamicAnimation.java */
    public interface q {
        void a(b bVar, boolean z10, float f10, float f11);
    }

    /* compiled from: DynamicAnimation.java */
    public interface r {
        void k(float f10);
    }

    /* compiled from: DynamicAnimation.java */
    public static abstract class s extends H0.c<View> {
    }

    static {
        new g("translationX");
        new h("translationY");
        new i("translationZ");
        f1384m = new j("scaleX");
        f1385n = new k("scaleY");
        f1386o = new l("rotation");
        f1387p = new m("rotationX");
        f1388q = new n("rotationY");
        new o("x");
        new a("y");
        new C0020b("z");
        f1389r = new c("alpha");
        new d("scrollX");
        new e("scrollY");
    }

    public b(H0.d dVar) {
        this.f1390a = 0.0f;
        this.f1391b = Float.MAX_VALUE;
        this.f1392c = false;
        this.f1395f = false;
        this.f1396g = Float.MAX_VALUE;
        this.f1397h = -3.4028235E38f;
        this.i = 0L;
        this.f1399k = new ArrayList<>();
        this.f1400l = new ArrayList<>();
        this.f1393d = null;
        this.f1394e = new f(dVar);
        this.f1398j = 1.0f;
    }

    @Override // H0.a.b
    public final boolean a(long j10) {
        long j11 = this.i;
        if (j11 == 0) {
            this.i = j10;
            d(this.f1391b);
            return false;
        }
        long j12 = j10 - j11;
        this.i = j10;
        H0.e eVar = (H0.e) this;
        boolean z10 = true;
        if (eVar.f1407u) {
            float f10 = eVar.f1406t;
            if (f10 != Float.MAX_VALUE) {
                eVar.f1405s.i = f10;
                eVar.f1406t = Float.MAX_VALUE;
            }
            eVar.f1391b = (float) eVar.f1405s.i;
            eVar.f1390a = 0.0f;
            eVar.f1407u = false;
        } else {
            if (eVar.f1406t != Float.MAX_VALUE) {
                H0.f fVar = eVar.f1405s;
                double d10 = fVar.i;
                long j13 = j12 / 2;
                p c2 = fVar.c(eVar.f1391b, eVar.f1390a, j13);
                H0.f fVar2 = eVar.f1405s;
                fVar2.i = eVar.f1406t;
                eVar.f1406t = Float.MAX_VALUE;
                p c10 = fVar2.c(c2.f1402a, c2.f1403b, j13);
                eVar.f1391b = c10.f1402a;
                eVar.f1390a = c10.f1403b;
            } else {
                p c11 = eVar.f1405s.c(eVar.f1391b, eVar.f1390a, j12);
                eVar.f1391b = c11.f1402a;
                eVar.f1390a = c11.f1403b;
            }
            float max = Math.max(eVar.f1391b, eVar.f1397h);
            eVar.f1391b = max;
            eVar.f1391b = Math.min(max, eVar.f1396g);
            float f11 = eVar.f1390a;
            H0.f fVar3 = eVar.f1405s;
            fVar3.getClass();
            if (Math.abs(f11) >= fVar3.f1412e || Math.abs(r2 - ((float) fVar3.i)) >= fVar3.f1411d) {
                z10 = false;
            } else {
                eVar.f1391b = (float) eVar.f1405s.i;
                eVar.f1390a = 0.0f;
            }
        }
        float min = Math.min(this.f1391b, this.f1396g);
        this.f1391b = min;
        float max2 = Math.max(min, this.f1397h);
        this.f1391b = max2;
        d(max2);
        if (z10) {
            c(false);
        }
        return z10;
    }

    public final void b() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if (this.f1395f) {
            c(true);
        }
    }

    public final void c(boolean z10) {
        ArrayList<q> arrayList;
        int i9 = 0;
        this.f1395f = false;
        ThreadLocal<H0.a> threadLocal = H0.a.f1373f;
        if (threadLocal.get() == null) {
            threadLocal.set(new H0.a());
        }
        H0.a aVar = threadLocal.get();
        aVar.f1374a.remove(this);
        ArrayList<a.b> arrayList2 = aVar.f1375b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            aVar.f1378e = true;
        }
        this.i = 0L;
        this.f1392c = false;
        while (true) {
            arrayList = this.f1399k;
            if (i9 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i9) != null) {
                arrayList.get(i9).a(this, z10, this.f1391b, this.f1390a);
            }
            i9++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void d(float f10) {
        ArrayList<r> arrayList;
        this.f1394e.setValue(this.f1393d, f10);
        int i9 = 0;
        while (true) {
            arrayList = this.f1400l;
            if (i9 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i9) != null) {
                arrayList.get(i9).k(this.f1391b);
            }
            i9++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public <K> b(K k3, H0.c<K> cVar) {
        this.f1390a = 0.0f;
        this.f1391b = Float.MAX_VALUE;
        this.f1392c = false;
        this.f1395f = false;
        this.f1396g = Float.MAX_VALUE;
        this.f1397h = -3.4028235E38f;
        this.i = 0L;
        this.f1399k = new ArrayList<>();
        this.f1400l = new ArrayList<>();
        this.f1393d = k3;
        this.f1394e = cVar;
        if (cVar != f1386o && cVar != f1387p && cVar != f1388q) {
            if (cVar == f1389r) {
                this.f1398j = 0.00390625f;
                return;
            } else if (cVar != f1384m && cVar != f1385n) {
                this.f1398j = 1.0f;
                return;
            } else {
                this.f1398j = 0.00390625f;
                return;
            }
        }
        this.f1398j = 0.1f;
    }
}

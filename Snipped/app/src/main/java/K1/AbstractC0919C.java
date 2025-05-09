package k1;

import H0.b;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.fragment.app.RunnableC0528b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.WeakHashMap;
import y0.C1596C;

/* compiled from: Transition.java */
/* renamed from: k1.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0919C implements Cloneable {

    /* renamed from: G, reason: collision with root package name */
    public static final Animator[] f22683G = new Animator[0];

    /* renamed from: H, reason: collision with root package name */
    public static final int[] f22684H = {2, 1, 3, 4};

    /* renamed from: I, reason: collision with root package name */
    public static final a f22685I = new a();

    /* renamed from: J, reason: collision with root package name */
    public static final ThreadLocal<androidx.collection.a<Animator, b>> f22686J = new ThreadLocal<>();

    /* renamed from: A, reason: collision with root package name */
    public X f22687A;

    /* renamed from: B, reason: collision with root package name */
    public d f22688B;

    /* renamed from: C, reason: collision with root package name */
    public AbstractC0940v f22689C;

    /* renamed from: D, reason: collision with root package name */
    public long f22690D;

    /* renamed from: E, reason: collision with root package name */
    public f f22691E;

    /* renamed from: F, reason: collision with root package name */
    public long f22692F;

    /* renamed from: a, reason: collision with root package name */
    public final String f22693a;

    /* renamed from: b, reason: collision with root package name */
    public long f22694b;

    /* renamed from: c, reason: collision with root package name */
    public long f22695c;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f22696d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList<Integer> f22697e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList<View> f22698f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList<String> f22699g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList<Class<?>> f22700h;
    public ArrayList<Integer> i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList<Class<?>> f22701j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList<String> f22702k;

    /* renamed from: l, reason: collision with root package name */
    public z1.g f22703l;

    /* renamed from: m, reason: collision with root package name */
    public z1.g f22704m;

    /* renamed from: n, reason: collision with root package name */
    public J f22705n;

    /* renamed from: o, reason: collision with root package name */
    public final int[] f22706o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList<L> f22707p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList<L> f22708q;

    /* renamed from: r, reason: collision with root package name */
    public g[] f22709r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList<Animator> f22710s;

    /* renamed from: t, reason: collision with root package name */
    public Animator[] f22711t;

    /* renamed from: u, reason: collision with root package name */
    public int f22712u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f22713v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f22714w;

    /* renamed from: x, reason: collision with root package name */
    public AbstractC0919C f22715x;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList<g> f22716y;

    /* renamed from: z, reason: collision with root package name */
    public ArrayList<Animator> f22717z;

    /* compiled from: Transition.java */
    /* renamed from: k1.C$a */
    public class a extends AbstractC0940v {
        @Override // k1.AbstractC0940v
        public final Path a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    /* compiled from: Transition.java */
    /* renamed from: k1.C$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public View f22718a;

        /* renamed from: b, reason: collision with root package name */
        public String f22719b;

        /* renamed from: c, reason: collision with root package name */
        public L f22720c;

        /* renamed from: d, reason: collision with root package name */
        public WindowId f22721d;

        /* renamed from: e, reason: collision with root package name */
        public AbstractC0919C f22722e;

        /* renamed from: f, reason: collision with root package name */
        public Animator f22723f;
    }

    /* compiled from: Transition.java */
    /* renamed from: k1.C$c */
    public static class c {
        public static ArrayList a(Object obj, ArrayList arrayList) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (!arrayList.contains(obj)) {
                arrayList.add(obj);
            }
            return arrayList;
        }
    }

    /* compiled from: Transition.java */
    /* renamed from: k1.C$d */
    public static abstract class d {
        public abstract Rect a();
    }

    /* compiled from: Transition.java */
    /* renamed from: k1.C$e */
    public static class e {
        public static long a(Animator animator) {
            return animator.getTotalDuration();
        }

        public static void b(Animator animator, long j10) {
            ((AnimatorSet) animator).setCurrentPlayTime(j10);
        }
    }

    /* compiled from: Transition.java */
    /* renamed from: k1.C$f */
    public class f extends G implements I, b.r {

        /* renamed from: a, reason: collision with root package name */
        public long f22724a = -1;

        /* renamed from: b, reason: collision with root package name */
        public boolean f22725b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f22726c;

        /* renamed from: d, reason: collision with root package name */
        public H0.e f22727d;

        /* renamed from: e, reason: collision with root package name */
        public final N f22728e;

        /* renamed from: f, reason: collision with root package name */
        public Runnable f22729f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ AbstractC0919C f22730g;

        public f(J j10) {
            this.f22730g = j10;
            N n10 = new N();
            long[] jArr = new long[20];
            n10.f22772a = jArr;
            n10.f22773b = new float[20];
            n10.f22774c = 0;
            Arrays.fill(jArr, Long.MIN_VALUE);
            this.f22728e = n10;
        }

        @Override // k1.G, k1.AbstractC0919C.g
        public final void a(AbstractC0919C abstractC0919C) {
            this.f22726c = true;
        }

        @Override // k1.I
        public final boolean d() {
            return this.f22725b;
        }

        @Override // k1.I
        public final void f(long j10) {
            if (this.f22727d != null) {
                throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            }
            long j11 = this.f22724a;
            if (j10 == j11 || !this.f22725b) {
                return;
            }
            if (!this.f22726c) {
                AbstractC0919C abstractC0919C = this.f22730g;
                if (j10 != 0 || j11 <= 0) {
                    long j12 = abstractC0919C.f22690D;
                    if (j10 == j12 && j11 < j12) {
                        j10 = 1 + j12;
                    }
                } else {
                    j10 = -1;
                }
                if (j10 != j11) {
                    abstractC0919C.K(j10, j11);
                    this.f22724a = j10;
                }
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            N n10 = this.f22728e;
            int i = (n10.f22774c + 1) % 20;
            n10.f22774c = i;
            n10.f22772a[i] = currentAnimationTimeMillis;
            n10.f22773b[i] = j10;
        }

        @Override // k1.I
        public final void g() {
            n();
            this.f22727d.e(this.f22730g.f22690D + 1);
        }

        @Override // H0.b.r
        public final void k(float f10) {
            AbstractC0919C abstractC0919C = this.f22730g;
            long max = Math.max(-1L, Math.min(abstractC0919C.f22690D + 1, Math.round(f10)));
            abstractC0919C.K(max, this.f22724a);
            this.f22724a = max;
        }

        @Override // k1.I
        public final long l() {
            return this.f22730g.f22690D;
        }

        @Override // k1.I
        public final void m(RunnableC0528b runnableC0528b) {
            this.f22729f = runnableC0528b;
            n();
            this.f22727d.e(0.0f);
        }

        public final void n() {
            float sqrt;
            int i;
            if (this.f22727d != null) {
                return;
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float f10 = this.f22724a;
            N n10 = this.f22728e;
            int i9 = (n10.f22774c + 1) % 20;
            n10.f22774c = i9;
            n10.f22772a[i9] = currentAnimationTimeMillis;
            n10.f22773b[i9] = f10;
            H0.d dVar = new H0.d();
            float f11 = 0.0f;
            dVar.f1404a = 0.0f;
            H0.e eVar = new H0.e(dVar);
            eVar.f1405s = null;
            eVar.f1406t = Float.MAX_VALUE;
            int i10 = 0;
            eVar.f1407u = false;
            this.f22727d = eVar;
            H0.f fVar = new H0.f();
            fVar.a(1.0f);
            fVar.b(200.0f);
            H0.e eVar2 = this.f22727d;
            eVar2.f1405s = fVar;
            eVar2.f1391b = this.f22724a;
            eVar2.f1392c = true;
            if (eVar2.f1395f) {
                throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
            }
            ArrayList<b.r> arrayList = eVar2.f1400l;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            H0.e eVar3 = this.f22727d;
            int i11 = n10.f22774c;
            long[] jArr = n10.f22772a;
            long j10 = Long.MIN_VALUE;
            if (i11 != 0 || jArr[i11] != Long.MIN_VALUE) {
                long j11 = jArr[i11];
                long j12 = j11;
                while (true) {
                    long j13 = jArr[i11];
                    if (j13 != j10) {
                        float f12 = j11 - j13;
                        float abs = Math.abs(j13 - j12);
                        if (f12 > 100.0f || abs > 40.0f) {
                            break;
                        }
                        if (i11 == 0) {
                            i11 = 20;
                        }
                        i11--;
                        i10++;
                        if (i10 >= 20) {
                            break;
                        }
                        j12 = j13;
                        j10 = Long.MIN_VALUE;
                    } else {
                        break;
                    }
                }
                if (i10 >= 2) {
                    float[] fArr = n10.f22773b;
                    if (i10 == 2) {
                        int i12 = n10.f22774c;
                        int i13 = i12 == 0 ? 19 : i12 - 1;
                        float f13 = jArr[i12] - jArr[i13];
                        if (f13 != 0.0f) {
                            sqrt = (fArr[i12] - fArr[i13]) / f13;
                        }
                    } else {
                        int i14 = n10.f22774c;
                        int i15 = ((i14 - i10) + 21) % 20;
                        int i16 = (i14 + 21) % 20;
                        long j14 = jArr[i15];
                        float f14 = fArr[i15];
                        int i17 = i15 + 1;
                        int i18 = i17 % 20;
                        float f15 = 0.0f;
                        while (i18 != i16) {
                            long j15 = jArr[i18];
                            long[] jArr2 = jArr;
                            float f16 = j15 - j14;
                            if (f16 == f11) {
                                i = i16;
                            } else {
                                float f17 = fArr[i18];
                                i = i16;
                                float f18 = (f17 - f14) / f16;
                                float abs2 = (Math.abs(f18) * (f18 - ((float) (Math.sqrt(2.0f * Math.abs(f15)) * Math.signum(f15))))) + f15;
                                if (i18 == i17) {
                                    abs2 *= 0.5f;
                                }
                                f15 = abs2;
                                f14 = f17;
                                j14 = j15;
                            }
                            i18 = (i18 + 1) % 20;
                            jArr = jArr2;
                            i16 = i;
                            f11 = 0.0f;
                        }
                        sqrt = (float) (Math.sqrt(Math.abs(f15) * 2.0f) * Math.signum(f15));
                    }
                    f11 = sqrt * 1000.0f;
                }
            }
            eVar3.f1390a = f11;
            H0.e eVar4 = this.f22727d;
            eVar4.f1396g = this.f22730g.f22690D + 1;
            eVar4.f1397h = -1.0f;
            eVar4.f1398j = 4.0f;
            com.sumsub.sns.core.widget.f fVar2 = new com.sumsub.sns.core.widget.f(this, 3);
            ArrayList<b.q> arrayList2 = eVar4.f1399k;
            if (arrayList2.contains(fVar2)) {
                return;
            }
            arrayList2.add(fVar2);
        }
    }

    /* compiled from: Transition.java */
    /* renamed from: k1.C$g */
    public interface g {
        void a(AbstractC0919C abstractC0919C);

        default void b(AbstractC0919C abstractC0919C) {
            i(abstractC0919C);
        }

        void c();

        void e(AbstractC0919C abstractC0919C);

        default void h(AbstractC0919C abstractC0919C) {
            e(abstractC0919C);
        }

        void i(AbstractC0919C abstractC0919C);

        void j();
    }

    /* compiled from: Transition.java */
    /* renamed from: k1.C$h */
    public interface h {

        /* renamed from: c, reason: collision with root package name */
        public static final com.google.android.gms.measurement.internal.a f22731c = new com.google.android.gms.measurement.internal.a(19);

        /* renamed from: d, reason: collision with root package name */
        public static final com.google.android.gms.measurement.internal.a f22732d = new com.google.android.gms.measurement.internal.a(20);

        /* renamed from: e, reason: collision with root package name */
        public static final com.google.android.gms.measurement.internal.a f22733e = new com.google.android.gms.measurement.internal.a(21);

        /* renamed from: f, reason: collision with root package name */
        public static final com.google.android.gms.measurement.internal.a f22734f = new com.google.android.gms.measurement.internal.a(22);

        /* renamed from: g, reason: collision with root package name */
        public static final com.google.android.gms.measurement.internal.a f22735g = new com.google.android.gms.measurement.internal.a(23);

        void c(g gVar, AbstractC0919C abstractC0919C, boolean z10);
    }

    public AbstractC0919C() {
        this.f22693a = getClass().getName();
        this.f22694b = -1L;
        this.f22695c = -1L;
        this.f22696d = null;
        this.f22697e = new ArrayList<>();
        this.f22698f = new ArrayList<>();
        this.f22699g = null;
        this.f22700h = null;
        this.i = null;
        this.f22701j = null;
        this.f22702k = null;
        this.f22703l = new z1.g();
        this.f22704m = new z1.g();
        this.f22705n = null;
        this.f22706o = f22684H;
        this.f22710s = new ArrayList<>();
        this.f22711t = f22683G;
        this.f22712u = 0;
        this.f22713v = false;
        this.f22714w = false;
        this.f22715x = null;
        this.f22716y = null;
        this.f22717z = new ArrayList<>();
        this.f22689C = f22685I;
    }

    public static void f(z1.g gVar, View view, L l10) {
        ((androidx.collection.a) gVar.f31252a).put(view, l10);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) gVar.f31253b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
        String f10 = C1596C.d.f(view);
        if (f10 != null) {
            androidx.collection.a aVar = (androidx.collection.a) gVar.f31255d;
            if (aVar.containsKey(f10)) {
                aVar.put(f10, null);
            } else {
                aVar.put(f10, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                androidx.collection.d dVar = (androidx.collection.d) gVar.f31254c;
                if (dVar.indexOfKey(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    dVar.put(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) dVar.get(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    dVar.put(itemIdAtPosition, null);
                }
            }
        }
    }

    public static androidx.collection.a<Animator, b> v() {
        ThreadLocal<androidx.collection.a<Animator, b>> threadLocal = f22686J;
        androidx.collection.a<Animator, b> aVar = threadLocal.get();
        if (aVar != null) {
            return aVar;
        }
        androidx.collection.a<Animator, b> aVar2 = new androidx.collection.a<>();
        threadLocal.set(aVar2);
        return aVar2;
    }

    public boolean A() {
        return this instanceof C0923d;
    }

    public boolean B(L l10, L l11) {
        int i;
        if (l10 == null || l11 == null) {
            return false;
        }
        String[] w2 = w();
        HashMap hashMap = l10.f22761a;
        HashMap hashMap2 = l11.f22761a;
        if (w2 == null) {
            for (String str : hashMap.keySet()) {
                Object obj = hashMap.get(str);
                Object obj2 = hashMap2.get(str);
                if (obj != null || obj2 != null) {
                    if (obj != null && obj2 != null && !(!obj.equals(obj2))) {
                    }
                }
            }
            return false;
        }
        for (String str2 : w2) {
            Object obj3 = hashMap.get(str2);
            Object obj4 = hashMap2.get(str2);
            i = ((obj3 == null && obj4 == null) || !(obj3 == null || obj4 == null || (!obj3.equals(obj4)))) ? i + 1 : 0;
        }
        return false;
        return true;
    }

    public final boolean C(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.i;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<Class<?>> arrayList4 = this.f22701j;
        if (arrayList4 != null) {
            int size = arrayList4.size();
            for (int i = 0; i < size; i++) {
                if (this.f22701j.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f22702k != null) {
            WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
            if (C1596C.d.f(view) != null && this.f22702k.contains(C1596C.d.f(view))) {
                return false;
            }
        }
        ArrayList<Integer> arrayList5 = this.f22697e;
        int size2 = arrayList5.size();
        ArrayList<View> arrayList6 = this.f22698f;
        if ((size2 == 0 && arrayList6.size() == 0 && (((arrayList = this.f22700h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f22699g) == null || arrayList2.isEmpty()))) || arrayList5.contains(Integer.valueOf(id)) || arrayList6.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList7 = this.f22699g;
        if (arrayList7 != null) {
            WeakHashMap<View, y0.E> weakHashMap2 = C1596C.f30963a;
            if (arrayList7.contains(C1596C.d.f(view))) {
                return true;
            }
        }
        if (this.f22700h != null) {
            for (int i9 = 0; i9 < this.f22700h.size(); i9++) {
                if (this.f22700h.get(i9).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void D(AbstractC0919C abstractC0919C, h hVar, boolean z10) {
        AbstractC0919C abstractC0919C2 = this.f22715x;
        if (abstractC0919C2 != null) {
            abstractC0919C2.D(abstractC0919C, hVar, z10);
        }
        ArrayList<g> arrayList = this.f22716y;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f22716y.size();
        g[] gVarArr = this.f22709r;
        if (gVarArr == null) {
            gVarArr = new g[size];
        }
        this.f22709r = null;
        g[] gVarArr2 = (g[]) this.f22716y.toArray(gVarArr);
        for (int i = 0; i < size; i++) {
            hVar.c(gVarArr2[i], abstractC0919C, z10);
            gVarArr2[i] = null;
        }
        this.f22709r = gVarArr2;
    }

    public void E(View view) {
        if (this.f22714w) {
            return;
        }
        ArrayList<Animator> arrayList = this.f22710s;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f22711t);
        this.f22711t = f22683G;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f22711t = animatorArr;
        D(this, h.f22734f, false);
        this.f22713v = true;
    }

    public void F() {
        androidx.collection.a<Animator, b> v10 = v();
        this.f22690D = 0L;
        for (int i = 0; i < this.f22717z.size(); i++) {
            Animator animator = this.f22717z.get(i);
            b bVar = v10.get(animator);
            if (animator != null && bVar != null) {
                long j10 = this.f22695c;
                Animator animator2 = bVar.f22723f;
                if (j10 >= 0) {
                    animator2.setDuration(j10);
                }
                long j11 = this.f22694b;
                if (j11 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j11);
                }
                TimeInterpolator timeInterpolator = this.f22696d;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.f22710s.add(animator);
                this.f22690D = Math.max(this.f22690D, e.a(animator));
            }
        }
        this.f22717z.clear();
    }

    public AbstractC0919C G(g gVar) {
        AbstractC0919C abstractC0919C;
        ArrayList<g> arrayList = this.f22716y;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(gVar) && (abstractC0919C = this.f22715x) != null) {
            abstractC0919C.G(gVar);
        }
        if (this.f22716y.size() == 0) {
            this.f22716y = null;
        }
        return this;
    }

    public void H(View view) {
        this.f22698f.remove(view);
    }

    public void I(ViewGroup viewGroup) {
        if (this.f22713v) {
            if (!this.f22714w) {
                ArrayList<Animator> arrayList = this.f22710s;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f22711t);
                this.f22711t = f22683G;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f22711t = animatorArr;
                D(this, h.f22735g, false);
            }
            this.f22713v = false;
        }
    }

    public void J() {
        R();
        androidx.collection.a<Animator, b> v10 = v();
        Iterator<Animator> it = this.f22717z.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (v10.containsKey(next)) {
                R();
                if (next != null) {
                    next.addListener(new D(this, v10));
                    long j10 = this.f22695c;
                    if (j10 >= 0) {
                        next.setDuration(j10);
                    }
                    long j11 = this.f22694b;
                    if (j11 >= 0) {
                        next.setStartDelay(next.getStartDelay() + j11);
                    }
                    TimeInterpolator timeInterpolator = this.f22696d;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new E(this));
                    next.start();
                }
            }
        }
        this.f22717z.clear();
        p();
    }

    public void K(long j10, long j11) {
        long j12 = this.f22690D;
        boolean z10 = j10 < j11;
        if ((j11 < 0 && j10 >= 0) || (j11 > j12 && j10 <= j12)) {
            this.f22714w = false;
            D(this, h.f22731c, z10);
        }
        ArrayList<Animator> arrayList = this.f22710s;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f22711t);
        this.f22711t = f22683G;
        for (int i = 0; i < size; i++) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            e.b(animator, Math.min(Math.max(0L, j10), e.a(animator)));
        }
        this.f22711t = animatorArr;
        if ((j10 <= j12 || j11 > j12) && (j10 >= 0 || j11 < 0)) {
            return;
        }
        if (j10 > j12) {
            this.f22714w = true;
        }
        D(this, h.f22732d, z10);
    }

    public void L(long j10) {
        this.f22695c = j10;
    }

    public void M(d dVar) {
        this.f22688B = dVar;
    }

    public void N(TimeInterpolator timeInterpolator) {
        this.f22696d = timeInterpolator;
    }

    public void O(AbstractC0940v abstractC0940v) {
        if (abstractC0940v == null) {
            this.f22689C = f22685I;
        } else {
            this.f22689C = abstractC0940v;
        }
    }

    public void P(X x9) {
        this.f22687A = x9;
    }

    public void Q(long j10) {
        this.f22694b = j10;
    }

    public final void R() {
        if (this.f22712u == 0) {
            D(this, h.f22731c, false);
            this.f22714w = false;
        }
        this.f22712u++;
    }

    public String S(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(": ");
        if (this.f22695c != -1) {
            sb2.append("dur(");
            sb2.append(this.f22695c);
            sb2.append(") ");
        }
        if (this.f22694b != -1) {
            sb2.append("dly(");
            sb2.append(this.f22694b);
            sb2.append(") ");
        }
        if (this.f22696d != null) {
            sb2.append("interp(");
            sb2.append(this.f22696d);
            sb2.append(") ");
        }
        ArrayList<Integer> arrayList = this.f22697e;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f22698f;
        if (size > 0 || arrayList2.size() > 0) {
            sb2.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                    if (i9 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(arrayList2.get(i9));
                }
            }
            sb2.append(")");
        }
        return sb2.toString();
    }

    public void a(g gVar) {
        if (this.f22716y == null) {
            this.f22716y = new ArrayList<>();
        }
        this.f22716y.add(gVar);
    }

    public void b(int i) {
        if (i != 0) {
            this.f22697e.add(Integer.valueOf(i));
        }
    }

    public void c(View view) {
        this.f22698f.add(view);
    }

    public void cancel() {
        ArrayList<Animator> arrayList = this.f22710s;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f22711t);
        this.f22711t = f22683G;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f22711t = animatorArr;
        D(this, h.f22733e, false);
    }

    public void d(Class cls) {
        if (this.f22700h == null) {
            this.f22700h = new ArrayList<>();
        }
        this.f22700h.add(cls);
    }

    public void e(String str) {
        if (this.f22699g == null) {
            this.f22699g = new ArrayList<>();
        }
        this.f22699g.add(str);
    }

    public abstract void g(L l10);

    public final void h(View view, boolean z10) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.i;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList<Class<?>> arrayList2 = this.f22701j;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    if (this.f22701j.get(i).isInstance(view)) {
                        return;
                    }
                }
            }
            if (view.getParent() instanceof ViewGroup) {
                L l10 = new L(view);
                if (z10) {
                    j(l10);
                } else {
                    g(l10);
                }
                l10.f22763c.add(this);
                i(l10);
                if (z10) {
                    f(this.f22703l, view, l10);
                } else {
                    f(this.f22704m, view, l10);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                    h(viewGroup.getChildAt(i9), z10);
                }
            }
        }
    }

    public void i(L l10) {
        if (this.f22687A != null) {
            HashMap hashMap = l10.f22761a;
            if (hashMap.isEmpty()) {
                return;
            }
            this.f22687A.getClass();
            String[] strArr = X.f22808a;
            for (int i = 0; i < 2; i++) {
                if (!hashMap.containsKey(strArr[i])) {
                    this.f22687A.getClass();
                    Integer num = (Integer) hashMap.get("android:visibility:visibility");
                    View view = l10.f22762b;
                    if (num == null) {
                        num = Integer.valueOf(view.getVisibility());
                    }
                    hashMap.put("android:visibilityPropagation:visibility", num);
                    int[] iArr = {r5, 0};
                    view.getLocationOnScreen(iArr);
                    int round = Math.round(view.getTranslationX()) + iArr[0];
                    iArr[0] = (view.getWidth() / 2) + round;
                    int round2 = Math.round(view.getTranslationY()) + iArr[1];
                    iArr[1] = round2;
                    iArr[1] = (view.getHeight() / 2) + round2;
                    hashMap.put("android:visibilityPropagation:center", iArr);
                    return;
                }
            }
        }
    }

    public abstract void j(L l10);

    public final void k(ViewGroup viewGroup, boolean z10) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        l(z10);
        ArrayList<Integer> arrayList3 = this.f22697e;
        int size = arrayList3.size();
        ArrayList<View> arrayList4 = this.f22698f;
        if ((size <= 0 && arrayList4.size() <= 0) || (((arrayList = this.f22699g) != null && !arrayList.isEmpty()) || ((arrayList2 = this.f22700h) != null && !arrayList2.isEmpty()))) {
            h(viewGroup, z10);
            return;
        }
        for (int i = 0; i < arrayList3.size(); i++) {
            View findViewById = viewGroup.findViewById(arrayList3.get(i).intValue());
            if (findViewById != null) {
                L l10 = new L(findViewById);
                if (z10) {
                    j(l10);
                } else {
                    g(l10);
                }
                l10.f22763c.add(this);
                i(l10);
                if (z10) {
                    f(this.f22703l, findViewById, l10);
                } else {
                    f(this.f22704m, findViewById, l10);
                }
            }
        }
        for (int i9 = 0; i9 < arrayList4.size(); i9++) {
            View view = arrayList4.get(i9);
            L l11 = new L(view);
            if (z10) {
                j(l11);
            } else {
                g(l11);
            }
            l11.f22763c.add(this);
            i(l11);
            if (z10) {
                f(this.f22703l, view, l11);
            } else {
                f(this.f22704m, view, l11);
            }
        }
    }

    public final void l(boolean z10) {
        if (z10) {
            ((androidx.collection.a) this.f22703l.f31252a).clear();
            ((SparseArray) this.f22703l.f31253b).clear();
            ((androidx.collection.d) this.f22703l.f31254c).clear();
        } else {
            ((androidx.collection.a) this.f22704m.f31252a).clear();
            ((SparseArray) this.f22704m.f31253b).clear();
            ((androidx.collection.d) this.f22704m.f31254c).clear();
        }
    }

    @Override // 
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public AbstractC0919C clone() {
        try {
            AbstractC0919C abstractC0919C = (AbstractC0919C) super.clone();
            abstractC0919C.f22717z = new ArrayList<>();
            abstractC0919C.f22703l = new z1.g();
            abstractC0919C.f22704m = new z1.g();
            abstractC0919C.f22707p = null;
            abstractC0919C.f22708q = null;
            abstractC0919C.f22691E = null;
            abstractC0919C.f22715x = this;
            abstractC0919C.f22716y = null;
            return abstractC0919C;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public Animator n(ViewGroup viewGroup, L l10, L l11) {
        return null;
    }

    public void o(ViewGroup viewGroup, z1.g gVar, z1.g gVar2, ArrayList<L> arrayList, ArrayList<L> arrayList2) {
        Animator n10;
        int i;
        boolean z10;
        int i9;
        View view;
        L l10;
        Animator animator;
        L l11;
        androidx.collection.a<Animator, b> v10 = v();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z11 = u().f22691E != null;
        long j10 = Long.MAX_VALUE;
        int i10 = 0;
        while (i10 < size) {
            L l12 = arrayList.get(i10);
            L l13 = arrayList2.get(i10);
            if (l12 != null && !l12.f22763c.contains(this)) {
                l12 = null;
            }
            if (l13 != null && !l13.f22763c.contains(this)) {
                l13 = null;
            }
            if (!(l12 == null && l13 == null) && ((l12 == null || l13 == null || B(l12, l13)) && (n10 = n(viewGroup, l12, l13)) != null)) {
                String str = this.f22693a;
                if (l13 != null) {
                    String[] w2 = w();
                    i = size;
                    view = l13.f22762b;
                    if (w2 != null && w2.length > 0) {
                        l11 = new L(view);
                        L l14 = (L) ((androidx.collection.a) gVar2.f31252a).get(view);
                        if (l14 != null) {
                            i9 = i10;
                            int i11 = 0;
                            while (i11 < w2.length) {
                                HashMap hashMap = l11.f22761a;
                                boolean z12 = z11;
                                String str2 = w2[i11];
                                hashMap.put(str2, l14.f22761a.get(str2));
                                i11++;
                                z11 = z12;
                                w2 = w2;
                            }
                            z10 = z11;
                        } else {
                            z10 = z11;
                            i9 = i10;
                        }
                        int size2 = v10.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= size2) {
                                animator = n10;
                                break;
                            }
                            b bVar = v10.get(v10.keyAt(i12));
                            if (bVar.f22720c != null && bVar.f22718a == view && bVar.f22719b.equals(str) && bVar.f22720c.equals(l11)) {
                                animator = null;
                                break;
                            }
                            i12++;
                        }
                    } else {
                        z10 = z11;
                        i9 = i10;
                        animator = n10;
                        l11 = null;
                    }
                    n10 = animator;
                    l10 = l11;
                } else {
                    i = size;
                    z10 = z11;
                    i9 = i10;
                    view = l12.f22762b;
                    l10 = null;
                }
                if (n10 != null) {
                    X x9 = this.f22687A;
                    if (x9 != null) {
                        long a10 = x9.a(viewGroup, this, l12, l13);
                        sparseIntArray.put(this.f22717z.size(), (int) a10);
                        j10 = Math.min(a10, j10);
                    }
                    WindowId windowId = viewGroup.getWindowId();
                    b bVar2 = new b();
                    bVar2.f22718a = view;
                    bVar2.f22719b = str;
                    bVar2.f22720c = l10;
                    bVar2.f22721d = windowId;
                    bVar2.f22722e = this;
                    bVar2.f22723f = n10;
                    if (z10) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.play(n10);
                        n10 = animatorSet;
                    }
                    v10.put(n10, bVar2);
                    this.f22717z.add(n10);
                }
            } else {
                i = size;
                z10 = z11;
                i9 = i10;
            }
            i10 = i9 + 1;
            size = i;
            z11 = z10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i13 = 0; i13 < sparseIntArray.size(); i13++) {
                b bVar3 = v10.get(this.f22717z.get(sparseIntArray.keyAt(i13)));
                bVar3.f22723f.setStartDelay(bVar3.f22723f.getStartDelay() + (sparseIntArray.valueAt(i13) - j10));
            }
        }
    }

    public final void p() {
        int i = this.f22712u - 1;
        this.f22712u = i;
        if (i == 0) {
            D(this, h.f22732d, false);
            for (int i9 = 0; i9 < ((androidx.collection.d) this.f22703l.f31254c).size(); i9++) {
                View view = (View) ((androidx.collection.d) this.f22703l.f31254c).valueAt(i9);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i10 = 0; i10 < ((androidx.collection.d) this.f22704m.f31254c).size(); i10++) {
                View view2 = (View) ((androidx.collection.d) this.f22704m.f31254c).valueAt(i10);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f22714w = true;
        }
    }

    public void q(int i) {
        ArrayList<Integer> arrayList = this.i;
        if (i > 0) {
            arrayList = c.a(Integer.valueOf(i), arrayList);
        }
        this.i = arrayList;
    }

    public void r(Class cls) {
        this.f22701j = c.a(cls, this.f22701j);
    }

    public void s(String str) {
        this.f22702k = c.a(str, this.f22702k);
    }

    public final L t(View view, boolean z10) {
        J j10 = this.f22705n;
        if (j10 != null) {
            return j10.t(view, z10);
        }
        ArrayList<L> arrayList = z10 ? this.f22707p : this.f22708q;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            L l10 = arrayList.get(i);
            if (l10 == null) {
                return null;
            }
            if (l10.f22762b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (z10 ? this.f22708q : this.f22707p).get(i);
        }
        return null;
    }

    public final String toString() {
        return S("");
    }

    public final AbstractC0919C u() {
        J j10 = this.f22705n;
        return j10 != null ? j10.u() : this;
    }

    public String[] w() {
        return null;
    }

    public final L x(View view, boolean z10) {
        J j10 = this.f22705n;
        if (j10 != null) {
            return j10.x(view, z10);
        }
        return (L) ((androidx.collection.a) (z10 ? this.f22703l : this.f22704m).f31252a).get(view);
    }

    public boolean z() {
        return !this.f22710s.isEmpty();
    }

    public AbstractC0919C(Context context, AttributeSet attributeSet) {
        this.f22693a = getClass().getName();
        this.f22694b = -1L;
        this.f22695c = -1L;
        this.f22696d = null;
        this.f22697e = new ArrayList<>();
        this.f22698f = new ArrayList<>();
        this.f22699g = null;
        this.f22700h = null;
        this.i = null;
        this.f22701j = null;
        this.f22702k = null;
        this.f22703l = new z1.g();
        this.f22704m = new z1.g();
        this.f22705n = null;
        int[] iArr = f22684H;
        this.f22706o = iArr;
        this.f22710s = new ArrayList<>();
        this.f22711t = f22683G;
        this.f22712u = 0;
        this.f22713v = false;
        this.f22714w = false;
        this.f22715x = null;
        this.f22716y = null;
        this.f22717z = new ArrayList<>();
        this.f22689C = f22685I;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0918B.f22675b);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long b9 = m0.i.b(obtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (b9 >= 0) {
            L(b9);
        }
        long j10 = m0.i.d(xmlResourceParser, "startDelay") ? obtainStyledAttributes.getInt(2, -1) : -1;
        if (j10 > 0) {
            Q(j10);
        }
        int resourceId = !m0.i.d(xmlResourceParser, "interpolator") ? 0 : obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId > 0) {
            N(AnimationUtils.loadInterpolator(context, resourceId));
        }
        String c2 = m0.i.c(obtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (c2 != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(c2, ",");
            int[] iArr2 = new int[stringTokenizer.countTokens()];
            int i = 0;
            while (stringTokenizer.hasMoreTokens()) {
                String trim = stringTokenizer.nextToken().trim();
                if ("id".equalsIgnoreCase(trim)) {
                    iArr2[i] = 3;
                } else if ("instance".equalsIgnoreCase(trim)) {
                    iArr2[i] = 1;
                } else if (AppMeasurementSdk.ConditionalUserProperty.NAME.equalsIgnoreCase(trim)) {
                    iArr2[i] = 2;
                } else if ("itemId".equalsIgnoreCase(trim)) {
                    iArr2[i] = 4;
                } else if (trim.isEmpty()) {
                    int[] iArr3 = new int[iArr2.length - 1];
                    System.arraycopy(iArr2, 0, iArr3, 0, i);
                    i--;
                    iArr2 = iArr3;
                } else {
                    throw new InflateException(androidx.camera.core.n.a("Unknown match type in matchOrder: '", trim, "'"));
                }
                i++;
            }
            if (iArr2.length == 0) {
                this.f22706o = iArr;
            } else {
                for (int i9 = 0; i9 < iArr2.length; i9++) {
                    int i10 = iArr2[i9];
                    if (i10 < 1 || i10 > 4) {
                        throw new IllegalArgumentException("matches contains invalid value");
                    }
                    for (int i11 = 0; i11 < i9; i11++) {
                        if (iArr2[i11] == i10) {
                            throw new IllegalArgumentException("matches contains a duplicate value");
                        }
                    }
                }
                this.f22706o = (int[]) iArr2.clone();
            }
        }
        obtainStyledAttributes.recycle();
    }
}

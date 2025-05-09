package k1;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.RunnableC0528b;
import com.luminary.mobile.R;
import java.util.ArrayList;
import k1.AbstractC0919C;
import k1.H;

/* compiled from: FragmentTransitionSupport.java */
/* renamed from: k1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0932m extends androidx.fragment.app.C {

    /* compiled from: FragmentTransitionSupport.java */
    /* renamed from: k1.m$b */
    public class b extends AbstractC0919C.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Rect f22897a;

        public b(Rect rect) {
            this.f22897a = rect;
        }

        @Override // k1.AbstractC0919C.d
        public final Rect a() {
            Rect rect = this.f22897a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return rect;
        }
    }

    @Override // androidx.fragment.app.C
    public final void a(View view, Object obj) {
        ((AbstractC0919C) obj).c(view);
    }

    @Override // androidx.fragment.app.C
    public final void b(Object obj, ArrayList<View> arrayList) {
        AbstractC0919C abstractC0919C = (AbstractC0919C) obj;
        if (abstractC0919C == null) {
            return;
        }
        int i = 0;
        if (abstractC0919C instanceof J) {
            J j10 = (J) abstractC0919C;
            int size = j10.f22749K.size();
            while (i < size) {
                b(j10.U(i), arrayList);
                i++;
            }
            return;
        }
        if (androidx.fragment.app.C.k(abstractC0919C.f22697e) && androidx.fragment.app.C.k(abstractC0919C.f22699g) && androidx.fragment.app.C.k(abstractC0919C.f22700h) && androidx.fragment.app.C.k(abstractC0919C.f22698f)) {
            int size2 = arrayList.size();
            while (i < size2) {
                abstractC0919C.c(arrayList.get(i));
                i++;
            }
        }
    }

    @Override // androidx.fragment.app.C
    public final void c(Object obj) {
        ((I) obj).g();
    }

    @Override // androidx.fragment.app.C
    public final void d(Object obj, RunnableC0528b runnableC0528b) {
        ((I) obj).m(runnableC0528b);
    }

    @Override // androidx.fragment.app.C
    public final void e(ViewGroup viewGroup, Object obj) {
        H.a(viewGroup, (AbstractC0919C) obj);
    }

    @Override // androidx.fragment.app.C
    public final boolean g(Object obj) {
        return obj instanceof AbstractC0919C;
    }

    @Override // androidx.fragment.app.C
    public final Object h(Object obj) {
        if (obj != null) {
            return ((AbstractC0919C) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.C
    public final Object i(ViewGroup viewGroup, Object obj) {
        AbstractC0919C abstractC0919C = (AbstractC0919C) obj;
        ArrayList<ViewGroup> arrayList = H.f22744c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!abstractC0919C.A()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        arrayList.add(viewGroup);
        AbstractC0919C clone = abstractC0919C.clone();
        J j10 = new J();
        j10.T(clone);
        H.c(viewGroup, j10);
        viewGroup.setTag(R.id.transition_current_scene, null);
        H.a aVar = new H.a();
        aVar.f22745a = j10;
        aVar.f22746b = viewGroup;
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        viewGroup.invalidate();
        AbstractC0919C.f fVar = new AbstractC0919C.f(j10);
        j10.f22691E = fVar;
        j10.a(fVar);
        return j10.f22691E;
    }

    @Override // androidx.fragment.app.C
    public final boolean l() {
        return true;
    }

    @Override // androidx.fragment.app.C
    public final boolean m(Object obj) {
        boolean A10 = ((AbstractC0919C) obj).A();
        if (!A10) {
            Log.v("FragmentManager", "Predictive back not available for AndroidX Transition " + obj + ". Please enable seeking support for the designated transition by overriding isSeekingSupported().");
        }
        return A10;
    }

    @Override // androidx.fragment.app.C
    public final Object n(Object obj, Object obj2, Object obj3) {
        AbstractC0919C abstractC0919C = (AbstractC0919C) obj;
        AbstractC0919C abstractC0919C2 = (AbstractC0919C) obj2;
        AbstractC0919C abstractC0919C3 = (AbstractC0919C) obj3;
        if (abstractC0919C != null && abstractC0919C2 != null) {
            J j10 = new J();
            j10.T(abstractC0919C);
            j10.T(abstractC0919C2);
            j10.X(1);
            abstractC0919C = j10;
        } else if (abstractC0919C == null) {
            abstractC0919C = abstractC0919C2 != null ? abstractC0919C2 : null;
        }
        if (abstractC0919C3 == null) {
            return abstractC0919C;
        }
        J j11 = new J();
        if (abstractC0919C != null) {
            j11.T(abstractC0919C);
        }
        j11.T(abstractC0919C3);
        return j11;
    }

    @Override // androidx.fragment.app.C
    public final Object o(Object obj, Object obj2) {
        J j10 = new J();
        if (obj != null) {
            j10.T((AbstractC0919C) obj);
        }
        j10.T((AbstractC0919C) obj2);
        return j10;
    }

    @Override // androidx.fragment.app.C
    public final void p(Object obj, View view, ArrayList<View> arrayList) {
        ((AbstractC0919C) obj).a(new a(view, arrayList));
    }

    @Override // androidx.fragment.app.C
    public final void q(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((AbstractC0919C) obj).a(new C0933n(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.C
    public final void r(Object obj, float f10) {
        I i = (I) obj;
        if (i.d()) {
            long l10 = (long) (f10 * i.l());
            if (l10 == 0) {
                l10 = 1;
            }
            if (l10 == i.l()) {
                l10 = i.l() - 1;
            }
            i.f(l10);
        }
    }

    @Override // androidx.fragment.app.C
    public final void s(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            androidx.fragment.app.C.j(view, rect);
            ((AbstractC0919C) obj).M(new C0931l(rect));
        }
    }

    @Override // androidx.fragment.app.C
    public final void t(Object obj, Rect rect) {
        ((AbstractC0919C) obj).M(new b(rect));
    }

    @Override // androidx.fragment.app.C
    public final void u(Fragment fragment, Object obj, t0.d dVar, Runnable runnable) {
        v(obj, dVar, null, runnable);
    }

    @Override // androidx.fragment.app.C
    public final void v(Object obj, t0.d dVar, B2.d dVar2, Runnable runnable) {
        AbstractC0919C abstractC0919C = (AbstractC0919C) obj;
        M.b bVar = new M.b(dVar2, abstractC0919C, runnable, 5);
        synchronized (dVar) {
            while (dVar.f27398d) {
                try {
                    try {
                        dVar.wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (dVar.f27396b != bVar) {
                dVar.f27396b = bVar;
                if (dVar.f27395a) {
                    Runnable runnable2 = (Runnable) bVar.f2503b;
                    if (runnable2 == null) {
                        ((AbstractC0919C) bVar.i).cancel();
                        ((Runnable) bVar.f2504j).run();
                    } else {
                        runnable2.run();
                    }
                }
            }
        }
        abstractC0919C.a(new C0934o(runnable));
    }

    @Override // androidx.fragment.app.C
    public final void w(Object obj, View view, ArrayList<View> arrayList) {
        J j10 = (J) obj;
        ArrayList<View> arrayList2 = j10.f22698f;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            androidx.fragment.app.C.f(arrayList2, arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(j10, arrayList);
    }

    @Override // androidx.fragment.app.C
    public final void x(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        J j10 = (J) obj;
        if (j10 != null) {
            ArrayList<View> arrayList3 = j10.f22698f;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            z(j10, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.C
    public final Object y(Object obj) {
        if (obj == null) {
            return null;
        }
        J j10 = new J();
        j10.T((AbstractC0919C) obj);
        return j10;
    }

    public final void z(Object obj, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList2) {
        AbstractC0919C abstractC0919C = (AbstractC0919C) obj;
        int i = 0;
        if (abstractC0919C instanceof J) {
            J j10 = (J) abstractC0919C;
            int size = j10.f22749K.size();
            while (i < size) {
                z(j10.U(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (androidx.fragment.app.C.k(abstractC0919C.f22697e) && androidx.fragment.app.C.k(abstractC0919C.f22699g) && androidx.fragment.app.C.k(abstractC0919C.f22700h)) {
            ArrayList<View> arrayList3 = abstractC0919C.f22698f;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size2) {
                    abstractC0919C.c(arrayList2.get(i));
                    i++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    abstractC0919C.H(arrayList.get(size3));
                }
            }
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    /* renamed from: k1.m$a */
    public class a implements AbstractC0919C.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f22895a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f22896b;

        public a(View view, ArrayList arrayList) {
            this.f22895a = view;
            this.f22896b = arrayList;
        }

        @Override // k1.AbstractC0919C.g
        public final void e(AbstractC0919C abstractC0919C) {
            abstractC0919C.G(this);
            abstractC0919C.a(this);
        }

        @Override // k1.AbstractC0919C.g
        public final void i(AbstractC0919C abstractC0919C) {
            abstractC0919C.G(this);
            this.f22895a.setVisibility(8);
            ArrayList arrayList = this.f22896b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((View) arrayList.get(i)).setVisibility(0);
            }
        }

        @Override // k1.AbstractC0919C.g
        public final void c() {
        }

        @Override // k1.AbstractC0919C.g
        public final void j() {
        }

        @Override // k1.AbstractC0919C.g
        public final void a(AbstractC0919C abstractC0919C) {
        }
    }
}

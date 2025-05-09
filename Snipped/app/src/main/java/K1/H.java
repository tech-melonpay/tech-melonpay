package k1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.luminary.mobile.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TransitionManager.java */
/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public static final C0921b f22742a = new C0921b();

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<WeakReference<androidx.collection.a<ViewGroup, ArrayList<AbstractC0919C>>>> f22743b = new ThreadLocal<>();

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList<ViewGroup> f22744c = new ArrayList<>();

    public static void a(ViewGroup viewGroup, AbstractC0919C abstractC0919C) {
        ArrayList<ViewGroup> arrayList = f22744c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (abstractC0919C == null) {
            abstractC0919C = f22742a;
        }
        AbstractC0919C clone = abstractC0919C.clone();
        c(viewGroup, clone);
        viewGroup.setTag(R.id.transition_current_scene, null);
        a aVar = new a();
        aVar.f22745a = clone;
        aVar.f22746b = viewGroup;
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    public static androidx.collection.a<ViewGroup, ArrayList<AbstractC0919C>> b() {
        androidx.collection.a<ViewGroup, ArrayList<AbstractC0919C>> aVar;
        ThreadLocal<WeakReference<androidx.collection.a<ViewGroup, ArrayList<AbstractC0919C>>>> threadLocal = f22743b;
        WeakReference<androidx.collection.a<ViewGroup, ArrayList<AbstractC0919C>>> weakReference = threadLocal.get();
        if (weakReference != null && (aVar = weakReference.get()) != null) {
            return aVar;
        }
        androidx.collection.a<ViewGroup, ArrayList<AbstractC0919C>> aVar2 = new androidx.collection.a<>();
        threadLocal.set(new WeakReference<>(aVar2));
        return aVar2;
    }

    public static void c(ViewGroup viewGroup, AbstractC0919C abstractC0919C) {
        ArrayList<AbstractC0919C> arrayList = b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<AbstractC0919C> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().E(viewGroup);
            }
        }
        if (abstractC0919C != null) {
            abstractC0919C.k(viewGroup, true);
        }
        if (((y) viewGroup.getTag(R.id.transition_current_scene)) != null) {
            throw null;
        }
    }

    /* compiled from: TransitionManager.java */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public AbstractC0919C f22745a;

        /* renamed from: b, reason: collision with root package name */
        public ViewGroup f22746b;

        /* compiled from: TransitionManager.java */
        /* renamed from: k1.H$a$a, reason: collision with other inner class name */
        public class C0420a extends G {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ androidx.collection.a f22747a;

            public C0420a(androidx.collection.a aVar) {
                this.f22747a = aVar;
            }

            @Override // k1.G, k1.AbstractC0919C.g
            public final void i(AbstractC0919C abstractC0919C) {
                ((ArrayList) this.f22747a.get(a.this.f22746b)).remove(abstractC0919C);
                abstractC0919C.G(this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:117:0x01e7 A[EDGE_INSN: B:117:0x01e7->B:118:0x01e7 BREAK  A[LOOP:1: B:17:0x0087->B:29:0x01de], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x01ee  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x0211  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x023f  */
        /* JADX WARN: Removed duplicated region for block: B:180:0x02da  */
        /* JADX WARN: Removed duplicated region for block: B:182:0x02df  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean onPreDraw() {
            /*
                Method dump skipped, instructions count: 771
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: k1.H.a.onPreDraw():boolean");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewGroup viewGroup = this.f22746b;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            ArrayList<ViewGroup> arrayList = H.f22744c;
            ViewGroup viewGroup2 = this.f22746b;
            arrayList.remove(viewGroup2);
            ArrayList<AbstractC0919C> arrayList2 = H.b().get(viewGroup2);
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator<AbstractC0919C> it = arrayList2.iterator();
                while (it.hasNext()) {
                    it.next().I(viewGroup2);
                }
            }
            this.f22745a.l(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }
}

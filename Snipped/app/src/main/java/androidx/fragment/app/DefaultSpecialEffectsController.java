package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.transition.Transition;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.C0534h;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SpecialEffectsController;
import c.C0611b;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import y0.C1596C;

/* compiled from: DefaultSpecialEffectsController.kt */
/* loaded from: classes.dex */
public final class DefaultSpecialEffectsController extends SpecialEffectsController {

    /* compiled from: DefaultSpecialEffectsController.kt */
    public static final class TransitionEffect extends SpecialEffectsController.a {

        /* renamed from: c, reason: collision with root package name */
        public final List<g> f6629c;

        /* renamed from: d, reason: collision with root package name */
        public final SpecialEffectsController.Operation f6630d;

        /* renamed from: e, reason: collision with root package name */
        public final SpecialEffectsController.Operation f6631e;

        /* renamed from: f, reason: collision with root package name */
        public final C f6632f;

        /* renamed from: g, reason: collision with root package name */
        public final Object f6633g;

        /* renamed from: h, reason: collision with root package name */
        public final ArrayList<View> f6634h;
        public final ArrayList<View> i;

        /* renamed from: j, reason: collision with root package name */
        public final androidx.collection.a<String, String> f6635j;

        /* renamed from: k, reason: collision with root package name */
        public final ArrayList<String> f6636k;

        /* renamed from: l, reason: collision with root package name */
        public final ArrayList<String> f6637l;

        /* renamed from: m, reason: collision with root package name */
        public final androidx.collection.a<String, View> f6638m;

        /* renamed from: n, reason: collision with root package name */
        public final androidx.collection.a<String, View> f6639n;

        /* renamed from: o, reason: collision with root package name */
        public final boolean f6640o;

        /* renamed from: p, reason: collision with root package name */
        public final t0.d f6641p = new t0.d();

        /* renamed from: q, reason: collision with root package name */
        public Object f6642q;

        public TransitionEffect(ArrayList arrayList, SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, C c2, Object obj, ArrayList arrayList2, ArrayList arrayList3, androidx.collection.a aVar, ArrayList arrayList4, ArrayList arrayList5, androidx.collection.a aVar2, androidx.collection.a aVar3, boolean z10) {
            this.f6629c = arrayList;
            this.f6630d = operation;
            this.f6631e = operation2;
            this.f6632f = c2;
            this.f6633g = obj;
            this.f6634h = arrayList2;
            this.i = arrayList3;
            this.f6635j = aVar;
            this.f6636k = arrayList4;
            this.f6637l = arrayList5;
            this.f6638m = aVar2;
            this.f6639n = aVar3;
            this.f6640o = z10;
        }

        public static void f(View view, ArrayList arrayList) {
            if (!(view instanceof ViewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.isTransitionGroup()) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    f(childAt, arrayList);
                }
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.a
        public final boolean a() {
            Object obj;
            C c2 = this.f6632f;
            if (c2.l()) {
                List<g> list = this.f6629c;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (g gVar : list) {
                        if (Build.VERSION.SDK_INT < 34 || (obj = gVar.f6671b) == null || !c2.m(obj)) {
                            break;
                        }
                    }
                }
                Object obj2 = this.f6633g;
                if (obj2 == null || c2.m(obj2)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.a
        public final void b(ViewGroup viewGroup) {
            this.f6641p.a();
        }

        @Override // androidx.fragment.app.SpecialEffectsController.a
        public final void c(final ViewGroup viewGroup) {
            final Object obj;
            boolean isLaidOut = viewGroup.isLaidOut();
            List<g> list = this.f6629c;
            if (!isLaidOut) {
                for (g gVar : list) {
                    SpecialEffectsController.Operation operation = gVar.f6670a;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Completing operation " + operation);
                    }
                    gVar.f6670a.c(this);
                }
                return;
            }
            Object obj2 = this.f6642q;
            C c2 = this.f6632f;
            SpecialEffectsController.Operation operation2 = this.f6631e;
            SpecialEffectsController.Operation operation3 = this.f6630d;
            if (obj2 != null) {
                c2.c(obj2);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Ending execution of operations from " + operation3 + " to " + operation2);
                    return;
                }
                return;
            }
            Pair<ArrayList<View>, Object> g10 = g(viewGroup, operation2, operation3);
            ArrayList<View> arrayList = g10.f23089a;
            List<g> list2 = list;
            ArrayList arrayList2 = new ArrayList(P9.n.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(((g) it.next()).f6670a);
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                boolean hasNext = it2.hasNext();
                obj = g10.f23090b;
                if (!hasNext) {
                    break;
                }
                SpecialEffectsController.Operation operation4 = (SpecialEffectsController.Operation) it2.next();
                c2.u(operation4.f6817c, obj, this.f6641p, new RunnableC0529c(operation4, this, 1));
            }
            i(arrayList, viewGroup, new InterfaceC0635a<O9.p>() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onCommit$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // ca.InterfaceC0635a
                public final O9.p invoke() {
                    this.f6632f.e(viewGroup, obj);
                    return O9.p.f3034a;
                }
            });
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Completed executing operations from " + operation3 + " to " + operation2);
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.a
        public final void d(C0611b c0611b) {
            Object obj = this.f6642q;
            if (obj != null) {
                this.f6632f.r(obj, c0611b.f8490c);
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.a
        public final void e(final ViewGroup viewGroup) {
            Object obj;
            boolean isLaidOut = viewGroup.isLaidOut();
            List<g> list = this.f6629c;
            if (!isLaidOut) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    SpecialEffectsController.Operation operation = ((g) it.next()).f6670a;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Skipping onStart for operation " + operation);
                    }
                }
                return;
            }
            boolean h9 = h();
            SpecialEffectsController.Operation operation2 = this.f6631e;
            SpecialEffectsController.Operation operation3 = this.f6630d;
            if (h9 && (obj = this.f6633g) != null && !a()) {
                Log.i("FragmentManager", "Ignoring shared elements transition " + obj + " between " + operation3 + " and " + operation2 + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
            if (!a() || !h()) {
                return;
            }
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            Pair<ArrayList<View>, Object> g10 = g(viewGroup, operation2, operation3);
            ArrayList<View> arrayList = g10.f23089a;
            List<g> list2 = list;
            ArrayList arrayList2 = new ArrayList(P9.n.u(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((g) it2.next()).f6670a);
            }
            Iterator it3 = arrayList2.iterator();
            while (true) {
                boolean hasNext = it3.hasNext();
                final Object obj2 = g10.f23090b;
                if (!hasNext) {
                    i(arrayList, viewGroup, new InterfaceC0635a<O9.p>() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r1v6, types: [T, androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4$2] */
                        @Override // ca.InterfaceC0635a
                        public final O9.p invoke() {
                            final DefaultSpecialEffectsController.TransitionEffect transitionEffect = DefaultSpecialEffectsController.TransitionEffect.this;
                            C c2 = transitionEffect.f6632f;
                            final ViewGroup viewGroup2 = viewGroup;
                            final Object obj3 = obj2;
                            Object i = c2.i(viewGroup2, obj3);
                            transitionEffect.f6642q = i;
                            if (i == null) {
                                throw new IllegalStateException(("Unable to start transition " + obj3 + " for container " + viewGroup2 + '.').toString());
                            }
                            ref$ObjectRef.f23179a = new InterfaceC0635a<O9.p>() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // ca.InterfaceC0635a
                                public final O9.p invoke() {
                                    DefaultSpecialEffectsController.TransitionEffect transitionEffect2 = transitionEffect;
                                    List<DefaultSpecialEffectsController.g> list3 = transitionEffect2.f6629c;
                                    boolean z10 = list3 instanceof Collection;
                                    C c10 = transitionEffect2.f6632f;
                                    if (!z10 || !list3.isEmpty()) {
                                        Iterator<T> it4 = list3.iterator();
                                        while (it4.hasNext()) {
                                            if (!((DefaultSpecialEffectsController.g) it4.next()).f6670a.f6821g) {
                                                if (Log.isLoggable("FragmentManager", 2)) {
                                                    Log.v("FragmentManager", "Completing animating immediately");
                                                }
                                                t0.d dVar = new t0.d();
                                                c10.u(transitionEffect2.f6629c.get(0).f6670a.f6817c, obj3, dVar, new B2.d(transitionEffect2, 24));
                                                dVar.a();
                                                return O9.p.f3034a;
                                            }
                                        }
                                    }
                                    if (Log.isLoggable("FragmentManager", 2)) {
                                        Log.v("FragmentManager", "Animating to start");
                                    }
                                    c10.d(transitionEffect2.f6642q, new RunnableC0528b(1, transitionEffect2, viewGroup2));
                                    return O9.p.f3034a;
                                }
                            };
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "Started executing operations from " + transitionEffect.f6630d + " to " + transitionEffect.f6631e);
                            }
                            return O9.p.f3034a;
                        }
                    });
                    return;
                }
                SpecialEffectsController.Operation operation4 = (SpecialEffectsController.Operation) it3.next();
                B2.d dVar = new B2.d(ref$ObjectRef, 22);
                Fragment fragment = operation4.f6817c;
                this.f6632f.v(obj2, this.f6641p, dVar, new RunnableC0529c(operation4, this, 0));
            }
        }

        public final Pair<ArrayList<View>, Object> g(ViewGroup viewGroup, SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2) {
            ArrayList<View> arrayList;
            ArrayList<View> arrayList2;
            Object obj;
            C c2;
            Object obj2;
            View view;
            View view2;
            TransitionEffect transitionEffect = this;
            ViewGroup viewGroup2 = viewGroup;
            SpecialEffectsController.Operation operation3 = operation;
            View view3 = new View(viewGroup.getContext());
            Rect rect = new Rect();
            List<g> list = transitionEffect.f6629c;
            Iterator<g> it = list.iterator();
            View view4 = null;
            boolean z10 = false;
            while (true) {
                boolean hasNext = it.hasNext();
                arrayList = transitionEffect.i;
                arrayList2 = transitionEffect.f6634h;
                obj = transitionEffect.f6633g;
                c2 = transitionEffect.f6632f;
                if (!hasNext) {
                    break;
                }
                if (it.next().f6673d == null || operation2 == null || operation3 == null || !(!transitionEffect.f6635j.isEmpty()) || obj == null) {
                    it = it;
                    view4 = view4;
                } else {
                    Fragment fragment = operation3.f6817c;
                    Fragment fragment2 = operation2.f6817c;
                    Iterator<g> it2 = it;
                    boolean z11 = transitionEffect.f6640o;
                    View view5 = view4;
                    androidx.collection.a<String, View> aVar = transitionEffect.f6638m;
                    x.a(fragment, fragment2, z11, aVar);
                    y0.s.a(viewGroup2, new C.y(operation3, operation2, transitionEffect, 12));
                    arrayList2.addAll(aVar.values());
                    ArrayList<String> arrayList3 = transitionEffect.f6637l;
                    if (!arrayList3.isEmpty()) {
                        View view6 = aVar.get(arrayList3.get(0));
                        c2.s(view6, obj);
                        view4 = view6;
                    } else {
                        view4 = view5;
                    }
                    androidx.collection.a<String, View> aVar2 = transitionEffect.f6639n;
                    arrayList.addAll(aVar2.values());
                    ArrayList<String> arrayList4 = transitionEffect.f6636k;
                    if ((!arrayList4.isEmpty()) && (view2 = aVar2.get(arrayList4.get(0))) != null) {
                        y0.s.a(viewGroup2, new C.y(c2, view2, rect, 13));
                        z10 = true;
                    }
                    c2.w(obj, view3, arrayList2);
                    C c10 = transitionEffect.f6632f;
                    Object obj3 = transitionEffect.f6633g;
                    c10.q(obj3, null, null, obj3, transitionEffect.i);
                    it = it2;
                }
            }
            View view7 = view4;
            ArrayList arrayList5 = new ArrayList();
            Iterator<g> it3 = list.iterator();
            Object obj4 = null;
            Object obj5 = null;
            while (true) {
                obj2 = obj5;
                if (!it3.hasNext()) {
                    break;
                }
                g next = it3.next();
                Iterator<g> it4 = it3;
                SpecialEffectsController.Operation operation4 = next.f6670a;
                Object obj6 = obj4;
                Object h9 = c2.h(next.f6671b);
                if (h9 != null) {
                    ArrayList<View> arrayList6 = new ArrayList<>();
                    f(operation4.f6817c.mView, arrayList6);
                    if (obj != null && (operation4 == operation2 || operation4 == operation3)) {
                        if (operation4 == operation2) {
                            arrayList6.removeAll(P9.s.g0(arrayList2));
                        } else {
                            arrayList6.removeAll(P9.s.g0(arrayList));
                        }
                    }
                    if (arrayList6.isEmpty()) {
                        c2.a(view3, h9);
                    } else {
                        c2.b(h9, arrayList6);
                        transitionEffect.f6632f.q(h9, h9, arrayList6, null, null);
                        if (operation4.f6815a == SpecialEffectsController.Operation.State.f6831c) {
                            operation4.i = false;
                            ArrayList<View> arrayList7 = new ArrayList<>(arrayList6);
                            Fragment fragment3 = operation4.f6817c;
                            arrayList7.remove(fragment3.mView);
                            c2.p(h9, fragment3.mView, arrayList7);
                            y0.s.a(viewGroup2, new B2.d(arrayList6, 23));
                        }
                    }
                    if (operation4.f6815a == SpecialEffectsController.Operation.State.f6830b) {
                        arrayList5.addAll(arrayList6);
                        if (z10) {
                            c2.t(h9, rect);
                        }
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "Entering Transition: " + h9);
                            Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                            Iterator<View> it5 = arrayList6.iterator();
                            while (it5.hasNext()) {
                                Log.v("FragmentManager", "View: " + it5.next());
                            }
                        }
                        view = view7;
                    } else {
                        view = view7;
                        c2.s(view, h9);
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "Exiting Transition: " + h9);
                            Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                            Iterator<View> it6 = arrayList6.iterator();
                            while (it6.hasNext()) {
                                Log.v("FragmentManager", "View: " + it6.next());
                            }
                        }
                    }
                    if (next.f6672c) {
                        obj4 = c2.o(obj6, h9);
                        transitionEffect = this;
                        viewGroup2 = viewGroup;
                        operation3 = operation;
                        view7 = view;
                        obj5 = obj2;
                        it3 = it4;
                    } else {
                        Object o10 = c2.o(obj2, h9);
                        operation3 = operation;
                        obj4 = obj6;
                        view7 = view;
                        it3 = it4;
                        transitionEffect = this;
                        obj5 = o10;
                    }
                } else {
                    operation3 = operation;
                    obj4 = obj6;
                    obj5 = obj2;
                    it3 = it4;
                    transitionEffect = this;
                }
                viewGroup2 = viewGroup;
            }
            Object n10 = c2.n(obj4, obj2, obj);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Final merged transition: " + n10);
            }
            return new Pair<>(arrayList5, n10);
        }

        public final boolean h() {
            List<g> list = this.f6629c;
            if ((list instanceof Collection) && list.isEmpty()) {
                return true;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((g) it.next()).f6670a.f6817c.mTransitioning) {
                    return false;
                }
            }
            return true;
        }

        public final void i(ArrayList<View> arrayList, ViewGroup viewGroup, InterfaceC0635a<O9.p> interfaceC0635a) {
            x.c(4, arrayList);
            C c2 = this.f6632f;
            c2.getClass();
            ArrayList arrayList2 = new ArrayList();
            ArrayList<View> arrayList3 = this.i;
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                View view = arrayList3.get(i);
                WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
                arrayList2.add(C1596C.d.f(view));
                C1596C.d.n(view, null);
            }
            boolean isLoggable = Log.isLoggable("FragmentManager", 2);
            ArrayList<View> arrayList4 = this.f6634h;
            if (isLoggable) {
                Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
                Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
                Iterator<View> it = arrayList4.iterator();
                while (it.hasNext()) {
                    View next = it.next();
                    StringBuilder sb2 = new StringBuilder("View: ");
                    sb2.append(next);
                    sb2.append(" Name: ");
                    WeakHashMap<View, y0.E> weakHashMap2 = C1596C.f30963a;
                    sb2.append(C1596C.d.f(next));
                    Log.v("FragmentManager", sb2.toString());
                }
                Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
                Iterator<View> it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    View next2 = it2.next();
                    StringBuilder sb3 = new StringBuilder("View: ");
                    sb3.append(next2);
                    sb3.append(" Name: ");
                    WeakHashMap<View, y0.E> weakHashMap3 = C1596C.f30963a;
                    sb3.append(C1596C.d.f(next2));
                    Log.v("FragmentManager", sb3.toString());
                }
            }
            interfaceC0635a.invoke();
            int size2 = arrayList3.size();
            ArrayList arrayList5 = new ArrayList();
            int i9 = 0;
            while (true) {
                ArrayList<View> arrayList6 = this.f6634h;
                if (i9 >= size2) {
                    y0.s.a(viewGroup, new B(size2, arrayList3, arrayList2, arrayList6, arrayList5));
                    x.c(0, arrayList);
                    c2.x(this.f6633g, arrayList4, arrayList3);
                    return;
                }
                View view2 = arrayList6.get(i9);
                WeakHashMap<View, y0.E> weakHashMap4 = C1596C.f30963a;
                String f10 = C1596C.d.f(view2);
                arrayList5.add(f10);
                if (f10 != null) {
                    C1596C.d.n(view2, null);
                    String str = this.f6635j.get(f10);
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size2) {
                            break;
                        }
                        if (str.equals(arrayList2.get(i10))) {
                            C1596C.d.n(arrayList3.get(i10), f10);
                            break;
                        }
                        i10++;
                    }
                }
                i9++;
            }
        }
    }

    /* compiled from: DefaultSpecialEffectsController.kt */
    public static final class b extends f {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f6658b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f6659c;

        /* renamed from: d, reason: collision with root package name */
        public C0534h.a f6660d;

        public b(SpecialEffectsController.Operation operation, boolean z10) {
            super(operation);
            this.f6658b = z10;
        }

        public final C0534h.a b(Context context) {
            Animation loadAnimation;
            C0534h.a aVar;
            C0534h.a aVar2;
            if (this.f6659c) {
                return this.f6660d;
            }
            SpecialEffectsController.Operation operation = this.f6670a;
            Fragment fragment = operation.f6817c;
            boolean z10 = operation.f6815a == SpecialEffectsController.Operation.State.f6830b;
            int nextTransition = fragment.getNextTransition();
            int popEnterAnim = this.f6658b ? z10 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z10 ? fragment.getEnterAnim() : fragment.getExitAnim();
            fragment.setAnimations(0, 0, 0, 0);
            ViewGroup viewGroup = fragment.mContainer;
            if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
                fragment.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
            }
            ViewGroup viewGroup2 = fragment.mContainer;
            if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
                Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z10, popEnterAnim);
                if (onCreateAnimation != null) {
                    aVar2 = new C0534h.a(onCreateAnimation);
                } else {
                    Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z10, popEnterAnim);
                    if (onCreateAnimator != null) {
                        aVar2 = new C0534h.a(onCreateAnimator);
                    } else {
                        if (popEnterAnim == 0 && nextTransition != 0) {
                            popEnterAnim = nextTransition != 4097 ? nextTransition != 8194 ? nextTransition != 8197 ? nextTransition != 4099 ? nextTransition != 4100 ? -1 : z10 ? C0534h.a(context, android.R.attr.activityOpenEnterAnimation) : C0534h.a(context, android.R.attr.activityOpenExitAnimation) : z10 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z10 ? C0534h.a(context, android.R.attr.activityCloseEnterAnimation) : C0534h.a(context, android.R.attr.activityCloseExitAnimation) : z10 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z10 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                        }
                        if (popEnterAnim != 0) {
                            boolean equals = "anim".equals(context.getResources().getResourceTypeName(popEnterAnim));
                            try {
                                if (equals) {
                                    try {
                                        loadAnimation = AnimationUtils.loadAnimation(context, popEnterAnim);
                                    } catch (Resources.NotFoundException e10) {
                                        throw e10;
                                    } catch (RuntimeException unused) {
                                    }
                                    if (loadAnimation != null) {
                                        aVar = new C0534h.a(loadAnimation);
                                        aVar2 = aVar;
                                    }
                                }
                                Animator loadAnimator = AnimatorInflater.loadAnimator(context, popEnterAnim);
                                if (loadAnimator != null) {
                                    aVar = new C0534h.a(loadAnimator);
                                    aVar2 = aVar;
                                }
                            } catch (RuntimeException e11) {
                                if (equals) {
                                    throw e11;
                                }
                                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, popEnterAnim);
                                if (loadAnimation2 != null) {
                                    aVar2 = new C0534h.a(loadAnimation2);
                                }
                            }
                        }
                    }
                }
                this.f6660d = aVar2;
                this.f6659c = true;
                return aVar2;
            }
            aVar2 = null;
            this.f6660d = aVar2;
            this.f6659c = true;
            return aVar2;
        }
    }

    /* compiled from: DefaultSpecialEffectsController.kt */
    public static final class c extends SpecialEffectsController.a {

        /* renamed from: c, reason: collision with root package name */
        public final b f6661c;

        /* renamed from: d, reason: collision with root package name */
        public AnimatorSet f6662d;

        /* compiled from: DefaultSpecialEffectsController.kt */
        public static final class a extends AnimatorListenerAdapter {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ViewGroup f6663a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f6664b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f6665c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ SpecialEffectsController.Operation f6666d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ c f6667e;

            public a(ViewGroup viewGroup, View view, boolean z10, SpecialEffectsController.Operation operation, c cVar) {
                this.f6663a = viewGroup;
                this.f6664b = view;
                this.f6665c = z10;
                this.f6666d = operation;
                this.f6667e = cVar;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                ViewGroup viewGroup = this.f6663a;
                View view = this.f6664b;
                viewGroup.endViewTransition(view);
                boolean z10 = this.f6665c;
                SpecialEffectsController.Operation operation = this.f6666d;
                if (z10) {
                    operation.f6815a.a(view, viewGroup);
                }
                c cVar = this.f6667e;
                cVar.f6661c.f6670a.c(cVar);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Animator from operation " + operation + " has ended.");
                }
            }
        }

        public c(b bVar) {
            this.f6661c = bVar;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.a
        public final void b(ViewGroup viewGroup) {
            AnimatorSet animatorSet = this.f6662d;
            b bVar = this.f6661c;
            if (animatorSet == null) {
                bVar.f6670a.c(this);
                return;
            }
            SpecialEffectsController.Operation operation = bVar.f6670a;
            if (operation.f6821g) {
                e.f6669a.a(animatorSet);
            } else {
                animatorSet.end();
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                StringBuilder sb2 = new StringBuilder("Animator from operation ");
                sb2.append(operation);
                sb2.append(" has been canceled");
                sb2.append(operation.f6821g ? " with seeking." : ".");
                sb2.append(' ');
                Log.v("FragmentManager", sb2.toString());
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.a
        public final void c(ViewGroup viewGroup) {
            SpecialEffectsController.Operation operation = this.f6661c.f6670a;
            AnimatorSet animatorSet = this.f6662d;
            if (animatorSet == null) {
                operation.c(this);
                return;
            }
            animatorSet.start();
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Animator from operation " + operation + " has started.");
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.a
        public final void d(C0611b c0611b) {
            SpecialEffectsController.Operation operation = this.f6661c.f6670a;
            AnimatorSet animatorSet = this.f6662d;
            if (animatorSet == null) {
                operation.c(this);
                return;
            }
            if (Build.VERSION.SDK_INT < 34 || !operation.f6817c.mTransitioning) {
                return;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + operation);
            }
            long a10 = d.f6668a.a(animatorSet);
            long j10 = (long) (c0611b.f8490c * a10);
            if (j10 == 0) {
                j10 = 1;
            }
            if (j10 == a10) {
                j10 = a10 - 1;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Setting currentPlayTime to " + j10 + " for Animator " + animatorSet + " on operation " + operation);
            }
            e.f6669a.b(animatorSet, j10);
        }

        @Override // androidx.fragment.app.SpecialEffectsController.a
        public final void e(ViewGroup viewGroup) {
            b bVar = this.f6661c;
            if (bVar.a()) {
                return;
            }
            C0534h.a b9 = bVar.b(viewGroup.getContext());
            this.f6662d = b9 != null ? b9.f6860b : null;
            SpecialEffectsController.Operation operation = bVar.f6670a;
            Fragment fragment = operation.f6817c;
            boolean z10 = operation.f6815a == SpecialEffectsController.Operation.State.f6831c;
            View view = fragment.mView;
            viewGroup.startViewTransition(view);
            AnimatorSet animatorSet = this.f6662d;
            if (animatorSet != null) {
                animatorSet.addListener(new a(viewGroup, view, z10, operation, this));
            }
            AnimatorSet animatorSet2 = this.f6662d;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }
    }

    /* compiled from: DefaultSpecialEffectsController.kt */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f6668a = new d();

        public final long a(AnimatorSet animatorSet) {
            return animatorSet.getTotalDuration();
        }
    }

    /* compiled from: DefaultSpecialEffectsController.kt */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f6669a = new e();

        public final void a(AnimatorSet animatorSet) {
            animatorSet.reverse();
        }

        public final void b(AnimatorSet animatorSet, long j10) {
            animatorSet.setCurrentPlayTime(j10);
        }
    }

    /* compiled from: DefaultSpecialEffectsController.kt */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final SpecialEffectsController.Operation f6670a;

        public f(SpecialEffectsController.Operation operation) {
            this.f6670a = operation;
        }

        public final boolean a() {
            SpecialEffectsController.Operation.State state;
            SpecialEffectsController.Operation operation = this.f6670a;
            View view = operation.f6817c.mView;
            SpecialEffectsController.Operation.State state2 = SpecialEffectsController.Operation.State.f6830b;
            if (view != null) {
                float alpha = view.getAlpha();
                state = SpecialEffectsController.Operation.State.f6832d;
                if (alpha != 0.0f || view.getVisibility() != 0) {
                    int visibility = view.getVisibility();
                    if (visibility == 0) {
                        state = state2;
                    } else if (visibility != 4) {
                        if (visibility != 8) {
                            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.g(visibility, "Unknown visibility "));
                        }
                        state = SpecialEffectsController.Operation.State.f6831c;
                    }
                }
            } else {
                state = null;
            }
            SpecialEffectsController.Operation.State state3 = operation.f6815a;
            return state == state3 || !(state == state2 || state3 == state2);
        }
    }

    /* compiled from: DefaultSpecialEffectsController.kt */
    public static final class g extends f {

        /* renamed from: b, reason: collision with root package name */
        public final Object f6671b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f6672c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f6673d;

        public g(SpecialEffectsController.Operation operation, boolean z10, boolean z11) {
            super(operation);
            SpecialEffectsController.Operation.State state = operation.f6815a;
            SpecialEffectsController.Operation.State state2 = SpecialEffectsController.Operation.State.f6830b;
            Fragment fragment = operation.f6817c;
            this.f6671b = state == state2 ? z10 ? fragment.getReenterTransition() : fragment.getEnterTransition() : z10 ? fragment.getReturnTransition() : fragment.getExitTransition();
            this.f6672c = operation.f6815a == state2 ? z10 ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() : true;
            this.f6673d = z11 ? z10 ? fragment.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition() : null;
        }

        public final C b() {
            Object obj = this.f6671b;
            C c2 = c(obj);
            Object obj2 = this.f6673d;
            C c10 = c(obj2);
            if (c2 == null || c10 == null || c2 == c10) {
                return c2 == null ? c10 : c2;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.f6670a.f6817c + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
        }

        public final C c(Object obj) {
            if (obj == null) {
                return null;
            }
            z zVar = x.f6943a;
            if (zVar != null && (obj instanceof Transition)) {
                return zVar;
            }
            C c2 = x.f6944b;
            if (c2 != null && c2.g(obj)) {
                return c2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f6670a.f6817c + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    public static void n(androidx.collection.a aVar, View view) {
        WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
        String f10 = C1596C.d.f(view);
        if (f10 != null) {
            aVar.put(f10, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    n(aVar, childAt);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object] */
    @Override // androidx.fragment.app.SpecialEffectsController
    public final void b(ArrayList arrayList, boolean z10) {
        SpecialEffectsController.Operation.State state;
        SpecialEffectsController.Operation.State state2;
        SpecialEffectsController.Operation.State state3;
        Object obj;
        SpecialEffectsController.Operation operation;
        SpecialEffectsController.Operation.State state4;
        ArrayList arrayList2;
        String str;
        int i;
        String b9;
        String str2;
        SpecialEffectsController.Operation.State state5;
        SpecialEffectsController.Operation.State state6;
        boolean z11 = z10;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            state = SpecialEffectsController.Operation.State.f6831c;
            state2 = SpecialEffectsController.Operation.State.f6830b;
            state3 = SpecialEffectsController.Operation.State.f6832d;
            if (!hasNext) {
                obj = null;
                break;
            }
            obj = it.next();
            SpecialEffectsController.Operation operation2 = (SpecialEffectsController.Operation) obj;
            View view = operation2.f6817c.mView;
            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    state6 = state2;
                } else if (visibility != 4) {
                    if (visibility != 8) {
                        throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.g(visibility, "Unknown visibility "));
                    }
                    state6 = state;
                }
                if (state6 != state2 && operation2.f6815a != state2) {
                    break;
                }
            }
            state6 = state3;
            if (state6 != state2) {
            }
        }
        SpecialEffectsController.Operation operation3 = (SpecialEffectsController.Operation) obj;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                operation = 0;
                break;
            }
            operation = listIterator.previous();
            SpecialEffectsController.Operation operation4 = (SpecialEffectsController.Operation) operation;
            View view2 = operation4.f6817c.mView;
            if (view2.getAlpha() != 0.0f || view2.getVisibility() != 0) {
                int visibility2 = view2.getVisibility();
                if (visibility2 == 0) {
                    state5 = state2;
                } else if (visibility2 != 4) {
                    if (visibility2 != 8) {
                        throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.g(visibility2, "Unknown visibility "));
                    }
                    state5 = state;
                }
                if (state5 == state2 && operation4.f6815a == state2) {
                    break;
                }
            }
            state5 = state3;
            if (state5 == state2) {
            }
        }
        SpecialEffectsController.Operation operation5 = operation;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Executing operations from " + operation3 + " to " + operation5);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Fragment fragment = ((SpecialEffectsController.Operation) P9.s.Q(arrayList)).f6817c;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Fragment.k kVar = ((SpecialEffectsController.Operation) it2.next()).f6817c.mAnimationInfo;
            Fragment.k kVar2 = fragment.mAnimationInfo;
            kVar.f6693b = kVar2.f6693b;
            kVar.f6694c = kVar2.f6694c;
            kVar.f6695d = kVar2.f6695d;
            kVar.f6696e = kVar2.f6696e;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            SpecialEffectsController.Operation operation6 = (SpecialEffectsController.Operation) it3.next();
            arrayList3.add(new b(operation6, z11));
            arrayList4.add(new g(operation6, z11, !z11 ? operation6 != operation5 : operation6 != operation3));
            operation6.f6818d.add(new RunnableC0528b(0, this, operation6));
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            Object next = it4.next();
            if (!((g) next).a()) {
                arrayList5.add(next);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            Object next2 = it5.next();
            if (((g) next2).b() != null) {
                arrayList6.add(next2);
            }
        }
        Iterator it6 = arrayList6.iterator();
        C c2 = null;
        while (it6.hasNext()) {
            g gVar = (g) it6.next();
            C b10 = gVar.b();
            if (c2 != null && b10 != c2) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + gVar.f6670a.f6817c + " returned Transition " + gVar.f6671b + " which uses a different Transition type than other Fragments.").toString());
            }
            c2 = b10;
        }
        if (c2 == null) {
            arrayList2 = arrayList3;
            i = 2;
            str = "FragmentManager";
            state4 = state;
        } else {
            ArrayList arrayList7 = new ArrayList();
            ArrayList arrayList8 = new ArrayList();
            androidx.collection.a aVar = new androidx.collection.a();
            ArrayList<String> arrayList9 = new ArrayList<>();
            ArrayList arrayList10 = new ArrayList();
            androidx.collection.a aVar2 = new androidx.collection.a();
            androidx.collection.a aVar3 = new androidx.collection.a();
            Iterator it7 = arrayList6.iterator();
            ArrayList<String> arrayList11 = arrayList9;
            ArrayList arrayList12 = arrayList10;
            Object obj2 = null;
            while (it7.hasNext()) {
                Object obj3 = ((g) it7.next()).f6673d;
                if (obj3 == null || operation3 == null || operation5 == null) {
                    c2 = c2;
                    z11 = z10;
                    arrayList3 = arrayList3;
                    state = state;
                    arrayList6 = arrayList6;
                    arrayList8 = arrayList8;
                    arrayList7 = arrayList7;
                } else {
                    Object y10 = c2.y(c2.h(obj3));
                    Fragment fragment2 = operation5.f6817c;
                    ArrayList arrayList13 = arrayList3;
                    ArrayList sharedElementSourceNames = fragment2.getSharedElementSourceNames();
                    SpecialEffectsController.Operation.State state7 = state;
                    Fragment fragment3 = operation3.f6817c;
                    ArrayList<String> sharedElementSourceNames2 = fragment3.getSharedElementSourceNames();
                    C c10 = c2;
                    ArrayList<String> sharedElementTargetNames = fragment3.getSharedElementTargetNames();
                    ArrayList arrayList14 = arrayList6;
                    int size = sharedElementTargetNames.size();
                    ArrayList arrayList15 = arrayList8;
                    int i9 = 0;
                    while (i9 < size) {
                        int i10 = size;
                        int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i9));
                        ArrayList<String> arrayList16 = sharedElementTargetNames;
                        if (indexOf != -1) {
                            sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i9));
                        }
                        i9++;
                        size = i10;
                        sharedElementTargetNames = arrayList16;
                    }
                    ArrayList<String> sharedElementTargetNames2 = fragment2.getSharedElementTargetNames();
                    Pair pair = !z11 ? new Pair(fragment3.getExitTransitionCallback(), fragment2.getEnterTransitionCallback()) : new Pair(fragment3.getEnterTransitionCallback(), fragment2.getExitTransitionCallback());
                    j0.G g10 = (j0.G) pair.f23089a;
                    j0.G g11 = (j0.G) pair.f23090b;
                    int size2 = sharedElementSourceNames.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        aVar.put((String) sharedElementSourceNames.get(i11), sharedElementTargetNames2.get(i11));
                        i11++;
                        size2 = size2;
                        arrayList7 = arrayList7;
                    }
                    ArrayList arrayList17 = arrayList7;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", ">>> entering view names <<<");
                        for (Iterator<String> it8 = sharedElementTargetNames2.iterator(); it8.hasNext(); it8 = it8) {
                            Log.v("FragmentManager", "Name: " + it8.next());
                        }
                        Log.v("FragmentManager", ">>> exiting view names <<<");
                        for (Iterator it9 = sharedElementSourceNames.iterator(); it9.hasNext(); it9 = it9) {
                            Log.v("FragmentManager", "Name: " + ((String) it9.next()));
                        }
                    }
                    n(aVar2, fragment3.mView);
                    aVar2.retainAll(sharedElementSourceNames);
                    if (g10 != null) {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "Executing exit callback for operation " + operation3);
                        }
                        int size3 = sharedElementSourceNames.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i12 = size3 - 1;
                                String str3 = (String) sharedElementSourceNames.get(size3);
                                View view3 = (View) aVar2.get(str3);
                                if (view3 == null) {
                                    aVar.remove(str3);
                                } else {
                                    WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
                                    if (!kotlin.jvm.internal.f.b(str3, C1596C.d.f(view3))) {
                                        aVar.put(C1596C.d.f(view3), (String) aVar.remove(str3));
                                    }
                                }
                                if (i12 < 0) {
                                    break;
                                } else {
                                    size3 = i12;
                                }
                            }
                        }
                    } else {
                        aVar.retainAll(aVar2.keySet());
                    }
                    n(aVar3, fragment2.mView);
                    aVar3.retainAll(sharedElementTargetNames2);
                    aVar3.retainAll(aVar.values());
                    if (g11 != null) {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "Executing enter callback for operation " + operation5);
                        }
                        int size4 = sharedElementTargetNames2.size() - 1;
                        if (size4 >= 0) {
                            while (true) {
                                int i13 = size4 - 1;
                                String str4 = sharedElementTargetNames2.get(size4);
                                View view4 = (View) aVar3.get(str4);
                                if (view4 == null) {
                                    String b11 = x.b(aVar, str4);
                                    if (b11 != null) {
                                        aVar.remove(b11);
                                    }
                                } else {
                                    WeakHashMap<View, y0.E> weakHashMap2 = C1596C.f30963a;
                                    if (!kotlin.jvm.internal.f.b(str4, C1596C.d.f(view4)) && (b9 = x.b(aVar, str4)) != null) {
                                        aVar.put(b9, C1596C.d.f(view4));
                                    }
                                }
                                if (i13 < 0) {
                                    break;
                                } else {
                                    size4 = i13;
                                }
                            }
                        }
                    } else {
                        z zVar = x.f6943a;
                        for (int size5 = aVar.size() - 1; -1 < size5; size5--) {
                            if (!aVar3.containsKey((String) aVar.valueAt(size5))) {
                                aVar.removeAt(size5);
                            }
                        }
                    }
                    final Set keySet = aVar.keySet();
                    P9.q.y(aVar2.entrySet(), new InterfaceC0646l<Map.Entry<String, View>, Boolean>() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$retainMatchingViews$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // ca.InterfaceC0646l
                        public final Boolean invoke(Map.Entry<String, View> entry) {
                            Collection<String> collection = keySet;
                            View value = entry.getValue();
                            WeakHashMap<View, y0.E> weakHashMap3 = C1596C.f30963a;
                            return Boolean.valueOf(P9.s.E(collection, C1596C.d.f(value)));
                        }
                    }, false);
                    final Collection values = aVar.values();
                    P9.q.y(aVar3.entrySet(), new InterfaceC0646l<Map.Entry<String, View>, Boolean>() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$retainMatchingViews$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // ca.InterfaceC0646l
                        public final Boolean invoke(Map.Entry<String, View> entry) {
                            Collection<String> collection = values;
                            View value = entry.getValue();
                            WeakHashMap<View, y0.E> weakHashMap3 = C1596C.f30963a;
                            return Boolean.valueOf(P9.s.E(collection, C1596C.d.f(value)));
                        }
                    }, false);
                    if (aVar.isEmpty()) {
                        Log.i("FragmentManager", "Ignoring shared elements transition " + y10 + " between " + operation3 + " and " + operation5 + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
                        arrayList17.clear();
                        arrayList15.clear();
                        c2 = c10;
                        z11 = z10;
                        arrayList11 = sharedElementTargetNames2;
                        arrayList12 = sharedElementSourceNames;
                        arrayList3 = arrayList13;
                        state = state7;
                        arrayList6 = arrayList14;
                        arrayList8 = arrayList15;
                        arrayList7 = arrayList17;
                        obj2 = null;
                    } else {
                        c2 = c10;
                        z11 = z10;
                        arrayList11 = sharedElementTargetNames2;
                        obj2 = y10;
                        arrayList12 = sharedElementSourceNames;
                        arrayList3 = arrayList13;
                        state = state7;
                        arrayList6 = arrayList14;
                        arrayList8 = arrayList15;
                        arrayList7 = arrayList17;
                    }
                }
            }
            C c11 = c2;
            ArrayList arrayList18 = arrayList7;
            ArrayList arrayList19 = arrayList8;
            ArrayList arrayList20 = arrayList3;
            ArrayList arrayList21 = arrayList6;
            state4 = state;
            if (obj2 == null) {
                if (!arrayList21.isEmpty()) {
                    Iterator it10 = arrayList21.iterator();
                    while (it10.hasNext()) {
                        if (((g) it10.next()).f6671b == null) {
                        }
                    }
                }
                i = 2;
                str = "FragmentManager";
                arrayList2 = arrayList20;
            }
            arrayList2 = arrayList20;
            str = "FragmentManager";
            i = 2;
            TransitionEffect transitionEffect = new TransitionEffect(arrayList21, operation3, operation5, c11, obj2, arrayList18, arrayList19, aVar, arrayList11, arrayList12, aVar2, aVar3, z10);
            Iterator it11 = arrayList21.iterator();
            while (it11.hasNext()) {
                ((g) it11.next()).f6670a.f6823j.add(transitionEffect);
            }
        }
        ArrayList arrayList22 = new ArrayList();
        ArrayList arrayList23 = new ArrayList();
        Iterator it12 = arrayList2.iterator();
        while (it12.hasNext()) {
            P9.q.x(arrayList23, ((b) it12.next()).f6670a.f6824k);
        }
        boolean z12 = !arrayList23.isEmpty();
        Iterator it13 = arrayList2.iterator();
        boolean z13 = false;
        while (it13.hasNext()) {
            b bVar = (b) it13.next();
            Context context = this.f6809a.getContext();
            SpecialEffectsController.Operation operation7 = bVar.f6670a;
            C0534h.a b12 = bVar.b(context);
            if (b12 != null) {
                if (b12.f6860b == null) {
                    arrayList22.add(bVar);
                } else {
                    Fragment fragment4 = operation7.f6817c;
                    if (!operation7.f6824k.isEmpty()) {
                        str2 = str;
                        if (Log.isLoggable(str2, i)) {
                            Log.v(str2, "Ignoring Animator set on " + fragment4 + " as this Fragment was involved in a Transition.");
                        }
                        str = str2;
                    } else {
                        String str5 = str;
                        SpecialEffectsController.Operation.State state8 = state4;
                        if (operation7.f6815a == state8) {
                            operation7.i = false;
                        }
                        operation7.f6823j.add(new c(bVar));
                        state4 = state8;
                        str = str5;
                        z13 = true;
                    }
                }
            }
            str2 = str;
            str = str2;
        }
        String str6 = str;
        Iterator it14 = arrayList22.iterator();
        while (it14.hasNext()) {
            b bVar2 = (b) it14.next();
            SpecialEffectsController.Operation operation8 = bVar2.f6670a;
            Fragment fragment5 = operation8.f6817c;
            if (z12) {
                if (Log.isLoggable(str6, i)) {
                    Log.v(str6, "Ignoring Animation set on " + fragment5 + " as Animations cannot run alongside Transitions.");
                }
            } else if (!z13) {
                operation8.f6823j.add(new a(bVar2));
            } else if (Log.isLoggable(str6, i)) {
                Log.v(str6, "Ignoring Animation set on " + fragment5 + " as Animations cannot run alongside Animators.");
            }
        }
    }

    /* compiled from: DefaultSpecialEffectsController.kt */
    public static final class a extends SpecialEffectsController.a {

        /* renamed from: c, reason: collision with root package name */
        public final b f6653c;

        public a(b bVar) {
            this.f6653c = bVar;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.a
        public final void b(ViewGroup viewGroup) {
            b bVar = this.f6653c;
            SpecialEffectsController.Operation operation = bVar.f6670a;
            View view = operation.f6817c.mView;
            view.clearAnimation();
            viewGroup.endViewTransition(view);
            bVar.f6670a.c(this);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Animation from operation " + operation + " has been cancelled.");
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.a
        public final void c(ViewGroup viewGroup) {
            b bVar = this.f6653c;
            if (bVar.a()) {
                bVar.f6670a.c(this);
                return;
            }
            Context context = viewGroup.getContext();
            SpecialEffectsController.Operation operation = bVar.f6670a;
            View view = operation.f6817c.mView;
            C0534h.a b9 = bVar.b(context);
            if (b9 == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            Animation animation = b9.f6859a;
            if (animation == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            if (operation.f6815a != SpecialEffectsController.Operation.State.f6829a) {
                view.startAnimation(animation);
                bVar.f6670a.c(this);
                return;
            }
            viewGroup.startViewTransition(view);
            C0534h.b bVar2 = new C0534h.b(animation, viewGroup, view);
            bVar2.setAnimationListener(new AnimationAnimationListenerC0075a(operation, viewGroup, view, this));
            view.startAnimation(bVar2);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Animation from operation " + operation + " has started.");
            }
        }

        /* compiled from: DefaultSpecialEffectsController.kt */
        /* renamed from: androidx.fragment.app.DefaultSpecialEffectsController$a$a, reason: collision with other inner class name */
        public static final class AnimationAnimationListenerC0075a implements Animation.AnimationListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ SpecialEffectsController.Operation f6654a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ViewGroup f6655b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ View f6656c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a f6657d;

            public AnimationAnimationListenerC0075a(SpecialEffectsController.Operation operation, ViewGroup viewGroup, View view, a aVar) {
                this.f6654a = operation;
                this.f6655b = viewGroup;
                this.f6656c = view;
                this.f6657d = aVar;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                ViewGroup viewGroup = this.f6655b;
                viewGroup.post(new C.y(viewGroup, this.f6656c, this.f6657d, 11));
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.f6654a + " has ended.");
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.f6654a + " has reached onAnimationStart.");
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }
        }
    }
}

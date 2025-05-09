package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.SpecialEffectsController;
import c.C0611b;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SpecialEffectsController.kt */
/* loaded from: classes.dex */
public abstract class SpecialEffectsController {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f6809a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f6810b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f6811c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f6812d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6813e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6814f;

    /* compiled from: SpecialEffectsController.kt */
    public static class Operation {

        /* renamed from: a, reason: collision with root package name */
        public State f6815a;

        /* renamed from: b, reason: collision with root package name */
        public LifecycleImpact f6816b;

        /* renamed from: c, reason: collision with root package name */
        public final Fragment f6817c;

        /* renamed from: e, reason: collision with root package name */
        public boolean f6819e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f6820f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f6821g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f6822h;

        /* renamed from: j, reason: collision with root package name */
        public final ArrayList f6823j;

        /* renamed from: k, reason: collision with root package name */
        public final ArrayList f6824k;

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f6818d = new ArrayList();
        public boolean i = true;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SpecialEffectsController.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "", "fragment_release"}, k = 1, mv = {1, 8, 0})
        public static final class LifecycleImpact {

            /* renamed from: a, reason: collision with root package name */
            public static final LifecycleImpact f6825a;

            /* renamed from: b, reason: collision with root package name */
            public static final LifecycleImpact f6826b;

            /* renamed from: c, reason: collision with root package name */
            public static final LifecycleImpact f6827c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ LifecycleImpact[] f6828d;

            static {
                LifecycleImpact lifecycleImpact = new LifecycleImpact("NONE", 0);
                f6825a = lifecycleImpact;
                LifecycleImpact lifecycleImpact2 = new LifecycleImpact("ADDING", 1);
                f6826b = lifecycleImpact2;
                LifecycleImpact lifecycleImpact3 = new LifecycleImpact("REMOVING", 2);
                f6827c = lifecycleImpact3;
                f6828d = new LifecycleImpact[]{lifecycleImpact, lifecycleImpact2, lifecycleImpact3};
            }

            public LifecycleImpact() {
                throw null;
            }

            public static LifecycleImpact valueOf(String str) {
                return (LifecycleImpact) Enum.valueOf(LifecycleImpact.class, str);
            }

            public static LifecycleImpact[] values() {
                return (LifecycleImpact[]) f6828d.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SpecialEffectsController.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "", "fragment_release"}, k = 1, mv = {1, 8, 0})
        public static final class State {

            /* renamed from: a, reason: collision with root package name */
            public static final State f6829a;

            /* renamed from: b, reason: collision with root package name */
            public static final State f6830b;

            /* renamed from: c, reason: collision with root package name */
            public static final State f6831c;

            /* renamed from: d, reason: collision with root package name */
            public static final State f6832d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ State[] f6833e;

            static {
                State state = new State("REMOVED", 0);
                f6829a = state;
                State state2 = new State("VISIBLE", 1);
                f6830b = state2;
                State state3 = new State("GONE", 2);
                f6831c = state3;
                State state4 = new State("INVISIBLE", 3);
                f6832d = state4;
                f6833e = new State[]{state, state2, state3, state4};
            }

            public State() {
                throw null;
            }

            public static State valueOf(String str) {
                return (State) Enum.valueOf(State.class, str);
            }

            public static State[] values() {
                return (State[]) f6833e.clone();
            }

            public final void a(View view, ViewGroup viewGroup) {
                int ordinal = ordinal();
                if (ordinal == 0) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup2 != null) {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup2);
                        }
                        viewGroup2.removeView(view);
                        return;
                    }
                    return;
                }
                if (ordinal == 1) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    ViewParent parent2 = view.getParent();
                    if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + viewGroup);
                        }
                        viewGroup.addView(view);
                    }
                    view.setVisibility(0);
                    return;
                }
                if (ordinal == 2) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (ordinal != 3) {
                    return;
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        public Operation(State state, LifecycleImpact lifecycleImpact, Fragment fragment) {
            this.f6815a = state;
            this.f6816b = lifecycleImpact;
            this.f6817c = fragment;
            ArrayList arrayList = new ArrayList();
            this.f6823j = arrayList;
            this.f6824k = arrayList;
        }

        public final void a(ViewGroup viewGroup) {
            this.f6822h = false;
            if (this.f6819e) {
                return;
            }
            this.f6819e = true;
            if (this.f6823j.isEmpty()) {
                b();
                return;
            }
            for (a aVar : P9.s.c0(this.f6824k)) {
                if (!aVar.f6835b) {
                    aVar.b(viewGroup);
                }
                aVar.f6835b = true;
            }
        }

        public void b() {
            this.f6822h = false;
            if (this.f6820f) {
                return;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f6820f = true;
            Iterator it = this.f6818d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void c(a aVar) {
            ArrayList arrayList = this.f6823j;
            if (arrayList.remove(aVar) && arrayList.isEmpty()) {
                b();
            }
        }

        public final void d(State state, LifecycleImpact lifecycleImpact) {
            int ordinal = lifecycleImpact.ordinal();
            State state2 = State.f6829a;
            Fragment fragment = this.f6817c;
            if (ordinal == 0) {
                if (this.f6815a != state2) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + this.f6815a + " -> " + state + '.');
                    }
                    this.f6815a = state;
                    return;
                }
                return;
            }
            if (ordinal == 1) {
                if (this.f6815a == state2) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f6816b + " to ADDING.");
                    }
                    this.f6815a = State.f6830b;
                    this.f6816b = LifecycleImpact.f6826b;
                    this.i = true;
                    return;
                }
                return;
            }
            if (ordinal != 2) {
                return;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + this.f6815a + " -> REMOVED. mLifecycleImpact  = " + this.f6816b + " to REMOVING.");
            }
            this.f6815a = state2;
            this.f6816b = LifecycleImpact.f6827c;
            this.i = true;
        }

        public void e() {
            this.f6822h = true;
        }

        public final String toString() {
            StringBuilder m2 = com.google.android.gms.measurement.internal.a.m("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
            m2.append(this.f6815a);
            m2.append(" lifecycleImpact = ");
            m2.append(this.f6816b);
            m2.append(" fragment = ");
            m2.append(this.f6817c);
            m2.append('}');
            return m2.toString();
        }
    }

    /* compiled from: SpecialEffectsController.kt */
    public static final class b extends Operation {

        /* renamed from: l, reason: collision with root package name */
        public final t f6836l;

        public b(Operation.State state, Operation.LifecycleImpact lifecycleImpact, t tVar) {
            super(state, lifecycleImpact, tVar.f6904c);
            this.f6836l = tVar;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public final void b() {
            super.b();
            this.f6817c.mTransitioning = false;
            this.f6836l.k();
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public final void e() {
            if (this.f6822h) {
                return;
            }
            this.f6822h = true;
            Operation.LifecycleImpact lifecycleImpact = this.f6816b;
            Operation.LifecycleImpact lifecycleImpact2 = Operation.LifecycleImpact.f6826b;
            t tVar = this.f6836l;
            if (lifecycleImpact != lifecycleImpact2) {
                if (lifecycleImpact == Operation.LifecycleImpact.f6827c) {
                    Fragment fragment = tVar.f6904c;
                    View requireView = fragment.requireView();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Clearing focus " + requireView.findFocus() + " on view " + requireView + " for Fragment " + fragment);
                    }
                    requireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment fragment2 = tVar.f6904c;
            View findFocus = fragment2.mView.findFocus();
            if (findFocus != null) {
                fragment2.setFocusedView(findFocus);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + fragment2);
                }
            }
            View requireView2 = this.f6817c.requireView();
            if (requireView2.getParent() == null) {
                tVar.b();
                requireView2.setAlpha(0.0f);
            }
            if (requireView2.getAlpha() == 0.0f && requireView2.getVisibility() == 0) {
                requireView2.setVisibility(4);
            }
            requireView2.setAlpha(fragment2.getPostOnViewCreatedAlpha());
        }
    }

    /* compiled from: SpecialEffectsController.kt */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6837a;

        static {
            int[] iArr = new int[Operation.LifecycleImpact.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f6837a = iArr;
        }
    }

    public SpecialEffectsController(ViewGroup viewGroup) {
        this.f6809a = viewGroup;
    }

    public static final SpecialEffectsController i(ViewGroup viewGroup, FragmentManager fragmentManager) {
        fragmentManager.M();
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof SpecialEffectsController) {
            return (SpecialEffectsController) tag;
        }
        DefaultSpecialEffectsController defaultSpecialEffectsController = new DefaultSpecialEffectsController(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, defaultSpecialEffectsController);
        return defaultSpecialEffectsController;
    }

    public static boolean j(ArrayList arrayList) {
        boolean z10;
        Iterator it = arrayList.iterator();
        loop0: while (true) {
            z10 = true;
            while (it.hasNext()) {
                Operation operation = (Operation) it.next();
                if (!operation.f6824k.isEmpty()) {
                    ArrayList arrayList2 = operation.f6824k;
                    if (!(arrayList2 instanceof Collection) || !arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (!((a) it2.next()).a()) {
                                break;
                            }
                        }
                    }
                }
                z10 = false;
            }
            break loop0;
        }
        if (z10) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                P9.q.x(arrayList3, ((Operation) it3.next()).f6824k);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void a(Operation operation) {
        if (operation.i) {
            operation.f6815a.a(operation.f6817c.requireView(), this.f6809a);
            operation.i = false;
        }
    }

    public abstract void b(ArrayList arrayList, boolean z10);

    public final void c(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            P9.q.x(arrayList2, ((Operation) it.next()).f6824k);
        }
        List c02 = P9.s.c0(P9.s.g0(arrayList2));
        int size = c02.size();
        for (int i = 0; i < size; i++) {
            ((a) c02.get(i)).c(this.f6809a);
        }
        int size2 = arrayList.size();
        for (int i9 = 0; i9 < size2; i9++) {
            a((Operation) arrayList.get(i9));
        }
        List c03 = P9.s.c0(arrayList);
        int size3 = c03.size();
        for (int i10 = 0; i10 < size3; i10++) {
            Operation operation = (Operation) c03.get(i10);
            if (operation.f6824k.isEmpty()) {
                operation.b();
            }
        }
    }

    public final void d(Operation.State state, Operation.LifecycleImpact lifecycleImpact, t tVar) {
        synchronized (this.f6810b) {
            try {
                Operation f10 = f(tVar.f6904c);
                if (f10 == null) {
                    Fragment fragment = tVar.f6904c;
                    f10 = fragment.mTransitioning ? g(fragment) : null;
                }
                if (f10 != null) {
                    f10.d(state, lifecycleImpact);
                    return;
                }
                final b bVar = new b(state, lifecycleImpact, tVar);
                this.f6810b.add(bVar);
                final int i = 0;
                bVar.f6818d.add(new Runnable(this) { // from class: androidx.fragment.app.G

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ SpecialEffectsController f6807b;

                    {
                        this.f6807b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                SpecialEffectsController specialEffectsController = this.f6807b;
                                ArrayList arrayList = specialEffectsController.f6810b;
                                SpecialEffectsController.b bVar2 = bVar;
                                if (arrayList.contains(bVar2)) {
                                    bVar2.f6815a.a(bVar2.f6817c.mView, specialEffectsController.f6809a);
                                    break;
                                }
                                break;
                            default:
                                SpecialEffectsController specialEffectsController2 = this.f6807b;
                                ArrayList arrayList2 = specialEffectsController2.f6810b;
                                SpecialEffectsController.b bVar3 = bVar;
                                arrayList2.remove(bVar3);
                                specialEffectsController2.f6811c.remove(bVar3);
                                break;
                        }
                    }
                });
                final int i9 = 1;
                bVar.f6818d.add(new Runnable(this) { // from class: androidx.fragment.app.G

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ SpecialEffectsController f6807b;

                    {
                        this.f6807b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i9) {
                            case 0:
                                SpecialEffectsController specialEffectsController = this.f6807b;
                                ArrayList arrayList = specialEffectsController.f6810b;
                                SpecialEffectsController.b bVar2 = bVar;
                                if (arrayList.contains(bVar2)) {
                                    bVar2.f6815a.a(bVar2.f6817c.mView, specialEffectsController.f6809a);
                                    break;
                                }
                                break;
                            default:
                                SpecialEffectsController specialEffectsController2 = this.f6807b;
                                ArrayList arrayList2 = specialEffectsController2.f6810b;
                                SpecialEffectsController.b bVar3 = bVar;
                                arrayList2.remove(bVar3);
                                specialEffectsController2.f6811c.remove(bVar3);
                                break;
                        }
                    }
                });
                O9.p pVar = O9.p.f3034a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        if (this.f6814f) {
            return;
        }
        if (!this.f6809a.isAttachedToWindow()) {
            h();
            this.f6813e = false;
            return;
        }
        synchronized (this.f6810b) {
            try {
                ArrayList arrayList = new ArrayList(this.f6811c);
                this.f6811c.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Operation operation = (Operation) it.next();
                    operation.f6821g = (this.f6810b.isEmpty() ^ true) && operation.f6817c.mTransitioning;
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Operation operation2 = (Operation) it2.next();
                    if (this.f6812d) {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + operation2);
                        }
                        operation2.b();
                    } else {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + operation2);
                        }
                        operation2.a(this.f6809a);
                    }
                    this.f6812d = false;
                    if (!operation2.f6820f) {
                        this.f6811c.add(operation2);
                    }
                }
                if (!this.f6810b.isEmpty()) {
                    m();
                    ArrayList arrayList2 = new ArrayList(this.f6810b);
                    if (arrayList2.isEmpty()) {
                        return;
                    }
                    this.f6810b.clear();
                    this.f6811c.addAll(arrayList2);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    b(arrayList2, this.f6813e);
                    boolean j10 = j(arrayList2);
                    Iterator it3 = arrayList2.iterator();
                    boolean z10 = true;
                    while (it3.hasNext()) {
                        if (!((Operation) it3.next()).f6817c.mTransitioning) {
                            z10 = false;
                        }
                    }
                    this.f6812d = z10 && !j10;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + j10 + " \ntransition = " + z10);
                    }
                    if (!z10) {
                        l(arrayList2);
                        c(arrayList2);
                    } else if (j10) {
                        l(arrayList2);
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            a((Operation) arrayList2.get(i));
                        }
                    }
                    this.f6813e = false;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
                O9.p pVar = O9.p.f3034a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Operation f(Fragment fragment) {
        Object obj;
        Iterator it = this.f6810b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Operation operation = (Operation) obj;
            if (kotlin.jvm.internal.f.b(operation.f6817c, fragment) && !operation.f6819e) {
                break;
            }
        }
        return (Operation) obj;
    }

    public final Operation g(Fragment fragment) {
        Object obj;
        Iterator it = this.f6811c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Operation operation = (Operation) obj;
            if (kotlin.jvm.internal.f.b(operation.f6817c, fragment) && !operation.f6819e) {
                break;
            }
        }
        return (Operation) obj;
    }

    public final void h() {
        String str;
        String str2;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean isAttachedToWindow = this.f6809a.isAttachedToWindow();
        synchronized (this.f6810b) {
            try {
                m();
                l(this.f6810b);
                ArrayList arrayList = new ArrayList(this.f6811c);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Operation) it.next()).f6821g = false;
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Operation operation = (Operation) it2.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f6809a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + operation);
                    }
                    operation.a(this.f6809a);
                }
                ArrayList arrayList2 = new ArrayList(this.f6810b);
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    ((Operation) it3.next()).f6821g = false;
                }
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    Operation operation2 = (Operation) it4.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f6809a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + operation2);
                    }
                    operation2.a(this.f6809a);
                }
                O9.p pVar = O9.p.f3034a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        r2 = (androidx.fragment.app.SpecialEffectsController.Operation) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        if (r2 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        r3 = r2.f6817c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        if (r3 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        r1 = r3.isPostponed();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        r8.f6814f = r1;
        r1 = O9.p.f3034a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
    
        r1 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k() {
        /*
            r8 = this;
            java.util.ArrayList r0 = r8.f6810b
            monitor-enter(r0)
            r8.m()     // Catch: java.lang.Throwable -> L66
            java.util.ArrayList r1 = r8.f6810b     // Catch: java.lang.Throwable -> L66
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L66
            java.util.ListIterator r1 = r1.listIterator(r2)     // Catch: java.lang.Throwable -> L66
        L10:
            boolean r2 = r1.hasPrevious()     // Catch: java.lang.Throwable -> L66
            r3 = 0
            if (r2 == 0) goto L68
            java.lang.Object r2 = r1.previous()     // Catch: java.lang.Throwable -> L66
            r4 = r2
            androidx.fragment.app.SpecialEffectsController$Operation r4 = (androidx.fragment.app.SpecialEffectsController.Operation) r4     // Catch: java.lang.Throwable -> L66
            androidx.fragment.app.Fragment r5 = r4.f6817c     // Catch: java.lang.Throwable -> L66
            android.view.View r5 = r5.mView     // Catch: java.lang.Throwable -> L66
            float r6 = r5.getAlpha()     // Catch: java.lang.Throwable -> L66
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 != 0) goto L34
            int r6 = r5.getVisibility()     // Catch: java.lang.Throwable -> L66
            if (r6 != 0) goto L34
            androidx.fragment.app.SpecialEffectsController$Operation$State r5 = androidx.fragment.app.SpecialEffectsController.Operation.State.f6832d     // Catch: java.lang.Throwable -> L66
            goto L5d
        L34:
            int r5 = r5.getVisibility()     // Catch: java.lang.Throwable -> L66
            if (r5 == 0) goto L5b
            r6 = 4
            if (r5 == r6) goto L58
            r6 = 8
            if (r5 != r6) goto L44
            androidx.fragment.app.SpecialEffectsController$Operation$State r5 = androidx.fragment.app.SpecialEffectsController.Operation.State.f6831c     // Catch: java.lang.Throwable -> L66
            goto L5d
        L44:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L66
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L66
            java.lang.String r3 = "Unknown visibility "
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L66
            r2.append(r5)     // Catch: java.lang.Throwable -> L66
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L66
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L66
            throw r1     // Catch: java.lang.Throwable -> L66
        L58:
            androidx.fragment.app.SpecialEffectsController$Operation$State r5 = androidx.fragment.app.SpecialEffectsController.Operation.State.f6832d     // Catch: java.lang.Throwable -> L66
            goto L5d
        L5b:
            androidx.fragment.app.SpecialEffectsController$Operation$State r5 = androidx.fragment.app.SpecialEffectsController.Operation.State.f6830b     // Catch: java.lang.Throwable -> L66
        L5d:
            androidx.fragment.app.SpecialEffectsController$Operation$State r4 = r4.f6815a     // Catch: java.lang.Throwable -> L66
            androidx.fragment.app.SpecialEffectsController$Operation$State r6 = androidx.fragment.app.SpecialEffectsController.Operation.State.f6830b     // Catch: java.lang.Throwable -> L66
            if (r4 != r6) goto L10
            if (r5 == r6) goto L10
            goto L69
        L66:
            r1 = move-exception
            goto L7d
        L68:
            r2 = r3
        L69:
            androidx.fragment.app.SpecialEffectsController$Operation r2 = (androidx.fragment.app.SpecialEffectsController.Operation) r2     // Catch: java.lang.Throwable -> L66
            if (r2 == 0) goto L6f
            androidx.fragment.app.Fragment r3 = r2.f6817c     // Catch: java.lang.Throwable -> L66
        L6f:
            if (r3 == 0) goto L76
            boolean r1 = r3.isPostponed()     // Catch: java.lang.Throwable -> L66
            goto L77
        L76:
            r1 = 0
        L77:
            r8.f6814f = r1     // Catch: java.lang.Throwable -> L66
            O9.p r1 = O9.p.f3034a     // Catch: java.lang.Throwable -> L66
            monitor-exit(r0)
            return
        L7d:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.SpecialEffectsController.k():void");
    }

    public final void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Operation) arrayList.get(i)).e();
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            P9.q.x(arrayList2, ((Operation) it.next()).f6824k);
        }
        List c02 = P9.s.c0(P9.s.g0(arrayList2));
        int size2 = c02.size();
        for (int i9 = 0; i9 < size2; i9++) {
            a aVar = (a) c02.get(i9);
            if (!aVar.f6834a) {
                aVar.e(this.f6809a);
            }
            aVar.f6834a = true;
        }
    }

    public final void m() {
        Operation.State state;
        Iterator it = this.f6810b.iterator();
        while (it.hasNext()) {
            Operation operation = (Operation) it.next();
            if (operation.f6816b == Operation.LifecycleImpact.f6826b) {
                int visibility = operation.f6817c.requireView().getVisibility();
                if (visibility == 0) {
                    state = Operation.State.f6830b;
                } else if (visibility == 4) {
                    state = Operation.State.f6832d;
                } else {
                    if (visibility != 8) {
                        throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.g(visibility, "Unknown visibility "));
                    }
                    state = Operation.State.f6831c;
                }
                operation.d(state, Operation.LifecycleImpact.f6825a);
            }
        }
    }

    /* compiled from: SpecialEffectsController.kt */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f6834a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f6835b;

        public boolean a() {
            return this instanceof DefaultSpecialEffectsController.c;
        }

        public void b(ViewGroup viewGroup) {
        }

        public void c(ViewGroup viewGroup) {
        }

        public void d(C0611b c0611b) {
        }

        public void e(ViewGroup viewGroup) {
        }
    }
}

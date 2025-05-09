package q1;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.camera.core.impl.j;
import androidx.collection.b;
import androidx.fragment.app.C0527a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.n;
import androidx.lifecycle.InterfaceC0550p;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.r;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.luminary.business.domain.entity.account.CardsDomain;
import com.luminary.business.presentation.ui.fragments.cards.details.CardDetailsFragment;
import com.luminary.business.presentation.ui.fragments.cards.details.card.CardFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import pa.C1124b;

/* compiled from: FragmentStateAdapter.java */
/* loaded from: classes.dex */
public abstract class a extends RecyclerView.Adapter<g> implements h {

    /* renamed from: d, reason: collision with root package name */
    public final Lifecycle f25828d;

    /* renamed from: e, reason: collision with root package name */
    public final FragmentManager f25829e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.collection.d<Fragment> f25830f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.collection.d<Fragment.SavedState> f25831g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.collection.d<Integer> f25832h;
    public d i;

    /* renamed from: j, reason: collision with root package name */
    public final c f25833j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f25834k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f25835l;

    /* compiled from: FragmentStateAdapter.java */
    /* renamed from: q1.a$a, reason: collision with other inner class name */
    public class C0455a implements InterfaceC0550p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f25836a;

        public C0455a(g gVar) {
            this.f25836a = gVar;
        }

        @Override // androidx.lifecycle.InterfaceC0550p
        public final void d(r rVar, Lifecycle.Event event) {
            a aVar = a.this;
            if (aVar.f25829e.R()) {
                return;
            }
            rVar.getLifecycle().c(this);
            g gVar = this.f25836a;
            if (((FrameLayout) gVar.itemView).isAttachedToWindow()) {
                aVar.h(gVar);
            }
        }
    }

    /* compiled from: FragmentStateAdapter.java */
    public static abstract class b extends RecyclerView.h {
        @Override // androidx.recyclerview.widget.RecyclerView.h
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onItemRangeChanged(int i, int i9) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onItemRangeInserted(int i, int i9) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onItemRangeMoved(int i, int i9, int i10) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onItemRangeRemoved(int i, int i9) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onItemRangeChanged(int i, int i9, Object obj) {
            onChanged();
        }
    }

    /* compiled from: FragmentStateAdapter.java */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public CopyOnWriteArrayList f25838a;

        public static void b(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((e.b) it.next()).getClass();
            }
        }

        public final ArrayList a() {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f25838a.iterator();
            while (it.hasNext()) {
                ((e) it.next()).getClass();
                arrayList.add(e.f25845a);
            }
            return arrayList;
        }
    }

    /* compiled from: FragmentStateAdapter.java */
    public class d {

        /* renamed from: a, reason: collision with root package name */
        public q1.d f25839a;

        /* renamed from: b, reason: collision with root package name */
        public q1.e f25840b;

        /* renamed from: c, reason: collision with root package name */
        public f f25841c;

        /* renamed from: d, reason: collision with root package name */
        public ViewPager2 f25842d;

        /* renamed from: e, reason: collision with root package name */
        public long f25843e = -1;

        public d() {
        }

        public static ViewPager2 a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        public final void b(boolean z10) {
            int currentItem;
            Fragment fragment;
            a aVar = a.this;
            if (!aVar.f25829e.R() && this.f25842d.getScrollState() == 0) {
                androidx.collection.d<Fragment> dVar = aVar.f25830f;
                if (dVar.isEmpty()) {
                    return;
                }
                W6.a aVar2 = (W6.a) aVar;
                if (aVar2.f3828m.size() != 0 && (currentItem = this.f25842d.getCurrentItem()) < aVar2.f3828m.size()) {
                    long j10 = currentItem;
                    if ((j10 != this.f25843e || z10) && (fragment = dVar.get(j10)) != null && fragment.isAdded()) {
                        this.f25843e = j10;
                        FragmentManager fragmentManager = aVar.f25829e;
                        fragmentManager.getClass();
                        C0527a c0527a = new C0527a(fragmentManager);
                        ArrayList arrayList = new ArrayList();
                        Fragment fragment2 = null;
                        for (int i = 0; i < dVar.size(); i++) {
                            long keyAt = dVar.keyAt(i);
                            Fragment valueAt = dVar.valueAt(i);
                            if (valueAt.isAdded()) {
                                if (keyAt != this.f25843e) {
                                    c0527a.m(valueAt, Lifecycle.State.f6978d);
                                    arrayList.add(aVar.f25833j.a());
                                } else {
                                    fragment2 = valueAt;
                                }
                                valueAt.setMenuVisibility(keyAt == this.f25843e);
                            }
                        }
                        if (fragment2 != null) {
                            c0527a.m(fragment2, Lifecycle.State.f6979e);
                            arrayList.add(aVar.f25833j.a());
                        }
                        if (c0527a.f6919a.isEmpty()) {
                            return;
                        }
                        c0527a.j();
                        Collections.reverse(arrayList);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            List list = (List) it.next();
                            aVar.f25833j.getClass();
                            c.b(list);
                        }
                    }
                }
            }
        }
    }

    /* compiled from: FragmentStateAdapter.java */
    public static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        public static final C0456a f25845a = new C0456a();

        /* compiled from: FragmentStateAdapter.java */
        /* renamed from: q1.a$e$a, reason: collision with other inner class name */
        public class C0456a implements b {
        }

        /* compiled from: FragmentStateAdapter.java */
        public interface b {
        }
    }

    public a(CardDetailsFragment cardDetailsFragment) {
        FragmentManager childFragmentManager = cardDetailsFragment.getChildFragmentManager();
        Lifecycle lifecycle = cardDetailsFragment.getLifecycle();
        this.f25830f = new androidx.collection.d<>();
        this.f25831g = new androidx.collection.d<>();
        this.f25832h = new androidx.collection.d<>();
        c cVar = new c();
        cVar.f25838a = new CopyOnWriteArrayList();
        this.f25833j = cVar;
        this.f25834k = false;
        this.f25835l = false;
        this.f25829e = childFragmentManager;
        this.f25828d = lifecycle;
        super.setHasStableIds(true);
    }

    public static void d(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
    
        throw new java.lang.IllegalArgumentException("Unexpected key in savedState: ".concat(r3));
     */
    @Override // q1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.os.Parcelable r8) {
        /*
            r7 = this;
            androidx.collection.d<androidx.fragment.app.Fragment$SavedState> r0 = r7.f25831g
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lbb
            androidx.collection.d<androidx.fragment.app.Fragment> r1 = r7.f25830f
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto Lbb
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.lang.ClassLoader r2 = r8.getClassLoader()
            if (r2 != 0) goto L23
            java.lang.Class r2 = r7.getClass()
            java.lang.ClassLoader r2 = r2.getClassLoader()
            r8.setClassLoader(r2)
        L23:
            java.util.Set r2 = r8.keySet()
            java.util.Iterator r2 = r2.iterator()
        L2b:
            boolean r3 = r2.hasNext()
            r4 = 1
            if (r3 == 0) goto L8f
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r5 = "f#"
            boolean r5 = r3.startsWith(r5)
            r6 = 2
            if (r5 == 0) goto L48
            int r5 = r3.length()
            if (r5 <= r6) goto L48
            goto L49
        L48:
            r4 = 0
        L49:
            if (r4 == 0) goto L5d
            java.lang.String r4 = r3.substring(r6)
            long r4 = java.lang.Long.parseLong(r4)
            androidx.fragment.app.FragmentManager r6 = r7.f25829e
            androidx.fragment.app.Fragment r3 = r6.J(r3, r8)
            r1.put(r4, r3)
            goto L2b
        L5d:
            java.lang.String r4 = "s#"
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto L83
            int r4 = r3.length()
            if (r4 <= r6) goto L83
            java.lang.String r4 = r3.substring(r6)
            long r4 = java.lang.Long.parseLong(r4)
            android.os.Parcelable r3 = r8.getParcelable(r3)
            androidx.fragment.app.Fragment$SavedState r3 = (androidx.fragment.app.Fragment.SavedState) r3
            boolean r6 = r7.e(r4)
            if (r6 == 0) goto L2b
            r0.put(r4, r3)
            goto L2b
        L83:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unexpected key in savedState: "
            java.lang.String r0 = r0.concat(r3)
            r8.<init>(r0)
            throw r8
        L8f:
            boolean r8 = r1.isEmpty()
            if (r8 != 0) goto Lba
            r7.f25835l = r4
            r7.f25834k = r4
            r7.f()
            android.os.Handler r8 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r8.<init>(r0)
            E1.a r0 = new E1.a
            r1 = 2
            r0.<init>(r7, r1)
            q1.c r1 = new q1.c
            r1.<init>(r8, r0)
            androidx.lifecycle.Lifecycle r2 = r7.f25828d
            r2.a(r1)
            r1 = 10000(0x2710, double:4.9407E-320)
            r8.postDelayed(r0, r1)
        Lba:
            return
        Lbb:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Expected the adapter to be 'fresh' while restoring state."
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.a.a(android.os.Parcelable):void");
    }

    @Override // q1.h
    public final Bundle b() {
        androidx.collection.d<Fragment> dVar = this.f25830f;
        int size = dVar.size();
        androidx.collection.d<Fragment.SavedState> dVar2 = this.f25831g;
        Bundle bundle = new Bundle(dVar2.size() + size);
        for (int i = 0; i < dVar.size(); i++) {
            long keyAt = dVar.keyAt(i);
            Fragment fragment = dVar.get(keyAt);
            if (fragment != null && fragment.isAdded()) {
                this.f25829e.X(bundle, j.a("f#", keyAt), fragment);
            }
        }
        for (int i9 = 0; i9 < dVar2.size(); i9++) {
            long keyAt2 = dVar2.keyAt(i9);
            if (e(keyAt2)) {
                bundle.putParcelable(j.a("s#", keyAt2), dVar2.get(keyAt2));
            }
        }
        return bundle;
    }

    public final boolean e(long j10) {
        return j10 >= 0 && j10 < ((long) ((W6.a) this).f3828m.size());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() {
        androidx.collection.d<Fragment> dVar;
        androidx.collection.d<Integer> dVar2;
        Fragment fragment;
        View view;
        if (!this.f25835l || this.f25829e.R()) {
            return;
        }
        androidx.collection.b bVar = new androidx.collection.b();
        int i = 0;
        while (true) {
            dVar = this.f25830f;
            int size = dVar.size();
            dVar2 = this.f25832h;
            if (i >= size) {
                break;
            }
            long keyAt = dVar.keyAt(i);
            if (!e(keyAt)) {
                bVar.add(Long.valueOf(keyAt));
                dVar2.remove(keyAt);
            }
            i++;
        }
        if (!this.f25834k) {
            this.f25835l = false;
            for (int i9 = 0; i9 < dVar.size(); i9++) {
                long keyAt2 = dVar.keyAt(i9);
                if (!dVar2.containsKey(keyAt2) && ((fragment = dVar.get(keyAt2)) == null || (view = fragment.getView()) == null || view.getParent() == null)) {
                    bVar.add(Long.valueOf(keyAt2));
                }
            }
        }
        b.a aVar = new b.a();
        while (aVar.hasNext()) {
            i(((Long) aVar.next()).longValue());
        }
    }

    public final Long g(int i) {
        Long l10 = null;
        int i9 = 0;
        while (true) {
            androidx.collection.d<Integer> dVar = this.f25832h;
            if (i9 >= dVar.size()) {
                return l10;
            }
            if (dVar.valueAt(i9).intValue() == i) {
                if (l10 != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                l10 = Long.valueOf(dVar.keyAt(i9));
            }
            i9++;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public final void h(g gVar) {
        Fragment fragment = this.f25830f.get(gVar.getItemId());
        if (fragment == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayout = (FrameLayout) gVar.itemView;
        View view = fragment.getView();
        if (!fragment.isAdded() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        boolean isAdded = fragment.isAdded();
        FragmentManager fragmentManager = this.f25829e;
        if (isAdded && view == null) {
            fragmentManager.f6747p.f6876b.add(new n.a(new q1.b(this, fragment, frameLayout), false));
            return;
        }
        if (fragment.isAdded() && view.getParent() != null) {
            if (view.getParent() != frameLayout) {
                d(view, frameLayout);
                return;
            }
            return;
        }
        if (fragment.isAdded()) {
            d(view, frameLayout);
            return;
        }
        if (fragmentManager.R()) {
            if (fragmentManager.f6726K) {
                return;
            }
            this.f25828d.a(new C0455a(gVar));
            return;
        }
        fragmentManager.f6747p.f6876b.add(new n.a(new q1.b(this, fragment, frameLayout), false));
        c cVar = this.f25833j;
        cVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = cVar.f25838a.iterator();
        while (it.hasNext()) {
            ((e) it.next()).getClass();
            arrayList.add(e.f25845a);
        }
        try {
            fragment.setMenuVisibility(false);
            C0527a c0527a = new C0527a(fragmentManager);
            c0527a.d(0, fragment, "f" + gVar.getItemId(), 1);
            c0527a.m(fragment, Lifecycle.State.f6978d);
            c0527a.j();
            this.i.b(false);
        } finally {
            c.b(arrayList);
        }
    }

    public final void i(long j10) {
        ViewParent parent;
        androidx.collection.d<Fragment> dVar = this.f25830f;
        Fragment fragment = dVar.get(j10);
        if (fragment == null) {
            return;
        }
        if (fragment.getView() != null && (parent = fragment.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        boolean e10 = e(j10);
        androidx.collection.d<Fragment.SavedState> dVar2 = this.f25831g;
        if (!e10) {
            dVar2.remove(j10);
        }
        if (!fragment.isAdded()) {
            dVar.remove(j10);
            return;
        }
        FragmentManager fragmentManager = this.f25829e;
        if (fragmentManager.R()) {
            this.f25835l = true;
            return;
        }
        boolean isAdded = fragment.isAdded();
        e.C0456a c0456a = e.f25845a;
        c cVar = this.f25833j;
        if (isAdded && e(j10)) {
            cVar.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = cVar.f25838a.iterator();
            while (it.hasNext()) {
                ((e) it.next()).getClass();
                arrayList.add(c0456a);
            }
            Fragment.SavedState c02 = fragmentManager.c0(fragment);
            c.b(arrayList);
            dVar2.put(j10, c02);
        }
        cVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = cVar.f25838a.iterator();
        while (it2.hasNext()) {
            ((e) it2.next()).getClass();
            arrayList2.add(c0456a);
        }
        try {
            C0527a c0527a = new C0527a(fragmentManager);
            c0527a.l(fragment);
            c0527a.j();
            dVar.remove(j10);
        } finally {
            c.b(arrayList2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C1124b.l(this.i == null);
        d dVar = new d();
        this.i = dVar;
        dVar.f25842d = d.a(recyclerView);
        q1.d dVar2 = new q1.d(dVar);
        dVar.f25839a = dVar2;
        dVar.f25842d.f8014c.f8046b.add(dVar2);
        q1.e eVar = new q1.e(dVar);
        dVar.f25840b = eVar;
        registerAdapterDataObserver(eVar);
        f fVar = new f(dVar);
        dVar.f25841c = fVar;
        this.f25828d.a(fVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(g gVar, int i) {
        g gVar2 = gVar;
        long itemId = gVar2.getItemId();
        int id = ((FrameLayout) gVar2.itemView).getId();
        Long g10 = g(id);
        androidx.collection.d<Integer> dVar = this.f25832h;
        if (g10 != null && g10.longValue() != itemId) {
            i(g10.longValue());
            dVar.remove(g10.longValue());
        }
        dVar.put(itemId, Integer.valueOf(id));
        long j10 = i;
        androidx.collection.d<Fragment> dVar2 = this.f25830f;
        if (!dVar2.containsKey(j10)) {
            W6.a aVar = (W6.a) this;
            CardsDomain cardsDomain = aVar.f3828m.get(i);
            CardFragment cardFragment = new CardFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("page_number", i);
            bundle.putSerializable("card", cardsDomain);
            cardFragment.setArguments(bundle);
            aVar.f3829n.put(Integer.valueOf(i), cardFragment);
            cardFragment.setInitialSavedState(this.f25831g.get(j10));
            dVar2.put(j10, cardFragment);
        }
        if (((FrameLayout) gVar2.itemView).isAttachedToWindow()) {
            h(gVar2);
        }
        f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final g onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i9 = g.f25854e;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new g(frameLayout);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        d dVar = this.i;
        dVar.getClass();
        ViewPager2 a10 = d.a(recyclerView);
        a10.f8014c.f8046b.remove(dVar.f25839a);
        q1.e eVar = dVar.f25840b;
        a aVar = a.this;
        aVar.unregisterAdapterDataObserver(eVar);
        aVar.f25828d.c(dVar.f25841c);
        dVar.f25842d = null;
        this.i = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ boolean onFailedToRecycleView(g gVar) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(g gVar) {
        h(gVar);
        f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(g gVar) {
        Long g10 = g(((FrameLayout) gVar.itemView).getId());
        if (g10 != null) {
            i(g10.longValue());
            this.f25832h.remove(g10.longValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean z10) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }
}

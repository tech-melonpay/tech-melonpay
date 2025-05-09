package androidx.fragment.app;

import R0.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SpecialEffectsController;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.w;
import androidx.lifecycle.InterfaceC0550p;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.X;
import b1.C0582b;
import b1.InterfaceC0584d;
import c.AbstractC0618i;
import c.C0611b;
import c.InterfaceC0619j;
import com.luminary.mobile.R;
import e.C0706e;
import e.InterfaceC0702a;
import f.AbstractC0728a;
import j0.InterfaceC0869A;
import j0.InterfaceC0870B;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import k0.InterfaceC0915c;
import k0.InterfaceC0916d;
import x0.InterfaceC1579a;
import y0.InterfaceC1604h;
import y0.InterfaceC1606j;

/* loaded from: classes.dex */
public abstract class FragmentManager {

    /* renamed from: A, reason: collision with root package name */
    public Fragment f6716A;

    /* renamed from: D, reason: collision with root package name */
    public C0706e f6719D;

    /* renamed from: E, reason: collision with root package name */
    public C0706e f6720E;

    /* renamed from: F, reason: collision with root package name */
    public C0706e f6721F;

    /* renamed from: H, reason: collision with root package name */
    public boolean f6723H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f6724I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f6725J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f6726K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f6727L;

    /* renamed from: M, reason: collision with root package name */
    public ArrayList<C0527a> f6728M;

    /* renamed from: N, reason: collision with root package name */
    public ArrayList<Boolean> f6729N;

    /* renamed from: O, reason: collision with root package name */
    public ArrayList<Fragment> f6730O;

    /* renamed from: P, reason: collision with root package name */
    public androidx.fragment.app.q f6731P;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6734b;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList<Fragment> f6737e;

    /* renamed from: g, reason: collision with root package name */
    public androidx.activity.a f6739g;

    /* renamed from: r, reason: collision with root package name */
    public final androidx.fragment.app.o f6749r;

    /* renamed from: s, reason: collision with root package name */
    public final androidx.fragment.app.o f6750s;

    /* renamed from: t, reason: collision with root package name */
    public final androidx.fragment.app.o f6751t;

    /* renamed from: u, reason: collision with root package name */
    public final androidx.fragment.app.o f6752u;

    /* renamed from: x, reason: collision with root package name */
    public androidx.fragment.app.l<?> f6755x;

    /* renamed from: y, reason: collision with root package name */
    public androidx.fragment.app.i f6756y;

    /* renamed from: z, reason: collision with root package name */
    public Fragment f6757z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<o> f6733a = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final v f6735c = new v();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList<C0527a> f6736d = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    public final androidx.fragment.app.m f6738f = new androidx.fragment.app.m(this);

    /* renamed from: h, reason: collision with root package name */
    public C0527a f6740h = null;
    public boolean i = false;

    /* renamed from: j, reason: collision with root package name */
    public final b f6741j = new b();

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f6742k = new AtomicInteger();

    /* renamed from: l, reason: collision with root package name */
    public final Map<String, BackStackState> f6743l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m, reason: collision with root package name */
    public final Map<String, Bundle> f6744m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n, reason: collision with root package name */
    public final Map<String, m> f6745n = Collections.synchronizedMap(new HashMap());

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList<n> f6746o = new ArrayList<>();

    /* renamed from: p, reason: collision with root package name */
    public final androidx.fragment.app.n f6747p = new androidx.fragment.app.n(this);

    /* renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList<androidx.fragment.app.r> f6748q = new CopyOnWriteArrayList<>();

    /* renamed from: v, reason: collision with root package name */
    public final c f6753v = new c();

    /* renamed from: w, reason: collision with root package name */
    public int f6754w = -1;

    /* renamed from: B, reason: collision with root package name */
    public final d f6717B = new d();

    /* renamed from: C, reason: collision with root package name */
    public final e f6718C = new e();

    /* renamed from: G, reason: collision with root package name */
    public ArrayDeque<LaunchedFragmentInfo> f6722G = new ArrayDeque<>();

    /* renamed from: Q, reason: collision with root package name */
    public final f f6732Q = new f();

    @SuppressLint({"BanParcelableUsage"})
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public String f6758a;

        /* renamed from: b, reason: collision with root package name */
        public int f6759b;

        public class a implements Parcelable.Creator<LaunchedFragmentInfo> {
            @Override // android.os.Parcelable.Creator
            public final LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                LaunchedFragmentInfo launchedFragmentInfo = new LaunchedFragmentInfo();
                launchedFragmentInfo.f6758a = parcel.readString();
                launchedFragmentInfo.f6759b = parcel.readInt();
                return launchedFragmentInfo;
            }

            @Override // android.os.Parcelable.Creator
            public final LaunchedFragmentInfo[] newArray(int i) {
                return new LaunchedFragmentInfo[i];
            }
        }

        public LaunchedFragmentInfo(String str, int i) {
            this.f6758a = str;
            this.f6759b = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f6758a);
            parcel.writeInt(this.f6759b);
        }
    }

    public class a implements InterfaceC0702a<Map<String, Boolean>> {
        public a() {
        }

        @Override // e.InterfaceC0702a
        public final void a(Map<String, Boolean> map) {
            Map<String, Boolean> map2 = map;
            String[] strArr = (String[]) map2.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map2.values());
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
            }
            FragmentManager fragmentManager = FragmentManager.this;
            LaunchedFragmentInfo pollFirst = fragmentManager.f6722G.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            v vVar = fragmentManager.f6735c;
            String str = pollFirst.f6758a;
            Fragment c2 = vVar.c(str);
            if (c2 != null) {
                c2.onRequestPermissionsResult(pollFirst.f6759b, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    public class b extends AbstractC0618i {
        public b() {
            super(false);
        }

        @Override // c.AbstractC0618i
        public final void a() {
            boolean isLoggable = Log.isLoggable("FragmentManager", 3);
            FragmentManager fragmentManager = FragmentManager.this;
            if (isLoggable) {
                Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + fragmentManager);
            }
            fragmentManager.getClass();
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "cancelBackStackTransition for transition " + fragmentManager.f6740h);
            }
            C0527a c0527a = fragmentManager.f6740h;
            if (c0527a != null) {
                c0527a.f6839s = false;
                c0527a.g();
                C0527a c0527a2 = fragmentManager.f6740h;
                B2.d dVar = new B2.d(fragmentManager, 26);
                if (c0527a2.f6934q == null) {
                    c0527a2.f6934q = new ArrayList<>();
                }
                c0527a2.f6934q.add(dVar);
                fragmentManager.f6740h.h();
                fragmentManager.i = true;
                fragmentManager.B(true);
                fragmentManager.H();
                fragmentManager.i = false;
                fragmentManager.f6740h = null;
            }
        }

        @Override // c.AbstractC0618i
        public final void b() {
            boolean isLoggable = Log.isLoggable("FragmentManager", 3);
            FragmentManager fragmentManager = FragmentManager.this;
            if (isLoggable) {
                Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + fragmentManager);
            }
            fragmentManager.i = true;
            fragmentManager.B(true);
            fragmentManager.i = false;
            C0527a c0527a = fragmentManager.f6740h;
            b bVar = fragmentManager.f6741j;
            if (c0527a == null) {
                if (bVar.f8505a) {
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                    }
                    fragmentManager.U();
                    return;
                } else {
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                    }
                    fragmentManager.f6739g.d();
                    return;
                }
            }
            ArrayList<n> arrayList = fragmentManager.f6746o;
            if (!arrayList.isEmpty()) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(FragmentManager.I(fragmentManager.f6740h));
                Iterator<n> it = arrayList.iterator();
                while (it.hasNext()) {
                    n next = it.next();
                    Iterator it2 = linkedHashSet.iterator();
                    while (it2.hasNext()) {
                        next.a((Fragment) it2.next(), true);
                    }
                }
            }
            Iterator<w.a> it3 = fragmentManager.f6740h.f6919a.iterator();
            while (it3.hasNext()) {
                Fragment fragment = it3.next().f6936b;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            Iterator it4 = fragmentManager.g(new ArrayList(Collections.singletonList(fragmentManager.f6740h)), 0, 1).iterator();
            while (it4.hasNext()) {
                SpecialEffectsController specialEffectsController = (SpecialEffectsController) it4.next();
                specialEffectsController.getClass();
                if (Log.isLoggable("FragmentManager", 3)) {
                    Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
                }
                ArrayList arrayList2 = specialEffectsController.f6811c;
                specialEffectsController.l(arrayList2);
                specialEffectsController.c(arrayList2);
            }
            Iterator<w.a> it5 = fragmentManager.f6740h.f6919a.iterator();
            while (it5.hasNext()) {
                Fragment fragment2 = it5.next().f6936b;
                if (fragment2 != null && fragment2.mContainer == null) {
                    fragmentManager.h(fragment2).k();
                }
            }
            fragmentManager.f6740h = null;
            fragmentManager.n0();
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "Op is being set to null");
                Log.d("FragmentManager", "OnBackPressedCallback enabled=" + bVar.f8505a + " for  FragmentManager " + fragmentManager);
            }
        }

        @Override // c.AbstractC0618i
        public final void c(C0611b c0611b) {
            boolean isLoggable = Log.isLoggable("FragmentManager", 2);
            FragmentManager fragmentManager = FragmentManager.this;
            if (isLoggable) {
                Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + fragmentManager);
            }
            if (fragmentManager.f6740h != null) {
                Iterator it = fragmentManager.g(new ArrayList(Collections.singletonList(fragmentManager.f6740h)), 0, 1).iterator();
                while (it.hasNext()) {
                    SpecialEffectsController specialEffectsController = (SpecialEffectsController) it.next();
                    specialEffectsController.getClass();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + c0611b.f8490c);
                    }
                    ArrayList arrayList = specialEffectsController.f6811c;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        P9.q.x(arrayList2, ((SpecialEffectsController.Operation) it2.next()).f6824k);
                    }
                    List c02 = P9.s.c0(P9.s.g0(arrayList2));
                    int size = c02.size();
                    for (int i = 0; i < size; i++) {
                        ((SpecialEffectsController.a) c02.get(i)).d(c0611b);
                    }
                }
                Iterator<n> it3 = fragmentManager.f6746o.iterator();
                while (it3.hasNext()) {
                    it3.next().getClass();
                }
            }
        }

        @Override // c.AbstractC0618i
        public final void d() {
            boolean isLoggable = Log.isLoggable("FragmentManager", 3);
            FragmentManager fragmentManager = FragmentManager.this;
            if (isLoggable) {
                Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + fragmentManager);
            }
            fragmentManager.y();
            fragmentManager.z(fragmentManager.new q(), false);
        }
    }

    public class c implements InterfaceC1606j {
        public c() {
        }

        @Override // y0.InterfaceC1606j
        public final boolean a(MenuItem menuItem) {
            return FragmentManager.this.q(menuItem);
        }

        @Override // y0.InterfaceC1606j
        public final void b(Menu menu) {
            FragmentManager.this.r(menu);
        }

        @Override // y0.InterfaceC1606j
        public final void c(Menu menu, MenuInflater menuInflater) {
            FragmentManager.this.l(menu, menuInflater);
        }

        @Override // y0.InterfaceC1606j
        public final void d(Menu menu) {
            FragmentManager.this.u(menu);
        }
    }

    public class d extends androidx.fragment.app.k {
        public d() {
        }

        @Override // androidx.fragment.app.k
        public final Fragment a(String str) {
            return Fragment.instantiate(FragmentManager.this.f6755x.f6869b, str, null);
        }
    }

    public class e implements H {
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            FragmentManager.this.B(true);
        }
    }

    public class g implements InterfaceC0550p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f6765a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.s f6766b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Lifecycle f6767c;

        public g(String str, androidx.fragment.app.s sVar, Lifecycle lifecycle) {
            this.f6765a = str;
            this.f6766b = sVar;
            this.f6767c = lifecycle;
        }

        @Override // androidx.lifecycle.InterfaceC0550p
        public final void d(androidx.lifecycle.r rVar, Lifecycle.Event event) {
            Bundle bundle;
            Lifecycle.Event event2 = Lifecycle.Event.ON_START;
            FragmentManager fragmentManager = FragmentManager.this;
            String str = this.f6765a;
            if (event == event2 && (bundle = fragmentManager.f6744m.get(str)) != null) {
                this.f6766b.b(str, bundle);
                fragmentManager.e(str);
            }
            if (event == Lifecycle.Event.ON_DESTROY) {
                this.f6767c.c(this);
                fragmentManager.f6745n.remove(str);
            }
        }
    }

    public class h implements androidx.fragment.app.r {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f6769a;

        public h(Fragment fragment) {
            this.f6769a = fragment;
        }

        @Override // androidx.fragment.app.r
        public final void a(Fragment fragment) {
            this.f6769a.onAttachFragment(fragment);
        }
    }

    public class i implements InterfaceC0702a<ActivityResult> {
        public i() {
        }

        @Override // e.InterfaceC0702a
        public final void a(ActivityResult activityResult) {
            ActivityResult activityResult2 = activityResult;
            FragmentManager fragmentManager = FragmentManager.this;
            LaunchedFragmentInfo pollLast = fragmentManager.f6722G.pollLast();
            if (pollLast == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            v vVar = fragmentManager.f6735c;
            String str = pollLast.f6758a;
            Fragment c2 = vVar.c(str);
            if (c2 != null) {
                c2.onActivityResult(pollLast.f6759b, activityResult2.f4575a, activityResult2.f4576b);
            } else {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
            }
        }
    }

    public class j implements InterfaceC0702a<ActivityResult> {
        public j() {
        }

        @Override // e.InterfaceC0702a
        public final void a(ActivityResult activityResult) {
            ActivityResult activityResult2 = activityResult;
            FragmentManager fragmentManager = FragmentManager.this;
            LaunchedFragmentInfo pollFirst = fragmentManager.f6722G.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            v vVar = fragmentManager.f6735c;
            String str = pollFirst.f6758a;
            Fragment c2 = vVar.c(str);
            if (c2 != null) {
                c2.onActivityResult(pollFirst.f6759b, activityResult2.f4575a, activityResult2.f4576b);
            } else {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
            }
        }
    }

    public static class k extends AbstractC0728a<IntentSenderRequest, ActivityResult> {
        @Override // f.AbstractC0728a
        public final Intent createIntent(Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            IntentSenderRequest intentSenderRequest2 = intentSenderRequest;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = intentSenderRequest2.f4579b;
            if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest2 = new IntentSenderRequest(intentSenderRequest2.f4578a, null, intentSenderRequest2.f4580c, intentSenderRequest2.f4581d);
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest2);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // f.AbstractC0728a
        public final ActivityResult parseResult(int i, Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    public static class m implements androidx.fragment.app.s {

        /* renamed from: a, reason: collision with root package name */
        public final Lifecycle f6772a;

        /* renamed from: b, reason: collision with root package name */
        public final androidx.fragment.app.s f6773b;
        public final InterfaceC0550p i;

        public m(Lifecycle lifecycle, androidx.fragment.app.s sVar, g gVar) {
            this.f6772a = lifecycle;
            this.f6773b = sVar;
            this.i = gVar;
        }

        @Override // androidx.fragment.app.s
        public final void b(String str, Bundle bundle) {
            this.f6773b.b(str, bundle);
        }
    }

    public interface o {
        boolean a(ArrayList<C0527a> arrayList, ArrayList<Boolean> arrayList2);
    }

    public class p implements o {

        /* renamed from: a, reason: collision with root package name */
        public final String f6774a;

        /* renamed from: b, reason: collision with root package name */
        public final int f6775b;

        /* renamed from: c, reason: collision with root package name */
        public final int f6776c;

        public p(String str, int i, int i9) {
            this.f6774a = str;
            this.f6775b = i;
            this.f6776c = i9;
        }

        @Override // androidx.fragment.app.FragmentManager.o
        public final boolean a(ArrayList<C0527a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f6716A;
            if (fragment != null && this.f6775b < 0 && this.f6774a == null && fragment.getChildFragmentManager().U()) {
                return false;
            }
            return FragmentManager.this.W(arrayList, arrayList2, this.f6774a, this.f6775b, this.f6776c);
        }
    }

    public class q implements o {
        public q() {
        }

        @Override // androidx.fragment.app.FragmentManager.o
        public final boolean a(ArrayList<C0527a> arrayList, ArrayList<Boolean> arrayList2) {
            boolean W;
            FragmentManager fragmentManager = FragmentManager.this;
            fragmentManager.getClass();
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + fragmentManager.f6733a);
            }
            if (fragmentManager.f6736d.isEmpty()) {
                Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
                W = false;
            } else {
                C0527a c0527a = (C0527a) com.google.android.gms.measurement.internal.a.f(1, fragmentManager.f6736d);
                fragmentManager.f6740h = c0527a;
                Iterator<w.a> it = c0527a.f6919a.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().f6936b;
                    if (fragment != null) {
                        fragment.mTransitioning = true;
                    }
                }
                W = fragmentManager.W(arrayList, arrayList2, null, -1, 0);
            }
            if (!fragmentManager.f6746o.isEmpty() && arrayList.size() > 0) {
                boolean booleanValue = arrayList2.get(arrayList.size() - 1).booleanValue();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator<C0527a> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    linkedHashSet.addAll(FragmentManager.I(it2.next()));
                }
                Iterator<n> it3 = fragmentManager.f6746o.iterator();
                while (it3.hasNext()) {
                    n next = it3.next();
                    Iterator it4 = linkedHashSet.iterator();
                    while (it4.hasNext()) {
                        next.b((Fragment) it4.next(), booleanValue);
                    }
                }
            }
            return W;
        }
    }

    public class r implements o {

        /* renamed from: a, reason: collision with root package name */
        public final String f6779a;

        public r(String str) {
            this.f6779a = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:65:0x0118, code lost:
        
            r3.add(r6);
         */
        @Override // androidx.fragment.app.FragmentManager.o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean a(java.util.ArrayList<androidx.fragment.app.C0527a> r13, java.util.ArrayList<java.lang.Boolean> r14) {
            /*
                Method dump skipped, instructions count: 306
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.r.a(java.util.ArrayList, java.util.ArrayList):boolean");
        }
    }

    public class s implements o {

        /* renamed from: a, reason: collision with root package name */
        public final String f6781a;

        public s(String str) {
            this.f6781a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.o
        public final boolean a(ArrayList<C0527a> arrayList, ArrayList<Boolean> arrayList2) {
            int i;
            FragmentManager fragmentManager = FragmentManager.this;
            String str = this.f6781a;
            int E8 = fragmentManager.E(str, -1, true);
            if (E8 < 0) {
                return false;
            }
            for (int i9 = E8; i9 < fragmentManager.f6736d.size(); i9++) {
                C0527a c0527a = fragmentManager.f6736d.get(i9);
                if (!c0527a.f6933p) {
                    fragmentManager.m0(new IllegalArgumentException("saveBackStack(\"" + str + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + c0527a + " that did not use setReorderingAllowed(true)."));
                    throw null;
                }
            }
            HashSet hashSet = new HashSet();
            for (int i10 = E8; i10 < fragmentManager.f6736d.size(); i10++) {
                C0527a c0527a2 = fragmentManager.f6736d.get(i10);
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                Iterator<w.a> it = c0527a2.f6919a.iterator();
                while (it.hasNext()) {
                    w.a next = it.next();
                    Fragment fragment = next.f6936b;
                    if (fragment != null) {
                        if (!next.f6937c || (i = next.f6935a) == 1 || i == 2 || i == 8) {
                            hashSet.add(fragment);
                            hashSet2.add(fragment);
                        }
                        int i11 = next.f6935a;
                        if (i11 == 1 || i11 == 2) {
                            hashSet3.add(fragment);
                        }
                    }
                }
                hashSet2.removeAll(hashSet3);
                if (!hashSet2.isEmpty()) {
                    StringBuilder m2 = com.google.android.gms.measurement.internal.a.m("saveBackStack(\"", str, "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                    m2.append(hashSet2.size() == 1 ? " " + hashSet2.iterator().next() : "s " + hashSet2);
                    m2.append(" in ");
                    m2.append(c0527a2);
                    m2.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                    fragmentManager.m0(new IllegalArgumentException(m2.toString()));
                    throw null;
                }
            }
            ArrayDeque arrayDeque = new ArrayDeque(hashSet);
            while (!arrayDeque.isEmpty()) {
                Fragment fragment2 = (Fragment) arrayDeque.removeFirst();
                if (fragment2.mRetainInstance) {
                    StringBuilder m9 = com.google.android.gms.measurement.internal.a.m("saveBackStack(\"", str, "\") must not contain retained fragments. Found ");
                    m9.append(hashSet.contains(fragment2) ? "direct reference to retained " : "retained child ");
                    m9.append("fragment ");
                    m9.append(fragment2);
                    fragmentManager.m0(new IllegalArgumentException(m9.toString()));
                    throw null;
                }
                Iterator it2 = fragment2.mChildFragmentManager.f6735c.e().iterator();
                while (it2.hasNext()) {
                    Fragment fragment3 = (Fragment) it2.next();
                    if (fragment3 != null) {
                        arrayDeque.addLast(fragment3);
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((Fragment) it3.next()).mWho);
            }
            ArrayList arrayList4 = new ArrayList(fragmentManager.f6736d.size() - E8);
            for (int i12 = E8; i12 < fragmentManager.f6736d.size(); i12++) {
                arrayList4.add(null);
            }
            BackStackState backStackState = new BackStackState(arrayList3, arrayList4);
            for (int size = fragmentManager.f6736d.size() - 1; size >= E8; size--) {
                C0527a remove = fragmentManager.f6736d.remove(size);
                C0527a c0527a3 = new C0527a(remove);
                c0527a3.g();
                arrayList4.set(size - E8, new BackStackRecordState(c0527a3));
                remove.f6841u = true;
                arrayList.add(remove);
                arrayList2.add(Boolean.TRUE);
            }
            fragmentManager.f6743l.put(str, backStackState);
            return true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [androidx.fragment.app.o] */
    /* JADX WARN: Type inference failed for: r0v18, types: [androidx.fragment.app.o] */
    /* JADX WARN: Type inference failed for: r0v19, types: [androidx.fragment.app.o] */
    /* JADX WARN: Type inference failed for: r0v20, types: [androidx.fragment.app.o] */
    public FragmentManager() {
        final int i9 = 0;
        this.f6749r = new InterfaceC1579a(this) { // from class: androidx.fragment.app.o

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FragmentManager f6880b;

            {
                this.f6880b = this;
            }

            @Override // x0.InterfaceC1579a
            public final void accept(Object obj) {
                switch (i9) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        FragmentManager fragmentManager = this.f6880b;
                        if (fragmentManager.P()) {
                            fragmentManager.j(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        FragmentManager fragmentManager2 = this.f6880b;
                        if (fragmentManager2.P() && num.intValue() == 80) {
                            fragmentManager2.n(false);
                            break;
                        }
                        break;
                    case 2:
                        j0.k kVar = (j0.k) obj;
                        FragmentManager fragmentManager3 = this.f6880b;
                        if (fragmentManager3.P()) {
                            fragmentManager3.o(kVar.f22277a, false);
                            break;
                        }
                        break;
                    default:
                        j0.D d10 = (j0.D) obj;
                        FragmentManager fragmentManager4 = this.f6880b;
                        if (fragmentManager4.P()) {
                            fragmentManager4.t(d10.f22235a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i10 = 1;
        this.f6750s = new InterfaceC1579a(this) { // from class: androidx.fragment.app.o

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FragmentManager f6880b;

            {
                this.f6880b = this;
            }

            @Override // x0.InterfaceC1579a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        FragmentManager fragmentManager = this.f6880b;
                        if (fragmentManager.P()) {
                            fragmentManager.j(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        FragmentManager fragmentManager2 = this.f6880b;
                        if (fragmentManager2.P() && num.intValue() == 80) {
                            fragmentManager2.n(false);
                            break;
                        }
                        break;
                    case 2:
                        j0.k kVar = (j0.k) obj;
                        FragmentManager fragmentManager3 = this.f6880b;
                        if (fragmentManager3.P()) {
                            fragmentManager3.o(kVar.f22277a, false);
                            break;
                        }
                        break;
                    default:
                        j0.D d10 = (j0.D) obj;
                        FragmentManager fragmentManager4 = this.f6880b;
                        if (fragmentManager4.P()) {
                            fragmentManager4.t(d10.f22235a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i11 = 2;
        this.f6751t = new InterfaceC1579a(this) { // from class: androidx.fragment.app.o

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FragmentManager f6880b;

            {
                this.f6880b = this;
            }

            @Override // x0.InterfaceC1579a
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        FragmentManager fragmentManager = this.f6880b;
                        if (fragmentManager.P()) {
                            fragmentManager.j(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        FragmentManager fragmentManager2 = this.f6880b;
                        if (fragmentManager2.P() && num.intValue() == 80) {
                            fragmentManager2.n(false);
                            break;
                        }
                        break;
                    case 2:
                        j0.k kVar = (j0.k) obj;
                        FragmentManager fragmentManager3 = this.f6880b;
                        if (fragmentManager3.P()) {
                            fragmentManager3.o(kVar.f22277a, false);
                            break;
                        }
                        break;
                    default:
                        j0.D d10 = (j0.D) obj;
                        FragmentManager fragmentManager4 = this.f6880b;
                        if (fragmentManager4.P()) {
                            fragmentManager4.t(d10.f22235a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i12 = 3;
        this.f6752u = new InterfaceC1579a(this) { // from class: androidx.fragment.app.o

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FragmentManager f6880b;

            {
                this.f6880b = this;
            }

            @Override // x0.InterfaceC1579a
            public final void accept(Object obj) {
                switch (i12) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        FragmentManager fragmentManager = this.f6880b;
                        if (fragmentManager.P()) {
                            fragmentManager.j(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        FragmentManager fragmentManager2 = this.f6880b;
                        if (fragmentManager2.P() && num.intValue() == 80) {
                            fragmentManager2.n(false);
                            break;
                        }
                        break;
                    case 2:
                        j0.k kVar = (j0.k) obj;
                        FragmentManager fragmentManager3 = this.f6880b;
                        if (fragmentManager3.P()) {
                            fragmentManager3.o(kVar.f22277a, false);
                            break;
                        }
                        break;
                    default:
                        j0.D d10 = (j0.D) obj;
                        FragmentManager fragmentManager4 = this.f6880b;
                        if (fragmentManager4.P()) {
                            fragmentManager4.t(d10.f22235a, false);
                            break;
                        }
                        break;
                }
            }
        };
    }

    public static HashSet I(C0527a c0527a) {
        HashSet hashSet = new HashSet();
        for (int i9 = 0; i9 < c0527a.f6919a.size(); i9++) {
            Fragment fragment = c0527a.f6919a.get(i9).f6936b;
            if (fragment != null && c0527a.f6925g) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    public static boolean O(Fragment fragment) {
        if (!fragment.mHasMenu || !fragment.mMenuVisible) {
            Iterator it = fragment.mChildFragmentManager.f6735c.e().iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                Fragment fragment2 = (Fragment) it.next();
                if (fragment2 != null) {
                    z10 = O(fragment2);
                }
                if (z10) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean Q(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.f6716A) && Q(fragmentManager.f6757z);
    }

    public static void k0(Fragment fragment) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public final void A(boolean z10) {
        if (this.f6734b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f6755x == null) {
            if (!this.f6726K) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f6755x.f6870c.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z10 && R()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f6728M == null) {
            this.f6728M = new ArrayList<>();
            this.f6729N = new ArrayList<>();
        }
    }

    public final boolean B(boolean z10) {
        C0527a c0527a;
        A(z10);
        if (!this.i && (c0527a = this.f6740h) != null) {
            c0527a.f6839s = false;
            c0527a.g();
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f6740h + " as part of execPendingActions for actions " + this.f6733a);
            }
            this.f6740h.i(false, false);
            this.f6733a.add(0, this.f6740h);
            Iterator<w.a> it = this.f6740h.f6919a.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f6936b;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.f6740h = null;
        }
        boolean z11 = false;
        while (true) {
            ArrayList<C0527a> arrayList = this.f6728M;
            ArrayList<Boolean> arrayList2 = this.f6729N;
            synchronized (this.f6733a) {
                if (this.f6733a.isEmpty()) {
                    break;
                }
                try {
                    int size = this.f6733a.size();
                    boolean z12 = false;
                    for (int i9 = 0; i9 < size; i9++) {
                        z12 |= this.f6733a.get(i9).a(arrayList, arrayList2);
                    }
                    if (!z12) {
                        break;
                    }
                    z11 = true;
                    this.f6734b = true;
                    try {
                        Z(this.f6728M, this.f6729N);
                    } finally {
                        d();
                    }
                } finally {
                    this.f6733a.clear();
                    this.f6755x.f6870c.removeCallbacks(this.f6732Q);
                }
            }
        }
        n0();
        w();
        this.f6735c.f6916b.values().removeAll(Collections.singleton(null));
        return z11;
    }

    public final void C(o oVar, boolean z10) {
        if (z10 && (this.f6755x == null || this.f6726K)) {
            return;
        }
        A(z10);
        C0527a c0527a = this.f6740h;
        boolean z11 = false;
        if (c0527a != null) {
            c0527a.f6839s = false;
            c0527a.g();
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f6740h + " as part of execSingleAction for action " + oVar);
            }
            this.f6740h.i(false, false);
            this.f6740h.a(this.f6728M, this.f6729N);
            Iterator<w.a> it = this.f6740h.f6919a.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f6936b;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.f6740h = null;
            z11 = true;
        }
        boolean a10 = oVar.a(this.f6728M, this.f6729N);
        if (z11 || a10) {
            this.f6734b = true;
            try {
                Z(this.f6728M, this.f6729N);
            } finally {
                d();
            }
        }
        n0();
        w();
        this.f6735c.f6916b.values().removeAll(Collections.singleton(null));
    }

    public final void D(ArrayList<C0527a> arrayList, ArrayList<Boolean> arrayList2, int i9, int i10) {
        ArrayList<w.a> arrayList3;
        v vVar;
        v vVar2;
        v vVar3;
        int i11;
        int i12;
        int i13;
        ArrayList<C0527a> arrayList4 = arrayList;
        ArrayList<Boolean> arrayList5 = arrayList2;
        boolean z10 = arrayList4.get(i9).f6933p;
        ArrayList<Fragment> arrayList6 = this.f6730O;
        if (arrayList6 == null) {
            this.f6730O = new ArrayList<>();
        } else {
            arrayList6.clear();
        }
        ArrayList<Fragment> arrayList7 = this.f6730O;
        v vVar4 = this.f6735c;
        arrayList7.addAll(vVar4.f());
        Fragment fragment = this.f6716A;
        int i14 = i9;
        boolean z11 = false;
        while (true) {
            int i15 = 1;
            if (i14 >= i10) {
                v vVar5 = vVar4;
                this.f6730O.clear();
                if (!z10 && this.f6754w >= 1) {
                    for (int i16 = i9; i16 < i10; i16++) {
                        Iterator<w.a> it = arrayList.get(i16).f6919a.iterator();
                        while (it.hasNext()) {
                            Fragment fragment2 = it.next().f6936b;
                            if (fragment2 == null || fragment2.mFragmentManager == null) {
                                vVar = vVar5;
                            } else {
                                vVar = vVar5;
                                vVar.g(h(fragment2));
                            }
                            vVar5 = vVar;
                        }
                    }
                }
                for (int i17 = i9; i17 < i10; i17++) {
                    C0527a c0527a = arrayList.get(i17);
                    if (arrayList2.get(i17).booleanValue()) {
                        c0527a.f(-1);
                        ArrayList<w.a> arrayList8 = c0527a.f6919a;
                        boolean z12 = true;
                        for (int size = arrayList8.size() - 1; size >= 0; size--) {
                            w.a aVar = arrayList8.get(size);
                            Fragment fragment3 = aVar.f6936b;
                            if (fragment3 != null) {
                                fragment3.mBeingSaved = c0527a.f6841u;
                                fragment3.setPopDirection(z12);
                                int i18 = c0527a.f6924f;
                                int i19 = 8194;
                                int i20 = 4097;
                                if (i18 != 4097) {
                                    if (i18 != 8194) {
                                        i19 = 4100;
                                        i20 = 8197;
                                        if (i18 != 8197) {
                                            if (i18 == 4099) {
                                                i19 = 4099;
                                            } else if (i18 != 4100) {
                                                i19 = 0;
                                            }
                                        }
                                    }
                                    i19 = i20;
                                }
                                fragment3.setNextTransition(i19);
                                fragment3.setSharedElementNames(c0527a.f6932o, c0527a.f6931n);
                            }
                            int i21 = aVar.f6935a;
                            FragmentManager fragmentManager = c0527a.f6838r;
                            switch (i21) {
                                case 1:
                                    fragment3.setAnimations(aVar.f6938d, aVar.f6939e, aVar.f6940f, aVar.f6941g);
                                    z12 = true;
                                    fragmentManager.e0(fragment3, true);
                                    fragmentManager.Y(fragment3);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f6935a);
                                case 3:
                                    fragment3.setAnimations(aVar.f6938d, aVar.f6939e, aVar.f6940f, aVar.f6941g);
                                    fragmentManager.a(fragment3);
                                    z12 = true;
                                case 4:
                                    fragment3.setAnimations(aVar.f6938d, aVar.f6939e, aVar.f6940f, aVar.f6941g);
                                    fragmentManager.getClass();
                                    k0(fragment3);
                                    z12 = true;
                                case 5:
                                    fragment3.setAnimations(aVar.f6938d, aVar.f6939e, aVar.f6940f, aVar.f6941g);
                                    fragmentManager.e0(fragment3, true);
                                    fragmentManager.N(fragment3);
                                    z12 = true;
                                case 6:
                                    fragment3.setAnimations(aVar.f6938d, aVar.f6939e, aVar.f6940f, aVar.f6941g);
                                    fragmentManager.c(fragment3);
                                    z12 = true;
                                case 7:
                                    fragment3.setAnimations(aVar.f6938d, aVar.f6939e, aVar.f6940f, aVar.f6941g);
                                    fragmentManager.e0(fragment3, true);
                                    fragmentManager.i(fragment3);
                                    z12 = true;
                                case 8:
                                    fragmentManager.i0(null);
                                    z12 = true;
                                case 9:
                                    fragmentManager.i0(fragment3);
                                    z12 = true;
                                case 10:
                                    fragmentManager.h0(fragment3, aVar.f6942h);
                                    z12 = true;
                            }
                        }
                    } else {
                        c0527a.f(1);
                        ArrayList<w.a> arrayList9 = c0527a.f6919a;
                        int size2 = arrayList9.size();
                        int i22 = 0;
                        while (i22 < size2) {
                            w.a aVar2 = arrayList9.get(i22);
                            Fragment fragment4 = aVar2.f6936b;
                            if (fragment4 != null) {
                                fragment4.mBeingSaved = c0527a.f6841u;
                                fragment4.setPopDirection(false);
                                fragment4.setNextTransition(c0527a.f6924f);
                                fragment4.setSharedElementNames(c0527a.f6931n, c0527a.f6932o);
                            }
                            int i23 = aVar2.f6935a;
                            FragmentManager fragmentManager2 = c0527a.f6838r;
                            switch (i23) {
                                case 1:
                                    arrayList3 = arrayList9;
                                    fragment4.setAnimations(aVar2.f6938d, aVar2.f6939e, aVar2.f6940f, aVar2.f6941g);
                                    fragmentManager2.e0(fragment4, false);
                                    fragmentManager2.a(fragment4);
                                    i22++;
                                    arrayList9 = arrayList3;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + aVar2.f6935a);
                                case 3:
                                    arrayList3 = arrayList9;
                                    fragment4.setAnimations(aVar2.f6938d, aVar2.f6939e, aVar2.f6940f, aVar2.f6941g);
                                    fragmentManager2.Y(fragment4);
                                    i22++;
                                    arrayList9 = arrayList3;
                                case 4:
                                    arrayList3 = arrayList9;
                                    fragment4.setAnimations(aVar2.f6938d, aVar2.f6939e, aVar2.f6940f, aVar2.f6941g);
                                    fragmentManager2.N(fragment4);
                                    i22++;
                                    arrayList9 = arrayList3;
                                case 5:
                                    arrayList3 = arrayList9;
                                    fragment4.setAnimations(aVar2.f6938d, aVar2.f6939e, aVar2.f6940f, aVar2.f6941g);
                                    fragmentManager2.e0(fragment4, false);
                                    k0(fragment4);
                                    i22++;
                                    arrayList9 = arrayList3;
                                case 6:
                                    arrayList3 = arrayList9;
                                    fragment4.setAnimations(aVar2.f6938d, aVar2.f6939e, aVar2.f6940f, aVar2.f6941g);
                                    fragmentManager2.i(fragment4);
                                    i22++;
                                    arrayList9 = arrayList3;
                                case 7:
                                    arrayList3 = arrayList9;
                                    fragment4.setAnimations(aVar2.f6938d, aVar2.f6939e, aVar2.f6940f, aVar2.f6941g);
                                    fragmentManager2.e0(fragment4, false);
                                    fragmentManager2.c(fragment4);
                                    i22++;
                                    arrayList9 = arrayList3;
                                case 8:
                                    fragmentManager2.i0(fragment4);
                                    arrayList3 = arrayList9;
                                    i22++;
                                    arrayList9 = arrayList3;
                                case 9:
                                    fragmentManager2.i0(null);
                                    arrayList3 = arrayList9;
                                    i22++;
                                    arrayList9 = arrayList3;
                                case 10:
                                    fragmentManager2.h0(fragment4, aVar2.i);
                                    arrayList3 = arrayList9;
                                    i22++;
                                    arrayList9 = arrayList3;
                            }
                        }
                    }
                }
                boolean booleanValue = arrayList2.get(i10 - 1).booleanValue();
                ArrayList<n> arrayList10 = this.f6746o;
                if (z11 && !arrayList10.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator<C0527a> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.addAll(I(it2.next()));
                    }
                    if (this.f6740h == null) {
                        Iterator<n> it3 = arrayList10.iterator();
                        while (it3.hasNext()) {
                            n next = it3.next();
                            Iterator it4 = linkedHashSet.iterator();
                            while (it4.hasNext()) {
                                next.b((Fragment) it4.next(), booleanValue);
                            }
                        }
                        Iterator<n> it5 = arrayList10.iterator();
                        while (it5.hasNext()) {
                            n next2 = it5.next();
                            Iterator it6 = linkedHashSet.iterator();
                            while (it6.hasNext()) {
                                next2.a((Fragment) it6.next(), booleanValue);
                            }
                        }
                    }
                }
                for (int i24 = i9; i24 < i10; i24++) {
                    C0527a c0527a2 = arrayList.get(i24);
                    if (booleanValue) {
                        for (int size3 = c0527a2.f6919a.size() - 1; size3 >= 0; size3--) {
                            Fragment fragment5 = c0527a2.f6919a.get(size3).f6936b;
                            if (fragment5 != null) {
                                h(fragment5).k();
                            }
                        }
                    } else {
                        Iterator<w.a> it7 = c0527a2.f6919a.iterator();
                        while (it7.hasNext()) {
                            Fragment fragment6 = it7.next().f6936b;
                            if (fragment6 != null) {
                                h(fragment6).k();
                            }
                        }
                    }
                }
                S(this.f6754w, true);
                int i25 = i9;
                Iterator it8 = g(arrayList, i25, i10).iterator();
                while (it8.hasNext()) {
                    SpecialEffectsController specialEffectsController = (SpecialEffectsController) it8.next();
                    specialEffectsController.f6813e = booleanValue;
                    specialEffectsController.k();
                    specialEffectsController.e();
                }
                while (i25 < i10) {
                    C0527a c0527a3 = arrayList.get(i25);
                    if (arrayList2.get(i25).booleanValue() && c0527a3.f6840t >= 0) {
                        c0527a3.f6840t = -1;
                    }
                    if (c0527a3.f6934q != null) {
                        for (int i26 = 0; i26 < c0527a3.f6934q.size(); i26++) {
                            c0527a3.f6934q.get(i26).run();
                        }
                        c0527a3.f6934q = null;
                    }
                    i25++;
                }
                if (z11) {
                    for (int i27 = 0; i27 < arrayList10.size(); i27++) {
                        arrayList10.get(i27).getClass();
                    }
                    return;
                }
                return;
            }
            C0527a c0527a4 = arrayList4.get(i14);
            if (arrayList5.get(i14).booleanValue()) {
                vVar2 = vVar4;
                int i28 = 1;
                ArrayList<Fragment> arrayList11 = this.f6730O;
                ArrayList<w.a> arrayList12 = c0527a4.f6919a;
                int size4 = arrayList12.size() - 1;
                while (size4 >= 0) {
                    w.a aVar3 = arrayList12.get(size4);
                    int i29 = aVar3.f6935a;
                    if (i29 != i28) {
                        if (i29 != 3) {
                            switch (i29) {
                                case 8:
                                    fragment = null;
                                    break;
                                case 9:
                                    fragment = aVar3.f6936b;
                                    break;
                                case 10:
                                    aVar3.i = aVar3.f6942h;
                                    break;
                            }
                            size4--;
                            i28 = 1;
                        }
                        arrayList11.add(aVar3.f6936b);
                        size4--;
                        i28 = 1;
                    }
                    arrayList11.remove(aVar3.f6936b);
                    size4--;
                    i28 = 1;
                }
            } else {
                ArrayList<Fragment> arrayList13 = this.f6730O;
                int i30 = 0;
                while (true) {
                    ArrayList<w.a> arrayList14 = c0527a4.f6919a;
                    if (i30 < arrayList14.size()) {
                        w.a aVar4 = arrayList14.get(i30);
                        int i31 = aVar4.f6935a;
                        if (i31 != i15) {
                            if (i31 != 2) {
                                if (i31 == 3 || i31 == 6) {
                                    arrayList13.remove(aVar4.f6936b);
                                    Fragment fragment7 = aVar4.f6936b;
                                    if (fragment7 == fragment) {
                                        arrayList14.add(i30, new w.a(fragment7, 9));
                                        i30++;
                                        vVar3 = vVar4;
                                        i11 = 1;
                                        fragment = null;
                                    }
                                } else if (i31 == 7) {
                                    vVar3 = vVar4;
                                    i11 = 1;
                                } else if (i31 == 8) {
                                    arrayList14.add(i30, new w.a(fragment, 9, 0));
                                    aVar4.f6937c = true;
                                    i30++;
                                    fragment = aVar4.f6936b;
                                }
                                vVar3 = vVar4;
                                i11 = 1;
                            } else {
                                Fragment fragment8 = aVar4.f6936b;
                                int i32 = fragment8.mContainerId;
                                int size5 = arrayList13.size() - 1;
                                boolean z13 = false;
                                while (size5 >= 0) {
                                    v vVar6 = vVar4;
                                    Fragment fragment9 = arrayList13.get(size5);
                                    if (fragment9.mContainerId != i32) {
                                        i12 = i32;
                                    } else if (fragment9 == fragment8) {
                                        i12 = i32;
                                        z13 = true;
                                    } else {
                                        if (fragment9 == fragment) {
                                            i12 = i32;
                                            arrayList14.add(i30, new w.a(fragment9, 9, 0));
                                            i30++;
                                            i13 = 0;
                                            fragment = null;
                                        } else {
                                            i12 = i32;
                                            i13 = 0;
                                        }
                                        w.a aVar5 = new w.a(fragment9, 3, i13);
                                        aVar5.f6938d = aVar4.f6938d;
                                        aVar5.f6940f = aVar4.f6940f;
                                        aVar5.f6939e = aVar4.f6939e;
                                        aVar5.f6941g = aVar4.f6941g;
                                        arrayList14.add(i30, aVar5);
                                        arrayList13.remove(fragment9);
                                        i30++;
                                        fragment = fragment;
                                    }
                                    size5--;
                                    i32 = i12;
                                    vVar4 = vVar6;
                                }
                                vVar3 = vVar4;
                                i11 = 1;
                                if (z13) {
                                    arrayList14.remove(i30);
                                    i30--;
                                } else {
                                    aVar4.f6935a = 1;
                                    aVar4.f6937c = true;
                                    arrayList13.add(fragment8);
                                }
                            }
                            i30 += i11;
                            i15 = i11;
                            vVar4 = vVar3;
                        } else {
                            vVar3 = vVar4;
                            i11 = i15;
                        }
                        arrayList13.add(aVar4.f6936b);
                        i30 += i11;
                        i15 = i11;
                        vVar4 = vVar3;
                    } else {
                        vVar2 = vVar4;
                    }
                }
            }
            z11 = z11 || c0527a4.f6925g;
            i14++;
            arrayList4 = arrayList;
            arrayList5 = arrayList2;
            vVar4 = vVar2;
        }
    }

    public final int E(String str, int i9, boolean z10) {
        if (this.f6736d.isEmpty()) {
            return -1;
        }
        if (str == null && i9 < 0) {
            if (z10) {
                return 0;
            }
            return this.f6736d.size() - 1;
        }
        int size = this.f6736d.size() - 1;
        while (size >= 0) {
            C0527a c0527a = this.f6736d.get(size);
            if ((str != null && str.equals(c0527a.i)) || (i9 >= 0 && i9 == c0527a.f6840t)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z10) {
            if (size == this.f6736d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            C0527a c0527a2 = this.f6736d.get(size - 1);
            if ((str == null || !str.equals(c0527a2.i)) && (i9 < 0 || i9 != c0527a2.f6840t)) {
                return size;
            }
            size--;
        }
        return size;
    }

    public final Fragment F(int i9) {
        v vVar = this.f6735c;
        ArrayList<Fragment> arrayList = vVar.f6915a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Fragment fragment = arrayList.get(size);
            if (fragment != null && fragment.mFragmentId == i9) {
                return fragment;
            }
        }
        for (t tVar : vVar.f6916b.values()) {
            if (tVar != null) {
                Fragment fragment2 = tVar.f6904c;
                if (fragment2.mFragmentId == i9) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final Fragment G(String str) {
        v vVar = this.f6735c;
        if (str != null) {
            ArrayList<Fragment> arrayList = vVar.f6915a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Fragment fragment = arrayList.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (t tVar : vVar.f6916b.values()) {
                if (tVar != null) {
                    Fragment fragment2 = tVar.f6904c;
                    if (str.equals(fragment2.mTag)) {
                        return fragment2;
                    }
                }
            }
        } else {
            vVar.getClass();
        }
        return null;
    }

    public final void H() {
        Iterator it = f().iterator();
        while (it.hasNext()) {
            SpecialEffectsController specialEffectsController = (SpecialEffectsController) it.next();
            if (specialEffectsController.f6814f) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                specialEffectsController.f6814f = false;
                specialEffectsController.e();
            }
        }
    }

    public final Fragment J(String str, Bundle bundle) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment b9 = this.f6735c.b(string);
        if (b9 != null) {
            return b9;
        }
        m0(new IllegalStateException(s3.b.k("Fragment no longer exists for key ", str, ": unique id ", string)));
        throw null;
    }

    public final ViewGroup K(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f6756y.c()) {
            View b9 = this.f6756y.b(fragment.mContainerId);
            if (b9 instanceof ViewGroup) {
                return (ViewGroup) b9;
            }
        }
        return null;
    }

    public final androidx.fragment.app.k L() {
        Fragment fragment = this.f6757z;
        return fragment != null ? fragment.mFragmentManager.L() : this.f6717B;
    }

    public final H M() {
        Fragment fragment = this.f6757z;
        return fragment != null ? fragment.mFragmentManager.M() : this.f6718C;
    }

    public final void N(Fragment fragment) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        j0(fragment);
    }

    public final boolean P() {
        Fragment fragment = this.f6757z;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.f6757z.getParentFragmentManager().P();
    }

    public final boolean R() {
        return this.f6724I || this.f6725J;
    }

    public final void S(int i9, boolean z10) {
        HashMap<String, t> hashMap;
        androidx.fragment.app.l<?> lVar;
        if (this.f6755x == null && i9 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i9 != this.f6754w) {
            this.f6754w = i9;
            v vVar = this.f6735c;
            Iterator<Fragment> it = vVar.f6915a.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = vVar.f6916b;
                if (!hasNext) {
                    break;
                }
                t tVar = hashMap.get(it.next().mWho);
                if (tVar != null) {
                    tVar.k();
                }
            }
            for (t tVar2 : hashMap.values()) {
                if (tVar2 != null) {
                    tVar2.k();
                    Fragment fragment = tVar2.f6904c;
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        if (fragment.mBeingSaved && !vVar.f6917c.containsKey(fragment.mWho)) {
                            vVar.i(fragment.mWho, tVar2.n());
                        }
                        vVar.h(tVar2);
                    }
                }
            }
            l0();
            if (this.f6723H && (lVar = this.f6755x) != null && this.f6754w == 7) {
                lVar.h();
                this.f6723H = false;
            }
        }
    }

    public final void T() {
        if (this.f6755x == null) {
            return;
        }
        this.f6724I = false;
        this.f6725J = false;
        this.f6731P.f6885E0 = false;
        for (Fragment fragment : this.f6735c.f()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final boolean U() {
        return V(-1, 0);
    }

    public final boolean V(int i9, int i10) {
        B(false);
        A(true);
        Fragment fragment = this.f6716A;
        if (fragment != null && i9 < 0 && fragment.getChildFragmentManager().V(-1, 0)) {
            return true;
        }
        boolean W = W(this.f6728M, this.f6729N, null, i9, i10);
        if (W) {
            this.f6734b = true;
            try {
                Z(this.f6728M, this.f6729N);
            } finally {
                d();
            }
        }
        n0();
        w();
        this.f6735c.f6916b.values().removeAll(Collections.singleton(null));
        return W;
    }

    public final boolean W(ArrayList<C0527a> arrayList, ArrayList<Boolean> arrayList2, String str, int i9, int i10) {
        int E8 = E(str, i9, (i10 & 1) != 0);
        if (E8 < 0) {
            return false;
        }
        for (int size = this.f6736d.size() - 1; size >= E8; size--) {
            arrayList.add(this.f6736d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void X(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager == this) {
            bundle.putString(str, fragment.mWho);
        } else {
            m0(new IllegalStateException(androidx.camera.core.impl.utils.a.k("Fragment ", fragment, " is not currently in the FragmentManager")));
            throw null;
        }
    }

    public final void Y(Fragment fragment) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z10 = !fragment.isInBackStack();
        if (!fragment.mDetached || z10) {
            v vVar = this.f6735c;
            synchronized (vVar.f6915a) {
                vVar.f6915a.remove(fragment);
            }
            fragment.mAdded = false;
            if (O(fragment)) {
                this.f6723H = true;
            }
            fragment.mRemoving = true;
            j0(fragment);
        }
    }

    public final void Z(ArrayList<C0527a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            if (!arrayList.get(i9).f6933p) {
                if (i10 != i9) {
                    D(arrayList, arrayList2, i10, i9);
                }
                i10 = i9 + 1;
                if (arrayList2.get(i9).booleanValue()) {
                    while (i10 < size && arrayList2.get(i10).booleanValue() && !arrayList.get(i10).f6933p) {
                        i10++;
                    }
                }
                D(arrayList, arrayList2, i9, i10);
                i9 = i10 - 1;
            }
            i9++;
        }
        if (i10 != size) {
            D(arrayList, arrayList2, i10, size);
        }
    }

    public final t a(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            FragmentStrictMode.d(fragment, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        t h9 = h(fragment);
        fragment.mFragmentManager = this;
        v vVar = this.f6735c;
        vVar.g(h9);
        if (!fragment.mDetached) {
            vVar.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (O(fragment)) {
                this.f6723H = true;
            }
        }
        return h9;
    }

    public final void a0(Bundle bundle) {
        androidx.fragment.app.n nVar;
        t tVar;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f6755x.f6869b.getClassLoader());
                this.f6744m.put(str.substring(7), bundle3);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f6755x.f6869b.getClassLoader());
                hashMap.put(str2.substring(9), bundle2);
            }
        }
        v vVar = this.f6735c;
        HashMap<String, Bundle> hashMap2 = vVar.f6917c;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        HashMap<String, t> hashMap3 = vVar.f6916b;
        hashMap3.clear();
        Iterator<String> it = fragmentManagerState.f6783a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            nVar = this.f6747p;
            if (!hasNext) {
                break;
            }
            Bundle i9 = vVar.i(it.next(), null);
            if (i9 != null) {
                Fragment fragment = this.f6731P.f6886k.get(((FragmentState) i9.getParcelable("state")).f6792b);
                if (fragment != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
                    }
                    tVar = new t(nVar, vVar, fragment, i9);
                } else {
                    tVar = new t(this.f6747p, this.f6735c, this.f6755x.f6869b.getClassLoader(), L(), i9);
                }
                Fragment fragment2 = tVar.f6904c;
                fragment2.mSavedFragmentState = i9;
                fragment2.mFragmentManager = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragment2.mWho + "): " + fragment2);
                }
                tVar.l(this.f6755x.f6869b.getClassLoader());
                vVar.g(tVar);
                tVar.f6906e = this.f6754w;
            }
        }
        androidx.fragment.app.q qVar = this.f6731P;
        qVar.getClass();
        Iterator it2 = new ArrayList(qVar.f6886k.values()).iterator();
        while (it2.hasNext()) {
            Fragment fragment3 = (Fragment) it2.next();
            if (hashMap3.get(fragment3.mWho) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment3 + " that was not found in the set of active Fragments " + fragmentManagerState.f6783a);
                }
                this.f6731P.e(fragment3);
                fragment3.mFragmentManager = this;
                t tVar2 = new t(nVar, vVar, fragment3);
                tVar2.f6906e = 1;
                tVar2.k();
                fragment3.mRemoving = true;
                tVar2.k();
            }
        }
        ArrayList<String> arrayList = fragmentManagerState.f6784b;
        vVar.f6915a.clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                Fragment b9 = vVar.b(str3);
                if (b9 == null) {
                    throw new IllegalStateException(androidx.camera.core.n.a("No instantiated fragment for (", str3, ")"));
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + b9);
                }
                vVar.a(b9);
            }
        }
        if (fragmentManagerState.f6785c != null) {
            this.f6736d = new ArrayList<>(fragmentManagerState.f6785c.length);
            int i10 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f6785c;
                if (i10 >= backStackRecordStateArr.length) {
                    break;
                }
                BackStackRecordState backStackRecordState = backStackRecordStateArr[i10];
                backStackRecordState.getClass();
                C0527a c0527a = new C0527a(this);
                backStackRecordState.a(c0527a);
                c0527a.f6840t = backStackRecordState.f6614g;
                int i11 = 0;
                while (true) {
                    ArrayList<String> arrayList2 = backStackRecordState.f6609b;
                    if (i11 >= arrayList2.size()) {
                        break;
                    }
                    String str4 = arrayList2.get(i11);
                    if (str4 != null) {
                        c0527a.f6919a.get(i11).f6936b = vVar.b(str4);
                    }
                    i11++;
                }
                c0527a.f(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    StringBuilder l10 = com.google.android.gms.measurement.internal.a.l("restoreAllState: back stack #", i10, " (index ");
                    l10.append(c0527a.f6840t);
                    l10.append("): ");
                    l10.append(c0527a);
                    Log.v("FragmentManager", l10.toString());
                    PrintWriter printWriter = new PrintWriter(new F());
                    c0527a.k("  ", printWriter, false);
                    printWriter.close();
                }
                this.f6736d.add(c0527a);
                i10++;
            }
        } else {
            this.f6736d = new ArrayList<>();
        }
        this.f6742k.set(fragmentManagerState.f6786d);
        String str5 = fragmentManagerState.f6787e;
        if (str5 != null) {
            Fragment b10 = vVar.b(str5);
            this.f6716A = b10;
            s(b10);
        }
        ArrayList<String> arrayList3 = fragmentManagerState.f6788f;
        if (arrayList3 != null) {
            for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                this.f6743l.put(arrayList3.get(i12), fragmentManagerState.f6789g.get(i12));
            }
        }
        this.f6722G = new ArrayDeque<>(fragmentManagerState.f6790h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(androidx.fragment.app.l<?> lVar, androidx.fragment.app.i iVar, Fragment fragment) {
        if (this.f6755x != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f6755x = lVar;
        this.f6756y = iVar;
        this.f6757z = fragment;
        CopyOnWriteArrayList<androidx.fragment.app.r> copyOnWriteArrayList = this.f6748q;
        if (fragment != null) {
            copyOnWriteArrayList.add(new h(fragment));
        } else if (lVar instanceof androidx.fragment.app.r) {
            copyOnWriteArrayList.add((androidx.fragment.app.r) lVar);
        }
        if (this.f6757z != null) {
            n0();
        }
        if (lVar instanceof InterfaceC0619j) {
            InterfaceC0619j interfaceC0619j = (InterfaceC0619j) lVar;
            androidx.activity.a onBackPressedDispatcher = interfaceC0619j.getOnBackPressedDispatcher();
            this.f6739g = onBackPressedDispatcher;
            androidx.lifecycle.r rVar = interfaceC0619j;
            if (fragment != null) {
                rVar = fragment;
            }
            onBackPressedDispatcher.a(rVar, this.f6741j);
        }
        if (fragment != null) {
            androidx.fragment.app.q qVar = fragment.mFragmentManager.f6731P;
            HashMap<String, androidx.fragment.app.q> hashMap = qVar.f6887p;
            androidx.fragment.app.q qVar2 = hashMap.get(fragment.mWho);
            if (qVar2 == null) {
                qVar2 = new androidx.fragment.app.q(qVar.f6883C0);
                hashMap.put(fragment.mWho, qVar2);
            }
            this.f6731P = qVar2;
        } else if (lVar instanceof X) {
            R0.e eVar = new R0.e(((X) lVar).getViewModelStore(), androidx.fragment.app.q.f6881F0, a.C0040a.f3236b);
            kotlin.jvm.internal.b a10 = kotlin.jvm.internal.h.a(androidx.fragment.app.q.class);
            String b9 = a10.b();
            if (b9 == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
            }
            this.f6731P = (androidx.fragment.app.q) eVar.a(a10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b9));
        } else {
            this.f6731P = new androidx.fragment.app.q(false);
        }
        this.f6731P.f6885E0 = R();
        this.f6735c.f6918d = this.f6731P;
        Object obj = this.f6755x;
        if ((obj instanceof InterfaceC0584d) && fragment == null) {
            C0582b savedStateRegistry = ((InterfaceC0584d) obj).getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new W0.e(this, 3));
            Bundle a11 = savedStateRegistry.a("android:support:fragments");
            if (a11 != null) {
                a0(a11);
            }
        }
        Object obj2 = this.f6755x;
        if (obj2 instanceof e.f) {
            androidx.activity.result.a activityResultRegistry = ((e.f) obj2).getActivityResultRegistry();
            String j10 = s3.b.j("FragmentManager:", fragment != null ? androidx.camera.core.impl.utils.a.n(new StringBuilder(), fragment.mWho, com.sumsub.sns.internal.core.data.model.p.f15541a) : "");
            this.f6719D = activityResultRegistry.d(C.v.n(j10, "StartActivityForResult"), new f.h(), new i());
            this.f6720E = activityResultRegistry.d(C.v.n(j10, "StartIntentSenderForResult"), new k(), new j());
            this.f6721F = activityResultRegistry.d(C.v.n(j10, "RequestPermissions"), new f.f(), new a());
        }
        Object obj3 = this.f6755x;
        if (obj3 instanceof InterfaceC0915c) {
            ((InterfaceC0915c) obj3).addOnConfigurationChangedListener(this.f6749r);
        }
        Object obj4 = this.f6755x;
        if (obj4 instanceof InterfaceC0916d) {
            ((InterfaceC0916d) obj4).addOnTrimMemoryListener(this.f6750s);
        }
        Object obj5 = this.f6755x;
        if (obj5 instanceof InterfaceC0869A) {
            ((InterfaceC0869A) obj5).addOnMultiWindowModeChangedListener(this.f6751t);
        }
        Object obj6 = this.f6755x;
        if (obj6 instanceof InterfaceC0870B) {
            ((InterfaceC0870B) obj6).addOnPictureInPictureModeChangedListener(this.f6752u);
        }
        Object obj7 = this.f6755x;
        if ((obj7 instanceof InterfaceC1604h) && fragment == null) {
            ((InterfaceC1604h) obj7).addMenuProvider(this.f6753v);
        }
    }

    public final Bundle b0() {
        BackStackRecordState[] backStackRecordStateArr;
        ArrayList<String> arrayList;
        Bundle bundle = new Bundle();
        H();
        y();
        B(true);
        this.f6724I = true;
        this.f6731P.f6885E0 = true;
        v vVar = this.f6735c;
        vVar.getClass();
        HashMap<String, t> hashMap = vVar.f6916b;
        ArrayList<String> arrayList2 = new ArrayList<>(hashMap.size());
        for (t tVar : hashMap.values()) {
            if (tVar != null) {
                Fragment fragment = tVar.f6904c;
                vVar.i(fragment.mWho, tVar.n());
                arrayList2.add(fragment.mWho);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + fragment.mSavedFragmentState);
                }
            }
        }
        HashMap<String, Bundle> hashMap2 = this.f6735c.f6917c;
        if (!hashMap2.isEmpty()) {
            v vVar2 = this.f6735c;
            synchronized (vVar2.f6915a) {
                try {
                    backStackRecordStateArr = null;
                    if (vVar2.f6915a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList<>(vVar2.f6915a.size());
                        Iterator<Fragment> it = vVar2.f6915a.iterator();
                        while (it.hasNext()) {
                            Fragment next = it.next();
                            arrayList.add(next.mWho);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + next.mWho + "): " + next);
                            }
                        }
                    }
                } finally {
                }
            }
            int size = this.f6736d.size();
            if (size > 0) {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i9 = 0; i9 < size; i9++) {
                    backStackRecordStateArr[i9] = new BackStackRecordState(this.f6736d.get(i9));
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder l10 = com.google.android.gms.measurement.internal.a.l("saveAllState: adding back stack #", i9, ": ");
                        l10.append(this.f6736d.get(i9));
                        Log.v("FragmentManager", l10.toString());
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f6783a = arrayList2;
            fragmentManagerState.f6784b = arrayList;
            fragmentManagerState.f6785c = backStackRecordStateArr;
            fragmentManagerState.f6786d = this.f6742k.get();
            Fragment fragment2 = this.f6716A;
            if (fragment2 != null) {
                fragmentManagerState.f6787e = fragment2.mWho;
            }
            fragmentManagerState.f6788f.addAll(this.f6743l.keySet());
            fragmentManagerState.f6789g.addAll(this.f6743l.values());
            fragmentManagerState.f6790h = new ArrayList<>(this.f6722G);
            bundle.putParcelable("state", fragmentManagerState);
            for (String str : this.f6744m.keySet()) {
                bundle.putBundle(s3.b.j("result_", str), this.f6744m.get(str));
            }
            for (String str2 : hashMap2.keySet()) {
                bundle.putBundle(s3.b.j("fragment_", str2), hashMap2.get(str2));
            }
        } else if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public final void c(Fragment fragment) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f6735c.a(fragment);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (O(fragment)) {
                this.f6723H = true;
            }
        }
    }

    public final Fragment.SavedState c0(Fragment fragment) {
        t tVar = this.f6735c.f6916b.get(fragment.mWho);
        if (tVar != null) {
            Fragment fragment2 = tVar.f6904c;
            if (fragment2.equals(fragment)) {
                if (fragment2.mState > -1) {
                    return new Fragment.SavedState(tVar.n());
                }
                return null;
            }
        }
        m0(new IllegalStateException(androidx.camera.core.impl.utils.a.k("Fragment ", fragment, " is not currently in the FragmentManager")));
        throw null;
    }

    public final void d() {
        this.f6734b = false;
        this.f6729N.clear();
        this.f6728M.clear();
    }

    public final void d0() {
        synchronized (this.f6733a) {
            try {
                if (this.f6733a.size() == 1) {
                    this.f6755x.f6870c.removeCallbacks(this.f6732Q);
                    this.f6755x.f6870c.post(this.f6732Q);
                    n0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(String str) {
        this.f6744m.remove(str);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Clearing fragment result with key " + str);
        }
    }

    public final void e0(Fragment fragment, boolean z10) {
        ViewGroup K2 = K(fragment);
        if (K2 == null || !(K2 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) K2).setDrawDisappearingViewsLast(!z10);
    }

    public final HashSet f() {
        Object defaultSpecialEffectsController;
        HashSet hashSet = new HashSet();
        Iterator it = this.f6735c.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((t) it.next()).f6904c.mContainer;
            if (viewGroup != null) {
                M();
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof SpecialEffectsController) {
                    defaultSpecialEffectsController = (SpecialEffectsController) tag;
                } else {
                    defaultSpecialEffectsController = new DefaultSpecialEffectsController(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, defaultSpecialEffectsController);
                }
                hashSet.add(defaultSpecialEffectsController);
            }
        }
        return hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f0(java.lang.String r4, android.os.Bundle r5) {
        /*
            r3 = this;
            java.util.Map<java.lang.String, androidx.fragment.app.FragmentManager$m> r0 = r3.f6745n
            java.lang.Object r0 = r0.get(r4)
            androidx.fragment.app.FragmentManager$m r0 = (androidx.fragment.app.FragmentManager.m) r0
            if (r0 == 0) goto L1c
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.f6978d
            androidx.lifecycle.Lifecycle r2 = r0.f6772a
            androidx.lifecycle.Lifecycle$State r2 = r2.b()
            boolean r1 = r2.a(r1)
            if (r1 == 0) goto L1c
            r0.b(r4, r5)
            goto L21
        L1c:
            java.util.Map<java.lang.String, android.os.Bundle> r0 = r3.f6744m
            r0.put(r4, r5)
        L21:
            r0 = 2
            java.lang.String r1 = "FragmentManager"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L43
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Setting fragment result with key "
            r0.<init>(r2)
            r0.append(r4)
            java.lang.String r4 = " and result "
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = r0.toString()
            android.util.Log.v(r1, r4)
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.f0(java.lang.String, android.os.Bundle):void");
    }

    public final HashSet g(ArrayList arrayList, int i9, int i10) {
        ViewGroup viewGroup;
        Object defaultSpecialEffectsController;
        HashSet hashSet = new HashSet();
        while (i9 < i10) {
            Iterator<w.a> it = ((C0527a) arrayList.get(i9)).f6919a.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f6936b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    M();
                    Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                    if (tag instanceof SpecialEffectsController) {
                        defaultSpecialEffectsController = (SpecialEffectsController) tag;
                    } else {
                        defaultSpecialEffectsController = new DefaultSpecialEffectsController(viewGroup);
                        viewGroup.setTag(R.id.special_effects_controller_view_tag, defaultSpecialEffectsController);
                    }
                    hashSet.add(defaultSpecialEffectsController);
                }
            }
            i9++;
        }
        return hashSet;
    }

    public final void g0(String str, androidx.lifecycle.r rVar, androidx.fragment.app.s sVar) {
        Lifecycle lifecycle = rVar.getLifecycle();
        if (lifecycle.b() == Lifecycle.State.f6975a) {
            return;
        }
        g gVar = new g(str, sVar, lifecycle);
        m put = this.f6745n.put(str, new m(lifecycle, sVar, gVar));
        if (put != null) {
            put.f6772a.c(put.i);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Setting FragmentResultListener with key " + str + " lifecycleOwner " + lifecycle + " and listener " + sVar);
        }
        lifecycle.a(gVar);
    }

    public final t h(Fragment fragment) {
        String str = fragment.mWho;
        v vVar = this.f6735c;
        t tVar = vVar.f6916b.get(str);
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = new t(this.f6747p, vVar, fragment);
        tVar2.l(this.f6755x.f6869b.getClassLoader());
        tVar2.f6906e = this.f6754w;
        return tVar2;
    }

    public final void h0(Fragment fragment, Lifecycle.State state) {
        if (fragment.equals(this.f6735c.b(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = state;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public final void i(Fragment fragment) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            v vVar = this.f6735c;
            synchronized (vVar.f6915a) {
                vVar.f6915a.remove(fragment);
            }
            fragment.mAdded = false;
            if (O(fragment)) {
                this.f6723H = true;
            }
            j0(fragment);
        }
    }

    public final void i0(Fragment fragment) {
        if (fragment != null) {
            if (!fragment.equals(this.f6735c.b(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this)) {
                throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
            }
        }
        Fragment fragment2 = this.f6716A;
        this.f6716A = fragment;
        s(fragment2);
        s(this.f6716A);
    }

    public final void j(boolean z10, Configuration configuration) {
        if (z10 && (this.f6755x instanceof InterfaceC0915c)) {
            m0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f6735c.f()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z10) {
                    fragment.mChildFragmentManager.j(true, configuration);
                }
            }
        }
    }

    public final void j0(Fragment fragment) {
        ViewGroup K2 = K(fragment);
        if (K2 != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                if (K2.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    K2.setTag(R.id.visible_removing_fragment_view_tag, fragment);
                }
                ((Fragment) K2.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    public final boolean k(MenuItem menuItem) {
        if (this.f6754w < 1) {
            return false;
        }
        for (Fragment fragment : this.f6735c.f()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean l(Menu menu, MenuInflater menuInflater) {
        if (this.f6754w < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z10 = false;
        for (Fragment fragment : this.f6735c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z10 = true;
            }
        }
        if (this.f6737e != null) {
            for (int i9 = 0; i9 < this.f6737e.size(); i9++) {
                Fragment fragment2 = this.f6737e.get(i9);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f6737e = arrayList;
        return z10;
    }

    public final void l0() {
        Iterator it = this.f6735c.d().iterator();
        while (it.hasNext()) {
            t tVar = (t) it.next();
            Fragment fragment = tVar.f6904c;
            if (fragment.mDeferStart) {
                if (this.f6734b) {
                    this.f6727L = true;
                } else {
                    fragment.mDeferStart = false;
                    tVar.k();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (r0 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m() {
        /*
            r6 = this;
            r0 = 1
            r6.f6726K = r0
            r6.B(r0)
            r6.y()
            androidx.fragment.app.l<?> r1 = r6.f6755x
            boolean r2 = r1 instanceof androidx.lifecycle.X
            androidx.fragment.app.v r3 = r6.f6735c
            if (r2 == 0) goto L16
            androidx.fragment.app.q r0 = r3.f6918d
            boolean r0 = r0.f6884D0
            goto L23
        L16:
            android.content.Context r1 = r1.f6869b
            boolean r2 = r1 instanceof android.app.Activity
            if (r2 == 0) goto L25
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r1 = r1.isChangingConfigurations()
            r0 = r0 ^ r1
        L23:
            if (r0 == 0) goto L54
        L25:
            java.util.Map<java.lang.String, androidx.fragment.app.BackStackState> r0 = r6.f6743l
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L2f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L54
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.BackStackState r1 = (androidx.fragment.app.BackStackState) r1
            java.util.List<java.lang.String> r1 = r1.f6621a
            java.util.Iterator r1 = r1.iterator()
        L41:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            androidx.fragment.app.q r4 = r3.f6918d
            r5 = 0
            r4.c(r2, r5)
            goto L41
        L54:
            r0 = -1
            r6.v(r0)
            androidx.fragment.app.l<?> r0 = r6.f6755x
            boolean r1 = r0 instanceof k0.InterfaceC0916d
            if (r1 == 0) goto L65
            k0.d r0 = (k0.InterfaceC0916d) r0
            androidx.fragment.app.o r1 = r6.f6750s
            r0.removeOnTrimMemoryListener(r1)
        L65:
            androidx.fragment.app.l<?> r0 = r6.f6755x
            boolean r1 = r0 instanceof k0.InterfaceC0915c
            if (r1 == 0) goto L72
            k0.c r0 = (k0.InterfaceC0915c) r0
            androidx.fragment.app.o r1 = r6.f6749r
            r0.removeOnConfigurationChangedListener(r1)
        L72:
            androidx.fragment.app.l<?> r0 = r6.f6755x
            boolean r1 = r0 instanceof j0.InterfaceC0869A
            if (r1 == 0) goto L7f
            j0.A r0 = (j0.InterfaceC0869A) r0
            androidx.fragment.app.o r1 = r6.f6751t
            r0.removeOnMultiWindowModeChangedListener(r1)
        L7f:
            androidx.fragment.app.l<?> r0 = r6.f6755x
            boolean r1 = r0 instanceof j0.InterfaceC0870B
            if (r1 == 0) goto L8c
            j0.B r0 = (j0.InterfaceC0870B) r0
            androidx.fragment.app.o r1 = r6.f6752u
            r0.removeOnPictureInPictureModeChangedListener(r1)
        L8c:
            androidx.fragment.app.l<?> r0 = r6.f6755x
            boolean r1 = r0 instanceof y0.InterfaceC1604h
            if (r1 == 0) goto L9d
            androidx.fragment.app.Fragment r1 = r6.f6757z
            if (r1 != 0) goto L9d
            y0.h r0 = (y0.InterfaceC1604h) r0
            androidx.fragment.app.FragmentManager$c r1 = r6.f6753v
            r0.removeMenuProvider(r1)
        L9d:
            r0 = 0
            r6.f6755x = r0
            r6.f6756y = r0
            r6.f6757z = r0
            androidx.activity.a r1 = r6.f6739g
            if (r1 == 0) goto Lc2
            androidx.fragment.app.FragmentManager$b r1 = r6.f6741j
            java.util.concurrent.CopyOnWriteArrayList<c.c> r1 = r1.f8506b
            java.util.Iterator r1 = r1.iterator()
        Lb0:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lc0
            java.lang.Object r2 = r1.next()
            c.c r2 = (c.InterfaceC0612c) r2
            r2.cancel()
            goto Lb0
        Lc0:
            r6.f6739g = r0
        Lc2:
            e.e r0 = r6.f6719D
            if (r0 == 0) goto Ld3
            r0.b()
            e.e r0 = r6.f6720E
            r0.b()
            e.e r0 = r6.f6721F
            r0.b()
        Ld3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.m():void");
    }

    public final void m0(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new F());
        androidx.fragment.app.l<?> lVar = this.f6755x;
        if (lVar != null) {
            try {
                lVar.d(printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e10) {
                Log.e("FragmentManager", "Failed dumping state", e10);
                throw runtimeException;
            }
        }
        try {
            x("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e11) {
            Log.e("FragmentManager", "Failed dumping state", e11);
            throw runtimeException;
        }
    }

    public final void n(boolean z10) {
        if (z10 && (this.f6755x instanceof InterfaceC0916d)) {
            m0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f6735c.f()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z10) {
                    fragment.mChildFragmentManager.n(true);
                }
            }
        }
    }

    public final void n0() {
        synchronized (this.f6733a) {
            try {
                if (!this.f6733a.isEmpty()) {
                    this.f6741j.e(true);
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z10 = this.f6736d.size() + (this.f6740h != null ? 1 : 0) > 0 && Q(this.f6757z);
                if (Log.isLoggable("FragmentManager", 3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z10);
                }
                this.f6741j.e(z10);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o(boolean z10, boolean z11) {
        if (z11 && (this.f6755x instanceof InterfaceC0869A)) {
            m0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f6735c.f()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z10);
                if (z11) {
                    fragment.mChildFragmentManager.o(z10, true);
                }
            }
        }
    }

    public final void p() {
        Iterator it = this.f6735c.e().iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.p();
            }
        }
    }

    public final boolean q(MenuItem menuItem) {
        if (this.f6754w < 1) {
            return false;
        }
        for (Fragment fragment : this.f6735c.f()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void r(Menu menu) {
        if (this.f6754w < 1) {
            return;
        }
        for (Fragment fragment : this.f6735c.f()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void s(Fragment fragment) {
        if (fragment != null) {
            if (fragment.equals(this.f6735c.b(fragment.mWho))) {
                fragment.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final void t(boolean z10, boolean z11) {
        if (z11 && (this.f6755x instanceof InterfaceC0870B)) {
            m0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f6735c.f()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z10);
                if (z11) {
                    fragment.mChildFragmentManager.t(z10, true);
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.f6757z;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f6757z)));
            sb2.append("}");
        } else {
            androidx.fragment.app.l<?> lVar = this.f6755x;
            if (lVar != null) {
                sb2.append(lVar.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f6755x)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    public final boolean u(Menu menu) {
        boolean z10 = false;
        if (this.f6754w < 1) {
            return false;
        }
        for (Fragment fragment : this.f6735c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performPrepareOptionsMenu(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    public final void v(int i9) {
        try {
            this.f6734b = true;
            for (t tVar : this.f6735c.f6916b.values()) {
                if (tVar != null) {
                    tVar.f6906e = i9;
                }
            }
            S(i9, false);
            Iterator it = f().iterator();
            while (it.hasNext()) {
                ((SpecialEffectsController) it.next()).h();
            }
            this.f6734b = false;
            B(true);
        } catch (Throwable th) {
            this.f6734b = false;
            throw th;
        }
    }

    public final void w() {
        if (this.f6727L) {
            this.f6727L = false;
            l0();
        }
    }

    public final void x(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String n10 = C.v.n(str, "    ");
        v vVar = this.f6735c;
        vVar.getClass();
        String str2 = str + "    ";
        HashMap<String, t> hashMap = vVar.f6916b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (t tVar : hashMap.values()) {
                printWriter.print(str);
                if (tVar != null) {
                    Fragment fragment = tVar.f6904c;
                    printWriter.println(fragment);
                    fragment.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList<Fragment> arrayList = vVar.f6915a;
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i9 = 0; i9 < size2; i9++) {
                Fragment fragment2 = arrayList.get(i9);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i9);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList<Fragment> arrayList2 = this.f6737e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size; i10++) {
                Fragment fragment3 = this.f6737e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        int size3 = this.f6736d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size3; i11++) {
                C0527a c0527a = this.f6736d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(c0527a.toString());
                c0527a.k(n10, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f6742k.get());
        synchronized (this.f6733a) {
            try {
                int size4 = this.f6733a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i12 = 0; i12 < size4; i12++) {
                        Object obj = (o) this.f6733a.get(i12);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i12);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f6755x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f6756y);
        if (this.f6757z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f6757z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f6754w);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f6724I);
        printWriter.print(" mStopped=");
        printWriter.print(this.f6725J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f6726K);
        if (this.f6723H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f6723H);
        }
    }

    public final void y() {
        Iterator it = f().iterator();
        while (it.hasNext()) {
            ((SpecialEffectsController) it.next()).h();
        }
    }

    public final void z(o oVar, boolean z10) {
        if (!z10) {
            if (this.f6755x == null) {
                if (!this.f6726K) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (R()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f6733a) {
            try {
                if (this.f6755x == null) {
                    if (!z10) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f6733a.add(oVar);
                    d0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static abstract class l {
        public abstract void j(FragmentManager fragmentManager, Fragment fragment, View view);

        public void a(Fragment fragment) {
        }

        public void b(Fragment fragment) {
        }

        public void c(Fragment fragment) {
        }

        public void d(Fragment fragment) {
        }

        public void e(Fragment fragment) {
        }

        public void f(Fragment fragment) {
        }

        public void g(Fragment fragment) {
        }

        public void h(Fragment fragment) {
        }

        public void i(Fragment fragment) {
        }

        public void k(Fragment fragment) {
        }
    }

    public interface n {
        default void a(Fragment fragment, boolean z10) {
        }

        default void b(Fragment fragment, boolean z10) {
        }
    }
}

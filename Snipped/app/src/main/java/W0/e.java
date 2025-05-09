package W0;

import P9.h;
import P9.m;
import U0.j;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.ActivityC0533g;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.G;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavBackStackEntryState;
import androidx.navigation.Navigator;
import androidx.navigation.fragment.NavHostFragment;
import b1.C0582b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements C0582b.InterfaceC0093b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3788a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3789b;

    public /* synthetic */ e(Object obj, int i) {
        this.f3788a = i;
        this.f3789b = obj;
    }

    @Override // b1.C0582b.InterfaceC0093b
    public final Bundle b() {
        Bundle bundle;
        Bundle lambda$init$0;
        Bundle _init_$lambda$4;
        switch (this.f3788a) {
            case 0:
                ArrayList<String> arrayList = new ArrayList<>();
                Bundle bundle2 = new Bundle();
                j jVar = (j) this.f3789b;
                for (Map.Entry entry : kotlin.collections.a.w(jVar.f7177w.f7331a).entrySet()) {
                    String str = (String) entry.getKey();
                    Bundle h9 = ((Navigator) entry.getValue()).h();
                    if (h9 != null) {
                        arrayList.add(str);
                        bundle2.putBundle(str, h9);
                    }
                }
                if (!arrayList.isEmpty()) {
                    bundle = new Bundle();
                    bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
                    bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
                } else {
                    bundle = null;
                }
                h<NavBackStackEntry> hVar = jVar.f7162g;
                if (!hVar.isEmpty()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    Parcelable[] parcelableArr = new Parcelable[hVar.f3157c];
                    Iterator<NavBackStackEntry> it = hVar.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        parcelableArr[i] = new NavBackStackEntryState(it.next());
                        i++;
                    }
                    bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
                }
                LinkedHashMap linkedHashMap = jVar.f7168n;
                if (!linkedHashMap.isEmpty()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    int[] iArr = new int[linkedHashMap.size()];
                    ArrayList<String> arrayList2 = new ArrayList<>();
                    int i9 = 0;
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        int intValue = ((Number) entry2.getKey()).intValue();
                        String str2 = (String) entry2.getValue();
                        iArr[i9] = intValue;
                        arrayList2.add(str2);
                        i9++;
                    }
                    bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                    bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
                }
                LinkedHashMap linkedHashMap2 = jVar.f7169o;
                if (!linkedHashMap2.isEmpty()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    ArrayList<String> arrayList3 = new ArrayList<>();
                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                        String str3 = (String) entry3.getKey();
                        h hVar2 = (h) entry3.getValue();
                        arrayList3.add(str3);
                        Parcelable[] parcelableArr2 = new Parcelable[hVar2.f3157c];
                        Iterator<E> it2 = hVar2.iterator();
                        int i10 = 0;
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            int i11 = i10 + 1;
                            if (i10 < 0) {
                                m.t();
                                throw null;
                            }
                            parcelableArr2[i10] = (NavBackStackEntryState) next;
                            i10 = i11;
                        }
                        bundle.putParcelableArray(s3.b.j("android-support-nav:controller:backStackStates:", str3), parcelableArr2);
                    }
                    bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
                }
                if (jVar.f7161f) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    bundle.putBoolean("android-support-nav:controller:deepLinkHandled", jVar.f7161f);
                }
                return bundle == null ? Bundle.EMPTY : bundle;
            case 1:
                int i12 = ((NavHostFragment) this.f3789b).f7308h0;
                return i12 != 0 ? t0.c.b(new Pair("android-support-nav:fragment:graphId", Integer.valueOf(i12))) : Bundle.EMPTY;
            case 2:
                lambda$init$0 = ((ActivityC0533g) this.f3789b).lambda$init$0();
                return lambda$init$0;
            case 3:
                return ((FragmentManager) this.f3789b).b0();
            case 4:
                return G.a((G) this.f3789b);
            default:
                _init_$lambda$4 = ComponentActivity._init_$lambda$4((ComponentActivity) this.f3789b);
                return _init_$lambda$4;
        }
    }
}

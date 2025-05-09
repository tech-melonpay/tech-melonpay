package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k1.C0932m;

/* compiled from: FragmentTransition.kt */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final z f6943a = new z();

    /* renamed from: b, reason: collision with root package name */
    public static final C f6944b;

    static {
        C c2 = null;
        try {
            c2 = (C) C0932m.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f6944b = c2;
    }

    public static final void a(Fragment fragment, Fragment fragment2, boolean z10, androidx.collection.a aVar) {
        if ((z10 ? fragment2.getEnterTransitionCallback() : fragment.getEnterTransitionCallback()) != null) {
            ArrayList arrayList = new ArrayList(aVar.size());
            Iterator it = aVar.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add((View) ((Map.Entry) it.next()).getValue());
            }
            ArrayList arrayList2 = new ArrayList(aVar.size());
            Iterator it2 = aVar.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) ((Map.Entry) it2.next()).getKey());
            }
        }
    }

    public static final String b(androidx.collection.a<String, String> aVar, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : aVar.entrySet()) {
            if (kotlin.jvm.internal.f.b(entry.getValue(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return (String) P9.s.L(arrayList);
    }

    public static final void c(int i, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i);
        }
    }
}

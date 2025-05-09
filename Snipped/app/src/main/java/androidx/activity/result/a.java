package androidx.activity.result;

import F8.m;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.a;
import androidx.lifecycle.InterfaceC0550p;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.r;
import ca.InterfaceC0635a;
import e.C0706e;
import e.InterfaceC0702a;
import f.AbstractC0728a;
import ja.C0911a;
import ja.g;
import ja.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import kotlin.random.Random;
import t0.C1275b;

/* compiled from: ActivityResultRegistry.kt */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f4582a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f4583b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f4584c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f4585d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f4586e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f4587f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f4588g = new Bundle();

    /* compiled from: ActivityResultRegistry.kt */
    /* renamed from: androidx.activity.result.a$a, reason: collision with other inner class name */
    public static final class C0060a<O> {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC0702a<O> f4589a;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC0728a<?, O> f4590b;

        public C0060a(AbstractC0728a abstractC0728a, InterfaceC0702a interfaceC0702a) {
            this.f4589a = interfaceC0702a;
            this.f4590b = abstractC0728a;
        }
    }

    /* compiled from: ActivityResultRegistry.kt */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Lifecycle f4591a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f4592b = new ArrayList();

        public b(Lifecycle lifecycle) {
            this.f4591a = lifecycle;
        }
    }

    public final boolean a(int i, int i9, Intent intent) {
        String str = (String) this.f4582a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0060a c0060a = (C0060a) this.f4586e.get(str);
        if ((c0060a != null ? c0060a.f4589a : null) != null) {
            ArrayList arrayList = this.f4585d;
            if (arrayList.contains(str)) {
                c0060a.f4589a.a(c0060a.f4590b.parseResult(i9, intent));
                arrayList.remove(str);
                return true;
            }
        }
        this.f4587f.remove(str);
        this.f4588g.putParcelable(str, new ActivityResult(i9, intent));
        return true;
    }

    public abstract void b(int i, AbstractC0728a abstractC0728a, Object obj);

    public final C0706e c(final String str, r rVar, final AbstractC0728a abstractC0728a, final InterfaceC0702a interfaceC0702a) {
        Lifecycle lifecycle = rVar.getLifecycle();
        if (!(!lifecycle.b().a(Lifecycle.State.f6978d))) {
            throw new IllegalStateException(("LifecycleOwner " + rVar + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        e(str);
        LinkedHashMap linkedHashMap = this.f4584c;
        b bVar = (b) linkedHashMap.get(str);
        if (bVar == null) {
            bVar = new b(lifecycle);
        }
        InterfaceC0550p interfaceC0550p = new InterfaceC0550p() { // from class: e.d
            @Override // androidx.lifecycle.InterfaceC0550p
            public final void d(r rVar2, Lifecycle.Event event) {
                Lifecycle.Event event2 = Lifecycle.Event.ON_START;
                androidx.activity.result.a aVar = androidx.activity.result.a.this;
                LinkedHashMap linkedHashMap2 = aVar.f4586e;
                String str2 = str;
                if (event2 != event) {
                    if (Lifecycle.Event.ON_STOP == event) {
                        linkedHashMap2.remove(str2);
                        return;
                    } else {
                        if (Lifecycle.Event.ON_DESTROY == event) {
                            aVar.f(str2);
                            return;
                        }
                        return;
                    }
                }
                InterfaceC0702a interfaceC0702a2 = interfaceC0702a;
                AbstractC0728a abstractC0728a2 = abstractC0728a;
                linkedHashMap2.put(str2, new a.C0060a(abstractC0728a2, interfaceC0702a2));
                LinkedHashMap linkedHashMap3 = aVar.f4587f;
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    interfaceC0702a2.a(obj);
                }
                Bundle bundle = aVar.f4588g;
                ActivityResult activityResult = (ActivityResult) C1275b.a(bundle, ActivityResult.class, str2);
                if (activityResult != null) {
                    bundle.remove(str2);
                    interfaceC0702a2.a(abstractC0728a2.parseResult(activityResult.f4575a, activityResult.f4576b));
                }
            }
        };
        bVar.f4591a.a(interfaceC0550p);
        bVar.f4592b.add(interfaceC0550p);
        linkedHashMap.put(str, bVar);
        return new C0706e(this, str, abstractC0728a, 0);
    }

    public final C0706e d(String str, AbstractC0728a abstractC0728a, InterfaceC0702a interfaceC0702a) {
        e(str);
        this.f4586e.put(str, new C0060a(abstractC0728a, interfaceC0702a));
        LinkedHashMap linkedHashMap = this.f4587f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            interfaceC0702a.a(obj);
        }
        Bundle bundle = this.f4588g;
        ActivityResult activityResult = (ActivityResult) C1275b.a(bundle, ActivityResult.class, str);
        if (activityResult != null) {
            bundle.remove(str);
            interfaceC0702a.a(abstractC0728a.parseResult(activityResult.f4575a, activityResult.f4576b));
        }
        return new C0706e(this, str, abstractC0728a, 1);
    }

    public final void e(String str) {
        LinkedHashMap linkedHashMap = this.f4583b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        ActivityResultRegistry$generateRandomNumber$1 activityResultRegistry$generateRandomNumber$1 = new InterfaceC0635a<Integer>() { // from class: androidx.activity.result.ActivityResultRegistry$generateRandomNumber$1
            @Override // ca.InterfaceC0635a
            public final Integer invoke() {
                Random.f23193a.getClass();
                return Integer.valueOf(Random.f23194b.e(2147418112) + 65536);
            }
        };
        h gVar = new g(activityResultRegistry$generateRandomNumber$1, new m(1, activityResultRegistry$generateRandomNumber$1));
        if (!(gVar instanceof C0911a)) {
            gVar = new C0911a(gVar);
        }
        Iterator it = ((C0911a) gVar).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            int intValue = number.intValue();
            LinkedHashMap linkedHashMap2 = this.f4582a;
            if (!linkedHashMap2.containsKey(Integer.valueOf(intValue))) {
                int intValue2 = number.intValue();
                linkedHashMap2.put(Integer.valueOf(intValue2), str);
                linkedHashMap.put(str, Integer.valueOf(intValue2));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void f(String str) {
        Integer num;
        if (!this.f4585d.contains(str) && (num = (Integer) this.f4583b.remove(str)) != null) {
            this.f4582a.remove(num);
        }
        this.f4586e.remove(str);
        LinkedHashMap linkedHashMap = this.f4587f;
        if (linkedHashMap.containsKey(str)) {
            StringBuilder m2 = com.google.android.gms.measurement.internal.a.m("Dropping pending result for request ", str, ": ");
            m2.append(linkedHashMap.get(str));
            Log.w("ActivityResultRegistry", m2.toString());
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.f4588g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((ActivityResult) C1275b.a(bundle, ActivityResult.class, str)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.f4584c;
        b bVar = (b) linkedHashMap2.get(str);
        if (bVar != null) {
            ArrayList arrayList = bVar.f4592b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                bVar.f4591a.c((InterfaceC0550p) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}

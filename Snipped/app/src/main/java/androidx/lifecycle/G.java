package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import b1.C0582b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: SavedStateHandle.kt */
/* loaded from: classes.dex */
public final class G {

    /* renamed from: f, reason: collision with root package name */
    public static final Class<? extends Object>[] f6955f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f6956a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f6957b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f6958c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f6959d;

    /* renamed from: e, reason: collision with root package name */
    public final C0582b.InterfaceC0093b f6960e;

    /* compiled from: SavedStateHandle.kt */
    public static final class a {
        public static G a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new G();
                }
                HashMap hashMap = new HashMap();
                for (String str : bundle2.keySet()) {
                    hashMap.put(str, bundle2.get(str));
                }
                return new G(hashMap);
            }
            bundle.setClassLoader(G.class.getClassLoader());
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i = 0; i < size; i++) {
                linkedHashMap.put((String) parcelableArrayList.get(i), parcelableArrayList2.get(i));
            }
            return new G(linkedHashMap);
        }
    }

    /* compiled from: SavedStateHandle.kt */
    public static final class b<T> extends C0559z<T> {
        @Override // androidx.lifecycle.C0559z, androidx.lifecycle.AbstractC0557x
        public final void setValue(T t3) {
            super.setValue(t3);
        }
    }

    public G(HashMap hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f6956a = linkedHashMap;
        this.f6957b = new LinkedHashMap();
        this.f6958c = new LinkedHashMap();
        this.f6959d = new LinkedHashMap();
        this.f6960e = new W0.e(this, 4);
        linkedHashMap.putAll(hashMap);
    }

    public static Bundle a(G g10) {
        for (Map.Entry entry : kotlin.collections.a.w(g10.f6957b).entrySet()) {
            g10.d(((C0582b.InterfaceC0093b) entry.getValue()).b(), (String) entry.getKey());
        }
        LinkedHashMap linkedHashMap = g10.f6956a;
        Set<String> keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(linkedHashMap.get(str));
        }
        return t0.c.b(new Pair("keys", arrayList), new Pair("values", arrayList2));
    }

    public final <T> T b(String str) {
        LinkedHashMap linkedHashMap = this.f6956a;
        try {
            return (T) linkedHashMap.get(str);
        } catch (ClassCastException unused) {
            linkedHashMap.remove(str);
            this.f6959d.remove(str);
            return null;
        }
    }

    public final StateFlow c(Object obj, String str) {
        LinkedHashMap linkedHashMap = this.f6959d;
        Object obj2 = linkedHashMap.get(str);
        if (obj2 == null) {
            LinkedHashMap linkedHashMap2 = this.f6956a;
            if (!linkedHashMap2.containsKey(str)) {
                linkedHashMap2.put(str, obj);
            }
            obj2 = StateFlowKt.MutableStateFlow(linkedHashMap2.get(str));
            linkedHashMap.put(str, obj2);
            linkedHashMap.put(str, obj2);
        }
        return FlowKt.asStateFlow((MutableStateFlow) obj2);
    }

    public final void d(Object obj, String str) {
        if (obj != null) {
            Class<? extends Object>[] clsArr = f6955f;
            for (int i = 0; i < 29; i++) {
                if (!clsArr[i].isInstance(obj)) {
                }
            }
            throw new IllegalArgumentException("Can't put value with type " + obj.getClass() + " into saved state");
        }
        Object obj2 = this.f6958c.get(str);
        C0559z c0559z = obj2 instanceof C0559z ? (C0559z) obj2 : null;
        if (c0559z != null) {
            c0559z.setValue(obj);
        } else {
            this.f6956a.put(str, obj);
        }
        MutableStateFlow mutableStateFlow = (MutableStateFlow) this.f6959d.get(str);
        if (mutableStateFlow == null) {
            return;
        }
        mutableStateFlow.setValue(obj);
    }

    public G() {
        this.f6956a = new LinkedHashMap();
        this.f6957b = new LinkedHashMap();
        this.f6958c = new LinkedHashMap();
        this.f6959d = new LinkedHashMap();
        this.f6960e = new W0.e(this, 4);
    }
}

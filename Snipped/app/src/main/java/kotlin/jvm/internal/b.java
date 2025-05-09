package kotlin.jvm.internal;

import P9.m;
import P9.n;
import P9.z;
import ca.InterfaceC0635a;
import ca.InterfaceC0636b;
import ca.InterfaceC0637c;
import ca.InterfaceC0638d;
import ca.InterfaceC0639e;
import ca.InterfaceC0640f;
import ca.InterfaceC0641g;
import ca.InterfaceC0642h;
import ca.InterfaceC0643i;
import ca.InterfaceC0644j;
import ca.InterfaceC0645k;
import ca.InterfaceC0646l;
import ca.InterfaceC0647m;
import ca.InterfaceC0648n;
import ca.InterfaceC0649o;
import ca.InterfaceC0650p;
import ca.InterfaceC0651q;
import ca.InterfaceC0652r;
import ca.s;
import ca.t;
import ca.u;
import ca.v;
import ca.w;
import ia.InterfaceC0835c;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ka.C0969n;
import kotlin.Pair;

/* compiled from: ClassReference.kt */
/* loaded from: classes2.dex */
public final class b implements InterfaceC0835c<Object>, a {

    /* renamed from: b, reason: collision with root package name */
    public static final Map<Class<? extends O9.d<?>>, Integer> f23180b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap<String, String> f23181c;

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f23182d;

    /* renamed from: a, reason: collision with root package name */
    public final Class<?> f23183a;

    static {
        List q10 = m.q(InterfaceC0635a.class, InterfaceC0646l.class, InterfaceC0650p.class, InterfaceC0651q.class, InterfaceC0652r.class, s.class, t.class, u.class, v.class, w.class, InterfaceC0636b.class, InterfaceC0637c.class, InterfaceC0638d.class, InterfaceC0639e.class, InterfaceC0640f.class, InterfaceC0641g.class, InterfaceC0642h.class, InterfaceC0643i.class, InterfaceC0644j.class, InterfaceC0645k.class, InterfaceC0647m.class, InterfaceC0648n.class, InterfaceC0649o.class);
        ArrayList arrayList = new ArrayList(n.u(q10, 10));
        int i = 0;
        for (Object obj : q10) {
            int i9 = i + 1;
            if (i < 0) {
                m.t();
                throw null;
            }
            arrayList.add(new Pair((Class) obj, Integer.valueOf(i)));
            i = i9;
        }
        f23180b = kotlin.collections.a.v(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        for (String str : hashMap.values()) {
            StringBuilder sb2 = new StringBuilder("kotlin.jvm.internal.");
            int j02 = C0969n.j0('.', 0, 6, str);
            hashMap3.put(androidx.camera.core.impl.utils.a.n(sb2, j02 == -1 ? str : str.substring(j02 + 1, str.length()), "CompanionObject"), str.concat(".Companion"));
        }
        for (Map.Entry<Class<? extends O9.d<?>>, Integer> entry : f23180b.entrySet()) {
            Class<? extends O9.d<?>> key = entry.getKey();
            int intValue = entry.getValue().intValue();
            hashMap3.put(key.getName(), "kotlin.Function" + intValue);
        }
        f23181c = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(z.n(hashMap3.size()));
        Iterator<T> it = hashMap3.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            Object key2 = entry2.getKey();
            String str2 = (String) entry2.getValue();
            int j03 = C0969n.j0('.', 0, 6, str2);
            if (j03 != -1) {
                str2 = str2.substring(j03 + 1, str2.length());
            }
            linkedHashMap.put(key2, str2);
        }
        f23182d = linkedHashMap;
    }

    public b(Class<?> cls) {
        this.f23183a = cls;
    }

    @Override // ia.InterfaceC0835c
    public final String b() {
        String str;
        Class<?> cls = this.f23183a;
        String str2 = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        boolean isArray = cls.isArray();
        HashMap<String, String> hashMap = f23181c;
        if (!isArray) {
            String str3 = hashMap.get(cls.getName());
            return str3 == null ? cls.getCanonicalName() : str3;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (str = hashMap.get(componentType.getName())) != null) {
            str2 = str.concat("Array");
        }
        return str2 == null ? "kotlin.Array" : str2;
    }

    @Override // ia.InterfaceC0835c
    public final String d() {
        String str;
        Class<?> cls = this.f23183a;
        String str2 = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            boolean isArray = cls.isArray();
            LinkedHashMap linkedHashMap = f23182d;
            if (!isArray) {
                String str3 = (String) linkedHashMap.get(cls.getName());
                return str3 == null ? cls.getSimpleName() : str3;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                str2 = str.concat("Array");
            }
            return str2 == null ? "Array" : str2;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return C0969n.t0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int f02 = C0969n.f0(simpleName, '$', 0, false, 6);
            return f02 == -1 ? simpleName : simpleName.substring(f02 + 1, simpleName.length());
        }
        return C0969n.t0(simpleName, enclosingConstructor.getName() + '$');
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && f.b(U4.b.k(this), U4.b.k((InterfaceC0835c) obj));
    }

    @Override // ia.InterfaceC0835c
    public final boolean f(Object obj) {
        Map<Class<? extends O9.d<?>>, Integer> map = f23180b;
        Class<?> cls = this.f23183a;
        Integer num = map.get(cls);
        if (num != null) {
            return j.d(num.intValue(), obj);
        }
        if (cls.isPrimitive()) {
            cls = U4.b.k(h.a(cls));
        }
        return cls.isInstance(obj);
    }

    @Override // kotlin.jvm.internal.a
    public final Class<?> g() {
        return this.f23183a;
    }

    public final int hashCode() {
        return U4.b.k(this).hashCode();
    }

    public final String toString() {
        return this.f23183a + " (Kotlin reflection is not available)";
    }
}

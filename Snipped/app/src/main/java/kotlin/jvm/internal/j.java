package kotlin.jvm.internal;

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
import da.InterfaceC0701a;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;

/* compiled from: TypeIntrinsics.java */
/* loaded from: classes2.dex */
public final class j {
    public static Collection a(LinkedHashSet linkedHashSet) {
        if (!(linkedHashSet instanceof InterfaceC0701a) || (linkedHashSet instanceof da.b)) {
            return linkedHashSet;
        }
        e(linkedHashSet, "kotlin.collections.MutableCollection");
        throw null;
    }

    public static Map b(AbstractMap abstractMap) {
        if (!(abstractMap instanceof InterfaceC0701a) || (abstractMap instanceof da.c)) {
            return abstractMap;
        }
        e(abstractMap, "kotlin.collections.MutableMap");
        throw null;
    }

    public static void c(int i, Object obj) {
        if (obj == null || d(i, obj)) {
            return;
        }
        e(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static boolean d(int i, Object obj) {
        if (obj instanceof O9.d) {
            return (obj instanceof e ? ((e) obj).getArity() : obj instanceof InterfaceC0635a ? 0 : obj instanceof InterfaceC0646l ? 1 : obj instanceof InterfaceC0650p ? 2 : obj instanceof InterfaceC0651q ? 3 : obj instanceof InterfaceC0652r ? 4 : obj instanceof s ? 5 : obj instanceof t ? 6 : obj instanceof u ? 7 : obj instanceof v ? 8 : obj instanceof w ? 9 : obj instanceof InterfaceC0636b ? 10 : obj instanceof InterfaceC0637c ? 11 : obj instanceof InterfaceC0638d ? 12 : obj instanceof InterfaceC0639e ? 13 : obj instanceof InterfaceC0640f ? 14 : obj instanceof InterfaceC0641g ? 15 : obj instanceof InterfaceC0642h ? 16 : obj instanceof InterfaceC0643i ? 17 : obj instanceof InterfaceC0644j ? 18 : obj instanceof InterfaceC0645k ? 19 : obj instanceof InterfaceC0647m ? 20 : obj instanceof InterfaceC0648n ? 21 : obj instanceof InterfaceC0649o ? 22 : -1) == i;
        }
        return false;
    }

    public static void e(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(C.v.p(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        f.d(classCastException, j.class.getName());
        throw classCastException;
    }
}

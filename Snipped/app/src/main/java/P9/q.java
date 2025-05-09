package P9;

import ca.InterfaceC0646l;
import da.InterfaceC0701a;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* compiled from: _CollectionsJvm.kt */
/* loaded from: classes2.dex */
public class q extends p {
    public static Object A(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    public static Object B(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(m.p(list));
    }

    public static void C(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void D(List list, Comparator comparator) {
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    public static void w(AbstractCollection abstractCollection, Object[] objArr) {
        abstractCollection.addAll(Arrays.asList(objArr));
    }

    public static void x(Collection collection, Iterable iterable) {
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static final boolean y(Iterable iterable, InterfaceC0646l interfaceC0646l, boolean z10) {
        Iterator it = iterable.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (((Boolean) interfaceC0646l.invoke(it.next())).booleanValue() == z10) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    public static void z(ArrayList arrayList, InterfaceC0646l interfaceC0646l) {
        int p10;
        if (!(arrayList instanceof RandomAccess)) {
            if (!(arrayList instanceof InterfaceC0701a) || (arrayList instanceof da.b)) {
                y(arrayList, interfaceC0646l, true);
                return;
            } else {
                kotlin.jvm.internal.j.e(arrayList, "kotlin.collections.MutableIterable");
                throw null;
            }
        }
        int p11 = m.p(arrayList);
        int i = 0;
        if (p11 >= 0) {
            int i9 = 0;
            while (true) {
                Object obj = arrayList.get(i);
                if (!((Boolean) interfaceC0646l.invoke(obj)).booleanValue()) {
                    if (i9 != i) {
                        arrayList.set(i9, obj);
                    }
                    i9++;
                }
                if (i == p11) {
                    break;
                } else {
                    i++;
                }
            }
            i = i9;
        }
        if (i >= arrayList.size() || i > (p10 = m.p(arrayList))) {
            return;
        }
        while (true) {
            arrayList.remove(p10);
            if (p10 == i) {
                return;
            } else {
                p10--;
            }
        }
    }
}

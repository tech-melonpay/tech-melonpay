package P9;

import ca.InterfaceC0646l;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.random.Random;

/* compiled from: _Collections.kt */
/* loaded from: classes2.dex */
public class s extends q {
    public static <T> boolean E(Iterable<? extends T> iterable, T t3) {
        int i;
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t3);
        }
        if (!(iterable instanceof List)) {
            int i9 = 0;
            for (T t10 : iterable) {
                if (i9 < 0) {
                    m.t();
                    throw null;
                }
                if (kotlin.jvm.internal.f.b(t3, t10)) {
                    i = i9;
                } else {
                    i9++;
                }
            }
            return false;
        }
        i = ((List) iterable).indexOf(t3);
        return i >= 0;
    }

    public static <T> List<T> F(Iterable<? extends T> iterable) {
        return c0(f0(iterable));
    }

    public static List G(Iterable iterable) {
        ArrayList arrayList;
        Object obj;
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - 1;
            if (size <= 0) {
                return EmptyList.f23104a;
            }
            if (size == 1) {
                if (iterable instanceof List) {
                    obj = Q((List) iterable);
                } else {
                    Iterator it = iterable.iterator();
                    if (!it.hasNext()) {
                        throw new NoSuchElementException("Collection is empty.");
                    }
                    Object next = it.next();
                    while (it.hasNext()) {
                        next = it.next();
                    }
                    obj = next;
                }
                return Collections.singletonList(obj);
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    for (int i = 1; i < size2; i++) {
                        arrayList.add(list.get(i));
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(1);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i9 = 0;
        for (Object obj2 : iterable) {
            if (i9 >= 1) {
                arrayList.add(obj2);
            } else {
                i9++;
            }
        }
        return m.s(arrayList);
    }

    public static ArrayList H(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static <T> T I(Iterable<? extends T> iterable) {
        if (iterable instanceof List) {
            return (T) J((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T J(List<? extends T> list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static <T> T K(Iterable<? extends T> iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static <T> T L(List<? extends T> list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object M(int i, List list) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static final void N(Iterable iterable, StringBuilder sb2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC0646l interfaceC0646l) {
        sb2.append(charSequence2);
        int i9 = 0;
        for (Object obj : iterable) {
            i9++;
            if (i9 > 1) {
                sb2.append(charSequence);
            }
            if (i >= 0 && i9 > i) {
                break;
            } else {
                j3.e.b(sb2, obj, interfaceC0646l);
            }
        }
        if (i >= 0 && i9 > i) {
            sb2.append(charSequence4);
        }
        sb2.append(charSequence3);
    }

    public static String P(Iterable iterable, String str, String str2, String str3, InterfaceC0646l interfaceC0646l, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            interfaceC0646l = null;
        }
        StringBuilder sb2 = new StringBuilder();
        N(iterable, sb2, str4, str5, str6, -1, "...", interfaceC0646l);
        return sb2.toString();
    }

    public static <T> T Q(List<? extends T> list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(m.p(list));
    }

    public static <T> T R(List<? extends T> list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable S(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList T(Object obj, Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList U(Collection collection, Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            q.x(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static Object V(List list, Random.Default r62) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        List list2 = list;
        int size = list.size();
        r62.getClass();
        final int e10 = Random.f23194b.e(size);
        boolean z10 = list2 instanceof List;
        if (z10) {
            return list2.get(e10);
        }
        InterfaceC0646l interfaceC0646l = new InterfaceC0646l() { // from class: P9.r
            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                ((Integer) obj).intValue();
                throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + e10 + '.');
            }
        };
        if (z10) {
            List list3 = list2;
            if (e10 >= 0 && e10 < list3.size()) {
                return list3.get(e10);
            }
            interfaceC0646l.invoke(Integer.valueOf(e10));
            throw null;
        }
        if (e10 < 0) {
            interfaceC0646l.invoke(Integer.valueOf(e10));
            throw null;
        }
        int i = 0;
        for (Object obj : list2) {
            int i9 = i + 1;
            if (e10 == i) {
                return obj;
            }
            i = i9;
        }
        interfaceC0646l.invoke(Integer.valueOf(e10));
        throw null;
    }

    public static <T> List<T> W(Iterable<? extends T> iterable) {
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return c0(iterable);
        }
        List<T> e02 = e0(iterable);
        Collections.reverse(e02);
        return e02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> X(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        if (!(iterable instanceof Collection)) {
            List<T> e02 = e0(iterable);
            q.D(e02, comparator);
            return e02;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return c0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return Arrays.asList(array);
    }

    public static <T> List<T> Y(Iterable<? extends T> iterable, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(s3.b.i("Requested element count ", i, " is less than zero.").toString());
        }
        if (i == 0) {
            return EmptyList.f23104a;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return c0(iterable);
            }
            if (i == 1) {
                return Collections.singletonList(I(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator<? extends T> it = iterable.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i9++;
            if (i9 == i) {
                break;
            }
        }
        return m.s(arrayList);
    }

    public static boolean[] Z(Collection<Boolean> collection) {
        boolean[] zArr = new boolean[collection.size()];
        Iterator<Boolean> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr[i] = it.next().booleanValue();
            i++;
        }
        return zArr;
    }

    public static final void a0(Iterable iterable, AbstractCollection abstractCollection) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] b0(Collection<Integer> collection) {
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        return iArr;
    }

    public static <T> List<T> c0(Iterable<? extends T> iterable) {
        if (!(iterable instanceof Collection)) {
            return m.s(e0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return EmptyList.f23104a;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return Collections.singletonList(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static long[] d0(Collection<Long> collection) {
        long[] jArr = new long[collection.size()];
        Iterator<Long> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        return jArr;
    }

    public static final <T> List<T> e0(Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        a0(iterable, arrayList);
        return arrayList;
    }

    public static final <T> Set<T> f0(Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        a0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static <T> Set<T> g0(Iterable<? extends T> iterable) {
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            a0(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            return size != 0 ? size != 1 ? linkedHashSet : Collections.singleton(linkedHashSet.iterator().next()) : EmptySet.f23106a;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return EmptySet.f23106a;
        }
        if (size2 == 1) {
            return Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(z.n(collection.size()));
        a0(iterable, linkedHashSet2);
        return linkedHashSet2;
    }
}

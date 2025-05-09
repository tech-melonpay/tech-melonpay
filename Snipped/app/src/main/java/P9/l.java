package P9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;

/* compiled from: _Arrays.kt */
/* loaded from: classes2.dex */
public class l extends i {
    public static <T> boolean n(T[] tArr, T t3) {
        return p(tArr, t3) >= 0;
    }

    public static ArrayList o(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static <T> int p(T[] tArr, T t3) {
        int i = 0;
        if (t3 == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i < length2) {
            if (kotlin.jvm.internal.f.b(t3, tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static String q(int[] iArr) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int i = 0;
        for (int i9 : iArr) {
            i++;
            if (i > 1) {
                sb2.append((CharSequence) "");
            }
            sb2.append((CharSequence) String.valueOf(i9));
        }
        sb2.append((CharSequence) "");
        return sb2.toString();
    }

    public static List<Float> r(float[] fArr) {
        int length = fArr.length;
        if (length == 0) {
            return EmptyList.f23104a;
        }
        if (length == 1) {
            return Collections.singletonList(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f10 : fArr) {
            arrayList.add(Float.valueOf(f10));
        }
        return arrayList;
    }

    public static List<Integer> s(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return EmptyList.f23104a;
        }
        if (length == 1) {
            return Collections.singletonList(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    public static List<Long> t(long[] jArr) {
        int length = jArr.length;
        if (length == 0) {
            return EmptyList.f23104a;
        }
        if (length == 1) {
            return Collections.singletonList(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j10 : jArr) {
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    public static <T> List<T> u(T[] tArr) {
        int length = tArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new g(tArr, false)) : Collections.singletonList(tArr[0]) : EmptyList.f23104a;
    }

    public static List<Boolean> v(boolean[] zArr) {
        int length = zArr.length;
        if (length == 0) {
            return EmptyList.f23104a;
        }
        if (length == 1) {
            return Collections.singletonList(Boolean.valueOf(zArr[0]));
        }
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z10 : zArr) {
            arrayList.add(Boolean.valueOf(z10));
        }
        return arrayList;
    }

    public static <T> Set<T> w(T[] tArr) {
        int length = tArr.length;
        if (length == 0) {
            return EmptySet.f23106a;
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(z.n(tArr.length));
        for (T t3 : tArr) {
            linkedHashSet.add(t3);
        }
        return linkedHashSet;
    }
}

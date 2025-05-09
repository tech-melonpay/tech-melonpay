package ka;

import ha.C0804c;
import ha.C0806e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: _StringsJvm.kt */
/* renamed from: ka.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0969n extends C0967l {
    public static boolean Y(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        if (charSequence2 instanceof String) {
            if (g0(charSequence, (String) charSequence2, 0, z10, 2) < 0) {
                return false;
            }
        } else if (e0(charSequence, charSequence2, 0, charSequence.length(), z10, false) < 0) {
            return false;
        }
        return true;
    }

    public static boolean Z(CharSequence charSequence, char c2) {
        return f0(charSequence, c2, 0, false, 2) >= 0;
    }

    public static boolean a0(CharSequence charSequence, String str) {
        return charSequence instanceof String ? ((String) charSequence).endsWith(str) : m0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static final Pair b0(CharSequence charSequence, Collection collection, int i, boolean z10) {
        Object obj;
        Object obj2;
        Object obj3;
        if (!z10 && collection.size() == 1) {
            Collection collection2 = collection;
            if (collection2 instanceof List) {
                List list = (List) collection2;
                int size = list.size();
                if (size == 0) {
                    throw new NoSuchElementException("List is empty.");
                }
                if (size != 1) {
                    throw new IllegalArgumentException("List has more than one element.");
                }
                obj3 = list.get(0);
            } else {
                Iterator it = collection2.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException("Collection is empty.");
                }
                Object next = it.next();
                if (it.hasNext()) {
                    throw new IllegalArgumentException("Collection has more than one element.");
                }
                obj3 = next;
            }
            String str = (String) obj3;
            int g02 = g0(charSequence, str, i, false, 4);
            if (g02 < 0) {
                return null;
            }
            return new Pair(Integer.valueOf(g02), str);
        }
        if (i < 0) {
            i = 0;
        }
        C0806e c0806e = new C0806e(i, charSequence.length(), 1);
        boolean z11 = charSequence instanceof String;
        int i9 = c0806e.f21228c;
        int i10 = c0806e.f21227b;
        if (z11) {
            if ((i9 > 0 && i <= i10) || (i9 < 0 && i10 <= i)) {
                while (true) {
                    Iterator it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it2.next();
                        String str2 = (String) obj2;
                        if (C0967l.V(0, i, str2.length(), str2, (String) charSequence, z10)) {
                            break;
                        }
                    }
                    String str3 = (String) obj2;
                    if (str3 == null) {
                        if (i == i10) {
                            break;
                        }
                        i += i9;
                    } else {
                        return new Pair(Integer.valueOf(i), str3);
                    }
                }
            }
        } else if ((i9 > 0 && i <= i10) || (i9 < 0 && i10 <= i)) {
            while (true) {
                Iterator it3 = collection.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it3.next();
                    String str4 = (String) obj;
                    if (m0(str4, 0, charSequence, i, str4.length(), z10)) {
                        break;
                    }
                }
                String str5 = (String) obj;
                if (str5 == null) {
                    if (i == i10) {
                        break;
                    }
                    i += i9;
                } else {
                    return new Pair(Integer.valueOf(i), str5);
                }
            }
        }
        return null;
    }

    public static int c0(CharSequence charSequence) {
        return charSequence.length() - 1;
    }

    public static final int d0(int i, CharSequence charSequence, String str, boolean z10) {
        return (z10 || !(charSequence instanceof String)) ? e0(charSequence, str, i, charSequence.length(), z10, false) : ((String) charSequence).indexOf(str, i);
    }

    public static final int e0(CharSequence charSequence, CharSequence charSequence2, int i, int i9, boolean z10, boolean z11) {
        C0804c c0804c;
        if (z11) {
            int c02 = c0(charSequence);
            if (i > c02) {
                i = c02;
            }
            if (i9 < 0) {
                i9 = 0;
            }
            c0804c = new C0804c(i, i9, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i9 > length) {
                i9 = length;
            }
            c0804c = new C0806e(i, i9, 1);
        }
        boolean z12 = charSequence instanceof String;
        int i10 = c0804c.f21228c;
        int i11 = c0804c.f21227b;
        int i12 = c0804c.f21226a;
        if (z12 && (charSequence2 instanceof String)) {
            if ((i10 > 0 && i12 <= i11) || (i10 < 0 && i11 <= i12)) {
                while (true) {
                    String str = (String) charSequence2;
                    if (!C0967l.V(0, i12, str.length(), str, (String) charSequence, z10)) {
                        if (i12 == i11) {
                            break;
                        }
                        i12 += i10;
                    } else {
                        return i12;
                    }
                }
            }
        } else if ((i10 > 0 && i12 <= i11) || (i10 < 0 && i11 <= i12)) {
            while (!m0(charSequence2, 0, charSequence, i12, charSequence2.length(), z10)) {
                if (i12 != i11) {
                    i12 += i10;
                }
            }
            return i12;
        }
        return -1;
    }

    public static int f0(CharSequence charSequence, char c2, int i, boolean z10, int i9) {
        if ((i9 & 2) != 0) {
            i = 0;
        }
        if ((i9 & 4) != 0) {
            z10 = false;
        }
        return (z10 || !(charSequence instanceof String)) ? h0(charSequence, new char[]{c2}, i, z10) : ((String) charSequence).indexOf(c2, i);
    }

    public static /* synthetic */ int g0(CharSequence charSequence, String str, int i, boolean z10, int i9) {
        if ((i9 & 2) != 0) {
            i = 0;
        }
        if ((i9 & 4) != 0) {
            z10 = false;
        }
        return d0(i, charSequence, str, z10);
    }

    public static final int h0(CharSequence charSequence, char[] cArr, int i, boolean z10) {
        if (!z10 && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i);
        }
        if (i < 0) {
            i = 0;
        }
        int c02 = c0(charSequence);
        if (i > c02) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i);
            for (char c2 : cArr) {
                if (j3.e.p(c2, charAt, z10)) {
                    return i;
                }
            }
            if (i == c02) {
                return -1;
            }
            i++;
        }
    }

    public static boolean i0(CharSequence charSequence) {
        for (int i = 0; i < charSequence.length(); i++) {
            if (!j3.e.u(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int j0(char c2, int i, int i9, CharSequence charSequence) {
        if ((i9 & 2) != 0) {
            i = c0(charSequence);
        }
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c2, i);
        }
        char[] cArr = {c2};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(cArr[0], i);
        }
        int c02 = c0(charSequence);
        if (i > c02) {
            i = c02;
        }
        while (-1 < i) {
            if (j3.e.p(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static int k0(CharSequence charSequence, String str, int i, int i9) {
        if ((i9 & 2) != 0) {
            i = c0(charSequence);
        }
        int i10 = i;
        return !(charSequence instanceof String) ? e0(charSequence, str, i10, 0, false, true) : ((String) charSequence).lastIndexOf(str, i10);
    }

    public static final List l0(CharSequence charSequence) {
        C0958c c0958c = new C0958c(charSequence);
        if (!c0958c.hasNext()) {
            return EmptyList.f23104a;
        }
        String next = c0958c.next();
        if (!c0958c.hasNext()) {
            return Collections.singletonList(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (c0958c.hasNext()) {
            arrayList.add(c0958c.next());
        }
        return arrayList;
    }

    public static final boolean m0(CharSequence charSequence, int i, CharSequence charSequence2, int i9, int i10, boolean z10) {
        if (i9 < 0 || i < 0 || i > charSequence.length() - i10 || i9 > charSequence2.length() - i10) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!j3.e.p(charSequence.charAt(i + i11), charSequence2.charAt(i9 + i11), z10)) {
                return false;
            }
        }
        return true;
    }

    public static String n0(String str, String str2) {
        return s0(str, str2) ? str.substring(str2.length()) : str;
    }

    public static final void o0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.g(i, "Limit must be non-negative, but was ").toString());
        }
    }

    public static final List p0(int i, CharSequence charSequence, String str, boolean z10) {
        o0(i);
        int i9 = 0;
        int d02 = d0(0, charSequence, str, z10);
        if (d02 == -1 || i == 1) {
            return Collections.singletonList(charSequence.toString());
        }
        boolean z11 = i > 0;
        int i10 = 10;
        if (z11 && i <= 10) {
            i10 = i;
        }
        ArrayList arrayList = new ArrayList(i10);
        do {
            arrayList.add(charSequence.subSequence(i9, d02).toString());
            i9 = str.length() + d02;
            if (z11 && arrayList.size() == i - 1) {
                break;
            }
            d02 = d0(i9, charSequence, str, z10);
        } while (d02 != -1);
        arrayList.add(charSequence.subSequence(i9, charSequence.length()).toString());
        return arrayList;
    }

    public static List q0(CharSequence charSequence, char[] cArr) {
        boolean z10 = false;
        if (cArr.length == 1) {
            return p0(0, charSequence, String.valueOf(cArr[0]), false);
        }
        o0(0);
        C0957b c0957b = new C0957b(charSequence, 0, 0, new C0968m(z10, 0, cArr));
        ArrayList arrayList = new ArrayList(P9.n.u(new P9.j(c0957b, 2), 10));
        for (C0806e c0806e : c0957b) {
            arrayList.add(charSequence.subSequence(c0806e.f21226a, c0806e.f21227b + 1).toString());
        }
        return arrayList;
    }

    public static List r0(CharSequence charSequence, String[] strArr) {
        boolean z10 = false;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return p0(0, charSequence, str, false);
            }
        }
        o0(0);
        C0957b c0957b = new C0957b(charSequence, 0, 0, new C0968m(z10, 1, Arrays.asList(strArr)));
        ArrayList arrayList = new ArrayList(P9.n.u(new P9.j(c0957b, 2), 10));
        for (C0806e c0806e : c0957b) {
            arrayList.add(charSequence.subSequence(c0806e.f21226a, c0806e.f21227b + 1).toString());
        }
        return arrayList;
    }

    public static boolean s0(CharSequence charSequence, String str) {
        return ((charSequence instanceof String) && (str instanceof String)) ? ((String) charSequence).startsWith(str) : m0(charSequence, 0, str, 0, str.length(), false);
    }

    public static String t0(String str, String str2) {
        int g02 = g0(str, str2, 0, false, 6);
        return g02 == -1 ? str : str.substring(str2.length() + g02, str.length());
    }

    public static CharSequence u0(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z10 = false;
        while (i <= length) {
            boolean u6 = j3.e.u(charSequence.charAt(!z10 ? i : length));
            if (z10) {
                if (!u6) {
                    break;
                }
                length--;
            } else if (u6) {
                i++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }
}

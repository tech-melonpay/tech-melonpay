package U0;

import C.v;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ka.C0967l;
import kotlin.collections.EmptyList;

/* compiled from: NavType.kt */
/* loaded from: classes.dex */
public abstract class k<T> {

    /* renamed from: b, reason: collision with root package name */
    public static final i f3604b = new i(false);

    /* renamed from: c, reason: collision with root package name */
    public static final m f3605c = new m(false);

    /* renamed from: d, reason: collision with root package name */
    public static final g f3606d = new g(true);

    /* renamed from: e, reason: collision with root package name */
    public static final h f3607e = new h(true);

    /* renamed from: f, reason: collision with root package name */
    public static final l f3608f = new l(false);

    /* renamed from: g, reason: collision with root package name */
    public static final j f3609g = new j(true);

    /* renamed from: h, reason: collision with root package name */
    public static final C0044k f3610h = new C0044k(true);
    public static final f i = new f(false);

    /* renamed from: j, reason: collision with root package name */
    public static final d f3611j = new d(true);

    /* renamed from: k, reason: collision with root package name */
    public static final e f3612k = new e(true);

    /* renamed from: l, reason: collision with root package name */
    public static final c f3613l = new c(false);

    /* renamed from: m, reason: collision with root package name */
    public static final a f3614m = new a(true);

    /* renamed from: n, reason: collision with root package name */
    public static final b f3615n = new b(true);

    /* renamed from: o, reason: collision with root package name */
    public static final p f3616o = new p(true);

    /* renamed from: p, reason: collision with root package name */
    public static final n f3617p = new n(true);

    /* renamed from: q, reason: collision with root package name */
    public static final o f3618q = new o(true);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3619a;

    /* compiled from: NavType.kt */
    public static final class a extends U0.b<boolean[]> {
        @Override // U0.k
        public final Object a(String str, Bundle bundle) {
            return (boolean[]) bundle.get(str);
        }

        @Override // U0.k
        public final String b() {
            return "boolean[]";
        }

        @Override // U0.k
        public final Object c(Object obj, String str) {
            boolean[] zArr = (boolean[]) obj;
            c cVar = k.f3613l;
            if (zArr == null) {
                return new boolean[]{((Boolean) cVar.h(str)).booleanValue()};
            }
            boolean[] zArr2 = {((Boolean) cVar.h(str)).booleanValue()};
            int length = zArr.length;
            boolean[] copyOf = Arrays.copyOf(zArr, length + 1);
            System.arraycopy(zArr2, 0, copyOf, length, 1);
            return copyOf;
        }

        @Override // U0.k
        /* renamed from: d */
        public final Object h(String str) {
            return new boolean[]{((Boolean) k.f3613l.h(str)).booleanValue()};
        }

        @Override // U0.k
        public final void e(Bundle bundle, String str, Object obj) {
            bundle.putBooleanArray(str, (boolean[]) obj);
        }

        @Override // U0.k
        public final boolean g(Object obj, Object obj2) {
            Boolean[] boolArr;
            boolean[] zArr = (boolean[]) obj;
            boolean[] zArr2 = (boolean[]) obj2;
            Boolean[] boolArr2 = null;
            if (zArr != null) {
                boolArr = new Boolean[zArr.length];
                int length = zArr.length;
                for (int i = 0; i < length; i++) {
                    boolArr[i] = Boolean.valueOf(zArr[i]);
                }
            } else {
                boolArr = null;
            }
            if (zArr2 != null) {
                boolArr2 = new Boolean[zArr2.length];
                int length2 = zArr2.length;
                for (int i9 = 0; i9 < length2; i9++) {
                    boolArr2[i9] = Boolean.valueOf(zArr2[i9]);
                }
            }
            return P9.i.c(boolArr, boolArr2);
        }

        @Override // U0.b
        public final boolean[] h() {
            return new boolean[0];
        }

        @Override // U0.b
        public final List i(boolean[] zArr) {
            List<Boolean> v10;
            boolean[] zArr2 = zArr;
            if (zArr2 == null || (v10 = P9.l.v(zArr2)) == null) {
                return EmptyList.f23104a;
            }
            List<Boolean> list = v10;
            ArrayList arrayList = new ArrayList(P9.n.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
            }
            return arrayList;
        }
    }

    /* compiled from: NavType.kt */
    public static final class b extends U0.b<List<? extends Boolean>> {
        @Override // U0.k
        public final Object a(String str, Bundle bundle) {
            boolean[] zArr = (boolean[]) bundle.get(str);
            if (zArr != null) {
                return P9.l.v(zArr);
            }
            return null;
        }

        @Override // U0.k
        public final String b() {
            return "List<Boolean>";
        }

        @Override // U0.k
        public final Object c(Object obj, String str) {
            List list = (List) obj;
            c cVar = k.f3613l;
            return list != null ? P9.s.U(list, Collections.singletonList(cVar.h(str))) : Collections.singletonList(cVar.h(str));
        }

        @Override // U0.k
        /* renamed from: d */
        public final Object h(String str) {
            return Collections.singletonList(k.f3613l.h(str));
        }

        @Override // U0.k
        public final void e(Bundle bundle, String str, Object obj) {
            List list = (List) obj;
            bundle.putBooleanArray(str, list != null ? P9.s.Z(list) : null);
        }

        @Override // U0.k
        public final boolean g(Object obj, Object obj2) {
            List list = (List) obj;
            List list2 = (List) obj2;
            return P9.i.c(list != null ? (Boolean[]) list.toArray(new Boolean[0]) : null, list2 != null ? (Boolean[]) list2.toArray(new Boolean[0]) : null);
        }

        @Override // U0.b
        public final List<? extends Boolean> h() {
            return EmptyList.f23104a;
        }

        @Override // U0.b
        public final List i(List<? extends Boolean> list) {
            List<? extends Boolean> list2 = list;
            if (list2 == null) {
                return EmptyList.f23104a;
            }
            List<? extends Boolean> list3 = list2;
            ArrayList arrayList = new ArrayList(P9.n.u(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
            }
            return arrayList;
        }
    }

    /* compiled from: NavType.kt */
    public static final class c extends k<Boolean> {
        @Override // U0.k
        public final Object a(String str, Bundle bundle) {
            return (Boolean) bundle.get(str);
        }

        @Override // U0.k
        public final String b() {
            return "boolean";
        }

        @Override // U0.k
        /* renamed from: d */
        public final Boolean h(String str) {
            boolean z10;
            if (kotlin.jvm.internal.f.b(str, "true")) {
                z10 = true;
            } else {
                if (!kotlin.jvm.internal.f.b(str, "false")) {
                    throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                }
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }

        @Override // U0.k
        public final void e(Bundle bundle, String str, Boolean bool) {
            bundle.putBoolean(str, bool.booleanValue());
        }
    }

    /* compiled from: NavType.kt */
    public static final class d extends U0.b<float[]> {
        @Override // U0.k
        public final Object a(String str, Bundle bundle) {
            return (float[]) bundle.get(str);
        }

        @Override // U0.k
        public final String b() {
            return "float[]";
        }

        @Override // U0.k
        public final Object c(Object obj, String str) {
            float[] fArr = (float[]) obj;
            f fVar = k.i;
            if (fArr == null) {
                return new float[]{((Number) fVar.h(str)).floatValue()};
            }
            float[] fArr2 = {((Number) fVar.h(str)).floatValue()};
            int length = fArr.length;
            float[] copyOf = Arrays.copyOf(fArr, length + 1);
            System.arraycopy(fArr2, 0, copyOf, length, 1);
            return copyOf;
        }

        @Override // U0.k
        /* renamed from: d */
        public final Object h(String str) {
            return new float[]{((Number) k.i.h(str)).floatValue()};
        }

        @Override // U0.k
        public final void e(Bundle bundle, String str, Object obj) {
            bundle.putFloatArray(str, (float[]) obj);
        }

        @Override // U0.k
        public final boolean g(Object obj, Object obj2) {
            Float[] fArr;
            float[] fArr2 = (float[]) obj;
            float[] fArr3 = (float[]) obj2;
            Float[] fArr4 = null;
            if (fArr2 != null) {
                fArr = new Float[fArr2.length];
                int length = fArr2.length;
                for (int i = 0; i < length; i++) {
                    fArr[i] = Float.valueOf(fArr2[i]);
                }
            } else {
                fArr = null;
            }
            if (fArr3 != null) {
                fArr4 = new Float[fArr3.length];
                int length2 = fArr3.length;
                for (int i9 = 0; i9 < length2; i9++) {
                    fArr4[i9] = Float.valueOf(fArr3[i9]);
                }
            }
            return P9.i.c(fArr, fArr4);
        }

        @Override // U0.b
        public final float[] h() {
            return new float[0];
        }

        @Override // U0.b
        public final List i(float[] fArr) {
            List<Float> r8;
            float[] fArr2 = fArr;
            if (fArr2 == null || (r8 = P9.l.r(fArr2)) == null) {
                return EmptyList.f23104a;
            }
            List<Float> list = r8;
            ArrayList arrayList = new ArrayList(P9.n.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).floatValue()));
            }
            return arrayList;
        }
    }

    /* compiled from: NavType.kt */
    public static final class e extends U0.b<List<? extends Float>> {
        @Override // U0.k
        public final Object a(String str, Bundle bundle) {
            float[] fArr = (float[]) bundle.get(str);
            if (fArr != null) {
                return P9.l.r(fArr);
            }
            return null;
        }

        @Override // U0.k
        public final String b() {
            return "List<Float>";
        }

        @Override // U0.k
        public final Object c(Object obj, String str) {
            List list = (List) obj;
            f fVar = k.i;
            return list != null ? P9.s.U(list, Collections.singletonList(fVar.h(str))) : Collections.singletonList(fVar.h(str));
        }

        @Override // U0.k
        /* renamed from: d */
        public final Object h(String str) {
            return Collections.singletonList(k.i.h(str));
        }

        @Override // U0.k
        public final void e(Bundle bundle, String str, Object obj) {
            float[] fArr;
            List list = (List) obj;
            if (list != null) {
                List list2 = list;
                fArr = new float[list2.size()];
                Iterator it = list2.iterator();
                int i = 0;
                while (it.hasNext()) {
                    fArr[i] = ((Number) it.next()).floatValue();
                    i++;
                }
            } else {
                fArr = null;
            }
            bundle.putFloatArray(str, fArr);
        }

        @Override // U0.k
        public final boolean g(Object obj, Object obj2) {
            List list = (List) obj;
            List list2 = (List) obj2;
            return P9.i.c(list != null ? (Float[]) list.toArray(new Float[0]) : null, list2 != null ? (Float[]) list2.toArray(new Float[0]) : null);
        }

        @Override // U0.b
        public final List<? extends Float> h() {
            return EmptyList.f23104a;
        }

        @Override // U0.b
        public final List i(List<? extends Float> list) {
            List<? extends Float> list2 = list;
            if (list2 == null) {
                return EmptyList.f23104a;
            }
            List<? extends Float> list3 = list2;
            ArrayList arrayList = new ArrayList(P9.n.u(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).floatValue()));
            }
            return arrayList;
        }
    }

    /* compiled from: NavType.kt */
    public static final class f extends k<Float> {
        @Override // U0.k
        public final Object a(String str, Bundle bundle) {
            return (Float) bundle.get(str);
        }

        @Override // U0.k
        public final String b() {
            return "float";
        }

        @Override // U0.k
        /* renamed from: d */
        public final Float h(String str) {
            return Float.valueOf(Float.parseFloat(str));
        }

        @Override // U0.k
        public final void e(Bundle bundle, String str, Float f10) {
            bundle.putFloat(str, f10.floatValue());
        }
    }

    /* compiled from: NavType.kt */
    public static final class g extends U0.b<int[]> {
        @Override // U0.k
        public final Object a(String str, Bundle bundle) {
            return (int[]) bundle.get(str);
        }

        @Override // U0.k
        public final String b() {
            return "integer[]";
        }

        @Override // U0.k
        public final Object c(Object obj, String str) {
            int[] iArr = (int[]) obj;
            i iVar = k.f3604b;
            if (iArr == null) {
                return new int[]{((Number) iVar.h(str)).intValue()};
            }
            int[] iArr2 = {((Number) iVar.h(str)).intValue()};
            int length = iArr.length;
            int[] copyOf = Arrays.copyOf(iArr, length + 1);
            System.arraycopy(iArr2, 0, copyOf, length, 1);
            return copyOf;
        }

        @Override // U0.k
        /* renamed from: d */
        public final Object h(String str) {
            return new int[]{((Number) k.f3604b.h(str)).intValue()};
        }

        @Override // U0.k
        public final void e(Bundle bundle, String str, Object obj) {
            bundle.putIntArray(str, (int[]) obj);
        }

        @Override // U0.k
        public final boolean g(Object obj, Object obj2) {
            Integer[] numArr;
            int[] iArr = (int[]) obj;
            int[] iArr2 = (int[]) obj2;
            Integer[] numArr2 = null;
            if (iArr != null) {
                numArr = new Integer[iArr.length];
                int length = iArr.length;
                for (int i = 0; i < length; i++) {
                    numArr[i] = Integer.valueOf(iArr[i]);
                }
            } else {
                numArr = null;
            }
            if (iArr2 != null) {
                numArr2 = new Integer[iArr2.length];
                int length2 = iArr2.length;
                for (int i9 = 0; i9 < length2; i9++) {
                    numArr2[i9] = Integer.valueOf(iArr2[i9]);
                }
            }
            return P9.i.c(numArr, numArr2);
        }

        @Override // U0.b
        public final int[] h() {
            return new int[0];
        }

        @Override // U0.b
        public final List i(int[] iArr) {
            List<Integer> s10;
            int[] iArr2 = iArr;
            if (iArr2 == null || (s10 = P9.l.s(iArr2)) == null) {
                return EmptyList.f23104a;
            }
            List<Integer> list = s10;
            ArrayList arrayList = new ArrayList(P9.n.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).intValue()));
            }
            return arrayList;
        }
    }

    /* compiled from: NavType.kt */
    public static final class h extends U0.b<List<? extends Integer>> {
        @Override // U0.k
        public final Object a(String str, Bundle bundle) {
            int[] iArr = (int[]) bundle.get(str);
            if (iArr != null) {
                return P9.l.s(iArr);
            }
            return null;
        }

        @Override // U0.k
        public final String b() {
            return "List<Int>";
        }

        @Override // U0.k
        public final Object c(Object obj, String str) {
            List list = (List) obj;
            i iVar = k.f3604b;
            return list != null ? P9.s.U(list, Collections.singletonList(iVar.h(str))) : Collections.singletonList(iVar.h(str));
        }

        @Override // U0.k
        /* renamed from: d */
        public final Object h(String str) {
            return Collections.singletonList(k.f3604b.h(str));
        }

        @Override // U0.k
        public final void e(Bundle bundle, String str, Object obj) {
            List list = (List) obj;
            bundle.putIntArray(str, list != null ? P9.s.b0(list) : null);
        }

        @Override // U0.k
        public final boolean g(Object obj, Object obj2) {
            List list = (List) obj;
            List list2 = (List) obj2;
            return P9.i.c(list != null ? (Integer[]) list.toArray(new Integer[0]) : null, list2 != null ? (Integer[]) list2.toArray(new Integer[0]) : null);
        }

        @Override // U0.b
        public final List<? extends Integer> h() {
            return EmptyList.f23104a;
        }

        @Override // U0.b
        public final List i(List<? extends Integer> list) {
            List<? extends Integer> list2 = list;
            if (list2 == null) {
                return EmptyList.f23104a;
            }
            List<? extends Integer> list3 = list2;
            ArrayList arrayList = new ArrayList(P9.n.u(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).intValue()));
            }
            return arrayList;
        }
    }

    /* compiled from: NavType.kt */
    public static final class i extends k<Integer> {
        @Override // U0.k
        public final Object a(String str, Bundle bundle) {
            return (Integer) bundle.get(str);
        }

        @Override // U0.k
        public final String b() {
            return "integer";
        }

        @Override // U0.k
        /* renamed from: d */
        public final Integer h(String str) {
            int parseInt;
            if (str.startsWith("0x")) {
                String substring = str.substring(2);
                j3.e.e(16);
                parseInt = Integer.parseInt(substring, 16);
            } else {
                parseInt = Integer.parseInt(str);
            }
            return Integer.valueOf(parseInt);
        }

        @Override // U0.k
        public final void e(Bundle bundle, String str, Integer num) {
            bundle.putInt(str, num.intValue());
        }
    }

    /* compiled from: NavType.kt */
    public static final class j extends U0.b<long[]> {
        @Override // U0.k
        public final Object a(String str, Bundle bundle) {
            return (long[]) bundle.get(str);
        }

        @Override // U0.k
        public final String b() {
            return "long[]";
        }

        @Override // U0.k
        public final Object c(Object obj, String str) {
            long[] jArr = (long[]) obj;
            l lVar = k.f3608f;
            if (jArr == null) {
                return new long[]{((Number) lVar.h(str)).longValue()};
            }
            long[] jArr2 = {((Number) lVar.h(str)).longValue()};
            int length = jArr.length;
            long[] copyOf = Arrays.copyOf(jArr, length + 1);
            System.arraycopy(jArr2, 0, copyOf, length, 1);
            return copyOf;
        }

        @Override // U0.k
        /* renamed from: d */
        public final Object h(String str) {
            return new long[]{((Number) k.f3608f.h(str)).longValue()};
        }

        @Override // U0.k
        public final void e(Bundle bundle, String str, Object obj) {
            bundle.putLongArray(str, (long[]) obj);
        }

        @Override // U0.k
        public final boolean g(Object obj, Object obj2) {
            Long[] lArr;
            long[] jArr = (long[]) obj;
            long[] jArr2 = (long[]) obj2;
            Long[] lArr2 = null;
            if (jArr != null) {
                lArr = new Long[jArr.length];
                int length = jArr.length;
                for (int i = 0; i < length; i++) {
                    lArr[i] = Long.valueOf(jArr[i]);
                }
            } else {
                lArr = null;
            }
            if (jArr2 != null) {
                lArr2 = new Long[jArr2.length];
                int length2 = jArr2.length;
                for (int i9 = 0; i9 < length2; i9++) {
                    lArr2[i9] = Long.valueOf(jArr2[i9]);
                }
            }
            return P9.i.c(lArr, lArr2);
        }

        @Override // U0.b
        public final long[] h() {
            return new long[0];
        }

        @Override // U0.b
        public final List i(long[] jArr) {
            List<Long> t3;
            long[] jArr2 = jArr;
            if (jArr2 == null || (t3 = P9.l.t(jArr2)) == null) {
                return EmptyList.f23104a;
            }
            List<Long> list = t3;
            ArrayList arrayList = new ArrayList(P9.n.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).longValue()));
            }
            return arrayList;
        }
    }

    /* compiled from: NavType.kt */
    /* renamed from: U0.k$k, reason: collision with other inner class name */
    public static final class C0044k extends U0.b<List<? extends Long>> {
        @Override // U0.k
        public final Object a(String str, Bundle bundle) {
            long[] jArr = (long[]) bundle.get(str);
            if (jArr != null) {
                return P9.l.t(jArr);
            }
            return null;
        }

        @Override // U0.k
        public final String b() {
            return "List<Long>";
        }

        @Override // U0.k
        public final Object c(Object obj, String str) {
            List list = (List) obj;
            l lVar = k.f3608f;
            return list != null ? P9.s.U(list, Collections.singletonList(lVar.h(str))) : Collections.singletonList(lVar.h(str));
        }

        @Override // U0.k
        /* renamed from: d */
        public final Object h(String str) {
            return Collections.singletonList(k.f3608f.h(str));
        }

        @Override // U0.k
        public final void e(Bundle bundle, String str, Object obj) {
            List list = (List) obj;
            bundle.putLongArray(str, list != null ? P9.s.d0(list) : null);
        }

        @Override // U0.k
        public final boolean g(Object obj, Object obj2) {
            List list = (List) obj;
            List list2 = (List) obj2;
            return P9.i.c(list != null ? (Long[]) list.toArray(new Long[0]) : null, list2 != null ? (Long[]) list2.toArray(new Long[0]) : null);
        }

        @Override // U0.b
        public final List<? extends Long> h() {
            return EmptyList.f23104a;
        }

        @Override // U0.b
        public final List i(List<? extends Long> list) {
            List<? extends Long> list2 = list;
            if (list2 == null) {
                return EmptyList.f23104a;
            }
            List<? extends Long> list3 = list2;
            ArrayList arrayList = new ArrayList(P9.n.u(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).longValue()));
            }
            return arrayList;
        }
    }

    /* compiled from: NavType.kt */
    public static final class l extends k<Long> {
        @Override // U0.k
        public final Object a(String str, Bundle bundle) {
            return (Long) bundle.get(str);
        }

        @Override // U0.k
        public final String b() {
            return "long";
        }

        @Override // U0.k
        /* renamed from: d */
        public final Long h(String str) {
            long parseLong;
            String j10 = str.endsWith("L") ? v.j(1, 0, str) : str;
            if (str.startsWith("0x")) {
                String substring = j10.substring(2);
                j3.e.e(16);
                parseLong = Long.parseLong(substring, 16);
            } else {
                parseLong = Long.parseLong(j10);
            }
            return Long.valueOf(parseLong);
        }

        @Override // U0.k
        public final void e(Bundle bundle, String str, Long l10) {
            bundle.putLong(str, l10.longValue());
        }
    }

    /* compiled from: NavType.kt */
    public static final class m extends k<Integer> {
        @Override // U0.k
        public final Object a(String str, Bundle bundle) {
            return (Integer) bundle.get(str);
        }

        @Override // U0.k
        public final String b() {
            return "reference";
        }

        @Override // U0.k
        /* renamed from: d */
        public final Integer h(String str) {
            int parseInt;
            if (str.startsWith("0x")) {
                String substring = str.substring(2);
                j3.e.e(16);
                parseInt = Integer.parseInt(substring, 16);
            } else {
                parseInt = Integer.parseInt(str);
            }
            return Integer.valueOf(parseInt);
        }

        @Override // U0.k
        public final void e(Bundle bundle, String str, Integer num) {
            bundle.putInt(str, num.intValue());
        }
    }

    /* compiled from: NavType.kt */
    public static final class n extends U0.b<String[]> {
        @Override // U0.k
        public final Object a(String str, Bundle bundle) {
            return (String[]) bundle.get(str);
        }

        @Override // U0.k
        public final String b() {
            return "string[]";
        }

        @Override // U0.k
        public final Object c(Object obj, String str) {
            String[] strArr = (String[]) obj;
            if (strArr == null) {
                return new String[]{str};
            }
            int length = strArr.length;
            Object[] copyOf = Arrays.copyOf(strArr, length + 1);
            System.arraycopy(new String[]{str}, 0, copyOf, length, 1);
            return (String[]) copyOf;
        }

        @Override // U0.k
        /* renamed from: d */
        public final Object h(String str) {
            return new String[]{str};
        }

        @Override // U0.k
        public final void e(Bundle bundle, String str, Object obj) {
            bundle.putStringArray(str, (String[]) obj);
        }

        @Override // U0.k
        public final boolean g(Object obj, Object obj2) {
            return P9.i.c((String[]) obj, (String[]) obj2);
        }

        @Override // U0.b
        public final String[] h() {
            return new String[0];
        }

        @Override // U0.b
        public final List i(String[] strArr) {
            String[] strArr2 = strArr;
            if (strArr2 == null) {
                return EmptyList.f23104a;
            }
            ArrayList arrayList = new ArrayList(strArr2.length);
            for (String str : strArr2) {
                arrayList.add(Uri.encode(str));
            }
            return arrayList;
        }
    }

    /* compiled from: NavType.kt */
    public static final class o extends U0.b<List<? extends String>> {
        @Override // U0.k
        public final Object a(String str, Bundle bundle) {
            String[] strArr = (String[]) bundle.get(str);
            if (strArr != null) {
                return P9.l.u(strArr);
            }
            return null;
        }

        @Override // U0.k
        public final String b() {
            return "List<String>";
        }

        @Override // U0.k
        public final Object c(Object obj, String str) {
            List list = (List) obj;
            return list != null ? P9.s.U(list, Collections.singletonList(str)) : Collections.singletonList(str);
        }

        @Override // U0.k
        /* renamed from: d */
        public final Object h(String str) {
            return Collections.singletonList(str);
        }

        @Override // U0.k
        public final void e(Bundle bundle, String str, Object obj) {
            List list = (List) obj;
            bundle.putStringArray(str, list != null ? (String[]) list.toArray(new String[0]) : null);
        }

        @Override // U0.k
        public final boolean g(Object obj, Object obj2) {
            List list = (List) obj;
            List list2 = (List) obj2;
            return P9.i.c(list != null ? (String[]) list.toArray(new String[0]) : null, list2 != null ? (String[]) list2.toArray(new String[0]) : null);
        }

        @Override // U0.b
        public final List<? extends String> h() {
            return EmptyList.f23104a;
        }

        @Override // U0.b
        public final List i(List<? extends String> list) {
            List<? extends String> list2 = list;
            if (list2 == null) {
                return EmptyList.f23104a;
            }
            List<? extends String> list3 = list2;
            ArrayList arrayList = new ArrayList(P9.n.u(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(Uri.encode((String) it.next()));
            }
            return arrayList;
        }
    }

    /* compiled from: NavType.kt */
    public static final class p extends k<String> {
        @Override // U0.k
        public final Object a(String str, Bundle bundle) {
            return (String) bundle.get(str);
        }

        @Override // U0.k
        public final String b() {
            return "string";
        }

        @Override // U0.k
        /* renamed from: d */
        public final String h(String str) {
            if (kotlin.jvm.internal.f.b(str, "null")) {
                return null;
            }
            return str;
        }

        @Override // U0.k
        public final void e(Bundle bundle, String str, String str2) {
            bundle.putString(str, str2);
        }

        @Override // U0.k
        public final String f(String str) {
            String str2 = str;
            String encode = str2 != null ? Uri.encode(str2) : null;
            return encode == null ? "null" : encode;
        }
    }

    /* compiled from: NavType.kt */
    public static final class q<D extends Enum<?>> extends u<D> {

        /* renamed from: s, reason: collision with root package name */
        public final Class<D> f3620s;

        public q(Class<D> cls) {
            super(cls, 0);
            if (cls.isEnum()) {
                this.f3620s = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
        }

        @Override // U0.k.u, U0.k
        public final String b() {
            return this.f3620s.getName();
        }

        @Override // U0.k.u
        /* renamed from: i, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final D h(String str) {
            D d10;
            Class<D> cls = this.f3620s;
            D[] enumConstants = cls.getEnumConstants();
            int length = enumConstants.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    d10 = null;
                    break;
                }
                d10 = enumConstants[i];
                if (C0967l.U(d10.name(), str, true)) {
                    break;
                }
                i++;
            }
            D d11 = d10;
            if (d11 != null) {
                return d11;
            }
            StringBuilder m2 = com.google.android.gms.measurement.internal.a.m("Enum value ", str, " not found for type ");
            m2.append(cls.getName());
            m2.append('.');
            throw new IllegalArgumentException(m2.toString());
        }
    }

    /* compiled from: NavType.kt */
    public static final class r<D extends Parcelable> extends k<D[]> {

        /* renamed from: r, reason: collision with root package name */
        public final Class<D[]> f3621r;

        public r(Class<D> cls) {
            super(true);
            if (!Parcelable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
            }
            try {
                this.f3621r = (Class<D[]>) Class.forName("[L" + cls.getName() + ';');
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // U0.k
        public final Object a(String str, Bundle bundle) {
            return (Parcelable[]) bundle.get(str);
        }

        @Override // U0.k
        public final String b() {
            return this.f3621r.getName();
        }

        @Override // U0.k
        /* renamed from: d */
        public final Object h(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // U0.k
        public final void e(Bundle bundle, String str, Object obj) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            this.f3621r.cast(parcelableArr);
            bundle.putParcelableArray(str, parcelableArr);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !kotlin.jvm.internal.f.b(r.class, obj.getClass())) {
                return false;
            }
            return kotlin.jvm.internal.f.b(this.f3621r, ((r) obj).f3621r);
        }

        @Override // U0.k
        public final boolean g(Object obj, Object obj2) {
            return P9.i.c((Parcelable[]) obj, (Parcelable[]) obj2);
        }

        public final int hashCode() {
            return this.f3621r.hashCode();
        }
    }

    /* compiled from: NavType.kt */
    public static final class s<D> extends k<D> {

        /* renamed from: r, reason: collision with root package name */
        public final Class<D> f3622r;

        public s(Class<D> cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                this.f3622r = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
        }

        @Override // U0.k
        public final Object a(String str, Bundle bundle) {
            return bundle.get(str);
        }

        @Override // U0.k
        public final String b() {
            return this.f3622r.getName();
        }

        @Override // U0.k
        /* renamed from: d */
        public final D h(String str) {
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        @Override // U0.k
        public final void e(Bundle bundle, String str, D d10) {
            this.f3622r.cast(d10);
            if (d10 == null || (d10 instanceof Parcelable)) {
                bundle.putParcelable(str, (Parcelable) d10);
            } else if (d10 instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) d10);
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !kotlin.jvm.internal.f.b(s.class, obj.getClass())) {
                return false;
            }
            return kotlin.jvm.internal.f.b(this.f3622r, ((s) obj).f3622r);
        }

        public final int hashCode() {
            return this.f3622r.hashCode();
        }
    }

    /* compiled from: NavType.kt */
    public static final class t<D extends Serializable> extends k<D[]> {

        /* renamed from: r, reason: collision with root package name */
        public final Class<D[]> f3623r;

        public t(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            }
            try {
                this.f3623r = (Class<D[]>) Class.forName("[L" + cls.getName() + ';');
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // U0.k
        public final Object a(String str, Bundle bundle) {
            return (Serializable[]) bundle.get(str);
        }

        @Override // U0.k
        public final String b() {
            return this.f3623r.getName();
        }

        @Override // U0.k
        /* renamed from: d */
        public final Object h(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
        @Override // U0.k
        public final void e(Bundle bundle, String str, Object obj) {
            ?? r42 = (Serializable[]) obj;
            this.f3623r.cast(r42);
            bundle.putSerializable(str, r42);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !kotlin.jvm.internal.f.b(t.class, obj.getClass())) {
                return false;
            }
            return kotlin.jvm.internal.f.b(this.f3623r, ((t) obj).f3623r);
        }

        @Override // U0.k
        public final boolean g(Object obj, Object obj2) {
            return P9.i.c((Serializable[]) obj, (Serializable[]) obj2);
        }

        public final int hashCode() {
            return this.f3623r.hashCode();
        }
    }

    public k(boolean z10) {
        this.f3619a = z10;
    }

    public abstract Object a(String str, Bundle bundle);

    public String b() {
        return "nav_type";
    }

    public Object c(Object obj, String str) {
        return h(str);
    }

    /* renamed from: d */
    public abstract T h(String str);

    public abstract void e(Bundle bundle, String str, T t3);

    public String f(T t3) {
        return String.valueOf(t3);
    }

    public boolean g(T t3, T t10) {
        return kotlin.jvm.internal.f.b(t3, t10);
    }

    public final String toString() {
        return b();
    }

    /* compiled from: NavType.kt */
    public static class u<D extends Serializable> extends k<D> {

        /* renamed from: r, reason: collision with root package name */
        public final Class<D> f3624r;

        public u(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            }
            if (true ^ cls.isEnum()) {
                this.f3624r = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
        }

        @Override // U0.k
        public final Object a(String str, Bundle bundle) {
            return (Serializable) bundle.get(str);
        }

        @Override // U0.k
        public String b() {
            return this.f3624r.getName();
        }

        @Override // U0.k
        public final void e(Bundle bundle, String str, Object obj) {
            Serializable serializable = (Serializable) obj;
            this.f3624r.cast(serializable);
            bundle.putSerializable(str, serializable);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u)) {
                return false;
            }
            return kotlin.jvm.internal.f.b(this.f3624r, ((u) obj).f3624r);
        }

        @Override // U0.k
        public D h(String str) {
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        public final int hashCode() {
            return this.f3624r.hashCode();
        }

        public u(Class cls, int i) {
            super(false);
            if (Serializable.class.isAssignableFrom(cls)) {
                this.f3624r = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
    }
}

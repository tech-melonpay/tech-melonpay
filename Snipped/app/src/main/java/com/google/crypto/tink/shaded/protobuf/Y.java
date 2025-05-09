package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C0670q;
import com.google.crypto.tink.shaded.protobuf.C0673u;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.logging.Logger;

/* compiled from: SchemaUtil.java */
/* loaded from: classes.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public static final Class<?> f10182a;

    /* renamed from: b, reason: collision with root package name */
    public static final d0<?, ?> f10183b;

    /* renamed from: c, reason: collision with root package name */
    public static final d0<?, ?> f10184c;

    /* renamed from: d, reason: collision with root package name */
    public static final f0 f10185d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f10182a = cls;
        f10183b = A(false);
        f10184c = A(true);
        f10185d = new f0();
    }

    public static d0<?, ?> A(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (d0) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static <T, FT extends C0670q.a<FT>> void B(AbstractC0667n<FT> abstractC0667n, T t3, T t10) {
        a0<FT, Object> a0Var;
        C0670q<FT> c2 = abstractC0667n.c(t10);
        if (c2.f10258a.isEmpty()) {
            return;
        }
        C0670q<FT> d10 = abstractC0667n.d(t3);
        d10.getClass();
        int i = 0;
        while (true) {
            a0Var = c2.f10258a;
            if (i >= a0Var.f10188b.size()) {
                break;
            }
            d10.k(a0Var.d(i));
            i++;
        }
        Iterator<Map.Entry<FT, Object>> it = a0Var.e().iterator();
        while (it.hasNext()) {
            d10.k(it.next());
        }
    }

    public static boolean C(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <UT, UB> UB D(int i, int i9, UB ub, d0<UT, UB> d0Var) {
        if (ub == null) {
            ub = (UB) d0Var.m();
        }
        d0Var.e(i9, i, ub);
        return ub;
    }

    public static void E(int i, List list, C0663j c0663j, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = c0663j.f10246a;
        int i9 = 0;
        if (!z10) {
            while (i9 < list.size()) {
                codedOutputStream.m0(i, ((Boolean) list.get(i9)).booleanValue());
                i9++;
            }
            return;
        }
        codedOutputStream.y0(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Boolean) list.get(i11)).getClass();
            Logger logger = CodedOutputStream.f10090b;
            i10++;
        }
        codedOutputStream.A0(i10);
        while (i9 < list.size()) {
            codedOutputStream.l0(((Boolean) list.get(i9)).booleanValue() ? (byte) 1 : (byte) 0);
            i9++;
        }
    }

    public static void F(int i, List list, C0663j c0663j) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0663j.getClass();
        for (int i9 = 0; i9 < list.size(); i9++) {
            c0663j.f10246a.n0(i, (ByteString) list.get(i9));
        }
    }

    public static void G(int i, List list, C0663j c0663j, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = c0663j.f10246a;
        int i9 = 0;
        if (!z10) {
            while (i9 < list.size()) {
                double doubleValue = ((Double) list.get(i9)).doubleValue();
                codedOutputStream.getClass();
                codedOutputStream.q0(i, Double.doubleToRawLongBits(doubleValue));
                i9++;
            }
            return;
        }
        codedOutputStream.y0(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Double) list.get(i11)).getClass();
            Logger logger = CodedOutputStream.f10090b;
            i10 += 8;
        }
        codedOutputStream.A0(i10);
        while (i9 < list.size()) {
            codedOutputStream.r0(Double.doubleToRawLongBits(((Double) list.get(i9)).doubleValue()));
            i9++;
        }
    }

    public static void H(int i, List list, C0663j c0663j, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = c0663j.f10246a;
        int i9 = 0;
        if (!z10) {
            while (i9 < list.size()) {
                codedOutputStream.s0(i, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        codedOutputStream.y0(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += CodedOutputStream.X(((Integer) list.get(i11)).intValue());
        }
        codedOutputStream.A0(i10);
        while (i9 < list.size()) {
            codedOutputStream.t0(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    public static void I(int i, List list, C0663j c0663j, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = c0663j.f10246a;
        int i9 = 0;
        if (!z10) {
            while (i9 < list.size()) {
                codedOutputStream.o0(i, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        codedOutputStream.y0(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Integer) list.get(i11)).getClass();
            Logger logger = CodedOutputStream.f10090b;
            i10 += 4;
        }
        codedOutputStream.A0(i10);
        while (i9 < list.size()) {
            codedOutputStream.p0(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    public static void J(int i, List list, C0663j c0663j, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = c0663j.f10246a;
        int i9 = 0;
        if (!z10) {
            while (i9 < list.size()) {
                codedOutputStream.q0(i, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        codedOutputStream.y0(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Long) list.get(i11)).getClass();
            Logger logger = CodedOutputStream.f10090b;
            i10 += 8;
        }
        codedOutputStream.A0(i10);
        while (i9 < list.size()) {
            codedOutputStream.r0(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    public static void K(int i, List list, C0663j c0663j, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = c0663j.f10246a;
        int i9 = 0;
        if (!z10) {
            while (i9 < list.size()) {
                float floatValue = ((Float) list.get(i9)).floatValue();
                codedOutputStream.getClass();
                codedOutputStream.o0(i, Float.floatToRawIntBits(floatValue));
                i9++;
            }
            return;
        }
        codedOutputStream.y0(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Float) list.get(i11)).getClass();
            Logger logger = CodedOutputStream.f10090b;
            i10 += 4;
        }
        codedOutputStream.A0(i10);
        while (i9 < list.size()) {
            codedOutputStream.p0(Float.floatToRawIntBits(((Float) list.get(i9)).floatValue()));
            i9++;
        }
    }

    public static void L(int i, List list, C0663j c0663j, X x9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0663j.getClass();
        for (int i9 = 0; i9 < list.size(); i9++) {
            c0663j.h(i, list.get(i9), x9);
        }
    }

    public static void M(int i, List list, C0663j c0663j, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = c0663j.f10246a;
        int i9 = 0;
        if (!z10) {
            while (i9 < list.size()) {
                codedOutputStream.s0(i, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        codedOutputStream.y0(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += CodedOutputStream.X(((Integer) list.get(i11)).intValue());
        }
        codedOutputStream.A0(i10);
        while (i9 < list.size()) {
            codedOutputStream.t0(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    public static void N(int i, List list, C0663j c0663j, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = c0663j.f10246a;
        int i9 = 0;
        if (!z10) {
            while (i9 < list.size()) {
                codedOutputStream.B0(i, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        codedOutputStream.y0(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += CodedOutputStream.k0(((Long) list.get(i11)).longValue());
        }
        codedOutputStream.A0(i10);
        while (i9 < list.size()) {
            codedOutputStream.C0(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    public static void O(int i, List list, C0663j c0663j, X x9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0663j.getClass();
        for (int i9 = 0; i9 < list.size(); i9++) {
            c0663j.k(i, list.get(i9), x9);
        }
    }

    public static void P(int i, List list, C0663j c0663j, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = c0663j.f10246a;
        int i9 = 0;
        if (!z10) {
            while (i9 < list.size()) {
                codedOutputStream.o0(i, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        codedOutputStream.y0(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Integer) list.get(i11)).getClass();
            Logger logger = CodedOutputStream.f10090b;
            i10 += 4;
        }
        codedOutputStream.A0(i10);
        while (i9 < list.size()) {
            codedOutputStream.p0(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    public static void Q(int i, List list, C0663j c0663j, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = c0663j.f10246a;
        int i9 = 0;
        if (!z10) {
            while (i9 < list.size()) {
                codedOutputStream.q0(i, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        codedOutputStream.y0(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Long) list.get(i11)).getClass();
            Logger logger = CodedOutputStream.f10090b;
            i10 += 8;
        }
        codedOutputStream.A0(i10);
        while (i9 < list.size()) {
            codedOutputStream.r0(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    public static void R(int i, List list, C0663j c0663j, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = c0663j.f10246a;
        int i9 = 0;
        if (!z10) {
            while (i9 < list.size()) {
                int intValue = ((Integer) list.get(i9)).intValue();
                codedOutputStream.z0(i, (intValue >> 31) ^ (intValue << 1));
                i9++;
            }
            return;
        }
        codedOutputStream.y0(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int intValue2 = ((Integer) list.get(i11)).intValue();
            i10 += CodedOutputStream.i0((intValue2 >> 31) ^ (intValue2 << 1));
        }
        codedOutputStream.A0(i10);
        while (i9 < list.size()) {
            int intValue3 = ((Integer) list.get(i9)).intValue();
            codedOutputStream.A0((intValue3 >> 31) ^ (intValue3 << 1));
            i9++;
        }
    }

    public static void S(int i, List list, C0663j c0663j, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = c0663j.f10246a;
        int i9 = 0;
        if (!z10) {
            while (i9 < list.size()) {
                long longValue = ((Long) list.get(i9)).longValue();
                codedOutputStream.B0(i, (longValue >> 63) ^ (longValue << 1));
                i9++;
            }
            return;
        }
        codedOutputStream.y0(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            long longValue2 = ((Long) list.get(i11)).longValue();
            i10 += CodedOutputStream.k0((longValue2 >> 63) ^ (longValue2 << 1));
        }
        codedOutputStream.A0(i10);
        while (i9 < list.size()) {
            long longValue3 = ((Long) list.get(i9)).longValue();
            codedOutputStream.C0((longValue3 >> 63) ^ (longValue3 << 1));
            i9++;
        }
    }

    public static void T(int i, List list, C0663j c0663j) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0663j.getClass();
        boolean z10 = list instanceof InterfaceC0677y;
        CodedOutputStream codedOutputStream = c0663j.f10246a;
        int i9 = 0;
        if (!z10) {
            while (i9 < list.size()) {
                codedOutputStream.x0(i, (String) list.get(i9));
                i9++;
            }
            return;
        }
        InterfaceC0677y interfaceC0677y = (InterfaceC0677y) list;
        while (i9 < list.size()) {
            Object d02 = interfaceC0677y.d0(i9);
            if (d02 instanceof String) {
                codedOutputStream.x0(i, (String) d02);
            } else {
                codedOutputStream.n0(i, (ByteString) d02);
            }
            i9++;
        }
    }

    public static void U(int i, List list, C0663j c0663j, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = c0663j.f10246a;
        int i9 = 0;
        if (!z10) {
            while (i9 < list.size()) {
                codedOutputStream.z0(i, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        codedOutputStream.y0(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += CodedOutputStream.i0(((Integer) list.get(i11)).intValue());
        }
        codedOutputStream.A0(i10);
        while (i9 < list.size()) {
            codedOutputStream.A0(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    public static void V(int i, List list, C0663j c0663j, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = c0663j.f10246a;
        int i9 = 0;
        if (!z10) {
            while (i9 < list.size()) {
                codedOutputStream.B0(i, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        codedOutputStream.y0(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += CodedOutputStream.k0(((Long) list.get(i11)).longValue());
        }
        codedOutputStream.A0(i10);
        while (i9 < list.size()) {
            codedOutputStream.C0(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    public static int a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.N(i) * size;
    }

    public static int b(List<?> list) {
        return list.size();
    }

    public static int c(int i, List<ByteString> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int g02 = CodedOutputStream.g0(i) * size;
        for (int i9 = 0; i9 < list.size(); i9++) {
            g02 += CodedOutputStream.P(list.get(i9));
        }
        return g02;
    }

    public static int d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.g0(i) * size) + e(list);
    }

    public static int e(List<Integer> list) {
        int i;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0672t) {
            C0672t c0672t = (C0672t) list;
            i = 0;
            while (i9 < size) {
                c0672t.c(i9);
                i += CodedOutputStream.X(c0672t.f10264b[i9]);
                i9++;
            }
        } else {
            i = 0;
            while (i9 < size) {
                i += CodedOutputStream.X(list.get(i9).intValue());
                i9++;
            }
        }
        return i;
    }

    public static int f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.S(i) * size;
    }

    public static int g(List<?> list) {
        return list.size() * 4;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.T(i) * size;
    }

    public static int i(List<?> list) {
        return list.size() * 8;
    }

    public static int j(int i, List<I> list, X x9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += CodedOutputStream.V(i, list.get(i10), x9);
        }
        return i9;
    }

    public static int k(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.g0(i) * size) + l(list);
    }

    public static int l(List<Integer> list) {
        int i;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0672t) {
            C0672t c0672t = (C0672t) list;
            i = 0;
            while (i9 < size) {
                c0672t.c(i9);
                i += CodedOutputStream.X(c0672t.f10264b[i9]);
                i9++;
            }
        } else {
            i = 0;
            while (i9 < size) {
                i += CodedOutputStream.X(list.get(i9).intValue());
                i9++;
            }
        }
        return i;
    }

    public static int m(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (CodedOutputStream.g0(i) * list.size()) + n(list);
    }

    public static int n(List<Long> list) {
        int i;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof A) {
            A a10 = (A) list;
            i = 0;
            while (i9 < size) {
                a10.c(i9);
                i += CodedOutputStream.k0(a10.f10079b[i9]);
                i9++;
            }
        } else {
            i = 0;
            while (i9 < size) {
                i += CodedOutputStream.k0(list.get(i9).longValue());
                i9++;
            }
        }
        return i;
    }

    public static int o(int i, Object obj, X x9) {
        if (obj instanceof C0675w) {
            return CodedOutputStream.Z((C0675w) obj) + CodedOutputStream.g0(i);
        }
        int g02 = CodedOutputStream.g0(i);
        AbstractC0654a abstractC0654a = (AbstractC0654a) ((I) obj);
        int g10 = abstractC0654a.g();
        if (g10 == -1) {
            g10 = x9.h(abstractC0654a);
            abstractC0654a.i(g10);
        }
        return CodedOutputStream.i0(g10) + g10 + g02;
    }

    public static int p(int i, List<?> list, X x9) {
        int i02;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int g02 = CodedOutputStream.g0(i) * size;
        for (int i9 = 0; i9 < size; i9++) {
            Object obj = list.get(i9);
            if (obj instanceof C0675w) {
                i02 = CodedOutputStream.Z((C0675w) obj);
            } else {
                AbstractC0654a abstractC0654a = (AbstractC0654a) ((I) obj);
                int g10 = abstractC0654a.g();
                if (g10 == -1) {
                    g10 = x9.h(abstractC0654a);
                    abstractC0654a.i(g10);
                }
                i02 = CodedOutputStream.i0(g10) + g10;
            }
            g02 = i02 + g02;
        }
        return g02;
    }

    public static int q(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.g0(i) * size) + r(list);
    }

    public static int r(List<Integer> list) {
        int i;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0672t) {
            C0672t c0672t = (C0672t) list;
            i = 0;
            while (i9 < size) {
                c0672t.c(i9);
                int i10 = c0672t.f10264b[i9];
                i += CodedOutputStream.i0((i10 >> 31) ^ (i10 << 1));
                i9++;
            }
        } else {
            i = 0;
            while (i9 < size) {
                int intValue = list.get(i9).intValue();
                i += CodedOutputStream.i0((intValue >> 31) ^ (intValue << 1));
                i9++;
            }
        }
        return i;
    }

    public static int s(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.g0(i) * size) + t(list);
    }

    public static int t(List<Long> list) {
        int i;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof A) {
            A a10 = (A) list;
            i = 0;
            while (i9 < size) {
                a10.c(i9);
                long j10 = a10.f10079b[i9];
                i += CodedOutputStream.k0((j10 >> 63) ^ (j10 << 1));
                i9++;
            }
        } else {
            i = 0;
            while (i9 < size) {
                long longValue = list.get(i9).longValue();
                i += CodedOutputStream.k0((longValue >> 63) ^ (longValue << 1));
                i9++;
            }
        }
        return i;
    }

    public static int u(int i, List<?> list) {
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        int g02 = CodedOutputStream.g0(i) * size;
        if (list instanceof InterfaceC0677y) {
            InterfaceC0677y interfaceC0677y = (InterfaceC0677y) list;
            while (i9 < size) {
                Object d02 = interfaceC0677y.d0(i9);
                g02 = (d02 instanceof ByteString ? CodedOutputStream.P((ByteString) d02) : CodedOutputStream.f0((String) d02)) + g02;
                i9++;
            }
        } else {
            while (i9 < size) {
                Object obj = list.get(i9);
                g02 = (obj instanceof ByteString ? CodedOutputStream.P((ByteString) obj) : CodedOutputStream.f0((String) obj)) + g02;
                i9++;
            }
        }
        return g02;
    }

    public static int v(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.g0(i) * size) + w(list);
    }

    public static int w(List<Integer> list) {
        int i;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0672t) {
            C0672t c0672t = (C0672t) list;
            i = 0;
            while (i9 < size) {
                c0672t.c(i9);
                i += CodedOutputStream.i0(c0672t.f10264b[i9]);
                i9++;
            }
        } else {
            i = 0;
            while (i9 < size) {
                i += CodedOutputStream.i0(list.get(i9).intValue());
                i9++;
            }
        }
        return i;
    }

    public static int x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.g0(i) * size) + y(list);
    }

    public static int y(List<Long> list) {
        int i;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof A) {
            A a10 = (A) list;
            i = 0;
            while (i9 < size) {
                a10.c(i9);
                i += CodedOutputStream.k0(a10.f10079b[i9]);
                i9++;
            }
        } else {
            i = 0;
            while (i9 < size) {
                i += CodedOutputStream.k0(list.get(i9).longValue());
                i9++;
            }
        }
        return i;
    }

    public static <UT, UB> UB z(int i, List<Integer> list, C0673u.b bVar, UB ub, d0<UT, UB> d0Var) {
        if (bVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i9 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                Integer num = list.get(i10);
                int intValue = num.intValue();
                if (bVar.a()) {
                    if (i10 != i9) {
                        list.set(i9, num);
                    }
                    i9++;
                } else {
                    ub = (UB) D(i, intValue, ub, d0Var);
                }
            }
            if (i9 != size) {
                list.subList(i9, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!bVar.a()) {
                    ub = (UB) D(i, intValue2, ub, d0Var);
                    it.remove();
                }
            }
        }
        return ub;
    }
}

package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C0670q.a;
import com.google.crypto.tink.shaded.protobuf.C0673u;
import com.google.crypto.tink.shaded.protobuf.C0674v;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

/* compiled from: FieldSet.java */
/* renamed from: com.google.crypto.tink.shaded.protobuf.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0670q<T extends a<T>> {

    /* renamed from: d, reason: collision with root package name */
    public static final C0670q f10257d = new C0670q(0);

    /* renamed from: a, reason: collision with root package name */
    public final a0<T, Object> f10258a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10259b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10260c;

    /* compiled from: FieldSet.java */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.q$a */
    public interface a<T extends a<T>> extends Comparable<T> {
        WireFormat$JavaType b();
    }

    public C0670q() {
        this.f10258a = new Z(16);
    }

    public static int b(WireFormat$FieldType wireFormat$FieldType, int i, Object obj) {
        int g02 = CodedOutputStream.g0(i);
        if (wireFormat$FieldType == WireFormat$FieldType.f10169b) {
            g02 *= 2;
        }
        return c(wireFormat$FieldType, obj) + g02;
    }

    public static int c(WireFormat$FieldType wireFormat$FieldType, Object obj) {
        switch (wireFormat$FieldType.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                Logger logger = CodedOutputStream.f10090b;
                return 8;
            case 1:
                ((Float) obj).getClass();
                Logger logger2 = CodedOutputStream.f10090b;
                return 4;
            case 2:
                return CodedOutputStream.k0(((Long) obj).longValue());
            case 3:
                return CodedOutputStream.k0(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.X(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                Logger logger3 = CodedOutputStream.f10090b;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                Logger logger4 = CodedOutputStream.f10090b;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                Logger logger5 = CodedOutputStream.f10090b;
                return 1;
            case 8:
                return obj instanceof ByteString ? CodedOutputStream.P((ByteString) obj) : CodedOutputStream.f0((String) obj);
            case 9:
                Logger logger6 = CodedOutputStream.f10090b;
                return ((I) obj).d();
            case 10:
                if (obj instanceof C0674v) {
                    return CodedOutputStream.Z((C0674v) obj);
                }
                Logger logger7 = CodedOutputStream.f10090b;
                int d10 = ((I) obj).d();
                return CodedOutputStream.i0(d10) + d10;
            case 11:
                if (obj instanceof ByteString) {
                    return CodedOutputStream.P((ByteString) obj);
                }
                Logger logger8 = CodedOutputStream.f10090b;
                int length = ((byte[]) obj).length;
                return CodedOutputStream.i0(length) + length;
            case 12:
                return CodedOutputStream.i0(((Integer) obj).intValue());
            case 13:
                return obj instanceof C0673u.a ? CodedOutputStream.X(((C0673u.a) obj).getNumber()) : CodedOutputStream.X(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                Logger logger9 = CodedOutputStream.f10090b;
                return 4;
            case 15:
                ((Long) obj).getClass();
                Logger logger10 = CodedOutputStream.f10090b;
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return CodedOutputStream.i0((intValue >> 31) ^ (intValue << 1));
            case 17:
                long longValue = ((Long) obj).longValue();
                return CodedOutputStream.k0((longValue >> 63) ^ (longValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(a<?> aVar, Object obj) {
        aVar.getClass();
        return b(null, 0, obj);
    }

    public static int e(Map.Entry entry) {
        a aVar = (a) entry.getKey();
        entry.getValue();
        aVar.b();
        throw null;
    }

    public static <T extends a<T>> boolean i(Map.Entry<T, Object> entry) {
        entry.getKey().b();
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m(com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1, java.lang.Object r2) {
        /*
            java.nio.charset.Charset r0 = com.google.crypto.tink.shaded.protobuf.C0673u.f10266a
            r2.getClass()
            com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = r1.f10171a
            int r1 = r1.ordinal()
            switch(r1) {
                case 0: goto L39;
                case 1: goto L36;
                case 2: goto L33;
                case 3: goto L30;
                case 4: goto L2d;
                case 5: goto L2a;
                case 6: goto L21;
                case 7: goto L18;
                case 8: goto Lf;
                default: goto Le;
            }
        Le:
            goto L3e
        Lf:
            boolean r1 = r2 instanceof com.google.crypto.tink.shaded.protobuf.I
            if (r1 != 0) goto L3d
            boolean r1 = r2 instanceof com.google.crypto.tink.shaded.protobuf.C0674v
            if (r1 == 0) goto L3e
            goto L3d
        L18:
            boolean r1 = r2 instanceof java.lang.Integer
            if (r1 != 0) goto L3d
            boolean r1 = r2 instanceof com.google.crypto.tink.shaded.protobuf.C0673u.a
            if (r1 == 0) goto L3e
            goto L3d
        L21:
            boolean r1 = r2 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r1 != 0) goto L3d
            boolean r1 = r2 instanceof byte[]
            if (r1 == 0) goto L3e
            goto L3d
        L2a:
            boolean r1 = r2 instanceof java.lang.String
            goto L3b
        L2d:
            boolean r1 = r2 instanceof java.lang.Boolean
            goto L3b
        L30:
            boolean r1 = r2 instanceof java.lang.Double
            goto L3b
        L33:
            boolean r1 = r2 instanceof java.lang.Float
            goto L3b
        L36:
            boolean r1 = r2 instanceof java.lang.Long
            goto L3b
        L39:
            boolean r1 = r2 instanceof java.lang.Integer
        L3b:
            if (r1 == 0) goto L3e
        L3d:
            return
        L3e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Wrong object type used with protocol message reflection."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C0670q.m(com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType, java.lang.Object):void");
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0670q<T> clone() {
        a0<T, Object> a0Var;
        C0670q<T> c0670q = new C0670q<>();
        int i = 0;
        while (true) {
            a0Var = this.f10258a;
            if (i >= a0Var.f10188b.size()) {
                break;
            }
            Map.Entry<T, Object> d10 = a0Var.d(i);
            c0670q.l(d10.getKey(), d10.getValue());
            i++;
        }
        for (Map.Entry<T, Object> entry : a0Var.e()) {
            c0670q.l(entry.getKey(), entry.getValue());
        }
        c0670q.f10260c = this.f10260c;
        return c0670q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0670q) {
            return this.f10258a.equals(((C0670q) obj).f10258a);
        }
        return false;
    }

    public final int f() {
        a0<T, Object> a0Var;
        int i = 0;
        int i9 = 0;
        while (true) {
            a0Var = this.f10258a;
            if (i >= a0Var.f10188b.size()) {
                break;
            }
            Map.Entry<T, Object> d10 = a0Var.d(i);
            i9 += d(d10.getKey(), d10.getValue());
            i++;
        }
        for (Map.Entry<T, Object> entry : a0Var.e()) {
            i9 += d(entry.getKey(), entry.getValue());
        }
        return i9;
    }

    public final boolean g() {
        return this.f10258a.isEmpty();
    }

    public final boolean h() {
        int i = 0;
        while (true) {
            a0<T, Object> a0Var = this.f10258a;
            if (i >= a0Var.f10188b.size()) {
                Iterator<Map.Entry<T, Object>> it = a0Var.e().iterator();
                while (it.hasNext()) {
                    if (!i(it.next())) {
                        return false;
                    }
                }
                return true;
            }
            if (!i(a0Var.d(i))) {
                return false;
            }
            i++;
        }
    }

    public final int hashCode() {
        return this.f10258a.hashCode();
    }

    public final Iterator<Map.Entry<T, Object>> j() {
        boolean z10 = this.f10260c;
        a0<T, Object> a0Var = this.f10258a;
        return z10 ? new C0674v.b(a0Var.entrySet().iterator()) : a0Var.entrySet().iterator();
    }

    public final void k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C0674v) {
            ((C0674v) value).a(null);
        }
        key.getClass();
        key.b();
        throw null;
    }

    public final void l(T t3, Object obj) {
        t3.getClass();
        m(null, obj);
        if (obj instanceof C0674v) {
            this.f10260c = true;
        }
        this.f10258a.put(t3, obj);
    }

    public C0670q(int i) {
        int i9 = a0.f10186g;
        Z z10 = new Z(0);
        this.f10258a = z10;
        if (!this.f10259b) {
            z10.g();
            this.f10259b = true;
        }
        if (this.f10259b) {
            return;
        }
        z10.g();
        this.f10259b = true;
    }
}

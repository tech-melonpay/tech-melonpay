package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C0658e;
import com.google.crypto.tink.shaded.protobuf.C0673u;
import com.google.crypto.tink.shaded.protobuf.h0;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import sun.misc.Unsafe;

/* compiled from: MessageSchema.java */
/* loaded from: classes.dex */
public final class L<T> implements X<T> {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f10129r = new int[0];

    /* renamed from: s, reason: collision with root package name */
    public static final Unsafe f10130s = h0.l();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f10131a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f10132b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10133c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10134d;

    /* renamed from: e, reason: collision with root package name */
    public final I f10135e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f10136f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f10137g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f10138h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f10139j;

    /* renamed from: k, reason: collision with root package name */
    public final int f10140k;

    /* renamed from: l, reason: collision with root package name */
    public final int f10141l;

    /* renamed from: m, reason: collision with root package name */
    public final N f10142m;

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC0678z f10143n;

    /* renamed from: o, reason: collision with root package name */
    public final d0<?, ?> f10144o;

    /* renamed from: p, reason: collision with root package name */
    public final AbstractC0667n<?> f10145p;

    /* renamed from: q, reason: collision with root package name */
    public final D f10146q;

    public L(int[] iArr, Object[] objArr, int i, int i9, I i10, boolean z10, int[] iArr2, int i11, int i12, N n10, AbstractC0678z abstractC0678z, d0 d0Var, AbstractC0667n abstractC0667n, D d10) {
        this.f10131a = iArr;
        this.f10132b = objArr;
        this.f10133c = i;
        this.f10134d = i9;
        this.f10137g = i10 instanceof GeneratedMessageLite;
        this.f10138h = z10;
        this.f10136f = abstractC0667n != null && abstractC0667n.e(i10);
        this.i = false;
        this.f10139j = iArr2;
        this.f10140k = i11;
        this.f10141l = i12;
        this.f10142m = n10;
        this.f10143n = abstractC0678z;
        this.f10144o = d0Var;
        this.f10145p = abstractC0667n;
        this.f10135e = i10;
        this.f10146q = d10;
    }

    public static long A(int i) {
        return i & 1048575;
    }

    public static int B(long j10, Object obj) {
        return ((Integer) h0.f10236d.i(j10, obj)).intValue();
    }

    public static long C(long j10, Object obj) {
        return ((Long) h0.f10236d.i(j10, obj)).longValue();
    }

    public static Field M(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder m2 = com.google.android.gms.measurement.internal.a.m("Field ", str, " for ");
            m2.append(cls.getName());
            m2.append(" not found. Known fields are ");
            m2.append(Arrays.toString(declaredFields));
            throw new RuntimeException(m2.toString());
        }
    }

    public static int Q(int i) {
        return (i & 267386880) >>> 20;
    }

    public static void U(int i, Object obj, C0663j c0663j) {
        if (!(obj instanceof String)) {
            c0663j.b(i, (ByteString) obj);
        } else {
            c0663j.f10246a.x0(i, (String) obj);
        }
    }

    public static e0 o(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        e0 e0Var = generatedMessageLite.unknownFields;
        if (e0Var != e0.f10210f) {
            return e0Var;
        }
        e0 e0Var2 = new e0();
        generatedMessageLite.unknownFields = e0Var2;
        return e0Var2;
    }

    public static List t(long j10, Object obj) {
        return (List) h0.f10236d.i(j10, obj);
    }

    public static L y(G g10, N n10, AbstractC0678z abstractC0678z, d0 d0Var, AbstractC0667n abstractC0667n, D d10) {
        if (g10 instanceof V) {
            return z((V) g10, n10, abstractC0678z, d0Var, abstractC0667n, d10);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0289  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> com.google.crypto.tink.shaded.protobuf.L<T> z(com.google.crypto.tink.shaded.protobuf.V r34, com.google.crypto.tink.shaded.protobuf.N r35, com.google.crypto.tink.shaded.protobuf.AbstractC0678z r36, com.google.crypto.tink.shaded.protobuf.d0<?, ?> r37, com.google.crypto.tink.shaded.protobuf.AbstractC0667n<?> r38, com.google.crypto.tink.shaded.protobuf.D r39) {
        /*
            Method dump skipped, instructions count: 1055
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.L.z(com.google.crypto.tink.shaded.protobuf.V, com.google.crypto.tink.shaded.protobuf.N, com.google.crypto.tink.shaded.protobuf.z, com.google.crypto.tink.shaded.protobuf.d0, com.google.crypto.tink.shaded.protobuf.n, com.google.crypto.tink.shaded.protobuf.D):com.google.crypto.tink.shaded.protobuf.L");
    }

    public final void D(Object obj, byte[] bArr, int i, int i9, int i10, long j10, C0658e.a aVar) {
        Unsafe unsafe = f10130s;
        Object m2 = m(i10);
        Object object = unsafe.getObject(obj, j10);
        D d10 = this.f10146q;
        if (d10.g(object)) {
            MapFieldLite d11 = d10.d();
            d10.a(d11, object);
            unsafe.putObject(obj, j10, d11);
            object = d11;
        }
        d10.c(m2);
        d10.e(object);
        int H10 = C0658e.H(bArr, i, aVar);
        int i11 = aVar.f10206a;
        if (i11 >= 0 && i11 <= i9 - H10) {
            throw null;
        }
        throw InvalidProtocolBufferException.f();
    }

    public final int E(T t3, byte[] bArr, int i, int i9, int i10, int i11, int i12, int i13, int i14, long j10, int i15, C0658e.a aVar) {
        Unsafe unsafe = f10130s;
        long j11 = this.f10131a[i15 + 2] & 1048575;
        switch (i14) {
            case 51:
                if (i12 == 1) {
                    unsafe.putObject(t3, j10, Double.valueOf(C0658e.d(i, bArr)));
                    int i16 = i + 8;
                    unsafe.putInt(t3, j11, i11);
                    return i16;
                }
                break;
            case 52:
                if (i12 == 5) {
                    unsafe.putObject(t3, j10, Float.valueOf(C0658e.k(i, bArr)));
                    int i17 = i + 4;
                    unsafe.putInt(t3, j11, i11);
                    return i17;
                }
                break;
            case 53:
            case 54:
                if (i12 == 0) {
                    int J3 = C0658e.J(bArr, i, aVar);
                    unsafe.putObject(t3, j10, Long.valueOf(aVar.f10207b));
                    unsafe.putInt(t3, j11, i11);
                    return J3;
                }
                break;
            case 55:
            case 62:
                if (i12 == 0) {
                    int H10 = C0658e.H(bArr, i, aVar);
                    unsafe.putObject(t3, j10, Integer.valueOf(aVar.f10206a));
                    unsafe.putInt(t3, j11, i11);
                    return H10;
                }
                break;
            case 56:
            case 65:
                if (i12 == 1) {
                    unsafe.putObject(t3, j10, Long.valueOf(C0658e.i(i, bArr)));
                    int i18 = i + 8;
                    unsafe.putInt(t3, j11, i11);
                    return i18;
                }
                break;
            case 57:
            case 64:
                if (i12 == 5) {
                    unsafe.putObject(t3, j10, Integer.valueOf(C0658e.g(i, bArr)));
                    int i19 = i + 4;
                    unsafe.putInt(t3, j11, i11);
                    return i19;
                }
                break;
            case 58:
                if (i12 == 0) {
                    int J10 = C0658e.J(bArr, i, aVar);
                    unsafe.putObject(t3, j10, Boolean.valueOf(aVar.f10207b != 0));
                    unsafe.putInt(t3, j11, i11);
                    return J10;
                }
                break;
            case 59:
                if (i12 == 2) {
                    int H11 = C0658e.H(bArr, i, aVar);
                    int i20 = aVar.f10206a;
                    if (i20 == 0) {
                        unsafe.putObject(t3, j10, "");
                    } else {
                        if ((i13 & PKIFailureInfo.duplicateCertReq) != 0 && !Utf8.e(H11, H11 + i20, bArr)) {
                            throw InvalidProtocolBufferException.a();
                        }
                        unsafe.putObject(t3, j10, new String(bArr, H11, i20, C0673u.f10266a));
                        H11 += i20;
                    }
                    unsafe.putInt(t3, j11, i11);
                    return H11;
                }
                break;
            case 60:
                if (i12 == 2) {
                    int o10 = C0658e.o(n(i15), bArr, i, i9, aVar);
                    Object object = unsafe.getInt(t3, j11) == i11 ? unsafe.getObject(t3, j10) : null;
                    if (object == null) {
                        unsafe.putObject(t3, j10, aVar.f10208c);
                    } else {
                        unsafe.putObject(t3, j10, C0673u.c(object, aVar.f10208c));
                    }
                    unsafe.putInt(t3, j11, i11);
                    return o10;
                }
                break;
            case 61:
                if (i12 == 2) {
                    int b9 = C0658e.b(bArr, i, aVar);
                    unsafe.putObject(t3, j10, aVar.f10208c);
                    unsafe.putInt(t3, j11, i11);
                    return b9;
                }
                break;
            case 63:
                if (i12 == 0) {
                    int H12 = C0658e.H(bArr, i, aVar);
                    int i21 = aVar.f10206a;
                    C0673u.b l10 = l(i15);
                    if (l10 == null || l10.a()) {
                        unsafe.putObject(t3, j10, Integer.valueOf(i21));
                        unsafe.putInt(t3, j11, i11);
                    } else {
                        o(t3).b(i10, Long.valueOf(i21));
                    }
                    return H12;
                }
                break;
            case 66:
                if (i12 == 0) {
                    int H13 = C0658e.H(bArr, i, aVar);
                    unsafe.putObject(t3, j10, Integer.valueOf(AbstractC0661h.b(aVar.f10206a)));
                    unsafe.putInt(t3, j11, i11);
                    return H13;
                }
                break;
            case 67:
                if (i12 == 0) {
                    int J11 = C0658e.J(bArr, i, aVar);
                    unsafe.putObject(t3, j10, Long.valueOf(AbstractC0661h.c(aVar.f10207b)));
                    unsafe.putInt(t3, j11, i11);
                    return J11;
                }
                break;
            case 68:
                if (i12 == 3) {
                    int m2 = C0658e.m(n(i15), bArr, i, i9, (i10 & (-8)) | 4, aVar);
                    Object object2 = unsafe.getInt(t3, j11) == i11 ? unsafe.getObject(t3, j10) : null;
                    if (object2 == null) {
                        unsafe.putObject(t3, j10, aVar.f10208c);
                    } else {
                        unsafe.putObject(t3, j10, C0673u.c(object2, aVar.f10208c));
                    }
                    unsafe.putInt(t3, j11, i11);
                    return m2;
                }
                break;
        }
        return i;
    }

    public final int F(T t3, byte[] bArr, int i, int i9, int i10, C0658e.a aVar) {
        Unsafe unsafe;
        int i11;
        L<T> l10;
        Object obj;
        T t10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        Object obj2;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int J3;
        int i29;
        L<T> l11 = this;
        T t11 = t3;
        byte[] bArr2 = bArr;
        int i30 = i9;
        int i31 = i10;
        C0658e.a aVar2 = aVar;
        Unsafe unsafe2 = f10130s;
        int i32 = i;
        int i33 = -1;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = -1;
        while (true) {
            if (i32 < i30) {
                int i38 = i32 + 1;
                byte b9 = bArr2[i32];
                if (b9 < 0) {
                    i13 = C0658e.G(b9, bArr2, i38, aVar2);
                    i12 = aVar2.f10206a;
                } else {
                    i12 = b9;
                    i13 = i38;
                }
                int i39 = i12 >>> 3;
                int i40 = i12 & 7;
                int i41 = l11.f10134d;
                int i42 = i13;
                int i43 = l11.f10133c;
                int i44 = i12;
                if (i39 > i33) {
                    i16 = (i39 < i43 || i39 > i41) ? -1 : l11.P(i39, i34 / 3);
                    i17 = -1;
                    i14 = 0;
                } else {
                    if (i39 < i43 || i39 > i41) {
                        i14 = 0;
                        i15 = -1;
                    } else {
                        i14 = 0;
                        i15 = l11.P(i39, 0);
                    }
                    i16 = i15;
                    i17 = -1;
                }
                if (i16 == i17) {
                    i18 = i14;
                    i19 = i36;
                    i20 = i37;
                    i21 = i39;
                    unsafe = unsafe2;
                    i11 = i31;
                    i22 = i42;
                    i23 = i44;
                    obj2 = null;
                } else {
                    int[] iArr = l11.f10131a;
                    int i45 = iArr[i16 + 1];
                    int Q4 = Q(i45);
                    long j10 = i45 & 1048575;
                    if (Q4 <= 17) {
                        int i46 = iArr[i16 + 2];
                        int i47 = 1 << (i46 >>> 20);
                        int i48 = i46 & 1048575;
                        if (i48 != i37) {
                            if (i37 != -1) {
                                unsafe2.putInt(t11, i37, i36);
                                i29 = i48;
                            } else {
                                i29 = i48;
                            }
                            i20 = i29;
                            i26 = unsafe2.getInt(t11, i29);
                        } else {
                            i20 = i37;
                            i26 = i36;
                        }
                        switch (Q4) {
                            case 0:
                                i21 = i39;
                                i23 = i44;
                                bArr2 = bArr;
                                i28 = i16;
                                i22 = i42;
                                if (i40 == 1) {
                                    h0.q(t11, j10, C0658e.d(i22, bArr2));
                                    i32 = i22 + 8;
                                    i36 = i26 | i47;
                                    i35 = i23;
                                    i34 = i28;
                                    i33 = i21;
                                    i37 = i20;
                                    i31 = i10;
                                    break;
                                } else {
                                    i11 = i10;
                                    i19 = i26;
                                    unsafe = unsafe2;
                                    i18 = i28;
                                    obj2 = null;
                                    break;
                                }
                            case 1:
                                i21 = i39;
                                i23 = i44;
                                bArr2 = bArr;
                                i28 = i16;
                                i22 = i42;
                                if (i40 == 5) {
                                    h0.r(t11, j10, C0658e.k(i22, bArr2));
                                    i32 = i22 + 4;
                                    i36 = i26 | i47;
                                    i35 = i23;
                                    i34 = i28;
                                    i33 = i21;
                                    i37 = i20;
                                    i31 = i10;
                                    break;
                                } else {
                                    i11 = i10;
                                    i19 = i26;
                                    unsafe = unsafe2;
                                    i18 = i28;
                                    obj2 = null;
                                    break;
                                }
                            case 2:
                            case 3:
                                i21 = i39;
                                i23 = i44;
                                bArr2 = bArr;
                                i28 = i16;
                                i22 = i42;
                                if (i40 == 0) {
                                    J3 = C0658e.J(bArr2, i22, aVar2);
                                    unsafe2.putLong(t3, j10, aVar2.f10207b);
                                    i36 = i26 | i47;
                                    i32 = J3;
                                    i35 = i23;
                                    i34 = i28;
                                    i33 = i21;
                                    i37 = i20;
                                    i31 = i10;
                                    break;
                                } else {
                                    i11 = i10;
                                    i19 = i26;
                                    unsafe = unsafe2;
                                    i18 = i28;
                                    obj2 = null;
                                    break;
                                }
                            case 4:
                            case 11:
                                i21 = i39;
                                i23 = i44;
                                bArr2 = bArr;
                                i28 = i16;
                                i22 = i42;
                                if (i40 == 0) {
                                    i32 = C0658e.H(bArr2, i22, aVar2);
                                    unsafe2.putInt(t11, j10, aVar2.f10206a);
                                    i36 = i26 | i47;
                                    i35 = i23;
                                    i34 = i28;
                                    i33 = i21;
                                    i37 = i20;
                                    i31 = i10;
                                    break;
                                } else {
                                    i11 = i10;
                                    i19 = i26;
                                    unsafe = unsafe2;
                                    i18 = i28;
                                    obj2 = null;
                                    break;
                                }
                            case 5:
                            case 14:
                                i21 = i39;
                                i27 = i42;
                                i23 = i44;
                                bArr2 = bArr;
                                i28 = i16;
                                if (i40 == 1) {
                                    unsafe2.putLong(t3, j10, C0658e.i(i27, bArr2));
                                    i32 = i27 + 8;
                                    i36 = i26 | i47;
                                    i35 = i23;
                                    i34 = i28;
                                    i33 = i21;
                                    i37 = i20;
                                    i31 = i10;
                                    break;
                                } else {
                                    i22 = i27;
                                    i11 = i10;
                                    i19 = i26;
                                    unsafe = unsafe2;
                                    i18 = i28;
                                    obj2 = null;
                                    break;
                                }
                            case 6:
                            case 13:
                                i21 = i39;
                                i27 = i42;
                                i23 = i44;
                                bArr2 = bArr;
                                i28 = i16;
                                if (i40 == 5) {
                                    unsafe2.putInt(t11, j10, C0658e.g(i27, bArr2));
                                    i32 = i27 + 4;
                                    i36 = i26 | i47;
                                    i35 = i23;
                                    i34 = i28;
                                    i33 = i21;
                                    i37 = i20;
                                    i31 = i10;
                                    break;
                                } else {
                                    i22 = i27;
                                    i11 = i10;
                                    i19 = i26;
                                    unsafe = unsafe2;
                                    i18 = i28;
                                    obj2 = null;
                                    break;
                                }
                            case 7:
                                i21 = i39;
                                i27 = i42;
                                i23 = i44;
                                bArr2 = bArr;
                                i28 = i16;
                                if (i40 == 0) {
                                    i32 = C0658e.J(bArr2, i27, aVar2);
                                    h0.m(t11, j10, aVar2.f10207b != 0);
                                    i36 = i26 | i47;
                                    i35 = i23;
                                    i34 = i28;
                                    i33 = i21;
                                    i37 = i20;
                                    i31 = i10;
                                    break;
                                } else {
                                    i22 = i27;
                                    i11 = i10;
                                    i19 = i26;
                                    unsafe = unsafe2;
                                    i18 = i28;
                                    obj2 = null;
                                    break;
                                }
                            case 8:
                                i21 = i39;
                                i27 = i42;
                                i23 = i44;
                                bArr2 = bArr;
                                i28 = i16;
                                if (i40 == 2) {
                                    i32 = (i45 & PKIFailureInfo.duplicateCertReq) == 0 ? C0658e.B(bArr2, i27, aVar2) : C0658e.E(bArr2, i27, aVar2);
                                    unsafe2.putObject(t11, j10, aVar2.f10208c);
                                    i36 = i26 | i47;
                                    i35 = i23;
                                    i34 = i28;
                                    i33 = i21;
                                    i37 = i20;
                                    i31 = i10;
                                    break;
                                } else {
                                    i22 = i27;
                                    i11 = i10;
                                    i19 = i26;
                                    unsafe = unsafe2;
                                    i18 = i28;
                                    obj2 = null;
                                    break;
                                }
                            case 9:
                                i21 = i39;
                                i27 = i42;
                                i23 = i44;
                                bArr2 = bArr;
                                i28 = i16;
                                if (i40 == 2) {
                                    i32 = C0658e.o(l11.n(i28), bArr2, i27, i30, aVar2);
                                    if ((i26 & i47) == 0) {
                                        unsafe2.putObject(t11, j10, aVar2.f10208c);
                                    } else {
                                        unsafe2.putObject(t11, j10, C0673u.c(unsafe2.getObject(t11, j10), aVar2.f10208c));
                                    }
                                    i36 = i26 | i47;
                                    i35 = i23;
                                    i34 = i28;
                                    i33 = i21;
                                    i37 = i20;
                                    i31 = i10;
                                    break;
                                } else {
                                    i22 = i27;
                                    i11 = i10;
                                    i19 = i26;
                                    unsafe = unsafe2;
                                    i18 = i28;
                                    obj2 = null;
                                    break;
                                }
                            case 10:
                                i21 = i39;
                                i27 = i42;
                                i23 = i44;
                                bArr2 = bArr;
                                i28 = i16;
                                if (i40 == 2) {
                                    i32 = C0658e.b(bArr2, i27, aVar2);
                                    unsafe2.putObject(t11, j10, aVar2.f10208c);
                                    i36 = i26 | i47;
                                    i35 = i23;
                                    i34 = i28;
                                    i33 = i21;
                                    i37 = i20;
                                    i31 = i10;
                                    break;
                                } else {
                                    i22 = i27;
                                    i11 = i10;
                                    i19 = i26;
                                    unsafe = unsafe2;
                                    i18 = i28;
                                    obj2 = null;
                                    break;
                                }
                            case 12:
                                i21 = i39;
                                i27 = i42;
                                i23 = i44;
                                bArr2 = bArr;
                                i28 = i16;
                                if (i40 != 0) {
                                    i22 = i27;
                                    i11 = i10;
                                    i19 = i26;
                                    unsafe = unsafe2;
                                    i18 = i28;
                                    obj2 = null;
                                    break;
                                } else {
                                    i32 = C0658e.H(bArr2, i27, aVar2);
                                    int i49 = aVar2.f10206a;
                                    C0673u.b l12 = l11.l(i28);
                                    if (l12 == null || l12.a()) {
                                        unsafe2.putInt(t11, j10, i49);
                                        i36 = i26 | i47;
                                        i35 = i23;
                                        i34 = i28;
                                        i33 = i21;
                                        i37 = i20;
                                        i31 = i10;
                                        break;
                                    } else {
                                        o(t3).b(i23, Long.valueOf(i49));
                                        i36 = i26;
                                        i35 = i23;
                                        i34 = i28;
                                        i33 = i21;
                                        i37 = i20;
                                        i31 = i10;
                                    }
                                }
                                break;
                            case 15:
                                i21 = i39;
                                i27 = i42;
                                i23 = i44;
                                bArr2 = bArr;
                                i28 = i16;
                                if (i40 == 0) {
                                    i32 = C0658e.H(bArr2, i27, aVar2);
                                    unsafe2.putInt(t11, j10, AbstractC0661h.b(aVar2.f10206a));
                                    i36 = i26 | i47;
                                    i35 = i23;
                                    i34 = i28;
                                    i33 = i21;
                                    i37 = i20;
                                    i31 = i10;
                                    break;
                                } else {
                                    i22 = i27;
                                    i11 = i10;
                                    i19 = i26;
                                    unsafe = unsafe2;
                                    i18 = i28;
                                    obj2 = null;
                                    break;
                                }
                            case 16:
                                i21 = i39;
                                i27 = i42;
                                i23 = i44;
                                int i50 = i16;
                                if (i40 == 0) {
                                    bArr2 = bArr;
                                    J3 = C0658e.J(bArr2, i27, aVar2);
                                    i28 = i50;
                                    unsafe2.putLong(t3, j10, AbstractC0661h.c(aVar2.f10207b));
                                    i36 = i26 | i47;
                                    i32 = J3;
                                    i35 = i23;
                                    i34 = i28;
                                    i33 = i21;
                                    i37 = i20;
                                    i31 = i10;
                                    break;
                                } else {
                                    i28 = i50;
                                    i22 = i27;
                                    i11 = i10;
                                    i19 = i26;
                                    unsafe = unsafe2;
                                    i18 = i28;
                                    obj2 = null;
                                    break;
                                }
                            case 17:
                                if (i40 == 3) {
                                    int i51 = i16;
                                    i32 = C0658e.m(l11.n(i16), bArr, i42, i9, (i39 << 3) | 4, aVar);
                                    if ((i26 & i47) == 0) {
                                        unsafe2.putObject(t11, j10, aVar2.f10208c);
                                    } else {
                                        unsafe2.putObject(t11, j10, C0673u.c(unsafe2.getObject(t11, j10), aVar2.f10208c));
                                    }
                                    i36 = i26 | i47;
                                    bArr2 = bArr;
                                    i31 = i10;
                                    i34 = i51;
                                    i35 = i44;
                                    i33 = i39;
                                    i37 = i20;
                                    break;
                                } else {
                                    i21 = i39;
                                    i27 = i42;
                                    i23 = i44;
                                    i28 = i16;
                                    i22 = i27;
                                    i11 = i10;
                                    i19 = i26;
                                    unsafe = unsafe2;
                                    i18 = i28;
                                    obj2 = null;
                                    break;
                                }
                            default:
                                i28 = i16;
                                i21 = i39;
                                i22 = i42;
                                i23 = i44;
                                i11 = i10;
                                i19 = i26;
                                unsafe = unsafe2;
                                i18 = i28;
                                obj2 = null;
                                break;
                        }
                    } else {
                        i21 = i39;
                        bArr2 = bArr;
                        int i52 = i16;
                        if (Q4 != 27) {
                            i19 = i36;
                            i20 = i37;
                            if (Q4 <= 49) {
                                i25 = i44;
                                unsafe = unsafe2;
                                i18 = i52;
                                i32 = H(t3, bArr, i42, i9, i44, i21, i40, i52, i45, Q4, j10, aVar);
                                if (i32 == i42) {
                                    i11 = i10;
                                    i22 = i32;
                                    i23 = i25;
                                    obj2 = null;
                                }
                            } else {
                                i24 = i42;
                                i25 = i44;
                                unsafe = unsafe2;
                                i18 = i52;
                                if (Q4 != 50) {
                                    obj2 = null;
                                    i32 = E(t3, bArr, i24, i9, i25, i21, i40, i45, Q4, j10, i18, aVar);
                                    if (i32 == i24) {
                                        i11 = i10;
                                        i22 = i32;
                                        i23 = i25;
                                    }
                                } else if (i40 == 2) {
                                    D(t3, bArr, i24, i9, i18, j10, aVar);
                                    throw null;
                                }
                            }
                            l11 = this;
                            t11 = t3;
                            bArr2 = bArr;
                            i30 = i9;
                            i31 = i10;
                            aVar2 = aVar;
                            i36 = i19;
                            i33 = i21;
                            i35 = i25;
                            i37 = i20;
                            i34 = i18;
                            unsafe2 = unsafe;
                        } else if (i40 == 2) {
                            C0673u.c cVar = (C0673u.c) unsafe2.getObject(t11, j10);
                            if (!cVar.k0()) {
                                int size = cVar.size();
                                cVar = cVar.p(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(t11, j10, cVar);
                            }
                            i20 = i37;
                            i32 = C0658e.p(l11.n(i52), i44, bArr, i42, i9, cVar, aVar);
                            i35 = i44;
                            i34 = i52;
                            i36 = i36;
                            i33 = i21;
                            i37 = i20;
                            i31 = i10;
                        } else {
                            i19 = i36;
                            i20 = i37;
                            i24 = i42;
                            i25 = i44;
                            unsafe = unsafe2;
                            i18 = i52;
                        }
                        i11 = i10;
                        i22 = i24;
                        i23 = i25;
                        obj2 = null;
                    }
                }
                if (i23 != i11 || i11 == 0) {
                    i32 = (!this.f10136f || aVar.f10209d == C0666m.a()) ? C0658e.F(i23, bArr, i22, i9, o(t3), aVar) : C0658e.f(i23, bArr, i22, i9, t3, this.f10135e, aVar);
                    t11 = t3;
                    bArr2 = bArr;
                    i30 = i9;
                    i31 = i11;
                    i35 = i23;
                    l11 = this;
                    aVar2 = aVar;
                    i36 = i19;
                    i33 = i21;
                    i37 = i20;
                    i34 = i18;
                    unsafe2 = unsafe;
                } else {
                    l10 = this;
                    i32 = i22;
                    i35 = i23;
                    obj = obj2;
                    i36 = i19;
                    i37 = i20;
                }
            } else {
                unsafe = unsafe2;
                i11 = i31;
                l10 = l11;
                obj = null;
            }
        }
        if (i37 != -1) {
            t10 = t3;
            unsafe.putInt(t10, i37, i36);
        } else {
            t10 = t3;
        }
        for (int i53 = l10.f10140k; i53 < l10.f10141l; i53++) {
            l10.k(t10, l10.f10139j[i53], obj, l10.f10144o);
        }
        if (i11 == 0) {
            if (i32 != i9) {
                throw InvalidProtocolBufferException.e();
            }
        } else if (i32 > i9 || i35 != i11) {
            throw InvalidProtocolBufferException.e();
        }
        return i32;
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x01f9, code lost:
    
        if (r0 != r15) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0211, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x025c, code lost:
    
        if (r0 != r15) goto L101;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x006c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r28v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(java.lang.Object r28, byte[] r29, int r30, int r31, com.google.crypto.tink.shaded.protobuf.C0658e.a r32) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.L.G(java.lang.Object, byte[], int, int, com.google.crypto.tink.shaded.protobuf.e$a):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int H(T t3, byte[] bArr, int i, int i9, int i10, int i11, int i12, int i13, long j10, int i14, long j11, C0658e.a aVar) {
        int I10;
        Unsafe unsafe = f10130s;
        C0673u.c cVar = (C0673u.c) unsafe.getObject(t3, j11);
        if (!cVar.k0()) {
            int size = cVar.size();
            cVar = cVar.p(size == 0 ? 10 : size * 2);
            unsafe.putObject(t3, j11, cVar);
        }
        switch (i14) {
            case 18:
            case 35:
                if (i12 == 2) {
                    return C0658e.r(bArr, i, cVar, aVar);
                }
                if (i12 == 1) {
                    return C0658e.e(i10, bArr, i, i9, cVar, aVar);
                }
                break;
            case 19:
            case 36:
                if (i12 == 2) {
                    return C0658e.u(bArr, i, cVar, aVar);
                }
                if (i12 == 5) {
                    return C0658e.l(i10, bArr, i, i9, cVar, aVar);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i12 == 2) {
                    return C0658e.y(bArr, i, cVar, aVar);
                }
                if (i12 == 0) {
                    return C0658e.K(i10, bArr, i, i9, cVar, aVar);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i12 == 2) {
                    return C0658e.x(bArr, i, cVar, aVar);
                }
                if (i12 == 0) {
                    return C0658e.I(i10, bArr, i, i9, cVar, aVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i12 == 2) {
                    return C0658e.t(bArr, i, cVar, aVar);
                }
                if (i12 == 1) {
                    return C0658e.j(i10, bArr, i, i9, cVar, aVar);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i12 == 2) {
                    return C0658e.s(bArr, i, cVar, aVar);
                }
                if (i12 == 5) {
                    return C0658e.h(i10, bArr, i, i9, cVar, aVar);
                }
                break;
            case 25:
            case 42:
                if (i12 == 2) {
                    return C0658e.q(bArr, i, cVar, aVar);
                }
                if (i12 == 0) {
                    return C0658e.a(i10, bArr, i, i9, cVar, aVar);
                }
                break;
            case 26:
                if (i12 == 2) {
                    return (j10 & 536870912) == 0 ? C0658e.C(i10, bArr, i, i9, cVar, aVar) : C0658e.D(i10, bArr, i, i9, cVar, aVar);
                }
                break;
            case 27:
                if (i12 == 2) {
                    return C0658e.p(n(i13), i10, bArr, i, i9, cVar, aVar);
                }
                break;
            case 28:
                if (i12 == 2) {
                    return C0658e.c(i10, bArr, i, i9, cVar, aVar);
                }
                break;
            case 30:
            case 44:
                if (i12 == 2) {
                    I10 = C0658e.x(bArr, i, cVar, aVar);
                } else if (i12 == 0) {
                    I10 = C0658e.I(i10, bArr, i, i9, cVar, aVar);
                }
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t3;
                e0 e0Var = generatedMessageLite.unknownFields;
                if (e0Var == e0.f10210f) {
                    e0Var = null;
                }
                e0 e0Var2 = (e0) Y.z(i11, cVar, l(i13), e0Var, this.f10144o);
                if (e0Var2 != null) {
                    generatedMessageLite.unknownFields = e0Var2;
                }
                return I10;
            case 33:
            case 47:
                if (i12 == 2) {
                    return C0658e.v(bArr, i, cVar, aVar);
                }
                if (i12 == 0) {
                    return C0658e.z(i10, bArr, i, i9, cVar, aVar);
                }
                break;
            case 34:
            case 48:
                if (i12 == 2) {
                    return C0658e.w(bArr, i, cVar, aVar);
                }
                if (i12 == 0) {
                    return C0658e.A(i10, bArr, i, i9, cVar, aVar);
                }
                break;
            case 49:
                if (i12 == 3) {
                    return C0658e.n(n(i13), i10, bArr, i, i9, cVar, aVar);
                }
                break;
        }
        return i;
    }

    public final <E> void I(Object obj, long j10, W w2, X<E> x9, C0666m c0666m) {
        w2.J(this.f10143n.c(j10, obj), x9, c0666m);
    }

    public final <E> void J(Object obj, int i, W w2, X<E> x9, C0666m c0666m) {
        w2.g(this.f10143n.c(i & 1048575, obj), x9, c0666m);
    }

    public final void K(Object obj, int i, W w2) {
        if ((536870912 & i) != 0) {
            h0.u(i & 1048575, obj, w2.L());
        } else if (this.f10137g) {
            h0.u(i & 1048575, obj, w2.y());
        } else {
            h0.u(i & 1048575, obj, w2.C());
        }
    }

    public final void L(Object obj, int i, W w2) {
        boolean z10 = (536870912 & i) != 0;
        AbstractC0678z abstractC0678z = this.f10143n;
        if (z10) {
            w2.B(abstractC0678z.c(i & 1048575, obj));
        } else {
            w2.A(abstractC0678z.c(i & 1048575, obj));
        }
    }

    public final void N(int i, Object obj) {
        if (this.f10138h) {
            return;
        }
        int i9 = this.f10131a[i + 2];
        long j10 = i9 & 1048575;
        h0.s(j10, h0.f10236d.g(j10, obj) | (1 << (i9 >>> 20)), obj);
    }

    public final void O(int i, int i9, Object obj) {
        h0.s(this.f10131a[i9 + 2] & 1048575, i, obj);
    }

    public final int P(int i, int i9) {
        int[] iArr = this.f10131a;
        int length = (iArr.length / 3) - 1;
        while (i9 <= length) {
            int i10 = (length + i9) >>> 1;
            int i11 = i10 * 3;
            int i12 = iArr[i11];
            if (i == i12) {
                return i11;
            }
            if (i < i12) {
                length = i10 - 1;
            } else {
                i9 = i10 + 1;
            }
        }
        return -1;
    }

    public final int R(int i) {
        return this.f10131a[i + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:222:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S(java.lang.Object r20, com.google.crypto.tink.shaded.protobuf.C0663j r21) {
        /*
            Method dump skipped, instructions count: 1280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.L.S(java.lang.Object, com.google.crypto.tink.shaded.protobuf.j):void");
    }

    public final void T(C0663j c0663j, int i, Object obj, int i9) {
        if (obj != null) {
            Object m2 = m(i9);
            D d10 = this.f10146q;
            d10.c(m2);
            MapFieldLite h9 = d10.h(obj);
            CodedOutputStream codedOutputStream = c0663j.f10246a;
            codedOutputStream.getClass();
            Iterator it = h9.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                codedOutputStream.y0(i, 2);
                entry.getKey();
                entry.getValue();
                throw null;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.X
    public final void a(T t3, T t10) {
        t10.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f10131a;
            if (i >= iArr.length) {
                Class<?> cls = Y.f10182a;
                d0<?, ?> d0Var = this.f10144o;
                d0Var.o(t3, d0Var.k(d0Var.g(t3), d0Var.g(t10)));
                if (this.f10136f) {
                    Y.B(this.f10145p, t3, t10);
                    return;
                }
                return;
            }
            int R = R(i);
            long j10 = 1048575 & R;
            int i9 = iArr[i];
            switch (Q(R)) {
                case 0:
                    if (!r(i, t10)) {
                        break;
                    } else {
                        h0.q(t3, j10, h0.f10236d.e(j10, t10));
                        N(i, t3);
                        break;
                    }
                case 1:
                    if (!r(i, t10)) {
                        break;
                    } else {
                        h0.r(t3, j10, h0.f10236d.f(j10, t10));
                        N(i, t3);
                        break;
                    }
                case 2:
                    if (!r(i, t10)) {
                        break;
                    } else {
                        h0.t(t3, j10, h0.f10236d.h(j10, t10));
                        N(i, t3);
                        break;
                    }
                case 3:
                    if (!r(i, t10)) {
                        break;
                    } else {
                        h0.t(t3, j10, h0.f10236d.h(j10, t10));
                        N(i, t3);
                        break;
                    }
                case 4:
                    if (!r(i, t10)) {
                        break;
                    } else {
                        h0.s(j10, h0.f10236d.g(j10, t10), t3);
                        N(i, t3);
                        break;
                    }
                case 5:
                    if (!r(i, t10)) {
                        break;
                    } else {
                        h0.t(t3, j10, h0.f10236d.h(j10, t10));
                        N(i, t3);
                        break;
                    }
                case 6:
                    if (!r(i, t10)) {
                        break;
                    } else {
                        h0.s(j10, h0.f10236d.g(j10, t10), t3);
                        N(i, t3);
                        break;
                    }
                case 7:
                    if (!r(i, t10)) {
                        break;
                    } else {
                        h0.m(t3, j10, h0.f10236d.c(j10, t10));
                        N(i, t3);
                        break;
                    }
                case 8:
                    if (!r(i, t10)) {
                        break;
                    } else {
                        h0.u(j10, t3, h0.f10236d.i(j10, t10));
                        N(i, t3);
                        break;
                    }
                case 9:
                    w(i, t3, t10);
                    break;
                case 10:
                    if (!r(i, t10)) {
                        break;
                    } else {
                        h0.u(j10, t3, h0.f10236d.i(j10, t10));
                        N(i, t3);
                        break;
                    }
                case 11:
                    if (!r(i, t10)) {
                        break;
                    } else {
                        h0.s(j10, h0.f10236d.g(j10, t10), t3);
                        N(i, t3);
                        break;
                    }
                case 12:
                    if (!r(i, t10)) {
                        break;
                    } else {
                        h0.s(j10, h0.f10236d.g(j10, t10), t3);
                        N(i, t3);
                        break;
                    }
                case 13:
                    if (!r(i, t10)) {
                        break;
                    } else {
                        h0.s(j10, h0.f10236d.g(j10, t10), t3);
                        N(i, t3);
                        break;
                    }
                case 14:
                    if (!r(i, t10)) {
                        break;
                    } else {
                        h0.t(t3, j10, h0.f10236d.h(j10, t10));
                        N(i, t3);
                        break;
                    }
                case 15:
                    if (!r(i, t10)) {
                        break;
                    } else {
                        h0.s(j10, h0.f10236d.g(j10, t10), t3);
                        N(i, t3);
                        break;
                    }
                case 16:
                    if (!r(i, t10)) {
                        break;
                    } else {
                        h0.t(t3, j10, h0.f10236d.h(j10, t10));
                        N(i, t3);
                        break;
                    }
                case 17:
                    w(i, t3, t10);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f10143n.b(j10, t3, t10);
                    break;
                case 50:
                    Class<?> cls2 = Y.f10182a;
                    h0.e eVar = h0.f10236d;
                    h0.u(j10, t3, this.f10146q.a(eVar.i(j10, t3), eVar.i(j10, t10)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!s(i9, i, t10)) {
                        break;
                    } else {
                        h0.u(j10, t3, h0.f10236d.i(j10, t10));
                        O(i9, i, t3);
                        break;
                    }
                case 60:
                    x(i, t3, t10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!s(i9, i, t10)) {
                        break;
                    } else {
                        h0.u(j10, t3, h0.f10236d.i(j10, t10));
                        O(i9, i, t3);
                        break;
                    }
                case 68:
                    x(i, t3, t10);
                    break;
            }
            i += 3;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.X
    public final void b(T t3) {
        int[] iArr;
        int i;
        int i9 = this.f10140k;
        while (true) {
            iArr = this.f10139j;
            i = this.f10141l;
            if (i9 >= i) {
                break;
            }
            long R = R(iArr[i9]) & 1048575;
            Object i10 = h0.f10236d.i(R, t3);
            if (i10 != null) {
                h0.u(R, t3, this.f10146q.b(i10));
            }
            i9++;
        }
        int length = iArr.length;
        while (i < length) {
            this.f10143n.a(iArr[i], t3);
            i++;
        }
        this.f10144o.j(t3);
        if (this.f10136f) {
            this.f10145p.f(t3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ec A[SYNTHETIC] */
    @Override // com.google.crypto.tink.shaded.protobuf.X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(T r15) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.L.c(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0545  */
    @Override // com.google.crypto.tink.shaded.protobuf.X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.lang.Object r14, com.google.crypto.tink.shaded.protobuf.C0663j r15) {
        /*
            Method dump skipped, instructions count: 1500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.L.d(java.lang.Object, com.google.crypto.tink.shaded.protobuf.j):void");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.X
    public final void e(T t3, byte[] bArr, int i, int i9, C0658e.a aVar) {
        if (this.f10138h) {
            G(t3, bArr, i, i9, aVar);
        } else {
            F(t3, bArr, i, i9, 0, aVar);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.X
    public final void f(T t3, W w2, C0666m c0666m) {
        c0666m.getClass();
        u(this.f10144o, this.f10145p, t3, w2, c0666m);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.X
    public final boolean g(T t3, T t10) {
        boolean C10;
        int[] iArr = this.f10131a;
        int length = iArr.length;
        for (int i = 0; i < length; i += 3) {
            int R = R(i);
            long j10 = R & 1048575;
            switch (Q(R)) {
                case 0:
                    if (j(i, t3, t10)) {
                        h0.e eVar = h0.f10236d;
                        if (Double.doubleToLongBits(eVar.e(j10, t3)) == Double.doubleToLongBits(eVar.e(j10, t10))) {
                            continue;
                        }
                    }
                    return false;
                case 1:
                    if (j(i, t3, t10)) {
                        h0.e eVar2 = h0.f10236d;
                        if (Float.floatToIntBits(eVar2.f(j10, t3)) == Float.floatToIntBits(eVar2.f(j10, t10))) {
                            continue;
                        }
                    }
                    return false;
                case 2:
                    if (j(i, t3, t10)) {
                        h0.e eVar3 = h0.f10236d;
                        if (eVar3.h(j10, t3) == eVar3.h(j10, t10)) {
                            continue;
                        }
                    }
                    return false;
                case 3:
                    if (j(i, t3, t10)) {
                        h0.e eVar4 = h0.f10236d;
                        if (eVar4.h(j10, t3) == eVar4.h(j10, t10)) {
                            continue;
                        }
                    }
                    return false;
                case 4:
                    if (j(i, t3, t10)) {
                        h0.e eVar5 = h0.f10236d;
                        if (eVar5.g(j10, t3) == eVar5.g(j10, t10)) {
                            continue;
                        }
                    }
                    return false;
                case 5:
                    if (j(i, t3, t10)) {
                        h0.e eVar6 = h0.f10236d;
                        if (eVar6.h(j10, t3) == eVar6.h(j10, t10)) {
                            continue;
                        }
                    }
                    return false;
                case 6:
                    if (j(i, t3, t10)) {
                        h0.e eVar7 = h0.f10236d;
                        if (eVar7.g(j10, t3) == eVar7.g(j10, t10)) {
                            continue;
                        }
                    }
                    return false;
                case 7:
                    if (j(i, t3, t10)) {
                        h0.e eVar8 = h0.f10236d;
                        if (eVar8.c(j10, t3) == eVar8.c(j10, t10)) {
                            continue;
                        }
                    }
                    return false;
                case 8:
                    if (j(i, t3, t10)) {
                        h0.e eVar9 = h0.f10236d;
                        if (Y.C(eVar9.i(j10, t3), eVar9.i(j10, t10))) {
                            continue;
                        }
                    }
                    return false;
                case 9:
                    if (j(i, t3, t10)) {
                        h0.e eVar10 = h0.f10236d;
                        if (Y.C(eVar10.i(j10, t3), eVar10.i(j10, t10))) {
                            continue;
                        }
                    }
                    return false;
                case 10:
                    if (j(i, t3, t10)) {
                        h0.e eVar11 = h0.f10236d;
                        if (Y.C(eVar11.i(j10, t3), eVar11.i(j10, t10))) {
                            continue;
                        }
                    }
                    return false;
                case 11:
                    if (j(i, t3, t10)) {
                        h0.e eVar12 = h0.f10236d;
                        if (eVar12.g(j10, t3) == eVar12.g(j10, t10)) {
                            continue;
                        }
                    }
                    return false;
                case 12:
                    if (j(i, t3, t10)) {
                        h0.e eVar13 = h0.f10236d;
                        if (eVar13.g(j10, t3) == eVar13.g(j10, t10)) {
                            continue;
                        }
                    }
                    return false;
                case 13:
                    if (j(i, t3, t10)) {
                        h0.e eVar14 = h0.f10236d;
                        if (eVar14.g(j10, t3) == eVar14.g(j10, t10)) {
                            continue;
                        }
                    }
                    return false;
                case 14:
                    if (j(i, t3, t10)) {
                        h0.e eVar15 = h0.f10236d;
                        if (eVar15.h(j10, t3) == eVar15.h(j10, t10)) {
                            continue;
                        }
                    }
                    return false;
                case 15:
                    if (j(i, t3, t10)) {
                        h0.e eVar16 = h0.f10236d;
                        if (eVar16.g(j10, t3) == eVar16.g(j10, t10)) {
                            continue;
                        }
                    }
                    return false;
                case 16:
                    if (j(i, t3, t10)) {
                        h0.e eVar17 = h0.f10236d;
                        if (eVar17.h(j10, t3) == eVar17.h(j10, t10)) {
                            continue;
                        }
                    }
                    return false;
                case 17:
                    if (j(i, t3, t10)) {
                        h0.e eVar18 = h0.f10236d;
                        if (Y.C(eVar18.i(j10, t3), eVar18.i(j10, t10))) {
                            continue;
                        }
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    h0.e eVar19 = h0.f10236d;
                    C10 = Y.C(eVar19.i(j10, t3), eVar19.i(j10, t10));
                    break;
                case 50:
                    h0.e eVar20 = h0.f10236d;
                    C10 = Y.C(eVar20.i(j10, t3), eVar20.i(j10, t10));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long j11 = iArr[i + 2] & 1048575;
                    h0.e eVar21 = h0.f10236d;
                    if (eVar21.g(j11, t3) == eVar21.g(j11, t10) && Y.C(eVar21.i(j10, t3), eVar21.i(j10, t10))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!C10) {
                return false;
            }
        }
        d0<?, ?> d0Var = this.f10144o;
        if (!d0Var.g(t3).equals(d0Var.g(t10))) {
            return false;
        }
        if (!this.f10136f) {
            return true;
        }
        AbstractC0667n<?> abstractC0667n = this.f10145p;
        return abstractC0667n.c(t3).equals(abstractC0667n.c(t10));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.X
    public final int h(T t3) {
        return this.f10138h ? q(t3) : p(t3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0216, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e1, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e2, code lost:
    
        r3 = r8 + r3;
     */
    @Override // com.google.crypto.tink.shaded.protobuf.X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i(T r12) {
        /*
            Method dump skipped, instructions count: 812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.L.i(java.lang.Object):int");
    }

    public final boolean j(int i, Object obj, Object obj2) {
        return r(i, obj) == r(i, obj2);
    }

    public final void k(Object obj, int i, Object obj2, d0 d0Var) {
        C0673u.b l10;
        int i9 = this.f10131a[i];
        Object i10 = h0.f10236d.i(R(i) & 1048575, obj);
        if (i10 == null || (l10 = l(i)) == null) {
            return;
        }
        D d10 = this.f10146q;
        MapFieldLite e10 = d10.e(i10);
        d10.c(m(i));
        for (Map.Entry entry : e10.entrySet()) {
            ((Integer) entry.getValue()).getClass();
            if (!l10.a()) {
                if (obj2 == null) {
                    d0Var.m();
                }
                entry.getKey();
                entry.getValue();
                throw null;
            }
        }
    }

    public final C0673u.b l(int i) {
        return (C0673u.b) this.f10132b[((i / 3) * 2) + 1];
    }

    public final Object m(int i) {
        return this.f10132b[(i / 3) * 2];
    }

    public final X n(int i) {
        int i9 = (i / 3) * 2;
        Object[] objArr = this.f10132b;
        X x9 = (X) objArr[i9];
        if (x9 != null) {
            return x9;
        }
        X<T> a10 = T.f10158c.a((Class) objArr[i9 + 1]);
        objArr[i9] = a10;
        return a10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.X
    public final T newInstance() {
        return (T) this.f10142m.a(this.f10135e);
    }

    public final int p(T t3) {
        int i;
        int i9;
        int Q4;
        int O6;
        Unsafe unsafe = f10130s;
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = this.f10131a;
            if (i11 >= iArr.length) {
                d0<?, ?> d0Var = this.f10144o;
                int h9 = d0Var.h(d0Var.g(t3)) + i12;
                return this.f10136f ? h9 + this.f10145p.c(t3).f() : h9;
            }
            int R = R(i11);
            int i14 = iArr[i11];
            int Q10 = Q(R);
            boolean z10 = this.i;
            if (Q10 <= 17) {
                i = iArr[i11 + 2];
                int i15 = i & 1048575;
                i9 = 1 << (i >>> 20);
                if (i15 != i10) {
                    i13 = unsafe.getInt(t3, i15);
                    i10 = i15;
                }
            } else {
                i = (!z10 || Q10 < FieldType.f10098b.a() || Q10 > FieldType.f10099c.a()) ? 0 : iArr[i11 + 2] & 1048575;
                i9 = 0;
            }
            long j10 = R & 1048575;
            switch (Q10) {
                case 0:
                    if ((i13 & i9) == 0) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.Q(i14);
                        i12 += Q4;
                        break;
                    }
                case 1:
                    if ((i13 & i9) == 0) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.U(i14);
                        i12 += Q4;
                        break;
                    }
                case 2:
                    if ((i13 & i9) == 0) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.Y(i14, unsafe.getLong(t3, j10));
                        i12 += Q4;
                        break;
                    }
                case 3:
                    if ((i13 & i9) == 0) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.j0(i14, unsafe.getLong(t3, j10));
                        i12 += Q4;
                        break;
                    }
                case 4:
                    if ((i13 & i9) == 0) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.W(i14, unsafe.getInt(t3, j10));
                        i12 += Q4;
                        break;
                    }
                case 5:
                    if ((i13 & i9) == 0) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.T(i14);
                        i12 += Q4;
                        break;
                    }
                case 6:
                    if ((i13 & i9) == 0) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.S(i14);
                        i12 += Q4;
                        break;
                    }
                case 7:
                    if ((i13 & i9) == 0) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.N(i14);
                        i12 += Q4;
                        break;
                    }
                case 8:
                    if ((i13 & i9) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(t3, j10);
                        O6 = object instanceof ByteString ? CodedOutputStream.O(i14, (ByteString) object) : CodedOutputStream.e0(i14, (String) object);
                        i12 = O6 + i12;
                        break;
                    }
                case 9:
                    if ((i13 & i9) == 0) {
                        break;
                    } else {
                        Q4 = Y.o(i14, unsafe.getObject(t3, j10), n(i11));
                        i12 += Q4;
                        break;
                    }
                case 10:
                    if ((i13 & i9) == 0) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.O(i14, (ByteString) unsafe.getObject(t3, j10));
                        i12 += Q4;
                        break;
                    }
                case 11:
                    if ((i13 & i9) == 0) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.h0(i14, unsafe.getInt(t3, j10));
                        i12 += Q4;
                        break;
                    }
                case 12:
                    if ((i13 & i9) == 0) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.R(i14, unsafe.getInt(t3, j10));
                        i12 += Q4;
                        break;
                    }
                case 13:
                    if ((i13 & i9) == 0) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.a0(i14);
                        i12 += Q4;
                        break;
                    }
                case 14:
                    if ((i13 & i9) == 0) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.b0(i14);
                        i12 += Q4;
                        break;
                    }
                case 15:
                    if ((i13 & i9) == 0) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.c0(i14, unsafe.getInt(t3, j10));
                        i12 += Q4;
                        break;
                    }
                case 16:
                    if ((i13 & i9) == 0) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.d0(i14, unsafe.getLong(t3, j10));
                        i12 += Q4;
                        break;
                    }
                case 17:
                    if ((i13 & i9) == 0) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.V(i14, (I) unsafe.getObject(t3, j10), n(i11));
                        i12 += Q4;
                        break;
                    }
                case 18:
                    Q4 = Y.h(i14, (List) unsafe.getObject(t3, j10));
                    i12 += Q4;
                    break;
                case 19:
                    Q4 = Y.f(i14, (List) unsafe.getObject(t3, j10));
                    i12 += Q4;
                    break;
                case 20:
                    Q4 = Y.m(i14, (List) unsafe.getObject(t3, j10));
                    i12 += Q4;
                    break;
                case 21:
                    Q4 = Y.x(i14, (List) unsafe.getObject(t3, j10));
                    i12 += Q4;
                    break;
                case 22:
                    Q4 = Y.k(i14, (List) unsafe.getObject(t3, j10));
                    i12 += Q4;
                    break;
                case 23:
                    Q4 = Y.h(i14, (List) unsafe.getObject(t3, j10));
                    i12 += Q4;
                    break;
                case 24:
                    Q4 = Y.f(i14, (List) unsafe.getObject(t3, j10));
                    i12 += Q4;
                    break;
                case 25:
                    Q4 = Y.a(i14, (List) unsafe.getObject(t3, j10));
                    i12 += Q4;
                    break;
                case 26:
                    Q4 = Y.u(i14, (List) unsafe.getObject(t3, j10));
                    i12 += Q4;
                    break;
                case 27:
                    Q4 = Y.p(i14, (List) unsafe.getObject(t3, j10), n(i11));
                    i12 += Q4;
                    break;
                case 28:
                    Q4 = Y.c(i14, (List) unsafe.getObject(t3, j10));
                    i12 += Q4;
                    break;
                case 29:
                    Q4 = Y.v(i14, (List) unsafe.getObject(t3, j10));
                    i12 += Q4;
                    break;
                case 30:
                    Q4 = Y.d(i14, (List) unsafe.getObject(t3, j10));
                    i12 += Q4;
                    break;
                case 31:
                    Q4 = Y.f(i14, (List) unsafe.getObject(t3, j10));
                    i12 += Q4;
                    break;
                case 32:
                    Q4 = Y.h(i14, (List) unsafe.getObject(t3, j10));
                    i12 += Q4;
                    break;
                case 33:
                    Q4 = Y.q(i14, (List) unsafe.getObject(t3, j10));
                    i12 += Q4;
                    break;
                case 34:
                    Q4 = Y.s(i14, (List) unsafe.getObject(t3, j10));
                    i12 += Q4;
                    break;
                case 35:
                    int i16 = Y.i((List) unsafe.getObject(t3, j10));
                    if (i16 > 0) {
                        if (z10) {
                            unsafe.putInt(t3, i, i16);
                        }
                        i12 = com.google.android.gms.measurement.internal.a.e(i16, CodedOutputStream.g0(i14), i16, i12);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int g10 = Y.g((List) unsafe.getObject(t3, j10));
                    if (g10 > 0) {
                        if (z10) {
                            unsafe.putInt(t3, i, g10);
                        }
                        i12 = com.google.android.gms.measurement.internal.a.e(g10, CodedOutputStream.g0(i14), g10, i12);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int n10 = Y.n((List) unsafe.getObject(t3, j10));
                    if (n10 > 0) {
                        if (z10) {
                            unsafe.putInt(t3, i, n10);
                        }
                        i12 = com.google.android.gms.measurement.internal.a.e(n10, CodedOutputStream.g0(i14), n10, i12);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int y10 = Y.y((List) unsafe.getObject(t3, j10));
                    if (y10 > 0) {
                        if (z10) {
                            unsafe.putInt(t3, i, y10);
                        }
                        i12 = com.google.android.gms.measurement.internal.a.e(y10, CodedOutputStream.g0(i14), y10, i12);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int l10 = Y.l((List) unsafe.getObject(t3, j10));
                    if (l10 > 0) {
                        if (z10) {
                            unsafe.putInt(t3, i, l10);
                        }
                        i12 = com.google.android.gms.measurement.internal.a.e(l10, CodedOutputStream.g0(i14), l10, i12);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int i17 = Y.i((List) unsafe.getObject(t3, j10));
                    if (i17 > 0) {
                        if (z10) {
                            unsafe.putInt(t3, i, i17);
                        }
                        i12 = com.google.android.gms.measurement.internal.a.e(i17, CodedOutputStream.g0(i14), i17, i12);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int g11 = Y.g((List) unsafe.getObject(t3, j10));
                    if (g11 > 0) {
                        if (z10) {
                            unsafe.putInt(t3, i, g11);
                        }
                        i12 = com.google.android.gms.measurement.internal.a.e(g11, CodedOutputStream.g0(i14), g11, i12);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    int b9 = Y.b((List) unsafe.getObject(t3, j10));
                    if (b9 > 0) {
                        if (z10) {
                            unsafe.putInt(t3, i, b9);
                        }
                        i12 = com.google.android.gms.measurement.internal.a.e(b9, CodedOutputStream.g0(i14), b9, i12);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int w2 = Y.w((List) unsafe.getObject(t3, j10));
                    if (w2 > 0) {
                        if (z10) {
                            unsafe.putInt(t3, i, w2);
                        }
                        i12 = com.google.android.gms.measurement.internal.a.e(w2, CodedOutputStream.g0(i14), w2, i12);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int e10 = Y.e((List) unsafe.getObject(t3, j10));
                    if (e10 > 0) {
                        if (z10) {
                            unsafe.putInt(t3, i, e10);
                        }
                        i12 = com.google.android.gms.measurement.internal.a.e(e10, CodedOutputStream.g0(i14), e10, i12);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    int g12 = Y.g((List) unsafe.getObject(t3, j10));
                    if (g12 > 0) {
                        if (z10) {
                            unsafe.putInt(t3, i, g12);
                        }
                        i12 = com.google.android.gms.measurement.internal.a.e(g12, CodedOutputStream.g0(i14), g12, i12);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int i18 = Y.i((List) unsafe.getObject(t3, j10));
                    if (i18 > 0) {
                        if (z10) {
                            unsafe.putInt(t3, i, i18);
                        }
                        i12 = com.google.android.gms.measurement.internal.a.e(i18, CodedOutputStream.g0(i14), i18, i12);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int r8 = Y.r((List) unsafe.getObject(t3, j10));
                    if (r8 > 0) {
                        if (z10) {
                            unsafe.putInt(t3, i, r8);
                        }
                        i12 = com.google.android.gms.measurement.internal.a.e(r8, CodedOutputStream.g0(i14), r8, i12);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int t10 = Y.t((List) unsafe.getObject(t3, j10));
                    if (t10 > 0) {
                        if (z10) {
                            unsafe.putInt(t3, i, t10);
                        }
                        i12 = com.google.android.gms.measurement.internal.a.e(t10, CodedOutputStream.g0(i14), t10, i12);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    Q4 = Y.j(i14, (List) unsafe.getObject(t3, j10), n(i11));
                    i12 += Q4;
                    break;
                case 50:
                    Q4 = this.f10146q.f(i14, unsafe.getObject(t3, j10), m(i11));
                    i12 += Q4;
                    break;
                case 51:
                    if (!s(i14, i11, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.Q(i14);
                        i12 += Q4;
                        break;
                    }
                case 52:
                    if (!s(i14, i11, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.U(i14);
                        i12 += Q4;
                        break;
                    }
                case 53:
                    if (!s(i14, i11, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.Y(i14, C(j10, t3));
                        i12 += Q4;
                        break;
                    }
                case 54:
                    if (!s(i14, i11, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.j0(i14, C(j10, t3));
                        i12 += Q4;
                        break;
                    }
                case 55:
                    if (!s(i14, i11, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.W(i14, B(j10, t3));
                        i12 += Q4;
                        break;
                    }
                case 56:
                    if (!s(i14, i11, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.T(i14);
                        i12 += Q4;
                        break;
                    }
                case 57:
                    if (!s(i14, i11, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.S(i14);
                        i12 += Q4;
                        break;
                    }
                case 58:
                    if (!s(i14, i11, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.N(i14);
                        i12 += Q4;
                        break;
                    }
                case 59:
                    if (!s(i14, i11, t3)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(t3, j10);
                        O6 = object2 instanceof ByteString ? CodedOutputStream.O(i14, (ByteString) object2) : CodedOutputStream.e0(i14, (String) object2);
                        i12 = O6 + i12;
                        break;
                    }
                case 60:
                    if (!s(i14, i11, t3)) {
                        break;
                    } else {
                        Q4 = Y.o(i14, unsafe.getObject(t3, j10), n(i11));
                        i12 += Q4;
                        break;
                    }
                case 61:
                    if (!s(i14, i11, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.O(i14, (ByteString) unsafe.getObject(t3, j10));
                        i12 += Q4;
                        break;
                    }
                case 62:
                    if (!s(i14, i11, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.h0(i14, B(j10, t3));
                        i12 += Q4;
                        break;
                    }
                case 63:
                    if (!s(i14, i11, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.R(i14, B(j10, t3));
                        i12 += Q4;
                        break;
                    }
                case 64:
                    if (!s(i14, i11, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.a0(i14);
                        i12 += Q4;
                        break;
                    }
                case 65:
                    if (!s(i14, i11, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.b0(i14);
                        i12 += Q4;
                        break;
                    }
                case 66:
                    if (!s(i14, i11, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.c0(i14, B(j10, t3));
                        i12 += Q4;
                        break;
                    }
                case 67:
                    if (!s(i14, i11, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.d0(i14, C(j10, t3));
                        i12 += Q4;
                        break;
                    }
                case 68:
                    if (!s(i14, i11, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.V(i14, (I) unsafe.getObject(t3, j10), n(i11));
                        i12 += Q4;
                        break;
                    }
            }
            i11 += 3;
        }
    }

    public final int q(T t3) {
        int Q4;
        int O6;
        Unsafe unsafe = f10130s;
        int i = 0;
        int i9 = 0;
        while (true) {
            int[] iArr = this.f10131a;
            if (i >= iArr.length) {
                d0<?, ?> d0Var = this.f10144o;
                return d0Var.h(d0Var.g(t3)) + i9;
            }
            int R = R(i);
            int Q10 = Q(R);
            int i10 = iArr[i];
            long j10 = R & 1048575;
            int i11 = (Q10 < FieldType.f10098b.a() || Q10 > FieldType.f10099c.a()) ? 0 : iArr[i + 2] & 1048575;
            boolean z10 = this.i;
            switch (Q10) {
                case 0:
                    if (!r(i, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.Q(i10);
                        i9 += Q4;
                        break;
                    }
                case 1:
                    if (!r(i, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.U(i10);
                        i9 += Q4;
                        break;
                    }
                case 2:
                    if (!r(i, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.Y(i10, h0.j(j10, t3));
                        i9 += Q4;
                        break;
                    }
                case 3:
                    if (!r(i, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.j0(i10, h0.j(j10, t3));
                        i9 += Q4;
                        break;
                    }
                case 4:
                    if (!r(i, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.W(i10, h0.i(j10, t3));
                        i9 += Q4;
                        break;
                    }
                case 5:
                    if (!r(i, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.T(i10);
                        i9 += Q4;
                        break;
                    }
                case 6:
                    if (!r(i, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.S(i10);
                        i9 += Q4;
                        break;
                    }
                case 7:
                    if (!r(i, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.N(i10);
                        i9 += Q4;
                        break;
                    }
                case 8:
                    if (!r(i, t3)) {
                        break;
                    } else {
                        Object k3 = h0.k(j10, t3);
                        O6 = k3 instanceof ByteString ? CodedOutputStream.O(i10, (ByteString) k3) : CodedOutputStream.e0(i10, (String) k3);
                        i9 = O6 + i9;
                        break;
                    }
                case 9:
                    if (!r(i, t3)) {
                        break;
                    } else {
                        Q4 = Y.o(i10, h0.k(j10, t3), n(i));
                        i9 += Q4;
                        break;
                    }
                case 10:
                    if (!r(i, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.O(i10, (ByteString) h0.k(j10, t3));
                        i9 += Q4;
                        break;
                    }
                case 11:
                    if (!r(i, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.h0(i10, h0.i(j10, t3));
                        i9 += Q4;
                        break;
                    }
                case 12:
                    if (!r(i, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.R(i10, h0.i(j10, t3));
                        i9 += Q4;
                        break;
                    }
                case 13:
                    if (!r(i, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.a0(i10);
                        i9 += Q4;
                        break;
                    }
                case 14:
                    if (!r(i, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.b0(i10);
                        i9 += Q4;
                        break;
                    }
                case 15:
                    if (!r(i, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.c0(i10, h0.i(j10, t3));
                        i9 += Q4;
                        break;
                    }
                case 16:
                    if (!r(i, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.d0(i10, h0.j(j10, t3));
                        i9 += Q4;
                        break;
                    }
                case 17:
                    if (!r(i, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.V(i10, (I) h0.k(j10, t3), n(i));
                        i9 += Q4;
                        break;
                    }
                case 18:
                    Q4 = Y.h(i10, t(j10, t3));
                    i9 += Q4;
                    break;
                case 19:
                    Q4 = Y.f(i10, t(j10, t3));
                    i9 += Q4;
                    break;
                case 20:
                    Q4 = Y.m(i10, t(j10, t3));
                    i9 += Q4;
                    break;
                case 21:
                    Q4 = Y.x(i10, t(j10, t3));
                    i9 += Q4;
                    break;
                case 22:
                    Q4 = Y.k(i10, t(j10, t3));
                    i9 += Q4;
                    break;
                case 23:
                    Q4 = Y.h(i10, t(j10, t3));
                    i9 += Q4;
                    break;
                case 24:
                    Q4 = Y.f(i10, t(j10, t3));
                    i9 += Q4;
                    break;
                case 25:
                    Q4 = Y.a(i10, t(j10, t3));
                    i9 += Q4;
                    break;
                case 26:
                    Q4 = Y.u(i10, t(j10, t3));
                    i9 += Q4;
                    break;
                case 27:
                    Q4 = Y.p(i10, t(j10, t3), n(i));
                    i9 += Q4;
                    break;
                case 28:
                    Q4 = Y.c(i10, t(j10, t3));
                    i9 += Q4;
                    break;
                case 29:
                    Q4 = Y.v(i10, t(j10, t3));
                    i9 += Q4;
                    break;
                case 30:
                    Q4 = Y.d(i10, t(j10, t3));
                    i9 += Q4;
                    break;
                case 31:
                    Q4 = Y.f(i10, t(j10, t3));
                    i9 += Q4;
                    break;
                case 32:
                    Q4 = Y.h(i10, t(j10, t3));
                    i9 += Q4;
                    break;
                case 33:
                    Q4 = Y.q(i10, t(j10, t3));
                    i9 += Q4;
                    break;
                case 34:
                    Q4 = Y.s(i10, t(j10, t3));
                    i9 += Q4;
                    break;
                case 35:
                    int i12 = Y.i((List) unsafe.getObject(t3, j10));
                    if (i12 > 0) {
                        if (z10) {
                            unsafe.putInt(t3, i11, i12);
                        }
                        i9 = com.google.android.gms.measurement.internal.a.e(i12, CodedOutputStream.g0(i10), i12, i9);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int g10 = Y.g((List) unsafe.getObject(t3, j10));
                    if (g10 > 0) {
                        if (z10) {
                            unsafe.putInt(t3, i11, g10);
                        }
                        i9 = com.google.android.gms.measurement.internal.a.e(g10, CodedOutputStream.g0(i10), g10, i9);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int n10 = Y.n((List) unsafe.getObject(t3, j10));
                    if (n10 > 0) {
                        if (z10) {
                            unsafe.putInt(t3, i11, n10);
                        }
                        i9 = com.google.android.gms.measurement.internal.a.e(n10, CodedOutputStream.g0(i10), n10, i9);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int y10 = Y.y((List) unsafe.getObject(t3, j10));
                    if (y10 > 0) {
                        if (z10) {
                            unsafe.putInt(t3, i11, y10);
                        }
                        i9 = com.google.android.gms.measurement.internal.a.e(y10, CodedOutputStream.g0(i10), y10, i9);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int l10 = Y.l((List) unsafe.getObject(t3, j10));
                    if (l10 > 0) {
                        if (z10) {
                            unsafe.putInt(t3, i11, l10);
                        }
                        i9 = com.google.android.gms.measurement.internal.a.e(l10, CodedOutputStream.g0(i10), l10, i9);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int i13 = Y.i((List) unsafe.getObject(t3, j10));
                    if (i13 > 0) {
                        if (z10) {
                            unsafe.putInt(t3, i11, i13);
                        }
                        i9 = com.google.android.gms.measurement.internal.a.e(i13, CodedOutputStream.g0(i10), i13, i9);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int g11 = Y.g((List) unsafe.getObject(t3, j10));
                    if (g11 > 0) {
                        if (z10) {
                            unsafe.putInt(t3, i11, g11);
                        }
                        i9 = com.google.android.gms.measurement.internal.a.e(g11, CodedOutputStream.g0(i10), g11, i9);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    int b9 = Y.b((List) unsafe.getObject(t3, j10));
                    if (b9 > 0) {
                        if (z10) {
                            unsafe.putInt(t3, i11, b9);
                        }
                        i9 = com.google.android.gms.measurement.internal.a.e(b9, CodedOutputStream.g0(i10), b9, i9);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int w2 = Y.w((List) unsafe.getObject(t3, j10));
                    if (w2 > 0) {
                        if (z10) {
                            unsafe.putInt(t3, i11, w2);
                        }
                        i9 = com.google.android.gms.measurement.internal.a.e(w2, CodedOutputStream.g0(i10), w2, i9);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int e10 = Y.e((List) unsafe.getObject(t3, j10));
                    if (e10 > 0) {
                        if (z10) {
                            unsafe.putInt(t3, i11, e10);
                        }
                        i9 = com.google.android.gms.measurement.internal.a.e(e10, CodedOutputStream.g0(i10), e10, i9);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    int g12 = Y.g((List) unsafe.getObject(t3, j10));
                    if (g12 > 0) {
                        if (z10) {
                            unsafe.putInt(t3, i11, g12);
                        }
                        i9 = com.google.android.gms.measurement.internal.a.e(g12, CodedOutputStream.g0(i10), g12, i9);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int i14 = Y.i((List) unsafe.getObject(t3, j10));
                    if (i14 > 0) {
                        if (z10) {
                            unsafe.putInt(t3, i11, i14);
                        }
                        i9 = com.google.android.gms.measurement.internal.a.e(i14, CodedOutputStream.g0(i10), i14, i9);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int r8 = Y.r((List) unsafe.getObject(t3, j10));
                    if (r8 > 0) {
                        if (z10) {
                            unsafe.putInt(t3, i11, r8);
                        }
                        i9 = com.google.android.gms.measurement.internal.a.e(r8, CodedOutputStream.g0(i10), r8, i9);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int t10 = Y.t((List) unsafe.getObject(t3, j10));
                    if (t10 > 0) {
                        if (z10) {
                            unsafe.putInt(t3, i11, t10);
                        }
                        i9 = com.google.android.gms.measurement.internal.a.e(t10, CodedOutputStream.g0(i10), t10, i9);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    Q4 = Y.j(i10, t(j10, t3), n(i));
                    i9 += Q4;
                    break;
                case 50:
                    Q4 = this.f10146q.f(i10, h0.k(j10, t3), m(i));
                    i9 += Q4;
                    break;
                case 51:
                    if (!s(i10, i, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.Q(i10);
                        i9 += Q4;
                        break;
                    }
                case 52:
                    if (!s(i10, i, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.U(i10);
                        i9 += Q4;
                        break;
                    }
                case 53:
                    if (!s(i10, i, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.Y(i10, C(j10, t3));
                        i9 += Q4;
                        break;
                    }
                case 54:
                    if (!s(i10, i, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.j0(i10, C(j10, t3));
                        i9 += Q4;
                        break;
                    }
                case 55:
                    if (!s(i10, i, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.W(i10, B(j10, t3));
                        i9 += Q4;
                        break;
                    }
                case 56:
                    if (!s(i10, i, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.T(i10);
                        i9 += Q4;
                        break;
                    }
                case 57:
                    if (!s(i10, i, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.S(i10);
                        i9 += Q4;
                        break;
                    }
                case 58:
                    if (!s(i10, i, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.N(i10);
                        i9 += Q4;
                        break;
                    }
                case 59:
                    if (!s(i10, i, t3)) {
                        break;
                    } else {
                        Object k10 = h0.k(j10, t3);
                        O6 = k10 instanceof ByteString ? CodedOutputStream.O(i10, (ByteString) k10) : CodedOutputStream.e0(i10, (String) k10);
                        i9 = O6 + i9;
                        break;
                    }
                case 60:
                    if (!s(i10, i, t3)) {
                        break;
                    } else {
                        Q4 = Y.o(i10, h0.k(j10, t3), n(i));
                        i9 += Q4;
                        break;
                    }
                case 61:
                    if (!s(i10, i, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.O(i10, (ByteString) h0.k(j10, t3));
                        i9 += Q4;
                        break;
                    }
                case 62:
                    if (!s(i10, i, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.h0(i10, B(j10, t3));
                        i9 += Q4;
                        break;
                    }
                case 63:
                    if (!s(i10, i, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.R(i10, B(j10, t3));
                        i9 += Q4;
                        break;
                    }
                case 64:
                    if (!s(i10, i, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.a0(i10);
                        i9 += Q4;
                        break;
                    }
                case 65:
                    if (!s(i10, i, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.b0(i10);
                        i9 += Q4;
                        break;
                    }
                case 66:
                    if (!s(i10, i, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.c0(i10, B(j10, t3));
                        i9 += Q4;
                        break;
                    }
                case 67:
                    if (!s(i10, i, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.d0(i10, C(j10, t3));
                        i9 += Q4;
                        break;
                    }
                case 68:
                    if (!s(i10, i, t3)) {
                        break;
                    } else {
                        Q4 = CodedOutputStream.V(i10, (I) h0.k(j10, t3), n(i));
                        i9 += Q4;
                        break;
                    }
            }
            i += 3;
        }
    }

    public final boolean r(int i, Object obj) {
        if (!this.f10138h) {
            int i9 = this.f10131a[i + 2];
            return (h0.f10236d.g((long) (i9 & 1048575), obj) & (1 << (i9 >>> 20))) != 0;
        }
        int R = R(i);
        long j10 = R & 1048575;
        switch (Q(R)) {
            case 0:
                return h0.f10236d.e(j10, obj) != 0.0d;
            case 1:
                return h0.f10236d.f(j10, obj) != 0.0f;
            case 2:
                return h0.f10236d.h(j10, obj) != 0;
            case 3:
                return h0.f10236d.h(j10, obj) != 0;
            case 4:
                return h0.f10236d.g(j10, obj) != 0;
            case 5:
                return h0.f10236d.h(j10, obj) != 0;
            case 6:
                return h0.f10236d.g(j10, obj) != 0;
            case 7:
                return h0.f10236d.c(j10, obj);
            case 8:
                Object i10 = h0.f10236d.i(j10, obj);
                if (i10 instanceof String) {
                    return !((String) i10).isEmpty();
                }
                if (i10 instanceof ByteString) {
                    return !ByteString.f10084b.equals(i10);
                }
                throw new IllegalArgumentException();
            case 9:
                return h0.f10236d.i(j10, obj) != null;
            case 10:
                return !ByteString.f10084b.equals(h0.f10236d.i(j10, obj));
            case 11:
                return h0.f10236d.g(j10, obj) != 0;
            case 12:
                return h0.f10236d.g(j10, obj) != 0;
            case 13:
                return h0.f10236d.g(j10, obj) != 0;
            case 14:
                return h0.f10236d.h(j10, obj) != 0;
            case 15:
                return h0.f10236d.g(j10, obj) != 0;
            case 16:
                return h0.f10236d.h(j10, obj) != 0;
            case 17:
                return h0.f10236d.i(j10, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean s(int i, int i9, Object obj) {
        return h0.f10236d.g((long) (this.f10131a[i9 + 2] & 1048575), obj) == i;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final <UT, UB, ET extends com.google.crypto.tink.shaded.protobuf.C0670q.a<ET>> void u(com.google.crypto.tink.shaded.protobuf.d0<UT, UB> r20, com.google.crypto.tink.shaded.protobuf.AbstractC0667n<ET> r21, T r22, com.google.crypto.tink.shaded.protobuf.W r23, com.google.crypto.tink.shaded.protobuf.C0666m r24) {
        /*
            Method dump skipped, instructions count: 1774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.L.u(com.google.crypto.tink.shaded.protobuf.d0, com.google.crypto.tink.shaded.protobuf.n, java.lang.Object, com.google.crypto.tink.shaded.protobuf.W, com.google.crypto.tink.shaded.protobuf.m):void");
    }

    public final <K, V> void v(Object obj, int i, Object obj2, C0666m c0666m, W w2) {
        long R = R(i) & 1048575;
        Object i9 = h0.f10236d.i(R, obj);
        D d10 = this.f10146q;
        if (i9 == null) {
            i9 = d10.d();
            h0.u(R, obj, i9);
        } else if (d10.g(i9)) {
            MapFieldLite d11 = d10.d();
            d10.a(d11, i9);
            h0.u(R, obj, d11);
            i9 = d11;
        }
        d10.e(i9);
        d10.c(obj2);
        w2.m();
        throw null;
    }

    public final void w(int i, Object obj, Object obj2) {
        long R = R(i) & 1048575;
        if (r(i, obj2)) {
            h0.e eVar = h0.f10236d;
            Object i9 = eVar.i(R, obj);
            Object i10 = eVar.i(R, obj2);
            if (i9 != null && i10 != null) {
                h0.u(R, obj, C0673u.c(i9, i10));
                N(i, obj);
            } else if (i10 != null) {
                h0.u(R, obj, i10);
                N(i, obj);
            }
        }
    }

    public final void x(int i, Object obj, Object obj2) {
        int R = R(i);
        int i9 = this.f10131a[i];
        long j10 = R & 1048575;
        if (s(i9, i, obj2)) {
            h0.e eVar = h0.f10236d;
            Object i10 = eVar.i(j10, obj);
            Object i11 = eVar.i(j10, obj2);
            if (i10 != null && i11 != null) {
                h0.u(j10, obj, C0673u.c(i10, i11));
                O(i9, i, obj);
            } else if (i11 != null) {
                h0.u(j10, obj, i11);
                O(i9, i, obj);
            }
        }
    }
}

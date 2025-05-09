package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C0666m;
import com.google.crypto.tink.shaded.protobuf.C0673u;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* compiled from: ArrayDecoders.java */
/* renamed from: com.google.crypto.tink.shaded.protobuf.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0658e {

    /* compiled from: ArrayDecoders.java */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.e$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f10206a;

        /* renamed from: b, reason: collision with root package name */
        public long f10207b;

        /* renamed from: c, reason: collision with root package name */
        public Object f10208c;

        /* renamed from: d, reason: collision with root package name */
        public final C0666m f10209d;

        public a(C0666m c0666m) {
            c0666m.getClass();
            this.f10209d = c0666m;
        }
    }

    public static int A(int i, byte[] bArr, int i9, int i10, C0673u.c<?> cVar, a aVar) {
        A a10 = (A) cVar;
        int J3 = J(bArr, i9, aVar);
        a10.b(AbstractC0661h.c(aVar.f10207b));
        while (J3 < i10) {
            int H10 = H(bArr, J3, aVar);
            if (i != aVar.f10206a) {
                break;
            }
            J3 = J(bArr, H10, aVar);
            a10.b(AbstractC0661h.c(aVar.f10207b));
        }
        return J3;
    }

    public static int B(byte[] bArr, int i, a aVar) {
        int H10 = H(bArr, i, aVar);
        int i9 = aVar.f10206a;
        if (i9 < 0) {
            throw InvalidProtocolBufferException.d();
        }
        if (i9 == 0) {
            aVar.f10208c = "";
            return H10;
        }
        aVar.f10208c = new String(bArr, H10, i9, C0673u.f10266a);
        return H10 + i9;
    }

    public static int C(int i, byte[] bArr, int i9, int i10, C0673u.c<?> cVar, a aVar) {
        int H10 = H(bArr, i9, aVar);
        int i11 = aVar.f10206a;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.d();
        }
        if (i11 == 0) {
            cVar.add("");
        } else {
            cVar.add(new String(bArr, H10, i11, C0673u.f10266a));
            H10 += i11;
        }
        while (H10 < i10) {
            int H11 = H(bArr, H10, aVar);
            if (i != aVar.f10206a) {
                break;
            }
            H10 = H(bArr, H11, aVar);
            int i12 = aVar.f10206a;
            if (i12 < 0) {
                throw InvalidProtocolBufferException.d();
            }
            if (i12 == 0) {
                cVar.add("");
            } else {
                cVar.add(new String(bArr, H10, i12, C0673u.f10266a));
                H10 += i12;
            }
        }
        return H10;
    }

    public static int D(int i, byte[] bArr, int i9, int i10, C0673u.c<?> cVar, a aVar) {
        int H10 = H(bArr, i9, aVar);
        int i11 = aVar.f10206a;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.d();
        }
        if (i11 == 0) {
            cVar.add("");
        } else {
            int i12 = H10 + i11;
            if (!Utf8.f10164a.c(H10, i12, bArr)) {
                throw InvalidProtocolBufferException.a();
            }
            cVar.add(new String(bArr, H10, i11, C0673u.f10266a));
            H10 = i12;
        }
        while (H10 < i10) {
            int H11 = H(bArr, H10, aVar);
            if (i != aVar.f10206a) {
                break;
            }
            H10 = H(bArr, H11, aVar);
            int i13 = aVar.f10206a;
            if (i13 < 0) {
                throw InvalidProtocolBufferException.d();
            }
            if (i13 == 0) {
                cVar.add("");
            } else {
                int i14 = H10 + i13;
                if (!Utf8.f10164a.c(H10, i14, bArr)) {
                    throw InvalidProtocolBufferException.a();
                }
                cVar.add(new String(bArr, H10, i13, C0673u.f10266a));
                H10 = i14;
            }
        }
        return H10;
    }

    public static int E(byte[] bArr, int i, a aVar) {
        int H10 = H(bArr, i, aVar);
        int i9 = aVar.f10206a;
        if (i9 < 0) {
            throw InvalidProtocolBufferException.d();
        }
        if (i9 == 0) {
            aVar.f10208c = "";
            return H10;
        }
        aVar.f10208c = Utf8.f10164a.a(H10, i9, bArr);
        return H10 + i9;
    }

    public static int F(int i, byte[] bArr, int i9, int i10, e0 e0Var, a aVar) {
        if ((i >>> 3) == 0) {
            throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
        }
        int i11 = i & 7;
        if (i11 == 0) {
            int J3 = J(bArr, i9, aVar);
            e0Var.b(i, Long.valueOf(aVar.f10207b));
            return J3;
        }
        if (i11 == 1) {
            e0Var.b(i, Long.valueOf(i(i9, bArr)));
            return i9 + 8;
        }
        if (i11 == 2) {
            int H10 = H(bArr, i9, aVar);
            int i12 = aVar.f10206a;
            if (i12 < 0) {
                throw InvalidProtocolBufferException.d();
            }
            if (i12 > bArr.length - H10) {
                throw InvalidProtocolBufferException.f();
            }
            if (i12 == 0) {
                e0Var.b(i, ByteString.f10084b);
            } else {
                e0Var.b(i, ByteString.c(H10, i12, bArr));
            }
            return H10 + i12;
        }
        if (i11 != 3) {
            if (i11 != 5) {
                throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
            }
            e0Var.b(i, Integer.valueOf(g(i9, bArr)));
            return i9 + 4;
        }
        e0 e0Var2 = new e0();
        int i13 = (i & (-8)) | 4;
        int i14 = 0;
        while (true) {
            if (i9 >= i10) {
                break;
            }
            int H11 = H(bArr, i9, aVar);
            int i15 = aVar.f10206a;
            if (i15 == i13) {
                i14 = i15;
                i9 = H11;
                break;
            }
            i14 = i15;
            i9 = F(i15, bArr, H11, i10, e0Var2, aVar);
        }
        if (i9 > i10 || i14 != i13) {
            throw InvalidProtocolBufferException.e();
        }
        e0Var.b(i, e0Var2);
        return i9;
    }

    public static int G(int i, byte[] bArr, int i9, a aVar) {
        int i10 = i & 127;
        int i11 = i9 + 1;
        byte b9 = bArr[i9];
        if (b9 >= 0) {
            aVar.f10206a = i10 | (b9 << 7);
            return i11;
        }
        int i12 = i10 | ((b9 & Byte.MAX_VALUE) << 7);
        int i13 = i9 + 2;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            aVar.f10206a = i12 | (b10 << 14);
            return i13;
        }
        int i14 = i12 | ((b10 & Byte.MAX_VALUE) << 14);
        int i15 = i9 + 3;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            aVar.f10206a = i14 | (b11 << 21);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 21);
        int i17 = i9 + 4;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            aVar.f10206a = i16 | (b12 << 28);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i19 = i17 + 1;
            if (bArr[i17] >= 0) {
                aVar.f10206a = i18;
                return i19;
            }
            i17 = i19;
        }
    }

    public static int H(byte[] bArr, int i, a aVar) {
        int i9 = i + 1;
        byte b9 = bArr[i];
        if (b9 < 0) {
            return G(b9, bArr, i9, aVar);
        }
        aVar.f10206a = b9;
        return i9;
    }

    public static int I(int i, byte[] bArr, int i9, int i10, C0673u.c<?> cVar, a aVar) {
        C0672t c0672t = (C0672t) cVar;
        int H10 = H(bArr, i9, aVar);
        c0672t.b(aVar.f10206a);
        while (H10 < i10) {
            int H11 = H(bArr, H10, aVar);
            if (i != aVar.f10206a) {
                break;
            }
            H10 = H(bArr, H11, aVar);
            c0672t.b(aVar.f10206a);
        }
        return H10;
    }

    public static int J(byte[] bArr, int i, a aVar) {
        int i9 = i + 1;
        long j10 = bArr[i];
        if (j10 >= 0) {
            aVar.f10207b = j10;
            return i9;
        }
        int i10 = i + 2;
        byte b9 = bArr[i9];
        long j11 = (j10 & 127) | ((b9 & Byte.MAX_VALUE) << 7);
        int i11 = 7;
        while (b9 < 0) {
            int i12 = i10 + 1;
            i11 += 7;
            j11 |= (r10 & Byte.MAX_VALUE) << i11;
            b9 = bArr[i10];
            i10 = i12;
        }
        aVar.f10207b = j11;
        return i10;
    }

    public static int K(int i, byte[] bArr, int i9, int i10, C0673u.c<?> cVar, a aVar) {
        A a10 = (A) cVar;
        int J3 = J(bArr, i9, aVar);
        a10.b(aVar.f10207b);
        while (J3 < i10) {
            int H10 = H(bArr, J3, aVar);
            if (i != aVar.f10206a) {
                break;
            }
            J3 = J(bArr, H10, aVar);
            a10.b(aVar.f10207b);
        }
        return J3;
    }

    public static int L(int i, byte[] bArr, int i9, int i10, a aVar) {
        if ((i >>> 3) == 0) {
            throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
        }
        int i11 = i & 7;
        if (i11 == 0) {
            return J(bArr, i9, aVar);
        }
        if (i11 == 1) {
            return i9 + 8;
        }
        if (i11 == 2) {
            return H(bArr, i9, aVar) + aVar.f10206a;
        }
        if (i11 != 3) {
            if (i11 == 5) {
                return i9 + 4;
            }
            throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
        }
        int i12 = (i & (-8)) | 4;
        int i13 = 0;
        while (i9 < i10) {
            i9 = H(bArr, i9, aVar);
            i13 = aVar.f10206a;
            if (i13 == i12) {
                break;
            }
            i9 = L(i13, bArr, i9, i10, aVar);
        }
        if (i9 > i10 || i13 != i12) {
            throw InvalidProtocolBufferException.e();
        }
        return i9;
    }

    public static int a(int i, byte[] bArr, int i9, int i10, C0673u.c<?> cVar, a aVar) {
        C0659f c0659f = (C0659f) cVar;
        int J3 = J(bArr, i9, aVar);
        c0659f.b(aVar.f10207b != 0);
        while (J3 < i10) {
            int H10 = H(bArr, J3, aVar);
            if (i != aVar.f10206a) {
                break;
            }
            J3 = J(bArr, H10, aVar);
            c0659f.b(aVar.f10207b != 0);
        }
        return J3;
    }

    public static int b(byte[] bArr, int i, a aVar) {
        int H10 = H(bArr, i, aVar);
        int i9 = aVar.f10206a;
        if (i9 < 0) {
            throw InvalidProtocolBufferException.d();
        }
        if (i9 > bArr.length - H10) {
            throw InvalidProtocolBufferException.f();
        }
        if (i9 == 0) {
            aVar.f10208c = ByteString.f10084b;
            return H10;
        }
        aVar.f10208c = ByteString.c(H10, i9, bArr);
        return H10 + i9;
    }

    public static int c(int i, byte[] bArr, int i9, int i10, C0673u.c<?> cVar, a aVar) {
        int H10 = H(bArr, i9, aVar);
        int i11 = aVar.f10206a;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.d();
        }
        if (i11 > bArr.length - H10) {
            throw InvalidProtocolBufferException.f();
        }
        if (i11 == 0) {
            cVar.add(ByteString.f10084b);
        } else {
            cVar.add(ByteString.c(H10, i11, bArr));
            H10 += i11;
        }
        while (H10 < i10) {
            int H11 = H(bArr, H10, aVar);
            if (i != aVar.f10206a) {
                break;
            }
            H10 = H(bArr, H11, aVar);
            int i12 = aVar.f10206a;
            if (i12 < 0) {
                throw InvalidProtocolBufferException.d();
            }
            if (i12 > bArr.length - H10) {
                throw InvalidProtocolBufferException.f();
            }
            if (i12 == 0) {
                cVar.add(ByteString.f10084b);
            } else {
                cVar.add(ByteString.c(H10, i12, bArr));
                H10 += i12;
            }
        }
        return H10;
    }

    public static double d(int i, byte[] bArr) {
        return Double.longBitsToDouble(i(i, bArr));
    }

    public static int e(int i, byte[] bArr, int i9, int i10, C0673u.c<?> cVar, a aVar) {
        C0664k c0664k = (C0664k) cVar;
        c0664k.b(d(i9, bArr));
        int i11 = i9 + 8;
        while (i11 < i10) {
            int H10 = H(bArr, i11, aVar);
            if (i != aVar.f10206a) {
                break;
            }
            c0664k.b(Double.longBitsToDouble(i(H10, bArr)));
            i11 = H10 + 8;
        }
        return i11;
    }

    public static int f(int i, byte[] bArr, int i9, int i10, Object obj, I i11, a aVar) {
        C0666m c0666m = aVar.f10209d;
        c0666m.getClass();
        if (c0666m.f10252a.get(new C0666m.a(i11, i >>> 3)) == null) {
            return F(i, bArr, i9, i10, L.o(obj), aVar);
        }
        GeneratedMessageLite.c cVar = (GeneratedMessageLite.c) obj;
        C0670q<GeneratedMessageLite.d> c0670q = cVar.extensions;
        if (c0670q.f10259b) {
            cVar.extensions = c0670q.clone();
        }
        throw null;
    }

    public static int g(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int h(int i, byte[] bArr, int i9, int i10, C0673u.c<?> cVar, a aVar) {
        C0672t c0672t = (C0672t) cVar;
        c0672t.b(g(i9, bArr));
        int i11 = i9 + 4;
        while (i11 < i10) {
            int H10 = H(bArr, i11, aVar);
            if (i != aVar.f10206a) {
                break;
            }
            c0672t.b(g(H10, bArr));
            i11 = H10 + 4;
        }
        return i11;
    }

    public static long i(int i, byte[] bArr) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public static int j(int i, byte[] bArr, int i9, int i10, C0673u.c<?> cVar, a aVar) {
        A a10 = (A) cVar;
        a10.b(i(i9, bArr));
        int i11 = i9 + 8;
        while (i11 < i10) {
            int H10 = H(bArr, i11, aVar);
            if (i != aVar.f10206a) {
                break;
            }
            a10.b(i(H10, bArr));
            i11 = H10 + 8;
        }
        return i11;
    }

    public static float k(int i, byte[] bArr) {
        return Float.intBitsToFloat(g(i, bArr));
    }

    public static int l(int i, byte[] bArr, int i9, int i10, C0673u.c<?> cVar, a aVar) {
        r rVar = (r) cVar;
        rVar.b(k(i9, bArr));
        int i11 = i9 + 4;
        while (i11 < i10) {
            int H10 = H(bArr, i11, aVar);
            if (i != aVar.f10206a) {
                break;
            }
            rVar.b(Float.intBitsToFloat(g(H10, bArr)));
            i11 = H10 + 4;
        }
        return i11;
    }

    public static int m(X x9, byte[] bArr, int i, int i9, int i10, a aVar) {
        L l10 = (L) x9;
        Object newInstance = l10.newInstance();
        int F10 = l10.F(newInstance, bArr, i, i9, i10, aVar);
        l10.b(newInstance);
        aVar.f10208c = newInstance;
        return F10;
    }

    public static int n(X x9, int i, byte[] bArr, int i9, int i10, C0673u.c<?> cVar, a aVar) {
        int i11 = (i & (-8)) | 4;
        int m2 = m(x9, bArr, i9, i10, i11, aVar);
        cVar.add(aVar.f10208c);
        while (m2 < i10) {
            int H10 = H(bArr, m2, aVar);
            if (i != aVar.f10206a) {
                break;
            }
            m2 = m(x9, bArr, H10, i10, i11, aVar);
            cVar.add(aVar.f10208c);
        }
        return m2;
    }

    public static int o(X x9, byte[] bArr, int i, int i9, a aVar) {
        int i10 = i + 1;
        int i11 = bArr[i];
        if (i11 < 0) {
            i10 = G(i11, bArr, i10, aVar);
            i11 = aVar.f10206a;
        }
        int i12 = i10;
        if (i11 < 0 || i11 > i9 - i12) {
            throw InvalidProtocolBufferException.f();
        }
        Object newInstance = x9.newInstance();
        int i13 = i11 + i12;
        x9.e(newInstance, bArr, i12, i13, aVar);
        x9.b(newInstance);
        aVar.f10208c = newInstance;
        return i13;
    }

    public static int p(X<?> x9, int i, byte[] bArr, int i9, int i10, C0673u.c<?> cVar, a aVar) {
        int o10 = o(x9, bArr, i9, i10, aVar);
        cVar.add(aVar.f10208c);
        while (o10 < i10) {
            int H10 = H(bArr, o10, aVar);
            if (i != aVar.f10206a) {
                break;
            }
            o10 = o(x9, bArr, H10, i10, aVar);
            cVar.add(aVar.f10208c);
        }
        return o10;
    }

    public static int q(byte[] bArr, int i, C0673u.c<?> cVar, a aVar) {
        C0659f c0659f = (C0659f) cVar;
        int H10 = H(bArr, i, aVar);
        int i9 = aVar.f10206a + H10;
        while (H10 < i9) {
            H10 = J(bArr, H10, aVar);
            c0659f.b(aVar.f10207b != 0);
        }
        if (H10 == i9) {
            return H10;
        }
        throw InvalidProtocolBufferException.f();
    }

    public static int r(byte[] bArr, int i, C0673u.c<?> cVar, a aVar) {
        C0664k c0664k = (C0664k) cVar;
        int H10 = H(bArr, i, aVar);
        int i9 = aVar.f10206a + H10;
        while (H10 < i9) {
            c0664k.b(Double.longBitsToDouble(i(H10, bArr)));
            H10 += 8;
        }
        if (H10 == i9) {
            return H10;
        }
        throw InvalidProtocolBufferException.f();
    }

    public static int s(byte[] bArr, int i, C0673u.c<?> cVar, a aVar) {
        C0672t c0672t = (C0672t) cVar;
        int H10 = H(bArr, i, aVar);
        int i9 = aVar.f10206a + H10;
        while (H10 < i9) {
            c0672t.b(g(H10, bArr));
            H10 += 4;
        }
        if (H10 == i9) {
            return H10;
        }
        throw InvalidProtocolBufferException.f();
    }

    public static int t(byte[] bArr, int i, C0673u.c<?> cVar, a aVar) {
        A a10 = (A) cVar;
        int H10 = H(bArr, i, aVar);
        int i9 = aVar.f10206a + H10;
        while (H10 < i9) {
            a10.b(i(H10, bArr));
            H10 += 8;
        }
        if (H10 == i9) {
            return H10;
        }
        throw InvalidProtocolBufferException.f();
    }

    public static int u(byte[] bArr, int i, C0673u.c<?> cVar, a aVar) {
        r rVar = (r) cVar;
        int H10 = H(bArr, i, aVar);
        int i9 = aVar.f10206a + H10;
        while (H10 < i9) {
            rVar.b(Float.intBitsToFloat(g(H10, bArr)));
            H10 += 4;
        }
        if (H10 == i9) {
            return H10;
        }
        throw InvalidProtocolBufferException.f();
    }

    public static int v(byte[] bArr, int i, C0673u.c<?> cVar, a aVar) {
        C0672t c0672t = (C0672t) cVar;
        int H10 = H(bArr, i, aVar);
        int i9 = aVar.f10206a + H10;
        while (H10 < i9) {
            H10 = H(bArr, H10, aVar);
            c0672t.b(AbstractC0661h.b(aVar.f10206a));
        }
        if (H10 == i9) {
            return H10;
        }
        throw InvalidProtocolBufferException.f();
    }

    public static int w(byte[] bArr, int i, C0673u.c<?> cVar, a aVar) {
        A a10 = (A) cVar;
        int H10 = H(bArr, i, aVar);
        int i9 = aVar.f10206a + H10;
        while (H10 < i9) {
            H10 = J(bArr, H10, aVar);
            a10.b(AbstractC0661h.c(aVar.f10207b));
        }
        if (H10 == i9) {
            return H10;
        }
        throw InvalidProtocolBufferException.f();
    }

    public static int x(byte[] bArr, int i, C0673u.c<?> cVar, a aVar) {
        C0672t c0672t = (C0672t) cVar;
        int H10 = H(bArr, i, aVar);
        int i9 = aVar.f10206a + H10;
        while (H10 < i9) {
            H10 = H(bArr, H10, aVar);
            c0672t.b(aVar.f10206a);
        }
        if (H10 == i9) {
            return H10;
        }
        throw InvalidProtocolBufferException.f();
    }

    public static int y(byte[] bArr, int i, C0673u.c<?> cVar, a aVar) {
        A a10 = (A) cVar;
        int H10 = H(bArr, i, aVar);
        int i9 = aVar.f10206a + H10;
        while (H10 < i9) {
            H10 = J(bArr, H10, aVar);
            a10.b(aVar.f10207b);
        }
        if (H10 == i9) {
            return H10;
        }
        throw InvalidProtocolBufferException.f();
    }

    public static int z(int i, byte[] bArr, int i9, int i10, C0673u.c<?> cVar, a aVar) {
        C0672t c0672t = (C0672t) cVar;
        int H10 = H(bArr, i9, aVar);
        c0672t.b(AbstractC0661h.b(aVar.f10206a));
        while (H10 < i10) {
            int H11 = H(bArr, H10, aVar);
            if (i != aVar.f10206a) {
                break;
            }
            H10 = H(bArr, H11, aVar);
            c0672t.b(AbstractC0661h.b(aVar.f10206a));
        }
        return H10;
    }
}

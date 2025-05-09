package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.Utf8;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class CodedOutputStream extends Ha.c {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f10090b = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f10091c = h0.f10238f;

    /* renamed from: a, reason: collision with root package name */
    public C0663j f10092a;

    public static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        public OutOfSpaceException(IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
        }

        public OutOfSpaceException(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
        }
    }

    public static class a extends CodedOutputStream {

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f10093d;

        /* renamed from: e, reason: collision with root package name */
        public final int f10094e;

        /* renamed from: f, reason: collision with root package name */
        public int f10095f;

        public a(byte[] bArr, int i) {
            if (((bArr.length - i) | i) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
            }
            this.f10093d = bArr;
            this.f10095f = 0;
            this.f10094e = i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void A0(int i) {
            boolean z10 = CodedOutputStream.f10091c;
            byte[] bArr = this.f10093d;
            if (!z10 || C0657d.a() || D0() < 5) {
                while ((i & (-128)) != 0) {
                    try {
                        int i9 = this.f10095f;
                        this.f10095f = i9 + 1;
                        bArr[i9] = (byte) ((i & 127) | 128);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e10) {
                        throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10095f), Integer.valueOf(this.f10094e), 1), e10);
                    }
                }
                int i10 = this.f10095f;
                this.f10095f = i10 + 1;
                bArr[i10] = (byte) i;
                return;
            }
            if ((i & (-128)) == 0) {
                int i11 = this.f10095f;
                this.f10095f = i11 + 1;
                h0.n(bArr, i11, (byte) i);
                return;
            }
            int i12 = this.f10095f;
            this.f10095f = i12 + 1;
            h0.n(bArr, i12, (byte) (i | 128));
            int i13 = i >>> 7;
            if ((i13 & (-128)) == 0) {
                int i14 = this.f10095f;
                this.f10095f = i14 + 1;
                h0.n(bArr, i14, (byte) i13);
                return;
            }
            int i15 = this.f10095f;
            this.f10095f = i15 + 1;
            h0.n(bArr, i15, (byte) (i13 | 128));
            int i16 = i >>> 14;
            if ((i16 & (-128)) == 0) {
                int i17 = this.f10095f;
                this.f10095f = i17 + 1;
                h0.n(bArr, i17, (byte) i16);
                return;
            }
            int i18 = this.f10095f;
            this.f10095f = i18 + 1;
            h0.n(bArr, i18, (byte) (i16 | 128));
            int i19 = i >>> 21;
            if ((i19 & (-128)) == 0) {
                int i20 = this.f10095f;
                this.f10095f = i20 + 1;
                h0.n(bArr, i20, (byte) i19);
            } else {
                int i21 = this.f10095f;
                this.f10095f = i21 + 1;
                h0.n(bArr, i21, (byte) (i19 | 128));
                int i22 = this.f10095f;
                this.f10095f = i22 + 1;
                h0.n(bArr, i22, (byte) (i >>> 28));
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void B0(int i, long j10) {
            y0(i, 0);
            C0(j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void C0(long j10) {
            boolean z10 = CodedOutputStream.f10091c;
            byte[] bArr = this.f10093d;
            if (z10 && D0() >= 10) {
                while ((j10 & (-128)) != 0) {
                    int i = this.f10095f;
                    this.f10095f = i + 1;
                    h0.n(bArr, i, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                int i9 = this.f10095f;
                this.f10095f = i9 + 1;
                h0.n(bArr, i9, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    int i10 = this.f10095f;
                    this.f10095f = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10095f), Integer.valueOf(this.f10094e), 1), e10);
                }
            }
            int i11 = this.f10095f;
            this.f10095f = i11 + 1;
            bArr[i11] = (byte) j10;
        }

        public final int D0() {
            return this.f10094e - this.f10095f;
        }

        public final void E0(byte[] bArr, int i, int i9) {
            try {
                System.arraycopy(bArr, i, this.f10093d, this.f10095f, i9);
                this.f10095f += i9;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10095f), Integer.valueOf(this.f10094e), Integer.valueOf(i9)), e10);
            }
        }

        public final void F0(ByteString byteString) {
            A0(byteString.size());
            byteString.n(this);
        }

        public final void G0(I i) {
            A0(i.d());
            i.a(this);
        }

        public final void H0(String str) {
            int i = this.f10095f;
            try {
                int i02 = CodedOutputStream.i0(str.length() * 3);
                int i03 = CodedOutputStream.i0(str.length());
                byte[] bArr = this.f10093d;
                if (i03 == i02) {
                    int i9 = i + i03;
                    this.f10095f = i9;
                    int b9 = Utf8.f10164a.b(str, bArr, i9, D0());
                    this.f10095f = i;
                    A0((b9 - i) - i03);
                    this.f10095f = b9;
                } else {
                    A0(Utf8.b(str));
                    this.f10095f = Utf8.f10164a.b(str, bArr, this.f10095f, D0());
                }
            } catch (Utf8.UnpairedSurrogateException e10) {
                this.f10095f = i;
                CodedOutputStream.f10090b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e10);
                byte[] bytes = str.getBytes(C0673u.f10266a);
                try {
                    A0(bytes.length);
                    E0(bytes, 0, bytes.length);
                } catch (OutOfSpaceException e11) {
                    throw e11;
                } catch (IndexOutOfBoundsException e12) {
                    throw new OutOfSpaceException(e12);
                }
            } catch (IndexOutOfBoundsException e13) {
                throw new OutOfSpaceException(e13);
            }
        }

        @Override // Ha.c
        public final void M(int i, int i9, byte[] bArr) {
            E0(bArr, i, i9);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void l0(byte b9) {
            try {
                byte[] bArr = this.f10093d;
                int i = this.f10095f;
                this.f10095f = i + 1;
                bArr[i] = b9;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10095f), Integer.valueOf(this.f10094e), 1), e10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void m0(int i, boolean z10) {
            y0(i, 0);
            l0(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void n0(int i, ByteString byteString) {
            y0(i, 2);
            F0(byteString);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void o0(int i, int i9) {
            y0(i, 5);
            p0(i9);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void p0(int i) {
            try {
                byte[] bArr = this.f10093d;
                int i9 = this.f10095f;
                bArr[i9] = (byte) (i & 255);
                bArr[i9 + 1] = (byte) ((i >> 8) & 255);
                bArr[i9 + 2] = (byte) ((i >> 16) & 255);
                this.f10095f = i9 + 4;
                bArr[i9 + 3] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10095f), Integer.valueOf(this.f10094e), 1), e10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void q0(int i, long j10) {
            y0(i, 1);
            r0(j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void r0(long j10) {
            try {
                byte[] bArr = this.f10093d;
                int i = this.f10095f;
                bArr[i] = (byte) (((int) j10) & 255);
                bArr[i + 1] = (byte) (((int) (j10 >> 8)) & 255);
                bArr[i + 2] = (byte) (((int) (j10 >> 16)) & 255);
                bArr[i + 3] = (byte) (((int) (j10 >> 24)) & 255);
                bArr[i + 4] = (byte) (((int) (j10 >> 32)) & 255);
                bArr[i + 5] = (byte) (((int) (j10 >> 40)) & 255);
                bArr[i + 6] = (byte) (((int) (j10 >> 48)) & 255);
                this.f10095f = i + 8;
                bArr[i + 7] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10095f), Integer.valueOf(this.f10094e), 1), e10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void s0(int i, int i9) {
            y0(i, 0);
            t0(i9);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void t0(int i) {
            if (i >= 0) {
                A0(i);
            } else {
                C0(i);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void u0(int i, I i9, X x9) {
            y0(i, 2);
            AbstractC0654a abstractC0654a = (AbstractC0654a) i9;
            int g10 = abstractC0654a.g();
            if (g10 == -1) {
                g10 = x9.h(abstractC0654a);
                abstractC0654a.i(g10);
            }
            A0(g10);
            x9.d(i9, this.f10092a);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void v0(int i, I i9) {
            y0(1, 3);
            z0(2, i);
            y0(3, 2);
            G0(i9);
            y0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void w0(int i, ByteString byteString) {
            y0(1, 3);
            z0(2, i);
            n0(3, byteString);
            y0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void x0(int i, String str) {
            y0(i, 2);
            H0(str);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void y0(int i, int i9) {
            A0((i << 3) | i9);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void z0(int i, int i9) {
            y0(i, 0);
            A0(i9);
        }
    }

    public static int N(int i) {
        return g0(i) + 1;
    }

    public static int O(int i, ByteString byteString) {
        return P(byteString) + g0(i);
    }

    public static int P(ByteString byteString) {
        int size = byteString.size();
        return i0(size) + size;
    }

    public static int Q(int i) {
        return g0(i) + 8;
    }

    public static int R(int i, int i9) {
        return X(i9) + g0(i);
    }

    public static int S(int i) {
        return g0(i) + 4;
    }

    public static int T(int i) {
        return g0(i) + 8;
    }

    public static int U(int i) {
        return g0(i) + 4;
    }

    @Deprecated
    public static int V(int i, I i9, X x9) {
        int g02 = g0(i) * 2;
        AbstractC0654a abstractC0654a = (AbstractC0654a) i9;
        int g10 = abstractC0654a.g();
        if (g10 == -1) {
            g10 = x9.h(abstractC0654a);
            abstractC0654a.i(g10);
        }
        return g10 + g02;
    }

    public static int W(int i, int i9) {
        return X(i9) + g0(i);
    }

    public static int X(int i) {
        if (i >= 0) {
            return i0(i);
        }
        return 10;
    }

    public static int Y(int i, long j10) {
        return k0(j10) + g0(i);
    }

    public static int Z(C0675w c0675w) {
        int size = c0675w.f10271b != null ? c0675w.f10271b.size() : c0675w.f10270a != null ? c0675w.f10270a.d() : 0;
        return i0(size) + size;
    }

    public static int a0(int i) {
        return g0(i) + 4;
    }

    public static int b0(int i) {
        return g0(i) + 8;
    }

    public static int c0(int i, int i9) {
        return i0((i9 >> 31) ^ (i9 << 1)) + g0(i);
    }

    public static int d0(int i, long j10) {
        return k0((j10 >> 63) ^ (j10 << 1)) + g0(i);
    }

    public static int e0(int i, String str) {
        return f0(str) + g0(i);
    }

    public static int f0(String str) {
        int length;
        try {
            length = Utf8.b(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            length = str.getBytes(C0673u.f10266a).length;
        }
        return i0(length) + length;
    }

    public static int g0(int i) {
        return i0(i << 3);
    }

    public static int h0(int i, int i9) {
        return i0(i9) + g0(i);
    }

    public static int i0(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int j0(int i, long j10) {
        return k0(j10) + g0(i);
    }

    public static int k0(long j10) {
        int i;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j10) != 0) {
            i += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i + 1 : i;
    }

    public abstract void A0(int i);

    public abstract void B0(int i, long j10);

    public abstract void C0(long j10);

    public abstract void l0(byte b9);

    public abstract void m0(int i, boolean z10);

    public abstract void n0(int i, ByteString byteString);

    public abstract void o0(int i, int i9);

    public abstract void p0(int i);

    public abstract void q0(int i, long j10);

    public abstract void r0(long j10);

    public abstract void s0(int i, int i9);

    public abstract void t0(int i);

    public abstract void u0(int i, I i9, X x9);

    public abstract void v0(int i, I i9);

    public abstract void w0(int i, ByteString byteString);

    public abstract void x0(int i, String str);

    public abstract void y0(int i, int i9);

    public abstract void z0(int i, int i9);
}

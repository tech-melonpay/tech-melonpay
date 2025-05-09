package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import java.util.Arrays;
import net.sf.scuba.smartcards.ISOFileInfo;

/* compiled from: CodedInputStream.java */
/* renamed from: com.google.crypto.tink.shaded.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0661h {

    /* renamed from: a, reason: collision with root package name */
    public int f10224a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10225b = 100;

    /* renamed from: c, reason: collision with root package name */
    public C0662i f10226c;

    /* compiled from: CodedInputStream.java */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$a */
    public static final class a extends AbstractC0661h {

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f10227d;

        /* renamed from: e, reason: collision with root package name */
        public int f10228e;

        /* renamed from: f, reason: collision with root package name */
        public int f10229f;

        /* renamed from: g, reason: collision with root package name */
        public int f10230g;

        /* renamed from: h, reason: collision with root package name */
        public final int f10231h;
        public int i;

        /* renamed from: j, reason: collision with root package name */
        public int f10232j = Integer.MAX_VALUE;

        public a(byte[] bArr, int i, int i9, boolean z10) {
            this.f10227d = bArr;
            this.f10228e = i9 + i;
            this.f10230g = i;
            this.f10231h = i;
        }

        public final int A() {
            int i = this.f10230g;
            if (this.f10228e - i < 4) {
                throw InvalidProtocolBufferException.f();
            }
            this.f10230g = i + 4;
            byte[] bArr = this.f10227d;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public final long B() {
            int i = this.f10230g;
            if (this.f10228e - i < 8) {
                throw InvalidProtocolBufferException.f();
            }
            this.f10230g = i + 8;
            byte[] bArr = this.f10227d;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        public final int C() {
            int i;
            int i9 = this.f10230g;
            int i10 = this.f10228e;
            if (i10 != i9) {
                int i11 = i9 + 1;
                byte[] bArr = this.f10227d;
                byte b9 = bArr[i9];
                if (b9 >= 0) {
                    this.f10230g = i11;
                    return b9;
                }
                if (i10 - i11 >= 9) {
                    int i12 = i9 + 2;
                    int i13 = (bArr[i11] << 7) ^ b9;
                    if (i13 < 0) {
                        i = i13 ^ (-128);
                    } else {
                        int i14 = i9 + 3;
                        int i15 = (bArr[i12] << 14) ^ i13;
                        if (i15 >= 0) {
                            i = i15 ^ 16256;
                        } else {
                            int i16 = i9 + 4;
                            int i17 = i15 ^ (bArr[i14] << 21);
                            if (i17 < 0) {
                                i = (-2080896) ^ i17;
                            } else {
                                i14 = i9 + 5;
                                byte b10 = bArr[i16];
                                int i18 = (i17 ^ (b10 << 28)) ^ 266354560;
                                if (b10 < 0) {
                                    i16 = i9 + 6;
                                    if (bArr[i14] < 0) {
                                        i14 = i9 + 7;
                                        if (bArr[i16] < 0) {
                                            i16 = i9 + 8;
                                            if (bArr[i14] < 0) {
                                                i14 = i9 + 9;
                                                if (bArr[i16] < 0) {
                                                    int i19 = i9 + 10;
                                                    if (bArr[i14] >= 0) {
                                                        i12 = i19;
                                                        i = i18;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i18;
                                }
                                i = i18;
                            }
                            i12 = i16;
                        }
                        i12 = i14;
                    }
                    this.f10230g = i12;
                    return i;
                }
            }
            return (int) E();
        }

        public final long D() {
            long j10;
            long j11;
            long j12;
            long j13;
            int i = this.f10230g;
            int i9 = this.f10228e;
            if (i9 != i) {
                int i10 = i + 1;
                byte[] bArr = this.f10227d;
                byte b9 = bArr[i];
                if (b9 >= 0) {
                    this.f10230g = i10;
                    return b9;
                }
                if (i9 - i10 >= 9) {
                    int i11 = i + 2;
                    int i12 = (bArr[i10] << 7) ^ b9;
                    if (i12 < 0) {
                        j10 = i12 ^ (-128);
                    } else {
                        int i13 = i + 3;
                        int i14 = (bArr[i11] << 14) ^ i12;
                        if (i14 >= 0) {
                            j10 = i14 ^ 16256;
                            i11 = i13;
                        } else {
                            int i15 = i + 4;
                            int i16 = i14 ^ (bArr[i13] << 21);
                            if (i16 < 0) {
                                j13 = (-2080896) ^ i16;
                            } else {
                                long j14 = i16;
                                i11 = i + 5;
                                long j15 = j14 ^ (bArr[i15] << 28);
                                if (j15 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    i15 = i + 6;
                                    long j16 = j15 ^ (bArr[i11] << 35);
                                    if (j16 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i11 = i + 7;
                                        j15 = j16 ^ (bArr[i15] << 42);
                                        if (j15 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i15 = i + 8;
                                            j16 = j15 ^ (bArr[i11] << 49);
                                            if (j16 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                i11 = i + 9;
                                                long j17 = (j16 ^ (bArr[i15] << 56)) ^ 71499008037633920L;
                                                if (j17 < 0) {
                                                    int i17 = i + 10;
                                                    if (bArr[i11] >= 0) {
                                                        i11 = i17;
                                                    }
                                                }
                                                j10 = j17;
                                            }
                                        }
                                    }
                                    j13 = j11 ^ j16;
                                }
                                j10 = j12 ^ j15;
                            }
                            i11 = i15;
                            j10 = j13;
                        }
                    }
                    this.f10230g = i11;
                    return j10;
                }
            }
            return E();
        }

        public final long E() {
            long j10 = 0;
            for (int i = 0; i < 64; i += 7) {
                int i9 = this.f10230g;
                if (i9 == this.f10228e) {
                    throw InvalidProtocolBufferException.f();
                }
                this.f10230g = i9 + 1;
                j10 |= (r3 & Byte.MAX_VALUE) << i;
                if ((this.f10227d[i9] & ISOFileInfo.DATA_BYTES1) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.c();
        }

        public final void F() {
            int i = this.f10228e + this.f10229f;
            this.f10228e = i;
            int i9 = i - this.f10231h;
            int i10 = this.f10232j;
            if (i9 <= i10) {
                this.f10229f = 0;
                return;
            }
            int i11 = i9 - i10;
            this.f10229f = i11;
            this.f10228e = i - i11;
        }

        public final void G(int i) {
            if (i >= 0) {
                int i9 = this.f10228e;
                int i10 = this.f10230g;
                if (i <= i9 - i10) {
                    this.f10230g = i10 + i;
                    return;
                }
            }
            if (i >= 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.d();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0661h
        public final void a(int i) {
            if (this.i != i) {
                throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0661h
        public final int d() {
            return this.f10230g - this.f10231h;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0661h
        public final boolean e() {
            return this.f10230g == this.f10228e;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0661h
        public final void f(int i) {
            this.f10232j = i;
            F();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0661h
        public final int g(int i) {
            if (i < 0) {
                throw InvalidProtocolBufferException.d();
            }
            int d10 = d() + i;
            int i9 = this.f10232j;
            if (d10 > i9) {
                throw InvalidProtocolBufferException.f();
            }
            this.f10232j = d10;
            F();
            return i9;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0661h
        public final boolean h() {
            return D() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0661h
        public final ByteString i() {
            byte[] bArr;
            int C10 = C();
            byte[] bArr2 = this.f10227d;
            if (C10 > 0) {
                int i = this.f10228e;
                int i9 = this.f10230g;
                if (C10 <= i - i9) {
                    ByteString c2 = ByteString.c(i9, C10, bArr2);
                    this.f10230g += C10;
                    return c2;
                }
            }
            if (C10 == 0) {
                return ByteString.f10084b;
            }
            if (C10 > 0) {
                int i10 = this.f10228e;
                int i11 = this.f10230g;
                if (C10 <= i10 - i11) {
                    int i12 = C10 + i11;
                    this.f10230g = i12;
                    bArr = Arrays.copyOfRange(bArr2, i11, i12);
                    ByteString byteString = ByteString.f10084b;
                    return new ByteString.LiteralByteString(bArr);
                }
            }
            if (C10 > 0) {
                throw InvalidProtocolBufferException.f();
            }
            if (C10 != 0) {
                throw InvalidProtocolBufferException.d();
            }
            bArr = C0673u.f10267b;
            ByteString byteString2 = ByteString.f10084b;
            return new ByteString.LiteralByteString(bArr);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0661h
        public final double j() {
            return Double.longBitsToDouble(B());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0661h
        public final int k() {
            return C();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0661h
        public final int l() {
            return A();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0661h
        public final long m() {
            return B();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0661h
        public final float n() {
            return Float.intBitsToFloat(A());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0661h
        public final int o() {
            return C();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0661h
        public final long p() {
            return D();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0661h
        public final int q() {
            return A();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0661h
        public final long r() {
            return B();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0661h
        public final int s() {
            return AbstractC0661h.b(C());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0661h
        public final long t() {
            return AbstractC0661h.c(D());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0661h
        public final String u() {
            int C10 = C();
            if (C10 > 0) {
                int i = this.f10228e;
                int i9 = this.f10230g;
                if (C10 <= i - i9) {
                    String str = new String(this.f10227d, i9, C10, C0673u.f10266a);
                    this.f10230g += C10;
                    return str;
                }
            }
            if (C10 == 0) {
                return "";
            }
            if (C10 < 0) {
                throw InvalidProtocolBufferException.d();
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0661h
        public final String v() {
            int C10 = C();
            if (C10 > 0) {
                int i = this.f10228e;
                int i9 = this.f10230g;
                if (C10 <= i - i9) {
                    String a10 = Utf8.f10164a.a(i9, C10, this.f10227d);
                    this.f10230g += C10;
                    return a10;
                }
            }
            if (C10 == 0) {
                return "";
            }
            if (C10 <= 0) {
                throw InvalidProtocolBufferException.d();
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0661h
        public final int w() {
            if (e()) {
                this.i = 0;
                return 0;
            }
            int C10 = C();
            this.i = C10;
            if ((C10 >>> 3) != 0) {
                return C10;
            }
            throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0661h
        public final int x() {
            return C();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0661h
        public final long y() {
            return D();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0661h
        public final boolean z(int i) {
            int w2;
            int i9 = i & 7;
            int i10 = 0;
            if (i9 == 0) {
                int i11 = this.f10228e - this.f10230g;
                byte[] bArr = this.f10227d;
                if (i11 >= 10) {
                    while (i10 < 10) {
                        int i12 = this.f10230g;
                        this.f10230g = i12 + 1;
                        if (bArr[i12] < 0) {
                            i10++;
                        }
                    }
                    throw InvalidProtocolBufferException.c();
                }
                while (i10 < 10) {
                    int i13 = this.f10230g;
                    if (i13 == this.f10228e) {
                        throw InvalidProtocolBufferException.f();
                    }
                    this.f10230g = i13 + 1;
                    if (bArr[i13] < 0) {
                        i10++;
                    }
                }
                throw InvalidProtocolBufferException.c();
                return true;
            }
            if (i9 == 1) {
                G(8);
                return true;
            }
            if (i9 == 2) {
                G(C());
                return true;
            }
            if (i9 != 3) {
                if (i9 == 4) {
                    return false;
                }
                if (i9 != 5) {
                    throw InvalidProtocolBufferException.b();
                }
                G(4);
                return true;
            }
            do {
                w2 = w();
                if (w2 == 0) {
                    break;
                }
            } while (z(w2));
            a(((i >>> 3) << 3) | 4);
            return true;
        }
    }

    public static int b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public abstract void a(int i);

    public abstract int d();

    public abstract boolean e();

    public abstract void f(int i);

    public abstract int g(int i);

    public abstract boolean h();

    public abstract ByteString i();

    public abstract double j();

    public abstract int k();

    public abstract int l();

    public abstract long m();

    public abstract float n();

    public abstract int o();

    public abstract long p();

    public abstract int q();

    public abstract long r();

    public abstract int s();

    public abstract long t();

    public abstract String u();

    public abstract String v();

    public abstract int w();

    public abstract int x();

    public abstract long y();

    public abstract boolean z(int i);
}

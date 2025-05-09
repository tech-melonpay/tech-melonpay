package com.google.crypto.tink.shaded.protobuf;

import net.sf.scuba.smartcards.ISO7816;
import org.jmrtd.PassportService;

/* loaded from: classes.dex */
public final class Utf8 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f10164a;

    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i, int i9) {
            super(C.v.k(i, i9, "Unpaired surrogate at index ", " of "));
        }
    }

    public static class a {
        public static void a(byte b9, byte b10, byte b11, byte b12, char[] cArr, int i) {
            if (!e(b10)) {
                if ((((b10 + ISO7816.INS_MANAGE_CHANNEL) + (b9 << 28)) >> 30) == 0 && !e(b11) && !e(b12)) {
                    int i9 = ((b9 & 7) << 18) | ((b10 & 63) << 12) | ((b11 & 63) << 6) | (b12 & 63);
                    cArr[i] = (char) ((i9 >>> 10) + 55232);
                    cArr[i + 1] = (char) ((i9 & 1023) + 56320);
                    return;
                }
            }
            throw InvalidProtocolBufferException.a();
        }

        public static boolean b(byte b9) {
            return b9 >= 0;
        }

        public static void c(byte b9, byte b10, char[] cArr, int i) {
            if (b9 < -62 || e(b10)) {
                throw InvalidProtocolBufferException.a();
            }
            cArr[i] = (char) (((b9 & 31) << 6) | (b10 & 63));
        }

        public static void d(byte b9, byte b10, byte b11, char[] cArr, int i) {
            if (e(b10) || ((b9 == -32 && b10 < -96) || ((b9 == -19 && b10 >= -96) || e(b11)))) {
                throw InvalidProtocolBufferException.a();
            }
            cArr[i] = (char) (((b9 & PassportService.SFI_DG15) << 12) | ((b10 & 63) << 6) | (b11 & 63));
        }

        public static boolean e(byte b9) {
            return b9 > -65;
        }
    }

    public static abstract class b {
        public abstract String a(int i, int i9, byte[] bArr);

        public abstract int b(CharSequence charSequence, byte[] bArr, int i, int i9);

        public final boolean c(int i, int i9, byte[] bArr) {
            return d(i, i9, bArr) == 0;
        }

        public abstract int d(int i, int i9, byte[] bArr);
    }

    public static final class c extends b {
        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.b
        public final String a(int i, int i9, byte[] bArr) {
            if ((i | i9 | ((bArr.length - i) - i9)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i9)));
            }
            int i10 = i + i9;
            char[] cArr = new char[i9];
            int i11 = 0;
            while (i < i10) {
                byte b9 = bArr[i];
                if (!a.b(b9)) {
                    break;
                }
                i++;
                cArr[i11] = (char) b9;
                i11++;
            }
            int i12 = i11;
            while (i < i10) {
                int i13 = i + 1;
                byte b10 = bArr[i];
                if (a.b(b10)) {
                    int i14 = i12 + 1;
                    cArr[i12] = (char) b10;
                    while (i13 < i10) {
                        byte b11 = bArr[i13];
                        if (!a.b(b11)) {
                            break;
                        }
                        i13++;
                        cArr[i14] = (char) b11;
                        i14++;
                    }
                    i12 = i14;
                    i = i13;
                } else if (b10 < -32) {
                    if (i13 >= i10) {
                        throw InvalidProtocolBufferException.a();
                    }
                    i += 2;
                    a.c(b10, bArr[i13], cArr, i12);
                    i12++;
                } else if (b10 < -16) {
                    if (i13 >= i10 - 1) {
                        throw InvalidProtocolBufferException.a();
                    }
                    int i15 = i + 2;
                    i += 3;
                    a.d(b10, bArr[i13], bArr[i15], cArr, i12);
                    i12++;
                } else {
                    if (i13 >= i10 - 2) {
                        throw InvalidProtocolBufferException.a();
                    }
                    byte b12 = bArr[i13];
                    int i16 = i + 3;
                    byte b13 = bArr[i + 2];
                    i += 4;
                    a.a(b10, b12, b13, bArr[i16], cArr, i12);
                    i12 += 2;
                }
            }
            return new String(cArr, 0, i12);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        
            return r10 + r0;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int b(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
            /*
                Method dump skipped, instructions count: 251
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.Utf8.c.b(java.lang.CharSequence, byte[], int, int):int");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.b
        public final int d(int i, int i9, byte[] bArr) {
            while (i < i9 && bArr[i] >= 0) {
                i++;
            }
            if (i >= i9) {
                return 0;
            }
            while (i < i9) {
                int i10 = i + 1;
                byte b9 = bArr[i];
                if (b9 < 0) {
                    if (b9 < -32) {
                        if (i10 >= i9) {
                            return b9;
                        }
                        if (b9 >= -62) {
                            i += 2;
                            if (bArr[i10] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b9 < -16) {
                        if (i10 >= i9 - 1) {
                            return Utf8.a(i10, i9, bArr);
                        }
                        int i11 = i + 2;
                        byte b10 = bArr[i10];
                        if (b10 <= -65 && ((b9 != -32 || b10 >= -96) && (b9 != -19 || b10 < -96))) {
                            i += 3;
                            if (bArr[i11] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i10 >= i9 - 2) {
                        return Utf8.a(i10, i9, bArr);
                    }
                    int i12 = i + 2;
                    byte b11 = bArr[i10];
                    if (b11 <= -65) {
                        if ((((b11 + ISO7816.INS_MANAGE_CHANNEL) + (b9 << 28)) >> 30) == 0) {
                            int i13 = i + 3;
                            if (bArr[i12] <= -65) {
                                i += 4;
                                if (bArr[i13] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                i = i10;
            }
            return 0;
        }
    }

    public static final class d extends b {
        public static int e(int i, int i9, long j10, byte[] bArr) {
            if (i9 == 0) {
                b bVar = Utf8.f10164a;
                if (i > -12) {
                    return -1;
                }
                return i;
            }
            if (i9 == 1) {
                return Utf8.c(i, h0.f(bArr, j10));
            }
            if (i9 == 2) {
                return Utf8.d(i, h0.f(bArr, j10), h0.f(bArr, j10 + 1));
            }
            throw new AssertionError();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.b
        public final String a(int i, int i9, byte[] bArr) {
            if ((i | i9 | ((bArr.length - i) - i9)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i9)));
            }
            int i10 = i + i9;
            char[] cArr = new char[i9];
            int i11 = 0;
            while (i < i10) {
                byte f10 = h0.f(bArr, i);
                if (!a.b(f10)) {
                    break;
                }
                i++;
                cArr[i11] = (char) f10;
                i11++;
            }
            int i12 = i11;
            while (i < i10) {
                int i13 = i + 1;
                byte f11 = h0.f(bArr, i);
                if (a.b(f11)) {
                    int i14 = i12 + 1;
                    cArr[i12] = (char) f11;
                    while (i13 < i10) {
                        byte f12 = h0.f(bArr, i13);
                        if (!a.b(f12)) {
                            break;
                        }
                        i13++;
                        cArr[i14] = (char) f12;
                        i14++;
                    }
                    i12 = i14;
                    i = i13;
                } else if (f11 < -32) {
                    if (i13 >= i10) {
                        throw InvalidProtocolBufferException.a();
                    }
                    i += 2;
                    a.c(f11, h0.f(bArr, i13), cArr, i12);
                    i12++;
                } else if (f11 < -16) {
                    if (i13 >= i10 - 1) {
                        throw InvalidProtocolBufferException.a();
                    }
                    int i15 = i + 2;
                    i += 3;
                    a.d(f11, h0.f(bArr, i13), h0.f(bArr, i15), cArr, i12);
                    i12++;
                } else {
                    if (i13 >= i10 - 2) {
                        throw InvalidProtocolBufferException.a();
                    }
                    byte f13 = h0.f(bArr, i13);
                    int i16 = i + 3;
                    byte f14 = h0.f(bArr, i + 2);
                    i += 4;
                    a.a(f11, f13, f14, h0.f(bArr, i16), cArr, i12);
                    i12 += 2;
                }
            }
            return new String(cArr, 0, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.b
        public final int b(CharSequence charSequence, byte[] bArr, int i, int i9) {
            long j10;
            String str;
            String str2;
            int i10;
            long j11;
            long j12;
            char charAt;
            long j13 = i;
            long j14 = i9 + j13;
            int length = charSequence.length();
            String str3 = " at index ";
            String str4 = "Failed writing ";
            if (length > i9 || bArr.length - i9 < i) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i + i9));
            }
            int i11 = 0;
            while (true) {
                j10 = 1;
                if (i11 >= length || (charAt = charSequence.charAt(i11)) >= 128) {
                    break;
                }
                h0.n(bArr, j13, (byte) charAt);
                i11++;
                j13 = 1 + j13;
            }
            if (i11 == length) {
                return (int) j13;
            }
            while (i11 < length) {
                char charAt2 = charSequence.charAt(i11);
                if (charAt2 >= 128 || j13 >= j14) {
                    if (charAt2 >= 2048 || j13 > j14 - 2) {
                        str = str3;
                        str2 = str4;
                        if ((charAt2 >= 55296 && 57343 >= charAt2) || j13 > j14 - 3) {
                            if (j13 > j14 - 4) {
                                if (55296 <= charAt2 && charAt2 <= 57343 && ((i10 = i11 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i10)))) {
                                    throw new UnpairedSurrogateException(i11, length);
                                }
                                throw new ArrayIndexOutOfBoundsException(str2 + charAt2 + str + j13);
                            }
                            int i12 = i11 + 1;
                            if (i12 != length) {
                                char charAt3 = charSequence.charAt(i12);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    j11 = 1;
                                    h0.n(bArr, j13, (byte) ((codePoint >>> 18) | 240));
                                    j12 = j14;
                                    h0.n(bArr, j13 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j15 = j13 + 3;
                                    h0.n(bArr, j13 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j13 += 4;
                                    h0.n(bArr, j15, (byte) ((codePoint & 63) | 128));
                                    i11 = i12;
                                } else {
                                    i11 = i12;
                                }
                            }
                            throw new UnpairedSurrogateException(i11 - 1, length);
                        }
                        h0.n(bArr, j13, (byte) ((charAt2 >>> '\f') | 480));
                        long j16 = j13 + 2;
                        h0.n(bArr, j13 + 1, (byte) (((charAt2 >>> 6) & 63) | 128));
                        j13 += 3;
                        h0.n(bArr, j16, (byte) ((charAt2 & '?') | 128));
                    } else {
                        str = str3;
                        str2 = str4;
                        long j17 = j13 + j10;
                        h0.n(bArr, j13, (byte) ((charAt2 >>> 6) | 960));
                        j13 += 2;
                        h0.n(bArr, j17, (byte) ((charAt2 & '?') | 128));
                    }
                    j12 = j14;
                    j11 = 1;
                } else {
                    h0.n(bArr, j13, (byte) charAt2);
                    j12 = j14;
                    str2 = str4;
                    j11 = j10;
                    j13 += j10;
                    str = str3;
                }
                i11++;
                str3 = str;
                str4 = str2;
                j10 = j11;
                j14 = j12;
            }
            return (int) j13;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.b
        public final int d(int i, int i9, byte[] bArr) {
            int i10;
            if ((i | i9 | (bArr.length - i9)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i9)));
            }
            long j10 = i;
            int i11 = (int) (i9 - j10);
            if (i11 >= 16) {
                long j11 = j10;
                i10 = 0;
                while (true) {
                    if (i10 >= i11) {
                        i10 = i11;
                        break;
                    }
                    long j12 = j11 + 1;
                    if (h0.f(bArr, j11) < 0) {
                        break;
                    }
                    i10++;
                    j11 = j12;
                }
            } else {
                i10 = 0;
            }
            int i12 = i11 - i10;
            long j13 = j10 + i10;
            while (true) {
                byte b9 = 0;
                while (true) {
                    if (i12 <= 0) {
                        break;
                    }
                    long j14 = j13 + 1;
                    b9 = h0.f(bArr, j13);
                    if (b9 < 0) {
                        j13 = j14;
                        break;
                    }
                    i12--;
                    j13 = j14;
                }
                if (i12 != 0) {
                    int i13 = i12 - 1;
                    if (b9 >= -32) {
                        if (b9 >= -16) {
                            if (i13 >= 3) {
                                i12 -= 4;
                                long j15 = j13 + 1;
                                byte f10 = h0.f(bArr, j13);
                                if (f10 > -65) {
                                    break;
                                }
                                if ((((f10 + ISO7816.INS_MANAGE_CHANNEL) + (b9 << 28)) >> 30) != 0) {
                                    break;
                                }
                                long j16 = 2 + j13;
                                if (h0.f(bArr, j15) > -65) {
                                    break;
                                }
                                j13 += 3;
                                if (h0.f(bArr, j16) > -65) {
                                    break;
                                }
                            } else {
                                return e(b9, i13, j13, bArr);
                            }
                        } else if (i13 >= 2) {
                            i12 -= 3;
                            long j17 = j13 + 1;
                            byte f11 = h0.f(bArr, j13);
                            if (f11 > -65 || ((b9 == -32 && f11 < -96) || (b9 == -19 && f11 >= -96))) {
                                break;
                            }
                            j13 += 2;
                            if (h0.f(bArr, j17) > -65) {
                                break;
                            }
                        } else {
                            return e(b9, i13, j13, bArr);
                        }
                    } else if (i13 != 0) {
                        i12 -= 2;
                        if (b9 < -62) {
                            break;
                        }
                        long j18 = j13 + 1;
                        if (h0.f(bArr, j13) > -65) {
                            break;
                        }
                        j13 = j18;
                    } else {
                        return b9;
                    }
                } else {
                    return 0;
                }
            }
            return -1;
        }
    }

    static {
        f10164a = (h0.f10238f && h0.f10237e && !C0657d.a()) ? new d() : new c();
    }

    public static int a(int i, int i9, byte[] bArr) {
        byte b9 = bArr[i - 1];
        int i10 = i9 - i;
        if (i10 == 0) {
            if (b9 > -12) {
                b9 = -1;
            }
            return b9;
        }
        if (i10 == 1) {
            return c(b9, bArr[i]);
        }
        if (i10 == 2) {
            return d(b9, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    public static int b(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i9 = 0;
        while (i9 < length && charSequence.charAt(i9) < 128) {
            i9++;
        }
        int i10 = length;
        while (true) {
            if (i9 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i9);
            if (charAt < 2048) {
                i10 += (127 - charAt) >>> 31;
                i9++;
            } else {
                int length2 = charSequence.length();
                while (i9 < length2) {
                    char charAt2 = charSequence.charAt(i9);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i9) < 65536) {
                                throw new UnpairedSurrogateException(i9, length2);
                            }
                            i9++;
                        }
                    }
                    i9++;
                }
                i10 += i;
            }
        }
        if (i10 >= length) {
            return i10;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i10 + 4294967296L));
    }

    public static int c(int i, int i9) {
        if (i > -12 || i9 > -65) {
            return -1;
        }
        return i ^ (i9 << 8);
    }

    public static int d(int i, int i9, int i10) {
        if (i > -12 || i9 > -65 || i10 > -65) {
            return -1;
        }
        return (i ^ (i9 << 8)) ^ (i10 << 16);
    }

    public static boolean e(int i, int i9, byte[] bArr) {
        return f10164a.c(i, i9, bArr);
    }
}

package Ka;

import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;
import ka.C0956a;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import okio.ByteString;
import okio.SegmentedByteString;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jmrtd.PassportService;

/* compiled from: Buffer.kt */
/* loaded from: classes2.dex */
public final class f implements i, h, Cloneable, ByteChannel {

    /* renamed from: a, reason: collision with root package name */
    public u f2293a;

    /* renamed from: b, reason: collision with root package name */
    public long f2294b;

    /* compiled from: Buffer.kt */
    public static final class a implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        public f f2295a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f2296b;

        /* renamed from: c, reason: collision with root package name */
        public u f2297c;

        /* renamed from: e, reason: collision with root package name */
        public byte[] f2299e;

        /* renamed from: d, reason: collision with root package name */
        public long f2298d = -1;

        /* renamed from: f, reason: collision with root package name */
        public int f2300f = -1;

        /* renamed from: g, reason: collision with root package name */
        public int f2301g = -1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f2295a == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            this.f2295a = null;
            this.f2297c = null;
            this.f2298d = -1L;
            this.f2299e = null;
            this.f2300f = -1;
            this.f2301g = -1;
        }

        public final void d(long j10) {
            f fVar = this.f2295a;
            if (fVar == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (!this.f2296b) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
            long j11 = fVar.f2294b;
            if (j10 <= j11) {
                if (j10 < 0) {
                    throw new IllegalArgumentException(androidx.camera.core.impl.j.a("newSize < 0: ", j10).toString());
                }
                long j12 = j11 - j10;
                while (true) {
                    if (j12 <= 0) {
                        break;
                    }
                    u uVar = fVar.f2293a.f2341g;
                    int i = uVar.f2337c;
                    long j13 = i - uVar.f2336b;
                    if (j13 > j12) {
                        uVar.f2337c = i - ((int) j12);
                        break;
                    } else {
                        fVar.f2293a = uVar.a();
                        v.a(uVar);
                        j12 -= j13;
                    }
                }
                this.f2297c = null;
                this.f2298d = j10;
                this.f2299e = null;
                this.f2300f = -1;
                this.f2301g = -1;
            } else if (j10 > j11) {
                long j14 = j10 - j11;
                int i9 = 1;
                boolean z10 = true;
                for (long j15 = 0; j14 > j15; j15 = 0) {
                    u Q4 = fVar.Q(i9);
                    int min = (int) Math.min(j14, 8192 - Q4.f2337c);
                    int i10 = Q4.f2337c + min;
                    Q4.f2337c = i10;
                    j14 -= min;
                    if (z10) {
                        this.f2297c = Q4;
                        this.f2298d = j11;
                        this.f2299e = Q4.f2335a;
                        this.f2300f = i10 - min;
                        this.f2301g = i10;
                        z10 = false;
                    }
                    i9 = 1;
                }
            }
            fVar.f2294b = j10;
        }

        public final int i(long j10) {
            f fVar = this.f2295a;
            if (fVar == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (j10 >= -1) {
                long j11 = fVar.f2294b;
                if (j10 <= j11) {
                    if (j10 == -1 || j10 == j11) {
                        this.f2297c = null;
                        this.f2298d = j10;
                        this.f2299e = null;
                        this.f2300f = -1;
                        this.f2301g = -1;
                        return -1;
                    }
                    u uVar = fVar.f2293a;
                    u uVar2 = this.f2297c;
                    long j12 = 0;
                    if (uVar2 != null) {
                        long j13 = this.f2298d - (this.f2300f - uVar2.f2336b);
                        if (j13 > j10) {
                            j11 = j13;
                            uVar2 = uVar;
                            uVar = uVar2;
                        } else {
                            j12 = j13;
                        }
                    } else {
                        uVar2 = uVar;
                    }
                    if (j11 - j10 > j10 - j12) {
                        while (true) {
                            long j14 = (uVar2.f2337c - uVar2.f2336b) + j12;
                            if (j10 < j14) {
                                break;
                            }
                            uVar2 = uVar2.f2340f;
                            j12 = j14;
                        }
                    } else {
                        while (j11 > j10) {
                            uVar = uVar.f2341g;
                            j11 -= uVar.f2337c - uVar.f2336b;
                        }
                        uVar2 = uVar;
                        j12 = j11;
                    }
                    if (this.f2296b && uVar2.f2338d) {
                        byte[] bArr = uVar2.f2335a;
                        u uVar3 = new u(Arrays.copyOf(bArr, bArr.length), uVar2.f2336b, uVar2.f2337c, false, true);
                        if (fVar.f2293a == uVar2) {
                            fVar.f2293a = uVar3;
                        }
                        uVar2.b(uVar3);
                        uVar3.f2341g.a();
                        uVar2 = uVar3;
                    }
                    this.f2297c = uVar2;
                    this.f2298d = j10;
                    this.f2299e = uVar2.f2335a;
                    int i = uVar2.f2336b + ((int) (j10 - j12));
                    this.f2300f = i;
                    int i9 = uVar2.f2337c;
                    this.f2301g = i9;
                    return i9 - i;
                }
            }
            throw new ArrayIndexOutOfBoundsException("offset=" + j10 + " > size=" + fVar.f2294b);
        }
    }

    public final byte A(long j10) {
        Ka.a.a(this.f2294b, j10, 1L);
        u uVar = this.f2293a;
        uVar.getClass();
        long j11 = this.f2294b;
        if (j11 - j10 < j10) {
            while (j11 > j10) {
                uVar = uVar.f2341g;
                j11 -= uVar.f2337c - uVar.f2336b;
            }
            return uVar.f2335a[(int) ((uVar.f2336b + j10) - j11)];
        }
        long j12 = 0;
        while (true) {
            int i = uVar.f2337c;
            int i9 = uVar.f2336b;
            long j13 = (i - i9) + j12;
            if (j13 > j10) {
                return uVar.f2335a[(int) ((i9 + j10) - j12)];
            }
            uVar = uVar.f2340f;
            j12 = j13;
        }
    }

    public final long C(byte b9, long j10, long j11) {
        u uVar;
        long j12 = 0;
        if (0 > j10 || j10 > j11) {
            throw new IllegalArgumentException(("size=" + this.f2294b + " fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        long j13 = this.f2294b;
        if (j11 > j13) {
            j11 = j13;
        }
        if (j10 == j11 || (uVar = this.f2293a) == null) {
            return -1L;
        }
        if (j13 - j10 < j10) {
            while (j13 > j10) {
                uVar = uVar.f2341g;
                j13 -= uVar.f2337c - uVar.f2336b;
            }
            while (j13 < j11) {
                int min = (int) Math.min(uVar.f2337c, (uVar.f2336b + j11) - j13);
                for (int i = (int) ((uVar.f2336b + j10) - j13); i < min; i++) {
                    if (uVar.f2335a[i] == b9) {
                        return (i - uVar.f2336b) + j13;
                    }
                }
                j13 += uVar.f2337c - uVar.f2336b;
                uVar = uVar.f2340f;
                j10 = j13;
            }
            return -1L;
        }
        while (true) {
            long j14 = (uVar.f2337c - uVar.f2336b) + j12;
            if (j14 > j10) {
                break;
            }
            uVar = uVar.f2340f;
            j12 = j14;
        }
        while (j12 < j11) {
            int min2 = (int) Math.min(uVar.f2337c, (uVar.f2336b + j11) - j12);
            for (int i9 = (int) ((uVar.f2336b + j10) - j12); i9 < min2; i9++) {
                if (uVar.f2335a[i9] == b9) {
                    return (i9 - uVar.f2336b) + j12;
                }
            }
            j12 += uVar.f2337c - uVar.f2336b;
            uVar = uVar.f2340f;
            j10 = j12;
        }
        return -1L;
    }

    public final a D(a aVar) {
        byte[] bArr = La.a.f2500a;
        if (aVar == Ka.a.f2278a) {
            aVar = new a();
        }
        if (aVar.f2295a != null) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        aVar.f2295a = this;
        aVar.f2296b = true;
        return aVar;
    }

    public final byte[] E(long j10) {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(androidx.camera.core.impl.j.a("byteCount: ", j10).toString());
        }
        if (this.f2294b < j10) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j10];
        readFully(bArr);
        return bArr;
    }

    @Override // Ka.h
    public final /* bridge */ /* synthetic */ h F(String str) {
        o0(str);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        r1 = new Ka.f();
        r1.Y(r8);
        r1.W(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        if (r2 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        r1.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        throw new java.lang.NumberFormatException("Number too large: ".concat(r1.M()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
    
        r5 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long G() {
        /*
            Method dump skipped, instructions count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Ka.f.G():long");
    }

    public final String H(long j10, Charset charset) {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(androidx.camera.core.impl.j.a("byteCount: ", j10).toString());
        }
        if (this.f2294b < j10) {
            throw new EOFException();
        }
        if (j10 == 0) {
            return "";
        }
        u uVar = this.f2293a;
        int i = uVar.f2336b;
        if (i + j10 > uVar.f2337c) {
            return new String(E(j10), charset);
        }
        int i9 = (int) j10;
        String str = new String(uVar.f2335a, i, i9, charset);
        int i10 = uVar.f2336b + i9;
        uVar.f2336b = i10;
        this.f2294b -= j10;
        if (i10 == uVar.f2337c) {
            this.f2293a = uVar.a();
            v.a(uVar);
        }
        return str;
    }

    @Override // Ka.i
    public final String I(Charset charset) {
        return H(this.f2294b, charset);
    }

    @Override // Ka.i
    public final void J(f fVar, long j10) {
        long j11 = this.f2294b;
        if (j11 >= j10) {
            fVar.z(this, j10);
        } else {
            fVar.z(this, j11);
            throw new EOFException();
        }
    }

    @Override // Ka.h
    public final /* bridge */ /* synthetic */ h L(long j10) {
        a0(j10);
        return this;
    }

    public final String M() {
        return H(this.f2294b, C0956a.f23054b);
    }

    public final int N() {
        int i;
        int i9;
        int i10;
        if (this.f2294b == 0) {
            throw new EOFException();
        }
        byte A10 = A(0L);
        if ((A10 & ISOFileInfo.DATA_BYTES1) == 0) {
            i = A10 & Byte.MAX_VALUE;
            i10 = 0;
            i9 = 1;
        } else if ((A10 & ISO7816.INS_CREATE_FILE) == 192) {
            i = A10 & 31;
            i9 = 2;
            i10 = 128;
        } else if ((A10 & 240) == 224) {
            i = A10 & PassportService.SFI_DG15;
            i9 = 3;
            i10 = 2048;
        } else {
            if ((A10 & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i = A10 & 7;
            i9 = 4;
            i10 = 65536;
        }
        long j10 = i9;
        if (this.f2294b < j10) {
            StringBuilder l10 = com.google.android.gms.measurement.internal.a.l("size < ", i9, ": ");
            l10.append(this.f2294b);
            l10.append(" (to read code point prefixed 0x");
            l10.append(Ka.a.b(A10));
            l10.append(')');
            throw new EOFException(l10.toString());
        }
        for (int i11 = 1; i11 < i9; i11++) {
            long j11 = i11;
            byte A11 = A(j11);
            if ((A11 & ISO7816.INS_GET_RESPONSE) != 128) {
                skip(j11);
                return 65533;
            }
            i = (i << 6) | (A11 & 63);
        }
        skip(j10);
        if (i > 1114111) {
            return 65533;
        }
        if ((55296 > i || i >= 57344) && i >= i10) {
            return i;
        }
        return 65533;
    }

    @Override // Ka.i
    public final boolean O(long j10) {
        return this.f2294b >= j10;
    }

    public final ByteString P(int i) {
        if (i == 0) {
            return ByteString.f24696d;
        }
        Ka.a.a(this.f2294b, 0L, i);
        u uVar = this.f2293a;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            int i12 = uVar.f2337c;
            int i13 = uVar.f2336b;
            if (i12 == i13) {
                throw new AssertionError("s.limit == s.pos");
            }
            i10 += i12 - i13;
            i11++;
            uVar = uVar.f2340f;
        }
        byte[][] bArr = new byte[i11][];
        int[] iArr = new int[i11 * 2];
        u uVar2 = this.f2293a;
        int i14 = 0;
        while (i9 < i) {
            bArr[i14] = uVar2.f2335a;
            i9 += uVar2.f2337c - uVar2.f2336b;
            iArr[i14] = Math.min(i9, i);
            iArr[i14 + i11] = uVar2.f2336b;
            uVar2.f2338d = true;
            i14++;
            uVar2 = uVar2.f2340f;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    public final u Q(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        u uVar = this.f2293a;
        if (uVar == null) {
            u b9 = v.b();
            this.f2293a = b9;
            b9.f2341g = b9;
            b9.f2340f = b9;
            return b9;
        }
        u uVar2 = uVar.f2341g;
        if (uVar2.f2337c + i <= 8192 && uVar2.f2339e) {
            return uVar2;
        }
        u b10 = v.b();
        uVar2.b(b10);
        return b10;
    }

    @Override // Ka.i
    public final String R() {
        return x(Long.MAX_VALUE);
    }

    @Override // Ka.i
    public final int S(q qVar) {
        int b9 = La.a.b(this, qVar, false);
        if (b9 == -1) {
            return -1;
        }
        skip(qVar.f2320a[b9].d());
        return b9;
    }

    public final void T(ByteString byteString) {
        byteString.l(this, byteString.d());
    }

    public final void V(byte[] bArr, int i, int i9) {
        long j10 = i9;
        Ka.a.a(bArr.length, i, j10);
        int i10 = i9 + i;
        while (i < i10) {
            u Q4 = Q(1);
            int min = Math.min(i10 - i, 8192 - Q4.f2337c);
            int i11 = i + min;
            System.arraycopy(bArr, i, Q4.f2335a, Q4.f2337c, i11 - i);
            Q4.f2337c += min;
            i = i11;
        }
        this.f2294b += j10;
    }

    public final void W(int i) {
        u Q4 = Q(1);
        int i9 = Q4.f2337c;
        Q4.f2337c = i9 + 1;
        Q4.f2335a[i9] = (byte) i;
        this.f2294b++;
    }

    @Override // Ka.h
    public final h X(byte[] bArr) {
        V(bArr, 0, bArr.length);
        return this;
    }

    public final void Y(long j10) {
        byte[] bArr;
        if (j10 == 0) {
            W(48);
            return;
        }
        boolean z10 = false;
        int i = 1;
        if (j10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                n0(0, 20, "-9223372036854775808");
                return;
            }
            z10 = true;
        }
        if (j10 >= 100000000) {
            i = j10 < 1000000000000L ? j10 < 10000000000L ? j10 < 1000000000 ? 9 : 10 : j10 < 100000000000L ? 11 : 12 : j10 < 1000000000000000L ? j10 < 10000000000000L ? 13 : j10 < 100000000000000L ? 14 : 15 : j10 < 100000000000000000L ? j10 < 10000000000000000L ? 16 : 17 : j10 < 1000000000000000000L ? 18 : 19;
        } else if (j10 >= 10000) {
            i = j10 < 1000000 ? j10 < 100000 ? 5 : 6 : j10 < 10000000 ? 7 : 8;
        } else if (j10 >= 100) {
            i = j10 < 1000 ? 3 : 4;
        } else if (j10 >= 10) {
            i = 2;
        }
        if (z10) {
            i++;
        }
        u Q4 = Q(i);
        int i9 = Q4.f2337c + i;
        while (true) {
            bArr = Q4.f2335a;
            if (j10 == 0) {
                break;
            }
            long j11 = 10;
            i9--;
            bArr[i9] = La.a.f2500a[(int) (j10 % j11)];
            j10 /= j11;
        }
        if (z10) {
            bArr[i9 - 1] = 45;
        }
        Q4.f2337c += i;
        this.f2294b += i;
    }

    @Override // Ka.h
    public final /* bridge */ /* synthetic */ h Z(ByteString byteString) {
        T(byteString);
        return this;
    }

    public final void a0(long j10) {
        if (j10 == 0) {
            W(48);
            return;
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + 3) / 4);
        u Q4 = Q(i);
        int i9 = Q4.f2337c;
        for (int i10 = (i9 + i) - 1; i10 >= i9; i10--) {
            Q4.f2335a[i10] = La.a.f2500a[(int) (15 & j10)];
            j10 >>>= 4;
        }
        Q4.f2337c += i;
        this.f2294b += i;
    }

    @Override // Ka.y
    public final z b() {
        return z.f2346d;
    }

    @Override // Ka.h
    public final long c0(y yVar) {
        long j10 = 0;
        while (true) {
            long i02 = yVar.i0(this, 8192L);
            if (i02 == -1) {
                return j10;
            }
            j10 += i02;
        }
    }

    public final void d() {
        skip(this.f2294b);
    }

    public final void d0(int i) {
        u Q4 = Q(4);
        int i9 = Q4.f2337c;
        byte[] bArr = Q4.f2335a;
        bArr[i9] = (byte) ((i >>> 24) & 255);
        bArr[i9 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i9 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i9 + 3] = (byte) (i & 255);
        Q4.f2337c = i9 + 4;
        this.f2294b += 4;
    }

    @Override // Ka.h
    public final /* bridge */ /* synthetic */ h e0(int i, int i9, byte[] bArr) {
        V(bArr, i, i9);
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                long j10 = this.f2294b;
                f fVar = (f) obj;
                if (j10 == fVar.f2294b) {
                    if (j10 != 0) {
                        u uVar = this.f2293a;
                        u uVar2 = fVar.f2293a;
                        int i = uVar.f2336b;
                        int i9 = uVar2.f2336b;
                        long j11 = 0;
                        while (j11 < this.f2294b) {
                            long min = Math.min(uVar.f2337c - i, uVar2.f2337c - i9);
                            long j12 = 0;
                            while (j12 < min) {
                                int i10 = i + 1;
                                byte b9 = uVar.f2335a[i];
                                int i11 = i9 + 1;
                                if (b9 == uVar2.f2335a[i9]) {
                                    j12++;
                                    i9 = i11;
                                    i = i10;
                                }
                            }
                            if (i == uVar.f2337c) {
                                u uVar3 = uVar.f2340f;
                                i = uVar3.f2336b;
                                uVar = uVar3;
                            }
                            if (i9 == uVar2.f2337c) {
                                uVar2 = uVar2.f2340f;
                                i9 = uVar2.f2336b;
                            }
                            j11 += min;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void g0(int i) {
        u Q4 = Q(2);
        int i9 = Q4.f2337c;
        byte[] bArr = Q4.f2335a;
        bArr[i9] = (byte) ((i >>> 8) & 255);
        bArr[i9 + 1] = (byte) (i & 255);
        Q4.f2337c = i9 + 2;
        this.f2294b += 2;
    }

    @Override // Ka.i
    public final ByteString h(long j10) {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(androidx.camera.core.impl.j.a("byteCount: ", j10).toString());
        }
        if (this.f2294b < j10) {
            throw new EOFException();
        }
        if (j10 < 4096) {
            return new ByteString(E(j10));
        }
        ByteString P4 = P((int) j10);
        skip(j10);
        return P4;
    }

    @Override // Ka.i
    public final void h0(long j10) {
        if (this.f2294b < j10) {
            throw new EOFException();
        }
    }

    public final int hashCode() {
        u uVar = this.f2293a;
        if (uVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i9 = uVar.f2337c;
            for (int i10 = uVar.f2336b; i10 < i9; i10++) {
                i = (i * 31) + uVar.f2335a[i10];
            }
            uVar = uVar.f2340f;
        } while (uVar != this.f2293a);
        return i;
    }

    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final f clone() {
        f fVar = new f();
        if (this.f2294b != 0) {
            u uVar = this.f2293a;
            u c2 = uVar.c();
            fVar.f2293a = c2;
            c2.f2341g = c2;
            c2.f2340f = c2;
            for (u uVar2 = uVar.f2340f; uVar2 != uVar; uVar2 = uVar2.f2340f) {
                c2.f2341g.b(uVar2.c());
            }
            fVar.f2294b = this.f2294b;
        }
        return fVar;
    }

    @Override // Ka.y
    public final long i0(f fVar, long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.j.a("byteCount < 0: ", j10).toString());
        }
        long j11 = this.f2294b;
        if (j11 == 0) {
            return -1L;
        }
        if (j10 > j11) {
            j10 = j11;
        }
        fVar.z(this, j10);
        return j10;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final long j() {
        long j10 = this.f2294b;
        if (j10 == 0) {
            return 0L;
        }
        u uVar = this.f2293a.f2341g;
        if (uVar.f2337c < 8192 && uVar.f2339e) {
            j10 -= r3 - uVar.f2336b;
        }
        return j10;
    }

    @Override // Ka.h
    public final /* bridge */ /* synthetic */ h j0(long j10) {
        Y(j10);
        return this;
    }

    public final void k0(String str, int i, int i9, Charset charset) {
        if (i < 0) {
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.g(i, "beginIndex < 0: ").toString());
        }
        if (i9 < i) {
            throw new IllegalArgumentException(C.v.k(i9, i, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i9 > str.length()) {
            StringBuilder l10 = com.google.android.gms.measurement.internal.a.l("endIndex > string.length: ", i9, " > ");
            l10.append(str.length());
            throw new IllegalArgumentException(l10.toString().toString());
        }
        if (kotlin.jvm.internal.f.b(charset, C0956a.f23054b)) {
            n0(i, i9, str);
        } else {
            byte[] bytes = str.substring(i, i9).getBytes(charset);
            V(bytes, 0, bytes.length);
        }
    }

    @Override // Ka.h
    public final /* bridge */ /* synthetic */ h l(int i) {
        g0(i);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008a A[EDGE_INSN: B:40:0x008a->B:37:0x008a BREAK  A[LOOP:0: B:4:0x000b->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082  */
    @Override // Ka.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long l0() {
        /*
            r13 = this;
            long r0 = r13.f2294b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L91
            r0 = 0
            r1 = r0
            r4 = r2
        Lb:
            Ka.u r6 = r13.f2293a
            int r7 = r6.f2336b
            int r8 = r6.f2337c
        L11:
            if (r7 >= r8) goto L76
            byte[] r9 = r6.f2335a
            r9 = r9[r7]
            r10 = 48
            if (r9 < r10) goto L22
            r10 = 57
            if (r9 > r10) goto L22
            int r10 = r9 + (-48)
            goto L37
        L22:
            r10 = 97
            if (r9 < r10) goto L2d
            r10 = 102(0x66, float:1.43E-43)
            if (r9 > r10) goto L2d
            int r10 = r9 + (-87)
            goto L37
        L2d:
            r10 = 65
            if (r9 < r10) goto L62
            r10 = 70
            if (r9 > r10) goto L62
            int r10 = r9 + (-55)
        L37:
            r11 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r11 = r11 & r4
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 != 0) goto L47
            r9 = 4
            long r4 = r4 << r9
            long r9 = (long) r10
            long r4 = r4 | r9
            int r7 = r7 + 1
            int r0 = r0 + 1
            goto L11
        L47:
            Ka.f r0 = new Ka.f
            r0.<init>()
            r0.a0(r4)
            r0.W(r9)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.M()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L62:
            if (r0 == 0) goto L66
            r1 = 1
            goto L76
        L66:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = Ka.a.b(r9)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L76:
            if (r7 != r8) goto L82
            Ka.u r7 = r6.a()
            r13.f2293a = r7
            Ka.v.a(r6)
            goto L84
        L82:
            r6.f2336b = r7
        L84:
            if (r1 != 0) goto L8a
            Ka.u r6 = r13.f2293a
            if (r6 != 0) goto Lb
        L8a:
            long r1 = r13.f2294b
            long r6 = (long) r0
            long r1 = r1 - r6
            r13.f2294b = r1
            return r4
        L91:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Ka.f.l0():long");
    }

    @Override // Ka.i
    public final InputStream m0() {
        return new b();
    }

    @Override // Ka.i
    public final long n(f fVar) {
        long j10 = this.f2294b;
        if (j10 > 0) {
            fVar.z(this, j10);
        }
        return j10;
    }

    public final void n0(int i, int i9, String str) {
        char charAt;
        if (i < 0) {
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.g(i, "beginIndex < 0: ").toString());
        }
        if (i9 < i) {
            throw new IllegalArgumentException(C.v.k(i9, i, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i9 > str.length()) {
            StringBuilder l10 = com.google.android.gms.measurement.internal.a.l("endIndex > string.length: ", i9, " > ");
            l10.append(str.length());
            throw new IllegalArgumentException(l10.toString().toString());
        }
        while (i < i9) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                u Q4 = Q(1);
                int i10 = Q4.f2337c - i;
                int min = Math.min(i9, 8192 - i10);
                int i11 = i + 1;
                byte[] bArr = Q4.f2335a;
                bArr[i + i10] = (byte) charAt2;
                while (true) {
                    i = i11;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i11 = i + 1;
                    bArr[i + i10] = (byte) charAt;
                }
                int i12 = Q4.f2337c;
                int i13 = (i10 + i) - i12;
                Q4.f2337c = i12 + i13;
                this.f2294b += i13;
            } else {
                if (charAt2 < 2048) {
                    u Q10 = Q(2);
                    int i14 = Q10.f2337c;
                    byte[] bArr2 = Q10.f2335a;
                    bArr2[i14] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i14 + 1] = (byte) ((charAt2 & '?') | 128);
                    Q10.f2337c = i14 + 2;
                    this.f2294b += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    u Q11 = Q(3);
                    int i15 = Q11.f2337c;
                    byte b9 = (byte) ((charAt2 >> '\f') | BERTags.FLAGS);
                    byte[] bArr3 = Q11.f2335a;
                    bArr3[i15] = b9;
                    bArr3[i15 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i15 + 2] = (byte) ((charAt2 & '?') | 128);
                    Q11.f2337c = i15 + 3;
                    this.f2294b += 3;
                } else {
                    int i16 = i + 1;
                    char charAt3 = i16 < i9 ? str.charAt(i16) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        W(63);
                        i = i16;
                    } else {
                        int i17 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        u Q12 = Q(4);
                        int i18 = Q12.f2337c;
                        byte[] bArr4 = Q12.f2335a;
                        bArr4[i18] = (byte) ((i17 >> 18) | 240);
                        bArr4[i18 + 1] = (byte) (((i17 >> 12) & 63) | 128);
                        bArr4[i18 + 2] = (byte) (((i17 >> 6) & 63) | 128);
                        bArr4[i18 + 3] = (byte) ((i17 & 63) | 128);
                        Q12.f2337c = i18 + 4;
                        this.f2294b += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    @Override // Ka.h
    public final /* bridge */ /* synthetic */ h o(int i) {
        d0(i);
        return this;
    }

    public final void o0(String str) {
        n0(0, str.length(), str);
    }

    public final void p(f fVar, long j10, long j11) {
        Ka.a.a(this.f2294b, j10, j11);
        if (j11 == 0) {
            return;
        }
        fVar.f2294b += j11;
        u uVar = this.f2293a;
        while (true) {
            long j12 = uVar.f2337c - uVar.f2336b;
            if (j10 < j12) {
                break;
            }
            j10 -= j12;
            uVar = uVar.f2340f;
        }
        while (j11 > 0) {
            u c2 = uVar.c();
            int i = c2.f2336b + ((int) j10);
            c2.f2336b = i;
            c2.f2337c = Math.min(i + ((int) j11), c2.f2337c);
            u uVar2 = fVar.f2293a;
            if (uVar2 == null) {
                c2.f2341g = c2;
                c2.f2340f = c2;
                fVar.f2293a = c2;
            } else {
                uVar2.f2341g.b(c2);
            }
            j11 -= c2.f2337c - c2.f2336b;
            uVar = uVar.f2340f;
            j10 = 0;
        }
    }

    public final void p0(int i) {
        String str;
        int i9 = 0;
        if (i < 128) {
            W(i);
            return;
        }
        if (i < 2048) {
            u Q4 = Q(2);
            int i10 = Q4.f2337c;
            byte[] bArr = Q4.f2335a;
            bArr[i10] = (byte) ((i >> 6) | 192);
            bArr[1 + i10] = (byte) ((i & 63) | 128);
            Q4.f2337c = i10 + 2;
            this.f2294b += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            W(63);
            return;
        }
        if (i < 65536) {
            u Q10 = Q(3);
            int i11 = Q10.f2337c;
            byte b9 = (byte) ((i >> 12) | BERTags.FLAGS);
            byte[] bArr2 = Q10.f2335a;
            bArr2[i11] = b9;
            bArr2[1 + i11] = (byte) (((i >> 6) & 63) | 128);
            bArr2[2 + i11] = (byte) ((i & 63) | 128);
            Q10.f2337c = i11 + 3;
            this.f2294b += 3;
            return;
        }
        if (i <= 1114111) {
            u Q11 = Q(4);
            int i12 = Q11.f2337c;
            byte[] bArr3 = Q11.f2335a;
            bArr3[i12] = (byte) ((i >> 18) | 240);
            bArr3[1 + i12] = (byte) (((i >> 12) & 63) | 128);
            bArr3[2 + i12] = (byte) (((i >> 6) & 63) | 128);
            bArr3[3 + i12] = (byte) ((i & 63) | 128);
            Q11.f2337c = i12 + 4;
            this.f2294b += 4;
            return;
        }
        StringBuilder sb2 = new StringBuilder("Unexpected code point: 0x");
        a aVar = Ka.a.f2278a;
        if (i != 0) {
            char[] cArr = La.b.f2501a;
            char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
            while (i9 < 8 && cArr2[i9] == '0') {
                i9++;
            }
            if (i9 < 0) {
                throw new IndexOutOfBoundsException(s3.b.i("startIndex: ", i9, ", endIndex: 8, size: 8"));
            }
            if (i9 > 8) {
                throw new IllegalArgumentException(s3.b.i("startIndex: ", i9, " > endIndex: 8"));
            }
            str = new String(cArr2, i9, 8 - i9);
        } else {
            str = "0";
        }
        sb2.append(str);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // Ka.i
    public final t peek() {
        return new t(new r(this));
    }

    @Override // Ka.i
    public final byte[] q() {
        return E(this.f2294b);
    }

    @Override // Ka.i
    public final boolean r() {
        return this.f2294b == 0;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        u uVar = this.f2293a;
        if (uVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), uVar.f2337c - uVar.f2336b);
        byteBuffer.put(uVar.f2335a, uVar.f2336b, min);
        int i = uVar.f2336b + min;
        uVar.f2336b = i;
        this.f2294b -= min;
        if (i == uVar.f2337c) {
            this.f2293a = uVar.a();
            v.a(uVar);
        }
        return min;
    }

    @Override // Ka.i
    public final byte readByte() {
        long j10 = this.f2294b;
        if (j10 == 0) {
            throw new EOFException();
        }
        u uVar = this.f2293a;
        int i = uVar.f2336b;
        int i9 = uVar.f2337c;
        int i10 = i + 1;
        byte b9 = uVar.f2335a[i];
        this.f2294b = j10 - 1;
        if (i10 == i9) {
            this.f2293a = uVar.a();
            v.a(uVar);
        } else {
            uVar.f2336b = i10;
        }
        return b9;
    }

    @Override // Ka.i
    public final void readFully(byte[] bArr) {
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read == -1) {
                throw new EOFException();
            }
            i += read;
        }
    }

    @Override // Ka.i
    public final int readInt() {
        long j10 = this.f2294b;
        if (j10 < 4) {
            throw new EOFException();
        }
        u uVar = this.f2293a;
        int i = uVar.f2336b;
        int i9 = uVar.f2337c;
        if (i9 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = uVar.f2335a;
        int i10 = i + 3;
        int i11 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i12 = i + 4;
        int i13 = i11 | (bArr[i10] & 255);
        this.f2294b = j10 - 4;
        if (i12 == i9) {
            this.f2293a = uVar.a();
            v.a(uVar);
        } else {
            uVar.f2336b = i12;
        }
        return i13;
    }

    @Override // Ka.i
    public final long readLong() {
        long j10 = this.f2294b;
        if (j10 < 8) {
            throw new EOFException();
        }
        u uVar = this.f2293a;
        int i = uVar.f2336b;
        int i9 = uVar.f2337c;
        if (i9 - i < 8) {
            return ((readInt() & BodyPartID.bodyIdMax) << 32) | (BodyPartID.bodyIdMax & readInt());
        }
        byte[] bArr = uVar.f2335a;
        int i10 = i + 7;
        long j11 = ((bArr[i + 1] & 255) << 48) | ((bArr[i] & 255) << 56) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
        int i11 = i + 8;
        long j12 = j11 | (bArr[i10] & 255);
        this.f2294b = j10 - 8;
        if (i11 == i9) {
            this.f2293a = uVar.a();
            v.a(uVar);
        } else {
            uVar.f2336b = i11;
        }
        return j12;
    }

    @Override // Ka.i
    public final short readShort() {
        long j10 = this.f2294b;
        if (j10 < 2) {
            throw new EOFException();
        }
        u uVar = this.f2293a;
        int i = uVar.f2336b;
        int i9 = uVar.f2337c;
        if (i9 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        int i10 = i + 1;
        byte[] bArr = uVar.f2335a;
        int i11 = (bArr[i] & 255) << 8;
        int i12 = i + 2;
        int i13 = (bArr[i10] & 255) | i11;
        this.f2294b = j10 - 2;
        if (i12 == i9) {
            this.f2293a = uVar.a();
            v.a(uVar);
        } else {
            uVar.f2336b = i12;
        }
        return (short) i13;
    }

    @Override // Ka.h
    public final /* bridge */ /* synthetic */ h s(int i) {
        W(i);
        return this;
    }

    @Override // Ka.i
    public final void skip(long j10) {
        while (j10 > 0) {
            u uVar = this.f2293a;
            if (uVar == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j10, uVar.f2337c - uVar.f2336b);
            long j11 = min;
            this.f2294b -= j11;
            j10 -= j11;
            int i = uVar.f2336b + min;
            uVar.f2336b = i;
            if (i == uVar.f2337c) {
                this.f2293a = uVar.a();
                v.a(uVar);
            }
        }
    }

    public final String toString() {
        long j10 = this.f2294b;
        if (j10 <= 2147483647L) {
            return P((int) j10).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f2294b).toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            u Q4 = Q(1);
            int min = Math.min(i, 8192 - Q4.f2337c);
            byteBuffer.get(Q4.f2335a, Q4.f2337c, min);
            i -= min;
            Q4.f2337c += min;
        }
        this.f2294b += remaining;
        return remaining;
    }

    @Override // Ka.i
    public final String x(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.j.a("limit < 0: ", j10).toString());
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        long C10 = C((byte) 10, 0L, j11);
        if (C10 != -1) {
            return La.a.a(this, C10);
        }
        if (j11 < this.f2294b && A(j11 - 1) == 13 && A(j11) == 10) {
            return La.a.a(this, j11);
        }
        f fVar = new f();
        p(fVar, 0L, Math.min(32, this.f2294b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f2294b, j10) + " content=" + fVar.h(fVar.f2294b).e() + (char) 8230);
    }

    @Override // Ka.w
    public final void z(f fVar, long j10) {
        u b9;
        if (fVar == this) {
            throw new IllegalArgumentException("source == this".toString());
        }
        Ka.a.a(fVar.f2294b, 0L, j10);
        while (j10 > 0) {
            u uVar = fVar.f2293a;
            int i = uVar.f2337c - uVar.f2336b;
            if (j10 < i) {
                u uVar2 = this.f2293a;
                u uVar3 = uVar2 != null ? uVar2.f2341g : null;
                if (uVar3 != null && uVar3.f2339e) {
                    if ((uVar3.f2337c + j10) - (uVar3.f2338d ? 0 : uVar3.f2336b) <= 8192) {
                        uVar.d(uVar3, (int) j10);
                        fVar.f2294b -= j10;
                        this.f2294b += j10;
                        return;
                    }
                }
                int i9 = (int) j10;
                if (i9 <= 0 || i9 > i) {
                    throw new IllegalArgumentException("byteCount out of range".toString());
                }
                if (i9 >= 1024) {
                    b9 = uVar.c();
                } else {
                    b9 = v.b();
                    int i10 = uVar.f2336b;
                    P9.i.g(uVar.f2335a, b9.f2335a, i10, i10 + i9);
                }
                b9.f2337c = b9.f2336b + i9;
                uVar.f2336b += i9;
                uVar.f2341g.b(b9);
                fVar.f2293a = b9;
            }
            u uVar4 = fVar.f2293a;
            long j11 = uVar4.f2337c - uVar4.f2336b;
            fVar.f2293a = uVar4.a();
            u uVar5 = this.f2293a;
            if (uVar5 == null) {
                this.f2293a = uVar4;
                uVar4.f2341g = uVar4;
                uVar4.f2340f = uVar4;
            } else {
                uVar5.f2341g.b(uVar4);
                u uVar6 = uVar4.f2341g;
                if (uVar6 == uVar4) {
                    throw new IllegalStateException("cannot compact".toString());
                }
                if (uVar6.f2339e) {
                    int i11 = uVar4.f2337c - uVar4.f2336b;
                    if (i11 <= (8192 - uVar6.f2337c) + (uVar6.f2338d ? 0 : uVar6.f2336b)) {
                        uVar4.d(uVar6, i11);
                        uVar4.a();
                        v.a(uVar4);
                    }
                }
            }
            fVar.f2294b -= j11;
            this.f2294b += j11;
            j10 -= j11;
        }
    }

    /* compiled from: Buffer.kt */
    public static final class b extends InputStream {
        public b() {
        }

        @Override // java.io.InputStream
        public final int available() {
            return (int) Math.min(f.this.f2294b, Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream
        public final int read() {
            f fVar = f.this;
            if (fVar.f2294b > 0) {
                return fVar.readByte() & 255;
            }
            return -1;
        }

        public final String toString() {
            return f.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i9) {
            return f.this.read(bArr, i, i9);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }

    public final int read(byte[] bArr, int i, int i9) {
        Ka.a.a(bArr.length, i, i9);
        u uVar = this.f2293a;
        if (uVar == null) {
            return -1;
        }
        int min = Math.min(i9, uVar.f2337c - uVar.f2336b);
        int i10 = uVar.f2336b;
        System.arraycopy(uVar.f2335a, i10, bArr, i, (i10 + min) - i10);
        int i11 = uVar.f2336b + min;
        uVar.f2336b = i11;
        this.f2294b -= min;
        if (i11 == uVar.f2337c) {
            this.f2293a = uVar.a();
            v.a(uVar);
        }
        return min;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, Ka.w
    public final void close() {
    }

    @Override // Ka.h, Ka.w, java.io.Flushable
    public final void flush() {
    }

    @Override // Ka.i, Ka.h
    public final f getBuffer() {
        return this;
    }

    @Override // Ka.h
    public final h k() {
        return this;
    }

    @Override // Ka.h
    public final h v() {
        return this;
    }
}

package Ka;

import Ka.f;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import okio.ByteString;

/* compiled from: RealBufferedSource.kt */
/* loaded from: classes2.dex */
public final class t implements i {

    /* renamed from: a, reason: collision with root package name */
    public final y f2331a;

    /* renamed from: b, reason: collision with root package name */
    public final f f2332b = new f();

    /* renamed from: c, reason: collision with root package name */
    public boolean f2333c;

    public t(y yVar) {
        this.f2331a = yVar;
    }

    @Override // Ka.i
    public final String I(Charset charset) {
        f fVar = this.f2332b;
        fVar.c0(this.f2331a);
        return fVar.H(fVar.f2294b, charset);
    }

    @Override // Ka.i
    public final void J(f fVar, long j10) {
        f fVar2 = this.f2332b;
        try {
            h0(j10);
            fVar2.J(fVar, j10);
        } catch (EOFException e10) {
            fVar.c0(fVar2);
            throw e10;
        }
    }

    @Override // Ka.i
    public final boolean O(long j10) {
        f fVar;
        if (j10 < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.j.a("byteCount < 0: ", j10).toString());
        }
        if (!(!this.f2333c)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            fVar = this.f2332b;
            if (fVar.f2294b >= j10) {
                return true;
            }
        } while (this.f2331a.i0(fVar, 8192L) != -1);
        return false;
    }

    @Override // Ka.i
    public final String R() {
        return x(Long.MAX_VALUE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:?, code lost:
    
        return -1;
     */
    @Override // Ka.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int S(Ka.q r8) {
        /*
            r7 = this;
            boolean r0 = r7.f2333c
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L31
        L6:
            Ka.f r0 = r7.f2332b
            int r2 = La.a.b(r0, r8, r1)
            r3 = -2
            r4 = -1
            if (r2 == r3) goto L21
            if (r2 == r4) goto L1f
            okio.ByteString[] r8 = r8.f2320a
            r8 = r8[r2]
            int r8 = r8.d()
            long r3 = (long) r8
            r0.skip(r3)
            goto L30
        L1f:
            r2 = r4
            goto L30
        L21:
            Ka.y r2 = r7.f2331a
            r5 = 8192(0x2000, double:4.0474E-320)
            long r2 = r2.i0(r0, r5)
            r5 = -1
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto L6
            goto L1f
        L30:
            return r2
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Ka.t.S(Ka.q):int");
    }

    @Override // Ka.y
    public final z b() {
        return this.f2331a.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f2333c) {
            return;
        }
        this.f2333c = true;
        this.f2331a.close();
        this.f2332b.d();
    }

    public final long d(byte b9, long j10, long j11) {
        if (!(!this.f2333c)) {
            throw new IllegalStateException("closed".toString());
        }
        long j12 = 0;
        if (0 > j11) {
            throw new IllegalArgumentException(androidx.camera.core.impl.j.a("fromIndex=0 toIndex=", j11).toString());
        }
        while (j12 < j11) {
            long C10 = this.f2332b.C(b9, j12, j11);
            if (C10 != -1) {
                return C10;
            }
            f fVar = this.f2332b;
            long j13 = fVar.f2294b;
            if (j13 >= j11 || this.f2331a.i0(fVar, 8192L) == -1) {
                return -1L;
            }
            j12 = Math.max(j12, j13);
        }
        return -1L;
    }

    @Override // Ka.i, Ka.h
    public final f getBuffer() {
        return this.f2332b;
    }

    @Override // Ka.i
    public final ByteString h(long j10) {
        h0(j10);
        return this.f2332b.h(j10);
    }

    @Override // Ka.i
    public final void h0(long j10) {
        if (!O(j10)) {
            throw new EOFException();
        }
    }

    public final boolean i(long j10, ByteString byteString) {
        int i;
        byte[] bArr = byteString.com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE java.lang.String;
        int length = bArr.length;
        if (!(!this.f2333c)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j10 >= 0 && length >= 0 && bArr.length >= length) {
            for (0; i < length; i + 1) {
                long j11 = i + j10;
                i = (O(1 + j11) && this.f2332b.A(j11) == byteString.com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE java.lang.String[i]) ? i + 1 : 0;
            }
            return true;
        }
        return false;
    }

    @Override // Ka.y
    public final long i0(f fVar, long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.j.a("byteCount < 0: ", j10).toString());
        }
        if (!(!this.f2333c)) {
            throw new IllegalStateException("closed".toString());
        }
        f fVar2 = this.f2332b;
        if (fVar2.f2294b == 0 && this.f2331a.i0(fVar2, 8192L) == -1) {
            return -1L;
        }
        return fVar2.i0(fVar, Math.min(j10, fVar2.f2294b));
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f2333c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if (r4 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        j3.e.e(16);
        j3.e.e(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        throw new java.lang.NumberFormatException("Expected a digit or '-' but was 0x".concat(java.lang.Integer.toString(r8, 16)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long j() {
        /*
            r11 = this;
            r0 = 1
            r11.h0(r0)
            r2 = 0
            r4 = r2
        L8:
            long r6 = r4 + r0
            boolean r8 = r11.O(r6)
            Ka.f r9 = r11.f2332b
            if (r8 == 0) goto L44
            byte r8 = r9.A(r4)
            r10 = 48
            if (r8 < r10) goto L1e
            r10 = 57
            if (r8 <= r10) goto L27
        L1e:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L29
            r5 = 45
            if (r8 == r5) goto L27
            goto L29
        L27:
            r4 = r6
            goto L8
        L29:
            if (r4 == 0) goto L2c
            goto L44
        L2c:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 16
            j3.e.e(r1)
            j3.e.e(r1)
            java.lang.String r1 = java.lang.Integer.toString(r8, r1)
            java.lang.String r2 = "Expected a digit or '-' but was 0x"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L44:
            long r0 = r9.G()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Ka.t.j():long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        j3.e.e(16);
        j3.e.e(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(java.lang.Integer.toString(r2, 16)));
     */
    @Override // Ka.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long l0() {
        /*
            r6 = this;
            r0 = 1
            r6.h0(r0)
            r0 = 0
        L6:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r6.O(r2)
            Ka.f r3 = r6.f2332b
            if (r2 == 0) goto L4c
            long r4 = (long) r0
            byte r2 = r3.A(r4)
            r4 = 48
            if (r2 < r4) goto L1e
            r4 = 57
            if (r2 <= r4) goto L2f
        L1e:
            r4 = 97
            if (r2 < r4) goto L26
            r4 = 102(0x66, float:1.43E-43)
            if (r2 <= r4) goto L2f
        L26:
            r4 = 65
            if (r2 < r4) goto L31
            r4 = 70
            if (r2 <= r4) goto L2f
            goto L31
        L2f:
            r0 = r1
            goto L6
        L31:
            if (r0 == 0) goto L34
            goto L4c
        L34:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 16
            j3.e.e(r1)
            j3.e.e(r1)
            java.lang.String r1 = java.lang.Integer.toString(r2, r1)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L4c:
            long r0 = r3.l0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Ka.t.l0():long");
    }

    @Override // Ka.i
    public final InputStream m0() {
        return new a();
    }

    @Override // Ka.i
    public final long n(f fVar) {
        f fVar2;
        long j10 = 0;
        while (true) {
            y yVar = this.f2331a;
            fVar2 = this.f2332b;
            if (yVar.i0(fVar2, 8192L) == -1) {
                break;
            }
            long j11 = fVar2.j();
            if (j11 > 0) {
                j10 += j11;
                fVar.z(fVar2, j11);
            }
        }
        long j12 = fVar2.f2294b;
        if (j12 <= 0) {
            return j10;
        }
        long j13 = j10 + j12;
        fVar.z(fVar2, j12);
        return j13;
    }

    public final int p() {
        h0(4L);
        int readInt = this.f2332b.readInt();
        f.a aVar = Ka.a.f2278a;
        return ((readInt & 255) << 24) | (((-16777216) & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    @Override // Ka.i
    public final t peek() {
        return new t(new r(this));
    }

    @Override // Ka.i
    public final byte[] q() {
        y yVar = this.f2331a;
        f fVar = this.f2332b;
        fVar.c0(yVar);
        return fVar.E(fVar.f2294b);
    }

    @Override // Ka.i
    public final boolean r() {
        if (!(!this.f2333c)) {
            throw new IllegalStateException("closed".toString());
        }
        f fVar = this.f2332b;
        return fVar.r() && this.f2331a.i0(fVar, 8192L) == -1;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        f fVar = this.f2332b;
        if (fVar.f2294b == 0 && this.f2331a.i0(fVar, 8192L) == -1) {
            return -1;
        }
        return fVar.read(byteBuffer);
    }

    @Override // Ka.i
    public final byte readByte() {
        h0(1L);
        return this.f2332b.readByte();
    }

    @Override // Ka.i
    public final void readFully(byte[] bArr) {
        f fVar = this.f2332b;
        try {
            h0(bArr.length);
            fVar.readFully(bArr);
        } catch (EOFException e10) {
            int i = 0;
            while (true) {
                long j10 = fVar.f2294b;
                if (j10 <= 0) {
                    throw e10;
                }
                int read = fVar.read(bArr, i, (int) j10);
                if (read == -1) {
                    throw new AssertionError();
                }
                i += read;
            }
        }
    }

    @Override // Ka.i
    public final int readInt() {
        h0(4L);
        return this.f2332b.readInt();
    }

    @Override // Ka.i
    public final long readLong() {
        h0(8L);
        return this.f2332b.readLong();
    }

    @Override // Ka.i
    public final short readShort() {
        h0(2L);
        return this.f2332b.readShort();
    }

    @Override // Ka.i
    public final void skip(long j10) {
        if (!(!this.f2333c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j10 > 0) {
            f fVar = this.f2332b;
            if (fVar.f2294b == 0 && this.f2331a.i0(fVar, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j10, fVar.f2294b);
            fVar.skip(min);
            j10 -= min;
        }
    }

    public final String toString() {
        return "buffer(" + this.f2331a + ')';
    }

    @Override // Ka.i
    public final String x(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.j.a("limit < 0: ", j10).toString());
        }
        long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
        long d10 = d((byte) 10, 0L, j11);
        f fVar = this.f2332b;
        if (d10 != -1) {
            return La.a.a(fVar, d10);
        }
        if (j11 < Long.MAX_VALUE && O(j11) && fVar.A(j11 - 1) == 13 && O(1 + j11) && fVar.A(j11) == 10) {
            return La.a.a(fVar, j11);
        }
        f fVar2 = new f();
        fVar.p(fVar2, 0L, Math.min(32, fVar.f2294b));
        throw new EOFException("\\n not found: limit=" + Math.min(fVar.f2294b, j10) + " content=" + fVar2.h(fVar2.f2294b).e() + (char) 8230);
    }

    public final String y() {
        y yVar = this.f2331a;
        f fVar = this.f2332b;
        fVar.c0(yVar);
        return fVar.M();
    }

    /* compiled from: RealBufferedSource.kt */
    public static final class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public final int available() {
            t tVar = t.this;
            if (tVar.f2333c) {
                throw new IOException("closed");
            }
            return (int) Math.min(tVar.f2332b.f2294b, Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            t.this.close();
        }

        @Override // java.io.InputStream
        public final int read() {
            t tVar = t.this;
            if (tVar.f2333c) {
                throw new IOException("closed");
            }
            f fVar = tVar.f2332b;
            if (fVar.f2294b == 0 && tVar.f2331a.i0(fVar, 8192L) == -1) {
                return -1;
            }
            return tVar.f2332b.readByte() & 255;
        }

        public final String toString() {
            return t.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i9) {
            t tVar = t.this;
            if (!tVar.f2333c) {
                Ka.a.a(bArr.length, i, i9);
                f fVar = tVar.f2332b;
                if (fVar.f2294b == 0 && tVar.f2331a.i0(fVar, 8192L) == -1) {
                    return -1;
                }
                return tVar.f2332b.read(bArr, i, i9);
            }
            throw new IOException("closed");
        }
    }
}

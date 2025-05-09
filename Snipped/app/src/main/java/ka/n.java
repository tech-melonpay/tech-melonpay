package Ka;

import Ka.f;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* compiled from: GzipSource.kt */
/* loaded from: classes2.dex */
public final class n implements y {

    /* renamed from: a, reason: collision with root package name */
    public byte f2310a;

    /* renamed from: b, reason: collision with root package name */
    public final t f2311b;

    /* renamed from: c, reason: collision with root package name */
    public final Inflater f2312c;

    /* renamed from: d, reason: collision with root package name */
    public final o f2313d;

    /* renamed from: e, reason: collision with root package name */
    public final CRC32 f2314e;

    public n(y yVar) {
        t tVar = new t(yVar);
        this.f2311b = tVar;
        Inflater inflater = new Inflater(true);
        this.f2312c = inflater;
        this.f2313d = new o(tVar, inflater);
        this.f2314e = new CRC32();
    }

    public static void d(int i, int i9, String str) {
        if (i9 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i9), Integer.valueOf(i)}, 3)));
        }
    }

    @Override // Ka.y
    public final z b() {
        return this.f2311b.f2331a.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2313d.close();
    }

    public final void i(f fVar, long j10, long j11) {
        u uVar = fVar.f2293a;
        while (true) {
            int i = uVar.f2337c;
            int i9 = uVar.f2336b;
            if (j10 < i - i9) {
                break;
            }
            j10 -= i - i9;
            uVar = uVar.f2340f;
        }
        while (j11 > 0) {
            int min = (int) Math.min(uVar.f2337c - r6, j11);
            this.f2314e.update(uVar.f2335a, (int) (uVar.f2336b + j10), min);
            j11 -= min;
            uVar = uVar.f2340f;
            j10 = 0;
        }
    }

    @Override // Ka.y
    public final long i0(f fVar, long j10) {
        t tVar;
        byte b9;
        t tVar2;
        f fVar2;
        long j11;
        if (j10 < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.j.a("byteCount < 0: ", j10).toString());
        }
        if (j10 == 0) {
            return 0L;
        }
        byte b10 = this.f2310a;
        CRC32 crc32 = this.f2314e;
        t tVar3 = this.f2311b;
        if (b10 == 0) {
            tVar3.h0(10L);
            f fVar3 = tVar3.f2332b;
            byte A10 = fVar3.A(3L);
            boolean z10 = ((A10 >> 1) & 1) == 1;
            if (z10) {
                tVar2 = tVar3;
                fVar2 = fVar3;
                i(tVar3.f2332b, 0L, 10L);
            } else {
                tVar2 = tVar3;
                fVar2 = fVar3;
            }
            d(8075, tVar2.readShort(), "ID1ID2");
            t tVar4 = tVar2;
            tVar4.skip(8L);
            if (((A10 >> 2) & 1) == 1) {
                tVar4.h0(2L);
                if (z10) {
                    tVar = tVar4;
                    i(tVar4.f2332b, 0L, 2L);
                } else {
                    tVar = tVar4;
                }
                short readShort = fVar2.readShort();
                f.a aVar = a.f2278a;
                long j12 = ((short) (((readShort & 255) << 8) | ((readShort & 65280) >>> 8))) & 65535;
                tVar.h0(j12);
                if (z10) {
                    i(tVar.f2332b, 0L, j12);
                    j11 = j12;
                } else {
                    j11 = j12;
                }
                tVar.skip(j11);
            } else {
                tVar = tVar4;
            }
            if (((A10 >> 3) & 1) == 1) {
                long d10 = tVar.d((byte) 0, 0L, Long.MAX_VALUE);
                if (d10 == -1) {
                    throw new EOFException();
                }
                if (z10) {
                    i(tVar.f2332b, 0L, d10 + 1);
                }
                tVar.skip(d10 + 1);
            }
            if (((A10 >> 4) & 1) == 1) {
                long d11 = tVar.d((byte) 0, 0L, Long.MAX_VALUE);
                if (d11 == -1) {
                    throw new EOFException();
                }
                if (z10) {
                    i(tVar.f2332b, 0L, d11 + 1);
                }
                tVar.skip(d11 + 1);
            }
            if (z10) {
                tVar.h0(2L);
                short readShort2 = fVar2.readShort();
                f.a aVar2 = a.f2278a;
                d((short) (((readShort2 & 255) << 8) | ((readShort2 & 65280) >>> 8)), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            this.f2310a = (byte) 1;
        } else {
            tVar = tVar3;
        }
        if (this.f2310a == 1) {
            long j13 = fVar.f2294b;
            long i02 = this.f2313d.i0(fVar, j10);
            if (i02 != -1) {
                i(fVar, j13, i02);
                return i02;
            }
            b9 = 2;
            this.f2310a = (byte) 2;
        } else {
            b9 = 2;
        }
        if (this.f2310a == b9) {
            d(tVar.p(), (int) crc32.getValue(), "CRC");
            d(tVar.p(), (int) this.f2312c.getBytesWritten(), "ISIZE");
            this.f2310a = (byte) 3;
            if (!tVar.r()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }
}

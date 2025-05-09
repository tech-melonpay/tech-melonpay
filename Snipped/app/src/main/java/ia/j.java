package Ia;

import Ka.f;
import Ka.u;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import okio.ByteString;

/* compiled from: WebSocketWriter.kt */
/* loaded from: classes2.dex */
public final class j implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2011a;

    /* renamed from: b, reason: collision with root package name */
    public final Ka.h f2012b;

    /* renamed from: c, reason: collision with root package name */
    public final Random f2013c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2014d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2015e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2016f;

    /* renamed from: g, reason: collision with root package name */
    public final Ka.f f2017g = new Ka.f();

    /* renamed from: h, reason: collision with root package name */
    public final Ka.f f2018h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public a f2019j;

    /* renamed from: k, reason: collision with root package name */
    public final byte[] f2020k;

    /* renamed from: l, reason: collision with root package name */
    public final f.a f2021l;

    public j(boolean z10, Ka.h hVar, Random random, boolean z11, boolean z12, long j10) {
        this.f2011a = z10;
        this.f2012b = hVar;
        this.f2013c = random;
        this.f2014d = z11;
        this.f2015e = z12;
        this.f2016f = j10;
        this.f2018h = hVar.getBuffer();
        this.f2020k = z10 ? new byte[4] : null;
        this.f2021l = z10 ? new f.a() : null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a aVar = this.f2019j;
        if (aVar != null) {
            aVar.close();
        }
    }

    public final void d(int i, ByteString byteString) {
        if (this.i) {
            throw new IOException("closed");
        }
        int d10 = byteString.d();
        if (d10 > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        Ka.f fVar = this.f2018h;
        fVar.W(i | 128);
        if (this.f2011a) {
            fVar.W(d10 | 128);
            Random random = this.f2013c;
            byte[] bArr = this.f2020k;
            random.nextBytes(bArr);
            fVar.V(bArr, 0, bArr.length);
            if (d10 > 0) {
                long j10 = fVar.f2294b;
                byteString.l(fVar, byteString.d());
                f.a aVar = this.f2021l;
                fVar.D(aVar);
                aVar.i(j10);
                h.a(aVar, bArr);
                aVar.close();
            }
        } else {
            fVar.W(d10);
            byteString.l(fVar, byteString.d());
        }
        this.f2012b.flush();
    }

    public final void i(int i, ByteString byteString) {
        if (this.i) {
            throw new IOException("closed");
        }
        Ka.f fVar = this.f2017g;
        fVar.T(byteString);
        int i9 = i | 128;
        if (this.f2014d && byteString.d() >= this.f2016f) {
            a aVar = this.f2019j;
            if (aVar == null) {
                aVar = new a(this.f2015e);
                this.f2019j = aVar;
            }
            Ka.f fVar2 = aVar.f1946b;
            if (fVar2.f2294b != 0) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (aVar.f1945a) {
                aVar.f1947c.reset();
            }
            long j10 = fVar.f2294b;
            Ka.j jVar = aVar.f1948d;
            jVar.z(fVar, j10);
            jVar.flush();
            ByteString byteString2 = b.f1949a;
            long j11 = fVar2.f2294b;
            byte[] bArr = byteString2.com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE java.lang.String;
            long length = j11 - bArr.length;
            int length2 = bArr.length;
            if (length >= 0 && length2 >= 0 && j11 - length >= length2 && bArr.length >= length2) {
                for (int i10 = 0; i10 < length2; i10++) {
                    if (fVar2.A(i10 + length) == byteString2.com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE java.lang.String[i10]) {
                    }
                }
                long j12 = fVar2.f2294b - 4;
                f.a D2 = fVar2.D(Ka.a.f2278a);
                try {
                    D2.d(j12);
                    U4.b.d(D2, null);
                    fVar.z(fVar2, fVar2.f2294b);
                    i9 = i | 192;
                } finally {
                }
            }
            fVar2.W(0);
            fVar.z(fVar2, fVar2.f2294b);
            i9 = i | 192;
        }
        long j13 = fVar.f2294b;
        Ka.f fVar3 = this.f2018h;
        fVar3.W(i9);
        boolean z10 = this.f2011a;
        int i11 = z10 ? 128 : 0;
        if (j13 <= 125) {
            fVar3.W(i11 | ((int) j13));
        } else if (j13 <= 65535) {
            fVar3.W(i11 | 126);
            fVar3.g0((int) j13);
        } else {
            fVar3.W(i11 | 127);
            u Q4 = fVar3.Q(8);
            int i12 = Q4.f2337c;
            byte[] bArr2 = Q4.f2335a;
            bArr2[i12] = (byte) ((j13 >>> 56) & 255);
            bArr2[i12 + 1] = (byte) ((j13 >>> 48) & 255);
            bArr2[i12 + 2] = (byte) ((j13 >>> 40) & 255);
            bArr2[i12 + 3] = (byte) ((j13 >>> 32) & 255);
            bArr2[i12 + 4] = (byte) ((j13 >>> 24) & 255);
            bArr2[i12 + 5] = (byte) ((j13 >>> 16) & 255);
            bArr2[i12 + 6] = (byte) ((j13 >>> 8) & 255);
            bArr2[i12 + 7] = (byte) (j13 & 255);
            Q4.f2337c = i12 + 8;
            fVar3.f2294b += 8;
        }
        if (z10) {
            Random random = this.f2013c;
            byte[] bArr3 = this.f2020k;
            random.nextBytes(bArr3);
            fVar3.V(bArr3, 0, bArr3.length);
            if (j13 > 0) {
                f.a aVar2 = this.f2021l;
                fVar.D(aVar2);
                aVar2.i(0L);
                h.a(aVar2, bArr3);
                aVar2.close();
            }
        }
        fVar3.z(fVar, j13);
        this.f2012b.k();
    }
}

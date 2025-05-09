package Ia;

import Ka.f;

/* compiled from: WebSocketProtocol.kt */
/* loaded from: classes2.dex */
public final class h {
    public static void a(f.a aVar, byte[] bArr) {
        long j10;
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = aVar.f2299e;
            int i9 = aVar.f2300f;
            int i10 = aVar.f2301g;
            if (bArr2 != null) {
                while (i9 < i10) {
                    int i11 = i % length;
                    bArr2[i9] = (byte) (bArr2[i9] ^ bArr[i11]);
                    i9++;
                    i = i11 + 1;
                }
            }
            j10 = aVar.f2298d;
            if (j10 == aVar.f2295a.f2294b) {
                throw new IllegalStateException("no more bytes".toString());
            }
        } while (aVar.i(j10 == -1 ? 0L : j10 + (aVar.f2301g - aVar.f2300f)) != -1);
    }
}

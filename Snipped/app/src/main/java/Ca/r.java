package Ca;

import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* compiled from: Settings.kt */
/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public int f852a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f853b = new int[10];

    public final int a() {
        return (this.f852a & 128) != 0 ? this.f853b[7] : Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
    }

    public final void b(int i, int i9) {
        if (i >= 0) {
            int[] iArr = this.f853b;
            if (i >= iArr.length) {
                return;
            }
            this.f852a = (1 << i) | this.f852a;
            iArr[i] = i9;
        }
    }
}

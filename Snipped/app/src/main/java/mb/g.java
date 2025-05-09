package mb;

/* compiled from: QRMath.kt */
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f24051a = new int[256];

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f24052b = new int[256];

    static {
        int i;
        int i9 = 0;
        while (true) {
            if (i9 >= 8) {
                break;
            }
            f24051a[i9] = 1 << i9;
            i9++;
        }
        for (i = 8; i < 256; i++) {
            int[] iArr = f24051a;
            iArr[i] = ((iArr[i - 4] ^ iArr[i - 5]) ^ iArr[i - 6]) ^ iArr[i - 8];
        }
        for (int i10 = 0; i10 < 255; i10++) {
            f24052b[f24051a[i10]] = i10;
        }
    }

    public static int a(int i) {
        while (i < 0) {
            i += 255;
        }
        while (i >= 256) {
            i -= 255;
        }
        return f24051a[i];
    }
}

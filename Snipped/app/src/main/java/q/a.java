package Q;

/* compiled from: ContainerHelpers.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f3175a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f3176b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f3177c = new Object[0];

    public static final int a(int i, int i9, int[] iArr) {
        int i10 = i - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            int i13 = iArr[i12];
            if (i13 < i9) {
                i11 = i12 + 1;
            } else {
                if (i13 <= i9) {
                    return i12;
                }
                i10 = i12 - 1;
            }
        }
        return ~i11;
    }

    public static final int b(long j10, long[] jArr, int i) {
        int i9 = i - 1;
        int i10 = 0;
        while (i10 <= i9) {
            int i11 = (i10 + i9) >>> 1;
            long j11 = jArr[i11];
            if (j11 < j10) {
                i10 = i11 + 1;
            } else {
                if (j11 <= j10) {
                    return i11;
                }
                i9 = i11 - 1;
            }
        }
        return ~i10;
    }

    public static final void c(String str) {
        throw new IllegalArgumentException(str);
    }
}

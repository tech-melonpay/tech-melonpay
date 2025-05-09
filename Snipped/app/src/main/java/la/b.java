package La;

import okio.SegmentedByteString;

/* compiled from: ByteString.kt */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f2501a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    public static final int b(SegmentedByteString segmentedByteString, int i) {
        int i9;
        int i10 = i + 1;
        int length = segmentedByteString.f24700e.length - 1;
        int i11 = 0;
        while (true) {
            if (i11 <= length) {
                i9 = (i11 + length) >>> 1;
                int i12 = segmentedByteString.f24701f[i9];
                if (i12 >= i10) {
                    if (i12 <= i10) {
                        break;
                    }
                    length = i9 - 1;
                } else {
                    i11 = i9 + 1;
                }
            } else {
                i9 = (-i11) - 1;
                break;
            }
        }
        return i9 >= 0 ? i9 : ~i9;
    }
}

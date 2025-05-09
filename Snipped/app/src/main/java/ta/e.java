package ta;

/* compiled from: AbstractJsonLexer.kt */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f29982a = new char[117];

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f29983b = new byte[126];

    static {
        int i = 0;
        for (int i9 = 0; i9 < 32; i9++) {
            a(i9, 'u');
        }
        a(8, 'b');
        a(9, 't');
        a(10, 'n');
        a(12, 'f');
        a(13, 'r');
        a(47, '/');
        a(34, '\"');
        a(92, '\\');
        while (true) {
            byte[] bArr = f29983b;
            if (i >= 33) {
                bArr[9] = 3;
                bArr[10] = 3;
                bArr[13] = 3;
                bArr[32] = 3;
                bArr[44] = 4;
                bArr[58] = 5;
                bArr[123] = 6;
                bArr[125] = 7;
                bArr[91] = 8;
                bArr[93] = 9;
                bArr[34] = 1;
                bArr[92] = 2;
                return;
            }
            bArr[i] = Byte.MAX_VALUE;
            i++;
        }
    }

    public static void a(int i, char c2) {
        if (c2 != 'u') {
            f29982a[c2] = (char) i;
        }
    }
}

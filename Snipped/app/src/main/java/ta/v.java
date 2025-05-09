package ta;

import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;

/* compiled from: StringOps.kt */
/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f30030a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f30031b;

    static {
        String[] strArr = new String[93];
        for (int i = 0; i < 32; i++) {
            strArr[i] = "\\u" + b(i >> 12) + b(i >> 8) + b(i >> 4) + b(i);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f30030a = strArr;
        byte[] bArr = new byte[93];
        for (int i9 = 0; i9 < 32; i9++) {
            bArr[i9] = 1;
        }
        bArr[34] = ISO7816.INS_MSE;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = ISOFileInfo.FCP_BYTE;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f30031b = bArr;
    }

    public static final void a(StringBuilder sb2, String str) {
        sb2.append('\"');
        int length = str.length();
        int i = 0;
        for (int i9 = 0; i9 < length; i9++) {
            char charAt = str.charAt(i9);
            String[] strArr = f30030a;
            if (charAt < strArr.length && strArr[charAt] != null) {
                sb2.append((CharSequence) str, i, i9);
                sb2.append(strArr[charAt]);
                i = i9 + 1;
            }
        }
        if (i != 0) {
            sb2.append((CharSequence) str, i, str.length());
        } else {
            sb2.append(str);
        }
        sb2.append('\"');
    }

    public static final char b(int i) {
        int i9 = i & 15;
        return (char) (i9 < 10 ? i9 + 48 : i9 + 87);
    }
}

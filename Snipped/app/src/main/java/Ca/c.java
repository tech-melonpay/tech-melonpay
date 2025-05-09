package Ca;

import ka.C0956a;
import ka.C0967l;
import okio.ByteString;

/* compiled from: Http2.kt */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f723a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final ByteString f724b;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f725c;

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f726d;

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f727e;

    static {
        ByteString byteString = new ByteString("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n".getBytes(C0956a.f23054b));
        byteString.f24699c = "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n";
        f724b = byteString;
        f725c = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f726d = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            strArr[i] = wa.b.h("%8s", Integer.toBinaryString(i)).replace(' ', '0');
        }
        f727e = strArr;
        String[] strArr2 = f726d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i9 = iArr[0];
        strArr2[i9 | 8] = androidx.camera.core.impl.utils.a.n(new StringBuilder(), strArr2[i9], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = iArr2[i10];
            int i12 = iArr[0];
            String[] strArr3 = f726d;
            int i13 = i12 | i11;
            strArr3[i13] = strArr3[i12] + '|' + strArr3[i11];
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strArr3[i12]);
            sb2.append('|');
            strArr3[i13 | 8] = androidx.camera.core.impl.utils.a.n(sb2, strArr3[i11], "|PADDED");
        }
        int length = f726d.length;
        for (int i14 = 0; i14 < length; i14++) {
            String[] strArr4 = f726d;
            if (strArr4[i14] == null) {
                strArr4[i14] = f727e[i14];
            }
        }
    }

    public static String a(int i, int i9, int i10, int i11, boolean z10) {
        String str;
        String[] strArr = f725c;
        String h9 = i10 < strArr.length ? strArr[i10] : wa.b.h("0x%02x", Integer.valueOf(i10));
        if (i11 == 0) {
            str = "";
        } else {
            String[] strArr2 = f727e;
            if (i10 != 2 && i10 != 3) {
                if (i10 == 4 || i10 == 6) {
                    str = i11 == 1 ? "ACK" : strArr2[i11];
                } else if (i10 != 7 && i10 != 8) {
                    String[] strArr3 = f726d;
                    String str2 = i11 < strArr3.length ? strArr3[i11] : strArr2[i11];
                    str = (i10 != 5 || (i11 & 4) == 0) ? (i10 != 0 || (i11 & 32) == 0) ? str2 : C0967l.X(str2, "PRIORITY", "COMPRESSED", false) : C0967l.X(str2, "HEADERS", "PUSH_PROMISE", false);
                }
            }
            str = strArr2[i11];
        }
        return wa.b.h("%s 0x%08x %5d %-13s %s", z10 ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i9), h9, str);
    }
}

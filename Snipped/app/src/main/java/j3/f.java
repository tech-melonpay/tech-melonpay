package j3;

import com.bumptech.glide.load.Key;
import java.nio.charset.Charset;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.jmrtd.lds.CVCAFile;

/* compiled from: Base64.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f22480a = Charset.forName(Key.STRING_CHARSET_NAME);

    /* compiled from: Base64.java */
    public static abstract class a {
    }

    /* compiled from: Base64.java */
    public static class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final int[] f22481a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    }

    /* compiled from: Base64.java */
    public static class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final byte[] f22482a = {65, CVCAFile.CAR_TAG, 67, ISO7816.INS_REHABILITATE_CHV, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, ISOFileInfo.FCP_BYTE, 99, ISOFileInfo.FMD_BYTE, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, ISOFileInfo.FCI_BYTE, ISO7816.INS_MANAGE_CHANNEL, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, ISO7816.INS_DECREASE, 49, ISO7816.INS_INCREASE, 51, ISO7816.INS_DECREASE_STAMPED, 53, 54, 55, 56, 57, 43, 47};
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00e2, code lost:
    
        if (r7 != 4) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] a(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.f.a(java.lang.String):byte[]");
    }

    public static byte[] b(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = c.f22482a;
        int i = (length / 3) * 4;
        if (length % 3 > 0) {
            i += 4;
        }
        byte[] bArr3 = new byte[i];
        int i9 = 0;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            int i12 = i9 + 3;
            if (i12 > length) {
                break;
            }
            int i13 = (bArr[i9 + 2] & 255) | ((bArr[i9] & 255) << 16) | ((bArr[i9 + 1] & 255) << 8);
            bArr3[i11] = bArr2[(i13 >> 18) & 63];
            bArr3[i11 + 1] = bArr2[(i13 >> 12) & 63];
            bArr3[i11 + 2] = bArr2[(i13 >> 6) & 63];
            bArr3[i11 + 3] = bArr2[i13 & 63];
            int i14 = i11 + 4;
            i10--;
            if (i10 == 0) {
                i11 += 5;
                bArr3[i14] = 10;
                i10 = 19;
            } else {
                i11 = i14;
            }
            i9 = i12;
        }
        if (i9 == length - 1) {
            int i15 = (bArr[i9] & 255) << 4;
            bArr3[i11] = bArr2[(i15 >> 6) & 63];
            bArr3[i11 + 1] = bArr2[i15 & 63];
            bArr3[i11 + 2] = 61;
            bArr3[i11 + 3] = 61;
        } else if (i9 == length - 2) {
            int i16 = ((bArr[i9 + 1] & 255) << 2) | ((bArr[i9] & 255) << 10);
            bArr3[i11] = bArr2[(i16 >> 12) & 63];
            bArr3[i11 + 1] = bArr2[(i16 >> 6) & 63];
            bArr3[i11 + 2] = bArr2[i16 & 63];
            bArr3[i11 + 3] = 61;
        }
        return bArr3;
    }
}

package K9;

import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.jmrtd.lds.CVCAFile;

/* compiled from: Base64.java */
/* loaded from: classes2.dex */
public final class a {

    /* compiled from: Base64.java */
    /* renamed from: K9.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0030a {
    }

    /* compiled from: Base64.java */
    public static class b extends AbstractC0030a {

        /* renamed from: a, reason: collision with root package name */
        public static final byte[] f2277a = {65, CVCAFile.CAR_TAG, 67, ISO7816.INS_REHABILITATE_CHV, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, ISOFileInfo.FCP_BYTE, 99, ISOFileInfo.FMD_BYTE, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, ISOFileInfo.FCI_BYTE, ISO7816.INS_MANAGE_CHANNEL, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, ISO7816.INS_DECREASE, 49, ISO7816.INS_INCREASE, 51, ISO7816.INS_DECREASE_STAMPED, 53, 54, 55, 56, 57, 43, 47};
    }

    public static byte[] a(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = b.f2277a;
        int i = (length / 3) * 4;
        int i9 = length % 3;
        if (i9 == 1) {
            i += 2;
        } else if (i9 == 2) {
            i += 3;
        }
        byte[] bArr3 = new byte[i];
        int i10 = 0;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int i13 = i10 + 3;
            if (i13 > length) {
                break;
            }
            int i14 = (bArr[i10 + 2] & 255) | ((bArr[i10] & 255) << 16) | ((bArr[i10 + 1] & 255) << 8);
            bArr3[i12] = bArr2[(i14 >> 18) & 63];
            bArr3[i12 + 1] = bArr2[(i14 >> 12) & 63];
            bArr3[i12 + 2] = bArr2[(i14 >> 6) & 63];
            bArr3[i12 + 3] = bArr2[i14 & 63];
            int i15 = i12 + 4;
            i11--;
            if (i11 == 0) {
                i12 += 5;
                bArr3[i15] = 10;
                i11 = 19;
            } else {
                i12 = i15;
            }
            i10 = i13;
        }
        if (i10 == length - 1) {
            int i16 = (bArr[i10] & 255) << 4;
            bArr3[i12] = bArr2[(i16 >> 6) & 63];
            bArr3[i12 + 1] = bArr2[i16 & 63];
        } else if (i10 == length - 2) {
            int i17 = ((bArr[i10 + 1] & 255) << 2) | ((bArr[i10] & 255) << 10);
            bArr3[i12] = bArr2[(i17 >> 12) & 63];
            bArr3[i12 + 1] = bArr2[(i17 >> 6) & 63];
            bArr3[i12 + 2] = bArr2[i17 & 63];
        }
        return bArr3;
    }
}

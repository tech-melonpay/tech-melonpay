package org.bouncycastle.util.encoders;

import java.io.IOException;
import java.io.OutputStream;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.jmrtd.PassportService;

/* loaded from: classes3.dex */
public class HexEncoder implements Encoder {
    protected final byte[] encodingTable = {ISO7816.INS_DECREASE, 49, ISO7816.INS_INCREASE, 51, ISO7816.INS_DECREASE_STAMPED, 53, 54, 55, 56, 57, 97, ISOFileInfo.FCP_BYTE, 99, ISOFileInfo.FMD_BYTE, 101, 102};
    protected final byte[] decodingTable = new byte[128];

    public HexEncoder() {
        initialiseDecodingTable();
    }

    private static boolean ignore(char c2) {
        return c2 == '\n' || c2 == '\r' || c2 == '\t' || c2 == ' ';
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(String str, OutputStream outputStream) {
        byte[] bArr = new byte[36];
        int length = str.length();
        while (length > 0 && ignore(str.charAt(length - 1))) {
            length--;
        }
        int i = 0;
        int i9 = 0;
        int i10 = 0;
        while (i < length) {
            while (i < length && ignore(str.charAt(i))) {
                i++;
            }
            int i11 = i + 1;
            byte b9 = this.decodingTable[str.charAt(i)];
            while (i11 < length && ignore(str.charAt(i11))) {
                i11++;
            }
            int i12 = i11 + 1;
            byte b10 = this.decodingTable[str.charAt(i11)];
            if ((b9 | b10) < 0) {
                throw new IOException("invalid characters encountered in Hex string");
            }
            int i13 = i9 + 1;
            bArr[i9] = (byte) ((b9 << 4) | b10);
            if (i13 == 36) {
                outputStream.write(bArr);
                i9 = 0;
            } else {
                i9 = i13;
            }
            i10++;
            i = i12;
        }
        if (i9 > 0) {
            outputStream.write(bArr, 0, i9);
        }
        return i10;
    }

    public byte[] decodeStrict(String str, int i, int i9) {
        if (str == null) {
            throw new NullPointerException("'str' cannot be null");
        }
        if (i < 0 || i9 < 0 || i > str.length() - i9) {
            throw new IndexOutOfBoundsException("invalid offset and/or length specified");
        }
        if ((i9 & 1) != 0) {
            throw new IOException("a hexadecimal encoding must have an even number of characters");
        }
        int i10 = i9 >>> 1;
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = i + 1;
            byte b9 = this.decodingTable[str.charAt(i)];
            i += 2;
            int i13 = (b9 << 4) | this.decodingTable[str.charAt(i12)];
            if (i13 < 0) {
                throw new IOException("invalid characters encountered in Hex string");
            }
            bArr[i11] = (byte) i13;
        }
        return bArr;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int encode(byte[] bArr, int i, int i9, OutputStream outputStream) {
        if (i9 < 0) {
            return 0;
        }
        byte[] bArr2 = new byte[72];
        int i10 = i9;
        while (i10 > 0) {
            int min = Math.min(36, i10);
            outputStream.write(bArr2, 0, encode(bArr, i, min, bArr2, 0));
            i += min;
            i10 -= min;
        }
        return i9 * 2;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int getEncodedLength(int i) {
        return i * 2;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int getMaxDecodedLength(int i) {
        return i / 2;
    }

    public void initialiseDecodingTable() {
        int i = 0;
        int i9 = 0;
        while (true) {
            byte[] bArr = this.decodingTable;
            if (i9 >= bArr.length) {
                break;
            }
            bArr[i9] = -1;
            i9++;
        }
        while (true) {
            byte[] bArr2 = this.encodingTable;
            if (i >= bArr2.length) {
                byte[] bArr3 = this.decodingTable;
                bArr3[65] = bArr3[97];
                bArr3[66] = bArr3[98];
                bArr3[67] = bArr3[99];
                bArr3[68] = bArr3[100];
                bArr3[69] = bArr3[101];
                bArr3[70] = bArr3[102];
                return;
            }
            this.decodingTable[bArr2[i]] = (byte) i;
            i++;
        }
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(byte[] bArr, int i, int i9, OutputStream outputStream) {
        byte[] bArr2 = new byte[36];
        int i10 = i9 + i;
        while (i10 > i && ignore((char) bArr[i10 - 1])) {
            i10--;
        }
        int i11 = 0;
        int i12 = 0;
        while (i < i10) {
            while (i < i10 && ignore((char) bArr[i])) {
                i++;
            }
            int i13 = i + 1;
            byte b9 = this.decodingTable[bArr[i]];
            while (i13 < i10 && ignore((char) bArr[i13])) {
                i13++;
            }
            int i14 = i13 + 1;
            byte b10 = this.decodingTable[bArr[i13]];
            if ((b9 | b10) < 0) {
                throw new IOException("invalid characters encountered in Hex data");
            }
            int i15 = i11 + 1;
            bArr2[i11] = (byte) ((b9 << 4) | b10);
            if (i15 == 36) {
                outputStream.write(bArr2);
                i11 = 0;
            } else {
                i11 = i15;
            }
            i12++;
            i = i14;
        }
        if (i11 > 0) {
            outputStream.write(bArr2, 0, i11);
        }
        return i12;
    }

    public int encode(byte[] bArr, int i, int i9, byte[] bArr2, int i10) {
        int i11 = i9 + i;
        int i12 = i10;
        while (i < i11) {
            int i13 = i + 1;
            byte b9 = bArr[i];
            int i14 = i12 + 1;
            byte[] bArr3 = this.encodingTable;
            bArr2[i12] = bArr3[(b9 & 255) >>> 4];
            i12 += 2;
            bArr2[i14] = bArr3[b9 & PassportService.SFI_DG15];
            i = i13;
        }
        return i12 - i10;
    }
}

package org.bouncycastle.util.encoders;

import java.io.IOException;
import java.io.OutputStream;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.jmrtd.lds.CVCAFile;

/* loaded from: classes3.dex */
public class Base64Encoder implements Encoder {
    protected final byte[] encodingTable = {65, CVCAFile.CAR_TAG, 67, ISO7816.INS_REHABILITATE_CHV, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, ISOFileInfo.FCP_BYTE, 99, ISOFileInfo.FMD_BYTE, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, ISOFileInfo.FCI_BYTE, ISO7816.INS_MANAGE_CHANNEL, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, ISO7816.INS_DECREASE, 49, ISO7816.INS_INCREASE, 51, ISO7816.INS_DECREASE_STAMPED, 53, 54, 55, 56, 57, 43, 47};
    protected byte padding = 61;
    protected final byte[] decodingTable = new byte[128];

    public Base64Encoder() {
        initialiseDecodingTable();
    }

    private int decodeLastBlock(OutputStream outputStream, char c2, char c10, char c11, char c12) {
        char c13 = this.padding;
        if (c11 == c13) {
            if (c12 != c13) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            byte[] bArr = this.decodingTable;
            byte b9 = bArr[c2];
            byte b10 = bArr[c10];
            if ((b9 | b10) < 0) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            outputStream.write((b9 << 2) | (b10 >> 4));
            return 1;
        }
        if (c12 == c13) {
            byte[] bArr2 = this.decodingTable;
            byte b11 = bArr2[c2];
            byte b12 = bArr2[c10];
            byte b13 = bArr2[c11];
            if ((b11 | b12 | b13) < 0) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            outputStream.write((b11 << 2) | (b12 >> 4));
            outputStream.write((b12 << 4) | (b13 >> 2));
            return 2;
        }
        byte[] bArr3 = this.decodingTable;
        byte b14 = bArr3[c2];
        byte b15 = bArr3[c10];
        byte b16 = bArr3[c11];
        byte b17 = bArr3[c12];
        if ((b14 | b15 | b16 | b17) < 0) {
            throw new IOException("invalid characters encountered at end of base64 data");
        }
        outputStream.write((b14 << 2) | (b15 >> 4));
        outputStream.write((b15 << 4) | (b16 >> 2));
        outputStream.write((b16 << 6) | b17);
        return 3;
    }

    private boolean ignore(char c2) {
        return c2 == '\n' || c2 == '\r' || c2 == '\t' || c2 == ' ';
    }

    private int nextI(String str, int i, int i9) {
        while (i < i9 && ignore(str.charAt(i))) {
            i++;
        }
        return i;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(String str, OutputStream outputStream) {
        byte[] bArr = new byte[54];
        int length = str.length();
        while (length > 0 && ignore(str.charAt(length - 1))) {
            length--;
        }
        if (length == 0) {
            return 0;
        }
        int i = length;
        int i9 = 0;
        while (i > 0 && i9 != 4) {
            if (!ignore(str.charAt(i - 1))) {
                i9++;
            }
            i--;
        }
        int nextI = nextI(str, 0, i);
        int i10 = 0;
        int i11 = 0;
        while (nextI < i) {
            int i12 = nextI + 1;
            byte b9 = this.decodingTable[str.charAt(nextI)];
            int nextI2 = nextI(str, i12, i);
            int i13 = nextI2 + 1;
            byte b10 = this.decodingTable[str.charAt(nextI2)];
            int nextI3 = nextI(str, i13, i);
            int i14 = nextI3 + 1;
            byte b11 = this.decodingTable[str.charAt(nextI3)];
            int nextI4 = nextI(str, i14, i);
            int i15 = nextI4 + 1;
            byte b12 = this.decodingTable[str.charAt(nextI4)];
            if ((b9 | b10 | b11 | b12) < 0) {
                throw new IOException("invalid characters encountered in base64 data");
            }
            bArr[i10] = (byte) ((b9 << 2) | (b10 >> 4));
            int i16 = i10 + 2;
            bArr[i10 + 1] = (byte) ((b10 << 4) | (b11 >> 2));
            i10 += 3;
            bArr[i16] = (byte) ((b11 << 6) | b12);
            i11 += 3;
            if (i10 == 54) {
                outputStream.write(bArr);
                i10 = 0;
            }
            nextI = nextI(str, i15, i);
        }
        if (i10 > 0) {
            outputStream.write(bArr, 0, i10);
        }
        int nextI5 = nextI(str, nextI, length);
        int nextI6 = nextI(str, nextI5 + 1, length);
        int nextI7 = nextI(str, nextI6 + 1, length);
        return i11 + decodeLastBlock(outputStream, str.charAt(nextI5), str.charAt(nextI6), str.charAt(nextI7), str.charAt(nextI(str, nextI7 + 1, length)));
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int encode(byte[] bArr, int i, int i9, OutputStream outputStream) {
        if (i9 < 0) {
            return 0;
        }
        byte[] bArr2 = new byte[72];
        int i10 = i9;
        while (i10 > 0) {
            int min = Math.min(54, i10);
            outputStream.write(bArr2, 0, encode(bArr, i, min, bArr2, 0));
            i += min;
            i10 -= min;
        }
        return ((i9 + 2) / 3) * 4;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int getEncodedLength(int i) {
        return ((i + 2) / 3) * 4;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int getMaxDecodedLength(int i) {
        return (i / 4) * 3;
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
                return;
            }
            this.decodingTable[bArr2[i]] = (byte) i;
            i++;
        }
    }

    private int nextI(byte[] bArr, int i, int i9) {
        while (i < i9 && ignore((char) bArr[i])) {
            i++;
        }
        return i;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(byte[] bArr, int i, int i9, OutputStream outputStream) {
        byte[] bArr2 = new byte[54];
        int i10 = i + i9;
        while (i10 > i && ignore((char) bArr[i10 - 1])) {
            i10--;
        }
        if (i10 == 0) {
            return 0;
        }
        int i11 = i10;
        int i12 = 0;
        while (i11 > i && i12 != 4) {
            if (!ignore((char) bArr[i11 - 1])) {
                i12++;
            }
            i11--;
        }
        int nextI = nextI(bArr, i, i11);
        int i13 = 0;
        int i14 = 0;
        while (nextI < i11) {
            int i15 = nextI + 1;
            byte b9 = this.decodingTable[bArr[nextI]];
            int nextI2 = nextI(bArr, i15, i11);
            int i16 = nextI2 + 1;
            byte b10 = this.decodingTable[bArr[nextI2]];
            int nextI3 = nextI(bArr, i16, i11);
            int i17 = nextI3 + 1;
            byte b11 = this.decodingTable[bArr[nextI3]];
            int nextI4 = nextI(bArr, i17, i11);
            int i18 = nextI4 + 1;
            byte b12 = this.decodingTable[bArr[nextI4]];
            if ((b9 | b10 | b11 | b12) < 0) {
                throw new IOException("invalid characters encountered in base64 data");
            }
            bArr2[i13] = (byte) ((b9 << 2) | (b10 >> 4));
            int i19 = i13 + 2;
            bArr2[i13 + 1] = (byte) ((b10 << 4) | (b11 >> 2));
            i13 += 3;
            bArr2[i19] = (byte) ((b11 << 6) | b12);
            if (i13 == 54) {
                outputStream.write(bArr2);
                i13 = 0;
            }
            i14 += 3;
            nextI = nextI(bArr, i18, i11);
        }
        if (i13 > 0) {
            outputStream.write(bArr2, 0, i13);
        }
        int nextI5 = nextI(bArr, nextI, i10);
        int nextI6 = nextI(bArr, nextI5 + 1, i10);
        int nextI7 = nextI(bArr, nextI6 + 1, i10);
        return i14 + decodeLastBlock(outputStream, (char) bArr[nextI5], (char) bArr[nextI6], (char) bArr[nextI7], (char) bArr[nextI(bArr, nextI7 + 1, i10)]);
    }

    public int encode(byte[] bArr, int i, int i9, byte[] bArr2, int i10) {
        int i11 = (i + i9) - 2;
        int i12 = i;
        int i13 = i10;
        while (i12 < i11) {
            byte b9 = bArr[i12];
            int i14 = i12 + 2;
            int i15 = bArr[i12 + 1] & 255;
            i12 += 3;
            byte b10 = bArr[i14];
            byte[] bArr3 = this.encodingTable;
            bArr2[i13] = bArr3[(b9 >>> 2) & 63];
            bArr2[i13 + 1] = bArr3[((b9 << 4) | (i15 >>> 4)) & 63];
            int i16 = i13 + 3;
            bArr2[i13 + 2] = bArr3[((i15 << 2) | ((b10 & 255) >>> 6)) & 63];
            i13 += 4;
            bArr2[i16] = bArr3[b10 & 63];
        }
        int i17 = i9 - (i12 - i);
        if (i17 == 1) {
            int i18 = bArr[i12] & 255;
            byte[] bArr4 = this.encodingTable;
            bArr2[i13] = bArr4[(i18 >>> 2) & 63];
            bArr2[i13 + 1] = bArr4[(i18 << 4) & 63];
            int i19 = i13 + 3;
            byte b11 = this.padding;
            bArr2[i13 + 2] = b11;
            i13 += 4;
            bArr2[i19] = b11;
        } else if (i17 == 2) {
            int i20 = i12 + 1;
            int i21 = bArr[i12] & 255;
            int i22 = bArr[i20] & 255;
            byte[] bArr5 = this.encodingTable;
            bArr2[i13] = bArr5[(i21 >>> 2) & 63];
            bArr2[i13 + 1] = bArr5[((i21 << 4) | (i22 >>> 4)) & 63];
            int i23 = i13 + 3;
            bArr2[i13 + 2] = bArr5[(i22 << 2) & 63];
            i13 += 4;
            bArr2[i23] = this.padding;
        }
        return i13 - i10;
    }
}

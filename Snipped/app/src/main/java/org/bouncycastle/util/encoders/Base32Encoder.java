package org.bouncycastle.util.encoders;

import java.io.IOException;
import java.io.OutputStream;
import net.sf.scuba.smartcards.ISO7816;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;
import org.jmrtd.lds.CVCAFile;

/* loaded from: classes3.dex */
public class Base32Encoder implements Encoder {
    private static final byte[] DEAULT_ENCODING_TABLE = {65, CVCAFile.CAR_TAG, 67, ISO7816.INS_REHABILITATE_CHV, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, ISO7816.INS_INCREASE, 51, ISO7816.INS_DECREASE_STAMPED, 53, 54, 55};
    private static final byte DEFAULT_PADDING = 61;
    private final byte[] decodingTable;
    private final byte[] encodingTable;
    private final byte padding;

    public Base32Encoder() {
        this.decodingTable = new byte[128];
        this.encodingTable = DEAULT_ENCODING_TABLE;
        this.padding = DEFAULT_PADDING;
        initialiseDecodingTable();
    }

    private int decodeLastBlock(OutputStream outputStream, char c2, char c10, char c11, char c12, char c13, char c14, char c15, char c16) {
        char c17 = this.padding;
        if (c16 != c17) {
            byte[] bArr = this.decodingTable;
            byte b9 = bArr[c2];
            byte b10 = bArr[c10];
            byte b11 = bArr[c11];
            byte b12 = bArr[c12];
            byte b13 = bArr[c13];
            byte b14 = bArr[c14];
            byte b15 = bArr[c15];
            byte b16 = bArr[c16];
            if ((b9 | b10 | b11 | b12 | b13 | b14 | b15 | b16) < 0) {
                throw new IOException("invalid characters encountered at end of base32 data");
            }
            outputStream.write((b9 << 3) | (b10 >> 2));
            outputStream.write((b10 << 6) | (b11 << 1) | (b12 >> 4));
            outputStream.write((b12 << 4) | (b13 >> 1));
            outputStream.write((b13 << 7) | (b14 << 2) | (b15 >> 3));
            outputStream.write((b15 << 5) | b16);
            return 5;
        }
        if (c15 != c17) {
            byte[] bArr2 = this.decodingTable;
            byte b17 = bArr2[c2];
            byte b18 = bArr2[c10];
            byte b19 = bArr2[c11];
            byte b20 = bArr2[c12];
            byte b21 = bArr2[c13];
            byte b22 = bArr2[c14];
            byte b23 = bArr2[c15];
            if ((b17 | b18 | b19 | b20 | b21 | b22 | b23) < 0) {
                throw new IOException("invalid characters encountered at end of base32 data");
            }
            outputStream.write((b17 << 3) | (b18 >> 2));
            outputStream.write((b18 << 6) | (b19 << 1) | (b20 >> 4));
            outputStream.write((b20 << 4) | (b21 >> 1));
            outputStream.write((b21 << 7) | (b22 << 2) | (b23 >> 3));
            return 4;
        }
        if (c14 != c17) {
            throw new IOException("invalid characters encountered at end of base32 data");
        }
        if (c13 != c17) {
            byte[] bArr3 = this.decodingTable;
            byte b24 = bArr3[c2];
            byte b25 = bArr3[c10];
            byte b26 = bArr3[c11];
            byte b27 = bArr3[c12];
            byte b28 = bArr3[c13];
            if ((b24 | b25 | b26 | b27 | b28) < 0) {
                throw new IOException("invalid characters encountered at end of base32 data");
            }
            outputStream.write((b24 << 3) | (b25 >> 2));
            outputStream.write((b25 << 6) | (b26 << 1) | (b27 >> 4));
            outputStream.write((b27 << 4) | (b28 >> 1));
            return 3;
        }
        if (c12 == c17) {
            if (c11 != c17) {
                throw new IOException("invalid characters encountered at end of base32 data");
            }
            byte[] bArr4 = this.decodingTable;
            byte b29 = bArr4[c2];
            byte b30 = bArr4[c10];
            if ((b29 | b30) < 0) {
                throw new IOException("invalid characters encountered at end of base32 data");
            }
            outputStream.write((b29 << 3) | (b30 >> 2));
            return 1;
        }
        byte[] bArr5 = this.decodingTable;
        byte b31 = bArr5[c2];
        byte b32 = bArr5[c10];
        byte b33 = bArr5[c11];
        byte b34 = bArr5[c12];
        if ((b31 | b32 | b33 | b34) < 0) {
            throw new IOException("invalid characters encountered at end of base32 data");
        }
        outputStream.write((b31 << 3) | (b32 >> 2));
        outputStream.write((b32 << 6) | (b33 << 1) | (b34 >> 4));
        return 2;
    }

    private void encodeBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        byte b9 = bArr[i];
        int i10 = bArr[i + 1] & 255;
        int i11 = bArr[i + 2] & 255;
        int i12 = bArr[i + 3] & 255;
        byte b10 = bArr[i + 4];
        byte[] bArr3 = this.encodingTable;
        bArr2[i9] = bArr3[(b9 >>> 3) & 31];
        bArr2[i9 + 1] = bArr3[((b9 << 2) | (i10 >>> 6)) & 31];
        bArr2[i9 + 2] = bArr3[(i10 >>> 1) & 31];
        bArr2[i9 + 3] = bArr3[((i10 << 4) | (i11 >>> 4)) & 31];
        bArr2[i9 + 4] = bArr3[((i11 << 1) | (i12 >>> 7)) & 31];
        bArr2[i9 + 5] = bArr3[(i12 >>> 2) & 31];
        bArr2[i9 + 6] = bArr3[(((b10 & 255) >>> 5) | (i12 << 3)) & 31];
        bArr2[i9 + 7] = bArr3[b10 & 31];
    }

    private boolean ignore(char c2) {
        return c2 == '\n' || c2 == '\r' || c2 == '\t' || c2 == ' ';
    }

    private int nextI(byte[] bArr, int i, int i9) {
        while (i < i9 && ignore((char) bArr[i])) {
            i++;
        }
        return i;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(String str, OutputStream outputStream) {
        byte[] byteArray = Strings.toByteArray(str);
        return decode(byteArray, 0, byteArray.length, outputStream);
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int encode(byte[] bArr, int i, int i9, OutputStream outputStream) {
        if (i9 < 0) {
            return 0;
        }
        byte[] bArr2 = new byte[72];
        int i10 = i9;
        while (i10 > 0) {
            int min = Math.min(45, i10);
            outputStream.write(bArr2, 0, encode(bArr, i, min, bArr2, 0));
            i += min;
            i10 -= min;
        }
        return ((i9 + 2) / 3) * 4;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int getEncodedLength(int i) {
        return ((i + 4) / 5) * 8;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int getMaxDecodedLength(int i) {
        return (i / 8) * 5;
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

    public Base32Encoder(byte[] bArr, byte b9) {
        this.decodingTable = new byte[128];
        if (bArr.length != 32) {
            throw new IllegalArgumentException("encoding table needs to be length 32");
        }
        this.encodingTable = Arrays.clone(bArr);
        this.padding = b9;
        initialiseDecodingTable();
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(byte[] bArr, int i, int i9, OutputStream outputStream) {
        byte[] bArr2 = new byte[55];
        int i10 = i + i9;
        while (i10 > i && ignore((char) bArr[i10 - 1])) {
            i10--;
        }
        if (i10 == 0) {
            return 0;
        }
        int i11 = i10;
        int i12 = 0;
        while (i11 > i && i12 != 8) {
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
            int nextI5 = nextI(bArr, i18, i11);
            int i19 = nextI5 + 1;
            byte b13 = this.decodingTable[bArr[nextI5]];
            int nextI6 = nextI(bArr, i19, i11);
            int i20 = nextI6 + 1;
            byte b14 = this.decodingTable[bArr[nextI6]];
            int nextI7 = nextI(bArr, i20, i11);
            int i21 = i10;
            int i22 = nextI7 + 1;
            byte b15 = this.decodingTable[bArr[nextI7]];
            int nextI8 = nextI(bArr, i22, i11);
            int i23 = i11;
            int i24 = nextI8 + 1;
            byte b16 = this.decodingTable[bArr[nextI8]];
            if ((b9 | b10 | b11 | b12 | b13 | b14 | b15 | b16) < 0) {
                throw new IOException("invalid characters encountered in base32 data");
            }
            bArr2[i13] = (byte) ((b9 << 3) | (b10 >> 2));
            bArr2[i13 + 1] = (byte) ((b10 << 6) | (b11 << 1) | (b12 >> 4));
            bArr2[i13 + 2] = (byte) ((b12 << 4) | (b13 >> 1));
            int i25 = i13 + 4;
            bArr2[i13 + 3] = (byte) ((b14 << 2) | (b13 << 7) | (b15 >> 3));
            i13 += 5;
            bArr2[i25] = (byte) ((b15 << 5) | b16);
            if (i13 == 55) {
                outputStream.write(bArr2);
                i13 = 0;
            }
            i14 += 5;
            int nextI9 = nextI(bArr, i24, i23);
            i11 = i23;
            i10 = i21;
            nextI = nextI9;
        }
        int i26 = i10;
        if (i13 > 0) {
            outputStream.write(bArr2, 0, i13);
        }
        int nextI10 = nextI(bArr, nextI, i26);
        int nextI11 = nextI(bArr, nextI10 + 1, i26);
        int nextI12 = nextI(bArr, nextI11 + 1, i26);
        int nextI13 = nextI(bArr, nextI12 + 1, i26);
        int nextI14 = nextI(bArr, nextI13 + 1, i26);
        int nextI15 = nextI(bArr, nextI14 + 1, i26);
        int nextI16 = nextI(bArr, nextI15 + 1, i26);
        return i14 + decodeLastBlock(outputStream, (char) bArr[nextI10], (char) bArr[nextI11], (char) bArr[nextI12], (char) bArr[nextI13], (char) bArr[nextI14], (char) bArr[nextI15], (char) bArr[nextI16], (char) bArr[nextI(bArr, nextI16 + 1, i26)]);
    }

    public int encode(byte[] bArr, int i, int i9, byte[] bArr2, int i10) {
        int i11 = (i + i9) - 4;
        int i12 = i;
        int i13 = i10;
        while (i12 < i11) {
            encodeBlock(bArr, i12, bArr2, i13);
            i12 += 5;
            i13 += 8;
        }
        int i14 = i9 - (i12 - i);
        if (i14 > 0) {
            byte[] bArr3 = new byte[5];
            System.arraycopy(bArr, i12, bArr3, 0, i14);
            encodeBlock(bArr3, 0, bArr2, i13);
            if (i14 == 1) {
                byte b9 = this.padding;
                bArr2[i13 + 2] = b9;
                bArr2[i13 + 3] = b9;
                bArr2[i13 + 4] = b9;
                bArr2[i13 + 5] = b9;
                bArr2[i13 + 6] = b9;
                bArr2[i13 + 7] = b9;
            } else if (i14 == 2) {
                byte b10 = this.padding;
                bArr2[i13 + 4] = b10;
                bArr2[i13 + 5] = b10;
                bArr2[i13 + 6] = b10;
                bArr2[i13 + 7] = b10;
            } else if (i14 == 3) {
                byte b11 = this.padding;
                bArr2[i13 + 5] = b11;
                bArr2[i13 + 6] = b11;
                bArr2[i13 + 7] = b11;
            } else if (i14 == 4) {
                bArr2[i13 + 7] = this.padding;
            }
            i13 += 8;
        }
        return i13 - i10;
    }
}

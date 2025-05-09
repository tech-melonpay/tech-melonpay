package org.bouncycastle.util.encoders;

import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.jmrtd.PassportService;

/* loaded from: classes3.dex */
public class HexTranslator implements Translator {
    private static final byte[] hexTable = {ISO7816.INS_DECREASE, 49, ISO7816.INS_INCREASE, 51, ISO7816.INS_DECREASE_STAMPED, 53, 54, 55, 56, 57, 97, ISOFileInfo.FCP_BYTE, 99, ISOFileInfo.FMD_BYTE, 101, 102};

    @Override // org.bouncycastle.util.encoders.Translator
    public int decode(byte[] bArr, int i, int i9, byte[] bArr2, int i10) {
        int i11 = i9 / 2;
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = (i12 * 2) + i;
            byte b9 = bArr[i13];
            byte b10 = bArr[i13 + 1];
            if (b9 < 97) {
                bArr2[i10] = (byte) ((b9 + ISO7816.INS_WRITE_BINARY) << 4);
            } else {
                bArr2[i10] = (byte) ((b9 - 87) << 4);
            }
            if (b10 < 97) {
                bArr2[i10] = (byte) (bArr2[i10] + ((byte) (b10 + ISO7816.INS_WRITE_BINARY)));
            } else {
                bArr2[i10] = (byte) (bArr2[i10] + ((byte) (b10 - 87)));
            }
            i10++;
        }
        return i11;
    }

    @Override // org.bouncycastle.util.encoders.Translator
    public int encode(byte[] bArr, int i, int i9, byte[] bArr2, int i10) {
        int i11 = 0;
        int i12 = 0;
        while (i11 < i9) {
            int i13 = i10 + i12;
            byte[] bArr3 = hexTable;
            bArr2[i13] = bArr3[(bArr[i] >> 4) & 15];
            bArr2[i13 + 1] = bArr3[bArr[i] & PassportService.SFI_DG15];
            i++;
            i11++;
            i12 += 2;
        }
        return i9 * 2;
    }

    @Override // org.bouncycastle.util.encoders.Translator
    public int getDecodedBlockSize() {
        return 1;
    }

    @Override // org.bouncycastle.util.encoders.Translator
    public int getEncodedBlockSize() {
        return 2;
    }
}

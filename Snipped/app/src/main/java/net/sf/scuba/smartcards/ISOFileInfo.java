package net.sf.scuba.smartcards;

import java.math.BigInteger;
import net.sf.scuba.util.Hex;
import org.jmrtd.cbeff.ISO781611;

/* loaded from: classes2.dex */
public class ISOFileInfo extends FileInfo {

    /* renamed from: A0, reason: collision with root package name */
    public static final byte f24316A0 = -96;

    /* renamed from: A1, reason: collision with root package name */
    public static final byte f24317A1 = -95;

    /* renamed from: A2, reason: collision with root package name */
    public static final byte f24318A2 = -94;

    /* renamed from: A5, reason: collision with root package name */
    public static final byte f24319A5 = -91;
    public static final byte AB = -85;
    public static final byte AC = -84;
    public static final byte CHANNEL_SECURITY = -114;
    public static final byte DATA_BYTES1 = Byte.MIN_VALUE;
    public static final byte DATA_BYTES2 = -127;
    public static final byte DF_NAME = -124;
    public static final byte ENV_TEMP_EF = -115;
    public static final byte FCI_BYTE = 111;
    public static final byte FCI_EXT = -121;
    public static final byte FCP_BYTE = 98;
    public static final byte FILE_DESCRIPTOR = -126;
    public static final byte FILE_IDENTIFIER = -125;
    public static final byte FMD_BYTE = 100;
    public static final byte LCS_BYTE = -118;
    public static final byte PROP_INFO = -123;
    public static final byte SECURITY_ATTR_COMPACT = -116;
    public static final byte SECURITY_ATTR_EXP = -117;
    public static final byte SECURITY_ATTR_PROP = -122;
    public static final byte SHORT_EF = -120;

    /* renamed from: a0, reason: collision with root package name */
    byte[] f24320a0;

    /* renamed from: a1, reason: collision with root package name */
    byte[] f24321a1;

    /* renamed from: a2, reason: collision with root package name */
    byte[] f24322a2;

    /* renamed from: a5, reason: collision with root package name */
    byte[] f24323a5;

    /* renamed from: ab, reason: collision with root package name */
    byte[] f24324ab;
    byte[] ac;
    byte channelSecurity;
    byte dataCodingByte;
    byte descriptorByte;
    byte[] dfName;
    short envTempEF;
    short fciExt;
    short fid;
    int fileLength;
    int fileLengthFCI;
    byte lcsByte;
    byte mainTag;
    short maxRecordSize;
    short maxRecordsCount;
    byte[] propInfo;
    byte[] secAttrCompact;
    byte[] secAttrExp;
    byte[] secAttrProp;
    byte shortEF;

    public ISOFileInfo(byte[] bArr) {
        byte b9;
        int i;
        byte[] bArr2;
        this.mainTag = (byte) -1;
        this.fileLength = -1;
        this.fileLengthFCI = -1;
        this.descriptorByte = (byte) -1;
        this.dataCodingByte = (byte) -1;
        this.maxRecordSize = (short) -1;
        this.maxRecordsCount = (short) -1;
        this.fid = (short) -1;
        this.dfName = null;
        this.propInfo = null;
        this.secAttrProp = null;
        this.secAttrExp = null;
        this.secAttrCompact = null;
        this.fciExt = (short) -1;
        this.envTempEF = (short) -1;
        this.shortEF = (byte) -1;
        this.lcsByte = (byte) -1;
        this.channelSecurity = (byte) -1;
        this.f24320a0 = null;
        this.f24321a1 = null;
        this.f24322a2 = null;
        this.f24323a5 = null;
        this.f24324ab = null;
        this.ac = null;
        if (bArr.length == 0) {
            return;
        }
        byte b10 = bArr[0];
        if (b10 != 111 && b10 != 98 && b10 != 100) {
            throw new CardServiceException("Malformed FCI data");
        }
        this.mainTag = b10;
        int i9 = bArr[1];
        byte[] bArr3 = new byte[i9];
        System.arraycopy(bArr, 2, bArr3, 0, i9);
        int i10 = 0;
        while (i10 < i9) {
            int i11 = i10 + 1;
            try {
                b9 = bArr3[i10];
                int i12 = i10 + 2;
                i = bArr3[i11];
                bArr2 = new byte[i];
                System.arraycopy(bArr3, i12, bArr2, 0, i);
                i10 = i12 + i;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new CardServiceException("Malformed FCI.");
            }
            if (b9 == -91) {
                byte[] bArr4 = new byte[i];
                this.f24323a5 = bArr4;
                System.arraycopy(bArr2, 0, bArr4, 0, i);
            } else if (b9 == -85) {
                byte[] bArr5 = new byte[i];
                this.f24324ab = bArr5;
                System.arraycopy(bArr2, 0, bArr5, 0, i);
            } else {
                if (b9 != -84) {
                    switch (b9) {
                        case Byte.MIN_VALUE:
                            this.fileLength = new BigInteger(bArr2).abs().intValue();
                            continue;
                        case -127:
                            checkLen(i, 2);
                            this.fileLengthFCI = new BigInteger(bArr2).intValue();
                            continue;
                        case -126:
                            checkLen(i, 1, 6);
                            this.descriptorByte = bArr2[0];
                            if (1 != i) {
                                this.dataCodingByte = bArr2[1];
                                if (2 != i) {
                                    int i13 = 3;
                                    if (i == 3) {
                                        this.maxRecordSize = bArr2[2];
                                    } else {
                                        this.maxRecordSize = new BigInteger(new byte[]{bArr2[2], bArr2[3]}).shortValue();
                                        i13 = 4;
                                    }
                                    if (i13 == i) {
                                        break;
                                    } else if (i == 5) {
                                        this.maxRecordsCount = bArr2[i13];
                                        break;
                                    } else {
                                        this.maxRecordsCount = new BigInteger(new byte[]{bArr2[i13], bArr2[i13 + 1]}).shortValue();
                                        continue;
                                    }
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        case -125:
                            checkLen(i, 2);
                            this.fid = new BigInteger(bArr2).shortValue();
                            continue;
                        case -124:
                            checkLen(i, 0, 16);
                            byte[] bArr6 = new byte[i];
                            this.dfName = bArr6;
                            System.arraycopy(bArr2, 0, bArr6, 0, i);
                            continue;
                        case -123:
                            byte[] bArr7 = new byte[i];
                            this.propInfo = bArr7;
                            System.arraycopy(bArr2, 0, bArr7, 0, i);
                            continue;
                        case -122:
                            byte[] bArr8 = new byte[i];
                            this.secAttrProp = bArr8;
                            System.arraycopy(bArr2, 0, bArr8, 0, i);
                            continue;
                        case -121:
                            checkLen(i, 2);
                            this.fciExt = new BigInteger(bArr2).shortValue();
                            continue;
                        case -120:
                            checkLen(i, 0, 1);
                            if (i == 0) {
                                this.shortEF = (byte) 0;
                                break;
                            } else {
                                this.shortEF = bArr2[0];
                                continue;
                            }
                        default:
                            switch (b9) {
                                case -118:
                                    checkLen(i, 1);
                                    this.lcsByte = bArr2[0];
                                    continue;
                                case -117:
                                    byte[] bArr9 = new byte[i];
                                    this.secAttrExp = bArr9;
                                    System.arraycopy(bArr2, 0, bArr9, 0, i);
                                    continue;
                                case -116:
                                    byte[] bArr10 = new byte[i];
                                    this.secAttrCompact = bArr10;
                                    System.arraycopy(bArr2, 0, bArr10, 0, i);
                                    continue;
                                case -115:
                                    checkLen(i, 2);
                                    this.envTempEF = new BigInteger(bArr2).shortValue();
                                    continue;
                                case -114:
                                    checkLen(i, 1);
                                    this.channelSecurity = bArr2[0];
                                    continue;
                                    continue;
                                default:
                                    switch (b9) {
                                        case -96:
                                            byte[] bArr11 = new byte[i];
                                            this.f24320a0 = bArr11;
                                            System.arraycopy(bArr2, 0, bArr11, 0, i);
                                            continue;
                                        case ISO781611.BIOMETRIC_HEADER_TEMPLATE_BASE_TAG /* -95 */:
                                            byte[] bArr12 = new byte[i];
                                            this.f24321a1 = bArr12;
                                            System.arraycopy(bArr2, 0, bArr12, 0, i);
                                            continue;
                                            continue;
                                        case -94:
                                            byte[] bArr13 = new byte[i];
                                            this.f24322a2 = bArr13;
                                            System.arraycopy(bArr2, 0, bArr13, 0, i);
                                            continue;
                                        default:
                                            throw new CardServiceException("Malformed FCI: unrecognized tag.");
                                    }
                            }
                    }
                    throw new CardServiceException("Malformed FCI.");
                }
                byte[] bArr14 = new byte[i];
                this.ac = bArr14;
                System.arraycopy(bArr2, 0, bArr14, 0, i);
            }
        }
    }

    private static byte[] catArray(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    private static void checkLen(int i, int i9) {
        if (i != i9) {
            throw new CardServiceException("Malformed FCI.");
        }
    }

    private static byte[] getArray(byte b9, byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length + 2];
        bArr2[0] = b9;
        bArr2[1] = (byte) bArr.length;
        System.arraycopy(bArr, 0, bArr2, 2, bArr.length);
        return bArr2;
    }

    @Override // net.sf.scuba.smartcards.FileInfo
    public short getFID() {
        return this.fid;
    }

    @Override // net.sf.scuba.smartcards.FileInfo
    public int getFileLength() {
        return this.fileLength;
    }

    public byte[] getFormatted() {
        byte[] bArr = new byte[0];
        if (this.mainTag == -1) {
            return bArr;
        }
        int i = this.fileLength;
        if (i != -1) {
            bArr = catArray(bArr, getArray(DATA_BYTES1, Hex.hexStringToBytes(Hex.shortToHexString((short) i))));
        }
        int i9 = this.fileLengthFCI;
        if (i9 != -1) {
            bArr = catArray(bArr, getArray(DATA_BYTES2, Hex.hexStringToBytes(Hex.shortToHexString((short) i9))));
        }
        byte b9 = this.descriptorByte;
        if (b9 != -1) {
            byte[] bArr2 = {b9};
            byte[] bArr3 = new byte[0];
            byte b10 = this.dataCodingByte;
            if (b10 != -1) {
                bArr3 = new byte[]{b10};
            }
            byte[] bArr4 = new byte[0];
            short s10 = this.maxRecordSize;
            if (s10 != -1) {
                bArr4 = Hex.hexStringToBytes(s10 <= 256 ? this.maxRecordsCount == -1 ? Hex.byteToHexString((byte) s10) : Hex.shortToHexString(s10) : Hex.shortToHexString(s10));
            }
            byte[] bArr5 = new byte[0];
            short s11 = this.maxRecordsCount;
            if (s11 != -1) {
                bArr5 = Hex.hexStringToBytes(s11 <= 256 ? Hex.byteToHexString((byte) s11) : Hex.shortToHexString(s11));
            }
            bArr = catArray(bArr, getArray((byte) -126, catArray(catArray(catArray(bArr2, bArr3), bArr4), bArr5)));
        }
        short s12 = this.fid;
        if (s12 != -1) {
            bArr = catArray(bArr, getArray(FILE_IDENTIFIER, Hex.hexStringToBytes(Hex.shortToHexString(s12))));
        }
        byte[] bArr6 = this.dfName;
        if (bArr6 != null) {
            bArr = catArray(bArr, getArray((byte) -124, bArr6));
        }
        byte[] bArr7 = this.propInfo;
        if (bArr7 != null) {
            bArr = catArray(bArr, getArray(PROP_INFO, bArr7));
        }
        byte[] bArr8 = this.secAttrProp;
        if (bArr8 != null) {
            bArr = catArray(bArr, getArray((byte) -122, bArr8));
        }
        short s13 = this.fciExt;
        if (s13 != -1) {
            bArr = catArray(bArr, getArray(FCI_EXT, Hex.hexStringToBytes(Hex.shortToHexString(s13))));
        }
        byte b11 = this.shortEF;
        if (b11 != -1) {
            bArr = catArray(bArr, getArray((byte) -120, b11 == 0 ? new byte[0] : new byte[]{b11}));
        }
        byte b12 = this.lcsByte;
        if (b12 != -1) {
            bArr = catArray(bArr, getArray(LCS_BYTE, new byte[]{b12}));
        }
        byte[] bArr9 = this.secAttrExp;
        if (bArr9 != null) {
            bArr = catArray(bArr, getArray(SECURITY_ATTR_EXP, bArr9));
        }
        byte[] bArr10 = this.secAttrCompact;
        if (bArr10 != null) {
            bArr = catArray(bArr, getArray(SECURITY_ATTR_COMPACT, bArr10));
        }
        short s14 = this.envTempEF;
        if (s14 != -1) {
            bArr = catArray(bArr, getArray(ENV_TEMP_EF, Hex.hexStringToBytes(Hex.shortToHexString(s14))));
        }
        byte b13 = this.channelSecurity;
        if (b13 != -1) {
            bArr = catArray(bArr, getArray(CHANNEL_SECURITY, new byte[]{b13}));
        }
        byte[] bArr11 = this.f24320a0;
        if (bArr11 != null) {
            bArr = catArray(bArr, getArray(f24316A0, bArr11));
        }
        byte[] bArr12 = this.f24321a1;
        if (bArr12 != null) {
            bArr = catArray(bArr, getArray(f24317A1, bArr12));
        }
        byte[] bArr13 = this.f24322a2;
        if (bArr13 != null) {
            bArr = catArray(bArr, getArray((byte) -94, bArr13));
        }
        byte[] bArr14 = this.f24323a5;
        if (bArr14 != null) {
            bArr = catArray(bArr, getArray(f24319A5, bArr14));
        }
        byte[] bArr15 = this.f24324ab;
        if (bArr15 != null) {
            bArr = catArray(bArr, getArray(AB, bArr15));
        }
        byte[] bArr16 = this.ac;
        if (bArr16 != null) {
            bArr = catArray(bArr, getArray((byte) -84, bArr16));
        }
        return getArray(this.mainTag, bArr);
    }

    public String toString() {
        return "Length: " + this.fileLength + "\nLength FCI: " + this.fileLengthFCI + "\nDesc byte: " + ((int) this.descriptorByte) + "\nData byte: " + ((int) this.dataCodingByte) + "\nRecord size: " + ((int) this.maxRecordSize) + "\nRecord count: " + ((int) this.maxRecordsCount) + "\nFID: " + Hex.shortToHexString(this.fid) + "\nDF name: " + Hex.bytesToHexString(this.dfName) + "\npropInfo: " + Hex.bytesToHexString(this.propInfo) + "\nsecAttrProp: " + Hex.bytesToHexString(this.secAttrProp) + "\nsecAttrExp: " + Hex.bytesToHexString(this.secAttrExp) + "\nsecAttrComp: " + Hex.bytesToHexString(this.secAttrCompact) + "\nFCI ext: " + Hex.shortToHexString(this.fciExt) + "\nEF env temp: " + Hex.shortToHexString(this.envTempEF) + "\nShort EF: " + Hex.byteToHexString(this.shortEF) + "\nLCS byte: " + Hex.byteToHexString(this.lcsByte) + "\nChannel sec: " + Hex.byteToHexString(this.channelSecurity) + "\na0: " + Hex.bytesToHexString(this.f24320a0) + "\na1: " + Hex.bytesToHexString(this.f24321a1) + "\na2: " + Hex.bytesToHexString(this.f24322a2) + "\na5: " + Hex.bytesToHexString(this.f24323a5) + "\nab: " + Hex.bytesToHexString(this.f24324ab) + "\nac: " + Hex.bytesToHexString(this.ac) + "\n";
    }

    private static void checkLen(int i, int i9, int i10) {
        if (i < i9 || i > i10) {
            throw new CardServiceException("Malformed FCI.");
        }
    }
}

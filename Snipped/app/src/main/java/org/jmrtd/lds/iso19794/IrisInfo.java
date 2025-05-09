package org.jmrtd.lds.iso19794;

import androidx.camera.core.impl.utils.a;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.logging.Logger;
import org.jmrtd.cbeff.BiometricDataBlock;
import org.jmrtd.cbeff.StandardBiometricHeader;
import org.jmrtd.lds.AbstractListInfo;

/* loaded from: classes3.dex */
public class IrisInfo extends AbstractListInfo<IrisBiometricSubtypeInfo> implements BiometricDataBlock {
    public static final int CAPTURE_DEVICE_UNDEF = 0;
    private static final int FORMAT_IDENTIFIER = 1229541888;
    private static final int FORMAT_OWNER_VALUE = 257;
    private static final int FORMAT_TYPE_VALUE = 9;
    public static final int IMAGEFORMAT_MONO_JPEG = 6;
    public static final int IMAGEFORMAT_MONO_JPEG2000 = 14;
    public static final int IMAGEFORMAT_MONO_JPEG_LS = 10;
    public static final int IMAGEFORMAT_MONO_RAW = 2;
    public static final int IMAGEFORMAT_RGB_JPEG = 8;
    public static final int IMAGEFORMAT_RGB_JPEG2000 = 16;
    public static final int IMAGEFORMAT_RGB_JPEG_LS = 12;
    public static final int IMAGEFORMAT_RGB_RAW = 4;
    public static final int INTENSITY_DEPTH_UNDEF = 0;
    public static final int IRBNDY_PROCESSED = 1;
    public static final int IRBNDY_UNDEF = 0;
    public static final int IROCC_PROCESSED = 1;
    public static final int IROCC_UNDEF = 0;
    public static final int IROCC_ZEROFILL = 0;
    public static final int IROC_UNITFILL = 1;
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    public static final int ORIENTATION_BASE = 1;
    public static final int ORIENTATION_FLIPPED = 2;
    public static final int ORIENTATION_UNDEF = 0;
    public static final int SCAN_TYPE_CORRECTED = 4;
    public static final int SCAN_TYPE_INTERLACE_FIELD = 3;
    public static final int SCAN_TYPE_INTERLACE_FRAME = 2;
    public static final int SCAN_TYPE_PROGRESSIVE = 1;
    public static final int SCAN_TYPE_UNDEF = 0;
    public static final int TRANS_STD = 1;
    public static final int TRANS_UNDEF = 0;
    private static final int VERSION_NUMBER = 808529920;
    private static final long serialVersionUID = -3415309711643815511L;
    private int boundaryExtraction;
    private int captureDeviceId;
    private byte[] deviceUniqueId;
    private int horizontalOrientation;
    private int imageFormat;
    private int imageTransformation;
    private int intensityDepth;
    private int irisDiameter;
    private int irisOcclusion;
    private int occlusionFilling;
    private int rawImageHeight;
    private int rawImageWidth;
    private long recordLength;
    private StandardBiometricHeader sbh;
    private int scanType;
    private int verticalOrientation;

    public IrisInfo(int i, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, byte[] bArr, List<IrisBiometricSubtypeInfo> list) {
        this(null, i, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, bArr, list);
    }

    private int getBiometricSubtype() {
        Iterator<IrisBiometricSubtypeInfo> it = getSubRecords().iterator();
        while (it.hasNext()) {
            it.next().getBiometricSubtype();
        }
        return 0;
    }

    public void addIrisBiometricSubtypeInfo(IrisBiometricSubtypeInfo irisBiometricSubtypeInfo) {
        add(irisBiometricSubtypeInfo);
    }

    @Override // org.jmrtd.lds.AbstractListInfo
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        IrisInfo irisInfo = (IrisInfo) obj;
        StandardBiometricHeader standardBiometricHeader = this.sbh;
        if (standardBiometricHeader == null) {
            if (irisInfo.sbh != null) {
                return false;
            }
        } else if (!standardBiometricHeader.equals(irisInfo.sbh)) {
            return false;
        }
        return this.boundaryExtraction == irisInfo.boundaryExtraction && this.captureDeviceId == irisInfo.captureDeviceId && Arrays.equals(this.deviceUniqueId, irisInfo.deviceUniqueId) && this.horizontalOrientation == irisInfo.horizontalOrientation && this.imageFormat == irisInfo.imageFormat && this.imageTransformation == irisInfo.imageTransformation && this.intensityDepth == irisInfo.intensityDepth && this.irisDiameter == irisInfo.irisDiameter && this.irisOcclusion == irisInfo.irisOcclusion && this.occlusionFilling == irisInfo.occlusionFilling && this.rawImageHeight == irisInfo.rawImageHeight && this.rawImageWidth == irisInfo.rawImageWidth && this.recordLength == irisInfo.recordLength && this.scanType == irisInfo.scanType && this.verticalOrientation == irisInfo.verticalOrientation;
    }

    public int getBoundaryExtraction() {
        return this.boundaryExtraction;
    }

    public int getCaptureDeviceId() {
        return this.captureDeviceId;
    }

    public byte[] getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public int getHorizontalOrientation() {
        return this.horizontalOrientation;
    }

    public int getImageFormat() {
        return this.imageFormat;
    }

    public int getImageTransformation() {
        return this.imageTransformation;
    }

    public int getIntensityDepth() {
        return this.intensityDepth;
    }

    public List<IrisBiometricSubtypeInfo> getIrisBiometricSubtypeInfos() {
        return getSubRecords();
    }

    public int getIrisDiameter() {
        return this.irisDiameter;
    }

    public int getIrisOcclusion() {
        return this.irisOcclusion;
    }

    public int getOcclusionFilling() {
        return this.occlusionFilling;
    }

    public int getRawImageHeight() {
        return this.rawImageHeight;
    }

    public int getRawImageWidth() {
        return this.rawImageWidth;
    }

    public int getScanType() {
        return this.scanType;
    }

    @Override // org.jmrtd.cbeff.BiometricDataBlock
    public StandardBiometricHeader getStandardBiometricHeader() {
        if (this.sbh == null) {
            byte[] bArr = {(byte) getBiometricSubtype()};
            TreeMap treeMap = new TreeMap();
            treeMap.put(129, new byte[]{8});
            treeMap.put(130, bArr);
            treeMap.put(135, new byte[]{1, 1});
            treeMap.put(136, new byte[]{0, 9});
            this.sbh = new StandardBiometricHeader(treeMap);
        }
        return this.sbh;
    }

    public int getVerticalOrientation() {
        return this.verticalOrientation;
    }

    @Override // org.jmrtd.lds.AbstractListInfo
    public int hashCode() {
        int hashCode = (((((((((((((((((((Arrays.hashCode(this.deviceUniqueId) + (((((super.hashCode() * 31) + this.boundaryExtraction) * 31) + this.captureDeviceId) * 31)) * 31) + this.horizontalOrientation) * 31) + this.imageFormat) * 31) + this.imageTransformation) * 31) + this.intensityDepth) * 31) + this.irisDiameter) * 31) + this.irisOcclusion) * 31) + this.occlusionFilling) * 31) + this.rawImageHeight) * 31) + this.rawImageWidth) * 31;
        long j10 = this.recordLength;
        int i = (hashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        StandardBiometricHeader standardBiometricHeader = this.sbh;
        return ((((i + (standardBiometricHeader == null ? 0 : standardBiometricHeader.hashCode())) * 31) + this.scanType) * 31) + this.verticalOrientation;
    }

    @Override // org.jmrtd.lds.AbstractListInfo
    public void readObject(InputStream inputStream) {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        int readInt = dataInputStream.readInt();
        if (readInt != FORMAT_IDENTIFIER) {
            throw new IllegalArgumentException(a.g(readInt, new StringBuilder("'IIR' marker expected! Found ")));
        }
        int readInt2 = dataInputStream.readInt();
        if (readInt2 != VERSION_NUMBER) {
            throw new IllegalArgumentException(a.g(readInt2, new StringBuilder("'010' version number expected! Found ")));
        }
        long readInt3 = dataInputStream.readInt();
        this.recordLength = readInt3;
        long j10 = readInt3 - 45;
        this.captureDeviceId = dataInputStream.readUnsignedShort();
        int readUnsignedByte = dataInputStream.readUnsignedByte();
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        if (readUnsignedShort != 45) {
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.g(readUnsignedShort, "Expected header length 45, found "));
        }
        int readUnsignedShort2 = dataInputStream.readUnsignedShort();
        this.horizontalOrientation = readUnsignedShort2 & 3;
        this.verticalOrientation = (readUnsignedShort2 & 12) >> 2;
        this.scanType = (readUnsignedShort2 & 112) >> 4;
        this.irisOcclusion = (readUnsignedShort2 & 128) >> 7;
        this.occlusionFilling = (readUnsignedShort2 & 256) >> 8;
        this.boundaryExtraction = (readUnsignedShort2 & 512) >> 9;
        this.irisDiameter = dataInputStream.readUnsignedShort();
        this.imageFormat = dataInputStream.readUnsignedShort();
        this.rawImageWidth = dataInputStream.readUnsignedShort();
        this.rawImageHeight = dataInputStream.readUnsignedShort();
        this.intensityDepth = dataInputStream.readUnsignedByte();
        this.imageTransformation = dataInputStream.readUnsignedByte();
        byte[] bArr = new byte[16];
        this.deviceUniqueId = bArr;
        dataInputStream.readFully(bArr);
        long j11 = 0;
        for (int i = 0; i < readUnsignedByte; i++) {
            IrisBiometricSubtypeInfo irisBiometricSubtypeInfo = new IrisBiometricSubtypeInfo(inputStream, this.imageFormat);
            j11 += irisBiometricSubtypeInfo.getRecordLength();
            add(irisBiometricSubtypeInfo);
        }
        if (j10 != j11) {
            LOGGER.warning("ConstructedDataLength and dataLength differ: dataLength = " + j10 + ", constructedDataLength = " + j11);
        }
    }

    public void removeIrisBiometricSubtypeInfo(int i) {
        remove(i);
    }

    public String toString() {
        return "IrisInfo []";
    }

    @Override // org.jmrtd.lds.AbstractListInfo, org.jmrtd.lds.AbstractLDSInfo
    public void writeObject(OutputStream outputStream) {
        List<IrisBiometricSubtypeInfo> subRecords = getSubRecords();
        Iterator<IrisBiometricSubtypeInfo> it = subRecords.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = (int) (it.next().getRecordLength() + i);
        }
        int i9 = i + 45;
        DataOutputStream dataOutputStream = outputStream instanceof DataOutputStream ? (DataOutputStream) outputStream : new DataOutputStream(outputStream);
        dataOutputStream.writeInt(FORMAT_IDENTIFIER);
        dataOutputStream.writeInt(VERSION_NUMBER);
        dataOutputStream.writeInt(i9);
        dataOutputStream.writeShort(this.captureDeviceId);
        dataOutputStream.writeByte(subRecords.size());
        dataOutputStream.writeShort(45);
        dataOutputStream.writeShort((this.horizontalOrientation & 3) | ((this.verticalOrientation << 2) & 12) | ((this.scanType << 4) & 112) | ((this.irisOcclusion << 7) & 128) | ((this.occlusionFilling << 8) & 256) | ((this.boundaryExtraction << 9) & 512));
        dataOutputStream.writeShort(this.irisDiameter);
        dataOutputStream.writeShort(this.imageFormat);
        dataOutputStream.writeShort(this.rawImageWidth);
        dataOutputStream.writeShort(this.rawImageHeight);
        dataOutputStream.writeByte(this.intensityDepth);
        dataOutputStream.writeByte(this.imageTransformation);
        dataOutputStream.write(this.deviceUniqueId);
        Iterator<IrisBiometricSubtypeInfo> it2 = subRecords.iterator();
        while (it2.hasNext()) {
            it2.next().writeObject(outputStream);
        }
    }

    public IrisInfo(StandardBiometricHeader standardBiometricHeader, int i, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, byte[] bArr, List<IrisBiometricSubtypeInfo> list) {
        this.sbh = standardBiometricHeader;
        if (list == null) {
            throw new IllegalArgumentException("Null irisBiometricSubtypeInfos");
        }
        this.captureDeviceId = i;
        this.horizontalOrientation = i9;
        this.verticalOrientation = i10;
        this.scanType = i11;
        this.irisOcclusion = i12;
        this.occlusionFilling = i13;
        this.boundaryExtraction = i14;
        this.irisDiameter = i15;
        this.imageFormat = i16;
        this.rawImageWidth = i17;
        this.rawImageHeight = i18;
        this.intensityDepth = i19;
        this.imageTransformation = i20;
        long j10 = 0;
        for (IrisBiometricSubtypeInfo irisBiometricSubtypeInfo : list) {
            j10 += irisBiometricSubtypeInfo.getRecordLength();
            add(irisBiometricSubtypeInfo);
        }
        if (bArr == null || bArr.length != 16) {
            throw new IllegalArgumentException("deviceUniqueId invalid");
        }
        byte[] bArr2 = new byte[16];
        this.deviceUniqueId = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        this.recordLength = j10 + 45;
    }

    public IrisInfo(InputStream inputStream) {
        this(null, inputStream);
    }

    public IrisInfo(StandardBiometricHeader standardBiometricHeader, InputStream inputStream) {
        this.sbh = standardBiometricHeader;
        readObject(inputStream);
    }
}

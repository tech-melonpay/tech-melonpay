package org.jmrtd.lds.iso19794;

import androidx.camera.core.impl.utils.a;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.logging.Logger;
import org.jmrtd.cbeff.BiometricDataBlock;
import org.jmrtd.cbeff.StandardBiometricHeader;
import org.jmrtd.lds.AbstractListInfo;
import org.jmrtd.lds.ImageInfo;

/* loaded from: classes3.dex */
public class FingerInfo extends AbstractListInfo<FingerImageInfo> implements BiometricDataBlock {
    public static final int COMPRESSION_JPEG = 3;
    public static final int COMPRESSION_JPEG2000 = 4;
    public static final int COMPRESSION_PNG = 5;
    public static final int COMPRESSION_UNCOMPRESSED_BIT_PACKED = 1;
    public static final int COMPRESSION_UNCOMPRESSED_NO_BIT_PACKING = 0;
    public static final int COMPRESSION_WSQ = 2;
    private static final int FORMAT_IDENTIFIER = 1179210240;
    private static final int FORMAT_OWNER_VALUE = 257;
    private static final int FORMAT_TYPE_VALUE = 7;
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    public static final int SCALE_UNITS_PPCM = 2;
    public static final int SCALE_UNITS_PPI = 1;
    private static final int VERSION_NUMBER = 808529920;
    private static final long serialVersionUID = 5808625058034008176L;
    private int acquisitionLevel;
    private int captureDeviceId;
    private int compressionAlgorithm;
    private int depth;
    private int imageResolutionHorizontal;
    private int imageResolutionVertical;
    private StandardBiometricHeader sbh;
    private int scaleUnits;
    private int scanResolutionHorizontal;
    private int scanResolutionVertical;

    public FingerInfo(int i, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, List<FingerImageInfo> list) {
        this(null, i, i9, i10, i11, i12, i13, i14, i15, i16, list);
    }

    public static int fromMimeType(String str) {
        if (ImageInfo.WSQ_MIME_TYPE.equals(str)) {
            return 2;
        }
        if (ImageInfo.JPEG_MIME_TYPE.equals(str)) {
            return 3;
        }
        if ("image/jpeg2000".equals(str)) {
            return 4;
        }
        if ("images/png".equals(str)) {
            return 5;
        }
        throw new IllegalArgumentException("Did not recognize mimeType");
    }

    private int getBiometricSubtype() {
        Iterator<FingerImageInfo> it = getSubRecords().iterator();
        boolean z10 = true;
        int i = 0;
        while (it.hasNext()) {
            int biometricSubtype = it.next().getBiometricSubtype();
            if (z10) {
                z10 = false;
                i = biometricSubtype;
            } else {
                i &= biometricSubtype;
            }
        }
        return i;
    }

    private static long readUnsignedLong(InputStream inputStream, int i) {
        (inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream)).readFully(new byte[i]);
        long j10 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            j10 = (j10 << 8) + (r0[i9] & 255);
        }
        return j10;
    }

    public static String toMimeType(int i) {
        if (i == 0 || i == 1) {
            return "image/raw";
        }
        if (i == 2) {
            return ImageInfo.WSQ_MIME_TYPE;
        }
        if (i == 3) {
            return ImageInfo.JPEG_MIME_TYPE;
        }
        if (i == 4) {
            return "image/jpeg2000";
        }
        if (i != 5) {
            return null;
        }
        return "image/png";
    }

    private static void writeLong(long j10, OutputStream outputStream, int i) {
        if (i <= 0) {
            return;
        }
        for (int i9 = 0; i9 < i - 8; i9++) {
            outputStream.write(0);
        }
        if (i > 8) {
            i = 8;
        }
        for (int i10 = i - 1; i10 >= 0; i10--) {
            int i11 = i10 * 8;
            outputStream.write((byte) (((255 << i11) & j10) >> i11));
        }
    }

    public void addFingerImageInfo(FingerImageInfo fingerImageInfo) {
        add(fingerImageInfo);
    }

    @Override // org.jmrtd.lds.AbstractListInfo
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        FingerInfo fingerInfo = (FingerInfo) obj;
        return this.acquisitionLevel == fingerInfo.acquisitionLevel && this.captureDeviceId == fingerInfo.captureDeviceId && this.compressionAlgorithm == fingerInfo.compressionAlgorithm && this.depth == fingerInfo.depth && this.imageResolutionHorizontal == fingerInfo.imageResolutionHorizontal && this.imageResolutionVertical == fingerInfo.imageResolutionVertical && this.scaleUnits == fingerInfo.scaleUnits && this.scanResolutionHorizontal == fingerInfo.scanResolutionHorizontal && this.scanResolutionVertical == fingerInfo.scanResolutionVertical;
    }

    public int getAcquisitionLevel() {
        return this.acquisitionLevel;
    }

    public int getCaptureDeviceId() {
        return this.captureDeviceId;
    }

    public int getCompressionAlgorithm() {
        return this.compressionAlgorithm;
    }

    public int getDepth() {
        return this.depth;
    }

    public List<FingerImageInfo> getFingerImageInfos() {
        return getSubRecords();
    }

    public int getHorizontalImageResolution() {
        return this.imageResolutionHorizontal;
    }

    public int getHorizontalScanningResolution() {
        return this.scanResolutionHorizontal;
    }

    public int getScaleUnits() {
        return this.scaleUnits;
    }

    @Override // org.jmrtd.cbeff.BiometricDataBlock
    public StandardBiometricHeader getStandardBiometricHeader() {
        if (this.sbh == null) {
            byte[] bArr = {(byte) getBiometricSubtype()};
            TreeMap treeMap = new TreeMap();
            treeMap.put(129, new byte[]{8});
            treeMap.put(130, bArr);
            treeMap.put(135, new byte[]{1, 1});
            treeMap.put(136, new byte[]{0, 7});
            this.sbh = new StandardBiometricHeader(treeMap);
        }
        return this.sbh;
    }

    public int getVerticalImageResolution() {
        return this.imageResolutionVertical;
    }

    public int getVerticalScanningResolution() {
        return this.scanResolutionVertical;
    }

    @Override // org.jmrtd.lds.AbstractListInfo
    public int hashCode() {
        int hashCode = ((((((((((((super.hashCode() * 31) + this.acquisitionLevel) * 31) + this.captureDeviceId) * 31) + this.compressionAlgorithm) * 31) + this.depth) * 31) + this.imageResolutionHorizontal) * 31) + this.imageResolutionVertical) * 31;
        StandardBiometricHeader standardBiometricHeader = this.sbh;
        return ((((((hashCode + (standardBiometricHeader == null ? 0 : standardBiometricHeader.hashCode())) * 31) + this.scaleUnits) * 31) + this.scanResolutionHorizontal) * 31) + this.scanResolutionVertical;
    }

    @Override // org.jmrtd.lds.AbstractListInfo
    public void readObject(InputStream inputStream) {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        int readInt = dataInputStream.readInt();
        if (readInt != FORMAT_IDENTIFIER) {
            throw new IllegalArgumentException(a.g(readInt, new StringBuilder("'FIR' marker expected! Found ")));
        }
        int readInt2 = dataInputStream.readInt();
        if (readInt2 != VERSION_NUMBER) {
            throw new IllegalArgumentException(a.g(readInt2, new StringBuilder("'010' version number expected! Found ")));
        }
        long readUnsignedLong = readUnsignedLong(dataInputStream, 6);
        this.captureDeviceId = dataInputStream.readUnsignedShort();
        this.acquisitionLevel = dataInputStream.readUnsignedShort();
        int readUnsignedByte = dataInputStream.readUnsignedByte();
        this.scaleUnits = dataInputStream.readUnsignedByte();
        this.scanResolutionHorizontal = dataInputStream.readUnsignedShort();
        this.scanResolutionVertical = dataInputStream.readUnsignedShort();
        this.imageResolutionHorizontal = dataInputStream.readUnsignedShort();
        this.imageResolutionVertical = dataInputStream.readUnsignedShort();
        this.depth = dataInputStream.readUnsignedByte();
        this.compressionAlgorithm = dataInputStream.readUnsignedByte();
        dataInputStream.readUnsignedShort();
        long j10 = readUnsignedLong - 32;
        long j11 = 0;
        for (int i = 0; i < readUnsignedByte; i++) {
            FingerImageInfo fingerImageInfo = new FingerImageInfo(inputStream, this.compressionAlgorithm);
            j11 += fingerImageInfo.getRecordLength();
            add(fingerImageInfo);
        }
        if (j10 != j11) {
            LOGGER.warning("ConstructedDataLength and dataLength differ: dataLength = " + j10 + ", constructedDataLength = " + j11);
        }
    }

    public void removeFingerImageInfo(int i) {
        remove(i);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FingerInfo [");
        Iterator<FingerImageInfo> it = getSubRecords().iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // org.jmrtd.lds.AbstractListInfo, org.jmrtd.lds.AbstractLDSInfo
    public void writeObject(OutputStream outputStream) {
        List<FingerImageInfo> subRecords = getSubRecords();
        Iterator<FingerImageInfo> it = subRecords.iterator();
        long j10 = 0;
        while (it.hasNext()) {
            j10 += it.next().getRecordLength();
        }
        long j11 = 32 + j10;
        DataOutputStream dataOutputStream = outputStream instanceof DataOutputStream ? (DataOutputStream) outputStream : new DataOutputStream(outputStream);
        dataOutputStream.writeInt(FORMAT_IDENTIFIER);
        dataOutputStream.writeInt(VERSION_NUMBER);
        writeLong(j11, dataOutputStream, 6);
        dataOutputStream.writeShort(this.captureDeviceId);
        dataOutputStream.writeShort(this.acquisitionLevel);
        dataOutputStream.writeByte(subRecords.size());
        dataOutputStream.writeByte(this.scaleUnits);
        dataOutputStream.writeShort(this.scanResolutionHorizontal);
        dataOutputStream.writeShort(this.scanResolutionVertical);
        dataOutputStream.writeShort(this.imageResolutionHorizontal);
        dataOutputStream.writeShort(this.imageResolutionVertical);
        dataOutputStream.writeByte(this.depth);
        dataOutputStream.writeByte(this.compressionAlgorithm);
        dataOutputStream.writeShort(0);
        Iterator<FingerImageInfo> it2 = subRecords.iterator();
        while (it2.hasNext()) {
            it2.next().writeObject(dataOutputStream);
        }
    }

    public FingerInfo(StandardBiometricHeader standardBiometricHeader, int i, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, List<FingerImageInfo> list) {
        this.sbh = standardBiometricHeader;
        this.captureDeviceId = i;
        this.acquisitionLevel = i9;
        this.scaleUnits = i10;
        this.scanResolutionHorizontal = i11;
        this.scanResolutionVertical = i12;
        this.imageResolutionHorizontal = i13;
        this.imageResolutionVertical = i14;
        this.depth = i15;
        this.compressionAlgorithm = i16;
        addAll(list);
    }

    public FingerInfo(InputStream inputStream) {
        this(null, inputStream);
    }

    public FingerInfo(StandardBiometricHeader standardBiometricHeader, InputStream inputStream) {
        this.sbh = standardBiometricHeader;
        readObject(inputStream);
    }
}

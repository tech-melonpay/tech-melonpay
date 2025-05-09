package org.jmrtd.lds.iso19794;

import androidx.camera.core.impl.utils.a;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jmrtd.lds.AbstractImageInfo;
import org.jmrtd.lds.ImageInfo;

/* loaded from: classes3.dex */
public class IrisImageInfo extends AbstractImageInfo {
    public static final int IMAGE_QUAL_HIGH_HI = 100;
    public static final int IMAGE_QUAL_HIGH_LO = 76;
    public static final int IMAGE_QUAL_LOW_HI = 50;
    public static final int IMAGE_QUAL_LOW_LO = 26;
    public static final int IMAGE_QUAL_MED_HI = 75;
    public static final int IMAGE_QUAL_MED_LO = 51;
    public static final int IMAGE_QUAL_UNDEF = 254;
    private static final int ROT_ANGLE_UNDEF = 65535;
    private static final int ROT_UNCERTAIN_UNDEF = 65535;
    private static final long serialVersionUID = 833541246115625112L;
    private int imageFormat;
    private int imageNumber;
    private int quality;
    private int rotationAngle;
    private int rotationAngleUncertainty;

    public IrisImageInfo(int i, int i9, int i10, int i11, int i12, int i13, InputStream inputStream, int i14, int i15) {
        super(3, i12, i13, inputStream, i14, getMimeTypeFromImageFormat(i15));
        if (inputStream == null) {
            throw new IllegalArgumentException("Null image bytes");
        }
        this.imageNumber = i;
        this.quality = i9;
        this.rotationAngle = i10;
        this.rotationAngleUncertainty = i11;
    }

    private static String getMimeTypeFromImageFormat(int i) {
        if (i == 2 || i == 4) {
            return ImageInfo.WSQ_MIME_TYPE;
        }
        if (i == 6 || i == 8 || i == 10 || i == 12) {
            return ImageInfo.JPEG_MIME_TYPE;
        }
        if (i == 14 || i == 16) {
            return ImageInfo.JPEG2000_MIME_TYPE;
        }
        return null;
    }

    @Override // org.jmrtd.lds.AbstractImageInfo
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        IrisImageInfo irisImageInfo = (IrisImageInfo) obj;
        return this.imageFormat == irisImageInfo.imageFormat && this.imageNumber == irisImageInfo.imageNumber && this.quality == irisImageInfo.quality && this.rotationAngle == irisImageInfo.rotationAngle && this.rotationAngleUncertainty == irisImageInfo.rotationAngleUncertainty;
    }

    public int getImageFormat() {
        return this.imageFormat;
    }

    public int getImageNumber() {
        return this.imageNumber;
    }

    public int getQuality() {
        return this.quality;
    }

    @Override // org.jmrtd.lds.ImageInfo
    public long getRecordLength() {
        return getImageLength() + 11;
    }

    public int getRotationAngle() {
        return this.rotationAngle;
    }

    public int getRotationAngleUncertainty() {
        return this.rotationAngleUncertainty;
    }

    @Override // org.jmrtd.lds.AbstractImageInfo
    public int hashCode() {
        return (((((((((super.hashCode() * 31) + this.imageFormat) * 31) + this.imageNumber) * 31) + this.quality) * 31) + this.rotationAngle) * 31) + this.rotationAngleUncertainty;
    }

    @Override // org.jmrtd.lds.AbstractImageInfo
    public void readObject(InputStream inputStream) {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        this.imageNumber = dataInputStream.readUnsignedShort();
        this.quality = dataInputStream.readUnsignedByte();
        this.rotationAngle = dataInputStream.readShort();
        this.rotationAngleUncertainty = dataInputStream.readUnsignedShort();
        readImage(inputStream, dataInputStream.readInt() & BodyPartID.bodyIdMax);
    }

    @Override // org.jmrtd.lds.AbstractImageInfo
    public String toString() {
        StringBuilder sb2 = new StringBuilder("IrisImageInfo [image number: ");
        sb2.append(this.imageNumber);
        sb2.append(", quality: ");
        sb2.append(this.quality);
        sb2.append(", image: ");
        sb2.append(getWidth());
        sb2.append(" x ");
        sb2.append(getHeight());
        sb2.append("mime-type: ");
        return a.n(sb2, getMimeTypeFromImageFormat(this.imageFormat), "]");
    }

    @Override // org.jmrtd.lds.AbstractImageInfo
    public void writeObject(OutputStream outputStream) {
        DataOutputStream dataOutputStream = outputStream instanceof DataOutputStream ? (DataOutputStream) outputStream : new DataOutputStream(outputStream);
        dataOutputStream.writeShort(this.imageNumber);
        dataOutputStream.writeByte(this.quality);
        dataOutputStream.writeShort(this.rotationAngle);
        dataOutputStream.writeShort(this.rotationAngleUncertainty);
        dataOutputStream.writeInt(getImageLength());
        writeImage(dataOutputStream);
    }

    public IrisImageInfo(int i, int i9, int i10, InputStream inputStream, int i11, int i12) {
        this(i, IMAGE_QUAL_UNDEF, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, i9, i10, inputStream, i11, i12);
    }

    public IrisImageInfo(InputStream inputStream, int i) {
        super(3);
        this.imageFormat = i;
        setMimeType(getMimeTypeFromImageFormat(i));
        readObject(inputStream);
    }
}

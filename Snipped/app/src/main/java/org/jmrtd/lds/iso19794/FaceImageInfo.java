package org.jmrtd.lds.iso19794;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Logger;
import net.sf.scuba.data.Gender;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jmrtd.PassportService;
import org.jmrtd.lds.AbstractImageInfo;
import org.jmrtd.lds.ImageInfo;
import s3.b;

/* loaded from: classes3.dex */
public class FaceImageInfo extends AbstractImageInfo {
    public static final short EXPRESSION_EYES_LOOKING_AWAY = 5;
    public static final short EXPRESSION_FROWNING = 7;
    public static final short EXPRESSION_NEUTRAL = 1;
    public static final short EXPRESSION_RAISED_EYEBROWS = 4;
    public static final short EXPRESSION_SMILE_CLOSED = 2;
    public static final short EXPRESSION_SMILE_OPEN = 3;
    public static final short EXPRESSION_SQUINTING = 6;
    public static final short EXPRESSION_UNSPECIFIED = 0;
    public static final int EYE_COLOR_BLACK = 1;
    public static final int EYE_COLOR_BLUE = 2;
    public static final int EYE_COLOR_BROWN = 3;
    public static final int EYE_COLOR_GRAY = 4;
    public static final int EYE_COLOR_GREEN = 5;
    public static final int EYE_COLOR_MULTI_COLORED = 6;
    public static final int EYE_COLOR_PINK = 7;
    public static final int EYE_COLOR_UNKNOWN = 255;
    public static final int EYE_COLOR_UNSPECIFIED = 0;
    public static final int FACE_IMAGE_TYPE_BASIC = 0;
    public static final int FACE_IMAGE_TYPE_FULL_FRONTAL = 1;
    public static final int FACE_IMAGE_TYPE_TOKEN_FRONTAL = 2;
    private static final int FEATURE_BEARD_FLAG = 8;
    private static final int FEATURE_BLINK_FLAG = 32;
    private static final int FEATURE_DARK_GLASSES = 512;
    private static final int FEATURE_DISTORTING_MEDICAL_CONDITION = 1024;
    private static final int FEATURE_FEATURES_ARE_SPECIFIED_FLAG = 1;
    private static final int FEATURE_GLASSES_FLAG = 2;
    private static final int FEATURE_LEFT_EYE_PATCH_FLAG = 128;
    private static final int FEATURE_MOUSTACHE_FLAG = 4;
    private static final int FEATURE_MOUTH_OPEN_FLAG = 64;
    private static final int FEATURE_RIGHT_EYE_PATCH = 256;
    private static final int FEATURE_TEETH_VISIBLE_FLAG = 16;
    public static final int HAIR_COLOR_BALD = 1;
    public static final int HAIR_COLOR_BLACK = 2;
    public static final int HAIR_COLOR_BLONDE = 3;
    public static final int HAIR_COLOR_BLUE = 9;
    public static final int HAIR_COLOR_BROWN = 4;
    public static final int HAIR_COLOR_GRAY = 5;
    public static final int HAIR_COLOR_GREEN = 8;
    public static final int HAIR_COLOR_RED = 7;
    public static final int HAIR_COLOR_UNKNOWN = 255;
    public static final int HAIR_COLOR_UNSPECIFIED = 0;
    public static final int HAIR_COLOR_WHITE = 6;
    public static final int IMAGE_COLOR_SPACE_GRAY8 = 3;
    public static final int IMAGE_COLOR_SPACE_OTHER = 4;
    public static final int IMAGE_COLOR_SPACE_RGB24 = 1;
    public static final int IMAGE_COLOR_SPACE_UNSPECIFIED = 0;
    public static final int IMAGE_COLOR_SPACE_YUV422 = 2;
    public static final int IMAGE_DATA_TYPE_JPEG = 0;
    public static final int IMAGE_DATA_TYPE_JPEG2000 = 1;
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final int PITCH = 1;
    private static final int ROLL = 2;
    public static final int SOURCE_TYPE_STATIC_PHOTO_DIGITAL_CAM = 2;
    public static final int SOURCE_TYPE_STATIC_PHOTO_SCANNER = 3;
    public static final int SOURCE_TYPE_STATIC_PHOTO_UNKNOWN_SOURCE = 1;
    public static final int SOURCE_TYPE_UNKNOWN = 7;
    public static final int SOURCE_TYPE_UNSPECIFIED = 0;
    public static final int SOURCE_TYPE_VIDEO_FRAME_ANALOG_CAM = 5;
    public static final int SOURCE_TYPE_VIDEO_FRAME_DIGITAL_CAM = 6;
    public static final int SOURCE_TYPE_VIDEO_FRAME_UNKNOWN_SOURCE = 4;
    private static final int YAW = 0;
    private static final long serialVersionUID = -1751069410327594067L;
    private int colorSpace;
    private int deviceType;
    private int expression;
    private EyeColor eyeColor;
    private int faceImageType;
    private int featureMask;
    private FeaturePoint[] featurePoints;
    private Gender gender;
    private int hairColor;
    private int imageDataType;
    private int[] poseAngle;
    private int[] poseAngleUncertainty;
    private int quality;
    private long recordLength;
    private int sourceType;

    public enum Expression {
        UNSPECIFIED,
        NEUTRAL,
        SMILE_CLOSED,
        SMILE_OPEN,
        RAISED_EYEBROWS,
        EYES_LOOKING_AWAY,
        SQUINTING,
        FROWNING
    }

    public enum EyeColor {
        UNSPECIFIED(0),
        BLACK(1),
        BLUE(2),
        BROWN(3),
        GRAY(4),
        GREEN(5),
        MULTI_COLORED(6),
        PINK(7),
        UNKNOWN(255);

        private int code;

        EyeColor(int i) {
            this.code = i;
        }

        public static EyeColor toEyeColor(int i) {
            for (EyeColor eyeColor : values()) {
                if (eyeColor.toInt() == i) {
                    return eyeColor;
                }
            }
            return UNKNOWN;
        }

        public int toInt() {
            return this.code;
        }
    }

    public enum FaceImageType {
        BASIC,
        FULL_FRONTAL,
        TOKEN_FRONTAL
    }

    public enum Features {
        FEATURES_ARE_SPECIFIED,
        GLASSES,
        MOUSTACHE,
        BEARD,
        TEETH_VISIBLE,
        BLINK,
        MOUTH_OPEN,
        LEFT_EYE_PATCH,
        RIGHT_EYE_PATCH,
        DARK_GLASSES,
        DISTORTING_MEDICAL_CONDITION
    }

    public enum HairColor {
        UNSPECIFIED(0),
        BALD(1),
        BLACK(2),
        BLONDE(3),
        BROWN(4),
        GRAY(5),
        WHITE(6),
        RED(7),
        GREEN(8),
        BLUE(9),
        UNKNOWN(255);

        private int code;

        HairColor(int i) {
            this.code = i;
        }

        public static HairColor toHairColor(int i) {
            for (HairColor hairColor : values()) {
                if (hairColor.toInt() == i) {
                    return hairColor;
                }
            }
            return UNKNOWN;
        }

        public int toInt() {
            return this.code;
        }
    }

    public enum ImageColorSpace {
        UNSPECIFIED,
        RGB24,
        YUV422,
        GRAY8,
        OTHER
    }

    public enum ImageDataType {
        TYPE_JPEG,
        TYPE_JPEG2000
    }

    public enum SourceType {
        UNSPECIFIED,
        STATIC_PHOTO_UNKNOWN_SOURCE,
        STATIC_PHOTO_DIGITAL_CAM,
        STATIC_PHOTO_SCANNER,
        VIDEO_FRAME_UNKNOWN_SOURCE,
        VIDEO_FRAME_ANALOG_CAM,
        VIDEO_FRAME_DIGITAL_CAM,
        UNKNOWN
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FaceImageInfo(net.sf.scuba.data.Gender r16, org.jmrtd.lds.iso19794.FaceImageInfo.EyeColor r17, int r18, int r19, int r20, int[] r21, int[] r22, int r23, int r24, int r25, int r26, int r27, org.jmrtd.lds.iso19794.FaceImageInfo.FeaturePoint[] r28, int r29, int r30, java.io.InputStream r31, int r32, int r33) {
        /*
            r15 = this;
            r8 = r15
            r9 = r24
            r10 = r25
            r11 = r26
            r12 = r28
            r0 = r32
            long r13 = (long) r0
            java.lang.String r7 = toMimeType(r33)
            r1 = 0
            r0 = r15
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5, r7)
            if (r31 == 0) goto L80
            if (r16 != 0) goto L23
            net.sf.scuba.data.Gender r0 = net.sf.scuba.data.Gender.UNSPECIFIED
            goto L25
        L23:
            r0 = r16
        L25:
            r8.gender = r0
            if (r17 != 0) goto L2c
            org.jmrtd.lds.iso19794.FaceImageInfo$EyeColor r0 = org.jmrtd.lds.iso19794.FaceImageInfo.EyeColor.UNSPECIFIED
            goto L2e
        L2c:
            r0 = r17
        L2e:
            r8.eyeColor = r0
            r0 = r18
            r8.featureMask = r0
            r0 = r19
            r8.hairColor = r0
            r0 = r20
            r8.expression = r0
            r8.colorSpace = r9
            r8.sourceType = r10
            r8.deviceType = r11
            r0 = 0
            if (r12 != 0) goto L47
            r1 = r0
            goto L48
        L47:
            int r1 = r12.length
        L48:
            org.jmrtd.lds.iso19794.FaceImageInfo$FeaturePoint[] r2 = new org.jmrtd.lds.iso19794.FaceImageInfo.FeaturePoint[r1]
            r8.featurePoints = r2
            if (r1 <= 0) goto L51
            java.lang.System.arraycopy(r12, r0, r2, r0, r1)
        L51:
            r2 = 3
            int[] r3 = new int[r2]
            r8.poseAngle = r3
            r4 = r21
            java.lang.System.arraycopy(r4, r0, r3, r0, r2)
            int[] r3 = new int[r2]
            r8.poseAngleUncertainty = r3
            r4 = r22
            java.lang.System.arraycopy(r4, r0, r3, r0, r2)
            r0 = r33
            r8.imageDataType = r0
            int r1 = r1 * 8
            long r0 = (long) r1
            r2 = 32
            long r0 = r0 + r2
            long r0 = r0 + r13
            r8.recordLength = r0
            r0 = r23
            r8.faceImageType = r0
            r8.colorSpace = r9
            r8.sourceType = r10
            r8.deviceType = r11
            r0 = r27
            r8.quality = r0
            return
        L80:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Null image"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jmrtd.lds.iso19794.FaceImageInfo.<init>(net.sf.scuba.data.Gender, org.jmrtd.lds.iso19794.FaceImageInfo$EyeColor, int, int, int, int[], int[], int, int, int, int, int, org.jmrtd.lds.iso19794.FaceImageInfo$FeaturePoint[], int, int, java.io.InputStream, int, int):void");
    }

    private String expressionToString() {
        switch (this.expression) {
            case 0:
                return "unspecified";
            case 1:
                return "neutral (non-smiling) with both eyes open and mouth closed";
            case 2:
                return "a smile where the inside of the mouth and/or teeth is not exposed (closed jaw)";
            case 3:
                return "a smile where the inside of the mouth and/or teeth is exposed";
            case 4:
                return "raised eyebrows";
            case 5:
                return "eyes looking away from the camera";
            case 6:
                return "squinting";
            case 7:
                return "frowning";
            default:
                return "unknown";
        }
    }

    private String faceImageTypeToString() {
        int i = this.faceImageType;
        return i != 0 ? i != 1 ? i != 2 ? "unknown" : "token frontal" : "full frontal" : "basic";
    }

    private String featureMaskToString() {
        if ((this.featureMask & 1) == 0) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.featureMask & 2) != 0) {
            arrayList.add("glasses");
        }
        if ((this.featureMask & 4) != 0) {
            arrayList.add("moustache");
        }
        if ((this.featureMask & 8) != 0) {
            arrayList.add("beard");
        }
        if ((this.featureMask & 16) != 0) {
            arrayList.add("teeth visible");
        }
        if ((this.featureMask & 32) != 0) {
            arrayList.add("blink");
        }
        if ((this.featureMask & 64) != 0) {
            arrayList.add("mouth open");
        }
        if ((this.featureMask & 128) != 0) {
            arrayList.add("left eye patch");
        }
        if ((this.featureMask & 256) != 0) {
            arrayList.add("right eye patch");
        }
        if ((this.featureMask & 512) != 0) {
            arrayList.add("dark glasses");
        }
        if ((this.featureMask & 1024) != 0) {
            arrayList.add("distorting medical condition (which could impact feature point detection)");
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        return sb2.toString();
    }

    private String hairColorToString() {
        switch (this.hairColor) {
            case 0:
                return "unspecified";
            case 1:
                return "bald";
            case 2:
                return "black";
            case 3:
                return "blonde";
            case 4:
                return "brown";
            case 5:
                return "gray";
            case 6:
                return "white";
            case 7:
                return "red";
            case 8:
                return "green";
            case 9:
                return "blue";
            default:
                return "unknown";
        }
    }

    private String poseAngleToString() {
        StringBuilder sb2 = new StringBuilder("(y: ");
        sb2.append(this.poseAngle[0]);
        if (this.poseAngleUncertainty[0] != 0) {
            sb2.append(" (");
            sb2.append(this.poseAngleUncertainty[0]);
            sb2.append(")");
        }
        sb2.append(", p:");
        sb2.append(this.poseAngle[1]);
        if (this.poseAngleUncertainty[1] != 0) {
            sb2.append(" (");
            sb2.append(this.poseAngleUncertainty[1]);
            sb2.append(")");
        }
        sb2.append(", r: ");
        sb2.append(this.poseAngle[2]);
        if (this.poseAngleUncertainty[2] != 0) {
            sb2.append(" (");
            sb2.append(this.poseAngleUncertainty[2]);
            sb2.append(")");
        }
        sb2.append(")");
        return sb2.toString();
    }

    private String sourceTypeToString() {
        switch (this.sourceType) {
            case 0:
                return "unspecified";
            case 1:
                return "static photograph from an unknown source";
            case 2:
                return "static photograph from a digital still-image camera";
            case 3:
                return "static photograph from a scanner";
            case 4:
                return "single video frame from an unknown source";
            case 5:
                return "single video frame from an analogue camera";
            case 6:
                return "single video frame from a digital camera";
            default:
                return "unknown";
        }
    }

    private static String toMimeType(int i) {
        if (i == 0) {
            return ImageInfo.JPEG_MIME_TYPE;
        }
        if (i == 1) {
            return ImageInfo.JPEG2000_MIME_TYPE;
        }
        LOGGER.warning("Unknown image type: " + i);
        return null;
    }

    private void writeFacialRecordData(OutputStream outputStream) {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeShort(this.featurePoints.length);
        Gender gender = this.gender;
        if (gender == null) {
            gender = Gender.UNSPECIFIED;
        }
        dataOutputStream.writeByte(gender.toInt());
        EyeColor eyeColor = this.eyeColor;
        if (eyeColor == null) {
            eyeColor = EyeColor.UNSPECIFIED;
        }
        dataOutputStream.writeByte(eyeColor.toInt());
        dataOutputStream.writeByte(this.hairColor);
        dataOutputStream.writeByte((byte) ((this.featureMask & 16711680) >> 16));
        dataOutputStream.writeByte((byte) ((this.featureMask & 65280) >> 8));
        dataOutputStream.writeByte((byte) (this.featureMask & 255));
        dataOutputStream.writeShort(this.expression);
        for (int i = 0; i < 3; i++) {
            dataOutputStream.writeByte(this.poseAngle[i]);
        }
        for (int i9 = 0; i9 < 3; i9++) {
            dataOutputStream.writeByte(this.poseAngleUncertainty[i9]);
        }
        for (FeaturePoint featurePoint : this.featurePoints) {
            dataOutputStream.writeByte(featurePoint.getType());
            dataOutputStream.writeByte((featurePoint.getMajorCode() << 4) | featurePoint.getMinorCode());
            dataOutputStream.writeShort(featurePoint.getX());
            dataOutputStream.writeShort(featurePoint.getY());
            dataOutputStream.writeShort(0);
        }
        dataOutputStream.writeByte(this.faceImageType);
        dataOutputStream.writeByte(this.imageDataType);
        dataOutputStream.writeShort(getWidth());
        dataOutputStream.writeShort(getHeight());
        dataOutputStream.writeByte(this.colorSpace);
        dataOutputStream.writeByte(this.sourceType);
        dataOutputStream.writeShort(this.deviceType);
        dataOutputStream.writeShort(this.quality);
        writeImage(dataOutputStream);
        dataOutputStream.flush();
        dataOutputStream.close();
    }

    @Override // org.jmrtd.lds.AbstractImageInfo
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        FaceImageInfo faceImageInfo = (FaceImageInfo) obj;
        return this.colorSpace == faceImageInfo.colorSpace && this.deviceType == faceImageInfo.deviceType && this.expression == faceImageInfo.expression && this.eyeColor == faceImageInfo.eyeColor && this.faceImageType == faceImageInfo.faceImageType && this.featureMask == faceImageInfo.featureMask && Arrays.equals(this.featurePoints, faceImageInfo.featurePoints) && this.gender == faceImageInfo.gender && this.hairColor == faceImageInfo.hairColor && this.imageDataType == faceImageInfo.imageDataType && Arrays.equals(this.poseAngle, faceImageInfo.poseAngle) && Arrays.equals(this.poseAngleUncertainty, faceImageInfo.poseAngleUncertainty) && this.quality == faceImageInfo.quality && this.recordLength == faceImageInfo.recordLength && this.sourceType == faceImageInfo.sourceType;
    }

    public int getColorSpace() {
        return this.colorSpace;
    }

    public int getDeviceType() {
        return this.deviceType;
    }

    public int getExpression() {
        return this.expression;
    }

    public EyeColor getEyeColor() {
        return this.eyeColor;
    }

    public int getFaceImageType() {
        return this.faceImageType;
    }

    public int getFeatureMask() {
        return this.featureMask;
    }

    public FeaturePoint[] getFeaturePoints() {
        return this.featurePoints;
    }

    public Gender getGender() {
        return this.gender;
    }

    public int getHairColor() {
        return this.hairColor;
    }

    public int getImageDataType() {
        return this.imageDataType;
    }

    public int[] getPoseAngle() {
        int[] iArr = new int[3];
        System.arraycopy(this.poseAngle, 0, iArr, 0, 3);
        return iArr;
    }

    public int[] getPoseAngleUncertainty() {
        int[] iArr = new int[3];
        System.arraycopy(this.poseAngleUncertainty, 0, iArr, 0, 3);
        return iArr;
    }

    public int getQuality() {
        return this.quality;
    }

    @Override // org.jmrtd.lds.ImageInfo
    public long getRecordLength() {
        return this.recordLength;
    }

    public int getSourceType() {
        return this.sourceType;
    }

    @Override // org.jmrtd.lds.AbstractImageInfo
    public int hashCode() {
        int hashCode = ((((((super.hashCode() * 31) + this.colorSpace) * 31) + this.deviceType) * 31) + this.expression) * 31;
        EyeColor eyeColor = this.eyeColor;
        int hashCode2 = (((((((hashCode + (eyeColor == null ? 0 : eyeColor.hashCode())) * 31) + this.faceImageType) * 31) + this.featureMask) * 31) + Arrays.hashCode(this.featurePoints)) * 31;
        Gender gender = this.gender;
        int hashCode3 = (((Arrays.hashCode(this.poseAngleUncertainty) + ((Arrays.hashCode(this.poseAngle) + ((((((hashCode2 + (gender != null ? gender.hashCode() : 0)) * 31) + this.hairColor) * 31) + this.imageDataType) * 31)) * 31)) * 31) + this.quality) * 31;
        long j10 = this.recordLength;
        return ((hashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.sourceType;
    }

    @Override // org.jmrtd.lds.AbstractImageInfo
    public void readObject(InputStream inputStream) {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        this.recordLength = dataInputStream.readInt() & BodyPartID.bodyIdMax;
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        this.gender = Gender.getInstance(dataInputStream.readUnsignedByte());
        this.eyeColor = EyeColor.toEyeColor(dataInputStream.readUnsignedByte());
        this.hairColor = dataInputStream.readUnsignedByte();
        int readUnsignedByte = dataInputStream.readUnsignedByte();
        this.featureMask = readUnsignedByte;
        this.featureMask = (readUnsignedByte << 16) | dataInputStream.readUnsignedShort();
        this.expression = dataInputStream.readShort();
        this.poseAngle = new int[3];
        this.poseAngle[0] = dataInputStream.readUnsignedByte();
        this.poseAngle[1] = dataInputStream.readUnsignedByte();
        this.poseAngle[2] = dataInputStream.readUnsignedByte();
        this.poseAngleUncertainty = new int[]{dataInputStream.readUnsignedByte(), 0, 0};
        this.poseAngleUncertainty[1] = dataInputStream.readUnsignedByte();
        this.poseAngleUncertainty[2] = dataInputStream.readUnsignedByte();
        this.featurePoints = new FeaturePoint[readUnsignedShort];
        for (int i = 0; i < readUnsignedShort; i++) {
            int readUnsignedByte2 = dataInputStream.readUnsignedByte();
            byte readByte = dataInputStream.readByte();
            int readUnsignedShort2 = dataInputStream.readUnsignedShort();
            int readUnsignedShort3 = dataInputStream.readUnsignedShort();
            for (long j10 = 0; j10 < 2; j10 += dataInputStream.skip(2L)) {
            }
            this.featurePoints[i] = new FeaturePoint(readUnsignedByte2, readByte, readUnsignedShort2, readUnsignedShort3);
        }
        this.faceImageType = dataInputStream.readUnsignedByte();
        this.imageDataType = dataInputStream.readUnsignedByte();
        setWidth(dataInputStream.readUnsignedShort());
        setHeight(dataInputStream.readUnsignedShort());
        this.colorSpace = dataInputStream.readUnsignedByte();
        this.sourceType = dataInputStream.readUnsignedByte();
        this.deviceType = dataInputStream.readUnsignedShort();
        this.quality = dataInputStream.readUnsignedShort();
        if (getWidth() <= 0) {
            setWidth(800);
        }
        if (getHeight() <= 0) {
            setHeight(600);
        }
        setMimeType(toMimeType(this.imageDataType));
        readImage(inputStream, ((this.recordLength - 20) - (readUnsignedShort * 8)) - 12);
    }

    @Override // org.jmrtd.lds.AbstractImageInfo
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FaceImageInfo [Image size: ");
        sb2.append(getWidth());
        sb2.append(" x ");
        sb2.append(getHeight());
        sb2.append(", Gender: ");
        Gender gender = this.gender;
        if (gender == null) {
            gender = Gender.UNSPECIFIED;
        }
        sb2.append(gender);
        sb2.append(", Eye color: ");
        EyeColor eyeColor = this.eyeColor;
        if (eyeColor == null) {
            eyeColor = EyeColor.UNSPECIFIED;
        }
        sb2.append(eyeColor);
        sb2.append(", Hair color: ");
        sb2.append(hairColorToString());
        sb2.append(", Feature mask: ");
        sb2.append(featureMaskToString());
        sb2.append(", Expression: ");
        sb2.append(expressionToString());
        sb2.append(", Pose angle: ");
        sb2.append(poseAngleToString());
        sb2.append(", Face image type: ");
        sb2.append(faceImageTypeToString());
        sb2.append(", Source type: ");
        sb2.append(sourceTypeToString());
        sb2.append(", FeaturePoints [");
        FeaturePoint[] featurePointArr = this.featurePoints;
        if (featurePointArr != null && featurePointArr.length > 0) {
            boolean z10 = true;
            for (FeaturePoint featurePoint : featurePointArr) {
                if (z10) {
                    z10 = false;
                } else {
                    sb2.append(", ");
                }
                sb2.append(featurePoint.toString());
            }
        }
        sb2.append("]]");
        return sb2.toString();
    }

    @Override // org.jmrtd.lds.AbstractImageInfo
    public void writeObject(OutputStream outputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        writeFacialRecordData(byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeInt((int) (byteArray.length + 4));
        dataOutputStream.write(byteArray);
        dataOutputStream.flush();
    }

    public static class FeaturePoint implements Serializable {
        private static final long serialVersionUID = -4209679423938065215L;
        private int majorCode;
        private int minorCode;
        private int type;

        /* renamed from: x, reason: collision with root package name */
        private int f25530x;

        /* renamed from: y, reason: collision with root package name */
        private int f25531y;

        public FeaturePoint(int i, int i9, int i10, int i11, int i12) {
            this.type = i;
            this.majorCode = i9;
            this.minorCode = i10;
            this.f25530x = i11;
            this.f25531y = i12;
        }

        public int getMajorCode() {
            return this.majorCode;
        }

        public int getMinorCode() {
            return this.minorCode;
        }

        public int getType() {
            return this.type;
        }

        public int getX() {
            return this.f25530x;
        }

        public int getY() {
            return this.f25531y;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("( point: ");
            sb2.append(getMajorCode());
            sb2.append(".");
            sb2.append(getMinorCode());
            sb2.append(", type: ");
            sb2.append(Integer.toHexString(this.type));
            sb2.append(", (");
            sb2.append(this.f25530x);
            sb2.append(", ");
            return b.m(sb2, this.f25531y, "))");
        }

        public FeaturePoint(int i, byte b9, int i9, int i10) {
            this(i, (b9 & 240) >> 4, b9 & PassportService.SFI_DG15, i9, i10);
        }
    }

    public FaceImageInfo(InputStream inputStream) {
        super(0);
        readObject(inputStream);
    }
}

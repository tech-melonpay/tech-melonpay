package org.jmrtd.lds.iso19794;

import androidx.camera.core.impl.utils.a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.scuba.data.Gender;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jmrtd.cbeff.BiometricDataBlock;
import org.jmrtd.cbeff.StandardBiometricHeader;
import org.jmrtd.lds.AbstractListInfo;
import org.jmrtd.lds.iso19794.FaceImageInfo;

/* loaded from: classes3.dex */
public class FaceInfo extends AbstractListInfo<FaceImageInfo> implements BiometricDataBlock {
    private static final int FORMAT_IDENTIFIER = 1178682112;
    private static final int FORMAT_OWNER_VALUE = 257;
    private static final int FORMAT_TYPE_VALUE = 8;
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final int VERSION_NUMBER = 808529920;
    private static final long serialVersionUID = -6053206262773400725L;
    private StandardBiometricHeader sbh;

    public FaceInfo(List<FaceImageInfo> list) {
        this((StandardBiometricHeader) null, list);
    }

    public void addFaceImageInfo(FaceImageInfo faceImageInfo) {
        add(faceImageInfo);
    }

    @Override // org.jmrtd.lds.AbstractListInfo
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        FaceInfo faceInfo = (FaceInfo) obj;
        StandardBiometricHeader standardBiometricHeader = this.sbh;
        if (standardBiometricHeader == null) {
            return faceInfo.sbh == null;
        }
        StandardBiometricHeader standardBiometricHeader2 = faceInfo.sbh;
        return standardBiometricHeader == standardBiometricHeader2 || standardBiometricHeader.equals(standardBiometricHeader2);
    }

    public List<FaceImageInfo> getFaceImageInfos() {
        return getSubRecords();
    }

    @Override // org.jmrtd.cbeff.BiometricDataBlock
    public StandardBiometricHeader getStandardBiometricHeader() {
        if (this.sbh == null) {
            TreeMap treeMap = new TreeMap();
            treeMap.put(129, new byte[]{2});
            treeMap.put(130, new byte[]{0});
            treeMap.put(135, new byte[]{1, 1});
            treeMap.put(136, new byte[]{0, 8});
            this.sbh = new StandardBiometricHeader(treeMap);
        }
        return this.sbh;
    }

    @Override // org.jmrtd.lds.AbstractListInfo
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        StandardBiometricHeader standardBiometricHeader = this.sbh;
        return hashCode + (standardBiometricHeader == null ? 0 : standardBiometricHeader.hashCode());
    }

    @Override // org.jmrtd.lds.AbstractListInfo
    public void readObject(InputStream inputStream) {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        int readInt = dataInputStream.readInt();
        if (readInt != FORMAT_IDENTIFIER) {
            LOGGER.log(Level.WARNING, "'FAC' marker expected! Found " + Integer.toHexString(readInt));
            if (readInt == 12) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                dataOutputStream.writeInt(readInt);
                short readShort = dataInputStream.readShort();
                dataOutputStream.writeShort(readShort);
                int i = 0;
                while (i < readShort) {
                    byte[] bArr = new byte[2048];
                    int read = dataInputStream.read(bArr);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr);
                    i += read;
                }
                add(new FaceImageInfo(Gender.UNKNOWN, FaceImageInfo.EyeColor.UNSPECIFIED, 0, 0, 0, new int[]{0, 0, 0}, new int[]{0, 0, 0}, 1, 0, 0, 0, 0, new FaceImageInfo.FeaturePoint[0], 0, 0, new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), readShort, 1));
                return;
            }
        }
        int readInt2 = dataInputStream.readInt();
        if (readInt2 != VERSION_NUMBER) {
            throw new IllegalArgumentException(a.g(readInt2, new StringBuilder("'010' version number expected! Found ")));
        }
        long readInt3 = (dataInputStream.readInt() & BodyPartID.bodyIdMax) - 14;
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        long j10 = 0;
        for (int i9 = 0; i9 < readUnsignedShort; i9++) {
            FaceImageInfo faceImageInfo = new FaceImageInfo(inputStream);
            j10 += faceImageInfo.getRecordLength();
            add(faceImageInfo);
        }
        if (readInt3 != j10) {
            LOGGER.warning("ConstructedDataLength and dataLength differ: dataLength = " + readInt3 + ", constructedDataLength = " + j10);
        }
    }

    public void removeFaceImageInfo(int i) {
        remove(i);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FaceInfo [");
        Iterator<FaceImageInfo> it = getSubRecords().iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // org.jmrtd.lds.AbstractListInfo, org.jmrtd.lds.AbstractLDSInfo
    public void writeObject(OutputStream outputStream) {
        List<FaceImageInfo> subRecords = getSubRecords();
        Iterator<FaceImageInfo> it = subRecords.iterator();
        long j10 = 0;
        while (it.hasNext()) {
            j10 += it.next().getRecordLength();
        }
        long j11 = 14 + j10;
        DataOutputStream dataOutputStream = outputStream instanceof DataOutputStream ? (DataOutputStream) outputStream : new DataOutputStream(outputStream);
        dataOutputStream.writeInt(FORMAT_IDENTIFIER);
        dataOutputStream.writeInt(VERSION_NUMBER);
        dataOutputStream.writeInt((int) (BodyPartID.bodyIdMax & j11));
        dataOutputStream.writeShort(subRecords.size());
        Iterator<FaceImageInfo> it2 = subRecords.iterator();
        while (it2.hasNext()) {
            it2.next().writeObject(dataOutputStream);
        }
    }

    public FaceInfo(StandardBiometricHeader standardBiometricHeader, List<FaceImageInfo> list) {
        this.sbh = standardBiometricHeader;
        addAll(list);
    }

    public FaceInfo(InputStream inputStream) {
        this((StandardBiometricHeader) null, inputStream);
    }

    public FaceInfo(StandardBiometricHeader standardBiometricHeader, InputStream inputStream) {
        this.sbh = standardBiometricHeader;
        readObject(inputStream);
    }
}

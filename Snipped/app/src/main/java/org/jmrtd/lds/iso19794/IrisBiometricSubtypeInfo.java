package org.jmrtd.lds.iso19794;

import androidx.camera.core.impl.utils.a;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jmrtd.lds.AbstractListInfo;

/* loaded from: classes3.dex */
public class IrisBiometricSubtypeInfo extends AbstractListInfo<IrisImageInfo> {
    public static final int EYE_LEFT = 2;
    public static final int EYE_RIGHT = 1;
    public static final int EYE_UNDEF = 0;
    private static final long serialVersionUID = -6588640634764878039L;
    private int biometricSubtype;
    private int imageFormat;

    public IrisBiometricSubtypeInfo(int i, int i9, List<IrisImageInfo> list) {
        this.biometricSubtype = i;
        this.imageFormat = i9;
        addAll(list);
    }

    private static String biometricSubtypeToString(int i) {
        if (i == 0) {
            return "Undefined";
        }
        if (i == 1) {
            return "Right eye";
        }
        if (i == 2) {
            return "Left eye";
        }
        throw new NumberFormatException(a.g(i, new StringBuilder("Unknown biometric subtype: ")));
    }

    public void addIrisImageInfo(IrisImageInfo irisImageInfo) {
        add(irisImageInfo);
    }

    @Override // org.jmrtd.lds.AbstractListInfo
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        IrisBiometricSubtypeInfo irisBiometricSubtypeInfo = (IrisBiometricSubtypeInfo) obj;
        return this.biometricSubtype == irisBiometricSubtypeInfo.biometricSubtype && this.imageFormat == irisBiometricSubtypeInfo.imageFormat;
    }

    public int getBiometricSubtype() {
        return this.biometricSubtype;
    }

    public int getImageFormat() {
        return this.imageFormat;
    }

    public List<IrisImageInfo> getIrisImageInfos() {
        return getSubRecords();
    }

    public long getRecordLength() {
        Iterator<IrisImageInfo> it = getSubRecords().iterator();
        long j10 = 3;
        while (it.hasNext()) {
            j10 += it.next().getRecordLength();
        }
        return j10;
    }

    @Override // org.jmrtd.lds.AbstractListInfo
    public int hashCode() {
        return (((super.hashCode() * 31) + this.biometricSubtype) * 31) + this.imageFormat;
    }

    @Override // org.jmrtd.lds.AbstractListInfo
    public void readObject(InputStream inputStream) {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        this.biometricSubtype = dataInputStream.readUnsignedByte();
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        for (int i = 0; i < readUnsignedShort; i++) {
            IrisImageInfo irisImageInfo = new IrisImageInfo(inputStream, this.imageFormat);
            irisImageInfo.getRecordLength();
            add(irisImageInfo);
        }
    }

    public void removeIrisImageInfo(int i) {
        remove(i);
    }

    public String toString() {
        return "IrisBiometricSubtypeInfo [biometric subtype: " + biometricSubtypeToString(this.biometricSubtype) + ", imageCount = " + getSubRecords().size() + "]";
    }

    @Override // org.jmrtd.lds.AbstractListInfo, org.jmrtd.lds.AbstractLDSInfo
    public void writeObject(OutputStream outputStream) {
        DataOutputStream dataOutputStream = outputStream instanceof DataOutputStream ? (DataOutputStream) outputStream : new DataOutputStream(outputStream);
        dataOutputStream.writeByte(this.biometricSubtype & 255);
        List<IrisImageInfo> subRecords = getSubRecords();
        dataOutputStream.writeShort(subRecords.size() & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        Iterator<IrisImageInfo> it = subRecords.iterator();
        while (it.hasNext()) {
            it.next().writeObject(dataOutputStream);
        }
    }

    public IrisBiometricSubtypeInfo(InputStream inputStream, int i) {
        this.imageFormat = i;
        readObject(inputStream);
    }
}

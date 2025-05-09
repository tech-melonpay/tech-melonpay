package org.jmrtd;

import androidx.camera.core.impl.utils.a;
import java.util.Arrays;
import net.sf.scuba.util.Hex;
import org.jmrtd.protocol.PACEProtocol;

/* loaded from: classes3.dex */
public class PACEKeySpec implements AccessKeySpec {
    private static final long serialVersionUID = -7113246293247012560L;
    private byte[] key;
    private byte keyReference;

    public PACEKeySpec(String str, byte b9) {
        this(Util.getBytes(str), b9);
    }

    public static PACEKeySpec createCANKey(String str) {
        return new PACEKeySpec(str, (byte) 2);
    }

    public static PACEKeySpec createMRZKey(BACKeySpec bACKeySpec) {
        return new PACEKeySpec(PACEProtocol.computeKeySeedForPACE(bACKeySpec), (byte) 1);
    }

    public static PACEKeySpec createPINKey(String str) {
        return new PACEKeySpec(str, (byte) 3);
    }

    public static PACEKeySpec createPUKKey(String str) {
        return new PACEKeySpec(str, (byte) 4);
    }

    private static String keyReferenceToString(byte b9) {
        return b9 != 0 ? b9 != 1 ? b9 != 2 ? b9 != 3 ? b9 != 4 ? Integer.toString(b9) : "PUK" : "PIN" : "CAN" : "MRZ" : "NO";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PACEKeySpec pACEKeySpec = (PACEKeySpec) obj;
        return Arrays.equals(this.key, pACEKeySpec.key) && this.keyReference == pACEKeySpec.keyReference;
    }

    @Override // org.jmrtd.AccessKeySpec
    public String getAlgorithm() {
        return "PACE";
    }

    @Override // org.jmrtd.AccessKeySpec
    public byte[] getKey() {
        return this.key;
    }

    public byte getKeyReference() {
        return this.keyReference;
    }

    public int hashCode() {
        return ((Arrays.hashCode(this.key) + 31) * 31) + this.keyReference;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PACEKeySpec [key: ");
        sb2.append(Hex.bytesToHexString(this.key));
        sb2.append(", keyReference: ");
        return a.n(sb2, keyReferenceToString(this.keyReference), "]");
    }

    public PACEKeySpec(byte[] bArr, byte b9) {
        this.keyReference = b9;
        this.key = bArr;
    }
}

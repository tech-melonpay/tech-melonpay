package org.jmrtd.protocol;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* loaded from: classes3.dex */
public class DESedeSecureMessagingWrapper extends SecureMessagingWrapper implements Serializable {
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    public static final IvParameterSpec ZERO_IV_PARAM_SPEC = new IvParameterSpec(new byte[]{0, 0, 0, 0, 0, 0, 0, 0});
    private static final long serialVersionUID = -2859033943345961793L;

    public DESedeSecureMessagingWrapper(SecretKey secretKey, SecretKey secretKey2) {
        this(secretKey, secretKey2, true);
    }

    @Override // org.jmrtd.protocol.SecureMessagingWrapper
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return super.equals(obj);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v2, types: [byte[]] */
    @Override // org.jmrtd.protocol.SecureMessagingWrapper
    public byte[] getEncodedSendSequenceCounter() {
        String str = "Error closing stream";
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
        } catch (IOException e10) {
            LOGGER.log(Level.FINE, "Error closing stream", (Throwable) e10);
        }
        try {
            try {
                new DataOutputStream(byteArrayOutputStream).writeLong(getSendSequenceCounter());
                byteArrayOutputStream.close();
            } catch (IOException e11) {
                LOGGER.log(Level.FINE, "Error writing to stream", (Throwable) e11);
                byteArrayOutputStream.close();
            }
            str = byteArrayOutputStream.toByteArray();
            return str;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (IOException e12) {
                LOGGER.log(Level.FINE, str, e12);
            }
            throw th;
        }
    }

    @Override // org.jmrtd.protocol.SecureMessagingWrapper
    public IvParameterSpec getIV() {
        return ZERO_IV_PARAM_SPEC;
    }

    @Override // org.jmrtd.protocol.SecureMessagingWrapper
    public int getPadLength() {
        return 8;
    }

    @Override // net.sf.scuba.smartcards.APDUWrapper
    public String getType() {
        return "DESede";
    }

    @Override // org.jmrtd.protocol.SecureMessagingWrapper
    public int hashCode() {
        return (super.hashCode() * 31) + 13;
    }

    @Override // org.jmrtd.protocol.SecureMessagingWrapper
    public String toString() {
        return "DESedeSecureMessagingWrapper [ssc: " + getSendSequenceCounter() + ", kEnc: " + getEncryptionKey() + ", kMac: " + getMACKey() + ", shouldCheckMAC: " + shouldCheckMAC() + ", maxTranceiveLength: " + getMaxTranceiveLength() + "]";
    }

    public DESedeSecureMessagingWrapper(SecretKey secretKey, SecretKey secretKey2, boolean z10) {
        this(secretKey, secretKey2, 256, z10, 0L);
    }

    public DESedeSecureMessagingWrapper(SecretKey secretKey, SecretKey secretKey2, long j10) {
        this(secretKey, secretKey2, 256, true, j10);
    }

    public DESedeSecureMessagingWrapper(DESedeSecureMessagingWrapper dESedeSecureMessagingWrapper) {
        this(dESedeSecureMessagingWrapper.getEncryptionKey(), dESedeSecureMessagingWrapper.getMACKey(), dESedeSecureMessagingWrapper.getMaxTranceiveLength(), dESedeSecureMessagingWrapper.shouldCheckMAC(), dESedeSecureMessagingWrapper.getSendSequenceCounter());
    }

    public DESedeSecureMessagingWrapper(SecretKey secretKey, SecretKey secretKey2, int i, boolean z10, long j10) {
        super(secretKey, secretKey2, "DESede/CBC/NoPadding", "ISO9797Alg3Mac", i, z10, j10);
    }
}

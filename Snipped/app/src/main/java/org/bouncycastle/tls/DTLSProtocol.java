package org.bouncycastle.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public abstract class DTLSProtocol {
    public static void applyMaxFragmentLengthExtension(DTLSRecordLayer dTLSRecordLayer, short s10) {
        if (s10 >= 0) {
            if (!MaxFragmentLength.isValid(s10)) {
                throw new TlsFatalAlert((short) 80);
            }
            dTLSRecordLayer.setPlaintextLimit(1 << (s10 + 8));
        }
    }

    public static byte[] createVerifyData(TlsContext tlsContext, DTLSReliableHandshake dTLSReliableHandshake, boolean z10) {
        return TlsUtils.calculateTLSVerifyData(tlsContext, dTLSReliableHandshake.getHandshakeHash(), z10);
    }

    public static short evaluateMaxFragmentLengthExtension(boolean z10, Hashtable hashtable, Hashtable hashtable2, short s10) {
        short maxFragmentLengthExtension = TlsExtensionsUtils.getMaxFragmentLengthExtension(hashtable2);
        if (maxFragmentLengthExtension < 0 || (MaxFragmentLength.isValid(maxFragmentLengthExtension) && (z10 || maxFragmentLengthExtension == TlsExtensionsUtils.getMaxFragmentLengthExtension(hashtable)))) {
            return maxFragmentLengthExtension;
        }
        throw new TlsFatalAlert(s10);
    }

    public static byte[] generateCertificate(TlsContext tlsContext, Certificate certificate, OutputStream outputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        certificate.encode(tlsContext, byteArrayOutputStream, outputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] generateSupplementalData(Vector vector) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        TlsProtocol.writeSupplementalData(byteArrayOutputStream, vector);
        return byteArrayOutputStream.toByteArray();
    }

    public static void sendCertificateMessage(TlsContext tlsContext, DTLSReliableHandshake dTLSReliableHandshake, Certificate certificate, OutputStream outputStream) {
        SecurityParameters securityParametersHandshake = tlsContext.getSecurityParametersHandshake();
        if (securityParametersHandshake.getLocalCertificate() != null) {
            throw new TlsFatalAlert((short) 80);
        }
        if (certificate == null) {
            certificate = Certificate.EMPTY_CHAIN;
        }
        dTLSReliableHandshake.sendMessage((short) 11, generateCertificate(tlsContext, certificate, outputStream));
        securityParametersHandshake.localCertificate = certificate;
    }

    public static int validateSelectedCipherSuite(int i, short s10) {
        int encryptionAlgorithm = TlsUtils.getEncryptionAlgorithm(i);
        if (encryptionAlgorithm == -1 || encryptionAlgorithm == 1 || encryptionAlgorithm == 2) {
            throw new TlsFatalAlert(s10);
        }
        return i;
    }

    public void processFinished(byte[] bArr, byte[] bArr2) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        byte[] readFully = TlsUtils.readFully(bArr2.length, byteArrayInputStream);
        TlsProtocol.assertEmpty(byteArrayInputStream);
        if (!Arrays.constantTimeAreEqual(bArr2, readFully)) {
            throw new TlsFatalAlert((short) 40);
        }
    }
}

package org.bouncycastle.tls;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.x500.X500Name;

/* loaded from: classes3.dex */
public class CertificateRequest {
    protected Vector certificateAuthorities;
    protected short[] certificateTypes;
    protected Vector supportedSignatureAlgorithms;

    public CertificateRequest(short[] sArr, Vector vector, Vector vector2) {
        if (sArr == null) {
            throw new IllegalArgumentException("'certificateTypes' cannot be null");
        }
        if (sArr.length < 1 || !TlsUtils.isValidUint8(sArr.length)) {
            throw new IllegalArgumentException("'certificateTypes' should have length from 1 to 255");
        }
        this.certificateTypes = sArr;
        this.supportedSignatureAlgorithms = vector;
        this.certificateAuthorities = vector2;
    }

    public static CertificateRequest parse(TlsContext tlsContext, InputStream inputStream) {
        int readUint8 = TlsUtils.readUint8(inputStream);
        if (readUint8 < 1) {
            throw new TlsFatalAlert((short) 50);
        }
        short[] sArr = new short[readUint8];
        for (int i = 0; i < readUint8; i++) {
            sArr[i] = TlsUtils.readUint8(inputStream);
        }
        Vector vector = null;
        Vector parseSupportedSignatureAlgorithms = TlsUtils.isTLSv12(tlsContext) ? TlsUtils.parseSupportedSignatureAlgorithms(inputStream) : null;
        byte[] readOpaque16 = TlsUtils.readOpaque16(inputStream);
        if (readOpaque16.length > 0) {
            Vector vector2 = new Vector();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(readOpaque16);
            do {
                vector2.addElement(X500Name.getInstance(TlsUtils.readDERObject(TlsUtils.readOpaque16(byteArrayInputStream, 1))));
            } while (byteArrayInputStream.available() > 0);
            vector = vector2;
        }
        return new CertificateRequest(sArr, parseSupportedSignatureAlgorithms, vector);
    }

    public void encode(OutputStream outputStream) {
        TlsUtils.writeUint8ArrayWithUint8Length(this.certificateTypes, outputStream);
        Vector vector = this.supportedSignatureAlgorithms;
        if (vector != null) {
            TlsUtils.encodeSupportedSignatureAlgorithms(vector, outputStream);
        }
        Vector vector2 = this.certificateAuthorities;
        if (vector2 == null || vector2.isEmpty()) {
            TlsUtils.writeUint16(0, outputStream);
            return;
        }
        Vector vector3 = new Vector(this.certificateAuthorities.size());
        int i = 0;
        for (int i9 = 0; i9 < this.certificateAuthorities.size(); i9++) {
            byte[] encoded = ((X500Name) this.certificateAuthorities.elementAt(i9)).getEncoded(ASN1Encoding.DER);
            vector3.addElement(encoded);
            i += encoded.length + 2;
        }
        TlsUtils.checkUint16(i);
        TlsUtils.writeUint16(i, outputStream);
        for (int i10 = 0; i10 < vector3.size(); i10++) {
            TlsUtils.writeOpaque16((byte[]) vector3.elementAt(i10), outputStream);
        }
    }

    public Vector getCertificateAuthorities() {
        return this.certificateAuthorities;
    }

    public short[] getCertificateTypes() {
        return this.certificateTypes;
    }

    public Vector getSupportedSignatureAlgorithms() {
        return this.supportedSignatureAlgorithms;
    }
}

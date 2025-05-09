package org.bouncycastle.tls;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import org.bouncycastle.tls.crypto.TlsCertificate;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class Certificate {
    private static final TlsCertificate[] EMPTY_CERTS;
    public static final Certificate EMPTY_CHAIN;
    protected final TlsCertificate[] certificateList;
    protected final byte[] certificateRequestContext;

    static {
        TlsCertificate[] tlsCertificateArr = new TlsCertificate[0];
        EMPTY_CERTS = tlsCertificateArr;
        EMPTY_CHAIN = new Certificate(tlsCertificateArr);
    }

    public Certificate(byte[] bArr, TlsCertificate[] tlsCertificateArr) {
        if (bArr != null && !TlsUtils.isValidUint8(bArr.length)) {
            throw new IllegalArgumentException("'certificateRequestContext' cannot be longer than 255");
        }
        if (tlsCertificateArr == null) {
            throw new NullPointerException("'certificateList' cannot be null");
        }
        this.certificateRequestContext = bArr;
        this.certificateList = tlsCertificateArr;
    }

    public static void calculateEndPointHash(TlsContext tlsContext, TlsCertificate tlsCertificate, byte[] bArr, OutputStream outputStream) {
        byte[] calculateEndPointHash = TlsUtils.calculateEndPointHash(tlsContext, tlsCertificate.getSigAlgOID(), bArr);
        if (calculateEndPointHash == null || calculateEndPointHash.length <= 0) {
            return;
        }
        outputStream.write(calculateEndPointHash);
    }

    public static Certificate parse(TlsContext tlsContext, InputStream inputStream) {
        return parse(tlsContext, inputStream, null);
    }

    public TlsCertificate[] cloneCertificateList() {
        TlsCertificate[] tlsCertificateArr = this.certificateList;
        int length = tlsCertificateArr.length;
        TlsCertificate[] tlsCertificateArr2 = new TlsCertificate[length];
        System.arraycopy(tlsCertificateArr, 0, tlsCertificateArr2, 0, length);
        return tlsCertificateArr2;
    }

    public void encode(OutputStream outputStream) {
        encode(null, outputStream, null);
    }

    public TlsCertificate getCertificateAt(int i) {
        return this.certificateList[i];
    }

    public TlsCertificate[] getCertificateList() {
        return cloneCertificateList();
    }

    public byte[] getCertificateRequestContext() {
        return Arrays.clone(this.certificateRequestContext);
    }

    public int getLength() {
        return this.certificateList.length;
    }

    public boolean isEmpty() {
        return this.certificateList.length == 0;
    }

    public Certificate(TlsCertificate[] tlsCertificateArr) {
        this(null, tlsCertificateArr);
    }

    public static Certificate parse(TlsContext tlsContext, InputStream inputStream, OutputStream outputStream) {
        boolean isTLSv13 = TlsUtils.isTLSv13(tlsContext);
        byte[] readOpaque8 = isTLSv13 ? TlsUtils.readOpaque8(inputStream) : null;
        int readUint24 = TlsUtils.readUint24(inputStream);
        if (readUint24 == 0) {
            return isTLSv13 ? new Certificate(readOpaque8, EMPTY_CERTS) : EMPTY_CHAIN;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(TlsUtils.readFully(readUint24, inputStream));
        Vector vector = new Vector();
        while (byteArrayInputStream.available() > 0) {
            byte[] readOpaque24 = TlsUtils.readOpaque24(byteArrayInputStream, 1);
            TlsCertificate createCertificate = tlsContext.getCrypto().createCertificate(readOpaque24);
            if (vector.isEmpty() && outputStream != null) {
                calculateEndPointHash(tlsContext, createCertificate, readOpaque24, outputStream);
            }
            vector.addElement(createCertificate);
        }
        TlsCertificate[] tlsCertificateArr = new TlsCertificate[vector.size()];
        for (int i = 0; i < vector.size(); i++) {
            tlsCertificateArr[i] = (TlsCertificate) vector.elementAt(i);
        }
        return new Certificate(readOpaque8, tlsCertificateArr);
    }

    public void encode(TlsContext tlsContext, OutputStream outputStream, OutputStream outputStream2) {
        boolean isTLSv13 = TlsUtils.isTLSv13(tlsContext);
        byte[] bArr = this.certificateRequestContext;
        if ((bArr != null) != isTLSv13) {
            throw new IllegalStateException();
        }
        if (isTLSv13) {
            TlsUtils.writeOpaque8(bArr, outputStream);
        }
        Vector vector = new Vector(this.certificateList.length);
        int i = 0;
        int i9 = 0;
        while (true) {
            TlsCertificate[] tlsCertificateArr = this.certificateList;
            if (i >= tlsCertificateArr.length) {
                break;
            }
            TlsCertificate tlsCertificate = tlsCertificateArr[i];
            byte[] encoded = tlsCertificate.getEncoded();
            if (i == 0 && outputStream2 != null) {
                calculateEndPointHash(tlsContext, tlsCertificate, encoded, outputStream2);
            }
            vector.addElement(encoded);
            i9 += encoded.length + 3;
            i++;
        }
        TlsUtils.checkUint24(i9);
        TlsUtils.writeUint24(i9, outputStream);
        for (int i10 = 0; i10 < vector.size(); i10++) {
            TlsUtils.writeOpaque24((byte[]) vector.elementAt(i10), outputStream);
        }
    }
}

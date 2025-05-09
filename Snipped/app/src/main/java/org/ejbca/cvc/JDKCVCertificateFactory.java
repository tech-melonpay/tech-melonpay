package org.ejbca.cvc;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactorySpi;
import java.util.ArrayList;
import java.util.Collection;
import org.ejbca.cvc.exception.ConstructionException;
import org.ejbca.cvc.exception.ParseException;

/* loaded from: classes3.dex */
public class JDKCVCertificateFactory extends CertificateFactorySpi {
    private byte[] readBytes(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[512];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                inputStream.close();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CRL engineGenerateCRL(InputStream inputStream) {
        throw new CRLException("CVC CertificateFactory can not create CRLs");
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Collection<CRL> engineGenerateCRLs(InputStream inputStream) {
        throw new CRLException("CVC CertificateFactory can not create CRLs");
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Certificate engineGenerateCertificate(InputStream inputStream) {
        try {
            return new CardVerifiableCertificate(CertificateParser.parseCertificate(readBytes(inputStream)));
        } catch (IOException e10) {
            throw new CertificateException(e10.toString());
        } catch (ConstructionException e11) {
            throw new CertificateException(e11.toString());
        } catch (ParseException e12) {
            throw new CertificateException(e12.toString());
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Collection<Certificate> engineGenerateCertificates(InputStream inputStream) {
        Certificate engineGenerateCertificate = engineGenerateCertificate(inputStream);
        ArrayList arrayList = new ArrayList();
        arrayList.add(engineGenerateCertificate);
        return arrayList;
    }
}

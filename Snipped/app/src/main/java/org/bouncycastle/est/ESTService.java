package org.bouncycastle.est;

import C.v;
import androidx.camera.core.n;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.cert.X509CRLHolder;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cmc.CMCException;
import org.bouncycastle.cmc.SimplePKIResponse;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.pkcs.PKCS10CertificationRequest;
import org.bouncycastle.pkcs.PKCS10CertificationRequestBuilder;
import org.bouncycastle.util.Selector;
import org.bouncycastle.util.Store;
import org.bouncycastle.util.encoders.Base64;
import s3.b;

/* loaded from: classes2.dex */
public class ESTService {
    protected static final String CACERTS = "/cacerts";
    protected static final String CSRATTRS = "/csrattrs";
    protected static final String FULLCMC = "/fullcmc";
    protected static final String SERVERGEN = "/serverkeygen";
    protected static final String SIMPLE_ENROLL = "/simpleenroll";
    protected static final String SIMPLE_REENROLL = "/simplereenroll";
    protected static final Set<String> illegalParts;
    private static final Pattern pathInValid;
    private final ESTClientProvider clientProvider;
    private final String server;

    static {
        HashSet hashSet = new HashSet();
        illegalParts = hashSet;
        hashSet.add("cacerts");
        hashSet.add("simpleenroll");
        hashSet.add("simplereenroll");
        hashSet.add("fullcmc");
        hashSet.add("serverkeygen");
        hashSet.add("csrattrs");
        pathInValid = Pattern.compile("^[0-9a-zA-Z_\\-.~!$&'()*+,;:=]+");
    }

    public ESTService(String str, String str2, ESTClientProvider eSTClientProvider) {
        String verifyServer = verifyServer(str);
        this.server = str2 != null ? b.k("https://", verifyServer, "/.well-known/est/", verifyLabel(str2)) : n.a("https://", verifyServer, "/.well-known/est");
        this.clientProvider = eSTClientProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String annotateRequest(byte[] bArr) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        int i = 0;
        do {
            int i9 = i + 48;
            if (i9 < bArr.length) {
                printWriter.print(Base64.toBase64String(bArr, i, 48));
                i = i9;
            } else {
                printWriter.print(Base64.toBase64String(bArr, i, bArr.length - i));
                i = bArr.length;
            }
            printWriter.print('\n');
        } while (i < bArr.length);
        printWriter.flush();
        return stringWriter.toString();
    }

    public static X509CertificateHolder[] storeToArray(Store<X509CertificateHolder> store) {
        return storeToArray(store, null);
    }

    private String verifyLabel(String str) {
        while (str.endsWith("/") && str.length() > 0) {
            str = v.j(1, 0, str);
        }
        while (str.startsWith("/") && str.length() > 0) {
            str = str.substring(1);
        }
        if (str.length() == 0) {
            throw new IllegalArgumentException("Label set but after trimming '/' is not zero length string.");
        }
        if (!pathInValid.matcher(str).matches()) {
            throw new IllegalArgumentException(n.a("Server path ", str, " contains invalid characters"));
        }
        if (illegalParts.contains(str)) {
            throw new IllegalArgumentException(n.a("Label ", str, " is a reserved path segment."));
        }
        return str;
    }

    private String verifyServer(String str) {
        while (str.endsWith("/") && str.length() > 0) {
            try {
                str = str.substring(0, str.length() - 1);
            } catch (Exception e10) {
                if (e10 instanceof IllegalArgumentException) {
                    throw ((IllegalArgumentException) e10);
                }
                throw new IllegalArgumentException(v.l(e10, new StringBuilder("Scheme and host is invalid: ")), e10);
            }
        }
        if (str.contains("://")) {
            throw new IllegalArgumentException("Server contains scheme, must only be <dnsname/ipaddress>:port, https:// will be added arbitrarily.");
        }
        URL url = new URL("https://" + str);
        if (url.getPath().length() != 0 && !url.getPath().equals("/")) {
            throw new IllegalArgumentException("Server contains path, must only be <dnsname/ipaddress>:port, a path of '/.well-known/est/<label>' will be added arbitrarily.");
        }
        return str;
    }

    public CACertsResponse getCACerts() {
        URL url;
        ESTRequest build;
        ESTResponse doRequest;
        Store<X509CertificateHolder> store;
        Store<X509CRLHolder> store2;
        Store<X509CertificateHolder> store3;
        Store<X509CRLHolder> store4;
        String str;
        ESTResponse eSTResponse = null;
        try {
            url = new URL(this.server + CACERTS);
            ESTClient makeClient = this.clientProvider.makeClient();
            build = new ESTRequestBuilder("GET", url).withClient(makeClient).build();
            doRequest = makeClient.doRequest(build);
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (doRequest.getStatusCode() == 200) {
                if (!"application/pkcs7-mime".equals(doRequest.getHeaders().getFirstValue("Content-Type"))) {
                    if (doRequest.getHeaders().getFirstValue("Content-Type") != null) {
                        str = " got " + doRequest.getHeaders().getFirstValue("Content-Type");
                    } else {
                        str = " but was not present.";
                    }
                    throw new ESTException("Response : " + url.toString() + "Expecting application/pkcs7-mime " + str, null, doRequest.getStatusCode(), doRequest.getInputStream());
                }
                try {
                    if (doRequest.getContentLength() == null || doRequest.getContentLength().longValue() <= 0) {
                        store3 = null;
                        store4 = null;
                    } else {
                        SimplePKIResponse simplePKIResponse = new SimplePKIResponse(ContentInfo.getInstance((ASN1Sequence) new ASN1InputStream(doRequest.getInputStream()).readObject()));
                        store3 = simplePKIResponse.getCertificates();
                        store4 = simplePKIResponse.getCRLs();
                    }
                    store = store3;
                    store2 = store4;
                } catch (Throwable th2) {
                    throw new ESTException("Decoding CACerts: " + url.toString() + " " + th2.getMessage(), th2, doRequest.getStatusCode(), doRequest.getInputStream());
                }
            } else {
                if (doRequest.getStatusCode() != 204) {
                    throw new ESTException("Get CACerts: " + url.toString(), null, doRequest.getStatusCode(), doRequest.getInputStream());
                }
                store = null;
                store2 = null;
            }
            CACertsResponse cACertsResponse = new CACertsResponse(store, store2, build, doRequest.getSource(), this.clientProvider.isTrusted());
            try {
                doRequest.close();
                e = null;
            } catch (Exception e10) {
                e = e10;
            }
            if (e == null) {
                return cACertsResponse;
            }
            if (e instanceof ESTException) {
                throw e;
            }
            throw new ESTException("Get CACerts: " + url.toString(), e, doRequest.getStatusCode(), null);
        } catch (Throwable th3) {
            th = th3;
            eSTResponse = doRequest;
            try {
                if (th instanceof ESTException) {
                    throw th;
                }
                throw new ESTException(th.getMessage(), th);
            } catch (Throwable th4) {
                if (eSTResponse != null) {
                    try {
                        eSTResponse.close();
                    } catch (Exception unused) {
                    }
                }
                throw th4;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:6|7|(2:9|(2:13|14))(3:31|32|(5:36|17|18|19|(2:21|(2:23|24)(2:25|26))(2:27|28)))|16|17|18|19|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ac, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.bouncycastle.est.CSRRequestResponse getCSRAttributes() {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.est.ESTService.getCSRAttributes():org.bouncycastle.est.CSRRequestResponse");
    }

    public EnrollmentResponse handleEnrollResponse(ESTResponse eSTResponse) {
        long time;
        ESTRequest originalRequest = eSTResponse.getOriginalRequest();
        if (eSTResponse.getStatusCode() != 202) {
            if (eSTResponse.getStatusCode() == 200) {
                try {
                    return new EnrollmentResponse(new SimplePKIResponse(ContentInfo.getInstance(new ASN1InputStream(eSTResponse.getInputStream()).readObject())).getCertificates(), -1L, null, eSTResponse.getSource());
                } catch (CMCException e10) {
                    throw new ESTException(e10.getMessage(), e10.getCause());
                }
            }
            throw new ESTException("Simple Enroll: " + originalRequest.getURL().toString(), null, eSTResponse.getStatusCode(), eSTResponse.getInputStream());
        }
        String header = eSTResponse.getHeader("Retry-After");
        if (header == null) {
            throw new ESTException("Got Status 202 but not Retry-After header from: " + originalRequest.getURL().toString());
        }
        try {
            try {
                time = (Long.parseLong(header) * 1000) + System.currentTimeMillis();
            } catch (NumberFormatException unused) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                time = simpleDateFormat.parse(header).getTime();
            }
            return new EnrollmentResponse(null, time, originalRequest, eSTResponse.getSource());
        } catch (Exception e11) {
            throw new ESTException("Unable to parse Retry-After header:" + originalRequest.getURL().toString() + " " + e11.getMessage(), null, eSTResponse.getStatusCode(), eSTResponse.getInputStream());
        }
    }

    public EnrollmentResponse simpleEnroll(EnrollmentResponse enrollmentResponse) {
        if (!this.clientProvider.isTrusted()) {
            throw new IllegalStateException("No trust anchors.");
        }
        ESTResponse eSTResponse = null;
        try {
            ESTClient makeClient = this.clientProvider.makeClient();
            eSTResponse = makeClient.doRequest(new ESTRequestBuilder(enrollmentResponse.getRequestToRetry()).withClient(makeClient).build());
            EnrollmentResponse handleEnrollResponse = handleEnrollResponse(eSTResponse);
            if (eSTResponse != null) {
                eSTResponse.close();
            }
            return handleEnrollResponse;
        } catch (Throwable th) {
            try {
                if (th instanceof ESTException) {
                    throw th;
                }
                throw new ESTException(th.getMessage(), th);
            } catch (Throwable th2) {
                if (eSTResponse != null) {
                    eSTResponse.close();
                }
                throw th2;
            }
        }
    }

    public EnrollmentResponse simpleEnrollPoP(boolean z10, final PKCS10CertificationRequestBuilder pKCS10CertificationRequestBuilder, final ContentSigner contentSigner, ESTAuth eSTAuth) {
        if (!this.clientProvider.isTrusted()) {
            throw new IllegalStateException("No trust anchors.");
        }
        ESTResponse eSTResponse = null;
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.server);
            sb2.append(z10 ? SIMPLE_REENROLL : SIMPLE_ENROLL);
            URL url = new URL(sb2.toString());
            ESTClient makeClient = this.clientProvider.makeClient();
            ESTRequestBuilder withConnectionListener = new ESTRequestBuilder("POST", url).withClient(makeClient).withConnectionListener(new ESTSourceConnectionListener() { // from class: org.bouncycastle.est.ESTService.1
                @Override // org.bouncycastle.est.ESTSourceConnectionListener
                public ESTRequest onConnection(Source source, ESTRequest eSTRequest) {
                    if (source instanceof TLSUniqueProvider) {
                        TLSUniqueProvider tLSUniqueProvider = (TLSUniqueProvider) source;
                        if (tLSUniqueProvider.isTLSUniqueAvailable()) {
                            PKCS10CertificationRequestBuilder pKCS10CertificationRequestBuilder2 = new PKCS10CertificationRequestBuilder(pKCS10CertificationRequestBuilder);
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            pKCS10CertificationRequestBuilder2.setAttribute(PKCSObjectIdentifiers.pkcs_9_at_challengePassword, new DERPrintableString(Base64.toBase64String(tLSUniqueProvider.getTLSUnique())));
                            byteArrayOutputStream.write(ESTService.this.annotateRequest(pKCS10CertificationRequestBuilder2.build(contentSigner).getEncoded()).getBytes());
                            byteArrayOutputStream.flush();
                            ESTRequestBuilder withData = new ESTRequestBuilder(eSTRequest).withData(byteArrayOutputStream.toByteArray());
                            withData.setHeader("Content-Type", "application/pkcs10");
                            withData.setHeader("Content-Transfer-Encoding", "base64");
                            withData.setHeader("Content-Length", Long.toString(byteArrayOutputStream.size()));
                            return withData.build();
                        }
                    }
                    throw new IOException("Source does not supply TLS unique.");
                }
            });
            if (eSTAuth != null) {
                eSTAuth.applyAuth(withConnectionListener);
            }
            eSTResponse = makeClient.doRequest(withConnectionListener.build());
            EnrollmentResponse handleEnrollResponse = handleEnrollResponse(eSTResponse);
            if (eSTResponse != null) {
                eSTResponse.close();
            }
            return handleEnrollResponse;
        } catch (Throwable th) {
            try {
                if (th instanceof ESTException) {
                    throw th;
                }
                throw new ESTException(th.getMessage(), th);
            } catch (Throwable th2) {
                if (eSTResponse != null) {
                    eSTResponse.close();
                }
                throw th2;
            }
        }
    }

    public static X509CertificateHolder[] storeToArray(Store<X509CertificateHolder> store, Selector<X509CertificateHolder> selector) {
        Collection<X509CertificateHolder> matches = store.getMatches(selector);
        return (X509CertificateHolder[]) matches.toArray(new X509CertificateHolder[matches.size()]);
    }

    public EnrollmentResponse simpleEnroll(boolean z10, PKCS10CertificationRequest pKCS10CertificationRequest, ESTAuth eSTAuth) {
        if (!this.clientProvider.isTrusted()) {
            throw new IllegalStateException("No trust anchors.");
        }
        ESTResponse eSTResponse = null;
        try {
            byte[] bytes = annotateRequest(pKCS10CertificationRequest.getEncoded()).getBytes();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.server);
            sb2.append(z10 ? SIMPLE_REENROLL : SIMPLE_ENROLL);
            URL url = new URL(sb2.toString());
            ESTClient makeClient = this.clientProvider.makeClient();
            ESTRequestBuilder withClient = new ESTRequestBuilder("POST", url).withData(bytes).withClient(makeClient);
            withClient.addHeader("Content-Type", "application/pkcs10");
            withClient.addHeader("Content-Length", "" + bytes.length);
            withClient.addHeader("Content-Transfer-Encoding", "base64");
            if (eSTAuth != null) {
                eSTAuth.applyAuth(withClient);
            }
            eSTResponse = makeClient.doRequest(withClient.build());
            EnrollmentResponse handleEnrollResponse = handleEnrollResponse(eSTResponse);
            if (eSTResponse != null) {
                eSTResponse.close();
            }
            return handleEnrollResponse;
        } catch (Throwable th) {
            try {
                if (th instanceof ESTException) {
                    throw th;
                }
                throw new ESTException(th.getMessage(), th);
            } catch (Throwable th2) {
                if (eSTResponse != null) {
                    eSTResponse.close();
                }
                throw th2;
            }
        }
    }
}

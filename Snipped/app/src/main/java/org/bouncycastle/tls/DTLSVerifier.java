package org.bouncycastle.tls;

import java.io.IOException;
import org.bouncycastle.tls.crypto.TlsCrypto;
import org.bouncycastle.tls.crypto.TlsHMAC;
import org.bouncycastle.tls.crypto.TlsMAC;
import org.bouncycastle.tls.crypto.TlsMACOutputStream;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class DTLSVerifier {
    private final TlsMAC cookieMAC;
    private final TlsMACOutputStream cookieMACOutputStream;

    public DTLSVerifier(TlsCrypto tlsCrypto) {
        TlsMAC createCookieMAC = createCookieMAC(tlsCrypto);
        this.cookieMAC = createCookieMAC;
        this.cookieMACOutputStream = new TlsMACOutputStream(createCookieMAC);
    }

    private static TlsMAC createCookieMAC(TlsCrypto tlsCrypto) {
        TlsHMAC createHMAC = tlsCrypto.createHMAC(3);
        int macLength = createHMAC.getMacLength();
        byte[] bArr = new byte[macLength];
        tlsCrypto.getSecureRandom().nextBytes(bArr);
        createHMAC.setKey(bArr, 0, macLength);
        return createHMAC;
    }

    public synchronized DTLSRequest verifyRequest(byte[] bArr, byte[] bArr2, int i, int i9, DatagramSender datagramSender) {
        TlsMAC tlsMAC;
        DTLSRequest readClientRequest;
        boolean z10 = true;
        try {
            try {
                this.cookieMAC.update(bArr, 0, bArr.length);
                readClientRequest = DTLSReliableHandshake.readClientRequest(bArr2, i, i9, this.cookieMACOutputStream);
            } catch (IOException unused) {
                tlsMAC = this.cookieMAC;
            } catch (Throwable th) {
                th = th;
            }
            if (readClientRequest == null) {
                tlsMAC = this.cookieMAC;
                tlsMAC.reset();
                return null;
            }
            byte[] calculateMAC = this.cookieMAC.calculateMAC();
            try {
            } catch (IOException unused2) {
            } catch (Throwable th2) {
                th = th2;
                z10 = false;
                if (z10) {
                    this.cookieMAC.reset();
                }
                throw th;
            }
            if (Arrays.areEqual(calculateMAC, readClientRequest.getClientHello().getCookie())) {
                return readClientRequest;
            }
            DTLSReliableHandshake.sendHelloVerifyRequest(datagramSender, readClientRequest.getRecordSeq(), readClientRequest.getMessageSeq(), calculateMAC);
            return null;
        } catch (Throwable th3) {
            throw th3;
        }
    }
}

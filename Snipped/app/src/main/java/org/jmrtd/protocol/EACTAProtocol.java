package org.jmrtd.protocol;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.util.List;
import java.util.logging.Logger;
import javax.crypto.interfaces.DHPublicKey;
import net.sf.scuba.smartcards.CardServiceException;
import org.bouncycastle.i18n.LocalizedMessage;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.jmrtd.APDULevelEACTACapable;
import org.jmrtd.Util;
import org.jmrtd.cert.CVCPrincipal;
import org.jmrtd.cert.CardVerifiableCertificate;
import org.jmrtd.lds.icao.MRZInfo;
import s3.b;

/* loaded from: classes3.dex */
public class EACTAProtocol {
    private static final int TAG_CVCERTIFICATE_SIGNATURE = 24375;
    private APDULevelEACTACapable service;
    private SecureMessagingWrapper wrapper;
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd.protocol");
    private static final Provider BC_PROVIDER = Util.getBouncyCastleProvider();

    public EACTAProtocol(APDULevelEACTACapable aPDULevelEACTACapable, SecureMessagingWrapper secureMessagingWrapper) {
        this.service = aPDULevelEACTACapable;
        this.wrapper = secureMessagingWrapper;
    }

    public static byte[] deriveIdentifier(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        byte[] bArr = new byte[length + 1];
        try {
            System.arraycopy(str.getBytes(LocalizedMessage.DEFAULT_ENCODING), 0, bArr, 0, length);
            bArr[length] = (byte) MRZInfo.checkDigit(str);
            return bArr;
        } catch (UnsupportedEncodingException e10) {
            throw new IllegalStateException("Unsupported encoding", e10);
        }
    }

    public synchronized EACTAResult doEACTA(CVCPrincipal cVCPrincipal, List<CardVerifiableCertificate> list, PrivateKey privateKey, String str, EACCAResult eACCAResult, String str2) {
        return doTA(cVCPrincipal, list, privateKey, str, eACCAResult, deriveIdentifier(str2));
    }

    public synchronized EACTAResult doTA(CVCPrincipal cVCPrincipal, List<CardVerifiableCertificate> list, PrivateKey privateKey, String str, EACCAResult eACCAResult, PACEResult pACEResult) {
        try {
        } catch (NoSuchAlgorithmException e10) {
            throw new CardServiceException("No such algorithm", e10);
        }
        return doTA(cVCPrincipal, list, privateKey, str, eACCAResult, deriveIdentifier(pACEResult.getPICCPublicKey()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        r9 = r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized org.jmrtd.protocol.EACTAResult doTA(org.jmrtd.cert.CVCPrincipal r9, java.util.List<org.jmrtd.cert.CardVerifiableCertificate> r10, java.security.PrivateKey r11, java.lang.String r12, org.jmrtd.protocol.EACCAResult r13, byte[] r14) {
        /*
            Method dump skipped, instructions count: 593
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jmrtd.protocol.EACTAProtocol.doTA(org.jmrtd.cert.CVCPrincipal, java.util.List, java.security.PrivateKey, java.lang.String, org.jmrtd.protocol.EACCAResult, byte[]):org.jmrtd.protocol.EACTAResult");
    }

    public static byte[] deriveIdentifier(PublicKey publicKey) {
        if (publicKey == null) {
            return null;
        }
        String algorithm = publicKey.getAlgorithm();
        if (!"DH".equals(algorithm) && !(publicKey instanceof DHPublicKey)) {
            if (!"ECDH".equals(algorithm) && !(publicKey instanceof ECPublicKey)) {
                throw new NoSuchAlgorithmException(b.j("Unsupported agreement algorithm ", algorithm));
            }
            return Util.alignKeyDataToSize(Util.i2os(((org.bouncycastle.jce.interfaces.ECPublicKey) publicKey).getQ().getAffineXCoord().toBigInteger()), (int) Math.ceil(r5.getParameters().getCurve().getFieldSize() / 8.0d));
        }
        return MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA1).digest(Util.i2os(((DHPublicKey) publicKey).getY()));
    }
}

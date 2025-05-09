package org.jmrtd;

import java.math.BigInteger;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.util.List;
import javax.crypto.SecretKey;
import org.jmrtd.cert.CVCPrincipal;
import org.jmrtd.cert.CardVerifiableCertificate;
import org.jmrtd.protocol.AAResult;
import org.jmrtd.protocol.BACResult;
import org.jmrtd.protocol.EACCAResult;
import org.jmrtd.protocol.EACTAResult;
import org.jmrtd.protocol.PACEResult;
import org.jmrtd.protocol.SecureMessagingWrapper;

/* loaded from: classes3.dex */
public abstract class AbstractMRTDCardService extends FileSystemCardService {
    public abstract AAResult doAA(PublicKey publicKey, String str, String str2, byte[] bArr);

    public abstract BACResult doBAC(SecretKey secretKey, SecretKey secretKey2);

    public abstract BACResult doBAC(AccessKeySpec accessKeySpec);

    public abstract EACCAResult doEACCA(BigInteger bigInteger, String str, String str2, PublicKey publicKey);

    public abstract EACTAResult doEACTA(CVCPrincipal cVCPrincipal, List<CardVerifiableCertificate> list, PrivateKey privateKey, String str, EACCAResult eACCAResult, String str2);

    public abstract EACTAResult doEACTA(CVCPrincipal cVCPrincipal, List<CardVerifiableCertificate> list, PrivateKey privateKey, String str, EACCAResult eACCAResult, PACEResult pACEResult);

    @Deprecated
    public PACEResult doPACE(AccessKeySpec accessKeySpec, String str, AlgorithmParameterSpec algorithmParameterSpec) {
        return doPACE(accessKeySpec, str, algorithmParameterSpec, null);
    }

    public abstract PACEResult doPACE(AccessKeySpec accessKeySpec, String str, AlgorithmParameterSpec algorithmParameterSpec, BigInteger bigInteger);

    public abstract int getMaxReadBinaryLength();

    public abstract SecureMessagingWrapper getWrapper();

    public abstract void sendSelectApplet(boolean z10);

    public abstract void sendSelectMF();
}

package org.jmrtd.protocol;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Random;
import javax.crypto.SecretKey;
import net.sf.scuba.smartcards.CardServiceException;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.jmrtd.APDULevelBACCapable;
import org.jmrtd.AccessKeySpec;
import org.jmrtd.BACKeySpec;
import org.jmrtd.CardServiceProtocolException;
import org.jmrtd.Util;
import s3.b;

/* loaded from: classes3.dex */
public class BACProtocol {
    private int maxTranceiveLength;
    private Random random = new SecureRandom();
    private APDULevelBACCapable service;
    private boolean shouldCheckMAC;

    public BACProtocol(APDULevelBACCapable aPDULevelBACCapable, int i, boolean z10) {
        this.service = aPDULevelBACCapable;
        this.maxTranceiveLength = i;
        this.shouldCheckMAC = z10;
    }

    public static byte[] computeKeySeedForBAC(BACKeySpec bACKeySpec) {
        String documentNumber = bACKeySpec.getDocumentNumber();
        String dateOfBirth = bACKeySpec.getDateOfBirth();
        String dateOfExpiry = bACKeySpec.getDateOfExpiry();
        if (dateOfBirth == null || dateOfBirth.length() != 6) {
            throw new IllegalArgumentException(b.j("Wrong date format used for date of birth. Expected yyMMdd, found ", dateOfBirth));
        }
        if (dateOfExpiry == null || dateOfExpiry.length() != 6) {
            throw new IllegalArgumentException(b.j("Wrong date format used for date of expiry. Expected yyMMdd, found ", dateOfExpiry));
        }
        if (documentNumber != null) {
            return computeKeySeedForBAC(fixDocumentNumber(documentNumber), dateOfBirth, dateOfExpiry);
        }
        throw new IllegalArgumentException(b.j("Wrong document number. Found ", documentNumber));
    }

    public static long computeSendSequenceCounter(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 8 || bArr2 == null || bArr2.length != 8) {
            throw new IllegalStateException("Wrong length input");
        }
        long j10 = 0;
        for (int i = 4; i < 8; i++) {
            j10 = (j10 << 8) + (bArr[i] & 255);
        }
        for (int i9 = 4; i9 < 8; i9++) {
            j10 = (j10 << 8) + (bArr2[i9] & 255);
        }
        return j10;
    }

    private SecureMessagingWrapper doBACStep(SecretKey secretKey, SecretKey secretKey2) {
        try {
            byte[] sendGetChallenge = this.service.sendGetChallenge();
            byte[] bArr = new byte[8];
            this.random.nextBytes(bArr);
            byte[] bArr2 = new byte[16];
            this.random.nextBytes(bArr2);
            try {
                byte[] bArr3 = new byte[16];
                System.arraycopy(this.service.sendMutualAuth(bArr, sendGetChallenge, bArr2, secretKey, secretKey2), 16, bArr3, 0, 16);
                byte[] bArr4 = new byte[16];
                for (int i = 0; i < 16; i++) {
                    bArr4[i] = (byte) ((bArr2[i] & 255) ^ (bArr3[i] & 255));
                }
                return new DESedeSecureMessagingWrapper(Util.deriveKey(bArr4, 1), Util.deriveKey(bArr4, 2), this.maxTranceiveLength, this.shouldCheckMAC, computeSendSequenceCounter(sendGetChallenge, bArr));
            } catch (Exception e10) {
                throw new CardServiceProtocolException("BAC failed in MUTUAL AUTH", 2, e10);
            }
        } catch (Exception e11) {
            throw new CardServiceProtocolException("BAC failed in GET CHALLENGE", 1, e11);
        }
    }

    private static String fixDocumentNumber(String str) {
        StringBuilder sb2 = new StringBuilder(str == null ? "" : str.replace('<', ' ').trim().replace(' ', '<'));
        while (sb2.length() < 9) {
            sb2.append('<');
        }
        return sb2.toString();
    }

    public BACResult doBAC(AccessKeySpec accessKeySpec) {
        try {
            byte[] key = accessKeySpec.getKey();
            return new BACResult(accessKeySpec, doBACStep(Util.deriveKey(key, 1), Util.deriveKey(key, 2)));
        } catch (GeneralSecurityException e10) {
            throw new CardServiceException("Error during BAC", e10);
        }
    }

    public BACResult doBAC(SecretKey secretKey, SecretKey secretKey2) {
        return new BACResult(doBACStep(secretKey, secretKey2));
    }

    private static byte[] computeKeySeedForBAC(String str, String str2, String str3) {
        return Util.computeKeySeed(str, str2, str3, McElieceCCA2KeyGenParameterSpec.SHA1, true);
    }
}

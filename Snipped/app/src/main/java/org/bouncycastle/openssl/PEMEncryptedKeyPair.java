package org.bouncycastle.openssl;

import C.v;
import java.io.IOException;
import org.bouncycastle.operator.OperatorCreationException;

/* loaded from: classes3.dex */
public class PEMEncryptedKeyPair {
    private final String dekAlgName;
    private final byte[] iv;
    private final byte[] keyBytes;
    private final PEMKeyPairParser parser;

    public PEMEncryptedKeyPair(String str, byte[] bArr, byte[] bArr2, PEMKeyPairParser pEMKeyPairParser) {
        this.dekAlgName = str;
        this.iv = bArr;
        this.keyBytes = bArr2;
        this.parser = pEMKeyPairParser;
    }

    public PEMKeyPair decryptKeyPair(PEMDecryptorProvider pEMDecryptorProvider) {
        try {
            return this.parser.parse(pEMDecryptorProvider.get(this.dekAlgName).decrypt(this.keyBytes, this.iv));
        } catch (IOException e10) {
            throw e10;
        } catch (OperatorCreationException e11) {
            throw new PEMException("cannot create extraction operator: " + e11.getMessage(), e11);
        } catch (Exception e12) {
            throw new PEMException(v.l(e12, new StringBuilder("exception processing key pair: ")), e12);
        }
    }

    public String getDekAlgName() {
        return this.dekAlgName;
    }
}

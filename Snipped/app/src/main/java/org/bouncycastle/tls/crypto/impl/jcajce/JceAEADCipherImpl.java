package org.bouncycastle.tls.crypto.impl.jcajce;

import com.google.android.gms.stats.CodePackage;
import java.security.AccessController;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.PrivilegedAction;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.cms.GCMParameters;
import org.bouncycastle.jcajce.spec.AEADParameterSpec;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.tls.crypto.impl.TlsAEADCipherImpl;

/* loaded from: classes3.dex */
public class JceAEADCipherImpl implements TlsAEADCipherImpl {
    private static final int BUF_SIZE = 32768;
    private static final boolean canDoAEAD = checkForAEAD();
    private final String algorithm;
    private final String algorithmParamsName;
    private final Cipher cipher;
    private final int cipherMode;
    private final JcaJceHelper helper;
    private SecretKey key;
    private final int keySize;

    public JceAEADCipherImpl(JcaJceHelper jcaJceHelper, String str, String str2, int i, boolean z10) {
        this.helper = jcaJceHelper;
        this.cipher = jcaJceHelper.createCipher(str);
        this.algorithm = str2;
        this.keySize = i;
        this.cipherMode = z10 ? 1 : 2;
        this.algorithmParamsName = getAlgParamsName(jcaJceHelper, str);
    }

    private static boolean checkForAEAD() {
        return ((Boolean) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.bouncycastle.tls.crypto.impl.jcajce.JceAEADCipherImpl.1
            @Override // java.security.PrivilegedAction
            public Object run() {
                try {
                    return Boolean.valueOf(Cipher.class.getMethod("updateAAD", byte[].class) != null);
                } catch (Exception unused) {
                    return Boolean.FALSE;
                }
            }
        })).booleanValue();
    }

    private static String getAlgParamsName(JcaJceHelper jcaJceHelper, String str) {
        String str2 = "CCM";
        try {
            if (!str.contains("CCM")) {
                str2 = CodePackage.GCM;
            }
            jcaJceHelper.createAlgorithmParameters(str2);
            return str2;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // org.bouncycastle.tls.crypto.impl.TlsAEADCipherImpl
    public int doFinal(byte[] bArr, int i, int i9, byte[] bArr2, int i10) {
        int i11 = 0;
        while (i9 > 32768) {
            try {
                i11 += this.cipher.update(bArr, i, 32768, bArr2, i10 + i11);
                i += 32768;
                i9 -= 32768;
            } catch (GeneralSecurityException e10) {
                throw Exceptions.illegalStateException("", e10);
            }
        }
        int update = i11 + this.cipher.update(bArr, i, i9, bArr2, i10 + i11);
        return update + this.cipher.doFinal(bArr2, i10 + update);
    }

    @Override // org.bouncycastle.tls.crypto.impl.TlsAEADCipherImpl
    public int getOutputSize(int i) {
        return this.cipher.getOutputSize(i);
    }

    @Override // org.bouncycastle.tls.crypto.impl.TlsAEADCipherImpl
    public void init(byte[] bArr, int i, byte[] bArr2) {
        String str;
        try {
            if (!canDoAEAD || (str = this.algorithmParamsName) == null) {
                this.cipher.init(this.cipherMode, this.key, new AEADParameterSpec(bArr, i * 8, bArr2));
                return;
            }
            AlgorithmParameters createAlgorithmParameters = this.helper.createAlgorithmParameters(str);
            createAlgorithmParameters.init(new GCMParameters(bArr, i).getEncoded());
            this.cipher.init(this.cipherMode, this.key, createAlgorithmParameters);
            if (bArr2 == null || bArr2.length <= 0) {
                return;
            }
            this.cipher.updateAAD(bArr2);
        } catch (Exception e10) {
            throw Exceptions.illegalStateException(e10.getMessage(), e10);
        }
    }

    @Override // org.bouncycastle.tls.crypto.impl.TlsAEADCipherImpl
    public void setKey(byte[] bArr, int i, int i9) {
        if (this.keySize != i9) {
            throw new IllegalStateException();
        }
        this.key = new SecretKeySpec(bArr, i, i9, this.algorithm);
    }
}

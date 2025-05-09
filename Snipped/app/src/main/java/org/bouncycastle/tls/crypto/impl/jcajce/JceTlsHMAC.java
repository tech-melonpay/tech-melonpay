package org.bouncycastle.tls.crypto.impl.jcajce;

import androidx.camera.core.n;
import java.security.InvalidKeyException;
import java.util.Hashtable;
import javax.crypto.Mac;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.tls.crypto.TlsHMAC;
import org.bouncycastle.util.Integers;

/* loaded from: classes3.dex */
public class JceTlsHMAC implements TlsHMAC {
    private static final Hashtable internalBlockSizes;
    private final String algorithm;
    private final Mac hmac;
    private final Integer internalBlockSize;

    static {
        Hashtable hashtable = new Hashtable();
        internalBlockSizes = hashtable;
        hashtable.put("HmacMD5", Integers.valueOf(64));
        hashtable.put("HmacSHA1", Integers.valueOf(64));
        hashtable.put("HmacSHA256", Integers.valueOf(64));
        hashtable.put("HmacSHA384", Integers.valueOf(128));
        hashtable.put("HmacSHA512", Integers.valueOf(128));
    }

    public JceTlsHMAC(Mac mac, String str) {
        this(mac, str, getInternalBlockSize(str));
    }

    @Override // org.bouncycastle.tls.crypto.TlsMAC
    public void calculateMAC(byte[] bArr, int i) {
        try {
            this.hmac.doFinal(bArr, i);
        } catch (ShortBufferException e10) {
            throw new IllegalArgumentException(e10.getMessage());
        }
    }

    @Override // org.bouncycastle.tls.crypto.TlsHMAC
    public int getInternalBlockSize() {
        return this.internalBlockSize.intValue();
    }

    @Override // org.bouncycastle.tls.crypto.TlsMAC
    public int getMacLength() {
        return this.hmac.getMacLength();
    }

    @Override // org.bouncycastle.tls.crypto.TlsMAC
    public void reset() {
        this.hmac.reset();
    }

    @Override // org.bouncycastle.tls.crypto.TlsMAC
    public void setKey(byte[] bArr, int i, int i9) {
        try {
            this.hmac.init(new SecretKeySpec(bArr, i, i9, this.algorithm));
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException(e10.getMessage());
        }
    }

    @Override // org.bouncycastle.tls.crypto.TlsMAC
    public void update(byte[] bArr, int i, int i9) {
        this.hmac.update(bArr, i, i9);
    }

    public JceTlsHMAC(Mac mac, String str, int i) {
        this.hmac = mac;
        this.algorithm = str;
        this.internalBlockSize = Integers.valueOf(i);
    }

    private static int getInternalBlockSize(String str) {
        Hashtable hashtable = internalBlockSizes;
        if (hashtable.containsKey(str)) {
            return ((Integer) hashtable.get(str)).intValue();
        }
        throw new IllegalArgumentException(n.a("HMAC ", str, " unknown"));
    }

    @Override // org.bouncycastle.tls.crypto.TlsMAC
    public byte[] calculateMAC() {
        return this.hmac.doFinal();
    }
}

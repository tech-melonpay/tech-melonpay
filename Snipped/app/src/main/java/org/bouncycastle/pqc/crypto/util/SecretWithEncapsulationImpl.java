package org.bouncycastle.pqc.crypto.util;

import java.util.concurrent.atomic.AtomicBoolean;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class SecretWithEncapsulationImpl implements SecretWithEncapsulation {
    private final byte[] cipher_text;
    private final AtomicBoolean hasBeenDestroyed = new AtomicBoolean(false);
    private final byte[] sessionKey;

    public SecretWithEncapsulationImpl(byte[] bArr, byte[] bArr2) {
        this.sessionKey = bArr;
        this.cipher_text = bArr2;
    }

    public void checkDestroyed() {
        if (isDestroyed()) {
            throw new IllegalStateException("data has been destroyed");
        }
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() {
        if (this.hasBeenDestroyed.getAndSet(true)) {
            return;
        }
        Arrays.clear(this.sessionKey);
        Arrays.clear(this.cipher_text);
    }

    @Override // org.bouncycastle.crypto.SecretWithEncapsulation
    public byte[] getEncapsulation() {
        checkDestroyed();
        return Arrays.clone(this.cipher_text);
    }

    @Override // org.bouncycastle.crypto.SecretWithEncapsulation
    public byte[] getSecret() {
        checkDestroyed();
        return Arrays.clone(this.sessionKey);
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return this.hasBeenDestroyed.get();
    }
}

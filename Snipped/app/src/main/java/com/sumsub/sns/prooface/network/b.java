package com.sumsub.sns.prooface.network;

import android.util.Base64;
import com.sumsub.log.logger.Logger;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class b implements com.sumsub.sns.prooface.network.a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f20273c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final KeyPair f20274a = a();

    /* renamed from: b, reason: collision with root package name */
    public SecretKey f20275b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @Override // com.sumsub.sns.prooface.network.a
    public void a(String str) {
        this.f20275b = a(this.f20274a.getPrivate(), b(str));
    }

    public final Key b(String str) {
        byte[] decode = Base64.decode(str, 2);
        return KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(new ECPoint(a(decode, 1, 32), a(decode, 33, 32)), c.f20276a.b()));
    }

    public final KeyPair a() {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
        keyPairGenerator.initialize(c.f20276a.b());
        return keyPairGenerator.generateKeyPair();
    }

    public final SecretKey a(Key key, Key key2) {
        KeyAgreement keyAgreement = KeyAgreement.getInstance("ECDH");
        keyAgreement.init(key);
        keyAgreement.doPhase(key2, true);
        SecretKey generateSecret = keyAgreement.generateSecret("AES");
        Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "Crypto: secret=" + Base64.encodeToString(generateSecret.getEncoded(), 2), null, 4, null);
        return generateSecret;
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        if (this.f20275b != null) {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, this.f20275b, new IvParameterSpec(bArr2));
            return cipher.doFinal(bArr);
        }
        throw new InvalidParameterException("Session key is not set");
    }

    @Override // com.sumsub.sns.prooface.network.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] b9 = b(bArr, bArr2);
        byte[] encoded = this.f20274a.getPublic().getEncoded();
        ByteBuffer allocate = ByteBuffer.allocate(encoded.length + 3 + bArr2.length + 4 + b9.length);
        allocate.put((byte) 2);
        allocate.putShort((short) encoded.length);
        allocate.put(encoded);
        allocate.put(bArr2);
        allocate.putInt(b9.length);
        allocate.put(b9);
        return allocate.array();
    }

    public final BigInteger a(byte[] bArr, int i, int i9) {
        if (i != 0 || i9 != bArr.length) {
            byte[] bArr2 = new byte[i9];
            System.arraycopy(bArr, i, bArr2, 0, i9);
            bArr = bArr2;
        }
        return new BigInteger(1, bArr);
    }
}

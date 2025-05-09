package j3;

import h3.InterfaceC0795a;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PrfHmacJce.java */
/* loaded from: classes.dex */
public final class n implements InterfaceC0795a {

    /* renamed from: a, reason: collision with root package name */
    public final a f22498a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22499b;

    /* renamed from: c, reason: collision with root package name */
    public final Key f22500c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22501d;

    /* compiled from: PrfHmacJce.java */
    public class a extends ThreadLocal<Mac> {
        public a() {
        }

        @Override // java.lang.ThreadLocal
        public final Mac initialValue() {
            n nVar = n.this;
            try {
                Mac a10 = k.f22495f.a(nVar.f22499b);
                a10.init(nVar.f22500c);
                return a10;
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public n(String str, SecretKeySpec secretKeySpec) {
        a aVar = new a();
        this.f22498a = aVar;
        this.f22499b = str;
        this.f22500c = secretKeySpec;
        if (secretKeySpec.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str) {
            case "HMACSHA1":
                this.f22501d = 20;
                break;
            case "HMACSHA256":
                this.f22501d = 32;
                break;
            case "HMACSHA384":
                this.f22501d = 48;
                break;
            case "HMACSHA512":
                this.f22501d = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
        }
        aVar.get();
    }

    @Override // h3.InterfaceC0795a
    public final byte[] a(int i, byte[] bArr) {
        if (i > this.f22501d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        a aVar = this.f22498a;
        aVar.get().update(bArr);
        return Arrays.copyOf(aVar.get().doFinal(), i);
    }
}

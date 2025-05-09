package j3;

import java.security.SecureRandom;

/* compiled from: Random.java */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final a f22505a = new a();

    /* compiled from: Random.java */
    public class a extends ThreadLocal<SecureRandom> {
        @Override // java.lang.ThreadLocal
        public final SecureRandom initialValue() {
            SecureRandom secureRandom = new SecureRandom();
            secureRandom.nextLong();
            return secureRandom;
        }
    }

    public static byte[] a(int i) {
        byte[] bArr = new byte[i];
        f22505a.get().nextBytes(bArr);
        return bArr;
    }
}

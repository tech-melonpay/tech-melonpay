package j3;

import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: EngineWrapper.java */
/* loaded from: classes.dex */
public interface l<T> {

    /* compiled from: EngineWrapper.java */
    public static class a implements l<Cipher> {
        @Override // j3.l
        public final Cipher a(String str, Provider provider) {
            return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
        }
    }

    /* compiled from: EngineWrapper.java */
    public static class b implements l<Mac> {
        @Override // j3.l
        public final Mac a(String str, Provider provider) {
            return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
        }
    }

    T a(String str, Provider provider);
}

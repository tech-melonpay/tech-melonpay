package f3;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import androidx.camera.core.n;
import b3.i;
import com.google.android.gms.stats.CodePackage;
import j3.p;
import j3.q;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;

/* compiled from: AndroidKeystoreKmsClient.java */
/* renamed from: f3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0743c implements i {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f20632b = 0;

    /* renamed from: a, reason: collision with root package name */
    public KeyStore f20633a = new a().f20634a;

    /* compiled from: AndroidKeystoreKmsClient.java */
    /* renamed from: f3.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final KeyStore f20634a;

        public a() {
            this.f20634a = null;
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f20634a = keyStore;
                keyStore.load(null);
            } catch (IOException | GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public static void c(String str) {
        if (new C0743c().d(str)) {
            throw new IllegalArgumentException(n.a("cannot generate a new key ", str, " because it already exists; please delete it with deleteKey() and try again"));
        }
        String b9 = q.b(str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(b9, 3).setKeySize(256).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    @Override // b3.i
    public final synchronized boolean a(String str) {
        return str.toLowerCase(Locale.US).startsWith("android-keystore://");
    }

    @Override // b3.i
    public final synchronized C0742b b(String str) {
        C0742b c0742b;
        c0742b = new C0742b(q.b(str), this.f20633a);
        byte[] a10 = p.a(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(a10, c0742b.decrypt(c0742b.a(a10, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return c0742b;
    }

    public final synchronized boolean d(String str) {
        String b9;
        b9 = q.b(str);
        try {
        } catch (NullPointerException unused) {
            Log.w("c", "Keystore is temporarily unavailable, wait 20ms, reinitialize Keystore and try again.");
            try {
                Thread.sleep(20L);
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f20633a = keyStore;
                keyStore.load(null);
            } catch (IOException e10) {
                throw new GeneralSecurityException(e10);
            } catch (InterruptedException unused2) {
            }
            return this.f20633a.containsAlias(b9);
        }
        return this.f20633a.containsAlias(b9);
    }
}
